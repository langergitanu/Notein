package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p018aa.C1324ks;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p543z9.C13462c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C11119c5 extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13462c5 c13462c5 = new C13462c5(c4037neArr[0]);
        if ((c13462c5.m16027x1() & 65535) != 20) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfDownloadHeaderEscape record. MUST be 0x0014.");
        }
        c13462c5.m62608k4((C12343ne) new C1324ks().m7809k4(c3134k4));
        c13462c5.m62613x1((C12343ne) new C1324ks().m7809k4(c3134k4));
        c13462c5.m62612to(c3134k4.m13382u4());
        c13462c5.m62606du(c3134k4.m13382u4());
        c4037neArr[0] = c13462c5;
        return true;
    }
}
