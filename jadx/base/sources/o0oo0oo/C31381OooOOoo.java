package o0oo0oo;

import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31381OooOOoo extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f112063OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f112064OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public short[] f112065OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public short[] f112066OooO0oo;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        int i;
        C31379OooOOo c31379OooOOoOooo00o = c31401Oooo0oO.Oooo00o();
        if (c31379OooOOoOooo00o == null) {
            throw new IOException("Could not get hmtx table");
        }
        this.f112063OooO = c31379OooOOoOooo00o.f112055OooO0oo;
        int iOooo0OO = c31401Oooo0oO.Oooo0OO();
        int i2 = this.f112063OooO;
        this.f112064OooO0o = new int[i2];
        this.f112065OooO0oO = new short[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = this.f112063OooO;
            if (i3 >= i) {
                break;
            }
            this.f112064OooO0o[i3] = abstractC31397Oooo0O0.ooOO();
            this.f112065OooO0oO[i3] = abstractC31397Oooo0O0.Oooo000();
            i4 += 4;
            i3++;
        }
        int i5 = iOooo0OO - i;
        if (i5 >= 0) {
            iOooo0OO = i5;
        }
        this.f112066OooO0oo = new short[iOooo0OO];
        if (i4 < this.f112120OooO0OO) {
            for (int i6 = 0; i6 < iOooo0OO; i6++) {
                if (i4 < this.f112120OooO0OO) {
                    this.f112066OooO0oo[i6] = abstractC31397Oooo0O0.Oooo000();
                    i4 += 2;
                }
            }
        }
        this.f112121OooO0Oo = true;
    }

    public final int OooO0O0(int i) {
        if (i < this.f112063OooO) {
            return this.f112064OooO0o[i];
        }
        return this.f112064OooO0o[r2.length - 1];
    }
}
