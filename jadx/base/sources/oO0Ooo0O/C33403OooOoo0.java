package oO0Ooo0O;

import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.nio.charset.Charset;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import o000ooo.C24746OooO00o;
import o00OooO0.C25150OooO00o;
import oO00O0o0.C32183OooO0Oo;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.C33201OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo0O.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$2", m80623f = "HttpPlainText.kt", m80624l = {136, 138}, m80625m = "invokeSuspend")
public final class C33403OooOoo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO>, C33201OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120762OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120763OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33399OooOoO f120764OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120765OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33403OooOoo0(C33399OooOoO c33399OooOoO, Continuation<? super C33403OooOoo0> continuation) {
        super(3, continuation);
        this.f120764OooOoO = c33399OooOoO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> abstractC32246OooO0o0, C33201OooO0Oo c33201OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C33403OooOoo0 c33403OooOoo0 = new C33403OooOoo0(this.f120764OooOoO, continuation);
        c33403OooOoo0.f120762OooOo = abstractC32246OooO0o0;
        c33403OooOoo0.f120765OooOoO0 = c33201OooO0Oo;
        return c33403OooOoo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        if (r2.OooO0o0(r4, r10) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        oOOoOoOO.OooO00o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120763OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o02 = this.f120762OooOo;
            C33201OooO0Oo c33201OooO0Oo = (C33201OooO0Oo) this.f120765OooOoO0;
            oOOoOoOO.OooO00o oooO00o2 = c33201OooO0Oo.f120151OooO00o;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o2.f123413OooO00o, C24035Oooo00o.f80943OooO00o.OooO0O0(String.class))) {
                Object obj2 = c33201OooO0Oo.f120152OooO0O0;
                if (obj2 instanceof InterfaceC23986Ooooo0o) {
                    this.f120762OooOo = abstractC32246OooO0o02;
                    this.f120765OooOoO0 = oooO00o2;
                    this.f120763OooOo0o = 1;
                    Object objOooOo0O = ((InterfaceC23986Ooooo0o) obj2).OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, this);
                    if (objOooOo0O != enumC32485OooO00o) {
                        abstractC32246OooO0o0 = abstractC32246OooO0o02;
                        obj = objOooOo0O;
                        oooO00o = oooO00o2;
                    }
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        oooO00o = (oOOoOoOO.OooO00o) this.f120765OooOoO0;
        abstractC32246OooO0o0 = this.f120762OooOo;
        C32446OooOOOo.OooO0O0(obj);
        C32266OooO0Oo body = (C32266OooO0Oo) obj;
        ooOOOOOo.OooO0OO call = (ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o;
        C33399OooOoO c33399OooOoO = this.f120764OooOoO;
        c33399OooOoO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(call, "call");
        kotlin.jvm.internal.OooOOO0.OooO0oO(body, "body");
        C32183OooO0Oo c32183OooO0OoOooO00o = oO00O0o0.OooOo00.OooO00o(call.OooO0o0());
        Charset charsetOooO0Oo = c32183OooO0OoOooO00o != null ? C24746OooO00o.OooO0Oo(c32183OooO0OoOooO00o) : null;
        if (charsetOooO0Oo == null) {
            charsetOooO0Oo = c33399OooOoO.f120751OooO00o;
        }
        C33405OooOooo.f120766OooO00o.OooO0oo("Reading response body for " + call.OooO0Oo().getUrl() + " as String with charset " + charsetOooO0Oo);
        C33201OooO0Oo c33201OooO0Oo2 = new C33201OooO0Oo(oooO00o, C25150OooO00o.OooO0oo(body, charsetOooO0Oo));
        this.f120762OooOo = null;
        this.f120765OooOoO0 = null;
        this.f120763OooOo0o = 2;
    }
}
