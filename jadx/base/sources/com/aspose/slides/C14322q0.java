package com.aspose.slides;

import com.aspose.slides.Slide;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.q0 */
/* JADX INFO: loaded from: classes3.dex */
class C14322q0 implements InterfaceC1207hk {

    /* JADX INFO: renamed from: k4 */
    private final IProgressCallback f48215k4;

    /* JADX INFO: renamed from: kk */
    private int f48216kk;

    /* JADX INFO: renamed from: x1 */
    private int f48217x1;

    public C14322q0(IProgressCallback iProgressCallback) {
        if (iProgressCallback == null) {
            throw new NullReferenceException("progressCallback");
        }
        this.f48215k4 = iProgressCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m69351x1() {
        int i = this.f48217x1 + 1;
        this.f48217x1 = i;
        this.f48215k4.reporting((((double) i) * 100.0d) / ((double) this.f48216kk));
    }

    @Override // com.aspose.slides.InterfaceC1207hk
    /* JADX INFO: renamed from: k4 */
    public final void mo7216k4() {
        this.f48217x1++;
        this.f48215k4.reporting(100.0d);
    }

    @Override // com.aspose.slides.InterfaceC1207hk
    /* JADX INFO: renamed from: k4 */
    public final void mo7217k4(IPresentation iPresentation, int[] iArr) {
        if (iPresentation == null) {
            throw new NullReferenceException("presentation");
        }
        if (iArr == null) {
            throw new NullReferenceException("slideIndices");
        }
        this.f48217x1 = 0;
        this.f48216kk = 1;
        for (int i : iArr) {
            if (i >= 1 && i <= iPresentation.getSlides().size()) {
                Slide slide = (Slide) C7019kk.m27452k4((Object) iPresentation.getSlides().get_Item(i - 1), Slide.class);
                this.f48216kk = slide.m2707lr() + this.f48216kk;
                slide.m2702k4(new Slide.AbstractC0625k4() { // from class: com.aspose.slides.q0.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Export.DrawingProgressNotifier.NotifyProgress()";
                    }

                    @Override // com.aspose.slides.Slide.AbstractC0625k4
                    /* JADX INFO: renamed from: k4 */
                    public void mo2723k4() {
                        C14322q0.this.m69351x1();
                    }
                });
            }
        }
        this.f48215k4.reporting(0.0d);
    }
}
