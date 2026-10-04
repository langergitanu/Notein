package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import androidx.appcompat.view.menu.C21508OooO0oO.OooO00o;
import androidx.appcompat.view.menu.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public DialogInterfaceC21484OooO0oO f62636OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOo00 f62637OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C21508OooO0oO f62638OooOoO0;

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public final boolean OooO00o(OooO oooO) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C21508OooO0oO c21508OooO0oO = this.f62638OooOoO0;
        if (c21508OooO0oO.f62627OooOoo0 == null) {
            c21508OooO0oO.f62627OooOoo0 = c21508OooO0oO.new OooO00o();
        }
        this.f62637OooOo0o.performItemAction(c21508OooO0oO.f62627OooOoo0.getItem(i), 0);
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public final void onCloseMenu(OooO oooO, boolean z) {
        DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oO;
        if ((z || oooO == this.f62637OooOo0o) && (dialogInterfaceC21484OooO0oO = this.f62636OooOo) != null) {
            dialogInterfaceC21484OooO0oO.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f62638OooOoO0.onCloseMenu(this.f62637OooOo0o, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        OooOo00 oooOo00 = this.f62637OooOo0o;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f62636OooOo.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f62636OooOo.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oooOo00.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oooOo00.performShortcut(i, keyEvent, 0);
    }
}
