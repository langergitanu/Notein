package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ia */
/* JADX INFO: loaded from: classes4.dex */
public class C7917ia extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24557to = new C7017h4("idx", "spPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private long f24558k4;

    /* JADX INFO: renamed from: kk */
    private C7249ah f24559kk;

    /* JADX INFO: renamed from: x1 */
    private C8087kh f24560x1;

    public C7917ia() {
    }

    /* JADX INFO: renamed from: kk */
    public final C8087kh m33964kk() {
        return this.f24560x1;
    }

    /* JADX INFO: renamed from: to */
    public final C7249ah m33965to() {
        return this.f24559kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m33966x1() {
        return this.f24558k4;
    }

    public C7917ia(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ia.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7917ia.f24557to.m27428k4(str) != 0) {
                    return false;
                }
                C7917ia.this.f24558k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ia.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7917ia.f24557to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7917ia.this.f24560x1 = new C8087kh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7917ia.this.f24559kk = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8087kh m33961k4() {
        if (this.f24560x1 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f24560x1 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33962k4(long j) {
        this.f24558k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33963k4(C7249ah c7249ah) {
        this.f24559kk = c7249ah;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f24558k4));
        C8087kh c8087kh = this.f24560x1;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C7249ah c7249ah = this.f24559kk;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
