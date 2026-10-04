package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class kfh extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f25631up = new C7017h4("chart:class", "svg:width", "svg:height", "chart:column-mapping", "chart:row-mapping", "chart:style-name", NoteMeta.PROPERTY_TITLE, "subtitle", "footer", "legend", "plot-area", "table");

    /* JADX INFO: renamed from: c5 */
    private p9q f25632c5;

    /* JADX INFO: renamed from: ck */
    private kpw f25633ck;

    /* JADX INFO: renamed from: du */
    private String f25634du;

    /* JADX INFO: renamed from: dy */
    private mhd f25635dy;

    /* JADX INFO: renamed from: fa */
    private n6p f25636fa;

    /* JADX INFO: renamed from: h4 */
    private String f25637h4;

    /* JADX INFO: renamed from: jd */
    private qta f25638jd;

    /* JADX INFO: renamed from: k4 */
    private String f25639k4;

    /* JADX INFO: renamed from: kk */
    private String f25640kk;

    /* JADX INFO: renamed from: m9 */
    private nci f25641m9;

    /* JADX INFO: renamed from: to */
    private String f25642to;

    /* JADX INFO: renamed from: x1 */
    private String f25643x1;

    public kfh() {
        this.f25633ck = new kpw();
    }

    /* JADX INFO: renamed from: c5 */
    public final n6p m35340c5() {
        return this.f25636fa;
    }

    /* JADX INFO: renamed from: du */
    public final nci m35341du() {
        return this.f25641m9;
    }

    /* JADX INFO: renamed from: dy */
    public final kpw m35342dy() {
        return this.f25633ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final mhd m35343h4() {
        return this.f25635dy;
    }

    /* JADX INFO: renamed from: kk */
    public final String m35345kk() {
        return this.f25640kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final qta m35346m9() {
        return this.f25638jd;
    }

    /* JADX INFO: renamed from: to */
    public final String m35347to() {
        return this.f25637h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35348x1() {
        return this.f25643x1;
    }

    public kfh(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kfh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kfh.f25631up.m27428k4(str);
                if (iM27428k4 == 0) {
                    kfh.this.f25639k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    kfh.this.f25643x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    kfh.this.f25640kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    kfh.this.f25642to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    kfh.this.f25634du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                kfh.this.f25637h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kfh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (kfh.f25631up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        kfh.this.f25641m9 = new nci(abstractC13912i5);
                        return true;
                    case 7:
                        kfh.this.f25635dy = new mhd(abstractC13912i5);
                        return true;
                    case 8:
                        kfh.this.f25632c5 = new p9q(abstractC13912i5);
                        return true;
                    case 9:
                        kfh.this.f25638jd = new qta(abstractC13912i5);
                        return true;
                    case 10:
                        kfh.this.f25633ck = new kpw(abstractC13912i5);
                        return true;
                    case 11:
                        kfh.this.f25636fa = new n6p(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35344k4() {
        return this.f25639k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25639k4;
        if (str3 != null) {
            c3059ii.m12955x1("chart:class", str3);
        }
        String str4 = this.f25643x1;
        if (str4 != null) {
            c3059ii.m12955x1("svg:width", str4);
        }
        String str5 = this.f25640kk;
        if (str5 != null) {
            c3059ii.m12955x1("svg:height", str5);
        }
        String str6 = this.f25642to;
        if (str6 != null) {
            c3059ii.m12955x1("chart:column-mapping", str6);
        }
        String str7 = this.f25634du;
        if (str7 != null) {
            c3059ii.m12955x1("chart:row-mapping", str7);
        }
        String str8 = this.f25637h4;
        if (str8 != null) {
            c3059ii.m12955x1("chart:style-name", str8);
        }
        nci nciVar = this.f25641m9;
        if (nciVar != null) {
            nciVar.mo6846k4("chart", c3059ii, NoteMeta.PROPERTY_TITLE);
        }
        mhd mhdVar = this.f25635dy;
        if (mhdVar != null) {
            mhdVar.mo6846k4("chart", c3059ii, "subtitle");
        }
        p9q p9qVar = this.f25632c5;
        if (p9qVar != null) {
            p9qVar.mo6846k4("chart", c3059ii, "footer");
        }
        qta qtaVar = this.f25638jd;
        if (qtaVar != null) {
            qtaVar.mo6846k4("chart", c3059ii, "legend");
        }
        this.f25633ck.mo6846k4("chart", c3059ii, "plot-area");
        n6p n6pVar = this.f25636fa;
        if (n6pVar != null) {
            n6pVar.mo6846k4("table", c3059ii, "table");
        }
        c3059ii.mo21898jd();
    }
}
