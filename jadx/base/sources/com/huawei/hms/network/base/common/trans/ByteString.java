package com.huawei.hms.network.base.common.trans;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21023OooO0Oo;
import OoooooO.C21421OooO0oO;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final int REPLACEMENT_CHARACTER = 65533;

    /* JADX INFO: renamed from: d */
    private static final String f54059d = "ByteString";

    /* JADX INFO: renamed from: f */
    private static final long f54061f = 1;

    /* JADX INFO: renamed from: a */
    final byte[] f54062a;

    /* JADX INFO: renamed from: b */
    transient int f54063b;

    /* JADX INFO: renamed from: c */
    transient String f54064c;

    /* JADX INFO: renamed from: e */
    static final char[] f54060e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ByteString EMPTY = m77755of(new byte[0]);

    public ByteString(byte[] bArr) {
        this.f54062a = bArr;
    }

    /* JADX INFO: renamed from: a */
    private static int m77746a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            throw new IllegalArgumentException(C21421OooO0oO.OooO00o("Unexpected hex digit: ", c));
        }
        return c - '7';
    }

    public static ByteString decodeBase64(String str) {
        byte[] bArrDecode;
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        try {
            bArrDecode = Base64.decode(str);
        } catch (IllegalArgumentException unused) {
            Logger.m76960e(f54059d, "An exception occurred while decoding string with Base64");
            bArrDecode = null;
        }
        if (bArrDecode != null) {
            return new ByteString(bArrDecode);
        }
        return null;
    }

    public static ByteString decodeHex(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m77746a(str.charAt(i2)) << 4) + m77746a(str.charAt(i2 + 1)));
        }
        return m77755of(bArr);
    }

    public static ByteString encodeString(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new ByteString(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    public static ByteString encodeUtf8(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        ByteString byteString = new ByteString(str.getBytes(Charset.forName("UTF-8")));
        byteString.f54064c = str;
        return byteString;
    }

    /* JADX INFO: renamed from: of */
    public static ByteString m77754of(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("data == null");
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new ByteString(bArr);
    }

    public static ByteString read(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return new ByteString(bArr);
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.f54062a).asReadOnlyBuffer();
    }

    public String base64() {
        return Base64.encode(this.f54062a);
    }

    public String base64Url() {
        return Base64.encodeUrl(this.f54062a);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i2 = getByte(i) & 255;
            int i3 = byteString.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            byte[] bArr = this.f54062a;
            if (size == bArr.length && byteString.rangeEquals(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte getByte(int i) {
        return this.f54062a[i];
    }

    public int hashCode() {
        int i = this.f54063b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f54062a);
        this.f54063b = iHashCode;
        return iHashCode;
    }

    public String hex() {
        byte[] bArr = this.f54062a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f54060e;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public ByteString hmacSha1(ByteString byteString) {
        return m77749a("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        return m77749a(KeyUtil.HMAC_ALGORITHM, byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        return m77749a("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        return indexOf(byteString.m77757a(), 0);
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf(byteString.m77757a(), size());
    }

    public ByteString md5() {
        return m77748a("MD5");
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        return byteString.rangeEquals(i2, this.f54062a, i, i3);
    }

    public ByteString sha1() {
        return m77748a(IDevicePopManager.SHA_1);
    }

    public ByteString sha256() {
        return m77748a(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }

    public ByteString sha512() {
        return m77748a("SHA-512");
    }

    public int size() {
        return this.f54062a.length;
    }

    public final boolean startsWith(ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.f54062a, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public ByteString substring(int i) {
        return substring(i, this.f54062a.length);
    }

    public ByteString toAsciiLowercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f54062a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(bArr2);
            }
            i++;
        }
    }

    public ByteString toAsciiUppercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f54062a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 97 && b <= 122) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArr2[i2] = (byte) (b2 - 32);
                    }
                }
                return new ByteString(bArr2);
            }
            i++;
        }
    }

    public byte[] toByteArray() {
        return (byte[]) this.f54062a.clone();
    }

    public String toString() {
        if (this.f54062a.length == 0) {
            return "[size=0]";
        }
        String strUtf8 = utf8();
        int iM77747a = m77747a(strUtf8, 64);
        if (iM77747a != -1) {
            String strReplace = StringUtils.replace(StringUtils.replace(StringUtils.replace(StringUtils.substring(strUtf8, 0, iM77747a), "\\", "\\\\"), IOUtils.LINE_SEPARATOR_UNIX, "\\n"), "\r", "\\r");
            if (iM77747a >= strUtf8.length()) {
                return C20593OooO0Oo.OooO0O0("[text=", strReplace, "]");
            }
            return "[size=" + this.f54062a.length + " text=" + strReplace + "…]";
        }
        if (this.f54062a.length <= 64) {
            return "[hex=" + hex() + "]";
        }
        return "[size=" + this.f54062a.length + " hex=" + substring(0, 64).hex() + "…]";
    }

    public String utf8() {
        String str = this.f54064c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f54062a, Charset.forName("UTF-8"));
        this.f54064c = str2;
        return str2;
    }

    public void write(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        outputStream.write(this.f54062a);
    }

    /* JADX INFO: renamed from: of */
    public static ByteString m77755of(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(ByteString byteString, int i) {
        return indexOf(byteString.m77757a(), i);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        return lastIndexOf(byteString.m77757a(), i);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f54062a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && m77753a(bArr2, i, bArr, i2, i3);
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public ByteString substring(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f54062a;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(")", this.f54062a.length, new StringBuilder("endIndex > length(")));
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new ByteString(bArr2);
    }

    /* JADX INFO: renamed from: of */
    public static ByteString m77756of(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        m77750a(bArr.length, i, i2);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ByteString(bArr2);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public int indexOf(byte[] bArr, int i) {
        int length = this.f54062a.length - bArr.length;
        for (int iMax = Math.max(i, 0); iMax <= length; iMax++) {
            if (m77753a(this.f54062a, iMax, bArr, 0, bArr.length)) {
                return iMax;
            }
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        for (int iMin = Math.min(i, this.f54062a.length - bArr.length); iMin >= 0; iMin--) {
            if (m77753a(this.f54062a, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m77747a(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }

    /* JADX INFO: renamed from: a */
    private ByteString m77748a(String str) {
        try {
            return m77755of(MessageDigest.getInstance(str).digest(this.f54062a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private ByteString m77749a(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            return m77755of(mac.doFinal(this.f54062a));
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m77750a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(StringUtils.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77751a(ObjectInputStream objectInputStream) throws IOException {
        ByteString byteString = read(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = ByteString.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, byteString.f54062a);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77752a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f54062a.length);
        objectOutputStream.write(this.f54062a);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m77753a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m77757a() {
        return this.f54062a;
    }
}
