package o0OoOOo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity;
import java.util.Iterator;
import java.util.List;
import o00o00.C25206OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26351o00ooo;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28038OooO0Oo;
import o0OoOo.C29194OooO00o;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0Ooo0oO.C29423OooO00o;
import o0Ooo0oO.C29434OooO0oO;
import o0o0OOo0.C30549OooO0OO;
import o0o0OOoo.C30574OooO0o;
import o0o0OOoo.C30582OooOOO0;
import o0oOoOo.C31042OooOOO0;
import o0ooOOoo.C31657OooO0OO;
import o0ooOOoo.DialogC31655OooO00o;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoOOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29133OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103259OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103260OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29133OooO0oO(Object obj, int i) {
        this.f103260OooOo0o = i;
        this.f103259OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC31661OooO0oO c31657OooO0OO;
        Object next;
        switch (this.f103260OooOo0o) {
            case 0:
                AudioBarChildFragment audioBarChildFragment = (AudioBarChildFragment) this.f103259OooOo;
                if (audioBarChildFragment.f74177OoooOO0 == null) {
                    Context contextRequireContext = audioBarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    if (C28038OooO0Oo.OooO0O0(contextRequireContext)) {
                        Context contextRequireContext2 = audioBarChildFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                        c31657OooO0OO = new DialogC31655OooO00o(contextRequireContext2);
                    } else {
                        Context contextRequireContext3 = audioBarChildFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
                        c31657OooO0OO = new C31657OooO0OO(contextRequireContext3);
                    }
                    audioBarChildFragment.f74177OoooOO0 = c31657OooO0OO;
                    c31657OooO0OO.OooO(new C29126OooO(audioBarChildFragment));
                    List<C29196OooO0OO> list = (List) audioBarChildFragment.OooOoo0().f74248OooOooo.f121747OooOo0o.getValue();
                    C29194OooO00o c29194OooO00o = (C29194OooO00o) audioBarChildFragment.OooOoo0().f74239OooOo00.f121747OooOo0o.getValue();
                    InterfaceC31661OooO0oO interfaceC31661OooO0oO = audioBarChildFragment.f74177OoooOO0;
                    if (interfaceC31661OooO0oO != null) {
                        interfaceC31661OooO0oO.OooOOoo(list, c29194OooO00o, true);
                    }
                    List<C29197OooO0Oo> list2 = (List) audioBarChildFragment.OooOoo0().f74244OooOoOO.f121747OooOo0o.getValue();
                    InterfaceC31661OooO0oO interfaceC31661OooO0oO2 = audioBarChildFragment.f74177OoooOO0;
                    if (interfaceC31661OooO0oO2 != null) {
                        interfaceC31661OooO0oO2.OooO0Oo(list2);
                    }
                    InterfaceC31661OooO0oO interfaceC31661OooO0oO3 = audioBarChildFragment.f74177OoooOO0;
                    if (interfaceC31661OooO0oO3 != null) {
                        interfaceC31661OooO0oO3.OooOO0(((Boolean) audioBarChildFragment.OooOoo0().f74245OooOoo.getValue()).booleanValue());
                    }
                }
                InterfaceC31661OooO0oO interfaceC31661OooO0oO4 = audioBarChildFragment.f74177OoooOO0;
                if (interfaceC31661OooO0oO4 != null) {
                    View view2 = audioBarChildFragment.f74167Oooo0O0;
                    if (view2 != null) {
                        interfaceC31661OooO0oO4.OooO0O0(view2);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnMore");
                        throw null;
                    }
                }
                return;
            case 1:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.f103259OooOo;
                RecyclerView recyclerView = penBarChildFragment.f75275Oooooo;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvVectorList");
                    throw null;
                }
                RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int itemCount = linearLayoutManager.getItemCount();
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition() + 1;
                if (iFindFirstVisibleItemPosition < itemCount) {
                    linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, 0);
                }
                boolean z = linearLayoutManager.findLastCompletelyVisibleItemPosition() == itemCount - 1;
                ImageView imageView = penBarChildFragment.f75277OoooooO;
                if (imageView != null) {
                    imageView.setEnabled(true ^ z);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivMoreVector");
                    throw null;
                }
            case 2:
                GooglePayDialogFragment googlePayDialogFragment = (GooglePayDialogFragment) this.f103259OooOo;
                if (((C26320o0000OoO) googlePayDialogFragment.f78790Oooo00o.getValue()).f90227OooOoOO.f121747OooOo0o.getValue() == 0) {
                    String string = googlePayDialogFragment.getString(R.string.content_require_to_login);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(googlePayDialogFragment), new C26351o00ooo(string));
                    return;
                }
                CheckBox checkBox = googlePayDialogFragment.f78786Oooo;
                if (checkBox == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnAgree");
                    throw null;
                }
                if (!checkBox.isChecked()) {
                    Context context = googlePayDialogFragment.getContext();
                    if (context != null) {
                        String string2 = googlePayDialogFragment.getString(R.string.please_agree_membership_terms);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string2);
                        return;
                    }
                    return;
                }
                C30549OooO0OO c30549OooO0OO = googlePayDialogFragment.f78793Oooo0o;
                if (c30549OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("productAdapter");
                    throw null;
                }
                Iterable iterable = c30549OooO0OO.f66021OooO00o.f65811OooO0o;
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
                    Context context2 = googlePayDialogFragment.getContext();
                    if (context2 != null) {
                        String string3 = googlePayDialogFragment.getString(R.string.select_product);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context2, string3);
                        return;
                    }
                    return;
                }
                NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = ((C30582OooOOO0) googlePayDialogFragment.f78788Oooo000.getValue()).f109398OooO00o;
                if (noteinGoogleSubscriptionPurchase == null || c31042OooOOO0.f110827OooO0O0 == null) {
                    googlePayDialogFragment.Oooo0().OooO0o(c31042OooOOO0);
                    return;
                } else {
                    if (noteinGoogleSubscriptionPurchase.isCanceled()) {
                        googlePayDialogFragment.Oooo0().OooO0o(c31042OooOOO0);
                        return;
                    }
                    InterfaceC21987OooOoo viewLifecycleOwner = googlePayDialogFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30574OooO0o(googlePayDialogFragment, noteinGoogleSubscriptionPurchase, c31042OooOOO0, null), 3);
                    return;
                }
            case 3:
                C29423OooO00o c29423OooO00oOooOooO = ((PagePaddingFragment) this.f103259OooOo).OooOooO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29423OooO00oOooOooO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29434OooO0oO(c29423OooO00oOooOooO, null), 2);
                return;
            default:
                YubiKeyPromptActivity yubiKeyPromptActivity = (YubiKeyPromptActivity) this.f103259OooOo;
                synchronized (yubiKeyPromptActivity.f80282OooOo0o) {
                }
                yubiKeyPromptActivity.setResult(0);
                yubiKeyPromptActivity.finish();
                return;
        }
    }
}
