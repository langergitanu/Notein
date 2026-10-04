package o0OOoo0O;

import com.aspose.slides.C22227OoooO;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27568o00oOoOo;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.ApplyTemplateBookUseCase$isApplied$2", m80623f = "ApplyTemplateBookUseCase.kt", m80624l = {44}, m80625m = "invokeSuspend")
public final class C27842OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27844OooOOO0 f98366OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98367OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98368OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27842OooOO0o(C27844OooOOO0 c27844OooOOO0, String str, Continuation<? super C27842OooOO0o> continuation) {
        super(2, continuation);
        this.f98366OooOo = c27844OooOOO0;
        this.f98368OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27842OooOO0o(this.f98366OooOo, this.f98368OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27842OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98367OooOo0o;
        String str = this.f98368OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27570o00oOoo0 c27570o00oOoo0 = this.f98366OooOo.f98373OooO0O0;
            this.f98367OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27568o00oOoOo(c27570o00oOoo0, str, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "ApplyTemplateBookUseCase", "isApplied: templateBookId=", str, ", result=");
        sbOooO00o.append(zBooleanValue);
        c20358OooO00o.OooO00o(sbOooO00o.toString(), new Object[0]);
        return bool;
    }
}
