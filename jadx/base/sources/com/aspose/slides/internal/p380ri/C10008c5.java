package com.aspose.slides.internal.p380ri;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;

/* JADX INFO: renamed from: com.aspose.slides.internal.ri.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10008c5 {
    /* JADX INFO: renamed from: k4 */
    public static <T> T m49136k4(List<T> list) {
        if (list.size() == 0) {
            return null;
        }
        return (T) OooO0O0.OooO00o(list, 1);
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> T m49138x1(List<T> list) {
        T t = (T) m49136k4(list);
        list.removeAt(list.size() - 1);
        return t;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m49137k4(List<T> list, List<T> list2) {
        list.addRange(list2);
    }
}
