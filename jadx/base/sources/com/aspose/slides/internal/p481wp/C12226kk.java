package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.BitArray;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12226kk {

    /* JADX INFO: renamed from: k4 */
    private int f40664k4 = 1;

    /* JADX INFO: renamed from: x1 */
    private BitArray f40665x1 = new BitArray(1000);

    /* JADX INFO: renamed from: k4 */
    public final int m57057k4() {
        return this.f40664k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57058k4(int i, int i2) {
        for (int i3 = i - 1; i3 < i2; i3++) {
            this.f40665x1.set(i3, true);
        }
        this.f40664k4 = i2 + 1;
        while (this.f40665x1.get(this.f40664k4 - 1)) {
            this.f40664k4++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57059k4(List<C12221fa> list) {
        this.f40665x1.setAll(false);
        for (int i = 0; i < list.size(); i++) {
            C12221fa c12221fa = list.get_Item(i);
            if (c12221fa != null) {
                if (c12221fa.m57052k4() == 0) {
                    list.set_Item(i, null);
                } else {
                    this.f40665x1.set(i, true);
                }
            }
        }
        this.f40664k4 = 1;
        while (this.f40665x1.get(this.f40664k4 - 1)) {
            this.f40664k4++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57060k4(int i) {
        return this.f40665x1.get(i - 1);
    }
}
