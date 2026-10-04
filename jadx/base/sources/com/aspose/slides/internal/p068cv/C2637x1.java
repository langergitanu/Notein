package com.aspose.slides.internal.p068cv;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.cv.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2637x1 {

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<Integer, AbstractC2635kk> f8448k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static C2636to f8449x1 = new C2636to();

    static {
        f8448k4.addItem(15, new C2634k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2635kk m12040k4(int i) {
        return f8448k4.containsKey(Integer.valueOf(i)) ? f8448k4.get_Item(Integer.valueOf(i)) : f8449x1;
    }
}
