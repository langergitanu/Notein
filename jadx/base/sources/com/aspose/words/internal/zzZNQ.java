package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNQ {
    public static final String zzUT(String str) {
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
                    stringBuffer.append("\\\\");
                } else if (iCodePointAt != 119) {
                    stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    stringBuffer.append(Character.toChars(iCodePointAt));
                } else {
                    stringBuffer.append("[\\pL\\pM\\p{Nd}\\p{Nl}\\p{Pc}[\\p{InEnclosedAlphanumerics}&&\\p{So}]]");
                }
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
