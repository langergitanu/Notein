package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11696up;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class CaseInsensitiveHashCodeProvider implements IHashCodeProvider {

    /* JADX INFO: renamed from: k4 */
    static CaseInsensitiveHashCodeProvider f1578k4 = new CaseInsensitiveHashCodeProvider(C11697x1.m55250kk());

    /* JADX INFO: renamed from: kk */
    static final Object f1579kk = new Object();

    /* JADX INFO: renamed from: x1 */
    static CaseInsensitiveHashCodeProvider f1580x1;

    /* JADX INFO: renamed from: to */
    private C11696up f1581to;

    public CaseInsensitiveHashCodeProvider() {
        if (m793k4(C11697x1.m55252to(), C11697x1.m55250kk())) {
            return;
        }
        this.f1581to = C11697x1.m55252to().m55260ck();
    }

    public static CaseInsensitiveHashCodeProvider getDefault() {
        CaseInsensitiveHashCodeProvider caseInsensitiveHashCodeProvider;
        CaseInsensitiveHashCodeProvider caseInsensitiveHashCodeProvider2;
        synchronized (f1579kk) {
            try {
                CaseInsensitiveHashCodeProvider caseInsensitiveHashCodeProvider3 = f1580x1;
                if (caseInsensitiveHashCodeProvider3 == null) {
                    caseInsensitiveHashCodeProvider = new CaseInsensitiveHashCodeProvider();
                } else {
                    C11696up c11696up = caseInsensitiveHashCodeProvider3.f1581to;
                    if (c11696up == null) {
                        if (!m793k4(C11697x1.m55252to(), C11697x1.m55250kk())) {
                            caseInsensitiveHashCodeProvider = new CaseInsensitiveHashCodeProvider();
                        }
                    } else if (!m792k4(c11696up, C11697x1.m55252to())) {
                        caseInsensitiveHashCodeProvider = new CaseInsensitiveHashCodeProvider();
                    }
                    caseInsensitiveHashCodeProvider2 = f1580x1;
                }
                f1580x1 = caseInsensitiveHashCodeProvider;
                caseInsensitiveHashCodeProvider2 = f1580x1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return caseInsensitiveHashCodeProvider2;
    }

    public static CaseInsensitiveHashCodeProvider getDefaultInvariant() {
        return f1578k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m792k4(C11696up c11696up, C11697x1 c11697x1) {
        return c11696up.m55241x1() == c11697x1.m55262dy();
    }

    @Override // com.aspose.slides.Collections.IHashCodeProvider
    public int hashCode(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("obj");
        }
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return obj.hashCode();
        }
        C11696up c11696up = this.f1581to;
        int i = 0;
        if (c11696up == null || m792k4(c11696up, C11697x1.m55250kk())) {
            int iM67523k4 = 0;
            while (i < str.length()) {
                iM67523k4 = (iM67523k4 * 31) + C14117yj.m67523k4(str.charAt(i), C11697x1.m55250kk());
                i++;
            }
            return iM67523k4;
        }
        String strM55236k4 = this.f1581to.m55236k4(str);
        int iCharAt = 0;
        while (i < strM55236k4.length()) {
            iCharAt = (iCharAt * 31) + strM55236k4.charAt(i);
            i++;
        }
        return iCharAt;
    }

    public CaseInsensitiveHashCodeProvider(C11697x1 c11697x1) {
        if (c11697x1 == null) {
            throw new ArgumentNullException("culture");
        }
        if (m793k4(c11697x1, C11697x1.m55250kk())) {
            return;
        }
        this.f1581to = c11697x1.m55260ck();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m793k4(C11697x1 c11697x1, C11697x1 c11697x12) {
        return c11697x1.m55262dy() == c11697x12.m55262dy();
    }
}
