package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p498xe.C12501ar;
import com.aspose.slides.internal.p498xe.C12515qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C7117uz extends AbstractC7101ck {
    /* JADX INFO: renamed from: k4 */
    public C3023to m27641k4(C3134k4 c3134k4) {
        C12515qq c12515qq = new C12515qq();
        c12515qq.m58203k4(c3134k4.m13382u4());
        c12515qq.m58210x1(c3134k4.m13382u4());
        c12515qq.m58206kk(c3134k4.m13382u4());
        c12515qq.m58204k4(new C12501ar[(c12515qq.m58202k4() & 65535) / 2]);
        for (int i = 0; i < (c12515qq.m58202k4() & 65535) / 2; i++) {
            c12515qq.m58208to()[i] = (C12501ar) new C7115u4().m27639k4(c3134k4);
        }
        c12515qq.m58207to(c3134k4.m13382u4());
        if ((c12515qq.m58202k4() & 65535) != (c12515qq.m58201h4() & 65535)) {
            C6005k4.m24263kk("Warning: WmfScan.Count != WmfScan.Count2");
        }
        return c12515qq;
    }
}
