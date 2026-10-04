package o0o00O00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0o000oo.ViewOnClickListenerC29824OooOoO;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o00O00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29870OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f105997OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Integer> f105998OooO0O0;

    public C29870OooO0o0(Context context, ViewOnClickListenerC29824OooOoO viewOnClickListenerC29824OooOoO) {
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.cl_page_rotate_90_cw), Integer.valueOf(R.id.cl_page_rotate_90_ccw), Integer.valueOf(R.id.cl_page_rotate_180));
        this.f105998OooO0O0 = listOooOO0o;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_page_rotation_menu, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, context.getResources().getDimensionPixelSize(R.dimen.note_editor_popup_window_width), -2, false);
        this.f105997OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        Iterator<T> it = listOooOO0o.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, viewOnClickListenerC29824OooOoO);
        }
    }
}
