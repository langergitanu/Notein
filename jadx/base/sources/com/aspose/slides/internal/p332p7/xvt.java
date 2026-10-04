package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class xvt extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f33084fa = new C7017h4("table:name", "text:style-name", "first-row", "last-row", "first-column", "last-column", "body", "even-rows", "odd-rows", "even-columns", "odd-columns");

    /* JADX INFO: renamed from: c5 */
    private e0e f33085c5;

    /* JADX INFO: renamed from: ck */
    private C7394ca f33086ck;

    /* JADX INFO: renamed from: du */
    private qxi f33087du;

    /* JADX INFO: renamed from: dy */
    private qwr f33088dy;

    /* JADX INFO: renamed from: h4 */
    private jmg f33089h4;

    /* JADX INFO: renamed from: jd */
    private htx f33090jd;

    /* JADX INFO: renamed from: k4 */
    private String f33091k4;

    /* JADX INFO: renamed from: kk */
    private wb5 f33092kk;

    /* JADX INFO: renamed from: m9 */
    private mjh f33093m9;

    /* JADX INFO: renamed from: to */
    private afo f33094to;

    /* JADX INFO: renamed from: x1 */
    private String f33095x1;

    public xvt() {
        this.f33093m9 = new mjh();
        this.f33088dy = new qwr();
        this.f33085c5 = new e0e();
        this.f33090jd = new htx();
    }

    /* JADX INFO: renamed from: c5 */
    public final e0e m44680c5() {
        return this.f33085c5;
    }

    /* JADX INFO: renamed from: ck */
    public final C7394ca m44681ck() {
        return this.f33086ck;
    }

    /* JADX INFO: renamed from: du */
    public final qxi m44682du() {
        return this.f33087du;
    }

    /* JADX INFO: renamed from: dy */
    public final qwr m44683dy() {
        return this.f33088dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final jmg m44684h4() {
        return this.f33089h4;
    }

    /* JADX INFO: renamed from: jd */
    public final htx m44685jd() {
        return this.f33090jd;
    }

    /* JADX INFO: renamed from: kk */
    public final wb5 m44687kk() {
        return this.f33092kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final mjh m44688m9() {
        return this.f33093m9;
    }

    /* JADX INFO: renamed from: to */
    public final afo m44689to() {
        return this.f33094to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m44690x1() {
        return this.f33095x1;
    }

    public xvt(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xvt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xvt.f33084fa.m27428k4(str);
                if (iM27428k4 == 0) {
                    xvt.this.f33091k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                xvt.this.f33095x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xvt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (xvt.f33084fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        xvt.this.f33092kk = new wb5(abstractC13912i5);
                        return true;
                    case 3:
                        xvt.this.f33094to = new afo(abstractC13912i5);
                        return true;
                    case 4:
                        xvt.this.f33087du = new qxi(abstractC13912i5);
                        return true;
                    case 5:
                        xvt.this.f33089h4 = new jmg(abstractC13912i5);
                        return true;
                    case 6:
                        xvt.this.f33086ck = new C7394ca("body", new pvz(abstractC13912i5));
                        return true;
                    case 7:
                        xvt.this.f33093m9 = new mjh(abstractC13912i5);
                        return true;
                    case 8:
                        xvt.this.f33088dy = new qwr(abstractC13912i5);
                        return true;
                    case 9:
                        xvt.this.f33085c5 = new e0e(abstractC13912i5);
                        return true;
                    case 10:
                        xvt.this.f33090jd = new htx(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m44686k4() {
        return this.f33091k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f33091k4);
        String str3 = this.f33095x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        wb5 wb5Var = this.f33092kk;
        if (wb5Var != null) {
            wb5Var.mo6846k4("table", c3059ii, "first-row");
        }
        afo afoVar = this.f33094to;
        if (afoVar != null) {
            afoVar.mo6846k4("table", c3059ii, "last-row");
        }
        qxi qxiVar = this.f33087du;
        if (qxiVar != null) {
            qxiVar.mo6846k4("table", c3059ii, "first-column");
        }
        jmg jmgVar = this.f33089h4;
        if (jmgVar != null) {
            jmgVar.mo6846k4("table", c3059ii, "last-column");
        }
        C7394ca c7394ca = this.f33086ck;
        if (c7394ca != null && f33084fa.m27428k4(c7394ca.m29539k4()) == 6) {
            ((pvz) this.f33086ck.m29541kk()).mo6846k4("table", c3059ii, this.f33086ck.m29539k4());
        }
        this.f33093m9.mo6846k4("table", c3059ii, "even-rows");
        this.f33088dy.mo6846k4("table", c3059ii, "odd-rows");
        this.f33085c5.mo6846k4("table", c3059ii, "even-columns");
        this.f33090jd.mo6846k4("table", c3059ii, "odd-columns");
        c3059ii.mo21898jd();
    }
}
