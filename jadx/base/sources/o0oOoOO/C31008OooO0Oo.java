package o0oOoOO;

import Oooo0oO.C21030OooOO0o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o000o0O0.C24587OooOoo;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooo.AbstractC28490OooOoOO;
import o0Oo0ooo.C28482OooOOoo;
import o0Oo0ooo.C28489OooOoO0;
import o0Oo0ooo.C28495OooOoo0;
import o0Oo0ooo.C28496OooOooO;
import o0Oo0ooo.C28499Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0oOoOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31008OooO0Oo implements InterfaceC31009OooO0o {

    /* JADX INFO: renamed from: o0oOoOO.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.verifycode.OldPhoneVerifyStrategy$handleTerminalEvent$1", m80623f = "OldPhoneVerifyStrategy.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Fragment f110726OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Fragment fragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110726OooOo0o = fragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110726OooOo0o, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24587OooOoo c24587OooOoo = new C24587OooOoo(false, false, R.id.requestOldPhoneCodeFragment, false, false, -1, -1, -1, -1);
            C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(this.f110726OooOo0o), new C24564OooO00o(R.id.action_verifyCodeFragment_to_requestNewPhoneCodeFragment), c24587OooOoo);
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
        if (!(event instanceof AbstractC28490OooOoOO.C28491OooO0Oo)) {
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
        Object value;
        OooOOO0.OooO0oO(submissionViewModel, "submissionViewModel");
        C33781o00o0O c33781o00o0O = submissionViewModel.f100983OooO0o0;
        C28482OooOOoo c28482OooOOoo = (C28482OooOOoo) c33781o00o0O.getValue();
        C28495OooOoo0 c28495OooOoo0 = (C28495OooOoo0) submissionViewModel.f100980OooO.getValue();
        if (c28482OooOOoo.f100921OooO0O0) {
            return;
        }
        String str = c28482OooOOoo.f100920OooO00o;
        if ((str.length() != 4 && str.length() != 6) || C33599OooOo0O.Oooo0o0(c28495OooOoo0.f100978OooO00o) || C33599OooOo0O.Oooo0o0(c28495OooOoo0.f100979OooO0O0)) {
            return;
        }
        do {
            value = c33781o00o0O.getValue();
        } while (!c33781o00o0O.OooO(value, C28482OooOOoo.OooO00o((C28482OooOOoo) value, true, null, 1)));
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(submissionViewModel), null, null, new C28499Oooo00O(str, null, c28495OooOoo0, submissionViewModel), 3);
    }
}
