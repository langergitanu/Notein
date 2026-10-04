package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.oj */
/* JADX INFO: loaded from: classes3.dex */
class C14239oj {

    /* JADX INFO: renamed from: kk */
    private boolean f47832kk = false;

    /* JADX INFO: renamed from: k4 */
    private final List<C12025x6> f47831k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final List<Integer> f47833x1 = new List<>();

    /* JADX INFO: renamed from: k4 */
    public void m68611k4(C12025x6 c12025x6, int i) {
        this.f47831k4.addItem(c12025x6.Clone());
        this.f47833x1.addItem(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: kk */
    public C12025x6[] m68614kk() {
        int size = this.f47831k4.size();
        C12025x6[] c12025x6Arr = new C12025x6[size];
        for (int i = 0; i < size; i++) {
            c12025x6Arr[i] = this.f47831k4.get_Item(i);
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: x1 */
    public int[] m68615x1() {
        int[] iArr = new int[this.f47833x1.size()];
        for (int i = 0; i < this.f47833x1.size(); i++) {
            iArr[i] = this.f47833x1.get_Item(i).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m68612k4(boolean z) {
        this.f47832kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m68613k4() {
        return this.f47832kk;
    }
}
