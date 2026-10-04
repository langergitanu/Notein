package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes4.dex */
public class jqo extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f25312m9 = new C7017h4("name", TranslateLanguage.BULGARIAN, "spTree", "custDataLst", "controls", "extLst");

    /* JADX INFO: renamed from: du */
    private lpe f25313du;

    /* JADX INFO: renamed from: h4 */
    private ltr f25314h4;

    /* JADX INFO: renamed from: k4 */
    private String f25315k4;

    /* JADX INFO: renamed from: kk */
    private hc1 f25316kk;

    /* JADX INFO: renamed from: to */
    private fbr f25317to;

    /* JADX INFO: renamed from: x1 */
    private e7g f25318x1;

    public jqo() {
        m34888ck();
        this.f25316kk = new hc1();
    }

    /* JADX INFO: renamed from: ck */
    private void m34888ck() {
        this.f25315k4 = "";
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC7414ck m34896c5() {
        return this.f25314h4;
    }

    /* JADX INFO: renamed from: du */
    public final e7g m34897du() {
        return this.f25318x1;
    }

    /* JADX INFO: renamed from: dy */
    public final lpe m34898dy() {
        return this.f25313du;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC9290yj m34899h4() {
        return this.f25316kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final e7g m34900k4() {
        if (this.f25318x1 != null) {
            throw new Exception("Only one <bg> element can be added.");
        }
        e7g e7gVar = new e7g();
        this.f25318x1 = e7gVar;
        return e7gVar;
    }

    /* JADX INFO: renamed from: kk */
    public final lpe m34903kk() {
        if (this.f25313du != null) {
            throw new Exception("Only one <controls> element can be added.");
        }
        lpe lpeVar = new lpe();
        this.f25313du = lpeVar;
        return lpeVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final fbr m34904m9() {
        return this.f25317to;
    }

    /* JADX INFO: renamed from: to */
    public final String m34905to() {
        return this.f25315k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final fbr m34906x1() {
        if (this.f25317to != null) {
            throw new Exception("Only one <custDataLst> element can be added.");
        }
        fbr fbrVar = new fbr();
        this.f25317to = fbrVar;
        return fbrVar;
    }

    public jqo(final AbstractC13912i5 abstractC13912i5) {
        m34888ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jqo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (jqo.f25312m9.m27428k4(str) != 0) {
                    return false;
                }
                jqo.this.f25315k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jqo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = jqo.f25312m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    jqo.this.f25318x1 = new e7g(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    jqo.this.f25316kk = new hc1(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    jqo.this.f25317to = new fbr(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    jqo.this.f25313du = new lpe(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    jqo.this.f25314h4 = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34901k4(AbstractC7414ck abstractC7414ck) {
        this.f25314h4 = (ltr) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34902k4(String str) {
        this.f25315k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f25315k4)) {
            c3059ii.m12955x1("name", this.f25315k4);
        }
        e7g e7gVar = this.f25318x1;
        if (e7gVar != null) {
            e7gVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, TranslateLanguage.BULGARIAN);
        }
        this.f25316kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "spTree");
        fbr fbrVar = this.f25317to;
        if (fbrVar != null) {
            fbrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "custDataLst");
        }
        lpe lpeVar = this.f25313du;
        if (lpeVar != null) {
            lpeVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "controls");
        }
        ltr ltrVar = this.f25314h4;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
