package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kh */
/* JADX INFO: loaded from: classes4.dex */
public class C8087kh extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f25655jd = new C7017h4("bwMode", "xfrm", "custGeom", "prstGeom", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "ln", "effectLst", "effectDag", "scene3d", "sp3d", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8397nz f25656c5;

    /* JADX INFO: renamed from: du */
    private C8985uy f25657du;

    /* JADX INFO: renamed from: dy */
    private C8638qy f25658dy;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f25659h4;

    /* JADX INFO: renamed from: k4 */
    private byte f25660k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f25661kk;

    /* JADX INFO: renamed from: m9 */
    private C8820sx f25662m9;

    /* JADX INFO: renamed from: to */
    private C7394ca f25663to;

    /* JADX INFO: renamed from: x1 */
    private C9030ve f25664x1;

    public C8087kh() {
        m35365ks();
    }

    /* JADX INFO: renamed from: ks */
    private void m35365ks() {
        this.f25660k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: c5 */
    public final C8985uy m35368c5() {
        return this.f25657du;
    }

    /* JADX INFO: renamed from: ck */
    public final C8820sx m35369ck() {
        return this.f25662m9;
    }

    /* JADX INFO: renamed from: du */
    public final byte m35370du() {
        return this.f25660k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C7394ca m35371dy() {
        return this.f25663to;
    }

    /* JADX INFO: renamed from: fa */
    public final C8638qy m35372fa() {
        return this.f25658dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9030ve m35373h4() {
        return this.f25664x1;
    }

    /* JADX INFO: renamed from: jd */
    public final C7394ca m35374jd() {
        return this.f25659h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7394ca m35387m9() {
        return this.f25661kk;
    }

    /* JADX INFO: renamed from: to */
    public final C8638qy m35388to() {
        if (this.f25658dy != null) {
            throw new Exception("Only one <sp3d> element can be added.");
        }
        C8638qy c8638qy = new C8638qy();
        this.f25658dy = c8638qy;
        return c8638qy;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC7414ck m35389up() {
        return this.f25656c5;
    }

    public C8087kh(final AbstractC13912i5 abstractC13912i5) {
        m35365ks();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8087kh.f25655jd.m27428k4(str) != 0) {
                    return false;
                }
                C8087kh.this.f25660k4 = C8384nv.m37862k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8087kh c8087kh;
                C7394ca c7394ca;
                C8087kh c8087kh2;
                C7394ca c7394ca2;
                C8087kh c8087kh3;
                C7394ca c7394ca3;
                switch (C8087kh.f25655jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C8087kh.this.f25664x1 = new C9030ve(abstractC13912i5);
                        return true;
                    case 2:
                        c8087kh = C8087kh.this;
                        c7394ca = new C7394ca("custGeom", new C7707fw(abstractC13912i5));
                        c8087kh.f25661kk = c7394ca;
                        return true;
                    case 3:
                        c8087kh = C8087kh.this;
                        c7394ca = new C7394ca("prstGeom", new C9365zg(abstractC13912i5));
                        c8087kh.f25661kk = c7394ca;
                        return true;
                    case 4:
                        c8087kh2 = C8087kh.this;
                        c7394ca2 = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                        c8087kh2.f25663to = c7394ca2;
                        return true;
                    case 5:
                        c8087kh2 = C8087kh.this;
                        c7394ca2 = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                        c8087kh2.f25663to = c7394ca2;
                        return true;
                    case 6:
                        c8087kh2 = C8087kh.this;
                        c7394ca2 = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                        c8087kh2.f25663to = c7394ca2;
                        return true;
                    case 7:
                        c8087kh2 = C8087kh.this;
                        c7394ca2 = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                        c8087kh2.f25663to = c7394ca2;
                        return true;
                    case 8:
                        c8087kh2 = C8087kh.this;
                        c7394ca2 = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                        c8087kh2.f25663to = c7394ca2;
                        return true;
                    case 9:
                        c8087kh2 = C8087kh.this;
                        c7394ca2 = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                        c8087kh2.f25663to = c7394ca2;
                        return true;
                    case 10:
                        C8087kh.this.f25657du = new C8985uy(abstractC13912i5);
                        return true;
                    case 11:
                        c8087kh3 = C8087kh.this;
                        c7394ca3 = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                        c8087kh3.f25659h4 = c7394ca3;
                        return true;
                    case 12:
                        c8087kh3 = C8087kh.this;
                        c7394ca3 = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                        c8087kh3.f25659h4 = c7394ca3;
                        return true;
                    case 13:
                        C8087kh.this.f25662m9 = new C8820sx(abstractC13912i5);
                        return true;
                    case 14:
                        C8087kh.this.f25658dy = new C8638qy(abstractC13912i5);
                        return true;
                    case 15:
                        C8087kh.this.f25656c5 = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m35384kk(String str) {
        C7394ca c7394ca;
        if (this.f25661kk != null) {
            throw new Exception("Geometry already is initialized.");
        }
        int iM27428k4 = f25655jd.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("custGeom", new C7707fw());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("prstGeom", new C9365zg());
        }
        this.f25661kk = c7394ca;
        return this.f25661kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m35390x1(String str) {
        C7394ca c7394ca;
        if (this.f25663to != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        switch (f25655jd.m27428k4(str)) {
            case 4:
                c7394ca = new C7394ca("noFill", new C8130kt());
                break;
            case 5:
                c7394ca = new C7394ca("solidFill", new C8256md());
                break;
            case 6:
                c7394ca = new C7394ca("gradFill", new C8403o4());
                break;
            case 7:
                c7394ca = new C7394ca("blipFill", new C9220xo());
                break;
            case 8:
                c7394ca = new C7394ca("pattFill", new C7416cl());
                break;
            case 9:
                c7394ca = new C7394ca("grpFill", new C9112wh());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f25663to = c7394ca;
        return this.f25663to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m35375k4(String str) {
        C7394ca c7394ca;
        if (this.f25659h4 != null) {
            throw new Exception("EffectProperties already is initialized.");
        }
        int iM27428k4 = f25655jd.m27428k4(str);
        if (iM27428k4 == 11) {
            c7394ca = new C7394ca("effectLst", new C8490p3());
        } else {
            if (iM27428k4 != 12) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectDag", new C9295yl());
        }
        this.f25659h4 = c7394ca;
        return this.f25659h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8820sx m35385kk() {
        if (this.f25662m9 != null) {
            throw new Exception("Only one <scene3d> element can be added.");
        }
        C8820sx c8820sx = new C8820sx();
        this.f25662m9 = c8820sx;
        return c8820sx;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8985uy m35391x1() {
        if (this.f25657du != null) {
            throw new Exception("Only one <ln> element can be added.");
        }
        C8985uy c8985uy = new C8985uy();
        this.f25657du = c8985uy;
        return c8985uy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35386kk(C7394ca c7394ca) {
        this.f25659h4 = c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35392x1(C7394ca c7394ca) {
        this.f25663to = c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9030ve m35376k4() {
        if (this.f25664x1 != null) {
            throw new Exception("Only one <xfrm> element can be added.");
        }
        C9030ve c9030ve = new C9030ve();
        this.f25664x1 = c9030ve;
        return c9030ve;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35377k4(byte b) {
        this.f25660k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35378k4(C7394ca c7394ca) {
        this.f25661kk = c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35379k4(AbstractC7414ck abstractC7414ck) {
        this.f25656c5 = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35380k4(C8638qy c8638qy) {
        this.f25658dy = c8638qy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35381k4(C8820sx c8820sx) {
        this.f25662m9 = c8820sx;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35382k4(C8985uy c8985uy) {
        this.f25657du = c8985uy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35383k4(C9030ve c9030ve) {
        this.f25664x1 = c9030ve;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f25660k4;
        if (b != -1) {
            c3059ii.m12955x1("bwMode", C8384nv.m37863k4(b));
        }
        C9030ve c9030ve = this.f25664x1;
        if (c9030ve != null) {
            c9030ve.mo6846k4("a", c3059ii, "xfrm");
        }
        C7394ca c7394ca = this.f25661kk;
        if (c7394ca != null) {
            int iM27428k4 = f25655jd.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((C7707fw) this.f25661kk.m29541kk()).mo6846k4("a", c3059ii, this.f25661kk.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C9365zg) this.f25661kk.m29541kk()).mo6846k4("a", c3059ii, this.f25661kk.m29539k4());
            }
        }
        C7394ca c7394ca2 = this.f25663to;
        if (c7394ca2 != null) {
            switch (f25655jd.m27428k4(c7394ca2.m29539k4())) {
                case 4:
                    ((C8130kt) this.f25663to.m29541kk()).mo6846k4("a", c3059ii, this.f25663to.m29539k4());
                    break;
                case 5:
                    ((C8256md) this.f25663to.m29541kk()).mo6846k4("a", c3059ii, this.f25663to.m29539k4());
                    break;
                case 6:
                    ((C8403o4) this.f25663to.m29541kk()).mo6846k4("a", c3059ii, this.f25663to.m29539k4());
                    break;
                case 7:
                    ((C9220xo) this.f25663to.m29541kk()).mo6846k4("a", c3059ii, this.f25663to.m29539k4());
                    break;
                case 8:
                    ((C7416cl) this.f25663to.m29541kk()).mo6846k4("a", c3059ii, this.f25663to.m29539k4());
                    break;
                case 9:
                    ((C9112wh) this.f25663to.m29541kk()).mo6846k4("a", c3059ii, this.f25663to.m29539k4());
                    break;
            }
        }
        C8985uy c8985uy = this.f25657du;
        if (c8985uy != null) {
            c8985uy.mo6846k4("a", c3059ii, "ln");
        }
        C7394ca c7394ca3 = this.f25659h4;
        if (c7394ca3 != null) {
            int iM27428k42 = f25655jd.m27428k4(c7394ca3.m29539k4());
            if (iM27428k42 == 11) {
                ((C8490p3) this.f25659h4.m29541kk()).mo6846k4("a", c3059ii, this.f25659h4.m29539k4());
            } else if (iM27428k42 == 12) {
                ((C9295yl) this.f25659h4.m29541kk()).mo6846k4("a", c3059ii, this.f25659h4.m29539k4());
            }
        }
        C8820sx c8820sx = this.f25662m9;
        if (c8820sx != null) {
            c8820sx.mo6846k4("a", c3059ii, "scene3d");
        }
        C8638qy c8638qy = this.f25658dy;
        if (c8638qy != null) {
            c8638qy.mo6846k4("a", c3059ii, "sp3d");
        }
        C8397nz c8397nz = this.f25656c5;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
