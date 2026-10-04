package o0Oo0oOo;

import com.google.android.material.tabs.TabLayout;
import com.orion.notein.domain.models.material.MaterialCategory;
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;

/* JADX INFO: renamed from: o0Oo0oOo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28338Oooo000 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryListFragment f100474OooO00o;

    public C28338Oooo000(CreativeLibraryListFragment creativeLibraryListFragment) {
        this.f100474OooO00o = creativeLibraryListFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        CreativeLibraryListFragment creativeLibraryListFragment = this.f100474OooO00o;
        MaterialCategory materialCategoryOooOoOO = CreativeLibraryListFragment.OooOoOO(creativeLibraryListFragment, tab);
        if (materialCategoryOooOoOO != null) {
            creativeLibraryListFragment.OooOoo().OooO0oO(materialCategoryOooOoOO);
        }
        CreativeLibraryListFragment.OooOooO(tab, true);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        CreativeLibraryListFragment creativeLibraryListFragment = this.f100474OooO00o;
        MaterialCategory materialCategoryOooOoOO = CreativeLibraryListFragment.OooOoOO(creativeLibraryListFragment, tab);
        if (materialCategoryOooOoOO != null) {
            creativeLibraryListFragment.OooOoo().OooO0oO(materialCategoryOooOoOO);
        }
        CreativeLibraryListFragment.OooOooO(tab, true);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        CreativeLibraryListFragment.OooOooO(tab, false);
    }
}
