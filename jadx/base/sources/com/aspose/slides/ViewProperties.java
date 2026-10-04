package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ViewProperties implements IViewProperties, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private final CommonSlideViewProperties f3688du;

    /* JADX INFO: renamed from: h4 */
    private final CommonSlideViewProperties f3689h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14397rj f3690k4;

    /* JADX INFO: renamed from: x1 */
    private int f3693x1 = 0;

    /* JADX INFO: renamed from: kk */
    private byte f3691kk = -1;

    /* JADX INFO: renamed from: to */
    private final INormalViewProperties f3692to = new NormalViewProperties();

    public ViewProperties(Presentation presentation) {
        this.f3690k4 = presentation;
        CommonSlideViewProperties commonSlideViewProperties = new CommonSlideViewProperties();
        this.f3688du = commonSlideViewProperties;
        commonSlideViewProperties.setScale(73);
        CommonSlideViewProperties commonSlideViewProperties2 = new CommonSlideViewProperties();
        this.f3689h4 = commonSlideViewProperties2;
        commonSlideViewProperties2.setScale(1);
    }

    @Override // com.aspose.slides.IViewProperties
    public final int getLastView() {
        return this.f3693x1;
    }

    @Override // com.aspose.slides.IViewProperties
    public final INormalViewProperties getNormalViewProperties() {
        return this.f3692to;
    }

    @Override // com.aspose.slides.IViewProperties
    public final ICommonSlideViewProperties getNotesViewProperties() {
        return this.f3689h4;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3690k4;
    }

    @Override // com.aspose.slides.IViewProperties
    public final byte getShowComments() {
        return this.f3691kk;
    }

    @Override // com.aspose.slides.IViewProperties
    public final ICommonSlideViewProperties getSlideViewProperties() {
        return this.f3688du;
    }

    @Override // com.aspose.slides.IViewProperties
    public final void setLastView(int i) {
        this.f3693x1 = i;
    }

    @Override // com.aspose.slides.IViewProperties
    public final void setShowComments(byte b) {
        this.f3691kk = b;
    }
}
