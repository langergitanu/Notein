package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class q0x extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28692du = new C7017h4("text:fixed", "style:data-style-name", "text:time-value");

    /* JADX INFO: renamed from: k4 */
    private byte f28693k4;

    /* JADX INFO: renamed from: kk */
    private String f28694kk;

    /* JADX INFO: renamed from: to */
    private String f28695to;

    /* JADX INFO: renamed from: x1 */
    private String f28696x1;

    public q0x() {
        m39276x1();
    }

    public q0x(AbstractC13912i5 abstractC13912i5) {
        m39276x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q0x.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = q0x.f28692du.m27428k4(str);
                if (iM27428k4 == 0) {
                    q0x.this.f28693k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    q0x.this.f28696x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                q0x.this.f28694kk = str2;
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f28692du)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f28695to = C14113y2.m67400k4(this.f28695to, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m39276x1() {
        this.f28693k4 = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f28693k4;
        if (b != -1) {
            c3059ii.m12955x1("text:fixed", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str3 = this.f28696x1;
        if (str3 != null) {
            c3059ii.m12955x1("style:data-style-name", str3);
        }
        String str4 = this.f28694kk;
        if (str4 != null) {
            c3059ii.m12955x1("text:time-value", str4);
        }
        String str5 = this.f28695to;
        if (str5 != null) {
            c3059ii.mo21918x1(str5);
        }
        c3059ii.mo21898jd();
    }
}
