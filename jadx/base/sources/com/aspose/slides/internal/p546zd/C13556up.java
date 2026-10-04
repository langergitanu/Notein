package com.aspose.slides.internal.p546zd;

import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p260ly.C6270du;
import com.aspose.slides.internal.p260ly.C6273h4;
import com.aspose.slides.internal.p260ly.C6281qq;
import com.aspose.slides.internal.p290n3.AbstractC6713fa;
import com.aspose.slides.internal.p349q3.C9699rs;
import com.aspose.slides.internal.p349q3.C9721vj;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.zd.up */
/* JADX INFO: loaded from: classes5.dex */
public class C13556up extends AbstractC6713fa {
    public C13556up(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du m62700k4(C6281qq c6281qq) {
        int iM25605kk = c6281qq.m25605kk() & 65535;
        int iM25608to = c6281qq.m25608to() & 65535;
        int iM25600h4 = 65535 & c6281qq.m25600h4();
        c6281qq.m25607m9();
        if (iM25605kk > 255) {
            iM25605kk >>= 8;
        }
        if (iM25608to > 255) {
            iM25608to >>= 8;
        }
        if (iM25600h4 > 255) {
            iM25600h4 >>= 8;
        }
        return C12003du.m56398k4(255, iM25605kk, iM25608to, iM25600h4);
    }

    @Override // com.aspose.slides.internal.p290n3.AbstractC6713fa
    /* JADX INFO: renamed from: k4 */
    public void mo7782k4(C9721vj c9721vj, C3585h4 c3585h4) {
        C11909up c11909up;
        AbstractC12024x1 c11999ar;
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c3585h4.m14502k4();
        C9699rs c9699rsM47747h4 = c9721vj.m47747h4();
        if (c9721vj.m47755to() == 0 || c9721vj.m47755to() == 1) {
            for (C6270du c6270du : c9721vj.m47747h4().m47622x1()) {
                C6281qq c6281qq = c9699rsM47747h4.m47619k4()[(int) c6270du.m25488k4()];
                C6281qq c6281qq2 = c9699rsM47747h4.m47619k4()[(int) c6270du.m25491x1()];
                C12014ne c12014neClone = C12014ne.m56654k4(c6281qq.m25602k4(), c6281qq.m25610x1(), c6281qq2.m25602k4(), c6281qq2.m25610x1()).Clone();
                if (c9721vj.m47755to() == 0) {
                    float fM25610x1 = (c6281qq2.m25610x1() + c6281qq.m25610x1()) / 2.0f;
                    c11909up = new C11909up(new C12025x6(c6281qq.m25602k4(), fM25610x1).Clone(), new C12025x6(c6281qq2.m25602k4(), fM25610x1).Clone(), m62700k4(c6281qq).Clone().Clone(), m62700k4(c6281qq2).Clone().Clone());
                } else {
                    float fM25602k4 = (c6281qq2.m25602k4() + c6281qq.m25602k4()) / 2.0f;
                    c11909up = new C11909up(new C12025x6(fM25602k4, c6281qq.m25610x1()).Clone(), new C12025x6(fM25602k4, c6281qq2.m25610x1()).Clone(), m62700k4(c6281qq).Clone().Clone(), m62700k4(c6281qq2).Clone().Clone());
                }
                abstractC12008jd.mo17594x1(c11909up, c12014neClone.Clone());
            }
            return;
        }
        if (c9721vj.m47755to() == 2) {
            for (C6273h4 c6273h4 : c9699rsM47747h4.m47620kk()) {
                C6281qq c6281qq3 = c9699rsM47747h4.m47619k4()[(int) c6273h4.m25507k4()];
                C6281qq c6281qq4 = c9699rsM47747h4.m47619k4()[(int) c6273h4.m25512x1()];
                C6281qq c6281qq5 = c9699rsM47747h4.m47619k4()[(int) c6273h4.m25510kk()];
                C12025x6[] c12025x6Arr = {new C12025x6(c6281qq3.m25602k4(), c6281qq3.m25610x1()), new C12025x6(c6281qq4.m25602k4(), c6281qq4.m25610x1()), new C12025x6(c6281qq5.m25602k4(), c6281qq5.m25610x1())};
                C12003du[] c12003duArr = {m62700k4(c6281qq3), m62700k4(c6281qq4), m62700k4(c6281qq5)};
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
    }
}
