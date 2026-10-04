package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.gg */
/* JADX INFO: loaded from: classes3.dex */
class C1143gg {

    /* JADX INFO: renamed from: k4 */
    private final C13827mb f5243k4 = new C13827mb(m6638x1());

    /* JADX INFO: renamed from: x1 */
    private static final C13827mb f5242x1 = new C13827mb();

    /* JADX INFO: renamed from: kk */
    private static final C13827mb f5241kk = new C13827mb();

    /* JADX INFO: renamed from: kk */
    public static C13827mb m6637kk() {
        return f5241kk;
    }

    /* JADX INFO: renamed from: x1 */
    public static C13827mb m6638x1() {
        return f5242x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13827mb m6639k4() {
        return this.f5243k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13827mb m6636k4(IPresentationComponent iPresentationComponent) {
        Presentation presentation;
        boolean zM27469x1 = C7019kk.m27469x1(iPresentationComponent, Presentation.class);
        Object objM27452k4 = iPresentationComponent;
        if (zM27469x1) {
            presentation = (Presentation) objM27452k4;
        } else if (iPresentationComponent == null || iPresentationComponent.getPresentation() == null) {
            presentation = null;
        } else {
            objM27452k4 = C7019kk.m27452k4((Object) iPresentationComponent.getPresentation(), (Class<Object>) Presentation.class);
            presentation = (Presentation) objM27452k4;
        }
        return presentation != null ? ((FontsManager) presentation.getFontsManager()).m1549k4() : m6637kk();
    }
}
