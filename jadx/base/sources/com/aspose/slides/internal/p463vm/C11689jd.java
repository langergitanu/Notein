package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C11689jd {

    /* JADX INFO: renamed from: k4 */
    private String f39549k4;

    /* JADX INFO: renamed from: x1 */
    private int f39550x1;

    public C11689jd() {
        this(C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m55120k4(String str, int i) {
        int iM55121x1 = m55121x1(str, i);
        return iM55121x1 != 1 ? C14113y2.m67443x1(str, i, iM55121x1) : C14113y2.m67389k4(str.charAt(i), 1);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m55121x1(String str, int i) {
        int iM67545x1;
        int i2;
        if (str == null) {
            throw new ArgumentNullException("string is null");
        }
        if (i >= str.length()) {
            return 0;
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Index is not valid");
        }
        char cCharAt = str.charAt(i);
        int iM67545x12 = C14117yj.m67545x1(cCharAt);
        int i3 = 1;
        if (iM67545x12 == 16) {
            return (cCharAt < 55296 || cCharAt > 56319 || (i2 = i + 1) >= str.length() || str.charAt(i2) < 56320 || str.charAt(i2) > 57343) ? 1 : 2;
        }
        if (iM67545x12 != 5 && iM67545x12 != 6 && iM67545x12 != 7) {
            while (true) {
                int i4 = i + i3;
                if (i4 >= str.length() || !((iM67545x1 = C14117yj.m67545x1(str.charAt(i4))) == 5 || iM67545x1 == 6 || iM67545x1 == 7)) {
                    break;
                }
                i3++;
            }
        }
        return i3;
    }

    public boolean equals(Object obj) {
        C11689jd c11689jd = (C11689jd) C7019kk.m27452k4(obj, C11689jd.class);
        return c11689jd != null && C14113y2.m67363du(this.f39549k4, c11689jd.f39549k4);
    }

    public int hashCode() {
        return this.f39549k4.hashCode();
    }

    public C11689jd(String str) {
        m55123k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    public static C11687fa m55122x1(String str) {
        if (str == null || str.length() == 0) {
            throw new ArgumentNullException("string is null");
        }
        return new C11687fa(str, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55123k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        this.f39550x1 = -1;
        this.f39549k4 = str;
    }
}
