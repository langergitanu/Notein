package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MasterSlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements IMasterSlideHeaderFooterManager {

    /* JADX INFO: renamed from: k4 */
    private final MasterSlide f2705k4;

    public MasterSlideHeaderFooterManager(MasterSlide masterSlide) {
        super(masterSlide);
        this.f2705k4 = masterSlide;
    }

    /* JADX INFO: renamed from: du */
    private void m1951du() {
        AutoShape autoShapeM73633x1 = xxd.m73633x1(this.f2705k4, "Footer Placeholder");
        autoShapeM73633x1.mo1214P_().m67987k4(new tbp((((double) ((SlideSize) this.f2705k4.getPresentation().getSlideSize()).m2755k4().Clone().m56699x1()) - 228.0d) / 2.0d, 500.5d));
        autoShapeM73633x1.m2555k4(228.0d, 28.75d);
    }

    /* JADX INFO: renamed from: h4 */
    private void m1952h4() {
        AutoShape autoShapeM73630k4 = xxd.m73630k4(this.f2705k4, "Date Placeholder");
        autoShapeM73630k4.mo1214P_().m67987k4(new tbp(66.0d, 500.5d));
        autoShapeM73630k4.m2555k4(168.0d, 28.75d);
    }

    /* JADX INFO: renamed from: m9 */
    private void m1953m9() {
        AutoShape autoShapeM73632kk = xxd.m73632kk(this.f2705k4, "Slide Number Placeholder");
        autoShapeM73632kk.mo1214P_().m67987k4(new tbp((((double) ((SlideSize) this.f2705k4.getPresentation().getSlideSize()).m2755k4().Clone().m56699x1()) - 168.0d) - 66.0d, 500.5d));
        autoShapeM73632kk.m2555k4(168.0d, 28.75d);
    }

    @Override // com.aspose.slides.BaseSlideHeaderFooterManager
    /* JADX INFO: renamed from: kk */
    public void mo417kk(byte b) {
        if (m422x1(b)) {
            return;
        }
        if (b == 4) {
            m1952h4();
        } else if (b == 5) {
            m1953m9();
        } else {
            if (b != 6) {
                throw new ArgumentOutOfRangeException("placeholderType");
            }
            m1951du();
        }
    }

    @Override // com.aspose.slides.IMasterSlideHeaderFooterManager
    public final void setDateTimeAndChildDateTimesText(String str) {
        m1954x1((byte) 4, str, true);
    }

    @Override // com.aspose.slides.IMasterSlideHeaderFooterManager
    public final void setDateTimeAndChildDateTimesVisibility(boolean z) {
        m1955x1((byte) 4, z);
    }

    @Override // com.aspose.slides.IMasterSlideHeaderFooterManager
    public final void setFooterAndChildFootersText(String str) {
        m1954x1((byte) 6, str, false);
    }

    @Override // com.aspose.slides.IMasterSlideHeaderFooterManager
    public final void setFooterAndChildFootersVisibility(boolean z) {
        m1955x1((byte) 6, z);
    }

    @Override // com.aspose.slides.IMasterSlideHeaderFooterManager
    public final void setSlideNumberAndChildSlideNumbersVisibility(boolean z) {
        m1955x1((byte) 5, z);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1954x1(byte b, String str, boolean z) {
        m413k4(b, str, z);
        IGenericEnumerator<ILayoutSlide> it = this.f2705k4.getLayoutSlides().iterator();
        while (it.hasNext()) {
            try {
                ((LayoutSlideHeaderFooterManager) it.next().getHeaderFooterManager()).m1854x1(b, str, z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1955x1(byte b, boolean z) {
        m414k4(b, z);
        IGenericEnumerator<ILayoutSlide> it = this.f2705k4.getLayoutSlides().iterator();
        while (it.hasNext()) {
            try {
                ((LayoutSlideHeaderFooterManager) it.next().getHeaderFooterManager()).m1855x1(b, z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
