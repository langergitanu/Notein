package com.aspose.slides.internal.p462vj;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C11666ne {

    /* JADX INFO: renamed from: k4 */
    private int[] f39373k4;

    /* JADX INFO: renamed from: kk */
    private int f39374kk;

    /* JADX INFO: renamed from: x1 */
    private int f39375x1;

    /* JADX INFO: renamed from: k4 */
    public final int m54915k4() {
        while (true) {
            int i = this.f39374kk;
            int[] iArr = this.f39373k4;
            if (i >= iArr.length) {
                return -1;
            }
            int i2 = iArr[i];
            int i3 = this.f39375x1;
            if (i2 > i3) {
                return i2 - i3;
            }
            this.f39374kk = i + 1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m54917x1() {
        while (true) {
            int i = this.f39374kk;
            int[] iArr = this.f39373k4;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] > this.f39375x1) {
                return true;
            }
            this.f39374kk = i + 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54916k4(int i) {
        this.f39375x1 += i;
    }
}
