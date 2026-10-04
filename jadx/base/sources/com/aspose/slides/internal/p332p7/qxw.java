package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class qxw extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f29065h4 = new C7017h4("text:condition", "text:string-value-if-true", "text:string-value-if-false", "text:current-value");

    /* JADX INFO: renamed from: du */
    private String f29066du;

    /* JADX INFO: renamed from: k4 */
    private String f29067k4;

    /* JADX INFO: renamed from: kk */
    private String f29068kk;

    /* JADX INFO: renamed from: to */
    private byte f29069to;

    /* JADX INFO: renamed from: x1 */
    private String f29070x1;

    public qxw() {
        m39737x1();
    }

    public qxw(AbstractC13912i5 abstractC13912i5) {
        m39737x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qxw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qxw.f29065h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    qxw.this.f29067k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    qxw.this.f29070x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    qxw.this.f29068kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                qxw.this.f29069to = AbstractC7361bz.m29296rv(str2);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f29065h4)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f29066du = C14113y2.m67400k4(this.f29066du, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m39737x1() {
        this.f29069to = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:condition", this.f29067k4);
        c3059ii.m12955x1("text:string-value-if-true", this.f29070x1);
        c3059ii.m12955x1("text:string-value-if-false", this.f29068kk);
        byte b = this.f29069to;
        if (b != -1) {
            c3059ii.m12955x1("text:current-value", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str3 = this.f29066du;
        if (str3 != null) {
            c3059ii.mo21918x1(str3);
        }
        c3059ii.mo21898jd();
    }
}
