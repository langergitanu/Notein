package o0o0OOO;

import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$special$$inlined$flatMapLatest$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class o00000 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super PaperTheme>, C32443OooOOO<? extends PaperTheme, ? extends PaperOrientation>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108981OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108982OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108983OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108984OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(Continuation continuation, C30520o000000o c30520o000000o) {
        super(3, continuation);
        this.f108983OooOoO = c30520o000000o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super PaperTheme> interfaceC33723OooO0oO, C32443OooOOO<? extends PaperTheme, ? extends PaperOrientation> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
        o00000 o00000Var = new o00000(continuation, this.f108983OooOoO);
        o00000Var.f108981OooOo = interfaceC33723OooO0oO;
        o00000Var.f108984OooOoO0 = c32443OooOOO;
        return o00000Var.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108982OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f108981OooOo;
            C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f108984OooOoO0;
            C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new o000000(this.f108983OooOoO, (PaperTheme) c32443OooOOO.f116638OooOo0o, (PaperOrientation) c32443OooOOO.f116637OooOo, null));
            this.f108982OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33770OooooO0, this) == enumC32485OooO00o) {
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
