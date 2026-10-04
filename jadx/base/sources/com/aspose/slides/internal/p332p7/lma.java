package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class lma extends AbstractC7361bz {

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f26387u4 = new C7017h4("form:value", "form:current-value", "form:min-value", "form:max-value", "form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:max-length", "form:printable", "form:readonly", "form:tab-index", "form:tab-stop", "form:title", "form:convert-empty-to-null", "form:data-field", "properties", "event-listeners");

    /* JADX INFO: renamed from: c5 */
    private boolean f26388c5;

    /* JADX INFO: renamed from: ck */
    private boolean f26389ck;

    /* JADX INFO: renamed from: du */
    private String f26390du;

    /* JADX INFO: renamed from: dy */
    private String f26391dy;

    /* JADX INFO: renamed from: fa */
    private boolean f26392fa;

    /* JADX INFO: renamed from: h4 */
    private String f26393h4;

    /* JADX INFO: renamed from: ix */
    private hec f26394ix;

    /* JADX INFO: renamed from: jd */
    private long f26395jd;

    /* JADX INFO: renamed from: k4 */
    private double f26396k4;

    /* JADX INFO: renamed from: kk */
    private double f26397kk;

    /* JADX INFO: renamed from: ks */
    private String f26398ks;

    /* JADX INFO: renamed from: m9 */
    private String f26399m9;

    /* JADX INFO: renamed from: ne */
    private eyu f26400ne;

    /* JADX INFO: renamed from: rv */
    private boolean f26401rv;

    /* JADX INFO: renamed from: to */
    private double f26402to;

    /* JADX INFO: renamed from: up */
    private long f26403up;

    /* JADX INFO: renamed from: x1 */
    private double f26404x1;

    /* JADX INFO: renamed from: x6 */
    private String f26405x6;

    /* JADX INFO: renamed from: yj */
    private boolean f26406yj;

    public lma() {
        m36243x1();
    }

    public lma(final AbstractC13912i5 abstractC13912i5) {
        m36243x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lma.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (lma.f26387u4.m27428k4(str)) {
                    case 0:
                        lma.this.f26396k4 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 1:
                        lma.this.f26404x1 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 2:
                        lma.this.f26397kk = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 3:
                        lma.this.f26402to = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 4:
                        lma.this.f26390du = str2;
                        break;
                    case 5:
                        lma.this.f26393h4 = str2;
                        break;
                    case 6:
                        lma.this.f26399m9 = str2;
                        break;
                    case 7:
                        lma.this.f26391dy = str2;
                        break;
                    case 8:
                        lma.this.f26388c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        lma.this.f26395jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        lma.this.f26389ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        lma.this.f26392fa = C13850af.m65068c5(str2);
                        break;
                    case 12:
                        lma.this.f26403up = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 13:
                        lma.this.f26406yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        lma.this.f26398ks = str2;
                        break;
                    case 15:
                        lma.this.f26401rv = C13850af.m65068c5(str2);
                        break;
                    case 16:
                        lma.this.f26405x6 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lma.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = lma.f26387u4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 17) {
                    lma.this.f26400ne = new eyu(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 18) {
                    return false;
                }
                lma.this.f26394ix = new hec(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m36243x1() {
        this.f26396k4 = Double.NaN;
        this.f26404x1 = Double.NaN;
        this.f26397kk = Double.NaN;
        this.f26402to = Double.NaN;
        this.f26388c5 = false;
        this.f26395jd = 4294967295L;
        this.f26389ck = true;
        this.f26392fa = false;
        this.f26403up = 0L;
        this.f26406yj = true;
        this.f26401rv = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("form:value", C13850af.m65101k4(this.f26396k4));
        c3059ii.m12955x1("form:current-value", C13850af.m65101k4(this.f26404x1));
        c3059ii.m12955x1("form:min-value", C13850af.m65101k4(this.f26397kk));
        c3059ii.m12955x1("form:max-value", C13850af.m65101k4(this.f26402to));
        String str3 = this.f26390du;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f26393h4;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f26399m9);
        String str5 = this.f26391dy;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f26388c5;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f26395jd;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:max-length", C13850af.m65147x1(j));
        }
        boolean z2 = this.f26389ck;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f26392fa;
        if (z3) {
            c3059ii.m12955x1("form:readonly", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f26403up;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z4 = this.f26406yj;
        if (!z4) {
            c3059ii.m12955x1("form:tab-stop", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f26398ks;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        boolean z5 = this.f26401rv;
        if (z5) {
            if (z5) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:convert-empty-to-null", str6);
        }
        String str8 = this.f26405x6;
        if (str8 != null) {
            c3059ii.m12955x1("form:data-field", str8);
        }
        eyu eyuVar = this.f26400ne;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f26394ix;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
