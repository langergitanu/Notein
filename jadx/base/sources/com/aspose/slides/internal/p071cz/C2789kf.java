package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.kf */
/* JADX INFO: loaded from: classes3.dex */
public final class C2789kf implements IGenericCloneable<C2789kf> {

    /* JADX INFO: renamed from: k4 */
    private C2728fh f8670k4;

    /* JADX INFO: renamed from: x1 */
    private final C2728fh[] f8671x1;

    public C2789kf() {
        this.f8671x1 = new C2728fh[9];
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2789kf cloneT() {
        return new C2789kf(this);
    }

    private C2789kf(C2789kf c2789kf) {
        this.f8671x1 = new C2728fh[9];
        this.f8670k4 = c2789kf.f8670k4.cloneT();
        int i = 0;
        while (true) {
            C2728fh[] c2728fhArr = this.f8671x1;
            if (i >= c2728fhArr.length) {
                return;
            }
            C2728fh c2728fh = c2789kf.f8671x1[i];
            if (c2728fh != null) {
                c2728fhArr[i] = c2728fh.cloneT();
            }
            i++;
        }
    }
}
