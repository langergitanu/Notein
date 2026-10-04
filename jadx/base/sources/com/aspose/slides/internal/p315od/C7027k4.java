package com.aspose.slides.internal.p315od;

import com.aspose.slides.internal.p140fz.C4149kk;
import com.aspose.slides.internal.p140fz.InterfaceC4146h4;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.od.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7027k4 extends C7026h4 {

    /* JADX INFO: renamed from: k4 */
    public List<C7026h4> f19099k4;

    public C7027k4(C4149kk c4149kk, C12025x6 c12025x6, C12025x6 c12025x62) {
        super(c4149kk, c12025x6, c12025x62);
        List<InterfaceC4146h4> listMo16594x1 = c4149kk.mo16594x1();
        this.f19099k4 = new ArrayList(listMo16594x1.size());
        Iterator<InterfaceC4146h4> it = listMo16594x1.iterator();
        while (it.hasNext()) {
            this.f19099k4.add(new C7026h4(it.next(), c12025x6, c12025x62));
        }
    }

    @Override // com.aspose.slides.internal.p315od.C7026h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo27479k4() {
        return true;
    }

    @Override // com.aspose.slides.internal.p315od.C7026h4
    /* JADX INFO: renamed from: x1 */
    public List<C7026h4> mo27480x1() {
        return this.f19099k4;
    }
}
