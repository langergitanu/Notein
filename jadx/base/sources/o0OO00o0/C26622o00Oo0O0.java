package o0OO00o0;

import com.orion.notein.data.p602db.entity.QuoteEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: renamed from: o0OO00o0.o00Oo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteLocalDataSource$createQuote$2", m80623f = "QuoteLocalDataSource.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class C26622o00Oo0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34954o00ooO0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91885OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91886OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91887OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26622o00Oo0O0(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91887OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26622o00Oo0O0 c26622o00Oo0O0 = new C26622o00Oo0O0(this.f91887OooOoO0, continuation);
        c26622o00Oo0O0.f91885OooOo = obj;
        return c26622o00Oo0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34954o00ooO0 abstractC34954o00ooO0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26622o00Oo0O0) create(abstractC34954o00ooO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91886OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34954o00ooO0 abstractC34954o00ooO0 = (AbstractC34954o00ooO0) this.f91885OooOo;
            QuoteEntity[] quoteEntityArr = (QuoteEntity[]) this.f91887OooOoO0.toArray(new QuoteEntity[0]);
            QuoteEntity[] quoteEntityArr2 = (QuoteEntity[]) Arrays.copyOf(quoteEntityArr, quoteEntityArr.length);
            this.f91886OooOo0o = 1;
            if (abstractC34954o00ooO0.OooOO0(quoteEntityArr2, this) == enumC32485OooO00o) {
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
