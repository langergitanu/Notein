package o0oOoOO;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooo.AbstractC28490OooOoOO;
import o0Oo0ooo.C28482OooOOoo;
import o0Oo0ooo.C28489OooOoO0;
import o0Oo0ooo.C28495OooOoo0;
import o0Oo0ooo.C28496OooOooO;
import o0Oo0ooo.C28498Oooo000;
import o0oO0O00.C30770OooO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0oOoOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31011OooO0oO implements InterfaceC31009OooO0o {
    @Override // o0oOoOO.InterfaceC31009OooO0o
    public final Integer OooO00o() {
        return Integer.valueOf(R.string.label_find_password_code);
    }

    @Override // o0oOoOO.InterfaceC31009OooO0o
    public final Integer OooO0O0() {
        return Integer.valueOf(R.string.reset_password);
    }

    @Override // o0oOoOO.InterfaceC31009OooO0o
    public final boolean OooO0OO(Fragment fragment, AbstractC28490OooOoOO event) {
        OooOOO0.OooO0oO(event, "event");
        if (!(event instanceof AbstractC28490OooOoOO.OooO0o)) {
            return false;
        }
        AbstractC28490OooOoOO.OooO0o oooO0o = (AbstractC28490OooOoOO.OooO0o) event;
        String str = oooO0o.f100965OooO00o;
        String str2 = oooO0o.f100966OooO0O0;
        String str3 = oooO0o.f100967OooO0OO;
        new C30770OooO(str, str2, str3);
        Bundle bundle = new Bundle();
        bundle.putString("countryCode", str);
        bundle.putString("number", str2);
        bundle.putString("verificationCode", str3);
        C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(fragment), R.id.action_loginVerifyCodeFragment_to_setPasswordFragment, bundle);
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
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(submissionViewModel), null, null, new C28498Oooo000(str, null, c28495OooOoo0, submissionViewModel), 3);
    }
}
