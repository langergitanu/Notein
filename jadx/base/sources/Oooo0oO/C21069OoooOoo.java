package Oooo0oO;

import java.util.Arrays;

/* JADX INFO: renamed from: Oooo0oO.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21069OoooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int[] f61024OooO00o = new int[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f61025OooO0O0;

    public final int OooO00o() {
        int[] iArr = this.f61024OooO00o;
        int i = this.f61025OooO0O0 - 1;
        this.f61025OooO0O0 = i;
        return iArr[i];
    }

    public final void OooO0O0(int i) {
        int i2 = this.f61025OooO0O0;
        int[] iArr = this.f61024OooO00o;
        if (i2 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f61024OooO00o = iArrCopyOf;
        }
        int[] iArr2 = this.f61024OooO00o;
        int i3 = this.f61025OooO0O0;
        this.f61025OooO0O0 = i3 + 1;
        iArr2[i3] = i;
    }
}
