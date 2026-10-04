package o0o00oOo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import o0o00oOo.C30032OooO0Oo;

/* JADX INFO: renamed from: o0o00oOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30033OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f106760OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteListContainerFragment.OooOOOO f106761OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f106762OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C30032OooO0Oo f106763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f106764OooO0o0;

    /* JADX INFO: renamed from: o0o00oOo.OooO0o$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }
    }

    public C30033OooO0o(Context context, NoteListContainerFragment.OooOOOO oooOOOO) {
        this.f106760OooO00o = context;
        this.f106761OooO0O0 = oooOOOO;
        C30032OooO0Oo c30032OooO0Oo = new C30032OooO0Oo(new C30032OooO0Oo.OooO00o());
        c30032OooO0Oo.f106755OooO0O0 = null;
        this.f106763OooO0Oo = c30032OooO0Oo;
        this.f106764OooO0o0 = new AtomicBoolean(false);
    }

    public static void OooO0OO(C30033OooO0o c30033OooO0o, View view) {
        synchronized (c30033OooO0o) {
            try {
                if (c30033OooO0o.f106764OooO0o0.compareAndSet(false, true)) {
                    c30033OooO0o.OooO0O0();
                }
                PopupWindow popupWindow = c30033OooO0o.f106762OooO0OO;
                if (popupWindow == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow.showAsDropDown(view, Oooo0.o000000O.OooO0o(54), 0, GravityCompat.END);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void OooO00o() {
        PopupWindow popupWindow = this.f106762OooO0OO;
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
        OooO00o oooO00o = new OooO00o();
        C30032OooO0Oo c30032OooO0Oo = this.f106763OooO0Oo;
        c30032OooO0Oo.f106755OooO0O0 = oooO00o;
        Object systemService = this.f106760OooO00o.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_note_list_label_filter, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.label_color_list);
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("labelColorList");
            throw null;
        }
        recyclerView.setAdapter(c30032OooO0Oo);
        PopupWindow popupWindow = new PopupWindow(viewInflate, Oooo0.o000000O.OooO0o(132), -2, false);
        this.f106762OooO0OO = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f106762OooO0OO;
        if (popupWindow2 != null) {
            popupWindow2.setElevation(10.0f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
    }
}
