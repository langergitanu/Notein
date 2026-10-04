package o0o000oo;

import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnRulerBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1571}, m80625m = "invokeSuspend")
public final class C29832Oooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105830OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105831OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29832Oooo0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29832Oooo0> continuation) {
        super(2, continuation);
        this.f105830OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29832Oooo0(this.f105830OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29832Oooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105831OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105830OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f105831OooOo0o = 1;
            obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 49, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        baseToolbarChildFragment.Oooo0oo().OooO0o(19, baseToolbarChildFragment.Oooo0OO().OoooO0());
        return C32460OooOooO.f116667OooO00o;
    }
}
