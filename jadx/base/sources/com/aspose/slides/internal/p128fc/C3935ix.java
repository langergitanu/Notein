package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p329p4.C7181du;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.ix */
/* JADX INFO: loaded from: classes.dex */
public class C3935ix implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, InterfaceC3941ks> f10678k4;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC9477x1 f10679x1;

    public C3935ix(Dictionary<String, InterfaceC3941ks> dictionary, InterfaceC9477x1 interfaceC9477x1) {
        this.f10678k4 = dictionary;
        this.f10679x1 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        List<C7185jd> list2 = new List<>();
        list2.addItem(new C7181du(0.0f));
        list2.addItem(new C7181du(this.f10679x1.mo46638k4().m46554c5().Clone().m46631m9() * (-1.0f)));
        if (this.f10678k4.containsKey("Td")) {
            this.f10678k4.get_Item("Td").mo15630k4(new C3958u4("Td"), list2);
        }
    }
}
