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
public class qma extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f28929dy = new C7017h4("table:bind-styles-to-content", "table:target-range-address", "table:case-sensitive", "table:language", "table:country", "table:algorithm", "sort-by");

    /* JADX INFO: renamed from: du */
    private String f28930du;

    /* JADX INFO: renamed from: h4 */
    private String f28931h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f28932k4;

    /* JADX INFO: renamed from: kk */
    private boolean f28933kk;

    /* JADX INFO: renamed from: m9 */
    private List<jk9> f28934m9;

    /* JADX INFO: renamed from: to */
    private String f28935to;

    /* JADX INFO: renamed from: x1 */
    private String f28936x1;

    public qma() {
        m39572x1();
    }

    public qma(final AbstractC13912i5 abstractC13912i5) {
        m39572x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qma.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qma.f28929dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    qma.this.f28932k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    qma.this.f28936x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    qma.this.f28933kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    qma.this.f28935to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    qma.this.f28930du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                qma.this.f28931h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qma.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (qma.f28929dy.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                qma.this.f28934m9.addItem(new jk9(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39572x1() {
        this.f28932k4 = true;
        this.f28934m9 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28932k4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("table:bind-styles-to-content", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f28936x1;
        if (str4 != null) {
            c3059ii.m12955x1("table:target-range-address", str4);
        }
        if (this.f28933kk) {
            str3 = TelemetryEventStrings.Value.TRUE;
        }
        c3059ii.m12955x1("table:case-sensitive", str3);
        String str5 = this.f28935to;
        if (str5 != null) {
            c3059ii.m12955x1("table:language", str5);
        }
        String str6 = this.f28930du;
        if (str6 != null) {
            c3059ii.m12955x1("table:country", str6);
        }
        String str7 = this.f28931h4;
        if (str7 != null) {
            c3059ii.m12955x1("table:algorithm", str7);
        }
        List.Enumerator<jk9> it = this.f28934m9.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("table", c3059ii, "sort-by");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
