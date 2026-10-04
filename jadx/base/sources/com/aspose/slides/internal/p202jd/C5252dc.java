package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p447up.C11539rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.dc */
/* JADX INFO: loaded from: classes.dex */
public class C5252dc extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14267k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14267k4 = c11068dy;
        c11068dy.m53499k4("left", C5813x1.k4.f16523xk);
        c11068dy.m53499k4("center", C5813x1.k4.f16416ts);
        c11068dy.m53499k4("right", C5813x1.k4.f15918bz);
        c11068dy.m53499k4("top", C5813x1.k4.f16535xw);
        c11068dy.m53499k4("bottom", C5813x1.k4.f16469vj);
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC5788h4 m22249kk(AbstractC5788h4 abstractC5788h4) {
        if (!m15603k4(abstractC5788h4)) {
            return abstractC5788h4;
        }
        if (abstractC5788h4 == C5813x1.k4.f16535xw) {
            return C5813x1.k4.f16427u4;
        }
        if (abstractC5788h4 == C5813x1.k4.f16416ts) {
            return C5813x1.k4.f16452uz;
        }
        if (abstractC5788h4 == C5813x1.k4.f16469vj) {
            return C5813x1.k4.f16493wl;
        }
        throw C9919h4.m48833x1(abstractC5788h4.mo23414h4());
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14267k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        List list = new List((C5796m9) abstractC5788h4);
        if (list.size() == 1) {
            list.addItem(C5813x1.k4.f16416ts);
        }
        if (m15603k4((AbstractC5788h4) list.get_Item(0)) && m15603k4((AbstractC5788h4) list.get_Item(1))) {
            Object obj = list.get_Item(0);
            C11537ks c11537ks = C5813x1.k4.f16523xk;
            if (obj != c11537ks) {
                Object obj2 = list.get_Item(0);
                C11537ks c11537ks2 = C5813x1.k4.f15918bz;
                if (obj2 != c11537ks2) {
                    Object obj3 = list.get_Item(1);
                    C11537ks c11537ks3 = C5813x1.k4.f16535xw;
                    if (obj3 != c11537ks3) {
                        Object obj4 = list.get_Item(1);
                        C11537ks c11537ks4 = C5813x1.k4.f16469vj;
                        if (obj4 != c11537ks4 && (list.get_Item(0) == c11537ks3 || list.get_Item(0) == c11537ks4 || list.get_Item(1) == c11537ks || list.get_Item(1) == c11537ks2)) {
                            AbstractC5788h4 abstractC5788h4M22250x1 = m22250x1((AbstractC5788h4) list.get_Item(1));
                            AbstractC5788h4 abstractC5788h4M22249kk = m22249kk((AbstractC5788h4) list.get_Item(0));
                            list.set_Item(0, abstractC5788h4M22250x1);
                            list.set_Item(1, abstractC5788h4M22249kk);
                        }
                    }
                }
            }
        } else {
            list.set_Item(0, m22250x1((AbstractC5788h4) list.get_Item(0)));
            list.set_Item(1, m22249kk((AbstractC5788h4) list.get_Item(1)));
        }
        return new C5796m9(list);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        C5796m9 c5796m9 = new C5796m9();
        C11531dy c11531dy = C5813x1.k4.f16427u4;
        c5796m9.m23683x1(c11531dy);
        c5796m9.m23683x1(c11531dy);
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 103;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC5788h4 m22250x1(AbstractC5788h4 abstractC5788h4) {
        if (!m15603k4(abstractC5788h4)) {
            return abstractC5788h4;
        }
        if (abstractC5788h4 == C5813x1.k4.f16523xk) {
            return C5813x1.k4.f16427u4;
        }
        if (abstractC5788h4 == C5813x1.k4.f16416ts) {
            return C5813x1.k4.f16452uz;
        }
        if (abstractC5788h4 == C5813x1.k4.f15918bz) {
            return C5813x1.k4.f16493wl;
        }
        throw C9919h4.m48833x1(abstractC5788h4.mo23414h4());
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        C5796m9 c5796m9 = new C5796m9();
        do {
            c5796m9.m23683x1(super.mo15578k4(interfaceC9933up, c6344m9));
            interfaceC9933up = interfaceC9933up.mo48851kk();
        } while (interfaceC9933up != null);
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "fit-position";
    }
}
