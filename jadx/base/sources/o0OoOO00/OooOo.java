package o0OoOO00;

import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageFragment$setupThemeList$2", m80623f = "AddPageFragment.kt", m80624l = {187}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddPageFragment f102754OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102755OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AddPageFragment f102756OooOo0o;

        public OooO00o(AddPageFragment addPageFragment) {
            this.f102756OooOo0o = addPageFragment;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            List<T> list = (List) obj;
            C29032OoooOOO c29032OoooOOO = this.f102756OooOo0o.f73804Oooo000;
            if (c29032OoooOOO != null) {
                c29032OoooOOO.OooO0Oo(list);
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("pageThemeAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(AddPageFragment addPageFragment, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f102754OooOo = addPageFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f102754OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102755OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AddPageFragment addPageFragment = this.f102754OooOo;
            com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OOOooOoO = addPageFragment.OooOoO();
            OooO00o oooO00o = new OooO00o(addPageFragment);
            this.f102755OooOo0o = 1;
            if (oooO0OOOooOoO.f73869OooOo0O.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        throw new C32438OooO0oO();
    }
}
