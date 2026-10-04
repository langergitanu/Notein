package o0ooo000;

import OooOOO0.AbstractC20449OooO0Oo;
import Oooo0oo.AbstractC21138OooO0oo;
import android.util.Log;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o0000Ooo.C24239OooOOO0;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31449OooOOo0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31460OooO0o0;
import o0ooOO0o.C31611OooO00o;
import o0oooOO0.C31835OooO00o;

/* JADX INFO: renamed from: o0ooo000.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31745OooOO0O {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final byte[] f113370OooOO0O = {115, 65, 108, 84};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C31441OooOO0 f113371OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public byte[] f113373OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f113375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f113376OooO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C31441OooOO0 f113380OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public short f113372OooO00o = 40;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C31735OooO f113374OooO0OO = new C31735OooO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Set<AbstractC31434OooO0O0> f113377OooO0o0 = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AbstractC20449OooO0Oo f113378OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C31736OooO00o f113379OooO0oo = null;

    public static boolean OooO0oO(boolean z, byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
        if (!z) {
            new SecureRandom().nextBytes(bArr);
            outputStream.write(bArr);
            return true;
        }
        int length = bArr.length;
        while (length > 0) {
            int i = byteArrayInputStream.read(bArr, bArr.length - length, length);
            if (i < 0) {
                break;
            }
            length -= i;
        }
        if (length == 0) {
            return false;
        }
        if (length == bArr.length) {
            return true;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(length, "AES initialization vector not fully read: only ", " bytes read instead of ");
        sbOooO0OO.append(bArr.length);
        throw new IOException(sbOooO0OO.toString());
    }

    public abstract void OooO(C31739OooO0Oo c31739OooO0Oo, C31433OooO00o c31433OooO00o, AbstractC21138OooO0oo abstractC21138OooO0oo) throws IOException;

    public final void OooO00o(AbstractC31434OooO0O0 abstractC31434OooO0O0, long j, long j2) throws IOException {
        boolean z = abstractC31434OooO0O0 instanceof C31450OooOOoo;
        Set<AbstractC31434OooO0O0> set = this.f113377OooO0o0;
        if (!z) {
            if (abstractC31434OooO0O0 instanceof C31448OooOOo) {
                if (set.contains(abstractC31434OooO0O0)) {
                    return;
                }
                set.add(abstractC31434OooO0O0);
                OooO0OO((C31448OooOOo) abstractC31434OooO0O0, j, j2);
                return;
            }
            if (abstractC31434OooO0O0 instanceof C31436OooO0Oo) {
                OooO0O0((C31436OooO0Oo) abstractC31434OooO0O0, j, j2);
                return;
            }
            if (abstractC31434OooO0O0 instanceof C31433OooO00o) {
                C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0;
                for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
                    OooO00o(c31433OooO00o.Oooo0(i), j, j2);
                }
                return;
            }
            return;
        }
        if (set.contains(abstractC31434OooO0O0)) {
            return;
        }
        set.add(abstractC31434OooO0O0);
        C31450OooOOoo c31450OooOOoo = (C31450OooOOoo) abstractC31434OooO0O0;
        if (C31441OooOO0.f112310o000O.equals(this.f113380OooOO0)) {
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c31450OooOOoo.f112480OooOo);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO0Oo(j, j2, byteArrayInputStream, byteArrayOutputStream, true);
            c31450OooOOoo.f112480OooOo = (byte[]) byteArrayOutputStream.toByteArray().clone();
        } catch (IOException e) {
            Log.e("PdfBox-Android", "Failed to decrypt COSString of length " + c31450OooOOoo.f112480OooOo.length + " in object " + j + ": " + e.getMessage());
        }
    }

    public final void OooO0O0(C31436OooO0Oo c31436OooO0Oo, long j, long j2) throws IOException {
        long j3;
        long j4;
        if (c31436OooO0Oo.o0OoO0o(C31441OooOO0.f112270OooooOo) != null) {
            return;
        }
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(C31441OooOO0.f112403o00OO);
        boolean z = C31441OooOO0.f112395o00O0o0O.equals(abstractC31434OooO0O0O0000O0O) || C31441OooOO0.f112299o0000Ooo.equals(abstractC31434OooO0O0O0000O0O) || ((c31436OooO0Oo.o0000O0O(C31441OooOO0.f112439o00ooo) instanceof C31450OooOOoo) && (c31436OooO0Oo.o0000O0O(C31441OooOO0.f112264OoooOoO) instanceof C31433OooO00o));
        for (Map.Entry entry : c31436OooO0Oo.f112222OooOoO0.entrySet()) {
            if (!z || !C31441OooOO0.f112439o00ooo.equals(entry.getKey())) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) entry.getValue();
                if ((abstractC31434OooO0O0 instanceof C31450OooOOoo) || (abstractC31434OooO0O0 instanceof C31433OooO00o) || (abstractC31434OooO0O0 instanceof C31436OooO0Oo)) {
                    j3 = j;
                    j4 = j2;
                    OooO00o(abstractC31434OooO0O0, j3, j4);
                } else {
                    j3 = j;
                    j4 = j2;
                }
                j = j3;
                j2 = j4;
            }
        }
    }

    public final void OooO0OO(C31448OooOOo c31448OooOOo, long j, long j2) throws IOException {
        if (C31441OooOO0.f112310o000O.equals(this.f113371OooO)) {
            return;
        }
        C31441OooOO0 c31441OooOO0O0Oo0oo = c31448OooOOo.o0Oo0oo(C31441OooOO0.f112403o00OO);
        if ((this.f113375OooO0Oo || !C31441OooOO0.f112350o000o0o.equals(c31441OooOO0O0Oo0oo)) && !C31441OooOO0.f112430o00Oo000.equals(c31441OooOO0O0Oo0oo)) {
            if (C31441OooOO0.f112350o000o0o.equals(c31441OooOO0O0Oo0oo)) {
                C31460OooO0o0 c31460OooO0o0Oooo00o = c31448OooOOo.oooo00o();
                int i = 10;
                byte[] bArr = new byte[10];
                while (i > 0) {
                    int i2 = c31460OooO0o0Oooo00o.read(bArr, 10 - i, i);
                    if (i2 < 0) {
                        break;
                    } else {
                        i -= i2;
                    }
                }
                c31460OooO0o0Oooo00o.close();
                if (Arrays.equals(bArr, "<?xpacket ".getBytes(C31835OooO00o.f113459OooO0Oo))) {
                    Log.w("PdfBox-Android", "Metadata is not encrypted, but was expected to be");
                    Log.w("PdfBox-Android", "Read PDF specification about EncryptMetadata (default value: true)");
                    return;
                }
            }
            OooO0O0(c31448OooOOo, j, j2);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C31455OooO00o.OooO0Oo(c31448OooOOo.oooo00o()));
            C31449OooOOo0 c31449OooOOo0O000o0O0 = c31448OooOOo.o000o0O0();
            try {
                try {
                    OooO0Oo(j, j2, byteArrayInputStream, c31449OooOOo0O000o0O0, true);
                } catch (IOException e) {
                    Log.e("PdfBox-Android", e.getClass().getSimpleName() + " thrown when decrypting object " + j + " " + j2 + " obj");
                    throw e;
                }
            } finally {
                c31449OooOOo0O000o0O0.close();
            }
        }
    }

    public final void OooO0Oo(long j, long j2, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream, boolean z) throws IOException {
        if (this.f113376OooO0o && this.f113373OooO0O0.length == 32) {
            byte[] bArr = new byte[16];
            if (OooO0oO(z, bArr, byteArrayInputStream, outputStream)) {
                try {
                    byte[] bArr2 = this.f113373OooO0O0;
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(z ? 2 : 1, new SecretKeySpec(bArr2, AES256KeyLoader.AES_ALGORITHM), new IvParameterSpec(bArr));
                    CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipher);
                    try {
                        try {
                            C31455OooO00o.OooO0OO(cipherInputStream, outputStream);
                        } catch (IOException e) {
                            if (!(e.getCause() instanceof GeneralSecurityException)) {
                                throw e;
                            }
                            Log.d("PdfBox-Android", "A GeneralSecurityException occurred when decrypting some stream data", e);
                        }
                    } finally {
                        cipherInputStream.close();
                    }
                } catch (GeneralSecurityException e2) {
                    throw new IOException(e2);
                }
            }
        } else {
            byte[] bArr3 = this.f113373OooO0O0;
            int length = bArr3.length;
            int i = length + 5;
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            bArr4[length] = (byte) (j & 255);
            bArr4[length + 1] = (byte) ((j >> 8) & 255);
            bArr4[length + 2] = (byte) ((j >> 16) & 255);
            bArr4[length + 3] = (byte) (j2 & 255);
            bArr4[length + 4] = (byte) ((j2 >> 8) & 255);
            MessageDigest messageDigestOooO0Oo = C24239OooOOO0.OooO0Oo();
            messageDigestOooO0Oo.update(bArr4);
            if (this.f113376OooO0o) {
                messageDigestOooO0Oo.update(f113370OooOO0O);
            }
            byte[] bArrDigest = messageDigestOooO0Oo.digest();
            int iMin = Math.min(i, 16);
            byte[] bArr5 = new byte[iMin];
            System.arraycopy(bArrDigest, 0, bArr5, 0, iMin);
            if (this.f113376OooO0o) {
                byte[] bArr6 = new byte[16];
                if (OooO0oO(z, bArr6, byteArrayInputStream, outputStream)) {
                    try {
                        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher2.init(z ? 2 : 1, new SecretKeySpec(bArr5, AES256KeyLoader.AES_ALGORITHM), new IvParameterSpec(bArr6));
                        byte[] bArr7 = new byte[256];
                        while (true) {
                            int i2 = byteArrayInputStream.read(bArr7);
                            if (i2 == -1) {
                                break;
                            }
                            byte[] bArrUpdate = cipher2.update(bArr7, 0, i2);
                            if (bArrUpdate != null) {
                                outputStream.write(bArrUpdate);
                            }
                        }
                        outputStream.write(cipher2.doFinal());
                    } catch (GeneralSecurityException e3) {
                        throw new IOException(e3);
                    }
                }
            } else {
                OooO0o0(bArr5, byteArrayInputStream, outputStream);
            }
        }
        outputStream.flush();
    }

    public final void OooO0o(byte[] bArr, byte[] bArr2, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        C31735OooO c31735OooO = this.f113374OooO0OO;
        c31735OooO.OooO00o(bArr);
        for (byte b : bArr2) {
            c31735OooO.OooO0O0(b, byteArrayOutputStream);
        }
    }

    public final void OooO0o0(byte[] bArr, ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) throws IOException {
        C31735OooO c31735OooO = this.f113374OooO0OO;
        c31735OooO.OooO00o(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = byteArrayInputStream.read(bArr2);
            if (i == -1) {
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                c31735OooO.OooO0O0(bArr2[i2], outputStream);
            }
        }
    }

    public abstract void OooO0oo(C31611OooO00o c31611OooO00o) throws IOException;
}
