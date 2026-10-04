package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zx */
/* JADX INFO: loaded from: classes4.dex */
public class C9412zx extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f34220kk = new C7017h4("Format", "Value");

    /* JADX INFO: renamed from: k4 */
    private String f34221k4;

    /* JADX INFO: renamed from: x1 */
    private String f34222x1;

    public C9412zx() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m46014k4() {
        return this.f34221k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m46016x1() {
        return this.f34222x1;
    }

    public C9412zx(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9412zx.f34220kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9412zx.this.f34221k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C9412zx c9412zx = C9412zx.this;
                            c9412zx.f34221k4 = C14113y2.m67400k4(c9412zx.f34221k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C9412zx.this.f34222x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C9412zx c9412zx2 = C9412zx.this;
                            c9412zx2.f34222x1 = C14113y2.m67400k4(c9412zx2.f34222x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46015k4(String str) {
        this.f34221k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46017x1(String str) {
        this.f34222x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("mdssi", str2, "http://schemas.openxmlformats.org/package/2006/digital-signature");
        m29301k4("mdssi", c3059ii, "Format", this.f34221k4, false);
        m29301k4("mdssi", c3059ii, "Value", this.f34222x1, false);
        c3059ii.mo21898jd();
    }
}
