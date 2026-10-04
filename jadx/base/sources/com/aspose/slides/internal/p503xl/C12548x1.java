package com.aspose.slides.internal.p503xl;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.xl.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12548x1 {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Integer, AbstractC12546kk> f42026k4;

    /* JADX INFO: renamed from: x1 */
    private static final C12547to f42027x1;

    static {
        Dictionary<Integer, AbstractC12546kk> dictionary = new Dictionary<>();
        f42026k4 = dictionary;
        f42027x1 = new C12547to();
        dictionary.addItem(15, new C12545k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12546kk m58483k4(int i) {
        C12547to c12547to = f42027x1;
        Dictionary<Integer, AbstractC12546kk> dictionary = f42026k4;
        return dictionary.containsKey(Integer.valueOf(i)) ? dictionary.get_Item(Integer.valueOf(i)) : c12547to;
    }
}
