package com.orion.notein.p607ui.login.thirdparty;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import com.orion.notein.p607ui.TipsDialogFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0OoO0OO.AlertDialogC28626OooOoO0;
import o0OoO0OO.C28617OooOOOo;
import o0OoO0OO.C28619OooOOo0;
import o0OoO0OO.InterfaceC28618OooOOo;
import o0OoO0OO.InterfaceC28621OooOo;
import o0OoO0OO.ViewOnClickListenerC28609OooO0oO;
import o0OoO0OO.ViewOnClickListenerC28610OooO0oo;
import oO00ooO.C32447OooOOo;
import oO0o0OO.o00000OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/ui/login/thirdparty/LoginFragment;", "Landroidx/fragment/app/Fragment;", "Lo0OoO0OO/OooOo;", "Lo0OoO0OO/OooOOo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class LoginFragment extends Fragment implements InterfaceC28621OooOo, InterfaceC28618OooOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32447OooOOo f72610OooOo0o = C20519OooO0Oo.OooO0OO(new C28619OooOOo0(this, 0));

    public final void OooOoO(ImageView imageView, View view) {
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragmentOooOoO0 = OooOoO0();
        loginByThirdPartyChildFragmentOooOoO0.getClass();
        loginByThirdPartyChildFragmentOooOoO0.f72585OooOooo = view;
        C28050OooO0OO.OooO00o(imageView, 1500L, new ViewOnClickListenerC28408OooO0O0(loginByThirdPartyChildFragmentOooOoO0, 1));
    }

    public final LoginByThirdPartyChildFragment OooOoO0() {
        return (LoginByThirdPartyChildFragment) this.f72610OooOo0o.getValue();
    }

    public final void OooOoOO(ImageView imageView, View view) {
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragmentOooOoO0 = OooOoO0();
        loginByThirdPartyChildFragmentOooOoO0.getClass();
        loginByThirdPartyChildFragmentOooOoO0.f72589Oooo00o = view;
        C28050OooO0OO.OooO00o(imageView, 1500L, new ViewOnClickListenerC28413OooO0oO(loginByThirdPartyChildFragmentOooOoO0, 1));
    }

    public final void OooOoo(ImageView imageView, View view) {
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragmentOooOoO0 = OooOoO0();
        loginByThirdPartyChildFragmentOooOoO0.getClass();
        loginByThirdPartyChildFragmentOooOoO0.f72587Oooo000 = view;
        C28050OooO0OO.OooO00o(imageView, 1500L, new ViewOnClickListenerC28609OooO0oO(loginByThirdPartyChildFragmentOooOoO0, 0));
    }

    public final void OooOoo0(ImageView imageView, View view) {
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragmentOooOoO0 = OooOoO0();
        loginByThirdPartyChildFragmentOooOoO0.getClass();
        loginByThirdPartyChildFragmentOooOoO0.f72588Oooo00O = view;
        C28050OooO0OO.OooO00o(imageView, 1500L, new ViewOnClickListenerC28610OooO0oo(loginByThirdPartyChildFragmentOooOoO0, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        OooOOO0.OooO0oO(context, "context");
        super.onAttach(context);
        getChildFragmentManager().f64825OooOoo0 = new C28617OooOOOo(this, this);
        FragmentManager childFragmentManager = getChildFragmentManager();
        OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooO0Oo(0, OooOoO0(), OooOoO0().getClass().getSimpleName(), 1);
        oooO00oOooO0OO.OooO(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragmentOooOoO0 = OooOoO0();
        loginByThirdPartyChildFragmentOooOoO0.getClass();
        try {
            AlertDialogC28626OooOoO0 alertDialogC28626OooOoO0 = loginByThirdPartyChildFragmentOooOoO0.f72584OooOooO;
            if (alertDialogC28626OooOoO0 != null) {
                alertDialogC28626OooOoO0.dismiss();
            }
            o00000OO o00000oo2 = loginByThirdPartyChildFragmentOooOoO0.f72579OooOoO;
            if (o00000oo2 != null) {
                o00000oo2.cancel((CancellationException) null);
            }
            o00000OO o00000oo3 = loginByThirdPartyChildFragmentOooOoO0.f72581OooOoOO;
            if (o00000oo3 != null) {
                o00000oo3.cancel((CancellationException) null);
            }
            o00000OO o00000oo4 = loginByThirdPartyChildFragmentOooOoO0.f72583OooOoo0;
            if (o00000oo4 != null) {
                o00000oo4.cancel((CancellationException) null);
            }
            Fragment fragmentOooOooo = loginByThirdPartyChildFragmentOooOoO0.getChildFragmentManager().OooOooo("TipsDialogFragment");
            TipsDialogFragment tipsDialogFragment = fragmentOooOooo instanceof TipsDialogFragment ? (TipsDialogFragment) fragmentOooOooo : null;
            if (tipsDialogFragment != null) {
                tipsDialogFragment.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentManager childFragmentManager = getChildFragmentManager();
        OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooOOO0(OooOoO0());
        oooO00oOooO0OO.OooO(true, true);
    }
}
