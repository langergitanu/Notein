package oO0Oo;

import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import kotlin.coroutines.Continuation;
import o0o0OO0.C30394OooOOOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO0Oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$initQuotaUsage$1$1", m80623f = "TextRecognizeFragment.kt", m80624l = {389}, m80625m = "invokeSuspend")
public final class C33180OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f120075OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120076OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ TextRecognizeFragment f120077OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f120078OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ View f120079OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33180OooOo0o(TextRecognizeFragment textRecognizeFragment, View view, Continuation<? super C33180OooOo0o> continuation) {
        super(2, continuation);
        this.f120077OooOoO = textRecognizeFragment;
        this.f120079OooOoOO = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33180OooOo0o(this.f120077OooOoO, this.f120079OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33180OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int i;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f120078OooOoO0;
        TextRecognizeFragment textRecognizeFragment = this.f120077OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32443OooOOO c32443OooOOO = (C32443OooOOO) textRecognizeFragment.Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
            iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
            C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
            this.f120076OooOo0o = iIntValue;
            this.f120075OooOo = iIntValue2;
            this.f120078OooOoO0 = 1;
            Boolean boolValueOf = Boolean.valueOf(c30394OooOOOOOooo00O.f108492OooO.OooO0Oo().getUnlimitedQuota());
            if (boolValueOf == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            i = iIntValue2;
            obj = boolValueOf;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.f120075OooOo;
            iIntValue = this.f120076OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = i3;
        }
        int i4 = iIntValue;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        textRecognizeFragment.f78196Ooooooo = true;
        o0o0O.OooO0O0 oooO0O0 = textRecognizeFragment.f78193Oooooo;
        if (oooO0O0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("quotaUsagePopupMenu");
            throw null;
        }
        PopupWindow popupWindow = oooO0O0.f107406OooO0Oo;
        if (popupWindow == null ? false : popupWindow.isShowing()) {
            o0o0O.OooO0O0 oooO0O02 = textRecognizeFragment.f78193Oooooo;
            if (oooO0O02 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("quotaUsagePopupMenu");
                throw null;
            }
            oooO0O02.OooO00o();
        } else {
            o0o0O.OooO0O0 oooO0O03 = textRecognizeFragment.f78193Oooooo;
            if (oooO0O03 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("quotaUsagePopupMenu");
                throw null;
            }
            View view = this.f120079OooOoOO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
            oooO0O03.OooO0OO(view, i4, i, zBooleanValue, false);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
