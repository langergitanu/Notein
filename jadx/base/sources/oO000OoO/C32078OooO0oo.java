package oO000OoO;

/* JADX INFO: renamed from: oO000OoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32078OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f114898OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f114899OooO0O0 = new int[10];

    public final boolean OooO00o(int i) {
        return ((1 << i) & this.f114898OooO00o) != 0;
    }

    public final void OooO0O0(int i, int i2) {
        int[] iArr = this.f114899OooO0O0;
        if (i >= iArr.length) {
            return;
        }
        this.f114898OooO00o = (1 << i) | this.f114898OooO00o;
        iArr[i] = i2;
    }
}
