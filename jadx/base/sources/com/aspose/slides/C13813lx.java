package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.lx */
/* JADX INFO: loaded from: classes3.dex */
class C13813lx {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, C14198nr[]> f46104k4 = new Dictionary<>();

    public C13813lx(C14406rn[] c14406rnArr) {
        for (C14406rn c14406rn : c14406rnArr) {
            for (String str : c14406rn.m70186k4()) {
                this.f46104k4.set_Item(str, c14406rn.m70187x1());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, C14198nr[]> m64611k4() {
        return this.f46104k4;
    }
}
