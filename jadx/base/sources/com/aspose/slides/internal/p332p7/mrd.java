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
public class mrd extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26968kk = new C7017h4("table:display", "table-row-group", "table-rows", "table-row", "table-header-rows", "soft-page-break");

    /* JADX INFO: renamed from: k4 */
    private boolean f26969k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f26970x1;

    public mrd() {
        m37075kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m37075kk() {
        this.f26969k4 = true;
        this.f26970x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m37077k4() {
        return this.f26970x1;
    }

    public mrd(final AbstractC13912i5 abstractC13912i5) {
        m37075kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mrd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (mrd.f26968kk.m27428k4(str) != 0) {
                    return false;
                }
                mrd.this.f26969k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mrd.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = mrd.f26968kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    mrd mrdVar = new mrd(abstractC13912i5);
                    list = mrd.this.f26970x1;
                    c7394ca = new C7394ca("table-row-group", mrdVar);
                } else if (iM27428k4 == 2) {
                    awn awnVar = new awn(abstractC13912i5);
                    list = mrd.this.f26970x1;
                    c7394ca = new C7394ca("table-rows", awnVar);
                } else if (iM27428k4 == 3) {
                    exz exzVar = new exz(abstractC13912i5);
                    list = mrd.this.f26970x1;
                    c7394ca = new C7394ca("table-row", exzVar);
                } else if (iM27428k4 == 4) {
                    hi8 hi8Var = new hi8(abstractC13912i5);
                    list = mrd.this.f26970x1;
                    c7394ca = new C7394ca("table-header-rows", hi8Var);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    tfm tfmVar = new tfm(abstractC13912i5);
                    list = mrd.this.f26970x1;
                    c7394ca = new C7394ca("soft-page-break", tfmVar);
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
        boolean z = this.f26969k4;
        if (!z) {
            c3059ii.m12955x1("table:display", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        List.Enumerator<C7394ca> it = this.f26970x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f26968kk.m27428k4(next.m29539k4());
                if (iM27428k4 == 1) {
                    ((mrd) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((awn) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((exz) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((hi8) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((tfm) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
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
