package o0OoOOOo;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import o0OoOOo0.C29181OooO00o;

/* JADX INFO: renamed from: o0OoOOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29096OooO0Oo implements InterfaceC29093OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f103115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C29181OooO00o f103116OooO0O0;

    public C29096OooO0Oo(Context context) {
        C29181OooO00o c29181OooO00o = new C29181OooO00o();
        this.f103116OooO0O0 = c29181OooO00o;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_text_box_color, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        ((RecyclerView) viewInflate.findViewById(R.id.rv_color_list)).setAdapter(c29181OooO00o);
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(220), o000000O.OooO0o(45), true);
        this.f103115OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final boolean OooO00o() {
        return this.f103115OooO00o.isShowing();
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final void dismiss() {
        this.f103115OooO00o.dismiss();
    }
}
