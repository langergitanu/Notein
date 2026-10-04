package o0Oo0ooO;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.drawerlayout.widget.DrawerLayout;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import java.util.Map;
import o0o0O.C30176OooO0o0;
import o0o0O0.ViewOnClickListenerC30181OooO0o0;
import o0o0OO0.C30394OooOOOO;
import o0o0OoO0.C30674OooO0OO;

/* JADX INFO: renamed from: o0Oo0ooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28412OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100714OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100715OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f100716OooOoO0;

    public /* synthetic */ ViewOnClickListenerC28412OooO0o0(int i, Object obj, Object obj2) {
        this.f100715OooOo0o = i;
        this.f100714OooOo = obj;
        this.f100716OooOoO0 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        switch (this.f100715OooOo0o) {
            case 0:
                C28410OooO0Oo c28410OooO0Oo = (C28410OooO0Oo) this.f100714OooOo;
                C28456OoooOoO c28456OoooOoO = (C28456OoooOoO) this.f100716OooOoO0;
                MainActivity.OooOOOO oooOOOO = c28410OooO0Oo.f100708OooO0O0;
                MainActivity mainActivity = MainActivity.this;
                DrawerLayout drawerLayout = mainActivity.drawerLayout;
                if (drawerLayout == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                    throw null;
                }
                drawerLayout.OooO00o(new com.orion.notein.OooO00o(mainActivity, oooOOOO.f69635OooO0O0, c28456OoooOoO));
                DrawerLayout drawerLayout2 = mainActivity.drawerLayout;
                if (drawerLayout2 != null) {
                    drawerLayout2.OooO0Oo(true);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("drawerLayout");
                    throw null;
                }
            default:
                AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) this.f100714OooOo;
                View view2 = (View) this.f100716OooOoO0;
                AiOcrEditorListContainer.OooO00o oooO00o = aiOcrEditorListContainer.eventListener;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                if (aiOcrEditorListContainer.f78442OoooO0 == null) {
                    ViewOnClickListenerC30181OooO0o0 viewOnClickListenerC30181OooO0o0 = new ViewOnClickListenerC30181OooO0o0(aiOcrEditorListContainer, 2);
                    Context context = aiOcrEditorListContainer.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                    C30176OooO0o0 c30176OooO0o0 = new C30176OooO0o0(context, viewOnClickListenerC30181OooO0o0);
                    aiOcrEditorListContainer.f78442OoooO0 = c30176OooO0o0;
                    c30176OooO0o0.f107420OooO0Oo = new C30674OooO0OO(aiOcrEditorListContainer);
                    C30394OooOOOO c30394OooOOOO = aiOcrEditorListContainer.f78422OooOo0o;
                    if (c30394OooOOOO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    c30176OooO0o0.OooO0OO((Map) c30394OooOOOO.f108520Oooo0.getValue());
                }
                C30176OooO0o0 c30176OooO0o02 = aiOcrEditorListContainer.f78442OoooO0;
                if (c30176OooO0o02 == null) {
                    z = false;
                } else {
                    PopupWindow popupWindow = c30176OooO0o02.f107419OooO0OO;
                    if (popupWindow == null ? false : popupWindow.isShowing()) {
                        z = true;
                    }
                }
                if (z) {
                    C30176OooO0o0 c30176OooO0o03 = aiOcrEditorListContainer.f78442OoooO0;
                    if (c30176OooO0o03 != null) {
                        c30176OooO0o03.OooO00o();
                        return;
                    }
                    return;
                }
                aiOcrEditorListContainer.OooO0OO();
                ImageView imageView = aiOcrEditorListContainer.f78426OooOoo;
                if (imageView == null) {
                    return;
                }
                C30176OooO0o0 c30176OooO0o04 = aiOcrEditorListContainer.f78442OoooO0;
                if (c30176OooO0o04 != null) {
                    synchronized (c30176OooO0o04) {
                        try {
                            if (c30176OooO0o04.f107423OooO0oO.compareAndSet(false, true)) {
                                c30176OooO0o04.OooO0O0();
                            }
                            Rect rect = new Rect();
                            imageView.getGlobalVisibleRect(rect);
                            PopupWindow popupWindow2 = c30176OooO0o04.f107419OooO0OO;
                            if (popupWindow2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                                throw null;
                            }
                            popupWindow2.showAtLocation(imageView, 0, rect.left - o000000O.OooO0o(4), rect.bottom + o000000O.OooO0o(10));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                view2.setActivated(true);
                return;
        }
    }
}
