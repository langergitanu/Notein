package OooOooO;

import Oooo0oO.C21065OoooOOO;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o000O0O0;
import Oooo0oO.o00oO0O;
import androidx.appcompat.widget.C21532OooOOo;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import o00OooO.C25139OooOOOo;
import o00oo0O0.C25667OooOO0o;
import oO00O.C32166Oooo0oo;
import oO00O.C32168OoooO0;
import oO00O.EnumC32169OoooO00;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0.C32269OooO0oo;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OooOooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20730OooO0oO {
    public static final o00oO0O OooO00o(InterfaceC20736OooOOO0 interfaceC20736OooOOO0, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC20736OooOOO0, "<this>");
        interfaceC21033OooOOOO.OooOo00(-1805515472);
        interfaceC21033OooOOOO.OooOo00(-492369756);
        Object objOooOo0 = interfaceC21033OooOOOO.OooOo0();
        Object obj = InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        if (objOooOo0 == obj) {
            objOooOo0 = C21105o000OoO.OooO0OO(Boolean.FALSE, o000O0O0.f61218OooO00o);
            interfaceC21033OooOOOO.OooOOo0(objOooOo0);
        }
        interfaceC21033OooOOOO.OooOoo();
        o00oO0O o00oo0o = (o00oO0O) objOooOo0;
        interfaceC21033OooOOOO.OooOo00(511388516);
        boolean zOooO0oo = interfaceC21033OooOOOO.OooO0oo(interfaceC20736OooOOO0) | interfaceC21033OooOOOO.OooO0oo(o00oo0o);
        Object objOooOo02 = interfaceC21033OooOOOO.OooOo0();
        if (zOooO0oo || objOooOo02 == obj) {
            objOooOo02 = new C20728OooO0o(interfaceC20736OooOOO0, o00oo0o, null);
            interfaceC21033OooOOOO.OooOOo0(objOooOo02);
        }
        interfaceC21033OooOOOO.OooOoo();
        C21065OoooOOO.OooO0O0(interfaceC21033OooOOOO, interfaceC20736OooOOO0, (InterfaceC32508OooOOOo) objOooOo02);
        interfaceC21033OooOOOO.OooOoo();
        return o00oo0o;
    }

    public static final void OooO0O0(oO00Oo0.OooO0OO oooO0OO, byte[] bArr, int i) {
        int i2 = (i + 7) >>> 3;
        int length = bArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (bArr[i3] != 0) {
                break;
            } else {
                i3++;
            }
        }
        int length2 = i2 - (bArr.length - i3);
        if (length2 > 0) {
            C25667OooOO0o.OooO0Oo(oooO0OO, new byte[length2], 0, length2);
        }
        C25667OooOO0o.OooO0Oo(oooO0OO, bArr, i3, bArr.length - i3);
    }

    public static final void OooO0OO(oO00Oo0.OooO0OO oooO0OO, ECPoint eCPoint, int i) throws C32269OooO0oo {
        oO00Oo0.OooO0OO oooO0OO2 = new oO00Oo0.OooO0OO(null);
        try {
            oooO0OO2.o00000oO((byte) 4);
            byte[] byteArray = eCPoint.getAffineX().toByteArray();
            kotlin.jvm.internal.OooOOO0.OooO0o(byteArray, "point.affineX.toByteArray()");
            OooO0O0(oooO0OO2, byteArray, i);
            byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
            kotlin.jvm.internal.OooOOO0.OooO0o(byteArray2, "point.affineY.toByteArray()");
            OooO0O0(oooO0OO2, byteArray2, i);
            C32266OooO0Oo c32266OooO0OoOoOO = oooO0OO2.ooOO();
            oooO0OO.o00000oO((byte) c32266OooO0OoOoOO.Oooo0());
            oooO0OO.o0000oO(c32266OooO0OoOoOO);
        } catch (Throwable th) {
            oooO0OO2.close();
            throw th;
        }
    }

    public static final void OooO0Oo(oO00Oo0.OooO0OO oooO0OO, byte[] bArr, PublicKey publicKey, SecureRandom secureRandom) throws BadPaddingException, C32269OooO0oo, C32166Oooo0oo, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        if (bArr.length != 48) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        kotlin.jvm.internal.OooOOO0.OooO0Oo(cipher);
        cipher.init(1, publicKey, secureRandom);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        if (bArrDoFinal.length > 65535) {
            throw new C32166Oooo0oo("Encrypted premaster secret is too long", 0);
        }
        C25139OooOOOo.OooO0o0(oooO0OO, (short) bArrDoFinal.length);
        C25667OooOO0o.OooO0Oo(oooO0OO, bArrDoFinal, 0, bArrDoFinal.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r10 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[PHI: r9 r10
      0x0045: PHI (r9v5 oO00O.OoooO0) = (r9v4 oO00O.OoooO0), (r9v12 oO00O.OoooO0) binds: [B:34:0x00b3, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r10v5 io.ktor.utils.io.Oooooo) = (r10v13 io.ktor.utils.io.Oooooo), (r10v14 io.ktor.utils.io.Oooooo) binds: [B:34:0x00b3, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[PHI: r9 r10
      0x00a1: PHI (r9v4 oO00O.OoooO0) = (r9v3 oO00O.OoooO0), (r9v11 oO00O.OoooO0) binds: [B:31:0x009e, B:20:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r10v4 io.ktor.utils.io.Oooooo) = (r10v15 io.ktor.utils.io.Oooooo), (r10v16 io.ktor.utils.io.Oooooo) binds: [B:31:0x009e, B:20:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(io.ktor.utils.p616io.OooO00o oooO00o, C32168OoooO0 c32168OoooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        oO00O.OooOOO oooOOO;
        InterfaceC23990Oooooo interfaceC23990Oooooo;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        C32168OoooO0 c32168OoooO02;
        Object objOooO0o0;
        InterfaceC23990Oooooo interfaceC23990Oooooo3;
        Object objOooOoO;
        InterfaceC23990Oooooo interfaceC23990Oooooo4;
        InterfaceC23990Oooooo interfaceC23990Oooooo5;
        if (abstractC32479OooO0OO instanceof oO00O.OooOOO) {
            oooOOO = (oO00O.OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f115286OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f115286OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new oO00O.OooOOO(abstractC32479OooO0OO);
            }
        }
        Object obj = oooOOO.f115287OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f115286OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            byte b = (byte) c32168OoooO0.f115397OooO00o.f115416OooOo0o;
            oooOOO.f115285OooOo0o = oooO00o;
            oooOOO.f115284OooOo = c32168OoooO0;
            oooOOO.f115286OooOoO = 1;
            oooO00o.getClass();
            Object objO000000O = io.ktor.utils.p616io.OooO00o.o000000O(oooO00o, b, oooOOO);
            interfaceC23990Oooooo = oooO00o;
            if (objO000000O != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c32168OoooO0 = oooOOO.f115284OooOo;
            InterfaceC23990Oooooo interfaceC23990Oooooo6 = oooOOO.f115285OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC23990Oooooo = interfaceC23990Oooooo6;
        } else {
            if (i2 == 2) {
                c32168OoooO02 = oooOOO.f115284OooOo;
                InterfaceC23990Oooooo interfaceC23990Oooooo7 = oooOOO.f115285OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC23990Oooooo2 = interfaceC23990Oooooo7;
                byte b2 = (byte) c32168OoooO02.f115398OooO0O0.f115440OooOo0o;
                oooOOO.f115285OooOo0o = interfaceC23990Oooooo2;
                oooOOO.f115284OooOo = c32168OoooO02;
                oooOOO.f115286OooOoO = 3;
                objOooO0o0 = interfaceC23990Oooooo2.OooO0o0(b2, oooOOO);
                interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                if (objOooO0o0 != enumC32485OooO00o) {
                    oooOOO.f115285OooOo0o = interfaceC23990Oooooo3;
                    oooOOO.f115284OooOo = c32168OoooO02;
                    oooOOO.f115286OooOoO = 4;
                    objOooOoO = interfaceC23990Oooooo3.OooOoO((short) c32168OoooO02.f115399OooO0OO.Oooo0(), oooOOO);
                    interfaceC23990Oooooo4 = interfaceC23990Oooooo3;
                    if (objOooOoO != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                c32168OoooO02 = oooOOO.f115284OooOo;
                InterfaceC23990Oooooo interfaceC23990Oooooo8 = oooOOO.f115285OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC23990Oooooo3 = interfaceC23990Oooooo8;
                oooOOO.f115285OooOo0o = interfaceC23990Oooooo3;
                oooOOO.f115284OooOo = c32168OoooO02;
                oooOOO.f115286OooOoO = 4;
                objOooOoO = interfaceC23990Oooooo3.OooOoO((short) c32168OoooO02.f115399OooO0OO.Oooo0(), oooOOO);
                interfaceC23990Oooooo4 = interfaceC23990Oooooo3;
                if (objOooOoO != enumC32485OooO00o) {
                    InterfaceC23990Oooooo interfaceC23990Oooooo9 = interfaceC23990Oooooo4;
                    C32168OoooO0 c32168OoooO03 = c32168OoooO02;
                    InterfaceC23990Oooooo interfaceC23990Oooooo10 = interfaceC23990Oooooo9;
                    C32266OooO0Oo c32266OooO0Oo = c32168OoooO03.f115399OooO0OO;
                    oooOOO.f115285OooOo0o = interfaceC23990Oooooo10;
                    oooOOO.f115284OooOo = null;
                    oooOOO.f115286OooOoO = 5;
                    Object objOooOO0 = interfaceC23990Oooooo10.OooOO0(c32266OooO0Oo, oooOOO);
                    interfaceC23990Oooooo5 = interfaceC23990Oooooo10;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC23990Oooooo interfaceC23990Oooooo11 = oooOOO.f115285OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC23990Oooooo5 = interfaceC23990Oooooo11;
                interfaceC23990Oooooo5.flush();
                return C32460OooOooO.f116667OooO00o;
            }
            c32168OoooO02 = oooOOO.f115284OooOo;
            InterfaceC23990Oooooo interfaceC23990Oooooo12 = oooOOO.f115285OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC23990Oooooo4 = interfaceC23990Oooooo12;
            InterfaceC23990Oooooo interfaceC23990Oooooo92 = interfaceC23990Oooooo4;
            C32168OoooO0 c32168OoooO032 = c32168OoooO02;
            InterfaceC23990Oooooo interfaceC23990Oooooo102 = interfaceC23990Oooooo92;
            C32266OooO0Oo c32266OooO0Oo2 = c32168OoooO032.f115399OooO0OO;
            oooOOO.f115285OooOo0o = interfaceC23990Oooooo102;
            oooOOO.f115284OooOo = null;
            oooOOO.f115286OooOoO = 5;
            Object objOooOO02 = interfaceC23990Oooooo102.OooOO0(c32266OooO0Oo2, oooOOO);
            interfaceC23990Oooooo5 = interfaceC23990Oooooo102;
        }
        int i3 = c32168OoooO0.f115398OooO0O0.f115440OooOo0o;
        oooOOO.f115285OooOo0o = interfaceC23990Oooooo;
        oooOOO.f115284OooOo = c32168OoooO0;
        oooOOO.f115286OooOoO = 2;
        if (interfaceC23990Oooooo.OooO0o0((byte) 3, oooOOO) != enumC32485OooO00o) {
            C32168OoooO0 c32168OoooO04 = c32168OoooO0;
            interfaceC23990Oooooo2 = interfaceC23990Oooooo;
            c32168OoooO02 = c32168OoooO04;
            byte b22 = (byte) c32168OoooO02.f115398OooO0O0.f115440OooOo0o;
            oooOOO.f115285OooOo0o = interfaceC23990Oooooo2;
            oooOOO.f115284OooOo = c32168OoooO02;
            oooOOO.f115286OooOoO = 3;
            objOooO0o0 = interfaceC23990Oooooo2.OooO0o0(b22, oooOOO);
            interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
            if (objOooO0o0 != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    public static final void OooO0o0(oO00Oo0.OooO0OO oooO0OO, PublicKey publicKey) throws C32269OooO0oo, C32166Oooo0oo {
        if (!(publicKey instanceof ECPublicKey)) {
            throw new C32166Oooo0oo("Unsupported public key type: " + publicKey, 0);
        }
        ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
        int fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
        ECPoint w = eCPublicKey.getW();
        kotlin.jvm.internal.OooOOO0.OooO0o(w, "key.w");
        OooO0OO(oooO0OO, w, fieldSize);
    }

    public static final void OooO0oO(oO00Oo0.OooO0OO oooO0OO, EnumC32169OoooO00 type, int i) throws C32269OooO0oo, C32166Oooo0oo {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        if (i > 16777215) {
            throw new C32166Oooo0oo(C21532OooOOo.OooO0OO(i, "TLS handshake size limit exceeded: "), 0);
        }
        int i2 = (type.f115408OooOo0o << 24) | i;
        int i3 = oooO0OO.f115955OooOoOO;
        if (oooO0OO.f115957OooOoo0 - i3 > 4) {
            oooO0OO.f115955OooOoOO = i3 + 4;
            oooO0OO.f115953OooOoO.putInt(i3, i2);
            return;
        }
        C32271OooO00o c32271OooO00oO0Oo0oo = oooO0OO.o0Oo0oo(4);
        int i4 = c32271OooO00oO0Oo0oo.f115946OooO0OO;
        int i5 = c32271OooO00oO0Oo0oo.f115949OooO0o0 - i4;
        if (i5 < 4) {
            throw new C32269OooO0oo("regular integer", 4, i5);
        }
        c32271OooO00oO0Oo0oo.f115944OooO00o.putInt(i4, i2);
        c32271OooO00oO0Oo0oo.OooO00o(4);
        oooO0OO.OooO00o();
    }
}
