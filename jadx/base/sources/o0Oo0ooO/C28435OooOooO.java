package o0Oo0ooO;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.LabelManagementBottomSheet;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0ooO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28435OooOooO implements InterfaceC21912Oooo0o, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f100796OooOo0o;

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        long j = bundle.getLong("labelId");
        LabelManagementBottomSheet labelManagementBottomSheet = (LabelManagementBottomSheet) this.f100796OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = labelManagementBottomSheet.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new LabelManagementBottomSheet.OooO00o(labelManagementBottomSheet, j, null), 3);
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tab, "tab");
        Context context = (Context) this.f100796OooOo0o;
        if (i == 0) {
            tab.setIcon(context.getDrawable(R.drawable.ic_ni_preview));
            return;
        }
        if (i == 1) {
            tab.setIcon(context.getDrawable(R.drawable.ic_ni_index));
        } else if (i != 2) {
            tab.setText("unknown tab");
        } else {
            tab.setIcon(context.getDrawable(R.drawable.ic_ni_comment));
        }
    }
}
