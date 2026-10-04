package o0OoO0oo;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;

/* JADX INFO: renamed from: o0OoO0oo.o0ooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28978o0ooOOo implements C24572OooOO0o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f102677OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Fragment f102678OooO0O0;

    public /* synthetic */ C28978o0ooOOo(Fragment fragment, int i) {
        this.f102677OooO00o = i;
        this.f102678OooO0O0 = fragment;
    }

    @Override // o000o0O0.C24572OooOO0o.OooO0O0
    public final void OooO00o(C24572OooOO0o controller, C24583OooOo0o destination, Bundle bundle) {
        switch (this.f102677OooO00o) {
            case 0:
                kotlin.jvm.internal.OooOOO0.OooO0oO(controller, "controller");
                kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
                int i = destination.f83302OooOooO;
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f102678OooO0O0;
                if (i != R.id.noteEditorContainerFragment) {
                    View view = noteEditorContainerFragment.getView();
                    if (view != null) {
                        ViewCompat.setSystemGestureExclusionRects(view, com.facebook.soloader.OooOo.OooO0oO(new Rect(0, 0, 0, 0)));
                        return;
                    }
                    return;
                }
                View view2 = noteEditorContainerFragment.getView();
                if (view2 != null) {
                    Configuration configuration = noteEditorContainerFragment.requireContext().getResources().getConfiguration();
                    kotlin.jvm.internal.OooOOO0.OooO0o(configuration, "getConfiguration(...)");
                    int iOooO0o = Oooo0.o000000O.OooO0o(configuration.screenHeightDp);
                    int i2 = iOooO0o / 5;
                    ViewCompat.setSystemGestureExclusionRects(view2, com.facebook.soloader.OooOo.OooO0oO(new Rect(0, i2, Oooo0.o000000O.OooO0o(64), iOooO0o - i2)));
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(controller, "controller");
                kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
                EditText editText = ((EditorOutlineFragment) this.f102678OooO0O0).f75799Oooo000;
                if (editText != null) {
                    editText.clearFocus();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
        }
    }
}
