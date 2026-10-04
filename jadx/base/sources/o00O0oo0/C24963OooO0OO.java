package o00O0oo0;

import java.util.Arrays;

/* JADX INFO: renamed from: o00O0oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24963OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f84670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f84671OooO0O0;

    public C24963OooO0OO(float[] fArr, int[] iArr) {
        this.f84670OooO00o = fArr;
        this.f84671OooO0O0 = iArr;
    }

    public final C24963OooO0OO OooO00o(float[] fArr) {
        int iOooO0Oo;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f84670OooO00o;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.f84671OooO0O0;
            if (iBinarySearch >= 0) {
                iOooO0Oo = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iOooO0Oo = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iOooO0Oo = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iOooO0Oo = o00OO00O.OooO0O0.OooO0Oo((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iOooO0Oo;
        }
        return new C24963OooO0OO(fArr, iArr);
    }
}
