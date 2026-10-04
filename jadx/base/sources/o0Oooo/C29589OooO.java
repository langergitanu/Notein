package o0Oooo;

import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$refreshStreamMessageById$2", m80623f = "EditorAiViewModel.kt", m80624l = {477}, m80625m = "invokeSuspend")
public final class C29589OooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super C27174OooO0O0<String>>, Throwable, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o f104922OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104923OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f104924OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<String> f104925OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29589OooO(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o, C24034Oooo00O<String> c24034Oooo00O, String str, Continuation<? super C29589OooO> continuation) {
        super(3, continuation);
        this.f104922OooOo = oooO00o;
        this.f104925OooOoO0 = c24034Oooo00O;
        this.f104924OooOoO = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super C27174OooO0O0<String>> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
        String str = this.f104924OooOoO;
        return new C29589OooO(this.f104922OooOo, this.f104925OooOoO0, str, continuation).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104923OooOo0o;
        com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = this.f104922OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = this.f104925OooOoO0.f80942OooOo0o;
            this.f104923OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29595OooO0o0(oooO00o, str, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            String string = oooO00o.f75597OooOO0.getString(R.string.error_can_not_notify_quota_cost);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0oO(oooO00o, this.f104924OooOoO, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
