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
public class h3w extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23854kk = new C7017h4("table:track-changes", "cell-content-change", "insertion", "deletion", "movement");

    /* JADX INFO: renamed from: k4 */
    private boolean f23855k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f23856x1;

    public h3w() {
        m33060x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m33060x1() {
        this.f23855k4 = false;
        this.f23856x1 = new List<>();
    }

    public h3w(final AbstractC13912i5 abstractC13912i5) {
        m33060x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h3w.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (h3w.f23854kk.m27428k4(str) != 0) {
                    return false;
                }
                h3w.this.f23855k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.h3w.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = h3w.f23854kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    azg azgVar = new azg(abstractC13912i5);
                    list = h3w.this.f23856x1;
                    c7394ca = new C7394ca("cell-content-change", azgVar);
                } else if (iM27428k4 == 2) {
                    xps xpsVar = new xps(abstractC13912i5);
                    list = h3w.this.f23856x1;
                    c7394ca = new C7394ca("insertion", xpsVar);
                } else if (iM27428k4 == 3) {
                    tbt tbtVar = new tbt(abstractC13912i5);
                    list = h3w.this.f23856x1;
                    c7394ca = new C7394ca("deletion", tbtVar);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    itd itdVar = new itd(abstractC13912i5);
                    list = h3w.this.f23856x1;
                    c7394ca = new C7394ca("movement", itdVar);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f23855k4;
        if (z) {
            c3059ii.m12955x1("table:track-changes", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        List.Enumerator<C7394ca> it = this.f23856x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f23854kk.m27428k4(next.m29539k4());
                if (iM27428k4 == 1) {
                    ((azg) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((xps) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((tbt) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((itd) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
