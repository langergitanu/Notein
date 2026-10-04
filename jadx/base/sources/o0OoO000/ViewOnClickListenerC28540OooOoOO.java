package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseNetworkException;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenshotPanel;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import com.orion.notein.p607ui.vip.VipAdvertisementDialogFragment;
import com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity;
import o000o0O0.C24564OooO00o;
import o000o0O0.C24587OooOoo;
import o00o00.C25206OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0Ooo0oO.C29423OooO00o;
import o0Ooo0oO.C29435OooO0oo;
import o0Ooo0oo.C29441OooO0OO;
import o0Ooo0oo.ViewOnClickListenerC29543o000O0o0;
import o0o00Ooo.C29915OooO0OO;
import o0o0O0o.C30294OooO0OO;
import oO0OO.C32881OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00OOo.InterfaceC34352OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28540OooOoOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101169OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101170OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28540OooOoOO(Object obj, int i) {
        this.f101170OooOo0o = i;
        this.f101169OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101169OooOo;
        switch (this.f101170OooOo0o) {
            case 0:
                final FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = (FirebaseLoginConfirmFragment) obj;
                CheckBox checkBox = firebaseLoginConfirmFragment.f72297Oooo;
                if (checkBox == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAgree");
                    throw null;
                }
                if (!checkBox.isChecked()) {
                    Context context = firebaseLoginConfirmFragment.getContext();
                    if (context != null) {
                        String string = firebaseLoginConfirmFragment.getString(R.string.please_agree_terms_and_privacy);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string);
                        return;
                    }
                    return;
                }
                ((C26320o0000OoO) firebaseLoginConfirmFragment.f72301Oooo00o.getValue()).OooO();
                String str = firebaseLoginConfirmFragment.Oooo0O0().f101197OooO00o;
                boolean zEquals = str.equals("google");
                FirebaseAuth firebaseAuth = firebaseLoginConfirmFragment.f72300Oooo00O;
                if (!zEquals) {
                    if (str.equals("microsoft")) {
                        firebaseLoginConfirmFragment.Oooo0();
                        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
                        if (currentUser != null) {
                            firebaseLoginConfirmFragment.Oooo0o(currentUser);
                            return;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("FirebaseLoginConfirmFragment");
                        c20358OooO00o.OooO0OO("firebaseAuthWithGoogle: user is null", new Object[0]);
                        firebaseLoginConfirmFragment.Oooo0OO(1004);
                        return;
                    }
                    return;
                }
                String string2 = firebaseLoginConfirmFragment.Oooo0O0().f101201OooO0o0.getString("id_token");
                if (string2 == null || string2.length() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("FirebaseLoginConfirmFragment");
                    c20358OooO00o2.OooO0OO("handleContinueButtonClicked: idToken is null", new Object[0]);
                    firebaseLoginConfirmFragment.Oooo0OO(1001);
                    return;
                }
                firebaseLoginConfirmFragment.Oooo0();
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = firebaseLoginConfirmFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                AuthCredential credential = GoogleAuthProvider.getCredential(string2, null);
                kotlin.jvm.internal.OooOOO0.OooO0o(credential, "getCredential(...)");
                firebaseAuth.signInWithCredential(credential).addOnCompleteListener(activityC21897OooOo0RequireActivity, new OnCompleteListener() { // from class: o0OoO000.OooOooO
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task signTask) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(signTask, "signTask");
                        boolean zIsSuccessful = signTask.isSuccessful();
                        FirebaseLoginConfirmFragment firebaseLoginConfirmFragment2 = firebaseLoginConfirmFragment;
                        if (!zIsSuccessful) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("FirebaseLoginConfirmFragment");
                            c20358OooO00o3.OooO0Oo(signTask.getException(), "signInWithCredential:failure", new Object[0]);
                            if (signTask.getException() instanceof FirebaseNetworkException) {
                                firebaseLoginConfirmFragment2.Oooo0OO(1002);
                                return;
                            } else {
                                firebaseLoginConfirmFragment2.Oooo0OO(1003);
                                return;
                            }
                        }
                        FirebaseUser currentUser2 = firebaseLoginConfirmFragment2.f72300Oooo00O.getCurrentUser();
                        if (currentUser2 != null) {
                            firebaseLoginConfirmFragment2.Oooo0o(currentUser2);
                            return;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("FirebaseLoginConfirmFragment");
                        c20358OooO00o4.OooO0OO("firebaseAuthWithGoogle: user is null", new Object[0]);
                        firebaseLoginConfirmFragment2.Oooo0OO(1004);
                    }
                });
                return;
            case 1:
                int i = PenBarChildFragment.f75240o0000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type kotlin.String");
                ((C29441OooO0OO) obj).invoke((String) tag);
                return;
            case 2:
                ScreenshotPanel.OooO00o((ScreenshotPanel) obj);
                return;
            case 3:
                o0Oo0oOo.o00Ooo o00ooo2 = ((C29915OooO0OO) obj).f106139OooO0Oo;
                if (o00ooo2 != null) {
                    o00ooo2.onClick(view);
                    return;
                }
                return;
            case 4:
                C30294OooO0OO c30294OooO0OO = ((TrashBinContainerFragment) obj).f78086OoooOO0;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                C30294OooO0OO.OooO0O0(c30294OooO0OO, view, 0, 6);
                return;
            case 5:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GooglePayDialogFragment) obj), new C24564OooO00o(R.id.action_googlePayFragment_to_vipFeaturesComparisonFragment));
                return;
            case 6:
                PagePaddingFragment pagePaddingFragment = (PagePaddingFragment) obj;
                C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                View view2 = pagePaddingFragment.f74938OoooOoO;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnApplyToAll");
                    throw null;
                }
                boolean z = !view2.isActivated();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c29423OooO00oOooOooO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29435OooO0oo(c29423OooO00oOooOooO, z, null), 2);
                return;
            case 7:
                C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO((VipAdvertisementDialogFragment) obj), new C24564OooO00o(R.id.f57984x99cd7b65), new C24587OooOoo(false, false, R.id.vipAdvertisementDialogFragment, true, false, -1, -1, -1, -1));
                return;
            case 8:
                ViewOnClickListenerC29543o000O0o0 viewOnClickListenerC29543o000O0o0 = ((C32881OooO0oO) obj).f118002OooO0O0;
                if (viewOnClickListenerC29543o000O0o0 != null) {
                    viewOnClickListenerC29543o000O0o0.onClick(view);
                    return;
                }
                return;
            default:
                InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = YubiKeyPromptActivity.f80280Oooo00o;
                YubiKeyPromptActivity yubiKeyPromptActivity = (YubiKeyPromptActivity) obj;
                yubiKeyPromptActivity.getClass();
                yubiKeyPromptActivity.startActivity(new Intent("android.settings.NFC_SETTINGS"));
                return;
        }
    }
}
