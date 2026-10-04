package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class e7g extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final byte f22009k4 = C8384nv.m37862k4("white");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22010to = new C7017h4("bwMode", "bgPr", "bgRef");

    /* JADX INFO: renamed from: kk */
    private C7394ca f22011kk;

    /* JADX INFO: renamed from: x1 */
    private byte f22012x1;

    public e7g() {
        m30804to();
    }

    /* JADX INFO: renamed from: to */
    private void m30804to() {
        this.f22012x1 = f22009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m30805k4() {
        return this.f22012x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m30808x1() {
        return this.f22011kk;
    }

    public e7g(final AbstractC13912i5 abstractC13912i5) {
        m30804to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.e7g.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (e7g.f22010to.m27428k4(str) != 0) {
                    return false;
                }
                e7g.this.f22012x1 = C8384nv.m37862k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.e7g.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                e7g e7gVar;
                C7394ca c7394ca;
                int iM27428k4 = e7g.f22010to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    e7gVar = e7g.this;
                    c7394ca = new C7394ca("bgPr", new q1f(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    e7gVar = e7g.this;
                    c7394ca = new C7394ca("bgRef", new C8740s4(abstractC13912i5));
                }
                e7gVar.f22011kk = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m30806k4(String str) {
        C7394ca c7394ca;
        if (this.f22011kk != null) {
            throw new Exception("Background already is initialized.");
        }
        int iM27428k4 = f22010to.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca("bgPr", new q1f());
        } else {
            if (iM27428k4 != 2) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("bgRef", new C8740s4());
        }
        this.f22011kk = c7394ca;
        return this.f22011kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30807k4(byte b) {
        this.f22012x1 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f22012x1;
        if (b != f22009k4) {
            c3059ii.m12955x1("bwMode", C8384nv.m37863k4(b));
        }
        C7394ca c7394ca = this.f22011kk;
        if (c7394ca != null) {
            int iM27428k4 = f22010to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((q1f) this.f22011kk.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22011kk.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C8740s4) this.f22011kk.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22011kk.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
