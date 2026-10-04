package o0o00O0;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f105964OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C29867OooO0o0 f105965OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final PopupWindow f105966OooOoO0;

    public OooO0OO(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_aiocr_button, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, context.getResources().getDimensionPixelSize(R.dimen.note_more_popup_window_width), -2, false);
        this.f105966OooOoO0 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        this.f105965OooOo0o = new C29867OooO0o0(viewInflate);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o00O0.OooO0O0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f105963OooOo0o.f105964OooOo = System.currentTimeMillis();
            }
        });
    }

    @Override // o0o00O0.OooO0o
    public final void OooO00o() {
        this.f105966OooOoO0.dismiss();
    }

    @Override // o0o00O0.OooO0o
    public final boolean OooO0O0(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f105964OooOo < 500) {
            return false;
        }
        PopupWindow popupWindow = this.f105966OooOoO0;
        View contentView = popupWindow.getContentView();
        int width = popupWindow.getWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
        int height = popupWindow.getHeight();
        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height != -2 ? 1073741824 : 0));
        popupWindow.showAsDropDown(view, -((contentView.getMeasuredWidth() - view.getWidth()) / 2), o000000O.OooO0o(11), GravityCompat.START);
        this.f105964OooOo = jCurrentTimeMillis;
        return true;
    }

    @Override // o0o00O0.OooO0o
    public final void OooOOO(o0OO0o.OooO0OO oooO0OO) {
        this.f105965OooOo0o.f105970OooO0O0 = oooO0OO;
    }
}
