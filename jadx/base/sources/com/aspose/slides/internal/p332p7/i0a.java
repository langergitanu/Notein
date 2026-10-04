package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class i0a extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f24443du = new C7017h4("titleStyle", "bodyStyle", "otherStyle", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8345ni f24444k4;

    /* JADX INFO: renamed from: kk */
    private C8345ni f24445kk;

    /* JADX INFO: renamed from: to */
    private ltr f24446to;

    /* JADX INFO: renamed from: x1 */
    private C8345ni f24447x1;

    public i0a() {
    }

    /* JADX INFO: renamed from: du */
    public final C8345ni m33789du() {
        return this.f24447x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8345ni m33790h4() {
        return this.f24445kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C8345ni m33793kk() {
        if (this.f24445kk != null) {
            throw new Exception("Only one <otherStyle> element can be added.");
        }
        C8345ni c8345ni = new C8345ni();
        this.f24445kk = c8345ni;
        return c8345ni;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m33794m9() {
        return this.f24446to;
    }

    /* JADX INFO: renamed from: to */
    public final C8345ni m33795to() {
        return this.f24444k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8345ni m33796x1() {
        if (this.f24447x1 != null) {
            throw new Exception("Only one <bodyStyle> element can be added.");
        }
        C8345ni c8345ni = new C8345ni();
        this.f24447x1 = c8345ni;
        return c8345ni;
    }

    public i0a(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.i0a.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = i0a.f24443du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    i0a.this.f24444k4 = new C8345ni(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    i0a.this.f24447x1 = new C8345ni(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    i0a.this.f24445kk = new C8345ni(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    i0a.this.f24446to = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8345ni m33791k4() {
        if (this.f24444k4 != null) {
            throw new Exception("Only one <titleStyle> element can be added.");
        }
        C8345ni c8345ni = new C8345ni();
        this.f24444k4 = c8345ni;
        return c8345ni;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33792k4(AbstractC7414ck abstractC7414ck) {
        this.f24446to = (ltr) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8345ni c8345ni = this.f24444k4;
        if (c8345ni != null) {
            c8345ni.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "titleStyle");
        }
        C8345ni c8345ni2 = this.f24447x1;
        if (c8345ni2 != null) {
            c8345ni2.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "bodyStyle");
        }
        C8345ni c8345ni3 = this.f24445kk;
        if (c8345ni3 != null) {
            c8345ni3.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "otherStyle");
        }
        ltr ltrVar = this.f24446to;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
