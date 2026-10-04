package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18101a5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGI {

    /* JADX INFO: renamed from: eK */
    private static String f50822eK;

    static {
        try {
            try {
                f50822eK = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: com.aspose.words.internal.zzYGI.1
                    @Override // java.security.PrivilegedAction
                    public final /* synthetic */ String run() {
                        return System.getProperty(C18101a5.f54156e);
                    }
                });
            } catch (Exception unused) {
                f50822eK = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f50822eK = IOUtils.LINE_SEPARATOR_UNIX;
        }
    }

    public static String lineSeparator() {
        return f50822eK;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ControlChar.SPACE_CHAR);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static byte[] zzC(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] zzD(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zzZ(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    private static char[] zzVF(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String zzVG(byte[] bArr) {
        return new String(zzVF(bArr));
    }

    public static String zzVH(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int iZzY = zzYGA.zzY(bArr, cArr);
        if (iZzY >= 0) {
            return new String(cArr, 0, iZzY);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    private static void zzZ(char[] cArr, OutputStream outputStream) throws IOException {
        int i = 0;
        while (i < cArr.length) {
            char c = cArr[i];
            if (c < 128) {
                outputStream.write(c);
            } else if (c < 2048) {
                outputStream.write((c >> 6) | 192);
                outputStream.write((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                outputStream.write((c >> '\f') | 224);
                outputStream.write(((c >> 6) & 63) | 128);
                outputStream.write((c & '?') | 128);
            } else {
                i++;
                if (i >= cArr.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                char c2 = cArr[i];
                if (c > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int i2 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                outputStream.write((i2 >> 18) | 240);
                outputStream.write(((i2 >> 12) & 63) | 128);
                outputStream.write(((i2 >> 6) & 63) | 128);
                outputStream.write((i2 & 63) | 128);
            }
            i++;
        }
    }

    public static String[] zzwa(String str) {
        int i;
        Vector vector = new Vector();
        boolean z = true;
        while (true) {
            if (!z) {
                break;
            }
            int iIndexOf = str.indexOf(46);
            if (iIndexOf > 0) {
                vector.addElement(str.substring(0, iIndexOf));
                str = str.substring(iIndexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static byte[] zzwb(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static byte[] zzwc(String str) {
        return zzD(str.toCharArray());
    }
}
