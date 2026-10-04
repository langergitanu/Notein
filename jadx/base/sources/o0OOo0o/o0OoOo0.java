package o0OOo0o;

import java.io.File;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0Oo0o0o.C28274OooooOO;
import o0oOo0o0.AbstractC30978OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ExportUseCase$exportNotesToNativeFormat$2", m80623f = "ExportUseCase.kt", m80624l = {86}, m80625m = "invokeSuspend")
public final class o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27596o00ooo f96957OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96958OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96959OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Set<String> f96960OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f96961OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC30978OooO f96962OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(C27596o00ooo c27596o00ooo, Set set, String str, int i, AbstractC30978OooO abstractC30978OooO, Continuation continuation) {
        super(2, continuation);
        this.f96957OooOo = c27596o00ooo;
        this.f96960OooOoO0 = set;
        this.f96959OooOoO = str;
        this.f96961OooOoOO = i;
        this.f96962OooOoo0 = abstractC30978OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OoOo0(this.f96957OooOo, this.f96960OooOoO0, this.f96959OooOoO, this.f96961OooOoOO, this.f96962OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((o0OoOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96958OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27596o00ooo c27596o00ooo = this.f96957OooOo;
        C28274OooooOO c28274OooooOO = new C28274OooooOO(c27596o00ooo.f96913OooO0OO, c27596o00ooo.f96914OooO0Oo, c27596o00ooo.f96911OooO00o);
        File fileOooO = C27596o00ooo.OooO(c27596o00ooo);
        this.f96958OooOo0o = 1;
        Object objOooO0O0 = c28274OooooOO.OooO0O0(this.f96960OooOoO0, fileOooO, this.f96959OooOoO, this.f96961OooOoOO, this.f96962OooOoo0, this);
        return objOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0O0;
    }
}
