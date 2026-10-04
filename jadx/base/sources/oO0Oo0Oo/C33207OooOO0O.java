package oO0Oo0Oo;

import kotlin.coroutines.Continuation;
import o00OO0o0.C24999OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO0Oo0Oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.statement.HttpStatement$execute$4", m80623f = "HttpStatement.kt", m80624l = {63}, m80625m = "invokeSuspend")
public final class C33207OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC33200OooO0OO, Continuation<? super AbstractC33200OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120169OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120170OooOo0o;

    public C33207OooOO0O() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33207OooOO0O c33207OooOO0O = new C33207OooOO0O(2, continuation);
        c33207OooOO0O.f120169OooOo = obj;
        return c33207OooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super AbstractC33200OooO0OO> continuation) {
        return ((C33207OooOO0O) create(abstractC33200OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120170OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ooOOOOOo.OooO0OO oooO0OOOooO00o = ((AbstractC33200OooO0OO) this.f120169OooOo).OooO00o();
            this.f120170OooOo0o = 1;
            obj = C24999OooO0OO.OooO0Oo(oooO0OOOooO00o, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return ((ooOOOOOo.OooO0OO) obj).OooO0o0();
    }
}
