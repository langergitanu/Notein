package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class erz extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f22371k4 = xij.m44413k4("none");

    /* JADX INFO: renamed from: ne */
    private static final C7017h4 f22372ne = new C7017h4("id", "uniqueName", "name", "totalsRowFunction", "totalsRowLabel", "queryTableFieldId", "headerRowDxfId", "dataDxfId", "totalsRowDxfId", "headerRowCellStyle", "dataCellStyle", "totalsRowCellStyle", "calculatedColumnFormula", "totalsRowFormula", "xmlColumnPr", "extLst");

    /* JADX INFO: renamed from: c5 */
    private long f22373c5;

    /* JADX INFO: renamed from: ck */
    private String f22374ck;

    /* JADX INFO: renamed from: du */
    private int f22375du;

    /* JADX INFO: renamed from: dy */
    private long f22376dy;

    /* JADX INFO: renamed from: fa */
    private String f22377fa;

    /* JADX INFO: renamed from: h4 */
    private String f22378h4;

    /* JADX INFO: renamed from: jd */
    private long f22379jd;

    /* JADX INFO: renamed from: kk */
    private String f22380kk;

    /* JADX INFO: renamed from: ks */
    private l4h f22381ks;

    /* JADX INFO: renamed from: m9 */
    private long f22382m9;

    /* JADX INFO: renamed from: rv */
    private yk8 f22383rv;

    /* JADX INFO: renamed from: to */
    private String f22384to;

    /* JADX INFO: renamed from: up */
    private String f22385up;

    /* JADX INFO: renamed from: x1 */
    private long f22386x1;

    /* JADX INFO: renamed from: x6 */
    private g3j f22387x6;

    /* JADX INFO: renamed from: yj */
    private l4h f22388yj;

    public erz() {
        m31269x1();
    }

    public erz(final AbstractC13912i5 abstractC13912i5) {
        m31269x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.erz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (erz.f22372ne.m27428k4(str)) {
                    case 0:
                        erz.this.f22386x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        erz.this.f22380kk = str2;
                        break;
                    case 2:
                        erz.this.f22384to = str2;
                        break;
                    case 3:
                        erz.this.f22375du = xij.m44413k4(str2);
                        break;
                    case 4:
                        erz.this.f22378h4 = str2;
                        break;
                    case 5:
                        erz.this.f22382m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        erz.this.f22376dy = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        erz.this.f22373c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 8:
                        erz.this.f22379jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 9:
                        erz.this.f22374ck = str2;
                        break;
                    case 10:
                        erz.this.f22377fa = str2;
                        break;
                    case 11:
                        erz.this.f22385up = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.erz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (erz.f22372ne.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 12:
                        erz.this.f22388yj = new l4h(abstractC13912i5);
                        return true;
                    case 13:
                        erz.this.f22381ks = new l4h(abstractC13912i5);
                        return true;
                    case 14:
                        erz.this.f22383rv = new yk8(abstractC13912i5);
                        return true;
                    case 15:
                        erz.this.f22387x6 = new g3j(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m31269x1() {
        this.f22375du = f22371k4;
        this.f22382m9 = 4294967295L;
        this.f22376dy = 4294967295L;
        this.f22373c5 = 4294967295L;
        this.f22379jd = 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31270k4(long j) {
        this.f22386x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31271k4(String str) {
        this.f22384to = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f22386x1));
        String str3 = this.f22380kk;
        if (str3 != null) {
            c3059ii.m12955x1("uniqueName", str3);
        }
        c3059ii.m12955x1("name", this.f22384to);
        int i = this.f22375du;
        if (i != f22371k4) {
            c3059ii.m12955x1("totalsRowFunction", xij.m44414k4(i));
        }
        String str4 = this.f22378h4;
        if (str4 != null) {
            c3059ii.m12955x1("totalsRowLabel", str4);
        }
        long j = this.f22382m9;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("queryTableFieldId", C13850af.m65147x1(j));
        }
        long j2 = this.f22376dy;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("headerRowDxfId", C13850af.m65147x1(j2));
        }
        long j3 = this.f22373c5;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("dataDxfId", C13850af.m65147x1(j3));
        }
        long j4 = this.f22379jd;
        if ((j4 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("totalsRowDxfId", C13850af.m65147x1(j4));
        }
        String str5 = this.f22374ck;
        if (str5 != null) {
            c3059ii.m12955x1("headerRowCellStyle", str5);
        }
        String str6 = this.f22377fa;
        if (str6 != null) {
            c3059ii.m12955x1("dataCellStyle", str6);
        }
        String str7 = this.f22385up;
        if (str7 != null) {
            c3059ii.m12955x1("totalsRowCellStyle", str7);
        }
        l4h l4hVar = this.f22388yj;
        if (l4hVar != null) {
            l4hVar.mo6846k4("ssml", c3059ii, "calculatedColumnFormula");
        }
        l4h l4hVar2 = this.f22381ks;
        if (l4hVar2 != null) {
            l4hVar2.mo6846k4("ssml", c3059ii, "totalsRowFormula");
        }
        yk8 yk8Var = this.f22383rv;
        if (yk8Var != null) {
            yk8Var.mo6846k4("ssml", c3059ii, "xmlColumnPr");
        }
        g3j g3jVar = this.f22387x6;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
