package o0ooo000;

import Oooo0.C20855OooooOO;
import Oooo0oo.AbstractC21138OooO0oo;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.PatternStyle;
import com.aspose.words.ControlChar;
import com.google.common.primitives.UnsignedBytes;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o0000Ooo.C24239OooOOO0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooOO0o.C31611OooO00o;
import o0oooOO0.C31835OooO00o;

/* JADX INFO: renamed from: o0ooo000.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31749OooOOOO extends AbstractC31745OooOO0O {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final byte[] f113384OooOO0o = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, PatternStyle.Divot, PatternStyle.Divot, 0, -74, -48, 104, 62, UnsignedBytes.MAX_POWER_OF_TWO, PatternStyle.Shingle, 12, -87, -2, 100, 83, 105, 122};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String[] f113385OooOOO0 = {KeyUtil.HMAC_KEY_HASH_ALGORITHM, "SHA-384", "SHA-512"};

    public C31749OooOOOO() {
    }

    public static byte[] OooOO0(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6, int i2, int i3, boolean z, boolean z2) throws IOException {
        byte[] bArrOooOO0o;
        byte[] bArr7;
        if (i2 == 6 || i2 == 5) {
            if (z2) {
                if (bArr4 == null) {
                    throw new IOException("/Encrypt/OE entry is missing");
                }
                byte[] bArr8 = new byte[8];
                System.arraycopy(bArr2, 40, bArr8, 0, 8);
                bArrOooOO0o = i2 == 5 ? OooOO0o(bArr, bArr8, bArr3) : OooOO0O(bArr, bArr8, bArr3);
                bArr7 = bArr4;
            } else {
                if (bArr5 == null) {
                    throw new IOException("/Encrypt/UE entry is missing");
                }
                byte[] bArr9 = new byte[8];
                System.arraycopy(bArr3, 40, bArr9, 0, 8);
                bArrOooOO0o = i2 == 5 ? OooOO0o(bArr, bArr9, null) : OooOO0O(bArr, bArr9, null);
                bArr7 = bArr5;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(2, new SecretKeySpec(bArrOooOO0o, AES256KeyLoader.AES_ALGORITHM), new IvParameterSpec(new byte[16]));
                return cipher.doFinal(bArr7);
            } catch (GeneralSecurityException e) {
                OooOOOO();
                throw new IOException(e);
            }
        }
        byte[] bArr10 = new byte[32];
        int iMin = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr10, 0, iMin);
        System.arraycopy(f113384OooOO0o, 0, bArr10, iMin, 32 - iMin);
        MessageDigest messageDigestOooO0Oo = C24239OooOOO0.OooO0Oo();
        messageDigestOooO0Oo.update(bArr10);
        messageDigestOooO0Oo.update(bArr2);
        messageDigestOooO0Oo.update((byte) i);
        messageDigestOooO0Oo.update((byte) (i >>> 8));
        messageDigestOooO0Oo.update((byte) (i >>> 16));
        messageDigestOooO0Oo.update((byte) (i >>> 24));
        messageDigestOooO0Oo.update(bArr6);
        if (i2 == 4 && !z) {
            messageDigestOooO0Oo.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] bArrDigest = messageDigestOooO0Oo.digest();
        if (i2 == 3 || i2 == 4) {
            for (int i4 = 0; i4 < 50; i4++) {
                messageDigestOooO0Oo.update(bArrDigest, 0, i3);
                bArrDigest = messageDigestOooO0Oo.digest();
            }
        }
        byte[] bArr11 = new byte[i3];
        System.arraycopy(bArrDigest, 0, bArr11, 0, i3);
        return bArr11;
    }

    public static byte[] OooOO0O(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IOException {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else {
            if (bArr3.length < 48) {
                throw new IOException("Bad U length");
            }
            if (bArr3.length > 48) {
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArr3, 0, bArr4, 0, 48);
                bArr3 = bArr4;
            }
        }
        if (bArr.length > 127) {
            byte[] bArr5 = new byte[127];
            System.arraycopy(bArr, 0, bArr5, 0, 127);
            bArr = bArr5;
        }
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr6, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr6, bArr.length + bArr2.length, bArr3.length);
        try {
            byte[] bArrDigest = C24239OooOOO0.OooO0o().digest(bArr6);
            byte[] bArrDoFinal = null;
            int i = 0;
            while (true) {
                if (i >= 64 && (bArrDoFinal[bArrDoFinal.length - 1] & 255) <= i - 32) {
                    break;
                }
                byte[] bArr7 = bArr3.length >= 48 ? new byte[(bArr.length + bArrDigest.length + 48) * 64] : new byte[(bArr.length + bArrDigest.length) * 64];
                int length = 0;
                for (int i2 = 0; i2 < 64; i2++) {
                    System.arraycopy(bArr, 0, bArr7, length, bArr.length);
                    int length2 = length + bArr.length;
                    System.arraycopy(bArrDigest, 0, bArr7, length2, bArrDigest.length);
                    length = length2 + bArrDigest.length;
                    if (bArr3.length >= 48) {
                        System.arraycopy(bArr3, 0, bArr7, length, 48);
                        length += 48;
                    }
                }
                byte[] bArr8 = new byte[16];
                byte[] bArr9 = new byte[16];
                System.arraycopy(bArrDigest, 0, bArr8, 0, 16);
                System.arraycopy(bArrDigest, 16, bArr9, 0, 16);
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(1, new SecretKeySpec(bArr8, AES256KeyLoader.AES_ALGORITHM), new IvParameterSpec(bArr9));
                bArrDoFinal = cipher.doFinal(bArr7);
                byte[] bArr10 = new byte[16];
                System.arraycopy(bArrDoFinal, 0, bArr10, 0, 16);
                bArrDigest = MessageDigest.getInstance(f113385OooOOO0[new BigInteger(1, bArr10).mod(new BigInteger("3")).intValue()]).digest(bArrDoFinal);
                i++;
            }
            if (bArrDigest.length <= 32) {
                return bArrDigest;
            }
            byte[] bArr11 = new byte[32];
            System.arraycopy(bArrDigest, 0, bArr11, 0, 32);
            return bArr11;
        } catch (GeneralSecurityException e) {
            OooOOOO();
            throw new IOException(e);
        }
    }

    public static byte[] OooOO0o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        MessageDigest messageDigestOooO0o = C24239OooOOO0.OooO0o();
        messageDigestOooO0o.update(bArr);
        messageDigestOooO0o.update(bArr2);
        return bArr3 == null ? messageDigestOooO0o.digest() : messageDigestOooO0o.digest(bArr3);
    }

    public static void OooOOOO() {
        try {
            if (Cipher.getMaxAllowedKeyLength(AES256KeyLoader.AES_ALGORITHM) != Integer.MAX_VALUE) {
                Log.w("PdfBox-Android", "JCE unlimited strength jurisdiction policy files are not installed");
            }
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[PHI: r4
      0x009b: PHI (r4v26 int) = (r4v9 int), (r4v10 int), (r4v9 int) binds: [B:25:0x0076, B:30:0x0094, B:23:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x04cf A[Catch: GeneralSecurityException -> 0x04ef, TryCatch #0 {GeneralSecurityException -> 0x04ef, blocks: (B:376:0x04b3, B:378:0x04cf, B:380:0x04d3, B:383:0x04df, B:385:0x04e5, B:392:0x04f7, B:394:0x0512, B:396:0x0548, B:401:0x0556, B:399:0x0550, B:391:0x04f1), top: B:411:0x04b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x04f1 A[Catch: GeneralSecurityException -> 0x04ef, TryCatch #0 {GeneralSecurityException -> 0x04ef, blocks: (B:376:0x04b3, B:378:0x04cf, B:380:0x04d3, B:383:0x04df, B:385:0x04e5, B:392:0x04f7, B:394:0x0512, B:396:0x0548, B:401:0x0556, B:399:0x0550, B:391:0x04f1), top: B:411:0x04b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0512 A[Catch: GeneralSecurityException -> 0x04ef, TryCatch #0 {GeneralSecurityException -> 0x04ef, blocks: (B:376:0x04b3, B:378:0x04cf, B:380:0x04d3, B:383:0x04df, B:385:0x04e5, B:392:0x04f7, B:394:0x0512, B:396:0x0548, B:401:0x0556, B:399:0x0550, B:391:0x04f1), top: B:411:0x04b3 }] */
    @Override // o0ooo000.AbstractC31745OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO(C31739OooO0Oo c31739OooO0Oo, C31433OooO00o c31433OooO00o, AbstractC21138OooO0oo abstractC21138OooO0oo) throws IOException {
        C31738OooO0OO c31738OooO0OOOooO00o;
        int i;
        byte[] bArr;
        byte[] bArr2;
        char c;
        int i2;
        byte[] bArr3;
        char c2;
        byte[] bArr4;
        boolean zEquals;
        char c3;
        char c4;
        char c5;
        char c6;
        int i3;
        char c7;
        int i4;
        byte[] bArrDoFinal;
        int i5;
        int i6;
        int i7;
        if (!(abstractC21138OooO0oo instanceof C31748OooOOO0)) {
            throw new IOException("Decryption material is not compatible with the document");
        }
        int iOooO0OO = c31739OooO0Oo.OooO0OO();
        C31436OooO0Oo c31436OooO0Oo = c31739OooO0Oo.f113368OooOo0o;
        if (iOooO0OO >= 4) {
            C31441OooOO0 c31441OooOO0 = (C31441OooOO0) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112399o00O0oOo);
            if (c31441OooOO0 == null) {
                c31441OooOO0 = C31441OooOO0.f112310o000O;
            }
            this.f113371OooO = c31441OooOO0;
            C31441OooOO0 c31441OooOO02 = (C31441OooOO0) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112401o00O0oo0);
            if (c31441OooOO02 == null) {
                c31441OooOO02 = C31441OooOO0.f112310o000O;
            }
            this.f113380OooOO0 = c31441OooOO02;
        }
        this.f113375OooO0Oo = c31739OooO0Oo.OooO0Oo();
        String strNormalize = ((C31748OooOOO0) abstractC21138OooO0oo).f113383OooO00o;
        if (strNormalize == null) {
            strNormalize = "";
        }
        int iO000O00O = c31436OooO0Oo.o000O00O(C31441OooOO0.o00O00, null, 0);
        int iO000O00O2 = c31436OooO0Oo.o000O00O(C31441OooOO0.f112456oo0o0O0, null, 0);
        int iO000O00O3 = c31739OooO0Oo.OooO0OO() == 1 ? 5 : c31436OooO0Oo.o000O00O(C31441OooOO0.f112340o000OooO, null, 40) / 8;
        if ((c31739OooO0Oo.OooO0OO() == 4 || c31739OooO0Oo.OooO0OO() == 5) && (c31738OooO0OOOooO00o = c31739OooO0Oo.OooO00o(C31441OooOO0.f112397o00O0oO)) != null) {
            C31441OooOO0 c31441OooOO03 = (C31441OooOO0) c31738OooO0OOOooO00o.f113366OooOo0o.o0000O0O(C31441OooOO0.f112272Oooooo0);
            if (C31441OooOO0.f112244OooOooo.equals(c31441OooOO03)) {
                this.f113376OooO0o = true;
                iO000O00O3 = 16;
            }
            if (C31441OooOO0.f112247Oooo000.equals(c31441OooOO03)) {
                this.f113376OooO0o = true;
                i = 32;
            } else {
                i = iO000O00O3;
            }
        }
        byte[] bArr5 = (c31433OooO00o == null || c31433OooO00o.f112214OooOo.size() < 1) ? new byte[0] : ((C31450OooOOoo) c31433OooO00o.Oooo0OO(0)).f112480OooOo;
        boolean zOooO0Oo = c31739OooO0Oo.OooO0Oo();
        C31450OooOOoo c31450OooOOoo = (C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112447o0o0Oo);
        byte[] bArr6 = c31450OooOOoo != null ? c31450OooOOoo.f112480OooOo : null;
        C31450OooOOoo c31450OooOOoo2 = (C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112363o000ooOO);
        byte[] bArr7 = c31450OooOOoo2 != null ? c31450OooOOoo2.f112480OooOo : null;
        Charset charset = C31835OooO00o.f113459OooO0Oo;
        if (iO000O00O2 == 6 || iO000O00O2 == 5) {
            charset = C31835OooO00o.f113460OooO0o;
            C31450OooOOoo c31450OooOOoo3 = (C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112415o00OOO);
            byte[] bArr8 = c31450OooOOoo3 != null ? c31450OooOOoo3.f112480OooOo : null;
            C31450OooOOoo c31450OooOOoo4 = (C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112366o000oooO);
            bArr = c31450OooOOoo4 != null ? c31450OooOOoo4.f112480OooOo : null;
            bArr2 = bArr8;
        } else {
            bArr = null;
            bArr2 = null;
        }
        if (iO000O00O2 == 6) {
            char[] charArray = strNormalize.toCharArray();
            i2 = 32;
            for (int i8 = 0; i8 < strNormalize.length(); i8++) {
                if (C31744OooOO0.OooO00o(strNormalize.charAt(i8))) {
                    charArray[i8] = ControlChar.SPACE_CHAR;
                }
            }
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i7 = 8204;
                if (i9 >= strNormalize.length()) {
                    break;
                }
                char c8 = charArray[i9];
                if (c8 != 173 && c8 != 847 && c8 != 6150 && c8 != 6155 && c8 != 6156 && c8 != 6157 && c8 != 8203 && c8 != 8204 && c8 != 8205 && c8 != 8288 && ((65024 > c8 || c8 > 65039) && c8 != 65279)) {
                    charArray[i10] = c8;
                    i10++;
                }
                i9++;
            }
            strNormalize = Normalizer.normalize(CharBuffer.wrap(charArray, 0, i10), Normalizer.Form.NFKC);
            int iCharCount = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (iCharCount < strNormalize.length()) {
                int iCodePointAt = strNormalize.codePointAt(iCharCount);
                char c9 = (char) iCodePointAt;
                if (C31744OooOO0.OooO00o(c9) || ((c9 >= 0 && c9 <= 31) || c9 == 127 || ((128 <= iCodePointAt && iCodePointAt <= 159) || iCodePointAt == 1757 || iCodePointAt == 1807 || iCodePointAt == 6158 || iCodePointAt == i7 || iCodePointAt == 8205 || iCodePointAt == 8232 || iCodePointAt == 8233 || iCodePointAt == 8288 || iCodePointAt == 8289 || iCodePointAt == 8290 || iCodePointAt == 8291 || ((8298 <= iCodePointAt && iCodePointAt <= 8303) || iCodePointAt == 65279 || ((65529 <= iCodePointAt && iCodePointAt <= 65532) || ((119155 <= iCodePointAt && iCodePointAt <= 119162) || ((57344 <= iCodePointAt && iCodePointAt <= 63743) || ((983040 <= iCodePointAt && iCodePointAt <= 1048573) || ((1048576 <= iCodePointAt && iCodePointAt <= 1114109) || ((64976 <= iCodePointAt && iCodePointAt <= 65007) || ((65534 <= iCodePointAt && iCodePointAt <= 65535) || ((131070 <= iCodePointAt && iCodePointAt <= 131071) || ((196606 <= iCodePointAt && iCodePointAt <= 196607) || ((262142 <= iCodePointAt && iCodePointAt <= 262143) || ((327678 <= iCodePointAt && iCodePointAt <= 327679) || ((393214 <= iCodePointAt && iCodePointAt <= 393215) || ((458750 <= iCodePointAt && iCodePointAt <= 458751) || ((524286 <= iCodePointAt && iCodePointAt <= 524287) || ((589822 <= iCodePointAt && iCodePointAt <= 589823) || ((655358 <= iCodePointAt && iCodePointAt <= 655359) || ((720894 <= iCodePointAt && iCodePointAt <= 720895) || ((786430 <= iCodePointAt && iCodePointAt <= 786431) || ((851966 <= iCodePointAt && iCodePointAt <= 851967) || ((917502 <= iCodePointAt && iCodePointAt <= 917503) || ((983038 <= iCodePointAt && iCodePointAt <= 983039) || ((1048574 <= iCodePointAt && iCodePointAt <= 1048575) || ((1114110 <= iCodePointAt && iCodePointAt <= 1114111) || ((55296 <= iCodePointAt && iCodePointAt <= 57343) || iCodePointAt == 65529 || iCodePointAt == 65530 || iCodePointAt == 65531 || iCodePointAt == 65532 || iCodePointAt == 65533 || ((12272 <= iCodePointAt && iCodePointAt <= 12283) || iCodePointAt == 832 || iCodePointAt == 833 || iCodePointAt == 8206 || iCodePointAt == 8207 || iCodePointAt == 8234 || iCodePointAt == 8235 || iCodePointAt == 8236 || iCodePointAt == 8237 || iCodePointAt == 8238 || iCodePointAt == 8298 || iCodePointAt == 8299 || iCodePointAt == 8300 || iCodePointAt == 8301 || iCodePointAt == 8302 || iCodePointAt == 8303 || iCodePointAt == 917505 || (917536 <= iCodePointAt && iCodePointAt <= 917631)))))))))))))))))))))))))))))) {
                    throw new IllegalArgumentException(C20855OooooOO.OooO0OO(iCodePointAt, iCharCount, "Prohibited character ", " at position "));
                }
                byte directionality = Character.getDirectionality(iCodePointAt);
                boolean z4 = directionality == 1 || directionality == 2;
                z |= z4;
                z2 |= directionality == 0;
                z3 |= iCharCount == 0 && z4;
                iCharCount += Character.charCount(iCodePointAt);
                if (z3 && iCharCount >= strNormalize.length() && !z4) {
                    throw new IllegalArgumentException("First character is RandALCat, but last character is not");
                }
                i7 = 8204;
            }
            c = 2;
            if (z && z2) {
                throw new IllegalArgumentException("Contains both RandALCat characters and LCat characters");
            }
        } else {
            c = 2;
            i2 = 32;
        }
        String str = strNormalize;
        byte[] bytes = str.getBytes(charset);
        if (iO000O00O2 != 6 && iO000O00O2 != 5) {
            bArr4 = bArr6;
            zEquals = OooOOO(OooOOO0(iO000O00O2, bytes, bArr7, i), bArr4, bArr7, iO000O00O, bArr5, iO000O00O2, i, zOooO0Oo);
            bArr3 = bArr7;
            c2 = '\b';
            if (zEquals) {
            }
            if (iO000O00O2 != 6) {
            }
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(i4, new SecretKeySpec(this.f113373OooO0O0, AES256KeyLoader.AES_ALGORITHM));
            C31450OooOOoo c31450OooOOoo5 = (C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112381o00O0O00);
            bArrDoFinal = cipher.doFinal(c31450OooOOoo5 == null ? c31450OooOOoo5.f112480OooOo : null);
            if (bArrDoFinal[c5] == 97) {
                Log.w("PdfBox-Android", "Verification of permissions failed (constant)");
            }
            i5 = ((bArrDoFinal[i4] & 255) << 16) | (bArrDoFinal[0] & 255) | ((bArrDoFinal[c4] & 255) << 8) | ((bArrDoFinal[3] & 255) << 24);
            if (i5 != i3) {
            }
            if (zOooO0Oo) {
                return;
            } else {
                return;
            }
            Log.w("PdfBox-Android", "Verification of permissions failed (EncryptMetadata)");
        }
        bArr3 = bArr7;
        bArr4 = bArr6;
        if (bytes.length <= 127) {
            i6 = 0;
        } else {
            byte[] bArr9 = new byte[127];
            i6 = 0;
            System.arraycopy(bytes, 0, bArr9, 0, 127);
            bytes = bArr9;
        }
        int i11 = i2;
        byte[] bArr10 = new byte[i11];
        byte[] bArr11 = new byte[8];
        if (bArr3.length < 40) {
            throw new IOException("Owner password is too short");
        }
        System.arraycopy(bArr3, i6, bArr10, i6, i11);
        c2 = '\b';
        System.arraycopy(bArr3, i11, bArr11, i6, 8);
        zEquals = Arrays.equals(iO000O00O2 == 5 ? OooOO0o(bytes, bArr11, bArr4) : OooOO0O(bytes, bArr11, bArr4), bArr10);
        if (zEquals) {
            c3 = c2;
            byte[] bArr12 = bArr;
            c4 = 1;
            c5 = '\t';
            c6 = '\n';
            i3 = iO000O00O;
            c7 = ControlChar.LINE_BREAK_CHAR;
            if (!OooOOO(str.getBytes(charset), bArr4, bArr3, i3, bArr5, iO000O00O2, i, zOooO0Oo)) {
                throw new C31737OooO0O0("Cannot decrypt PDF, the password is incorrect");
            }
            C31736OooO00o c31736OooO00o = new C31736OooO00o();
            c31736OooO00o.f113364OooO00o = i3;
            c31736OooO00o.f113365OooO0O0 = true;
            this.f113379OooO0oo = c31736OooO00o;
            i4 = 2;
            this.f113373OooO0O0 = OooOO0(str.getBytes(charset), bArr3, bArr4, bArr12, bArr2, i3, bArr5, iO000O00O2, i, zOooO0Oo, false);
        } else {
            C31736OooO00o c31736OooO00o2 = new C31736OooO00o();
            c31736OooO00o2.f113365OooO0O0 = false;
            c31736OooO00o2.f113364OooO00o = -4;
            c31736OooO00o2.OooO00o(11, true);
            if (!c31736OooO00o2.f113365OooO0O0) {
                c31736OooO00o2.OooO00o(5, true);
            }
            if (!c31736OooO00o2.f113365OooO0O0) {
                c31736OooO00o2.OooO00o(10, true);
            }
            if (!c31736OooO00o2.f113365OooO0O0) {
                c31736OooO00o2.OooO00o(9, true);
            }
            if (!c31736OooO00o2.f113365OooO0O0) {
                c31736OooO00o2.OooO00o(4, true);
            }
            if (!c31736OooO00o2.f113365OooO0O0) {
                c31736OooO00o2.OooO00o(6, true);
            }
            if (!c31736OooO00o2.f113365OooO0O0) {
                c31736OooO00o2.OooO00o(3, true);
            }
            if (!c31736OooO00o2.f113365OooO0O0) {
                c31736OooO00o2.OooO00o(12, true);
            }
            this.f113379OooO0oo = c31736OooO00o2;
            c3 = c2;
            byte[] bArr13 = bArr;
            c4 = 1;
            i4 = 2;
            this.f113373OooO0O0 = OooOO0((iO000O00O2 == 6 || iO000O00O2 == 5) ? str.getBytes(charset) : OooOOO0(iO000O00O2, str.getBytes(charset), bArr3, i), bArr3, bArr4, bArr13, bArr2, iO000O00O, bArr5, iO000O00O2, i, zOooO0Oo, true);
            c5 = '\t';
            c6 = '\n';
            i3 = iO000O00O;
            c7 = ControlChar.LINE_BREAK_CHAR;
        }
        if (iO000O00O2 != 6 || iO000O00O2 == 5) {
            try {
                Cipher cipher2 = Cipher.getInstance("AES/ECB/NoPadding");
                cipher2.init(i4, new SecretKeySpec(this.f113373OooO0O0, AES256KeyLoader.AES_ALGORITHM));
                C31450OooOOoo c31450OooOOoo52 = (C31450OooOOoo) c31436OooO0Oo.o0000O0O(C31441OooOO0.f112381o00O0O00);
                bArrDoFinal = cipher2.doFinal(c31450OooOOoo52 == null ? c31450OooOOoo52.f112480OooOo : null);
                if (bArrDoFinal[c5] == 97 || bArrDoFinal[c6] != 100 || bArrDoFinal[c7] != 98) {
                    Log.w("PdfBox-Android", "Verification of permissions failed (constant)");
                }
                i5 = ((bArrDoFinal[i4] & 255) << 16) | (bArrDoFinal[0] & 255) | ((bArrDoFinal[c4] & 255) << 8) | ((bArrDoFinal[3] & 255) << 24);
                if (i5 != i3) {
                    Log.w("PdfBox-Android", "Verification of permissions failed (" + String.format("%08X", Integer.valueOf(i5)) + " != " + String.format("%08X", Integer.valueOf(i3)) + ")");
                }
                if ((zOooO0Oo || bArrDoFinal[c3] == 84) && (zOooO0Oo || bArrDoFinal[c3] == 70)) {
                    return;
                }
                Log.w("PdfBox-Android", "Verification of permissions failed (EncryptMetadata)");
            } catch (GeneralSecurityException e) {
                OooOOOO();
                throw new IOException(e);
            }
        }
    }

    @Override // o0ooo000.AbstractC31745OooOO0O
    public final void OooO0oo(C31611OooO00o c31611OooO00o) throws IOException {
        int i;
        int i2;
        C31739OooO0Oo c31739OooO0OoOooOOO0 = c31611OooO00o.OooOOO0();
        if (c31739OooO0OoOooOOO0 == null) {
            c31739OooO0OoOooOOO0 = new C31739OooO0Oo();
        }
        short s = this.f113372OooO00o;
        if (s == 40) {
            i = 1;
        } else {
            if (s == 128) {
                this.f113378OooO0oO.getClass();
            }
            i = this.f113372OooO00o == 256 ? 5 : 2;
        }
        ((C31747OooOOO) this.f113378OooO0oO).getClass();
        if (i < 2) {
            throw null;
        }
        if (i == 5) {
            i2 = 6;
        } else if (i == 4) {
            i2 = 4;
        } else {
            if (i != 2 && i != 3) {
                throw null;
            }
            i2 = 3;
        }
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112295o0000OOo;
        C31441OooOO0 c31441OooOO0OooOooo = C31441OooOO0.OooOooo("Standard");
        C31436OooO0Oo c31436OooO0Oo = c31739OooO0OoOooOOO0.f113368OooOo0o;
        c31436OooO0Oo.o000OoOO(c31441OooOO0, c31441OooOO0OooOooo);
        c31436OooO0Oo.o000Oo(C31441OooOO0.f112420o00OOOO0, i);
        if (i != 4 && i != 5) {
            c31436OooO0Oo.o000OoOO(C31441OooOO0.f112270OooooOo, null);
            c31436OooO0Oo.o000OoOO(C31441OooOO0.f112399o00O0oOo, null);
            c31436OooO0Oo.o000OoOO(C31441OooOO0.f112401o00O0oo0, null);
        }
        c31436OooO0Oo.o000Oo(C31441OooOO0.f112456oo0o0O0, i2);
        c31436OooO0Oo.o000Oo(C31441OooOO0.f112340o000OooO, this.f113372OooO00o);
        ((C31747OooOOO) this.f113378OooO0oO).getClass();
        throw null;
    }

    public final boolean OooOOO(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, int i3, boolean z) throws IOException {
        byte[] bArr5 = bArr;
        if (i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 != 5 && i2 != 6) {
                throw new IOException(C21532OooOOo.OooO0OO(i2, "Unknown Encryption Revision "));
            }
            if (bArr5.length > 127) {
                byte[] bArr6 = new byte[127];
                System.arraycopy(bArr5, 0, bArr6, 0, 127);
                bArr5 = bArr6;
            }
            byte[] bArr7 = new byte[32];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr2, 0, bArr7, 0, 32);
            System.arraycopy(bArr2, 32, bArr8, 0, 8);
            return Arrays.equals(i2 == 5 ? OooOO0o(bArr5, bArr8, null) : OooOO0O(bArr5, bArr8, null), bArr7);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArrOooOO0 = OooOO0(bArr5, bArr3, null, null, null, i, bArr4, i2, i3, z, true);
        byte[] bArr9 = f113384OooOO0o;
        if (i2 == 2) {
            OooO0o(bArrOooOO0, bArr9, byteArrayOutputStream);
        } else if (i2 == 3 || i2 == 4) {
            MessageDigest messageDigestOooO0Oo = C24239OooOOO0.OooO0Oo();
            messageDigestOooO0Oo.update(bArr9);
            messageDigestOooO0Oo.update(bArr4);
            byteArrayOutputStream.write(messageDigestOooO0Oo.digest());
            int length = bArrOooOO0.length;
            byte[] bArr10 = new byte[length];
            for (int i4 = 0; i4 < 20; i4++) {
                System.arraycopy(bArrOooOO0, 0, bArr10, 0, length);
                for (int i5 = 0; i5 < length; i5++) {
                    bArr10[i5] = (byte) (bArr10[i5] ^ i4);
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                OooO0o0(bArr10, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr11 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr11, 0, 16);
            System.arraycopy(bArr9, 0, bArr11, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr11);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return i2 == 2 ? Arrays.equals(bArr2, byteArray) : Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(byteArray, 16));
    }

    public final byte[] OooOOO0(int i, byte[] bArr, byte[] bArr2, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest messageDigestOooO0Oo = C24239OooOOO0.OooO0Oo();
        byte[] bArr3 = new byte[32];
        int iMin = Math.min(bArr.length, 32);
        System.arraycopy(bArr, 0, bArr3, 0, iMin);
        System.arraycopy(f113384OooOO0o, 0, bArr3, iMin, 32 - iMin);
        byte[] bArrDigest = messageDigestOooO0Oo.digest(bArr3);
        if (i == 3 || i == 4) {
            for (int i3 = 0; i3 < 50; i3++) {
                messageDigestOooO0Oo.update(bArrDigest, 0, i2);
                bArrDigest = messageDigestOooO0Oo.digest();
            }
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArrDigest, 0, bArr4, 0, i2);
        if (i == 2) {
            OooO0o(bArr4, bArr2, byteArrayOutputStream);
        } else if (i == 3 || i == 4) {
            byte[] bArr5 = new byte[i2];
            byte[] byteArray = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, byteArray, 0, bArr2.length);
            for (int i4 = 19; i4 >= 0; i4--) {
                System.arraycopy(bArr4, 0, bArr5, 0, i2);
                for (int i5 = 0; i5 < i2; i5++) {
                    bArr5[i5] = (byte) (bArr5[i5] ^ ((byte) i4));
                }
                byteArrayOutputStream.reset();
                OooO0o(bArr5, byteArray, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public C31749OooOOOO(C31747OooOOO c31747OooOOO) {
        this.f113378OooO0oO = c31747OooOOO;
        c31747OooOOO.getClass();
        this.f113372OooO00o = (short) 40;
    }
}
