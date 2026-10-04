package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.android.billingclient.api.C22161OooO0oO;
import com.android.billingclient.api.OooOO0O;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.transactions.TransactionsConstants;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.notein.p607ui.pay.Event;
import com.orion.notein.p607ui.pay.aiquota.AiQuotaPayDialogFragment;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o00o00.C25206OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26351o00ooo;
import o0Oo00o.C28026OooO0OO;
import o0o00o0O.C29952OooO0oo;
import o0o00oo.C30115OooOo00;
import o0o0OOo0.C30548OooO0O0;
import o0o0OOoO.C30558OooO0oo;
import o0oOoOo.C31042OooOOO0;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0OOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89004OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89005OooOo0o;

    public /* synthetic */ o0OOO0o(Object obj, int i) {
        this.f89005OooOo0o = i;
        this.f89004OooOo = obj;
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [oO0o0OO.Oooo00o, void] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.orion.notein.ui.notelist.documents.NoteListContainerFragment, java.lang.String] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object next;
        Object obj = this.f89004OooOo;
        switch (this.f89005OooOo0o) {
            case 0:
                ViewOnAttachStateChangeListenerC26064o000000o viewOnAttachStateChangeListenerC26064o000000o = (ViewOnAttachStateChangeListenerC26064o000000o) obj;
                TextBoxInfo textBoxInfo = viewOnAttachStateChangeListenerC26064o000000o.f88974OooOo0o;
                if (textBoxInfo != null) {
                    viewOnAttachStateChangeListenerC26064o000000o.f88976OooOoO0.OooO(textBoxInfo);
                    return;
                }
                return;
            case 1:
                Context contextRequireContext = ((FirebaseCreateUserPasswordFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return;
            case 2:
                TextStyleBox.OooO0o0((TextStyleBox) obj, view);
                return;
            case 3:
                int i = PenBox.f76736o000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenWidthVO");
                PenBox penBox = (PenBox) obj;
                if (!((PenWidthVO) tag).getSelected()) {
                    View.OnClickListener onClickListener = penBox.penWidthItemClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    return;
                }
                C29952OooO0oo c29952OooO0oo = penBox.f76777o00O0O;
                if (c29952OooO0oo != null) {
                    c29952OooO0oo.OooO0Oo(penBox.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String, view);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthPopupWindow");
                    throw null;
                }
            case 4:
                ?? r2 = (NoteListContainerFragment) obj;
                C33609OooO0oo.OooO0OO(Bundle.putString(r2, "getViewLifecycleOwner(...)"), null, null, new C30115OooOo00(r2, null), 3);
                return;
            case 5:
                AiQuotaPayDialogFragment aiQuotaPayDialogFragment = (AiQuotaPayDialogFragment) obj;
                if (((C26320o0000OoO) aiQuotaPayDialogFragment.f78721Oooo00O.getValue()).f90227OooOoOO.f121747OooOo0o.getValue() == 0) {
                    String string = aiQuotaPayDialogFragment.getString(R.string.login_first);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(aiQuotaPayDialogFragment), new C26351o00ooo(string));
                    return;
                }
                CheckBox checkBox = aiQuotaPayDialogFragment.f78728Oooo0oo;
                if (checkBox == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAgree");
                    throw null;
                }
                if (!checkBox.isChecked()) {
                    Context context = aiQuotaPayDialogFragment.getContext();
                    if (context != null) {
                        String string2 = aiQuotaPayDialogFragment.getString(R.string.please_agree_membership_terms);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string2);
                        return;
                    }
                    return;
                }
                C30548OooO0O0 c30548OooO0O0 = aiQuotaPayDialogFragment.f78725Oooo0o;
                if (c30548OooO0O0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("productAdapter");
                    throw null;
                }
                Iterable iterable = c30548OooO0O0.f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(iterable, "getCurrentList(...)");
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C31042OooOOO0) next).f110833OooO0oo) {
                        }
                    } else {
                        next = null;
                    }
                }
                C31042OooOOO0 c31042OooOOO0 = (C31042OooOOO0) next;
                if (c31042OooOOO0 == null) {
                    Context context2 = aiQuotaPayDialogFragment.getContext();
                    if (context2 != null) {
                        String string3 = aiQuotaPayDialogFragment.getString(R.string.select_product);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context2, string3);
                        return;
                    }
                    return;
                }
                C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
                com.android.billingclient.api.OooOO0O oooOO0O = c31042OooOOO0.f110826OooO00o;
                String str = oooOO0O.f66948OooO0Oo;
                int iHashCode = str.hashCode();
                C33781o00o0O c33781o00o0O = c30558OooO0ooOooo0.f109296OooO;
                String str2 = oooOO0O.f66947OooO0OO;
                if (iHashCode != 3541555) {
                    if (iHashCode == 100343516 && str.equals("inapp")) {
                        if (((String) c33781o00o0O.getValue()) == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
                            c20358OooO00o.OooO0OO("User id is null", new Object[0]);
                            c30558OooO0ooOooo0.OooO0oO(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_NO_USER);
                            return;
                        }
                        c30558OooO0ooOooo0.OooO0oO(Event.C23763OooO0Oo.f78706OooO00o, null);
                        List list = (List) c30558OooO0ooOooo0.f109302OooOO0.f121747OooOo0o.getValue();
                        if (list != null) {
                            List list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleInAppPurchase) it2.next()).getProductId(), str2)) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("AiQuotaPayViewModel");
                                        c20358OooO00o2.OooO0OO("User has more than 1 current purchase.", new Object[0]);
                                        c30558OooO0ooOooo0.OooO0oO(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_OUT_OF_NUM_LIMIT);
                                        return;
                                    }
                                }
                            }
                        }
                        C22161OooO0oO.OooO00o OooO00o2 = C22161OooO0oO.OooO00o();
                        C22161OooO0oO.OooO0O0.OooO00o oooO00o = new C22161OooO0oO.OooO0O0.OooO00o();
                        oooO00o.OooO0O0(oooOO0O);
                        OooO00o2.f66925OooO00o = new ArrayList(com.facebook.soloader.OooOo.OooO0oO(oooO00o.OooO00o()));
                        c30558OooO0ooOooo0.OooO0oO(Event.OooO0o.f78707OooO00o, new C32443OooOOO(c31042OooOOO0, OooO00o2.OooO00o()));
                        return;
                    }
                    return;
                }
                if (str.equals("subs")) {
                    if (((String) c33781o00o0O.getValue()) == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("AiQuotaPayViewModel");
                        c20358OooO00o3.OooO0OO("User id is null", new Object[0]);
                        c30558OooO0ooOooo0.OooO0oO(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_NO_USER);
                        return;
                    }
                    c30558OooO0ooOooo0.OooO0oO(Event.C23763OooO0Oo.f78706OooO00o, null);
                    OooOO0O.C22163OooO0Oo c22163OooO0Oo = c31042OooOOO0.f110828OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c22163OooO0Oo);
                    String str3 = c22163OooO0Oo.f66969OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(str3, "getOfferToken(...)");
                    List list3 = (List) c30558OooO0ooOooo0.f109303OooOO0O.f121747OooOo0o.getValue();
                    if (list3 != null) {
                        List list4 = list3;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                List<NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem> lineItems = ((NoteinGoogleSubscriptionPurchase) it3.next()).getLineItems();
                                if (!(lineItems instanceof Collection) || !lineItems.isEmpty()) {
                                    Iterator<T> it4 = lineItems.iterator();
                                    while (it4.hasNext()) {
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) it4.next()).getProductId(), str2)) {
                                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o4.OooOOO0("AiQuotaPayViewModel");
                                            c20358OooO00o4.OooO0OO("User has more than 1 current purchase.", new Object[0]);
                                            c30558OooO0ooOooo0.OooO0oO(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_OUT_OF_NUM_LIMIT);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C22161OooO0oO.OooO00o OooO00o3 = C22161OooO0oO.OooO00o();
                    C22161OooO0oO.OooO0O0.OooO00o oooO00o2 = new C22161OooO0oO.OooO0O0.OooO00o();
                    oooO00o2.OooO0O0(oooOO0O);
                    if (TextUtils.isEmpty(str3)) {
                        throw new IllegalArgumentException("offerToken can not be empty");
                    }
                    oooO00o2.f66930OooO0O0 = str3;
                    OooO00o3.f66925OooO00o = new ArrayList(com.facebook.soloader.OooOo.OooO0oO(oooO00o2.OooO00o()));
                    c30558OooO0ooOooo0.OooO0oO(Event.OooO0o.f78707OooO00o, new C32443OooOOO(c31042OooOOO0, OooO00o3.OooO00o()));
                    return;
                }
                return;
            default:
                ActivityC21897OooOo0 activity = ((NoteEditorSwitchFragment) obj).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.showGuideVideo(9);
                    return;
                }
                return;
        }
    }
}
