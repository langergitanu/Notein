package com.aspose.slides.internal.p508xq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C12597jd {
    /* JADX INFO: renamed from: k4 */
    private static void m58805k4(AbstractC12594du abstractC12594du, C12593c5 c12593c5, String str, boolean z) {
        int iM67418kk = C14113y2.m67418kk(str, IOUtils.DIR_SEPARATOR_UNIX) + 1;
        String strM67443x1 = C14113y2.m67443x1(str, 0, iM67418kk);
        C12596h4 c12596h4 = new C12596h4(C14113y2.m67402k4("{0}{1}_rels/{2}.rels", C14113y2.m67448x1(strM67443x1, "/") ? C14113y2.f47374k4 : "/", strM67443x1, C14113y2.m67422kk(str, iM67418kk)), "application/vnd.openxmlformats-package.relationships+xml");
        C3175k4 c3175k4 = new C3175k4(c12596h4.m58803to(), z);
        c3175k4.m13584k4("Relationships");
        c3175k4.m13590kk("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
        IGenericEnumerator<C12595dy> it = c12593c5.iterator();
        while (it.hasNext()) {
            try {
                C12595dy next = it.next();
                c3175k4.m13593x1("Relationship");
                c3175k4.m13590kk("Id", next.m58794k4());
                c3175k4.m13590kk("Type", next.m58797x1());
                c3175k4.m13590kk("Target", next.m58795kk());
                if (next.m58796to()) {
                    c3175k4.m13590kk("TargetMode", "External");
                }
                c3175k4.m13588kk();
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
        c3175k4.m13592x1();
        abstractC12594du.m58793x1().m58814k4(c12596h4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m58806k4(AbstractC12594du abstractC12594du, boolean z) {
        m58805k4(abstractC12594du, abstractC12594du.m58791kk(), C14113y2.f47374k4, z);
        List list = new List();
        IGenericEnumerator<C12596h4> it = abstractC12594du.m58793x1().iterator();
        while (it.hasNext()) {
            try {
                C12596h4 next = it.next();
                if (next.m58799h4().m58783k4() > 0) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                C12596h4 c12596h4 = (C12596h4) it2.next();
                m58805k4(abstractC12594du, c12596h4.m58799h4(), c12596h4.m58800k4(), z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }
}
