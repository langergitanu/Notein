package com.aspose.slides.internal.p437u9;

import com.aspose.slides.internal.p514xx.C12749k4;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.u9.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C11295jd implements Comparator<String> {

    /* JADX INFO: renamed from: k4 */
    public static final Comparator<String> f38871k4 = new C11295jd();

    private C11295jd() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compare(String str, String str2) {
        char cM59423k4;
        char cM59423k42;
        char cM59424x1;
        char cM59424x12;
        int i = 0;
        if (C14113y2.m67363du(str, str2)) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length();
        int length2 = str2.length();
        for (int i2 = 0; i < length && i2 < length2; i2++) {
            int iCharAt = str.charAt(i);
            int iCharAt2 = str2.charAt(i2);
            if ((iCharAt | iCharAt2) <= 127) {
                if (iCharAt >= 97 && iCharAt <= 122) {
                    iCharAt ^= 32;
                }
                if (iCharAt2 >= 97 && iCharAt2 <= 122) {
                    iCharAt2 ^= 32;
                }
                if (iCharAt != iCharAt2) {
                    return iCharAt - iCharAt2;
                }
            } else if (iCharAt != iCharAt2 && (cM59423k4 = C12749k4.m59423k4((char) iCharAt)) != (cM59423k42 = C12749k4.m59423k4((char) iCharAt2)) && (cM59424x1 = C12749k4.m59424x1(cM59423k4)) != (cM59424x12 = C12749k4.m59424x1(cM59423k42))) {
                return cM59424x1 - cM59424x12;
            }
            i++;
        }
        return length - length2;
    }
}
