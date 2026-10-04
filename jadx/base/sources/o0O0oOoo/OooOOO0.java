package o0O0oOoo;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.button.SelectableSymbolButtonGroupView;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import o0o0Oo0O.C30616OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89264OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89265OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View f89266OooOoO0;

    public /* synthetic */ OooOOO0(Object obj, View view, int i) {
        this.f89265OooOo0o = i;
        this.f89264OooOo = obj;
        this.f89266OooOoO0 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f89264OooOo;
        View view2 = this.f89266OooOoO0;
        switch (this.f89265OooOo0o) {
            case 0:
                int i = SelectableSymbolButtonGroupView.f69455OooOoo0;
                SelectableSymbolButtonGroupView selectableSymbolButtonGroupView = (SelectableSymbolButtonGroupView) obj;
                selectableSymbolButtonGroupView.getClass();
                SelectableSymbolButtonGroupView.OooO0OO((SelectableSymbolButtonView) view2);
                int iOrdinal = selectableSymbolButtonGroupView.f69457OooOo0o.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    throw new C32442OooOO0o();
                }
                throw null;
            default:
                GlobalSettingsFragment globalSettingsFragment = (GlobalSettingsFragment) obj;
                view2.setEnabled(false);
                InterfaceC21987OooOoo viewLifecycleOwner = globalSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30616OooO0oO(view2, globalSettingsFragment, null), 3);
                return;
        }
    }
}
