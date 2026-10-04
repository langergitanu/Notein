package o0o0OOoO;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.aiquota.AiQuotaPayDialogFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOoO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$restorePurchase$1", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {238}, m80625m = "invokeSuspend")
public final class C30555OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AiQuotaPayDialogFragment f109291OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109292OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30555OooO0o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C30555OooO0o> continuation) {
        super(2, continuation);
        this.f109291OooOo = aiQuotaPayDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30555OooO0o(this.f109291OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30555OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String string;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109292OooOo0o;
        AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f109291OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CircularProgressIndicator circularProgressIndicator = aiQuotaPayDialogFragment.f78729OoooO0;
            if (circularProgressIndicator == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnRestorePurchase");
                throw null;
            }
            circularProgressIndicator.setVisibility(0);
            TextView textView = aiQuotaPayDialogFragment.f78718Oooo;
            if (textView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnRestorePurchase");
                throw null;
            }
            textView.setVisibility(4);
            C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
            this.f109292OooOo0o = 1;
            obj = c30558OooO0ooOooo0.OooO0o0(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        TextView textView2 = aiQuotaPayDialogFragment.f78718Oooo;
        if (textView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRestorePurchase");
            throw null;
        }
        textView2.setVisibility(0);
        CircularProgressIndicator circularProgressIndicator2 = aiQuotaPayDialogFragment.f78729OoooO0;
        if (circularProgressIndicator2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnRestorePurchase");
            throw null;
        }
        circularProgressIndicator2.setVisibility(8);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
            string = aiQuotaPayDialogFragment.getString(R.string.restore_purchase_ok);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "GooglePayDialogFragment", "restorePurchases failed. response: ", c27174OooO0O0), new Object[0]);
            String errorCode = c27174OooO0O0.getErrorCode();
            String errorMsg = c27174OooO0O0.getErrorMsg();
            if (errorCode != null) {
                switch (errorCode.hashCode()) {
                    case 1457223783:
                        if (errorCode.equals("199998")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.no_user);
                        } else if (errorMsg == null) {
                            errorMsg = "";
                        }
                        break;
                    case 1457223784:
                        if (errorCode.equals("199999")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.network_error);
                            break;
                        }
                        break;
                    case 1505893342:
                        if (errorCode.equals("300001")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.error_submit_purchase_history_conflict);
                            break;
                        }
                        break;
                    case 1505893343:
                        if (errorCode.equals("300002")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.error_submit_notein_purchase_history);
                            break;
                        }
                        break;
                    case 1506816863:
                        if (errorCode.equals("310001")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.error_client_not_ready);
                            break;
                        }
                        break;
                    case 1506816864:
                        if (errorCode.equals("310002")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.error_no_purchases);
                            break;
                        }
                        break;
                    case 1506816865:
                        if (errorCode.equals("310003")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.error_order_no_purchased);
                            break;
                        }
                        break;
                    case 1506816867:
                        if (errorCode.equals("310005")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.error_no_purchase_history);
                            break;
                        }
                        break;
                    case 1506816868:
                        if (errorCode.equals("310006")) {
                            errorMsg = aiQuotaPayDialogFragment.getString(R.string.error_no_notein_purchase_history);
                            break;
                        }
                        break;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(errorMsg);
                if (errorCode == null) {
                    errorCode = "399999";
                }
                string = aiQuotaPayDialogFragment.getString(R.string.restore_purchase_failed, errorCode, errorMsg);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
        Context context = aiQuotaPayDialogFragment.getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0OO((ContextWrapper) context, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
