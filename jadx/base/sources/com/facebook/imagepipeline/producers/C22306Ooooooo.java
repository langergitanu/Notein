package com.facebook.imagepipeline.producers;

import com.aspose.slides.PatternStyle;
import java.io.UnsupportedEncodingException;
import oO0oO0.InterfaceC33930OooO00o;
import ooOOoOO0.C35113OooO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22306Ooooooo implements InterfaceC33930OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f67473OooO00o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, PatternStyle.Plaid, PatternStyle.Sphere, PatternStyle.Weave, PatternStyle.DottedGrid, PatternStyle.Divot, PatternStyle.Shingle, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, -1, -1, -1, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r2 == (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r0.append((char) (r2 | ((r7 & 3) << 6)));
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] OooO0O0(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        byte b3;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i4 = 0;
        loop0: while (i4 < length) {
            while (true) {
                bArr = f67473OooO00o;
                i = i4 + 1;
                b = bArr[bytes[i4]];
                if (i >= length || b != -1) {
                    break;
                }
                i4 = i;
            }
            if (b == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b2 = bArr[bytes[i]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i = i2;
            }
            if (b2 == -1) {
                break;
            }
            stringBuffer.append((char) ((b << 2) | ((b2 & PatternStyle.Wave) >>> 4)));
            while (true) {
                i3 = i2 + 1;
                byte b4 = bytes[i2];
                if (b4 == 61) {
                    break loop0;
                }
                b3 = bArr[b4];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            stringBuffer.append((char) (((b2 & 15) << 4) | ((b3 & 60) >>> 2)));
            while (true) {
                int i5 = i3 + 1;
                byte b5 = bytes[i3];
                if (b5 == 61) {
                    break loop0;
                }
                byte b6 = bArr[b5];
                if (i5 >= length || b6 != -1) {
                    break;
                }
                i3 = i5;
            }
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }

    public static final byte OooO0OO(char c) {
        if (c < '~') {
            return C35113OooO.f126098OooO0O0[c];
        }
        return (byte) 0;
    }

    public static final boolean OooO0Oo(int i, int i2) {
        return ((float) ((int) (((float) i) * 1.3333334f))) >= 2048.0f && ((int) (((float) i2) * 1.3333334f)) >= 2048;
    }

    public static final String OooO0o0(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }

    @Override // oO0oO0.InterfaceC33930OooO00o
    public void OooO00o(int i, int i2) {
    }
}
