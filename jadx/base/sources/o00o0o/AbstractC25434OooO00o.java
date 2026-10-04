package o00o0o;

import OooOoo0.OooOo00;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import o00o0Ooo.C25425OooO0O0;
import o00o0o.C25437OooO0Oo;
import o00o0o00.C25438OooO00o;
import o00oo.InterfaceC25636OooO0Oo;

/* JADX INFO: renamed from: o00o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25434OooO00o<T> implements Cloneable, Closeable {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C19703OooO00o f86710OooOoOO = new C19703OooO00o();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO0O0 f86711OooOoo0 = new OooO0O0();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25437OooO0Oo<T> f86712OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f86713OooOo0o = false;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Throwable f86714OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f86715OooOoO0;

    /* JADX INFO: renamed from: o00o0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19703OooO00o implements InterfaceC25436OooO0OO<Closeable> {
        @Override // o00o0o.InterfaceC25436OooO0OO
        public final void release(Closeable closeable) {
            try {
                C25425OooO0O0.OooO00o(closeable);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: o00o0o.OooO00o$OooO0O0 */
    public class OooO0O0 implements OooO0OO {
        @Override // o00o0o.AbstractC25434OooO00o.OooO0OO
        public final void OooO00o(C25437OooO0Oo<Object> c25437OooO0Oo, Throwable th) {
            Object objOooO00o = c25437OooO0Oo.OooO00o();
            C25438OooO00o.OooO0oo(AbstractC25434OooO00o.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c25437OooO0Oo)), objOooO00o == null ? null : objOooO00o.getClass().getName());
        }

        @Override // o00o0o.AbstractC25434OooO00o.OooO0OO
        public final boolean OooO0O0() {
            return false;
        }
    }

    /* JADX INFO: renamed from: o00o0o.OooO00o$OooO0OO */
    public interface OooO0OO {
        void OooO00o(C25437OooO0Oo<Object> c25437OooO0Oo, Throwable th);

        boolean OooO0O0();
    }

    public AbstractC25434OooO00o(C25437OooO0Oo<T> c25437OooO0Oo, OooO0OO oooO0OO, Throwable th) {
        int i;
        boolean z;
        c25437OooO0Oo.getClass();
        this.f86712OooOo = c25437OooO0Oo;
        synchronized (c25437OooO0Oo) {
            synchronized (c25437OooO0Oo) {
                i = c25437OooO0Oo.f86718OooO0O0;
                z = i > 0;
            }
            this.f86715OooOoO0 = oooO0OO;
            this.f86714OooOoO = th;
        }
        if (!z) {
            throw new C25437OooO0Oo.OooO00o("Null shared reference");
        }
        c25437OooO0Oo.f86718OooO0O0 = i + 1;
        this.f86715OooOoO0 = oooO0OO;
        this.f86714OooOoO = th;
    }

    public static <T> AbstractC25434OooO00o<T> OooOOO0(AbstractC25434OooO00o<T> abstractC25434OooO00o) {
        if (abstractC25434OooO00o != null) {
            return abstractC25434OooO00o.OooO0OO();
        }
        return null;
    }

    public static void OooOOoo(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OooOooo((AbstractC25434OooO00o) it.next());
            }
        }
    }

    public static void OooOooo(AbstractC25434OooO00o<?> abstractC25434OooO00o) {
        if (abstractC25434OooO00o != null) {
            abstractC25434OooO00o.close();
        }
    }

    public static C25435OooO0O0 o00Oo0(Closeable closeable) {
        return o0Oo0oo(closeable, f86710OooOoOO, f86711OooOoo0);
    }

    public static C25435OooO0O0 o0Oo0oo(Object obj, InterfaceC25436OooO0OO interfaceC25436OooO0OO, OooO0OO oooO0OO) {
        if (obj == null) {
            return null;
        }
        Throwable th = oooO0OO.OooO0O0() ? new Throwable() : null;
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof InterfaceC25636OooO0Oo;
        }
        return new C25435OooO0O0(obj, interfaceC25436OooO0OO, oooO0OO, th, true);
    }

    public static boolean ooOO(AbstractC25434OooO00o<?> abstractC25434OooO00o) {
        return abstractC25434OooO00o != null && abstractC25434OooO00o.Oooo00o();
    }

    @Override // 
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC25434OooO00o<T> clone();

    public synchronized AbstractC25434OooO00o<T> OooO0OO() {
        if (!Oooo00o()) {
            return null;
        }
        return clone();
    }

    public final synchronized T Oooo000() {
        T tOooO00o;
        OooOo00.OooO0o(!this.f86713OooOo0o);
        tOooO00o = this.f86712OooOo.OooO00o();
        tOooO00o.getClass();
        return tOooO00o;
    }

    public synchronized boolean Oooo00o() {
        return !this.f86713OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075 A[ORIG_RETURN, RETURN] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        int i;
        boolean z;
        int i2;
        T t;
        synchronized (this) {
            try {
                if (this.f86713OooOo0o) {
                    return;
                }
                this.f86713OooOo0o = true;
                C25437OooO0Oo<T> c25437OooO0Oo = this.f86712OooOo;
                synchronized (c25437OooO0Oo) {
                    synchronized (c25437OooO0Oo) {
                        i = c25437OooO0Oo.f86718OooO0O0;
                        z = i > 0;
                    }
                    if (i2 != 0) {
                        synchronized (c25437OooO0Oo) {
                            t = c25437OooO0Oo.f86717OooO00o;
                            c25437OooO0Oo.f86717OooO00o = null;
                        }
                        if (t != null) {
                            InterfaceC25436OooO0OO<T> interfaceC25436OooO0OO = c25437OooO0Oo.f86719OooO0OO;
                            if (interfaceC25436OooO0OO != null) {
                                interfaceC25436OooO0OO.release(t);
                            }
                            IdentityHashMap identityHashMap = C25437OooO0Oo.f86716OooO0Oo;
                            synchronized (identityHashMap) {
                                try {
                                    Integer num = (Integer) identityHashMap.get(t);
                                    if (num == null) {
                                        C25438OooO00o.OooOO0O("SharedReference", "No entry in sLiveObjects for value of type %s", t.getClass());
                                    } else if (num.intValue() == 1) {
                                        identityHashMap.remove(t);
                                    } else {
                                        identityHashMap.put(t, Integer.valueOf(num.intValue() - 1));
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z) {
                    throw new C25437OooO0Oo.OooO00o("Null shared reference");
                }
                if (!(i > 0)) {
                    throw new IllegalArgumentException();
                }
                i2 = c25437OooO0Oo.f86718OooO0O0 - 1;
                c25437OooO0Oo.f86718OooO0O0 = i2;
                if (i2 != 0) {
                }
            } finally {
            }
        }
    }

    public AbstractC25434OooO00o(T t, InterfaceC25436OooO0OO<T> interfaceC25436OooO0OO, OooO0OO oooO0OO, Throwable th, boolean z) {
        this.f86712OooOo = new C25437OooO0Oo<>(t, interfaceC25436OooO0OO, z);
        this.f86715OooOoO0 = oooO0OO;
        this.f86714OooOoO = th;
    }
}
