package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ijy extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24725x1 = new C7017h4("boolVal", "intVal", "fltVal", "strVal", "clrVal");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f24726k4;

    public ijy() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m34176k4() {
        return this.f24726k4;
    }

    public ijy(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ijy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                ijy ijyVar;
                C7394ca c7394ca;
                int iM27428k4 = ijy.f24725x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ijyVar = ijy.this;
                    c7394ca = new C7394ca("boolVal", new oy7(abstractC13912i5));
                } else if (iM27428k4 == 1) {
                    ijyVar = ijy.this;
                    c7394ca = new C7394ca("intVal", new ql5(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    ijyVar = ijy.this;
                    c7394ca = new C7394ca("fltVal", new mox(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    ijyVar = ijy.this;
                    c7394ca = new C7394ca("strVal", new bc9(abstractC13912i5));
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    ijyVar = ijy.this;
                    c7394ca = new C7394ca("clrVal", new C7447cx(abstractC13912i5));
                }
                ijyVar.f24726k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m34177k4(String str) {
        C7394ca c7394ca;
        if (this.f24726k4 != null) {
            throw new Exception("Value already is initialized.");
        }
        int iM27428k4 = f24725x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("boolVal", new oy7());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("intVal", new ql5());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("fltVal", new mox());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("strVal", new bc9());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("clrVal", new C7447cx());
        }
        this.f24726k4 = c7394ca;
        return this.f24726k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f24726k4;
        if (c7394ca != null) {
            int iM27428k4 = f24725x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((oy7) this.f24726k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f24726k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((ql5) this.f24726k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f24726k4.m29539k4());
            } else if (iM27428k4 == 2) {
                ((mox) this.f24726k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f24726k4.m29539k4());
            } else if (iM27428k4 == 3) {
                ((bc9) this.f24726k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f24726k4.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C7447cx) this.f24726k4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f24726k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
