package com.aspose.slides.internal.p255lq;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.lq.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6220k4 {
    /* JADX INFO: renamed from: k4 */
    public static <T> T[] m25202k4(Class<T> cls, T[] tArr, T t) {
        T[] tArr2 = (T[]) ((Object[]) C7019kk.m27450k4((Class) cls, tArr.length + 1));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        tArr2[tArr.length] = t;
        return tArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> T[] m25203k4(Class<T> cls, T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) ((Object[]) C7019kk.m27450k4((Class) cls, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }
}
