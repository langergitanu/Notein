package o0OoOO;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.popup.AddThemeBottomSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28985OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f102714OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28701OooOOo0 f102715OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AddThemeBottomSheetDialog f102716OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PopupWindow f102717OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f102718OooO0o0;

    public C28985OooO00o(Context context, ViewOnClickListenerC28701OooOOo0 viewOnClickListenerC28701OooOOo0) {
        this.f102714OooO00o = context;
        this.f102715OooO0O0 = viewOnClickListenerC28701OooOOo0;
    }

    public final void OooO00o() {
        Object systemService = this.f102714OooO00o.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_add_theme, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
        this.f102717OooO0Oo = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f102717OooO0Oo;
        if (popupWindow2 == null) {
            OooOOO0.OooOOOO("popupWindow");
            throw null;
        }
        popupWindow2.setElevation(10.0f);
        List listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_import_from_gallery), Integer.valueOf(R.id.item_import_from_camera), Integer.valueOf(R.id.item_import_from_pdf));
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        Iterator it = listOooOO0o.iterator();
        while (it.hasNext()) {
            View viewFindViewById = viewInflate.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(this.f102715OooO0O0);
            arrayList.add(viewFindViewById);
        }
        this.f102718OooO0o0 = true;
    }
}
