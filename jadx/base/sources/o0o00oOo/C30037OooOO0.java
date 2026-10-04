package o0o00oOo;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.orion.notein.global.R;
import java.util.concurrent.atomic.AtomicBoolean;
import o0oOoOo.C31051OooOo0O;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o0o00oOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30037OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f106797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PopupWindow f106798OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TextView f106799OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextView f106800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TextView f106801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TextView f106802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f106803OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C32447OooOOo f106804OooO0oo = C20519OooO0Oo.OooO0OO(new C30028OooO());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicBoolean f106796OooO = new AtomicBoolean(false);

    public C30037OooOO0(Context context) {
        this.f106797OooO00o = context;
    }

    public final void OooO00o(C31051OooOo0O c31051OooOo0O) {
        TextView textView = this.f106799OooO0OO;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvType");
            throw null;
        }
        Context context = this.f106797OooO00o;
        textView.setText(c31051OooOo0O.f110860OooO0O0 ? context.getString(R.string.note_list_tabs_pdf) : c31051OooOo0O.f110861OooO0OO ? context.getString(R.string.note_list_tabs_folder) : context.getString(R.string.note_list_tabs_note));
        TextView textView2 = this.f106800OooO0Oo;
        if (textView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvSize");
            throw null;
        }
        textView2.setText(C31430OooO00o.OooO0OO(c31051OooOo0O.f110863OooO0o));
        TextView textView3 = this.f106802OooO0o0;
        if (textView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvCreationTime");
            throw null;
        }
        textView3.setText(c31051OooOo0O.f110866OooO0oo);
        TextView textView4 = this.f106801OooO0o;
        if (textView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvLastModificationTime");
            throw null;
        }
        textView4.setText(c31051OooOo0O.f110858OooO);
        if (c31051OooOo0O.f110865OooO0oO == 0) {
            TextView textView5 = this.f106803OooO0oO;
            if (textView5 != null) {
                textView5.setText(context.getString(R.string.note_no_sync));
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("tvSyncTime");
                throw null;
            }
        }
        TextView textView6 = this.f106803OooO0oO;
        if (textView6 != null) {
            textView6.setText(c31051OooOo0O.f110867OooOO0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvSyncTime");
            throw null;
        }
    }

    public final void OooO0O0() {
        Object systemService = this.f106797OooO00o.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_note_info, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        this.f106799OooO0OO = (TextView) viewInflate.findViewById(R.id.tv_type_info);
        this.f106800OooO0Oo = (TextView) viewInflate.findViewById(R.id.tv_size_info);
        this.f106802OooO0o0 = (TextView) viewInflate.findViewById(R.id.tv_creation_time_info);
        this.f106801OooO0o = (TextView) viewInflate.findViewById(R.id.tv_modification_time_info);
        this.f106803OooO0oO = (TextView) viewInflate.findViewById(R.id.tv_sync_time_info);
        PopupWindow popupWindow = new PopupWindow(viewInflate, ((Number) this.f106804OooO0oo.getValue()).intValue(), -2, false);
        this.f106798OooO0O0 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f106798OooO0O0;
        if (popupWindow2 != null) {
            popupWindow2.setElevation(10.0f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }
}
