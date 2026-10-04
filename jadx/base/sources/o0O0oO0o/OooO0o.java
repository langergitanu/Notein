package o0O0oO0o;

import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ DefaultZoomHandle f89096OooOo0o;

    public OooO0o(DefaultZoomHandle defaultZoomHandle) {
        this.f89096OooOo0o = defaultZoomHandle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DefaultZoomHandle defaultZoomHandle = this.f89096OooOo0o;
        if (defaultZoomHandle.f69434Oooo000.f89117OooO00o.isShowing()) {
            defaultZoomHandle.f69434Oooo000.f89117OooO00o.dismiss();
            defaultZoomHandle.OooO0o();
            return;
        }
        defaultZoomHandle.f69433Oooo0.removeCallbacks(defaultZoomHandle.f69437Oooo0O0);
        ArrayList arrayListOooO0O0 = defaultZoomHandle.f69436Oooo00o.OooO0O0();
        PopupWindow popupWindow = defaultZoomHandle.f69434Oooo000.f89117OooO00o;
        Rect rect = new Rect();
        defaultZoomHandle.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        defaultZoomHandle.getLocationOnScreen(iArr);
        int height = rect.bottom - (defaultZoomHandle.getHeight() + iArr[1]);
        popupWindow.getContentView().measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        boolean z = height < popupWindow.getContentView().getMeasuredHeight();
        C26103OooOOo0 c26103OooOOo0 = defaultZoomHandle.f69434Oooo000;
        c26103OooOOo0.OooO00o(defaultZoomHandle.OooO0o0(arrayListOooO0O0));
        PopupWindow popupWindow2 = c26103OooOOo0.f89117OooO00o;
        if (!z) {
            popupWindow2.showAsDropDown(defaultZoomHandle, 0, 0);
        } else {
            popupWindow2.getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            popupWindow2.showAsDropDown(defaultZoomHandle, 0, -(defaultZoomHandle.getHeight() + popupWindow2.getContentView().getMeasuredHeight()));
        }
    }
}
