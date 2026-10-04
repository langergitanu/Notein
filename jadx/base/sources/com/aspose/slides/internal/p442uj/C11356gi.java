package com.aspose.slides.internal.p442uj;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C4981em;
import com.aspose.slides.internal.p183ij.C5025os;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5062w6;
import com.aspose.slides.internal.p243l6.C6004jd;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.gi */
/* JADX INFO: loaded from: classes4.dex */
public class C11356gi extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long j;
        String strM26681x1;
        try {
            C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
            if (c5061vwArr[0].m21560lr() < 88) {
                return false;
            }
            long jM21560lr = ((long) c5061vwArr[0].m21560lr()) & 4294967295L;
            long position = abstractC3150x6.getPosition() - 8;
            C5062w6 c5062w6 = new C5062w6(c5061vwArr[0]);
            c5062w6.m21562k4().m7834k4().m58252k4(c3134k4.m13386x6());
            c5062w6.m21562k4().m7834k4().m58260x1(c3134k4.m13386x6());
            c5062w6.m21562k4().m7834k4().m58255kk(c3134k4.m13386x6());
            c5062w6.m21562k4().m7834k4().m58258to(c3134k4.m13386x6());
            c5062w6.m21562k4().m7843x1().m58252k4(c3134k4.m13386x6());
            c5062w6.m21562k4().m7843x1().m58260x1(c3134k4.m13386x6());
            c5062w6.m21562k4().m7843x1().m58255kk(c3134k4.m13386x6());
            c5062w6.m21562k4().m7843x1().m58258to(c3134k4.m13386x6());
            c5062w6.m21562k4().m7835k4(c3134k4.m13386x6());
            c5062w6.m21562k4().m7842to(c3134k4.m13384uz());
            c5062w6.m21562k4().m7828du(c3134k4.m13384uz());
            c5062w6.m21562k4().m7832h4(c3134k4.m13384uz());
            c5062w6.m21562k4().m7844x1(c3134k4.m13382u4());
            c5062w6.m21562k4().m7838kk(c3134k4.m13382u4());
            c5062w6.m21562k4().m7840m9(c3134k4.m13384uz());
            c5062w6.m21562k4().m7830dy(c3134k4.m13384uz());
            c5062w6.m21562k4().m7826c5(c3134k4.m13384uz());
            c5062w6.m21562k4().m7829dy().m58233k4(c3134k4.m13384uz());
            c5062w6.m21562k4().m7829dy().m58237x1(c3134k4.m13384uz());
            c5062w6.m21562k4().m7825c5().m58233k4(c3134k4.m13384uz());
            c5062w6.m21562k4().m7825c5().m58237x1(c3134k4.m13384uz());
            if ((c5062w6.m21562k4().m7839m9() & 4294967295L) >= 88) {
                j = 4294967295L;
                if ((((c5062w6.m21562k4().m7839m9() & 4294967295L) + (((c5062w6.m21562k4().m7831h4() & 4294967295L) * 2) & 4294967295L)) & 4294967295L) <= c5061vwArr[0].m21560lr()) {
                    jM21560lr = c5062w6.m21562k4().m7839m9();
                }
            } else {
                j = 4294967295L;
            }
            long j2 = jM21560lr & j;
            if (j2 >= 100) {
                C5025os c5025os = new C5025os(c5062w6);
                ((C5025os) C7019kk.m27452k4((Object) c5025os, C5025os.class)).m21365h4().m7948k4(c3134k4.m13384uz());
                ((C5025os) C7019kk.m27452k4((Object) c5025os, C5025os.class)).m21365h4().m7951x1(c3134k4.m13384uz());
                ((C5025os) C7019kk.m27452k4((Object) c5025os, C5025os.class)).m21365h4().m7950kk(c3134k4.m13384uz());
                if (j2 >= 108) {
                    c5062w6 = new C4981em(c5025os);
                    ((C4981em) C7019kk.m27452k4((Object) c5062w6, C4981em.class)).m21000dy().m7881k4(c3134k4.m13384uz());
                    ((C4981em) C7019kk.m27452k4((Object) c5062w6, C4981em.class)).m21000dy().m7883x1(c3134k4.m13384uz());
                } else {
                    c5062w6 = c5025os;
                }
            }
            if ((c5062w6.m21562k4().m7839m9() & j) > 0) {
                abstractC3150x6.seek((c5062w6.m21562k4().m7839m9() & j) + position, 0);
                strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c3134k4.m13372dy((int) ((c5062w6.m21562k4().m7831h4() & j) * 2)));
            } else {
                strM26681x1 = "";
            }
            c5062w6.m21564k4(strM26681x1);
            int iM21560lr = (int) ((position + ((long) c5061vwArr[0].m21560lr())) - abstractC3150x6.getPosition());
            if (iM21560lr > 0) {
                abstractC3150x6.seek(iM21560lr, 1);
            } else if (iM21560lr < 0) {
                throw new C12537k4("Readed more bytes than the record size.");
            }
            c5061vwArr[0] = c5062w6;
            return false;
        } catch (RuntimeException e) {
            C6004jd.m24258k4(C14113y2.m67408k4("Exception at EmfHeaderReader ", e.getMessage()));
            throw new Exception("EmfHeaderReaderException");
        }
    }
}
