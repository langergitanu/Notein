package o0OO00o0;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: renamed from: o0OO00o0.o00Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteLocalDataSource$deleteQuoteByIdsSync$2", m80623f = "QuoteLocalDataSource.kt", m80624l = {73}, m80625m = "invokeSuspend")
public final class C26621o00Oo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34954o00ooO0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f91881OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f91882OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<String> f91883OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f91884OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26621o00Oo0O(List<String> list, Continuation<? super C26621o00Oo0O> continuation) {
        super(2, continuation);
        this.f91883OooOoO = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26621o00Oo0O c26621o00Oo0O = new C26621o00Oo0O(this.f91883OooOoO, continuation);
        c26621o00Oo0O.f91884OooOoO0 = obj;
        return c26621o00Oo0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34954o00ooO0 abstractC34954o00ooO0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26621o00Oo0O) create(abstractC34954o00ooO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        AbstractC34954o00ooO0 abstractC34954o00ooO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91881OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34954o00ooO0 abstractC34954o00ooO02 = (AbstractC34954o00ooO0) this.f91884OooOoO0;
            it = oOo000Oo.OooOo.Oooo00O(this.f91883OooOoO, 100).iterator();
            abstractC34954o00ooO0 = abstractC34954o00ooO02;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f91882OooOo0o;
            abstractC34954o00ooO0 = (AbstractC34954o00ooO0) this.f91884OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            this.f91884OooOoO0 = abstractC34954o00ooO0;
            this.f91882OooOo0o = it;
            this.f91881OooOo = 1;
            if (abstractC34954o00ooO0.OooO0O0(list, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
