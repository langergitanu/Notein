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
public class ng8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f27296k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f27297x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f27298yj = new C7017h4("text:formula", "office:value-type", "office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value", "text:display", "style:data-style-name");

    /* JADX INFO: renamed from: c5 */
    private byte f27299c5;

    /* JADX INFO: renamed from: ck */
    private int f27300ck;

    /* JADX INFO: renamed from: du */
    private double f27301du;

    /* JADX INFO: renamed from: fa */
    private String f27303fa;

    /* JADX INFO: renamed from: h4 */
    private String f27304h4;

    /* JADX INFO: renamed from: jd */
    private String f27305jd;

    /* JADX INFO: renamed from: kk */
    private String f27306kk;

    /* JADX INFO: renamed from: to */
    private int f27308to;

    /* JADX INFO: renamed from: up */
    private String f27309up;

    /* JADX INFO: renamed from: m9 */
    private C14084qq f27307m9 = new C14084qq();

    /* JADX INFO: renamed from: dy */
    private C14077m4 f27302dy = new C14077m4();

    public ng8() {
        m37507x1();
    }

    public ng8(AbstractC13912i5 abstractC13912i5) {
        m37507x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ng8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ng8.f27298yj.m27428k4(str)) {
                    case 0:
                        ng8.this.f27306kk = str2;
                        break;
                    case 1:
                        ng8.this.f27308to = b3e.m28701k4(str2);
                        break;
                    case 2:
                        ng8.this.f27301du = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 3:
                        ng8.this.f27304h4 = str2;
                        break;
                    case 4:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(ng8.this.f27307m9);
                        break;
                    case 5:
                        AbstractC7361bz.m29294ks(str2).CloneTo(ng8.this.f27302dy);
                        break;
                    case 6:
                        ng8.this.f27299c5 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 7:
                        ng8.this.f27305jd = str2;
                        break;
                    case 8:
                        ng8.this.f27300ck = zqt.m45914k4(str2);
                        break;
                    case 9:
                        ng8.this.f27303fa = str2;
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f27298yj)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f27309up = C14113y2.m67400k4(this.f27309up, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m37507x1() {
        this.f27308to = 0;
        this.f27301du = Double.NaN;
        f27296k4.CloneTo(this.f27307m9);
        f27297x1.CloneTo(this.f27302dy);
        this.f27299c5 = (byte) -1;
        this.f27300ck = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27306kk;
        if (str3 != null) {
            c3059ii.m12955x1("text:formula", str3);
        }
        int i = this.f27308to;
        if (i != 0) {
            c3059ii.m12955x1("office:value-type", b3e.m28702k4(i));
        }
        if (!C14044b3.m66437kk(this.f27301du)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f27301du));
        }
        String str4 = this.f27304h4;
        if (str4 != null) {
            c3059ii.m12955x1("office:currency", str4);
        }
        if (C14084qq.m67078dy(this.f27307m9, f27296k4)) {
            C20986OooO0o0.OooO0O0(this.f27307m9, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f27302dy, f27297x1)) {
            C22240OooOO0o.OooO00o(this.f27302dy, c3059ii, "office:time-value");
        }
        byte b = this.f27299c5;
        if (b != -1) {
            c3059ii.m12955x1("office:boolean-value", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f27305jd;
        if (str5 != null) {
            c3059ii.m12955x1("office:string-value", str5);
        }
        int i2 = this.f27300ck;
        if (i2 != 0) {
            c3059ii.m12955x1("text:display", zqt.m45915k4(i2));
        }
        String str6 = this.f27303fa;
        if (str6 != null) {
            c3059ii.m12955x1("style:data-style-name", str6);
        }
        String str7 = this.f27309up;
        if (str7 != null) {
            c3059ii.mo21918x1(str7);
        }
        c3059ii.mo21898jd();
    }
}
