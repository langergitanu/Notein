package o0O0oO0o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.ArrayList;
import o0O0oOO0.C26116OooO0Oo;

/* JADX INFO: renamed from: o0O0oO0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26103OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f89117OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f89118OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0oO.OooO0OO f89119OooO0OO;

    /* JADX INFO: renamed from: o0O0oO0o.OooOOo0$OooO00o */
    public class OooO00o extends OooOOO.AbstractC22036OooO0o0<C26116OooO0Oo> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C26116OooO0Oo c26116OooO0Oo, C26116OooO0Oo c26116OooO0Oo2) {
            C26116OooO0Oo c26116OooO0Oo3 = c26116OooO0Oo;
            C26116OooO0Oo c26116OooO0Oo4 = c26116OooO0Oo2;
            return Math.abs(c26116OooO0Oo3.f89156OooO0O0 - c26116OooO0Oo4.f89156OooO0O0) < 0.001f && c26116OooO0Oo3.f89157OooO0OO == c26116OooO0Oo4.f89157OooO0OO;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C26116OooO0Oo c26116OooO0Oo, C26116OooO0Oo c26116OooO0Oo2) {
            C26116OooO0Oo c26116OooO0Oo3 = c26116OooO0Oo;
            C26116OooO0Oo c26116OooO0Oo4 = c26116OooO0Oo2;
            return Math.abs(c26116OooO0Oo3.f89155OooO00o - c26116OooO0Oo4.f89155OooO00o) < 0.001f && c26116OooO0Oo3.f89157OooO0OO == c26116OooO0Oo4.f89157OooO0OO;
        }
    }

    public C26103OooOOo0(Context context, C26098OooO0oO c26098OooO0oO) {
        OooO00o oooO00o = new OooO00o();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.popup_favorite_zoom, (ViewGroup) null);
        this.f89118OooO0O0 = viewInflate.findViewById(R.id.tv_empty);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_zoom);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        o0O0oO.OooO0OO oooO0OO = new o0O0oO.OooO0OO(oooO00o);
        this.f89119OooO0OO = oooO0OO;
        oooO0OO.f89081OooO0O0 = new OooOOOO(c26098OooO0oO);
        recyclerView.setAdapter(oooO0OO);
        PopupWindow popupWindow = new PopupWindow(viewInflate, (int) (Resources.getSystem().getDisplayMetrics().density * 140.0f), -2, false);
        this.f89117OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        if (Build.VERSION.SDK_INT >= 29) {
            popupWindow.setIsLaidOutInScreen(true);
        }
        popupWindow.setElevation(10.0f);
        popupWindow.setOnDismissListener(new C26101OooOOOo(c26098OooO0oO));
    }

    public final void OooO00o(ArrayList arrayList) {
        boolean zIsEmpty = arrayList.isEmpty();
        View view = this.f89118OooO0O0;
        if (zIsEmpty) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
        this.f89119OooO0OO.OooO0Oo(arrayList);
    }
}
