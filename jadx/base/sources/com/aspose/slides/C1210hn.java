package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.hn */
/* JADX INFO: loaded from: classes3.dex */
class C1210hn {

    /* JADX INFO: renamed from: du */
    private boolean f5536du;

    /* JADX INFO: renamed from: h4 */
    private String f5537h4;

    /* JADX INFO: renamed from: k4 */
    private C1210hn f5538k4;

    /* JADX INFO: renamed from: kk */
    private boolean f5539kk;

    /* JADX INFO: renamed from: m9 */
    private List<C1210hn> f5540m9;

    /* JADX INFO: renamed from: to */
    private boolean f5541to;

    /* JADX INFO: renamed from: x1 */
    private Object f5542x1;

    public C1210hn(ChartCategoryCollection chartCategoryCollection, C1210hn c1210hn, int i, int i2, int i3) {
        m7230k4(new List<>());
        m7231k4(c1210hn);
        int i4 = i + 1;
        m7232k4((Object) (((ChartCategory) chartCategoryCollection.get_Item(i2)).m526x1().m4305k4(i4) == null ? "" : ((ChartCategory) chartCategoryCollection.get_Item(i2)).m526x1().m4305k4(i4).toString()));
        if (i == -1) {
            return;
        }
        if (i == 0) {
            for (int i5 = i2; i5 < i3; i5++) {
                m7236m9().addItem(new C1210hn(chartCategoryCollection, this, i - 1, i5, i5));
            }
            return;
        }
        Object objM4305k4 = ((ChartCategory) chartCategoryCollection.get_Item(i2)).m526x1().m4305k4(i);
        int i6 = i2;
        for (int i7 = i6; i7 < i3; i7++) {
            Object objM4305k42 = ((ChartCategory) chartCategoryCollection.get_Item(i7)).m526x1().m4305k4(i);
            if (objM4305k4 != null && objM4305k42 != null && !C14113y2.m67363du(objM4305k4.toString(), objM4305k42.toString()) && !"".equals(objM4305k42.toString())) {
                m7236m9().addItem(new C1210hn(chartCategoryCollection, this, i - 1, i6, i7));
                i6 = i7;
                objM4305k4 = objM4305k42;
            }
        }
        if (objM4305k4 == null || "".equals(objM4305k4.toString())) {
            return;
        }
        m7236m9().addItem(new C1210hn(chartCategoryCollection, this, i - 1, i6, i3));
    }

    /* JADX INFO: renamed from: du */
    public final boolean m7227du() {
        return this.f5536du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m7228h4() {
        return this.f5537h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1210hn m7229k4() {
        return this.f5538k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m7235kk() {
        return this.f5539kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<C1210hn> m7236m9() {
        return this.f5540m9;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m7237to() {
        return this.f5541to;
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m7238x1() {
        return this.f5542x1;
    }

    public C1210hn(C1210hn c1210hn, Object obj) {
        m7231k4(c1210hn);
        m7232k4(obj);
        m7230k4(new List<>());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7230k4(List<C1210hn> list) {
        this.f5540m9 = list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7239x1(boolean z) {
        this.f5536du = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7231k4(C1210hn c1210hn) {
        this.f5538k4 = c1210hn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7232k4(Object obj) {
        this.f5542x1 = obj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7233k4(String str) {
        this.f5537h4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7234k4(boolean z) {
        this.f5541to = z;
    }
}
