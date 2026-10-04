package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class a5o extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f19846to = new C7017h4("table:title", "table:display", ContextChain.TAG_PRODUCT);

    /* JADX INFO: renamed from: k4 */
    private String f19847k4;

    /* JADX INFO: renamed from: kk */
    private List<ok7> f19848kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f19849x1;

    public a5o() {
        m27953x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m27953x1() {
        this.f19849x1 = false;
        this.f19848kk = new List<>();
    }

    public a5o(final AbstractC13912i5 abstractC13912i5) {
        m27953x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a5o.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = a5o.f19846to.m27428k4(str);
                if (iM27428k4 == 0) {
                    a5o.this.f19847k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                a5o.this.f19849x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.a5o.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (a5o.f19846to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                a5o.this.f19848kk.addItem(new ok7(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f19847k4;
        if (str3 != null) {
            c3059ii.m12955x1("table:title", str3);
        }
        boolean z = this.f19849x1;
        if (z) {
            c3059ii.m12955x1("table:display", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        List.Enumerator<ok7> it = this.f19848kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, ContextChain.TAG_PRODUCT);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
