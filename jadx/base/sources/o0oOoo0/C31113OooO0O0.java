package o0oOoo0;

import Oooo0.C20855OooooOO;
import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOoo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31113OooO0O0 extends PopupWindow {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f111021OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TextView f111022OooO0O0;

    public C31113OooO0O0(Context context) {
        super(context);
        setWidth(o000000O.OooO0o(context.getResources().getConfiguration().screenWidthDp) - o000000O.OooO0o(32));
        setHeight(-2);
        setContentView(LayoutInflater.from(context).inflate(R.layout.popup_top_tip_layout, (ViewGroup) null));
        setBackgroundDrawable(null);
        this.f111022OooO0O0 = (TextView) getContentView().findViewById(R.id.tv_tip);
        this.f111021OooO00o = (TextView) getContentView().findViewById(R.id.tv_title);
        setFocusable(true);
        setOutsideTouchable(true);
        setElevation(10.0f);
    }

    public final void OooO00o(View anchorView, String str, String str2) {
        OooOOO0.OooO0oO(anchorView, "anchorView");
        int[] iArr = new int[2];
        anchorView.getLocationOnScreen(iArr);
        int iOooO0o = iArr[0];
        int iOooO0o2 = iArr[1];
        C34406OooO00o.f123390OooO00o.OooO00o(C20855OooooOO.OooO0OO(iOooO0o, iOooO0o2, "x: ", ", y: "), new Object[0]);
        if (iOooO0o == 0) {
            iOooO0o = o000000O.OooO0o(16);
        }
        if (iOooO0o2 == 0) {
            iOooO0o2 = o000000O.OooO0o(24);
        }
        this.f111022OooO0O0.setText(str2);
        this.f111021OooO00o.setText(str);
        showAtLocation(anchorView, 0, iOooO0o, iOooO0o2);
    }
}
