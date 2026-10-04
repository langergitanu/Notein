package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$update$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {38}, m80625m = "invokeSuspend")
public final class C26500Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.oo000o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91088OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91089OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<DualLinkRefEntity> f91090OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26500Oooo0o0(List<DualLinkRefEntity> list, Continuation<? super C26500Oooo0o0> continuation) {
        super(2, continuation);
        this.f91090OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26500Oooo0o0 c26500Oooo0o0 = new C26500Oooo0o0(this.f91090OooOoO0, continuation);
        c26500Oooo0o0.f91088OooOo = obj;
        return c26500Oooo0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.oo000o oo000oVar, Continuation<? super C32460OooOooO> continuation) {
        return ((C26500Oooo0o0) create(oo000oVar, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91089OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.oo000o oo000oVar = (oo0oO0.oo000o) this.f91088OooOo;
            DualLinkRefEntity[] dualLinkRefEntityArr = (DualLinkRefEntity[]) this.f91090OooOoO0.toArray(new DualLinkRefEntity[0]);
            DualLinkRefEntity[] dualLinkRefEntityArr2 = (DualLinkRefEntity[]) Arrays.copyOf(dualLinkRefEntityArr, dualLinkRefEntityArr.length);
            this.f91089OooOo0o = 1;
            if (oo000oVar.OooO0o(dualLinkRefEntityArr2, this) == enumC32485OooO00o) {
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
