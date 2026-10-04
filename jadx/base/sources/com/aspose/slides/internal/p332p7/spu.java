package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class spu extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f30292dy = new C7017h4("font", "numFmt", "fill", "alignment", "border", "protection", "extLst");

    /* JADX INFO: renamed from: du */
    private ljv f30293du;

    /* JADX INFO: renamed from: h4 */
    private ld2 f30294h4;

    /* JADX INFO: renamed from: k4 */
    private pk1 f30295k4;

    /* JADX INFO: renamed from: kk */
    private wkx f30296kk;

    /* JADX INFO: renamed from: m9 */
    private g3j f30297m9;

    /* JADX INFO: renamed from: to */
    private in8 f30298to;

    /* JADX INFO: renamed from: x1 */
    private ilt f30299x1;

    public spu() {
    }

    public spu(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.spu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (spu.f30292dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        spu.this.f30295k4 = new pk1(abstractC13912i5);
                        return true;
                    case 1:
                        spu.this.f30299x1 = new ilt(abstractC13912i5);
                        return true;
                    case 2:
                        spu.this.f30296kk = new wkx(abstractC13912i5);
                        return true;
                    case 3:
                        spu.this.f30298to = new in8(abstractC13912i5);
                        return true;
                    case 4:
                        spu.this.f30293du = new ljv(abstractC13912i5);
                        return true;
                    case 5:
                        spu.this.f30294h4 = new ld2(abstractC13912i5);
                        return true;
                    case 6:
                        spu.this.f30297m9 = new g3j(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        pk1 pk1Var = this.f30295k4;
        if (pk1Var != null) {
            pk1Var.mo6846k4("ssml", c3059ii, "font");
        }
        ilt iltVar = this.f30299x1;
        if (iltVar != null) {
            iltVar.mo6846k4("ssml", c3059ii, "numFmt");
        }
        wkx wkxVar = this.f30296kk;
        if (wkxVar != null) {
            wkxVar.mo6846k4("ssml", c3059ii, "fill");
        }
        in8 in8Var = this.f30298to;
        if (in8Var != null) {
            in8Var.mo6846k4("ssml", c3059ii, "alignment");
        }
        ljv ljvVar = this.f30293du;
        if (ljvVar != null) {
            ljvVar.mo6846k4("ssml", c3059ii, "border");
        }
        ld2 ld2Var = this.f30294h4;
        if (ld2Var != null) {
            ld2Var.mo6846k4("ssml", c3059ii, "protection");
        }
        g3j g3jVar = this.f30297m9;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
