package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class jdt extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f25096k4 = gfe.m32498k4("both");

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f25097up = new C7017h4("table:name", "table:application-data", "table:grand-total", "table:ignore-empty-rows", "table:identify-categories", "table:target-range-address", "table:buttons", "table:show-filter-button", "table:drill-down-on-double-click", "database-source-sql", "database-source-query", "database-source-table", "source-service", "source-cell-range", "data-pilot-field");

    /* JADX INFO: renamed from: c5 */
    private boolean f25098c5;

    /* JADX INFO: renamed from: ck */
    private C7394ca f25099ck;

    /* JADX INFO: renamed from: du */
    private boolean f25100du;

    /* JADX INFO: renamed from: dy */
    private String f25101dy;

    /* JADX INFO: renamed from: fa */
    private List<nii> f25102fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f25103h4;

    /* JADX INFO: renamed from: jd */
    private boolean f25104jd;

    /* JADX INFO: renamed from: kk */
    private String f25105kk;

    /* JADX INFO: renamed from: m9 */
    private String f25106m9;

    /* JADX INFO: renamed from: to */
    private int f25107to;

    /* JADX INFO: renamed from: x1 */
    private String f25108x1;

    public jdt() {
        m34669x1();
    }

    public jdt(final AbstractC13912i5 abstractC13912i5) {
        m34669x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jdt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (jdt.f25097up.m27428k4(str)) {
                    case 0:
                        jdt.this.f25108x1 = str2;
                        break;
                    case 1:
                        jdt.this.f25105kk = str2;
                        break;
                    case 2:
                        jdt.this.f25107to = gfe.m32498k4(str2);
                        break;
                    case 3:
                        jdt.this.f25100du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        jdt.this.f25103h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        jdt.this.f25106m9 = str2;
                        break;
                    case 6:
                        jdt.this.f25101dy = str2;
                        break;
                    case 7:
                        jdt.this.f25098c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        jdt.this.f25104jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jdt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                jdt jdtVar;
                C7394ca c7394ca;
                switch (jdt.f25097up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        jdtVar = jdt.this;
                        c7394ca = new C7394ca("database-source-sql", new zhi(abstractC13912i5));
                        break;
                    case 10:
                        jdtVar = jdt.this;
                        c7394ca = new C7394ca("database-source-query", new b2l(abstractC13912i5));
                        break;
                    case 11:
                        jdtVar = jdt.this;
                        c7394ca = new C7394ca("database-source-table", new n9i(abstractC13912i5));
                        break;
                    case 12:
                        jdtVar = jdt.this;
                        c7394ca = new C7394ca("source-service", new cdv(abstractC13912i5));
                        break;
                    case 13:
                        jdtVar = jdt.this;
                        c7394ca = new C7394ca("source-cell-range", new hgt(abstractC13912i5));
                        break;
                    case 14:
                        jdt.this.f25102fa.addItem(new nii(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
                jdtVar.f25099ck = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m34669x1() {
        this.f25107to = f25096k4;
        this.f25100du = false;
        this.f25103h4 = false;
        this.f25098c5 = true;
        this.f25104jd = true;
        this.f25102fa = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f25108x1);
        String str3 = this.f25105kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:application-data", str3);
        }
        int i = this.f25107to;
        if (i != f25096k4) {
            c3059ii.m12955x1("table:grand-total", gfe.m32499k4(i));
        }
        boolean z = this.f25100du;
        String str4 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("table:ignore-empty-rows", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f25103h4;
        if (z2) {
            c3059ii.m12955x1("table:identify-categories", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("table:target-range-address", this.f25106m9);
        String str5 = this.f25101dy;
        if (str5 != null) {
            c3059ii.m12955x1("table:buttons", str5);
        }
        boolean z3 = this.f25098c5;
        if (!z3) {
            c3059ii.m12955x1("table:show-filter-button", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f25104jd;
        if (!z4) {
            if (z4) {
                str4 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:drill-down-on-double-click", str4);
        }
        C7394ca c7394ca = this.f25099ck;
        if (c7394ca != null) {
            switch (f25097up.m27428k4(c7394ca.m29539k4())) {
                case 9:
                    ((zhi) this.f25099ck.m29541kk()).mo6846k4("table", c3059ii, this.f25099ck.m29539k4());
                    break;
                case 10:
                    ((b2l) this.f25099ck.m29541kk()).mo6846k4("table", c3059ii, this.f25099ck.m29539k4());
                    break;
                case 11:
                    ((n9i) this.f25099ck.m29541kk()).mo6846k4("table", c3059ii, this.f25099ck.m29539k4());
                    break;
                case 12:
                    ((cdv) this.f25099ck.m29541kk()).mo6846k4("table", c3059ii, this.f25099ck.m29539k4());
                    break;
                case 13:
                    ((hgt) this.f25099ck.m29541kk()).mo6846k4("table", c3059ii, this.f25099ck.m29539k4());
                    break;
            }
        }
        List.Enumerator<nii> it = this.f25102fa.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("table", c3059ii, "data-pilot-field");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
