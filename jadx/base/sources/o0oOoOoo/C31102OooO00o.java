package o0oOoOoo;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0oOoOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31102OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f110996OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Integer> f110997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f110998OooO0OO;

    public C31102OooO00o(Context context, View.OnClickListener onClickListener) {
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_split_v), Integer.valueOf(R.id.item_split_h), Integer.valueOf(R.id.item_switch_note), Integer.valueOf(R.id.item_switch_orientation), Integer.valueOf(R.id.item_close));
        this.f110997OooO0O0 = listOooOO0o;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_editor_recent_note_more, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f110996OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        List<Integer> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, onClickListener);
            arrayList.add(viewFindViewById);
        }
        this.f110998OooO0OO = arrayList;
    }

    public final synchronized void OooO00o() {
        this.f110996OooO00o.dismiss();
    }

    public final synchronized void OooO0O0(View view, C31103OooO0O0 c31103OooO0O0, int i, boolean z, boolean z2, int i2) {
        try {
            Iterator it = this.f110998OooO0OO.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setTag(c31103OooO0O0);
            }
            View viewFindViewById = this.f110996OooO00o.getContentView().findViewById(R.id.item_split_v);
            OooOOO0.OooO0Oo(viewFindViewById);
            int i3 = 8;
            viewFindViewById.setVisibility(c31103OooO0O0 == null || !c31103OooO0O0.f111000OooO0O0 || i == 1 || i == 0 ? 0 : 8);
            View viewFindViewById2 = this.f110996OooO00o.getContentView().findViewById(R.id.item_split_h);
            OooOOO0.OooO0Oo(viewFindViewById2);
            viewFindViewById2.setVisibility((c31103OooO0O0 == null || !c31103OooO0O0.f111000OooO0O0 || i == 2 || i == 0) ? 0 : 8);
            View viewFindViewById3 = this.f110996OooO00o.getContentView().findViewById(R.id.item_switch_note);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            viewFindViewById3.setVisibility((c31103OooO0O0 == null || !c31103OooO0O0.f111000OooO0O0 || i == 0) ? 8 : 0);
            View viewFindViewById4 = this.f110996OooO00o.getContentView().findViewById(R.id.item_switch_orientation);
            OooOOO0.OooO0o(viewFindViewById4, "findViewById(...)");
            viewFindViewById4.setVisibility((c31103OooO0O0 == null || !c31103OooO0O0.f111000OooO0O0 || i == 0) ? 8 : 0);
            View viewFindViewById5 = this.f110996OooO00o.getContentView().findViewById(R.id.item_close);
            OooOOO0.OooO0Oo(viewFindViewById5);
            viewFindViewById5.setVisibility((c31103OooO0O0 == null || !c31103OooO0O0.f111000OooO0O0 || i == 0) ? 8 : 0);
            ArrayList arrayList = this.f110998OooO0OO;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((View) obj).getVisibility() == 0) {
                    arrayList2.add(obj);
                }
            }
            int iOooO0o = o000000O.OooO0o(45) * arrayList2.size();
            if (z) {
                if (z2) {
                    if (c31103OooO0O0 != null && c31103OooO0O0.f111000OooO0O0) {
                        i3 = 0;
                    }
                    viewFindViewById5.setVisibility(i3);
                }
                this.f110996OooO00o.showAsDropDown(view, 0, i2);
            } else {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                if (view.getId() == R.id.more) {
                    this.f110996OooO00o.showAtLocation(view, 0, rect.right + o000000O.OooO0o(6), rect.bottom - iOooO0o);
                } else {
                    this.f110996OooO00o.showAtLocation(view, 0, rect.centerX(), rect.centerY());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
