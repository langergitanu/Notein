package o0Oo0oOo;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23059Oooo0oO;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import java.util.Map;
import o0o000oO.ViewOnClickListenerC29781OooO0o;
import o0o0OO0.C30394OooOOOO;
import o0o0OoO0.C30675OooO0Oo;

/* JADX INFO: renamed from: o0Oo0oOo.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28369o00000oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100564OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f100565OooOoO0;

    public /* synthetic */ ViewOnClickListenerC28369o00000oO(int i, Object obj, Object obj2) {
        this.f100564OooOo0o = i;
        this.f100563OooOo = obj;
        this.f100565OooOoO0 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) throws Exception {
        boolean z;
        switch (this.f100564OooOo0o) {
            case 0:
                ((C23059Oooo0oO.OooO0O0) this.f100563OooOo).f71288OooO0O0.invoke((C23033OooOO0o.OooO00o) this.f100565OooOoO0);
                return;
            default:
                AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) this.f100563OooOo;
                View view2 = (View) this.f100565OooOoO0;
                AiOcrEditorListContainer.OooO00o oooO00o = aiOcrEditorListContainer.eventListener;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                if (aiOcrEditorListContainer.f78443OoooO00 == null) {
                    ViewOnClickListenerC29781OooO0o viewOnClickListenerC29781OooO0o = new ViewOnClickListenerC29781OooO0o(aiOcrEditorListContainer, 3);
                    Context context = aiOcrEditorListContainer.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                    o0o0O.OooO oooO = new o0o0O.OooO(context, viewOnClickListenerC29781OooO0o);
                    aiOcrEditorListContainer.f78443OoooO00 = oooO;
                    oooO.f107381OooO0Oo = new C30675OooO0Oo(aiOcrEditorListContainer);
                    C30394OooOOOO c30394OooOOOO = aiOcrEditorListContainer.f78422OooOo0o;
                    if (c30394OooOOOO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    oooO.OooO0Oo((Map) c30394OooOOOO.f108520Oooo0.getValue());
                }
                o0o0O.OooO oooO2 = aiOcrEditorListContainer.f78443OoooO00;
                if (oooO2 == null) {
                    z = false;
                } else {
                    PopupWindow popupWindow = oooO2.f107380OooO0OO;
                    if (popupWindow == null ? false : popupWindow.isShowing()) {
                        z = true;
                    }
                }
                if (z) {
                    o0o0O.OooO oooO3 = aiOcrEditorListContainer.f78443OoooO00;
                    if (oooO3 != null) {
                        oooO3.OooO00o();
                        return;
                    }
                    return;
                }
                aiOcrEditorListContainer.OooO0OO();
                o0o0O.OooO oooO4 = aiOcrEditorListContainer.f78443OoooO00;
                if (oooO4 != null) {
                    ViewGroup viewGroup = aiOcrEditorListContainer.f78425OooOoOO;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBarContainer");
                        throw null;
                    }
                    synchronized (oooO4) {
                        try {
                            if (oooO4.f107396OooOo0.compareAndSet(false, true)) {
                                oooO4.OooO0O0();
                            }
                            int i = oooO4.f107378OooO00o.getResources().getConfiguration().screenWidthDp;
                            ViewGroup viewGroup2 = oooO4.f107383OooO0o0;
                            if (viewGroup2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("moreStylesWrapper");
                                throw null;
                            }
                            viewGroup2.setVisibility(i < 480 ? 0 : 8);
                            Rect rect = new Rect();
                            viewGroup.getGlobalVisibleRect(rect);
                            PopupWindow popupWindow2 = oooO4.f107380OooO0OO;
                            if (popupWindow2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                                throw null;
                            }
                            popupWindow2.showAtLocation(viewGroup, 0, rect.left, rect.bottom + Oooo0.o000000O.OooO0o(2));
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
