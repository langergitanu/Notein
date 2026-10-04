package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class sza extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private byte f30514c5;

    /* JADX INFO: renamed from: ck */
    private String f30515ck;

    /* JADX INFO: renamed from: du */
    private String f30516du;

    /* JADX INFO: renamed from: h4 */
    private double f30518h4;

    /* JADX INFO: renamed from: jd */
    private String f30519jd;

    /* JADX INFO: renamed from: kk */
    private byte f30520kk;

    /* JADX INFO: renamed from: to */
    private String f30522to;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f30512k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f30513x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f30511fa = new C7017h4("text:fixed", "text:name", "style:data-style-name", "office:value", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value");

    /* JADX INFO: renamed from: m9 */
    private C14084qq f30521m9 = new C14084qq();

    /* JADX INFO: renamed from: dy */
    private C14077m4 f30517dy = new C14077m4();

    public sza() {
        m41461x1();
    }

    public sza(AbstractC13912i5 abstractC13912i5) {
        m41461x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sza.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (sza.f30511fa.m27428k4(str)) {
                    case 0:
                        sza.this.f30520kk = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 1:
                        sza.this.f30522to = str2;
                        break;
                    case 2:
                        sza.this.f30516du = str2;
                        break;
                    case 3:
                        sza.this.f30518h4 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 4:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(sza.this.f30521m9);
                        break;
                    case 5:
                        AbstractC7361bz.m29294ks(str2).CloneTo(sza.this.f30517dy);
                        break;
                    case 6:
                        sza.this.f30514c5 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 7:
                        sza.this.f30519jd = str2;
                        break;
                }
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f30511fa)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f30515ck = C14113y2.m67400k4(this.f30515ck, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m41461x1() {
        this.f30520kk = (byte) -1;
        this.f30518h4 = Double.NaN;
        f30512k4.CloneTo(this.f30521m9);
        f30513x1.CloneTo(this.f30517dy);
        this.f30514c5 = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f30520kk;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("text:fixed", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("text:name", this.f30522to);
        String str4 = this.f30516du;
        if (str4 != null) {
            c3059ii.m12955x1("style:data-style-name", str4);
        }
        if (!C14044b3.m66437kk(this.f30518h4)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f30518h4));
        }
        if (C14084qq.m67078dy(this.f30521m9, f30512k4)) {
            C20986OooO0o0.OooO0O0(this.f30521m9, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f30517dy, f30513x1)) {
            C22240OooOO0o.OooO00o(this.f30517dy, c3059ii, "office:time-value");
        }
        byte b2 = this.f30514c5;
        if (b2 != -1) {
            if (b2 == 1) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("office:boolean-value", str3);
        }
        String str5 = this.f30519jd;
        if (str5 != null) {
            c3059ii.m12955x1("office:string-value", str5);
        }
        String str6 = this.f30515ck;
        if (str6 != null) {
            c3059ii.mo21918x1(str6);
        }
        c3059ii.mo21898jd();
    }
}
