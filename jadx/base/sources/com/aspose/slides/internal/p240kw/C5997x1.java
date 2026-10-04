package com.aspose.slides.internal.p240kw;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p128fc.C3958u4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kw.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5997x1 {

    /* JADX INFO: renamed from: k4 */
    private static final C7182dy f16930k4 = C7182dy.m27763k4("CMapName");

    /* JADX INFO: renamed from: k4 */
    private static void m24225k4(IGenericEnumerator<Object> iGenericEnumerator, AbstractC5994k4 abstractC5994k4, InterfaceC5993du interfaceC5993du, int i) {
        List list = new List();
        while (iGenericEnumerator.hasNext()) {
            Object next = iGenericEnumerator.next();
            if (C7019kk.m27469x1(next, C7185jd.class)) {
                next = C7019kk.m27452k4(next, (Class<Object>) C7185jd.class);
            } else if (C7019kk.m27469x1(next, C3958u4.class)) {
                m24226k4((C3958u4) C7019kk.m27452k4(next, C3958u4.class), list, abstractC5994k4, interfaceC5993du, i);
                list = new List();
            }
            list.addItem((C7185jd) next);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m24226k4(C3958u4 c3958u4, List<C7185jd> list, AbstractC5994k4 abstractC5994k4, InterfaceC5993du interfaceC5993du, int i) {
        String str = c3958u4.f10713k4;
        int i2 = 0;
        if (i == 0 && list.size() == 2 && C14113y2.m67363du(str, "def")) {
            C7185jd c7185jd = list.get_Item(0);
            if (C7182dy.f19473j0.equals(c7185jd)) {
                abstractC5994k4.m24216kk(list.get_Item(1).toString());
                return;
            }
            if (C7182dy.f19517lv.equals(c7185jd)) {
                abstractC5994k4.m24217x1(list.get_Item(1).toString());
                return;
            }
            if (f16930k4.equals(c7185jd)) {
                abstractC5994k4.m24215k4(list.get_Item(1).toString());
                return;
            } else {
                if (C7182dy.f19700xh.equals(c7185jd)) {
                    try {
                        abstractC5994k4.m24212k4(((C7179c5) list.get_Item(1)).m27752kk());
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                }
                return;
            }
        }
        if ((C14113y2.m67363du(str, "endcidchar") || C14113y2.m67363du(str, "endbfchar")) && list.size() >= 2) {
            int size = list.size() - 1;
            while (i2 < size) {
                if (C7019kk.m27469x1(list.get_Item(i2), C7191up.class)) {
                    abstractC5994k4.mo24213k4((C7191up) list.get_Item(i2), list.get_Item(i2 + 1));
                }
                i2 += 2;
            }
            return;
        }
        if ((!C14113y2.m67363du(str, "endcidrange") && !C14113y2.m67363du(str, "endbfrange")) || list.size() < 3) {
            if (C14113y2.m67363du(str, "usecmap") && list.size() == 1 && C7019kk.m27469x1(list.get_Item(0), C7182dy.class)) {
                m24228k4(abstractC5994k4, interfaceC5993du, i + 1);
                return;
            }
            return;
        }
        int size2 = list.size() - 2;
        while (i2 < size2) {
            if (C7019kk.m27469x1(list.get_Item(i2), C7191up.class)) {
                int i3 = i2 + 1;
                if (C7019kk.m27469x1(list.get_Item(i3), C7191up.class)) {
                    abstractC5994k4.m24214k4((C7191up) list.get_Item(i2), (C7191up) list.get_Item(i3), list.get_Item(i2 + 2));
                }
            }
            i2 += 3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m24227k4(AbstractC5994k4 abstractC5994k4, InterfaceC5993du interfaceC5993du) {
        m24228k4(abstractC5994k4, interfaceC5993du, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m24228k4(AbstractC5994k4 abstractC5994k4, InterfaceC5993du interfaceC5993du, int i) {
        if (i >= 10) {
            return;
        }
        IGenericEnumerator<Object> iGenericEnumeratorMo24208k4 = interfaceC5993du.mo24208k4();
        try {
            m24225k4(iGenericEnumeratorMo24208k4, abstractC5994k4, interfaceC5993du, i);
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            iGenericEnumeratorMo24208k4.dispose();
            throw th;
        }
        iGenericEnumeratorMo24208k4.dispose();
    }
}
