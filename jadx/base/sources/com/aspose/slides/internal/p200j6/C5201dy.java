package com.aspose.slides.internal.p200j6;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5201dy extends AbstractC5200du {

    /* JADX INFO: renamed from: k4 */
    public static final C5201dy f14206k4 = new C5201dy();

    /* JADX INFO: renamed from: x1 */
    private C5210to f14207x1;

    /* JADX INFO: renamed from: k4 */
    public static String m22205k4() {
        return "DeviceCMYK";
    }

    /* JADX INFO: renamed from: x1 */
    public static String m22206x1() {
        return "CMYK";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14207x1 == null) {
            this.f14207x1 = new C5210to(new float[]{0.0f, 0.0f, 0.0f, 1.0f}, this);
        }
        return this.f14207x1;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22205k4();
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = 1.0f - fArr[3];
        return new float[]{(1.0f - f) * f4, (1.0f - f2) * f4, (1.0f - f3) * f4};
    }
}
