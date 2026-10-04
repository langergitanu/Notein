package o00ooO0;

import Oooo0oO.C21023OooO0Oo;
import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseArray<OooO00o<T>> f87854OooO00o = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o<T> f87855OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o<T> f87856OooO0OO;

    public static class OooO00o<I> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO00o<I> f87857OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f87858OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public LinkedList<I> f87859OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO00o<I> f87860OooO0Oo;

        public OooO00o() {
            throw null;
        }

        public final String toString() {
            return C21023OooO0Oo.OooO0OO(")", this.f87858OooO0O0, new StringBuilder("LinkedEntry(key: "));
        }
    }

    public final synchronized void OooO00o(OooO00o<T> oooO00o) {
        try {
            OooO00o oooO00o2 = (OooO00o<T>) oooO00o.f87857OooO00o;
            OooO00o oooO00o3 = (OooO00o<T>) oooO00o.f87860OooO0Oo;
            if (oooO00o2 != null) {
                oooO00o2.f87860OooO0Oo = oooO00o3;
            }
            if (oooO00o3 != null) {
                oooO00o3.f87857OooO00o = oooO00o2;
            }
            oooO00o.f87857OooO00o = null;
            oooO00o.f87860OooO0Oo = null;
            if (oooO00o == this.f87855OooO0O0) {
                this.f87855OooO0O0 = oooO00o3;
            }
            if (oooO00o == this.f87856OooO0OO) {
                this.f87856OooO0OO = oooO00o2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
