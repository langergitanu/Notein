package com.aspose.slides.p559ms.System.Xml;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.jw */
/* JADX INFO: loaded from: classes5.dex */
public class C13921jw {

    /* JADX INFO: renamed from: k4 */
    private byte[] f46590k4;

    public C13921jw(byte[] bArr) {
        this.f46590k4 = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte m65496k4(String str) {
        byte b;
        byte[] bArr = this.f46590k4;
        int iCharAt = str.charAt(0);
        if (iCharAt > 122) {
            return (byte) 0;
        }
        if (iCharAt >= 97) {
            iCharAt -= 32;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i * 4;
            int i4 = bArr[i3] & 255;
            if (iCharAt < i4) {
                b = bArr[i3 + 1];
                if ((b & 255) == 0) {
                    break;
                }
                i += b & 255;
            } else if (iCharAt > i4) {
                b = bArr[i3 + 2];
                if ((b & 255) == 0) {
                    break;
                }
                i += b & 255;
            } else {
                if (iCharAt == 0) {
                    return bArr[i3 + 3];
                }
                i++;
                i2++;
                if (i2 == str.length()) {
                    iCharAt = 0;
                } else {
                    iCharAt = str.charAt(i2);
                    if (iCharAt > 122) {
                        return (byte) 0;
                    }
                    if (iCharAt >= 97) {
                        iCharAt -= 32;
                    }
                }
            }
        }
    }
}
