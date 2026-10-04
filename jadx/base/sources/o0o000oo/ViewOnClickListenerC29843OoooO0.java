package o0o000oo;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import o0o00O.InterfaceC29862OooO00o;
import o0o0O0o.C30294OooO0OO;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: renamed from: o0o000oo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29843OoooO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f105865OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105866OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29843OoooO0(Fragment fragment, int i) {
        this.f105866OooOo0o = i;
        this.f105865OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f105866OooOo0o) {
            case 0:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f105865OooOo;
                Integer num = (Integer) baseToolbarChildFragment.Oooo0OO().f73381Oooo00o.f121747OooOo0o.getValue();
                if (num == null) {
                    return;
                }
                InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) baseToolbarChildFragment.f76496OoooOO0.get(5);
                Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                InterfaceC29862OooO00o interfaceC29862OooO00o = value instanceof InterfaceC29862OooO00o ? (InterfaceC29862OooO00o) value : null;
                if (interfaceC29862OooO00o != null) {
                    interfaceC29862OooO00o.OooOOOo(baseToolbarChildFragment.Oooo00O(), num.intValue());
                    return;
                }
                return;
            default:
                C30294OooO0OO c30294OooO0OO = ((LabelContainerFragment) this.f105865OooOo).f77715Oooo0o0;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                C30294OooO0OO.OooO0O0(c30294OooO0OO, view, 0, 6);
                return;
        }
    }
}
