package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ral extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f29220ck = new C7017h4("svg:d", "svg:viewBox", "draw:id", "draw:z-index", "draw:layer", "draw:style-name", "draw:class-names", "presentation:style-name", "presentation:class-names", "dr3d:transform");

    /* JADX INFO: renamed from: c5 */
    private String f29221c5;

    /* JADX INFO: renamed from: du */
    private String f29222du;

    /* JADX INFO: renamed from: dy */
    private String f29223dy;

    /* JADX INFO: renamed from: h4 */
    private String f29224h4;

    /* JADX INFO: renamed from: jd */
    private String f29225jd;

    /* JADX INFO: renamed from: k4 */
    private String f29226k4;

    /* JADX INFO: renamed from: kk */
    private String f29227kk;

    /* JADX INFO: renamed from: m9 */
    private String f29228m9;

    /* JADX INFO: renamed from: to */
    private long f29229to;

    /* JADX INFO: renamed from: x1 */
    private String f29230x1;

    public ral() {
        m39937x1();
    }

    public ral(AbstractC13912i5 abstractC13912i5) {
        m39937x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ral.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ral.f29220ck.m27428k4(str)) {
                    case 0:
                        ral.this.f29226k4 = str2;
                        break;
                    case 1:
                        ral.this.f29230x1 = str2;
                        break;
                    case 2:
                        ral.this.f29227kk = str2;
                        break;
                    case 3:
                        ral.this.f29229to = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 4:
                        ral.this.f29222du = str2;
                        break;
                    case 5:
                        ral.this.f29224h4 = str2;
                        break;
                    case 6:
                        ral.this.f29228m9 = str2;
                        break;
                    case 7:
                        ral.this.f29223dy = str2;
                        break;
                    case 8:
                        ral.this.f29221c5 = str2;
                        break;
                    case 9:
                        ral.this.f29225jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m39937x1() {
        this.f29229to = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("svg:d", this.f29226k4);
        c3059ii.m12955x1("svg:viewBox", this.f29230x1);
        String str3 = this.f29227kk;
        if (str3 != null) {
            c3059ii.m12955x1("draw:id", str3);
        }
        long j = this.f29229to;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("draw:z-index", C13850af.m65147x1(j));
        }
        String str4 = this.f29222du;
        if (str4 != null) {
            c3059ii.m12955x1("draw:layer", str4);
        }
        String str5 = this.f29224h4;
        if (str5 != null) {
            c3059ii.m12955x1("draw:style-name", str5);
        }
        String str6 = this.f29228m9;
        if (str6 != null) {
            c3059ii.m12955x1("draw:class-names", str6);
        }
        String str7 = this.f29223dy;
        if (str7 != null) {
            c3059ii.m12955x1("presentation:style-name", str7);
        }
        String str8 = this.f29221c5;
        if (str8 != null) {
            c3059ii.m12955x1("presentation:class-names", str8);
        }
        String str9 = this.f29225jd;
        if (str9 != null) {
            c3059ii.m12955x1("dr3d:transform", str9);
        }
        c3059ii.mo21898jd();
    }
}
