package com.aspose.slides.internal.p069cw;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p102e8.C3586k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p171hq.AbstractC4615c6;
import com.aspose.slides.internal.p171hq.C4625g8;
import com.aspose.slides.internal.p171hq.C4630he;
import com.aspose.slides.internal.p171hq.C4633j2;
import com.aspose.slides.internal.p171hq.C4634j5;
import com.aspose.slides.internal.p171hq.C4637k4;
import com.aspose.slides.internal.p171hq.C4646nv;
import com.aspose.slides.internal.p171hq.C4648qm;
import com.aspose.slides.internal.p171hq.C4652rv;
import com.aspose.slides.internal.p171hq.C4674xk;
import com.aspose.slides.internal.p171hq.C4675xw;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p314oc.C7019kk;
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
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cw.du */
/* JADX INFO: loaded from: classes3.dex */
public class C2638du {

    /* JADX INFO: renamed from: ar */
    private int f8450ar;

    /* JADX INFO: renamed from: bv */
    private final C3585h4 f8451bv;

    /* JADX INFO: renamed from: k4 */
    public boolean f8460k4;

    /* JADX INFO: renamed from: qq */
    private float f8465qq;

    /* JADX INFO: renamed from: v4 */
    private C12009k4 f8472v4;

    /* JADX INFO: renamed from: x1 */
    private C3586k4 f8474x1;

    /* JADX INFO: renamed from: kk */
    private Dictionary<Integer, C2642x1> f8461kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private AbstractC12024x1 f8467to = null;

    /* JADX INFO: renamed from: du */
    private C4652rv f8454du = null;

    /* JADX INFO: renamed from: h4 */
    private C12026yj f8457h4 = null;

    /* JADX INFO: renamed from: m9 */
    private C4633j2 f8463m9 = null;

    /* JADX INFO: renamed from: dy */
    private C11896dy f8455dy = null;

    /* JADX INFO: renamed from: c5 */
    private C4675xw f8452c5 = null;

    /* JADX INFO: renamed from: jd */
    private C12018u4 f8459jd = null;

    /* JADX INFO: renamed from: ck */
    private C4630he f8453ck = null;

    /* JADX INFO: renamed from: fa */
    private C12013m9 f8456fa = null;

    /* JADX INFO: renamed from: up */
    private C4674xk f8470up = null;

    /* JADX INFO: renamed from: yj */
    private C12019um f8476yj = null;

    /* JADX INFO: renamed from: ks */
    private C4646nv f8462ks = null;

    /* JADX INFO: renamed from: rv */
    private C3976c5 f8466rv = null;

    /* JADX INFO: renamed from: x6 */
    private C4625g8 f8475x6 = null;

    /* JADX INFO: renamed from: ne */
    private AbstractC6888dy f8464ne = null;

    /* JADX INFO: renamed from: ix */
    private C4648qm f8458ix = null;

    /* JADX INFO: renamed from: u4 */
    private Stack<C2639k4> f8468u4 = new Stack<>();

    /* JADX INFO: renamed from: uz */
    private C2639k4[] f8471uz = new C2639k4[10];

    /* JADX INFO: renamed from: wl */
    private C11913yj f8473wl = new C11913yj();

    /* JADX INFO: renamed from: um */
    private C11913yj f8469um = new C11913yj();

    public C2638du(C3585h4 c3585h4, C3586k4 c3586k4) {
        this.f8465qq = 1.0f;
        this.f8450ar = 1;
        this.f8451bv = c3585h4;
        this.f8474x1 = c3586k4;
        this.f8465qq = 1.0f;
        this.f8450ar = 1;
    }

    /* JADX INFO: renamed from: c5 */
    public final C12013m9 m12041c5() {
        C12013m9 c12013m9 = this.f8456fa;
        if (c12013m9 != null) {
            return c12013m9;
        }
        throw new InvalidOperationException("Font is not initialized");
    }

    /* JADX INFO: renamed from: ck */
    public final C12018u4 m12042ck() {
        C12018u4 c12018u4 = this.f8459jd;
        if (c12018u4 != null) {
            return c12018u4;
        }
        throw new InvalidOperationException("Region is not initialized");
    }

    /* JADX INFO: renamed from: du */
    public final C11913yj m12043du() {
        return this.f8469um;
    }

    /* JADX INFO: renamed from: dy */
    public final C12026yj m12045dy() {
        C12026yj c12026yj = this.f8457h4;
        if (c12026yj != null) {
            return c12026yj;
        }
        throw new InvalidOperationException("Pen is not initialized");
    }

    /* JADX INFO: renamed from: fa */
    public final C12019um m12047fa() {
        C12019um c12019um = this.f8476yj;
        if (c12019um != null) {
            return c12019um;
        }
        throw new InvalidOperationException("StringFormat is not initialized");
    }

