package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mn */
/* JADX INFO: loaded from: classes4.dex */
public class C8275mn extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26912du = new C7017h4("naryPr", "sub", "sup", "e");

    /* JADX INFO: renamed from: k4 */
    private C9086w4 f26913k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f26914kk;

    /* JADX INFO: renamed from: to */
    private C9085w3 f26915to;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f26916x1;

    public C8275mn() {
        this.f26916x1 = new C9085w3();
        this.f26914kk = new C9085w3();
        this.f26915to = new C9085w3();
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m37012kk() {
        return this.f26914kk;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m37013to() {
        return this.f26915to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3 m37014x1() {
        return this.f26916x1;
    }

    public C8275mn(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8275mn.f26912du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8275mn.this.f26913k4 = new C9086w4(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8275mn.this.f26916x1 = new C9085w3(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8275mn.this.f26914kk = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8275mn.this.f26915to = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9086w4 m37010k4() {
        return this.f26913k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37011k4(C9086w4 c9086w4) {
        this.f26913k4 = c9086w4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9086w4 c9086w4 = this.f26913k4;
        if (c9086w4 != null) {
            c9086w4.mo6846k4("m", c3059ii, "naryPr");
        }
        this.f26916x1.mo6846k4("m", c3059ii, "sub");
        this.f26914kk.mo6846k4("m", c3059ii, "sup");
        this.f26915to.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
