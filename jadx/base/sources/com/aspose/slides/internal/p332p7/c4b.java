package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class c4b extends AbstractC7361bz {

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f20904rv = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:max-length", "form:printable", "form:tab-index", "form:tab-stop", "form:title", "form:value", "form:convert-empty-to-null", "form:echo-char", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f20905c5;

    /* JADX INFO: renamed from: ck */
    private String f20906ck;

    /* JADX INFO: renamed from: du */
    private boolean f20907du;

    /* JADX INFO: renamed from: dy */
    private long f20908dy;

    /* JADX INFO: renamed from: fa */
    private boolean f20909fa;

    /* JADX INFO: renamed from: h4 */
    private long f20910h4;

    /* JADX INFO: renamed from: jd */
    private String f20911jd;

    /* JADX INFO: renamed from: k4 */
    private String f20912k4;

    /* JADX INFO: renamed from: kk */
    private String f20913kk;

    /* JADX INFO: renamed from: ks */
    private hec f20914ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f20915m9;

    /* JADX INFO: renamed from: to */
    private String f20916to;

    /* JADX INFO: renamed from: up */
    private char f20917up;

    /* JADX INFO: renamed from: x1 */
    private String f20918x1;

    /* JADX INFO: renamed from: yj */
    private eyu f20919yj;

    public c4b() {
        m29426x1();
    }

    public c4b(final AbstractC13912i5 abstractC13912i5) {
        m29426x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c4b.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (c4b.f20904rv.m27428k4(str)) {
                    case 0:
                        c4b.this.f20912k4 = str2;
                        break;
                    case 1:
                        c4b.this.f20918x1 = str2;
                        break;
                    case 2:
                        c4b.this.f20913kk = str2;
                        break;
                    case 3:
                        c4b.this.f20916to = str2;
                        break;
                    case 4:
                        c4b.this.f20907du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        c4b.this.f20910h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        c4b.this.f20915m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        c4b.this.f20908dy = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 8:
                        c4b.this.f20905c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        c4b.this.f20911jd = str2;
                        break;
                    case 10:
                        c4b.this.f20906ck = str2;
                        break;
                    case 11:
                        c4b.this.f20909fa = C13850af.m65068c5(str2);
                        break;
                    case 12:
                        c4b.this.f20917up = C13850af.m65075jd(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c4b.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = c4b.f20904rv.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 13) {
                    c4b.this.f20919yj = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 14) {
                    return false;
                }
                c4b.this.f20914ks = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m29426x1() {
        this.f20907du = false;
        this.f20910h4 = 4294967295L;
        this.f20915m9 = true;
        this.f20908dy = 0L;
        this.f20905c5 = true;
        this.f20909fa = false;
        this.f20917up = '*';
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20912k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f20918x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f20913kk);
        String str5 = this.f20916to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f20907du;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f20910h4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:max-length", C13850af.m65147x1(j));
        }
        boolean z2 = this.f20915m9;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f20908dy;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z3 = this.f20905c5;
        if (!z3) {
            c3059ii.m12955x1("form:tab-stop", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f20911jd;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        c3059ii.m12955x1("form:value", this.f20906ck);
        boolean z4 = this.f20909fa;
        if (z4) {
            if (z4) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:convert-empty-to-null", str6);
        }
        char c = this.f20917up;
        if (c != '*') {
            c3059ii.m12955x1("form:echo-char", C13850af.m65100k4(c));
        }
        eyu eyuVar = this.f20919yj;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f20914ks;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
