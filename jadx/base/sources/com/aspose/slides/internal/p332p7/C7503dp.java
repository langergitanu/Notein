package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dp */
/* JADX INFO: loaded from: classes4.dex */
public class C7503dp extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21767du = new C7017h4("name", "majorFont", "minorFont", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f21768k4;

    /* JADX INFO: renamed from: kk */
    private C7859hj f21769kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f21770to;

    /* JADX INFO: renamed from: x1 */
    private C7859hj f21771x1;

    public C7503dp() {
        this.f21771x1 = new C7859hj();
        this.f21769kk = new C7859hj();
    }

    /* JADX INFO: renamed from: kk */
    public final C7859hj m30487kk() {
        return this.f21769kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m30488to() {
        return this.f21770to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7859hj m30489x1() {
        return this.f21771x1;
    }

    public C7503dp(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7503dp.f21767du.m27428k4(str) != 0) {
                    return false;
                }
                C7503dp.this.f21768k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dp.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7503dp.f21767du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7503dp.this.f21771x1 = new C7859hj(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7503dp.this.f21769kk = new C7859hj(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7503dp.this.f21770to = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m30484k4() {
        return this.f21768k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30485k4(AbstractC7414ck abstractC7414ck) {
        this.f21770to = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30486k4(String str) {
        this.f21768k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f21768k4);
        this.f21771x1.mo6846k4("a", c3059ii, "majorFont");
        this.f21769kk.mo6846k4("a", c3059ii, "minorFont");
        C8397nz c8397nz = this.f21770to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
