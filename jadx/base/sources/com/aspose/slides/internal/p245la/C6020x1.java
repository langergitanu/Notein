package com.aspose.slides.internal.p245la;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p208jl.C5499du;
import com.aspose.slides.internal.p208jl.C5500h4;
import com.aspose.slides.internal.p208jl.C5501k4;
import com.aspose.slides.internal.p208jl.C5502kk;
import com.aspose.slides.internal.p208jl.C5503to;
import com.aspose.slides.internal.p550zi.C13618wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.la.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C6020x1 {

    /* JADX INFO: renamed from: k4 */
    private static final List<InterfaceC6014dy> f17061k4;

    static {
        List<InterfaceC6014dy> list = new List<>();
        f17061k4 = list;
        list.addItem(new C5503to());
        list.addItem(new C5501k4());
        list.addItem(new C5502kk());
        list.addItem(new C5499du());
        list.addItem(new C5500h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC6014dy m24327k4(AbstractC3150x6 abstractC3150x6) {
        InterfaceC6014dy interfaceC6014dy;
        C13618wy c13618wy = new C13618wy(abstractC3150x6);
        try {
            int size = f17061k4.size() - 1;
            while (true) {
                if (size < 0) {
                    interfaceC6014dy = null;
                    break;
                }
                interfaceC6014dy = f17061k4.get_Item(size);
                c13618wy.m62851jd();
                if (interfaceC6014dy.mo22587k4(c13618wy)) {
                    break;
                }
                size--;
            }
            c13618wy.m62851jd();
            c13618wy.dispose();
            return interfaceC6014dy;
        } catch (Throwable th) {
            c13618wy.dispose();
            throw th;
        }
    }
}
