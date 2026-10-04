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
public class q1f extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28704du = new C7017h4("shadeToTitle", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag", "extLst");

    /* JADX INFO: renamed from: k4 */
    private boolean f28705k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f28706kk;

    /* JADX INFO: renamed from: to */
    private ltr f28707to;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f28708x1;

    public q1f() {
        m39281h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m39281h4() {
        this.f28705k4 = false;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m39290kk() {
        return this.f28706kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m39291to() {
        return this.f28707to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m39292x1() {
        return this.f28708x1;
    }

    public q1f(final AbstractC13912i5 abstractC13912i5) {
        m39281h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q1f.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (q1f.f28704du.m27428k4(str) != 0) {
                    return false;
                }
                q1f.this.f28705k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q1f.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                q1f q1fVar;
                C7394ca c7394ca;
                q1f q1fVar2;
                C7394ca c7394ca2;
                switch (q1f.f28704du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        q1fVar = q1f.this;
                        c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                        q1fVar.f28708x1 = c7394ca;
                        return true;
                    case 2:
                        q1fVar = q1f.this;
                        c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                        q1fVar.f28708x1 = c7394ca;
                        return true;
                    case 3:
                        q1fVar = q1f.this;
                        c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                        q1fVar.f28708x1 = c7394ca;
                        return true;
                    case 4:
                        q1fVar = q1f.this;
                        c7394ca = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                        q1fVar.f28708x1 = c7394ca;
                        return true;
                    case 5:
                        q1fVar = q1f.this;
                        c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                        q1fVar.f28708x1 = c7394ca;
                        return true;
                    case 6:
                        q1fVar = q1f.this;
                        c7394ca = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                        q1fVar.f28708x1 = c7394ca;
                        return true;
                    case 7:
                        q1fVar2 = q1f.this;
                        c7394ca2 = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                        q1fVar2.f28706kk = c7394ca2;
                        return true;
                    case 8:
                        q1fVar2 = q1f.this;
                        c7394ca2 = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                        q1fVar2.f28706kk = c7394ca2;
                        return true;
                    case 9:
                        q1f.this.f28707to = new ltr(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m39286k4(String str) {
        C7394ca c7394ca;
        if (this.f28706kk != null) {
            throw new Exception("EffectProperties already is initialized.");
        }
        int iM27428k4 = f28704du.m27428k4(str);
        if (iM27428k4 == 7) {
            c7394ca = new C7394ca("effectLst", new C8490p3());
        } else {
            if (iM27428k4 != 8) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectDag", new C9295yl());
        }
        this.f28706kk = c7394ca;
        return this.f28706kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m39293x1(String str) {
        C7394ca c7394ca;
        if (this.f28708x1 != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        switch (f28704du.m27428k4(str)) {
            case 1:
                c7394ca = new C7394ca("noFill", new C8130kt());
                break;
            case 2:
                c7394ca = new C7394ca("solidFill", new C8256md());
                break;
            case 3:
                c7394ca = new C7394ca("gradFill", new C8403o4());
                break;
            case 4:
                c7394ca = new C7394ca("blipFill", new C9220xo());
                break;
            case 5:
                c7394ca = new C7394ca("pattFill", new C7416cl());
                break;
            case 6:
                c7394ca = new C7394ca("grpFill", new C9112wh());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f28708x1 = c7394ca;
        return this.f28708x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39287k4(AbstractC7414ck abstractC7414ck) {
        this.f28707to = (ltr) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28705k4;
        if (z) {
            c3059ii.m12955x1("shadeToTitle", z ? "1" : "0");
        }
        C7394ca c7394ca = this.f28708x1;
        if (c7394ca != null) {
            switch (f28704du.m27428k4(c7394ca.m29539k4())) {
                case 1:
                    ((C8130kt) this.f28708x1.m29541kk()).mo6846k4("a", c3059ii, this.f28708x1.m29539k4());
                    break;
                case 2:
                    ((C8256md) this.f28708x1.m29541kk()).mo6846k4("a", c3059ii, this.f28708x1.m29539k4());
                    break;
                case 3:
                    ((C8403o4) this.f28708x1.m29541kk()).mo6846k4("a", c3059ii, this.f28708x1.m29539k4());
                    break;
                case 4:
                    ((C9220xo) this.f28708x1.m29541kk()).mo6846k4("a", c3059ii, this.f28708x1.m29539k4());
                    break;
                case 5:
                    ((C7416cl) this.f28708x1.m29541kk()).mo6846k4("a", c3059ii, this.f28708x1.m29539k4());
                    break;
                case 6:
                    ((C9112wh) this.f28708x1.m29541kk()).mo6846k4("a", c3059ii, this.f28708x1.m29539k4());
                    break;
            }
        }
        C7394ca c7394ca2 = this.f28706kk;
        if (c7394ca2 != null) {
            int iM27428k4 = f28704du.m27428k4(c7394ca2.m29539k4());
            if (iM27428k4 == 7) {
                ((C8490p3) this.f28706kk.m29541kk()).mo6846k4("a", c3059ii, this.f28706kk.m29539k4());
            } else if (iM27428k4 == 8) {
                ((C9295yl) this.f28706kk.m29541kk()).mo6846k4("a", c3059ii, this.f28706kk.m29539k4());
            }
        }
        ltr ltrVar = this.f28707to;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39288k4(boolean z) {
        this.f28705k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m39289k4() {
        return this.f28705k4;
    }
}
