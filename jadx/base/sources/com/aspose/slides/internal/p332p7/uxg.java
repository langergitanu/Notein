package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class uxg extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f31451h4 = new C7017h4("font", "regular", "bold", "italic", "boldItalic");

    /* JADX INFO: renamed from: du */
    private wum f31452du;

    /* JADX INFO: renamed from: k4 */
    private C9235xv f31453k4;

    /* JADX INFO: renamed from: kk */
    private wum f31454kk;

    /* JADX INFO: renamed from: to */
    private wum f31455to;

    /* JADX INFO: renamed from: x1 */
    private wum f31456x1;

    public uxg() {
        this.f31453k4 = new C9235xv();
    }

    /* JADX INFO: renamed from: c5 */
    public final wum m42599c5() {
        return this.f31452du;
    }

    /* JADX INFO: renamed from: du */
    public final C9235xv m42600du() {
        return this.f31453k4;
    }

    /* JADX INFO: renamed from: dy */
    public final wum m42601dy() {
        return this.f31455to;
    }

    /* JADX INFO: renamed from: h4 */
    public final wum m42602h4() {
        return this.f31456x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final wum m42603k4() {
        if (this.f31456x1 != null) {
            throw new Exception("Only one <regular> element can be added.");
        }
        wum wumVar = new wum();
        this.f31456x1 = wumVar;
        return wumVar;
    }

    /* JADX INFO: renamed from: kk */
    public final wum m42604kk() {
        if (this.f31455to != null) {
            throw new Exception("Only one <italic> element can be added.");
        }
        wum wumVar = new wum();
        this.f31455to = wumVar;
        return wumVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final wum m42605m9() {
        return this.f31454kk;
    }

    /* JADX INFO: renamed from: to */
    public final wum m42606to() {
        if (this.f31452du != null) {
            throw new Exception("Only one <boldItalic> element can be added.");
        }
        wum wumVar = new wum();
        this.f31452du = wumVar;
        return wumVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final wum m42607x1() {
        if (this.f31454kk != null) {
            throw new Exception("Only one <bold> element can be added.");
        }
        wum wumVar = new wum();
        this.f31454kk = wumVar;
        return wumVar;
    }

    public uxg(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uxg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = uxg.f31451h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    uxg.this.f31453k4 = new C9235xv(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    uxg.this.f31456x1 = new wum(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    uxg.this.f31454kk = new wum(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    uxg.this.f31455to = new wum(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    uxg.this.f31452du = new wum(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f31453k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "font");
        wum wumVar = this.f31456x1;
        if (wumVar != null) {
            wumVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "regular");
        }
        wum wumVar2 = this.f31454kk;
        if (wumVar2 != null) {
            wumVar2.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "bold");
        }
        wum wumVar3 = this.f31455to;
        if (wumVar3 != null) {
            wumVar3.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "italic");
        }
        wum wumVar4 = this.f31452du;
        if (wumVar4 != null) {
            wumVar4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "boldItalic");
        }
        c3059ii.mo21898jd();
    }
}
