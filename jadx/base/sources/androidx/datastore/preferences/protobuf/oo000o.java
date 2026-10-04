package androidx.datastore.preferences.protobuf;

import Oooo0.C20855OooooOO;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f64604OooO00o;

    public static class OooO00o {
        public static boolean OooO00o(byte b) {
            return b > -65;
        }
    }

    public static abstract class OooO0O0 {
        public abstract String OooO00o(byte[] bArr, int i, int i2) throws C21807OooOoOO;

        public abstract int OooO0O0(String str, byte[] bArr, int i, int i2);
    }

    public static final class OooO0OO extends OooO0O0 {
        @Override // androidx.datastore.preferences.protobuf.oo000o.OooO0O0
        public final String OooO00o(byte[] bArr, int i, int i2) throws C21807OooOoOO {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    while (i5 < i3) {
                        byte b3 = bArr[i5];
                        if (b3 < 0) {
                            break;
                        }
                        i5++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                    i4 = i6;
                    i = i5;
                } else if (b2 < -32) {
                    if (i5 >= i3) {
                        throw C21807OooOoOO.OooO00o();
                    }
                    i += 2;
                    byte b4 = bArr[i5];
                    int i7 = i4 + 1;
                    if (b2 < -62 || OooO00o.OooO00o(b4)) {
                        throw C21807OooOoOO.OooO00o();
                    }
                    cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                    i4 = i7;
                } else {
                    if (b2 >= -16) {
                        if (i5 >= i3 - 2) {
                            throw C21807OooOoOO.OooO00o();
                        }
                        byte b5 = bArr[i5];
                        int i8 = i + 3;
                        byte b6 = bArr[i + 2];
                        i += 4;
                        byte b7 = bArr[i8];
                        int i9 = i4 + 1;
                        if (!OooO00o.OooO00o(b5)) {
                            if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !OooO00o.OooO00o(b6) && !OooO00o.OooO00o(b7)) {
                                int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                cArr[i9] = (char) ((i10 & 1023) + 56320);
                                i4 += 2;
                            }
                        }
                        throw C21807OooOoOO.OooO00o();
                    }
                    if (i5 >= i3 - 1) {
                        throw C21807OooOoOO.OooO00o();
                    }
                    int i11 = i + 2;
                    byte b8 = bArr[i5];
                    i += 3;
                    byte b9 = bArr[i11];
                    int i12 = i4 + 1;
                    if (OooO00o.OooO00o(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || OooO00o.OooO00o(b9)))) {
                        throw C21807OooOoOO.OooO00o();
                    }
                    cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                    i4 = i12;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.oo000o.OooO0O0
        public final int OooO0O0(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | JSONParser.MODE_JSON_SIMPLE);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new C21847OooO0Oo(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new C21847OooO0Oo(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.oo000o$OooO0Oo, reason: case insensitive filesystem */
    public static class C21847OooO0Oo extends IllegalArgumentException {
        public C21847OooO0Oo(int i, int i2) {
            super(C20855OooooOO.OooO0OO(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.oo000o$OooO0o0, reason: case insensitive filesystem */
    public static final class C21848OooO0o0 extends OooO0O0 {
        @Override // androidx.datastore.preferences.protobuf.oo000o.OooO0O0
        public final String OooO00o(byte[] bArr, int i, int i2) throws C21807OooOoOO {
            Charset charset = C21805OooOoO.f64482OooO00o;
            String str = new String(bArr, i, i2, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw C21807OooOoOO.OooO00o();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.oo000o.OooO0O0
        public final int OooO0O0(String str, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                C21843o00ooo.OooOO0(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    C21843o00ooo.OooOO0(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new C21847OooO0Oo(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                C21843o00ooo.OooOO0(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                C21843o00ooo.OooOO0(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                C21843o00ooo.OooOO0(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                C21843o00ooo.OooOO0(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C21847OooO0Oo(i4 - 1, length);
                    }
                    C21843o00ooo.OooOO0(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    C21843o00ooo.OooOO0(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    C21843o00ooo.OooOO0(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    C21843o00ooo.OooOO0(bArr, j4, (byte) ((cCharAt2 >>> 6) | JSONParser.MODE_JSON_SIMPLE));
                    j4 += 2;
                    C21843o00ooo.OooOO0(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }
    }

    static {
        f64604OooO00o = (C21843o00ooo.f64587OooO0o0 && C21843o00ooo.f64585OooO0Oo && !C21790OooO0Oo.OooO00o()) ? new C21848OooO0o0() : new OooO0OO();
    }

    public static int OooO00o(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new C21847OooO0Oo(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }
}
