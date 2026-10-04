package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class g5j extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f23246du;

    /* JADX INFO: renamed from: dy */
    private rne f23247dy;

    /* JADX INFO: renamed from: h4 */
    private int f23248h4;

    /* JADX INFO: renamed from: kk */
    private boolean f23249kk;

    /* JADX INFO: renamed from: m9 */
    private pzs f23250m9;

    /* JADX INFO: renamed from: to */
    private boolean f23251to;

    /* JADX INFO: renamed from: x1 */
    private int f23252x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f23245k4 = se2.m40990k4("document");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f23244c5 = new C7017h4("text:index-scope", "text:relative-tab-stop-position", "text:use-caption", "text:caption-sequence-name", "text:caption-sequence-format", "index-title-template", "table-index-entry-template");

    public g5j() {
        m32320x1();
    }

    public g5j(final AbstractC13912i5 abstractC13912i5) {
        m32320x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g5j.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = g5j.f23244c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    g5j.this.f23252x1 = se2.m40990k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    g5j.this.f23249kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    g5j.this.f23251to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    g5j.this.f23246du = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                g5j.this.f23248h4 = ixg.m34506k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g5j.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = g5j.f23244c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    g5j.this.f23250m9 = new pzs(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                g5j.this.f23247dy = new rne(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32320x1() {
        this.f23252x1 = f23245k4;
        this.f23249kk = true;
        this.f23251to = true;
        this.f23248h4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23252x1;
        if (i != f23245k4) {
            c3059ii.m12955x1("text:index-scope", se2.m40991k4(i));
        }
        boolean z = this.f23249kk;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("text:relative-tab-stop-position", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f23251to;
        if (!z2) {
            if (z2) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:use-caption", str3);
        }
        String str4 = this.f23246du;
        if (str4 != null) {
            c3059ii.m12955x1("text:caption-sequence-name", str4);
        }
        int i2 = this.f23248h4;
        if (i2 != 0) {
            c3059ii.m12955x1("text:caption-sequence-format", ixg.m34507k4(i2));
        }
        pzs pzsVar = this.f23250m9;
        if (pzsVar != null) {
            pzsVar.mo6846k4("text", c3059ii, "index-title-template");
        }
        rne rneVar = this.f23247dy;
        if (rneVar != null) {
            rneVar.mo6846k4("text", c3059ii, "table-index-entry-template");
        }
        c3059ii.mo21898jd();
    }
}
