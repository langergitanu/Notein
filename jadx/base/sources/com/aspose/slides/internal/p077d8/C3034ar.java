package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C3034ar {

    /* JADX INFO: renamed from: k4 */
    private final List<C3079qq> f8897k4;

    /* JADX INFO: renamed from: kk */
    private final Dictionary<String, Object> f8898kk;

    /* JADX INFO: renamed from: x1 */
    private final List<String> f8899x1;

    public C3034ar(List<C3079qq> list) {
        this.f8897k4 = list;
        this.f8898kk = new Dictionary<>(list.size());
        this.f8899x1 = new List<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            C3079qq c3079qq = list.get_Item(i);
            this.f8899x1.addItem(c3079qq.m13026x1());
            this.f8898kk.addItem(c3079qq.m13026x1(), null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m12771k4() {
        return this.f8897k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C3079qq m12772k4(int i) {
        return this.f8897k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m12773k4(String str) {
        if (str == null) {
            return false;
        }
        return this.f8898kk.containsKey(str);
    }
}
