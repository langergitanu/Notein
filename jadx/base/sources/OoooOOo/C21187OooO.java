package OoooOOo;

/* JADX INFO: renamed from: OoooOOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21187OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f61447OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f61448OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[] f61449OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f61450OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f61451OooO0o0;

    public final int OooO00o(int i) {
        int i2 = this.f61447OooO00o + 1;
        int[] iArr = this.f61448OooO0O0;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            Oooo.OooO0OO.OooO(iArr, iArr2, 0, 14);
            Oooo.OooO0OO.OooO(this.f61449OooO0OO, iArr3, 0, 14);
            this.f61448OooO0O0 = iArr2;
            this.f61449OooO0OO = iArr3;
        }
        int i4 = this.f61447OooO00o;
        this.f61447OooO00o = i4 + 1;
        int length2 = this.f61450OooO0Oo.length;
        if (this.f61451OooO0o0 >= length2) {
            int i5 = length2 * 2;
            int[] iArr4 = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                iArr4[i6] = i7;
                i6 = i7;
            }
            Oooo.OooO0OO.OooO(this.f61450OooO0Oo, iArr4, 0, 14);
            this.f61450OooO0Oo = iArr4;
        }
        int i8 = this.f61451OooO0o0;
        int[] iArr5 = this.f61450OooO0Oo;
        this.f61451OooO0o0 = iArr5[i8];
        int[] iArr6 = this.f61448OooO0O0;
        iArr6[i4] = i;
        this.f61449OooO0OO[i4] = i8;
        iArr5[i8] = i4;
        int i9 = iArr6[i4];
        while (i4 > 0) {
            int i10 = ((i4 + 1) >> 1) - 1;
            if (iArr6[i10] <= i9) {
                break;
            }
            OooO0O0(i10, i4);
            i4 = i10;
        }
        return i8;
    }

    public final void OooO0O0(int i, int i2) {
        int[] iArr = this.f61448OooO0O0;
        int[] iArr2 = this.f61449OooO0OO;
        int[] iArr3 = this.f61450OooO0Oo;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
