package o0o0O00;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import com.orion.notein.p607ui.widget.EdgeFragment;
import java.util.List;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O00.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30214OooOoOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final NoteVOFilter f107601OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final NoteVOFilter f107602OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final List<NoteVOFilter> f107603OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f107604OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f107605OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ViewPager2 f107606OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C30212OooOoO f107607OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<NoteVOFilter> f107608OooO0o0;

    /* JADX INFO: renamed from: o0o0O00.OooOoOO$OooO00o */
    public interface OooO00o {
        Fragment OooO00o();

        void onPageSelected(int i);
    }

    static {
        NoteVOFilter noteVOFilter = new NoteVOFilter(0, "All");
        f107601OooO0o = noteVOFilter;
        NoteVOFilter noteVOFilter2 = new NoteVOFilter(1, "PDF");
        NoteVOFilter noteVOFilter3 = new NoteVOFilter(2, "Note");
        NoteVOFilter noteVOFilter4 = new NoteVOFilter(3, "Folder");
        f107602OooO0oO = noteVOFilter4;
        f107603OooO0oo = C34429OooOOo0.OooOO0o(noteVOFilter, noteVOFilter2, noteVOFilter3, noteVOFilter4);
    }

    public C30214OooOoOO(EdgeFragment edgeFragment, View view, int i, OooO00o oooO00o) {
        this.f107604OooO00o = view;
        this.f107605OooO0O0 = oooO00o;
        C30215OooOoo0 c30215OooOoo0 = new C30215OooOoo0(this);
        List<NoteVOFilter> list = f107603OooO0oo;
        this.f107608OooO0o0 = list;
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.pager);
        this.f107606OooO0OO = viewPager2;
        viewPager2.OooO00o(c30215OooOoo0);
        C30212OooOoO c30212OooOoO = new C30212OooOoO(this, edgeFragment, list);
        this.f107607OooO0Oo = c30212OooOoO;
        viewPager2.setAdapter(c30212OooOoO);
        viewPager2.OooO0OO(i, false);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o0o0O00.OooOoO0
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(tab, "tab");
                C30214OooOoOO c30214OooOoOO = this.f107600OooOo0o;
                int index = c30214OooOoOO.f107607OooO0Oo.f107061OooO.get(i2).getIndex();
                View view2 = c30214OooOoOO.f107604OooO00o;
                tab.setText(index != 0 ? index != 1 ? index != 2 ? index != 3 ? view2.getContext().getString(R.string.note_list_tabs_all) : view2.getContext().getString(R.string.note_list_tabs_folder) : view2.getContext().getString(R.string.note_list_tabs_note) : view2.getContext().getString(R.string.note_list_tabs_pdf) : view2.getContext().getString(R.string.note_list_tabs_all));
            }
        }).attach();
    }

    public final NoteVOFilter OooO00o() {
        return this.f107608OooO0o0.get(this.f107606OooO0OO.getCurrentItem());
    }

    public final void OooO0O0() {
        try {
            View viewFindViewById = this.f107604OooO00o.findViewById(R.id.label_color_filter_section);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            viewFindViewById.setVisibility(8);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TabLayoutViewPagerInitializer");
            c20358OooO00o.OooO0O0(e);
        }
    }
}
