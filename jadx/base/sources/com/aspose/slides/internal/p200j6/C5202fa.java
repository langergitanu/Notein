package com.aspose.slides.internal.p200j6;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.fa */
/* JADX INFO: loaded from: classes.dex */
public class C5202fa extends AbstractC5200du {

    /* JADX INFO: renamed from: k4 */
    public static final C5202fa f14208k4 = new C5202fa();

    /* JADX INFO: renamed from: x1 */
    private C5210to f14209x1;

    /* JADX INFO: renamed from: k4 */
    public static String m22207k4() {
        return "DeviceRGB";
    }

    /* JADX INFO: renamed from: x1 */
    public static String m22208x1() {
        return "RGB";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return 3;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14209x1 == null) {
            this.f14209x1 = new C5210to(new float[]{0.0f, 0.0f, 0.0f}, this);
        }
        return this.f14209x1;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22207k4();
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        return fArr;
    }
}
