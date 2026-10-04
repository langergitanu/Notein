package o00o0O;

/* JADX INFO: renamed from: o00o0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25304OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25305OooO0OO[] f86120OooO00o;

    public C25304OooO0O0(int i, int i2) {
        C25305OooO0OO[] c25305OooO0OOArr = new C25305OooO0OO[i];
        for (int i3 = 0; i3 < i; i3++) {
            c25305OooO0OOArr[i3] = new C25305OooO0OO(i2);
        }
        this.f86120OooO00o = c25305OooO0OOArr;
    }

    public final float OooO00o(int i, int i2) {
        return this.f86120OooO00o[i].f86122OooO0O0[i2].floatValue();
    }

    public final void OooO0O0(int i, int i2, float f) {
        C25305OooO0OO c25305OooO0OO = this.f86120OooO00o[i];
        c25305OooO0OO.f86122OooO0O0[i2] = Float.valueOf(f);
    }
}
