package com.orion.notein.p607ui.settings.tool;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.C21650OooOoO;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.ViewOnClickListenerC28330OooOoO0;
import o0Ooo0oo.ViewOnClickListenerC29465OooOoo;
import o0o0Oo0O.C30610OooO00o;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30627OooOOoo;
import o0o0Oo0O.C30635OooOoOO;
import o0o0Oo0O.C30636OooOoo;
import o0oOOoo0.C30877OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/ui/settings/tool/ToolSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ToolSettingsFragment extends Hilt_ToolSettingsFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o00000OO f79372OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79373OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f79374OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public OooO00o f79375OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public SwitchListItemView f79376Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public SwitchListItemView f79377Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public SwitchListItemView f79378Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SwitchListItemView f79379Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public SwitchListItemView f79380Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public SwitchListItemView f79381Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public SwitchListItemView f79382Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public SwitchListItemView f79383Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO0O0 f79384Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f79385Oooo0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f79386OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f79387OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f79388OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f79389OooO0Oo;

        public OooO00o(View view, TextView textView, TextView textView2, ImageView imageView) {
            this.f79386OooO00o = view;
            this.f79387OooO0O0 = textView;
            this.f79388OooO0OO = textView2;
            this.f79389OooO0Oo = imageView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f79386OooO00o, oooO00o.f79386OooO00o) && OooOOO0.OooO0O0(this.f79387OooO0O0, oooO00o.f79387OooO0O0) && OooOOO0.OooO0O0(this.f79388OooO0OO, oooO00o.f79388OooO0OO) && OooOOO0.OooO0O0(this.f79389OooO0Oo, oooO00o.f79389OooO0Oo);
        }

        public final int hashCode() {
            int iHashCode = (this.f79388OooO0OO.hashCode() + ((this.f79387OooO0O0.hashCode() + (this.f79386OooO00o.hashCode() * 31)) * 31)) * 31;
            ImageView imageView = this.f79389OooO0Oo;
            return iHashCode + (imageView == null ? 0 : imageView.hashCode());
        }

        public final String toString() {
            return "NavRow(root=" + this.f79386OooO00o + ", titleView=" + this.f79387OooO0O0 + ", valueView=" + this.f79388OooO0OO + ", iconView=" + this.f79389OooO0Oo + ")";
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f79390OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SwitchListItemView f79391OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SeekBar f79392OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f79393OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f79394OooO0o0 = true;

        public OooO0O0(View view, SwitchListItemView switchListItemView, SeekBar seekBar, TextView textView) {
            this.f79390OooO00o = view;
            this.f79391OooO0O0 = switchListItemView;
            this.f79392OooO0OO = seekBar;
            this.f79393OooO0Oo = textView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f79390OooO00o.equals(oooO0O0.f79390OooO00o) && this.f79391OooO0O0.equals(oooO0O0.f79391OooO0O0) && this.f79392OooO0OO.equals(oooO0O0.f79392OooO0OO) && this.f79393OooO0Oo.equals(oooO0O0.f79393OooO0Oo) && this.f79394OooO0o0 == oooO0O0.f79394OooO0o0;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f79394OooO0o0) + ((this.f79393OooO0Oo.hashCode() + ((this.f79392OooO0OO.hashCode() + ((this.f79391OooO0O0.hashCode() + (this.f79390OooO00o.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "PressureCard(root=" + this.f79390OooO00o + ", toggle=" + this.f79391OooO0O0 + ", seekBar=" + this.f79392OooO0OO + ", valueView=" + this.f79393OooO0Oo + ", toggleListenerEnabled=" + this.f79394OooO0o0 + ")";
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(ToolSettingsFragment.this).OooO0o(R.id.nav_graph_global_settings);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.ToolSettingsFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23840OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79396OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23840OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79396OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f79396OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79397OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79397OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ToolSettingsFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f79397OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.ToolSettingsFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23841OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79399OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23841OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79399OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f79399OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public ToolSettingsFragment() {
        super(R.layout.fragment_tool_settings);
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0OO());
        C23840OooO0Oo c23840OooO0Oo = new C23840OooO0Oo(c32447OooOOoOooO0OO);
        this.f79373OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30623OooOOOO.class), c23840OooO0Oo, new OooO0o(c32447OooOOoOooO0OO), new C23841OooO0o0(c32447OooOOoOooO0OO));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(ToolSettingsFragment toolSettingsFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30877OooOOOo c30877OooOOOo;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30877OooOOOo) {
            c30877OooOOOo = (C30877OooOOOo) abstractC32479OooO0OO;
            int i2 = c30877OooOOOo.f110359OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30877OooOOOo.f110359OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30877OooOOOo = new C30877OooOOOo(toolSettingsFragment, abstractC32479OooO0OO);
            }
        }
        C30877OooOOOo c30877OooOOOo2 = c30877OooOOOo;
        Object objShowNonVipFeatureLimitedDialog$default = c30877OooOOOo2.f110358OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30877OooOOOo2.f110359OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = toolSettingsFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30877OooOOOo2.f110359OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30877OooOOOo2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public static String OooOoOO(int i) {
        return C21650OooOoO.OooO00o(i, "%");
    }

    public final C30623OooOOOO OooOoo0() {
        return (C30623OooOOOO) this.f79373OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_tool_settings, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        o00000OO o00000oo2 = this.f79372OooOoo;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.item_tool_bar_style);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.tv_value);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.iv_icon);
        textView.setText(R.string.tool_bar_style);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        textView2.setText("");
        this.f79375OooOooo = new OooO00o(viewFindViewById, textView, textView2, imageView);
        textView2.setText(((Boolean) OooOoo0().f109586OooOOoo.f121747OooOo0o.getValue()).booleanValue() ? getString(R.string.immersive_toolbar) : getString(R.string.traditional_toolbar));
        OooO00o oooO00o = this.f79375OooOooo;
        if (oooO00o == null) {
            OooOOO0.OooOOOO("toolbarModeRow");
            throw null;
        }
        oooO00o.f79386OooO00o.setOnClickListener(new ViewOnClickListenerC28330OooOoO0(this, 3));
        SwitchListItemView switchListItemView = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_show_tab_box);
        this.f79377Oooo000 = switchListItemView;
        if (switchListItemView == null) {
            OooOOO0.OooOOOO("showTabToggle");
            throw null;
        }
        switchListItemView.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO0OO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolSettingsFragment toolSettingsFragment = this.f110335OooOo0o;
                if (((Boolean) toolSettingsFragment.OooOoo0().f109580OooOOO.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30873OooOO0o(toolSettingsFragment, zBooleanValue, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView2 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_stylus_finger_switch);
        this.f79378Oooo00O = switchListItemView2;
        if (switchListItemView2 == null) {
            OooOOO0.OooOOOO("stylusQuickToggle");
            throw null;
        }
        switchListItemView2.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO0Oo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolSettingsFragment toolSettingsFragment = this.f110336OooOo0o;
                if (((Boolean) toolSettingsFragment.OooOoo0().f109587OooOo.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoo0);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30627OooOOoo(c30623OooOOOOOooOoo0, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView3 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_global_toolbox);
        this.f79379Oooo00o = switchListItemView3;
        if (switchListItemView3 == null) {
            OooOOO0.OooOOOO("globalToolboxToggle");
            throw null;
        }
        switchListItemView3.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO0o0
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolSettingsFragment toolSettingsFragment = this.f110338OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30875OooOOO0(toolSettingsFragment, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView4 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_sticky_pen_box);
        this.f79376Oooo0 = switchListItemView4;
        if (switchListItemView4 == null) {
            OooOOO0.OooOOOO("stickyPenBoxToggle");
            throw null;
        }
        switchListItemView4.setOnCheckedChangeListener(new C30610OooO00o(this, 1));
        SwitchListItemView switchListItemView5 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_show_dual_link_icon);
        this.f79380Oooo0O0 = switchListItemView5;
        if (switchListItemView5 == null) {
            OooOOO0.OooOOOO("dualLinkIconToggle");
            throw null;
        }
        switchListItemView5.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO0o
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                ToolSettingsFragment toolSettingsFragment = this.f110337OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30874OooOOO(toolSettingsFragment, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView6 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_show_hyperlink_icon);
        this.f79381Oooo0OO = switchListItemView6;
        if (switchListItemView6 == null) {
            OooOOO0.OooOOOO("hyperlinkIconToggle");
            throw null;
        }
        switchListItemView6.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO0oO
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolSettingsFragment toolSettingsFragment = this.f110339OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30876OooOOOO(toolSettingsFragment, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView7 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_show_move_layer_icon);
        this.f79383Oooo0o0 = switchListItemView7;
        if (switchListItemView7 == null) {
            OooOOO0.OooOOOO("moveLayerIconToggle");
            throw null;
        }
        switchListItemView7.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO0oo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolSettingsFragment toolSettingsFragment = this.f110340OooOo0o;
                if (((Boolean) toolSettingsFragment.OooOoo0().f109576OooO0oo.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoo0);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30635OooOoOO(c30623OooOOOOOooOoo0, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView8 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_non_stylus_pressure);
        this.f79382Oooo0o = switchListItemView8;
        if (switchListItemView8 == null) {
            OooOOO0.OooOOOO("nonStylusToggle");
            throw null;
        }
        switchListItemView8.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolSettingsFragment toolSettingsFragment = this.f110332OooOo0o;
                if (((Boolean) toolSettingsFragment.OooOoo0().f109575OooO0oO.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoo0);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30636OooOoo(c30623OooOOOOOooOoo0, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.item_pen_press_card);
        OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
        SwitchListItemView switchListItemView9 = (SwitchListItemView) viewFindViewById2.findViewById(R.id.toggle_list_item_pen_press);
        SeekBar seekBar = (SeekBar) viewFindViewById2.findViewById(R.id.pen_press_seekbar);
        TextView textView3 = (TextView) viewFindViewById2.findViewById(R.id.pen_press_value);
        seekBar.setMax(100);
        textView3.setText(OooOoOO(seekBar.getProgress()));
        OooOOO0.OooO0Oo(switchListItemView9);
        final OooO0O0 oooO0O0 = new OooO0O0(viewFindViewById2, switchListItemView9, seekBar, textView3);
        switchListItemView9.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0oOOoo0.OooO0O0
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                ToolSettingsFragment.OooO0O0 oooO0O02 = oooO0O0;
                if (!oooO0O02.f79394OooO0o0 || !zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolSettingsFragment toolSettingsFragment = this;
                InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.settings.tool.OooO0O0(toolSettingsFragment, oooO0O02, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        seekBar.setOnSeekBarChangeListener(new com.orion.notein.p607ui.settings.tool.OooO0OO(oooO0O0, this));
        this.f79384Oooo0oO = oooO0O0;
        View viewFindViewById3 = view.findViewById(R.id.item_fast_translate);
        this.f79385Oooo0oo = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("fastTranslateToggle");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC29465OooOoo(this, 2));
        o00000OO o00000oo2 = this.f79372OooOoo;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f79372OooOoo = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.settings.tool.OooO00o(this, null), 3);
    }
}
