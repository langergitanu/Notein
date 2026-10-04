package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class xtg extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f33060du;

    /* JADX INFO: renamed from: h4 */
    private String f33061h4;

    /* JADX INFO: renamed from: kk */
    private int f33062kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f33063m9;

    /* JADX INFO: renamed from: to */
    private String f33064to;

    /* JADX INFO: renamed from: x1 */
    private String f33065x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f33059k4 = ks2.m35660k4("into-default-style-data-style");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f33058dy = new C7017h4("office:name", "office:conversion-mode", "office:dde-application", "office:dde-topic", "office:dde-item", "office:automatic-update");

    public xtg() {
        m44638x1();
    }

    public xtg(AbstractC13912i5 abstractC13912i5) {
        m44638x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xtg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xtg.f33058dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    xtg.this.f33065x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    xtg.this.f33062kk = ks2.m35660k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    xtg.this.f33064to = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    xtg.this.f33060du = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    xtg.this.f33061h4 = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                xtg.this.f33063m9 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m44638x1() {
        this.f33062kk = f33059k4;
        this.f33063m9 = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33065x1;
        if (str3 != null) {
            c3059ii.m12955x1("office:name", str3);
        }
        int i = this.f33062kk;
        if (i != f33059k4) {
            c3059ii.m12955x1("office:conversion-mode", ks2.m35661k4(i));
        }
        c3059ii.m12955x1("office:dde-application", this.f33064to);
        c3059ii.m12955x1("office:dde-topic", this.f33060du);
        c3059ii.m12955x1("office:dde-item", this.f33061h4);
        boolean z = this.f33063m9;
        if (!z) {
            c3059ii.m12955x1("office:automatic-update", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
