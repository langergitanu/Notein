package com.aspose.slides.internal.p200j6;

import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5212x1 extends AbstractC5205k4 {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14230k4;

    /* JADX INFO: renamed from: kk */
    private C5210to f14231kk;

    /* JADX INFO: renamed from: x1 */
    private C7187kk f14232x1;

    public C5212x1() {
        this.f14230k4 = new C7186k4();
        this.f14232x1 = new C7187kk();
        this.f14230k4.m27783k4(C7182dy.f19633t6);
        this.f14230k4.m27783k4(this.f14232x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m22233x1() {
        return "CalGray";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5205k4
    /* JADX INFO: renamed from: k4 */
    public C7186k4 mo22215k4() {
        return this.f14230k4;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14231kk == null) {
            this.f14231kk = new C5210to(new float[]{0.0f}, this);
        }
        return this.f14231kk;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22233x1();
    }

    public C5212x1(C7186k4 c7186k4) {
        this.f14230k4 = c7186k4;
        this.f14232x1 = (C7187kk) c7186k4.m27787x1(1);
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        float f = fArr[0];
        return new float[]{f, f, f};
    }
}
