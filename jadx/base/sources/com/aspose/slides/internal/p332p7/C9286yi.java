package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yi */
/* JADX INFO: loaded from: classes4.dex */
public class C9286yi extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33388to = new C7017h4("docMk", "sldMk", "spMk");

    /* JADX INFO: renamed from: k4 */
    private umg f33389k4;

    /* JADX INFO: renamed from: kk */
    private C8867tg f33390kk;

    /* JADX INFO: renamed from: x1 */
    private hgg f33391x1;

    public C9286yi() {
        this.f33389k4 = new umg();
        this.f33391x1 = new hgg();
        this.f33390kk = new C8867tg();
    }

    /* JADX INFO: renamed from: k4 */
    public final hgg m45015k4() {
        return this.f33391x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8867tg m45016x1() {
        return this.f33390kk;
    }

    public C9286yi(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9286yi.f33388to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9286yi.this.f33389k4 = new umg(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9286yi.this.f33391x1 = new hgg(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9286yi.this.f33390kk = new C8867tg(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("ac", str2, "http://schemas.microsoft.com/office/drawing/2013/main/command");
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2013/main/command") == null) {
            c3059ii.m12954to("xmlns", "pc", null, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
        }
        this.f33389k4.mo6846k4("ac", c3059ii, "docMk");
        this.f33391x1.mo6846k4("ac", c3059ii, "sldMk");
        this.f33390kk.mo6846k4("ac", c3059ii, "spMk");
        c3059ii.mo21898jd();
    }
}
