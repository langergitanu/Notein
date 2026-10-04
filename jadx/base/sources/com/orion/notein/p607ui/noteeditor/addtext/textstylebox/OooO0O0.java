package com.orion.notein.p607ui.noteeditor.addtext.textstylebox;

import Oooo0.C20856OooooOo;
import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.textstylebox.TextFontPopupWindow$show$1", m80623f = "TextFontPopupWindow.kt", m80624l = {233}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f74102OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f74103OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f74104OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO00o oooO00o, View view, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f74102OooOo = oooO00o;
        this.f74104OooOoO0 = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f74102OooOo, this.f74104OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74103OooOo0o;
        OooO00o oooO00o = this.f74102OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) oooO00o.f74091OooO0o.getValue();
            this.f74103OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(interfaceC33721OooO0o, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        int i2 = OooOOO0.OooO0O0(obj, Boolean.TRUE) ? 50 : 0;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("TextFontPopupWindow");
        c20358OooO00o.OooO00o(C20856OooooOo.OooO0O0("TextFontPopupWindow show, yOffset:", oooO00o.f74096OooOO0O, ", actualOffset:", ".", i2), new Object[0]);
        View view = this.f74104OooOoO0;
        oooO00o.f74095OooOO0 = view;
        PopupWindow popupWindow = oooO00o.f74089OooO0OO;
        int i3 = -i2;
        popupWindow.showAsDropDown(view, 0, i3);
        View contentView = popupWindow.getContentView();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        contentView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = contentView.getMeasuredHeight();
        int measuredHeight2 = oooO00o.f74094OooO0oo;
        if (measuredHeight < measuredHeight2) {
            measuredHeight2 = contentView.getMeasuredHeight();
        }
        int i4 = measuredHeight2;
        View view2 = oooO00o.f74095OooOO0;
        if (view2 != null) {
            popupWindow.update(view2, 0, i3, oooO00o.f74086OooO, i4);
        }
        OooO00o.InterfaceC19278OooO00o interfaceC19278OooO00o = oooO00o.f74088OooO0O0;
        if (interfaceC19278OooO00o != null) {
            interfaceC19278OooO00o.OooO0O0(true);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
