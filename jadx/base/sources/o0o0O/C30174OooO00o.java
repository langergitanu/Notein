package o0o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.material.datepicker.ViewOnClickListenerC22469OooO0o0;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Ooo.ViewOnClickListenerC29256OooO0Oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30174OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107398OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC29256OooO0Oo f107399OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f107400OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Integer> f107401OooO0Oo = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_camera), Integer.valueOf(R.id.item_gallery), Integer.valueOf(R.id.item_pdf), Integer.valueOf(R.id.item_pdf_page), Integer.valueOf(R.id.item_note));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f107402OooO0o0 = new AtomicBoolean(false);

    public C30174OooO00o(Context context, ViewOnClickListenerC29256OooO0Oo viewOnClickListenerC29256OooO0Oo) {
        this.f107398OooO00o = context;
        this.f107399OooO0O0 = viewOnClickListenerC29256OooO0Oo;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f107400OooO0OO;
        if (popupWindow == null) {
            return;
        }
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }

    public final void OooO0O0() {
        Object systemService = this.f107398OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_add_session, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(250), -2, false);
        this.f107400OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.f107400OooO0OO;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        List<Integer> list = this.f107401OooO0Oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 1000L, new ViewOnClickListenerC22469OooO0o0(this, 4));
            arrayList.add(viewFindViewById);
        }
    }
}
