package o00oO0O;

import java.util.Arrays;

/* JADX INFO: renamed from: o00oO0O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25497OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int[] f86912OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f86913OooO0O0;

    public C25497OooOOoo(int i) {
        this.f86912OooO00o = new int[i];
    }

    public final int OooO00o() {
        int[] iArr = this.f86912OooO00o;
        int i = this.f86913OooO0O0 - 1;
        this.f86913OooO0O0 = i;
        return iArr[i];
    }

    public final void OooO0O0(int i, int i2, int i3) {
        int i4 = this.f86913OooO0O0;
        int i5 = i4 + 3;
        int[] iArr = this.f86912OooO00o;
        if (i5 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86912OooO00o = iArrCopyOf;
        }
        int[] iArr2 = this.f86912OooO00o;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.f86913OooO0O0 = i5;
    }

    public final void OooO0OO(int i, int i2, int i3, int i4) {
        int i5 = this.f86913OooO0O0;
        int i6 = i5 + 4;
        int[] iArr = this.f86912OooO00o;
        if (i6 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86912OooO00o = iArrCopyOf;
        }
        int[] iArr2 = this.f86912OooO00o;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.f86913OooO0O0 = i6;
    }

    public final void OooO0Oo(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f86912OooO00o;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    OooO0o0(i3, i4);
                }
            }
            OooO0o0(i3 + 3, i2);
            OooO0Oo(i, i3);
            OooO0Oo(i3 + 6, i2);
        }
    }

    public final void OooO0o0(int i, int i2) {
        int[] iArr = this.f86912OooO00o;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }
}
