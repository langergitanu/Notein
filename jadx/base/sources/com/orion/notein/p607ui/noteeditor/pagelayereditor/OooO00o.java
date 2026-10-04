package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import Oooo0.o000000O;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.popup.LayerMoreActionsBottomSheetDialog;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import o0OoooO0.C29631OooO0O0;
import o0OoooO0.C29632OooO0OO;
import o0oOOOoo.C30837OooO00o;
import o0oOo0o0.C30983OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$adapterItemClickListener$1$onMoreButtonClick$1", m80623f = "PageLayerEditor.kt", m80624l = {383}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditor f74748OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f74749OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f74750OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f74751OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(PageLayerEditor pageLayerEditor, View view, C30837OooO00o c30837OooO00o, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f74748OooOo = pageLayerEditor;
        this.f74751OooOoO0 = view;
        this.f74750OooOoO = c30837OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f74748OooOo, this.f74751OooOoO0, this.f74750OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74749OooOo0o;
        PageLayerEditor pageLayerEditor = this.f74748OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f74749OooOo0o = 1;
            obj = PageLayerEditor.OooO0O0(pageLayerEditor, 27, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C29632OooO0OO c29632OooO0OO = pageLayerEditor.f74872OooOoo0;
            if (c29632OooO0OO == null) {
                OooOOO0.OooOOOO("morePopupWindow");
                throw null;
            }
            View view = this.f74751OooOoO0;
            C30837OooO00o c30837OooO00o = this.f74750OooOoO;
            boolean zOooO00o = C30983OooO0o.OooO00o(view, "getContext(...)");
            ViewOnClickListenerC26051OoooOOo viewOnClickListenerC26051OoooOOo = c29632OooO0OO.f105066OooO0O0;
            if (zOooO00o) {
                FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager();
                OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                LayerMoreActionsBottomSheetDialog layerMoreActionsBottomSheetDialog = new LayerMoreActionsBottomSheetDialog();
                layerMoreActionsBottomSheetDialog.f74894OooOoO = viewOnClickListenerC26051OoooOOo;
                layerMoreActionsBottomSheetDialog.f74895OooOoO0 = c30837OooO00o;
                c29632OooO0OO.f105067OooO0OO = layerMoreActionsBottomSheetDialog;
                layerMoreActionsBottomSheetDialog.show(childFragmentManager, "LayerMoreActionsBottomSheetDialog");
            } else {
                if (c29632OooO0OO.f105069OooO0o.compareAndSet(false, true)) {
                    Object systemService = c29632OooO0OO.f105065OooO00o.getSystemService("layout_inflater");
                    OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_page_layer_more, (ViewGroup) null);
                    OooOOO0.OooO0o(viewInflate, "inflate(...)");
                    PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(180), -2, false);
                    c29632OooO0OO.f105070OooO0o0 = popupWindow;
                    popupWindow.setOutsideTouchable(true);
                    PopupWindow popupWindow2 = c29632OooO0OO.f105070OooO0o0;
                    if (popupWindow2 == null) {
                        OooOOO0.OooOOOO("popupWindow");
                        throw null;
                    }
                    popupWindow2.setElevation(10.0f);
                    c29632OooO0OO.f105068OooO0Oo = new C29631OooO0O0(viewInflate, viewOnClickListenerC26051OoooOOo);
                }
                C29631OooO0O0 c29631OooO0O0 = c29632OooO0OO.f105068OooO0Oo;
                if (c29631OooO0O0 != null) {
                    Iterator it = c29631OooO0O0.f105063OooO0OO.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setTag(c30837OooO00o);
                    }
                }
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                if (view.getId() == R.id.btn_more) {
                    PopupWindow popupWindow3 = c29632OooO0OO.f105070OooO0o0;
                    if (popupWindow3 == null) {
                        OooOOO0.OooOOOO("popupWindow");
                        throw null;
                    }
                    popupWindow3.showAtLocation(view, 0, rect.left - o000000O.OooO0o(190), rect.bottom - o000000O.OooO0o(90));
                } else {
                    PopupWindow popupWindow4 = c29632OooO0OO.f105070OooO0o0;
                    if (popupWindow4 == null) {
                        OooOOO0.OooOOOO("popupWindow");
                        throw null;
                    }
                    popupWindow4.showAtLocation(view, 0, rect.left - o000000O.OooO0o(190), rect.centerY());
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
