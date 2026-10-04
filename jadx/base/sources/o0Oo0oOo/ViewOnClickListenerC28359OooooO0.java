package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.CreatorProfileFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: renamed from: o0Oo0oOo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28359OooooO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100538OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100539OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28359OooooO0(Object obj, int i) {
        this.f100539OooOo0o = i;
        this.f100538OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100539OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((CreatorProfileFragment) this.f100538OooOo).OooOOOo();
                return;
            case 1:
                FirebaseUserLoginFragment firebaseUserLoginFragment = (FirebaseUserLoginFragment) this.f100538OooOo;
                TextView textView = firebaseUserLoginFragment.f72361Oooo0OO;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                CheckBox checkBox = firebaseUserLoginFragment.f72365Oooo0oo;
                if (checkBox != null) {
                    textView.setEnabled(checkBox.isChecked());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAgree");
                    throw null;
                }
            case 2:
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = ((HyperLinkResizeEditor) this.f100538OooOo).f74506OooOo0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO0oo(OooO0OO.OooO00o.f74572OooOoo0, null);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) this.f100538OooOo), new C24564OooO00o(R.id.action_globalSettingsFragment_to_backupFragment));
                return;
        }
    }
}
