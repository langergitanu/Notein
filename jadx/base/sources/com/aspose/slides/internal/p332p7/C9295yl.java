package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yl */
/* JADX INFO: loaded from: classes4.dex */
public class C9295yl extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private String f33435kk;

    /* JADX INFO: renamed from: to */
    private List<C7394ca> f33436to;

    /* JADX INFO: renamed from: x1 */
    private int f33437x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f33434k4 = C7530e2.m30738k4("sib");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33433du = new C7017h4(C18437z2.f56754h, "name", "cont", "effect", "alphaBiLevel", "alphaCeiling", "alphaFloor", "alphaInv", "alphaMod", "alphaModFix", "alphaOutset", "alphaRepl", "biLevel", "blend", "blur", "clrChange", "clrRepl", "duotone", "fill", "fillOverlay", "glow", "grayscl", "hsl", "innerShdw", "lum", "outerShdw", "prstShdw", "reflection", "relOff", "softEdge", "tint", "xfrm");

    public C9295yl() {
        m45052x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45052x1() {
        this.f33437x1 = f33434k4;
        this.f33436to = new List<>();
    }

    public C9295yl(final AbstractC13912i5 abstractC13912i5) {
        m45052x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9295yl.f33433du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9295yl.this.f33437x1 = C7530e2.m30738k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9295yl.this.f33435kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yl.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C9295yl.f33433du.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        C9295yl c9295yl = new C9295yl(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("cont", c9295yl);
                        break;
                    case 3:
                        C8966un c8966un = new C8966un(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("effect", c8966un);
                        break;
                    case 4:
                        C7770gj c7770gj = new C7770gj(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaBiLevel", c7770gj);
                        break;
                    case 5:
                        C8635qx c8635qx = new C8635qx(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaCeiling", c8635qx);
                        break;
                    case 6:
                        C8239m3 c8239m3 = new C8239m3(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaFloor", c8239m3);
                        break;
                    case 7:
                        C8295mx c8295mx = new C8295mx(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaInv", c8295mx);
                        break;
                    case 8:
                        C9417zz c9417zz = new C9417zz(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaMod", c9417zz);
                        break;
                    case 9:
                        C9250y1 c9250y1 = new C9250y1(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaModFix", c9250y1);
                        break;
                    case 10:
                        C8268mi c8268mi = new C8268mi(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaOutset", c8268mi);
                        break;
                    case 11:
                        C7568eg c7568eg = new C7568eg(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("alphaRepl", c7568eg);
                        break;
                    case 12:
                        C8495p8 c8495p8 = new C8495p8(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("biLevel", c8495p8);
                        break;
                    case 13:
                        C8567q1 c8567q1 = new C8567q1(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("blend", c8567q1);
                        break;
                    case 14:
                        C8142kw c8142kw = new C8142kw(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("blur", c8142kw);
                        break;
                    case 15:
                        C7291b2 c7291b2 = new C7291b2(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("clrChange", c7291b2);
                        break;
                    case 16:
                        C8254mc c8254mc = new C8254mc(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("clrRepl", c8254mc);
                        break;
                    case 17:
                        C9384zn c9384zn = new C9384zn(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("duotone", c9384zn);
                        break;
                    case 18:
                        C7482dg c7482dg = new C7482dg(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("fill", c7482dg);
                        break;
                    case 19:
                        C8964ul c8964ul = new C8964ul(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("fillOverlay", c8964ul);
                        break;
                    case 20:
                        C8395ny c8395ny = new C8395ny(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("glow", c8395ny);
                        break;
                    case 21:
                        C8588q9 c8588q9 = new C8588q9(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("grayscl", c8588q9);
                        break;
                    case 22:
                        C8264mh c8264mh = new C8264mh(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("hsl", c8264mh);
                        break;
                    case 23:
                        C9108wg c9108wg = new C9108wg(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("innerShdw", c9108wg);
                        break;
                    case 24:
                        C7610ex c7610ex = new C7610ex(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("lum", c7610ex);
                        break;
                    case 25:
                        C9314yu c9314yu = new C9314yu(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("outerShdw", c9314yu);
                        break;
                    case 26:
                        C8115ko c8115ko = new C8115ko(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("prstShdw", c8115ko);
                        break;
                    case 27:
                        C9199xh c9199xh = new C9199xh(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("reflection", c9199xh);
                        break;
                    case 28:
                        C8400o1 c8400o1 = new C8400o1(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("relOff", c8400o1);
                        break;
                    case 29:
                        C8438of c8438of = new C8438of(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("softEdge", c8438of);
                        break;
                    case 30:
                        C8171ld c8171ld = new C8171ld(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("tint", c8171ld);
                        break;
                    case 31:
                        C7486dj c7486dj = new C7486dj(abstractC13912i5);
                        list = C9295yl.this.f33436to;
                        c7394ca = new C7394ca("xfrm", c7486dj);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f33437x1;
        if (i != f33434k4) {
            c3059ii.m12955x1(C18437z2.f56754h, C7530e2.m30739k4(i));
        }
        String str3 = this.f33435kk;
        if (str3 != null) {
            c3059ii.m12955x1("name", str3);
        }
        List.Enumerator<C7394ca> it = this.f33436to.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f33433du.m27428k4(next.m29539k4())) {
                    case 2:
                        ((C9295yl) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C8966un) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C7770gj) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C8635qx) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8239m3) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8295mx) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((C9417zz) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C9250y1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((C8268mi) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((C7568eg) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((C8495p8) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((C8567q1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((C8142kw) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((C7291b2) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((C8254mc) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((C9384zn) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((C7482dg) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 19:
                        ((C8964ul) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((C8395ny) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((C8588q9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((C8264mh) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 23:
                        ((C9108wg) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 24:
                        ((C7610ex) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 25:
                        ((C9314yu) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 26:
                        ((C8115ko) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 27:
                        ((C9199xh) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 28:
                        ((C8400o1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 29:
                        ((C8438of) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 30:
                        ((C8171ld) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 31:
                        ((C7486dj) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
