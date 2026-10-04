package com.aspose.slides.internal.p327ov;

import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p327ov.InterfaceC7155to;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.ov.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C7147ck extends AbstractC7156x1<C7151jd> {
    public C7147ck(C4804dy c4804dy, C11898h4 c11898h4) {
        super(c4804dy, c11898h4);
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1, com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: dy, reason: merged with bridge method [inline-methods] */
    public C7151jd mo27701k4() {
        C7151jd c7151jd = (C7151jd) super.mo27701k4();
        if (m27747x1() * 2.0f < this.f19284k4.m19881to()) {
            c7151jd.f19283ne = true;
        }
        return c7151jd;
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1
    /* JADX INFO: renamed from: h4 */
    public float mo27710h4() {
        float fMo27710h4 = super.mo27710h4();
        return (this.f19284k4.m19882x1() < 0.0f || this.f19284k4.m19882x1() * fMo27710h4 >= this.f19284k4.m19881to()) ? fMo27710h4 : fMo27710h4 / 2.0f;
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1
    /* JADX INFO: renamed from: kk */
    public C11896dy mo27713kk() {
        return this.f19302to.m55608up();
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public C7151jd mo27716to() {
        return new C7151jd();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1, com.aspose.slides.internal.p327ov.AbstractC7152k4
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo27707x1(C7151jd c7151jd) {
        C7151jd c7151jd2;
        float[] fArr = c7151jd.f19295m9;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = c7151jd.f19289du;
        float f4 = c7151jd.f19291h4;
        double dM46532kk = C9467to.m46532kk(c7151jd.f19294kk, c7151jd.f19296to, f, f2);
        if (c7151jd.f19283ne) {
            if (this.f19284k4.m19882x1() >= 0.0f || dM46532kk >= c7151jd.f19297x1) {
                c7151jd.f19287c5.m12025x1(C2633x1.m12032x1(f, f2));
                c7151jd.f19288ck = true;
            }
            c7151jd2 = c7151jd;
        } else {
            if (dM46532kk < this.f19286x1.m56930ne() * this.f19302to.m55596c5()) {
                c7151jd2 = c7151jd;
            } else {
                float f5 = c7151jd.f19297x1;
                if (dM46532kk == f5) {
                    if (c7151jd.f19278ks) {
                        c7151jd.f19287c5.m12024x1();
                        c7151jd.f19287c5.m12025x1(C2633x1.m12032x1(f, f2));
                        c7151jd.f19288ck = true;
                    }
                    c7151jd2 = c7151jd;
                } else if (dM46532kk > f5) {
                    if (c7151jd.f19278ks) {
                        C12025x6 c12025x6M27744k4 = m27744k4(c7151jd, f, f2, new C12025x6(0.0f, c7151jd.f19293k4));
                        c7151jd.f19287c5.m12024x1();
                        if (!C9467to.m46529k4(c12025x6M27744k4, new C12025x6(c7151jd.f19289du, c7151jd.f19291h4), 0.01f)) {
                            c7151jd.f19287c5.m12025x1(C2633x1.m12032x1(c12025x6M27744k4.m56897x1(), c12025x6M27744k4.m56895kk()));
                        }
                        c7151jd.f19287c5.m12025x1(C2633x1.m12032x1(f, f2));
                        c7151jd.f19288ck = true;
                        c7151jd2 = c7151jd;
                    } else {
                        c7151jd.f19287c5.m12025x1(C2633x1.m12032x1(f, f2));
                        c7151jd.f19288ck = true;
                        if (c7151jd.f19294kk != f3 || c7151jd.f19296to != f4) {
                            c7151jd2 = c7151jd;
                            float fM27743k4 = m27743k4(c7151jd2, f3, f4, f, f2);
                            if (fM27743k4 != 0.0f) {
                                C11913yj c11913yj = new C11913yj();
                                c11913yj.m55762k4((float) Math.toDegrees(fM27743k4));
                                this.f19302to.m55608up().m55577x1(c11913yj);
                                c7151jd2.f19292jd = this.f19302to;
                            }
                        }
                    }
                }
            }
        }
        mo27734k4(c7151jd2, f, f2);
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7152k4, com.aspose.slides.internal.p327ov.InterfaceC7155to
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ InterfaceC7155to.k4 mo27702k4(C2631kk c2631kk) {
        return super.mo27702k4(c2631kk);
    }

    @Override // com.aspose.slides.internal.p327ov.AbstractC7156x1
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo27711k4(C7151jd c7151jd) {
        return !c7151jd.f19283ne || this.f19284k4.m19882x1() < 0.0f;
    }
}
