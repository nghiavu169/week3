import java.sql.Connection;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private final long expirationTime;
    private final Hashtable<T, Long> locked, unlocked;

    public ObjectPool() {
        expirationTime = 30000;
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);

    public synchronized T checkout() {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expirationTime) {
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return (t);
                    } else {
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        t = create();
        locked.put(t, now);
        return (t);
    }
    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }

    public abstract Connection checkOut();
}
