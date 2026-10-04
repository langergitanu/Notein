package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.w4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9086w4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f32168m9 = new C7017h4("chr", "limLoc", "grow", "subHide", "supHide", "ctrlPr");

    /* JADX INFO: renamed from: du */
    private C9408zw f32169du;

    /* JADX INFO: renamed from: h4 */
    private C7782go f32170h4;

    /* JADX INFO: renamed from: k4 */
    private C8376ns f32171k4;

    /* JADX INFO: renamed from: kk */
    private C9408zw f32172kk;

    /* JADX INFO: renamed from: to */
    private C9408zw f32173to;

    /* JADX INFO: renamed from: x1 */
    private C7665ff f32174x1;

    public C9086w4() {
    }

    /* JADX INFO: renamed from: du */
    public final C9408zw m43478du() {
        return this.f32173to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9408zw m43479h4() {
        return this.f32169du;
    }

    /* JADX INFO: renamed from: kk */
    public final C7665ff m43484kk() {
        return this.f32174x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7782go m43486m9() {
        return this.f32170h4;
    }

    /* JADX INFO: renamed from: to */
    public final C9408zw m43487to() {
        return this.f32172kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8376ns m43488x1() {
        return this.f32171k4;
    }

    public C9086w4(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9086w4.f32168m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9086w4.this.f32171k4 = new C8376ns(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9086w4.this.f32174x1 = new C7665ff(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C9086w4.this.f32172kk = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C9086w4.this.f32173to = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C9086w4.this.f32169du = new C9408zw(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C9086w4.this.f32170h4 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m43480k4() {
        if (this.f32170h4 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f32170h4 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final void m43485kk(C9408zw c9408zw) {
        this.f32169du = c9408zw;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43489x1(C9408zw c9408zw) {
        this.f32173to = c9408zw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43481k4(C7665ff c7665ff) {
        this.f32174x1 = c7665ff;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43482k4(C8376ns c8376ns) {
        this.f32171k4 = c8376ns;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43483k4(C9408zw c9408zw) {
        this.f32172kk = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8376ns c8376ns = this.f32171k4;
        if (c8376ns != null) {
            c8376ns.mo6846k4("m", c3059ii, "chr");
        }
        C7665ff c7665ff = this.f32174x1;
        if (c7665ff != null) {
            c7665ff.mo6846k4("m", c3059ii, "limLoc");
        }
        C9408zw c9408zw = this.f32172kk;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "grow");
        }
        C9408zw c9408zw2 = this.f32173to;
        if (c9408zw2 != null) {
            c9408zw2.mo6846k4("m", c3059ii, "subHide");
        }
        C9408zw c9408zw3 = this.f32169du;
        if (c9408zw3 != null) {
            c9408zw3.mo6846k4("m", c3059ii, "supHide");
        }
        C7782go c7782go = this.f32170h4;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}
