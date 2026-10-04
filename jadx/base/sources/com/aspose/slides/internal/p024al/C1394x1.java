package com.aspose.slides.internal.p024al;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p066cl.InterfaceC2622h4;
import com.aspose.slides.internal.p245la.C6015h4;
import com.aspose.slides.internal.p470w5.C11887kk;
import com.aspose.slides.internal.p490x2.C12372k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.al.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1394x1 implements InterfaceC2622h4<Bitmap> {

    /* JADX INFO: renamed from: k4 */
    private final C6015h4 f6042k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C11887kk> f6043x1;

    public C1394x1(C6015h4 c6015h4, List<C11887kk> list) {
        this.f6042k4 = c6015h4;
        this.f6043x1 = list;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.Bitmap, com.alipay.share.sdk.plugin.APVersionCheck] */
    @Override // com.aspose.slides.internal.p066cl.InterfaceC2622h4
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public Bitmap mo8291k4(int i) {
        C11887kk c11887kk = this.f6043x1.get_Item(i);
        int[] iArrM62814to = c11887kk.m62814to(c11887kk.m62756dy());
        ?? M57962x1 = C12372k4.m57962x1(this.f6042k4.mo10012up(), this.f6042k4.mo10009jd(), 2498570);
        int iM55494um = c11887kk.m55494um();
        int iMo10009jd = c11887kk.mo10009jd() + iM55494um;
        int iM55491ar = c11887kk.m55491ar();
        int iMo10012up = c11887kk.mo10012up() + iM55491ar;
        for (int i2 = iM55494um; i2 < iMo10009jd; i2++) {
            for (int i3 = iM55491ar; i3 < iMo10012up; i3++) {
                int i4 = iArrM62814to[(c11887kk.mo10012up() * (i2 - iM55494um)) + (i3 - iM55491ar)];
                M57962x1.getZFBAppVersionCode();
            }
        }
        return M57962x1;
    }
}
