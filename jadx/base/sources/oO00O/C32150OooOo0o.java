package oO00O;

import androidx.appcompat.widget.C21532OooOOo;
import kotlin.coroutines.Continuation;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33707OooOOo0;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.InterfaceC33712OooOo0O;
import ooOOoOoO.InterfaceC35154OooO0o;

/* JADX INFO: renamed from: oO00O.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.tls.TLSClientHandshake$input$1", m80623f = "TLSClientHandshake.kt", m80624l = {60, 88}, m80625m = "invokeSuspend")
public final class C32150OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C32168OoooO0>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f115325OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115326OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115327OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f115328OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C32161Oooo0O0 f115329OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32150OooOo0o(io.ktor.utils.p616io.OooO00o oooO00o, Continuation continuation, C32161Oooo0O0 c32161Oooo0O0) {
        super(2, continuation);
        this.f115327OooOoO = oooO00o;
        this.f115329OooOoOO = c32161Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32150OooOo0o c32150OooOo0o = new C32150OooOo0o(this.f115327OooOoO, continuation, this.f115329OooOoOO);
        c32150OooOo0o.f115328OooOoO0 = obj;
        return c32150OooOo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C32168OoooO0> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C32150OooOo0o) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r11.f121482OooOoO.OooOOO(r12, r14) == r3) goto L31;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0123: INVOKE (r0 I:oO0o0OOo.OooOo0) = (r9 I:oO0o0OOo.OooOo0O) INTERFACE call: oO0o0OOo.OooOo0O.getChannel():oO0o0OOo.OooOo0 A[Catch: all -> 0x0130, MD:():oO0o0OOo.OooOo0 (m), TRY_ENTER], block:B:64:0x0123 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0132: INVOKE (r15 I:oO0o0OOo.OooOo0) = (r9 I:oO0o0OOo.OooOo0O) INTERFACE call: oO0o0OOo.OooOo0O.getChannel():oO0o0OOo.OooOo0 A[Catch: all -> 0x0130, MD:():oO0o0OOo.OooOo0 (m), TRY_ENTER], block:B:68:0x0132 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[Catch: all -> 0x001f, OooOOo0 -> 0x0132, TryCatch #1 {OooOOo0 -> 0x0132, blocks: (B:7:0x001a, B:17:0x003d, B:21:0x004f, B:23:0x0053, B:24:0x005f, B:26:0x0063, B:29:0x006b, B:32:0x0083, B:35:0x008d, B:38:0x0095, B:41:0x009f, B:44:0x00a7, B:46:0x00ab, B:49:0x00b3, B:52:0x00e0, B:53:0x00e9, B:54:0x00ea, B:55:0x00f3, B:57:0x00f6, B:60:0x00ff, B:61:0x011a, B:62:0x011b, B:63:0x0122, B:14:0x0030), top: B:74:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0080 -> B:8:0x001d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00fc -> B:17:0x003d). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C33710OooOo0 channel;
        C33710OooOo0 channel2;
        InterfaceC33712OooOo0O interfaceC33712OooOo0O;
        int i;
        int i2;
        int iOrdinal;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f115325OooOo;
        C32161Oooo0O0 c32161Oooo0O0 = this.f115329OooOoOO;
        try {
            try {
                try {
                    if (i3 == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f115328OooOoO0;
                        i = 0;
                        io.ktor.utils.p616io.OooO00o oooO00o = this.f115327OooOoO;
                        this.f115328OooOoO0 = interfaceC33712OooOo0O;
                        this.f115326OooOo0o = i;
                        this.f115325OooOo = 1;
                        objOooO0O0 = OooOOO0.OooO0O0(oooO00o, this);
                        if (objOooO0O0 == enumC32485OooO00o) {
                        }
                    } else if (i3 == 1) {
                        i2 = this.f115326OooOo0o;
                        interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f115328OooOoO0;
                        C32446OooOOOo.OooO0O0(obj);
                        C32168OoooO0 c32168OoooO0OooO0O0 = (C32168OoooO0) obj;
                        if (i2 != 0) {
                        }
                        C32266OooO0Oo c32266OooO0Oo = c32168OoooO0OooO0O0.f115399OooO0OO;
                        EnumC32170OoooO0O enumC32170OoooO0O = c32168OoooO0OooO0O0.f115397OooO00o;
                        iOrdinal = enumC32170OoooO0O.ordinal();
                        if (iOrdinal == 0) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = this.f115326OooOo0o;
                        interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f115328OooOoO0;
                        C32446OooOOOo.OooO0O0(obj);
                        i = i2;
                        io.ktor.utils.p616io.OooO00o oooO00o2 = this.f115327OooOoO;
                        this.f115328OooOoO0 = interfaceC33712OooOo0O;
                        this.f115326OooOo0o = i;
                        this.f115325OooOo = 1;
                        objOooO0O0 = OooOOO0.OooO0O0(oooO00o2, this);
                        if (objOooO0O0 == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        i2 = i;
                        obj = objOooO0O0;
                        C32168OoooO0 c32168OoooO0OooO0O02 = (C32168OoooO0) obj;
                        if (i2 != 0) {
                            c32168OoooO0OooO0O02 = ((InterfaceC35154OooO0o) c32161Oooo0O0.f115373OooOoo0.getValue()).OooO0O0(c32168OoooO0OooO0O02);
                        }
                        C32266OooO0Oo c32266OooO0Oo2 = c32168OoooO0OooO0O02.f115399OooO0OO;
                        EnumC32170OoooO0O enumC32170OoooO0O2 = c32168OoooO0OooO0O02.f115397OooO00o;
                        iOrdinal = enumC32170OoooO0O2.ordinal();
                        if (iOrdinal == 0) {
                            if (i2 != 0) {
                                throw new IllegalStateException("Check failed.");
                            }
                            byte b = c32266OooO0Oo2.readByte();
                            if (b != 1) {
                                throw new C32166Oooo0oo("Expected flag: 1, received " + ((int) b) + " in ChangeCipherSpec", 0);
                            }
                            i = 1;
                            io.ktor.utils.p616io.OooO00o oooO00o22 = this.f115327OooOoO;
                            this.f115328OooOoO0 = interfaceC33712OooOo0O;
                            this.f115326OooOo0o = i;
                            this.f115325OooOo = 1;
                            objOooO0O0 = OooOOO0.OooO0O0(oooO00o22, this);
                            if (objOooO0O0 == enumC32485OooO00o) {
                            }
                        } else {
                            if (iOrdinal == 1) {
                                EnumC32146OooOOo0[] enumC32146OooOOo0Arr = EnumC32146OooOOo0.f115299OooOo;
                                byte b2 = c32266OooO0Oo2.readByte();
                                EnumC32146OooOOo0 enumC32146OooOOo0 = (b2 < 0 || b2 >= 256) ? null : EnumC32146OooOOo0.f115299OooOo[b2];
                                if (enumC32146OooOOo0 == null) {
                                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(b2, "Invalid TLS record type code: "));
                                }
                                EnumC32145OooOOo[] enumC32145OooOOoArr = EnumC32145OooOOo.f115295OooOo;
                                byte b3 = c32266OooO0Oo2.readByte();
                                EnumC32145OooOOo enumC32145OooOOo = (b3 < 0 || b3 >= 256) ? null : EnumC32145OooOOo.f115295OooOo[b3];
                                if (enumC32145OooOOo == null) {
                                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(b3, "Invalid TLS record type code: "));
                                }
                                if (enumC32145OooOOo == EnumC32145OooOOo.CloseNotify) {
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    c32161Oooo0O0.f115374OooOooO.OooO0Oo(null);
                                    return c32460OooOooO;
                                }
                                interfaceC33712OooOo0O.getChannel().OooO0Oo(new C32166Oooo0oo("Received alert during handshake. Level: " + enumC32146OooOOo0 + ", code: " + enumC32145OooOOo, 0));
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                c32161Oooo0O0.f115374OooOooO.OooO0Oo(null);
                                return c32460OooOooO2;
                            }
                            C33710OooOo0 channel3 = interfaceC33712OooOo0O.getChannel();
                            C32168OoooO0 c32168OoooO0 = new C32168OoooO0(enumC32170OoooO0O2, c32266OooO0Oo2, 2);
                            this.f115328OooOoO0 = interfaceC33712OooOo0O;
                            this.f115326OooOo0o = i2;
                            this.f115325OooOo = 2;
                        }
                    }
                } catch (C33707OooOOo0 unused) {
                    channel2.getChannel().OooO0Oo(null);
                    c32161Oooo0O0.f115374OooOooO.OooO0Oo(null);
                    return C32460OooOooO.f116667OooO00o;
                }
            } catch (Throwable th) {
                channel.getChannel().OooO0Oo(th);
                c32161Oooo0O0.f115374OooOooO.OooO0Oo(null);
                return C32460OooOooO.f116667OooO00o;
            }
        } catch (Throwable th2) {
            c32161Oooo0O0.f115374OooOooO.OooO0Oo(null);
            throw th2;
        }
    }
}
