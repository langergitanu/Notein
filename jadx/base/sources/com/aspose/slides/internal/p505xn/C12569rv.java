package com.aspose.slides.internal.p505xn;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12569rv {
    /* JADX INFO: renamed from: k4 */
    public static int m58664k4(Object... objArr) {
        return m58665x1(objArr);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m58665x1(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int iHashCode = 1;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }
}
