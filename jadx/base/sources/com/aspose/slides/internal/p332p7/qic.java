package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class qic extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private hec f28886c5;

    /* JADX INFO: renamed from: du */
    private boolean f28887du;

    /* JADX INFO: renamed from: dy */
    private scz f28888dy;

    /* JADX INFO: renamed from: h4 */
    private int f28889h4;

    /* JADX INFO: renamed from: jd */
    private C7394ca f28890jd;

    /* JADX INFO: renamed from: kk */
    private String f28891kk;

    /* JADX INFO: renamed from: m9 */
    private a5o f28892m9;

    /* JADX INFO: renamed from: to */
    private String f28893to;

    /* JADX INFO: renamed from: x1 */
    private String f28894x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28885k4 = lrb.m36398k4("unsorted");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f28884ck = new C7017h4("table:name", "table:condition", "table:base-cell-address", "table:allow-empty-cell", "table:display-list", "help-message", "error-message", "error-macro", "event-listeners");

    public qic() {
        m39518x1();
        this.f28888dy = new scz();
    }

    public qic(final AbstractC13912i5 abstractC13912i5) {
        m39518x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qic.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qic.f28884ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    qic.this.f28894x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    qic.this.f28891kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    qic.this.f28893to = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    qic.this.f28887du = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                qic.this.f28889h4 = lrb.m36398k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qic.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = qic.f28884ck.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    qic.this.f28892m9 = new a5o(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    qic.this.f28890jd = new C7394ca("error-message", new eck(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 == 7) {
                    qic.this.f28888dy = new scz(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 8) {
                    return false;
                }
                qic.this.f28886c5 = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39518x1() {
        this.f28887du = true;
        this.f28889h4 = f28885k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f28894x1);
        String str3 = this.f28891kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:condition", str3);
        }
        String str4 = this.f28893to;
        if (str4 != null) {
            c3059ii.m12955x1("table:base-cell-address", str4);
        }
        boolean z = this.f28887du;
        if (!z) {
            c3059ii.m12955x1("table:allow-empty-cell", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f28889h4;
        if (i != f28885k4) {
            c3059ii.m12955x1("table:display-list", lrb.m36399k4(i));
        }
        a5o a5oVar = this.f28892m9;
        if (a5oVar != null) {
            a5oVar.mo6846k4("table", c3059ii, "help-message");
        }
        C7394ca c7394ca = this.f28890jd;
        if (c7394ca != null && f28884ck.m27428k4(c7394ca.m29539k4()) == 6) {
            ((eck) this.f28890jd.m29541kk()).mo6846k4("table", c3059ii, this.f28890jd.m29539k4());
        }
        this.f28888dy.mo6846k4("table", c3059ii, "error-macro");
        hec hecVar = this.f28886c5;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
