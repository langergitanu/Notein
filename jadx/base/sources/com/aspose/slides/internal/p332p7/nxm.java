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
public class nxm extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27626kk = new C7017h4("text:track-changes", "changed-region");

    /* JADX INFO: renamed from: k4 */
    private boolean f27627k4;

    /* JADX INFO: renamed from: x1 */
    private List<uz3> f27628x1;

    public nxm() {
        m37906x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m37906x1() {
        this.f27627k4 = true;
        this.f27628x1 = new List<>();
    }

    public nxm(final AbstractC13912i5 abstractC13912i5) {
        m37906x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nxm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (nxm.f27626kk.m27428k4(str) != 0) {
                    return false;
                }
                nxm.this.f27627k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nxm.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (nxm.f27626kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                nxm.this.f27628x1.addItem(new uz3(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f27627k4;
        if (!z) {
            c3059ii.m12955x1("text:track-changes", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        List.Enumerator<uz3> it = this.f27628x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "changed-region");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
