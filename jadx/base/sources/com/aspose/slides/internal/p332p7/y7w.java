package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class y7w extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33248to = new C7017h4("size", "sizeAuto", "default", "checked");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f33249k4;

    /* JADX INFO: renamed from: kk */
    private vsx f33250kk;

    /* JADX INFO: renamed from: x1 */
    private vsx f33251x1;

    public y7w() {
    }

    public y7w(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.y7w.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                y7w y7wVar;
                C7394ca c7394ca;
                int iM27428k4 = y7w.f33248to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    y7wVar = y7w.this;
                    c7394ca = new C7394ca("size", new yd6(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        if (iM27428k4 == 2) {
                            y7w.this.f33251x1 = new vsx(abstractC13912i5);
                        } else {
                            if (iM27428k4 != 3) {
                                return false;
                            }
                            y7w.this.f33250kk = new vsx(abstractC13912i5);
                        }
                        return true;
                    }
                    y7wVar = y7w.this;
                    c7394ca = new C7394ca("sizeAuto", new vsx(abstractC13912i5));
                }
                y7wVar.f33249k4 = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f33249k4;
        if (c7394ca != null) {
            int iM27428k4 = f33248to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((yd6) this.f33249k4.m29541kk()).mo6846k4("w", c3059ii, this.f33249k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((vsx) this.f33249k4.m29541kk()).mo6846k4("w", c3059ii, this.f33249k4.m29539k4());
            }
        }
        vsx vsxVar = this.f33251x1;
        if (vsxVar != null) {
            vsxVar.mo6846k4("w", c3059ii, "default");
        }
        vsx vsxVar2 = this.f33250kk;
        if (vsxVar2 != null) {
            vsxVar2.mo6846k4("w", c3059ii, "checked");
        }
        c3059ii.mo21898jd();
    }
}
