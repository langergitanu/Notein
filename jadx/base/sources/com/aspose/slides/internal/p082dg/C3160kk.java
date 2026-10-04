package com.aspose.slides.internal.p082dg;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.internal.p416tb.C10895c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.dg.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3160kk extends AbstractC3162x1 {

    /* JADX INFO: renamed from: x1 */
    private final String f9390x1;

    public C3160kk(String str) {
        this.f9390x1 = str;
    }

    @Override // com.aspose.slides.internal.p082dg.AbstractC3162x1
    /* JADX INFO: renamed from: k4 */
    public void mo13513k4(IGenericDictionary<String, C10895c5> iGenericDictionary) {
        String strM67407k4;
        if (iGenericDictionary.containsKey(this.f9390x1)) {
            strM67407k4 = this.f9390x1;
        } else if (!iGenericDictionary.containsKey(C14113y2.m67407k4('#', this.f9390x1))) {
            return;
        } else {
            strM67407k4 = C14113y2.m67407k4('#', this.f9390x1);
        }
        this.f9392k4 = iGenericDictionary.get_Item(strM67407k4);
    }
}
