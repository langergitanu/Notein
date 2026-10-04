package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class q4n extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28743kk = new C7017h4("xml_Space");

    /* JADX INFO: renamed from: k4 */
    private int f28744k4;

    /* JADX INFO: renamed from: x1 */
    private String f28745x1;

    public q4n() {
        m39329x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m39329x1() {
        this.f28744k4 = 0;
    }

    public q4n(AbstractC13912i5 abstractC13912i5) {
        m39329x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q4n.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (q4n.f28743kk.m27428k4(str) != 0) {
                    return false;
                }
                q4n.this.f28744k4 = C7813h0.m33007k4(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f28745x1 = abstractC13912i5.mo65042rv();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f28744k4;
        if (i != 0) {
            c3059ii.m12955x1("xml:space", C7813h0.m33008k4(i));
        }
        c3059ii.mo21918x1(this.f28745x1);
        c3059ii.mo21898jd();
    }
}
