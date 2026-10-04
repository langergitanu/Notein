package ooOOoOoO;

import androidx.appcompat.widget.C21532OooOOo;
import java.io.EOFException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00OooO0.C25150OooO00o;
import oO00O.C32139OooO0Oo;
import oO00O.C32142OooO0oo;
import oO00O.C32168OoooO0;
import oO00O.EnumC32170OoooO0O;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0.C32269OooO0oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: ooOOoOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35155OooO0o0 implements InterfaceC35154OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32139OooO0Oo f126219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f126220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f126221OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f126222OooO0Oo;

    /* JADX INFO: renamed from: ooOOoOoO.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<oO00Oo0.OooO0OO, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ long f126223OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j) {
            super(1);
            this.f126223OooOo0o = j;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(oO00Oo0.OooO0OO oooO0OO) throws C32269OooO0oo {
            oO00Oo0.OooO0OO cipherLoop = oooO0OO;
            OooOOO0.OooO0oO(cipherLoop, "$this$cipherLoop");
            int i = cipherLoop.f115955OooOoOO;
            int i2 = cipherLoop.f115957OooOoo0 - i;
            long j = this.f126223OooOo0o;
            if (i2 > 8) {
                cipherLoop.f115955OooOoOO = i + 8;
                cipherLoop.f115953OooOoO.putLong(i, j);
            } else {
                C32271OooO00o c32271OooO00oO0Oo0oo = cipherLoop.o0Oo0oo(8);
                int i3 = c32271OooO00oO0Oo0oo.f115946OooO0OO;
                int i4 = c32271OooO00oO0Oo0oo.f115949OooO0o0 - i3;
                if (i4 < 8) {
                    throw new C32269OooO0oo("long integer", 8, i4);
                }
                c32271OooO00oO0Oo0oo.f115944OooO00o.putLong(i3, j);
                c32271OooO00oO0Oo0oo.OooO00o(8);
                cipherLoop.OooO00o();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C35155OooO0o0(C32139OooO0Oo suite, byte[] bArr) {
        OooOOO0.OooO0oO(suite, "suite");
        this.f126219OooO00o = suite;
        this.f126220OooO0O0 = bArr;
    }

    @Override // ooOOoOoO.InterfaceC35154OooO0o
    public final C32168OoooO0 OooO00o(C32168OoooO0 record) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        OooOOO0.OooO0oO(record, "record");
        C32266OooO0Oo c32266OooO0Oo = record.f115399OooO0OO;
        int iOooo0 = (int) c32266OooO0Oo.Oooo0();
        long j = this.f126222OooO0Oo;
        C32139OooO0Oo c32139OooO0Oo = this.f126219OooO00o;
        Cipher cipher = Cipher.getInstance(c32139OooO0Oo.f115251OooO0o0);
        OooOOO0.OooO0Oo(cipher);
        byte[] bArr = this.f126220OooO0O0;
        SecretKeySpec secretKeySpecOooO00o = C32142OooO0oo.OooO00o(c32139OooO0Oo, bArr);
        int i = (c32139OooO0Oo.f115259OooOOOO * 2) + (c32139OooO0Oo.f115260OooOOOo * 2);
        int i2 = c32139OooO0Oo.f115252OooO0oO;
        byte[] bArrCopyOf = Arrays.copyOf(Oooo.OooO0OO.OooOO0O(bArr, i, i + i2), c32139OooO0Oo.f115253OooO0oo);
        OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, newSize)");
        C35151OooO0O0.OooO00o(j, bArrCopyOf, i2);
        cipher.init(1, secretKeySpecOooO00o, new GCMParameterSpec(c32139OooO0Oo.f115245OooO * 8, bArrCopyOf));
        byte[] bArr2 = new byte[13];
        C35151OooO0O0.OooO00o(j, bArr2, 0);
        EnumC32170OoooO0O enumC32170OoooO0O = record.f115397OooO00o;
        bArr2[8] = (byte) enumC32170OoooO0O.f115416OooOo0o;
        bArr2[9] = 3;
        bArr2[10] = 3;
        C35151OooO0O0.OooO0O0(bArr2, (short) iOooo0);
        cipher.updateAAD(bArr2);
        C32266OooO0Oo c32266OooO0OoOooO00o = C35153OooO0Oo.OooO00o(c32266OooO0Oo, cipher, new OooO00o(this.f126222OooO0Oo));
        this.f126222OooO0Oo++;
        return new C32168OoooO0(enumC32170OoooO0O, c32266OooO0OoOooO00o, 2);
    }

    @Override // ooOOoOoO.InterfaceC35154OooO0o
    public final C32168OoooO0 OooO0O0(C32168OoooO0 record) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, EOFException, InvalidAlgorithmParameterException {
        long j;
        OooOOO0.OooO0oO(record, "record");
        C32266OooO0Oo c32266OooO0Oo = record.f115399OooO0OO;
        long jOooo0 = c32266OooO0Oo.Oooo0();
        int i = c32266OooO0Oo.f115968OooOoOO;
        int i2 = c32266OooO0Oo.f115966OooOoO;
        if (i - i2 > 8) {
            c32266OooO0Oo.f115966OooOoO = i2 + 8;
            j = c32266OooO0Oo.f115967OooOoO0.getLong(i2);
        } else {
            C32271OooO00o c32271OooO00oOoOO = c32266OooO0Oo.ooOO(8);
            if (c32271OooO00oOoOO == null) {
                C25150OooO00o.OooO0o0(8);
                throw null;
            }
            int i3 = c32271OooO00oOoOO.f115945OooO0O0;
            if (c32271OooO00oOoOO.f115946OooO0OO - i3 < 8) {
                throw new EOFException("Not enough bytes to read a long integer of size 8.");
            }
            long j2 = c32271OooO00oOoOO.f115944OooO00o.getLong(i3);
            c32271OooO00oOoOO.OooO0OO(8);
            C32273OooO0Oo.OooO00o(c32266OooO0Oo, c32271OooO00oOoOO);
            j = j2;
        }
        long j3 = this.f126221OooO0OO;
        this.f126221OooO0OO = 1 + j3;
        C32139OooO0Oo c32139OooO0Oo = this.f126219OooO00o;
        Cipher cipher = Cipher.getInstance(c32139OooO0Oo.f115251OooO0o0);
        OooOOO0.OooO0Oo(cipher);
        byte[] bArr = this.f126220OooO0O0;
        SecretKeySpec secretKeySpecOooO0O0 = C32142OooO0oo.OooO0O0(c32139OooO0Oo, bArr);
        int i4 = (c32139OooO0Oo.f115259OooOOOO * 2) + (c32139OooO0Oo.f115260OooOOOo * 2);
        int i5 = c32139OooO0Oo.f115252OooO0oO;
        byte[] bArrOooOO0O = Oooo.OooO0OO.OooOO0O(bArr, i4 + i5, (i5 * 2) + i4);
        int i6 = c32139OooO0Oo.f115253OooO0oo;
        byte[] bArrCopyOf = Arrays.copyOf(bArrOooOO0O, i6);
        OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, newSize)");
        C35151OooO0O0.OooO00o(j, bArrCopyOf, i5);
        int i7 = c32139OooO0Oo.f115245OooO;
        cipher.init(2, secretKeySpecOooO0O0, new GCMParameterSpec(i7 * 8, bArrCopyOf));
        int i8 = (((int) jOooo0) - (i6 - i5)) - i7;
        if (i8 >= 65536) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(i8, "Content size should fit in 2 bytes, actual: ").toString());
        }
        byte[] bArr2 = new byte[13];
        C35151OooO0O0.OooO00o(j3, bArr2, 0);
        EnumC32170OoooO0O enumC32170OoooO0O = record.f115397OooO00o;
        bArr2[8] = (byte) enumC32170OoooO0O.f115416OooOo0o;
        bArr2[9] = 3;
        bArr2[10] = 3;
        C35151OooO0O0.OooO0O0(bArr2, (short) i8);
        cipher.updateAAD(bArr2);
        return new C32168OoooO0(enumC32170OoooO0O, record.f115398OooO0O0, C35153OooO0Oo.OooO00o(c32266OooO0Oo, cipher, C35152OooO0OO.f126217OooOo0o));
    }
}
