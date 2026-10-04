package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.nm */
/* JADX INFO: loaded from: classes3.dex */
public class C2218nm extends Dictionary<Integer, Dictionary<Integer, C2233op>> {
    /* JADX INFO: renamed from: k4 */
    public final void m11179k4(int i, C2233op c2233op) {
        if (!super.containsKey(Integer.valueOf(i))) {
            super.set_Item(Integer.valueOf(i), new Dictionary());
        }
        Dictionary dictionary = (Dictionary) super.get_Item(Integer.valueOf(i));
        if (dictionary.containsKey(Integer.valueOf(c2233op.f7697k4))) {
            return;
        }
        dictionary.addItem(Integer.valueOf(c2233op.f7697k4), c2233op);
    }
}
