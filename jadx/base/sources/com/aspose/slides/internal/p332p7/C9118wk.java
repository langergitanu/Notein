package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wk */
/* JADX INFO: loaded from: classes4.dex */
public class C9118wk extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32340x1 = new C7017h4("spcPct", "spcPts");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f32341k4;

    public C9118wk() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m43740k4() {
        return this.f32341k4;
    }

    public C9118wk(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9118wk c9118wk;
                C7394ca c7394ca;
                int iM27428k4 = C9118wk.f32340x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c9118wk = C9118wk.this;
                    c7394ca = new C7394ca("spcPct", new C9178x7(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    c9118wk = C9118wk.this;
                    c7394ca = new C7394ca("spcPts", new C7220a8(abstractC13912i5));
                }
                c9118wk.f32341k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m43741k4(String str) {
        C7394ca c7394ca;
        if (this.f32341k4 != null) {
            throw new Exception("TextSpacing already is initialized.");
        }
        int iM27428k4 = f32340x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("spcPct", new C9178x7());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("spcPts", new C7220a8());
        }
        this.f32341k4 = c7394ca;
        return this.f32341k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f32341k4;
        if (c7394ca != null) {
            int iM27428k4 = f32340x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C9178x7) this.f32341k4.m29541kk()).mo6846k4("a", c3059ii, this.f32341k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C7220a8) this.f32341k4.m29541kk()).mo6846k4("a", c3059ii, this.f32341k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
