package oO00000o;

import OooOoOO.C20519OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.PatternStyle;
import com.yubico.yubikit.core.smartcard.C23922OooO0o0;
import com.yubico.yubikit.core.smartcard.C23923OooO0oO;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import o000OoOO.C24539OooO0OO;
import o0ooooo.C31875OooO0O0;
import o0ooooo.EnumC31874OooO00o;
import o0oooooO.AbstractC31887OooO0O0;
import o0oooooO.AbstractC31890OooO0o;
import o0oooooO.C31886OooO00o;
import o0oooooO.C31888OooO0OO;
import oO00000.C31907OooO0o0;
import oO00000o.OooO0OO;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oO00000o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31909OooO0o0 extends AbstractC31887OooO0O0<C31909OooO0o0> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final AbstractC31890OooO0o.OooO00o f113766OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO00o f113768OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final byte[] f113769OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final byte[] f113770Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f113771Oooo00O;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31875OooO0O0 f113772OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C23923OooO0oO f113773OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f113774OooOoO0 = 3;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AbstractC31890OooO0o.OooO00o f113764OooOoO = new AbstractC31890OooO0o.OooO00o("Curve P384", 4, 0);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final AbstractC31890OooO0o.OooO00o f113765OooOoOO = new AbstractC31890OooO0o.OooO00o("PIN/Touch Policy", 4, 0);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final AbstractC31890OooO0o.OooO00o f113767OooOoo0 = new AbstractC31890OooO0o.OooO00o("Cached Touch Policy", 4, 3);

    /* JADX INFO: renamed from: oO00000o.OooO0o0$OooO00o */
    public class OooO00o extends AbstractC31890OooO0o<C31909OooO0o0> {
        @Override // o0oooooO.AbstractC31890OooO0o
        public final boolean OooO0O0(C31875OooO0O0 c31875OooO0O0) {
            return c31875OooO0O0.OooO0O0(4, 2, 6) < 0 || c31875OooO0O0.OooO0O0(4, 3, 5) >= 0;
        }
    }

    static {
        C31875OooO0O0.OooO00o(4);
        C31875OooO0O0.OooO00o(3);
        C31875OooO0O0.OooO00o(0);
        C31875OooO0O0.OooO00o(5);
        C31875OooO0O0.OooO00o(0);
        C31875OooO0O0.OooO00o(0);
        f113766OooOoo = new AbstractC31890OooO0o.OooO00o("Metadata", 5, 3);
        C31875OooO0O0.OooO00o(5);
        C31875OooO0O0.OooO00o(4);
        C31875OooO0O0.OooO00o(0);
        f113768OooOooO = new OooO00o("RSA key generation");
        f113769OooOooo = new byte[]{PatternStyle.Wave, 89, PatternStyle.Wave, 19, 6, 7, PatternStyle.Plaid, -122, 72, -50, 61, 2, 1, 6, 8, PatternStyle.Plaid, -122, 72, -50, 61, 3, 1, 7, 3, 66, 0};
        f113770Oooo000 = new byte[]{PatternStyle.Wave, 118, PatternStyle.Wave, 16, 6, 7, PatternStyle.Plaid, -122, 72, -50, 61, 2, 1, 6, 5, PatternStyle.Sphere, -127, 4, 0, 34, 3, 98, 0};
        f113771Oooo00O = C34354OooO0Oo.OooO0O0(C31909OooO0o0.class);
    }

    public C31909OooO0o0(com.yubico.yubikit.core.smartcard.OooO0o oooO0o) throws C31886OooO00o, com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
        C23923OooO0oO c23923OooO0oO = new C23923OooO0oO(oooO0o);
        this.f113773OooOo0o = c23923OooO0oO;
        try {
            c23923OooO0oO.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-92, 4, 0, C23922OooO0o0.f80302OooO00o));
            byte[] bArrOooO0OO = c23923OooO0oO.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-3, 0, 0, null));
            if (bArrOooO0OO.length < 3) {
                throw new IllegalArgumentException("Version byte array must contain 3 bytes.");
            }
            C31875OooO0O0 c31875OooO0O0 = new C31875OooO0O0(bArrOooO0OO[0], bArrOooO0OO[1], bArrOooO0OO[2]);
            this.f113772OooOo = c31875OooO0O0;
            if (oooO0o.o0OO00O() == EnumC31874OooO00o.f113571OooOo0o && c31875OooO0O0.OooO0O0(4, 2, 0) >= 0 && c31875OooO0O0.OooO0O0(4, 2, 7) < 0) {
                c23923OooO0oO.f80306OooOoO0 = true;
            }
            if (oooO0o.o000OO0O() && c31875OooO0O0.OooO0O0(4, 0, 0) >= 0) {
                c23923OooO0oO.f80303OooOo = com.yubico.yubikit.core.smartcard.OooO0OO.f80298OooOo;
            }
            C20519OooO0Oo.OooO0Oo(4, f113771Oooo00O, "PIV session initialized (version={})", c31875OooO0O0);
        } catch (com.yubico.yubikit.core.smartcard.OooO0O0 e) {
            short s = e.f80297OooOo0o;
            if (s != 27266 && s != 27904) {
                throw new IOException("Unexpected SW", e);
            }
            throw new C31886OooO00o("The application couldn't be selected", e);
        }
    }

    public static byte[] OooO0OO(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        if (byteArray.length > i) {
            return Arrays.copyOfRange(byteArray, byteArray.length - i, byteArray.length);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
        return bArr;
    }

    public static byte[] Oooo000(char[] cArr) {
        ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.encode(CharBuffer.wrap(cArr));
        try {
            int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
            if (iLimit > 8) {
                throw new IllegalArgumentException("PIN/PUK must be no longer than 8 bytes");
            }
            byte[] bArrCopyOf = Arrays.copyOf(byteBufferEncode.array(), 8);
            Arrays.fill(bArrCopyOf, iLimit, 8, (byte) -1);
            return bArrCopyOf;
        } finally {
            Arrays.fill(byteBufferEncode.array(), (byte) 0);
        }
    }

    public static PublicKey Oooo00o(OooO0OO oooO0OO, byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException {
        byte[] bArr2;
        int iOrdinal = oooO0OO.ordinal();
        if (iOrdinal == 2) {
            bArr2 = f113769OooOooo;
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported key type");
            }
            bArr2 = f113770Oooo000;
        }
        return KeyFactory.getInstance(oooO0OO.f113744OooOo.f113751OooO00o.name()).generatePublic(new X509EncodedKeySpec(ByteBuffer.allocate(bArr2.length + bArr.length).put(bArr2).put(bArr).array()));
    }

    public final void OooOOO0(OooO0OO oooO0OO, EnumC31908OooO0Oo enumC31908OooO0Oo, EnumC31911OooO0oo enumC31911OooO0oo, boolean z) {
        C31875OooO0O0 c31875OooO0O0 = this.f113772OooOo;
        if (c31875OooO0O0.f113574OooOo0o == 0) {
            return;
        }
        if (oooO0OO == OooO0OO.ECCP384) {
            OooO00o(f113764OooOoO);
        }
        if (enumC31908OooO0Oo != EnumC31908OooO0Oo.DEFAULT || enumC31911OooO0oo != EnumC31911OooO0oo.DEFAULT) {
            OooO00o(f113765OooOoOO);
            if (enumC31911OooO0oo == EnumC31911OooO0oo.CACHED) {
                OooO00o(f113767OooOoo0);
            }
        }
        if (z && oooO0OO.f113744OooOo.f113751OooO00o == OooO0OO.OooO00o.f113747OooOo0o) {
            OooO00o(f113768OooOooO);
        }
        if (c31875OooO0O0.OooO0O0(4, 4, 0) < 0 || c31875OooO0O0.OooO0O0(4, 5, 0) >= 0) {
            return;
        }
        if (oooO0OO == OooO0OO.RSA1024) {
            throw new UnsupportedOperationException("RSA 1024 is not supported on YubiKey FIPS");
        }
        if (enumC31908OooO0Oo == EnumC31908OooO0Oo.NEVER) {
            throw new UnsupportedOperationException("PinPolicy.NEVER is not allowed on YubiKey FIPS");
        }
    }

    public final X509Certificate OooOOo0(OooO0o oooO0o) throws C31888OooO0OO, com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = f113771Oooo00O;
        C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "Reading certificate in slot {}", oooO0o);
        int i = oooO0o.f113762OooOo;
        C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "Reading data from object slot {}", Integer.toString(i, 16));
        byte[] bArr = new C31907OooO0o0(92, C24539OooO0OO.OooO0OO(i)).f113737OooO0OO;
        LinkedHashMap linkedHashMapOooO00o = oO00000.OooO0o.OooO00o(oO00000.OooO0o.OooO0OO(83, this.f113773OooOo0o.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-53, 63, 255, Arrays.copyOf(bArr, bArr.length)))));
        byte[] bArr2 = (byte[]) linkedHashMapOooO00o.get(113);
        byte[] bArrOooO00o = (byte[]) linkedHashMapOooO00o.get(112);
        if (bArr2 != null && bArr2.length > 0 && bArr2[0] != 0) {
            try {
                bArrOooO00o = oO00000o.OooO00o.OooO00o(bArrOooO00o);
            } catch (IOException e) {
                throw new C31888OooO0OO("Failed to decompress certificate", e);
            }
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArrOooO00o));
        } catch (CertificateException e2) {
            throw new C31888OooO0OO("Failed to parse certificate: ", e2);
        }
    }

    public final int OooOOoo(int i) {
        if (i == 27011) {
            return 0;
        }
        if (this.f113772OooOo.OooO0O0(1, 0, 4) < 0) {
            if (i < 25344 || i > 25599) {
                return -1;
            }
            return i & 255;
        }
        if (i < 25536 || i > 25551) {
            return -1;
        }
        return i & 15;
    }

    public final C31910OooO0oO OooOooo(OooO0o oooO0o) throws com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
        C20519OooO0Oo.OooO0Oo(4, f113771Oooo00O, "Getting metadata for slot {}", oooO0o);
        OooO00o(f113766OooOoo);
        LinkedHashMap linkedHashMapOooO00o = oO00000.OooO0o.OooO00o(this.f113773OooOo0o.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-9, 0, oooO0o.f113763OooOo0o, null)));
        byte[] bArr = (byte[]) linkedHashMapOooO00o.get(2);
        byte b = ((byte[]) linkedHashMapOooO00o.get(1))[0];
        for (OooO0OO oooO0OO : OooO0OO.values()) {
            if (oooO0OO.f113745OooOo0o == b) {
                byte b2 = bArr[0];
                if (b2 < 0 || b2 >= EnumC31908OooO0Oo.values().length) {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(b2, "Not a valid PinPolicy :"));
                }
                EnumC31908OooO0Oo enumC31908OooO0Oo = EnumC31908OooO0Oo.values()[b2];
                byte b3 = bArr[1];
                for (EnumC31911OooO0oo enumC31911OooO0oo : EnumC31911OooO0oo.values()) {
                    if (enumC31911OooO0oo.f113780OooOo0o == b3) {
                        byte b4 = ((byte[]) linkedHashMapOooO00o.get(3))[0];
                        return new C31910OooO0oO(oooO0OO, enumC31908OooO0Oo, enumC31911OooO0oo, (byte[]) linkedHashMapOooO00o.get(4));
                    }
                }
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(b3, "Not a valid TouchPolicy :"));
            }
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(b, "Not a valid KeyType:"));
    }

    public final void Oooo0(int i, byte[] bArr) throws com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
        C20519OooO0Oo.OooO0Oo(4, f113771Oooo00O, "Writing data to object slot {}", Integer.toString(i, 16));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(92, C24539OooO0OO.OooO0OO(i));
        linkedHashMap.put(83, bArr);
        this.f113773OooOo0o.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-37, 63, 255, oO00000.OooO0o.OooO0O0(linkedHashMap)));
    }

    public final byte[] Oooo0OO(OooO0o oooO0o, OooO0OO oooO0OO, byte[] bArr, boolean z) throws C31888OooO0OO, com.yubico.yubikit.core.smartcard.OooO0O0, IOException {
        int i = oooO0o.f113763OooOo0o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(130, null);
        linkedHashMap.put(Integer.valueOf(z ? 133 : 129), bArr);
        byte[] bArr2 = new C31907OooO0o0(124, oO00000.OooO0o.OooO0O0(linkedHashMap)).f113737OooO0OO;
        try {
            return oO00000.OooO0o.OooO0OO(130, oO00000.OooO0o.OooO0OO(124, this.f113773OooOo0o.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-121, oooO0OO.f113745OooOo0o, i, Arrays.copyOf(bArr2, bArr2.length)))));
        } catch (com.yubico.yubikit.core.smartcard.OooO0O0 e) {
            short s = e.f80297OooOo0o;
            if (27264 == s) {
                throw new com.yubico.yubikit.core.smartcard.OooO0O0(s, String.format(Locale.ROOT, "Make sure that %s key is generated on slot %02X", oooO0OO.name(), Integer.valueOf(i)));
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f113773OooOo0o.close();
    }

    public final void ooOO(char[] cArr) throws com.yubico.yubikit.core.smartcard.OooO0O0, OooO0O0, IOException {
        try {
            f113771Oooo00O.OooOOo("Verifying PIN");
            this.f113773OooOo0o.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(32, 0, -128, Oooo000(cArr)));
            this.f113774OooOoO0 = 3;
        } catch (com.yubico.yubikit.core.smartcard.OooO0O0 e) {
            int iOooOOoo = OooOOoo(e.f80297OooOo0o);
            if (iOooOOoo < 0) {
                throw e;
            }
            this.f113774OooOoO0 = iOooOOoo;
            throw new OooO0O0(C21532OooOOo.OooO0OO(iOooOOoo, "Invalid PIN/PUK. Remaining attempts: "));
        }
    }
}
