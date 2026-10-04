package com.aspose.slides.internal.p163h9;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p130fh.C3992du;
import com.aspose.slides.internal.p130fh.C3993k4;
import com.aspose.slides.internal.p130fh.C3994kk;
import com.aspose.slides.internal.p151gj.C4325rv;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p158gz.C4426kk;
import com.aspose.slides.internal.p233kn.C5888k4;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.h9.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4513kk implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private final C4514x1 f12573k4;

    public C4513kk(C4514x1 c4514x1) {
        this.f12573k4 = c4514x1;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f12573k4.m18606k4(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m18602k4(C4512k4 c4512k4) {
        C5888k4 c5888k4Clone = c4512k4.f12570k4.Clone();
        C4329x6 c4329x6Clone = C4329x6.m17422x1((C4329x6) c5888k4Clone.f16594x1, (C4329x6) c5888k4Clone.f16593k4).Clone();
        C3994kk c3994kk = new C3994kk();
        T t = c5888k4Clone.f16593k4;
        c3994kk.f10905k4 = ((C4329x6) t).f11827kk & 65535;
        c3994kk.f10909x1 = ((C4329x6) t).f11828to & 65535;
        c3994kk.f10906kk = c4329x6Clone.f11827kk & 65535;
        c3994kk.f10908to = c4329x6Clone.f11828to & 65535;
        IGenericList<C4325rv> iGenericList = c4512k4.f12571kk;
        if (iGenericList != null && iGenericList.size() > 0) {
            int size = c4512k4.f12571kk.size();
            c3994kk.f10907m9 = size;
            int[] iArr = {size};
            C4514x1.m18604k4(iArr);
            c3994kk.f10907m9 = iArr[0];
        }
        AbstractC3150x6 abstractC3150x6 = this.f12573k4.f12574k4;
        abstractC3150x6.writeByte(PatternStyle.Weave);
        c3994kk.m15778k4(abstractC3150x6);
        int i = c4329x6Clone.f11827kk * c4329x6Clone.f11828to;
        int i2 = c3994kk.f10907m9;
        if (i2 > 0) {
            C3993k4.m15774k4(abstractC3150x6, i2, c4512k4.f12571kk, new C4325rv());
            int size2 = c4512k4.f12571kk.size();
            for (int i3 = 0; i3 < i; i3++) {
                if ((c4512k4.f12572x1[i3] & 255) >= size2) {
                    throw new IndexOutOfRangeException(C14113y2.m67402k4("args.Pixels[{0}] out of range", Integer.valueOf(i3)));
                }
            }
        }
        new C3992du(8).m15772k4(abstractC3150x6, new C4426kk(C12565ks.m58634x1(c4512k4.f12572x1), 0, i));
    }
}
