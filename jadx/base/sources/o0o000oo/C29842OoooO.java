package o0o000oo;

import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$showRecoverAllPagesDialog$confirmListener$1$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {2265}, m80625m = "invokeSuspend")
public final class C29842OoooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105863OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105864OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29842OoooO(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29842OoooO> continuation) {
        super(2, continuation);
        this.f105863OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29842OoooO(this.f105863OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29842OoooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105864OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105863OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
            this.f105864OooOo0o = 1;
            objOooOoO = Oooo0OO2.OooOoO(this);
            if (objOooOoO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooOoO = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        if (!(objOooOoO instanceof C32445OooOOOO.OooO00o)) {
            baseToolbarChildFragment.OooooOO(27, null);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
