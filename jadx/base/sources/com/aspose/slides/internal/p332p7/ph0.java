package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class ph0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f28410c5 = new C7017h4("id", "divId", "sourceType", "sourceRef", "sourceObject", "destinationFile", NoteMeta.PROPERTY_TITLE, "autoRepublish");

    /* JADX INFO: renamed from: du */
    private String f28411du;

    /* JADX INFO: renamed from: dy */
    private boolean f28412dy;

    /* JADX INFO: renamed from: h4 */
    private String f28413h4;

    /* JADX INFO: renamed from: k4 */
    private long f28414k4;

    /* JADX INFO: renamed from: kk */
    private int f28415kk;

    /* JADX INFO: renamed from: m9 */
    private String f28416m9;

    /* JADX INFO: renamed from: to */
    private String f28417to;

    /* JADX INFO: renamed from: x1 */
    private String f28418x1;

    public ph0() {
        m38912x1();
    }

    public ph0(AbstractC13912i5 abstractC13912i5) {
        m38912x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ph0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ph0.f28410c5.m27428k4(str)) {
                    case 0:
                        ph0.this.f28414k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        ph0.this.f28418x1 = str2;
                        break;
                    case 2:
                        ph0.this.f28415kk = zt8.m45949k4(str2);
                        break;
                    case 3:
                        ph0.this.f28417to = str2;
                        break;
                    case 4:
                        ph0.this.f28411du = str2;
                        break;
                    case 5:
                        ph0.this.f28413h4 = str2;
                        break;
                    case 6:
                        ph0.this.f28416m9 = str2;
                        break;
                    case 7:
                        ph0.this.f28412dy = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38912x1() {
        this.f28415kk = 0;
        this.f28412dy = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f28414k4));
        c3059ii.m12955x1("divId", this.f28418x1);
        c3059ii.m12955x1("sourceType", zt8.m45950k4(this.f28415kk));
        String str3 = this.f28417to;
        if (str3 != null) {
            c3059ii.m12955x1("sourceRef", str3);
        }
        String str4 = this.f28411du;
        if (str4 != null) {
            c3059ii.m12955x1("sourceObject", str4);
        }
        c3059ii.m12955x1("destinationFile", this.f28413h4);
        String str5 = this.f28416m9;
        if (str5 != null) {
            c3059ii.m12955x1(NoteMeta.PROPERTY_TITLE, str5);
        }
        boolean z = this.f28412dy;
        if (z) {
            c3059ii.m12955x1("autoRepublish", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
