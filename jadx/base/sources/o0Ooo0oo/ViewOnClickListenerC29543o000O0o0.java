package o0Ooo0oo;

import Oooo0oO.C21030OooOO0o;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.pageeditor.PageOperationTipsDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import o0OoO000.ViewOnClickListenerC28534OooOOoo;
import o0o000Oo.C29774OooO0O0;
import o0o000o0.C29775OooO00o;
import o0oOoOo.C31088OoooooO;

/* JADX INFO: renamed from: o0Ooo0oo.o000O0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29543o000O0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104801OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104802OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29543o000O0o0(Object obj, int i) {
        this.f104802OooOo0o = i;
        this.f104801OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f104802OooOo0o) {
            case 0:
                ViewOnClickListenerC28534OooOOoo viewOnClickListenerC28534OooOOoo = ((C29544o000O0oO) this.f104801OooOo).f104803OooO0O0;
                if (viewOnClickListenerC28534OooOOoo != null) {
                    viewOnClickListenerC28534OooOOoo.onClick(view);
                    return;
                }
                return;
            case 1:
                if (((C29774OooO0O0) this.f104801OooOo).f105666OooO0O0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    return;
                }
                return;
            case 2:
                C21030OooOO0o.OooO0OO((PageOperationTipsDialogFragment) this.f104801OooOo).OooOOo0();
                return;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) this.f104801OooOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextRecognizeSessionVO");
                C31088OoooooO c31088OoooooO = (C31088OoooooO) tag;
                if (view.getId() != R.id.btn_more) {
                    textRecognizeFragment.OooOooo();
                    textRecognizeFragment.Oooo00O().OooOOO0(c31088OoooooO.f110954OooO00o);
                    return;
                }
                textRecognizeFragment.f78196Ooooooo = true;
                o0o0O.OooO0OO oooO0OO = textRecognizeFragment.f78192OooooOo;
                if (oooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sessionItemMoreMenu");
                    throw null;
                }
                PopupWindow popupWindow = oooO0OO.f107411OooO0OO;
                if (popupWindow == null ? false : popupWindow.isShowing()) {
                    o0o0O.OooO0OO oooO0OO2 = textRecognizeFragment.f78192OooooOo;
                    if (oooO0OO2 != null) {
                        oooO0OO2.OooO00o();
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("sessionItemMoreMenu");
                        throw null;
                    }
                }
                textRecognizeFragment.Oooo0o0();
                o0o0O.OooO0OO oooO0OO3 = textRecognizeFragment.f78192OooooOo;
                if (oooO0OO3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sessionItemMoreMenu");
                    throw null;
                }
                synchronized (oooO0OO3) {
                    try {
                        if (oooO0OO3.f107413OooO0o.compareAndSet(false, true)) {
                            oooO0OO3.OooO0O0();
                        }
                        ArrayList arrayList = oooO0OO3.f107414OooO0o0;
                        if (arrayList == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("menuItemBtnList");
                            throw null;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((View) it.next()).setTag(c31088OoooooO);
                        }
                        Rect rect = new Rect();
                        view.getGlobalVisibleRect(rect);
                        PopupWindow popupWindow2 = oooO0OO3.f107411OooO0OO;
                        if (popupWindow2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        popupWindow2.showAtLocation(view, 0, rect.right, rect.top);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC29543o000O0o0(C29774OooO0O0 c29774OooO0O0, C29775OooO00o c29775OooO00o) {
        this.f104802OooOo0o = 1;
        this.f104801OooOo = c29774OooO0O0;
    }
}
