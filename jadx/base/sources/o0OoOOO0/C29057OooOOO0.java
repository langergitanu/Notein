package o0OoOOO0;

import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOO0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$deletedDefaultFonts$4", m80623f = "TextBoxViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29057OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends String>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102979OooOo0o;

    public C29057OooOOO0() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29057OooOOO0 c29057OooOOO0 = new C29057OooOOO0(2, continuation);
        c29057OooOOO0.f102979OooOo0o = obj;
        return c29057OooOOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends String> list, Continuation<? super C32460OooOooO> continuation) {
        return ((C29057OooOOO0) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) this.f102979OooOo0o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("TextBoxViewModel");
        c20358OooO00o.OooO00o("Deleted default fonts: " + list + ".", new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}
