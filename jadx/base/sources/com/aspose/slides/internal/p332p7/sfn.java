package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class sfn extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f30107du;

    /* JADX INFO: renamed from: kk */
    private String f30108kk;

    /* JADX INFO: renamed from: to */
    private C14077m4 f30109to = new C14077m4();

    /* JADX INFO: renamed from: x1 */
    private byte f30110x1;

    /* JADX INFO: renamed from: k4 */
    public static final C14077m4 f30106k4 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30105h4 = new C7017h4("text:fixed", "style:data-style-name", "text:duration");

    public sfn() {
        m41007x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m41007x1() {
        this.f30110x1 = (byte) -1;
        f30106k4.CloneTo(this.f30109to);
    }

    public sfn(AbstractC13912i5 abstractC13912i5) {
        m41007x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sfn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = sfn.f30105h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    sfn.this.f30110x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    sfn.this.f30108kk = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                AbstractC7361bz.m29294ks(str2).CloneTo(sfn.this.f30109to);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f30105h4)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f30107du = C14113y2.m67400k4(this.f30107du, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f30110x1;
        if (b != -1) {
            c3059ii.m12955x1("text:fixed", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str3 = this.f30108kk;
        if (str3 != null) {
            c3059ii.m12955x1("style:data-style-name", str3);
        }
        if (C14077m4.m66795du(this.f30109to, f30106k4)) {
            C22240OooOO0o.OooO00o(this.f30109to, c3059ii, "text:duration");
        }
        String str4 = this.f30107du;
        if (str4 != null) {
            c3059ii.mo21918x1(str4);
        }
        c3059ii.mo21898jd();
    }
}
