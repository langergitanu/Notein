package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5787g8;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.up */
/* JADX INFO: loaded from: classes4.dex */
public class C11541up extends AbstractC11535k4 {

    /* JADX INFO: renamed from: du */
    private final String f39036du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC5803to f39037k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC5803to f39038kk;

    /* JADX INFO: renamed from: to */
    private AbstractC5803to f39039to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5803to f39040x1;

    public C11541up(AbstractC5803to abstractC5803to, AbstractC5803to abstractC5803to2, AbstractC5803to abstractC5803to3) {
        super((short) 25);
        this.f39037k4 = abstractC5803to;
        this.f39040x1 = abstractC5803to2;
        this.f39038kk = abstractC5803to3;
        this.f39039to = C5813x1.k4.f15972dy;
        this.f39036du = C14113y2.m67402k4("rgb({0}, {1}, {2})", abstractC5803to.mo23414h4(), abstractC5803to2.mo23414h4(), abstractC5803to3.mo23414h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static C11541up m54533k4(float f, float f2, float f3) {
        return new C11541up(C11531dy.m54520k4(f, (short) 1), C11531dy.m54520k4(f2, (short) 1), C11531dy.m54520k4(f3, (short) 1));
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4, com.aspose.slides.internal.p231kk.AbstractC5803to
    /* JADX INFO: renamed from: du */
    public C5787g8 mo23698du() {
        return new C5787g8(this.f39039to, this.f39037k4, this.f39040x1, this.f39038kk);
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        return this.f39036du;
    }

    public C11541up(AbstractC5803to abstractC5803to, AbstractC5803to abstractC5803to2, AbstractC5803to abstractC5803to3, AbstractC5803to abstractC5803to4) {
        super((short) 25);
        this.f39037k4 = abstractC5803to2;
        this.f39040x1 = abstractC5803to3;
        this.f39038kk = abstractC5803to4;
        this.f39039to = abstractC5803to;
        this.f39036du = C14113y2.m67402k4("rgba({0}, {1}, {2}, {3})", abstractC5803to2.mo23414h4(), abstractC5803to3.mo23414h4(), abstractC5803to4.mo23414h4(), abstractC5803to.mo23414h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static C11541up m54534k4(float f, float f2, float f3, float f4) {
        return new C11541up(C11531dy.m54520k4(f, (short) 1), C11531dy.m54520k4(f2, (short) 1), C11531dy.m54520k4(f3, (short) 1), C11531dy.m54520k4(f4, (short) 1));
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }
}
