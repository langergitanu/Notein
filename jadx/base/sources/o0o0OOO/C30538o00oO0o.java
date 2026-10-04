package o0o0OOO;

import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o0OOO.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$isMyTemplateTabEnabled$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30538o00oO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<PaperTheme, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f109192OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109193OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(PaperTheme paperTheme, Boolean bool, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C30538o00oO0o c30538o00oO0o = new C30538o00oO0o(3, continuation);
        c30538o00oO0o.f109193OooOo0o = paperTheme;
        c30538o00oO0o.f109192OooOo = zBooleanValue;
        return c30538o00oO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(this.f109193OooOo0o == null || !this.f109192OooOo);
    }
}
