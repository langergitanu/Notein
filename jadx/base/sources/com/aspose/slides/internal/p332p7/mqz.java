package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class mqz extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26952du = new C7017h4("text:condition", "text:string-value", "text:is-hidden");

    /* JADX INFO: renamed from: k4 */
    private String f26953k4;

    /* JADX INFO: renamed from: kk */
    private byte f26954kk;

    /* JADX INFO: renamed from: to */
    private String f26955to;

    /* JADX INFO: renamed from: x1 */
    private String f26956x1;

    public mqz() {
        m37057x1();
    }

    public mqz(AbstractC13912i5 abstractC13912i5) {
        m37057x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mqz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = mqz.f26952du.m27428k4(str);
                if (iM27428k4 == 0) {
                    mqz.this.f26953k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    mqz.this.f26956x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                mqz.this.f26954kk = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (OooO0o.OooO0OO(abstractC13912i5, f26952du)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f26955to = C14113y2.m67400k4(this.f26955to, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m37057x1() {
        this.f26954kk = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:condition", this.f26953k4);
        c3059ii.m12955x1("text:string-value", this.f26956x1);
        byte b = this.f26954kk;
        if (b != -1) {
            c3059ii.m12955x1("text:is-hidden", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str3 = this.f26955to;
        if (str3 != null) {
            c3059ii.mo21918x1(str3);
        }
        c3059ii.mo21898jd();
    }
}
