package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class m4c extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26641to = new C7017h4("text:display", "text:outline-level");

    /* JADX INFO: renamed from: k4 */
    private int f26642k4;

    /* JADX INFO: renamed from: kk */
    private String f26643kk;

    /* JADX INFO: renamed from: x1 */
    private long f26644x1;

    public m4c() {
        m36576x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m36576x1() {
        this.f26642k4 = 0;
    }

    public m4c(AbstractC13912i5 abstractC13912i5) {
        m36576x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.m4c.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = m4c.f26641to.m27428k4(str);
                if (iM27428k4 == 0) {
                    m4c.this.f26642k4 = alv.m28304k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                m4c.this.f26644x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (OooO0o.OooO0OO(abstractC13912i5, f26641to)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f26643kk = C14113y2.m67400k4(this.f26643kk, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:display", alv.m28305k4(this.f26642k4));
        c3059ii.m12955x1("text:outline-level", C13850af.m65147x1(this.f26644x1));
        String str3 = this.f26643kk;
        if (str3 != null) {
            c3059ii.mo21918x1(str3);
        }
        c3059ii.mo21898jd();
    }
}
