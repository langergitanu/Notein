package o0OOooo0;

import com.orion.notein.domain.models.page.Quote;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooo0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.quote.QuoteUseCase$getQuotesByPageIdSync$2", m80623f = "QuoteUseCase.kt", m80624l = {65}, m80625m = "invokeSuspend")
public final class C27980OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Quote>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27994OooOOOO f99204OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99205OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99206OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99207OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27980OooO(C27994OooOOOO c27994OooOOOO, String str, String str2, Continuation<? super C27980OooO> continuation) {
        super(2, continuation);
        this.f99204OooOo = c27994OooOOOO;
        this.f99207OooOoO0 = str;
        this.f99206OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27980OooO(this.f99204OooOo, this.f99207OooOoO0, this.f99206OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Quote>> continuation) {
        return ((C27980OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99205OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C24378OooOoO0 c24378OooOoO0 = this.f99204OooOo.f99260OooO00o;
        this.f99205OooOo0o = 1;
        Serializable serializableOooO0Oo = c24378OooOoO0.OooO0Oo(this.f99207OooOoO0, this.f99206OooOoO, this);
        return serializableOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0Oo;
    }
}
