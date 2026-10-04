package oO00Oo;

import androidx.datastore.preferences.protobuf.o000oOoO;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C24034Oooo00O;
import o0Oo00oO.C28035OooO00o;
import oO00Oo.AbstractC32252OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32262OooOOo implements InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115916OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC23990Oooooo f115917OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final oO00Oo0o.OooO0o<ByteBuffer> f115918OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f115919OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33695OooO0o0 f115920OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOO0O f115921OooOoo0;

    /* JADX INFO: renamed from: oO00Oo.OooOOo$OooO00o */
    public static final class OooO00o {
    }

    public C32262OooOOo(InterfaceC23990Oooooo writeChannel, InterfaceC34415OooO0oo coroutineContext, oO00Oo0o.OooO0o oooO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(writeChannel, "writeChannel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        this.f115917OooOo0o = writeChannel;
        this.f115916OooOo = coroutineContext;
        this.f115919OooOoO0 = true;
        this.f115918OooOoO = oooO0o;
        this.f115920OooOoOO = C33703OooOOO0.OooO00o(8, 6, null);
        this.f115921OooOoo0 = new OooOO0O();
        C33609OooO0oo.OooO0O0(this, new C33635Oooo00O("ws-writer"), EnumC33637Oooo0O0.f121319OooOoO0, new C32265OooOo0(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:13:0x0035, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:40:0x00a2, B:42:0x00a6, B:43:0x00ab, B:44:0x00ac, B:45:0x00c0, B:20:0x004d), top: B:82:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[Catch: CancellationException -> 0x0121, TryCatch #0 {CancellationException -> 0x0121, blocks: (B:51:0x00e1, B:54:0x00ec, B:56:0x00f0, B:61:0x00fa, B:63:0x00fe, B:69:0x0109, B:70:0x011d, B:66:0x0104, B:71:0x011e, B:72:0x0120, B:59:0x00f6), top: B:79:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0091 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C32262OooOOo c32262OooOOo, ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOo00 oooOo00;
        C33695OooO0o0 c33695OooO0o0;
        CancellationException cancellationExceptionOooO00o;
        C32262OooOOo c32262OooOOo2;
        C33695OooO0o0 c33695OooO0o02;
        Object objOooO0O0;
        InterfaceC33701OooOO0o oooO00o;
        C32262OooOOo c32262OooOOo3;
        InterfaceC33701OooOO0o interfaceC33701OooOO0o;
        C32262OooOOo c32262OooOOo4;
        C32262OooOOo c32262OooOOo5;
        c32262OooOOo.getClass();
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i = oooOo00.f115942OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f115942OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(c32262OooOOo, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O02 = oooOo00.f115939OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        C32262OooOOo c32262OooOOo6 = oooOo00.f115942OooOoo0;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (c32262OooOOo6 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O02);
            byteBuffer.clear();
            try {
                C33695OooO0o0 c33695OooO0o03 = c32262OooOOo.f115920OooOoOO;
                c33695OooO0o03.getClass();
                oooO00o = new C33695OooO0o0.OooO00o();
                c32262OooOOo5 = c32262OooOOo;
                oooOo00.f115938OooOo0o = c32262OooOOo5;
                oooOo00.f115937OooOo = byteBuffer;
                oooOo00.f115940OooOoO0 = oooO00o;
                oooOo00.f115942OooOoo0 = 1;
                objOooO0O02 = oooO00o.OooO00o(oooOo00);
                if (objOooO0O02 != obj) {
                }
                return obj;
            } catch (Throwable th2) {
                c32262OooOOo6 = c32262OooOOo;
                th = th2;
                try {
                    c32262OooOOo6.f115920OooOoOO.OooOOOo(false, th);
                    c33695OooO0o0 = c32262OooOOo6.f115920OooOoOO;
                    cancellationExceptionOooO00o = C28035OooO00o.OooO00o("WebSocket closed.", null);
                    c32262OooOOo2 = c32262OooOOo6;
                } catch (Throwable th3) {
                    c32262OooOOo6.f115920OooOoOO.OooOOOo(false, C28035OooO00o.OooO00o("WebSocket closed.", null));
                    C23992OoooooO.OooO0O0(c32262OooOOo6.f115917OooOo0o);
                    throw th3;
                }
            }
        } else {
            if (c32262OooOOo6 != 1) {
                if (c32262OooOOo6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33701OooOO0o = oooOo00.f115940OooOoO0;
                byteBuffer = oooOo00.f115937OooOo;
                C32262OooOOo c32262OooOOo7 = oooOo00.f115938OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O02);
                C32262OooOOo c32262OooOOo8 = c32262OooOOo7;
                C32262OooOOo c32262OooOOo9 = c32262OooOOo8;
                oooO00o = interfaceC33701OooOO0o;
                c32262OooOOo = c32262OooOOo9;
                c32262OooOOo5 = c32262OooOOo;
                if (((Boolean) objOooO0O02).booleanValue()) {
                    c32262OooOOo3 = c32262OooOOo;
                    c33695OooO0o0 = c32262OooOOo3.f115920OooOoOO;
                    cancellationExceptionOooO00o = C28035OooO00o.OooO00o("WebSocket closed.", null);
                    c32262OooOOo2 = c32262OooOOo3;
                    c33695OooO0o0.OooOOOo(false, cancellationExceptionOooO00o);
                    C23992OoooooO.OooO0O0(c32262OooOOo2.f115917OooOo0o);
                    c33695OooO0o02 = c32262OooOOo2.f115920OooOoOO;
                    c33695OooO0o02.OooO0Oo(null);
                    while (true) {
                        try {
                            objOooO0O0 = C33702OooOOO.OooO0O0(c33695OooO0o02.OooO0oo());
                            if (objOooO0O0 == null) {
                                break;
                            }
                            if (!(objOooO0O0 instanceof AbstractC32252OooO0O0.C20211OooO0O0)) {
                                if (objOooO0O0 instanceof AbstractC32252OooO0O0.OooO0OO ? true : objOooO0O0 instanceof AbstractC32252OooO0O0.C32253OooO0Oo) {
                                    continue;
                                } else {
                                    if (objOooO0O0 instanceof OooO00o) {
                                        throw null;
                                    }
                                    if (!(objOooO0O0 instanceof AbstractC32252OooO0O0.OooO0o0 ? true : objOooO0O0 instanceof AbstractC32252OooO0O0.OooO00o)) {
                                        throw new IllegalArgumentException("unknown message " + objOooO0O0);
                                    }
                                }
                            }
                        } catch (CancellationException unused) {
                        }
                    }
                }
                oooOo00.f115938OooOo0o = c32262OooOOo5;
                oooOo00.f115937OooOo = byteBuffer;
                oooOo00.f115940OooOoO0 = oooO00o;
                oooOo00.f115942OooOoo0 = 1;
                objOooO0O02 = oooO00o.OooO00o(oooOo00);
                if (objOooO0O02 != obj) {
                    InterfaceC33701OooOO0o interfaceC33701OooOO0o2 = oooO00o;
                    c32262OooOOo4 = c32262OooOOo5;
                    interfaceC33701OooOO0o = interfaceC33701OooOO0o2;
                    c32262OooOOo3 = c32262OooOOo4;
                    if (((Boolean) objOooO0O02).booleanValue()) {
                        Object next = interfaceC33701OooOO0o.next();
                        if (!(next instanceof AbstractC32252OooO0O0)) {
                            if (next instanceof OooO00o) {
                                ((OooO00o) next).getClass();
                                throw null;
                            }
                            throw new IllegalArgumentException("unknown message " + next);
                        }
                        oooOo00.f115938OooOo0o = c32262OooOOo4;
                        oooOo00.f115937OooOo = byteBuffer;
                        oooOo00.f115940OooOoO0 = interfaceC33701OooOO0o;
                        oooOo00.f115942OooOoo0 = 2;
                        objOooO0O02 = c32262OooOOo4.OooO0O0((AbstractC32252OooO0O0) next, byteBuffer, oooOo00);
                        c32262OooOOo8 = c32262OooOOo4;
                    }
                    c33695OooO0o0 = c32262OooOOo3.f115920OooOoOO;
                    cancellationExceptionOooO00o = C28035OooO00o.OooO00o("WebSocket closed.", null);
                    c32262OooOOo2 = c32262OooOOo3;
                    c33695OooO0o0.OooOOOo(false, cancellationExceptionOooO00o);
                    C23992OoooooO.OooO0O0(c32262OooOOo2.f115917OooOo0o);
                    c33695OooO0o02 = c32262OooOOo2.f115920OooOoOO;
                    c33695OooO0o02.OooO0Oo(null);
                    while (true) {
                        objOooO0O0 = C33702OooOOO.OooO0O0(c33695OooO0o02.OooO0oo());
                        if (objOooO0O0 == null) {
                        }
                    }
                }
                return obj;
            }
            interfaceC33701OooOO0o = oooOo00.f115940OooOoO0;
            byteBuffer = oooOo00.f115937OooOo;
            C32262OooOOo c32262OooOOo10 = oooOo00.f115938OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O02);
            c32262OooOOo4 = c32262OooOOo10;
            c32262OooOOo3 = c32262OooOOo4;
            if (((Boolean) objOooO0O02).booleanValue()) {
            }
            c33695OooO0o0 = c32262OooOOo3.f115920OooOoOO;
            cancellationExceptionOooO00o = C28035OooO00o.OooO00o("WebSocket closed.", null);
            c32262OooOOo2 = c32262OooOOo3;
            c33695OooO0o0.OooOOOo(false, cancellationExceptionOooO00o);
            C23992OoooooO.OooO0O0(c32262OooOOo2.f115917OooOo0o);
            c33695OooO0o02 = c32262OooOOo2.f115920OooOoOO;
            c33695OooO0o02.OooO0Oo(null);
            while (true) {
                objOooO0O0 = C33702OooOOO.OooO0O0(c33695OooO0o02.OooO0oo());
                if (objOooO0O0 == null) {
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0175, code lost:
    
        if (r0 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0177, code lost:
    
        r0 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0179, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017c, code lost:
    
        if (r13.f115842OooO0Oo == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017e, code lost:
    
        r15 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0181, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0182, code lost:
    
        r0 = r0 | r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0185, code lost:
    
        if (r13.f115844OooO0o0 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0187, code lost:
    
        r15 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x018a, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018b, code lost:
    
        r0 = r0 | r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x018e, code lost:
    
        if (r13.f115843OooO0o == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0190, code lost:
    
        r13 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0193, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0194, code lost:
    
        r1.put((byte) ((r0 | r13) | r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x019a, code lost:
    
        if (r14 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019d, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x019e, code lost:
    
        r1.put((byte) (r6 | r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a6, code lost:
    
        if (r12 == 126) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01aa, code lost:
    
        if (r12 == 127) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ad, code lost:
    
        r1.putLong(r10.remaining());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01b6, code lost:
    
        r1.putShort((short) r10.remaining());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01be, code lost:
    
        r0 = r11.f115885OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c0, code lost:
    
        if (r0 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c2, code lost:
    
        r0 = r0.duplicate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c6, code lost:
    
        if (r0 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c8, code lost:
    
        io.ktor.utils.p616io.internal.OooOOO0.OooO0O0(r0, r1, Integer.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ce, code lost:
    
        r9.remove();
        r0 = r11.f115885OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d3, code lost:
    
        if (r0 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01d5, code lost:
    
        r6 = java.nio.ByteBuffer.allocate(r10.remaining());
        r7 = r10.slice();
        kotlin.jvm.internal.OooOOO0.OooO0o(r7, "this@copy.slice()");
        kotlin.jvm.internal.OooOOO0.OooO0o(r6, "this@apply");
        io.ktor.utils.p616io.internal.OooOOO0.OooO0O0(r7, r6, Integer.MAX_VALUE);
        r6.clear();
        o0oOOoOO.C30847OooO0Oo.OooO0o(r6, r0);
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f8, code lost:
    
        r11.f115884OooO0O0 = r10;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0207, code lost:
    
        throw new java.lang.IllegalStateException("Can't continue with different data frame opcode");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0208, code lost:
    
        r1.flip();
        r9 = r8;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x020c, code lost:
    
        r5.f115927OooOo0o = r9;
        r5.f115926OooOo = r1;
        r5.f115929OooOoO0 = r3;
        r5.f115928OooOoO = r2 == true ? 1 : 0;
        r0 = true;
        r5.f115931OooOoo = 1;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x021d, code lost:
    
        if (r9.f115917OooOo0o.OooOO0O(r1, r5) != r4) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x021f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0250, code lost:
    
        if (r1.hasRemaining() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (r2 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        r10.OooO0Oo(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (r11.f115883OooO00o.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r11.f115884OooO0O0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        if (r9 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r1.position() == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        r8.f115917OooOo0o.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if (((oO00Oo.C32262OooOOo.OooO00o) r3.f80942OooOo0o) != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
    
        return java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dd, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        r11.f115887OooO0o0 = r8.f115919OooOoO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(r1, "buffer");
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r9 = r11.f115884OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
    
        if (r9 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
    
        io.ktor.utils.p616io.internal.OooOOO0.OooO0O0(r9, r1, Integer.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        if (r9.hasRemaining() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        r11.f115884OooO0O0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fa, code lost:
    
        r9 = r11.f115883OooO00o;
        r13 = r9.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0102, code lost:
    
        if (r13 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r14 = r11.f115887OooO0o0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
    
        if (r14 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010b, code lost:
    
        r10 = java.nio.ByteBuffer.allocate(4);
        oO0O00o.OooO0OO.f116801OooOo0o.getClass();
        r10.putInt(oO0O00o.OooO0OO.f116800OooOo.OooO0OO());
        r10.clear();
        r11.f115885OooO0OO = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:
    
        r11.f115885OooO0OO = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:
    
        r10 = r13.f115845OooO0oO;
        r15 = r10.remaining();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        if (r15 >= 126) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012f, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0133, code lost:
    
        if (r15 > 32767) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0135, code lost:
    
        r15 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
    
        r15 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0139, code lost:
    
        if (r14 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013b, code lost:
    
        r12 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0143, code lost:
    
        if (r1.remaining() >= (r15 + r12)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0147, code lost:
    
        r12 = r10.remaining();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014b, code lost:
    
        if (r12 >= 126) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0151, code lost:
    
        if (r12 > 65535) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0153, code lost:
    
        r12 = 126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0155, code lost:
    
        r12 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0157, code lost:
    
        r15 = r11.f115886OooO0Oo;
        r6 = r13.f115840OooO0O0;
        r7 = r6.f115872OooOo;
        r0 = r13.f115839OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015f, code lost:
    
        if (r15 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        if (r0 != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0163, code lost:
    
        r11.f115886OooO0Oo = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0166, code lost:
    
        if (r15 != r6) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0168, code lost:
    
        if (r0 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016a, code lost:
    
        r11.f115886OooO0Oo = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016d, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
    
        if (r6.f115873OooOo0o == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0173, code lost:
    
        r6 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v21, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x021d -> B:141:0x0220). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32252OooO0O0 f, ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C32264OooOOoo c32264OooOOoo;
        C32262OooOOo c32262OooOOo;
        C32264OooOOoo c32264OooOOoo2;
        C24034Oooo00O c24034Oooo00O;
        ?? r2;
        ByteBuffer buffer;
        Object obj;
        ?? OooO0O02;
        if (abstractC32479OooO0OO instanceof C32264OooOOoo) {
            c32264OooOOoo = (C32264OooOOoo) abstractC32479OooO0OO;
            int i = c32264OooOOoo.f115931OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32264OooOOoo.f115931OooOoo = i - Integer.MIN_VALUE;
            } else {
                c32264OooOOoo = new C32264OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c32264OooOOoo.f115930OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32264OooOOoo.f115931OooOoo;
        boolean z = true;
        Throwable th = null;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
            OooOO0O oooOO0O = this.f115921OooOoo0;
            oooOO0O.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
            oooOO0O.f115883OooO00o.put(f);
            c32262OooOOo = this;
            c32264OooOOoo2 = c32264OooOOoo;
            c24034Oooo00O = c24034Oooo00O2;
            r2 = f instanceof AbstractC32252OooO0O0.C20211OooO0O0;
            buffer = byteBuffer;
            while (true) {
                obj = c24034Oooo00O.f80942OooOo0o;
                C33695OooO0o0 c33695OooO0o0 = c32262OooOOo.f115920OooOoOO;
                OooOO0O oooOO0O2 = c32262OooOOo.f115921OooOoo0;
                if (obj != null) {
                    break;
                }
                break;
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = c32264OooOOoo.f115928OooOoO;
        C24034Oooo00O c24034Oooo00O3 = c32264OooOOoo.f115929OooOoO0;
        ByteBuffer byteBuffer2 = c32264OooOOoo.f115926OooOo;
        C32262OooOOo c32262OooOOo2 = c32264OooOOoo.f115927OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        c32264OooOOoo2 = c32264OooOOoo;
        c24034Oooo00O = c24034Oooo00O3;
        ?? r22 = i3;
        boolean z2 = true;
        buffer = byteBuffer2;
        OooOO0O oooOO0O3 = c32262OooOOo2.f115921OooOoo0;
        if (oooOO0O3.f115883OooO00o.isEmpty() && oooOO0O3.f115884OooO0O0 == null && !buffer.hasRemaining() && ((OooO00o) c24034Oooo00O.f80942OooOo0o) != null) {
            c32262OooOOo2.f115917OooOo0o.flush();
            throw null;
        }
        if (c24034Oooo00O.f80942OooOo0o != null || r22 != 0) {
            ?? r23 = r22;
        }
        buffer.compact();
        z = z2;
        c32262OooOOo = c32262OooOOo2;
        th = null;
        r2 = r22;
        while (true) {
            obj = c24034Oooo00O.f80942OooOo0o;
            C33695OooO0o0 c33695OooO0o02 = c32262OooOOo.f115920OooOoOO;
            OooOO0O oooOO0O22 = c32262OooOOo.f115921OooOoo0;
            if (obj != null || r2 != 0 || oooOO0O22.f115883OooO00o.remainingCapacity() <= 0 || (OooO0O02 = C33702OooOOO.OooO0O0(c33695OooO0o02.OooO0oo())) == 0) {
                break;
            }
            if (OooO0O02 instanceof OooO00o) {
                c24034Oooo00O.f80942OooOo0o = OooO0O02;
            } else {
                boolean z3 = OooO0O02 instanceof AbstractC32252OooO0O0.C20211OooO0O0;
                ArrayBlockingQueue<AbstractC32252OooO0O0> arrayBlockingQueue = oooOO0O22.f115883OooO00o;
                if (z3) {
                    arrayBlockingQueue.put((AbstractC32252OooO0O0) OooO0O02);
                    r2 = z;
                } else {
                    if (!(OooO0O02 instanceof AbstractC32252OooO0O0)) {
                        throw new IllegalArgumentException(o000oOoO.OooO00o(OooO0O02, "unknown message "));
                    }
                    arrayBlockingQueue.put((AbstractC32252OooO0O0) OooO0O02);
                }
            }
        }
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115916OooOo;
    }
}
