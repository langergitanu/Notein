package oO00O;

import androidx.appcompat.widget.C21532OooOOo;
import java.io.EOFException;
import kotlin.coroutines.Continuation;
import o00OooO0.C25150OooO00o;
import o00oo0O0.C25667OooOO0o;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: renamed from: oO00O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.tls.TLSClientHandshake$handshakes$1", m80623f = "TLSClientHandshake.kt", m80624l = {133, 148}, m80625m = "invokeSuspend")
public final class C32149OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C32158Oooo>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C32158Oooo f115320OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C32266OooO0Oo f115321OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f115322OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f115323OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C32161Oooo0O0 f115324OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32149OooOo0O(C32161Oooo0O0 c32161Oooo0O0, Continuation<? super C32149OooOo0O> continuation) {
        super(2, continuation);
        this.f115324OooOoOO = c32161Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32149OooOo0O c32149OooOo0O = new C32149OooOo0O(this.f115324OooOoOO, continuation);
        c32149OooOo0O.f115322OooOoO = obj;
        return c32149OooOo0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C32158Oooo> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C32149OooOo0O) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r15 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        if (r8 == oO00O.EnumC32169OoooO00.Finished) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        r8 = r4.f115370OooOoO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(r8, "$this$plusAssign");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if (r15.f115357OooO00o == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        r9 = new oO00Oo0.OooO0OO(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        OooOooO.C20730OooO0oO.OooO0oO(r9, r15.f115357OooO00o, (int) r15.f115358OooO0O0.Oooo0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (r15.f115358OooO0O0.Oooo0() <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        r9.o0000oO(r15.f115358OooO0O0.o0000oO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        oO00O.OooO0o.OooO0OO(r8, r9.ooOO());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        throw r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010e, code lost:
    
        r8 = r2.getChannel();
        r14.f115322OooOoO = r2;
        r14.f115321OooOo0o = r7;
        r14.f115320OooOo = r15;
        r14.f115323OooOoO0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (r8.f121482OooOoO.OooOOO(r15, r14) != r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        r8 = r2;
        r2 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:17:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0123 -> B:58:0x0125). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33712OooOo0O interfaceC33712OooOo0O;
        C32266OooO0Oo c32266OooO0Oo;
        int i;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f115323OooOoO0;
        C32161Oooo0O0 c32161Oooo0O0 = this.f115324OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f115322OooOoO;
            C33710OooOo0 c33710OooOo0 = c32161Oooo0O0.f115372OooOoo;
            this.f115322OooOoO = interfaceC33712OooOo0O;
            this.f115321OooOo0o = null;
            this.f115320OooOo = null;
            this.f115323OooOoO0 = 1;
            obj = c33710OooOo0.f121482OooOoO.OooO0oO(this);
        } else if (i2 == 1) {
            interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f115322OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            C32168OoooO0 c32168OoooO0 = (C32168OoooO0) obj;
            EnumC32170OoooO0O enumC32170OoooO0O = c32168OoooO0.f115397OooO00o;
            EnumC32170OoooO0O enumC32170OoooO0O2 = EnumC32170OoooO0O.Handshake;
            C32266OooO0Oo c32266OooO0Oo2 = c32168OoooO0.f115399OooO0OO;
            if (enumC32170OoooO0O != enumC32170OoooO0O2) {
                c32266OooO0Oo2.release();
                throw new IllegalStateException(("TLS handshake expected, got " + c32168OoooO0.f115397OooO00o).toString());
            }
            c32266OooO0Oo = c32266OooO0Oo2;
            while (!c32266OooO0Oo.Oooo000()) {
            }
            C33710OooOo0 c33710OooOo02 = c32161Oooo0O0.f115372OooOoo;
            this.f115322OooOoO = interfaceC33712OooOo0O;
            this.f115321OooOo0o = null;
            this.f115320OooOo = null;
            this.f115323OooOoO0 = 1;
            obj = c33710OooOo02.f121482OooOoO.OooO0oO(this);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32158Oooo c32158Oooo = this.f115320OooOo;
            c32266OooO0Oo = this.f115321OooOo0o;
            InterfaceC33712OooOo0O interfaceC33712OooOo0O2 = (InterfaceC33712OooOo0O) this.f115322OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            if (c32158Oooo.f115357OooO00o == EnumC32169OoooO00.Finished) {
                c32266OooO0Oo.release();
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33712OooOo0O = interfaceC33712OooOo0O2;
            while (!c32266OooO0Oo.Oooo000()) {
                C32158Oooo c32158Oooo2 = new C32158Oooo();
                int i3 = c32266OooO0Oo.f115968OooOoOO;
                int i4 = c32266OooO0Oo.f115966OooOoO;
                if (i3 - i4 <= 4) {
                    C32271OooO00o c32271OooO00oOoOO = c32266OooO0Oo.ooOO(4);
                    if (c32271OooO00oOoOO == null) {
                        C25150OooO00o.OooO0o0(4);
                        throw null;
                    }
                    int i5 = c32271OooO00oOoOO.f115945OooO0O0;
                    if (c32271OooO00oOoOO.f115946OooO0OO - i5 < 4) {
                        throw new EOFException("Not enough bytes to read a regular integer of size 4.");
                    }
                    int i6 = c32271OooO00oOoOO.f115944OooO00o.getInt(i5);
                    c32271OooO00oOoOO.OooO0OO(4);
                    C32273OooO0Oo.OooO00o(c32266OooO0Oo, c32271OooO00oOoOO);
                    i = i6;
                } else {
                    c32266OooO0Oo.f115966OooOoO = i4 + 4;
                    i = c32266OooO0Oo.f115967OooOoO0.getInt(i4);
                }
                EnumC32169OoooO00[] enumC32169OoooO00Arr = EnumC32169OoooO00.f115400OooOo;
                int i7 = i >>> 24;
                EnumC32169OoooO00 enumC32169OoooO00 = (i7 < 0 || i7 >= 256) ? null : EnumC32169OoooO00.f115400OooOo[i7];
                if (enumC32169OoooO00 == null) {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i7, "Invalid TLS handshake type code: "));
                }
                c32158Oooo2.f115357OooO00o = enumC32169OoooO00;
                int i8 = i & 16777215;
                oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
                try {
                    byte[] bArrOooO0o = C25150OooO00o.OooO0o(i8, c32266OooO0Oo);
                    C25667OooOO0o.OooO0Oo(oooO0OO, bArrOooO0o, 0, bArrOooO0o.length);
                    C32266OooO0Oo c32266OooO0OoOoOO = oooO0OO.ooOO();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(c32266OooO0OoOoOO, "<set-?>");
                    c32158Oooo2.f115358OooO0O0 = c32266OooO0OoOoOO;
                    EnumC32169OoooO00 enumC32169OoooO002 = c32158Oooo2.f115357OooO00o;
                    EnumC32169OoooO00 enumC32169OoooO003 = EnumC32169OoooO00.HelloRequest;
                    if (enumC32169OoooO002 != enumC32169OoooO003) {
                        break;
                    }
                } finally {
                    oooO0OO.close();
                }
            }
            C33710OooOo0 c33710OooOo022 = c32161Oooo0O0.f115372OooOoo;
            this.f115322OooOoO = interfaceC33712OooOo0O;
            this.f115321OooOo0o = null;
            this.f115320OooOo = null;
            this.f115323OooOoO0 = 1;
            obj = c33710OooOo022.f121482OooOoO.OooO0oO(this);
        }
    }
}
