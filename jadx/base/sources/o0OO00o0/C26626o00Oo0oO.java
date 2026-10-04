package o0OO00o0;

import com.orion.notein.data.p602db.entity.QuoteEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: renamed from: o0OO00o0.o00Oo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteLocalDataSource$getQuotesByPageIdSync$2", m80623f = "QuoteLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26626o00Oo0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34954o00ooO0, Continuation<? super List<? extends QuoteEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91900OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26626o00Oo0oO(String str, Continuation<? super C26626o00Oo0oO> continuation) {
        super(2, continuation);
        this.f91899OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26626o00Oo0oO c26626o00Oo0oO = new C26626o00Oo0oO(this.f91899OooOo, continuation);
        c26626o00Oo0oO.f91900OooOo0o = obj;
        return c26626o00Oo0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34954o00ooO0 abstractC34954o00ooO0, Continuation<? super List<? extends QuoteEntity>> continuation) {
        return ((C26626o00Oo0oO) create(abstractC34954o00ooO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return ((AbstractC34954o00ooO0) this.f91900OooOo0o).OooO0o(this.f91899OooOo);
    }
}
