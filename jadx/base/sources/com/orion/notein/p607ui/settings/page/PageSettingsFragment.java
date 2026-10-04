package com.orion.notein.p607ui.settings.page;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.content.C21650OooOoO;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.google.android.material.search.OooOO0O;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.page.PageSettingsFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o0Oo0Ooo.ViewOnClickListenerC28141OooO0oO;
import o0Oo0Ooo.ViewOnClickListenerC28142OooO0oo;
import o0Oo0ooO.ViewOnClickListenerC28426OooOo0;
import o0OoOO00.ViewOnClickListenerC29007OooOo0;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30642Oooo00O;
import o0o0Oo0O.C30647Oooo0o0;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/ui/settings/page/PageSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO0OO", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageSettingsFragment extends Hilt_PageSettingsFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public OooO00o f79255OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79256OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO0OO f79257OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public OooO0OO f79258OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public SwitchListItemView f79259Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public OooO0OO f79260Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public OooO0O0 f79261Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public OooO0OO f79262Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f79263Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f79264Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f79265Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public o00000OO f79266Oooo0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f79267OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SelectableSymbolButtonView f79268OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SelectableSymbolButtonView f79269OooO0OO;

        public OooO00o(View view, SelectableSymbolButtonView selectableSymbolButtonView, SelectableSymbolButtonView selectableSymbolButtonView2) {
            this.f79267OooO00o = view;
            this.f79268OooO0O0 = selectableSymbolButtonView;
            this.f79269OooO0OO = selectableSymbolButtonView2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f79267OooO00o, oooO00o.f79267OooO00o) && OooOOO0.OooO0O0(this.f79268OooO0O0, oooO00o.f79268OooO0O0) && OooOOO0.OooO0O0(this.f79269OooO0OO, oooO00o.f79269OooO0OO);
        }

        public final int hashCode() {
            return this.f79269OooO0OO.hashCode() + ((this.f79268OooO0O0.hashCode() + (this.f79267OooO00o.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FlipDirectionRow(root=" + this.f79267OooO00o + ", verticalButton=" + this.f79268OooO0O0 + ", horizontalButton=" + this.f79269OooO0OO + ")";
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f79270OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SwitchListItemView f79271OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SeekBar f79272OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f79273OooO0Oo;

        public OooO0O0(View view, SwitchListItemView switchListItemView, SeekBar seekBar, TextView textView) {
            this.f79270OooO00o = view;
            this.f79271OooO0O0 = switchListItemView;
            this.f79272OooO0OO = seekBar;
            this.f79273OooO0Oo = textView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f79270OooO00o, oooO0O0.f79270OooO00o) && OooOOO0.OooO0O0(this.f79271OooO0O0, oooO0O0.f79271OooO0O0) && OooOOO0.OooO0O0(this.f79272OooO0OO, oooO0O0.f79272OooO0OO) && OooOOO0.OooO0O0(this.f79273OooO0Oo, oooO0O0.f79273OooO0Oo);
        }

        public final int hashCode() {
            return this.f79273OooO0Oo.hashCode() + ((this.f79272OooO0OO.hashCode() + ((this.f79271OooO0O0.hashCode() + (this.f79270OooO00o.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "FreeMoveCard(root=" + this.f79270OooO00o + ", toggle=" + this.f79271OooO0O0 + ", seekBar=" + this.f79272OooO0OO + ", valueView=" + this.f79273OooO0Oo + ")";
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f79274OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f79275OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f79276OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f79277OooO0Oo;

        public OooO0OO(View view, TextView textView, TextView textView2, ImageView imageView) {
            this.f79274OooO00o = view;
            this.f79275OooO0O0 = textView;
            this.f79276OooO0OO = textView2;
            this.f79277OooO0Oo = imageView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return OooOOO0.OooO0O0(this.f79274OooO00o, oooO0OO.f79274OooO00o) && OooOOO0.OooO0O0(this.f79275OooO0O0, oooO0OO.f79275OooO0O0) && OooOOO0.OooO0O0(this.f79276OooO0OO, oooO0OO.f79276OooO0OO) && OooOOO0.OooO0O0(this.f79277OooO0Oo, oooO0OO.f79277OooO0Oo);
        }

        public final int hashCode() {
            int iHashCode = (this.f79276OooO0OO.hashCode() + ((this.f79275OooO0O0.hashCode() + (this.f79274OooO00o.hashCode() * 31)) * 31)) * 31;
            ImageView imageView = this.f79277OooO0Oo;
            return iHashCode + (imageView == null ? 0 : imageView.hashCode());
        }

        public final String toString() {
            return "NavRow(root=" + this.f79274OooO00o + ", valueView=" + this.f79275OooO0O0 + ", titleView=" + this.f79276OooO0OO + ", iconView=" + this.f79277OooO0Oo + ")";
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.PageSettingsFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23830OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public C23830OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(PageSettingsFragment.this).OooO0o(R.id.nav_graph_global_settings);
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79279OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79279OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f79279OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.PageSettingsFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23831OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79280OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23831OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79280OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f79280OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.PageSettingsFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23832OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79281OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23832OooO0oO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79281OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = PageSettingsFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f79281OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public PageSettingsFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23830OooO0Oo());
        C23831OooO0o0 c23831OooO0o0 = new C23831OooO0o0(c32447OooOOoOooO0OO);
        this.f79256OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30623OooOOOO.class), c23831OooO0o0, new C23832OooO0oO(c32447OooOOoOooO0OO), new OooO0o(c32447OooOOoOooO0OO));
        this.f79263Oooo0O0 = true;
        this.f79265Oooo0o = true;
    }

    public static String OooOoO(int i) {
        return C21650OooOoO.OooO00o(i, "%");
    }

    public static OooO0OO OooOoo0(PageSettingsFragment pageSettingsFragment, View view, int i, int i2) {
        View viewFindViewById = view.findViewById(i);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.tv_value);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.iv_icon);
        textView.setText(i2);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        textView2.setText("");
        return new OooO0OO(viewFindViewById, textView2, textView, imageView);
    }

    public final C30623OooOOOO OooOoOO() {
        return (C30623OooOOOO) this.f79256OooOoo0.getValue();
    }

    public final void OooOoo(int i) {
        OooO00o oooO00o = this.f79255OooOoo;
        if (oooO00o == null) {
            OooOOO0.OooOOOO("flipDirectionRow");
            throw null;
        }
        oooO00o.f79268OooO0O0.setSelected(i == 0);
        OooO00o oooO00o2 = this.f79255OooOoo;
        if (oooO00o2 != null) {
            oooO00o2.f79269OooO0OO.setSelected(i == 1);
        } else {
            OooOOO0.OooOOOO("flipDirectionRow");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_page_settings, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        o00000OO o00000oo2 = this.f79266Oooo0o0;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.item_flip_direction);
        SelectableSymbolButtonView selectableSymbolButtonView = (SelectableSymbolButtonView) viewFindViewById.findViewById(R.id.iv_flip_direction_vertical);
        SelectableSymbolButtonView selectableSymbolButtonView2 = (SelectableSymbolButtonView) viewFindViewById.findViewById(R.id.iv_flip_direction_horizontal);
        selectableSymbolButtonView.setToggleOnClick(false);
        selectableSymbolButtonView2.setToggleOnClick(false);
        int i2 = 4;
        selectableSymbolButtonView.setOnClickListener(new ViewOnClickListenerC28426OooOo0(this, i2));
        selectableSymbolButtonView2.setOnClickListener(new ViewOnClickListenerC29007OooOo0(this, i2));
        this.f79255OooOoo = new OooO00o(viewFindViewById, selectableSymbolButtonView, selectableSymbolButtonView2);
        OooOoo(((Number) OooOoOO().f109583OooOOOo.f121747OooOo0o.getValue()).intValue());
        OooO0OO oooO0OOOooOoo0 = OooOoo0(this, view, R.id.item_flip_mode, R.string.page_flip_mode);
        this.f79257OooOooO = oooO0OOOooOoo0;
        oooO0OOOooOoo0.f79274OooO00o.setOnClickListener(new ViewOnClickListenerC28141OooO0oO(this, 7));
        OooO0OO oooO0OOOooOoo02 = OooOoo0(this, view, R.id.item_add_page_mode, R.string.page_add_mode);
        this.f79258OooOooo = oooO0OOOooOoo02;
        oooO0OOOooOoo02.f79274OooO00o.setOnClickListener(new OooOO0O(this, 6));
        OooO0OO oooO0OOOooOoo03 = OooOoo0(this, view, R.id.item_page_number_position, R.string.page_number_position);
        this.f79260Oooo000 = oooO0OOOooOoo03;
        oooO0OOOooOoo03.f79274OooO00o.setOnClickListener(new ViewOnClickListenerC28142OooO0oo(this, 6));
        View viewFindViewById2 = view.findViewById(R.id.page_free_move_card);
        SwitchListItemView switchListItemView = (SwitchListItemView) viewFindViewById2.findViewById(R.id.toggle_list_item_page_free_move);
        SeekBar seekBar = (SeekBar) viewFindViewById2.findViewById(R.id.page_free_move_seekbar);
        TextView textView = (TextView) viewFindViewById2.findViewById(R.id.page_free_move_value);
        textView.setText(OooOoO(seekBar.getProgress()));
        OooOOO0.OooO0Oo(switchListItemView);
        this.f79261Oooo00O = new OooO0O0(viewFindViewById2, switchListItemView, seekBar, textView);
        OooO0OO oooO0OOOooOoo04 = OooOoo0(this, view, R.id.pdf_text_selection_container, R.string.pdf_text_selection);
        this.f79262Oooo00o = oooO0OOOooOoo04;
        int iIntValue = ((Number) OooOoOO().f109573OooO0o.f121747OooOo0o.getValue()).intValue();
        if (iIntValue == 0) {
            i = R.string.pdf_selection_mode_disable;
        } else if (iIntValue == 1) {
            i = R.string.pdf_selection_mode_enable;
        } else {
            if (iIntValue != 2) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iIntValue, "Unknown mode: "));
            }
            i = R.string.pdf_selection_mode_finger_only;
        }
        oooO0OOOooOoo04.f79275OooO0O0.setText(getString(i));
        OooO0OO oooO0OO = this.f79262Oooo00o;
        if (oooO0OO == null) {
            OooOOO0.OooOOOO("pdfTextSelectionRow");
            throw null;
        }
        oooO0OO.f79274OooO00o.setOnClickListener(new com.google.android.material.search.OooOOO0(this, 5));
        this.f79259Oooo0 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_pen_with_scale);
        OooO0O0 oooO0O0 = this.f79261Oooo00O;
        if (oooO0O0 == null) {
            OooOOO0.OooOOOO("pageFreeMoveCard");
            throw null;
        }
        oooO0O0.f79271OooO0O0.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOooOO.OooO0o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                PageSettingsFragment pageSettingsFragment = this.f111167OooOo0o;
                if (!pageSettingsFragment.f79263Oooo0O0 || !zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (((Boolean) pageSettingsFragment.OooOoOO().f109579OooOO0o.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoOO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30642Oooo00O(c30623OooOOOOOooOoOO, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView2 = this.f79259Oooo0;
        if (switchListItemView2 == null) {
            OooOOO0.OooOOOO("penWithScaleToggle");
            throw null;
        }
        switchListItemView2.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOooOO.OooO0oO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                PageSettingsFragment pageSettingsFragment = this.f111168OooOo0o;
                if (!pageSettingsFragment.f79265Oooo0o || !zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (((Boolean) pageSettingsFragment.OooOoOO().f109582OooOOOO.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoOO = pageSettingsFragment.OooOoOO();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoOO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30647Oooo0o0(c30623OooOOOOOooOoOO, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        OooO0O0 oooO0O02 = this.f79261Oooo00O;
        if (oooO0O02 == null) {
            OooOOO0.OooOOOO("pageFreeMoveCard");
            throw null;
        }
        oooO0O02.f79272OooO0OO.setMax(100);
        OooO0O0 oooO0O03 = this.f79261Oooo00O;
        if (oooO0O03 == null) {
            OooOOO0.OooOOOO("pageFreeMoveCard");
            throw null;
        }
        oooO0O03.f79272OooO0OO.setOnSeekBarChangeListener(new com.orion.notein.p607ui.settings.page.OooO0OO(this));
        o00000OO o00000oo2 = this.f79266Oooo0o0;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f79266Oooo0o0 = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.settings.page.OooO0O0(this, null), 3);
    }
}
