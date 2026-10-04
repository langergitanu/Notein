package o00000oo;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.p002ui.window.PopupLayout;

/* JADX INFO: loaded from: classes.dex */
public class OooOo implements InterfaceC24134OooOo0 {
    @Override // o00000oo.InterfaceC24134OooOo0
    public void OooO00o(PopupLayout popupLayout, int i, int i2) {
    }

    @Override // o00000oo.InterfaceC24134OooOo0
    public final void OooO0O0(WindowManager windowManager, PopupLayout popupLayout, WindowManager.LayoutParams params) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(windowManager, "windowManager");
        kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
        windowManager.updateViewLayout(popupLayout, params);
    }

    @Override // o00000oo.InterfaceC24134OooOo0
    public final void OooO0OO(Rect outRect, View composeView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(composeView, "composeView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }
}
