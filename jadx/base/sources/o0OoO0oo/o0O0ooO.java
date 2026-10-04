package o0OoO0oo;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o0000o.C29728OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33767OoooOoo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$special$$inlined$flatMapLatest$3", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class o0O0ooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super C29728OooO0Oo>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f102641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102642OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102643OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f102644OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f102643OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super C29728OooO0Oo> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        o0O0ooO o0o0ooo = new o0O0ooO(this.f102643OooOoO, continuation);
        o0o0ooo.f102641OooOo = interfaceC33723OooO0oO;
        o0o0ooo.f102644OooOoO0 = str;
        return o0o0ooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102642OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f102641OooOo;
            String noteId = (String) this.f102644OooOoO0;
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f102643OooOoO;
            oooO0OO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            InterfaceC33767OoooOoo<C29728OooO0Oo> interfaceC33767OoooOooOooOOO = oooO0OO.OooOOO(noteId);
            this.f102642OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33767OoooOooOooOOO, this) == enumC32485OooO00o) {
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
