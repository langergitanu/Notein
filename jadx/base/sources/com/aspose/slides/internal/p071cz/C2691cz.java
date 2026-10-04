package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p314oc.C7017h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.cz */
/* JADX INFO: loaded from: classes3.dex */
public final class C2691cz implements IGenericCloneable<C2691cz> {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f8545to = new C7017h4("lg", "med", "sm", "arrow", "diamond", "none", "oval", "stealth", "triangle");

    /* JADX INFO: renamed from: k4 */
    private int f8546k4;

    /* JADX INFO: renamed from: kk */
    private int f8547kk;

    /* JADX INFO: renamed from: x1 */
    private int f8548x1;

    public C2691cz() {
        this.f8548x1 = -1;
        this.f8546k4 = -1;
        this.f8547kk = -1;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2691cz cloneT() {
        return new C2691cz(this.f8548x1, this.f8546k4, this.f8547kk);
    }

    /* JADX INFO: renamed from: kk */
    public void m12183kk(int i) {
        this.f8547kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m12184x1(int i) {
        this.f8546k4 = i;
    }

    public C2691cz(int i, int i2, int i3) {
        this.f8548x1 = i;
        this.f8546k4 = i2;
        this.f8547kk = i3;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12182k4(int i) {
        this.f8548x1 = i;
    }
}
