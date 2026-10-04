package o0o00OO0;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.popup.insertfile.InsertFileBottomSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.ViewOnClickListenerC29819OooOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o00OO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29883OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ViewOnClickListenerC29819OooOo f106019OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InsertFileBottomSheetDialog f106020OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f106021OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f106022OooO0Oo;

    public C29883OooO0OO(final Context context, ViewOnClickListenerC29819OooOo viewOnClickListenerC29819OooOo) {
        this.f106019OooO00o = viewOnClickListenerC29819OooOo;
        this.f106021OooO0OO = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o00OO0.OooO00o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                Object systemService = context.getSystemService("layout_inflater");
                OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_insert_file, (ViewGroup) null);
                OooOOO0.OooO0o(viewInflate, "inflate(...)");
                PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(220), -2, false);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setElevation(10.0f);
                final C29883OooO0OO c29883OooO0OO = this;
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o00OO0.OooO0O0
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        c29883OooO0OO.f106022OooO0Oo = System.currentTimeMillis();
                    }
                });
                ViewOnClickListenerC29819OooOo viewOnClickListenerC29819OooOo2 = c29883OooO0OO.f106019OooO00o;
                List listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_image), Integer.valueOf(R.id.item_camera), Integer.valueOf(R.id.item_sticker), Integer.valueOf(R.id.item_audio));
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
                Iterator it = listOooOO0o.iterator();
                while (it.hasNext()) {
                    viewInflate.findViewById(((Number) it.next()).intValue()).setOnClickListener(viewOnClickListenerC29819OooOo2);
                    arrayList.add(C32460OooOooO.f116667OooO00o);
                }
                return popupWindow;
            }
        });
    }
}
