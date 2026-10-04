package o0OoO0oo;

import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOooO.C27881OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33722OooO0o0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$special$$inlined$flatMapLatest$3", m80623f = "NoteEditorViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class o0oOOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends PageLayer>>, C28694OooOO0O, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f102666OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102667OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102668OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f102669OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(C23344OooOOo c23344OooOOo, Continuation continuation) {
        super(3, continuation);
        this.f102668OooOoO = c23344OooOOo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends PageLayer>> interfaceC33723OooO0oO, C28694OooOO0O c28694OooOO0O, Continuation<? super C32460OooOooO> continuation) {
        o0oOOo o0oooo2 = new o0oOOo(this.f102668OooOoO, continuation);
        o0oooo2.f102666OooOo = interfaceC33723OooO0oO;
        o0oooo2.f102669OooOoO0 = c28694OooOO0O;
        return o0oooo2.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        InterfaceC33721OooO0o interfaceC33721OooO0oOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102667OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f102666OooOo;
            C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) this.f102669OooOoO0;
            if (c28694OooOO0O == null) {
                interfaceC33721OooO0oOooO = C33722OooO0o0.f121519OooOo0o;
            } else {
                C27881OooOO0O c27881OooOO0O = this.f102668OooOoO.f73548OooO0oO;
                c27881OooOO0O.getClass();
                String noteId = c28694OooOO0O.f101667OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                interfaceC33721OooO0oOooO = c27881OooOO0O.f98543OooO00o.OooO(noteId);
            }
            this.f102667OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooO, this) == enumC32485OooO00o) {
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
