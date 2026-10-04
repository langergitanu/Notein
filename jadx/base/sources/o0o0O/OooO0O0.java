package o0o0O;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.soloader.OooOo;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0OoOoo0.ViewOnClickListenerC29234OooOO0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View.OnClickListener f107404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f107405OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PopupWindow f107406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<Integer> f107408OooO0o0 = OooOo.OooO0oO(Integer.valueOf(R.id.btn_purchase_more));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f107407OooO0o = new AtomicBoolean(false);

    public OooO0O0(Context context, View.OnClickListener onClickListener, boolean z) {
        this.f107403OooO00o = context;
        this.f107404OooO0O0 = onClickListener;
        this.f107405OooO0OO = z;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f107406OooO0Oo;
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
        Object systemService = this.f107403OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_ai_quota_usage, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(250), -2, false);
        this.f107406OooO0Oo = popupWindow;
        popupWindow.setOutsideTouchable(this.f107405OooO0OO);
        PopupWindow popupWindow2 = this.f107406OooO0Oo;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        List<Integer> list = this.f107408OooO0o0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC29234OooOO0(this, 2));
            arrayList.add(viewFindViewById);
        }
    }

    public final synchronized void OooO0OO(View anchor, int i, int i2, boolean z, boolean z2) {
        int i3;
        try {
            OooOOO0.OooO0oO(anchor, "anchor");
            if (this.f107407OooO0o.compareAndSet(false, true)) {
                OooO0O0();
            }
            PopupWindow popupWindow = this.f107406OooO0Oo;
            if (popupWindow == null) {
                OooOOO0.OooOOOO("popupWindow");
                throw null;
            }
            ((TextView) popupWindow.getContentView().findViewById(R.id.btn_purchase_more)).setEnabled(!z);
            PopupWindow popupWindow2 = this.f107406OooO0Oo;
            if (popupWindow2 == null) {
                OooOOO0.OooOOOO("popupWindow");
                throw null;
            }
            TextView textView = (TextView) popupWindow2.getContentView().findViewById(R.id.tv_content_remaining_quota);
            PopupWindow popupWindow3 = this.f107406OooO0Oo;
            if (popupWindow3 == null) {
                OooOOO0.OooOOOO("popupWindow");
                throw null;
            }
            TextView textView2 = (TextView) popupWindow3.getContentView().findViewById(R.id.tv_content_total_quota);
            PopupWindow popupWindow4 = this.f107406OooO0Oo;
            if (popupWindow4 == null) {
                OooOOO0.OooOOOO("popupWindow");
                throw null;
            }
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) popupWindow4.getContentView().findViewById(R.id.sb_quota_usage);
            int i4 = i2 - i;
            int i5 = 100;
            if (i2 != 0 && (i3 = (int) ((i4 * 100.0f) / i2)) <= 100) {
                i5 = i3;
            }
            textView.setText(this.f107403OooO00o.getString(R.string.content_remaining_chars, Integer.valueOf(i), Integer.valueOf(100 - i5)));
            textView2.setText(this.f107403OooO00o.getString(R.string.content_total_chars, Integer.valueOf(i2)));
            linearProgressIndicator.setProgress(i5);
            Rect rect = new Rect();
            anchor.getGlobalVisibleRect(rect);
            if (z2) {
                PopupWindow popupWindow5 = this.f107406OooO0Oo;
                if (popupWindow5 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow5.showAtLocation(anchor, 0, rect.centerX() - o000000O.OooO0o(125), rect.bottom);
            } else {
                PopupWindow popupWindow6 = this.f107406OooO0Oo;
                if (popupWindow6 == null) {
                    OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow6.showAtLocation(anchor, 0, rect.right - o000000O.OooO0o(250), rect.bottom);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
