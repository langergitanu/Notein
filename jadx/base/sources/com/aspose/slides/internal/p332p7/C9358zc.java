package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zc */
/* JADX INFO: loaded from: classes4.dex */
public final class C9358zc extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33859to = new C7017h4("f", "dlblRangeCache", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f33860k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f33861kk;

    /* JADX INFO: renamed from: x1 */
    private C8012jk f33862x1;

    public C9358zc() {
    }

    /* JADX INFO: renamed from: x1 */
    public final C8012jk m45576x1() {
        return this.f33862x1;
    }

    public C9358zc(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9358zc.f33859to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9358zc.this.f33860k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C9358zc c9358zc = C9358zc.this;
                            c9358zc.f33860k4 = C14113y2.m67400k4(c9358zc.f33860k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    C9358zc.this.f33862x1 = new C8012jk(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9358zc.this.f33861kk = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m45575k4() {
        return this.f33860k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("c15", c3059ii, "f", this.f33860k4, false);
        C8012jk c8012jk = this.f33862x1;
        if (c8012jk != null) {
            c8012jk.mo6846k4("c15", c3059ii, "dlblRangeCache");
        }
        C7683fo c7683fo = this.f33861kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
