package o0oOo0Oo;

import com.orion.notein.domain.models.message.NoteinMessage;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOo0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.message.UserMessageViewModel$special$$inlined$flatMapLatest$1", m80623f = "UserMessageViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30971OooO0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends NoteinMessage>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f110661OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110662OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30972OooO0oO f110663OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f110664OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30971OooO0o0(Continuation continuation, C30972OooO0oO c30972OooO0oO) {
        super(3, continuation);
        this.f110663OooOoO = c30972OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends NoteinMessage>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C30971OooO0o0 c30971OooO0o0 = new C30971OooO0o0(continuation, this.f110663OooOoO);
        c30971OooO0o0.f110661OooOo = interfaceC33723OooO0oO;
        c30971OooO0o0.f110664OooOoO0 = str;
        return c30971OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110662OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f110661OooOo;
            InterfaceC33721OooO0o interfaceC33721OooO0oOooO0O0 = this.f110663OooOoO.f110665OooO0Oo.OooO0O0((String) this.f110664OooOoO0);
            this.f110662OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooO0O0, this) == enumC32485OooO00o) {
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
