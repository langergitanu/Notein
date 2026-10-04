package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f102085OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102086OooOo0o;

    public /* synthetic */ o00O(Fragment fragment, int i) {
        this.f102086OooOo0o = i;
        this.f102085OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f102086OooOo0o) {
            case 0:
                NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f102085OooOo;
                noteEditorFragment.f73055o0O0O00 = false;
                noteEditorFragment.f73046o000OOo.clear();
                break;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) this.f102085OooOo), new C24564OooO00o(R.id.action_globalSettingsFragment_to_toolSettingsFragment));
                break;
        }
    }
}
