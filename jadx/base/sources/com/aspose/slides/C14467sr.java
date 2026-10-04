package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.sr */
/* JADX INFO: loaded from: classes3.dex */
class C14467sr {

    /* JADX INFO: renamed from: k4 */
    private List<Integer> f48902k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private List<Portion> f48905x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    private List<Integer> f48903kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<Integer> f48904to = new List<>();

    /* JADX INFO: renamed from: du */
    public final int m70736du() {
        return this.f48903kk.size();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m70737h4() {
        this.f48902k4.clear();
        this.f48905x1.clear();
        this.f48903kk.clear();
        this.f48904to.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<Integer> m70738k4() {
        return this.f48902k4;
    }

    /* JADX INFO: renamed from: kk */
    public final List<Integer> m70741kk() {
        return this.f48903kk;
    }

    /* JADX INFO: renamed from: to */
    public final List<Integer> m70742to() {
        return this.f48904to;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<Portion> m70743x1() {
        return this.f48905x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70739k4(int i, int i2) {
        this.f48903kk.addItem(Integer.valueOf(i));
        this.f48904to.addItem(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70740k4(Portion portion, int i) {
        this.f48905x1.addItem(portion);
        this.f48902k4.addItem(Integer.valueOf(i));
    }
}
