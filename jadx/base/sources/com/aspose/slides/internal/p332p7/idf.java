package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class idf extends AbstractC7361bz {

    /* JADX INFO: renamed from: ar */
    private int f24612ar;

    /* JADX INFO: renamed from: c5 */
    private String f24613c5;

    /* JADX INFO: renamed from: ck */
    private String f24614ck;

    /* JADX INFO: renamed from: du */
    private int f24615du;

    /* JADX INFO: renamed from: dy */
    private int f24616dy;

    /* JADX INFO: renamed from: fa */
    private String f24617fa;

    /* JADX INFO: renamed from: h4 */
    private String f24618h4;

    /* JADX INFO: renamed from: ix */
    private int f24619ix;

    /* JADX INFO: renamed from: jd */
    private String f24620jd;

    /* JADX INFO: renamed from: ks */
    private String f24621ks;

    /* JADX INFO: renamed from: m9 */
    private String f24622m9;

    /* JADX INFO: renamed from: ne */
    private int f24623ne;

    /* JADX INFO: renamed from: qq */
    private boolean f24624qq;

    /* JADX INFO: renamed from: rv */
    private String f24625rv;

    /* JADX INFO: renamed from: u4 */
    private int f24626u4;

    /* JADX INFO: renamed from: um */
    private List<C7394ca> f24627um;

    /* JADX INFO: renamed from: up */
    private String f24628up;

    /* JADX INFO: renamed from: uz */
    private double f24629uz;

    /* JADX INFO: renamed from: wl */
    private double f24630wl;

    /* JADX INFO: renamed from: x6 */
    private int f24631x6;

    /* JADX INFO: renamed from: yj */
    private String f24632yj;

    /* JADX INFO: renamed from: k4 */
    public static final int f24608k4 = syu.m41448k4("default");

    /* JADX INFO: renamed from: x1 */
    public static final int f24611x1 = pyy.m39203k4("custom");

    /* JADX INFO: renamed from: kk */
    public static final int f24609kk = dh2.m30357k4("default");

    /* JADX INFO: renamed from: to */
    public static final int f24610to = wuq.m44082k4("inherit");

    /* JADX INFO: renamed from: bv */
    private static final C7017h4 f24607bv = new C7017h4("presentation:node-type", "presentation:preset-id", "presentation:preset-sub-type", "presentation:preset-class", "presentation:master-element", "presentation:group-id", "anim:id", "smil:begin", "smil:end", "smil:dur", "smil:repeatDur", "smil:repeatCount", "smil:restart", "smil:restartDefault", "smil:fill", "smil:fillDefault", "smil:accelerate", "smil:decelerate", "smil:autoReverse", "smil:endsync", "animate", "set", "animateMotion", "animateColor", "animateTransform", "transitionFilter", "par", "seq", "iterate", "audio", "command");

    public idf() {
        m34059yj();
    }

    /* JADX INFO: renamed from: yj */
    private void m34059yj() {
        this.f24615du = f24608k4;
        this.f24616dy = f24611x1;
        this.f24631x6 = f24609kk;
        this.f24623ne = f24610to;
        this.f24619ix = 0;
        this.f24626u4 = 0;
        this.f24629uz = 0.0d;
        this.f24630wl = 0.0d;
        this.f24624qq = false;
        this.f24612ar = 0;
        this.f24627um = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final int m34060c5() {
        return this.f24631x6;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m34061ck() {
        return this.f24624qq;
    }

    /* JADX INFO: renamed from: dy */
    public final String m34063dy() {
        return this.f24625rv;
    }

    /* JADX INFO: renamed from: fa */
    public final List<C7394ca> m34064fa() {
        return this.f24627um;
    }

    /* JADX INFO: renamed from: jd */
    public final int m34066jd() {
        return this.f24619ix;
    }

    /* JADX INFO: renamed from: to */
    public final int m34070to() {
        return this.f24616dy;
    }

    public idf(final AbstractC13912i5 abstractC13912i5) {
        m34059yj();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.idf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (idf.f24607bv.m27428k4(str)) {
                    case 0:
                        idf.this.f24615du = syu.m41448k4(str2);
                        break;
                    case 1:
                        idf.this.f24618h4 = str2;
                        break;
                    case 2:
                        idf.this.f24622m9 = str2;
                        break;
                    case 3:
                        idf.this.f24616dy = pyy.m39203k4(str2);
                        break;
                    case 4:
                        idf.this.f24613c5 = str2;
                        break;
                    case 5:
                        idf.this.f24620jd = str2;
                        break;
                    case 6:
                        idf.this.f24614ck = str2;
                        break;
                    case 7:
                        idf.this.f24617fa = str2;
                        break;
                    case 8:
                        idf.this.f24628up = str2;
                        break;
                    case 9:
                        idf.this.f24632yj = str2;
                        break;
                    case 10:
                        idf.this.f24621ks = str2;
                        break;
                    case 11:
                        idf.this.f24625rv = str2;
                        break;
                    case 12:
                        idf.this.f24631x6 = dh2.m30357k4(str2);
                        break;
                    case 13:
                        idf.this.f24623ne = wuq.m44082k4(str2);
                        break;
                    case 14:
                        idf.this.f24619ix = txg.m41998k4(str2);
                        break;
                    case 15:
                        idf.this.f24626u4 = djf.m30386k4(str2);
                        break;
                    case 16:
                        idf.this.f24629uz = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 17:
                        idf.this.f24630wl = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 18:
                        idf.this.f24624qq = C13850af.m65068c5(str2);
                        break;
                    case 19:
                        idf.this.f24612ar = l6i.m35925k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.idf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (idf.f24607bv.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 20:
                        C7543ea c7543ea = new C7543ea(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("animate", c7543ea);
                        break;
                    case 21:
                        ett ettVar = new ett(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("set", ettVar);
                        break;
                    case 22:
                        C9261y7 c9261y7 = new C9261y7(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("animateMotion", c9261y7);
                        break;
                    case 23:
                        C7270as c7270as = new C7270as(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("animateColor", c7270as);
                        break;
                    case 24:
                        C7627f1 c7627f1 = new C7627f1(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("animateTransform", c7627f1);
                        break;
                    case 25:
                        d5a d5aVar = new d5a(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("transitionFilter", d5aVar);
                        break;
                    case 26:
                        idf idfVar = new idf(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("par", idfVar);
                        break;
                    case 27:
                        lft lftVar = new lft(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("seq", lftVar);
                        break;
                    case 28:
                        vbl vblVar = new vbl(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("iterate", vblVar);
                        break;
                    case 29:
                        C8158l4 c8158l4 = new C8158l4(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("audio", c8158l4);
                        break;
                    case 30:
                        fsr fsrVar = new fsr(abstractC13912i5);
                        list = idf.this.f24627um;
                        c7394ca = new C7394ca("command", fsrVar);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final String m34062du() {
        return this.f24620jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m34065h4() {
        return this.f24617fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m34067k4() {
        return this.f24615du;
    }

    /* JADX INFO: renamed from: kk */
    public final String m34068kk() {
        return this.f24622m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m34069m9() {
        return this.f24621ks;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m34071x1() {
        return this.f24618h4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24615du;
        if (i != f24608k4) {
            c3059ii.m12955x1("presentation:node-type", syu.m41449k4(i));
        }
        String str3 = this.f24618h4;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:preset-id", str3);
        }
        String str4 = this.f24622m9;
        if (str4 != null) {
            c3059ii.m12955x1("presentation:preset-sub-type", str4);
        }
        int i2 = this.f24616dy;
        if (i2 != f24611x1) {
            c3059ii.m12955x1("presentation:preset-class", pyy.m39204k4(i2));
        }
        String str5 = this.f24613c5;
        if (str5 != null) {
            c3059ii.m12955x1("presentation:master-element", str5);
        }
        String str6 = this.f24620jd;
        if (str6 != null) {
            c3059ii.m12955x1("presentation:group-id", str6);
        }
        String str7 = this.f24614ck;
        if (str7 != null) {
            c3059ii.m12955x1("anim:id", str7);
        }
        String str8 = this.f24617fa;
        if (str8 != null) {
            c3059ii.m12955x1("smil:begin", str8);
        }
        String str9 = this.f24628up;
        if (str9 != null) {
            c3059ii.m12955x1("smil:end", str9);
        }
        String str10 = this.f24632yj;
        if (str10 != null) {
            c3059ii.m12955x1("smil:dur", str10);
        }
        String str11 = this.f24621ks;
        if (str11 != null) {
            c3059ii.m12955x1("smil:repeatDur", str11);
        }
        String str12 = this.f24625rv;
        if (str12 != null) {
            c3059ii.m12955x1("smil:repeatCount", str12);
        }
        int i3 = this.f24631x6;
        if (i3 != f24609kk) {
            c3059ii.m12955x1("smil:restart", dh2.m30358k4(i3));
        }
        int i4 = this.f24623ne;
        if (i4 != f24610to) {
            c3059ii.m12955x1("smil:restartDefault", wuq.m44083k4(i4));
        }
        int i5 = this.f24619ix;
        if (i5 != 0) {
            c3059ii.m12955x1("smil:fill", txg.m41999k4(i5));
        }
        int i6 = this.f24626u4;
        if (i6 != 0) {
            c3059ii.m12955x1("smil:fillDefault", djf.m30387k4(i6));
        }
        double d = this.f24629uz;
        if (d != 0.0d) {
            c3059ii.m12955x1("smil:accelerate", C13850af.m65101k4(d));
        }
        double d2 = this.f24630wl;
        if (d2 != 0.0d) {
            c3059ii.m12955x1("smil:decelerate", C13850af.m65101k4(d2));
        }
        boolean z = this.f24624qq;
        if (z) {
            c3059ii.m12955x1("smil:autoReverse", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i7 = this.f24612ar;
        if (i7 != 0) {
            c3059ii.m12955x1("smil:endsync", l6i.m35926k4(i7));
        }
        List.Enumerator<C7394ca> it = this.f24627um.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f24607bv.m27428k4(next.m29539k4())) {
                    case 20:
                        ((C7543ea) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((ett) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((C9261y7) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 23:
                        ((C7270as) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 24:
                        ((C7627f1) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 25:
                        ((d5a) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 26:
                        ((idf) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 27:
                        ((lft) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 28:
                        ((vbl) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 29:
                        ((C8158l4) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
                        break;
                    case 30:
                        ((fsr) next.m29541kk()).mo6846k4("anim", c3059ii, next.m29539k4());
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
