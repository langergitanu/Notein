package oOo00OoO;

import OooO0Oo.C20398OooO0O0;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.common.primitives.UnsignedBytes;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import o000oo0.C24684Oooo;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import ooOOoOOO.C35147OooO0O0;

/* JADX INFO: renamed from: oOo00OoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34527OooO0oO implements Serializable, Comparable<C34527OooO0oO> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C34527OooO0oO f123734OooOoO = new C34527OooO0oO(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient int f123735OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f123736OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public transient String f123737OooOoO0;

    /* JADX INFO: renamed from: oOo00OoO.OooO0oO$OooO00o */
    public static final class OooO00o {
        public static C34527OooO0oO OooO00o(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (C35147OooO0O0.OooO00o(str.charAt(i2 + 1)) + (C35147OooO0O0.OooO00o(str.charAt(i2)) << 4));
            }
            return new C34527OooO0oO(bArr);
        }

        public static C34527OooO0oO OooO0O0(String str) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
            byte[] bytes = str.getBytes(C33580OooO00o.f121231OooO0O0);
            kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
            C34527OooO0oO c34527OooO0oO = new C34527OooO0oO(bytes);
            c34527OooO0oO.f123737OooOoO0 = str;
            return c34527OooO0oO;
        }
    }

    public C34527OooO0oO(byte[] data) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        this.f123736OooOo0o = data;
    }

    public static final C34527OooO0oO OooO0oO(byte... data) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, size)");
        return new C34527OooO0oO(bArrCopyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        C34527OooO0oO c34527OooO0oO = new C34527OooO0oO(bArr);
        Field declaredField = C34527OooO0oO.class.getDeclaredField("OooOo0o");
        declaredField.setAccessible(true);
        declaredField.set(this, c34527OooO0oO.f123736OooOo0o);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f123736OooOo0o.length);
        objectOutputStream.write(this.f123736OooOo0o);
    }

    public boolean OooO(int i, byte[] other, int i2, int i3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f123736OooOo0o;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && C34522OooO0O0.OooO00o(i, i2, i3, bArr, other);
    }

    public String OooO00o() {
        byte[] bArr = this.f123736OooOo0o;
        byte[] map = C34521OooO00o.f123716OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(bArr, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr2[i2] = map[(b & 255) >> 2];
            bArr2[i2 + 1] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr2[i2] = map[(b4 & 255) >> 2];
            bArr2[i2 + 1] = map[(b4 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr2[i2] = map[(b5 & 255) >> 2];
            bArr2[i2 + 1] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i2 + 2] = map[(b6 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        return new String(bArr2, C33580OooO00o.f121231OooO0O0);
    }

    public C34527OooO0oO OooO0O0(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f123736OooOo0o, 0, OooO0OO());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.OooOOO0.OooO0o(digestBytes, "digestBytes");
        return new C34527OooO0oO(digestBytes);
    }

    public int OooO0OO() {
        return this.f123736OooOo0o.length;
    }

    public String OooO0Oo() {
        byte[] bArr = this.f123736OooOo0o;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = C35147OooO0O0.f126203OooO00o;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte OooO0o(int i) {
        return this.f123736OooOo0o[i];
    }

    public byte[] OooO0o0() {
        return this.f123736OooOo0o;
    }

    public boolean OooO0oo(int i, C34527OooO0oO other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        return other.OooO(0, this.f123736OooOo0o, 0, i);
    }

    public final boolean OooOO0(C34527OooO0oO prefix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(prefix, "prefix");
        return OooO0oo(prefix.OooO0OO(), prefix);
    }

    public C34527OooO0oO OooOO0O() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f123736OooOo0o;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C34527OooO0oO(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] OooOO0o() {
        byte[] bArr = this.f123736OooOo0o;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public void OooOOO(C34524OooO0Oo buffer, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        buffer.o000O00O(this.f123736OooOo0o, 0, i);
    }

    public final String OooOOO0() {
        String str = this.f123737OooOoO0;
        if (str != null) {
            return str;
        }
        byte[] bArrOooO0o0 = OooO0o0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(bArrOooO0o0, "<this>");
        String str2 = new String(bArrOooO0o0, C33580OooO00o.f121231OooO0O0);
        this.f123737OooOoO0 = str2;
        return str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C34527OooO0oO c34527OooO0oO) {
        C34527OooO0oO other = c34527OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        int iOooO0OO = OooO0OO();
        int iOooO0OO2 = other.OooO0OO();
        int iMin = Math.min(iOooO0OO, iOooO0OO2);
        for (int i = 0; i < iMin; i++) {
            int iOooO0o = OooO0o(i) & 255;
            int iOooO0o2 = other.OooO0o(i) & 255;
            if (iOooO0o != iOooO0o2) {
                return iOooO0o < iOooO0o2 ? -1 : 1;
            }
        }
        if (iOooO0OO == iOooO0OO2) {
            return 0;
        }
        return iOooO0OO < iOooO0OO2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34527OooO0oO) {
            C34527OooO0oO c34527OooO0oO = (C34527OooO0oO) obj;
            int iOooO0OO = c34527OooO0oO.OooO0OO();
            byte[] bArr = this.f123736OooOo0o;
            if (iOooO0OO == bArr.length && c34527OooO0oO.OooO(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f123735OooOo;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f123736OooOo0o);
        this.f123735OooOo = iHashCode;
        return iHashCode;
    }

    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.f123736OooOo0o;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        int i12 = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                                        i2 += 4;
                                        i4 = i12;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strOooOOO0 = OooOOO0();
            String strSubstring = strOooOOO0.substring(0, i3);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strOooOo0O = C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(strSubstring, "\\", "\\\\"), IOUtils.LINE_SEPARATOR_UNIX, "\\n"), "\r", "\\r");
            if (i3 >= strOooOOO0.length()) {
                return C24684Oooo.OooO00o(']', "[text=", strOooOo0O);
            }
            return "[size=" + this.f123736OooOo0o.length + " text=" + strOooOo0O + "…]";
        }
        if (this.f123736OooOo0o.length <= 64) {
            return "[hex=" + OooO0Oo() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.f123736OooOo0o.length);
        sb.append(" hex=");
        int iOooO0OO = 64 == C34522OooO0O0.f123718OooO0O0 ? OooO0OO() : 64;
        byte[] bArr2 = this.f123736OooOo0o;
        if (iOooO0OO > bArr2.length) {
            throw new IllegalArgumentException(C20398OooO0O0.OooO00o(')', new StringBuilder("endIndex > length("), this.f123736OooOo0o.length).toString());
        }
        if (iOooO0OO < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb.append((iOooO0OO == bArr2.length ? this : new C34527OooO0oO(Oooo.OooO0OO.OooOO0O(bArr2, 0, iOooO0OO))).OooO0Oo());
        sb.append("…]");
        return sb.toString();
    }
}
