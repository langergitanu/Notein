package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class ykd extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f33425m9 = new C7017h4("text:name", "text:formula", "style:num-format", "style:num-letter-sync", "text:ref-name");

    /* JADX INFO: renamed from: du */
    private String f33426du;

    /* JADX INFO: renamed from: h4 */
    private String f33427h4;

    /* JADX INFO: renamed from: k4 */
    private String f33428k4;

    /* JADX INFO: renamed from: kk */
    private String f33429kk;

    /* JADX INFO: renamed from: to */
    private byte f33430to;

    /* JADX INFO: renamed from: x1 */
    private String f33431x1;

    public ykd() {
        m45047x1();
    }

    public ykd(AbstractC13912i5 abstractC13912i5) {
        m45047x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ykd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ykd.f33425m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ykd.this.f33428k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ykd.this.f33431x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    ykd.this.f33429kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    ykd.this.f33430to = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                ykd.this.f33426du = str2;
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f33425m9)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f33427h4 = C14113y2.m67400k4(this.f33427h4, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m45047x1() {
        this.f33430to = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:name", this.f33428k4);
        String str3 = this.f33431x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:formula", str3);
        }
        String str4 = this.f33429kk;
        if (str4 != null) {
            c3059ii.m12955x1("style:num-format", str4);
        }
        byte b = this.f33430to;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f33426du;
        if (str5 != null) {
            c3059ii.m12955x1("text:ref-name", str5);
        }
        String str6 = this.f33427h4;
        if (str6 != null) {
            c3059ii.mo21918x1(str6);
        }
        c3059ii.mo21898jd();
    }
}
