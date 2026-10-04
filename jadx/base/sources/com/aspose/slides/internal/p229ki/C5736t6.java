package com.aspose.slides.internal.p229ki;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.t6 */
/* JADX INFO: loaded from: classes.dex */
public class C5736t6 extends AbstractC5746v4 {

    /* JADX INFO: renamed from: k4 */
    private static int[] f15774k4 = {0, 0, 0, 3, 4, 7, 8, 5, 6};

    /* JADX INFO: renamed from: kk */
    private AbstractC5746v4 f15775kk;

    /* JADX INFO: renamed from: to */
    private AbstractC5746v4 f15776to;

    /* JADX INFO: renamed from: x1 */
    private int f15777x1;

    public C5736t6(int i, AbstractC5746v4 abstractC5746v4, AbstractC5746v4 abstractC5746v42) {
        this.f15777x1 = i;
        this.f15775kk = abstractC5746v4;
        this.f15776to = abstractC5746v42;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m23324k4(int i) {
        return f15774k4[i];
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5746v4
    public int ad_() {
        return 1;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC5746v4 m23325du() {
        return this.f15776to;
    }

    /* JADX INFO: renamed from: kk */
    public final int m23326kk() {
        return this.f15777x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC5746v4 m23327to() {
        return this.f15775kk;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5746v4
    /* JADX INFO: renamed from: x1 */
    public int mo23217x1() {
        int i = this.f15777x1;
        if (i <= 8) {
            return 2;
        }
        return i <= 13 ? 0 : 3;
    }
}
