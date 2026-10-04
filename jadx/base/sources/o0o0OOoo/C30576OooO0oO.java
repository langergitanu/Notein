package o0o0OOoo;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOoo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$checkUserAfterLoggedIn$1", m80623f = "GooglePayDialogFragment.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_2_ACCENT_6}, m80625m = "invokeSuspend")
public final class C30576OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f109386OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109387OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ GooglePayDialogFragment f109388OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30576OooO0oO(String str, GooglePayDialogFragment googlePayDialogFragment, Continuation<? super C30576OooO0oO> continuation) {
        super(2, continuation);
        this.f109386OooOo = str;
        this.f109388OooOoO0 = googlePayDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30576OooO0oO(this.f109386OooOo, this.f109388OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30576OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109387OooOo0o;
        GooglePayDialogFragment googlePayDialogFragment = this.f109388OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "GooglePayDialogFragment", "checkUserAfterLoggedIn: ");
            String str = this.f109386OooOo;
            sbOooO0O0.append(str);
            c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
            C30584OooOOOo c30584OooOOOoOooo0 = googlePayDialogFragment.Oooo0();
            this.f109387OooOo0o = 1;
            obj = c30584OooOOOoOooo0.OooO0o0(str, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean z = ((C30582OooOOO0) googlePayDialogFragment.f78788Oooo000.getValue()).f109398OooO00o == null;
        if (zBooleanValue && z) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GooglePayDialogFragment");
            c20358OooO00o2.OooO00o("User is already VIP, navigating back.", new Object[0]);
            Bundle EMPTY = Bundle.EMPTY;
            kotlin.jvm.internal.OooOOO0.OooO0o(EMPTY, "EMPTY");
            googlePayDialogFragment.getParentFragmentManager().OooooOo(EMPTY, "refresh_purchases_server");
            C21030OooOO0o.OooO0OO(googlePayDialogFragment).OooOOo(R.id.googlePayDialogFragment, true);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("GooglePayDialogFragment");
            c20358OooO00o3.OooO00o("User is not VIP or purpose is not purchase, continue.", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
