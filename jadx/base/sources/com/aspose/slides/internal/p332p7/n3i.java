package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class n3i extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f27091m9 = new C7017h4("id", "divId", "sourceObject", "destinationFile", NoteMeta.PROPERTY_TITLE, "autoRepublish");

    /* JADX INFO: renamed from: du */
    private String f27092du;

    /* JADX INFO: renamed from: h4 */
    private boolean f27093h4;

    /* JADX INFO: renamed from: k4 */
    private long f27094k4;

    /* JADX INFO: renamed from: kk */
    private String f27095kk;

    /* JADX INFO: renamed from: to */
    private String f27096to;

    /* JADX INFO: renamed from: x1 */
    private String f27097x1;

    public n3i() {
        m37221x1();
    }

    public n3i(AbstractC13912i5 abstractC13912i5) {
        m37221x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.n3i.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = n3i.f27091m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    n3i.this.f27094k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    n3i.this.f27097x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    n3i.this.f27095kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    n3i.this.f27096to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    n3i.this.f27092du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                n3i.this.f27093h4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m37221x1() {
        this.f27093h4 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f27094k4));
        c3059ii.m12955x1("divId", this.f27097x1);
        String str3 = this.f27095kk;
        if (str3 != null) {
            c3059ii.m12955x1("sourceObject", str3);
        }
        c3059ii.m12955x1("destinationFile", this.f27096to);
        String str4 = this.f27092du;
        if (str4 != null) {
            c3059ii.m12955x1(NoteMeta.PROPERTY_TITLE, str4);
        }
        boolean z = this.f27093h4;
        if (z) {
            c3059ii.m12955x1("autoRepublish", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
