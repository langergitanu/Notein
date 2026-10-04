package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class p9k extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f28259m9 = new C7017h4("style:num-format", "style:num-letter-sync", "text:fixed", "text:page-adjust", "text:select-page");

    /* JADX INFO: renamed from: du */
    private int f28260du;

    /* JADX INFO: renamed from: h4 */
    private String f28261h4;

    /* JADX INFO: renamed from: k4 */
    private String f28262k4;

    /* JADX INFO: renamed from: kk */
    private byte f28263kk;

    /* JADX INFO: renamed from: to */
    private int f28264to;

    /* JADX INFO: renamed from: x1 */
    private byte f28265x1;

    public p9k() {
        m38666x1();
    }

    public p9k(AbstractC13912i5 abstractC13912i5) {
        m38666x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.p9k.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = p9k.f28259m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    p9k.this.f28262k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    p9k.this.f28265x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    p9k.this.f28263kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    p9k.this.f28264to = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                p9k.this.f28260du = p7y.m38630k4(str2);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f28259m9)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f28261h4 = C14113y2.m67400k4(this.f28261h4, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m38666x1() {
        this.f28265x1 = (byte) -1;
        this.f28263kk = (byte) -1;
        this.f28264to = 0;
        this.f28260du = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28262k4;
        if (str3 != null) {
            c3059ii.m12955x1("style:num-format", str3);
        }
        byte b = this.f28265x1;
        String str4 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        byte b2 = this.f28263kk;
        if (b2 != -1) {
            if (b2 == 1) {
                str4 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:fixed", str4);
        }
        int i = this.f28264to;
        if (i != 0) {
            c3059ii.m12955x1("text:page-adjust", C13850af.m65103k4(i));
        }
        int i2 = this.f28260du;
        if (i2 != 0) {
            c3059ii.m12955x1("text:select-page", p7y.m38631k4(i2));
        }
        String str5 = this.f28261h4;
        if (str5 != null) {
            c3059ii.mo21918x1(str5);
        }
        c3059ii.mo21898jd();
    }
}
