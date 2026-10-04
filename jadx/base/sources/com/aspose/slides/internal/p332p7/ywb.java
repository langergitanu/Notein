package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class ywb extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f33559m9 = new C7017h4("text:style-name", "text:name", "text:protected", "text:protection-key", "illustration-index-source", "index-body");

    /* JADX INFO: renamed from: du */
    private u8s f33560du;

    /* JADX INFO: renamed from: h4 */
    private zqo f33561h4;

    /* JADX INFO: renamed from: k4 */
    private String f33562k4;

    /* JADX INFO: renamed from: kk */
    private byte f33563kk;

    /* JADX INFO: renamed from: to */
    private String f33564to;

    /* JADX INFO: renamed from: x1 */
    private String f33565x1;

    public ywb() {
        m45209x1();
        this.f33560du = new u8s();
        this.f33561h4 = new zqo();
    }

    public ywb(final AbstractC13912i5 abstractC13912i5) {
        m45209x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ywb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ywb.f33559m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ywb.this.f33562k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ywb.this.f33565x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    ywb.this.f33563kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                ywb.this.f33564to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ywb.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ywb.f33559m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    ywb.this.f33560du = new u8s(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                ywb.this.f33561h4 = new zqo(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m45209x1() {
        this.f33563kk = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33562k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        c3059ii.m12955x1("text:name", this.f33565x1);
        byte b = this.f33563kk;
        if (b != -1) {
            c3059ii.m12955x1("text:protected", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f33564to;
        if (str4 != null) {
            c3059ii.m12955x1("text:protection-key", str4);
        }
        this.f33560du.mo6846k4("text", c3059ii, "illustration-index-source");
        this.f33561h4.mo6846k4("text", c3059ii, "index-body");
        c3059ii.mo21898jd();
    }
}
