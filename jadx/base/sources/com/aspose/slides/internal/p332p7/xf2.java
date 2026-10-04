package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class xf2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32810kk = new C7017h4("rPr", "t");

    /* JADX INFO: renamed from: k4 */
    private jua f32811k4;

    /* JADX INFO: renamed from: x1 */
    private String f32812x1;

    public xf2() {
    }

    public xf2(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xf2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = xf2.f32810kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    xf2.this.f32811k4 = new jua(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    xf2.this.f32812x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            xf2 xf2Var = xf2.this;
                            xf2Var.f32812x1 = C14113y2.m67400k4(xf2Var.f32812x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m44329k4() {
        return this.f32812x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        jua juaVar = this.f32811k4;
        if (juaVar != null) {
            juaVar.mo6846k4("ssml", c3059ii, "rPr");
        }
        m29301k4("ssml", c3059ii, "t", this.f32812x1, true);
        c3059ii.mo21898jd();
    }
}
