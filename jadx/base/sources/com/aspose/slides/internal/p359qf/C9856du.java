package com.aspose.slides.internal.p359qf;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p143g4.C4202k4;
import com.aspose.slides.internal.p214k0.C5569to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p539z4.AbstractC13365c6;
import com.aspose.slides.internal.p539z4.C13375g8;
import com.aspose.slides.internal.p539z4.C13380he;
import com.aspose.slides.internal.p539z4.C13383j2;
import com.aspose.slides.internal.p539z4.C13384j5;
import com.aspose.slides.internal.p539z4.C13387k4;
import com.aspose.slides.internal.p539z4.C13396nv;
import com.aspose.slides.internal.p539z4.C13398qm;
import com.aspose.slides.internal.p539z4.C13402rv;
import com.aspose.slides.internal.p539z4.C13424xk;
import com.aspose.slides.internal.p539z4.C13425xw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qf.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9856du {

    /* JADX INFO: renamed from: ar */
    private int f35683ar;

    /* JADX INFO: renamed from: bv */
    private final C4201h4 f35684bv;

    /* JADX INFO: renamed from: k4 */
    private C4202k4 f35693k4;

    /* JADX INFO: renamed from: qq */
    private float f35698qq;

    /* JADX INFO: renamed from: v4 */
    private C12009k4 f35705v4;

    /* JADX INFO: renamed from: x1 */
    private Object f35707x1;

    /* JADX INFO: renamed from: kk */
    private Dictionary<Integer, C9860x1> f35694kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private AbstractC12024x1 f35700to = null;

    /* JADX INFO: renamed from: du */
    private C13402rv f35687du = null;

    /* JADX INFO: renamed from: h4 */
    private C12026yj f35690h4 = null;

    /* JADX INFO: renamed from: m9 */
    private C13383j2 f35696m9 = null;

    /* JADX INFO: renamed from: dy */
    private C11896dy f35688dy = null;

    /* JADX INFO: renamed from: c5 */
    private C13425xw f35685c5 = null;

    /* JADX INFO: renamed from: jd */
    private C12018u4 f35692jd = null;

    /* JADX INFO: renamed from: ck */
    private C13380he f35686ck = null;

    /* JADX INFO: renamed from: fa */
    private C12013m9 f35689fa = null;

    /* JADX INFO: renamed from: up */
    private C13424xk f35703up = null;

    /* JADX INFO: renamed from: yj */
    private C12019um f35709yj = null;

    /* JADX INFO: renamed from: ks */
    private C13396nv f35695ks = null;

    /* JADX INFO: renamed from: rv */
    private C3976c5 f35699rv = null;

    /* JADX INFO: renamed from: x6 */
    private C13375g8 f35708x6 = null;

    /* JADX INFO: renamed from: ne */
    private AbstractC11290x1 f35697ne = null;

    /* JADX INFO: renamed from: ix */
    private C13398qm f35691ix = null;

    /* JADX INFO: renamed from: u4 */
    private Stack<C9857k4> f35701u4 = new Stack<>();

    /* JADX INFO: renamed from: uz */
    private C9857k4[] f35704uz = new C9857k4[10];

    /* JADX INFO: renamed from: wl */
    private C11913yj f35706wl = new C11913yj();

    /* JADX INFO: renamed from: um */
    private C11913yj f35702um = new C11913yj();

    public C9856du(C4201h4 c4201h4, C4202k4 c4202k4) {
        this.f35698qq = 1.0f;
        this.f35683ar = 1;
        this.f35684bv = c4201h4;
        this.f35693k4 = c4202k4;
        this.f35698qq = 1.0f;
        this.f35683ar = 1;
    }

    /* JADX INFO: renamed from: c5 */
    public final C11896dy m48631c5() {
        C11896dy c11896dy = this.f35688dy;
        if (c11896dy != null) {
            return c11896dy;
        }
        throw new InvalidOperationException("Path is not initialized");
    }

    /* JADX INFO: renamed from: ck */
    public final C12019um m48632ck() {
        C12019um c12019um = this.f35709yj;
        if (c12019um != null) {
            return c12019um;
        }
        throw new InvalidOperationException("StringFormat is not initialized");
    }

    /* JADX INFO: renamed from: du */
    public final C12018u4 m48633du() {
        return this.f35693k4.m16788to();
    }

    /* JADX INFO: renamed from: dy */
    public final C12013m9 m48635dy() {
        C12013m9 c12013m9 = this.f35689fa;
        if (c12013m9 != null) {
            return c12013m9;
        }
        throw new InvalidOperationException("Font is not initialized");
    }

    /* JADX INFO: renamed from: fa */
    public final C3976c5 m48637fa() {
        C3976c5 c3976c5 = this.f35699rv;
        if (c3976c5 != null) {
            return c3976c5;
        }
        throw new InvalidOperationException("ImageAttributes is not initialized");
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC12024x1 m48638h4() {
        AbstractC12024x1 abstractC12024x1 = this.f35700to;
        if (abstractC12024x1 != null) {
            return abstractC12024x1;
        }
        throw new InvalidOperationException("Brush is not initialized");
    }

    /* JADX INFO: renamed from: jd */
    public final C12018u4 m48640jd() {
        C12018u4 c12018u4 = this.f35692jd;
        if (c12018u4 != null) {
            return c12018u4;
        }
        throw new InvalidOperationException("Region is not initialized");
    }

    /* JADX INFO: renamed from: k4 */
    public final <TSurface> TSurface m48641k4() {
        TSurface tsurface = (TSurface) this.f35707x1;
        if (tsurface != null) {
            return tsurface;
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: kk */
    public final C12018u4 m48653kk() {
        return this.f35693k4.m16789x1();
    }

    /* JADX INFO: renamed from: ks */
    public final C11913yj m48655ks() {
        return this.f35706wl;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12026yj m48656m9() {
        C12026yj c12026yj = this.f35690h4;
        if (c12026yj != null) {
            return c12026yj;
        }
        throw new InvalidOperationException("Pen is not initialized");
    }

    /* JADX INFO: renamed from: ne */
    public final C12009k4 m48658ne() {
        return this.f35705v4;
    }

    /* JADX INFO: renamed from: rv */
    public final float m48659rv() {
        return this.f35698qq;
    }

    /* JADX INFO: renamed from: to */
    public final C11913yj m48660to() {
        return this.f35702um;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC11290x1 m48662up() {
        AbstractC11290x1 abstractC11290x1 = this.f35697ne;
        if (abstractC11290x1 != null) {
            return abstractC11290x1;
        }
        throw new InvalidOperationException("Image is not initialized");
    }

    /* JADX INFO: renamed from: x1 */
    public final C5569to m48663x1() {
        return this.f35693k4.m16782k4();
    }

    /* JADX INFO: renamed from: x6 */
    public final int m48668x6() {
        return this.f35683ar;
    }

    /* JADX INFO: renamed from: yj */
    public final C11913yj m48669yj() {
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55769k4(m48660to(), 1);
        c11913yj.m55769k4(m48655ks(), 1);
        return c11913yj;
    }

    /* JADX INFO: renamed from: du */
    public final void m48634du(int i) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            C12019um c12019um = (C12019um) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), C12019um.class);
            if (c12019um == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select StringFormat for formatId=", C14057f9.m66591x1(i)));
            }
            this.f35709yj = c12019um;
            this.f35695ks = (C13396nv) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: dy */
    public final void m48636dy(int i) {
        this.f35683ar = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m48639h4(int i) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            C3976c5 c3976c5 = (C3976c5) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), C3976c5.class);
            if (c3976c5 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select ImageAttributes for attributesId=", C14057f9.m66591x1(i)));
            }
            this.f35699rv = c3976c5;
            this.f35708x6 = (C13375g8) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48642k4(float f) {
        this.f35698qq = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m48654kk(int i) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            C12018u4 c12018u4 = (C12018u4) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), C12018u4.class);
            if (c12018u4 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Region for regionId=", C14057f9.m66591x1(i)));
            }
            this.f35692jd = c12018u4;
            this.f35686ck = (C13380he) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m48657m9(int i) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            AbstractC11290x1 abstractC11290x1 = (AbstractC11290x1) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), AbstractC11290x1.class);
            if (abstractC11290x1 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Image for imageId=", C14057f9.m66591x1(i)));
            }
            this.f35697ne = abstractC11290x1;
            this.f35691ix = (C13398qm) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m48661to(int i) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            C12013m9 c12013m9 = (C12013m9) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), C12013m9.class);
            if (c12013m9 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Font for fontId=", C14057f9.m66591x1(i)));
            }
            this.f35689fa = c12013m9;
            this.f35703up = (C13424xk) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48664x1(int i) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            C11896dy c11896dy = (C11896dy) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), C11896dy.class);
            if (c11896dy == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select GraphicsPath for pathId=", C14057f9.m66591x1(i)));
            }
            this.f35688dy = c11896dy;
            this.f35685c5 = (C13425xw) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48643k4(int i) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            C12026yj c12026yj = (C12026yj) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), C12026yj.class);
            if (c12026yj == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Pen for penId=", C14057f9.m66591x1(i)));
            }
            this.f35690h4 = c12026yj;
            this.f35696m9 = (C13383j2) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48665x1(int i, C9857k4 c9857k4) {
        if (this.f35701u4.size() < i) {
            while (this.f35701u4.size() < i) {
                this.f35701u4.push(null);
            }
        }
        if (this.f35701u4.size() > i) {
            while (this.f35701u4.size() > i) {
                this.f35701u4.pop();
            }
        }
        if (this.f35701u4.size() == i) {
            this.f35701u4.push(c9857k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48644k4(int i, float f) {
        float f2;
        float f3;
        C11913yj c11913yj = new C11913yj();
        if (i == 0 || i == 2) {
            c11913yj.m55763k4(f, f);
        } else {
            if (i == 3) {
                f2 = f * 96.0f;
                f3 = 72.0f;
            } else if (i == 4) {
                f *= 96.0f;
                c11913yj.m55763k4(f, f);
            } else if (i == 5) {
                f2 = f * 96.0f;
                f3 = 300.0f;
            } else if (i == 6) {
                f2 = f * 96.0f;
                f3 = 25.4f;
            }
            f = f2 / f3;
            c11913yj.m55763k4(f, f);
        }
        this.f35706wl = c11913yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48666x1(int i, AbstractC12008jd abstractC12008jd) {
        C9857k4 c9857k4Pop = null;
        if (this.f35701u4.size() > i) {
            while (this.f35701u4.size() > i) {
                c9857k4Pop = this.f35701u4.pop();
            }
        }
        if (c9857k4Pop != null) {
            if (abstractC12008jd != null) {
                abstractC12008jd.mo17496k4(c9857k4Pop.m48681to());
            }
            m48651k4(c9857k4Pop.m48682x1().m56768x1());
            m48649k4(c9857k4Pop.m48672k4().m55760h4());
            m48667x1(c9857k4Pop.m48670du().m55760h4());
            m48642k4(c9857k4Pop.m48680m9());
            m48636dy(c9857k4Pop.m48671h4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48645k4(int i, C9857k4 c9857k4) {
        C9857k4[] c9857k4Arr = this.f35704uz;
        if (i >= c9857k4Arr.length) {
            C9857k4[][] c9857k4Arr2 = {c9857k4Arr};
            AbstractC14092to.m67239k4((Object[][]) c9857k4Arr2, i + 1);
            this.f35704uz = c9857k4Arr2[0];
        }
        this.f35704uz[i] = c9857k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48667x1(C11913yj c11913yj) {
        this.f35706wl = c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48646k4(int i, AbstractC12008jd abstractC12008jd) {
        C9857k4[] c9857k4Arr = this.f35704uz;
        if (i < c9857k4Arr.length) {
            C9857k4 c9857k4 = c9857k4Arr[i];
            if (c9857k4 != null) {
                m48667x1(c9857k4.m48670du().m55760h4());
                m48649k4(c9857k4.m48672k4().m55760h4());
                m48651k4(c9857k4.m48682x1().m56768x1());
                m48642k4(c9857k4.m48680m9());
                m48636dy(c9857k4.m48671h4());
                abstractC12008jd.mo17498k4(c9857k4.m48679kk());
            }
            this.f35704uz[i] = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48647k4(int i, Object obj, AbstractC13365c6 abstractC13365c6) {
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            this.f35694kk.set_Item(Integer.valueOf(i), new C9860x1(obj, abstractC13365c6));
        } else {
            this.f35694kk.addItem(Integer.valueOf(i), new C9860x1(obj, abstractC13365c6));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48648k4(int i, boolean z) {
        if (z) {
            C12003du c12003duClone = C12003du.m56396k4(i).Clone();
            this.f35700to = new C11999ar(c12003duClone.Clone());
            this.f35687du = new C13402rv();
            C13384j5 c13384j5 = new C13384j5();
            c13384j5.m62162k4(new C13387k4(c12003duClone.Clone()));
            this.f35687du.m62321k4(c13384j5);
            return;
        }
        if (this.f35694kk.containsKey(Integer.valueOf(i))) {
            AbstractC12024x1 abstractC12024x1 = (AbstractC12024x1) C7019kk.m27452k4(this.f35694kk.get_Item(Integer.valueOf(i)).m48688k4(), AbstractC12024x1.class);
            if (abstractC12024x1 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Brush for brushId=", C14057f9.m66591x1(i)));
            }
            this.f35700to = abstractC12024x1;
            this.f35687du = (C13402rv) this.f35694kk.get_Item(Integer.valueOf(i)).m48689x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48649k4(C11913yj c11913yj) {
        this.f35702um = c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48650k4(C12009k4 c12009k4) {
        this.f35705v4 = c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48651k4(C12018u4 c12018u4) {
        this.f35693k4.m16786k4(c12018u4);
    }

    /* JADX INFO: renamed from: k4 */
    public final <TSurface> void m48652k4(TSurface tsurface) {
        if (tsurface == null) {
            throw new ArgumentNullException("surface");
        }
        this.f35707x1 = tsurface;
        this.f35684bv.m16775x1(tsurface);
    }
}
