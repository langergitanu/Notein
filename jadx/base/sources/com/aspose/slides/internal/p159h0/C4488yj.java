package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.List;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.yj */
/* JADX INFO: loaded from: classes.dex */
public final class C4488yj {

    /* JADX INFO: renamed from: k4 */
    private List<C4474up> f12342k4;

    public C4488yj() {
        this.f12342k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m18482k4() {
        return this.f12342k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public final int m18489kk(C4474up c4474up) {
        return this.f12342k4.binarySearch(c4474up);
    }

    /* JADX INFO: renamed from: to */
    public final void m18491to(C4474up c4474up) {
        int iM18489kk = m18489kk(c4474up);
        m18494x1(iM18489kk < 0 ? ~iM18489kk : iM18489kk + 1, c4474up);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m18492x1() {
        return this.f12342k4.getCapacity();
    }

    public C4488yj(int i) {
        this.f12342k4 = new List<>(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18483k4(int i) {
        this.f12342k4.setCapacity(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m18490kk() {
        this.f12342k4.clear();
    }

    /* JADX INFO: renamed from: x1 */
    public final C4474up m18493x1(int i) {
        return this.f12342k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18484k4(int i, C4474up c4474up) {
        this.f12342k4.set_Item(i, c4474up);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18494x1(int i, C4474up c4474up) {
        this.f12342k4.insertItem(i, c4474up);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18485k4(C4474up c4474up) {
        this.f12342k4.addItem(c4474up);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18495x1(C4474up c4474up) {
        this.f12342k4.removeItem(c4474up);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18486k4(C4488yj c4488yj) {
        for (int i = 0; i < c4488yj.m18482k4(); i++) {
            this.f12342k4.addItem(c4488yj.m18493x1(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18487k4(Comparator<C4474up> comparator) {
        this.f12342k4.sort(comparator);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18488k4(C4474up[] c4474upArr) {
        for (C4474up c4474up : c4474upArr) {
            this.f12342k4.addItem(c4474up);
        }
    }
}
