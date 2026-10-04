package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11690k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class CaseInsensitiveComparer implements Comparator {

    /* JADX INFO: renamed from: k4 */
    private C11690k4 f1577k4;

    public CaseInsensitiveComparer() {
        this.f1577k4 = C11697x1.m55252to().m55271up();
    }

    public static CaseInsensitiveComparer getDefault() {
        return new CaseInsensitiveComparer(C11697x1.m55252to());
    }

    public static CaseInsensitiveComparer getDefaultInvariant() {
        return new CaseInsensitiveComparer(C11697x1.m55250kk());
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((obj instanceof String) && (obj2 instanceof String)) ? this.f1577k4.m55132k4((String) obj, (String) obj2, 1L) : Comparer.Default.compare(obj, obj2);
    }

    public CaseInsensitiveComparer(C11697x1 c11697x1) {
        if (c11697x1 == null) {
            throw new ArgumentNullException("culture");
        }
        this.f1577k4 = c11697x1.m55271up();
    }
}
