package oO00O;

import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import io.ktor.utils.p616io.o0O0O00;
import io.ktor.utils.p616io.o0Oo0oo;
import java.io.IOException;
import java.nio.ByteBuffer;
import o00ooO0.C25749OooOoO0;
import oO00O.EnumC32170OoooO0O;
import oO00O0oo.InterfaceC32225OooOOo0;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33690OooO00o;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oO0o0OOo.InterfaceC33709OooOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00O.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32171OoooOO0 implements InterfaceC33636Oooo00o, InterfaceC32225OooOOo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33690OooO00o f115417OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33710OooOo0 f115418OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115419OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32225OooOOo0 f115420OooOoO0;

    /* JADX INFO: renamed from: oO00O.OoooOO0$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f115421OooO00o;

        static {
            int[] iArr = new int[EnumC32170OoooO0O.values().length];
            try {
                EnumC32170OoooO0O.OooO00o oooO00o = EnumC32170OoooO0O.f115409OooOo;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f115421OooO00o = iArr;
        }
    }

    public C32171OoooOO0(C33710OooOo0 input, C33690OooO00o output, InterfaceC32225OooOOo0 socket, InterfaceC34415OooO0oo coroutineContext) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        kotlin.jvm.internal.OooOOO0.OooO0oO(output, "output");
        kotlin.jvm.internal.OooOOO0.OooO0oO(socket, "socket");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        this.f115418OooOo0o = input;
        this.f115417OooOo = output;
        this.f115420OooOoO0 = socket;
        this.f115419OooOoO = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x002f, B:29:0x0068, B:31:0x0070, B:33:0x007a, B:35:0x0088, B:42:0x00a2, B:43:0x00c6, B:44:0x00c7, B:20:0x0047), top: B:57:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x002f, B:29:0x0068, B:31:0x0070, B:33:0x007a, B:35:0x0088, B:42:0x00a2, B:43:0x00c6, B:44:0x00c7, B:20:0x0047), top: B:57:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.ktor.utils.io.Oooooo] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [io.ktor.utils.io.Oooooo] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [io.ktor.utils.io.Oooooo] */
    /* JADX WARN: Type inference failed for: r12v3, types: [oO0o0OOo.OooOo] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [io.ktor.utils.io.Oooooo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.utils.io.Oooooo] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0096 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOooo(C32171OoooOO0 c32171OoooOO0, InterfaceC23990Oooooo interfaceC23990Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000oOoO o000oooo2;
        InterfaceC33709OooOo interfaceC33709OooOo;
        InterfaceC33701OooOO0o it;
        InterfaceC33709OooOo interfaceC33709OooOo2;
        InterfaceC33701OooOO0o interfaceC33701OooOO0o;
        ?? r2;
        Object objOooO00o;
        c32171OoooOO0.getClass();
        if (abstractC32479OooO0OO instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) abstractC32479OooO0OO;
            int i = o000oooo2.f115446OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f115446OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(c32171OoooOO0, abstractC32479OooO0OO);
            }
        }
        Object obj = o000oooo2.f115443OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r22 = o000oooo2.f115446OooOoo0;
        try {
            try {
            } catch (Throwable unused) {
                interfaceC23990Oooooo = r22;
            }
            if (r22 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                try {
                    interfaceC33709OooOo = c32171OoooOO0.f115418OooOo0o;
                    try {
                        it = interfaceC33709OooOo.iterator();
                        interfaceC23990Oooooo = interfaceC23990Oooooo;
                        o000oooo2.f115442OooOo0o = interfaceC23990Oooooo;
                        o000oooo2.f115441OooOo = interfaceC33709OooOo;
                        o000oooo2.f115444OooOoO0 = it;
                        o000oooo2.f115446OooOoo0 = 1;
                        objOooO00o = it.OooO00o(o000oooo2);
                        if (objOooO00o != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    } catch (Throwable th) {
                        r22 = interfaceC23990Oooooo;
                        interfaceC23990Oooooo = interfaceC33709OooOo;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C25749OooOoO0.OooO0O0(interfaceC23990Oooooo, th);
                            throw th2;
                        }
                    }
                } catch (Throwable unused2) {
                    C23992OoooooO.OooO0O0(interfaceC23990Oooooo);
                }
            } else {
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33701OooOO0o = o000oooo2.f115444OooOoO0;
                    interfaceC33709OooOo2 = o000oooo2.f115441OooOo;
                    InterfaceC23990Oooooo interfaceC23990Oooooo2 = o000oooo2.f115442OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    ?? r23 = interfaceC23990Oooooo2;
                    it = interfaceC33701OooOO0o;
                    interfaceC33709OooOo = interfaceC33709OooOo2;
                    ?? r12 = r23;
                    r12.flush();
                    interfaceC23990Oooooo = r12;
                    o000oooo2.f115442OooOo0o = interfaceC23990Oooooo;
                    o000oooo2.f115441OooOo = interfaceC33709OooOo;
                    o000oooo2.f115444OooOoO0 = it;
                    o000oooo2.f115446OooOoo0 = 1;
                    objOooO00o = it.OooO00o(o000oooo2);
                    if (objOooO00o != enumC32485OooO00o) {
                        ?? r10 = interfaceC23990Oooooo;
                        interfaceC33709OooOo2 = interfaceC33709OooOo;
                        interfaceC33701OooOO0o = it;
                        obj = objOooO00o;
                        r2 = r10;
                        if (((Boolean) obj).booleanValue()) {
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            interfaceC33709OooOo2.cancel(null);
                            C23992OoooooO.OooO0O0(r2);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        C32168OoooO0 c32168OoooO0 = (C32168OoooO0) interfaceC33701OooOO0o.next();
                        C32266OooO0Oo c32266OooO0Oo = c32168OoooO0.f115399OooO0OO;
                        EnumC32170OoooO0O enumC32170OoooO0O = c32168OoooO0.f115397OooO00o;
                        long jOooo0 = c32266OooO0Oo.Oooo0();
                        if (OooO00o.f115421OooO00o[enumC32170OoooO0O.ordinal()] != 1) {
                            throw new C32166Oooo0oo("Unexpected record " + enumC32170OoooO0O + " (" + jOooo0 + " bytes)", 0);
                        }
                        C32266OooO0Oo c32266OooO0Oo2 = c32168OoooO0.f115399OooO0OO;
                        o000oooo2.f115442OooOo0o = r2;
                        o000oooo2.f115441OooOo = interfaceC33709OooOo2;
                        o000oooo2.f115444OooOoO0 = interfaceC33701OooOO0o;
                        o000oooo2.f115446OooOoo0 = 2;
                        Object objOooOO0 = r2.OooOO0(c32266OooO0Oo2, o000oooo2);
                        r23 = r2;
                    }
                    return enumC32485OooO00o;
                }
                interfaceC33701OooOO0o = o000oooo2.f115444OooOoO0;
                interfaceC33709OooOo2 = o000oooo2.f115441OooOo;
                InterfaceC23990Oooooo interfaceC23990Oooooo3 = o000oooo2.f115442OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r2 = interfaceC23990Oooooo3;
                if (((Boolean) obj).booleanValue()) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        if (r14.OooOOO(r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #3 {all -> 0x003d, blocks: (B:13:0x0034, B:28:0x007f, B:30:0x0088, B:32:0x009b, B:36:0x00b4, B:37:0x00b7, B:20:0x0052, B:31:0x0094), top: B:53:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: all -> 0x00c5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:38:0x00b8, B:46:0x00d0, B:47:0x00d5), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r14v11, types: [oO00Oo0o.OooO0o] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [oO00Oo0o.OooO0o] */
    /* JADX WARN: Type inference failed for: r14v5, types: [oO00Oo0o.OooO0OO, oO00Oo0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [oO00Oo0o.OooO0o] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b0 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo000(C32171OoooOO0 c32171OoooOO0, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32172OoooOOO c32172OoooOOO;
        ?? r14;
        Object objO0000OoO;
        C32171OoooOO0 c32171OoooOO02;
        ByteBuffer byteBuffer;
        Object obj;
        ByteBuffer byteBuffer2;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        ?? r2;
        ?? r142;
        Object objOooO0oO;
        c32171OoooOO0.getClass();
        if (abstractC32479OooO0OO instanceof C32172OoooOOO) {
            c32172OoooOOO = (C32172OoooOOO) abstractC32479OooO0OO;
            int i = c32172OoooOOO.f115429OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32172OoooOOO.f115429OooOooO = i - Integer.MIN_VALUE;
            } else {
                c32172OoooOOO = new C32172OoooOOO(c32171OoooOO0, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c32172OoooOOO.f115428OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r22 = c32172OoooOOO.f115429OooOooO;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                r14 = r22;
                objO0000OoO = interfaceC23986Ooooo0o;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (r22 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            r14 = io.ktor.network.util.OooO00o.f80481OooO00o;
            objO0000OoO = r14.o0000OoO();
            try {
                byteBuffer = (ByteBuffer) objO0000OoO;
                r142 = r14;
                byteBuffer.clear();
                c32172OoooOOO.f115423OooOo0o = c32171OoooOO0;
                c32172OoooOOO.f115422OooOo = interfaceC23986Ooooo0o;
                c32172OoooOOO.f115425OooOoO0 = r142;
                c32172OoooOOO.f115424OooOoO = objO0000OoO;
                c32172OoooOOO.f115426OooOoOO = byteBuffer;
                c32172OoooOOO.f115429OooOooO = 1;
                objOooO0oO = interfaceC23986Ooooo0o.OooO0oO(byteBuffer, c32172OoooOOO);
                if (objOooO0oO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                th = th3;
                r14.o00o0O(objO0000OoO);
                throw th;
            }
        }
        if (r22 == 1) {
            byteBuffer2 = c32172OoooOOO.f115426OooOoOO;
            obj = c32172OoooOOO.f115424OooOoO;
            oO00Oo0o.OooO0o oooO0o = c32172OoooOOO.f115425OooOoO0;
            interfaceC23986Ooooo0o2 = c32172OoooOOO.f115422OooOo;
            c32171OoooOO02 = c32172OoooOOO.f115423OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            r2 = oooO0o;
            if (((Number) obj2).intValue() != -1) {
            }
            c32171OoooOO02.f115417OooOo.OooO0Oo(null);
            throw th;
        }
        if (r22 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        byteBuffer2 = c32172OoooOOO.f115426OooOoOO;
        obj = c32172OoooOOO.f115424OooOoO;
        oO00Oo0o.OooO0o oooO0o2 = c32172OoooOOO.f115425OooOoO0;
        interfaceC23986Ooooo0o2 = c32172OoooOOO.f115422OooOo;
        c32171OoooOO02 = c32172OoooOOO.f115423OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        ?? r23 = oooO0o2;
        r142 = r23;
        objO0000OoO = obj;
        interfaceC23986Ooooo0o = interfaceC23986Ooooo0o2;
        byteBuffer = byteBuffer2;
        c32171OoooOO0 = c32171OoooOO02;
        try {
            byteBuffer.clear();
            c32172OoooOOO.f115423OooOo0o = c32171OoooOO0;
            c32172OoooOOO.f115422OooOo = interfaceC23986Ooooo0o;
            c32172OoooOOO.f115425OooOoO0 = r142;
            c32172OoooOOO.f115424OooOoO = objO0000OoO;
            c32172OoooOOO.f115426OooOoOO = byteBuffer;
            c32172OoooOOO.f115429OooOooO = 1;
            objOooO0oO = interfaceC23986Ooooo0o.OooO0oO(byteBuffer, c32172OoooOOO);
        } catch (Throwable th4) {
            c32171OoooOO02 = c32171OoooOO0;
            th = th4;
        }
        if (objOooO0oO != enumC32485OooO00o) {
            c32171OoooOO02 = c32171OoooOO0;
            byteBuffer2 = byteBuffer;
            interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o;
            obj = objO0000OoO;
            r2 = r142;
            obj2 = objOooO0oO;
            if (((Number) obj2).intValue() != -1) {
                c32171OoooOO02.f115417OooOo.OooO0Oo(null);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                r2.o00o0O(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            byteBuffer2.flip();
            C33690OooO00o c33690OooO00o = c32171OoooOO02.f115417OooOo;
            EnumC32170OoooO0O enumC32170OoooO0O = EnumC32170OoooO0O.ApplicationData;
            oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
            try {
                io.ktor.utils.p616io.internal.OooOOO0.OooO0OO(oooO0OO, byteBuffer2);
                C32168OoooO0 c32168OoooO0 = new C32168OoooO0(enumC32170OoooO0O, oooO0OO.ooOO(), 2);
                c32172OoooOOO.f115423OooOo0o = c32171OoooOO02;
                c32172OoooOOO.f115422OooOo = interfaceC23986Ooooo0o2;
                c32172OoooOOO.f115425OooOoO0 = r2;
                c32172OoooOOO.f115424OooOoO = obj;
                c32172OoooOOO.f115426OooOoOO = byteBuffer2;
                c32172OoooOOO.f115429OooOooO = 2;
                r23 = r2;
            } finally {
            }
            c32171OoooOO02.f115417OooOo.OooO0Oo(null);
            throw th;
        }
        return enumC32485OooO00o;
    }

    @Override // oO00O0oo.InterfaceC32217OooO0OO
    public final o0Oo0oo OooO00o(io.ktor.utils.p616io.OooO00o oooO00o) {
        InterfaceC34415OooO0oo coroutineContext = this.f115419OooOoO.plus(new C33635Oooo00O("cio-tls-output-loop"));
        C32174OoooOo0 c32174OoooOo0 = new C32174OoooOo0(this, null);
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        return C24005o00o0O.OooO00o(this, coroutineContext, oooO00o, false, c32174OoooOo0);
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115419OooOoO;
    }

    @Override // oO00O0oo.InterfaceC32215OooO00o
    public final o0O0O00 OooOOoo(io.ktor.utils.p616io.OooO00o oooO00o) {
        return C24005o00o0O.OooO0O0(this, this.f115419OooOoO.plus(new C33635Oooo00O("cio-tls-input-loop")), oooO00o, new C32173OoooOOo(this, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f115420OooOoO0.close();
    }

    @Override // oO00O0oo.InterfaceC32216OooO0O0, oO0o0OO.InterfaceC33651OoooOoO
    public final void dispose() {
        this.f115420OooOoO0.dispose();
    }
}
