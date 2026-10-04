package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9995uz;
import com.aspose.slides.internal.p543z9.C13466du;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11123du extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13466du c13466du = new C13466du(c4037neArr[0]);
        int iM13382u4 = c3134k4.m13382u4();
        if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C9995uz.class), iM13382u4)) {
            C6005k4.m24264to("Invalid ClipFunction for WmfClipToPathEscape");
            return false;
        }
        c13466du.m62641to(iM13382u4 & 65535);
        c4037neArr[0] = c13466du;
        return true;
    }
}
