package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class wkx extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32344x1 = new C7017h4("patternFill", "gradientFill");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f32345k4;

    public wkx() {
    }

    public wkx(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wkx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                wkx wkxVar;
                C7394ca c7394ca;
                int iM27428k4 = wkx.f32344x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    wkxVar = wkx.this;
                    c7394ca = new C7394ca("patternFill", new ech(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    wkxVar = wkx.this;
                    c7394ca = new C7394ca("gradientFill", new gi8(abstractC13912i5));
                }
                wkxVar.f32345k4 = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f32345k4;
        if (c7394ca != null) {
            int iM27428k4 = f32344x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((ech) this.f32345k4.m29541kk()).mo6846k4("ssml", c3059ii, this.f32345k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((gi8) this.f32345k4.m29541kk()).mo6846k4("ssml", c3059ii, this.f32345k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
