package o0oo0oo;

import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31384OooOo00 extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long[] f112070OooO0o;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        C31380OooOOo0 c31380OooOOo0Oooo000 = c31401Oooo0oO.Oooo000();
        if (c31380OooOOo0Oooo000 == null) {
            throw new IOException("Could not get head table");
        }
        int iOooo0OO = c31401Oooo0oO.Oooo0OO() + 1;
        this.f112070OooO0o = new long[iOooo0OO];
        for (int i = 0; i < iOooo0OO; i++) {
            short s = c31380OooOOo0Oooo000.f112062OooOO0o;
            if (s == 0) {
                this.f112070OooO0o[i] = abstractC31397Oooo0O0.ooOO() * 2;
            } else {
                if (s != 1) {
                    throw new IOException("Error:TTF.loca unknown offset format.");
                }
                this.f112070OooO0o[i] = abstractC31397Oooo0O0.Oooo0OO();
            }
        }
        this.f112121OooO0Oo = true;
    }
}
