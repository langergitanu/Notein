package o0Oo0oO0;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.lifecycle.o0OoOo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineDeleteAlertDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.penkit.tools.DrawToolFactory;
import o00o00.C25206OooO0Oo;
import o0o0O0o.C30292OooO00o;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0oO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28296OooO0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100349OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100350OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28296OooO0oo(Object obj, int i) {
        this.f100350OooOo0o = i;
        this.f100349OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100350OooOo0o) {
            case 0:
                FeedbackFragment feedbackFragment = (FeedbackFragment) this.f100349OooOo;
                EditText editText = feedbackFragment.f71820OooOoo;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO(FirebaseAnalytics.Param.CONTENT);
                    throw null;
                }
                if (editText.getText().length() > 600) {
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = feedbackFragment.requireActivity();
                    kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    String string = feedbackFragment.getString(R.string.feedback_content_too_long);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(activityC21897OooOo0RequireActivity, string);
                    return;
                }
                View view2 = feedbackFragment.f71830Oooo0o0;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                    throw null;
                }
                view2.setClickable(false);
                View view3 = feedbackFragment.f71830Oooo0o0;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("commit");
                    throw null;
                }
                view3.setEnabled(false);
                OooOOO OooOoO2 = feedbackFragment.OooOoO();
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(OooOoO2), null, null, new C28300OooOOOo(OooOoO2, null), 3);
                return;
            case 1:
                Bundle bundle = new Bundle();
                FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment = (FirebaseCreateUserVerificationFragment) this.f100349OooOo;
                C21904OooOoo0.OooO0o(bundle, firebaseCreateUserVerificationFragment, "key_firebase_login");
                C21030OooOO0o.OooO0OO(firebaseCreateUserVerificationFragment).OooOOo(R.id.firebaseUserAuthFragment, true);
                return;
            case 2:
                Dialog dialog = ((OutlineDeleteAlertDialogFragment) this.f100349OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 3:
                PenBox.InterfaceC23606OooO0o0 interfaceC23606OooO0o0 = ((PenBox) this.f100349OooOo).lassoFilterListener;
                if (interfaceC23606OooO0o0 != null) {
                    interfaceC23606OooO0o0.OooO00o(BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_FREE)));
                    return;
                }
                return;
            default:
                View.OnClickListener onClickListener = ((C30292OooO00o) this.f100349OooOo).f107950OooO0Oo;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
