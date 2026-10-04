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
public class eck extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private List<ok7> f22073du;

    /* JADX INFO: renamed from: kk */
    private boolean f22074kk;

    /* JADX INFO: renamed from: to */
    private int f22075to;

    /* JADX INFO: renamed from: x1 */
    private String f22076x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f22072k4 = h1b.m33015k4("stop");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f22071h4 = new C7017h4("table:title", "table:display", "table:message-type", ContextChain.TAG_PRODUCT);

    public eck() {
        m30884x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30884x1() {
        this.f22074kk = false;
        this.f22075to = f22072k4;
        this.f22073du = new List<>();
    }

    public eck(final AbstractC13912i5 abstractC13912i5) {
        m30884x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eck.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = eck.f22071h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    eck.this.f22076x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    eck.this.f22074kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                eck.this.f22075to = h1b.m33015k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eck.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (eck.f22071h4.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                eck.this.f22073du.addItem(new ok7(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22076x1;
        if (str3 != null) {
            c3059ii.m12955x1("table:title", str3);
        }
        boolean z = this.f22074kk;
        if (z) {
            c3059ii.m12955x1("table:display", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f22075to;
        if (i != f22072k4) {
            c3059ii.m12955x1("table:message-type", h1b.m33016k4(i));
        }
        List.Enumerator<ok7> it = this.f22073du.iterator();
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
