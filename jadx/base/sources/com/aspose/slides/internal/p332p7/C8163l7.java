package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.l7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8163l7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26150du = new C7017h4("docMk", "sldMk", "spMk", "txMk");

    /* JADX INFO: renamed from: k4 */
    private umg f26151k4;

    /* JADX INFO: renamed from: kk */
    private C8867tg f26152kk;

    /* JADX INFO: renamed from: to */
    private C7842hg f26153to;

    /* JADX INFO: renamed from: x1 */
    private hgg f26154x1;

    public C8163l7() {
        this.f26151k4 = new umg();
        this.f26154x1 = new hgg();
        this.f26152kk = new C8867tg();
        this.f26153to = new C7842hg();
    }

    /* JADX INFO: renamed from: kk */
    public final C7842hg m35933kk() {
        return this.f26153to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8867tg m35934x1() {
        return this.f26152kk;
    }

    public C8163l7(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.l7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8163l7.f26150du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8163l7.this.f26151k4 = new umg(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8163l7.this.f26154x1 = new hgg(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8163l7.this.f26152kk = new C8867tg(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8163l7.this.f26153to = new C7842hg(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final hgg m35932k4() {
        return this.f26154x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("ac", str2, "http://schemas.microsoft.com/office/drawing/2013/main/command");
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2013/main/command") == null) {
            c3059ii.m12954to("xmlns", "pc", null, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
        }
        this.f26151k4.mo6846k4("ac", c3059ii, "docMk");
        this.f26154x1.mo6846k4("ac", c3059ii, "sldMk");
        this.f26152kk.mo6846k4("ac", c3059ii, "spMk");
        this.f26153to.mo6846k4("ac", c3059ii, "txMk");
        c3059ii.mo21898jd();
    }
}
