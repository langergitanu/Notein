package o0o00oOo;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.RenameDialogViewModel$special$$inlined$flatMapLatest$1", m80623f = "RenameDialogViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class o0000oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super String>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f107069OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107070OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f107071OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f107072OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC26277OooOoOO f107073OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oO(Continuation continuation, o0000O0 o0000o0, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        super(3, continuation);
        this.f107071OooOoO = o0000o0;
        this.f107073OooOoOO = abstractApplicationC26277OooOoOO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        o0000oO o0000oo2 = new o0000oO(continuation, this.f107071OooOoO, this.f107073OooOoOO);
        o0000oo2.f107069OooOo = interfaceC33723OooO0oO;
        o0000oo2.f107072OooOoO0 = str;
        return o0000oo2.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107070OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f107069OooOo;
            C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new C30086o0000oo((String) this.f107072OooOoO0, this.f107071OooOoO, this.f107073OooOoOO, null));
            this.f107070OooOo0o = 1;
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
