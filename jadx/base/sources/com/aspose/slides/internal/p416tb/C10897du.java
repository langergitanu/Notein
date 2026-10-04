package com.aspose.slides.internal.p416tb;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p346pw.C9575x1;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10897du {

    /* JADX INFO: renamed from: k4 */
    private final List<InterfaceC10904kk> f37876k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final IGenericDictionary<String, C10895c5> f37878x1 = C9575x1.m46750k4();

    /* JADX INFO: renamed from: kk */
    private final IGenericDictionary<String, C10895c5> f37877kk = C9575x1.m46750k4();

    /* JADX INFO: renamed from: k4 */
    public final void m52446k4(int i, C10895c5 c10895c5) {
        this.f37877kk.set_Item(C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()), c10895c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52447k4(InterfaceC10904kk interfaceC10904kk) {
        this.f37876k4.addItem(interfaceC10904kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52448k4(C10922yj c10922yj) {
        for (int i = 0; i < this.f37876k4.size(); i++) {
            this.f37876k4.get_Item(i).mo52501k4(c10922yj, this.f37878x1, this.f37877kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52449k4(String str, C10895c5 c10895c5) {
        this.f37878x1.set_Item(str, c10895c5);
    }
}
