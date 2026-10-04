package o0OO00o0;

import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteLocalDataSource$getTextAnnoListSync$2", m80623f = "QuoteLocalDataSource.kt", m80624l = {112}, m80625m = "invokeSuspend")
public final class o0oOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34954o00ooO0, Continuation<? super List<? extends QuoteTextAnnoEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92138OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92139OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f92140OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(List<String> list, Continuation<? super o0oOO> continuation) {
        super(2, continuation);
        this.f92140OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0oOO o0ooo2 = new o0oOO(this.f92140OooOoO0, continuation);
        o0ooo2.f92138OooOo = obj;
        return o0ooo2;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34954o00ooO0 abstractC34954o00ooO0, Continuation<? super List<? extends QuoteTextAnnoEntity>> continuation) {
        return ((o0oOO) create(abstractC34954o00ooO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92139OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34954o00ooO0 abstractC34954o00ooO0 = (AbstractC34954o00ooO0) this.f92138OooOo;
        this.f92139OooOo0o = 1;
        Object objOooO = abstractC34954o00ooO0.OooO(this.f92140OooOoO0, this);
        return objOooO == enumC32485OooO00o ? enumC32485OooO00o : objOooO;
    }
}
