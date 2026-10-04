package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.rv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11141rv {
    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4);

    /* JADX INFO: renamed from: x1 */
    public final boolean m53666x1(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        c4037neArr[0].m16028x1(c3134k4.m13382u4());
        if ((c4037neArr[0].m16027x1() & 65535) <= (((c4037neArr[0].m16068yj() & 4294967295L) * 2) & 4294967295L)) {
            return mo53663k4(c4037neArr, c3134k4);
        }
        C6005k4.m24263kk("Invalid WmfEscapeRecord. record.ByteCount > 2*record.RecordSize");
        return false;
    }
}
