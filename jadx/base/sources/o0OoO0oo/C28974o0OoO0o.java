package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o0OoO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$aiAssistantActivated$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28974o0OoO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, OooO0O0.OooO00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ OooO0O0.OooO00o f102647OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f102648OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, OooO0O0.OooO00o oooO00o, Continuation<? super Boolean> continuation) {
        int iIntValue = num.intValue();
        C28974o0OoO0o c28974o0OoO0o = new C28974o0OoO0o(3, continuation);
        c28974o0OoO0o.f102648OooOo0o = iIntValue;
        c28974o0OoO0o.f102647OooOo = oooO00o;
        return c28974o0OoO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(this.f102648OooOo0o == 0 && this.f102647OooOo == OooO0O0.OooO00o.f75496OooOo);
    }
}
