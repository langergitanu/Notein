package o0o00oOo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.orion.notein.global.R;
import java.util.concurrent.atomic.AtomicBoolean;
import o0Oo0o00.ViewOnClickListenerC28147OooO;

/* JADX INFO: renamed from: o0o00oOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30029OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f106736OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f106737OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28147OooO f106738OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f106739OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f106740OooO0Oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TextView f106741OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TextView f106742OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f106743OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f106744OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f106745OooOO0;

    public C30029OooO00o(Context context, ViewOnClickListenerC28147OooO viewOnClickListenerC28147OooO) {
        this.f106737OooO00o = context;
        this.f106738OooO0O0 = viewOnClickListenerC28147OooO;
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f106739OooO0OO;
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
        Context context = this.f106737OooO00o;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_fab, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, context.getResources().getDimensionPixelSize(R.dimen.note_creation_fab_popup_window_width), -2, false);
        this.f106739OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f106739OooO0OO;
        if (popupWindow2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        View viewFindViewById = viewInflate.findViewById(R.id.create_note);
        ViewOnClickListenerC28147OooO viewOnClickListenerC28147OooO = this.f106738OooO0O0;
        viewFindViewById.setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.create_unbounded_note).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.import_pdf).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.import_img).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.import_from_camera).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.create_folder).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.import_ppt).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.import_doc).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.import_epub).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.open_ai_ocr).setOnClickListener(viewOnClickListenerC28147OooO);
        viewInflate.findViewById(R.id.import_xls).setOnClickListener(viewOnClickListenerC28147OooO);
        this.f106742OooO0o0 = (TextView) viewInflate.findViewById(R.id.create_unbounded_note_label);
        this.f106741OooO0o = (TextView) viewInflate.findViewById(R.id.import_ppt_label);
        this.f106743OooO0oO = (TextView) viewInflate.findViewById(R.id.import_doc_label);
        this.f106744OooO0oo = (TextView) viewInflate.findViewById(R.id.import_epub_label);
        this.f106736OooO = (TextView) viewInflate.findViewById(R.id.import_caj_label);
        this.f106745OooOO0 = (TextView) viewInflate.findViewById(R.id.import_xls_label);
    }
}
