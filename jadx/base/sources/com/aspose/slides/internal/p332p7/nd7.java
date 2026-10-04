package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class nd7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f27255ck = new C7017h4("svg:viewBox", "svg:d", "draw:z-index", "draw:id", "draw:layer", "draw:style-name", "draw:class-names", "presentation:style-name", "presentation:class-names", "dr3d:transform");

    /* JADX INFO: renamed from: c5 */
    private String f27256c5;

    /* JADX INFO: renamed from: du */
    private String f27257du;

    /* JADX INFO: renamed from: dy */
    private String f27258dy;

    /* JADX INFO: renamed from: h4 */
    private String f27259h4;

    /* JADX INFO: renamed from: jd */
    private String f27260jd;

    /* JADX INFO: renamed from: k4 */
    private String f27261k4;

    /* JADX INFO: renamed from: kk */
    private long f27262kk;

    /* JADX INFO: renamed from: m9 */
    private String f27263m9;

    /* JADX INFO: renamed from: to */
    private String f27264to;

    /* JADX INFO: renamed from: x1 */
    private String f27265x1;

    public nd7() {
        m37447x1();
    }

    public nd7(AbstractC13912i5 abstractC13912i5) {
        m37447x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nd7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (nd7.f27255ck.m27428k4(str)) {
                    case 0:
                        nd7.this.f27261k4 = str2;
                        break;
                    case 1:
                        nd7.this.f27265x1 = str2;
                        break;
                    case 2:
                        nd7.this.f27262kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        nd7.this.f27264to = str2;
                        break;
                    case 4:
                        nd7.this.f27257du = str2;
                        break;
                    case 5:
                        nd7.this.f27259h4 = str2;
                        break;
                    case 6:
                        nd7.this.f27263m9 = str2;
                        break;
                    case 7:
                        nd7.this.f27258dy = str2;
                        break;
                    case 8:
                        nd7.this.f27256c5 = str2;
                        break;
                    case 9:
                        nd7.this.f27260jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m37447x1() {
        this.f27262kk = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("svg:viewBox", this.f27261k4);
        c3059ii.m12955x1("svg:d", this.f27265x1);
        long j = this.f27262kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("draw:z-index", C13850af.m65147x1(j));
        }
        String str3 = this.f27264to;
        if (str3 != null) {
            c3059ii.m12955x1("draw:id", str3);
        }
        String str4 = this.f27257du;
        if (str4 != null) {
            c3059ii.m12955x1("draw:layer", str4);
        }
        String str5 = this.f27259h4;
        if (str5 != null) {
            c3059ii.m12955x1("draw:style-name", str5);
        }
        String str6 = this.f27263m9;
        if (str6 != null) {
            c3059ii.m12955x1("draw:class-names", str6);
        }
        String str7 = this.f27258dy;
        if (str7 != null) {
            c3059ii.m12955x1("presentation:style-name", str7);
        }
        String str8 = this.f27256c5;
        if (str8 != null) {
            c3059ii.m12955x1("presentation:class-names", str8);
        }
        String str9 = this.f27260jd;
        if (str9 != null) {
            c3059ii.m12955x1("dr3d:transform", str9);
        }
        c3059ii.mo21898jd();
    }
}
