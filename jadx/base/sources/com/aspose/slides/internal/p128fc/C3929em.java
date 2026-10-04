package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p329p4.C7185jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.em */
/* JADX INFO: loaded from: classes.dex */
public class C3929em implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, InterfaceC3941ks> f10672k4;

    public C3929em(Dictionary<String, InterfaceC3941ks> dictionary) {
        this.f10672k4 = dictionary;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list.size() < 3) {
            return;
        }
        List<C7185jd> range = list.getRange(0, 1);
        if (this.f10672k4.containsKey("Tw")) {
            this.f10672k4.get_Item("Tw").mo15630k4(new C3958u4("Tw"), range);
        }
        List<C7185jd> range2 = list.getRange(1, 1);
        if (this.f10672k4.containsKey("Tc")) {
            this.f10672k4.get_Item("Tc").mo15630k4(new C3958u4("Tc"), range2);
        }
        List<C7185jd> range3 = list.getRange(2, 1);
        if (this.f10672k4.containsKey("'")) {
            this.f10672k4.get_Item("'").mo15630k4(new C3958u4("'"), range3);
        }
    }
}
