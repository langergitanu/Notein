package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class dj6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21677to = new C7017h4("style:num-format", "style:num-letter-sync");

    /* JADX INFO: renamed from: k4 */
    private String f21678k4;

    /* JADX INFO: renamed from: kk */
    private String f21679kk;

    /* JADX INFO: renamed from: x1 */
    private byte f21680x1;

    public dj6() {
        m30385x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30385x1() {
        this.f21680x1 = (byte) -1;
    }

    public dj6(AbstractC13912i5 abstractC13912i5) {
        m30385x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dj6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dj6.f21677to.m27428k4(str);
                if (iM27428k4 == 0) {
                    dj6.this.f21678k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                dj6.this.f21680x1 = AbstractC7361bz.m29296rv(str2);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f21677to)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f21679kk = C14113y2.m67400k4(this.f21679kk, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21678k4;
        if (str3 != null) {
            c3059ii.m12955x1("style:num-format", str3);
        }
        byte b = this.f21680x1;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f21679kk;
        if (str4 != null) {
            c3059ii.mo21918x1(str4);
        }
        c3059ii.mo21898jd();
    }
}
