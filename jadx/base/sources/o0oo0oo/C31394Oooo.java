package o0oo0oo;

import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31394Oooo extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f112099OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f112100OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public short[] f112101OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public short[] f112102OooO0oo;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        int i;
        C31402Oooo0oo c31402Oooo0oo = (C31402Oooo0oo) c31401Oooo0oO.o0Oo0oo("vhea");
        if (c31402Oooo0oo == null) {
            throw new IOException("Could not get vhea table");
        }
        this.f112099OooO = c31402Oooo0oo.f112129OooO0o;
        int iOooo0OO = c31401Oooo0oO.Oooo0OO();
        int i2 = this.f112099OooO;
        this.f112100OooO0o = new int[i2];
        this.f112101OooO0oO = new short[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = this.f112099OooO;
            if (i3 >= i) {
                break;
            }
            this.f112100OooO0o[i3] = abstractC31397Oooo0O0.ooOO();
            this.f112101OooO0oO[i3] = abstractC31397Oooo0O0.Oooo000();
            i4 += 4;
            i3++;
        }
        if (i4 < this.f112120OooO0OO) {
            int i5 = iOooo0OO - i;
            if (i5 >= 0) {
                iOooo0OO = i5;
            }
            this.f112102OooO0oo = new short[iOooo0OO];
            for (int i6 = 0; i6 < iOooo0OO; i6++) {
                if (i4 < this.f112120OooO0OO) {
                    this.f112102OooO0oo[i6] = abstractC31397Oooo0O0.Oooo000();
                    i4 += 2;
                }
            }
        }
        this.f112121OooO0Oo = true;
    }
}
