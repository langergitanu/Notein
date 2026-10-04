package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11198kk extends AbstractC11200ks {

    /* JADX INFO: renamed from: k4 */
    private C13890ei f38593k4;

    /* JADX INFO: renamed from: x1 */
    private C11207os f38594x1;

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk == 0) {
            c11234xw.m54180k4(c11231x1.m54090h4(), this.f38593k4, this.f38594x1);
            c11231x1.m54094k4(2);
        } else {
            if (iM54107kk != 2) {
                return;
            }
            c11231x1.m54091jd();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m53840x1(C11212rv c11212rv) {
        m53850du(c11212rv);
        if (!c11212rv.m53970up()) {
            throw XsltException.create("The 'Xsl:apply-imports' instruction cannot be included within the content of an 'Xsl:for-each' instruction or within an 'Xsl:template' instruction without the 'match' attribute.", new String[0]);
        }
        this.f38593k4 = c11212rv.m53903ar();
        this.f38594x1 = c11212rv.m53915dy();
    }
}
