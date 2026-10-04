package o0o000oo;

import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo0o00.ViewOnClickListenerC28177OooOooo;
import o0o00O0O.C29874OooO0o0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29821OooOo00 implements C29874OooO0o0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105802OooO00o;

    /* JADX INFO: renamed from: o0o000oo.OooOo00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$createChangeTemplatePopupWindow$callback$1$onRecoverAllPagesClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ BaseToolbarChildFragment f105803OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105803OooOo0o = baseToolbarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105803OooOo0o, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            BaseToolbarChildFragment baseToolbarChildFragment = this.f105803OooOo0o;
            if (baseToolbarChildFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                ViewOnClickListenerC28177OooOooo viewOnClickListenerC28177OooOooo = new ViewOnClickListenerC28177OooOooo(baseToolbarChildFragment, 2);
                String string = baseToolbarChildFragment.getString(R.string.tips);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = baseToolbarChildFragment.getString(R.string.tips_recover_all_pages);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                new TipsDialogFragment(string, string2, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC28177OooOooo).show(baseToolbarChildFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o000oo.OooOo00$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$createChangeTemplatePopupWindow$callback$1$onRecoverPageClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {886}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BaseToolbarChildFragment f105804OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105805OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f105804OooOo = baseToolbarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f105804OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOooOoOO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105805OooOo0o;
            BaseToolbarChildFragment baseToolbarChildFragment = this.f105804OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                this.f105805OooOo0o = 1;
                objOooOoOO = Oooo0OO2.OooOoOO(this);
                if (objOooOoOO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooOoOO = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            if (!(objOooOoOO instanceof C32445OooOOOO.OooO00o)) {
                baseToolbarChildFragment.OooooOO(27, null);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C29821OooOo00(BaseToolbarChildFragment baseToolbarChildFragment) {
        this.f105802OooO00o = baseToolbarChildFragment;
    }

    @Override // o0o00O0O.C29874OooO0o0.OooO00o
    public final void OooO00o() {
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105802OooO00o;
        BaseToolbarChildFragment.OooOoo(baseToolbarChildFragment);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment), null, null, new OooO00o(baseToolbarChildFragment, null), 3);
    }

    @Override // o0o00O0O.C29874OooO0o0.OooO00o
    public final void OooO0O0() {
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105802OooO00o;
        BaseToolbarChildFragment.OooOoo(baseToolbarChildFragment);
        BaseToolbarChildFragment.OooOooO(baseToolbarChildFragment);
    }

    @Override // o0o00O0O.C29874OooO0o0.OooO00o
    public final void OooO0OO() {
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105802OooO00o;
        BaseToolbarChildFragment.OooOoo(baseToolbarChildFragment);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment), null, null, new OooO0O0(baseToolbarChildFragment, null), 3);
    }
}
