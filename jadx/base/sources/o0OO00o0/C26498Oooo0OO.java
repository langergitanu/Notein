package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$insert$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class C26498Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.oo000o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91081OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91082OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ DualLinkRefEntity f91083OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26498Oooo0OO(DualLinkRefEntity dualLinkRefEntity, Continuation<? super C26498Oooo0OO> continuation) {
        super(2, continuation);
        this.f91083OooOoO0 = dualLinkRefEntity;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26498Oooo0OO c26498Oooo0OO = new C26498Oooo0OO(this.f91083OooOoO0, continuation);
        c26498Oooo0OO.f91081OooOo = obj;
        return c26498Oooo0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.oo000o oo000oVar, Continuation<? super C32460OooOooO> continuation) {
        return ((C26498Oooo0OO) create(oo000oVar, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91082OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.oo000o oo000oVar = (oo0oO0.oo000o) this.f91081OooOo;
            DualLinkRefEntity[] dualLinkRefEntityArr = {this.f91083OooOoO0};
            this.f91082OooOo0o = 1;
            if (oo000oVar.OooO0oo(dualLinkRefEntityArr, this) == enumC32485OooO00o) {
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
