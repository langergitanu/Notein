package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseThemeManager implements InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    static final C13682je f1088k4 = new C13682je();

    /* JADX INFO: renamed from: kk */
    private final InterfaceC14397rj f1089kk;

    /* JADX INFO: renamed from: x1 */
    private final C13682je f1090x1 = new C13682je();

    public BaseThemeManager(InterfaceC14397rj interfaceC14397rj) {
        this.f1089kk = interfaceC14397rj;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1089kk;
    }

    /* JADX INFO: renamed from: kk */
    public abstract C13682je mo348kk();

    /* JADX INFO: renamed from: to */
    public final C13682je m423to() {
        return this.f1090x1;
    }
}
