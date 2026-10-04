package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2975y4 implements IGenericCloneable<C2975y4> {

    /* JADX INFO: renamed from: k4 */
    private int f8812k4;

    /* JADX INFO: renamed from: x1 */
    private int f8813x1;

    public C2975y4(int i, int i2) {
        m12622k4(i);
        m12623x1(i2);
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2975y4 cloneT() {
        return new C2975y4(this.f8812k4, this.f8813x1);
    }

    /* JADX INFO: renamed from: x1 */
    public void m12623x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8813x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12622k4(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8812k4 = i;
    }
}
