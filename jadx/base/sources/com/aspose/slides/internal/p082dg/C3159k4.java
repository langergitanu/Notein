package com.aspose.slides.internal.p082dg;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.internal.p416tb.C10895c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.dg.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3159k4 extends AbstractC3162x1 {

    /* JADX INFO: renamed from: x1 */
    private final int f9389x1;

    public C3159k4(int i) {
        this.f9389x1 = i;
    }

    @Override // com.aspose.slides.internal.p082dg.AbstractC3162x1
    /* JADX INFO: renamed from: k4 */
    public void mo13513k4(IGenericDictionary<String, C10895c5> iGenericDictionary) {
        String strM66586k4 = C14057f9.m66586k4(this.f9389x1, (InterfaceC14073kp) C11697x1.m55250kk());
        if (iGenericDictionary.containsKey(strM66586k4)) {
            this.f9392k4 = iGenericDictionary.get_Item(strM66586k4);
        }
    }
}
