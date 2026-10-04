package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mq */
/* JADX INFO: loaded from: classes4.dex */
public class C8281mq extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26937kk = new C7017h4("noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f26938k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f26939x1;

    public C8281mq() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37041k4() {
        return this.f26938k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m37043x1() {
        return this.f26939x1;
    }

    public C8281mq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8281mq c8281mq;
                C7394ca c7394ca;
                C8281mq c8281mq2;
                C7394ca c7394ca2;
                switch (C8281mq.f26937kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        c8281mq = C8281mq.this;
                        c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                        c8281mq.f26938k4 = c7394ca;
                        return true;
                    case 1:
                        c8281mq = C8281mq.this;
                        c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                        c8281mq.f26938k4 = c7394ca;
                        return true;
                    case 2:
                        c8281mq = C8281mq.this;
                        c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                        c8281mq.f26938k4 = c7394ca;
                        return true;
                    case 3:
                        c8281mq = C8281mq.this;
                        c7394ca = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                        c8281mq.f26938k4 = c7394ca;
                        return true;
                    case 4:
                        c8281mq = C8281mq.this;
                        c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                        c8281mq.f26938k4 = c7394ca;
                        return true;
                    case 5:
                        c8281mq = C8281mq.this;
                        c7394ca = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                        c8281mq.f26938k4 = c7394ca;
                        return true;
                    case 6:
                        c8281mq2 = C8281mq.this;
                        c7394ca2 = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                        c8281mq2.f26939x1 = c7394ca2;
                        return true;
                    case 7:
                        c8281mq2 = C8281mq.this;
                        c7394ca2 = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                        c8281mq2.f26939x1 = c7394ca2;
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37042k4(String str) {
        C7394ca c7394ca;
        if (this.f26939x1 != null) {
            throw new Exception("EffectProperties already is initialized.");
        }
        int iM27428k4 = f26937kk.m27428k4(str);
        if (iM27428k4 == 6) {
            c7394ca = new C7394ca("effectLst", new C8490p3());
        } else {
            if (iM27428k4 != 7) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectDag", new C9295yl());
        }
        this.f26939x1 = c7394ca;
        return this.f26939x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m37044x1(String str) {
        C7394ca c7394ca;
        if (this.f26938k4 != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        int iM27428k4 = f26937kk.m27428k4(str);
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
        this.f26938k4 = c7394ca;
        return this.f26938k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f26938k4;
        if (c7394ca != null) {
            int iM27428k4 = f26937kk.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C8130kt) this.f26938k4.m29541kk()).mo6846k4("a", c3059ii, this.f26938k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8256md) this.f26938k4.m29541kk()).mo6846k4("a", c3059ii, this.f26938k4.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C8403o4) this.f26938k4.m29541kk()).mo6846k4("a", c3059ii, this.f26938k4.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C9220xo) this.f26938k4.m29541kk()).mo6846k4("a", c3059ii, this.f26938k4.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C7416cl) this.f26938k4.m29541kk()).mo6846k4("a", c3059ii, this.f26938k4.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C9112wh) this.f26938k4.m29541kk()).mo6846k4("a", c3059ii, this.f26938k4.m29539k4());
            }
        }
        C7394ca c7394ca2 = this.f26939x1;
        if (c7394ca2 != null) {
            int iM27428k42 = f26937kk.m27428k4(c7394ca2.m29539k4());
            if (iM27428k42 == 6) {
                ((C8490p3) this.f26939x1.m29541kk()).mo6846k4("a", c3059ii, this.f26939x1.m29539k4());
            } else if (iM27428k42 == 7) {
                ((C9295yl) this.f26939x1.m29541kk()).mo6846k4("a", c3059ii, this.f26939x1.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
