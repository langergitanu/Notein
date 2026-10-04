package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cu */
/* JADX INFO: loaded from: classes4.dex */
public class C7442cu extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21326kk = new C7017h4("ln", "effectLst", "effectDag");

    /* JADX INFO: renamed from: k4 */
    private C8985uy f21327k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f21328x1;

    public C7442cu() {
    }

    /* JADX INFO: renamed from: x1 */
    public final C8985uy m29912x1() {
        return this.f21327k4;
    }

    public C7442cu(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7442cu c7442cu;
                C7394ca c7394ca;
                int iM27428k4 = C7442cu.f21326kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 0) {
                    if (iM27428k4 == 1) {
                        c7442cu = C7442cu.this;
                        c7394ca = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                    } else {
                        if (iM27428k4 != 2) {
                            return false;
                        }
                        c7442cu = C7442cu.this;
                        c7394ca = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                    }
                    c7442cu.f21328x1 = c7394ca;
                } else {
                    C7442cu.this.f21327k4 = new C8985uy(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8985uy m29911k4() {
        if (this.f21327k4 != null) {
            throw new Exception("Only one <ln> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f21327k4 = c8985uy;
        return c8985uy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8985uy c8985uy = this.f21327k4;
        if (c8985uy != null) {
            c8985uy.mo6846k4("a", c3059ii, "ln");
        }
        C7394ca c7394ca = this.f21328x1;
        if (c7394ca != null) {
            int iM27428k4 = f21326kk.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((C8490p3) this.f21328x1.m29541kk()).mo6846k4("a", c3059ii, this.f21328x1.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C9295yl) this.f21328x1.m29541kk()).mo6846k4("a", c3059ii, this.f21328x1.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
