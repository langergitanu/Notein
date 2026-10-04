package oO00O0o;

import OooooO0.C21292OooO0oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import io.ktor.utils.p616io.C23988OooooOO;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import io.ktor.utils.p616io.InterfaceC24008o0ooOO0;
import io.ktor.utils.p616io.oo0o0Oo;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0o.AbstractC32276OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20203OooO00o f115450OooO00o = new C20203OooO00o(2048);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f115451OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f115452OooO0OO;

    /* JADX INFO: renamed from: oO00O0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20203OooO00o extends AbstractC32276OooO0OO<StringBuilder> {
        @Override // oO00Oo0o.AbstractC32276OooO0OO
        public final StringBuilder OooO0OO(StringBuilder sb) {
            StringBuilder sb2 = sb;
            sb2.setLength(0);
            return sb2;
        }

        @Override // oO00Oo0o.AbstractC32276OooO0OO
        public final StringBuilder OooOOo0() {
            return new StringBuilder(128);
        }
    }

    static {
        byte[] bArrOooO0OO;
        byte[] bArrOooO0OO2;
        Charset charset = C33580OooO00o.f121231OooO0O0;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(charset, charset)) {
            bArrOooO0OO = C33595OooOOo.OooOOOo(IOUtils.LINE_SEPARATOR_WINDOWS);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            kotlin.jvm.internal.OooOOO0.OooO0o(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrOooO0OO = oO00Oo00.OooO00o.OooO0OO(charsetEncoderNewEncoder, IOUtils.LINE_SEPARATOR_WINDOWS, 2);
        }
        f115451OooO0O0 = bArrOooO0OO;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(charset, charset)) {
            bArrOooO0OO2 = C33595OooOOo.OooOOOo("0\r\n\r\n");
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            kotlin.jvm.internal.OooOOO0.OooO0o(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrOooO0OO2 = oO00Oo00.OooO00o.OooO0OO(charsetEncoderNewEncoder2, "0\r\n\r\n", 5);
        }
        f115452OooO0OO = bArrOooO0OO2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:14:0x003a, B:32:0x00aa, B:34:0x00b2, B:36:0x00b8, B:38:0x00be, B:44:0x00d1, B:47:0x00e4, B:48:0x00e8, B:41:0x00c9, B:67:0x0156, B:68:0x015d, B:69:0x015e, B:70:0x0165, B:22:0x0065, B:25:0x0074), top: B:79:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118 A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #0 {all -> 0x0136, blocks: (B:52:0x0110, B:54:0x0118, B:28:0x008d, B:61:0x012e, B:62:0x0135, B:65:0x013a, B:66:0x0155), top: B:76:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a A[Catch: all -> 0x0136, TryCatch #0 {all -> 0x0136, blocks: (B:52:0x0110, B:54:0x0118, B:28:0x008d, B:61:0x012e, B:62:0x0135, B:65:0x013a, B:66:0x0155), top: B:76:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:14:0x003a, B:32:0x00aa, B:34:0x00b2, B:36:0x00b8, B:38:0x00be, B:44:0x00d1, B:47:0x00e4, B:48:0x00e8, B:41:0x00c9, B:67:0x0156, B:68:0x015d, B:69:0x015e, B:70:0x0165, B:22:0x0065, B:25:0x0074), top: B:79:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0108 -> B:16:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC23990Oooooo interfaceC23990Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        long j;
        StringBuilder sbO0000OoO;
        OooO0O0 oooO0O02;
        long j2;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        InterfaceC23990Oooooo interfaceC23990Oooooo3;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o3;
        long j3;
        long jOooO0OO;
        StringBuilder sb;
        Object objOooO;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f115458OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f115458OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(abstractC32479OooO0OO);
            }
        }
        Object objOooO2 = oooO0O0.f115459OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r3 = oooO0O0.f115458OooOoo;
        C20203OooO00o c20203OooO00o = f115450OooO00o;
        try {
            if (r3 == 0) {
                j = 0;
                C32446OooOOOo.OooO0O0(objOooO2);
                sbO0000OoO = c20203OooO00o.o0000OoO();
                oooO0O02 = oooO0O0;
                j2 = 0;
                interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o;
                interfaceC23990Oooooo2 = interfaceC23990Oooooo;
                sbO0000OoO.setLength(0);
                oooO0O02.f115454OooOo0o = interfaceC23986Ooooo0o2;
                oooO0O02.f115453OooOo = interfaceC23990Oooooo2;
                oooO0O02.f115456OooOoO0 = sbO0000OoO;
                oooO0O02.f115455OooOoO = j2;
                oooO0O02.f115458OooOoo = 1;
                objOooO = interfaceC23986Ooooo0o2.OooO(sbO0000OoO, 128, oooO0O02);
                if (objOooO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (r3 != 1) {
                if (r3 == 2) {
                    j = 0;
                    jOooO0OO = oooO0O0.f115457OooOoOO;
                    j3 = oooO0O0.f115455OooOoO;
                    sb = oooO0O0.f115456OooOoO0;
                    interfaceC23990Oooooo3 = oooO0O0.f115453OooOo;
                    interfaceC23986Ooooo0o3 = oooO0O0.f115454OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO2);
                    interfaceC23990Oooooo3.flush();
                    j3 += jOooO0OO;
                    long j4 = j3;
                    long j5 = jOooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(sb, "<this>");
                    sb.setLength(0);
                    oooO0O0.f115454OooOo0o = interfaceC23986Ooooo0o3;
                    oooO0O0.f115453OooOo = interfaceC23990Oooooo3;
                    oooO0O0.f115456OooOoO0 = sb;
                    oooO0O0.f115455OooOoO = j4;
                    oooO0O0.f115457OooOoOO = j5;
                    oooO0O0.f115458OooOoo = 3;
                    objOooO2 = interfaceC23986Ooooo0o3.OooO(sb, 2, oooO0O0);
                    if (objOooO2 != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (r3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j6 = oooO0O0.f115457OooOoOO;
                long j7 = oooO0O0.f115455OooOoO;
                StringBuilder sb2 = oooO0O0.f115456OooOoO0;
                InterfaceC23990Oooooo interfaceC23990Oooooo4 = oooO0O0.f115453OooOo;
                j = 0;
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o4 = oooO0O0.f115454OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO2);
                StringBuilder sb3 = sb2;
                oooO0O02 = oooO0O0;
                interfaceC23990Oooooo2 = interfaceC23990Oooooo4;
                interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o4;
                long j8 = j6;
                j2 = j7;
                sbO0000OoO = sb3;
                try {
                    if (!((Boolean) objOooO2).booleanValue()) {
                        throw new EOFException("Invalid chunk: content block of size " + j8 + " ended unexpectedly");
                    }
                    if (sbO0000OoO.length() > 0) {
                        throw new EOFException("Invalid chunk: content block should end with CR+LF");
                    }
                    if (j8 == j) {
                        c20203OooO00o.o00o0O(sbO0000OoO);
                        C23992OoooooO.OooO0O0(interfaceC23990Oooooo2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o3;
                    sbO0000OoO.setLength(0);
                    oooO0O02.f115454OooOo0o = interfaceC23986Ooooo0o2;
                    oooO0O02.f115453OooOo = interfaceC23990Oooooo2;
                    oooO0O02.f115456OooOoO0 = sbO0000OoO;
                    oooO0O02.f115455OooOoO = j2;
                    oooO0O02.f115458OooOoo = 1;
                    objOooO = interfaceC23986Ooooo0o2.OooO(sbO0000OoO, 128, oooO0O02);
                    if (objOooO != enumC32485OooO00o) {
                        interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o2;
                        interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                        oooO0O0 = oooO0O02;
                        sb = sbO0000OoO;
                        objOooO2 = objOooO;
                        j3 = j2;
                        if (!((Boolean) objOooO2).booleanValue()) {
                            throw new EOFException("Chunked stream has ended unexpectedly: no chunk size");
                        }
                        if (sb.length() == 0) {
                            throw new EOFException("Invalid chunk size: empty");
                        }
                        jOooO0OO = (sb.length() == 1 && sb.charAt(0) == '0') ? j : oOo00OO0.OooO0o.OooO0OO(sb);
                        if (jOooO0OO > j) {
                            oooO0O0.f115454OooOo0o = interfaceC23986Ooooo0o3;
                            oooO0O0.f115453OooOo = interfaceC23990Oooooo3;
                            oooO0O0.f115456OooOoO0 = sb;
                            oooO0O0.f115455OooOoO = j3;
                            oooO0O0.f115457OooOoOO = jOooO0OO;
                            oooO0O0.f115458OooOoo = 2;
                            if (C23988OooooOO.OooO0O0(interfaceC23986Ooooo0o3, interfaceC23990Oooooo3, jOooO0OO, oooO0O0) == enumC32485OooO00o) {
                            }
                            interfaceC23990Oooooo3.flush();
                            j3 += jOooO0OO;
                            long j42 = j3;
                            long j52 = jOooO0OO;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(sb, "<this>");
                            sb.setLength(0);
                            oooO0O0.f115454OooOo0o = interfaceC23986Ooooo0o3;
                            oooO0O0.f115453OooOo = interfaceC23990Oooooo3;
                            oooO0O0.f115456OooOoO0 = sb;
                            oooO0O0.f115455OooOoO = j42;
                            oooO0O0.f115457OooOoOO = j52;
                            oooO0O0.f115458OooOoo = 3;
                            objOooO2 = interfaceC23986Ooooo0o3.OooO(sb, 2, oooO0O0);
                            if (objOooO2 != enumC32485OooO00o) {
                                sb3 = sb;
                                oooO0O02 = oooO0O0;
                                interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                                j8 = j52;
                                j2 = j42;
                                sbO0000OoO = sb3;
                                if (!((Boolean) objOooO2).booleanValue()) {
                                }
                            }
                        } else {
                            long j422 = j3;
                            long j522 = jOooO0OO;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(sb, "<this>");
                            sb.setLength(0);
                            oooO0O0.f115454OooOo0o = interfaceC23986Ooooo0o3;
                            oooO0O0.f115453OooOo = interfaceC23990Oooooo3;
                            oooO0O0.f115456OooOoO0 = sb;
                            oooO0O0.f115455OooOoO = j422;
                            oooO0O0.f115457OooOoOO = j522;
                            oooO0O0.f115458OooOoo = 3;
                            objOooO2 = interfaceC23986Ooooo0o3.OooO(sb, 2, oooO0O0);
                            if (objOooO2 != enumC32485OooO00o) {
                            }
                        }
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th) {
                    th = th;
                    InterfaceC23990Oooooo interfaceC23990Oooooo5 = interfaceC23990Oooooo2;
                    r3 = sbO0000OoO;
                    try {
                        interfaceC23990Oooooo5.OooO0Oo(th);
                        throw th;
                    } catch (Throwable th2) {
                        c20203OooO00o.o00o0O(r3);
                        C23992OoooooO.OooO0O0(interfaceC23990Oooooo5);
                        throw th2;
                    }
                }
            }
            j = 0;
            long j9 = oooO0O0.f115455OooOoO;
            sb = oooO0O0.f115456OooOoO0;
            interfaceC23990Oooooo3 = oooO0O0.f115453OooOo;
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0o5 = oooO0O0.f115454OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO2);
            interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o5;
            j3 = j9;
            if (!((Boolean) objOooO2).booleanValue()) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x012e, code lost:
    
        if (OooooO0.C21292OooO0oo.OooO0o0(r11, r3, r0, r1) == r2) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: all -> 0x0164, TryCatch #2 {all -> 0x0164, blocks: (B:41:0x009a, B:43:0x00a0, B:45:0x00ae, B:51:0x00c1, B:54:0x00c9, B:55:0x00ce, B:46:0x00b2, B:48:0x00b6, B:92:0x0166, B:94:0x016a, B:97:0x0172, B:102:0x018b), top: B:114:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00df A[Catch: all -> 0x015f, TRY_LEAVE, TryCatch #8 {all -> 0x015f, blocks: (B:59:0x00db, B:61:0x00df), top: B:125:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:64:0x00e6, B:67:0x00fb), top: B:110:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0166 A[Catch: all -> 0x0164, TRY_ENTER, TryCatch #2 {all -> 0x0164, blocks: (B:41:0x009a, B:43:0x00a0, B:45:0x00ae, B:51:0x00c1, B:54:0x00c9, B:55:0x00ce, B:46:0x00b2, B:48:0x00b6, B:92:0x0166, B:94:0x016a, B:97:0x0172, B:102:0x018b), top: B:114:0x009a }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [oO00Oo0.OooO00o] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v7, types: [oO00Oo0.OooO00o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x012e -> B:29:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC23990Oooooo interfaceC23990Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32176OooO0Oo c32176OooO0Oo;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o3;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o4;
        InterfaceC23990Oooooo interfaceC23990Oooooo3;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o5;
        InterfaceC23990Oooooo interfaceC23990Oooooo4;
        C32176OooO0Oo c32176OooO0Oo2;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o6;
        oO00Oo0.OooO00o oooO00o;
        int iIntValue;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o7;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o8;
        C32176OooO0Oo c32176OooO0Oo3;
        oO00Oo0.OooO00o oooO00o2;
        oO00Oo0.OooO00o oooO00o3;
        long j;
        long j2;
        Object objOooO0oo;
        if (abstractC32479OooO0OO instanceof C32176OooO0Oo) {
            c32176OooO0Oo = (C32176OooO0Oo) abstractC32479OooO0OO;
            int i = c32176OooO0Oo.f115468OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32176OooO0Oo.f115468OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c32176OooO0Oo = new C32176OooO0Oo(abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c32176OooO0Oo.f115467OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r3 = c32176OooO0Oo.f115468OooOoo0;
        int i2 = 1;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (r3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            interfaceC23990Oooooo4 = interfaceC23990Oooooo;
            c32176OooO0Oo2 = c32176OooO0Oo;
            interfaceC23986Ooooo0o6 = interfaceC23986Ooooo0o;
            if (interfaceC23986Ooooo0o6.OooOoo()) {
            }
            return enumC32485OooO00o;
        }
        try {
            if (r3 == 1) {
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o9 = (InterfaceC23986Ooooo0o) c32176OooO0Oo.f115466OooOoO0;
                interfaceC23986Ooooo0o8 = c32176OooO0Oo.f115463OooOo;
                InterfaceC23990Oooooo interfaceC23990Oooooo5 = c32176OooO0Oo.f115464OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0OO);
                    c32176OooO0Oo3 = c32176OooO0Oo;
                    interfaceC23990Oooooo3 = interfaceC23990Oooooo5;
                    interfaceC23986Ooooo0o7 = interfaceC23986Ooooo0o9;
                    oooO00o2 = (oO00Oo0.OooO00o) objOooO0OO;
                    if (oooO00o2 == null) {
                    }
                    oooO00o3 = oooO00o2;
                    ByteBuffer byteBuffer = oooO00o3.f115944OooO00o;
                    j = oooO00o3.f115945OooO0O0;
                    j2 = oooO00o3.f115946OooO0OO;
                    if (j2 != j) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC23986Ooooo0o4 = interfaceC23986Ooooo0o8;
                    interfaceC23990Oooooo3 = interfaceC23990Oooooo5;
                }
            } else if (r3 == 2) {
                oO00Oo0.OooO00o oooO00o4 = c32176OooO0Oo.f115465OooOoO;
                interfaceC23986Ooooo0o3 = (InterfaceC23986Ooooo0o) c32176OooO0Oo.f115466OooOoO0;
                interfaceC23986Ooooo0o2 = c32176OooO0Oo.f115463OooOo;
                interfaceC23990Oooooo2 = c32176OooO0Oo.f115464OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
                oooO00o = oooO00o4;
                iIntValue = ((Number) objOooO0OO).intValue();
                r3 = oooO00o;
                c32176OooO0Oo.f115464OooOo0o = interfaceC23990Oooooo2;
                c32176OooO0Oo.f115463OooOo = interfaceC23986Ooooo0o2;
                c32176OooO0Oo.f115466OooOoO0 = interfaceC23986Ooooo0o3;
                c32176OooO0Oo.f115465OooOoO = r3;
                c32176OooO0Oo.f115468OooOoo0 = 3;
            } else {
                if (r3 == 3) {
                    oO00Oo0.OooO00o oooO00o5 = c32176OooO0Oo.f115465OooOoO;
                    interfaceC23986Ooooo0o2 = c32176OooO0Oo.f115463OooOo;
                    interfaceC23990Oooooo2 = c32176OooO0Oo.f115464OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0OO);
                    try {
                        c32176OooO0Oo2 = c32176OooO0Oo;
                        interfaceC23986Ooooo0o6 = interfaceC23986Ooooo0o2;
                        interfaceC23990Oooooo4 = interfaceC23990Oooooo2;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC23986Ooooo0o4 = interfaceC23986Ooooo0o6;
                        interfaceC23990Oooooo3 = interfaceC23990Oooooo4;
                    }
                    i2 = 1;
                    if (interfaceC23986Ooooo0o6.OooOoo()) {
                        c32176OooO0Oo2.f115464OooOo0o = interfaceC23990Oooooo4;
                        c32176OooO0Oo2.f115463OooOo = interfaceC23986Ooooo0o6;
                        c32176OooO0Oo2.f115466OooOoO0 = interfaceC23986Ooooo0o6;
                        c32176OooO0Oo2.f115465OooOoO = null;
                        c32176OooO0Oo2.f115468OooOoo0 = i2;
                        oo0o0Oo oo0o0ooOooOO0o = !(interfaceC23986Ooooo0o6 instanceof oo0o0Oo) ? interfaceC23986Ooooo0o6 instanceof InterfaceC24008o0ooOO0 ? ((InterfaceC24008o0ooOO0) interfaceC23986Ooooo0o6).OooOO0o() : null : (oo0o0Oo) interfaceC23986Ooooo0o6;
                        if (oo0o0ooOooOO0o == null) {
                            objOooO0oo = C21292OooO0oo.OooO0oo(interfaceC23986Ooooo0o6, i2, c32176OooO0Oo2);
                        } else {
                            C32271OooO00o c32271OooO00oOooO00o = oo0o0ooOooOO0o.OooO00o(i2);
                            objOooO0oo = c32271OooO00oOooO00o != null ? c32271OooO00oOooO00o : C21292OooO0oo.OooO(oo0o0ooOooOO0o, i2, c32176OooO0Oo2);
                        }
                        if (objOooO0oo != enumC32485OooO00o) {
                            interfaceC23986Ooooo0o7 = interfaceC23986Ooooo0o6;
                            interfaceC23990Oooooo3 = interfaceC23990Oooooo4;
                            c32176OooO0Oo3 = c32176OooO0Oo2;
                            objOooO0OO = objOooO0oo;
                            interfaceC23986Ooooo0o8 = interfaceC23986Ooooo0o7;
                            try {
                                try {
                                    oooO00o2 = (oO00Oo0.OooO00o) objOooO0OO;
                                    if (oooO00o2 == null) {
                                        oooO00o2 = C32271OooO00o.f115978OooOOO0;
                                    }
                                    ByteBuffer byteBuffer2 = oooO00o3.f115944OooO00o;
                                    j = oooO00o3.f115945OooO0O0;
                                    j2 = oooO00o3.f115946OooO0OO;
                                    if (j2 != j) {
                                        interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                                        c32176OooO0Oo = c32176OooO0Oo3;
                                        r3 = oooO00o3;
                                        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o10 = interfaceC23986Ooooo0o7;
                                        interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o8;
                                        interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o10;
                                        iIntValue = 0;
                                        c32176OooO0Oo.f115464OooOo0o = interfaceC23990Oooooo2;
                                        c32176OooO0Oo.f115463OooOo = interfaceC23986Ooooo0o2;
                                        c32176OooO0Oo.f115466OooOoO0 = interfaceC23986Ooooo0o3;
                                        c32176OooO0Oo.f115465OooOoO = r3;
                                        c32176OooO0Oo.f115468OooOoo0 = 3;
                                    } else {
                                        c32176OooO0Oo3.f115464OooOo0o = interfaceC23990Oooooo3;
                                        c32176OooO0Oo3.f115463OooOo = interfaceC23986Ooooo0o8;
                                        c32176OooO0Oo3.f115466OooOoO0 = interfaceC23986Ooooo0o7;
                                        c32176OooO0Oo3.f115465OooOoO = oooO00o3;
                                        c32176OooO0Oo3.f115468OooOoo0 = 2;
                                        objOooO0OO = OooO0OO(interfaceC23990Oooooo3, byteBuffer2, (int) j, (int) j2, c32176OooO0Oo3);
                                        if (objOooO0OO != enumC32485OooO00o) {
                                            interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                                            c32176OooO0Oo = c32176OooO0Oo3;
                                            oooO00o = oooO00o3;
                                            InterfaceC23986Ooooo0o interfaceC23986Ooooo0o11 = interfaceC23986Ooooo0o7;
                                            interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o8;
                                            interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o11;
                                            iIntValue = ((Number) objOooO0OO).intValue();
                                            r3 = oooO00o;
                                            c32176OooO0Oo.f115464OooOo0o = interfaceC23990Oooooo2;
                                            c32176OooO0Oo.f115463OooOo = interfaceC23986Ooooo0o2;
                                            c32176OooO0Oo.f115466OooOoO0 = interfaceC23986Ooooo0o3;
                                            c32176OooO0Oo.f115465OooOoO = r3;
                                            c32176OooO0Oo.f115468OooOoo0 = 3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                                    c32176OooO0Oo = c32176OooO0Oo3;
                                    r3 = oooO00o3;
                                    InterfaceC23986Ooooo0o interfaceC23986Ooooo0o12 = interfaceC23986Ooooo0o7;
                                    interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o8;
                                    interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o12;
                                    try {
                                        c32176OooO0Oo.f115464OooOo0o = interfaceC23990Oooooo2;
                                        c32176OooO0Oo.f115463OooOo = interfaceC23986Ooooo0o2;
                                        c32176OooO0Oo.f115466OooOoO0 = th;
                                        c32176OooO0Oo.f115465OooOoO = null;
                                        c32176OooO0Oo.f115468OooOoo0 = 4;
                                        if (C21292OooO0oo.OooO0o0(interfaceC23986Ooooo0o3, r3, 0, c32176OooO0Oo) != enumC32485OooO00o) {
                                            interfaceC23986Ooooo0o5 = interfaceC23986Ooooo0o2;
                                            interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                                            throw th;
                                        }
                                        return enumC32485OooO00o;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        interfaceC23986Ooooo0o4 = interfaceC23986Ooooo0o2;
                                        interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                                    }
                                }
                                oooO00o3 = oooO00o2;
                            } catch (Throwable th6) {
                                th = th6;
                                interfaceC23986Ooooo0o4 = interfaceC23986Ooooo0o8;
                            }
                        }
                    } else {
                        Throwable thOooO0O0 = interfaceC23986Ooooo0o6 instanceof InterfaceC23967Oooo00O ? interfaceC23986Ooooo0o6.OooO0O0() : null;
                        if (thOooO0O0 != null) {
                            throw thOooO0O0;
                        }
                        byte[] bArr = f115452OooO0OO;
                        c32176OooO0Oo2.f115464OooOo0o = interfaceC23990Oooooo4;
                        c32176OooO0Oo2.f115463OooOo = interfaceC23986Ooooo0o6;
                        c32176OooO0Oo2.f115466OooOoO0 = null;
                        c32176OooO0Oo2.f115465OooOoO = null;
                        c32176OooO0Oo2.f115468OooOoo0 = 5;
                        if (C23992OoooooO.OooO0o(interfaceC23990Oooooo4, bArr, c32176OooO0Oo2) != enumC32485OooO00o) {
                            interfaceC23990Oooooo3 = interfaceC23990Oooooo4;
                            return C32460OooOooO.f116667OooO00o;
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (r3 != 4) {
                    if (r3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC23986Ooooo0o4 = c32176OooO0Oo.f115463OooOo;
                    interfaceC23990Oooooo3 = c32176OooO0Oo.f115464OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0OO);
                    } catch (Throwable th7) {
                        th = th7;
                        interfaceC23990Oooooo3.OooO0Oo(th);
                        interfaceC23986Ooooo0o4.cancel(th);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                Throwable th8 = (Throwable) c32176OooO0Oo.f115466OooOoO0;
                interfaceC23986Ooooo0o5 = c32176OooO0Oo.f115463OooOo;
                interfaceC23990Oooooo3 = c32176OooO0Oo.f115464OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0OO);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    interfaceC23986Ooooo0o4 = interfaceC23986Ooooo0o5;
                }
            }
            interfaceC23990Oooooo3.OooO0Oo(th);
            interfaceC23986Ooooo0o4.cancel(th);
            return C32460OooOooO.f116667OooO00o;
        } finally {
            interfaceC23990Oooooo3.flush();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (io.ktor.utils.p616io.C23992OoooooO.OooO0o(r8, oO00O0o.OooO00o.f115451OooO0O0, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(InterfaceC23990Oooooo interfaceC23990Oooooo, ByteBuffer byteBuffer, int i, int i2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C32177OooO0o0 c32177OooO0o0;
        int i3;
        ByteBuffer byteBuffer2;
        int i4;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        int i5;
        InterfaceC23990Oooooo interfaceC23990Oooooo3;
        if (abstractC32479OooO0OO instanceof C32177OooO0o0) {
            c32177OooO0o0 = (C32177OooO0o0) abstractC32479OooO0OO;
            int i6 = c32177OooO0o0.f115482OooOoo;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c32177OooO0o0.f115482OooOoo = i6 - Integer.MIN_VALUE;
            } else {
                c32177OooO0o0 = new C32177OooO0o0(abstractC32479OooO0OO);
            }
        }
        Object obj = c32177OooO0o0.f115483OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i7 = c32177OooO0o0.f115482OooOoo;
        if (i7 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            i3 = i2 - i;
            c32177OooO0o0.f115478OooOo0o = interfaceC23990Oooooo;
            c32177OooO0o0.f115477OooOo = byteBuffer;
            c32177OooO0o0.f115480OooOoO0 = i;
            c32177OooO0o0.f115479OooOoO = i2;
            c32177OooO0o0.f115481OooOoOO = i3;
            c32177OooO0o0.f115482OooOoo = 1;
            if (oOo00OO0.OooO0o.OooO0Oo(interfaceC23990Oooooo, i3, c32177OooO0o0) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i7 == 1) {
            int i8 = c32177OooO0o0.f115481OooOoOO;
            i2 = c32177OooO0o0.f115479OooOoO;
            i = c32177OooO0o0.f115480OooOoO0;
            byteBuffer = c32177OooO0o0.f115477OooOo;
            InterfaceC23990Oooooo interfaceC23990Oooooo4 = c32177OooO0o0.f115478OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i3 = i8;
            interfaceC23990Oooooo = interfaceC23990Oooooo4;
        } else {
            if (i7 == 2) {
                i5 = c32177OooO0o0.f115481OooOoOO;
                i4 = c32177OooO0o0.f115479OooOoO;
                i = c32177OooO0o0.f115480OooOoO0;
                byteBuffer2 = c32177OooO0o0.f115477OooOo;
                interfaceC23990Oooooo2 = c32177OooO0o0.f115478OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c32177OooO0o0.f115478OooOo0o = interfaceC23990Oooooo2;
                c32177OooO0o0.f115477OooOo = null;
                c32177OooO0o0.f115480OooOoO0 = i5;
                c32177OooO0o0.f115482OooOoo = 3;
                if (interfaceC23990Oooooo2.OooOOo0(byteBuffer2, i, i4, c32177OooO0o0) != enumC32485OooO00o) {
                    interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                    c32177OooO0o0.f115478OooOo0o = interfaceC23990Oooooo3;
                    c32177OooO0o0.f115480OooOoO0 = i5;
                    c32177OooO0o0.f115482OooOoo = 4;
                }
                return enumC32485OooO00o;
            }
            if (i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = c32177OooO0o0.f115480OooOoO0;
                interfaceC23990Oooooo3 = c32177OooO0o0.f115478OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC23990Oooooo3.flush();
                return new Integer(i5);
            }
            i5 = c32177OooO0o0.f115480OooOoO0;
            interfaceC23990Oooooo3 = c32177OooO0o0.f115478OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c32177OooO0o0.f115478OooOo0o = interfaceC23990Oooooo3;
            c32177OooO0o0.f115480OooOoO0 = i5;
            c32177OooO0o0.f115482OooOoo = 4;
        }
        c32177OooO0o0.f115478OooOo0o = interfaceC23990Oooooo;
        c32177OooO0o0.f115477OooOo = byteBuffer;
        c32177OooO0o0.f115480OooOoO0 = i;
        c32177OooO0o0.f115479OooOoO = i2;
        c32177OooO0o0.f115481OooOoOO = i3;
        c32177OooO0o0.f115482OooOoo = 2;
        if (interfaceC23990Oooooo.OooOoO((short) 3338, c32177OooO0o0) != enumC32485OooO00o) {
            int i9 = i2;
            byteBuffer2 = byteBuffer;
            i4 = i9;
            interfaceC23990Oooooo2 = interfaceC23990Oooooo;
            i5 = i3;
            c32177OooO0o0.f115478OooOo0o = interfaceC23990Oooooo2;
            c32177OooO0o0.f115477OooOo = null;
            c32177OooO0o0.f115480OooOoO0 = i5;
            c32177OooO0o0.f115482OooOoo = 3;
            if (interfaceC23990Oooooo2.OooOOo0(byteBuffer2, i, i4, c32177OooO0o0) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
