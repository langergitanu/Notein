package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class gt8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f23731m9 = new C7017h4("isPhoto", "userDrawn", "ph", "audioCd", "wavAudioFile", "audioFile", "videoFile", "quickTimeFile", "custDataLst", "extLst");

    /* JADX INFO: renamed from: du */
    private fbr f23732du;

    /* JADX INFO: renamed from: h4 */
    private ltr f23733h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f23734k4;

    /* JADX INFO: renamed from: kk */
    private vy9 f23735kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f23736to;

    /* JADX INFO: renamed from: x1 */
    private boolean f23737x1;

    public gt8() {
        m32900ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m32900ck() {
        this.f23734k4 = false;
        this.f23737x1 = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC7414ck m32908c5() {
        return this.f23733h4;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m32909du() {
        return this.f23737x1;
    }

    /* JADX INFO: renamed from: dy */
    public final fbr m32910dy() {
        return this.f23732du;
    }

    /* JADX INFO: renamed from: h4 */
    public final vy9 m32911h4() {
        return this.f23735kk;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC7414ck m32917kk() {
        if (this.f23733h4 != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        ltr ltrVar = new ltr();
        this.f23733h4 = ltrVar;
        return ltrVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7394ca m32918m9() {
        return this.f23736to;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m32919to() {
        return this.f23734k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final fbr m32920x1() {
        if (this.f23732du != null) {
            throw new Exception("Only one <custDataLst> element can be added.");
        }
        fbr fbrVar = new fbr();
        this.f23732du = fbrVar;
        return fbrVar;
    }

    public gt8(final AbstractC13912i5 abstractC13912i5) {
        m32900ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gt8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gt8.f23731m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    gt8.this.f23734k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                gt8.this.f23737x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gt8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                gt8 gt8Var;
                C7394ca c7394ca;
                switch (gt8.f23731m9.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        gt8.this.f23735kk = new vy9(abstractC13912i5);
                        return true;
                    case 3:
                        gt8Var = gt8.this;
                        c7394ca = new C7394ca("audioCd", new C9188xc(abstractC13912i5));
                        break;
                    case 4:
                        gt8Var = gt8.this;
                        c7394ca = new C7394ca("wavAudioFile", new C8528pk(abstractC13912i5));
                        break;
                    case 5:
                        gt8Var = gt8.this;
                        c7394ca = new C7394ca("audioFile", new C8360nm(abstractC13912i5));
                        break;
                    case 6:
                        gt8Var = gt8.this;
                        c7394ca = new C7394ca("videoFile", new C7590ep(abstractC13912i5));
                        break;
                    case 7:
                        gt8Var = gt8.this;
                        c7394ca = new C7394ca("quickTimeFile", new C7793gr(abstractC13912i5));
                        break;
                    case 8:
                        gt8.this.f23732du = new fbr(abstractC13912i5);
                        return true;
                    case 9:
                        gt8.this.f23733h4 = new ltr(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                gt8Var.f23736to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m32912k4(String str) {
        C7394ca c7394ca;
        if (this.f23736to != null) {
            throw new Exception("Media already is initialized.");
        }
        int iM27428k4 = f23731m9.m27428k4(str);
        if (iM27428k4 == 3) {
            c7394ca = new C7394ca("audioCd", new C9188xc());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("wavAudioFile", new C8528pk());
        } else if (iM27428k4 == 5) {
            c7394ca = new C7394ca("audioFile", new C8360nm());
        } else if (iM27428k4 == 6) {
            c7394ca = new C7394ca("videoFile", new C7590ep());
        } else {
            if (iM27428k4 != 7) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("quickTimeFile", new C7793gr());
        }
        this.f23736to = c7394ca;
        return this.f23736to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32921x1(boolean z) {
        this.f23737x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final vy9 m32913k4() {
        if (this.f23735kk != null) {
            throw new Exception("Only one <ph> element can be added.");
        }
        vy9 vy9Var = new vy9();
        this.f23735kk = vy9Var;
        return vy9Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32914k4(C7394ca c7394ca) {
        this.f23736to = c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32915k4(AbstractC7414ck abstractC7414ck) {
        this.f23733h4 = (ltr) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f23734k4;
        if (z) {
            c3059ii.m12955x1("isPhoto", z ? "1" : "0");
        }
        boolean z2 = this.f23737x1;
        if (z2) {
            c3059ii.m12955x1("userDrawn", z2 ? "1" : "0");
        }
        vy9 vy9Var = this.f23735kk;
        if (vy9Var != null) {
            vy9Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "ph");
        }
        C7394ca c7394ca = this.f23736to;
        if (c7394ca != null) {
            int iM27428k4 = f23731m9.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 3) {
                ((C9188xc) this.f23736to.m29541kk()).mo6846k4("a", c3059ii, this.f23736to.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C8528pk) this.f23736to.m29541kk()).mo6846k4("a", c3059ii, this.f23736to.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C8360nm) this.f23736to.m29541kk()).mo6846k4("a", c3059ii, this.f23736to.m29539k4());
            } else if (iM27428k4 == 6) {
                ((C7590ep) this.f23736to.m29541kk()).mo6846k4("a", c3059ii, this.f23736to.m29539k4());
            } else if (iM27428k4 == 7) {
                ((C7793gr) this.f23736to.m29541kk()).mo6846k4("a", c3059ii, this.f23736to.m29539k4());
            }
        }
        fbr fbrVar = this.f23732du;
        if (fbrVar != null) {
            fbrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "custDataLst");
        }
        ltr ltrVar = this.f23733h4;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32916k4(boolean z) {
        this.f23734k4 = z;
    }
}
