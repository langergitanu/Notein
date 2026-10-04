package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.PresentationAnimationsGenerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p130fh.C3996x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p497xc.C12497k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
class tqy {

    /* JADX INFO: renamed from: du */
    private int f49179du;

    /* JADX INFO: renamed from: k4 */
    private final PresentationAnimationsGenerator f49180k4;

    /* JADX INFO: renamed from: kk */
    private final C12497k4 f49181kk;

    /* JADX INFO: renamed from: to */
    private double f49182to = 0.0d;

    /* JADX INFO: renamed from: x1 */
    private final GifOptions f49183x1;

    private tqy(PresentationAnimationsGenerator presentationAnimationsGenerator, GifOptions gifOptions, C12497k4 c12497k4) {
        this.f49180k4 = presentationAnimationsGenerator;
        this.f49183x1 = gifOptions;
        this.f49181kk = c12497k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m71289k4(double[] dArr) {
        int iM15785x1 = C3996x1.m15785x1(C3996x1.m15784k4(C7019kk.m27462to(Double.valueOf(dArr[0]), 14)));
        dArr[0] = iM15785x1;
        return iM15785x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m71295x1(IPresentationAnimationPlayer iPresentationAnimationPlayer) {
        C12009k4 c12009k4;
        double d;
        GifOptions gifOptions = this.f49183x1;
        double transitionFps = (1.0d / ((double) (gifOptions != null ? gifOptions.getTransitionFps() : 25))) * 1000.0d;
        double d2 = 0.0d;
        int i = 0;
        while (true) {
            iPresentationAnimationPlayer.setTimePosition(d2);
            c12009k4 = C7019kk.m27469x1(iPresentationAnimationPlayer, AbstractC14482t1.class) ? ((AbstractC14482t1) C7019kk.m27452k4((Object) iPresentationAnimationPlayer, AbstractC14482t1.class)).f49005k4 : (C12009k4) ((yyn) iPresentationAnimationPlayer.getFrame()).m74148k4();
            i++;
            d = ((double) i) * transitionFps;
            try {
                if (iPresentationAnimationPlayer.getDuration() < d) {
                    break;
                }
                double[] dArr = {d - d2};
                int iM71289k4 = m71289k4(dArr);
                d2 = iM71289k4 > 0 ? d2 + dArr[0] : d;
                m71293k4(c12009k4, iM71289k4);
                if (!C7019kk.m27469x1(iPresentationAnimationPlayer, AbstractC14482t1.class)) {
                    c12009k4.dispose();
                }
            } finally {
                if (!C7019kk.m27469x1(iPresentationAnimationPlayer, AbstractC14482t1.class)) {
                    c12009k4.dispose();
                }
            }
        }
        m71293k4(c12009k4, m71289k4(new double[]{d - iPresentationAnimationPlayer.getDuration()}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m71290k4(IPresentationAnimationPlayer iPresentationAnimationPlayer) {
        if (C7019kk.m27469x1(iPresentationAnimationPlayer, bzy.class)) {
            m71293k4(((AbstractC14482t1) ((bzy) iPresentationAnimationPlayer)).f49005k4, C7019kk.m27462to(Double.valueOf(iPresentationAnimationPlayer.getDuration()), 14));
        } else {
            m71295x1(iPresentationAnimationPlayer);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71291k4(Presentation presentation, IGenericList<Integer> iGenericList) {
        IGenericEnumerable<ISlide> slides;
        int size;
        if (iGenericList == null) {
            slides = presentation.getSlides();
            size = presentation.getSlides().size();
        } else {
            ISlide[] iSlideArr = new ISlide[iGenericList.size()];
            for (int i = 0; i < iGenericList.size(); i++) {
                iSlideArr[i] = presentation.getSlides().get_Item(iGenericList.get_Item(i).intValue() - 1);
            }
            IGenericList iGenericListM67204k4 = AbstractC14092to.m67204k4((Object[]) iSlideArr);
            int size2 = iGenericList.size();
            slides = iGenericListM67204k4;
            size = size2;
        }
        this.f49182to = size > 0 ? 1.0d / ((double) size) : 0.0d;
        this.f49179du = -1;
        this.f49180k4.setNewAnimation(new PresentationAnimationsGenerator.NewAnimation() { // from class: com.aspose.slides.tqy.1
            @Override // com.aspose.slides.PresentationAnimationsGenerator.NewAnimation
            public void invoke(IPresentationAnimationPlayer iPresentationAnimationPlayer) {
                tqy.this.m71290k4(iPresentationAnimationPlayer);
            }
        });
        GifOptions gifOptions = this.f49183x1;
        if (gifOptions != null) {
            this.f49180k4.setGradientStyle(gifOptions.getGradientStyle());
        }
        try {
            this.f49180k4.run(slides);
        } finally {
            this.f49180k4.setNewAnimation(null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71292k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, IGenericList<Integer> iGenericList, GifOptions gifOptions) {
        if (presentation == null) {
            throw new ArgumentNullException("presentation");
        }
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("gifOutput");
        }
        C12023wl c12023wl = new C12023wl();
        ((gifOptions == null || gifOptions.m1592k4().m56861k4()) ? ((SlideSize) presentation.getSlideSize()).m2755k4().m56698to() : gifOptions.m1592k4()).CloneTo(c12023wl);
        PresentationAnimationsGenerator presentationAnimationsGenerator = new PresentationAnimationsGenerator(c12023wl.Clone());
        if (gifOptions != null) {
            presentationAnimationsGenerator.setIncludeHiddenSlides(gifOptions.getExportHiddenSlides());
            presentationAnimationsGenerator.setDefaultDelay(gifOptions.getDefaultDelay());
        }
        try {
            C12497k4 c12497k4 = new C12497k4(abstractC3150x6, presentationAnimationsGenerator.f3136k4.Clone());
            try {
                new tqy(presentationAnimationsGenerator, gifOptions, c12497k4).m71291k4(presentation, iGenericList);
            } finally {
                c12497k4.dispose();
            }
        } finally {
            presentationAnimationsGenerator.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71293k4(C12009k4 c12009k4, int i) {
        int exportedSlides;
        this.f49181kk.m58051k4(c12009k4, i);
        GifOptions gifOptions = this.f49183x1;
        if (gifOptions == null || gifOptions.getProgressCallback() == null || (exportedSlides = this.f49180k4.getExportedSlides()) == this.f49179du) {
            return;
        }
        double d = this.f49182to * ((double) exportedSlides);
        this.f49179du = exportedSlides;
        this.f49183x1.getProgressCallback().reporting(d);
    }
}
