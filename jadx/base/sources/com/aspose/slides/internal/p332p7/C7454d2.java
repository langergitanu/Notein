package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.d2 */
/* JADX INFO: loaded from: classes4.dex */
public class C7454d2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21402du = new C7017h4("l", "t", "r", "b");

    /* JADX INFO: renamed from: k4 */
    private C8291mu f21403k4;

    /* JADX INFO: renamed from: kk */
    private C8291mu f21404kk;

    /* JADX INFO: renamed from: to */
    private C8291mu f21405to;

    /* JADX INFO: renamed from: x1 */
    private C8291mu f21406x1;

    public C7454d2() {
        this.f21403k4 = new C8291mu();
        this.f21406x1 = new C8291mu();
        this.f21404kk = new C8291mu();
        this.f21405to = new C8291mu();
    }

    /* JADX INFO: renamed from: k4 */
    public final C8291mu m30013k4() {
        return this.f21403k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8291mu m30014kk() {
        return this.f21404kk;
    }

    /* JADX INFO: renamed from: to */
    public final C8291mu m30015to() {
        return this.f21405to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8291mu m30016x1() {
        return this.f21406x1;
    }

    public C7454d2(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.d2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7454d2.f21402du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7454d2.this.f21403k4 = new C8291mu(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7454d2.this.f21406x1 = new C8291mu(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7454d2.this.f21404kk = new C8291mu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7454d2.this.f21405to = new C8291mu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f21403k4.mo6846k4("a", c3059ii, "l");
        this.f21406x1.mo6846k4("a", c3059ii, "t");
        this.f21404kk.mo6846k4("a", c3059ii, "r");
        this.f21405to.mo6846k4("a", c3059ii, "b");
        c3059ii.mo21898jd();
    }
}
