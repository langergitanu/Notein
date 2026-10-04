package com.aspose.slides.internal.p502xk;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.internal.p380ri.C10018x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xk.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12543to {
    /* JADX INFO: renamed from: k4 */
    public static String m58443k4(int[] iArr) {
        C6765kp c6765kp = new C6765kp();
        for (int i : iArr) {
            if (i >= 65535) {
                if (i >= 1114112) {
                    throw new ArgumentException(C14113y2.m67408k4("illegal scalar value 0x", C10009ck.m49139k4(C10018x1.m49171c5(i), 2, r8.length() - 1), "; out of range for UTF-16"));
                }
                int i2 = i - 65536;
                int i3 = ((i2 >> 10) & 1023) + 55296;
                i = (i2 & 1023) + 56320;
                c6765kp.m26780k4((char) i3);
            } else if (i >= 55296 && i <= 57343) {
                throw new ArgumentException(C14113y2.m67408k4("illegal scalar value 0x", C10009ck.m49139k4(C10018x1.m49171c5(i), 2, r8.length() - 1), "; cannot be UTF-16 surrogate"));
            }
            c6765kp.m26780k4((char) i);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m58444k4(String str, int i, boolean z) {
        int length = str.length();
        if (length == 0) {
            return new int[0];
        }
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int iCharAt = str.charAt(i2);
            if (iCharAt >= 55296 && iCharAt < 57344) {
                int i4 = i2 + 1;
                char cCharAt = i4 < length ? str.charAt(i4) : (char) 0;
                if (iCharAt < 56320) {
                    if (cCharAt >= 56320 && cCharAt < 57344) {
                        iCharAt = (cCharAt - 56320) + ((iCharAt - 55296) << 10) + 65536;
                        i2 = i4;
                    } else if (z) {
                        throw new ArgumentException("isolated high (leading) surrogate");
                    }
                } else if (z) {
                    throw new ArgumentException("isolated low (trailing) surrogate");
                }
                iCharAt = i;
            }
            iArr[i3] = iCharAt;
            i2++;
            i3++;
        }
        if (i3 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i3];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) iArr), 0, AbstractC14092to.m67208k4((Object) iArr2), 0, i3);
        return iArr2;
    }
}
