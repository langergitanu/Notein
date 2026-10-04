package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p513xw.C12717os;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C11645ak {

    /* JADX INFO: renamed from: du */
    private int f39256du;

    /* JADX INFO: renamed from: h4 */
    private int f39257h4;

    /* JADX INFO: renamed from: kk */
    private int f39259kk;

    /* JADX INFO: renamed from: m9 */
    private int f39260m9;

    /* JADX INFO: renamed from: k4 */
    private List<k4> f39258k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private List<k4> f39262x1 = new List<>();

    /* JADX INFO: renamed from: to */
    private int f39261to = -1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.vj.ak$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f39263k4;

        /* JADX INFO: renamed from: kk */
        private List<C12717os> f39264kk;

        /* JADX INFO: renamed from: x1 */
        private double f39265x1;

        public k4(int i, double d) {
            this.f39263k4 = i;
            this.f39265x1 = d;
            this.f39264kk = new List<>(i);
        }

        /* JADX INFO: renamed from: k4 */
        public final int m54794k4() {
            return this.f39263k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final double m54797x1() {
            return this.f39265x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final C12717os m54795k4(int i) {
            return this.f39264kk.get_Item(i);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m54796k4(C12717os c12717os) {
            this.f39264kk.insertItem(0, c12717os);
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m54782du() {
        return m54783k4(this.f39257h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54783k4(int i) {
        return this.f39258k4.get_Item(i).m54794k4();
    }

    /* JADX INFO: renamed from: kk */
    public final int m54788kk() {
        return m54783k4(this.f39261to);
    }

    /* JADX INFO: renamed from: to */
    public final int m54790to() {
        return m54783k4(this.f39256du);
    }

    /* JADX INFO: renamed from: x1 */
    public final double m54792x1(int i) {
        return this.f39258k4.get_Item(i).m54797x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54784k4() {
        int size = 0;
        while (this.f39262x1.size() > 0) {
            k4 k4Var = this.f39262x1.get_Item(0);
            this.f39262x1.removeAt(0);
            if (k4Var.m54794k4() < m54793x1()) {
                this.f39258k4.insertItem(0, k4Var);
                this.f39259kk = 0;
                this.f39261to++;
                this.f39256du++;
                this.f39257h4++;
            } else if (k4Var.m54794k4() > m54790to()) {
                List<k4> list = this.f39258k4;
                list.insertItem(list.size(), k4Var);
                size = this.f39258k4.size() - 1;
                this.f39256du = size;
            } else {
                while (size < this.f39256du && m54783k4(size) < k4Var.m54794k4()) {
                    size++;
                }
                if (m54783k4(size) != k4Var.m54794k4()) {
                    return;
                } else {
                    this.f39258k4.set_Item(size, k4Var);
                }
            }
            if ((this.f39260m9 == 0 && m54792x1(this.f39261to) > k4Var.m54797x1()) || (this.f39260m9 != 0 && k4Var.m54794k4() == this.f39260m9)) {
                this.f39261to = size;
                this.f39257h4 = size;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final C12717os m54789kk(int i) {
        return this.f39258k4.get_Item(this.f39257h4).m54795k4(i);
    }

    /* JADX INFO: renamed from: to */
    public final int m54791to(int i) {
        if (i < m54793x1() - m54782du() || i > m54790to() - m54782du() || m54783k4(this.f39257h4 + i) != m54782du() + i) {
            return 0;
        }
        this.f39257h4 += i;
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m54793x1() {
        return m54783k4(this.f39259kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54785k4(int i, double d) {
        this.f39258k4.addItem(new k4(i, d));
        if (this.f39258k4.size() == 1) {
            this.f39259kk = 0;
            this.f39261to = 0;
            this.f39256du = 0;
            this.f39257h4 = 0;
            return;
        }
        if (d < this.f39258k4.get_Item(this.f39261to).m54797x1()) {
            int size = this.f39258k4.size() - 1;
            this.f39261to = size;
            this.f39257h4 = size;
        }
        if (i < this.f39258k4.get_Item(this.f39259kk).m54794k4()) {
            this.f39259kk = this.f39258k4.size() - 1;
        }
        if (i > this.f39258k4.get_Item(this.f39256du).m54794k4()) {
            this.f39256du = this.f39258k4.size() - 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54786k4(C12717os c12717os, int i) {
        this.f39258k4.get_Item(i).m54796k4(c12717os);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54787k4(boolean z) {
        this.f39260m9 = z ? m54788kk() : 0;
        this.f39262x1 = this.f39258k4;
        this.f39258k4 = new List<>();
    }
}
