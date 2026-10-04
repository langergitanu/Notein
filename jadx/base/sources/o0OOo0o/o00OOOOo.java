package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$safeGetPageByIdSync$2", m80623f = "NoteUseCase.kt", m80624l = {300}, m80625m = "invokeSuspend")
public final class o00OOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Page>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96220OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96221OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96222OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f96223OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96220OooOo = c27449o00O0OoO;
        this.f96223OooOoO0 = str;
        this.f96222OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00OOOOo(this.f96223OooOoO0, this.f96222OooOoO, continuation, this.f96220OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Page> continuation) {
        return ((o00OOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96221OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27020OooOoO0 c27020OooOoO0 = this.f96220OooOo.f96039OooO0o;
        this.f96221OooOo0o = 1;
        Object objOooO0Oo = c27020OooOoO0.OooO0Oo(this.f96223OooOoO0, this.f96222OooOoO, this);
        return objOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0Oo;
    }
}
