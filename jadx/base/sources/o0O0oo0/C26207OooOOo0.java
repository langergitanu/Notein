package o0O0oo0;

import android.content.Context;
import android.view.View;
import com.orion.niui.components.dropdown.SingleSelectDropdownView;
import com.orion.notein.p607ui.user.FirstTimeUserTipsDialogFragment;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0O0oo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26207OooOOo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89528OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89529OooOo0o;

    public /* synthetic */ C26207OooOOo0(Object obj, int i) {
        this.f89529OooOo0o = i;
        this.f89528OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f89529OooOo0o) {
            case 0:
                OooOOOO option = (OooOOOO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(option, "option");
                SingleSelectDropdownView singleSelectDropdownView = (SingleSelectDropdownView) this.f89528OooOo;
                singleSelectDropdownView.setSelectedIdState(option.f89518OooO00o);
                singleSelectDropdownView.setExpandedState(false);
                InterfaceC32507OooOO0o<? super OooOOOO, C32460OooOooO> interfaceC32507OooOO0o = singleSelectDropdownView.f69516OooOoo;
                if (interfaceC32507OooOO0o != null) {
                    interfaceC32507OooOO0o.invoke(option);
                }
                break;
            default:
                View it = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                Context contextRequireContext = ((FirstTimeUserTipsDialogFragment) this.f89528OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
