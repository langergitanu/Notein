package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$getByIdSync$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {56}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.oo000o, Continuation<? super DualLinkRefEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91072OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91073OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91074OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(String str, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f91074OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Oooo000 oooo000 = new Oooo000(this.f91074OooOoO0, continuation);
        oooo000.f91072OooOo = obj;
        return oooo000;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.oo000o oo000oVar, Continuation<? super DualLinkRefEntity> continuation) {
        return ((Oooo000) create(oo000oVar, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91073OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.oo000o oo000oVar = (oo0oO0.oo000o) this.f91072OooOo;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(this.f91074OooOoO0);
            this.f91073OooOo0o = 1;
            obj = oo000oVar.OooO(listOooO0oO, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return oOo000Oo.OooOo.Oooo((List) obj);
    }
}
