package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xn */
/* JADX INFO: loaded from: classes4.dex */
public class C9218xn extends AbstractC7523dy implements InterfaceC8632qw {

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f32954ix = new C7017h4("axId", "scaling", RequestParameters.SUBRESOURCE_DELETE, "axPos", "majorGridlines", "minorGridlines", NoteMeta.PROPERTY_TITLE, "numFmt", "majorTickMark", "minorTickMark", "tickLblPos", "spPr", "txPr", "crossAx", "crosses", "crossesAt", "tickLblSkip", "tickMarkSkip", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7986jb f32955c5;

    /* JADX INFO: renamed from: ck */
    private C9100wa f32956ck;

    /* JADX INFO: renamed from: du */
    private C7571eh f32957du;

    /* JADX INFO: renamed from: dy */
    private C7937ik f32958dy;

    /* JADX INFO: renamed from: fa */
    private C8087kh f32959fa;

    /* JADX INFO: renamed from: h4 */
    private C7571eh f32960h4;

    /* JADX INFO: renamed from: jd */
    private C7986jb f32961jd;

    /* JADX INFO: renamed from: k4 */
    private C8827t0 f32962k4;

    /* JADX INFO: renamed from: kk */
    private C8828t1 f32963kk;

    /* JADX INFO: renamed from: ks */
    private C7394ca f32964ks;

    /* JADX INFO: renamed from: m9 */
    private C8741s5 f32965m9;

    /* JADX INFO: renamed from: ne */
    private C7683fo f32966ne;

    /* JADX INFO: renamed from: rv */
    private C7668fi f32967rv;

    /* JADX INFO: renamed from: to */
    private C7727g4 f32968to;

    /* JADX INFO: renamed from: up */
    private C8952ug f32969up;

    /* JADX INFO: renamed from: x1 */
    private C8183lh f32970x1;

    /* JADX INFO: renamed from: x6 */
    private C7668fi f32971x6;

    /* JADX INFO: renamed from: yj */
    private C8827t0 f32972yj;

    public C9218xn() {
        this.f32962k4 = new C8827t0();
        this.f32970x1 = new C8183lh();
        this.f32968to = new C7727g4();
        this.f32972yj = new C8827t0();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: ak */
    public C7668fi mo30699ak() {
        return this.f32971x6;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: ar */
    public C8827t0 mo28012ar() {
        return this.f32972yj;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: c5 */
    public C7571eh mo28016c5() {
        if (this.f32960h4 != null) {
            throw new Exception("Only one <minorGridlines> element can be added.");
        }
        C7571eh c7571eh = new C7571eh();
        this.f32960h4 = c7571eh;
        return c7571eh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: c6 */
    public AbstractC7414ck mo28017c6() {
        return this.f32966ne;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: ck */
    public C8741s5 mo28018ck() {
        if (this.f32965m9 != null) {
            throw new Exception("Only one <title> element can be added.");
        }
        C8741s5 c8741s5 = new C8741s5();
        this.f32965m9 = c8741s5;
        return c8741s5;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: du */
    public C7727g4 mo28019du() {
        return this.f32968to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: dy */
    public C7571eh mo28020dy() {
        return this.f32960h4;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8632qw
    /* JADX INFO: renamed from: e0 */
    public final C7668fi mo39626e0() {
        if (this.f32971x6 != null) {
            throw new Exception("Only one <tickMarkSkip> element can be added.");
        }
        C7668fi c7668fi = new C7668fi();
        this.f32971x6 = c7668fi;
        return c7668fi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: fa */
    public C7937ik mo28021fa() {
        return this.f32958dy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: h4 */
    public C7571eh mo28024h4() {
        return this.f32957du;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: ix */
    public C9100wa mo28025ix() {
        if (this.f32956ck != null) {
            throw new Exception("Only one <tickLblPos> element can be added.");
        }
        C9100wa c9100wa = new C9100wa();
        this.f32956ck = c9100wa;
        return c9100wa;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: jd */
    public C8741s5 mo28026jd() {
        return this.f32965m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: kk */
    public C8828t1 mo28030kk() {
        return this.f32963kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: ks */
    public C7986jb mo28032ks() {
        if (this.f32955c5 != null) {
            throw new Exception("Only one <majorTickMark> element can be added.");
        }
        C7986jb c7986jb = new C7986jb();
        this.f32955c5 = c7986jb;
        return c7986jb;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: m9 */
    public C7571eh mo28033m9() {
        if (this.f32957du != null) {
            throw new Exception("Only one <majorGridlines> element can be added.");
        }
        C7571eh c7571eh = new C7571eh();
        this.f32957du = c7571eh;
        return c7571eh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: ne */
    public C9100wa mo28034ne() {
        return this.f32956ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: qq */
    public C8952ug mo28036qq() {
        if (this.f32969up != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f32969up = c8952ug;
        return c8952ug;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: rv */
    public C7986jb mo28037rv() {
        return this.f32961jd;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: to */
    public C8828t1 mo28041to() {
        if (this.f32963kk != null) {
            throw new Exception("Only one <delete> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32963kk = c8828t1;
        return c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.InterfaceC8632qw
    /* JADX INFO: renamed from: ts */
    public final C7668fi mo39627ts() {
        if (this.f32967rv != null) {
            throw new Exception("Only one <tickLblSkip> element can be added.");
        }
        C7668fi c7668fi = new C7668fi();
        this.f32967rv = c7668fi;
        return c7668fi;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: u4 */
    public C8087kh mo28042u4() {
        return this.f32959fa;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: um */
    public C7394ca mo28043um() {
        return this.f32964ks;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: up */
    public C7937ik mo28044up() {
        if (this.f32958dy != null) {
            throw new Exception("Only one <numFmt> element can be added.");
        }
        C7937ik c7937ik = new C7937ik();
        this.f32958dy = c7937ik;
        return c7937ik;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: uz */
    public C8087kh mo28045uz() {
        if (this.f32959fa != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f32959fa = c8087kh;
        return c8087kh;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: wl */
    public C8952ug mo28046wl() {
        return this.f32969up;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: wy */
    public C7668fi mo30705wy() {
        return this.f32967rv;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: x6 */
    public C7986jb mo28049x6() {
        if (this.f32961jd != null) {
            throw new Exception("Only one <minorTickMark> element can be added.");
        }
        C7986jb c7986jb = new C7986jb();
        this.f32961jd = c7986jb;
        return c7986jb;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: yj */
    public C7986jb mo28051yj() {
        return this.f32955c5;
    }

    public C9218xn(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9218xn c9218xn;
                C7394ca c7394ca;
                switch (C9218xn.f32954ix.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C9218xn.this.f32962k4 = new C8827t0(abstractC13912i5);
                        return true;
                    case 1:
                        C9218xn.this.f32970x1 = new C8183lh(abstractC13912i5);
                        return true;
                    case 2:
                        C9218xn.this.f32963kk = new C8828t1(abstractC13912i5);
                        return true;
                    case 3:
                        C9218xn.this.f32968to = new C7727g4(abstractC13912i5);
                        return true;
                    case 4:
                        C9218xn.this.f32957du = new C7571eh(abstractC13912i5);
                        return true;
                    case 5:
                        C9218xn.this.f32960h4 = new C7571eh(abstractC13912i5);
                        return true;
                    case 6:
                        C9218xn.this.f32965m9 = new C8741s5(abstractC13912i5);
                        return true;
                    case 7:
                        C9218xn.this.f32958dy = new C7937ik(abstractC13912i5);
                        return true;
                    case 8:
                        C9218xn.this.f32955c5 = new C7986jb(abstractC13912i5);
                        return true;
                    case 9:
                        C9218xn.this.f32961jd = new C7986jb(abstractC13912i5);
                        return true;
                    case 10:
                        C9218xn.this.f32956ck = new C9100wa(abstractC13912i5);
                        return true;
                    case 11:
                        C9218xn.this.f32959fa = new C8087kh(abstractC13912i5);
                        return true;
                    case 12:
                        C9218xn.this.f32969up = new C8952ug(abstractC13912i5);
                        return true;
                    case 13:
                        C9218xn.this.f32972yj = new C8827t0(abstractC13912i5);
                        return true;
                    case 14:
                        c9218xn = C9218xn.this;
                        c7394ca = new C7394ca("crosses", new C8085kg(abstractC13912i5));
                        break;
                    case 15:
                        c9218xn = C9218xn.this;
                        c7394ca = new C7394ca("crossesAt", new C7405cg(abstractC13912i5));
                        break;
                    case 16:
                        C9218xn.this.f32967rv = new C7668fi(abstractC13912i5);
                        return true;
                    case 17:
                        C9218xn.this.f32971x6 = new C7668fi(abstractC13912i5);
                        return true;
                    case 18:
                        C9218xn.this.f32966ne = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                c9218xn.f32964ks = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: k4 */
    public C7394ca mo28027k4(String str) {
        C7394ca c7394ca;
        if (this.f32964ks != null) {
            throw new Exception("Crossing already is initialized.");
        }
        int iM27428k4 = f32954ix.m27428k4(str);
        if (iM27428k4 == 14) {
            c7394ca = new C7394ca("crosses", new C8085kg());
        } else {
            if (iM27428k4 != 15) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("crossesAt", new C7405cg());
        }
        this.f32964ks = c7394ca;
        return this.f32964ks;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: x1 */
    public C8183lh mo28048x1() {
        return this.f32970x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: k4 */
    public C8827t0 mo28028k4() {
        return this.f32962k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7523dy
    /* JADX INFO: renamed from: k4 */
    public void mo28029k4(AbstractC7414ck abstractC7414ck) {
        this.f32966ne = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f32962k4.mo6846k4("c", c3059ii, "axId");
        this.f32970x1.mo6846k4("c", c3059ii, "scaling");
        C8828t1 c8828t1 = this.f32963kk;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, RequestParameters.SUBRESOURCE_DELETE);
        }
        this.f32968to.mo6846k4("c", c3059ii, "axPos");
        C7571eh c7571eh = this.f32957du;
        if (c7571eh != null) {
            c7571eh.mo6846k4("c", c3059ii, "majorGridlines");
        }
        C7571eh c7571eh2 = this.f32960h4;
        if (c7571eh2 != null) {
            c7571eh2.mo6846k4("c", c3059ii, "minorGridlines");
        }
        C8741s5 c8741s5 = this.f32965m9;
        if (c8741s5 != null) {
            c8741s5.mo6846k4("c", c3059ii, NoteMeta.PROPERTY_TITLE);
        }
        C7937ik c7937ik = this.f32958dy;
        if (c7937ik != null) {
            c7937ik.mo6846k4("c", c3059ii, "numFmt");
        }
        C7986jb c7986jb = this.f32955c5;
        if (c7986jb != null) {
            c7986jb.mo6846k4("c", c3059ii, "majorTickMark");
        }
        C7986jb c7986jb2 = this.f32961jd;
        if (c7986jb2 != null) {
            c7986jb2.mo6846k4("c", c3059ii, "minorTickMark");
        }
        C9100wa c9100wa = this.f32956ck;
        if (c9100wa != null) {
            c9100wa.mo6846k4("c", c3059ii, "tickLblPos");
        }
        C8087kh c8087kh = this.f32959fa;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f32969up;
        if (c8952ug != null) {
            c8952ug.mo6846k4("c", c3059ii, "txPr");
        }
        this.f32972yj.mo6846k4("c", c3059ii, "crossAx");
        C7394ca c7394ca = this.f32964ks;
        if (c7394ca != null) {
            int iM27428k4 = f32954ix.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 14) {
                ((C8085kg) this.f32964ks.m29541kk()).mo6846k4("c", c3059ii, this.f32964ks.m29539k4());
            } else if (iM27428k4 == 15) {
                ((C7405cg) this.f32964ks.m29541kk()).mo6846k4("c", c3059ii, this.f32964ks.m29539k4());
            }
        }
        C7668fi c7668fi = this.f32967rv;
        if (c7668fi != null) {
            c7668fi.mo6846k4("c", c3059ii, "tickLblSkip");
        }
        C7668fi c7668fi2 = this.f32971x6;
        if (c7668fi2 != null) {
            c7668fi2.mo6846k4("c", c3059ii, "tickMarkSkip");
        }
        C7683fo c7683fo = this.f32966ne;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
