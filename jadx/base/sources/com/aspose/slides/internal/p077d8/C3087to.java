package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.to */
/* JADX INFO: loaded from: classes3.dex */
class C3087to {

    /* JADX INFO: renamed from: k4 */
    private final List<C3066kk> f9162k4 = new List<>(8);

    /* JADX INFO: renamed from: k4 */
    public final int m13117k4() {
        return this.f9162k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13120x1() {
        this.f9162k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final C3066kk m13118k4(int i) {
        return this.f9162k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13119k4(String str, String str2, String str3, int i, int i2, C3042ca c3042ca, boolean z) {
        if (z) {
            for (int i3 = 0; i3 < this.f9162k4.size(); i3++) {
                C3066kk c3066kk = this.f9162k4.get_Item(i3);
                if (C14113y2.m67363du(str, c3066kk.f9103k4) && C14113y2.m67363du(str2, c3066kk.f9106x1)) {
                    c3042ca.m12827k4(i, i2 - i);
                    return;
                }
            }
        }
        this.f9162k4.addItem(new C3066kk(str, str2, str3, i, i2));
    }
}
