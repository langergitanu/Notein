package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class mqt extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f26942m9 = new C7017h4("text:style-name", "text:name", "text:protected", "text:protection-key", "bibliography-source", "index-body");

    /* JADX INFO: renamed from: du */
    private kiv f26943du;

    /* JADX INFO: renamed from: h4 */
    private zqo f26944h4;

    /* JADX INFO: renamed from: k4 */
    private String f26945k4;

    /* JADX INFO: renamed from: kk */
    private byte f26946kk;

    /* JADX INFO: renamed from: to */
    private String f26947to;

    /* JADX INFO: renamed from: x1 */
    private String f26948x1;

    public mqt() {
        m37052x1();
        this.f26943du = new kiv();
        this.f26944h4 = new zqo();
    }

    public mqt(final AbstractC13912i5 abstractC13912i5) {
        m37052x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mqt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = mqt.f26942m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    mqt.this.f26945k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    mqt.this.f26948x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    mqt.this.f26946kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                mqt.this.f26947to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mqt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = mqt.f26942m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    mqt.this.f26943du = new kiv(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                mqt.this.f26944h4 = new zqo(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m37052x1() {
        this.f26946kk = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26945k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        c3059ii.m12955x1("text:name", this.f26948x1);
        byte b = this.f26946kk;
        if (b != -1) {
            c3059ii.m12955x1("text:protected", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f26947to;
        if (str4 != null) {
            c3059ii.m12955x1("text:protection-key", str4);
        }
        this.f26943du.mo6846k4("text", c3059ii, "bibliography-source");
        this.f26944h4.mo6846k4("text", c3059ii, "index-body");
        c3059ii.mo21898jd();
    }
}
