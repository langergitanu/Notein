package com.huawei.cloud.base.util.base64;

import OooOoo.C20593OooO0Oo;
import com.aspose.slides.PatternStyle;
import com.huawei.cloud.base.util.base64.BaseNCodec;
import com.huawei.hms.drive.C17869dy;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.Sphere, PatternStyle.Shingle};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.DottedGrid, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, PatternStyle.Plaid, PatternStyle.Sphere, PatternStyle.Weave, PatternStyle.DottedGrid, PatternStyle.Divot, PatternStyle.Shingle, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross};

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return C17869dy.m76772a(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return C17869dy.m76772a(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    private void getContext(BaseNCodec.Context context) {
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
        int i = context.pos;
        int i2 = context.modulus;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = i + 1;
                context.pos = i3;
                byte[] bArr = this.encodeTable;
                int i4 = context.ibitWorkArea;
                bArrEnsureBufferSize[i] = bArr[(i4 >> 2) & 63];
                int i5 = i + 2;
                context.pos = i5;
                bArrEnsureBufferSize[i3] = bArr[(i4 << 4) & 63];
                if (bArr == STANDARD_ENCODE_TABLE) {
                    int i6 = i + 3;
                    context.pos = i6;
                    byte b = this.pad;
                    bArrEnsureBufferSize[i5] = b;
                    context.pos = i + 4;
                    bArrEnsureBufferSize[i6] = b;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                int i7 = i + 1;
                context.pos = i7;
                byte[] bArr2 = this.encodeTable;
                int i8 = context.ibitWorkArea;
                bArrEnsureBufferSize[i] = bArr2[(i8 >> 10) & 63];
                int i9 = i + 2;
                context.pos = i9;
                bArrEnsureBufferSize[i7] = bArr2[(i8 >> 4) & 63];
                int i10 = i + 3;
                context.pos = i10;
                bArrEnsureBufferSize[i9] = bArr2[(i8 << 2) & 63];
                if (bArr2 == STANDARD_ENCODE_TABLE) {
                    context.pos = i + 4;
                    bArrEnsureBufferSize[i10] = this.pad;
                }
            }
        }
        int i11 = context.currentLinePos;
        int i12 = context.pos;
        int i13 = (i12 - i) + i11;
        context.currentLinePos = i13;
        if (this.lineLength <= 0 || i13 <= 0) {
            return;
        }
        byte[] bArr3 = this.lineSeparator;
        System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i12, bArr3.length);
        context.pos += this.lineSeparator.length;
    }

    private void getContext2(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        int i3 = 0;
        while (i3 < i2) {
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.encodeSize, context);
            int i4 = (context.modulus + 1) % 3;
            context.modulus = i4;
            int i5 = i + 1;
            int i6 = bArr[i];
            if (i6 < 0) {
                i6 += 256;
            }
            int i7 = (context.ibitWorkArea << 8) + i6;
            context.ibitWorkArea = i7;
            if (i4 == 0) {
                int i8 = context.pos;
                int i9 = i8 + 1;
                context.pos = i9;
                byte[] bArr2 = this.encodeTable;
                bArrEnsureBufferSize[i8] = bArr2[(i7 >> 18) & 63];
                int i10 = i8 + 2;
                context.pos = i10;
                bArrEnsureBufferSize[i9] = bArr2[(i7 >> 12) & 63];
                int i11 = i8 + 3;
                context.pos = i11;
                bArrEnsureBufferSize[i10] = bArr2[(i7 >> 6) & 63];
                int i12 = i8 + 4;
                context.pos = i12;
                bArrEnsureBufferSize[i11] = bArr2[i7 & 63];
                int i13 = context.currentLinePos + 4;
                context.currentLinePos = i13;
                int i14 = this.lineLength;
                if (i14 > 0 && i14 <= i13) {
                    byte[] bArr3 = this.lineSeparator;
                    System.arraycopy(bArr3, 0, bArrEnsureBufferSize, i12, bArr3.length);
                    context.pos += this.lineSeparator.length;
                    context.currentLinePos = 0;
                }
            }
            i3++;
            i = i5;
        }
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b) {
        if (b == 61) {
            return true;
        }
        if (b < 0) {
            return false;
        }
        byte[] bArr = DECODE_TABLE;
        return b < bArr.length && bArr[b] != -1;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = iBitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    private long validateCharacter(int i, BaseNCodec.Context context) {
        if ((context.ibitWorkArea & i) == 0) {
            return r3 >> i;
        }
        throw new IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible value");
    }

    @Override // com.huawei.cloud.base.util.base64.BaseNCodec
    public void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        byte b;
        if (context.eof) {
            return;
        }
        if (i2 < 0) {
            context.eof = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] bArrEnsureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == this.pad) {
                context.eof = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (context.modulus + 1) % 4;
                    context.modulus = i5;
                    int i6 = (context.ibitWorkArea << 6) + b;
                    context.ibitWorkArea = i6;
                    if (i5 == 0) {
                        int i7 = context.pos;
                        int i8 = i7 + 1;
                        context.pos = i8;
                        bArrEnsureBufferSize[i7] = (byte) ((i6 >> 16) & 255);
                        int i9 = i7 + 2;
                        context.pos = i9;
                        bArrEnsureBufferSize[i8] = (byte) ((i6 >> 8) & 255);
                        context.pos = i7 + 3;
                        bArrEnsureBufferSize[i9] = (byte) (i6 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] bArrEnsureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i10 = context.modulus;
        if (i10 != 1) {
            if (i10 == 2) {
                validateCharacter(4, context);
                int i11 = context.ibitWorkArea >> 4;
                context.ibitWorkArea = i11;
                int i12 = context.pos;
                context.pos = i12 + 1;
                bArrEnsureBufferSize2[i12] = (byte) (i11 & 255);
                return;
            }
            if (i10 != 3) {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
            validateCharacter(2, context);
            int i13 = context.ibitWorkArea;
            int i14 = i13 >> 2;
            context.ibitWorkArea = i14;
            int i15 = context.pos;
            int i16 = i15 + 1;
            context.pos = i16;
            bArrEnsureBufferSize2[i15] = (byte) ((i13 >> 10) & 255);
            context.pos = i15 + 2;
            bArrEnsureBufferSize2[i16] = (byte) (i14 & 255);
        }
    }

    @Override // com.huawei.cloud.base.util.base64.BaseNCodec
    public void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i2 < 0) {
            getContext(context);
        } else {
            getContext2(bArr, i, i2, context);
        }
    }

    @Override // com.huawei.cloud.base.util.base64.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return b < bArr.length && bArr[b] != -1;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static boolean isBase64(String str) {
        return isBase64(C17869dy.m76774a(str));
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !BaseNCodec.isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, CHUNK_SEPARATOR, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("lineSeparator must not contain base64 characters: [", C17869dy.m76776b(bArr), "]"));
            }
            if (i > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }
}
