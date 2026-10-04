package o0o0OoOO;

import androidx.appcompat.widget.SwitchCompat;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0o0OoOO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initFlatNoteListSwitch$1", m80623f = "DebugFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30693OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f109774OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f109775OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30693OooOOO(SwitchCompat switchCompat, Continuation<? super C30693OooOOO> continuation) {
        super(2, continuation);
        this.f109774OooOo = switchCompat;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30693OooOOO c30693OooOOO = new C30693OooOOO(this.f109774OooOo, continuation);
        c30693OooOOO.f109775OooOo0o = ((Boolean) obj).booleanValue();
        return c30693OooOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C30693OooOOO) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        this.f109774OooOo.setChecked(this.f109775OooOo0o);
        return C32460OooOooO.f116667OooO00o;
    }
}
