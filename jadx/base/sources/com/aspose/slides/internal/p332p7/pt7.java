package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class pt7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28576du = new C7017h4("text:name", "text:display", "style:data-style-name");

    /* JADX INFO: renamed from: k4 */
    private String f28577k4;

    /* JADX INFO: renamed from: kk */
    private String f28578kk;

    /* JADX INFO: renamed from: to */
    private String f28579to;

    /* JADX INFO: renamed from: x1 */
    private int f28580x1;

    public pt7() {
        m39130x1();
    }

    public pt7(AbstractC13912i5 abstractC13912i5) {
        m39130x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pt7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = pt7.f28576du.m27428k4(str);
                if (iM27428k4 == 0) {
                    pt7.this.f28577k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    pt7.this.f28580x1 = drp.m30556k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                pt7.this.f28578kk = str2;
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f28576du)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f28579to = C14113y2.m67400k4(this.f28579to, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m39130x1() {
        this.f28580x1 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:name", this.f28577k4);
        int i = this.f28580x1;
        if (i != 0) {
            c3059ii.m12955x1("text:display", drp.m30557k4(i));
        }
        String str3 = this.f28578kk;
        if (str3 != null) {
            c3059ii.m12955x1("style:data-style-name", str3);
        }
        String str4 = this.f28579to;
        if (str4 != null) {
            c3059ii.mo21918x1(str4);
        }
        c3059ii.mo21898jd();
    }
}
