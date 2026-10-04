package com.aspose.slides.internal.p505xn;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C12567ne {

    /* JADX INFO: renamed from: k4 */
    public static final boolean f42083k4;

    /* JADX INFO: renamed from: kk */
    public static final boolean f42084kk;

    /* JADX INFO: renamed from: to */
    public static final boolean f42085to;

    /* JADX INFO: renamed from: x1 */
    public static final boolean f42086x1;

    static {
        f42083k4 = C12576x6.m58708k4() == 0;
        f42086x1 = C12576x6.m58708k4() == 1;
        f42084kk = C12576x6.m58708k4() == 2;
        f42085to = AbstractC14068j5.m66735x1("Mono.Runtime") != null;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m58657k4(AbstractC12002ck abstractC12002ck) {
        float fMo15752dy = abstractC12002ck.mo15752dy();
        if (fMo15752dy < 0.01d) {
            return 96.0f;
        }
        return fMo15752dy;
    }

    /* JADX INFO: renamed from: x1 */
    public static float m58660x1(AbstractC12002ck abstractC12002ck) {
        float fMo15758up = abstractC12002ck.mo15758up();
        if (fMo15758up < 0.01d) {
            return 96.0f;
        }
        return fMo15758up;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m58658k4(String str) {
        if (f42086x1) {
            str = C14113y2.m67393k4(str, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        }
        IGenericEnumerator<String> it = m58661x1(str).iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                if (C3131h4.m13361kk(next)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return next;
                }
                String[] strArr = {null};
                boolean z = f42086x1 && m58659k4(next, strArr);
                String str2 = strArr[0];
                if (z) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return str2;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return str;
    }

    /* JADX INFO: renamed from: x1 */
    private static IGenericEnumerable<String> m58661x1(String str) {
        String[] strArr = {C14113y2.f47374k4};
        List list = new List();
        String strM13397du = C3141rv.m13397du(str);
        for (String strM13411x1 = strArr[0]; !C14113y2.m67411k4(strM13411x1); strM13411x1 = C3141rv.m13411x1(strM13411x1)) {
            list.addItem(C3141rv.m13404k4(str, C14113y2.m67408k4(strM13411x1, strM13397du)));
        }
        list.addItem(str);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m58659k4(String str, String[] strArr) {
        if (!C14113y2.m67411k4(str) && !C3131h4.m13361kk(str)) {
            String strM13400h4 = C3141rv.m13400h4(str);
            if (C3142to.m13421kk(strM13400h4)) {
                for (String str2 : C3142to.m13414du(strM13400h4)) {
                    if (C14113y2.m67432to(str2, str, (short) 5)) {
                        strArr[0] = str2;
                        return true;
                    }
                }
            }
        }
        strArr[0] = str;
        return false;
    }
}