    /* JADX INFO: renamed from: h4 */
    public final C12018u4 m12048h4() {
        return this.f8474x1.m14589to();
    }

    /* JADX INFO: renamed from: ix */
    public final int m12050ix() {
        return this.f8450ar;
    }

    /* JADX INFO: renamed from: jd */
    public final C11896dy m12051jd() {
        C11896dy c11896dy = this.f8455dy;
        if (c11896dy != null) {
            return c11896dy;
        }
        throw new InvalidOperationException("Path is not initialized");
    }

    /* JADX INFO: renamed from: k4 */
    public final <TSurface> TSurface m12052k4() {
        return (TSurface) this.f8451bv.m14502k4();
    }

    /* JADX INFO: renamed from: kk */
    public final C12018u4 m12064kk() {
        return this.f8474x1.m14590x1();
    }

    /* JADX INFO: renamed from: ks */
    public final C4652rv m12066ks() {
        return this.f8454du;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC12024x1 m12067m9() {
        AbstractC12024x1 abstractC12024x1 = this.f8467to;
        if (abstractC12024x1 != null) {
            return abstractC12024x1;
        }
        throw new InvalidOperationException("Brush is not initialized");
    }

    /* JADX INFO: renamed from: ne */
    public final float m12069ne() {
        return this.f8465qq;
    }

    /* JADX INFO: renamed from: rv */
    public final C11913yj m12070rv() {
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55769k4(m12043du(), 1);
        c11913yj.m55769k4(m12080x6(), 1);
        return c11913yj;
    }

    /* JADX INFO: renamed from: to */
    public final C11913yj m12071to() {
        return this.f8451bv.m14565x1();
    }

    /* JADX INFO: renamed from: u4 */
    public final C12009k4 m12073u4() {
        return this.f8472v4;
    }

    /* JADX INFO: renamed from: up */
    public final C3976c5 m12074up() {
        C3976c5 c3976c5 = this.f8466rv;
        if (c3976c5 != null) {
            return c3976c5;
        }
        throw new InvalidOperationException("ImageAttributes is not initialized");
    }

    /* JADX INFO: renamed from: x1 */
    public final C4230to m12075x1() {
        return this.f8474x1.m14583k4();
    }

    /* JADX INFO: renamed from: x6 */
    public final C11913yj m12080x6() {
        return this.f8473wl;
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC6888dy m12081yj() {
        AbstractC6888dy abstractC6888dy = this.f8464ne;
        if (abstractC6888dy != null) {
            return abstractC6888dy;
        }
        throw new InvalidOperationException("Image is not initialized");
    }

    /* JADX INFO: renamed from: du */
    public final void m12044du(int i) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            C12019um c12019um = (C12019um) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), C12019um.class);
            if (c12019um == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select StringFormat for formatId=", C14057f9.m66591x1(i)));
            }
            this.f8476yj = c12019um;
            this.f8462ks = (C4646nv) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: dy */
    public final void m12046dy(int i) {
        this.f8450ar = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m12049h4(int i) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            C3976c5 c3976c5 = (C3976c5) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), C3976c5.class);
            if (c3976c5 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select ImageAttributes for attributesId=", C14057f9.m66591x1(i)));
            }
            this.f8466rv = c3976c5;
            this.f8475x6 = (C4625g8) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12053k4(float f) {
        this.f8465qq = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m12065kk(int i) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            C12018u4 c12018u4 = (C12018u4) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), C12018u4.class);
            if (c12018u4 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Region for regionId=", C14057f9.m66591x1(i)));
            }
            this.f8459jd = c12018u4;
            this.f8453ck = (C4630he) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m12068m9(int i) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            AbstractC6888dy abstractC6888dy = (AbstractC6888dy) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), AbstractC6888dy.class);
            if (abstractC6888dy == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Image for imageId=", C14057f9.m66591x1(i)));
            }
            this.f8464ne = abstractC6888dy;
            this.f8458ix = (C4648qm) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m12072to(int i) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            C12013m9 c12013m9 = (C12013m9) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), C12013m9.class);
            if (c12013m9 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Font for fontId=", C14057f9.m66591x1(i)));
            }
            this.f8456fa = c12013m9;
            this.f8470up = (C4674xk) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12076x1(int i) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            C11896dy c11896dy = (C11896dy) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), C11896dy.class);
            if (c11896dy == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select GraphicsPath for pathId=", C14057f9.m66591x1(i)));
            }
            this.f8455dy = c11896dy;
            this.f8452c5 = (C4675xw) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12054k4(int i) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            C12026yj c12026yj = (C12026yj) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), C12026yj.class);
            if (c12026yj == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Pen for penId=", C14057f9.m66591x1(i)));
            }
            List list = new List();
            this.f8457h4 = c12026yj;
            if (c12026yj.m56908ck() == 5) {
                for (int i2 = 1; i2 < this.f8457h4.m56916jd().length; i2 += 2) {
                    if (this.f8457h4.m56916jd()[i2] > 0.1d) {
                        list.addItem(Float.valueOf(this.f8457h4.m56916jd()[i2 - 1]));
                        list.addItem(Float.valueOf(this.f8457h4.m56916jd()[i2]));
                    }
                }
                if (list.size() == 0) {
                    this.f8457h4.m56939x1((float[]) null);
                    this.f8457h4.m56927kk(0);
                } else {
                    this.f8457h4.m56939x1(C12565ks.m58628kk((List<Float>) list));
                }
            }
            this.f8463m9 = (C4633j2) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12077x1(int i, C2639k4 c2639k4) {
        if (this.f8468u4.size() < i) {
            while (this.f8468u4.size() < i) {
                this.f8468u4.push(null);
            }
        }
        if (this.f8468u4.size() > i) {
            while (this.f8468u4.size() > i) {
                this.f8468u4.pop();
            }
        }
        if (this.f8468u4.size() == i) {
            this.f8468u4.push(c2639k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12055k4(int i, float f) {
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
        this.f8473wl = c11913yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12078x1(int i, AbstractC12008jd abstractC12008jd) {
        C2639k4 c2639k4Pop = null;
        if (this.f8468u4.size() > i) {
            while (this.f8468u4.size() > i) {
                c2639k4Pop = this.f8468u4.pop();
            }
        }
        if (c2639k4Pop != null) {
            if (abstractC12008jd != null) {
                abstractC12008jd.mo17496k4(c2639k4Pop.m12093to());
            }
            m12062k4(c2639k4Pop.m12094x1().m56768x1());
            m12060k4(c2639k4Pop.m12084k4().m55760h4());
            m12079x1(c2639k4Pop.m12082du().m55760h4());
            m12053k4(c2639k4Pop.m12092m9());
            m12046dy(c2639k4Pop.m12083h4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12056k4(int i, C2639k4 c2639k4) {
        C2639k4[] c2639k4Arr = this.f8471uz;
        if (i >= c2639k4Arr.length) {
            C2639k4[][] c2639k4Arr2 = {c2639k4Arr};
            AbstractC14092to.m67239k4((Object[][]) c2639k4Arr2, i + 1);
            this.f8471uz = c2639k4Arr2[0];
        }
        this.f8471uz[i] = c2639k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12079x1(C11913yj c11913yj) {
        this.f8473wl = c11913yj;
        this.f8460k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12057k4(int i, AbstractC12008jd abstractC12008jd) {
        C2639k4[] c2639k4Arr = this.f8471uz;
        if (i < c2639k4Arr.length) {
            C2639k4 c2639k4 = c2639k4Arr[i];
            if (c2639k4 != null) {
                m12079x1(c2639k4.m12082du().m55760h4());
                m12060k4(c2639k4.m12084k4().m55760h4());
                m12062k4(c2639k4.m12094x1().m56768x1());
                m12053k4(c2639k4.m12092m9());
                m12046dy(c2639k4.m12083h4());
                abstractC12008jd.mo17498k4(c2639k4.m12091kk());
            }
            this.f8471uz[i] = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12058k4(int i, Object obj, AbstractC4615c6 abstractC4615c6) {
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            this.f8461kk.set_Item(Integer.valueOf(i), new C2642x1(obj, abstractC4615c6));
        } else {
            this.f8461kk.addItem(Integer.valueOf(i), new C2642x1(obj, abstractC4615c6));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12059k4(int i, boolean z) {
        if (z) {
            C12003du c12003duClone = C12003du.m56396k4(i).Clone();
            this.f8467to = new C11999ar(c12003duClone.Clone());
            this.f8454du = new C4652rv();
            C4634j5 c4634j5 = new C4634j5();
            c4634j5.m19164k4(new C4637k4(c12003duClone.Clone()));
            this.f8454du.m19332k4(c4634j5);
            return;
        }
        if (this.f8461kk.containsKey(Integer.valueOf(i))) {
            AbstractC12024x1 abstractC12024x1 = (AbstractC12024x1) C7019kk.m27452k4(this.f8461kk.get_Item(Integer.valueOf(i)).m12101k4(), AbstractC12024x1.class);
            if (abstractC12024x1 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unable to select Brush for brushId=", C14057f9.m66591x1(i)));
            }
            this.f8467to = abstractC12024x1;
            this.f8454du = (C4652rv) this.f8461kk.get_Item(Integer.valueOf(i)).m12102x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12060k4(C11913yj c11913yj) {
        this.f8469um = c11913yj;
        this.f8460k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12061k4(C12009k4 c12009k4) {
        this.f8472v4 = c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12062k4(C12018u4 c12018u4) {
        this.f8474x1.m14587k4(c12018u4);
        this.f8460k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12063k4(Object obj) {
        this.f8451bv.m14524k4(obj);
    }
}
