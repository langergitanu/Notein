package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.core.view.GravityCompat;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOOO0 f62680OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f62681OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f62682OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f62683OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f62684OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f62686OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f62687OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOOO.OooO00o f62688OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO00o f62689OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f62685OooO0o = GravityCompat.START;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO00o f62690OooOO0O = new OooO00o();

    public class OooO00o implements PopupWindow.OnDismissListener {
        public OooO00o() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            OooOOO.this.OooO0OO();
        }
    }

    public OooOOO(int i, Context context, View view, OooO oooO, boolean z) {
        this.f62681OooO00o = context;
        this.f62682OooO0O0 = oooO;
        this.f62686OooO0o0 = view;
        this.f62683OooO0OO = z;
        this.f62684OooO0Oo = i;
    }

    public final OooOOO0 OooO00o() {
        OooOOO0 viewOnKeyListenerC21515OooOOoo;
        if (this.f62680OooO == null) {
            Context context = this.f62681OooO00o;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC21515OooOOoo = new ViewOnKeyListenerC21506OooO0o0(context, this.f62686OooO0o0, this.f62684OooO0Oo, this.f62683OooO0OO);
            } else {
                View view = this.f62686OooO0o0;
                Context context2 = this.f62681OooO00o;
                boolean z = this.f62683OooO0OO;
                viewOnKeyListenerC21515OooOOoo = new ViewOnKeyListenerC21515OooOOoo(this.f62684OooO0Oo, context2, view, this.f62682OooO0O0, z);
            }
            viewOnKeyListenerC21515OooOOoo.OooO0O0(this.f62682OooO0O0);
            viewOnKeyListenerC21515OooOOoo.OooO(this.f62690OooOO0O);
            viewOnKeyListenerC21515OooOOoo.OooO0Oo(this.f62686OooO0o0);
            viewOnKeyListenerC21515OooOOoo.setCallback(this.f62688OooO0oo);
            viewOnKeyListenerC21515OooOOoo.OooO0o0(this.f62687OooO0oO);
            viewOnKeyListenerC21515OooOOoo.OooO0oO(this.f62685OooO0o);
            this.f62680OooO = viewOnKeyListenerC21515OooOOoo;
        }
        return this.f62680OooO;
    }

    public final boolean OooO0O0() {
        OooOOO0 oooOOO0 = this.f62680OooO;
        return oooOOO0 != null && oooOOO0.OooO00o();
    }

    public void OooO0OO() {
        this.f62680OooO = null;
        OooO00o oooO00o = this.f62689OooOO0;
        if (oooO00o != null) {
            oooO00o.onDismiss();
        }
    }

    public final void OooO0Oo(int i, int i2, boolean z, boolean z2) {
        OooOOO0 oooOOO0OooO00o = OooO00o();
        oooOOO0OooO00o.OooOO0(z2);
        if (z) {
            if ((GravityCompat.getAbsoluteGravity(this.f62685OooO0o, this.f62686OooO0o0.getLayoutDirection()) & 7) == 5) {
                i -= this.f62686OooO0o0.getWidth();
            }
            oooOOO0OooO00o.OooO0oo(i);
            oooOOO0OooO00o.OooOO0O(i2);
            int i3 = (int) ((this.f62681OooO00o.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            oooOOO0OooO00o.f62692OooOo0o = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        oooOOO0OooO00o.show();
    }
}
