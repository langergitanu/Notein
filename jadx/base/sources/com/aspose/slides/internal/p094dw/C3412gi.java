package com.aspose.slides.internal.p094dw;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6004jd;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9643em;
import com.aspose.slides.internal.p349q3.C9687os;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9724w6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.gi */
/* JADX INFO: loaded from: classes3.dex */
public class C3412gi {
    /* JADX INFO: renamed from: k4 */
    public static boolean m13970k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        long j;
        long j2;
        String strM26681x1;
        try {
            if (c9723vwArr[0].m47766lr() >= 88) {
                long jM47766lr = ((long) c9723vwArr[0].m47766lr()) & 4294967295L;
                long position = abstractC3150x6.getPosition() - 8;
                C9724w6 c9724w6 = new C9724w6(c9723vwArr[0]);
                C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
                c9724w6.m47769k4().m25449to().m57845k4(c3134k4.m13386x6());
                c9724w6.m47769k4().m25449to().m57853x1(c3134k4.m13386x6());
                c9724w6.m47769k4().m25449to().m57848kk(c3134k4.m13386x6());
                c9724w6.m47769k4().m25449to().m57851to(c3134k4.m13386x6());
                c9724w6.m47769k4().m25435h4().m57845k4(c3134k4.m13386x6());
                c9724w6.m47769k4().m25435h4().m57853x1(c3134k4.m13386x6());
                c9724w6.m47769k4().m25435h4().m57848kk(c3134k4.m13386x6());
                c9724w6.m47769k4().m25435h4().m57851to(c3134k4.m13386x6());
                c9724w6.m47769k4().m25439k4(c3134k4.m13386x6());
                c9724w6.m47769k4().m25450to(c3134k4.m13384uz());
                c9724w6.m47769k4().m25431du(c3134k4.m13384uz());
                c9724w6.m47769k4().m25436h4(c3134k4.m13384uz());
                c9724w6.m47769k4().m25452x1(c3134k4.m13382u4());
                c9724w6.m47769k4().m25443kk(c3134k4.m13382u4());
                c9724w6.m47769k4().m25446m9(c3134k4.m13384uz());
                c9724w6.m47769k4().m25433dy(c3134k4.m13384uz());
                c9724w6.m47769k4().m25429c5(c3134k4.m13384uz());
                c9724w6.m47769k4().m25448rv().m57817k4(c3134k4.m13384uz());
                c9724w6.m47769k4().m25448rv().m57821x1(c3134k4.m13384uz());
                c9724w6.m47769k4().m25455x6().m57817k4(c3134k4.m13384uz());
                c9724w6.m47769k4().m25455x6().m57821x1(c3134k4.m13384uz());
                if ((c9724w6.m47769k4().m25456yj() & 4294967295L) >= 88) {
                    j = 4294967295L;
                    if ((((c9724w6.m47769k4().m25456yj() & 4294967295L) + (((c9724w6.m47769k4().m25451up() & 4294967295L) * 2) & 4294967295L)) & 4294967295L) <= c9723vwArr[0].m47766lr()) {
                        jM47766lr = c9724w6.m47769k4().m25456yj();
                    }
                } else {
                    j = 4294967295L;
                }
                long j3 = jM47766lr & j;
                if (j3 >= 100) {
                    C9687os c9687os = new C9687os(c9724w6);
                    j2 = 2;
                    ((C9687os) C7019kk.m27452k4((Object) c9687os, C9687os.class)).m47554h4().m25593k4(c3134k4.m13384uz());
                    ((C9687os) C7019kk.m27452k4((Object) c9687os, C9687os.class)).m47554h4().m25598x1(c3134k4.m13384uz());
                    ((C9687os) C7019kk.m27452k4((Object) c9687os, C9687os.class)).m47554h4().m25596kk(c3134k4.m13384uz());
                    if (j3 >= 108) {
                        c9724w6 = new C9643em(c9687os);
                        ((C9643em) C7019kk.m27452k4((Object) c9724w6, C9643em.class)).m47175dy().m25494k4(c3134k4.m13384uz());
                        ((C9643em) C7019kk.m27452k4((Object) c9724w6, C9643em.class)).m47175dy().m25497x1(c3134k4.m13384uz());
                    } else {
                        c9724w6 = c9687os;
                    }
                } else {
                    j2 = 2;
                }
                if ((c9724w6.m47769k4().m25456yj() & j) > 0) {
                    abstractC3150x6.seek((c9724w6.m47769k4().m25456yj() & j) + position, 0);
                    strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c3134k4.m13372dy((int) ((c9724w6.m47769k4().m25451up() & j) * j2)));
                } else {
                    strM26681x1 = "";
                }
                c9724w6.m47771k4(strM26681x1);
                int iM47766lr = (int) ((position + ((long) c9723vwArr[0].m47766lr())) - abstractC3150x6.getPosition());
                if (iM47766lr > 0) {
                    abstractC3150x6.seek(iM47766lr, 1);
                } else if (iM47766lr < 0) {
                    throw new C6490k4("Readed more bytes than the record size.");
                }
                c9723vwArr[0] = c9724w6;
            }
            return false;
        } catch (RuntimeException e) {
            C6004jd.m24258k4(C14113y2.m67408k4("Exception at EmfHeaderReader ", e.getMessage()));
            throw new Exception("EmfHeaderReaderException");
        }
    }
}
