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
public class pbg extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f28344h4 = new C7017h4("table:bind-styles-to-content", "table:case-sensitive", "table:page-breaks-on-group-change", "sort-groups", "subtotal-rule");

    /* JADX INFO: renamed from: du */
    private List<eh0> f28345du;

    /* JADX INFO: renamed from: k4 */
    private boolean f28346k4;

    /* JADX INFO: renamed from: kk */
    private boolean f28347kk;

    /* JADX INFO: renamed from: to */
    private nlj f28348to;

    /* JADX INFO: renamed from: x1 */
    private boolean f28349x1;

    public pbg() {
        m38786x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38786x1() {
        this.f28346k4 = true;
        this.f28347kk = false;
        this.f28345du = new List<>();
    }

    public pbg(final AbstractC13912i5 abstractC13912i5) {
        m38786x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pbg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = pbg.f28344h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    pbg.this.f28346k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    pbg.this.f28349x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                pbg.this.f28347kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pbg.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = pbg.f28344h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    pbg.this.f28348to = new nlj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                pbg.this.f28345du.addItem(new eh0(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28346k4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("table:bind-styles-to-content", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("table:case-sensitive", this.f28349x1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        boolean z2 = this.f28347kk;
        if (z2) {
            if (z2) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:page-breaks-on-group-change", str3);
        }
        nlj nljVar = this.f28348to;
        if (nljVar != null) {
            nljVar.mo6846k4("table", c3059ii, "sort-groups");
        }
        List.Enumerator<eh0> it = this.f28345du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("table", c3059ii, "subtotal-rule");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
