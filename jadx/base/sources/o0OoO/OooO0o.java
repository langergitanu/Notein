package o0OoO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import o0O0oooO.ViewOnClickListenerC26302OoooOoo;
import o0Oo0o0o.ViewOnClickListenerC28223OooO;
import o0Oo0o0o.ViewOnClickListenerC28224OooO00o;
import o0Oo0o0o.ViewOnClickListenerC28232OooOO0;
import o0OoO.C28504OooO0oo;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;
import o0o000oo.C29809OooOO0;
import o0o000oo.C29817OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final View f101030OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C29817OooOOo0 f101031OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C29809OooOO0 f101032OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PopupWindow f101033OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f101034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f101035OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final View f101036OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TextView f101037OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final View f101038OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final View f101039OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C28504OooO0oo f101040OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TextView f101041OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ViewOnClickListenerC29034OooO00o f101042OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f101043OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f101044OooOOOO;

    public OooO0o(Context context, C29817OooOOo0 c29817OooOOo0, C29809OooOO0 c29809OooOO0) {
        this.f101031OooO00o = c29817OooOOo0;
        this.f101032OooO0O0 = c29809OooOO0;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.note_editor_add_image_popup_window_width);
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_editor_add_image, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        View viewFindViewById = viewInflate.findViewById(R.id.add_from_gallery);
        this.f101034OooO0Oo = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28224OooO00o(this, 1));
        View viewFindViewById2 = viewInflate.findViewById(R.id.iv_close);
        this.f101035OooO0o = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new OooO0O0(this, 0));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_multi_select);
        this.f101037OooO0oO = textView;
        textView.setOnClickListener(new ViewOnClickListenerC26302OoooOoo(this, 1));
        this.f101038OooO0oo = viewInflate.findViewById(R.id.cl_multi_select);
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_set_multi_selected_images);
        this.f101030OooO = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new OooO0OO(this, 0));
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_add_to_stickers);
        this.f101039OooOO0 = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new ViewOnClickListenerC28501OooO0Oo(this, 0));
        this.f101041OooOO0o = (TextView) viewInflate.findViewById(R.id.tv_no_latest_images);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_latest_image);
        C28504OooO0oo c28504OooO0oo = new C28504OooO0oo(C28504OooO0oo.OooO00o.f101049OooO00o);
        this.f101040OooOO0O = c28504OooO0oo;
        c28504OooO0oo.f101048OooO0O0 = new ViewOnClickListenerC28223OooO(this, 1);
        recyclerView.setAdapter(c28504OooO0oo);
        View viewFindViewById5 = viewInflate.findViewById(R.id.add_from_camera);
        this.f101036OooO0o0 = viewFindViewById5;
        viewFindViewById5.setOnClickListener(new ViewOnClickListenerC28232OooOO0(this, 1));
        PopupWindow popupWindow = new PopupWindow(viewInflate, dimensionPixelSize, -2, false);
        this.f101033OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        popupWindow.setOnDismissListener(new C28502OooO0o0(this, 0));
    }
}
