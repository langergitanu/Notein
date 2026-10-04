package com.aspose.slides.internal.p497xc;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p151gj.C4321k4;
import com.aspose.slides.internal.p151gj.C4325rv;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.xc.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12498kk implements InterfaceC12500x1 {

    /* JADX INFO: renamed from: k4 */
    private C4325rv[] f41823k4;

    public C12498kk(int i) {
        this.f41823k4 = (C4325rv[]) C22200OooO0o0.OooO00o(C4325rv.class, i);
    }

    @Override // com.aspose.slides.internal.p497xc.InterfaceC12500x1
    /* JADX INFO: renamed from: k4 */
    public final IGenericList<C4325rv> mo58049k4(IGenericList<C4321k4> iGenericList, byte[] bArr) {
        int size = iGenericList.size();
        if (this.f41823k4.length < size) {
            this.f41823k4 = (C4325rv[]) C22200OooO0o0.OooO00o(C4325rv.class, size);
        }
        C4325rv[] c4325rvArr = this.f41823k4;
        for (int i = 0; i < size; i++) {
            iGenericList.get_Item(i).m17381k4().CloneTo(c4325rvArr[i]);
        }
        C12499to c12499to = new C12499to(size);
        C4325rv[] c4325rvArrM58063x1 = c12499to.m58063x1(AbstractC14092to.m67204k4((Object[]) c4325rvArr));
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = (byte) c12499to.m58057k4(c4325rvArr[i2].Clone());
        }
        return AbstractC14092to.m67204k4((Object[]) c4325rvArrM58063x1);
    }
}
