package com.aspose.slides.internal.p505xn;

import com.aspose.slides.internal.p346pw.C9572k4;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12574wl implements Comparator<String> {

    /* JADX INFO: renamed from: k4 */
    public static final Comparator<String> f42091k4 = new C12574wl();

    private C12574wl() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compare(String str, String str2) {
        char cM46735k4;
        char cM46735k42;
        char cM46736x1;
        char cM46736x12;
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
            } else if (iCharAt != iCharAt2 && (cM46735k4 = C9572k4.m46735k4((char) iCharAt)) != (cM46735k42 = C9572k4.m46735k4((char) iCharAt2)) && (cM46736x1 = C9572k4.m46736x1(cM46735k4)) != (cM46736x12 = C9572k4.m46736x1(cM46735k42))) {
                return cM46736x1 - cM46736x12;
            }
            i++;
        }
        return length - length2;
    }
}
