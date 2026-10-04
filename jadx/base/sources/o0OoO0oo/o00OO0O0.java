package o0OoO0oo;

import com.orion.notein.App;
import com.orion.penkit.models.AnchorAssistAware;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OoOO00.C29031OoooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initAssistLineSwitch$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00OO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24338OooO0o0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102205OooOo0o;

    public o00OO0O0() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00OO0O0 o00oo0o02 = new o00OO0O0(2, continuation);
        o00oo0o02.f102205OooOo0o = obj;
        return o00oo0o02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC24338OooO0o0 abstractC24338OooO0o0, Continuation<? super C32460OooOooO> continuation) {
        return ((o00OO0O0) create(abstractC24338OooO0o0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) this.f102205OooOo0o;
        Boolean bool = (Boolean) abstractC24338OooO0o0.OooO0OO(App.f69574OoooooO);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = (Boolean) abstractC24338OooO0o0.OooO0OO(App.f69575Ooooooo);
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = (Boolean) abstractC24338OooO0o0.OooO0OO(App.f69598o0OoOo0);
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        AnchorAssistAware.Companion companion = AnchorAssistAware.INSTANCE;
        companion.setEnableAssistLine(zBooleanValue);
        companion.setEnableAssistLineMagneticAttraction(zBooleanValue2);
        C29031OoooOO0.f102846OooO0OO = zBooleanValue3;
        return C32460OooOooO.f116667OooO00o;
    }
}
