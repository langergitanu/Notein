package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class wz8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32657h4 = new C7017h4("snapToGrid", "snapToObjects", "showGuides", "cViewPr", "guideLst");

    /* JADX INFO: renamed from: du */
    private nmb f32658du;

    /* JADX INFO: renamed from: k4 */
    private boolean f32659k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32660kk;

    /* JADX INFO: renamed from: to */
    private wzx f32661to;

    /* JADX INFO: renamed from: x1 */
    private boolean f32662x1;

    public wz8() {
        m44133kk();
        this.f32661to = new wzx();
    }

    /* JADX INFO: renamed from: kk */
    private void m44133kk() {
        this.f32659k4 = true;
        this.f32662x1 = false;
        this.f32660kk = false;
    }

    public wz8(final AbstractC13912i5 abstractC13912i5) {
        m44133kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wz8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wz8.f32657h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    wz8.this.f32659k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    wz8.this.f32662x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                wz8.this.f32660kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wz8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = wz8.f32657h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    wz8.this.f32661to = new wzx(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                wz8.this.f32658du = new nmb(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final wzx m44137k4() {
        return this.f32661to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32659k4;
        if (!z) {
            c3059ii.m12955x1("snapToGrid", z ? "1" : "0");
        }
        boolean z2 = this.f32662x1;
        if (z2) {
            c3059ii.m12955x1("snapToObjects", z2 ? "1" : "0");
        }
        boolean z3 = this.f32660kk;
        if (z3) {
            c3059ii.m12955x1("showGuides", z3 ? "1" : "0");
        }
        this.f32661to.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cViewPr");
        nmb nmbVar = this.f32658du;
        if (nmbVar != null) {
            nmbVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "guideLst");
        }
        c3059ii.mo21898jd();
    }
}
