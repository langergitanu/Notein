package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.f0 */
/* JADX INFO: loaded from: classes4.dex */
public class C7626f0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22583to = new C7017h4("f", "strCache", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f22584k4;

    /* JADX INFO: renamed from: kk */
    private C7683fo f22585kk;

    /* JADX INFO: renamed from: x1 */
    private C8583q7 f22586x1;

    public C7626f0() {
    }

    /* JADX INFO: renamed from: kk */
    public final C8583q7 m31515kk() {
        return this.f22586x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m31516to() {
        return this.f22585kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m31517x1() {
        return this.f22584k4;
    }

    public C7626f0(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7626f0.f22583to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7626f0.this.f22584k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C7626f0 c7626f0 = C7626f0.this;
                            c7626f0.f22584k4 = C14113y2.m67400k4(c7626f0.f22584k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else if (iM27428k4 == 1) {
                    C7626f0.this.f22586x1 = new C8583q7(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7626f0.this.f22585kk = new C7683fo(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8583q7 m31513k4() {
        if (this.f22586x1 != null) {
            throw new Exception("Only one <strCache> element can be added.");
        }
        C8583q7 c8583q7 = new C8583q7();
        this.f22586x1 = c8583q7;
        return c8583q7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31514k4(String str) {
        this.f22584k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("c", c3059ii, "f", this.f22584k4, false);
        C8583q7 c8583q7 = this.f22586x1;
        if (c8583q7 != null) {
            c8583q7.mo6846k4("c", c3059ii, "strCache");
        }
        C7683fo c7683fo = this.f22585kk;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
