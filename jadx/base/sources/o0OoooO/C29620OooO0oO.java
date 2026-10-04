package o0OoooO;

import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.assistant.GeminiAssistant$chatWithAiAssistantStream$2$2", m80623f = "GeminiAssistant.kt", m80624l = {246}, m80625m = "invokeSuspend")
public final class C29620OooO0oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super C27174OooO0O0<String>>, Throwable, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f105010OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105011OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29629OooOOo0 f105012OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Throwable f105013OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29620OooO0oO(C29629OooOOo0 c29629OooOOo0, Continuation<? super C29620OooO0oO> continuation) {
        super(3, continuation);
        this.f105012OooOoO = c29629OooOOo0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super C27174OooO0O0<String>> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
        C29620OooO0oO c29620OooO0oO = new C29620OooO0oO(this.f105012OooOoO, continuation);
        c29620OooO0oO.f105010OooOo = interfaceC33723OooO0oO;
        c29620OooO0oO.f105013OooOoO0 = th;
        return c29620OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105011OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f105010OooOo;
            Throwable th = this.f105013OooOoO0;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GeminiAssistant");
            c20358OooO00o.OooOO0O("chatWithAiAssistantStream: failed to chat. " + th, new Object[0]);
            C27174OooO0O0 c27174OooO0O0OooOO0O = C29629OooOOo0.OooOO0O(th);
            this.f105010OooOo = null;
            this.f105011OooOo0o = 1;
            if (interfaceC33723OooO0oO.emit(c27174OooO0O0OooOO0O, this) == enumC32485OooO00o) {
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
