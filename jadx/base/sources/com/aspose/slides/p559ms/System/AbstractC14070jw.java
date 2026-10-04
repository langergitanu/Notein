package com.aspose.slides.p559ms.System;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.jw */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14070jw implements IGenericEqualityComparer<String>, Comparator<String> {

    /* JADX INFO: renamed from: k4 */
    static AbstractC14070jw f47260k4 = new C14099uz(C11697x1.m55250kk(), true);

    /* JADX INFO: renamed from: x1 */
    static AbstractC14070jw f47263x1 = new C14099uz(C11697x1.m55250kk(), false);

    /* JADX INFO: renamed from: kk */
    static AbstractC14070jw f47261kk = new C14082os(true);

    /* JADX INFO: renamed from: to */
    static AbstractC14070jw f47262to = new C14082os(false);

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14070jw m66787k4() {
        return new C14099uz(C11697x1.m55252to(), true);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC14070jw m66788kk() {
        return f47262to;
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC14070jw m66789to() {
        return f47261kk;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC14070jw m66790x1() {
        return f47260k4;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        String str;
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        String str2 = (String) C7019kk.m27452k4(obj, String.class);
        return (str2 == null || (str = (String) C7019kk.m27452k4(obj2, String.class)) == null) ? obj.equals(obj2) : equalsT(str2, str);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("obj");
        }
        String str = (String) C7019kk.m27452k4(obj, String.class);
        return str != null ? hashCodeT(str) : obj.hashCode();
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k4 */
    public abstract int compare(String str, String str2);

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1 */
    public abstract int hashCodeT(String str);

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1 */
    public abstract boolean equalsT(String str, String str2);
}
