package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class sgr extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f30113k4 = C14047bz.f47172k4.Clone();

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f30114m9 = new C7017h4("appName", "lastEdited", "lowestEdited", "rupBuild", "codeName");

    /* JADX INFO: renamed from: du */
    private String f30115du;

    /* JADX INFO: renamed from: h4 */
    private C14047bz f30116h4 = new C14047bz();

    /* JADX INFO: renamed from: kk */
    private String f30117kk;

    /* JADX INFO: renamed from: to */
    private String f30118to;

    /* JADX INFO: renamed from: x1 */
    private String f30119x1;

    public sgr() {
        m41016x1();
    }

    public sgr(AbstractC13912i5 abstractC13912i5) {
        m41016x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sgr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = sgr.f30114m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    sgr.this.f30119x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    sgr.this.f30117kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    sgr.this.f30118to = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    sgr.this.f30115du = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                sgr.this.f30116h4 = new C14047bz(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41016x1() {
        f30113k4.CloneTo(this.f30116h4);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30119x1;
        if (str3 != null) {
            c3059ii.m12955x1("appName", str3);
        }
        String str4 = this.f30117kk;
        if (str4 != null) {
            c3059ii.m12955x1("lastEdited", str4);
        }
        String str5 = this.f30118to;
        if (str5 != null) {
            c3059ii.m12955x1("lowestEdited", str5);
        }
        String str6 = this.f30115du;
        if (str6 != null) {
            c3059ii.m12955x1("rupBuild", str6);
        }
        if (C14047bz.m66537x1(this.f30116h4, f30113k4)) {
            c3059ii.m12955x1("codeName", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f30116h4), "}"));
        }
        c3059ii.mo21898jd();
    }
}
