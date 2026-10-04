package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p197j1.C5146c5;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p319ok.C7110ks;
import com.aspose.slides.internal.p498xe.C12514ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10851c5 extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5146c5 c5146c5 = new C5146c5(c1742neArr[0]);
        if ((c5146c5.m9365x1() & 65535) != 20) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfDownloadHeaderEscape record. MUST be 0x0014.");
        }
        c5146c5.m22026k4((C12514ne) new C7110ks().m27634k4(c3134k4));
        c5146c5.m22028x1((C12514ne) new C7110ks().m27634k4(c3134k4));
        c5146c5.m22027to(c3134k4.m13382u4());
        c5146c5.m22025du(c3134k4.m13382u4());
        c1742neArr[0] = c5146c5;
        return true;
    }
}
