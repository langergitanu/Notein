package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.PresentationPlayer;
import com.aspose.slides.android.Size;
import com.aspose.slides.android.SizeF;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class PresentationAnimationsGenerator implements IDisposable {

    /* JADX INFO: renamed from: du */
    private boolean f3134du;

    /* JADX INFO: renamed from: h4 */
    private int f3135h4;

    /* JADX INFO: renamed from: k4 */
    final C12023wl f3136k4;

    /* JADX INFO: renamed from: kk */
    private int f3137kk;

    /* JADX INFO: renamed from: m9 */
    private NewAnimation f3138m9;

    /* JADX INFO: renamed from: to */
    private int f3139to;

    /* JADX INFO: renamed from: x1 */
    private final C12009k4 f3140x1;

    public interface NewAnimation {
        void invoke(IPresentationAnimationPlayer iPresentationAnimationPlayer);
    }

    public PresentationAnimationsGenerator(Presentation presentation) {
        this(((SlideSize) presentation.getSlideSize()).m2755k4().m56698to().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m2402k4(double d, C12009k4 c12009k4) {
        m2404k4(new bzy(d, c12009k4));
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f3140x1.dispose();
    }

    public final int getDefaultDelay() {
        return this.f3139to;
    }

    public final int getExportedSlides() {
        return this.f3135h4;
    }

    public Size getFrameSize() {
        return (Size) C12023wl.m56858x1(this.f3136k4);
    }

    public final int getGradientStyle() {
        return this.f3137kk;
    }

    public final boolean getIncludeHiddenSlides() {
        return this.f3134du;
    }

    public final void run(IGenericEnumerable<ISlide> iGenericEnumerable) {
        m2403k4(0);
        IGenericEnumerator<IEffect> it = iGenericEnumerable.iterator();
        C12009k4 c12009k4 = null;
        while (it.hasNext()) {
            try {
                ISlide next = it.next();
                if (!next.getHidden() || getIncludeHiddenSlides()) {
                    C14571tq c14571tqM71274k4 = C14571tq.m71274k4(next, this.f3136k4.Clone());
                    SlideShowTransition slideShowTransition = (SlideShowTransition) next.getSlideShowTransition();
                    int advanceAfterTime = (int) slideShowTransition.getAdvanceAfterTime();
                    if (advanceAfterTime <= 0) {
                        advanceAfterTime = getDefaultDelay();
                    }
                    double d = advanceAfterTime;
                    ISequence mainSequence = next.getTimeline().getMainSequence();
                    lrw lrwVarM7310k4 = hw5.m7310k4(mainSequence, c14571tqM71274k4);
                    if (lrwVarM7310k4 != null) {
                        it = mainSequence.iterator();
                        while (it.hasNext()) {
                            try {
                                Effect effect = (Effect) it.next();
                                if (effect.getPresetClassType() == 0) {
                                    if (effect.f2144to < 0) {
                                        effect.getTargetShape().setHidden(true);
                                    } else if (C7019kk.m27469x1(effect.getTargetShape(), AutoShape.class)) {
                                        ((AutoShape) effect.getTargetShape()).m288x1().f3523to.mo64293k4(effect.f2144to, effect.f2137du, true);
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
                    RenderingOptions renderingOptions = new RenderingOptions();
                    renderingOptions.setGradientStyle(getGradientStyle());
                    C12009k4 c12009k4M2691k4 = ((Slide) next).m2691k4(renderingOptions, this.f3136k4.Clone());
                    m2406k4(c14571tqM71274k4, slideShowTransition, c12009k4M2691k4, c12009k4);
                    if (lrwVarM7310k4 != null) {
                        c12009k4M2691k4.dispose();
                        try {
                            ot0 ot0Var = new ot0(this.f3136k4.Clone(), c14571tqM71274k4, lrwVarM7310k4);
                            m2404k4(ot0Var);
                            ot0Var.setTimePosition(ot0Var.getDuration());
                            C12009k4 c12009k42 = (C12009k4) ((yyn) ot0Var.getFrame()).m74148k4();
                            if (ot0Var.getDuration() < d) {
                                m2402k4(d - ot0Var.getDuration(), c12009k42);
                            }
                            lrwVarM7310k4.dispose();
                            c12009k4M2691k4 = c12009k42;
                        } catch (Throwable th) {
                            lrwVarM7310k4.dispose();
                            throw th;
                        }
                    } else {
                        m2402k4(d, c12009k4M2691k4);
                    }
                    if (c12009k4 != c12009k4M2691k4) {
                        if (c12009k4 != null) {
                            c12009k4.dispose();
                        }
                        c12009k4 = c12009k4M2691k4;
                    }
                    m2403k4(getExportedSlides() + 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (c12009k4 != null) {
            c12009k4.dispose();
        }
    }

    public final void setDefaultDelay(int i) {
        this.f3139to = i;
    }

    public final void setGradientStyle(int i) {
        this.f3137kk = i;
    }

    public final void setIncludeHiddenSlides(boolean z) {
        this.f3134du = z;
    }

    public void setNewAnimation(NewAnimation newAnimation) {
        this.f3138m9 = newAnimation;
    }

    public PresentationAnimationsGenerator(Size size) {
        this(C12023wl.m56855k4(size));
    }

    /* JADX INFO: renamed from: k4 */
    private void m2403k4(int i) {
        this.f3135h4 = i;
    }

    public final void run(IGenericEnumerable<ISlide> iGenericEnumerable, int i, PresentationPlayer.FrameTick frameTick) {
        PresentationPlayer presentationPlayer = new PresentationPlayer(this, i);
        try {
            presentationPlayer.setFrameTick(frameTick);
            run(iGenericEnumerable);
        } finally {
            presentationPlayer.dispose();
        }
    }

    public PresentationAnimationsGenerator(SizeF sizeF) {
        this(C12015qq.m56689k4(sizeF).m56698to());
    }

    /* JADX INFO: renamed from: k4 */
    private void m2404k4(IPresentationAnimationPlayer iPresentationAnimationPlayer) {
        NewAnimation newAnimation = this.f3138m9;
        if (newAnimation != null) {
            newAnimation.invoke(iPresentationAnimationPlayer);
        }
    }

    public PresentationAnimationsGenerator(C12023wl c12023wl) {
        this.f3137kk = 0;
        C12023wl c12023wl2 = new C12023wl();
        this.f3136k4 = c12023wl2;
        c12023wl.CloneTo(c12023wl2);
        setDefaultDelay(1000);
        this.f3140x1 = new C12009k4(c12023wl2.m56865x1(), c12023wl2.m56862kk(), 139273);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2405k4(fsr fsrVar, double d) {
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) this.f3140x1);
        try {
            m2404k4(new o5p(abstractC12008jdM56582k4, this.f3140x1, fsrVar, d));
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1
      0x003b: PHI (r1v4 int) = (r1v3 int), (r1v6 int) binds: [B:8:0x0038, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m2406k4(C14571tq c14571tq, SlideShowTransition slideShowTransition, C12009k4 c12009k4, C12009k4 c12009k42) {
        int i;
        lev levVar;
        xxx xxxVarM2749k4 = slideShowTransition.m2749k4();
        int i2 = 1000;
        int i3 = 0;
        Object[] objArr = 0;
        int i4 = 0;
        if (C14113y2.m67411k4(xxxVarM2749k4.m73637k4())) {
            int[] iArr = {0};
            boolean zM2748k4 = SlideShowTransition.m2748k4(slideShowTransition.getType(), new int[]{slideShowTransition.getSpeed()}, iArr);
            i = iArr[0];
            if (zM2748k4) {
            }
        } else {
            int[] iArr2 = {0};
            boolean zM66590k4 = C14057f9.m66590k4(xxxVarM2749k4.m73637k4(), iArr2);
            i = iArr2[0];
            if (zM66590k4) {
                i2 = i;
            }
        }
        double d = i2;
        if (slideShowTransition.getType() == 15) {
            if (c12009k4 != null) {
                boolean z = !C7019kk.m27469x1(slideShowTransition.getValue(), OrientationTransition.class) || ((OrientationTransition) C7019kk.m27452k4((Object) slideShowTransition.getValue(), OrientationTransition.class)).getDirection() == 0;
                if (c12009k42 == null) {
                    c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9());
                    AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                    try {
                        abstractC12008jdM56582k4.mo17517k4(C12003du.m56460uz().Clone());
                        abstractC12008jdM56582k4.dispose();
                        objArr = 1;
                    } catch (Throwable th) {
                        if (abstractC12008jdM56582k4 != null) {
                            abstractC12008jdM56582k4.dispose();
                        }
                        throw th;
                    }
                }
                m2405k4(new a8b(c12009k42, c12009k4, z, c14571tq.m71287x1()), d);
                if (objArr != 0) {
                    c12009k42.dispose();
                    return;
                }
                return;
            }
            return;
        }
        double d2 = 0.0d;
        if (slideShowTransition.getType() == 9) {
            if (!C7019kk.m27469x1(slideShowTransition.getValue(), OptionalBlackTransition.class) || !((OptionalBlackTransition) C7019kk.m27452k4((Object) slideShowTransition.getValue(), OptionalBlackTransition.class)).getFromBlack()) {
                if (c12009k42 == null || c12009k4 == null) {
                    return;
                }
                m2405k4(new C1221hr(c12009k42, c12009k4), d);
                return;
            }
            C14860yt c14860yt = new C14860yt(this.f3136k4.Clone());
            if (c12009k42 != null) {
                try {
                    c14860yt.m74341k4(c12009k42);
                    c14860yt.m74080k4(C12003du.m56458up().Clone());
                    c14860yt.m74083x1(C12003du.m56460uz().Clone());
                    d2 = d / 2.0d;
                    m2405k4(c14860yt, d2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c14860yt.m74341k4(c12009k4);
            c14860yt.m74080k4(C12003du.m56460uz().Clone());
            c14860yt.m74083x1(C12003du.m56458up().Clone());
            m2405k4(c14860yt, d - d2);
            return;
        }
        if (slideShowTransition.getType() == 40) {
            C14860yt c14860yt2 = new C14860yt(this.f3136k4.Clone());
            try {
                c14860yt2.m74080k4(C12003du.m56460uz().Clone());
                c14860yt2.m74083x1(C12003du.m56385i5().Clone());
                double d3 = d / 2.0d;
                m2405k4(c14860yt2, d3);
                c14860yt2.m74341k4(c12009k4);
                c14860yt2.m74080k4(C12003du.m56385i5().Clone());
                c14860yt2.m74083x1(C12003du.m56458up().Clone());
                m2405k4(c14860yt2, d - d3);
                return;
            } finally {
                c14860yt2.dispose();
            }
        }
        if (slideShowTransition.getType() == 13) {
            yxj yxjVar = new yxj();
            yxjVar.m74134k4(c12009k42);
            yxjVar.m74140x1(c12009k4);
            if (C7019kk.m27469x1(slideShowTransition.getValue(), SideDirectionTransition.class)) {
                C4329x6 c4329x6M17424k4 = C14725w6.m72635k4(((SideDirectionTransition) slideShowTransition.getValue()).getDirection()).Clone();
                C12023wl c12023wlClone = this.f3136k4.Clone();
                c12023wlClone.m56860k4(c12023wlClone.m56865x1() * (-c4329x6M17424k4.f11827kk));
                c12023wlClone.m56866x1(c12023wlClone.m56862kk() * c4329x6M17424k4.f11828to);
                yxjVar.m74135k4(c12023wlClone.Clone());
            }
            m2405k4(yxjVar, d);
            return;
        }
        if (slideShowTransition.getType() == 5) {
            yxj yxjVar2 = new yxj();
            yxjVar2.m74134k4(c12009k42);
            yxjVar2.m74140x1(c12009k4);
            yxjVar2.m74136k4(true);
            if (C7019kk.m27469x1(slideShowTransition.getValue(), EightDirectionTransition.class)) {
                C4329x6 c4329x6M17424k42 = C14725w6.m72639x1(((EightDirectionTransition) slideShowTransition.getValue()).getDirection()).Clone();
                C12023wl c12023wlClone2 = this.f3136k4.Clone();
                c12023wlClone2.m56860k4(c12023wlClone2.m56865x1() * (-c4329x6M17424k42.f11827kk));
                c12023wlClone2.m56866x1(c12023wlClone2.m56862kk() * c4329x6M17424k42.f11828to);
                yxjVar2.m74135k4(c12023wlClone2.Clone());
            }
            m2405k4(yxjVar2, d);
            return;
        }
        if (slideShowTransition.getType() == 12) {
            etr etrVar = new etr();
            etrVar.m5700x1(c12009k42);
            etrVar.m5697k4(c12009k4);
            if (C7019kk.m27469x1(slideShowTransition.getValue(), EightDirectionTransition.class)) {
                C4329x6 c4329x6M17424k43 = C14725w6.m72639x1(((EightDirectionTransition) slideShowTransition.getValue()).getDirection()).Clone();
                C4329x6 c4329x6 = new C4329x6(this.f3136k4.m56865x1(), this.f3136k4.m56862kk());
                c4329x6.f11827kk *= c4329x6M17424k43.f11827kk;
                c4329x6.f11828to *= c4329x6M17424k43.f11828to;
                etrVar.m5696k4(c4329x6.Clone());
            }
            m2405k4(etrVar, d);
            return;
        }
        if (slideShowTransition.getType() == 20 || slideShowTransition.getType() == 17) {
            if (C7019kk.m27469x1(slideShowTransition.getValue(), SideDirectionTransition.class)) {
                int direction = ((SideDirectionTransition) slideShowTransition.getValue()).getDirection();
                if (direction == 1) {
                    d2 = 1.5707963267948966d;
                } else if (direction == 2) {
                    d2 = -1.5707963267948966d;
                } else if (direction == 3) {
                    d2 = 3.141592653589793d;
                }
            } else if (C7019kk.m27469x1(slideShowTransition.getValue(), CornerDirectionTransition.class)) {
                int direction2 = ((CornerDirectionTransition) slideShowTransition.getValue()).getDirection();
                if (direction2 == 0) {
                    d2 = -0.7853981633974483d;
                } else if (direction2 == 1) {
                    d2 = 0.7853981633974483d;
                } else if (direction2 == 2) {
                    d2 = -2.356194490192345d;
                } else if (direction2 == 3) {
                    d2 = 2.356194490192345d;
                }
            }
            C1168h0 c1168h0 = new C1168h0(this.f3136k4.Clone(), new x6o(this.f3136k4.Clone(), d2, false));
            c1168h0.m74341k4(c12009k42);
            c1168h0.m6955x1(c12009k4);
            try {
                m2405k4(c1168h0, d);
                return;
            } finally {
            }
        }
        if (slideShowTransition.getType() == 16) {
            if (C7019kk.m27469x1(slideShowTransition.getValue(), SplitTransition.class)) {
                SplitTransition splitTransition = (SplitTransition) slideShowTransition.getValue();
                levVar = new lev(this.f3136k4.Clone(), splitTransition.getDirection() == 1, splitTransition.getOrientation() != 0 ? 0 : 1, false);
            } else {
                levVar = new lev(this.f3136k4.Clone(), true, 0, false);
            }
            C1168h0 c1168h02 = new C1168h0(this.f3136k4.Clone(), levVar);
            c1168h02.m74341k4(c12009k42);
            c1168h02.m6955x1(c12009k4);
            try {
                m2405k4(c1168h02, d);
                return;
            } finally {
            }
        }
        if (slideShowTransition.getType() == 21) {
            if (C7019kk.m27469x1(slideShowTransition.getValue(), InOutTransition.class)) {
                InOutTransition inOutTransition = (InOutTransition) slideShowTransition.getValue();
                gd6 gd6Var = new gd6(this.f3136k4.Clone());
                gd6Var.m74341k4(c12009k4);
                gd6Var.m6495k4(inOutTransition.getDirection() == 0);
                m2405k4(gd6Var, d);
                return;
            }
            return;
        }
        if (slideShowTransition.getType() == 3 || slideShowTransition.getType() == 7 || slideShowTransition.getType() == 11) {
            int type = slideShowTransition.getType();
            if (type == 7) {
                i3 = 1;
            } else if (type == 11) {
                i3 = 3;
            }
            C14220oa c14220oa = new C14220oa(this.f3136k4.Clone(), i3);
            c14220oa.m74341k4(c12009k42);
            c14220oa.m68424x1(c12009k4);
            m2405k4(c14220oa, d);
            return;
        }
        if (slideShowTransition.getType() != 19 && slideShowTransition.getType() != 43 && slideShowTransition.getType() != 18) {
            if (i2 > 0) {
                m2402k4(d, c12009k4);
                return;
            }
            return;
        }
        int type2 = slideShowTransition.getType();
        if (type2 == 18) {
            i4 = 2;
        } else if (type2 == 43) {
            i4 = 1;
        }
        C1168h0 c1168h03 = new C1168h0(this.f3136k4.Clone(), new WheelEffect(this.f3136k4.Clone(), i4));
        c1168h03.m74341k4(c12009k42);
        c1168h03.m6955x1(c12009k4);
        try {
            m2405k4(c1168h03, d);
        } finally {
        }
    }
}
