package o0o00oOo;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o00oOo.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30082o00000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107054OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View.OnClickListener f107055OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View f107056OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public PopupWindow f107058OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f107059OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Integer> f107057OooO0Oo = com.facebook.soloader.OooOo.OooO0oO(Integer.valueOf(R.id.item_delete));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f107060OooO0oO = new AtomicBoolean(false);

    public C30082o00000Oo(Context context, View.OnClickListener onClickListener) {
        this.f107054OooO00o = context;
        this.f107055OooO0O0 = onClickListener;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f107058OooO0o;
        if (popupWindow == null) {
            return;
        }
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }

    public final void OooO0O0() {
        Object systemService = this.f107054OooO00o.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_note_placeholder_more, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, Oooo0.o000000O.OooO0o(180), -2, false);
        this.f107058OooO0o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f107058OooO0o;
        if (popupWindow2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        List<Integer> list = this.f107057OooO0Oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(this.f107055OooO0O0);
            arrayList.add(viewFindViewById);
        }
        this.f107059OooO0o0 = arrayList;
    }

    public final synchronized boolean OooO0OO() {
        PopupWindow popupWindow = this.f107058OooO0o;
        if (popupWindow == null) {
            return false;
        }
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
        throw null;
    }

    public final synchronized void OooO0Oo(View view, NoteVO noteVO) {
        try {
            if (this.f107060OooO0oO.compareAndSet(false, true)) {
                OooO0O0();
            }
            ArrayList arrayList = this.f107059OooO0o0;
            if (arrayList == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("menuItemBtnList");
                throw null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setTag(noteVO);
            }
            this.f107056OooO0OO = view;
            if (view.getId() == R.id.more) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                view.getGlobalVisibleRect(rect2);
                PopupWindow popupWindow = this.f107058OooO0o;
                if (popupWindow == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow.showAtLocation(view, 0, rect.left - Oooo0.o000000O.OooO0o(80), rect2.bottom);
            } else {
                Rect rect3 = new Rect();
                view.getGlobalVisibleRect(rect3);
                PopupWindow popupWindow2 = this.f107058OooO0o;
                if (popupWindow2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow2.showAtLocation(view, 0, rect3.centerX(), rect3.centerY());
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
