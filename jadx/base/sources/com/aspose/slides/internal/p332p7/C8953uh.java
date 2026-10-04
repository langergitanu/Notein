package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uh */
/* JADX INFO: loaded from: classes4.dex */
public class C8953uh extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31278kk = new C7017h4("sx", "sy");

    /* JADX INFO: renamed from: k4 */
    private C8291mu f31279k4;

    /* JADX INFO: renamed from: x1 */
    private C8291mu f31280x1;

    public C8953uh() {
        this.f31279k4 = new C8291mu();
        this.f31280x1 = new C8291mu();
    }

    /* JADX INFO: renamed from: k4 */
    public final C8291mu m42382k4() {
        return this.f31279k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8291mu m42383x1() {
        return this.f31280x1;
    }

    public C8953uh(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8953uh.f31278kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8953uh.this.f31279k4 = new C8291mu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8953uh.this.f31280x1 = new C8291mu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f31279k4.mo6846k4("a", c3059ii, "sx");
        this.f31280x1.mo6846k4("a", c3059ii, "sy");
        c3059ii.mo21898jd();
    }
}
