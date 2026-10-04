package o0oOoOO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooo.AbstractC28490OooOoOO;
import o0Oo0ooo.C28489OooOoO0;
import o0Oo0ooo.C28496OooOooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOoOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31007OooO0OO implements InterfaceC31009OooO0o {

    /* JADX INFO: renamed from: o0oOoOO.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.NewPhoneVerifyStrategy$handleTerminalEvent$1", m80623f = "NewPhoneVerifyStrategy.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Fragment f110725OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Fragment fragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110725OooOo0o = fragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110725OooOo0o, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Fragment fragment = this.f110725OooOo0o;
            Context contextRequireContext = fragment.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            String string = fragment.getString(R.string.update_phone_success);
            OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(contextRequireContext, string);
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(fragment), new C24564OooO00o(R.id.action_verifyCodeFragment_to_userSettingsFragment));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // o0oOoOO.InterfaceC31009OooO0o
    public final Integer OooO0O0() {
        return Integer.valueOf(R.string.change_phone);
    }

    @Override // o0oOoOO.InterfaceC31009OooO0o
    public final boolean OooO0OO(Fragment fragment, AbstractC28490OooOoOO event) {
        OooOOO0.OooO0oO(event, "event");
        if (!(event instanceof AbstractC28490OooOoOO.OooO0OO)) {
            return false;
        }
        InterfaceC21987OooOoo viewLifecycleOwner = fragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(fragment, null), 3);
        return true;
    }

    @Override // o0oOoOO.InterfaceC31009OooO0o
    public final void OooO0Oo(C31012OooO0oo args, C28489OooOoO0 requestViewModel, C28496OooOooO submissionViewModel) {
        OooOOO0.OooO0oO(args, "args");
        OooOOO0.OooO0oO(requestViewModel, "requestViewModel");
        OooOOO0.OooO0oO(submissionViewModel, "submissionViewModel");
        String str = args.f110730OooO0O0;
        String str2 = args.f110731OooO0OO;
        requestViewModel.OooO0oO(str, str2);
        submissionViewModel.OooO0oO(str, str2);
        submissionViewModel.OooO0o();
        C28489OooOoO0.OooOO0(requestViewModel);
    }

    @Override // o0oOoOO.InterfaceC31009OooO0o
    public final void OooO0o0(C28496OooOooO submissionViewModel) {
        OooOOO0.OooO0oO(submissionViewModel, "submissionViewModel");
        submissionViewModel.OooO0o0(AbstractC28490OooOoOO.OooO0OO.f100963OooO00o);
    }
}
