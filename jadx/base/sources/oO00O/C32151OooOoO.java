package oO00O;

import OooOooO.C20730OooO0oO;
import io.ktor.utils.p616io.C23992OoooooO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.InterfaceC33691OooO0O0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import ooOOoOoO.InterfaceC35154OooO0o;

/* JADX INFO: renamed from: oO00O.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.tls.TLSClientHandshake$output$1", m80623f = "TLSClientHandshake.kt", m80624l = {105, 110, 116, 116}, m80625m = "invokeSuspend")
public final class C32151OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33691OooO0O0<C32168OoooO0>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f115330OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33701OooOO0o f115331OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f115332OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f115333OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C32161Oooo0O0 f115334OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115335OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32151OooOoO(io.ktor.utils.p616io.OooO00o oooO00o, Continuation continuation, C32161Oooo0O0 c32161Oooo0O0) {
        super(2, continuation);
        this.f115334OooOoOO = c32161Oooo0O0;
        this.f115335OooOoo0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32151OooOoO c32151OooOoO = new C32151OooOoO(this.f115335OooOoo0, continuation, this.f115334OooOoOO);
        c32151OooOoO.f115332OooOoO = obj;
        return c32151OooOoO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33691OooO0O0<C32168OoooO0> interfaceC33691OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C32151OooOoO) create(interfaceC33691OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (OooOooO.C20730OooO0oO.OooO0o(r2, r11, r14) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        if (OooOooO.C20730OooO0oO.OooO0o(r2, r5, r14) == r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:24:0x0061, B:28:0x0077, B:30:0x007f, B:40:0x00ad, B:18:0x004a, B:23:0x0058, B:13:0x0034, B:32:0x0087, B:34:0x0097, B:37:0x009e), top: B:69:0x000c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00aa -> B:14:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ad -> B:41:0x00b4). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        oO00Oo0.OooO0OO oooO0OO;
        Throwable th;
        InterfaceC33691OooO0O0 interfaceC33691OooO0O0;
        InterfaceC33701OooOO0o it;
        int i;
        InterfaceC33691OooO0O0 interfaceC33691OooO0O02;
        InterfaceC33701OooOO0o interfaceC33701OooOO0o;
        int i2;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f115333OooOoO0;
        io.ktor.utils.p616io.OooO00o oooO00o = this.f115335OooOoo0;
        try {
        } catch (Throwable th2) {
            EnumC32170OoooO0O enumC32170OoooO0O = EnumC32170OoooO0O.Alert;
            oooO0OO = new oO00Oo0.OooO0OO(null);
            try {
                EnumC32146OooOOo0[] enumC32146OooOOo0Arr = EnumC32146OooOOo0.f115299OooOo;
                oooO0OO.o00000oO((byte) 1);
                EnumC32145OooOOo[] enumC32145OooOOoArr = EnumC32145OooOOo.f115295OooOo;
                oooO0OO.o00000oO((byte) 0);
                C32168OoooO0 c32168OoooO0 = new C32168OoooO0(enumC32170OoooO0O, oooO0OO.ooOO(), 2);
                this.f115332OooOoO = th2;
                this.f115331OooOo0o = null;
                this.f115333OooOoO0 = 4;
                if (C20730OooO0oO.OooO0o(oooO00o, c32168OoooO0, this) != enumC32485OooO00o) {
                    th = th2;
                    C23992OoooooO.OooO0O0(oooO00o);
                    throw th;
                }
            } finally {
            }
        }
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33691OooO0O0 = (InterfaceC33691OooO0O0) this.f115332OooOoO;
            it = interfaceC33691OooO0O0.getChannel().iterator();
            i = 0;
            this.f115332OooOoO = interfaceC33691OooO0O0;
            this.f115331OooOo0o = it;
            this.f115330OooOo = i;
            this.f115333OooOoO0 = 1;
            objOooO00o = it.OooO00o(this);
            if (objOooO00o != enumC32485OooO00o) {
            }
        } else if (i3 == 1) {
            i2 = this.f115330OooOo;
            interfaceC33701OooOO0o = this.f115331OooOo0o;
            interfaceC33691OooO0O02 = (InterfaceC33691OooO0O0) this.f115332OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    C32446OooOOOo.OooO0O0(obj);
                    C23992OoooooO.OooO0O0(oooO00o);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.f115332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                C23992OoooooO.OooO0O0(oooO00o);
                throw th;
            }
            i2 = this.f115330OooOo;
            interfaceC33701OooOO0o = this.f115331OooOo0o;
            interfaceC33691OooO0O02 = (InterfaceC33691OooO0O0) this.f115332OooOoO;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable th3) {
                InterfaceC33701OooOO0o interfaceC33701OooOO0o2 = interfaceC33701OooOO0o;
                i = i2;
                it = interfaceC33701OooOO0o2;
                interfaceC33691OooO0O02.getChannel().OooO0Oo(th3);
                interfaceC33691OooO0O0 = interfaceC33691OooO0O02;
                this.f115332OooOoO = interfaceC33691OooO0O0;
                this.f115331OooOo0o = it;
                this.f115330OooOo = i;
                this.f115333OooOoO0 = 1;
                objOooO00o = it.OooO00o(this);
                if (objOooO00o != enumC32485OooO00o) {
                }
            }
            InterfaceC33701OooOO0o interfaceC33701OooOO0o3 = interfaceC33701OooOO0o;
            i = i2;
            it = interfaceC33701OooOO0o3;
            interfaceC33691OooO0O0 = interfaceC33691OooO0O02;
            this.f115332OooOoO = interfaceC33691OooO0O0;
            this.f115331OooOo0o = it;
            this.f115330OooOo = i;
            this.f115333OooOoO0 = 1;
            objOooO00o = it.OooO00o(this);
            if (objOooO00o != enumC32485OooO00o) {
                interfaceC33691OooO0O02 = interfaceC33691OooO0O0;
                obj = objOooO00o;
                int i4 = i;
                interfaceC33701OooOO0o = it;
                i2 = i4;
                if (((Boolean) obj).booleanValue()) {
                    EnumC32170OoooO0O enumC32170OoooO0O2 = EnumC32170OoooO0O.Alert;
                    oooO0OO = new oO00Oo0.OooO0OO(null);
                    try {
                        EnumC32146OooOOo0[] enumC32146OooOOo0Arr2 = EnumC32146OooOOo0.f115299OooOo;
                        oooO0OO.o00000oO((byte) 1);
                        EnumC32145OooOOo[] enumC32145OooOOoArr2 = EnumC32145OooOOo.f115295OooOo;
                        oooO0OO.o00000oO((byte) 0);
                        C32168OoooO0 c32168OoooO02 = new C32168OoooO0(enumC32170OoooO0O2, oooO0OO.ooOO(), 2);
                        this.f115332OooOoO = null;
                        this.f115331OooOo0o = null;
                        this.f115333OooOoO0 = 3;
                    } finally {
                    }
                } else {
                    C32168OoooO0 c32168OoooO03 = (C32168OoooO0) interfaceC33701OooOO0o.next();
                    C32168OoooO0 c32168OoooO0OooO00o = i2 != 0 ? ((InterfaceC35154OooO0o) this.f115334OooOoOO.f115373OooOoo0.getValue()).OooO00o(c32168OoooO03) : c32168OoooO03;
                    if (c32168OoooO03.f115397OooO00o == EnumC32170OoooO0O.ChangeCipherSpec) {
                        i2 = 1;
                    }
                    this.f115332OooOoO = interfaceC33691OooO0O02;
                    this.f115331OooOo0o = interfaceC33701OooOO0o;
                    this.f115330OooOo = i2;
                    this.f115333OooOoO0 = 2;
                }
            }
        }
        return enumC32485OooO00o;
    }
}
