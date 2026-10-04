package com.aspose.slides.internal.p420th;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.fa */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10957fa extends AbstractC10973uz {

    /* JADX INFO: renamed from: k4 */
    private final List<AbstractC10973uz> f38177k4 = new List<>();

    /* JADX INFO: renamed from: c5 */
    public final int m52927c5() {
        return this.f38177k4.size();
    }

    /* JADX INFO: renamed from: dy */
    public final void m52928dy() {
        this.f38177k4.clear();
    }

    /* JADX INFO: renamed from: jd */
    public final List<AbstractC10973uz> m52929jd() {
        return this.f38177k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52930k4(AbstractC10973uz abstractC10973uz) {
        abstractC10973uz.m53114kk(this);
        this.f38177k4.addItem(abstractC10973uz);
        return this.f38177k4.size() - 1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52932x1(AbstractC10973uz abstractC10973uz) {
        int iIndexOf = this.f38177k4.indexOf(abstractC10973uz);
        if (iIndexOf != -1) {
            abstractC10973uz.m53114kk((AbstractC10973uz) null);
            this.f38177k4.removeAt(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10973uz m52931k4(int i) {
        if (this.f38177k4.size() > i) {
            return this.f38177k4.get_Item(i);
        }
        return null;
    }
}
