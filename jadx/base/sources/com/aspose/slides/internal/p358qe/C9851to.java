package com.aspose.slides.internal.p358qe;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.to */
/* JADX INFO: loaded from: classes4.dex */
class C9851to {
    /* JADX INFO: renamed from: k4 */
    public static void m48587k4(Annotation[] annotationArr, List<Object> list, AbstractC14041ai<Annotation> abstractC14041ai) {
        if (annotationArr == null) {
            return;
        }
        for (Annotation annotation : annotationArr) {
            if ((abstractC14041ai == null || abstractC14041ai.invoke(annotation)) && !list.containsItem(annotation)) {
                list.addItem(annotation);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m48589x1(C9845jd c9845jd, AbstractC14068j5 abstractC14068j5) {
        return m48588k4(c9845jd, abstractC14068j5).length > 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static Object[] m48588k4(C9845jd c9845jd, AbstractC14068j5 abstractC14068j5) {
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) abstractC14068j5.mo48624ks(), 0);
        List list = new List();
        C9841du c9841du = !abstractC14068j5.m66751kk(C7019kk.m27443k4((Class<?>) Object.class)) ? new C9841du(abstractC14068j5) : null;
        Annotation[] annotationArrM48560h4 = c9845jd.m48560h4();
        if (c9845jd.m48564to() instanceof AbstractC9839c5) {
            annotationArrM48560h4 = ((AbstractC9839c5) c9845jd.m48564to()).mo48522x6().getParameterAnnotations()[c9845jd.m48559du()];
        } else if (c9845jd.m48564to() instanceof AbstractC9847kk) {
            annotationArrM48560h4 = ((AbstractC9847kk) c9845jd.m48564to()).mo48542k4().getParameterAnnotations()[c9845jd.m48559du()];
        }
        m48587k4(annotationArrM48560h4, list, c9841du);
        return list.toArray(objArr);
    }
}
