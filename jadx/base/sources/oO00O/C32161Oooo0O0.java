package oO00O;

import OooOoOO.C20519OooO0Oo;
import OooOooO.C20730OooO0oO;
import Oooo0.o0OoOo0;
import Oooo0oO.o0Oo0oo;
import OooooO0.C21294OooOO0O;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.C22245OooO0oO;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.C24034Oooo00O;
import o00OooO.C25139OooOOOo;
import o00OooO0.C25150OooO00o;
import o00oo0O0.C25667OooOO0o;
import oO00O.EnumC32175OoooOoO;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0.C32267OooO0o0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O0OOO.C32652OooO0oO;
import oO0o0O0o.C33591OooOOO;
import oO0o0OO.C33628OooOoo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OOo.C33690OooO00o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.C33711OooOo00;
import oOO00o0.C34370OooO0o0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO00O.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32161Oooo0O0 implements InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115367OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32163Oooo0o f115368OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f115369OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oO00Oo0.OooO0OO f115370OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32447OooOOo f115371OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33710OooOo0 f115372OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C32447OooOOo f115373OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33690OooO00o f115374OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33710OooOo0 f115375OooOooo;
    private volatile SecretKeySpec masterSecret;
    private volatile C32167OoooO serverHello;

    public C32161Oooo0O0(io.ktor.utils.p616io.OooO00o rawInput, io.ktor.utils.p616io.OooO00o rawOutput, C32163Oooo0o config, InterfaceC34415OooO0oo coroutineContext) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rawInput, "rawInput");
        kotlin.jvm.internal.OooOOO0.OooO0oO(rawOutput, "rawOutput");
        kotlin.jvm.internal.OooOOO0.OooO0oO(config, "config");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        this.f115368OooOo0o = config;
        this.f115367OooOo = coroutineContext;
        this.f115370OooOoO0 = new oO00Oo0.OooO0OO(null);
        byte[] bArr = new byte[32];
        config.f115381OooO00o.nextBytes(bArr);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        bArr[0] = (byte) (jCurrentTimeMillis >> 24);
        bArr[1] = (byte) (jCurrentTimeMillis >> 16);
        bArr[2] = (byte) (jCurrentTimeMillis >> 8);
        bArr[3] = (byte) jCurrentTimeMillis;
        this.f115369OooOoO = bArr;
        this.f115371OooOoOO = C20519OooO0Oo.OooO0OO(new OooOo(this));
        this.f115373OooOoo0 = C20519OooO0Oo.OooO0OO(new C32147OooOOoo(this));
        this.f115372OooOoo = C33711OooOo00.OooO0O0(this, new C33635Oooo00O("cio-tls-parser"), 0, new C32150OooOo0o(rawInput, null, this), 2);
        InterfaceC34415OooO0oo c33635Oooo00O = new C33635Oooo00O("cio-tls-encoder");
        InterfaceC32508OooOOOo c32151OooOoO = new C32151OooOoO(rawOutput, null, this);
        c33635Oooo00O = (14 & 1) != 0 ? oOo0000O.OooO.f123416OooOo0o : c33635Oooo00O;
        EnumC33637Oooo0O0 enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121317OooOo0o;
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO0O0 = C33628OooOoo.OooO0O0(this, c33635Oooo00O);
        C33695OooO0o0 c33695OooO0o0OooO00o = C33703OooOOO0.OooO00o(0, 6, null);
        EnumC33637Oooo0O0 enumC33637Oooo0O02 = EnumC33637Oooo0O0.f121317OooOo0o;
        C33690OooO00o c33690OooO00o = new C33690OooO00o(interfaceC34415OooO0ooOooO0O0, c33695OooO0o0OooO00o, false, true);
        c33690OooO00o.Oooo0oO((InterfaceC33672o00ooo) interfaceC34415OooO0ooOooO0O0.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o));
        c33690OooO00o.Ooooooo(enumC33637Oooo0O0, c33690OooO00o, c32151OooOoO);
        this.f115374OooOooO = c33690OooO00o;
        this.f115375OooOooo = C33711OooOo00.OooO0O0(this, new C33635Oooo00O("cio-tls-handshake"), 0, new C32149OooOo0O(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32154OooOoo c32154OooOoo;
        C32266OooO0Oo c32266OooO0Oo;
        Throwable th;
        if (abstractC32479OooO0OO instanceof C32154OooOoo) {
            c32154OooOoo = (C32154OooOoo) abstractC32479OooO0OO;
            int i = c32154OooOoo.f115349OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32154OooOoo.f115349OooOoO = i - Integer.MIN_VALUE;
            } else {
                c32154OooOoo = new C32154OooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c32154OooOoo.f115347OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32154OooOoo.f115349OooOoO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32266OooO0Oo = c32154OooOoo.f115348OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th2) {
                th = th2;
                c32266OooO0Oo.release();
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
        try {
            oooO0OO.o00000oO((byte) 1);
            C32266OooO0Oo c32266OooO0OoOoOO = oooO0OO.ooOO();
            try {
                C33690OooO00o c33690OooO00o = this.f115374OooOooO;
                C32168OoooO0 c32168OoooO0 = new C32168OoooO0(EnumC32170OoooO0O.ChangeCipherSpec, c32266OooO0OoOoOO, 2);
                c32154OooOoo.f115348OooOo0o = c32266OooO0OoOoOO;
                c32154OooOoo.f115349OooOoO = 1;
                if (c33690OooO00o.OooOOO(c32168OoooO0, c32154OooOoo) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th3) {
                c32266OooO0Oo = c32266OooO0OoOoOO;
                th = th3;
                c32266OooO0Oo.release();
                throw th;
            }
        } catch (Throwable th4) {
            oooO0OO.close();
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x03fc, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r15.OooO0o0(r13, (java.security.cert.Certificate) r0, r14, r15, r6) == r7) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:150:0x03da, B:149:0x03d8], limit reached: 196 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[PHI: r0 r3 r4 r5 r6 r8 r9 r11 r12 r13 r14
      0x0048: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v1 java.lang.Object) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r3v2 int) = (r3v1 int), (r3v0 int) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r4v2 int) = (r4v1 int), (r4v0 int) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r5v2 int) = (r5v1 int), (r5v0 int) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r6v4 oO00O.OooOo00) = (r6v3 oO00O.OooOo00), (r6v2 oO00O.OooOo00) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r8v4 oO00O.OooO0oO) = (r8v3 oO00O.OooO0oO), (r8v10 oO00O.OooO0oO) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r9v3 ??) = (r9v19 ??), (r9v18 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r11v2 oO00O.OooO0OO) = (r11v1 oO00O.OooO0OO), (r11v8 oO00O.OooO0OO) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r12v2 kotlin.jvm.internal.Oooo00O) = (r12v1 kotlin.jvm.internal.Oooo00O), (r12v4 kotlin.jvm.internal.Oooo00O) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r13v2 oO00O.OooOOOO) = (r13v1 oO00O.OooOOOO), (r13v4 oO00O.OooOOOO) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r14v2 oO00O.Oooo0O0) = (r14v1 oO00O.Oooo0O0), (r14v12 oO00O.Oooo0O0) binds: [B:21:0x0076, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.security.cert.X509Certificate] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.internal.Oooo00O, oO00O.OooO0OO, oO00O.OooO0oO, oO00O.OooOOOO, oO00O.Oooo0O0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:16:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOo00 oooOo00;
        OooOOOO oooOOOO;
        C32161Oooo0O0 c32161Oooo0O0;
        C24034Oooo00O c24034Oooo00O;
        C32141OooO0oO c32141OooO0oO;
        OooO0OO oooO0OO;
        int i;
        OooOo00 oooOo002;
        int i2;
        Object next;
        int i3;
        oO0O0OOO.OooO0O0 oooO0O0;
        Signature signature;
        oO00Oo0.OooO0OO oooO0OO2;
        int i4 = 3;
        int i5 = 2;
        int i6 = 1;
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i7 = oooOo00.f115319OooOooO;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                oooOo00.f115319OooOooO = i7 - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = oooOo00.f115318OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i8 = oooOo00.f115319OooOooO;
        boolean z = false;
        ?? r9 = 0;
        if (i8 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            C32167OoooO c32167OoooO = this.serverHello;
            if (c32167OoooO == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
                throw null;
            }
            oooOOOO = c32167OoooO.f115394OooO0OO.f115249OooO0Oo;
            c32161Oooo0O0 = this;
            c24034Oooo00O = new C24034Oooo00O();
            c32141OooO0oO = null;
            oooO0OO = null;
            C33710OooOo0 c33710OooOo0 = c32161Oooo0O0.f115375OooOooo;
            oooOo00.f115313OooOo0o = c32161Oooo0O0;
            oooOo00.f115312OooOo = oooOOOO;
            oooOo00.f115315OooOoO0 = c24034Oooo00O;
            oooOo00.f115314OooOoO = oooO0OO;
            oooOo00.f115316OooOoOO = c32141OooO0oO;
            oooOo00.f115319OooOooO = i6;
            objOooO0oO = c33710OooOo0.f121482OooOoO.OooO0oO(oooOo00);
            r9 = z;
            if (objOooO0oO != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0oO);
            return C32460OooOooO.f116667OooO00o;
        }
        c32141OooO0oO = oooOo00.f115316OooOoOO;
        oooO0OO = oooOo00.f115314OooOoO;
        c24034Oooo00O = oooOo00.f115315OooOoO0;
        oooOOOO = oooOo00.f115312OooOo;
        c32161Oooo0O0 = oooOo00.f115313OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oO);
        C32161Oooo0O0 c32161Oooo0O02 = c32161Oooo0O0;
        OooO0OO oooO0OO3 = oooO0OO;
        C32141OooO0oO c32141OooO0oO2 = c32141OooO0oO;
        C32158Oooo c32158Oooo = (C32158Oooo) objOooO0oO;
        C32266OooO0Oo packet = c32158Oooo.f115358OooO0O0;
        int i9 = i6;
        int iOrdinal = c32158Oooo.f115357OooO00o.ordinal();
        if (iOrdinal == i4) {
            i2 = i4;
            if (iOrdinal == 4) {
                int iOrdinal2 = oooOOOO.ordinal();
                if (iOrdinal2 == 0) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(packet, "<this>");
                    int i10 = packet.readByte() & 255;
                    EnumC32144OooOOOo[] enumC32144OooOOOoArr = EnumC32144OooOOOo.f115292OooOo;
                    EnumC32144OooOOOo enumC32144OooOOOo = (i10 < 0 || i10 >= 256) ? null : EnumC32144OooOOOo.f115292OooOo[i10];
                    if (enumC32144OooOOOo == null) {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i10, "Invalid TLS ServerKeyExchange type code: "));
                    }
                    int iOrdinal3 = enumC32144OooOOOo.ordinal();
                    if (iOrdinal3 == 0) {
                        throw new IllegalStateException("ExplicitPrime server key exchange type is not yet supported");
                    }
                    if (iOrdinal3 == 1) {
                        throw new IllegalStateException("ExplicitChar server key exchange type is not yet supported");
                    }
                    if (iOrdinal3 != i5) {
                        throw new C32442OooOO0o();
                    }
                    short sOooO0Oo = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(packet);
                    oO0O0OOO.OooO0O0[] oooO0O0ArrValues = oO0O0OOO.OooO0O0.values();
                    int length = oooO0O0ArrValues.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i3 = i5;
                            oooO0O0 = null;
                            break;
                        }
                        oooO0O0 = oooO0O0ArrValues[i11];
                        i3 = i5;
                        if (oooO0O0.f117317OooOo0o == sOooO0Oo) {
                            break;
                        }
                        i11++;
                        i5 = i3;
                    }
                    if (oooO0O0 == null) {
                        throw new C32166Oooo0oo("Unknown EC id", 0);
                    }
                    int i12 = oooO0O0.f117316OooOo;
                    int i13 = packet.readByte() & 255;
                    if (packet.readByte() != 4) {
                        throw new C32166Oooo0oo("Point should be uncompressed", 0);
                    }
                    int i14 = (i13 - 1) / 2;
                    if (((i12 + 7) >>> 3) != i14) {
                        throw new C32166Oooo0oo("Invalid point component length", 0);
                    }
                    ECPoint eCPoint = new ECPoint(new BigInteger(1, C25150OooO00o.OooO0o(i14, packet)), new BigInteger(1, C25150OooO00o.OooO0o(i14, packet)));
                    List<oO0O0OOO.OooO00o> list = oO0O0OOO.OooO0o.f117324OooO00o;
                    oO0O0OOO.OooO00o OooO00o2 = oO0O0OOO.OooO0o.OooO00o(packet.readByte(), packet.readByte());
                    if (OooO00o2 == null) {
                        throw new IllegalStateException("Unknown hash and sign type.");
                    }
                    try {
                        oO00Oo0.OooO0OO oooO0OO4 = new oO00Oo0.OooO0OO(null);
                        try {
                            EnumC32144OooOOOo[] enumC32144OooOOOoArr2 = EnumC32144OooOOOo.f115292OooOo;
                            oooO0OO4.o00000oO((byte) i2);
                            C25139OooOOOo.OooO0o0(oooO0OO4, oooO0O0.f117317OooOo0o);
                            C20730OooO0oO.OooO0OO(oooO0OO4, eCPoint, oooO0O0.f117316OooOo);
                            C32266OooO0Oo c32266OooO0OoOoOO = oooO0OO4.ooOO();
                            byte[] bArr = c32161Oooo0O02.f115369OooOoO;
                            C25667OooOO0o.OooO0Oo(oooO0OO2, bArr, 0, bArr.length);
                            C32167OoooO c32167OoooO2 = c32161Oooo0O02.serverHello;
                            if (c32167OoooO2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
                                throw null;
                            }
                            byte[] bArr2 = c32167OoooO2.f115392OooO00o;
                            C25667OooOO0o.OooO0Oo(oooO0OO2, bArr2, 0, bArr2.length);
                            oooO0OO2.o0000oO(c32266OooO0OoOoOO);
                            signature.update(C25150OooO00o.OooO0oO(oooO0OO2.ooOO()));
                            if (!signature.verify(C25150OooO00o.OooO0o(io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(packet) & 65535, packet))) {
                                throw new C32166Oooo0oo("Failed to verify signed message", 0);
                            }
                            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(keyPairGenerator);
                            keyPairGenerator.initialize(new ECGenParameterSpec(oooO0O0.name()));
                            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(keyPairGenerateKeyPair);
                            PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
                            KeyFactory keyFactory = KeyFactory.getInstance("EC");
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(keyFactory);
                            ECParameterSpec params = ((ECPublicKey) publicKey).getParams();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(params);
                            PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, params));
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(publicKeyGeneratePublic);
                            PublicKey publicKey2 = keyPairGenerateKeyPair.getPublic();
                            kotlin.jvm.internal.OooOOO0.OooO0o(publicKey2, "clientKeys.public");
                            PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
                            kotlin.jvm.internal.OooOOO0.OooO0o(privateKey, "clientKeys.private");
                            c32141OooO0oO = new C32141OooO0oO(publicKeyGeneratePublic, publicKey2, privateKey);
                            c32161Oooo0O0 = c32161Oooo0O02;
                            oooO0OO = oooO0OO3;
                            i5 = i3;
                            i4 = 3;
                            i6 = 1;
                            z = false;
                            C33710OooOo0 c33710OooOo02 = c32161Oooo0O0.f115375OooOooo;
                            oooOo00.f115313OooOo0o = c32161Oooo0O0;
                            oooOo00.f115312OooOo = oooOOOO;
                            oooOo00.f115315OooOoO0 = c24034Oooo00O;
                            oooOo00.f115314OooOoO = oooO0OO;
                            oooOo00.f115316OooOoOO = c32141OooO0oO;
                            oooOo00.f115319OooOooO = i6;
                            objOooO0oO = c33710OooOo02.f121482OooOoO.OooO0oO(oooOo00);
                            r9 = z;
                            if (objOooO0oO != enumC32485OooO00o) {
                                C32161Oooo0O0 c32161Oooo0O022 = c32161Oooo0O0;
                                OooO0OO oooO0OO32 = oooO0OO;
                                C32141OooO0oO c32141OooO0oO22 = c32141OooO0oO;
                                C32158Oooo c32158Oooo2 = (C32158Oooo) objOooO0oO;
                                C32266OooO0Oo packet2 = c32158Oooo2.f115358OooO0O0;
                                int i92 = i6;
                                int iOrdinal4 = c32158Oooo2.f115357OooO00o.ordinal();
                                if (iOrdinal4 == i4) {
                                    i = i5;
                                    kotlin.jvm.internal.OooOOO0.OooO0oO(packet2, "<this>");
                                    int i15 = ((packet2.readByte() & 255) << 16) | (io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(packet2) & 65535);
                                    ArrayList arrayList = new ArrayList();
                                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(certificateFactory);
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        int i17 = ((packet2.readByte() & 255) << 16) | (io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(packet2) & 65535);
                                        if (i17 > i15 - i16) {
                                            throw new C32166Oooo0oo("Certificate length is too big", 0);
                                        }
                                        OooOo00 oooOo003 = oooOo00;
                                        if (i17 > packet2.Oooo0()) {
                                            throw new C32166Oooo0oo("Certificate length is too big", 0);
                                        }
                                        byte[] bArr3 = new byte[i17];
                                        C21294OooOO0O.OooO0o0(packet2, bArr3, i17);
                                        i16 += i17 + 3;
                                        arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArr3)));
                                        oooOo00 = oooOo003;
                                    }
                                    oooOo002 = oooOo00;
                                    i2 = 3;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj : arrayList) {
                                        if (obj instanceof X509Certificate) {
                                            arrayList2.add(obj);
                                        }
                                    }
                                    if (arrayList2.isEmpty()) {
                                        throw new C32166Oooo0oo("Server sent no certificate", 0);
                                    }
                                    c32161Oooo0O022.f115368OooOo0o.f115383OooO0OO.checkServerTrusted((X509Certificate[]) arrayList2.toArray(new X509Certificate[0]), oooOOOO.f115291OooOo0o);
                                    Iterator it = arrayList2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        X509Certificate x509Certificate = (X509Certificate) next;
                                        List<oO0O0OOO.OooO00o> list2 = oO0O0OOO.OooO0o.f117324OooO00o;
                                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                            Iterator<T> it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                OooO oooO = ((oO0O0OOO.OooO00o) it2.next()).f117311OooO0OO;
                                                if (oooO != null ? oooO.f115243OooO00o.equalsIgnoreCase(x509Certificate.getSigAlgOID()) : false) {
                                                    break;
                                                }
                                            }
                                        }
                                        boolean z2 = false;
                                        if (z2) {
                                            break;
                                        }
                                    }
                                    ?? r5 = (X509Certificate) next;
                                    if (r5 == 0) {
                                        throw new C32166Oooo0oo("No suitable server certificate received: " + arrayList, 0);
                                    }
                                    c24034Oooo00O.f80942OooOo0o = r5;
                                }
                            }
                            return enumC32485OooO00o;
                        } finally {
                        }
                    } finally {
                    }
                    signature = Signature.getInstance(OooO00o2.f117312OooO0Oo);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(signature);
                    signature.initVerify((Certificate) c24034Oooo00O.f80942OooOo0o);
                    oooO0OO2 = new oO00Oo0.OooO0OO(null);
                } else {
                    if (iOrdinal2 == i92) {
                        packet2.release();
                        throw new IllegalStateException("Server key exchange handshake doesn't expected in RCA exchange type");
                    }
                    i = i5;
                    oooOo002 = oooOo00;
                }
            } else {
                if (iOrdinal4 == 5) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(packet2, "packet");
                    C25150OooO00o.OooO0o(packet2.readByte() & 255, packet2);
                    int iOooO0Oo = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(packet2) & 65535;
                    ArrayList arrayList3 = new ArrayList();
                    int i18 = iOooO0Oo / i5;
                    for (int i19 = 0; i19 < i18; i19++) {
                        oO0O0OOO.OooO00o OooO00o3 = oO0O0OOO.OooO0o.OooO00o(packet2.readByte(), packet2.readByte());
                        if (OooO00o3 != null) {
                            arrayList3.add(OooO00o3);
                        }
                    }
                    int iOooO0Oo2 = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(packet2) & 65535;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i20 = 0;
                    while (i20 < iOooO0Oo2) {
                        int iOooO0Oo3 = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(packet2) & 65535;
                        i20 = iOooO0Oo3 + 2 + i20;
                        linkedHashSet.add(new X500Principal(C25150OooO00o.OooO0o(iOooO0Oo3, packet2)));
                    }
                    oO0O0OOO.OooO00o[] hashAndSign = (oO0O0OOO.OooO00o[]) arrayList3.toArray(new oO0O0OOO.OooO00o[0]);
                    kotlin.jvm.internal.OooOOO0.OooO0oO(hashAndSign, "hashAndSign");
                    OooO0OO oooO0OO5 = new OooO0OO();
                    if (!packet2.Oooo000()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c32161Oooo0O0 = c32161Oooo0O022;
                    c32141OooO0oO = c32141OooO0oO22;
                    i6 = i92;
                    i4 = i2;
                    z = false;
                    oooO0OO = oooO0OO5;
                    C33710OooOo0 c33710OooOo022 = c32161Oooo0O0.f115375OooOooo;
                    oooOo00.f115313OooOo0o = c32161Oooo0O0;
                    oooOo00.f115312OooOo = oooOOOO;
                    oooOo00.f115315OooOoO0 = c24034Oooo00O;
                    oooOo00.f115314OooOoO = oooO0OO;
                    oooOo00.f115316OooOoOO = c32141OooO0oO;
                    oooOo00.f115319OooOooO = i6;
                    objOooO0oO = c33710OooOo022.f121482OooOoO.OooO0oO(oooOo00);
                    r9 = z;
                    if (objOooO0oO != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (iOrdinal4 != 6) {
                    throw new C32166Oooo0oo("Unsupported message type during handshake: " + c32158Oooo2.f115357OooO00o, 0);
                }
                T t = c24034Oooo00O.f80942OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(t);
                oooOo00.f115313OooOo0o = r9;
                oooOo00.f115312OooOo = r9;
                oooOo00.f115315OooOoO0 = r9;
                oooOo00.f115314OooOoO = r9;
                oooOo00.f115316OooOoOO = r9;
                oooOo00.f115319OooOooO = i5;
            }
        }
        c32161Oooo0O0 = c32161Oooo0O022;
        oooO0OO = oooO0OO32;
        c32141OooO0oO = c32141OooO0oO22;
        i4 = i2;
        i5 = i;
        oooOo00 = oooOo002;
        i6 = 1;
        z = false;
        C33710OooOo0 c33710OooOo0222 = c32161Oooo0O0.f115375OooOooo;
        oooOo00.f115313OooOo0o = c32161Oooo0O0;
        oooOo00.f115312OooOo = oooOOOO;
        oooOo00.f115315OooOoO0 = c24034Oooo00O;
        oooOo00.f115314OooOoO = oooO0OO;
        oooOo00.f115316OooOoOO = c32141OooO0oO;
        oooOo00.f115319OooOooO = i6;
        objOooO0oO = c33710OooOo0222.f121482OooOoO.OooO0oO(oooOo00);
        r9 = z;
        if (objOooO0oO != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be A[Catch: all -> 0x00ec, TryCatch #4 {all -> 0x00ec, blocks: (B:51:0x00d2, B:46:0x00b6, B:48:0x00be, B:61:0x00ee, B:62:0x00f3, B:42:0x00a1, B:35:0x0084, B:38:0x009b), top: B:75:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee A[Catch: all -> 0x00ec, TRY_ENTER, TryCatch #4 {all -> 0x00ec, blocks: (B:51:0x00d2, B:46:0x00b6, B:48:0x00be, B:61:0x00ee, B:62:0x00f3, B:42:0x00a1, B:35:0x0084, B:38:0x009b), top: B:75:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [oO00O.OooO0o] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [oO00O.OooO0o] */
    /* JADX WARN: Type inference failed for: r0v8, types: [oO00O.OooO0o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32152OooOoO0 c32152OooOoO0;
        ?? r0;
        C32161Oooo0O0 c32161Oooo0O0;
        int i;
        OooO0o oooO0o;
        int i2;
        C32161Oooo0O0 c32161Oooo0O02;
        C32167OoooO c32167OoooO;
        Object objOooO0oo;
        if (abstractC32479OooO0OO instanceof C32152OooOoO0) {
            c32152OooOoO0 = (C32152OooOoO0) abstractC32479OooO0OO;
            int i3 = c32152OooOoO0.f115341OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c32152OooOoO0.f115341OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                c32152OooOoO0 = new C32152OooOoO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c32152OooOoO0.f115340OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c32152OooOoO0.f115341OooOoo;
        if (i4 != 0) {
            try {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = c32152OooOoO0.f115338OooOoO;
                        C32161Oooo0O0 c32161Oooo0O03 = c32152OooOoO0.f115339OooOoO0;
                        OooO0o oooO0o2 = c32152OooOoO0.f115336OooOo;
                        C32161Oooo0O0 c32161Oooo0O04 = (C32161Oooo0O0) c32152OooOoO0.f115337OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        i2 = i5;
                        oooO0o = oooO0o2;
                        c32161Oooo0O02 = c32161Oooo0O04;
                        c32161Oooo0O0 = c32161Oooo0O03;
                        c32161Oooo0O0.serverHello = (C32167OoooO) obj;
                        c32167OoooO = c32161Oooo0O02.serverHello;
                        if (c32167OoooO != null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
                            throw null;
                        }
                        c32161Oooo0O02.OooOO0o(c32167OoooO);
                        c32152OooOoO0.f115337OooOo0o = c32161Oooo0O02;
                        c32152OooOoO0.f115336OooOo = oooO0o;
                        c32152OooOoO0.f115339OooOoO0 = null;
                        c32152OooOoO0.f115338OooOoO = i2;
                        c32152OooOoO0.f115341OooOoo = 3;
                        if (c32161Oooo0O02.OooO0Oo(c32152OooOoO0) != enumC32485OooO00o) {
                            c32152OooOoO0.f115337OooOo0o = oooO0o;
                            c32152OooOoO0.f115336OooOo = null;
                            c32152OooOoO0.f115338OooOoO = i2;
                            c32152OooOoO0.f115341OooOoo = 4;
                            if (c32161Oooo0O02.OooO0oO(c32152OooOoO0) != enumC32485OooO00o) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r0 = (OooO0o) c32152OooOoO0.f115337OooOo0o;
                        try {
                            C32446OooOOOo.OooO0O0(obj);
                            r0 = r0;
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            r0.close();
                            return C32460OooOooO.f116667OooO00o;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                r0.close();
                            } catch (Throwable th2) {
                                C32267OooO0o0.OooO00o(th, th2);
                            }
                            throw th;
                        }
                    }
                    int i6 = c32152OooOoO0.f115338OooOoO;
                    OooO0o oooO0o3 = c32152OooOoO0.f115336OooOo;
                    C32161Oooo0O0 c32161Oooo0O05 = (C32161Oooo0O0) c32152OooOoO0.f115337OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        c32161Oooo0O02 = c32161Oooo0O05;
                        i2 = i6;
                        oooO0o = oooO0o3;
                        c32152OooOoO0.f115337OooOo0o = oooO0o;
                        c32152OooOoO0.f115336OooOo = null;
                        c32152OooOoO0.f115338OooOoO = i2;
                        c32152OooOoO0.f115341OooOoo = 4;
                        if (c32161Oooo0O02.OooO0oO(c32152OooOoO0) != enumC32485OooO00o) {
                            r0 = oooO0o;
                            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                            r0.close();
                            return C32460OooOooO.f116667OooO00o;
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th3) {
                        th = th3;
                        r0 = oooO0o3;
                        r0.close();
                        throw th;
                    }
                }
                int i7 = c32152OooOoO0.f115338OooOoO;
                OooO0o oooO0o4 = c32152OooOoO0.f115336OooOo;
                c32161Oooo0O0 = (C32161Oooo0O0) c32152OooOoO0.f115337OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i7;
                oooO0o = oooO0o4;
                c32152OooOoO0.f115337OooOo0o = c32161Oooo0O0;
                c32152OooOoO0.f115336OooOo = oooO0o;
                c32152OooOoO0.f115339OooOoO0 = c32161Oooo0O0;
                c32152OooOoO0.f115338OooOoO = i;
                c32152OooOoO0.f115341OooOoo = 2;
                objOooO0oo = c32161Oooo0O0.OooO0oo(c32152OooOoO0);
                if (objOooO0oo != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                i2 = i;
                obj = objOooO0oo;
                c32161Oooo0O02 = c32161Oooo0O0;
                c32161Oooo0O0.serverHello = (C32167OoooO) obj;
                c32167OoooO = c32161Oooo0O02.serverHello;
                if (c32167OoooO != null) {
                }
            } catch (Throwable th4) {
                th = th4;
                r0 = 1;
            }
        } else {
            C32446OooOOOo.OooO0O0(obj);
            oooO0o = new OooO0o(this.f115370OooOoO0);
            try {
                c32152OooOoO0.f115337OooOo0o = this;
                c32152OooOoO0.f115336OooOo = oooO0o;
                i = 0;
                c32152OooOoO0.f115338OooOoO = 0;
                c32152OooOoO0.f115341OooOoo = 1;
                Object objOooOO0O = OooOO0O(EnumC32169OoooO00.ClientHello, new C32159Oooo00O(this), c32152OooOoO0);
                if (objOooOO0O != enumC32485OooO00o) {
                    objOooOO0O = C32460OooOooO.f116667OooO00o;
                }
                if (objOooOO0O == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c32161Oooo0O0 = this;
                c32152OooOoO0.f115337OooOo0o = c32161Oooo0O0;
                c32152OooOoO0.f115336OooOo = oooO0o;
                c32152OooOoO0.f115339OooOoO0 = c32161Oooo0O0;
                c32152OooOoO0.f115338OooOoO = i;
                c32152OooOoO0.f115341OooOoo = 2;
                objOooO0oo = c32161Oooo0O0.OooO0oo(c32152OooOoO0);
                if (objOooO0oo != enumC32485OooO00o) {
                }
            } catch (Throwable th5) {
                th = th5;
                r0 = oooO0o;
                r0.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f5, code lost:
    
        if (r0 == r5) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4 A[PHI: r0
      0x01b4: PHI (r0v23 oO00O.Oooo0O0) = (r0v22 oO00O.Oooo0O0), (r0v35 oO00O.Oooo0O0) binds: [B:70:0x01b1, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(OooOOOO oooOOOO, Certificate certificate, OooO0OO oooO0OO, C32141OooO0oO c32141OooO0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32148OooOo0 c32148OooOo0;
        byte b;
        C32141OooO0oO c32141OooO0oO2;
        OooOOOO oooOOOO2;
        Certificate certificate2;
        OooO0O0 oooO0O0;
        C32161Oooo0O0 c32161Oooo0O0;
        C32161Oooo0O0 c32161Oooo0O02;
        C32167OoooO c32167OoooO;
        byte b2;
        byte[] bArr;
        oO00Oo0.OooO0OO oooO0OO2;
        C32266OooO0Oo c32266OooO0OoOoOO;
        C32161Oooo0O0 c32161Oooo0O03;
        byte[] bArr2;
        C32167OoooO c32167OoooO2;
        C32161Oooo0O0 c32161Oooo0O04;
        SecretKeySpec secretKeySpec;
        OooO0OO oooO0OO3 = oooO0OO;
        if (abstractC32479OooO0OO instanceof C32148OooOo0) {
            c32148OooOo0 = (C32148OooOo0) abstractC32479OooO0OO;
            int i = c32148OooOo0.f115311OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32148OooOo0.f115311OooOooO = i - Integer.MIN_VALUE;
            } else {
                c32148OooOo0 = new C32148OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c32148OooOo0.f115310OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32148OooOo0.f115311OooOooO;
        if (i2 == 0) {
            b = 3;
            C32446OooOOOo.OooO0O0(obj);
            if (oooO0OO3 != null) {
                c32148OooOo0.f115305OooOo0o = this;
                c32148OooOo0.f115304OooOo = oooOOOO;
                c32148OooOo0.f115307OooOoO0 = certificate;
                c32148OooOo0.f115306OooOoO = oooO0OO3;
                c32141OooO0oO2 = c32141OooO0oO;
                c32148OooOo0.f115308OooOoOO = c32141OooO0oO2;
                c32148OooOo0.f115311OooOooO = 1;
                Object objOooOO0 = OooOO0(c32148OooOo0);
                if (objOooOO0 != enumC32485OooO00o) {
                    oooOOOO2 = oooOOOO;
                    obj = objOooOO0;
                    certificate2 = certificate;
                    c32161Oooo0O02 = this;
                }
                return enumC32485OooO00o;
            }
            c32141OooO0oO2 = c32141OooO0oO;
            oooOOOO2 = oooOOOO;
            certificate2 = certificate;
            oooO0O0 = null;
            c32161Oooo0O0 = this;
            c32167OoooO = c32161Oooo0O0.serverHello;
            if (c32167OoooO != null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
                throw null;
            }
            int iOrdinal = c32167OoooO.f115394OooO0OO.f115249OooO0Oo.ordinal();
            if (iOrdinal == 0) {
                b2 = 0;
                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                kotlin.jvm.internal.OooOOO0.OooO0Oo(keyAgreement);
                if (c32141OooO0oO2 == null) {
                    throw new C32166Oooo0oo("ECDHE_ECDSA: Encryption info should be provided", 0);
                }
                keyAgreement.init(c32141OooO0oO2.f115267OooO0OO);
                keyAgreement.doPhase(c32141OooO0oO2.f115265OooO00o, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(bArrGenerateSecret);
                bArr = bArrGenerateSecret;
            } else {
                if (iOrdinal != 1) {
                    throw new C32442OooOO0o();
                }
                bArr = new byte[48];
                b2 = 0;
                c32161Oooo0O0.f115368OooOo0o.f115381OooO00o.nextBytes(bArr);
                bArr[0] = b;
                bArr[1] = b;
            }
            c32148OooOo0.f115305OooOo0o = c32161Oooo0O0;
            c32148OooOo0.f115304OooOo = oooO0OO3;
            c32148OooOo0.f115307OooOoO0 = oooO0O0;
            c32148OooOo0.f115306OooOoO = bArr;
            c32148OooOo0.f115308OooOoOO = null;
            c32148OooOo0.f115311OooOooO = 2;
            int iOrdinal2 = oooOOOO2.ordinal();
            if (iOrdinal2 == 0) {
                oooO0OO2 = new oO00Oo0.OooO0OO(null);
                try {
                    if (c32141OooO0oO2 == null) {
                        throw new C32166Oooo0oo("ECDHE: Encryption info should be provided", 0);
                    }
                    C20730OooO0oO.OooO0o0(oooO0OO2, c32141OooO0oO2.f115266OooO0O0);
                    c32266OooO0OoOoOO = oooO0OO2.ooOO();
                } finally {
                }
            } else {
                if (iOrdinal2 != 1) {
                    throw new C32442OooOO0o();
                }
                oooO0OO2 = new oO00Oo0.OooO0OO(null);
                try {
                    PublicKey publicKey = certificate2.getPublicKey();
                    kotlin.jvm.internal.OooOOO0.OooO0o(publicKey, "serverCertificate.publicKey");
                    C20730OooO0oO.OooO0Oo(oooO0OO2, bArr, publicKey, c32161Oooo0O0.f115368OooOo0o.f115381OooO00o);
                    c32266OooO0OoOoOO = oooO0OO2.ooOO();
                } finally {
                }
            }
            Object objOooOO0O = c32161Oooo0O0.OooOO0O(EnumC32169OoooO00.ClientKeyExchange, new C32160Oooo00o(c32266OooO0OoOoOO), c32148OooOo0);
            if (objOooOO0O != enumC32485OooO00o) {
                objOooOO0O = C32460OooOooO.f116667OooO00o;
            }
            if (objOooOO0O != enumC32485OooO00o) {
                c32161Oooo0O03 = c32161Oooo0O0;
                bArr2 = bArr;
                c32167OoooO2 = c32161Oooo0O03.serverHello;
                if (c32167OoooO2 != null) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            C32141OooO0oO c32141OooO0oO3 = c32148OooOo0.f115308OooOoOO;
            OooO0OO oooO0OO4 = (OooO0OO) c32148OooOo0.f115306OooOoO;
            certificate2 = (Certificate) c32148OooOo0.f115307OooOoO0;
            b = 3;
            oooOOOO2 = (OooOOOO) c32148OooOo0.f115304OooOo;
            C32161Oooo0O0 c32161Oooo0O05 = c32148OooOo0.f115305OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c32141OooO0oO2 = c32141OooO0oO3;
            oooO0OO3 = oooO0OO4;
            c32161Oooo0O02 = c32161Oooo0O05;
        } else {
            if (i2 == 2) {
                bArr2 = (byte[]) c32148OooOo0.f115306OooOoO;
                oooO0O0 = (OooO0O0) c32148OooOo0.f115307OooOoO0;
                c32161Oooo0O03 = c32148OooOo0.f115305OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                b = 3;
                b2 = 0;
                c32167OoooO2 = c32161Oooo0O03.serverHello;
                if (c32167OoooO2 != null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
                    throw null;
                }
                SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr2, C22245OooO0oO.OooO0O0(c32167OoooO2.f115394OooO0OO.f115256OooOO0o));
                byte[] clientRandom = c32161Oooo0O03.f115369OooOoO;
                C32167OoooO c32167OoooO3 = c32161Oooo0O03.serverHello;
                if (c32167OoooO3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
                    throw null;
                }
                byte[] bArr3 = c32167OoooO3.f115392OooO00o;
                byte[] bArr4 = C32142OooO0oo.f115268OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(clientRandom, "clientRandom");
                c32161Oooo0O03.masterSecret = new SecretKeySpec(C34370OooO0o0.OooO00o(secretKeySpec2, C32142OooO0oo.f115268OooO00o, Oooo.OooO0OO.OooOOoo(clientRandom, bArr3), 48), secretKeySpec2.getAlgorithm());
                byte b3 = b2;
                Arrays.fill(bArr2, (int) b3, bArr2.length, b3);
                if (oooO0O0 != null) {
                    c32148OooOo0.f115305OooOo0o = c32161Oooo0O03;
                    c32148OooOo0.f115304OooOo = null;
                    c32148OooOo0.f115307OooOoO0 = null;
                    c32148OooOo0.f115306OooOoO = null;
                    c32148OooOo0.f115311OooOooO = b;
                    oOo000Oo.OooOOO.OooOoo0(null);
                    throw null;
                }
                c32161Oooo0O04 = c32161Oooo0O03;
                c32148OooOo0.f115305OooOo0o = c32161Oooo0O04;
                c32148OooOo0.f115304OooOo = null;
                c32148OooOo0.f115307OooOoO0 = null;
                c32148OooOo0.f115306OooOoO = null;
                c32148OooOo0.f115311OooOooO = 4;
                if (c32161Oooo0O04.OooO(c32148OooOo0) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                c32161Oooo0O04 = c32148OooOo0.f115305OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c32148OooOo0.f115305OooOo0o = c32161Oooo0O04;
                c32148OooOo0.f115304OooOo = null;
                c32148OooOo0.f115307OooOoO0 = null;
                c32148OooOo0.f115306OooOoO = null;
                c32148OooOo0.f115311OooOooO = 4;
                if (c32161Oooo0O04.OooO(c32148OooOo0) != enumC32485OooO00o) {
                    secretKeySpec = c32161Oooo0O04.masterSecret;
                    if (secretKeySpec != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c32161Oooo0O04 = c32148OooOo0.f115305OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            secretKeySpec = c32161Oooo0O04.masterSecret;
            if (secretKeySpec != null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("masterSecret");
                throw null;
            }
            c32148OooOo0.f115305OooOo0o = null;
            c32148OooOo0.f115311OooOooO = 5;
            oO00Oo0.OooO0OO oooO0OO5 = c32161Oooo0O04.f115370OooOoO0;
            C32167OoooO c32167OoooO4 = c32161Oooo0O04.serverHello;
            if (c32167OoooO4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
                throw null;
            }
            byte[] bArrOooO00o = OooO0o.OooO00o(oooO0OO5, C22245OooO0oO.OooO0OO(c32167OoooO4.f115394OooO0OO.f115256OooOO0o));
            oooO0OO2 = new oO00Oo0.OooO0OO(null);
            try {
                byte[] bArrOooO00o2 = C34370OooO0o0.OooO00o(secretKeySpec, C32142OooO0oo.f115270OooO0OO, bArrOooO00o, 12);
                int i3 = 0;
                C25667OooOO0o.OooO0Oo(oooO0OO2, bArrOooO00o2, 0, bArrOooO00o2.length);
                Object objOooOO0O2 = c32161Oooo0O04.OooOO0O(EnumC32169OoooO00.Finished, new Oooo000(oooO0OO2.ooOO(), i3), c32148OooOo0);
                if (objOooOO0O2 != enumC32485OooO00o) {
                    objOooOO0O2 = C32460OooOooO.f116667OooO00o;
                }
            } finally {
            }
        }
        C32161Oooo0O0 c32161Oooo0O06 = c32161Oooo0O02;
        oooO0O0 = (OooO0O0) obj;
        c32161Oooo0O0 = c32161Oooo0O06;
        c32167OoooO = c32161Oooo0O0.serverHello;
        if (c32167OoooO != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32153OooOoOO c32153OooOoOO;
        C32161Oooo0O0 c32161Oooo0O0;
        if (abstractC32479OooO0OO instanceof C32153OooOoOO) {
            c32153OooOoOO = (C32153OooOoOO) abstractC32479OooO0OO;
            int i = c32153OooOoOO.f115345OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32153OooOoOO.f115345OooOoO = i - Integer.MIN_VALUE;
            } else {
                c32153OooOoOO = new C32153OooOoOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c32153OooOoOO.f115343OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32153OooOoOO.f115345OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            C33710OooOo0 c33710OooOo0 = this.f115375OooOooo;
            c32153OooOoOO.f115344OooOo0o = this;
            c32153OooOoOO.f115345OooOoO = 1;
            objOooO0oO = c33710OooOo0.f121482OooOoO.OooO0oO(c32153OooOoOO);
            if (objOooO0oO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c32161Oooo0O0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32161Oooo0O0 = c32153OooOoOO.f115344OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
        }
        C32158Oooo c32158Oooo = (C32158Oooo) objOooO0oO;
        if (c32158Oooo.f115357OooO00o != EnumC32169OoooO00.Finished) {
            throw new C32166Oooo0oo("Finished handshake expected, received: " + c32158Oooo, 0);
        }
        byte[] bArrOooO0oO = C25150OooO00o.OooO0oO(c32158Oooo.f115358OooO0O0);
        oO00Oo0.OooO0OO oooO0OO = c32161Oooo0O0.f115370OooOoO0;
        C32167OoooO c32167OoooO = c32161Oooo0O0.serverHello;
        if (c32167OoooO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
            throw null;
        }
        byte[] bArrOooO00o = OooO0o.OooO00o(oooO0OO, C22245OooO0oO.OooO0OO(c32167OoooO.f115394OooO0OO.f115256OooOO0o));
        SecretKeySpec secretKeySpec = c32161Oooo0O0.masterSecret;
        if (secretKeySpec == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("masterSecret");
            throw null;
        }
        byte[] bArrOooO00o2 = C34370OooO0o0.OooO00o(secretKeySpec, C32142OooO0oo.f115271OooO0Oo, bArrOooO00o, bArrOooO0oO.length);
        if (Arrays.equals(bArrOooO0oO, bArrOooO00o2)) {
            return C32460OooOooO.f116667OooO00o;
        }
        throw new C32166Oooo0oo(C33591OooOOO.OooO("Handshake: ServerFinished verification failed:\n                |Expected: " + oOo000Oo.OooOOO.Oooo00o(bArrOooO00o2, null, null, 63) + "\n                |Actual: " + oOo000Oo.OooOOO.Oooo00o(bArrOooO0oO, null, null, 63) + "\n                "), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32155OooOoo0 c32155OooOoo0;
        int i;
        short s;
        if (abstractC32479OooO0OO instanceof C32155OooOoo0) {
            c32155OooOoo0 = (C32155OooOoo0) abstractC32479OooO0OO;
            int i2 = c32155OooOoo0.f115353OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c32155OooOoo0.f115353OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c32155OooOoo0 = new C32155OooOoo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c32155OooOoo0.f115352OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c32155OooOoo0.f115353OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            c32155OooOoo0.f115353OooOoO0 = 1;
            objOooO0oO = this.f115375OooOooo.f121482OooOoO.OooO0oO(c32155OooOoo0);
            if (objOooO0oO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0oO);
        }
        C32158Oooo c32158Oooo = (C32158Oooo) objOooO0oO;
        if (c32158Oooo.f115357OooO00o != EnumC32169OoooO00.ServerHello) {
            throw new IllegalStateException(("Expected TLS handshake ServerHello but got " + c32158Oooo.f115357OooO00o).toString());
        }
        C32266OooO0Oo c32266OooO0Oo = c32158Oooo.f115358OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
        EnumC32175OoooOoO.OooO00o oooO00o = EnumC32175OoooOoO.f115436OooOo;
        short s2 = 65535;
        int iOooO0Oo = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(c32266OooO0Oo) & 65535;
        oooO00o.getClass();
        EnumC32175OoooOoO enumC32175OoooOoOOooO00o = EnumC32175OoooOoO.OooO00o.OooO00o(iOooO0Oo);
        byte[] bArr = new byte[32];
        C21294OooOO0O.OooO0o0(c32266OooO0Oo, bArr, 32);
        int i4 = c32266OooO0Oo.readByte() & 255;
        if (i4 > 32) {
            throw new C32166Oooo0oo(o0Oo0oo.OooO0O0(i4, "sessionId length limit of 32 bytes exceeded: ", " specified"), 0);
        }
        byte[] bArr2 = new byte[32];
        C21294OooOO0O.OooO0o0(c32266OooO0Oo, bArr2, i4);
        short sOooO0Oo = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(c32266OooO0Oo);
        short s3 = (short) (c32266OooO0Oo.readByte() & 255);
        if (s3 != 0) {
            throw new C32166Oooo0oo(o0Oo0oo.OooO0O0(s3, "Unsupported TLS compression method ", " (only null 0 compression method is supported)"), 0);
        }
        if (((int) c32266OooO0Oo.Oooo0()) == 0) {
            return new C32167OoooO(enumC32175OoooOoOOooO00o, bArr, bArr2, sOooO0Oo, C34434OooOoO.f123453OooOo0o);
        }
        int iOooO0Oo2 = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(c32266OooO0Oo) & 65535;
        if (((int) c32266OooO0Oo.Oooo0()) != iOooO0Oo2) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(iOooO0Oo2, "Invalid extensions size: requested ", ", available ");
            sbOooO0OO.append(c32266OooO0Oo.Oooo0());
            throw new C32166Oooo0oo(sbOooO0OO.toString(), 0);
        }
        ArrayList arrayList = new ArrayList();
        while (c32266OooO0Oo.Oooo0() > 0) {
            int iOooO0Oo3 = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(c32266OooO0Oo) & s2;
            int iOooO0Oo4 = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(c32266OooO0Oo) & s2;
            int[] iArrOooO0O0 = o0OoOo0.OooO0O0(9);
            int length = iArrOooO0O0.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    i = iArrOooO0O0[i5];
                    switch (i) {
                        case 1:
                            s = 0;
                            break;
                        case 2:
                            s = 1;
                            break;
                        case 3:
                            s = 2;
                            break;
                        case 4:
                            s = 3;
                            break;
                        case 5:
                            s = 4;
                            break;
                        case 6:
                            s = 5;
                            break;
                        case 7:
                            s = 10;
                            break;
                        case 8:
                            s = 11;
                            break;
                        case 9:
                            s = 13;
                            break;
                        default:
                            throw null;
                    }
                    if (s != ((short) iOooO0Oo3)) {
                        i5++;
                    }
                } else {
                    i = 0;
                }
            }
            if (i == 0) {
                throw new C32166Oooo0oo(C21532OooOOo.OooO0OO(iOooO0Oo3, "Unknown server hello extension type: "), 0);
            }
            oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
            try {
                byte[] bArrOooO0o = C25150OooO00o.OooO0o(iOooO0Oo4, c32266OooO0Oo);
                C25667OooOO0o.OooO0Oo(oooO0OO, bArrOooO0o, 0, bArrOooO0o.length);
                arrayList.add(new C32652OooO0oO(i, oooO0OO.ooOO()));
                s2 = 65535;
            } catch (Throwable th) {
                oooO0OO.close();
                throw th;
            }
        }
        return new C32167OoooO(enumC32175OoooOoOOooO00o, bArr, bArr2, sOooO0Oo, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C32156OooOooO c32156OooOooO;
        if (abstractC32479OooO0OO instanceof C32156OooOooO) {
            c32156OooOooO = (C32156OooOooO) abstractC32479OooO0OO;
            int i = c32156OooOooO.f115356OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32156OooOooO.f115356OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c32156OooOooO = new C32156OooOooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c32156OooOooO.f115355OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32156OooOooO.f115356OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return null;
        }
        C32446OooOOOo.OooO0O0(obj);
        Iterator it = this.f115368OooOo0o.f115382OooO0O0.iterator();
        if (it.hasNext()) {
            ((OooO0O0) it.next()).getClass();
            oOo000Oo.OooOOO.OooOoo0(null);
            throw null;
        }
        EnumC32169OoooO00 enumC32169OoooO00 = EnumC32169OoooO00.Certificate;
        InterfaceC32507OooOO0o c32157OooOooo = new C32157OooOooo(1);
        c32156OooOooO.f115356OooOoO0 = 1;
        if (OooOO0O(enumC32169OoooO00, c32157OooOooo, c32156OooOooO) == obj2) {
            return obj2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(EnumC32169OoooO00 enumC32169OoooO00, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Oooo0 oooo0;
        Throwable th;
        C32168OoooO0 c32168OoooO0;
        if (abstractC32479OooO0OO instanceof Oooo0) {
            oooo0 = (Oooo0) abstractC32479OooO0OO;
            int i = oooo0.f115361OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f115361OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooo0.f115359OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo0.f115361OooOoO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32168OoooO0 = oooo0.f115360OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th2) {
                th = th2;
                c32168OoooO0.f115399OooO0OO.release();
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
        try {
            interfaceC32507OooOO0o.invoke(oooO0OO);
            C32266OooO0Oo c32266OooO0OoOoOO = oooO0OO.ooOO();
            oooO0OO = new oO00Oo0.OooO0OO(null);
            try {
                C20730OooO0oO.OooO0oO(oooO0OO, enumC32169OoooO00, (int) c32266OooO0OoOoOO.Oooo0());
                oooO0OO.o0000oO(c32266OooO0OoOoOO);
                C32266OooO0Oo c32266OooO0OoOoOO2 = oooO0OO.ooOO();
                OooO0o.OooO0OO(this.f115370OooOoO0, c32266OooO0OoOoOO2);
                C32168OoooO0 c32168OoooO02 = new C32168OoooO0(EnumC32170OoooO0O.Handshake, c32266OooO0OoOoOO2, 2);
                try {
                    C33690OooO00o c33690OooO00o = this.f115374OooOooO;
                    oooo0.f115360OooOo0o = c32168OoooO02;
                    oooo0.f115361OooOoO = 1;
                    if (c33690OooO00o.OooOOO(c32168OoooO02, oooo0) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th3) {
                    th = th3;
                    c32168OoooO0 = c32168OoooO02;
                    c32168OoooO0.f115399OooO0OO.release();
                    throw th;
                }
            } finally {
            }
        } finally {
        }
    }

    public final void OooOO0o(C32167OoooO c32167OoooO) throws C32166Oooo0oo {
        ArrayList arrayList = this.f115368OooOo0o.f115384OooO0Oo;
        C32139OooO0Oo c32139OooO0Oo = c32167OoooO.f115394OooO0OO;
        if (!arrayList.contains(c32139OooO0Oo)) {
            throw new IllegalStateException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Unsupported cipher suite "), c32139OooO0Oo.f115247OooO0O0, " in SERVER_HELLO").toString());
        }
        List<oO0O0OOO.OooO00o> list = oO0O0OOO.OooO0o.f117324OooO00o;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            oO0O0OOO.OooO00o oooO00o = (oO0O0OOO.OooO00o) obj;
            if (oooO00o.f117309OooO00o == c32139OooO0Oo.f115256OooOO0o && oooO00o.f117310OooO0O0 == c32139OooO0Oo.f115258OooOOO0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new C32166Oooo0oo("No appropriate hash algorithm for suite: " + c32139OooO0Oo, 0);
        }
        ArrayList arrayList3 = c32167OoooO.f115395OooO0Oo;
        if (arrayList3.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (arrayList3.contains((oO0O0OOO.OooO00o) it.next())) {
                    return;
                }
            }
        }
        throw new C32166Oooo0oo("No sign algorithms in common. \nServer candidates: " + arrayList3 + " \nClient candidates: " + arrayList2, 0);
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115367OooOo;
    }
}
