package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes4.dex */
public class wx1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f32622ks = new C7017h4("table:name", "table:is-selection", "table:on-update-keep-styles", "table:on-update-keep-size", "table:has-persistent-data", "table:orientation", "table:contains-header", "table:display-filter-buttons", "table:target-range-address", "table:refresh-delay", "database-source-sql", "database-source-query", "database-source-table", "filter", NoteMeta.PROPERTY_SORT_KEY, "subtotal-rules");

    /* JADX INFO: renamed from: c5 */
    private String f32623c5;

    /* JADX INFO: renamed from: ck */
    private C7394ca f32624ck;

    /* JADX INFO: renamed from: du */
    private boolean f32625du;

    /* JADX INFO: renamed from: dy */
    private boolean f32626dy;

    /* JADX INFO: renamed from: fa */
    private ku2 f32627fa;

    /* JADX INFO: renamed from: h4 */
    private int f32628h4;

    /* JADX INFO: renamed from: jd */
    private boolean f32629jd;

    /* JADX INFO: renamed from: k4 */
    private String f32630k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32631kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f32632m9;

    /* JADX INFO: renamed from: to */
    private boolean f32633to;

    /* JADX INFO: renamed from: up */
    private qma f32634up;

    /* JADX INFO: renamed from: x1 */
    private boolean f32635x1;

    /* JADX INFO: renamed from: yj */
    private pbg f32636yj;

    public wx1() {
        m44112x1();
    }

    public wx1(final AbstractC13912i5 abstractC13912i5) {
        m44112x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wx1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (wx1.f32622ks.m27428k4(str)) {
                    case 0:
                        wx1.this.f32630k4 = str2;
                        break;
                    case 1:
                        wx1.this.f32635x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        wx1.this.f32631kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        wx1.this.f32633to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        wx1.this.f32625du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        wx1.this.f32628h4 = c0l.m29347k4(str2);
                        break;
                    case 6:
                        wx1.this.f32632m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        wx1.this.f32626dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        wx1.this.f32623c5 = str2;
                        break;
                    case 9:
                        wx1.this.f32629jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wx1.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                wx1 wx1Var;
                C7394ca c7394ca;
                switch (wx1.f32622ks.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 10:
                        wx1Var = wx1.this;
                        c7394ca = new C7394ca("database-source-sql", new zhi(abstractC13912i5));
                        break;
                    case 11:
                        wx1Var = wx1.this;
                        c7394ca = new C7394ca("database-source-query", new b2l(abstractC13912i5));
                        break;
                    case 12:
                        wx1Var = wx1.this;
                        c7394ca = new C7394ca("database-source-table", new n9i(abstractC13912i5));
                        break;
                    case 13:
                        wx1.this.f32627fa = new ku2(abstractC13912i5);
                        return true;
                    case 14:
                        wx1.this.f32634up = new qma(abstractC13912i5);
                        return true;
                    case 15:
                        wx1.this.f32636yj = new pbg(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                wx1Var.f32624ck = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44112x1() {
        this.f32635x1 = false;
        this.f32631kk = false;
        this.f32633to = true;
        this.f32625du = true;
        this.f32628h4 = 0;
        this.f32632m9 = true;
        this.f32626dy = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f32630k4);
        boolean z = this.f32635x1;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("table:is-selection", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f32631kk;
        if (z2) {
            c3059ii.m12955x1("table:on-update-keep-styles", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f32633to;
        if (!z3) {
            c3059ii.m12955x1("table:on-update-keep-size", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f32625du;
        if (!z4) {
            c3059ii.m12955x1("table:has-persistent-data", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("table:orientation", c0l.m29348k4(this.f32628h4));
        boolean z5 = this.f32632m9;
        if (!z5) {
            c3059ii.m12955x1("table:contains-header", z5 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z6 = this.f32626dy;
        if (z6) {
            c3059ii.m12955x1("table:display-filter-buttons", z6 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("table:target-range-address", this.f32623c5);
        if (this.f32629jd) {
            str3 = TelemetryEventStrings.Value.TRUE;
        }
        c3059ii.m12955x1("table:refresh-delay", str3);
        C7394ca c7394ca = this.f32624ck;
        if (c7394ca != null) {
            switch (f32622ks.m27428k4(c7394ca.m29539k4())) {
                case 10:
                    ((zhi) this.f32624ck.m29541kk()).mo6846k4("table", c3059ii, this.f32624ck.m29539k4());
                    break;
                case 11:
                    ((b2l) this.f32624ck.m29541kk()).mo6846k4("table", c3059ii, this.f32624ck.m29539k4());
                    break;
                case 12:
                    ((n9i) this.f32624ck.m29541kk()).mo6846k4("table", c3059ii, this.f32624ck.m29539k4());
                    break;
            }
        }
        ku2 ku2Var = this.f32627fa;
        if (ku2Var != null) {
            ku2Var.mo6846k4("table", c3059ii, "filter");
        }
        qma qmaVar = this.f32634up;
        if (qmaVar != null) {
            qmaVar.mo6846k4("table", c3059ii, NoteMeta.PROPERTY_SORT_KEY);
        }
        pbg pbgVar = this.f32636yj;
        if (pbgVar != null) {
            pbgVar.mo6846k4("table", c3059ii, "subtotal-rules");
        }
        c3059ii.mo21898jd();
    }
}
