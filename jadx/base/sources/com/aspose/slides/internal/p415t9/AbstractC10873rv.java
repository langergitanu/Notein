package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.rv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10873rv {
    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4);

    /* JADX INFO: renamed from: x1 */
    public final boolean m52420x1(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        c1742neArr[0].m9366x1(c3134k4.m13382u4());
        if ((c1742neArr[0].m9365x1() & 65535) <= (((c1742neArr[0].m9402up() & 4294967295L) * 2) & 4294967295L)) {
            return mo52417k4(c1742neArr, c3134k4);
        }
        C6005k4.m24263kk("Invalid WmfEscapeRecord. record.ByteCount > 2*record.RecordSize");
        return false;
    }
}
