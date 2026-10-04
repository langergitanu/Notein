package o0OoOO;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.popup.ThemeActionsBottomSheetDialog;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.ViewOnClickListenerC28700OooOOo;

/* JADX INFO: renamed from: o0OoOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28987OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f102723OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28700OooOOo f102724OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ThemeActionsBottomSheetDialog f102725OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PopupWindow f102726OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f102727OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C28986OooO0O0 f102728OooO0o0;

    public C28987OooO0OO(Context context, ViewOnClickListenerC28700OooOOo viewOnClickListenerC28700OooOOo) {
        this.f102723OooO00o = context;
        this.f102724OooO0O0 = viewOnClickListenerC28700OooOOo;
    }

    public final void OooO00o() {
        Object systemService = this.f102723OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_theme_more, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f102726OooO0Oo = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f102726OooO0Oo;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        this.f102728OooO0o0 = new C28986OooO0O0(viewInflate, this.f102724OooO0O0);
        this.f102727OooO0o = true;
    }
}
