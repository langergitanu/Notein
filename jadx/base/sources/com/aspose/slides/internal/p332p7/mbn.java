package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class mbn extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f26735m9 = new C7017h4("text:name", "text:description", "office:value-type", "text:display", "style:data-style-name");

    /* JADX INFO: renamed from: du */
    private String f26736du;

    /* JADX INFO: renamed from: h4 */
    private String f26737h4;

    /* JADX INFO: renamed from: k4 */
    private String f26738k4;

    /* JADX INFO: renamed from: kk */
    private String f26739kk;

    /* JADX INFO: renamed from: to */
    private int f26740to;

    /* JADX INFO: renamed from: x1 */
    private String f26741x1;

    public mbn() {
        m36782x1();
    }

    public mbn(AbstractC13912i5 abstractC13912i5) {
        m36782x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mbn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = mbn.f26735m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    mbn.this.f26738k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    mbn.this.f26741x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    mbn.this.f26739kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    mbn.this.f26740to = b3h.m28703k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                mbn.this.f26736du = str2;
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f26735m9)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f26737h4 = C14113y2.m67400k4(this.f26737h4, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m36782x1() {
        this.f26740to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:name", this.f26738k4);
        String str3 = this.f26741x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:description", str3);
        }
        c3059ii.m12955x1("office:value-type", this.f26739kk);
        int i = this.f26740to;
        if (i != 0) {
            c3059ii.m12955x1("text:display", b3h.m28704k4(i));
        }
        String str4 = this.f26736du;
        if (str4 != null) {
            c3059ii.m12955x1("style:data-style-name", str4);
        }
        String str5 = this.f26737h4;
        if (str5 != null) {
            c3059ii.mo21918x1(str5);
        }
        c3059ii.mo21898jd();
    }
}
