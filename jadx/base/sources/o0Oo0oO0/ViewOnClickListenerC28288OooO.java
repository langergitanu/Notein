package o0Oo0oO0;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.audio.OooO0OO;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineEditDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.pay.google.CancelSubscriptionAlertDialog;
import o00o00.C25206OooO0Oo;
import o0Oo0oO.C28285OooO00o;
import o0OoO000.C28536OooOo0O;
import o0OoO000.C28560OoooOOO;
import o0oOOO0o.InterfaceC30836OooOOOO;

/* JADX INFO: renamed from: o0Oo0oO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28288OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100332OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100333OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28288OooO(Object obj, int i) {
        this.f100333OooOo0o = i;
        this.f100332OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100333OooOo0o) {
            case 0:
                FeedbackFragment feedbackFragment = (FeedbackFragment) this.f100332OooOo;
                C28285OooO00o c28285OooO00o = feedbackFragment.f71824Oooo0;
                if (c28285OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("feedbackPicAdapter");
                    throw null;
                }
                if (c28285OooO00o.f66021OooO00o.f65811OooO0o.size() >= 6) {
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = feedbackFragment.requireActivity();
                    kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    String string = feedbackFragment.getString(R.string.feedback_content_pic_limit, 6);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(activityC21897OooOo0RequireActivity, string);
                    return;
                }
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.addCategory("android.intent.category.OPENABLE");
                OooO0o.OooO0O0<Intent> oooO0O0 = feedbackFragment.f71828Oooo0O0;
                if (oooO0O0 != null) {
                    oooO0O0.OooO00o(intent);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pictureLauncher");
                    throw null;
                }
            case 1:
                FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment = (FirebaseCreateUserVerificationFragment) this.f100332OooOo;
                FirebaseUser currentUser = ((C28560OoooOOO) firebaseCreateUserVerificationFragment.f72288Oooo000.getValue()).f101228OooOO0.getCurrentUser();
                if (currentUser == null) {
                    firebaseCreateUserVerificationFragment.Oooo00o(1004);
                    return;
                } else {
                    currentUser.sendEmailVerification().addOnCompleteListener(new C28536OooOo0O(firebaseCreateUserVerificationFragment));
                    return;
                }
            case 2:
                AudioBarChildFragment audioBarChildFragment = (AudioBarChildFragment) this.f100332OooOo;
                if (audioBarChildFragment.OooOoo0().OooOOo0()) {
                    audioBarChildFragment.OooOoo0().OooOOoo();
                    return;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(audioBarChildFragment.OooOoo0().f74227OooOO0.getValue(), OooO0OO.OooO0o.f74211OooO0O0)) {
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o.Oooo00O(audioBarChildFragment.OooOoo0(), null, 3);
                    return;
                }
                SeekBar seekBar = audioBarChildFragment.f74169Oooo0o;
                if (seekBar == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                    throw null;
                }
                if (seekBar.getMax() > 0) {
                    SeekBar seekBar2 = audioBarChildFragment.f74169Oooo0o;
                    if (seekBar2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                        throw null;
                    }
                    int progress = seekBar2.getProgress();
                    SeekBar seekBar3 = audioBarChildFragment.f74169Oooo0o;
                    if (seekBar3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                        throw null;
                    }
                    if (progress < seekBar3.getMax()) {
                        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
                        SeekBar seekBar4 = audioBarChildFragment.f74169Oooo0o;
                        if (seekBar4 != null) {
                            com.orion.notein.p607ui.noteeditor.audio.OooO0o.Oooo00O(oooO0oOooOoo0, Integer.valueOf(seekBar4.getProgress()), 2);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                            throw null;
                        }
                    }
                }
                com.orion.notein.p607ui.noteeditor.audio.OooO0o.Oooo00O(audioBarChildFragment.OooOoo0(), null, 3);
                return;
            case 3:
                Dialog dialog = ((OutlineEditDialogFragment) this.f100332OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 4:
                PenBox.OooOOO oooOOO = ((PenBox) this.f100332OooOo).penSettingsFavoritesListener;
                if (oooOOO != null) {
                    oooOOO.OooO0OO();
                    return;
                }
                return;
            case 5:
                Dialog dialog2 = ((CancelSubscriptionAlertDialog) this.f100332OooOo).getDialog();
                if (dialog2 != null) {
                    dialog2.dismiss();
                    return;
                }
                return;
            default:
                PagePaddingFragment pagePaddingFragment = (PagePaddingFragment) this.f100332OooOo;
                androidx.lifecycle.OooOOOO parentFragment = pagePaddingFragment.getParentFragment();
                InterfaceC30836OooOOOO interfaceC30836OooOOOO = null;
                InterfaceC30836OooOOOO interfaceC30836OooOOOO2 = parentFragment instanceof InterfaceC30836OooOOOO ? (InterfaceC30836OooOOOO) parentFragment : null;
                if (interfaceC30836OooOOOO2 == null) {
                    KeyEventDispatcher.Component activity = pagePaddingFragment.getActivity();
                    if (activity instanceof InterfaceC30836OooOOOO) {
                        interfaceC30836OooOOOO = (InterfaceC30836OooOOOO) activity;
                    }
                } else {
                    interfaceC30836OooOOOO = interfaceC30836OooOOOO2;
                }
                if (interfaceC30836OooOOOO != null) {
                    interfaceC30836OooOOOO.OooOO0O();
                    return;
                }
                return;
        }
    }
}
