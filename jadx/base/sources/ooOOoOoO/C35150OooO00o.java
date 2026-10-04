package ooOOoOoO;

import Oooo0.C20855OooooOO;
import com.aspose.words.internal.C22245OooO0oO;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00OooO0.C25150OooO00o;
import o00oo0O0.C25667OooOO0o;
import oO00O.C32139OooO0Oo;
import oO00O.C32142OooO0oo;
import oO00O.C32166Oooo0oo;
import oO00O.C32168OoooO0;
import oO00O.EnumC32170OoooO0O;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.OooOO0;
import oO0o0O0o.C33580OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OOo.C33702OooOOO;
import oOo0000O.OooO;
import oOo00Oo0.C34511OooOOOo;
import oOo00Oo0.OooOo00;

/* JADX INFO: renamed from: ooOOoOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35150OooO00o implements InterfaceC35154OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f126205OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32139OooO0Oo f126206OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f126207OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Cipher f126208OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SecretKeySpec f126209OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Cipher f126210OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Mac f126211OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SecretKeySpec f126212OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Mac f126213OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f126214OooOO0;

    /* JADX INFO: renamed from: ooOOoOoO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20381OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<oO00Oo0.OooO0OO, C32460OooOooO> {
        public C20381OooO00o() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(oO00Oo0.OooO0OO oooO0OO) {
            oO00Oo0.OooO0OO cipherLoop = oooO0OO;
            OooOOO0.OooO0oO(cipherLoop, "$this$cipherLoop");
            byte[] iv = C35150OooO00o.this.f126208OooO0OO.getIV();
            OooOOO0.OooO0o(iv, "sendCipher.iv");
            C25667OooOO0o.OooO0Oo(cipherLoop, iv, 0, iv.length);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C35150OooO00o(C32139OooO0Oo suite, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException {
        OooOOO0.OooO0oO(suite, "suite");
        this.f126206OooO00o = suite;
        this.f126207OooO0O0 = bArr;
        String str = suite.f115251OooO0o0;
        Cipher cipher = Cipher.getInstance(str);
        OooOOO0.OooO0Oo(cipher);
        this.f126208OooO0OO = cipher;
        this.f126209OooO0Oo = C32142OooO0oo.OooO00o(suite, bArr);
        String str2 = suite.f115254OooOO0;
        Mac mac = Mac.getInstance(str2);
        OooOOO0.OooO0Oo(mac);
        this.f126211OooO0o0 = mac;
        Cipher cipher2 = Cipher.getInstance(str);
        OooOOO0.OooO0Oo(cipher2);
        this.f126210OooO0o = cipher2;
        this.f126212OooO0oO = C32142OooO0oo.OooO0O0(suite, bArr);
        Mac mac2 = Mac.getInstance(str2);
        OooOOO0.OooO0Oo(mac2);
        this.f126213OooO0oo = mac2;
    }

    @Override // ooOOoOoO.InterfaceC35154OooO0o
    public final C32168OoooO0 OooO00o(C32168OoooO0 record) throws InvalidKeyException, InvalidAlgorithmParameterException {
        OooOOO0.OooO0oO(record, "record");
        SecretKeySpec secretKeySpec = this.f126209OooO0Oo;
        C32139OooO0Oo c32139OooO0Oo = this.f126206OooO00o;
        int i = c32139OooO0Oo.f115252OooO0oO;
        char[] cArr = C34511OooOOOo.f123686OooO00o;
        oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
        while (oooO0OO.o00Oo0() < i) {
            try {
                String str = (String) C33702OooOOO.OooO0O0(OooOo00.f123702OooO0O0.OooO0oo());
                if (str == null) {
                    OooOo00.f123703OooO0OO.start();
                    str = (String) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new oOo00Oo0.OooOOOO(2, null));
                }
                C25150OooO00o.OooO(oooO0OO, str, 0, str.length(), C33580OooO00o.f121231OooO0O0);
            } finally {
            }
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(C25150OooO00o.OooO0o(i, oooO0OO.ooOO()));
        Cipher cipher = this.f126208OooO0OO;
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrOooO0oO = C25150OooO00o.OooO0oO(record.f115399OooO0OO);
        Mac mac = this.f126211OooO0o0;
        mac.reset();
        byte[] bArr = C32142OooO0oo.f115268OooO00o;
        mac.init(new SecretKeySpec(this.f126207OooO0O0, 0, c32139OooO0Oo.f115260OooOOOo, C22245OooO0oO.OooO0O0(c32139OooO0Oo.f115256OooOO0o)));
        byte[] bArr2 = new byte[13];
        C35151OooO0O0.OooO00o(this.f126214OooOO0, bArr2, 0);
        EnumC32170OoooO0O enumC32170OoooO0O = record.f115397OooO00o;
        bArr2[8] = (byte) enumC32170OoooO0O.f115416OooOo0o;
        bArr2[9] = 3;
        bArr2[10] = 3;
        C35151OooO0O0.OooO0O0(bArr2, (short) bArrOooO0oO.length);
        this.f126214OooOO0++;
        mac.update(bArr2);
        byte[] bArrDoFinal = mac.doFinal(bArrOooO0oO);
        OooOOO0.OooO0o(bArrDoFinal, "sendMac.doFinal(content)");
        oooO0OO = new oO00Oo0.OooO0OO(null);
        try {
            C25667OooOO0o.OooO0Oo(oooO0OO, bArrOooO0oO, 0, bArrOooO0oO.length);
            C25667OooOO0o.OooO0Oo(oooO0OO, bArrDoFinal, 0, bArrDoFinal.length);
            byte blockSize = (byte) (cipher.getBlockSize() - ((oooO0OO.o00Oo0() + 1) % cipher.getBlockSize()));
            int i2 = blockSize + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                oooO0OO.o00000oO(blockSize);
            }
            return new C32168OoooO0(enumC32170OoooO0O, C35153OooO0Oo.OooO00o(oooO0OO.ooOO(), cipher, new C20381OooO00o()), 2);
        } finally {
            oooO0OO.close();
        }
    }

    @Override // ooOOoOoO.InterfaceC35154OooO0o
    public final C32168OoooO0 OooO0O0(C32168OoooO0 record) throws C32166Oooo0oo, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrOooOO0O;
        OooOOO0.OooO0oO(record, "record");
        C32139OooO0Oo c32139OooO0Oo = this.f126206OooO00o;
        int i = c32139OooO0Oo.f115252OooO0oO;
        C32266OooO0Oo c32266OooO0Oo = record.f115399OooO0OO;
        byte[] bArrOooO0o = C25150OooO00o.OooO0o(i, c32266OooO0Oo);
        SecretKeySpec secretKeySpec = this.f126212OooO0oO;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrOooO0o);
        Cipher cipher = this.f126210OooO0o;
        cipher.init(2, secretKeySpec, ivParameterSpec);
        byte[] bArrOooO0oO = C25150OooO00o.OooO0oO(C35153OooO0Oo.OooO00o(c32266OooO0Oo, cipher, C35152OooO0OO.f126217OooOo0o));
        int length = (bArrOooO0oO.length - (bArrOooO0oO[bArrOooO0oO.length - 1] & 255)) - 1;
        int i2 = c32139OooO0Oo.f115260OooOOOo;
        int i3 = length - i2;
        int i4 = bArrOooO0oO[bArrOooO0oO.length - 1] & 255;
        int length2 = bArrOooO0oO.length;
        while (length < length2) {
            int i5 = bArrOooO0oO[length] & 255;
            if (i4 != i5) {
                throw new C32166Oooo0oo(C20855OooooOO.OooO0OO(i4, i5, "Padding invalid: expected ", ", actual "), 0);
            }
            length++;
        }
        Mac mac = this.f126213OooO0oo;
        mac.reset();
        byte[] bArr = C32142OooO0oo.f115268OooO00o;
        mac.init(new SecretKeySpec(this.f126207OooO0O0, i2, i2, C22245OooO0oO.OooO0O0(c32139OooO0Oo.f115256OooOO0o)));
        byte[] bArr2 = new byte[13];
        C35151OooO0O0.OooO00o(this.f126205OooO, bArr2, 0);
        EnumC32170OoooO0O enumC32170OoooO0O = record.f115397OooO00o;
        bArr2[8] = (byte) enumC32170OoooO0O.f115416OooOo0o;
        bArr2[9] = 3;
        bArr2[10] = 3;
        C35151OooO0O0.OooO0O0(bArr2, (short) i3);
        this.f126205OooO++;
        mac.update(bArr2);
        mac.update(bArrOooO0oO, 0, i3);
        byte[] bArrDoFinal = mac.doFinal();
        OooOOO0.OooO0Oo(bArrDoFinal);
        oO0O00oo.OooO indices = OooOO0.OooO(i3, i2 + i3);
        OooOOO0.OooO0oO(indices, "indices");
        if (indices.isEmpty()) {
            bArrOooOO0O = new byte[0];
        } else {
            bArrOooOO0O = Oooo.OooO0OO.OooOO0O(bArrOooO0oO, indices.f116812OooOo0o, indices.f116811OooOo + 1);
        }
        if (!MessageDigest.isEqual(bArrDoFinal, bArrOooOO0O)) {
            throw new C32166Oooo0oo("Failed to verify MAC content", 0);
        }
        oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
        try {
            C25667OooOO0o.OooO0Oo(oooO0OO, bArrOooO0oO, 0, i3);
            return new C32168OoooO0(enumC32170OoooO0O, record.f115398OooO0O0, oooO0OO.ooOO());
        } catch (Throwable th) {
            oooO0OO.close();
            throw th;
        }
    }
}
