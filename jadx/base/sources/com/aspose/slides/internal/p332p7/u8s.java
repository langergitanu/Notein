package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class u8s extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f31070du;

    /* JADX INFO: renamed from: dy */
    private rne f31071dy;

    /* JADX INFO: renamed from: h4 */
    private int f31072h4;

    /* JADX INFO: renamed from: kk */
    private boolean f31073kk;

    /* JADX INFO: renamed from: m9 */
    private pzs f31074m9;

    /* JADX INFO: renamed from: to */
    private boolean f31075to;

    /* JADX INFO: renamed from: x1 */
    private int f31076x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f31069k4 = se2.m40990k4("document");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f31068c5 = new C7017h4("text:index-scope", "text:relative-tab-stop-position", "text:use-caption", "text:caption-sequence-name", "text:caption-sequence-format", "index-title-template", "illustration-index-entry-template");

    public u8s() {
        m42147x1();
    }

    public u8s(final AbstractC13912i5 abstractC13912i5) {
        m42147x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u8s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = u8s.f31068c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    u8s.this.f31076x1 = se2.m40990k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    u8s.this.f31073kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    u8s.this.f31075to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    u8s.this.f31070du = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                u8s.this.f31072h4 = ixg.m34506k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.u8s.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = u8s.f31068c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    u8s.this.f31074m9 = new pzs(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                u8s.this.f31071dy = new rne(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m42147x1() {
        this.f31076x1 = f31069k4;
        this.f31073kk = true;
        this.f31075to = true;
        this.f31072h4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31076x1;
        if (i != f31069k4) {
            c3059ii.m12955x1("text:index-scope", se2.m40991k4(i));
        }
        boolean z = this.f31073kk;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("text:relative-tab-stop-position", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f31075to;
        if (!z2) {
            if (z2) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:use-caption", str3);
        }
        String str4 = this.f31070du;
        if (str4 != null) {
            c3059ii.m12955x1("text:caption-sequence-name", str4);
        }
        int i2 = this.f31072h4;
        if (i2 != 0) {
            c3059ii.m12955x1("text:caption-sequence-format", ixg.m34507k4(i2));
        }
        pzs pzsVar = this.f31074m9;
        if (pzsVar != null) {
            pzsVar.mo6846k4("text", c3059ii, "index-title-template");
        }
        rne rneVar = this.f31071dy;
        if (rneVar != null) {
            rneVar.mo6846k4("text", c3059ii, "illustration-index-entry-template");
        }
        c3059ii.mo21898jd();
    }
}
