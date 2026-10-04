package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class f2w extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f22622m9 = new C7017h4("text:style-name", "text:name", "text:protected", "text:protection-key", "user-index-source", "index-body");

    /* JADX INFO: renamed from: du */
    private rg7 f22623du;

    /* JADX INFO: renamed from: h4 */
    private zqo f22624h4;

    /* JADX INFO: renamed from: k4 */
    private String f22625k4;

    /* JADX INFO: renamed from: kk */
    private byte f22626kk;

    /* JADX INFO: renamed from: to */
    private String f22627to;

    /* JADX INFO: renamed from: x1 */
    private String f22628x1;

    public f2w() {
        m31558x1();
        this.f22623du = new rg7();
        this.f22624h4 = new zqo();
    }

    public f2w(final AbstractC13912i5 abstractC13912i5) {
        m31558x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f2w.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = f2w.f22622m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    f2w.this.f22625k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    f2w.this.f22628x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    f2w.this.f22626kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                f2w.this.f22627to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f2w.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = f2w.f22622m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    f2w.this.f22623du = new rg7(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                f2w.this.f22624h4 = new zqo(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m31558x1() {
        this.f22626kk = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22625k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        c3059ii.m12955x1("text:name", this.f22628x1);
        byte b = this.f22626kk;
        if (b != -1) {
            c3059ii.m12955x1("text:protected", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f22627to;
        if (str4 != null) {
            c3059ii.m12955x1("text:protection-key", str4);
        }
        this.f22623du.mo6846k4("text", c3059ii, "user-index-source");
        this.f22624h4.mo6846k4("text", c3059ii, "index-body");
        c3059ii.mo21898jd();
    }
}
