package OooOo;

/* JADX INFO: renamed from: OooOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20480OooOOo0 extends OooO0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f58498OooO0o;

    public final int OooO0OO(int i) {
        int i2 = this.f58473OooO0Oo;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f58470OooO00o;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void OooO0Oo(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C20491OooOooo.OooO0o0(i)) : 0;
        this.f58473OooO0Oo = iMax;
        if (iMax == 0) {
            jArr = C20491OooOooo.f58536OooO00o;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Oooo.OooO0OO.OooOOOo(jArr);
        }
        this.f58470OooO00o = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f58498OooO0o = C20491OooOooo.OooO0OO(this.f58473OooO0Oo) - this.f58474OooO0o0;
        this.f58471OooO0O0 = new int[iMax];
        this.f58472OooO0OO = new int[iMax];
    }
}
