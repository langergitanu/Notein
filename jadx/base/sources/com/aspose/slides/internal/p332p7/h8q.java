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
public class h8q extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private String f23993dy;

    /* JADX INFO: renamed from: kk */
    private double f23995kk;

    /* JADX INFO: renamed from: m9 */
    private byte f23996m9;

    /* JADX INFO: renamed from: to */
    private String f23997to;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f23990k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f23991x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f23989c5 = new C7017h4("office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value");

    /* JADX INFO: renamed from: du */
    private C14084qq f23992du = new C14084qq();

    /* JADX INFO: renamed from: h4 */
    private C14077m4 f23994h4 = new C14077m4();

    public h8q() {
        m33232x1();
    }

    public h8q(AbstractC13912i5 abstractC13912i5) {
        m33232x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h8q.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = h8q.f23989c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    h8q.this.f23995kk = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    h8q.this.f23997to = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(h8q.this.f23992du);
                    return true;
                }
                if (iM27428k4 == 3) {
                    AbstractC7361bz.m29294ks(str2).CloneTo(h8q.this.f23994h4);
                    return true;
                }
                if (iM27428k4 == 4) {
                    h8q.this.f23996m9 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                h8q.this.f23993dy = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m33232x1() {
        this.f23995kk = Double.NaN;
        f23990k4.CloneTo(this.f23992du);
        f23991x1.CloneTo(this.f23994h4);
        this.f23996m9 = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!C14044b3.m66437kk(this.f23995kk)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f23995kk));
        }
        String str3 = this.f23997to;
        if (str3 != null) {
            c3059ii.m12955x1("office:currency", str3);
        }
        if (C14084qq.m67078dy(this.f23992du, f23990k4)) {
            C20986OooO0o0.OooO0O0(this.f23992du, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f23994h4, f23991x1)) {
            C22240OooOO0o.OooO00o(this.f23994h4, c3059ii, "office:time-value");
        }
        byte b = this.f23996m9;
        if (b != -1) {
            c3059ii.m12955x1("office:boolean-value", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f23993dy;
        if (str4 != null) {
            c3059ii.m12955x1("office:string-value", str4);
        }
        c3059ii.mo21898jd();
    }
}
