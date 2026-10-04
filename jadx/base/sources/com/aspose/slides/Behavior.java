package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Behavior implements IBehavior, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private C14659v0 f1091du;

    /* JADX INFO: renamed from: k4 */
    byte f1092k4;

    /* JADX INFO: renamed from: kk */
    BehaviorPropertyCollection f1093kk;

    /* JADX INFO: renamed from: to */
    ITiming f1094to;

    /* JADX INFO: renamed from: x1 */
    int f1095x1;

    public Behavior() {
        this.f1092k4 = (byte) -1;
        this.f1095x1 = -1;
        this.f1093kk = new BehaviorPropertyCollection();
        this.f1094to = new Timing(this);
        this.f1091du = new C14659v0();
    }

    @Override // com.aspose.slides.IBehavior
    public final byte getAccumulate() {
        return this.f1092k4;
    }

    @Override // com.aspose.slides.IBehavior
    public final int getAdditive() {
        return this.f1095x1;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return null;
    }

    @Override // com.aspose.slides.IBehavior
    public final IBehaviorPropertyCollection getProperties() {
        return this.f1093kk;
    }

    @Override // com.aspose.slides.IBehavior
    public final ITiming getTiming() {
        return this.f1094to;
    }

    /* JADX INFO: renamed from: k4 */
    public C14659v0 mo424k4() {
        return this.f1091du;
    }

    @Override // com.aspose.slides.IBehavior
    public final void setAccumulate(byte b) {
        this.f1092k4 = b;
    }

    @Override // com.aspose.slides.IBehavior
    public final void setAdditive(int i) {
        this.f1095x1 = i;
    }

    @Override // com.aspose.slides.IBehavior
    public final void setTiming(ITiming iTiming) {
        this.f1094to = iTiming;
    }

    public Behavior(C14659v0 c14659v0) {
        this.f1092k4 = (byte) -1;
        this.f1095x1 = -1;
        this.f1093kk = new BehaviorPropertyCollection();
        this.f1094to = new Timing(this);
        this.f1091du = c14659v0;
    }
}
