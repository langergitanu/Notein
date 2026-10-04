package o0OOooo0;

import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import o0OO00o0.C26623o00Oo0Oo;
import o0OO00o0.C26629o00OoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.quote.QuoteUseCase$deleteQuotesByPageIdSync$2", m80623f = "QuoteUseCase.kt", m80624l = {127, 128}, m80625m = "invokeSuspend")
public final class C27986OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27994OooOOOO f99229OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99230OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99231OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99232OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27986OooO0o0(C27994OooOOOO c27994OooOOOO, String str, String str2, Continuation<? super C27986OooO0o0> continuation) {
        super(2, continuation);
        this.f99229OooOo = c27994OooOOOO;
        this.f99232OooOoO0 = str;
        this.f99231OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27986OooO0o0(this.f99229OooOo, this.f99232OooOoO0, this.f99231OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27986OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (o0OOooo0.C27994OooOOOO.OooO00o(r2, r3, r7) == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99230OooOo0o;
        C27994OooOOOO c27994OooOOOO = this.f99229OooOo;
        String str = this.f99231OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24378OooOoO0 c24378OooOoO0 = c27994OooOOOO.f99260OooO00o;
            this.f99230OooOo0o = 1;
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) c24378OooOoO0.f82246OooO00o;
            c26629o00OoO0.getClass();
            Object objOooO00o = c26629o00OoO0.OooO00o(str, new C26623o00Oo0Oo(this.f99232OooOoO0, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f99230OooOo0o = 2;
    }
}
