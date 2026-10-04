package com.orion.notein.p607ui.settings.appearance;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.appearance.AppearanceSettingsFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0OoO000.ViewOnClickListenerC28589o0000oO;
import o0o000OO.ViewOnClickListenerC29750OooO0O0;
import o0o00oO0.ViewOnClickListenerC29991OooO0oo;
import o0o0Oo0O.C30621OooOOO;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30633OooOoO;
import o0o0Oo0o.C30656OooO0oO;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/settings/appearance/AppearanceSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AppearanceSettingsFragment extends Hilt_AppearanceSettingsFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f78904OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78905OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public SelectableSymbolButtonView f78906OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public SelectableSymbolButtonView f78907OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public OooO00o f78908Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public SelectableSymbolButtonView f78909Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public SwitchListItemView f78910Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SwitchListItemView f78911Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public o00000OO f78912Oooo0O0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78913OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78913OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78913OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f78914OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f78915OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f78916OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f78917OooO0Oo;

        public OooO00o(View view, TextView textView, TextView textView2, ImageView imageView) {
            this.f78914OooO00o = view;
            this.f78915OooO0O0 = textView;
            this.f78916OooO0OO = textView2;
            this.f78917OooO0Oo = imageView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f78914OooO00o, oooO00o.f78914OooO00o) && OooOOO0.OooO0O0(this.f78915OooO0O0, oooO00o.f78915OooO0O0) && OooOOO0.OooO0O0(this.f78916OooO0OO, oooO00o.f78916OooO0OO) && OooOOO0.OooO0O0(this.f78917OooO0Oo, oooO00o.f78917OooO0Oo);
        }

        public final int hashCode() {
            int iHashCode = (this.f78916OooO0OO.hashCode() + ((this.f78915OooO0O0.hashCode() + (this.f78914OooO00o.hashCode() * 31)) * 31)) * 31;
            ImageView imageView = this.f78917OooO0Oo;
            return iHashCode + (imageView == null ? 0 : imageView.hashCode());
        }

        public final String toString() {
            return "NavRow(root=" + this.f78914OooO00o + ", titleView=" + this.f78915OooO0O0 + ", valueView=" + this.f78916OooO0OO + ", iconView=" + this.f78917OooO0Oo + ")";
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(AppearanceSettingsFragment.this).OooO0o(R.id.nav_graph_global_settings);
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78919OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78919OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f78919OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23793OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78920OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23793OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78920OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f78920OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return AppearanceSettingsFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23794OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78922OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23794OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78922OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = AppearanceSettingsFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f78922OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23795OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f78924OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23795OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f78924OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78924OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23796OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78925OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23796OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78925OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78925OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78926OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78926OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78926OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? AppearanceSettingsFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AppearanceSettingsFragment() {
        super(R.layout.fragment_appearance_settings);
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0O0());
        OooO0OO oooO0OO = new OooO0OO(c32447OooOOoOooO0OO);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78905OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30623OooOOOO.class), oooO0OO, new C23794OooO0o0(c32447OooOOoOooO0OO), new C23793OooO0Oo(c32447OooOOoOooO0OO));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23795OooO0oO(new OooO0o()));
        this.f78904OooOoo = new C22026ooOO(oooo0.OooO0O0(C30656OooO0oO.class), new C23796OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
    }

    public final C30623OooOOOO OooOoO() {
        return (C30623OooOOOO) this.f78905OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        o00000OO o00000oo2 = this.f78912Oooo0O0;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f78906OooOooO = (SelectableSymbolButtonView) view.findViewById(R.id.iv_day);
        this.f78907OooOooo = (SelectableSymbolButtonView) view.findViewById(R.id.iv_night);
        this.f78909Oooo000 = (SelectableSymbolButtonView) view.findViewById(R.id.iv_auto);
        SelectableSymbolButtonView selectableSymbolButtonView = this.f78906OooOooO;
        if (selectableSymbolButtonView == null) {
            OooOOO0.OooOOOO("ivDayMode");
            throw null;
        }
        selectableSymbolButtonView.setToggleOnClick(false);
        SelectableSymbolButtonView selectableSymbolButtonView2 = this.f78907OooOooo;
        if (selectableSymbolButtonView2 == null) {
            OooOOO0.OooOOOO("ivNightMode");
            throw null;
        }
        selectableSymbolButtonView2.setToggleOnClick(false);
        SelectableSymbolButtonView selectableSymbolButtonView3 = this.f78909Oooo000;
        if (selectableSymbolButtonView3 == null) {
            OooOOO0.OooOOOO("ivAutoMode");
            throw null;
        }
        selectableSymbolButtonView3.setToggleOnClick(false);
        SelectableSymbolButtonView selectableSymbolButtonView4 = this.f78906OooOooO;
        if (selectableSymbolButtonView4 == null) {
            OooOOO0.OooOOOO("ivDayMode");
            throw null;
        }
        selectableSymbolButtonView4.setOnClickListener(new ViewOnClickListenerC29750OooO0O0(this, 2));
        SelectableSymbolButtonView selectableSymbolButtonView5 = this.f78907OooOooo;
        if (selectableSymbolButtonView5 == null) {
            OooOOO0.OooOOOO("ivNightMode");
            throw null;
        }
        selectableSymbolButtonView5.setOnClickListener(new o0o000OO.OooO0OO(this, 2));
        SelectableSymbolButtonView selectableSymbolButtonView6 = this.f78909Oooo000;
        if (selectableSymbolButtonView6 == null) {
            OooOOO0.OooOOOO("ivAutoMode");
            throw null;
        }
        selectableSymbolButtonView6.setOnClickListener(new ViewOnClickListenerC29991OooO0oo(this, 1));
        SwitchListItemView switchListItemView = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_keep_screen_on);
        this.f78910Oooo00O = switchListItemView;
        if (switchListItemView == null) {
            OooOOO0.OooOOOO("keepScreenOnToggle");
            throw null;
        }
        switchListItemView.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0Oo0o.OooO00o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                AppearanceSettingsFragment appearanceSettingsFragment = this.f109687OooOo0o;
                if (((Boolean) appearanceSettingsFragment.OooOoO().f109584OooOOo.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoO = appearanceSettingsFragment.OooOoO();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30633OooOoO(c30623OooOOOOOooOoO, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView2 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_color_inversion);
        this.f78911Oooo00o = switchListItemView2;
        if (switchListItemView2 == null) {
            OooOOO0.OooOOOO("colorInversionToggle");
            throw null;
        }
        switchListItemView2.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0Oo0o.OooO0O0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue2) {
                    return C32460OooOooO.f116667OooO00o;
                }
                AppearanceSettingsFragment appearanceSettingsFragment = this.f109688OooOo0o;
                if (((Boolean) appearanceSettingsFragment.OooOoO().f109591OooOo0o.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30623OooOOOO c30623OooOOOOOooOoO = appearanceSettingsFragment.OooOoO();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30621OooOOO(c30623OooOOOOOooOoO, zBooleanValue, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        View viewFindViewById = view.findViewById(R.id.item_date_format);
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.tv_value);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.iv_icon);
        textView.setText(R.string.global_date_format);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        textView2.setText("");
        this.f78908Oooo0 = new OooO00o(viewFindViewById, textView, textView2, imageView);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28589o0000oO(this, 2));
        o00000OO o00000oo2 = this.f78912Oooo0O0;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f78912Oooo0O0 = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.settings.appearance.OooO00o(this, null), 3);
    }
}
