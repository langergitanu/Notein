package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fe */
/* JADX INFO: loaded from: classes4.dex */
public class C7664fe extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f22801m9 = new C7017h4("bwMode", "xfrm", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag", "scene3d", "extLst");

    /* JADX INFO: renamed from: du */
    private C8820sx f22802du;

    /* JADX INFO: renamed from: h4 */
    private C8397nz f22803h4;

    /* JADX INFO: renamed from: k4 */
    private byte f22804k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f22805kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f22806to;

    /* JADX INFO: renamed from: x1 */
    private C8150l0 f22807x1;

    public C7664fe() {
        m31748dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m31748dy() {
        this.f22804k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final C7394ca m31756du() {
        return this.f22806to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8820sx m31757h4() {
        return this.f22802du;
    }

    /* JADX INFO: renamed from: kk */
    public final C8150l0 m31760kk() {
        return this.f22807x1;
    }

    /* JADX INFO: renamed from: to */
    public final C7394ca m31761to() {
        return this.f22805kk;
    }

    public C7664fe(final AbstractC13912i5 abstractC13912i5) {
        m31748dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fe.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7664fe.f22801m9.m27428k4(str) != 0) {
                    return false;
                }
                C7664fe.this.f22804k4 = C8384nv.m37862k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fe.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7664fe c7664fe;
                C7394ca c7394ca;
                C7664fe c7664fe2;
                C7394ca c7394ca2;
                switch (C7664fe.f22801m9.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C7664fe.this.f22807x1 = new C8150l0(abstractC13912i5);
                        return true;
                    case 2:
                        c7664fe = C7664fe.this;
                        c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                        c7664fe.f22805kk = c7394ca;
                        return true;
                    case 3:
                        c7664fe = C7664fe.this;
                        c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                        c7664fe.f22805kk = c7394ca;
                        return true;
                    case 4:
                        c7664fe = C7664fe.this;
                        c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                        c7664fe.f22805kk = c7394ca;
                        return true;
                    case 5:
                        c7664fe = C7664fe.this;
                        c7394ca = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                        c7664fe.f22805kk = c7394ca;
                        return true;
                    case 6:
                        c7664fe = C7664fe.this;
                        c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                        c7664fe.f22805kk = c7394ca;
                        return true;
                    case 7:
                        c7664fe = C7664fe.this;
                        c7394ca = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                        c7664fe.f22805kk = c7394ca;
                        return true;
                    case 8:
                        c7664fe2 = C7664fe.this;
                        c7394ca2 = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                        c7664fe2.f22806to = c7394ca2;
                        return true;
                    case 9:
                        c7664fe2 = C7664fe.this;
                        c7394ca2 = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                        c7664fe2.f22806to = c7394ca2;
                        return true;
                    case 10:
                        C7664fe.this.f22802du = new C8820sx(abstractC13912i5);
                        return true;
                    case 11:
                        C7664fe.this.f22803h4 = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m31762x1(String str) {
        C7394ca c7394ca;
        if (this.f22805kk != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        switch (f22801m9.m27428k4(str)) {
            case 2:
                c7394ca = new C7394ca("noFill", new C8130kt());
                break;
            case 3:
                c7394ca = new C7394ca("solidFill", new C8256md());
                break;
            case 4:
                c7394ca = new C7394ca("gradFill", new C8403o4());
                break;
            case 5:
                c7394ca = new C7394ca("blipFill", new C9220xo());
                break;
            case 6:
                c7394ca = new C7394ca("pattFill", new C7416cl());
                break;
            case 7:
                c7394ca = new C7394ca("grpFill", new C9112wh());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f22805kk = c7394ca;
        return this.f22805kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m31758k4(String str) {
        C7394ca c7394ca;
        if (this.f22806to != null) {
            throw new Exception("EffectProperties already is initialized.");
        }
        int iM27428k4 = f22801m9.m27428k4(str);
        if (iM27428k4 == 8) {
            c7394ca = new C7394ca("effectLst", new C8490p3());
        } else {
            if (iM27428k4 != 9) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectDag", new C9295yl());
        }
        this.f22806to = c7394ca;
        return this.f22806to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8820sx m31763x1() {
        if (this.f22802du != null) {
            throw new Exception("Only one <scene3d> element can be added.");
        }
        C8820sx c8820sx = new C8820sx();
        this.f22802du = c8820sx;
        return c8820sx;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8150l0 m31759k4() {
        if (this.f22807x1 != null) {
            throw new Exception("Only one <xfrm> element can be added.");
        }
        C8150l0 c8150l0 = new C8150l0();
        this.f22807x1 = c8150l0;
        return c8150l0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f22804k4;
        if (b != -1) {
            c3059ii.m12955x1("bwMode", C8384nv.m37863k4(b));
        }
        C8150l0 c8150l0 = this.f22807x1;
        if (c8150l0 != null) {
            c8150l0.mo6846k4("a", c3059ii, "xfrm");
        }
        C7394ca c7394ca = this.f22805kk;
        if (c7394ca != null) {
            switch (f22801m9.m27428k4(c7394ca.m29539k4())) {
                case 2:
                    ((C8130kt) this.f22805kk.m29541kk()).mo6846k4("a", c3059ii, this.f22805kk.m29539k4());
                    break;
                case 3:
                    ((C8256md) this.f22805kk.m29541kk()).mo6846k4("a", c3059ii, this.f22805kk.m29539k4());
                    break;
                case 4:
                    ((C8403o4) this.f22805kk.m29541kk()).mo6846k4("a", c3059ii, this.f22805kk.m29539k4());
                    break;
                case 5:
                    ((C9220xo) this.f22805kk.m29541kk()).mo6846k4("a", c3059ii, this.f22805kk.m29539k4());
                    break;
                case 6:
                    ((C7416cl) this.f22805kk.m29541kk()).mo6846k4("a", c3059ii, this.f22805kk.m29539k4());
                    break;
                case 7:
                    ((C9112wh) this.f22805kk.m29541kk()).mo6846k4("a", c3059ii, this.f22805kk.m29539k4());
                    break;
            }
        }
        C7394ca c7394ca2 = this.f22806to;
        if (c7394ca2 != null) {
            int iM27428k4 = f22801m9.m27428k4(c7394ca2.m29539k4());
            if (iM27428k4 == 8) {
                ((C8490p3) this.f22806to.m29541kk()).mo6846k4("a", c3059ii, this.f22806to.m29539k4());
            } else if (iM27428k4 == 9) {
                ((C9295yl) this.f22806to.m29541kk()).mo6846k4("a", c3059ii, this.f22806to.m29539k4());
            }
        }
        C8820sx c8820sx = this.f22802du;
        if (c8820sx != null) {
            c8820sx.mo6846k4("a", c3059ii, "scene3d");
        }
        C8397nz c8397nz = this.f22803h4;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
