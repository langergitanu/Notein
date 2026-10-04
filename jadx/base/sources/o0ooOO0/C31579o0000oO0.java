package o0ooOO0;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: o0ooOO0.o0000oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31579o0000oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C31579o0000oO0 f112836OooO00o = new C31579o0000oO0();

    public final void OooO00o(ActionMode actionMode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public final ActionMode OooO0O0(View view, ActionMode.Callback actionModeCallback, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(actionModeCallback, "actionModeCallback");
        return view.startActionMode(actionModeCallback, i);
    }
}
