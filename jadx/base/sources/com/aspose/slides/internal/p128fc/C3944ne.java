package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7181du;
import com.aspose.slides.internal.p329p4.C7185jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.ne */
/* JADX INFO: loaded from: classes.dex */
public class C3944ne implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, InterfaceC3941ks> f10693k4;

    public C3944ne(Dictionary<String, InterfaceC3941ks> dictionary) {
        this.f10693k4 = dictionary;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 2) {
            return;
        }
        C7179c5 c7179c5 = (C7179c5) list.get_Item(1);
        List<C7185jd> list2 = new List<>();
        list2.addItem(new C7181du(c7179c5.m27753to() * (-1.0f)));
        if (this.f10693k4.containsKey("TL")) {
            this.f10693k4.get_Item("TL").mo15630k4(new C3958u4("TL"), list2);
        }
        if (this.f10693k4.containsKey("Td")) {
            this.f10693k4.get_Item("Td").mo15630k4(new C3958u4("Td"), list);
        }
    }
}
