package oO0o0o0o;

import o000o0o.C24613OooO0OO;
import oO0o0OO.AbstractC33630OooOooO;

/* JADX INFO: renamed from: oO0o0o0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33874OooO0OO extends C33876OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C33874OooO0OO f122046OooOoO;

    static {
        int i = C33871OooO.f122014OooO0OO;
        int i2 = C33871OooO.f122015OooO0Oo;
        long j = C33871OooO.f122017OooO0o0;
        String str = C33871OooO.f122012OooO00o;
        C33874OooO0OO c33874OooO0OO = new C33874OooO0OO();
        c33874OooO0OO.f122047OooOoO0 = new ExecutorC33872OooO00o(str, i, i2, j);
        f122046OooOoO = c33874OooO0OO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final AbstractC33630OooOooO o000OOo0(int i) {
        C24613OooO0OO.OooO0O0(1);
        return 1 >= C33871OooO.f122014OooO0OO ? this : super.o000OOo0(1);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        return "Dispatchers.Default";
    }
}
