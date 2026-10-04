package o0OoO0oo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import o000O00O.C24397OooOo0;
import o0OoO.ViewOnClickListenerC28501OooO0Oo;
import o0o00OOO.InterfaceC29884OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28720Oooo0O0 implements InterfaceC29884OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24397OooOo0 f101752OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final PopupWindow f101753OooOo0o;

    public C28720Oooo0O0(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int iOooO0o = Oooo0.o000000O.OooO0o(180);
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_lock_up_note, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        viewInflate.findViewById(R.id.cl_lock_note).setOnClickListener(new o0OoO.OooO0OO(this, 1));
        viewInflate.findViewById(R.id.cl_remove_lock_for_note).setOnClickListener(new ViewOnClickListenerC28501OooO0Oo(this, 1));
        PopupWindow popupWindow = new PopupWindow(viewInflate, iOooO0o, -2, false);
        this.f101753OooOo0o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }

    @Override // o0o00OOO.InterfaceC29884OooO00o
    public final void OooO00o() {
        this.f101753OooOo0o.dismiss();
    }

    @Override // o0o00OOO.InterfaceC29884OooO00o
    public final boolean OooO0O0(View view) {
        this.f101753OooOo0o.showAsDropDown(view);
        return true;
    }

    @Override // o0o00OOO.InterfaceC29884OooO00o
    public final void OooOOo0(C24397OooOo0 c24397OooOo0) {
        this.f101752OooOo = c24397OooOo0;
    }
}
