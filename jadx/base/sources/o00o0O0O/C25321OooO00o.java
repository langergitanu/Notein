package o00o0O0O;

import android.util.Log;
import androidx.core.util.Pools;
import o00o0O0O.AbstractC25326OooO0Oo;

/* JADX INFO: renamed from: o00o0O0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25321OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C19694OooO00o f86168OooO00o = new C19694OooO00o();

    /* JADX INFO: renamed from: o00o0O0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19694OooO00o implements InterfaceC25323OooO0o0<Object> {
        @Override // o00o0O0O.C25321OooO00o.InterfaceC25323OooO0o0
        public final void OooO00o(Object obj) {
        }
    }

    /* JADX INFO: renamed from: o00o0O0O.OooO00o$OooO0O0 */
    public interface OooO0O0<T> {
        T create();
    }

    /* JADX INFO: renamed from: o00o0O0O.OooO00o$OooO0OO */
    public static final class OooO0OO<T> implements Pools.Pool<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0<T> f86169OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC25323OooO0o0<T> f86170OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Pools.SynchronizedPool f86171OooO0OO;

        public OooO0OO(Pools.SynchronizedPool synchronizedPool, OooO0O0 oooO0O0, InterfaceC25323OooO0o0 interfaceC25323OooO0o0) {
            this.f86171OooO0OO = synchronizedPool;
            this.f86169OooO00o = oooO0O0;
            this.f86170OooO0O0 = interfaceC25323OooO0o0;
        }

        @Override // androidx.core.util.Pools.Pool
        public final T acquire() {
            T tAcquire = this.f86171OooO0OO.acquire();
            if (tAcquire == null) {
                tAcquire = this.f86169OooO00o.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tAcquire.getClass());
                }
            }
            if (tAcquire instanceof InterfaceC25322OooO0Oo) {
                ((InterfaceC25322OooO0Oo) tAcquire).OooO0O0().f86172OooO00o = false;
            }
            return tAcquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public final boolean release(T t) {
            if (t instanceof InterfaceC25322OooO0Oo) {
                ((InterfaceC25322OooO0Oo) t).OooO0O0().f86172OooO00o = true;
            }
            this.f86170OooO0O0.OooO00o(t);
            return this.f86171OooO0OO.release(t);
        }
    }

    /* JADX INFO: renamed from: o00o0O0O.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC25322OooO0Oo {
        AbstractC25326OooO0Oo.OooO00o OooO0O0();
    }

    /* JADX INFO: renamed from: o00o0O0O.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC25323OooO0o0<T> {
        void OooO00o(T t);
    }

    public static OooO0OO OooO00o(int i, OooO0O0 oooO0O0) {
        return new OooO0OO(new Pools.SynchronizedPool(i), oooO0O0, f86168OooO00o);
    }
}
