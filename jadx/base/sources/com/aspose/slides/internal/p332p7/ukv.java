package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class ukv extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private String f31347ck;

    /* JADX INFO: renamed from: du */
    private int f31348du;

    /* JADX INFO: renamed from: h4 */
    private double f31350h4;

    /* JADX INFO: renamed from: jd */
    private byte f31351jd;

    /* JADX INFO: renamed from: kk */
    private String f31352kk;

    /* JADX INFO: renamed from: m9 */
    private String f31353m9;

    /* JADX INFO: renamed from: to */
    private String f31354to;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f31344k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f31345x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f31343fa = new C7017h4("text:name", "text:formula", "office:value-type", "office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value");

    /* JADX INFO: renamed from: dy */
    private C14084qq f31349dy = new C14084qq();

    /* JADX INFO: renamed from: c5 */
    private C14077m4 f31346c5 = new C14077m4();

    public ukv() {
        m42479x1();
    }

    public ukv(AbstractC13912i5 abstractC13912i5) {
        m42479x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ukv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (ukv.f31343fa.m27428k4(str)) {
                    case 0:
                        ukv.this.f31352kk = str2;
                        break;
                    case 1:
                        ukv.this.f31354to = str2;
                        break;
                    case 2:
                        ukv.this.f31348du = b3e.m28701k4(str2);
                        break;
                    case 3:
                        ukv.this.f31350h4 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 4:
                        ukv.this.f31353m9 = str2;
                        break;
                    case 5:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(ukv.this.f31349dy);
                        break;
                    case 6:
                        AbstractC7361bz.m29294ks(str2).CloneTo(ukv.this.f31346c5);
                        break;
                    case 7:
                        ukv.this.f31351jd = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 8:
                        ukv.this.f31347ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m42479x1() {
        this.f31348du = 0;
        this.f31350h4 = Double.NaN;
        f31344k4.CloneTo(this.f31349dy);
        f31345x1.CloneTo(this.f31346c5);
        this.f31351jd = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:name", this.f31352kk);
        String str3 = this.f31354to;
        if (str3 != null) {
            c3059ii.m12955x1("text:formula", str3);
        }
        int i = this.f31348du;
        if (i != 0) {
            c3059ii.m12955x1("office:value-type", b3e.m28702k4(i));
        }
        if (!C14044b3.m66437kk(this.f31350h4)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f31350h4));
        }
        String str4 = this.f31353m9;
        if (str4 != null) {
            c3059ii.m12955x1("office:currency", str4);
        }
        if (C14084qq.m67078dy(this.f31349dy, f31344k4)) {
            C20986OooO0o0.OooO0O0(this.f31349dy, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f31346c5, f31345x1)) {
            C22240OooOO0o.OooO00o(this.f31346c5, c3059ii, "office:time-value");
        }
        byte b = this.f31351jd;
        if (b != -1) {
            c3059ii.m12955x1("office:boolean-value", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f31347ck;
        if (str5 != null) {
            c3059ii.m12955x1("office:string-value", str5);
        }
        c3059ii.mo21898jd();
    }
}
