package oO0OOO00;

import java.util.ArrayList;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0oO.C32390OooO0o;
import oO00o0oO.C32393OooO0oo;
import ooOOo0.InterfaceC35108OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements OooO0O0, InterfaceC35108OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile boolean f118918OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C32393OooO0oo<OooO0O0> f118919OooOo0o;

    /* JADX WARN: Type inference failed for: r2v4, types: [T[], java.lang.Object[]] */
    @Override // ooOOo0.InterfaceC35108OooO00o
    public final boolean OooO00o(OooO0O0 oooO0O0) {
        if (!this.f118918OooOo) {
            synchronized (this) {
                try {
                    if (!this.f118918OooOo) {
                        C32393OooO0oo<OooO0O0> c32393OooO0oo = this.f118919OooOo0o;
                        if (c32393OooO0oo == null) {
                            c32393OooO0oo = new C32393OooO0oo<>();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            c32393OooO0oo.f116487OooO00o = iNumberOfLeadingZeros - 1;
                            c32393OooO0oo.f116489OooO0OO = (int) (0.75f * iNumberOfLeadingZeros);
                            c32393OooO0oo.f116490OooO0Oo = new Object[iNumberOfLeadingZeros];
                            this.f118919OooOo0o = c32393OooO0oo;
                        }
                        c32393OooO0oo.OooO00o(oooO0O0);
                        return true;
                    }
                } finally {
                }
            }
        }
        oooO0O0.dispose();
        return false;
    }

    @Override // ooOOo0.InterfaceC35108OooO00o
    public final boolean OooO0O0(OooO0O0 oooO0O0) {
        if (!OooO0OO(oooO0O0)) {
            return false;
        }
        oooO0O0.dispose();
        return true;
    }

    @Override // ooOOo0.InterfaceC35108OooO00o
    public final boolean OooO0OO(OooO0O0 oooO0O0) {
        OooO0O0 oooO0O02;
        o00Oo0.OooO00o(oooO0O0, "Disposable item is null");
        if (this.f118918OooOo) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f118918OooOo) {
                    return false;
                }
                C32393OooO0oo<OooO0O0> c32393OooO0oo = this.f118919OooOo0o;
                if (c32393OooO0oo != null) {
                    OooO0O0[] oooO0O0Arr = c32393OooO0oo.f116490OooO0Oo;
                    int i = c32393OooO0oo.f116487OooO00o;
                    int iHashCode = oooO0O0.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    OooO0O0 oooO0O03 = oooO0O0Arr[i2];
                    if (oooO0O03 != null) {
                        if (oooO0O03.equals(oooO0O0)) {
                            c32393OooO0oo.OooO0O0(oooO0O0Arr, i2, i);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                oooO0O02 = oooO0O0Arr[i2];
                                if (oooO0O02 == null) {
                                }
                            } while (!oooO0O02.equals(oooO0O0));
                            c32393OooO0oo.OooO0O0(oooO0O0Arr, i2, i);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        if (this.f118918OooOo) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f118918OooOo) {
                    return;
                }
                this.f118918OooOo = true;
                C32393OooO0oo<OooO0O0> c32393OooO0oo = this.f118919OooOo0o;
                ArrayList arrayList = null;
                this.f118919OooOo0o = null;
                if (c32393OooO0oo == null) {
                    return;
                }
                for (OooO0O0 oooO0O0 : c32393OooO0oo.f116490OooO0Oo) {
                    if (oooO0O0 instanceof OooO0O0) {
                        try {
                            oooO0O0.dispose();
                        } catch (Throwable th) {
                            C30416Oooo0OO.OooO00o(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new oO00o00O.OooO00o(arrayList);
                    }
                    throw C32390OooO0o.OooO0OO((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
