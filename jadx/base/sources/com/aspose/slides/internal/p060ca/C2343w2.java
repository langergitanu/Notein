package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.w2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2343w2 {

    /* JADX INFO: renamed from: k4 */
    private Hashtable f8135k4 = new Hashtable();

    /* JADX INFO: renamed from: k4 */
    public final int m11582k4(String str) {
        return ((Integer) C7019kk.m27464to(this.f8135k4.get_Item(str), Integer.TYPE)).intValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11584x1(String str, int i) {
        this.f8135k4.addItem(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11583k4(String str, int i) {
        this.f8135k4.set_Item(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m11585x1(String str) {
        return this.f8135k4.containsKey(str);
    }
}
