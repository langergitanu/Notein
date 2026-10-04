package com.orion.notein.p607ui.settings.assistlineandshapes;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
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
import com.orion.notein.p607ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o00oo0Oo.C25713Oooo;
import o0O0oooO.C26320o0000OoO;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30648Oooo0oO;
import o0o0OoO.C30665OooO0oO;
import o0o0OoO.C30669OooOO0o;
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
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/settings/assistlineandshapes/ToolAssistLineAndShapesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ToolAssistLineAndShapesFragment extends Hilt_ToolAssistLineAndShapesFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C32447OooOOo f78996OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78997OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public SwitchListItemView f78998OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public SwitchListItemView f78999OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public SwitchListItemView f79000Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public SwitchListItemView f79001Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public SwitchListItemView f79002Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SwitchListItemView f79003Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public OooO00o f79004Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public o00000OO f79005Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public o00000OO f79006Oooo0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f79007OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f79008OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f79009OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SeekBar f79010OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f79011OooO0o0 = false;

        public OooO00o(View view, TextView textView, TextView textView2, SeekBar seekBar) {
            this.f79007OooO00o = view;
            this.f79008OooO0O0 = textView;
            this.f79009OooO0OO = textView2;
            this.f79010OooO0Oo = seekBar;
        }

        public final void OooO00o(boolean z) {
            this.f79007OooO00o.setAlpha(z ? 1.0f : 0.5f);
            this.f79010OooO0Oo.setEnabled(z);
            this.f79008OooO0O0.setEnabled(z);
            this.f79009OooO0OO.setEnabled(z);
        }

        public final void OooO0O0(int i) {
            this.f79009OooO0OO.setText(i + "%");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f79007OooO00o.equals(oooO00o.f79007OooO00o) && this.f79008OooO0O0.equals(oooO00o.f79008OooO0O0) && this.f79009OooO0OO.equals(oooO00o.f79009OooO0OO) && this.f79010OooO0Oo.equals(oooO00o.f79010OooO0Oo) && this.f79011OooO0o0 == oooO00o.f79011OooO0o0;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f79011OooO0o0) + ((this.f79010OooO0Oo.hashCode() + ((this.f79009OooO0OO.hashCode() + ((this.f79008OooO0O0.hashCode() + (this.f79007OooO00o.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "SeekBarRow(root=" + this.f79007OooO00o + ", titleView=" + this.f79008OooO0O0 + ", valueView=" + this.f79009OooO0OO + ", seekBar=" + this.f79010OooO0Oo + ", userChanging=" + this.f79011OooO0o0 + ")";
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ToolAssistLineAndShapesFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ToolAssistLineAndShapesFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23801OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23801OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return ToolAssistLineAndShapesFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79015OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79015OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f79015OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23802OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public C23802OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(ToolAssistLineAndShapesFragment.this).OooO0o(R.id.nav_graph_global_settings);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23803OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79017OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23803OooO0oO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79017OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f79017OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23804OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79018OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23804OooO0oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79018OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ToolAssistLineAndShapesFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f79018OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public ToolAssistLineAndShapesFragment() {
        super(R.layout.fragment_tool_assist_line_shapes);
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23802OooO0o0());
        OooO0o oooO0o = new OooO0o(c32447OooOOoOooO0OO);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78997OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30623OooOOOO.class), oooO0o, new C23804OooO0oo(c32447OooOOoOooO0OO), new C23803OooO0oO(c32447OooOOoOooO0OO));
        new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23801OooO0Oo(), new OooO0OO());
        this.f78996OooOoo = C20519OooO0Oo.OooO0OO(new C25713Oooo(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30669OooOO0o c30669OooOO0o;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30669OooOO0o) {
            c30669OooOO0o = (C30669OooOO0o) abstractC32479OooO0OO;
            int i2 = c30669OooOO0o.f109731OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30669OooOO0o.f109731OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30669OooOO0o = new C30669OooOO0o(toolAssistLineAndShapesFragment, abstractC32479OooO0OO);
            }
        }
        C30669OooOO0o c30669OooOO0o2 = c30669OooOO0o;
        Object objShowNonVipFeatureLimitedDialog$default = c30669OooOO0o2.f109730OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30669OooOO0o2.f109731OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = toolAssistLineAndShapesFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30669OooOO0o2.f109731OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30669OooOO0o2, 6, null);
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

    public final C30623OooOOOO OooOoOO() {
        return (C30623OooOOOO) this.f78997OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        o00000OO o00000oo2 = this.f79005Oooo0OO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        o00000OO o00000oo3 = this.f79006Oooo0o0;
        if (o00000oo3 != null) {
            o00000oo3.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        SwitchListItemView switchListItemView = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_one_stroke_to_shape);
        this.f78998OooOooO = switchListItemView;
        if (switchListItemView == null) {
            OooOOO0.OooOOOO("oneStrokeToggle");
            throw null;
        }
        switchListItemView.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0OoO.OooO00o
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C30623OooOOOO c30623OooOOOOOooOoOO = this.f109704OooOo0o.OooOoOO();
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30623OooOOOOOooOoOO), null, null, new o0o0Oo0O.Oooo0(c30623OooOOOOOooOoOO, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView2 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_show_assist_lines);
        this.f78999OooOooo = switchListItemView2;
        if (switchListItemView2 == null) {
            OooOOO0.OooOOOO("showGuidesToggle");
            throw null;
        }
        switchListItemView2.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0OoO.OooO0O0
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109705OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = toolAssistLineAndShapesFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30666OooO0oo(toolAssistLineAndShapesFragment, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView3 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_shape_alignment);
        this.f79001Oooo000 = switchListItemView3;
        if (switchListItemView3 == null) {
            OooOOO0.OooOOOO("alignmentToggle");
            throw null;
        }
        switchListItemView3.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0OoO.OooO0OO
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109706OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = toolAssistLineAndShapesFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30658OooO(toolAssistLineAndShapesFragment, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView4 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_angle_correction);
        this.f79002Oooo00O = switchListItemView4;
        if (switchListItemView4 == null) {
            OooOOO0.OooOOOO("angleCorrectionToggle");
            throw null;
        }
        switchListItemView4.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0OoO.OooO0Oo
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109707OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = toolAssistLineAndShapesFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30667OooOO0(toolAssistLineAndShapesFragment, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView5 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_direct_edit_line);
        this.f79003Oooo00o = switchListItemView5;
        if (switchListItemView5 == null) {
            OooOOO0.OooOOOO("directEditLineToggle");
            throw null;
        }
        switchListItemView5.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0OoO.OooO0o0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109709OooOo0o;
                if (((Boolean) toolAssistLineAndShapesFragment.OooOoOO().f109601Oooo00O.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoOO = toolAssistLineAndShapesFragment.OooOoOO();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoOO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30648Oooo0oO(c30623OooOOOOOooOoOO, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView6 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_shape_fill);
        this.f79000Oooo0 = switchListItemView6;
        if (switchListItemView6 == null) {
            OooOOO0.OooOOOO("fillShapeToggle");
            throw null;
        }
        switchListItemView6.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0OoO.OooO0o
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment = this.f109708OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = toolAssistLineAndShapesFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30668OooOO0O(toolAssistLineAndShapesFragment, zBooleanValue, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        View viewFindViewById = view.findViewById(R.id.shape_fill_opacity_row);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.shape_fill_opacity_label);
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.shape_fill_opacity_value);
        SeekBar seekBar = (SeekBar) viewFindViewById.findViewById(R.id.shape_fill_opacity_seekbar);
        textView2.setText(seekBar.getProgress() + "%");
        OooOOO0.OooO0Oo(textView);
        this.f79004Oooo0O0 = new OooO00o(viewFindViewById, textView, textView2, seekBar);
        seekBar.setMax(100);
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(((Number) OooOoOO().f109600Oooo000.f121747OooOo0o.getValue()).floatValue() * 100);
        OooO00o oooO00o = this.f79004Oooo0O0;
        if (oooO00o == null) {
            OooOOO0.OooOOOO("fillOpacityRow");
            throw null;
        }
        SeekBar seekBar2 = oooO00o.f79010OooO0Oo;
        if (seekBar2.getProgress() != iOooO0O0) {
            seekBar2.setProgress(iOooO0O0);
        }
        oooO00o.OooO0O0(iOooO0O0);
        OooO00o oooO00o2 = this.f79004Oooo0O0;
        if (oooO00o2 == null) {
            OooOOO0.OooOOOO("fillOpacityRow");
            throw null;
        }
        oooO00o2.OooO00o(((Boolean) OooOoOO().f109598OooOooo.f121747OooOo0o.getValue()).booleanValue());
        OooO00o oooO00o3 = this.f79004Oooo0O0;
        if (oooO00o3 == null) {
            OooOOO0.OooOOOO("fillOpacityRow");
            throw null;
        }
        oooO00o3.f79010OooO0Oo.setOnSeekBarChangeListener(new com.orion.notein.p607ui.settings.assistlineandshapes.OooO0O0(this));
        o00000OO o00000oo2 = this.f79005Oooo0OO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f79005Oooo0OO = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.settings.assistlineandshapes.OooO00o(this, null), 3);
        o00000OO o00000oo3 = this.f79006Oooo0o0;
        if (o00000oo3 != null) {
            o00000oo3.cancel((CancellationException) null);
        }
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        this.f79006Oooo0o0 = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30665OooO0oO(this, null), 3);
    }
}
