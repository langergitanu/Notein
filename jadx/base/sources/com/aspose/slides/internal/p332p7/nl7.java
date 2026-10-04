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
public class nl7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private byte f27444c5;

    /* JADX INFO: renamed from: du */
    private double f27445du;

    /* JADX INFO: renamed from: h4 */
    private String f27447h4;

    /* JADX INFO: renamed from: jd */
    private String f27448jd;

    /* JADX INFO: renamed from: kk */
    private String f27449kk;

    /* JADX INFO: renamed from: to */
    private int f27451to;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f27442k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f27443x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f27441ck = new C7017h4("form:property-name", "office:value-type", "office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value");

    /* JADX INFO: renamed from: m9 */
    private C14084qq f27450m9 = new C14084qq();

    /* JADX INFO: renamed from: dy */
    private C14077m4 f27446dy = new C14077m4();

    public nl7() {
        m37699x1();
    }

    public nl7(AbstractC13912i5 abstractC13912i5) {
        m37699x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nl7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (nl7.f27441ck.m27428k4(str)) {
                    case 0:
                        nl7.this.f27449kk = str2;
                        break;
                    case 1:
                        nl7.this.f27451to = ezy.m31506k4(str2);
                        break;
                    case 2:
                        nl7.this.f27445du = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 3:
                        nl7.this.f27447h4 = str2;
                        break;
                    case 4:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(nl7.this.f27450m9);
                        break;
                    case 5:
                        AbstractC7361bz.m29294ks(str2).CloneTo(nl7.this.f27446dy);
                        break;
                    case 6:
                        nl7.this.f27444c5 = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 7:
                        nl7.this.f27448jd = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m37699x1() {
        this.f27451to = 0;
        this.f27445du = Double.NaN;
        f27442k4.CloneTo(this.f27450m9);
        f27443x1.CloneTo(this.f27446dy);
        this.f27444c5 = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("form:property-name", this.f27449kk);
        c3059ii.m12955x1("office:value-type", ezy.m31507k4(this.f27451to));
        if (!C14044b3.m66437kk(this.f27445du)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f27445du));
        }
        String str3 = this.f27447h4;
        if (str3 != null) {
            c3059ii.m12955x1("office:currency", str3);
        }
        if (C14084qq.m67078dy(this.f27450m9, f27442k4)) {
            C20986OooO0o0.OooO0O0(this.f27450m9, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f27446dy, f27443x1)) {
            C22240OooOO0o.OooO00o(this.f27446dy, c3059ii, "office:time-value");
        }
        byte b = this.f27444c5;
        if (b != -1) {
            c3059ii.m12955x1("office:boolean-value", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f27448jd;
        if (str4 != null) {
            c3059ii.m12955x1("office:string-value", str4);
        }
        c3059ii.mo21898jd();
    }
}
