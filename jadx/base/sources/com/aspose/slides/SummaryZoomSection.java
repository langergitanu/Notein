package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class SummaryZoomSection extends SectionZoomFrame implements ISummaryZoomSection {

    /* JADX INFO: renamed from: du */
    private float f3469du;

    /* JADX INFO: renamed from: h4 */
    private float f3470h4;

    /* JADX INFO: renamed from: k4 */
    private String f3471k4;

    /* JADX INFO: renamed from: kk */
    private float f3472kk;

    /* JADX INFO: renamed from: to */
    private float f3473to;

    /* JADX INFO: renamed from: x1 */
    private String f3474x1;

    public SummaryZoomSection(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        setReturnToParent(true);
        m2843du(100.0f);
        m2844h4(100.0f);
    }

    /* JADX INFO: renamed from: ck */
    public final float m2842ck() {
        return this.f3469du;
    }

    /* JADX INFO: renamed from: du */
    public final void m2843du(float f) {
        this.f3469du = f;
    }

    @Override // com.aspose.slides.ISummaryZoomSection
    public final String getDescription() {
        return this.f3474x1;
    }

    @Override // com.aspose.slides.ISummaryZoomSection
    public final String getTitle() {
        return this.f3471k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m2844h4(float f) {
        this.f3470h4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final float m2845kk() {
        return this.f3472kk;
    }

    @Override // com.aspose.slides.ISummaryZoomSection
    public final void setDescription(String str) {
        this.f3474x1 = str;
    }

    @Override // com.aspose.slides.ISummaryZoomSection
    public final void setTitle(String str) {
        this.f3471k4 = str;
    }

    /* JADX INFO: renamed from: to */
    public final float m2847to() {
        return this.f3473to;
    }

    /* JADX INFO: renamed from: up */
    public final float m2849up() {
        return this.f3470h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m2846kk(float f) {
        this.f3472kk = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m2848to(float f) {
        this.f3473to = f;
    }
}
