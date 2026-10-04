package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.jv */
/* JADX INFO: loaded from: classes3.dex */
public class C2782jv implements IGenericCloneable<C2782jv> {

    /* JADX INFO: renamed from: k4 */
    private final int f8664k4;

    public C2782jv(int i) {
        if (i < 0 || 8 < i) {
            throw new ArgumentOutOfRangeException("value", "Value should be between 0 and 8.");
        }
        this.f8664k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public int m12384k4() {
        return this.f8664k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C2782jv cloneT() {
        return new C2782jv(this.f8664k4);
    }
}
