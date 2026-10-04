package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.br */
/* JADX INFO: loaded from: classes3.dex */
class C0828br {

    /* JADX INFO: renamed from: k4 */
    private List<Object> f4238k4 = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final int m4304k4() {
        return this.f4238k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m4305k4(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("level must be >= 0");
        }
        if (i < this.f4238k4.size() && this.f4238k4.get_Item(i) != null) {
            return this.f4238k4.get_Item(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4306k4(int i, Object obj) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("level must be >= 0");
        }
        for (int size = this.f4238k4.size(); size <= i; size++) {
            this.f4238k4.addItem(null);
        }
        if (obj != null) {
            this.f4238k4.set_Item(i, obj);
        }
    }
}
