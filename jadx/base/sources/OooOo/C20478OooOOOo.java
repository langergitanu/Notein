package OooOo;

import OooOoO0.C20512OooO0O0;
import OooOoO0.C20513OooO0OO;
import OooOoO0.C20514OooO0Oo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OooOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\b\u0010\u0017\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u000fJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001fJ\u0019\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010+R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010+R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010+¨\u00062"}, m80612d2 = {"LOooOo/OooOOOo;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "value", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "LoO00ooO/OooOooO;", "resize", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "evictAll", "()V", "size", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "LOooOoO0/OooO0OO;", "map", "LOooOoO0/OooO0OO;", "LOooOoO0/OooO0O0;", "lock", "LOooOoO0/OooO0O0;", "collection"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class C20478OooOOOo<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final C20512OooO0O0 lock;
    private final C20513OooO0OO<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public C20478OooOOOo(int i) {
        this.maxSize = i;
        if (i <= 0) {
            C20514OooO0Oo.OooO00o("maxSize <= 0");
            throw null;
        }
        this.map = new C20513OooO0OO<>();
        this.lock = new C20512OooO0O0();
    }

    private final int safeSizeOf(K key, V value) {
        int iSizeOf = sizeOf(key, value);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        String message = "Negative size: " + key + '=' + value;
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        throw new IllegalStateException(message);
    }

    public V create(K key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final V get(K key) {
        V vPut;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        synchronized (this.lock) {
            C20513OooO0OO<K, V> c20513OooO0OO = this.map;
            c20513OooO0OO.getClass();
            V v = c20513OooO0OO.f58583OooO00o.get(key);
            if (v != null) {
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    vPut = this.map.f58583OooO00o.put(key, vCreate);
                    if (vPut != null) {
                        this.map.f58583OooO00o.put(key, vPut);
                    } else {
                        this.size += safeSizeOf(key, vCreate);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (vPut != null) {
                entryRemoved(false, key, vCreate, vPut);
                return vPut;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final V put(K key, V value) {
        V vPut;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(key, value);
                vPut = this.map.f58583OooO00o.put(key, value);
                if (vPut != null) {
                    this.size -= safeSizeOf(key, vPut);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final V remove(K key) {
        V vRemove;
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        synchronized (this.lock) {
            try {
                C20513OooO0OO<K, V> c20513OooO0OO = this.map;
                c20513OooO0OO.getClass();
                vRemove = c20513OooO0OO.f58583OooO00o.remove(key);
                if (vRemove != null) {
                    this.size -= safeSizeOf(key, vRemove);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int maxSize) {
        if (!(maxSize > 0)) {
            C20514OooO0Oo.OooO00o("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = maxSize;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        trimToSize(maxSize);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(K key, V value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, V>> setEntrySet = this.map.f58583OooO00o.entrySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet, "map.entries");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry<K, V>> setEntrySet2 = this.map.f58583OooO00o.entrySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet2, "map.entries");
            Iterator<T> it = setEntrySet2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int maxSize) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.f58583OooO00o.isEmpty() || this.size == 0))) {
                        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size <= maxSize || this.map.f58583OooO00o.isEmpty()) {
                        break;
                    }
                    Set<Map.Entry<K, V>> setEntrySet = this.map.f58583OooO00o.entrySet();
                    kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet, "map.entries");
                    Map.Entry entry = (Map.Entry) oOo000Oo.OooOo.Oooo0oo(setEntrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    C20513OooO0OO<K, V> c20513OooO0OO = this.map;
                    c20513OooO0OO.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                    c20513OooO0OO.f58583OooO00o.remove(key);
                    this.size -= safeSizeOf(key, value);
                    this.evictionCount++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
