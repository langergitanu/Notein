package com.orion.notein.p607ui.export;

import OooOoOO.C20519OooO0Oo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000O0oO.OooO0o;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26299OoooOOo;
import o0OO00o0.o000Oo0;
import o0Oo0o0o.C28225OooO0O0;
import o0Oo0o0o.C28229OooO0o0;
import o0Oo0o0o.C28230OooO0oO;
import o0Oo0o0o.ViewOnClickListenerC28224OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/export/AddWaterMarkFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AddWaterMarkFragment extends Hilt_AddWaterMarkFragment {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final List<Integer> f71503Oooo000 = C34429OooOOo0.OooOO0o(Integer.valueOf(R.string.default_water_mark), Integer.valueOf(R.string.no_water_mark), Integer.valueOf(R.string.custom_water_mark));

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f71504OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(com.orion.notein.p607ui.export.OooO0O0.class), new OooO00o(), new OooO0OO(), new OooO0O0());

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C32447OooOOo f71505OooOooo = C20519OooO0Oo.OooO0OO(new OooO0o(this, 2));

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return AddWaterMarkFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return AddWaterMarkFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return AddWaterMarkFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(AddWaterMarkFragment addWaterMarkFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28229OooO0o0 c28229OooO0o0;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C28229OooO0o0) {
            c28229OooO0o0 = (C28229OooO0o0) abstractC32479OooO0OO;
            int i2 = c28229OooO0o0.f100068OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28229OooO0o0.f100068OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c28229OooO0o0 = new C28229OooO0o0(addWaterMarkFragment, abstractC32479OooO0OO);
            }
        }
        C28229OooO0o0 c28229OooO0o02 = c28229OooO0o0;
        Object objShowNonVipFeatureLimitedDialog$default = c28229OooO0o02.f100067OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28229OooO0o02.f100068OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = addWaterMarkFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c28229OooO0o02.f100068OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c28229OooO0o02, 6, null);
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_add_water_mark, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C22026ooOO c22026ooOO = this.f71504OooOooO;
        C28230OooO0oO.OooO00o("vm.showVipBadge : " + ((com.orion.notein.p607ui.export.OooO0O0) c22026ooOO.getValue()).f71708OooO0o.f121747OooOo0o.getValue() + ".");
        View viewFindViewById = view.findViewById(R.id.btn_back);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC26299OoooOOo(this, 1));
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(requireContext().getString(R.string.back));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_title);
        if (textView2 != null) {
            textView2.setText(requireContext().getString(R.string.add_water_mark));
        }
        View viewFindViewById2 = view.findViewById(R.id.btn_close);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28224OooO00o(this, 0));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.settings);
        if (recyclerView != null) {
            recyclerView.setAdapter((C23110OooO0oo) this.f71505OooOooo.getValue());
        }
        C25252OooO0Oo.OooOo0o(new o000Oo0(((com.orion.notein.p607ui.export.OooO0O0) c22026ooOO.getValue()).f71710OooO0oO, new com.orion.notein.p607ui.export.OooO00o(this, null), 1), C21989OooOooO.OooO00o(this));
        C21904OooOoo0.OooO0oO(this, "key_result_for_text", new C28225OooO0O0(this, 0));
    }
}
