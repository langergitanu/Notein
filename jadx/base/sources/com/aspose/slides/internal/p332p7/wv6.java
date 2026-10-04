package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class wv6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f32609to = new C7017h4("form:automatic-focus", "form:apply-design-mode", "form", "model");

    /* JADX INFO: renamed from: k4 */
    private boolean f32610k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f32611kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f32612x1;

    public wv6() {
        m44088x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m44088x1() {
        this.f32610k4 = false;
        this.f32612x1 = true;
        this.f32611kk = new List<>();
    }

    public wv6(AbstractC13912i5 abstractC13912i5) {
        m44088x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wv6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wv6.f32609to.m27428k4(str);
                if (iM27428k4 == 0) {
                    wv6.this.f32610k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                wv6.this.f32612x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f32609to.m27428k4(abstractC13912i5.mo65023fa());
                        if (iM27428k4 == 2) {
                            this.f32611kk.addItem(new C7394ca("form", new euh(abstractC13912i5)));
                            break;
                        }
                        if (iM27428k4 != 3) {
                            abstractC13912i5.mo65208bv();
                        } else {
                            this.f32611kk.addItem(new C7394ca("model", new sil(abstractC13912i5)));
                        }
                        if (abstractC13912i5.mo65015ar()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32610k4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:automatic-focus", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f32612x1;
        if (!z2) {
            if (z2) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:apply-design-mode", str3);
        }
        List.Enumerator<C7394ca> it = this.f32611kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f32609to.m27428k4(next.m29539k4());
                if (iM27428k4 == 2) {
                    ((euh) next.m29541kk()).mo6846k4("form", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((sil) next.m29541kk()).mo6846k4("xforms", c3059ii, next.m29539k4());
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
