package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class knb extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25825to = new C7017h4("text:active", "text:page-adjust");

    /* JADX INFO: renamed from: k4 */
    private byte f25826k4;

    /* JADX INFO: renamed from: kk */
    private String f25827kk;

    /* JADX INFO: renamed from: x1 */
    private int f25828x1;

    public knb() {
        m35560x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35560x1() {
        this.f25826k4 = (byte) -1;
        this.f25828x1 = 0;
    }

    public knb(AbstractC13912i5 abstractC13912i5) {
        m35560x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.knb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = knb.f25825to.m27428k4(str);
                if (iM27428k4 == 0) {
                    knb.this.f25826k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                knb.this.f25828x1 = C13850af.m65151yj(str2);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f25825to)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f25827kk = C14113y2.m67400k4(this.f25827kk, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f25826k4;
        if (b != -1) {
            c3059ii.m12955x1("text:active", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f25828x1;
        if (i != 0) {
            c3059ii.m12955x1("text:page-adjust", C13850af.m65103k4(i));
        }
        String str3 = this.f25827kk;
        if (str3 != null) {
            c3059ii.mo21918x1(str3);
        }
        c3059ii.mo21898jd();
    }
}
