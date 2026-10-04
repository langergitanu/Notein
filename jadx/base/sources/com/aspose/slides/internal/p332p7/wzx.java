package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class wzx extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f32674to = new C7017h4("varScale", "scale", "origin");

    /* JADX INFO: renamed from: k4 */
    private boolean f32675k4;

    /* JADX INFO: renamed from: kk */
    private C9391zp f32676kk;

    /* JADX INFO: renamed from: x1 */
    private C8953uh f32677x1;

    public wzx() {
        m44147du();
        this.f32677x1 = new C8953uh();
        this.f32676kk = new C9391zp();
    }

    /* JADX INFO: renamed from: du */
    private void m44147du() {
        this.f32675k4 = false;
    }

    /* JADX INFO: renamed from: kk */
    public final C9391zp m44154kk() {
        return this.f32676kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8953uh m44155x1() {
        return this.f32677x1;
    }

    public wzx(final AbstractC13912i5 abstractC13912i5) {
        m44147du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wzx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (wzx.f32674to.m27428k4(str) != 0) {
                    return false;
                }
                wzx.this.f32675k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wzx.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = wzx.f32674to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    wzx.this.f32677x1 = new C8953uh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    wzx.this.f32676kk = new C9391zp(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32675k4;
        if (z) {
            c3059ii.m12955x1("varScale", z ? "1" : "0");
        }
        this.f32677x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "scale");
        this.f32676kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "origin");
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44152k4(boolean z) {
        this.f32675k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m44153k4() {
        return this.f32675k4;
    }
}
