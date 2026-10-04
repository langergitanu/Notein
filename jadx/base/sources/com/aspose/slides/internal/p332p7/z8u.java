package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class z8u extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33791to = new C7017h4("style:num-format", "style:num-letter-sync");

    /* JADX INFO: renamed from: k4 */
    private String f33792k4;

    /* JADX INFO: renamed from: kk */
    private String f33793kk;

    /* JADX INFO: renamed from: x1 */
    private byte f33794x1;

    public z8u() {
        m45508x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45508x1() {
        this.f33794x1 = (byte) -1;
    }

    public z8u(AbstractC13912i5 abstractC13912i5) {
        m45508x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z8u.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = z8u.f33791to.m27428k4(str);
                if (iM27428k4 == 0) {
                    z8u.this.f33792k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                z8u.this.f33794x1 = AbstractC7361bz.m29296rv(str2);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f33791to)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f33793kk = C14113y2.m67400k4(this.f33793kk, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33792k4;
        if (str3 != null) {
            c3059ii.m12955x1("style:num-format", str3);
        }
        byte b = this.f33794x1;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f33793kk;
        if (str4 != null) {
            c3059ii.mo21918x1(str4);
        }
        c3059ii.mo21898jd();
    }
}
