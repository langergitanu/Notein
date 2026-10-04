package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes4.dex */
public class sdd extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30077kk = new C7017h4("spid", TranslateLanguage.BULGARIAN, "subSp", "oleChartEl", "txEl", "graphicEl");

    /* JADX INFO: renamed from: k4 */
    private String f30078k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f30079x1;

    public sdd() {
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m40966x1() {
        return this.f30079x1;
    }

    public sdd(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sdd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (sdd.f30077kk.m27428k4(str) != 0) {
                    return false;
                }
                sdd.this.f30078k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sdd.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                sdd sddVar;
                C7394ca c7394ca;
                int iM27428k4 = sdd.f30077kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    sddVar = sdd.this;
                    c7394ca = new C7394ca(TranslateLanguage.BULGARIAN, new qu9(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    sddVar = sdd.this;
                    c7394ca = new C7394ca("subSp", new kqc(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    sddVar = sdd.this;
                    c7394ca = new C7394ca("oleChartEl", new hof(abstractC13912i5));
                } else if (iM27428k4 == 4) {
                    sddVar = sdd.this;
                    c7394ca = new C7394ca("txEl", new nhj(abstractC13912i5));
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    sddVar = sdd.this;
                    c7394ca = new C7394ca("graphicEl", new C7811gz(abstractC13912i5));
                }
                sddVar.f30079x1 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m40963k4(String str) {
        C7394ca c7394ca;
        if (this.f30079x1 != null) {
            throw new Exception("TargetShape already is initialized.");
        }
        int iM27428k4 = f30077kk.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca(TranslateLanguage.BULGARIAN, new qu9());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("subSp", new kqc());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("oleChartEl", new hof());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("txEl", new nhj());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("graphicEl", new C7811gz());
        }
        this.f30079x1 = c7394ca;
        return this.f30079x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40967x1(String str) {
        this.f30078k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40964k4() {
        return this.f30078k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40965k4(C7394ca c7394ca) {
        this.f30079x1 = c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("spid", this.f30078k4);
        C7394ca c7394ca = this.f30079x1;
        if (c7394ca != null) {
            int iM27428k4 = f30077kk.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((qu9) this.f30079x1.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f30079x1.m29539k4());
            } else if (iM27428k4 == 2) {
                ((kqc) this.f30079x1.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f30079x1.m29539k4());
            } else if (iM27428k4 == 3) {
                ((hof) this.f30079x1.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f30079x1.m29539k4());
            } else if (iM27428k4 == 4) {
                ((nhj) this.f30079x1.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f30079x1.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C7811gz) this.f30079x1.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f30079x1.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
