package o0000o0O;

import kotlin.coroutines.Continuation;
import o0000o0O.AbstractC24285OoooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$writeActor$3", m80623f = "DataStoreImpl.kt", m80624l = {207}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24285OoooOOO.OooO00o<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f81677OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f81678OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81679OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(OooOOO<Object> oooOOO, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f81679OooOoO0 = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Oooo000 oooo000 = new Oooo000(this.f81679OooOoO0, continuation);
        oooo000.f81677OooOo = obj;
        return oooo000;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC24285OoooOOO.OooO00o<Object> oooO00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo000) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81678OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24285OoooOOO.OooO00o oooO00o = (AbstractC24285OoooOOO.OooO00o) this.f81677OooOo;
            this.f81678OooOo0o = 1;
            if (OooOOO.OooO0OO(this.f81679OooOoO0, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
