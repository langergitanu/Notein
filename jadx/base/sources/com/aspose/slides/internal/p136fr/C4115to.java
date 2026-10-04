package com.aspose.slides.internal.p136fr;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3185jd;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fr.to */
/* JADX INFO: loaded from: classes.dex */
public class C4115to {
    /* JADX INFO: renamed from: k4 */
    public static String m16472k4(C3181c5 c3181c5) {
        return m16473k4(c3181c5, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m16473k4(C3181c5 c3181c5, int i) {
        C3125bv c3125bv = new C3125bv();
        try {
            C13991ub c13991ub = new C13991ub(c3125bv);
            c13991ub.m66258k4(i);
            m16476k4(c3181c5, c13991ub);
            c13991ub.mo21893du();
            return c3125bv.toString();
        } finally {
            c3125bv.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m16474k4(C3185jd c3185jd) {
        return m16472k4(c3185jd.f9466h4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m16475k4(C3181c5 c3181c5, AbstractC13958qb abstractC13958qb) {
        int i = 0;
        if ("root".equals(c3181c5.f9456h4)) {
            while (i < c3181c5.m13628ar().m13697k4()) {
                m16475k4(c3181c5.m13628ar().m13702x1(i), abstractC13958qb);
                i++;
            }
            return;
        }
        if (C7019kk.m27469x1(c3181c5, C10229k4.class)) {
            C10229k4 c10229k4 = (C10229k4) c3181c5;
            boolean z = c10229k4.f36668c5;
            String str = c10229k4.f36669dy;
            if (z) {
                abstractC13958qb.mo21895dy(str);
                return;
            } else {
                abstractC13958qb.mo21918x1(str);
                return;
            }
        }
        abstractC13958qb.m65807up(c3181c5.f9456h4);
        if (c3181c5.f9461x1.size() > 0) {
            C6765kp c6765kp = new C6765kp();
            IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5.f9461x1.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<String, String> next = it.next();
                    if (!"style".equals(next.getKey())) {
                        if (C14113y2.m67448x1(next.getKey(), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
                            c6765kp.m26796k4("{0}:{1};", next.getKey(), next.getValue());
                        } else {
                            abstractC13958qb.m65806to(next.getKey(), next.getValue());
                        }
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
            String strM67408k4 = C14113y2.m67408k4(c6765kp.toString(), c3181c5.f9461x1.m13690kk("style", ""));
            if (!C14113y2.m67411k4(C14113y2.m67440x1(strM67408k4))) {
                abstractC13958qb.m65806to("style", strM67408k4);
            }
        }
        if (c3181c5.m13639u4()) {
            while (i < c3181c5.m13628ar().m13697k4()) {
                m16475k4(c3181c5.m13628ar().m13702x1(i), abstractC13958qb);
                i++;
            }
        }
        abstractC13958qb.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16476k4(C3181c5 c3181c5, C13991ub c13991ub) {
        m16475k4(c3181c5, (AbstractC13958qb) c13991ub);
    }
}
