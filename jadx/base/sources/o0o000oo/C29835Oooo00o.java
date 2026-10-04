package o0o000oo;

import OooO0o.C20424OooO0Oo;
import Oooo0.o000000O;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import o0o00O00.C29870OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o000oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnPageRotateBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {422}, m80625m = "invokeSuspend")
public final class C29835Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105838OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105839OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f105840OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29835Oooo00o(View view, BaseToolbarChildFragment baseToolbarChildFragment, Continuation continuation) {
        super(2, continuation);
        this.f105838OooOo = baseToolbarChildFragment;
        this.f105840OooOoO0 = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29835Oooo00o(this.f105840OooOoO0, this.f105838OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29835Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105839OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BaseToolbarChildFragment baseToolbarChildFragment = this.f105838OooOo;
            this.f105839OooOo0o = 1;
            obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 48, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(10, this.f105838OooOo.f76496OoooOO0);
        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
        C29870OooO0o0 c29870OooO0o0 = value instanceof C29870OooO0o0 ? (C29870OooO0o0) value : null;
        if (c29870OooO0o0 != null) {
            View anchor = this.f105840OooOoO0;
            synchronized (c29870OooO0o0) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(anchor, "anchor");
                View contentView = c29870OooO0o0.f105997OooO00o.getContentView();
                int width = c29870OooO0o0.f105997OooO00o.getWidth();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
                int height = c29870OooO0o0.f105997OooO00o.getHeight();
                contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
                int measuredWidth = contentView.getMeasuredWidth();
                int measuredHeight = contentView.getMeasuredHeight();
                int i2 = anchor.getResources().getDisplayMetrics().heightPixels;
                int[] iArr = new int[2];
                anchor.getLocationOnScreen(iArr);
                int height2 = iArr[1] + anchor.getHeight();
                int i3 = -(measuredWidth + o000000O.OooO0o(8));
                int i4 = -(measuredHeight / 2);
                int i5 = height2 + i4 + measuredHeight;
                if (i5 > i2) {
                    i4 -= i5 - i2;
                }
                int i6 = height2 + i4;
                if (i6 < 0) {
                    i4 -= i6;
                }
                c29870OooO0o0.f105997OooO00o.showAsDropDown(anchor, i3, i4, 3);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
