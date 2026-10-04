package o0o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0o0O0.ViewOnClickListenerC30181OooO0o0;
import o0o0OoO0.C30674OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30176OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107417OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC30181OooO0o0 f107418OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f107419OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C30674OooO0OO f107420OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f107421OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<Integer> f107422OooO0o0 = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_align_left), Integer.valueOf(R.id.item_align_center), Integer.valueOf(R.id.item_align_right));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f107423OooO0oO = new AtomicBoolean(false);

    public C30176OooO0o0(Context context, ViewOnClickListenerC30181OooO0o0 viewOnClickListenerC30181OooO0o0) {
        this.f107417OooO00o = context;
        this.f107418OooO0O0 = viewOnClickListenerC30181OooO0o0;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f107419OooO0OO;
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
        Object systemService = this.f107417OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_text_style_alignment_menu, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f107419OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.f107419OooO0OO;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        List<Integer> list = this.f107422OooO0o0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(this.f107418OooO0O0);
            arrayList.add(viewFindViewById);
        }
        this.f107421OooO0o = arrayList;
        PopupWindow popupWindow3 = this.f107419OooO0OO;
        if (popupWindow3 != null) {
            popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o0O.OooO0Oo
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C30674OooO0OO c30674OooO0OO = this.f107415OooOo0o.f107420OooO0Oo;
                    if (c30674OooO0OO != null) {
                        c30674OooO0OO.onDismiss();
                    }
                }
            });
        } else {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }

    public final void OooO0OO(Map<Integer, ? extends Object> newStyles) {
        OooOOO0.OooO0oO(newStyles, "newStyles");
        if (this.f107423OooO0oO.compareAndSet(false, true)) {
            OooO0O0();
        }
        ArrayList<View> arrayList = this.f107421OooO0o;
        if (arrayList == null) {
            OooOOO0.OooOOOO("menuItemBtnList");
            throw null;
        }
        for (View view : arrayList) {
            switch (view.getId()) {
                case R.id.item_align_center /* 2131297852 */:
                    view.setActivated(OooOOO0.OooO0O0(newStyles.get(8), Boolean.TRUE));
                    break;
                case R.id.item_align_left /* 2131297853 */:
                    view.setActivated(OooOOO0.OooO0O0(newStyles.get(7), Boolean.TRUE));
                    break;
                case R.id.item_align_right /* 2131297854 */:
                    view.setActivated(OooOOO0.OooO0O0(newStyles.get(9), Boolean.TRUE));
                    break;
            }
            if (view.isActivated()) {
                TextViewCompat.setCompoundDrawableTintList((TextView) view, this.f107417OooO00o.getColorStateList(R.color.text_style_activated));
            } else {
                TextViewCompat.setCompoundDrawableTintList((TextView) view, null);
            }
        }
    }
}
