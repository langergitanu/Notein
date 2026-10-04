package o0o00O0o;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.ViewOnClickListenerC29820OooOo0;

/* JADX INFO: renamed from: o0o00O0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29878OooO0Oo implements InterfaceC29879OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final PopupWindow f106012OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ViewOnClickListenerC29820OooOo0 f106013OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C29880OooO0o0 f106014OooOoO0;

    public C29878OooO0Oo(Context context, ViewOnClickListenerC29820OooOo0 viewOnClickListenerC29820OooOo0) {
        this.f106013OooOo0o = viewOnClickListenerC29820OooOo0;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.note_editor_popup_window_width);
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_editor_export_note, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        C29880OooO0o0 c29880OooO0o0 = new C29880OooO0o0(viewInflate);
        ViewOnClickListenerC29877OooO0OO viewOnClickListenerC29877OooO0OO = new ViewOnClickListenerC29877OooO0OO(this);
        viewInflate.findViewById(R.id.cl_export_single_page).setOnClickListener(viewOnClickListenerC29877OooO0OO);
        viewInflate.findViewById(R.id.cl_export_multi_page).setOnClickListener(viewOnClickListenerC29877OooO0OO);
        viewInflate.findViewById(R.id.cl_export_the_whole_note).setOnClickListener(viewOnClickListenerC29877OooO0OO);
        this.f106014OooOoO0 = c29880OooO0o0;
        PopupWindow popupWindow = new PopupWindow(viewInflate, dimensionPixelSize, -2, false);
        this.f106012OooOo = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }

    @Override // o0o00O0o.InterfaceC29879OooO0o
    public final void OooO0OO(View anchor, boolean z) {
        OooOOO0.OooO0oO(anchor, "anchor");
        PopupWindow popupWindow = this.f106012OooOo;
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
        int height2 = anchor.getHeight() + iArr[1];
        int i2 = -(o000000O.OooO0o(8) + measuredWidth);
        int i3 = -(measuredHeight / 2);
        int i4 = height2 + i3 + measuredHeight;
        if (i4 > i) {
            i3 -= i4 - i;
        }
        int i5 = height2 + i3;
        if (i5 < 0) {
            i3 -= i5;
        }
        popupWindow.showAsDropDown(anchor, i2, i3, 3);
    }

    @Override // o0o00O0o.InterfaceC29879OooO0o
    public final void OooO0o0(boolean z) {
        View viewFindViewById = this.f106014OooOoO0.f106015OooO00o.findViewById(R.id.cl_export_multi_page);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(z ? 0 : 8);
    }

    @Override // o0o00O0o.InterfaceC29879OooO0o
    public final synchronized void hide() {
        this.f106012OooOo.dismiss();
    }
}
