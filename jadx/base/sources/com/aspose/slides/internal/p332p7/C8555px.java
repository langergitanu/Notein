package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.px */
/* JADX INFO: loaded from: classes4.dex */
public class C8555px extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28622to = new C7017h4("f", "multiLvlStrCache", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f28623k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f28624kk;

    /* JADX INFO: renamed from: x1 */
    private C9240xx f28625x1;

    public C8555px() {
    }

    /* JADX INFO: renamed from: kk */
    public final C9240xx m39182kk() {
        return this.f28625x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m39183to() {
        return this.f28624kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39184x1() {
        return this.f28623k4;
    }

    public C8555px(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.px.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8555px.f28622to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8555px.this.f28623k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8555px c8555px = C8555px.this;
                            c8555px.f28623k4 = C14113y2.m67400k4(c8555px.f28623k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    C8555px.this.f28625x1 = new C9240xx(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8555px.this.f28624kk = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9240xx m39180k4() {
        if (this.f28625x1 != null) {
            throw new Exception("Only one <multiLvlStrCache> element can be added.");
        }
        C9240xx c9240xx = new C9240xx();
        this.f28625x1 = c9240xx;
        return c9240xx;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39181k4(String str) {
        this.f28623k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("c", c3059ii, "f", this.f28623k4, false);
        C9240xx c9240xx = this.f28625x1;
        if (c9240xx != null) {
            c9240xx.mo6846k4("c", c3059ii, "multiLvlStrCache");
        }
        C7683fo c7683fo = this.f28624kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
