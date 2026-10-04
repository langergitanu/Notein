package o0o00O0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.C29821OooOo00;

/* JADX INFO: renamed from: o0o00O0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29873OooO0Oo implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final PopupWindow f106003OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C29821OooOo00 f106004OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C29874OooO0o0 f106005OooOoO0;

    public C29873OooO0Oo(Context context, C29821OooOo00 c29821OooOo00) {
        this.f106004OooOo0o = c29821OooOo00;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.note_editor_popup_window_width);
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_change_template, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        C29874OooO0o0 c29874OooO0o0 = new C29874OooO0o0(viewInflate);
        c29874OooO0o0.f106007OooO0O0 = new OooO0OO(this);
        this.f106005OooOoO0 = c29874OooO0o0;
        PopupWindow popupWindow = new PopupWindow(viewInflate, dimensionPixelSize, -2, false);
        this.f106003OooOo = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }

    @Override // o0o00O0O.OooO0o
    public final void OooO0OO(View anchor, boolean z) {
        OooOOO0.OooO0oO(anchor, "anchor");
        PopupWindow popupWindow = this.f106003OooOo;
        View contentView = popupWindow.getContentView();
        int width = popupWindow.getWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
        int height = popupWindow.getHeight();
        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
        int measuredWidth = contentView.getMeasuredWidth();
        int measuredHeight = contentView.getMeasuredHeight();
        int i = anchor.getResources().getDisplayMetrics().heightPixels;
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int height2 = anchor.getHeight() + i2;
        if (z) {
            int i3 = -(o000000O.OooO0o(8) + measuredWidth);
            int i4 = -(measuredHeight / 2);
            int i5 = height2 + i4 + measuredHeight;
            if (i5 > i) {
                i4 -= i5 - i;
            }
            int i6 = height2 + i4;
            if (i6 < 0) {
                i4 -= i6;
            }
            popupWindow.showAsDropDown(anchor, i3, i4, 3);
            return;
        }
        int i7 = -((measuredWidth - anchor.getWidth()) / 2);
        int iOooO0o = o000000O.OooO0o(11);
        int height3 = anchor.getHeight() + i2 + iOooO0o + measuredHeight;
        if (height3 > i) {
            iOooO0o -= height3 - i;
        }
        int height4 = anchor.getHeight() + i2 + iOooO0o;
        if (height4 < 0) {
            iOooO0o -= height4;
        }
        popupWindow.showAsDropDown(anchor, i7, iOooO0o, GravityCompat.START);
    }

    @Override // o0o00O0O.OooO0o
    public final void OooO0oo(boolean z, boolean z2) {
        this.f106005OooOoO0.OooO00o(z, z2);
    }

    @Override // o0o00O0O.OooO0o
    public final void hide() {
        this.f106003OooOo.dismiss();
    }
}
