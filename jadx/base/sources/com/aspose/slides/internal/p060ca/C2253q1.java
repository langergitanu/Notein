package com.aspose.slides.internal.p060ca;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.q1 */
/* JADX INFO: loaded from: classes3.dex */
class C2253q1 {

    /* JADX INFO: renamed from: du */
    public int f7751du;

    /* JADX INFO: renamed from: h4 */
    public int f7752h4;

    /* JADX INFO: renamed from: k4 */
    public int f7753k4;

    /* JADX INFO: renamed from: kk */
    public int f7754kk;

    /* JADX INFO: renamed from: to */
    public int f7755to;

    /* JADX INFO: renamed from: x1 */
    public int f7756x1;

    public C2253q1(int i) {
        this.f7752h4 = 1;
        int i2 = 1 << 3;
        while (true) {
            this.f7755to = i2;
            if (this.f7755to >= i) {
                int i3 = this.f7752h4 * 8;
                this.f7753k4 = i3 + 256;
                this.f7756x1 = i3 + 257;
                this.f7754kk = i3 + StyleIdentifier.COLORFUL_LIST_ACCENT_6;
                this.f7751du = i3 + StyleIdentifier.COLORFUL_GRID_ACCENT_6;
                return;
            }
            int i4 = this.f7752h4 + 1;
            this.f7752h4 = i4;
            i2 = 1 << (i4 * 3);
        }
    }
}
