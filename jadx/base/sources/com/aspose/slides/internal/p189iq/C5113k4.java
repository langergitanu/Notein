package com.aspose.slides.internal.p189iq;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.iq.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5113k4 {
    /* JADX INFO: renamed from: k4 */
    public static final String m21959k4(String str) {
        String str2;
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\\') {
                length += 100;
            }
        }
        StringBuffer stringBuffer = new StringBuffer(length);
        int i2 = 0;
        boolean z = false;
        while (i2 < str.length()) {
            int iCodePointAt = str.codePointAt(i2);
            if (str.codePointAt(i2) > 65535) {
                i2++;
            }
            if (z) {
                if (iCodePointAt == 92) {
                    str2 = "\\\\";
                } else if (iCodePointAt != 119) {
                    stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    stringBuffer.append(Character.toChars(iCodePointAt));
                    z = false;
                } else {
                    str2 = "[\\p{L}\\p{M}\\p{Nd}\\p{Nl}\\p{Pc}[\\p{InEnclosedAlphanumerics}&&\\p{So}]]";
                }
                stringBuffer.append(str2);
                z = false;
            } else if (iCodePointAt == 92) {
                z = true;
            } else {
                stringBuffer.append(Character.toChars(iCodePointAt));
            }
            i2++;
        }
        if (z) {
            stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
        }
        return stringBuffer.toString();
    }
}
