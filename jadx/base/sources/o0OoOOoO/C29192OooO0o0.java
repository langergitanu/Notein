package o0OoOOoO;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0Oo0oOo.ViewOnClickListenerC28314OooOO0;
import o0Oo0oOo.ViewOnClickListenerC28316OooOO0o;
import o0Oo0oOo.ViewOnClickListenerC28318OooOOO0;
import o0OoOOoO.C29193OooO0oO;
import o0o000oo.C29810OooOO0O;
import o0oOOooO.C30886OooO0oO;

/* JADX INFO: renamed from: o0OoOOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29192OooO0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final View f103525OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f103526OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O000o.OooO0O0 f103527OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C29810OooOO0O f103528OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PopupWindow f103529OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ImageView f103530OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C29193OooO0oO f103531OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TextView f103532OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TextView f103533OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C30886OooO0oO f103534OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final TextView f103535OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TextView f103536OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f103537OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f103538OooOOO0;

    public C29192OooO0o0(Context context, o0O000o.OooO0O0 oooO0O0, C29810OooOO0O c29810OooOO0O) {
        this.f103526OooO00o = context;
        this.f103527OooO0O0 = oooO0O0;
        this.f103528OooO0OO = c29810OooOO0O;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.note_editor_add_sticker_popup_window_width);
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_editor_add_sticker, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_stickers);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
        C29193OooO0oO c29193OooO0oO = new C29193OooO0oO(C29193OooO0oO.OooO0O0.f103541OooO00o);
        this.f103531OooO0o0 = c29193OooO0oO;
        c29193OooO0oO.f103540OooO0O0 = new ViewOnClickListenerC28305OooO(this, 1);
        recyclerView.setAdapter(c29193OooO0oO);
        View viewFindViewById = viewInflate.findViewById(R.id.cl_sticker_set_list);
        this.f103525OooO = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28314OooOO0(this, 1));
        this.f103536OooOO0o = (TextView) viewInflate.findViewById(R.id.tv_no_sticker);
        RecyclerView recyclerView2 = (RecyclerView) viewInflate.findViewById(R.id.rv_sticker_set_list);
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        C30886OooO0oO c30886OooO0oO = new C30886OooO0oO(Integer.valueOf(o000000O.OooO0o(38)), Integer.valueOf(o000000O.OooO0o(2)), false);
        this.f103534OooOO0 = c30886OooO0oO;
        recyclerView2.setAdapter(c30886OooO0oO);
        c30886OooO0oO.f110370OooO0o0 = new ViewOnClickListenerC29187OooO00o(this, 0);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_select_stickers);
        textView.setOnClickListener(new ViewOnClickListenerC28316OooOO0o(this, 1));
        this.f103535OooOO0O = textView;
        viewInflate.findViewById(R.id.cl_sticker_set_name).setOnClickListener(new ViewOnClickListenerC28318OooOOO0(this, 3));
        this.f103530OooO0o = (ImageView) viewInflate.findViewById(R.id.iv_sticker_set_edit);
        this.f103532OooO0oO = (TextView) viewInflate.findViewById(R.id.tv_sticker_set_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_multi_select);
        textView2.setOnClickListener(new ViewOnClickListenerC29188OooO0O0(this, 0));
        this.f103533OooO0oo = textView2;
        PopupWindow popupWindow = new PopupWindow(viewInflate, dimensionPixelSize, -2, false);
        this.f103529OooO0Oo = popupWindow;
        popupWindow.setElevation(10.0f);
        viewInflate.findViewById(R.id.iv_close).setOnClickListener(new ViewOnClickListenerC29189OooO0OO(this, 0));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0OoOOoO.OooO0Oo
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C29192OooO0o0 c29192OooO0o0 = this.f103524OooOo0o;
                c29192OooO0o0.f103538OooOOO0 = jCurrentTimeMillis;
                c29192OooO0o0.f103528OooO0OO.onDismiss();
            }
        });
    }
}
