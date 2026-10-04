package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import kotlin.jvm.internal.OooOOO0;
import o0o0OO0o.C30454OooO0OO;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22352OooO0Oo implements AccessibilityViewCommand, InterfaceC32330OooO0O0, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67630OooOo0o;

    public /* synthetic */ C22352OooO0Oo(Object obj) {
        this.f67630OooOo0o = obj;
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        ((InAppMessageStreamManager) this.f67630OooOo0o).lambda$createFirebaseInAppMessageStream$18((FetchEligibleCampaignsResponse) obj);
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        OooOOO0.OooO0oO(tab, "tab");
        TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) this.f67630OooOo0o;
        C30454OooO0OO c30454OooO0OO = tiledPageListContainerFragment.f78533OoooO;
        if (c30454OooO0OO == null) {
            OooOOO0.OooOOOO("pageTypeFilterAdapter");
            throw null;
        }
        tab.setText(c30454OooO0OO.f108749OooO.get(i).getDescription());
        C30454OooO0OO c30454OooO0OO2 = tiledPageListContainerFragment.f78533OoooO;
        if (c30454OooO0OO2 != null) {
            tab.setIcon(c30454OooO0OO2.f108749OooO.get(i).getIcon());
        } else {
            OooOOO0.OooOOOO("pageTypeFilterAdapter");
            throw null;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((BottomSheetDragHandleView) this.f67630OooOo0o).lambda$onBottomSheetStateChanged$0(view, commandArguments);
    }
}
