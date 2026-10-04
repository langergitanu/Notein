package o0OoO0oO;

import Oooo.C20811OooO00o;
import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import com.orion.notein.global.R;
import o000oooO.C24755OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28158OooOO0o;

/* JADX INFO: renamed from: o0OoO0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28674OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f101606OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SeekBar f101607OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TextView f101608OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SeekBar f101609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f101610OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TextView f101611OooO0o0;

    public C28674OooO0OO(Context context, C20811OooO00o c20811OooO00o, C24755OooO00o c24755OooO00o) {
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_creation_paper_theme, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_interval_value);
        this.f101608OooO0OO = textView;
        textView.setText(PublicApiId.SINGLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_SCOPES_AUTHORITY);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_opacity_value);
        this.f101611OooO0o0 = textView2;
        textView2.setText("100%");
        SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.interval_seekbar);
        this.f101607OooO0O0 = seekBar;
        seekBar.setProgress(25);
        SeekBar seekBar2 = (SeekBar) viewInflate.findViewById(R.id.opacity_seekbar);
        this.f101609OooO0Oo = seekBar2;
        seekBar2.setProgress(100);
        View viewFindViewById = viewInflate.findViewById(R.id.cl_add_to_my_templates);
        this.f101610OooO0o = viewFindViewById;
        C28050OooO0OO.OooO00o(viewFindViewById, 1500L, new ViewOnClickListenerC28158OooOO0o(c24755OooO00o, 1));
        seekBar.setOnSeekBarChangeListener(new C28672OooO00o(this, c20811OooO00o));
        seekBar2.setOnSeekBarChangeListener(new C28673OooO0O0(this, c20811OooO00o));
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(220), -2, false);
        this.f101606OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }
}
