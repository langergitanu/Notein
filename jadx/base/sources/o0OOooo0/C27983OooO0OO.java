package o0OOooo0;

import com.facebook.soloader.OooOo;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import o0OO00o0.C26621o00Oo0O;
import o0OO00o0.C26629o00OoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.quote.QuoteUseCase$deleteQuoteByIdSync$2", m80623f = "QuoteUseCase.kt", m80624l = {113, 114}, m80625m = "invokeSuspend")
public final class C27983OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27994OooOOOO f99217OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99218OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f99219OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99220OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27983OooO0OO(C27994OooOOOO c27994OooOOOO, String str, String str2, Continuation<? super C27983OooO0OO> continuation) {
        super(2, continuation);
        this.f99217OooOo = c27994OooOOOO;
        this.f99220OooOoO0 = str;
        this.f99219OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27983OooO0OO(this.f99217OooOo, this.f99220OooOoO0, this.f99219OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27983OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (o0OOooo0.C27994OooOOOO.OooO00o(r3, r2, r7) == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99218OooOo0o;
        String str = this.f99219OooOoO;
        C27994OooOOOO c27994OooOOOO = this.f99217OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24378OooOoO0 c24378OooOoO0 = c27994OooOOOO.f99260OooO00o;
            this.f99218OooOo0o = 1;
            List listOooO0oO = OooOo.OooO0oO(this.f99220OooOoO0);
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) c24378OooOoO0.f82246OooO00o;
            c26629o00OoO0.getClass();
            Object objOooO00o = c26629o00OoO0.OooO00o(str, new C26621o00Oo0O(listOooO0oO, null));
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
        this.f99218OooOo0o = 2;
    }
}
