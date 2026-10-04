package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p060ca.AbstractC2313tw;
import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.InterfaceC2001am;
import com.aspose.slides.internal.p060ca.InterfaceC2251pt;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.tf */
/* JADX INFO: loaded from: classes3.dex */
class C2908tf {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, C2033cj> f8747k4;

    public C2908tf(InterfaceC2001am interfaceC2001am) {
        if (interfaceC2001am == null) {
            throw new ArgumentNullException("source");
        }
        this.f8747k4 = new Dictionary<>();
        for (C2033cj c2033cj : interfaceC2001am.mo10154k4()) {
            if (!this.f8747k4.containsKey(c2033cj.mo10137k4())) {
                this.f8747k4.addItem(c2033cj.mo10137k4(), c2033cj);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC2251pt m12533k4(String str) {
        if (this.f8747k4.containsKey(str)) {
            return AbstractC2313tw.m11469k4(this.f8747k4.get_Item(str));
        }
        return null;
    }
}
