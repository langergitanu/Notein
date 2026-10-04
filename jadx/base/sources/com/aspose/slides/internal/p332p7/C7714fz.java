package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fz */
/* JADX INFO: loaded from: classes4.dex */
public class C7714fz extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f23127x1 = new C7017h4("noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f23128k4;

    public C7714fz() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m32181k4() {
        return this.f23128k4;
    }

    public C7714fz(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7714fz c7714fz;
                C7394ca c7394ca;
                int iM27428k4 = C7714fz.f23127x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c7714fz = C7714fz.this;
                    c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                } else if (iM27428k4 == 1) {
                    c7714fz = C7714fz.this;
                    c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    c7714fz = C7714fz.this;
                    c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    c7714fz = C7714fz.this;
                    c7394ca = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                } else if (iM27428k4 == 4) {
                    c7714fz = C7714fz.this;
                    c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    c7714fz = C7714fz.this;
                    c7394ca = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                }
                c7714fz.f23128k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m32182k4(String str) {
        C7394ca c7394ca;
        if (this.f23128k4 != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        int iM27428k4 = f23127x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("noFill", new C8130kt());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("solidFill", new C8256md());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("gradFill", new C8403o4());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("blipFill", new C9220xo());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("pattFill", new C7416cl());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("grpFill", new C9112wh());
        }
        this.f23128k4 = c7394ca;
        return this.f23128k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f23128k4;
        if (c7394ca != null) {
            int iM27428k4 = f23127x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C8130kt) this.f23128k4.m29541kk()).mo6846k4("a", c3059ii, this.f23128k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8256md) this.f23128k4.m29541kk()).mo6846k4("a", c3059ii, this.f23128k4.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C8403o4) this.f23128k4.m29541kk()).mo6846k4("a", c3059ii, this.f23128k4.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C9220xo) this.f23128k4.m29541kk()).mo6846k4("a", c3059ii, this.f23128k4.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C7416cl) this.f23128k4.m29541kk()).mo6846k4("a", c3059ii, this.f23128k4.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C9112wh) this.f23128k4.m29541kk()).mo6846k4("a", c3059ii, this.f23128k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
