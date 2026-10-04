package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class gwj {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, ysr> f5355k4;

    /* JADX INFO: renamed from: kk */
    private final t5f f5356kk;

    /* JADX INFO: renamed from: x1 */
    private final mcc f5357x1 = new mcc();

    public gwj(t5f t5fVar, int i) {
        this.f5356kk = t5fVar;
        this.f5355k4 = new Dictionary<>(i);
        for (int i2 = 1; i2 <= i; i2++) {
            this.f5355k4.addItem(Integer.valueOf(i2), new ysr());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final PresentationText m6928k4(int i) {
        int size = this.f5356kk.m70966x1() ? 2 : this.f5355k4.size();
        ISlideText[] iSlideTextArr = new ISlideText[size];
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (!this.f5355k4.containsKey(Integer.valueOf(i3))) {
                this.f5355k4.set_Item(Integer.valueOf(i3), new ysr());
            }
            iSlideTextArr[i2] = this.f5355k4.get_Item(Integer.valueOf(i3)).m74075k4(i2, m6929k4(), i);
            i2 = i3;
        }
        return new PresentationText(iSlideTextArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final mcc m6929k4() {
        return this.f5357x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6930k4(int i, byte b, vbz vbzVar) {
        this.f5355k4.get_Item(Integer.valueOf(i)).m74076k4(b, vbzVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6931k4(int i, List<jrz> list) {
        this.f5355k4.get_Item(Integer.valueOf(i)).m74077k4(list);
    }
}
