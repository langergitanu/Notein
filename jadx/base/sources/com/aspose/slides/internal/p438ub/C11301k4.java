package com.aspose.slides.internal.p438ub;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p094dw.C3412gi;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9724w6;
import com.aspose.slides.internal.p352q6.C9755k4;
import com.aspose.slides.internal.p411sz.C10802k4;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.ub.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11301k4 extends AbstractC11303x1 {
    public C11301k4(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC12536x1 m54288k4() {
        C3180k4 c3180k4 = new C3180k4();
        c3180k4.m58364k4().clear();
        c3180k4.m13622k4(new C10802k4());
        C9723vw c9723vw = new C9723vw(c3180k4);
        C9755k4.m47974k4(c9723vw, m54292kk());
        C9723vw[] c9723vwArr = {c9723vw};
        C3412gi.m13970k4(c9723vwArr, m54292kk());
        C9723vw c9723vw2 = c9723vwArr[0];
        C9724w6 c9724w6 = (C9724w6) c9723vw2;
        if (c9724w6.m47769k4().m25447ne()) {
            c3180k4.m58364k4().addItem(c9723vw2);
            c3180k4.m13621k4(c9724w6);
            long jM25438jd = (c3180k4.m13619ck().m47769k4().m25438jd() & 4294967295L) - 1;
            for (int i = 0; i < (jM25438jd & 4294967295L); i++) {
                C9723vw c9723vw3 = new C9723vw(c3180k4);
                long position = m54292kk().getPosition();
                if (C9755k4.m47974k4(c9723vw3, m54292kk())) {
                    C9723vw[] c9723vwArr2 = {c9723vw3};
                    boolean zM47975k4 = C9755k4.m47975k4(c9723vwArr2, m54292kk());
                    C9723vw c9723vw4 = c9723vwArr2[0];
                    if (zM47975k4) {
                        c3180k4.m58364k4().addItem(c9723vw4);
                    }
                    int iM47766lr = c9723vw4.m47766lr() - ((int) (m54292kk().getPosition() - position));
                    if (iM47766lr > 0) {
                        m54292kk().seek(iM47766lr, 1);
                    } else if (iM47766lr < 0) {
                        throw new C6490k4("Readed more bytes than the record size.");
                    }
                }
            }
        }
        return c3180k4;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m54289x1() {
        long position = m54292kk().getPosition();
        byte[] bArrM13372dy = new C3134k4(m54292kk()).m13372dy(64);
        m54292kk().seek(position, 0);
        return C14069jd.m66784x1(bArrM13372dy, 0) == 1 && C14069jd.m66784x1(bArrM13372dy, 40) == 1179469088;
    }
}
