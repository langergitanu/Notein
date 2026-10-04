package o0OO00o0;

import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: renamed from: o0OO00o0.o00Oo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteLocalDataSource$getTextAnnoByIdSync$2", m80623f = "QuoteLocalDataSource.kt", m80624l = {142}, m80625m = "invokeSuspend")
public final class C26627o00Oo0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34954o00ooO0, Continuation<? super QuoteTextAnnoEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91901OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91902OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91903OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26627o00Oo0oo(String str, Continuation<? super C26627o00Oo0oo> continuation) {
        super(2, continuation);
        this.f91903OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26627o00Oo0oo c26627o00Oo0oo = new C26627o00Oo0oo(this.f91903OooOoO0, continuation);
        c26627o00Oo0oo.f91901OooOo = obj;
        return c26627o00Oo0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34954o00ooO0 abstractC34954o00ooO0, Continuation<? super QuoteTextAnnoEntity> continuation) {
        return ((C26627o00Oo0oo) create(abstractC34954o00ooO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91902OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34954o00ooO0 abstractC34954o00ooO0 = (AbstractC34954o00ooO0) this.f91901OooOo;
        this.f91902OooOo0o = 1;
        Object objOooO0oO = abstractC34954o00ooO0.OooO0oO(this.f91903OooOoO0, this);
        return objOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
    }
}
