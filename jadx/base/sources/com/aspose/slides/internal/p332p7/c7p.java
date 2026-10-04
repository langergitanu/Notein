package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class c7p extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f20935m9 = new C7017h4("text:style-name", "text:name", "text:protected", "text:protection-key", "object-index-source", "index-body");

    /* JADX INFO: renamed from: du */
    private etr f20936du;

    /* JADX INFO: renamed from: h4 */
    private zqo f20937h4;

    /* JADX INFO: renamed from: k4 */
    private String f20938k4;

    /* JADX INFO: renamed from: kk */
    private byte f20939kk;

    /* JADX INFO: renamed from: to */
    private String f20940to;

    /* JADX INFO: renamed from: x1 */
    private String f20941x1;

    public c7p() {
        m29458x1();
        this.f20936du = new etr();
        this.f20937h4 = new zqo();
    }

    public c7p(final AbstractC13912i5 abstractC13912i5) {
        m29458x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c7p.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = c7p.f20935m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    c7p.this.f20938k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    c7p.this.f20941x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    c7p.this.f20939kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                c7p.this.f20940to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c7p.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = c7p.f20935m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    c7p.this.f20936du = new etr(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                c7p.this.f20937h4 = new zqo(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m29458x1() {
        this.f20939kk = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20938k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        c3059ii.m12955x1("text:name", this.f20941x1);
        byte b = this.f20939kk;
        if (b != -1) {
            c3059ii.m12955x1("text:protected", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f20940to;
        if (str4 != null) {
            c3059ii.m12955x1("text:protection-key", str4);
        }
        this.f20936du.mo6846k4("text", c3059ii, "object-index-source");
        this.f20937h4.mo6846k4("text", c3059ii, "index-body");
        c3059ii.mo21898jd();
    }
}
