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
public class eyk extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f22533du;

    /* JADX INFO: renamed from: dy */
    private dnu f22534dy;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f22535h4;

    /* JADX INFO: renamed from: kk */
    private boolean f22536kk;

    /* JADX INFO: renamed from: m9 */
    private wnb f22537m9;

    /* JADX INFO: renamed from: to */
    private long f22538to;

    /* JADX INFO: renamed from: x1 */
    private int f22539x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f22532k4 = v1i.m42655k4("fast");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f22531c5 = new C7017h4("spd", "advClick", "advTm", "p14:dur", "blinds", "checker", "circle", "dissolve", "comb", "cover", "cut", "diamond", "fade", "newsflash", "plus", "pull", "push", "random", "randomBar", "split", "strips", "wedge", "wheel", "wipe", "zoom", "vortex", "switch", "flip", "ripple", "honeycomb", "prism", "doors", "window", "ferris", "gallery", "conveyor", "pan", "glitter", "warp", "flythrough", "flash", "shred", "reveal", "wheelReverse", "prstTrans", "morph", "sndAc", "extLst");

    public eyk() {
        m31438jd();
    }

    /* JADX INFO: renamed from: jd */
    private void m31438jd() {
        this.f22539x1 = f22532k4;
        this.f22536kk = true;
        this.f22538to = 4294967295L;
    }

    /* JADX INFO: renamed from: du */
    public final String m31446du() {
        return this.f22533du;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC7414ck m31447dy() {
        return this.f22534dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7394ca m31448h4() {
        return this.f22535h4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m31455kk() {
        return this.f22536kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final wnb m31456m9() {
        return this.f22537m9;
    }

    /* JADX INFO: renamed from: to */
    public final long m31457to() {
        return this.f22538to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m31458x1() {
        return this.f22539x1;
    }

    public eyk(final AbstractC13912i5 abstractC13912i5) {
        m31438jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eyk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = eyk.f22531c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    eyk.this.f22539x1 = v1i.m42655k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    eyk.this.f22536kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    eyk.this.f22538to = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                eyk.this.f22533du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eyk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                eyk eykVar;
                C7394ca c7394ca;
                switch (eyk.f22531c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("blinds", new l2o(abstractC13912i5));
                        break;
                    case 5:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("checker", new l2o(abstractC13912i5));
                        break;
                    case 6:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("circle", new qu9(abstractC13912i5));
                        break;
                    case 7:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("dissolve", new qu9(abstractC13912i5));
                        break;
                    case 8:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("comb", new l2o(abstractC13912i5));
                        break;
                    case 9:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("cover", new m4s(abstractC13912i5));
                        break;
                    case 10:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("cut", new hbd(abstractC13912i5));
                        break;
                    case 11:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("diamond", new qu9(abstractC13912i5));
                        break;
                    case 12:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("fade", new hbd(abstractC13912i5));
                        break;
                    case 13:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("newsflash", new qu9(abstractC13912i5));
                        break;
                    case 14:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("plus", new qu9(abstractC13912i5));
                        break;
                    case 15:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("pull", new m4s(abstractC13912i5));
                        break;
                    case 16:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("push", new zfd(abstractC13912i5));
                        break;
                    case 17:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("random", new qu9(abstractC13912i5));
                        break;
                    case 18:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("randomBar", new l2o(abstractC13912i5));
                        break;
                    case 19:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("split", new y9j(abstractC13912i5));
                        break;
                    case 20:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("strips", new oed(abstractC13912i5));
                        break;
                    case 21:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("wedge", new qu9(abstractC13912i5));
                        break;
                    case 22:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("wheel", new dei(abstractC13912i5));
                        break;
                    case 23:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("wipe", new zfd(abstractC13912i5));
                        break;
                    case 24:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("zoom", new dqx(abstractC13912i5));
                        break;
                    case 25:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("vortex", new zfd(abstractC13912i5));
                        break;
                    case 26:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("switch", new w7b(abstractC13912i5));
                        break;
                    case 27:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("flip", new w7b(abstractC13912i5));
                        break;
                    case 28:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("ripple", new sws(abstractC13912i5));
                        break;
                    case 29:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("honeycomb", new qu9(abstractC13912i5));
                        break;
                    case 30:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("prism", new fkw(abstractC13912i5));
                        break;
                    case 31:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("doors", new l2o(abstractC13912i5));
                        break;
                    case 32:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("window", new l2o(abstractC13912i5));
                        break;
                    case 33:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("ferris", new w7b(abstractC13912i5));
                        break;
                    case 34:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("gallery", new w7b(abstractC13912i5));
                        break;
                    case 35:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("conveyor", new w7b(abstractC13912i5));
                        break;
                    case 36:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("pan", new zfd(abstractC13912i5));
                        break;
                    case 37:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("glitter", new gu5(abstractC13912i5));
                        break;
                    case 38:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("warp", new dqx(abstractC13912i5));
                        break;
                    case 39:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("flythrough", new u9b(abstractC13912i5));
                        break;
                    case 40:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("flash", new qu9(abstractC13912i5));
                        break;
                    case 41:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("shred", new kup(abstractC13912i5));
                        break;
                    case 42:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("reveal", new xx9(abstractC13912i5));
                        break;
                    case 43:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("wheelReverse", new dei(abstractC13912i5));
                        break;
                    case 44:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("prstTrans", new t9m(abstractC13912i5));
                        break;
                    case 45:
                        eykVar = eyk.this;
                        c7394ca = new C7394ca("morph", new q7e(abstractC13912i5));
                        break;
                    case 46:
                        eyk.this.f22537m9 = new wnb(abstractC13912i5);
                        return true;
                    case 47:
                        eyk.this.f22534dy = new dnu(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                eykVar.f22535h4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31459x1(String str) {
        this.f22533du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m31449k4(String str) {
        C7394ca c7394ca;
        if (this.f22535h4 != null) {
            throw new Exception("Transition already is initialized.");
        }
        switch (f22531c5.m27428k4(str)) {
            case 4:
                c7394ca = new C7394ca("blinds", new l2o());
                break;
            case 5:
                c7394ca = new C7394ca("checker", new l2o());
                break;
            case 6:
                c7394ca = new C7394ca("circle", new qu9());
                break;
            case 7:
                c7394ca = new C7394ca("dissolve", new qu9());
                break;
            case 8:
                c7394ca = new C7394ca("comb", new l2o());
                break;
            case 9:
                c7394ca = new C7394ca("cover", new m4s());
                break;
            case 10:
                c7394ca = new C7394ca("cut", new hbd());
                break;
            case 11:
                c7394ca = new C7394ca("diamond", new qu9());
                break;
            case 12:
                c7394ca = new C7394ca("fade", new hbd());
                break;
            case 13:
                c7394ca = new C7394ca("newsflash", new qu9());
                break;
            case 14:
                c7394ca = new C7394ca("plus", new qu9());
                break;
            case 15:
                c7394ca = new C7394ca("pull", new m4s());
                break;
            case 16:
                c7394ca = new C7394ca("push", new zfd());
                break;
            case 17:
                c7394ca = new C7394ca("random", new qu9());
                break;
            case 18:
                c7394ca = new C7394ca("randomBar", new l2o());
                break;
            case 19:
                c7394ca = new C7394ca("split", new y9j());
                break;
            case 20:
                c7394ca = new C7394ca("strips", new oed());
                break;
            case 21:
                c7394ca = new C7394ca("wedge", new qu9());
                break;
            case 22:
                c7394ca = new C7394ca("wheel", new dei());
                break;
            case 23:
                c7394ca = new C7394ca("wipe", new zfd());
                break;
            case 24:
                c7394ca = new C7394ca("zoom", new dqx());
                break;
            case 25:
                c7394ca = new C7394ca("vortex", new zfd());
                break;
            case 26:
                c7394ca = new C7394ca("switch", new w7b());
                break;
            case 27:
                c7394ca = new C7394ca("flip", new w7b());
                break;
            case 28:
                c7394ca = new C7394ca("ripple", new sws());
                break;
            case 29:
                c7394ca = new C7394ca("honeycomb", new qu9());
                break;
            case 30:
                c7394ca = new C7394ca("prism", new fkw());
                break;
            case 31:
                c7394ca = new C7394ca("doors", new l2o());
                break;
            case 32:
                c7394ca = new C7394ca("window", new l2o());
                break;
            case 33:
                c7394ca = new C7394ca("ferris", new w7b());
                break;
            case 34:
                c7394ca = new C7394ca("gallery", new w7b());
                break;
            case 35:
                c7394ca = new C7394ca("conveyor", new w7b());
                break;
            case 36:
                c7394ca = new C7394ca("pan", new zfd());
                break;
            case 37:
                c7394ca = new C7394ca("glitter", new gu5());
                break;
            case 38:
                c7394ca = new C7394ca("warp", new dqx());
                break;
            case 39:
                c7394ca = new C7394ca("flythrough", new u9b());
                break;
            case 40:
                c7394ca = new C7394ca("flash", new qu9());
                break;
            case 41:
                c7394ca = new C7394ca("shred", new kup());
                break;
            case 42:
                c7394ca = new C7394ca("reveal", new xx9());
                break;
            case 43:
                c7394ca = new C7394ca("wheelReverse", new dei());
                break;
            case 44:
                c7394ca = new C7394ca("prstTrans", new t9m());
                break;
            case 45:
                c7394ca = new C7394ca("morph", new q7e());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f22535h4 = c7394ca;
        return this.f22535h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final wnb m31450k4() {
        if (this.f22537m9 != null) {
            throw new Exception("Only one <sndAc> element can be added.");
        }
        wnb wnbVar = new wnb();
        this.f22537m9 = wnbVar;
        return wnbVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31451k4(int i) {
        this.f22539x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31452k4(long j) {
        this.f22538to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31453k4(AbstractC7414ck abstractC7414ck) {
        this.f22534dy = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22539x1;
        if (i != f22532k4) {
            c3059ii.m12955x1("spd", v1i.m42656k4(i));
        }
        boolean z = this.f22536kk;
        if (!z) {
            c3059ii.m12955x1("advClick", z ? "1" : "0");
        }
        long j = this.f22538to;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("advTm", C13850af.m65147x1(j));
        }
        String str3 = this.f22533du;
        if (str3 != null) {
            c3059ii.m12955x1("p14:dur", str3);
        }
        C7394ca c7394ca = this.f22535h4;
        if (c7394ca != null) {
            switch (f22531c5.m27428k4(c7394ca.m29539k4())) {
                case 4:
                case 5:
                case 8:
                case 18:
                    ((l2o) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 6:
                case 7:
                case 11:
                case 13:
                case 14:
                case 17:
                case 21:
                    ((qu9) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 9:
                case 15:
                    ((m4s) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 10:
                case 12:
                    ((hbd) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 16:
                case 23:
                    ((zfd) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 19:
                    ((y9j) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 20:
                    ((oed) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 22:
                    ((dei) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 24:
                    ((dqx) this.f22535h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f22535h4.m29539k4());
                    break;
                case 25:
                case 36:
                    ((zfd) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 26:
                case 27:
                case 33:
                case 34:
                case 35:
                    ((w7b) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 28:
                    ((sws) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 29:
                case 40:
                    ((qu9) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 30:
                    ((fkw) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 31:
                case 32:
                    ((l2o) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 37:
                    ((gu5) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 38:
                    ((dqx) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 39:
                    ((u9b) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 41:
                    ((kup) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 42:
                    ((xx9) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 43:
                    ((dei) this.f22535h4.m29541kk()).mo6846k4("p14", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 44:
                    ((t9m) this.f22535h4.m29541kk()).mo6846k4("p15", c3059ii, this.f22535h4.m29539k4());
                    break;
                case 45:
                    ((q7e) this.f22535h4.m29541kk()).mo6846k4("p159", c3059ii, this.f22535h4.m29539k4());
                    break;
            }
        }
        wnb wnbVar = this.f22537m9;
        if (wnbVar != null) {
            wnbVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sndAc");
        }
        dnu dnuVar = this.f22534dy;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31454k4(boolean z) {
        this.f22536kk = z;
    }
}
