package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.j2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14067j2 {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC14068j5 m66726k4(int i) {
        return C7019kk.m27443k4((Class<?>) Integer.TYPE);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66729x1(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14068j5 m66727k4(Object obj) {
        if (obj == null) {
            throw new NullReferenceException();
        }
        if (obj instanceof AbstractC14092to) {
            obj = AbstractC14092to.m67212k4((AbstractC14092to) obj);
        }
        return C7019kk.m27443k4(obj.getClass());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66728k4(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }
}
