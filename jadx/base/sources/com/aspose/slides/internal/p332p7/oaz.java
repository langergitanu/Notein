package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class oaz extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14077m4 f27840k4 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f27841u4 = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:printable", "form:tab-index", "form:tab-stop", "form:title", "form:value", "form:max-value", "form:min-value", "form:step-size", "form:page-step-size", "form:delay-for-repeat", "form:orientation", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f27842c5;

    /* JADX INFO: renamed from: ck */
    private String f27843ck;

    /* JADX INFO: renamed from: du */
    private String f27844du;

    /* JADX INFO: renamed from: dy */
    private long f27845dy;

    /* JADX INFO: renamed from: fa */
    private String f27846fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f27847h4;

    /* JADX INFO: renamed from: ix */
    private hec f27848ix;

    /* JADX INFO: renamed from: jd */
    private String f27849jd;

    /* JADX INFO: renamed from: kk */
    private String f27850kk;

    /* JADX INFO: renamed from: ks */
    private long f27851ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f27852m9;

    /* JADX INFO: renamed from: ne */
    private eyu f27853ne;

    /* JADX INFO: renamed from: rv */
    private C14077m4 f27854rv = new C14077m4();

    /* JADX INFO: renamed from: to */
    private String f27855to;

    /* JADX INFO: renamed from: up */
    private String f27856up;

    /* JADX INFO: renamed from: x1 */
    private String f27857x1;

    /* JADX INFO: renamed from: x6 */
    private int f27858x6;

    /* JADX INFO: renamed from: yj */
    private long f27859yj;

    public oaz() {
        m38169x1();
    }

    public oaz(final AbstractC13912i5 abstractC13912i5) {
        m38169x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oaz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (oaz.f27841u4.m27428k4(str)) {
                    case 0:
                        oaz.this.f27857x1 = str2;
                        break;
                    case 1:
                        oaz.this.f27850kk = str2;
                        break;
                    case 2:
                        oaz.this.f27855to = str2;
                        break;
                    case 3:
                        oaz.this.f27844du = str2;
                        break;
                    case 4:
                        oaz.this.f27847h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        oaz.this.f27852m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        oaz.this.f27845dy = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        oaz.this.f27842c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        oaz.this.f27849jd = str2;
                        break;
                    case 9:
                        oaz.this.f27843ck = str2;
                        break;
                    case 10:
                        oaz.this.f27846fa = str2;
                        break;
                    case 11:
                        oaz.this.f27856up = str2;
                        break;
                    case 12:
                        oaz.this.f27859yj = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 13:
                        oaz.this.f27851ks = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 14:
                        AbstractC7361bz.m29294ks(str2).CloneTo(oaz.this.f27854rv);
                        break;
                    case 15:
                        oaz.this.f27858x6 = xmh.m44510k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oaz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = oaz.f27841u4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 16) {
                    oaz.this.f27853ne = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 17) {
                    return false;
                }
                oaz.this.f27848ix = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m38169x1() {
        this.f27847h4 = false;
        this.f27852m9 = true;
        this.f27845dy = 0L;
        this.f27842c5 = true;
        this.f27859yj = 4294967295L;
        this.f27851ks = 4294967295L;
        f27840k4.CloneTo(this.f27854rv);
        this.f27858x6 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27857x1;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f27850kk;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f27855to);
        String str5 = this.f27844du;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f27847h4;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f27852m9;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f27845dy;
        if ((j & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j));
        }
        boolean z3 = this.f27842c5;
        if (!z3) {
            if (z3) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:tab-stop", str6);
        }
        String str7 = this.f27849jd;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        c3059ii.m12955x1("form:value", this.f27843ck);
        c3059ii.m12955x1("form:max-value", this.f27846fa);
        c3059ii.m12955x1("form:min-value", this.f27856up);
        long j2 = this.f27859yj;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:step-size", C13850af.m65147x1(j2));
        }
        long j3 = this.f27851ks;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:page-step-size", C13850af.m65147x1(j3));
        }
        if (C14077m4.m66795du(this.f27854rv, f27840k4)) {
            C22240OooOO0o.OooO00o(this.f27854rv, c3059ii, "form:delay-for-repeat");
        }
        int i = this.f27858x6;
        if (i != 0) {
            c3059ii.m12955x1("form:orientation", xmh.m44511k4(i));
        }
        eyu eyuVar = this.f27853ne;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f27848ix;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
