package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ88 {
    public static String canonicalize(String str) {
        String lowerCase = zzYGI.toLowerCase(str);
        int i = 0;
        if (lowerCase.length() > 0 && lowerCase.charAt(0) == '#') {
            zzZDK zzzdkZzwJ = zzwJ(lowerCase);
            if (zzzdkZzwJ instanceof zzZCZ) {
                lowerCase = zzYGI.toLowerCase(((zzZCZ) zzzdkZzwJ).getString());
            }
        }
        if (lowerCase.length() > 1) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= lowerCase.length() || lowerCase.charAt(i) != '\\' || lowerCase.charAt(i2) != ' ') {
                    break;
                }
                i += 2;
            }
            int length = lowerCase.length() - 1;
            while (true) {
                int i3 = length - 1;
                if (i3 <= 0 || lowerCase.charAt(i3) != '\\' || lowerCase.charAt(length) != ' ') {
                    break;
                }
                length -= 2;
            }
            if (i > 0 || length < lowerCase.length() - 1) {
                lowerCase = lowerCase.substring(i, length + 1);
            }
        }
        return zzwI(lowerCase);
    }

    public static String zzV(zzZDK zzzdk) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(zzzdk instanceof zzZCZ) || (zzzdk instanceof zzZBU)) {
            try {
                stringBuffer.append("#" + zzXm(zzYGC.encode(zzzdk.zzXL0().getEncoded("DER"))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((zzZCZ) zzzdk).getString();
            if (string.length() <= 0 || string.charAt(0) != '#') {
                stringBuffer.append(string);
            } else {
                stringBuffer.append("\\".concat(string));
            }
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            if (stringBuffer.charAt(i) == ',' || stringBuffer.charAt(i) == '\"' || stringBuffer.charAt(i) == '\\' || stringBuffer.charAt(i) == '+' || stringBuffer.charAt(i) == '=' || stringBuffer.charAt(i) == '<' || stringBuffer.charAt(i) == '>' || stringBuffer.charAt(i) == ';') {
                stringBuffer.insert(i, "\\");
                i++;
                length++;
            }
            i++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, IOUtils.DIR_SEPARATOR_WINDOWS);
        }
        return stringBuffer.toString();
    }

    private static String zzXm(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static void zzZ(StringBuffer stringBuffer, zzZ8D zzz8d, Hashtable hashtable) {
        if (!zzz8d.zzXIr()) {
            if (zzz8d.zzXIq() != null) {
                zzZ(stringBuffer, zzz8d.zzXIq(), hashtable);
                return;
            }
            return;
        }
        zzZ8E[] zzz8eArrZzXIp = zzz8d.zzXIp();
        boolean z = true;
        for (int i = 0; i != zzz8eArrZzXIp.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            zzZ(stringBuffer, zzz8eArrZzXIp[i], hashtable);
        }
    }

    private static String zzwI(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static zzZD5 zzwJ(String str) {
        try {
            return zzZD5.zzXo(zzYGC.decode(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    private static void zzZ(StringBuffer stringBuffer, zzZ8E zzz8e, Hashtable hashtable) {
        String str = (String) hashtable.get(zzz8e.zzXIt());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(zzz8e.zzXIt().getId());
        }
        stringBuffer.append('=');
        stringBuffer.append(zzV(zzz8e.zzXIs()));
    }

    public static boolean zzZ(zzZ8D zzz8d, zzZ8D zzz8d2) {
        if (zzz8d.zzXIr()) {
            if (!zzz8d2.zzXIr()) {
                return false;
            }
            zzZ8E[] zzz8eArrZzXIp = zzz8d.zzXIp();
            zzZ8E[] zzz8eArrZzXIp2 = zzz8d2.zzXIp();
            if (zzz8eArrZzXIp.length != zzz8eArrZzXIp2.length) {
                return false;
            }
            for (int i = 0; i != zzz8eArrZzXIp.length; i++) {
                if (!zzZ(zzz8eArrZzXIp[i], zzz8eArrZzXIp2[i])) {
                    return false;
                }
            }
            return true;
        }
        if (zzz8d2.zzXIr()) {
            return false;
        }
        return zzZ(zzz8d.zzXIq(), zzz8d2.zzXIq());
    }

    private static boolean zzZ(zzZ8E zzz8e, zzZ8E zzz8e2) {
        if (zzz8e == zzz8e2) {
            return true;
        }
        return zzz8e != null && zzz8e2 != null && zzz8e.zzXIt().equals(zzz8e2.zzXIt()) && canonicalize(zzV(zzz8e.zzXIs())).equals(canonicalize(zzV(zzz8e2.zzXIs())));
    }
}
