package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hn */
/* JADX INFO: loaded from: classes4.dex */
public class C7868hn extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24227x1 = new C7017h4("effectLst", "effectDag");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f24228k4;

    public C7868hn() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m33526k4() {
        return this.f24228k4;
    }

    public C7868hn(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7868hn c7868hn;
                C7394ca c7394ca;
                int iM27428k4 = C7868hn.f24227x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c7868hn = C7868hn.this;
                    c7394ca = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    c7868hn = C7868hn.this;
                    c7394ca = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                }
                c7868hn.f24228k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m33527k4(String str) {
        C7394ca c7394ca;
        if (this.f24228k4 != null) {
            throw new Exception("EffectProperties already is initialized.");
        }
        int iM27428k4 = f24227x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("effectLst", new C8490p3());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectDag", new C9295yl());
        }
        this.f24228k4 = c7394ca;
        return this.f24228k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f24228k4;
        if (c7394ca != null) {
            int iM27428k4 = f24227x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C8490p3) this.f24228k4.m29541kk()).mo6846k4("a", c3059ii, this.f24228k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C9295yl) this.f24228k4.m29541kk()).mo6846k4("a", c3059ii, this.f24228k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
