package o0OO00o0;

import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
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

/* JADX INFO: renamed from: o0OO00o0.o00OoO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteLocalDataSource$saveQuoteTextAnno$2", m80623f = "QuoteLocalDataSource.kt", m80624l = {106}, m80625m = "invokeSuspend")
public final class C26630o00OoO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34954o00ooO0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91910OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91911OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91912OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26630o00OoO00(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91912OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26630o00OoO00 c26630o00OoO00 = new C26630o00OoO00(this.f91912OooOoO0, continuation);
        c26630o00OoO00.f91910OooOo = obj;
        return c26630o00OoO00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34954o00ooO0 abstractC34954o00ooO0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26630o00OoO00) create(abstractC34954o00ooO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91911OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34954o00ooO0 abstractC34954o00ooO0 = (AbstractC34954o00ooO0) this.f91910OooOo;
            QuoteTextAnnoEntity[] quoteTextAnnoEntityArr = (QuoteTextAnnoEntity[]) this.f91912OooOoO0.toArray(new QuoteTextAnnoEntity[0]);
            QuoteTextAnnoEntity[] quoteTextAnnoEntityArr2 = (QuoteTextAnnoEntity[]) Arrays.copyOf(quoteTextAnnoEntityArr, quoteTextAnnoEntityArr.length);
            this.f91911OooOo0o = 1;
            if (abstractC34954o00ooO0.OooOO0O(quoteTextAnnoEntityArr2, this) == enumC32485OooO00o) {
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
