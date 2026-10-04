package o0o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.o000OOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107409OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo f107410OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f107411OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Integer> f107412OooO0Oo = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_rename), Integer.valueOf(R.id.item_export), Integer.valueOf(R.id.item_delete));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f107413OooO0o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f107414OooO0o0;

    public OooO0OO(Context context, o000OOo o000ooo2) {
        this.f107409OooO00o = context;
        this.f107410OooO0O0 = o000ooo2;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f107411OooO0OO;
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
        Object systemService = this.f107409OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_text_recognize_session_more, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f107411OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.f107411OooO0OO;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        List<Integer> list = this.f107412OooO0Oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 1000L, new o000OOo(this, 2));
            arrayList.add(viewFindViewById);
        }
        this.f107414OooO0o0 = arrayList;
    }
}
