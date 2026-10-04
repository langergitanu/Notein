package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.Xml.C14010x0;

/* JADX INFO: loaded from: classes3.dex */
class dx5 extends C14010x0 {

    /* JADX INFO: renamed from: k4 */
    private SortedList<String, byte[]> f4684k4;

    public dx5(SortedList<String, byte[]> sortedList) {
        this.f4684k4 = new SortedList<>();
        this.f4684k4 = new SortedList<>(sortedList);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14010x0, com.aspose.slides.p559ms.System.Xml.AbstractC13943n5
    /* JADX INFO: renamed from: k4 */
    public Object mo5312k4(C14062gk c14062gk, String str, AbstractC14068j5 abstractC14068j5) {
        if (c14062gk != null && this.f4684k4.containsKey(c14062gk.m66697x1())) {
            try {
                return new C3152yj((byte[]) C7019kk.m27458kk(this.f4684k4.get_Item(c14062gk.m66697x1()), byte[].class), false);
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
        return null;
    }
}
