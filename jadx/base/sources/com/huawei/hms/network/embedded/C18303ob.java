package com.huawei.hms.network.embedded;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21023OooO0Oo;
import OoooooO.C21421OooO0oO;
import androidx.appcompat.widget.C21532OooOOo;
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

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ob */
/* JADX INFO: loaded from: classes9.dex */
public class C18303ob implements Serializable, Comparable<C18303ob> {

    /* JADX INFO: renamed from: e */
    public static final long f55842e = 1;

    /* JADX INFO: renamed from: a */
    public final byte[] f55844a;

    /* JADX INFO: renamed from: b */
    public transient int f55845b;

    /* JADX INFO: renamed from: c */
    public transient String f55846c;

    /* JADX INFO: renamed from: d */
    public static final char[] f55841d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: f */
    public static final C18303ob f55843f = m79300e(new byte[0]);

    public C18303ob(byte[] bArr) {
        this.f55844a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public byte mo78716a(int i) {
        return this.f55844a[i];
    }

    /* JADX INFO: renamed from: b */
    public final int m79304b(C18303ob c18303ob, int i) {
        return mo78725b(c18303ob.mo78732e(), i);
    }

    /* JADX INFO: renamed from: c */
    public final int m79307c(byte[] bArr) {
        return mo78725b(bArr, mo78736j());
    }

    /* JADX INFO: renamed from: d */
    public C18303ob mo78730d(C18303ob c18303ob) {
        return m79291a(KeyUtil.HMAC_ALGORITHM, c18303ob);
    }

    /* JADX INFO: renamed from: e */
    public C18303ob m79309e(C18303ob c18303ob) {
        return m79291a("HmacSHA512", c18303ob);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18303ob) {
            C18303ob c18303ob = (C18303ob) obj;
            int iMo78736j = c18303ob.mo78736j();
            byte[] bArr = this.f55844a;
            if (iMo78736j == bArr.length && c18303ob.mo78724a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m79310f(C18303ob c18303ob) {
        return mo78717a(c18303ob.mo78732e(), 0);
    }

    /* JADX INFO: renamed from: g */
    public final int m79311g(C18303ob c18303ob) {
        return mo78725b(c18303ob.mo78732e(), mo78736j());
    }

    /* JADX INFO: renamed from: h */
    public C18303ob mo78735h() {
        return m79298c(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }

    public int hashCode() {
        int i = this.f55845b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f55844a);
        this.f55845b = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public C18303ob m79313i() {
        return m79298c("SHA-512");
    }

    /* JADX INFO: renamed from: j */
    public int mo78736j() {
        return this.f55844a.length;
    }

    /* JADX INFO: renamed from: k */
    public C18303ob mo78737k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f55844a;
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
                return new C18303ob(bArr2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l */
    public C18303ob mo78738l() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f55844a;
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
                return new C18303ob(bArr2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public byte[] mo78739m() {
        return (byte[]) this.f55844a.clone();
    }

    /* JADX INFO: renamed from: n */
    public String mo78740n() {
        String str = this.f55846c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f55844a, C18276mc.f55722a);
        this.f55846c = str2;
        return str2;
    }

    public String toString() {
        if (this.f55844a.length == 0) {
            return "[size=0]";
        }
        String strMo78740n = mo78740n();
        int iM79288a = m79288a(strMo78740n, 64);
        if (iM79288a != -1) {
            String strReplace = strMo78740n.substring(0, iM79288a).replace("\\", "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r");
            if (iM79288a >= strMo78740n.length()) {
                return C20593OooO0Oo.OooO0O0("[text=", strReplace, "]");
            }
            return "[size=" + this.f55844a.length + " text=" + strReplace + "…]";
        }
        if (this.f55844a.length <= 64) {
            return "[hex=" + mo78731d() + "]";
        }
        return "[size=" + this.f55844a.length + " hex=" + mo78718a(0, 64).mo78731d() + "…]";
    }

    /* JADX INFO: renamed from: a */
    public static int m79287a(char c) {
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

    /* JADX INFO: renamed from: d */
    public static C18303ob m79299d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C18303ob c18303ob = new C18303ob(str.getBytes(C18276mc.f55722a));
        c18303ob.f55846c = str;
        return c18303ob;
    }

    /* JADX INFO: renamed from: e */
    public static C18303ob m79300e(byte... bArr) {
        if (bArr != null) {
            return new C18303ob((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* JADX INFO: renamed from: b */
    public final int m79305b(byte[] bArr) {
        return mo78717a(bArr, 0);
    }

    /* JADX INFO: renamed from: c */
    public C18303ob mo78728c(C18303ob c18303ob) {
        return m79291a("HmacSHA1", c18303ob);
    }

    /* JADX INFO: renamed from: f */
    public C18303ob mo78733f() {
        return m79298c("MD5");
    }

    /* JADX INFO: renamed from: g */
    public C18303ob mo78734g() {
        return m79298c(IDevicePopManager.SHA_1);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m79312h(C18303ob c18303ob) {
        return mo78723a(0, c18303ob, 0, c18303ob.mo78736j());
    }

    /* JADX INFO: renamed from: c */
    private C18303ob m79298c(String str) {
        try {
            return m79300e(MessageDigest.getInstance(str).digest(this.f55844a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo78725b(byte[] bArr, int i) {
        for (int iMin = Math.min(i, this.f55844a.length - bArr.length); iMin >= 0; iMin--) {
            if (C18276mc.m79204a(this.f55844a, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public String mo78731d() {
        byte[] bArr = this.f55844a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f55841d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: e */
    public byte[] mo78732e() {
        return this.f55844a;
    }

    /* JADX INFO: renamed from: b */
    public C18303ob mo78726b(int i) {
        return mo78718a(i, this.f55844a.length);
    }

    /* JADX INFO: renamed from: c */
    public String mo78729c() {
        return C18247kb.m78992b(this.f55844a);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m79308d(byte[] bArr) {
        return mo78724a(0, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: b */
    public static C18303ob m79297b(String str) {
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
            bArr[i] = (byte) (m79287a(str.charAt(i2 + 1)) + (m79287a(str.charAt(i2)) << 4));
        }
        return m79300e(bArr);
    }

    /* JADX INFO: renamed from: b */
    public String mo78727b() {
        return C18247kb.m78989a(this.f55844a);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m79306b(C18303ob c18303ob) {
        return mo78723a(mo78736j() - c18303ob.mo78736j(), c18303ob, 0, c18303ob.mo78736j());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C18303ob c18303ob) {
        int iMo78736j = mo78736j();
        int iMo78736j2 = c18303ob.mo78736j();
        int iMin = Math.min(iMo78736j, iMo78736j2);
        for (int i = 0; i < iMin; i++) {
            int iMo78716a = mo78716a(i) & 255;
            int iMo78716a2 = c18303ob.mo78716a(i) & 255;
            if (iMo78716a != iMo78716a2) {
                return iMo78716a < iMo78716a2 ? -1 : 1;
            }
        }
        if (iMo78736j == iMo78736j2) {
            return 0;
        }
        return iMo78736j < iMo78736j2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m79302a(C18303ob c18303ob, int i) {
        return mo78717a(c18303ob.mo78732e(), i);
    }

    /* JADX INFO: renamed from: a */
    public static int m79288a(String str, int i) {
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
    public int mo78717a(byte[] bArr, int i) {
        int length = this.f55844a.length - bArr.length;
        for (int iMax = Math.max(i, 0); iMax <= length; iMax++) {
            if (C18276mc.m79204a(this.f55844a, iMax, bArr, 0, bArr.length)) {
                return iMax;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public C18303ob mo78718a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f55844a;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(")", this.f55844a.length, new StringBuilder("endIndex > length(")));
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
        return new C18303ob(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public static C18303ob m79289a(InputStream inputStream, int i) throws IOException {
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
        return new C18303ob(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C18303ob m79290a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] bArrM78991a = C18247kb.m78991a(str);
        if (bArrM78991a != null) {
            return new C18303ob(bArrM78991a);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private C18303ob m79291a(String str, C18303ob c18303ob) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c18303ob.mo78739m(), str));
            return m79300e(mac.doFinal(this.f55844a));
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18303ob m79292a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new C18303ob(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* JADX INFO: renamed from: a */
    public static C18303ob m79293a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("data == null");
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new C18303ob(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C18303ob m79294a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        C18276mc.m79202a(bArr.length, i, i2);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C18303ob(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public String mo78719a(Charset charset) {
        if (charset != null) {
            return new String(this.f55844a, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer mo78720a() {
        return ByteBuffer.wrap(this.f55844a).asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: a */
    public void mo78721a(C18261lb c18261lb) {
        byte[] bArr = this.f55844a;
        c18261lb.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    private void m79295a(ObjectInputStream objectInputStream) throws IOException {
        C18303ob c18303obM79289a = m79289a(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = C18303ob.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, c18303obM79289a.f55844a);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79296a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f55844a.length);
        objectOutputStream.write(this.f55844a);
    }

    /* JADX INFO: renamed from: a */
    public void mo78722a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        outputStream.write(this.f55844a);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo78723a(int i, C18303ob c18303ob, int i2, int i3) {
        return c18303ob.mo78724a(i2, this.f55844a, i, i3);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo78724a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f55844a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C18276mc.m79204a(bArr2, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m79303a(byte[] bArr) {
        return mo78724a(mo78736j() - bArr.length, bArr, 0, bArr.length);
    }
}
