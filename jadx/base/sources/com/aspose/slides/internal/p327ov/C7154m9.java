package com.aspose.slides.internal.p327ov;

import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p327ov.InterfaceC7155to;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ov.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7154m9 extends AbstractC7156x1<C7150h4> {
    public C7154m9(C4804dy c4804dy, C11898h4 c11898h4) {
        super(c4804dy, c11898h4);
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4, com.aspose.slides.internal.p327ov.InterfaceC7155to
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ InterfaceC7155to.k4 mo27702k4(C2631kk c2631kk) {
        return super.mo27702k4(c2631kk);
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1
    /* JADX INFO: renamed from: kk */
    public C11896dy mo27713kk() {
        return this.f19302to.m55600fa();
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1
    /* JADX INFO: renamed from: to */
    public C7150h4 mo27716to() {
        return new C7150h4();
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1, com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: kk */
    public void mo27707x1(C7150h4 c7150h4) {
        C7150h4 c7150h42;
        float[] fArr = c7150h4.f19295m9;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = c7150h4.f19289du;
        float f4 = c7150h4.f19291h4;
        double dM46532kk = C9467to.m46532kk(c7150h4.f19294kk, c7150h4.f19296to, f, f2);
        if (dM46532kk < this.f19286x1.m56930ne() * this.f19302to.m55596c5()) {
            c7150h42 = c7150h4;
        } else {
            float f5 = c7150h4.f19297x1;
            if (dM46532kk == f5) {
                c7150h4.f19287c5.m12024x1();
                c7150h4.f19287c5.m12025x1(C2633x1.m12032x1(f, f2));
                c7150h4.f19288ck = true;
            } else if (dM46532kk > f5) {
                c7150h4.f19287c5.m12025x1(C2633x1.m12032x1(f, f2));
                c7150h4.f19288ck = true;
                if (c7150h4.f19294kk != f3 || c7150h4.f19296to != f4) {
                    c7150h42 = c7150h4;
                    float fM27743k4 = m27743k4(c7150h42, f3, f4, f, f2);
                    if (fM27743k4 != 0.0f) {
                        C11913yj c11913yj = new C11913yj();
                        c11913yj.m55762k4((float) Math.toDegrees(fM27743k4));
                        this.f19302to.m55600fa().m55577x1(c11913yj);
                        c7150h42.f19292jd = this.f19302to;
                    }
                }
            }
            c7150h42 = c7150h4;
        }
        mo27734k4(c7150h42, f, f2);
    }
}
