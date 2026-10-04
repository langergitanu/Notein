package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class nd1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f27245k4 = x2o.m44178k4("3TrafficLights1");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f27246m9 = new C7017h4("iconSet", "showValue", "percent", "reverse", "cfvo");

    /* JADX INFO: renamed from: du */
    private boolean f27247du;

    /* JADX INFO: renamed from: h4 */
    private List<jio> f27248h4;

    /* JADX INFO: renamed from: kk */
    private boolean f27249kk;

    /* JADX INFO: renamed from: to */
    private boolean f27250to;

    /* JADX INFO: renamed from: x1 */
    private int f27251x1;

    public nd1() {
        m37434x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m37434x1() {
        this.f27251x1 = f27245k4;
        this.f27249kk = true;
        this.f27250to = true;
        this.f27247du = false;
        this.f27248h4 = new List<>();
    }

    public nd1(final AbstractC13912i5 abstractC13912i5) {
        m37434x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nd1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = nd1.f27246m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    nd1.this.f27251x1 = x2o.m44178k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    nd1.this.f27249kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    nd1.this.f27250to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                nd1.this.f27247du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nd1.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (nd1.f27246m9.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                nd1.this.f27248h4.addItem(new jio(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f27251x1;
        if (i != f27245k4) {
            c3059ii.m12955x1("iconSet", x2o.m44179k4(i));
        }
        boolean z = this.f27249kk;
        if (!z) {
            c3059ii.m12955x1("showValue", z ? "1" : "0");
        }
        boolean z2 = this.f27250to;
        if (!z2) {
            c3059ii.m12955x1("percent", z2 ? "1" : "0");
        }
        boolean z3 = this.f27247du;
        if (z3) {
            c3059ii.m12955x1("reverse", z3 ? "1" : "0");
        }
        List.Enumerator<jio> it = this.f27248h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "cfvo");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
