package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p197j1.C5166qq;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.um */
/* JADX INFO: loaded from: classes4.dex */
public class C10880um extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5166qq c5166qq = new C5166qq(c1742neArr[0]);
        if ((c5166qq.m9365x1() & 65535) != 4) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfGetPsFeatureSettingEscape record. MUST be 0x0004");
        }
        c5166qq.m22061to(c3134k4.m13386x6());
        c1742neArr[0] = c5166qq;
        return true;
    }
}
