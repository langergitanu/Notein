package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p329p4.C7185jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.zj */
/* JADX INFO: loaded from: classes.dex */
public class C3975zj implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, InterfaceC3941ks> f10744k4;

    public C3975zj(Dictionary<String, InterfaceC3941ks> dictionary) {
        this.f10744k4 = dictionary;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (this.f10744k4.containsKey("T*")) {
            this.f10744k4.get_Item("T*").mo15630k4(new C3958u4("T*"), null);
        }
        if (this.f10744k4.containsKey("Tj")) {
            this.f10744k4.get_Item("Tj").mo15630k4(new C3958u4("Tj"), list);
        }
    }
}
