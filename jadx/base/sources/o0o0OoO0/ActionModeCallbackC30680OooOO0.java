package o0o0OoO0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: renamed from: o0o0OoO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActionModeCallbackC30680OooOO0 implements ActionMode.Callback {
    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            return true;
        }
        menu.clear();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            return false;
        }
        menu.clear();
        return false;
    }
}
