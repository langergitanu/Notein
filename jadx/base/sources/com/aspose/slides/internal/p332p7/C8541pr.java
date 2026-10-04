package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pr */
/* JADX INFO: loaded from: classes4.dex */
public final class C8541pr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private boolean f28528du;

    /* JADX INFO: renamed from: h4 */
    private boolean f28529h4;

    /* JADX INFO: renamed from: kk */
    private double f28530kk;

    /* JADX INFO: renamed from: m9 */
    private List<C7394ca> f28531m9;

    /* JADX INFO: renamed from: to */
    private byte f28532to;

    /* JADX INFO: renamed from: x1 */
    private double f28533x1;

    /* JADX INFO: renamed from: k4 */
    public static final byte f28527k4 = C8196lm.m36222k4("norm");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f28526dy = new C7017h4("w", C18773h.f57233c, "fill", "stroke", "extrusionOk", "close", "moveTo", "lnTo", "arcTo", "quadBezTo", "cubicBezTo");

    public C8541pr() {
        this.f28533x1 = 0.0d;
        this.f28530kk = 0.0d;
        this.f28532to = f28527k4;
        this.f28528du = true;
        this.f28529h4 = true;
        this.f28531m9 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final boolean m39057du() {
        return this.f28529h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7394ca[] m39058h4() {
        return this.f28531m9.toArray(new C7394ca[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final byte m39065kk() {
        return this.f28532to;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m39066to() {
        return this.f28528du;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m39067x1() {
        return this.f28530kk;
    }

    public C8541pr(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8541pr.f28526dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8541pr.this.f28533x1 = C13850af.m65132uz(str2) / 12700.0d;
                } else if (iM27428k4 == 1) {
                    C8541pr.this.f28530kk = C13850af.m65132uz(str2) / 12700.0d;
                } else if (iM27428k4 == 2) {
                    C8541pr.this.f28532to = C8196lm.m36222k4(str2);
                } else if (iM27428k4 == 3) {
                    C8541pr.this.f28528du = C13850af.m65068c5(str2);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C8541pr.this.f28529h4 = C13850af.m65068c5(str2);
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C8541pr.f28526dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 5:
                        C8146kx c8146kx = new C8146kx(abstractC13912i5);
                        list = C8541pr.this.f28531m9;
                        c7394ca = new C7394ca("close", c8146kx);
                        break;
                    case 6:
                        C8041jv c8041jv = new C8041jv(abstractC13912i5);
                        list = C8541pr.this.f28531m9;
                        c7394ca = new C7394ca("moveTo", c8041jv);
                        break;
                    case 7:
                        C8493p6 c8493p6 = new C8493p6(abstractC13912i5);
                        list = C8541pr.this.f28531m9;
                        c7394ca = new C7394ca("lnTo", c8493p6);
                        break;
                    case 8:
                        C8734s2 c8734s2 = new C8734s2(abstractC13912i5);
                        list = C8541pr.this.f28531m9;
                        c7394ca = new C7394ca("arcTo", c8734s2);
                        break;
                    case 9:
                        C8904tx c8904tx = new C8904tx(abstractC13912i5);
                        list = C8541pr.this.f28531m9;
                        c7394ca = new C7394ca("quadBezTo", c8904tx);
                        break;
                    case 10:
                        C8865tf c8865tf = new C8865tf(abstractC13912i5);
                        list = C8541pr.this.f28531m9;
                        c7394ca = new C7394ca("cubicBezTo", c8865tf);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final double m39059k4() {
        return this.f28533x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39068x1(double d) {
        this.f28530kk = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39069x1(boolean z) {
        this.f28529h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m39060k4(String str) {
        C7394ca c7394ca;
        switch (f28526dy.m27428k4(str)) {
            case 5:
                c7394ca = new C7394ca("close", new C8146kx());
                break;
            case 6:
                c7394ca = new C7394ca("moveTo", new C8041jv());
                break;
            case 7:
                c7394ca = new C7394ca("lnTo", new C8493p6());
                break;
            case 8:
                c7394ca = new C7394ca("arcTo", new C8734s2());
                break;
            case 9:
                c7394ca = new C7394ca("quadBezTo", new C8904tx());
                break;
            case 10:
                c7394ca = new C7394ca("cubicBezTo", new C8865tf());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f28531m9.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39061k4(byte b) {
        this.f28532to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39062k4(double d) {
        this.f28533x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39063k4(C7394ca c7394ca) {
        this.f28531m9.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f28533x1;
        if (d != 0.0d) {
            c3059ii.m12955x1("w", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        double d2 = this.f28530kk;
        if (d2 != 0.0d) {
            c3059ii.m12955x1(C18773h.f57233c, C22238OooO0oO.OooO00o(d2, 12700.0d, 14));
        }
        byte b = this.f28532to;
        if (b != f28527k4) {
            c3059ii.m12955x1("fill", C8196lm.m36223k4(b));
        }
        boolean z = this.f28528du;
        if (!z) {
            c3059ii.m12955x1("stroke", z ? "1" : "0");
        }
        boolean z2 = this.f28529h4;
        if (!z2) {
            c3059ii.m12955x1("extrusionOk", z2 ? "1" : "0");
        }
        List.Enumerator<C7394ca> it = this.f28531m9.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28526dy.m27428k4(next.m29539k4())) {
                    case 5:
                        ((C8146kx) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8041jv) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8493p6) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((C8734s2) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C8904tx) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((C8865tf) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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

    /* JADX INFO: renamed from: k4 */
    public final void m39064k4(boolean z) {
        this.f28528du = z;
    }
}
