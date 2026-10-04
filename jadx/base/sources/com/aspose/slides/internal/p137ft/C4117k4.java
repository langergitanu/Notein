package com.aspose.slides.internal.p137ft;

import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5062w6;
import com.aspose.slides.internal.p227kg.C5673k4;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.internal.p442uj.C11356gi;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import com.aspose.slides.internal.p509xs.C12604x1;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.ft.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4117k4 extends AbstractC4119x1 {
    public C4117k4(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3024x1 m16479k4() {
        C9966k4 c9966k4 = new C9966k4();
        c9966k4.m12729k4().clear();
        c9966k4.m49085k4(new C5673k4());
        C5061vw c5061vw = new C5061vw(c9966k4);
        C11356gi c11356gi = new C11356gi();
        AbstractC12603k4.m58818k4(c5061vw, m16483kk());
        C5061vw[] c5061vwArr = {c5061vw};
        c11356gi.mo54490k4(c5061vwArr, m16483kk());
        C5061vw c5061vw2 = c5061vwArr[0];
        C5062w6 c5062w6 = (C5062w6) c5061vw2;
        if (c5062w6.m21562k4().m7833jd()) {
            c9966k4.m12729k4().addItem(c5061vw2);
            c9966k4.m49084k4(c5062w6);
            long jM7837kk = (c9966k4.m49083jd().m21562k4().m7837kk() & 4294967295L) - 1;
            for (int i = 0; i < (jM7837kk & 4294967295L); i++) {
                C5061vw c5061vw3 = new C5061vw(c9966k4);
                long position = m16483kk().getPosition();
                if (AbstractC12603k4.m58818k4(c5061vw3, m16483kk())) {
                    AbstractC12603k4 abstractC12603k4M58819k4 = C12604x1.m58819k4(c5061vw3.m21561v4());
                    C5061vw[] c5061vwArr2 = {c5061vw3};
                    boolean zMo54490k4 = abstractC12603k4M58819k4.mo54490k4(c5061vwArr2, m16483kk());
                    C5061vw c5061vw4 = c5061vwArr2[0];
                    if (zMo54490k4) {
                        c9966k4.m12729k4().addItem(c5061vw4);
                    }
                    int iM21560lr = c5061vw4.m21560lr() - ((int) (m16483kk().getPosition() - position));
                    if (iM21560lr > 0) {
                        m16483kk().seek(iM21560lr, 1);
                    } else if (iM21560lr < 0) {
                        throw new C12537k4("Readed more bytes than the record size.");
                    }
                }
            }
        }
        return c9966k4;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m16480x1() {
        long position = m16483kk().getPosition();
        byte[] bArrM13372dy = new C3134k4(m16483kk()).m13372dy(64);
        m16483kk().seek(position, 0);
        return C14069jd.m66784x1(bArrM13372dy, 0) == 1 && C14069jd.m66784x1(bArrM13372dy, 40) == 1179469088;
    }
}
