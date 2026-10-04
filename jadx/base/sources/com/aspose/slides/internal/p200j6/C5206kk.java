package com.aspose.slides.internal.p200j6;

import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5206kk extends AbstractC5205k4 {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14212k4;

    /* JADX INFO: renamed from: kk */
    private C5210to f14213kk;

    /* JADX INFO: renamed from: x1 */
    private C7187kk f14214x1;

    public C5206kk() {
        this.f14212k4 = new C7186k4();
        this.f14214x1 = new C7187kk();
        this.f14212k4.m27783k4(C7182dy.f19710xw);
        this.f14212k4.m27783k4(this.f14214x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m22216x1() {
        return "CalRGB";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return 3;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5205k4
    /* JADX INFO: renamed from: k4 */
    public C7186k4 mo22215k4() {
        return this.f14212k4;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14213kk == null) {
            this.f14213kk = new C5210to(new float[]{0.0f}, this);
        }
        return this.f14213kk;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22216x1();
    }

    public C5206kk(C7186k4 c7186k4) {
        this.f14212k4 = c7186k4;
        this.f14214x1 = (C7187kk) c7186k4.m27787x1(1);
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        float f = fArr[0];
        return new float[]{f, f, f};
    }
}
