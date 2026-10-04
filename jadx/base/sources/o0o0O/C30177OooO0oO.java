package o0o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;
import o0o0OoO0.C30673OooO0O0;
import o0oOoOo.C31084OooooOO;
import oO0OO.C32880OooO0o0;
import oO0OO.OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30177OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107425OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28958o00oOo0o f107426OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f107427OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C30673OooO0O0 f107428OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO0OO.OooO0o f107430OooO0o0 = new oO0OO.OooO0o(OooO0o.OooO00o.f117995OooO00o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32880OooO0o0 f107429OooO0o = new C32880OooO0o0(C32880OooO0o0.OooO00o.f117999OooO00o);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f107431OooO0oO = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<C31084OooooOO> f107432OooO0oo = C34429OooOOo0.OooOO0o(new C31084OooooOO(Color.parseColor("#000000"), false, true), new C31084OooooOO(Color.parseColor("#AEAEAE"), false, true), new C31084OooooOO(Color.parseColor("#CA0027"), false, true), new C31084OooooOO(Color.parseColor("#FA6400"), false, true), new C31084OooooOO(Color.parseColor("#F7B500"), false, true), new C31084OooooOO(Color.parseColor("#44D7B6"), false, true), new C31084OooooOO(Color.parseColor("#333386"), false, true), new C31084OooooOO(Color.parseColor("#0091FF"), false, true), new C31084OooooOO(Color.parseColor("#3F52FF"), false, true), new C31084OooooOO(Color.parseColor("#854F4F"), false, true), new C31084OooooOO(Color.parseColor("#CBB4A2"), false, true), new C31084OooooOO(Color.parseColor("#FF99AD"), false, true));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<C31084OooooOO> f107424OooO = C34429OooOOo0.OooOO0o(new C31084OooooOO(0, false, false), new C31084OooooOO(Color.parseColor("#FFFFFFCC"), false, false), new C31084OooooOO(Color.parseColor("#FFE5F4BA"), false, false), new C31084OooooOO(Color.parseColor("#FFDFEDFB"), false, false), new C31084OooooOO(Color.parseColor("#FFF1D2F2"), false, false), new C31084OooooOO(Color.parseColor("#FFFFB9B9"), false, false), new C31084OooooOO(Color.parseColor("#FFE8E9EB"), false, false), new C31084OooooOO(Color.parseColor("#FFFEFCA4"), false, false), new C31084OooooOO(Color.parseColor("#FF92D4C1"), false, false), new C31084OooooOO(Color.parseColor("#FF99BAF6"), false, false), new C31084OooooOO(Color.parseColor("#FFF69CC5"), false, false), new C31084OooooOO(Color.parseColor("#FFED7372"), false, false));

    public C30177OooO0oO(Context context, ViewOnClickListenerC28958o00oOo0o viewOnClickListenerC28958o00oOo0o) {
        this.f107425OooO00o = context;
        this.f107426OooO0O0 = viewOnClickListenerC28958o00oOo0o;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f107427OooO0OO;
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
        Object systemService = this.f107425OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_text_color_menu, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(220), -2, false);
        this.f107427OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.f107427OooO0OO;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_foreground_color);
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvForegroundColor");
            throw null;
        }
        oO0OO.OooO0o oooO0o = this.f107430OooO0o0;
        recyclerView.setAdapter(oooO0o);
        ViewOnClickListenerC28958o00oOo0o viewOnClickListenerC28958o00oOo0o = this.f107426OooO0O0;
        oooO0o.f117994OooO0O0 = viewOnClickListenerC28958o00oOo0o;
        RecyclerView recyclerView2 = (RecyclerView) viewInflate.findViewById(R.id.rv_background_color);
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("rvBackgroundColor");
            throw null;
        }
        C32880OooO0o0 c32880OooO0o0 = this.f107429OooO0o;
        recyclerView2.setAdapter(c32880OooO0o0);
        c32880OooO0o0.f117998OooO0O0 = viewOnClickListenerC28958o00oOo0o;
        PopupWindow popupWindow3 = this.f107427OooO0OO;
        if (popupWindow3 != null) {
            popupWindow3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o0O.OooO0o
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C30673OooO0O0 c30673OooO0O0 = this.f107416OooOo0o.f107428OooO0Oo;
                    if (c30673OooO0O0 != null) {
                        c30673OooO0O0.onDismiss();
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
        Object obj = newStyles.get(12);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : ViewCompat.MEASURED_STATE_MASK;
        Object obj2 = newStyles.get(16);
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List<C31084OooooOO> list = this.f107432OooO0oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            C31084OooooOO c31084OooooOO = (C31084OooooOO) it.next();
            int i = c31084OooooOO.f110939OooO00o;
            if (i != iIntValue) {
                z = false;
            }
            arrayList.add(new C31084OooooOO(i, z, c31084OooooOO.f110941OooO0OO));
        }
        List<C31084OooooOO> list2 = this.f107424OooO;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (C31084OooooOO c31084OooooOO2 : list2) {
            int i2 = c31084OooooOO2.f110939OooO00o;
            arrayList2.add(new C31084OooooOO(i2, i2 == iIntValue2, c31084OooooOO2.f110941OooO0OO));
        }
        this.f107430OooO0o0.OooO0Oo(arrayList);
        this.f107429OooO0o.OooO0Oo(arrayList2);
    }
}
