package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9643em;
import com.aspose.slides.internal.p349q3.C9687os;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9724w6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.gi */
/* JADX INFO: loaded from: classes3.dex */
public class C2469gi extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        try {
            if (c9723vw.m47766lr() >= 88) {
                long jM47766lr = ((long) c9723vw.m47766lr()) & 4294967295L;
                C9724w6 c9724w6 = (C9724w6) c9723vw;
                c3149x1.m13455x1(c9724w6.m47769k4().m25449to().m57844k4());
                c3149x1.m13455x1(c9724w6.m47769k4().m25449to().m57852x1());
                c3149x1.m13455x1(c9724w6.m47769k4().m25449to().m57847kk());
                c3149x1.m13455x1(c9724w6.m47769k4().m25449to().m57850to());
                c3149x1.m13455x1(c9724w6.m47769k4().m25435h4().m57844k4());
                c3149x1.m13455x1(c9724w6.m47769k4().m25435h4().m57852x1());
                c3149x1.m13455x1(c9724w6.m47769k4().m25435h4().m57847kk());
                c3149x1.m13455x1(c9724w6.m47769k4().m25435h4().m57850to());
                c3149x1.m13455x1(c9724w6.m47769k4().m25445m9());
                c3149x1.m13447k4(c9724w6.m47769k4().m25432dy() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25428c5() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25438jd() & 4294967295L);
                c3149x1.m13446k4(c9724w6.m47769k4().m25430ck() & 65535);
                c3149x1.m13446k4(c9724w6.m47769k4().m25434fa() & 65535);
                c3149x1.m13447k4(c9724w6.m47769k4().m25451up() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25456yj() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25444ks() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25448rv().m57816k4() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25448rv().m57820x1() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25455x6().m57816k4() & 4294967295L);
                c3149x1.m13447k4(c9724w6.m47769k4().m25455x6().m57820x1() & 4294967295L);
                if ((c9724w6.m47769k4().m25456yj() & 4294967295L) >= 88 && (((c9724w6.m47769k4().m25456yj() & 4294967295L) + (((c9724w6.m47769k4().m25451up() & 4294967295L) * 2) & 4294967295L)) & 4294967295L) <= c9723vw.m47766lr()) {
                    jM47766lr = c9724w6.m47769k4().m25456yj();
                }
                long j = jM47766lr & 4294967295L;
                if (j >= 100) {
                    C9687os c9687os = (C9687os) c9724w6;
                    c3149x1.m13447k4(c9687os.m47554h4().m25592k4() & 4294967295L);
                    c3149x1.m13447k4(c9687os.m47554h4().m25597x1() & 4294967295L);
                    c3149x1.m13447k4(c9687os.m47554h4().m25595kk() & 4294967295L);
                    if (j >= 108) {
                        C9643em c9643em = (C9643em) c9687os;
                        c3149x1.m13447k4(c9643em.m47175dy().m25493k4() & 4294967295L);
                        c3149x1.m13447k4(c9643em.m47175dy().m25496x1() & 4294967295L);
                    }
                }
                if ((c9724w6.m47769k4().m25456yj() & 4294967295L) > 0 && !C14113y2.m67411k4(c9724w6.m47775to())) {
                    c3149x1.m13441k4((int) ((c9724w6.m47769k4().m25456yj() & 4294967295L) + position), 0);
                    c3149x1.m13450k4(AbstractC6747ar.m26650yj().mo26677to(c9724w6.m47775to()));
                }
                int iM47766lr = (int) ((position + ((long) c9723vw.m47766lr())) - c3149x1.m13442k4().getPosition());
                if (iM47766lr > 0) {
                    c3149x1.m13441k4(iM47766lr, 1);
                    return true;
                }
                if (iM47766lr < 0) {
                    throw new C6490k4("Writeed more bytes than the record size.");
                }
            }
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
