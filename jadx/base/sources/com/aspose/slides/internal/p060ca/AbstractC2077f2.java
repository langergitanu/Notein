package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.f2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2077f2 {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, int[]> f7190k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<Integer, List<String>> f7191x1 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public final void m10508k4(String str, int... iArr) {
        this.f7190k4.set_Item(str, iArr);
        for (int i : iArr) {
            if (!this.f7191x1.containsKey(Integer.valueOf(i))) {
                this.f7191x1.addItem(Integer.valueOf(i), new List<>());
            }
            this.f7191x1.get_Item(Integer.valueOf(i)).addItem(str);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public int m10510x1(String str) {
        if (this.f7190k4.containsKey(str)) {
            return this.f7190k4.get_Item(str)[0];
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public String[] m10509k4(int i) {
        return this.f7191x1.containsKey(Integer.valueOf(i)) ? this.f7191x1.get_Item(Integer.valueOf(i)).toArray(new String[0]) : new String[]{".notdef"};
    }
}
