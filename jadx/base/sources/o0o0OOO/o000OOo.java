package o0o0OOO;

import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$selectedCoverTheme$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000OOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<PaperTheme, PaperOrientation, Continuation<? super C32443OooOOO<? extends PaperTheme, ? extends PaperOrientation>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ PaperOrientation f109167OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ PaperTheme f109168OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(PaperTheme paperTheme, PaperOrientation paperOrientation, Continuation<? super C32443OooOOO<? extends PaperTheme, ? extends PaperOrientation>> continuation) {
        o000OOo o000ooo2 = new o000OOo(3, continuation);
        o000ooo2.f109168OooOo0o = paperTheme;
        o000ooo2.f109167OooOo = paperOrientation;
        return o000ooo2.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new C32443OooOOO(this.f109168OooOo0o, this.f109167OooOo);
    }
}
