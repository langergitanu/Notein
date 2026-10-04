package o0o0OoOO;

import androidx.appcompat.widget.SwitchCompat;
import kotlin.coroutines.Continuation;
import o000o0Oo.C24610OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0o0OoOO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initSkipNoteMetaWriteSwitch$1", m80623f = "DebugFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30702OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f109806OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f109807OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30702OooOo00(SwitchCompat switchCompat, Continuation<? super C30702OooOo00> continuation) {
        super(2, continuation);
        this.f109806OooOo = switchCompat;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30702OooOo00 c30702OooOo00 = new C30702OooOo00(this.f109806OooOo, continuation);
        c30702OooOo00.f109807OooOo0o = ((Boolean) obj).booleanValue();
        return c30702OooOo00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C30702OooOo00) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean z = this.f109807OooOo0o;
        C24610OooO0O0.f83393OooO00o = z;
        this.f109806OooOo.setChecked(z);
        return C32460OooOooO.f116667OooO00o;
    }
}
