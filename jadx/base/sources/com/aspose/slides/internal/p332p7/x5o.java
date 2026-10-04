package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class x5o extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32719kk = new C7017h4("loop", "snd");

    /* JADX INFO: renamed from: k4 */
    private boolean f32720k4;

    /* JADX INFO: renamed from: x1 */
    private C8528pk f32721x1;

    public x5o() {
        m44210to();
        this.f32721x1 = new C8528pk();
    }

    /* JADX INFO: renamed from: to */
    private void m44210to() {
        this.f32720k4 = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8528pk m44213x1() {
        return this.f32721x1;
    }

    public x5o(final AbstractC13912i5 abstractC13912i5) {
        m44210to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.x5o.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (x5o.f32719kk.m27428k4(str) != 0) {
                    return false;
                }
                x5o.this.f32720k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.x5o.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (x5o.f32719kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                x5o.this.f32721x1 = new C8528pk(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32720k4;
        if (z) {
            c3059ii.m12955x1("loop", z ? "1" : "0");
        }
        this.f32721x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "snd");
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44211k4(boolean z) {
        this.f32720k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m44212k4() {
        return this.f32720k4;
    }
}
