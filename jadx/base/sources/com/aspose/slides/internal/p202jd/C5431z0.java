package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.internal.p447up.C11542x1;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.z0 */
/* JADX INFO: loaded from: classes.dex */
public class C5431z0 extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14399k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14399k4 = c11068dy;
        c11068dy.m53499k4("left", C5813x1.k4.f16523xk);
        c11068dy.m53499k4("right", C5813x1.k4.f15918bz);
        C11537ks c11537ks = C5813x1.k4.f16416ts;
        c11068dy.m53499k4("center", c11537ks);
        c11068dy.m53499k4("justify", C5813x1.k4.f16517xc);
        c11068dy.m53499k4("middle", c11537ks);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14399k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        InterfaceC5808uz interfaceC5808uzM25970k4;
        C11539rv c11539rvMo8439k4;
        AbstractC5788h4 abstractC5788h4M54525k4;
        AbstractC5788h4 abstractC5788h4M54525k42;
        if (c11539rv.m54530to(i) && (interfaceC5808uzM25970k4 = C6344m9.m25970k4((InterfaceC12769ix) interfaceC5808uz)) != null && (c11539rvMo8439k4 = interfaceC5808uzM25970k4.mo8439k4(null)) != null && (abstractC5788h4M54525k4 = c11539rvMo8439k4.m54525k4(c6344m9.m26003to(92))) != null && abstractC5788h4M54525k4 == C5813x1.k4.f15874aa && (abstractC5788h4M54525k42 = c11539rvMo8439k4.m54525k4(c6344m9.m26003to(240))) != null && abstractC5788h4M54525k42 == C5813x1.k4.f16416ts) {
            int iM26003to = c6344m9.m26003to(164);
            int iM26003to2 = c6344m9.m26003to(165);
            if (c11539rv.m54525k4(iM26003to) == null && c11539rv.m54525k4(iM26003to2) == null) {
                abstractC5788h4 = C5813x1.k4.f16523xk;
                C11537ks c11537ks = C5813x1.k4.f16548yd;
                c11539rv.m54526k4(iM26003to, c11537ks);
                c11539rv.m54526k4(iM26003to2, c11537ks);
            }
        }
        if (abstractC5788h4 == null || C7019kk.m27469x1(abstractC5788h4, C11542x1.class) || c11539rv.m54530to(i)) {
            if (c6344m9.m25991k4(interfaceC5808uz, str, c6344m9.m26003to(91)) != C5813x1.k4.f16532xt) {
                return (!c11539rv.m54530to(i) || abstractC5788h4 == null) ? C5813x1.k4.f16523xk : abstractC5788h4;
            }
            C11537ks c11537ks2 = C5813x1.k4.f16523xk;
            if (abstractC5788h4 == c11537ks2) {
                return C5813x1.k4.f15918bz;
            }
            if (abstractC5788h4 == C5813x1.k4.f15918bz) {
                return c11537ks2;
            }
        }
        return abstractC5788h4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16523xk;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 240;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933up, c6344m9);
        return abstractC5788h4Mo15578k4 == C5813x1.k4.f16040gf ? mo15585to() : abstractC5788h4Mo15578k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "text-align";
    }
}
