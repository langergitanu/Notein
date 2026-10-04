package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kb */
/* JADX INFO: loaded from: classes4.dex */
public class C8070kb extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25559du = new C7017h4("chr", "pos", "vertJc", "ctrlPr");

    /* JADX INFO: renamed from: k4 */
    private C8376ns f25560k4;

    /* JADX INFO: renamed from: kk */
    private C8195ll f25561kk;

    /* JADX INFO: renamed from: to */
    private C7782go f25562to;

    /* JADX INFO: renamed from: x1 */
    private C8195ll f25563x1;

    public C8070kb() {
    }

    /* JADX INFO: renamed from: du */
    public final C7782go m35252du() {
        return this.f25562to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m35253k4() {
        if (this.f25562to != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f25562to = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final C8195ll m35256kk() {
        return this.f25563x1;
    }

    /* JADX INFO: renamed from: to */
    public final C8195ll m35257to() {
        return this.f25561kk;
    }

    public C8070kb(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8070kb.f25559du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8070kb.this.f25560k4 = new C8376ns(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8070kb.this.f25563x1 = new C8195ll(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8070kb.this.f25561kk = new C8195ll(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8070kb.this.f25562to = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C8376ns m35258x1() {
        return this.f25560k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35259x1(C8195ll c8195ll) {
        this.f25561kk = c8195ll;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35254k4(C8195ll c8195ll) {
        this.f25563x1 = c8195ll;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35255k4(C8376ns c8376ns) {
        this.f25560k4 = c8376ns;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8376ns c8376ns = this.f25560k4;
        if (c8376ns != null) {
            c8376ns.mo6846k4("m", c3059ii, "chr");
        }
        C8195ll c8195ll = this.f25563x1;
        if (c8195ll != null) {
            c8195ll.mo6846k4("m", c3059ii, "pos");
        }
        C8195ll c8195ll2 = this.f25561kk;
        if (c8195ll2 != null) {
            c8195ll2.mo6846k4("m", c3059ii, "vertJc");
        }
        C7782go c7782go = this.f25562to;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
