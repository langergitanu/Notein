package com.orion.notein.p607ui.noteeditor.addtext.textstylebox;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26053OoooOoO;
import o0OoOOOo.InterfaceC29093OooO00o;
import o0OoOOo0.C29186OooO0o0;
import o0oOoOo.C31086Oooooo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements InterfaceC29093OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f74109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C29186OooO0o0 f74110OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f74111OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f74105OooO0Oo = o000000O.OooO0o(180);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f74107OooO0o0 = o000000O.OooO0o(240);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int f74106OooO0o = o000000O.OooO0o(50);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final List<C31086Oooooo> f74108OooO0oO = C34429OooOOo0.OooOO0o(new C31086Oooooo(1.0f, true), new C31086Oooooo(1.2f, false), new C31086Oooooo(1.5f, false), new C31086Oooooo(2.0f, false), new C31086Oooooo(2.5f, false));

    public interface OooO00o {
        void OooO00o(int i);

        void OooO0O0(float f);
    }

    public OooO0OO(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_textstyle_text_line_height, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, f74105OooO0Oo, f74107OooO0o0, true);
        this.f74109OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0OoOOOo.OooOOoo
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                OooO0OO.OooO00o oooO00o = this.f103174OooOo0o.f74111OooO0OO;
                if (oooO00o != null) {
                    oooO00o.OooO00o(8);
                }
            }
        });
        C29186OooO0o0 c29186OooO0o0 = new C29186OooO0o0(C29186OooO0o0.OooO00o.f103515OooO00o);
        this.f74110OooO0O0 = c29186OooO0o0;
        c29186OooO0o0.f103514OooO0O0 = new ViewOnClickListenerC26053OoooOoO(this, 3);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_line_height);
        recyclerView.setAdapter(c29186OooO0o0);
        recyclerView.setOverScrollMode(2);
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final boolean OooO00o() {
        return this.f74109OooO00o.isShowing();
    }

    public final void OooO0O0(float f, boolean z) {
        Iterable iterable;
        OooO00o oooO00o;
        C29186OooO0o0 c29186OooO0o0 = this.f74110OooO0O0;
        if (c29186OooO0o0.getItemCount() == 0) {
            iterable = f74108OooO0oO;
        } else {
            iterable = c29186OooO0o0.f66021OooO00o.f65811OooO0o;
            OooOOO0.OooO0Oo(iterable);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            float f2 = ((C31086Oooooo) it.next()).f110944OooO00o;
            arrayList.add(new C31086Oooooo(f2, f2 == f));
        }
        c29186OooO0o0.OooO0Oo(arrayList);
        if (!z || (oooO00o = this.f74111OooO0OO) == null) {
            return;
        }
        oooO00o.OooO0O0(f);
    }

    @Override // o0OoOOOo.InterfaceC29093OooO00o
    public final void dismiss() {
        this.f74109OooO00o.dismiss();
    }
}
