package o0OoooOo;

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
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoooOo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29661OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f105174OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Integer> f105175OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f105176OooO0OO;

    public C29661OooOoo0(Context context, View.OnClickListener onClickListener) {
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_edit), Integer.valueOf(R.id.item_delete));
        this.f105175OooO0O0 = listOooOO0o;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_comment_more, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f105174OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        List<Integer> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(onClickListener);
            arrayList.add(viewFindViewById);
        }
        this.f105176OooO0OO = arrayList;
    }

    public final void OooO00o(View view) {
        PopupWindow popupWindow = this.f105174OooO00o;
        View contentView = popupWindow.getContentView();
        int width = popupWindow.getWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
        int height = popupWindow.getHeight();
        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
        int i = -(o000000O.OooO0o(10) + contentView.getMeasuredWidth());
        if (view.getId() != R.id.btn_more) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            popupWindow.showAtLocation(view, 0, rect.left + i, rect.centerY());
        } else {
            Rect rect2 = new Rect();
            Object parent = view.getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).getGlobalVisibleRect(rect2);
            popupWindow.showAtLocation(view, 0, rect2.left + i, rect2.bottom - o000000O.OooO0o(106));
        }
    }
}
