package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p407st.C10724y1;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class uz3 extends au9 {

    /* JADX INFO: renamed from: c5 */
    private C0946ee f49433c5;

    /* JADX INFO: renamed from: ck */
    private Effect f49434ck;

    /* JADX INFO: renamed from: du */
    protected IEffectFormat f49435du;

    /* JADX INFO: renamed from: dy */
    protected Shape f49436dy;

    /* JADX INFO: renamed from: fa */
    private int f49437fa;

    /* JADX INFO: renamed from: h4 */
    protected boolean f49438h4;

    /* JADX INFO: renamed from: jd */
    private kiv f49439jd;

    /* JADX INFO: renamed from: m9 */
    protected boolean f49440m9;

    /* JADX INFO: renamed from: to */
    protected oiv f49441to;

    public uz3(Shape shape, Shape shape2, z9q z9qVar) {
        this(z9qVar);
        this.f3954k4 = shape;
        this.f49436dy = shape2;
        m3738du().m70237x1(this);
        m72005rv();
    }

    /* JADX INFO: renamed from: c5 */
    private void m71996c5() {
        boolean zM27456k4;
        this.f49434ck = null;
        this.f49437fa = 0;
        Shape shape = (Shape) C7019kk.m27452k4(this.f3954k4, Shape.class);
        if (shape == null) {
            return;
        }
        IGenericEnumerator<IEffect> it = shape.getSlide().getTimeline().getMainSequence().iterator();
        while (it.hasNext()) {
            try {
                Effect effect = (Effect) C7019kk.m27452k4((Object) it.next(), Effect.class);
                if (effect != null) {
                    this.f49437fa++;
                    Shape shape2 = (Shape) C7019kk.m27452k4((Object) effect.m1375kk().m7584to(), Shape.class);
                    if (shape2 != null && (shape2.m2584wp() & 4294967295L) == (4294967295L & shape.m2584wp()) && effect.getPresetClassType() == 0) {
                        this.f49434ck = effect;
                        if (zM27456k4) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: ar */
    public final C10711xc m71997ar() {
        return m72000ix().mo50863m9();
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m71998b3() {
        IEffectFormat iEffectFormat = this.f49435du;
        return iEffectFormat != null && ((EffectFormat) iEffectFormat).m1390to();
    }

    /* JADX INFO: renamed from: bv */
    public final C0946ee m71999bv() {
        if (this.f49433c5 == null) {
            this.f49433c5 = new C0946ee(this);
        }
        return this.f49433c5;
    }

    /* JADX INFO: renamed from: dy */
    public void mo5827dy() {
        oiv oivVar = this.f49441to;
        if (oivVar != null) {
            oivVar.m68606x1();
        }
        Shape shapeM72003ne = m72003ne();
        if (shapeM72003ne == null) {
            shapeM72003ne = mo64936jd();
        }
        boolean z = shapeM72003ne != null && shapeM72003ne.mo278fa();
        if (!z) {
            m72012x6();
        }
        if (!this.f49440m9) {
            this.f3955kk.m74353ck().m50513yj().addItem(m72000ix());
            this.f49440m9 = true;
        }
        if (z) {
            C14823xy.m73647k4(this);
            m72012x6();
        }
    }

    /* JADX INFO: renamed from: ix */
    public final C10462h9 m72000ix() {
        return (C10462h9) m3746x1();
    }

    /* JADX INFO: renamed from: jd */
    public Shape mo64936jd() {
        return (Shape) C7019kk.m27452k4(this.f3954k4, Shape.class);
    }

    @Override // com.aspose.slides.au9
    /* JADX INFO: renamed from: k4 */
    public void mo3740k4() {
        C10462h9 c10462h9 = new C10462h9();
        this.f3957x1 = c10462h9;
        c10462h9.m50512x1(true);
    }

    /* JADX INFO: renamed from: lr */
    public final Effect m72002lr() {
        return this.f49434ck;
    }

    /* JADX INFO: renamed from: ne */
    public final Shape m72003ne() {
        return this.f49436dy;
    }

    /* JADX INFO: renamed from: qq */
    public final C10534m3 m72004qq() {
        return m72000ix().mo50859du();
    }

    /* JADX INFO: renamed from: rv */
    public final void m72005rv() {
        Shape shape = (Shape) C7019kk.m27452k4(this.f3954k4, Shape.class);
        this.f49435du = shape.getEffectFormat();
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) shape, AutoShape.class);
        if (shape.getPlaceholder() != null) {
            this.f49439jd = new kiv(this);
            hi8.m7177k4(this);
        } else if (autoShape != null) {
            m72001k4(autoShape.getTextFrame(), 4);
        }
        m71996c5();
    }

    /* JADX INFO: renamed from: u4 */
    public final oiv m72006u4() {
        return this.f49441to;
    }

    /* JADX INFO: renamed from: um */
    public final C10358am m72007um() {
        return m72000ix().mo50862jd();
    }

    /* JADX INFO: renamed from: uz */
    public final kiv m72008uz() {
        return this.f49439jd;
    }

    /* JADX INFO: renamed from: v4 */
    public final IEffectFormat m72009v4() {
        return this.f49435du;
    }

    /* JADX INFO: renamed from: wl */
    public final C10724y1 m72010wl() {
        return m72000ix().mo50864to();
    }

    /* JADX INFO: renamed from: wy */
    public final boolean m72011wy() {
        return this.f49438h4;
    }

    /* JADX INFO: renamed from: x6 */
    public void m72012x6() {
        m72000ix().m50512x1(false);
        if (m72004qq() != null && m72004qq().m51263x1().m50921k4() == 0) {
            m72000ix().m50513yj().removeItem(m72004qq());
        }
        if (m71997ar() != null && m71997ar().m51976x1().m50921k4() == 0) {
            m72000ix().m50513yj().removeItem(m71997ar());
        }
        if (m72007um() == null || m72007um().m50513yj().size() >= 1) {
            return;
        }
        m72000ix().m50513yj().removeItem(m72007um());
        m72000ix().mo50509up();
    }

    /* JADX INFO: renamed from: yd */
    public final int m72013yd() {
        return this.f49437fa;
    }

    /* JADX INFO: renamed from: yj */
    public void mo64938yj() {
    }

    public uz3(Shape shape, z9q z9qVar) {
        this(z9qVar);
        this.f3954k4 = shape;
        m3738du().m70237x1(this);
        m72005rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72001k4(ITextFrame iTextFrame, int i) {
        if (iTextFrame == null) {
            return;
        }
        oiv oivVar = new oiv((TextFrame) iTextFrame, this);
        this.f49441to = oivVar;
        oivVar.m68593k4(i);
    }

    public uz3(z9q z9qVar) {
        super(z9qVar);
        this.f49435du = null;
        this.f49438h4 = false;
        this.f49440m9 = false;
        this.f49436dy = null;
        this.f49434ck = null;
        this.f49437fa = 0;
    }
}
