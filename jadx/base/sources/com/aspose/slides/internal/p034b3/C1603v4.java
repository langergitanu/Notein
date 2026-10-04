package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p513xw.C12737w6;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.v4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1603v4 extends C1594m9 {

    /* JADX INFO: renamed from: k4 */
    private List<C12737w6> f6202k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private String f6203kk;

    /* JADX INFO: renamed from: to */
    private String f6204to;

    /* JADX INFO: renamed from: x1 */
    private C1602uz f6205x1;

    public C1603v4(C1602uz c1602uz) {
        m8644k4(c1602uz);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m8642k4() {
        return this.f6202k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8647x1(String str) {
        if ("none".equals(str)) {
            this.f6204to = null;
        } else {
            this.f6204to = str;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12737w6 m8643k4(int i) {
        return this.f6202k4.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m8648x1(C12737w6 c12737w6) {
        return c12737w6 == m8643k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8644k4(C1602uz c1602uz) {
        this.f6205x1 = c1602uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8645k4(C12737w6 c12737w6) {
        this.f6202k4.addItem(c12737w6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8646k4(String str) {
        if ("none".equals(str)) {
            this.f6203kk = null;
        } else {
            this.f6203kk = str;
        }
    }
}
