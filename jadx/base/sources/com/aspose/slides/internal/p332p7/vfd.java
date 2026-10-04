package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class vfd extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31853to = new C7017h4("sdtPr", "sdtEndPr", "sdtContent");

    /* JADX INFO: renamed from: k4 */
    private e3d f31854k4;

    /* JADX INFO: renamed from: kk */
    private khn f31855kk;

    /* JADX INFO: renamed from: x1 */
    private ut6 f31856x1;

    public vfd() {
    }

    public vfd(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vfd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = vfd.f31853to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    vfd.this.f31854k4 = new e3d(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    vfd.this.f31856x1 = new ut6(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    vfd.this.f31855kk = new khn(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        e3d e3dVar = this.f31854k4;
        if (e3dVar != null) {
            e3dVar.mo6846k4("w", c3059ii, "sdtPr");
        }
        ut6 ut6Var = this.f31856x1;
        if (ut6Var != null) {
            ut6Var.mo6846k4("w", c3059ii, "sdtEndPr");
        }
        khn khnVar = this.f31855kk;
        if (khnVar != null) {
            khnVar.mo6846k4("w", c3059ii, "sdtContent");
        }
        c3059ii.mo21898jd();
    }
}
