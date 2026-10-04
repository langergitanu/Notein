package com.aspose.slides.internal.p180ib;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11896dy;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ib.du */
/* JADX INFO: loaded from: classes.dex */
public class C4803du {
    /* JADX INFO: renamed from: k4 */
    public static void m19873k4(InterfaceC1565x1 interfaceC1565x1, InterfaceC4809to interfaceC4809to) {
        if (interfaceC1565x1 == null) {
            return;
        }
        m19875k4(interfaceC1565x1.mo8359kk(null), interfaceC4809to);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m19878x1(C2631kk c2631kk, InterfaceC4809to interfaceC4809to) {
        m19877k4(c2631kk.m12023to(), interfaceC4809to);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m19874k4(C2631kk c2631kk, InterfaceC4809to interfaceC4809to) {
        m19877k4(c2631kk.m12022kk(), interfaceC4809to);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m19875k4(InterfaceC4413v4 interfaceC4413v4, InterfaceC4809to interfaceC4809to) {
        InterfaceC4809to interfaceC4809to2;
        float[] fArr = new float[6];
        while (!interfaceC4413v4.mo17821x1()) {
            int iMo17818k4 = interfaceC4413v4.mo17818k4(fArr);
            if (iMo17818k4 == 0) {
                interfaceC4809to2 = interfaceC4809to;
                interfaceC4809to2.mo9585k4(fArr[0], fArr[1]);
            } else if (iMo17818k4 == 1) {
                interfaceC4809to2 = interfaceC4809to;
                interfaceC4809to2.mo9603x1(fArr[0], fArr[1]);
            } else if (iMo17818k4 == 2) {
                interfaceC4809to2 = interfaceC4809to;
                interfaceC4809to2.mo9586k4(fArr[0], fArr[1], fArr[2], fArr[3]);
            } else if (iMo17818k4 != 3) {
                if (iMo17818k4 == 4) {
                    interfaceC4809to.mo9584k4();
                }
                interfaceC4809to2 = interfaceC4809to;
            } else {
                interfaceC4809to2 = interfaceC4809to;
                interfaceC4809to2.mo9587k4(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
            }
            interfaceC4413v4.mo17820kk();
            interfaceC4809to = interfaceC4809to2;
        }
        interfaceC4809to.mo9602x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m19876k4(C11896dy c11896dy, InterfaceC4809to interfaceC4809to) {
        m19873k4(c11896dy.m55568ne(), interfaceC4809to);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19877k4(Iterator<C2633x1> it, InterfaceC4809to interfaceC4809to) {
        while (it.hasNext()) {
            it.next().m12033k4(interfaceC4809to);
        }
        interfaceC4809to.mo9602x1();
    }
}
