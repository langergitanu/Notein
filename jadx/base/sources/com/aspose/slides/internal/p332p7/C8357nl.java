package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nl */
/* JADX INFO: loaded from: classes4.dex */
public class C8357nl extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f27435du = new C7017h4("size", "height", "width", "units");

    /* JADX INFO: renamed from: k4 */
    private String f27436k4;

    /* JADX INFO: renamed from: kk */
    private String f27437kk;

    /* JADX INFO: renamed from: to */
    private String f27438to;

    /* JADX INFO: renamed from: x1 */
    private String f27439x1;

    public C8357nl() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m37682k4() {
        return this.f27436k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m37684kk() {
        return this.f27437kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m37686to() {
        return this.f27438to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m37688x1() {
        return this.f27439x1;
    }

    public C8357nl(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8357nl.f27435du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8357nl.this.f27436k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8357nl.this.f27439x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8357nl.this.f27437kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8357nl.this.f27438to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37683k4(String str) {
        this.f27436k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m37685kk(String str) {
        this.f27437kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m37687to(String str) {
        this.f27438to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37689x1(String str) {
        this.f27439x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27436k4;
        if (str3 != null) {
            c3059ii.m12955x1("size", str3);
        }
        String str4 = this.f27439x1;
        if (str4 != null) {
            c3059ii.m12955x1("height", str4);
        }
        String str5 = this.f27437kk;
        if (str5 != null) {
            c3059ii.m12955x1("width", str5);
        }
        String str6 = this.f27438to;
        if (str6 != null) {
            c3059ii.m12955x1("units", str6);
        }
        c3059ii.mo21898jd();
    }
}
