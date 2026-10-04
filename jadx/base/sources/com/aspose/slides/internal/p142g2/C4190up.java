package com.aspose.slides.internal.p142g2;

import com.aspose.slides.internal.p019ac.C1339du;
import com.aspose.slides.internal.p019ac.C1342h4;
import com.aspose.slides.internal.p019ac.C1350qq;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5037rs;
import com.aspose.slides.internal.p183ij.C5059vj;
import com.aspose.slides.internal.p191it.AbstractC5129up;
import com.aspose.slides.internal.p413t1.AbstractC10812ck;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.g2.up */
/* JADX INFO: loaded from: classes.dex */
public class C4190up extends AbstractC10812ck {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC5129up f11367k4 = new C4185sv(this);

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: k4 */
    public AbstractC5129up mo16616k4() {
        return this.f11367k4;
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du m16662k4(C1350qq c1350qq) {
        int iM7958kk = c1350qq.m7958kk() & 65535;
        int iM7961to = c1350qq.m7961to() & 65535;
        int iM7953h4 = 65535 & c1350qq.m7953h4();
        c1350qq.m7960m9();
        if (iM7958kk > 255) {
            iM7958kk >>= 8;
        }
        if (iM7961to > 255) {
            iM7961to >>= 8;
        }
        if (iM7953h4 > 255) {
            iM7953h4 >>= 8;
        }
        return C12003du.m56398k4(255, iM7958kk, iM7961to, iM7953h4);
    }

    @Override // com.aspose.slides.internal.p413t1.AbstractC10812ck
    /* JADX INFO: renamed from: k4 */
    public void mo16663k4(C5059vj c5059vj, C4201h4 c4201h4) {
        C11909up c11909up;
        AbstractC12024x1 c11999ar;
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c4201h4.m16701k4();
        C5037rs c5037rsM21541h4 = c5059vj.m21541h4();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        if (c5059vj.m21549to() == 0 || c5059vj.m21549to() == 1) {
            for (C1339du c1339du : c5059vj.m21541h4().m21424x1()) {
                C1350qq c1350qq = c5037rsM21541h4.m21422k4()[(int) c1339du.m7876k4()];
                C1350qq c1350qq2 = c5037rsM21541h4.m21422k4()[(int) c1339du.m7879x1()];
                C12014ne c12014neClone = C12014ne.m56654k4(c1350qq.m7955k4(), c1350qq.m7963x1(), c1350qq2.m7955k4(), c1350qq2.m7963x1()).Clone();
                if (c5059vj.m21549to() == 0) {
                    float fM7963x1 = (c1350qq2.m7963x1() + c1350qq.m7963x1()) / 2.0f;
                    c11909up = new C11909up(new C12025x6(c1350qq.m7955k4(), fM7963x1).Clone(), new C12025x6(c1350qq2.m7955k4(), fM7963x1).Clone(), m16662k4(c1350qq).Clone().Clone(), m16662k4(c1350qq2).Clone().Clone());
                } else {
                    float fM7955k4 = (c1350qq2.m7955k4() + c1350qq.m7955k4()) / 2.0f;
                    c11909up = new C11909up(new C12025x6(fM7955k4, c1350qq.m7963x1()).Clone(), new C12025x6(fM7955k4, c1350qq2.m7963x1()).Clone(), m16662k4(c1350qq).Clone().Clone(), m16662k4(c1350qq2).Clone().Clone());
                }
                abstractC12008jd.mo17594x1(c11909up, c12014neClone.Clone());
            }
        } else if (c5059vj.m21549to() == 2) {
            for (C1342h4 c1342h4 : c5037rsM21541h4.m21423kk()) {
                C1350qq c1350qq3 = c5037rsM21541h4.m21422k4()[(int) c1342h4.m7893k4()];
                C1350qq c1350qq4 = c5037rsM21541h4.m21422k4()[(int) c1342h4.m7898x1()];
                C1350qq c1350qq5 = c5037rsM21541h4.m21422k4()[(int) c1342h4.m7896kk()];
                C12025x6[] c12025x6Arr = {new C12025x6(c1350qq3.m7955k4(), c1350qq3.m7963x1()), new C12025x6(c1350qq4.m7955k4(), c1350qq4.m7963x1()), new C12025x6(c1350qq5.m7955k4(), c1350qq5.m7963x1())};
                C12003du[] c12003duArr = {m16662k4(c1350qq3), m16662k4(c1350qq4), m16662k4(c1350qq5)};
                C11896dy c11896dy = new C11896dy();
                c11896dy.m55570to(c12025x6Arr);
                if (!c11896dy.m55523c5().m56568kk()) {
                    if (c12003duArr[0].equals(c12003duArr[1].Clone()) && c12003duArr[0].equals(c12003duArr[2].Clone())) {
                        c11999ar = new C11999ar(c12003duArr[0].Clone());
                    } else {
                        C11906rv c11906rv = new C11906rv(c11896dy);
                        c11906rv.m55692k4(c12003duArr[0].Clone());
                        c11906rv.m55693k4(c12025x6Arr[0].Clone());
                        c11906rv.m55694k4(c12003duArr);
                        c11999ar = c11906rv;
                    }
                    abstractC12008jd.mo17527k4(c11999ar, c11896dy);
                }
            }
        }
        abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
    }
}
