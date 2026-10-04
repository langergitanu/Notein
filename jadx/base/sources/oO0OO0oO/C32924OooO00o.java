package oO0OO0oO;

import java.util.ArrayList;
import oO0o0OO.C33669o000oOoO;
import oOo00o0o.C34554OooO00o;
import oOo00oO0.C34561OooO0O0;
import oOo00oO0.C34562OooO0OO;

/* JADX INFO: renamed from: oO0OO0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32924OooO00o implements InterfaceC32925OooO0O0, InterfaceC32926OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile boolean f118804OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34562OooO0OO<InterfaceC32925OooO0O0> f118805OooOo0o;

    @Override // oO0OO0oO.InterfaceC32926OooO0OO
    public final boolean OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        InterfaceC32925OooO0O0 interfaceC32925OooO0O02;
        if (this.f118804OooOo) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f118804OooOo) {
                    return false;
                }
                C34562OooO0OO<InterfaceC32925OooO0O0> c34562OooO0OO = this.f118805OooOo0o;
                if (c34562OooO0OO != null) {
                    InterfaceC32925OooO0O0[] interfaceC32925OooO0O0Arr = c34562OooO0OO.f123808OooO0Oo;
                    int i = c34562OooO0OO.f123805OooO00o;
                    int iHashCode = interfaceC32925OooO0O0.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    InterfaceC32925OooO0O0 interfaceC32925OooO0O03 = interfaceC32925OooO0O0Arr[i2];
                    if (interfaceC32925OooO0O03 != null) {
                        if (interfaceC32925OooO0O03.equals(interfaceC32925OooO0O0)) {
                            c34562OooO0OO.OooO0O0(interfaceC32925OooO0O0Arr, i2, i);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                interfaceC32925OooO0O02 = interfaceC32925OooO0O0Arr[i2];
                                if (interfaceC32925OooO0O02 == null) {
                                }
                            } while (!interfaceC32925OooO0O02.equals(interfaceC32925OooO0O0));
                            c34562OooO0OO.OooO0O0(interfaceC32925OooO0O0Arr, i2, i);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // oO0OO0oO.InterfaceC32926OooO0OO
    public final boolean OooO0O0(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        if (!OooO00o(interfaceC32925OooO0O0)) {
            return false;
        }
        interfaceC32925OooO0O0.dispose();
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T[], java.lang.Object[]] */
    @Override // oO0OO0oO.InterfaceC32926OooO0OO
    public final boolean OooO0OO(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        if (!this.f118804OooOo) {
            synchronized (this) {
                try {
                    if (!this.f118804OooOo) {
                        C34562OooO0OO<InterfaceC32925OooO0O0> c34562OooO0OO = this.f118805OooOo0o;
                        if (c34562OooO0OO == null) {
                            c34562OooO0OO = new C34562OooO0OO<>();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            c34562OooO0OO.f123805OooO00o = iNumberOfLeadingZeros - 1;
                            c34562OooO0OO.f123807OooO0OO = (int) (0.75f * iNumberOfLeadingZeros);
                            c34562OooO0OO.f123808OooO0Oo = new Object[iNumberOfLeadingZeros];
                            this.f118805OooOo0o = c34562OooO0OO;
                        }
                        c34562OooO0OO.OooO00o(interfaceC32925OooO0O0);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC32925OooO0O0.dispose();
        return false;
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        if (this.f118804OooOo) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f118804OooOo) {
                    return;
                }
                this.f118804OooOo = true;
                C34562OooO0OO<InterfaceC32925OooO0O0> c34562OooO0OO = this.f118805OooOo0o;
                ArrayList arrayList = null;
                this.f118805OooOo0o = null;
                if (c34562OooO0OO == null) {
                    return;
                }
                for (InterfaceC32925OooO0O0 interfaceC32925OooO0O0 : c34562OooO0OO.f123808OooO0Oo) {
                    if (interfaceC32925OooO0O0 instanceof InterfaceC32925OooO0O0) {
                        try {
                            interfaceC32925OooO0O0.dispose();
                        } catch (Throwable th) {
                            C33669o000oOoO.OooO0O0(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new C34554OooO00o(arrayList);
                    }
                    throw C34561OooO0O0.OooO0O0((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
