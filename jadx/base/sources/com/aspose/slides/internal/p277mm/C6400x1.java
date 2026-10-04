package com.aspose.slides.internal.p277mm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p244l7.C6012x1;
import com.aspose.slides.internal.p274mh.C6386to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p347px.AbstractC9608yj;
import com.aspose.slides.internal.p347px.C9577ar;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9580c5;
import com.aspose.slides.internal.p347px.C9581ck;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12022v4;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mm.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6400x1 {

    /* JADX INFO: renamed from: k4 */
    private static C6386to f18188k4 = new C6386to();

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<String, C6386to> f18190x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static List<String> f18189kk = new List<>();

    /* JADX INFO: renamed from: k4 */
    public static C9579bv m26260k4(C6012x1.k4 k4Var) {
        return C6399kk.m26256k4(k4Var);
    }

    /* JADX INFO: renamed from: kk */
    public static int m26265kk(C6012x1.k4 k4Var) {
        int i = (k4Var.f17013h4 & 255) != 0 ? 2 : 0;
        if ((k4Var.f17011dy & 255) != 0) {
            i |= 8;
        }
        if ((k4Var.f17017m9 & 255) != 0) {
            i |= 4;
        }
        return k4Var.f17010du >= 600 ? i | 1 : i;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12013m9 m26266x1(C6012x1.k4 k4Var) {
        int iM26265kk = m26265kk(k4Var);
        C12004dy c12004dyM26261k4 = m26261k4(C6399kk.m26256k4(k4Var));
        int i = k4Var.f17015k4;
        float fM67497to = i > 0 ? (float) C14116yg.m67497to((i * c12004dyM26261k4.m56535to(iM26265kk)) / (c12004dyM26261k4.m56536x1(iM26265kk) + c12004dyM26261k4.m56532kk(iM26265kk))) : i < 0 ? C14116yg.m67482k4(i) : 16.0f;
        return c12004dyM26261k4.m56529h4(iM26265kk) ? new C12013m9(c12004dyM26261k4, fM67497to, iM26265kk, 0, k4Var.f17008c5) : new C12013m9(c12004dyM26261k4.m56527du(), fM67497to, iM26265kk, 0, k4Var.f17008c5);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12004dy m26261k4(C9579bv c9579bv) {
        try {
            String strM67368h4 = C14113y2.m67368h4(c9579bv.m46789kk());
            C6386to c6386to = f18190x1.containsKey(c9579bv.m46797to()) ? f18190x1.get_Item(c9579bv.m46797to()) : f18188k4;
            if (!f18189kk.containsItem(strM67368h4) && c9579bv.m46805yj().mo46752kk()) {
                AbstractC9608yj abstractC9608yjM46805yj = c9579bv.m46805yj();
                C9581ck c9581ck = (C9581ck) C7019kk.m27452k4((Object) abstractC9608yjM46805yj, C9581ck.class);
                if (c9581ck == null) {
                    C9577ar c9577ar = (C9577ar) C7019kk.m27452k4((Object) abstractC9608yjM46805yj, C9577ar.class);
                    if (c9577ar != null) {
                        byte[] bArrM46751k4 = c9577ar.m46751k4();
                        C14112xw c14112xwM15613k4 = C3914k4.m15613k4(bArrM46751k4.length);
                        C3914k4.m15621k4(bArrM46751k4, 0, c14112xwM15613k4, bArrM46751k4.length);
                        c6386to.m26218k4(c14112xwM15613k4, bArrM46751k4.length);
                        C3914k4.m15615k4(c14112xwM15613k4);
                    }
                } else if (f18190x1.containsKey(c9581ck.m46810k4())) {
                    c6386to = f18190x1.get_Item(c9581ck.m46810k4());
                } else {
                    c6386to = new C6386to();
                    f18190x1.addItem(c9581ck.m46810k4(), c6386to);
                    c6386to.m26219kk(c9581ck.m46810k4());
                }
                f18189kk.addItem(strM67368h4);
            }
            return new C12004dy(c9579bv.m46778k4(), c6386to);
        } catch (ArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m26262k4(String str, float f, int i) {
        return m26263k4(str, f, i, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m26263k4(String str, float f, int i, int i2) {
        C12004dy c12004dyM26261k4 = m26261k4(C9580c5.m46807k4().mo46809k4(str, i, null));
        return c12004dyM26261k4 != null ? c12004dyM26261k4.m56529h4(i) ? new C12013m9(c12004dyM26261k4, f, i, i2) : new C12013m9(c12004dyM26261k4.m56527du(), f, i, i2) : C12022v4.m56852x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m26264k4() {
        f18188k4.dispose();
        f18188k4 = new C6386to();
        Dictionary.ValueCollection.Enumerator<String, C6386to> it = f18190x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        f18190x1.clear();
        f18189kk.clear();
    }
}
