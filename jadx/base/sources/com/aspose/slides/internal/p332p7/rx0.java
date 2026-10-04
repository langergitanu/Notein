package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class rx0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f29771x1 = new C7017h4("cTn");

    /* JADX INFO: renamed from: k4 */
    private lmh f29772k4;

    public rx0() {
        this.f29772k4 = new lmh();
    }

    /* JADX INFO: renamed from: k4 */
    public final lmh m40596k4() {
        return this.f29772k4;
    }

    public rx0(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rx0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (rx0.f29771x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                rx0.this.f29772k4 = new lmh(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f29772k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cTn");
        c3059ii.mo21898jd();
    }
}
