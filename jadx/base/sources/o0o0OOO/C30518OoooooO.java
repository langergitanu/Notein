package o0o0OOO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o0OOO.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$currentTabType$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30518OoooooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Boolean, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f108969OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f108970OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, Boolean bool, Continuation<? super Integer> continuation) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        C30518OoooooO c30518OoooooO = new C30518OoooooO(3, continuation);
        c30518OoooooO.f108970OooOo0o = iIntValue;
        c30518OoooooO.f108969OooOo = zBooleanValue;
        return c30518OoooooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f108970OooOo0o;
        if (!this.f108969OooOo) {
            i = 0;
        }
        return new Integer(i);
    }
}
