package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.y5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9259y5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private C7394ca f33207du;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f33208h4;

    /* JADX INFO: renamed from: kk */
    private int f33209kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f33210m9;

    /* JADX INFO: renamed from: to */
    private int f33211to;

    /* JADX INFO: renamed from: k4 */
    public static final int f33205k4 = C8797sq.m41218k4("def");

    /* JADX INFO: renamed from: x1 */
    public static final int f33206x1 = C8797sq.m41218k4("def");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f33204dy = new C7017h4("b", ContextChain.TAG_INFRA, "font", "fontRef", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr", "extLst");

    public C9259y5() {
        m44806m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m44806m9() {
        this.f33209kk = f33205k4;
        this.f33211to = f33206x1;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC7414ck m44809du() {
        return this.f33210m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m44810k4() {
        return this.f33209kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m44814kk() {
        return this.f33207du;
    }

    /* JADX INFO: renamed from: to */
    public final C7394ca m44815to() {
        return this.f33208h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m44816x1() {
        return this.f33211to;
    }

    public C9259y5(final AbstractC13912i5 abstractC13912i5) {
        m44806m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.y5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9259y5.f33204dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9259y5.this.f33209kk = C8797sq.m41218k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9259y5.this.f33211to = C8797sq.m41218k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.y5.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9259y5 c9259y5;
                C7394ca c7394ca;
                C9259y5 c9259y52;
                C7394ca c7394ca2;
                switch (C9259y5.f33204dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        c9259y5 = C9259y5.this;
                        c7394ca = new C7394ca("font", new C7859hj(abstractC13912i5));
                        c9259y5.f33207du = c7394ca;
                        return true;
                    case 3:
                        c9259y5 = C9259y5.this;
                        c7394ca = new C7394ca("fontRef", new C7803gv(abstractC13912i5));
                        c9259y5.f33207du = c7394ca;
                        return true;
                    case 4:
                        c9259y52 = C9259y5.this;
                        c7394ca2 = new C7394ca("scrgbClr", new C9395zr(abstractC13912i5));
                        c9259y52.f33208h4 = c7394ca2;
                        return true;
                    case 5:
                        c9259y52 = C9259y5.this;
                        c7394ca2 = new C7394ca("srgbClr", new C7670fk(abstractC13912i5));
                        c9259y52.f33208h4 = c7394ca2;
                        return true;
                    case 6:
                        c9259y52 = C9259y5.this;
                        c7394ca2 = new C7394ca("hslClr", new C9052vm(abstractC13912i5));
                        c9259y52.f33208h4 = c7394ca2;
                        return true;
                    case 7:
                        c9259y52 = C9259y5.this;
                        c7394ca2 = new C7394ca("sysClr", new C7939il(abstractC13912i5));
                        c9259y52.f33208h4 = c7394ca2;
                        return true;
                    case 8:
                        c9259y52 = C9259y5.this;
                        c7394ca2 = new C7394ca("schemeClr", new C8732s1(abstractC13912i5));
                        c9259y52.f33208h4 = c7394ca2;
                        return true;
                    case 9:
                        c9259y52 = C9259y5.this;
                        c7394ca2 = new C7394ca("prstClr", new C8065k9(abstractC13912i5));
                        c9259y52.f33208h4 = c7394ca2;
                        return true;
                    case 10:
                        C9259y5.this.f33210m9 = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m44811k4(String str) {
        C7394ca c7394ca;
        if (this.f33208h4 != null) {
            throw new Exception("Color already is initialized.");
        }
        switch (f33204dy.m27428k4(str)) {
            case 4:
                c7394ca = new C7394ca("scrgbClr", new C9395zr());
                break;
            case 5:
                c7394ca = new C7394ca("srgbClr", new C7670fk());
                break;
            case 6:
                c7394ca = new C7394ca("hslClr", new C9052vm());
                break;
            case 7:
                c7394ca = new C7394ca("sysClr", new C7939il());
                break;
            case 8:
                c7394ca = new C7394ca("schemeClr", new C8732s1());
                break;
            case 9:
                c7394ca = new C7394ca("prstClr", new C8065k9());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f33208h4 = c7394ca;
        return this.f33208h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m44817x1(String str) {
        C7394ca c7394ca;
        if (this.f33207du != null) {
            throw new Exception("ThemeableFontStyles already is initialized.");
        }
        int iM27428k4 = f33204dy.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("font", new C7859hj());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("fontRef", new C7803gv());
        }
        this.f33207du = c7394ca;
        return this.f33207du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44818x1(int i) {
        this.f33211to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44812k4(int i) {
        this.f33209kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44813k4(AbstractC7414ck abstractC7414ck) {
        this.f33210m9 = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33209kk;
        if (i != f33205k4) {
            c3059ii.m12955x1("b", C8797sq.m41219k4(i));
        }
        int i2 = this.f33211to;
        if (i2 != f33206x1) {
            c3059ii.m12955x1(ContextChain.TAG_INFRA, C8797sq.m41219k4(i2));
        }
        C7394ca c7394ca = this.f33207du;
        if (c7394ca != null) {
            int iM27428k4 = f33204dy.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((C7859hj) this.f33207du.m29541kk()).mo6846k4("a", c3059ii, this.f33207du.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C7803gv) this.f33207du.m29541kk()).mo6846k4("a", c3059ii, this.f33207du.m29539k4());
            }
        }
        C7394ca c7394ca2 = this.f33208h4;
        if (c7394ca2 != null) {
            switch (f33204dy.m27428k4(c7394ca2.m29539k4())) {
                case 4:
                    ((C9395zr) this.f33208h4.m29541kk()).mo6846k4("a", c3059ii, this.f33208h4.m29539k4());
                    break;
                case 5:
                    ((C7670fk) this.f33208h4.m29541kk()).mo6846k4("a", c3059ii, this.f33208h4.m29539k4());
                    break;
                case 6:
                    ((C9052vm) this.f33208h4.m29541kk()).mo6846k4("a", c3059ii, this.f33208h4.m29539k4());
                    break;
                case 7:
                    ((C7939il) this.f33208h4.m29541kk()).mo6846k4("a", c3059ii, this.f33208h4.m29539k4());
                    break;
                case 8:
                    ((C8732s1) this.f33208h4.m29541kk()).mo6846k4("a", c3059ii, this.f33208h4.m29539k4());
                    break;
                case 9:
                    ((C8065k9) this.f33208h4.m29541kk()).mo6846k4("a", c3059ii, this.f33208h4.m29539k4());
                    break;
            }
        }
        C8397nz c8397nz = this.f33210m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
