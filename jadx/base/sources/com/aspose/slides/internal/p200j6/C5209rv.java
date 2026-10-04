package com.aspose.slides.internal.p200j6;

import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7186k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.rv */
/* JADX INFO: loaded from: classes.dex */
public class C5209rv extends AbstractC5200du {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14222k4;

    /* JADX INFO: renamed from: x1 */
    private C5210to f14223x1;

    public C5209rv() {
        C7186k4 c7186k4 = new C7186k4();
        this.f14222k4 = c7186k4;
        c7186k4.m27783k4(C7182dy.f19507l6);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m22225k4() {
        return "Pattern";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return -1;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14223x1 == null) {
            this.f14223x1 = new C5210to(new float[0], null);
        }
        return this.f14223x1;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22225k4();
    }

    public C5209rv(C7186k4 c7186k4) {
        this.f14222k4 = c7186k4;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        return new float[]{1.0f, 1.0f, 1.0f};
    }
}
