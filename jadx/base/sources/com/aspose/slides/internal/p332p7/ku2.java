package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class ku2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f25972k4 = cre.m29730k4("self");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f25973m9 = new C7017h4("table:target-range-address", "table:condition-source", "table:condition-source-range-address", "table:display-duplicates", "filter-condition", "filter-and", "filter-or");

    /* JADX INFO: renamed from: du */
    private boolean f25974du;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f25975h4;

    /* JADX INFO: renamed from: kk */
    private int f25976kk;

    /* JADX INFO: renamed from: to */
    private String f25977to;

    /* JADX INFO: renamed from: x1 */
    private String f25978x1;

    public ku2() {
        m35729x1();
    }

    public ku2(final AbstractC13912i5 abstractC13912i5) {
        m35729x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ku2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ku2.f25973m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ku2.this.f25978x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ku2.this.f25976kk = cre.m29730k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    ku2.this.f25977to = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                ku2.this.f25974du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ku2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                ku2 ku2Var;
                C7394ca c7394ca;
                int iM27428k4 = ku2.f25973m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    ku2Var = ku2.this;
                    c7394ca = new C7394ca("filter-condition", new a1l(abstractC13912i5));
                } else if (iM27428k4 == 5) {
                    ku2Var = ku2.this;
                    c7394ca = new C7394ca("filter-and", new vj6(abstractC13912i5));
                } else {
                    if (iM27428k4 != 6) {
                        return false;
                    }
                    ku2Var = ku2.this;
                    c7394ca = new C7394ca("filter-or", new gb2(abstractC13912i5));
                }
                ku2Var.f25975h4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m35729x1() {
        this.f25976kk = f25972k4;
        this.f25974du = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25978x1;
        if (str3 != null) {
            c3059ii.m12955x1("table:target-range-address", str3);
        }
        int i = this.f25976kk;
        if (i != f25972k4) {
            c3059ii.m12955x1("table:condition-source", cre.m29731k4(i));
        }
        String str4 = this.f25977to;
        if (str4 != null) {
            c3059ii.m12955x1("table:condition-source-range-address", str4);
        }
        boolean z = this.f25974du;
        if (!z) {
            c3059ii.m12955x1("table:display-duplicates", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        C7394ca c7394ca = this.f25975h4;
        if (c7394ca != null) {
            int iM27428k4 = f25973m9.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 4) {
                ((a1l) this.f25975h4.m29541kk()).mo6846k4("table", c3059ii, this.f25975h4.m29539k4());
            } else if (iM27428k4 == 5) {
                ((vj6) this.f25975h4.m29541kk()).mo6846k4("table", c3059ii, this.f25975h4.m29539k4());
            } else if (iM27428k4 == 6) {
                ((gb2) this.f25975h4.m29541kk()).mo6846k4("table", c3059ii, this.f25975h4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
