package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.o2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2224o2 {

    /* JADX INFO: renamed from: k4 */
    public int f7682k4 = 0;

    /* JADX INFO: renamed from: x1 */
    public List<C2152k1> f7683x1;

    public C2224o2(int i) {
        this.f7683x1 = new List<>(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11184k4(int i, int i2) {
        if (i - i2 > 1) {
            this.f7683x1.get_Item(this.f7682k4).f7438k4 = i;
            this.f7683x1.get_Item(this.f7682k4).f7439x1 = i2;
            this.f7682k4++;
        }
    }
}
