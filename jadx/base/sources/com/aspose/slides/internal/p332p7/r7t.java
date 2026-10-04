package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class r7t extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f29197x1 = new C7017h4("rgb", "hsl");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f29198k4;

    public r7t() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m39904k4() {
        return this.f29198k4;
    }

    public r7t(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.r7t.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                r7t r7tVar;
                C7394ca c7394ca;
                int iM27428k4 = r7t.f29197x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    r7tVar = r7t.this;
                    c7394ca = new C7394ca("rgb", new zmd(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    r7tVar = r7t.this;
                    c7394ca = new C7394ca("hsl", new zny(abstractC13912i5));
                }
                r7tVar.f29198k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m39905k4(String str) {
        C7394ca c7394ca;
        if (this.f29198k4 != null) {
            throw new Exception("ColorTransform already is initialized.");
        }
        int iM27428k4 = f29197x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("rgb", new zmd());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("hsl", new zny());
        }
        this.f29198k4 = c7394ca;
        return this.f29198k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f29198k4;
        if (c7394ca != null) {
            int iM27428k4 = f29197x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((zmd) this.f29198k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f29198k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((zny) this.f29198k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f29198k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
