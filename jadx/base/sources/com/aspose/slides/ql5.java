package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ql5 {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f48359k4;

    public ql5(C14365qy c14365qy) {
        this.f48359k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69695k4() {
        float fM72786k4 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(this.f48359k4.m69833e0().m64114kk() - this.f48359k4.m69833e0().m64100du()), 13), C7019kk.m27462to(Float.valueOf(this.f48359k4.m69833e0().m64100du()), 13), ChartTypeCharacterizer.isChartTypeBar(this.f48359k4.m69834fa().getType()), this.f48359k4.m69863u4());
        List<C13847mr> listM69865up = this.f48359k4.m69865up();
        mox moxVar = new mox(this.f48359k4);
        C0886d8 c0886d8 = ((C13847mr) OooO0O0.OooO00o(listM69865up, 1)).m64944dy().get_Item(0);
        List.Enumerator<ijy> it = moxVar.m64933k4(fM72786k4).iterator();
        while (it.hasNext()) {
            try {
                c0886d8.m4991k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
