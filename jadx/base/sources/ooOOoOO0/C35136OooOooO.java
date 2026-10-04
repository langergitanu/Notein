package ooOOoOO0;

import kotlin.coroutines.Continuation;
import oO00ooO.AbstractC32433OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: ooOOoOO0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m80623f = "JsonTreeReader.kt", m80624l = {115}, m80625m = "invokeSuspend")
public final class C35136OooOooO extends AbstractC32484OooO0oo implements InterfaceC32510OooOOo0<AbstractC32433OooO0O0<C32460OooOooO, oOo00O0O.OooOO0O>, C32460OooOooO, Continuation<? super oOo00O0O.OooOO0O>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32433OooO0O0 f126156OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f126157OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f126158OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35136OooOooO(Oooo000 oooo000, Continuation<? super C35136OooOooO> continuation) {
        super(3, continuation);
        this.f126158OooOoO0 = oooo000;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32433OooO0O0<C32460OooOooO, oOo00O0O.OooOO0O> abstractC32433OooO0O0, C32460OooOooO c32460OooOooO, Continuation<? super oOo00O0O.OooOO0O> continuation) {
        C35136OooOooO c35136OooOooO = new C35136OooOooO(this.f126158OooOoO0, continuation);
        c35136OooOooO.f126156OooOo = abstractC32433OooO0O0;
        return c35136OooOooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f126157OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32433OooO0O0 abstractC32433OooO0O0 = this.f126156OooOo;
            Oooo000 oooo000 = this.f126158OooOoO0;
            AbstractC35114OooO00o abstractC35114OooO00o = oooo000.f126175OooO00o;
            byte bOooOo = abstractC35114OooO00o.OooOo();
            if (bOooOo == 1) {
                return oooo000.OooO0Oo(true);
            }
            if (bOooOo == 0) {
                return oooo000.OooO0Oo(false);
            }
            if (bOooOo != 6) {
                if (bOooOo == 8) {
                    return oooo000.OooO0OO();
                }
                AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f126157OooOo0o = 1;
            obj = Oooo000.OooO00o(oooo000, abstractC32433OooO0O0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return (oOo00O0O.OooOO0O) obj;
    }
}
