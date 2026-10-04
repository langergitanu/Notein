package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes4.dex */
public class eza extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private boolean f22568kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f22569to;

    /* JADX INFO: renamed from: x1 */
    private byte f22570x1;

    /* JADX INFO: renamed from: k4 */
    public static final byte f22567k4 = C7471dc.m30263k4(TranslateLanguage.GREEK);

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22566du = new C7017h4(C18437z2.f56754h, "backwards", "tmAbs", "tmPct");

    public eza() {
        m31489du();
    }

    /* JADX INFO: renamed from: du */
    private void m31489du() {
        this.f22570x1 = f22567k4;
        this.f22568kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m31494k4() {
        return this.f22570x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m31498kk() {
        return this.f22569to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m31499x1() {
        return this.f22568kk;
    }

    public eza(final AbstractC13912i5 abstractC13912i5) {
        m31489du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eza.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = eza.f22566du.m27428k4(str);
                if (iM27428k4 == 0) {
                    eza.this.f22570x1 = C7471dc.m30263k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                eza.this.f22568kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eza.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                eza ezaVar;
                C7394ca c7394ca;
                int iM27428k4 = eza.f22566du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    ezaVar = eza.this;
                    c7394ca = new C7394ca("tmAbs", new ks4(abstractC13912i5));
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    ezaVar = eza.this;
                    c7394ca = new C7394ca("tmPct", new fko(abstractC13912i5));
                }
                ezaVar.f22569to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m31495k4(String str) {
        C7394ca c7394ca;
        if (this.f22569to != null) {
            throw new Exception("IterateInterval already is initialized.");
        }
        int iM27428k4 = f22566du.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("tmAbs", new ks4());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("tmPct", new fko());
        }
        this.f22569to = c7394ca;
        return this.f22569to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31496k4(byte b) {
        this.f22570x1 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f22570x1;
        if (b != f22567k4) {
            c3059ii.m12955x1(C18437z2.f56754h, C7471dc.m30264k4(b));
        }
        boolean z = this.f22568kk;
        if (z) {
            c3059ii.m12955x1("backwards", z ? "1" : "0");
        }
        C7394ca c7394ca = this.f22569to;
        if (c7394ca != null) {
            int iM27428k4 = f22566du.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((ks4) this.f22569to.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22569to.m29539k4());
            } else if (iM27428k4 == 3) {
                ((fko) this.f22569to.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22569to.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31497k4(boolean z) {
        this.f22568kk = z;
    }
}
