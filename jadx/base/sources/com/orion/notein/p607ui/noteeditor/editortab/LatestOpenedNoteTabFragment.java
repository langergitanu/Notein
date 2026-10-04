package com.orion.notein.p607ui.noteeditor.editortab;

import OooOOOo.OooOOO0;
import OooOoOO.C20519OooO0Oo;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00oo0Oo.C25714Oooo00O;
import o00oo0Oo.C25719Oooo0o0;
import o0O0oooO.C26320o0000OoO;
import o0OoOoo0.C29226OooO00o;
import o0OoOoo0.C29229OooO0Oo;
import o0OoOoo0.C29238OooOOO0;
import o0OoOoo0.C29247OooOo00;
import o0OoOoo0.C29250OooOoO0;
import o0o00O00.C29869OooO0Oo;
import o0oOoOoo.C31102OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/editortab/LatestOpenedNoteTabFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LatestOpenedNoteTabFragment extends Hilt_LatestOpenedNoteTabFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public RecyclerView f74468OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f74469OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f74470OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C29226OooO00o f74471OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public OooOo f74472Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ImageView f74473Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C29229OooO0Oo f74474Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C31102OooO00o f74475Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C22026ooOO f74476Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C22026ooOO f74477Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final LinkedHashMap f74478Oooo0o0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74479OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74479OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74479OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return LatestOpenedNoteTabFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return LatestOpenedNoteTabFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return LatestOpenedNoteTabFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteTabFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23421OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C25714Oooo00O f74483OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23421OooO0Oo(C25714Oooo00O c25714Oooo00O) {
            super(0);
            this.f74483OooOo0o = c25714Oooo00O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74483OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74484OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74484OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74484OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteTabFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23422OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74485OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23422OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74485OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74485OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteTabFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23423OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74486OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23423OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74486OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74486OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LatestOpenedNoteTabFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteTabFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23424OooO0oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C25719Oooo0o0 f74488OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23424OooO0oo(C25719Oooo0o0 c25719Oooo0o0) {
            super(0);
            this.f74488OooOo0o = c25719Oooo0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74488OooOo0o.invoke();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74489OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74489OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74489OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74490OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74490OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74490OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LatestOpenedNoteTabFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public LatestOpenedNoteTabFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f74469OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO00o(), new OooO0OO(), new OooO0O0());
        this.f74471OooOooo = new C29226OooO00o();
        C25714Oooo00O c25714Oooo00O = new C25714Oooo00O(this, 1);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23421OooO0Oo(c25714Oooo00O));
        this.f74476Oooo0O0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23422OooO0o0(interfaceC32440OooOO0OooO0O0), new C23423OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23424OooO0oo(new C25719Oooo0o0(this, 1)));
        this.f74477Oooo0OO = new C22026ooOO(oooo0.OooO0O0(C29250OooOoO0.class), new OooO(interfaceC32440OooOO0OooO0O02), new OooOO0O(interfaceC32440OooOO0OooO0O02), new OooOO0(interfaceC32440OooOO0OooO0O02));
        this.f74478Oooo0o0 = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(LatestOpenedNoteTabFragment latestOpenedNoteTabFragment, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29238OooOOO0 c29238OooOOO0;
        latestOpenedNoteTabFragment.getClass();
        if (abstractC32479OooO0OO instanceof C29238OooOOO0) {
            c29238OooOOO0 = (C29238OooOOO0) abstractC32479OooO0OO;
            int i = c29238OooOOO0.f103674OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29238OooOOO0.f103674OooOoO = i - Integer.MIN_VALUE;
            } else {
                c29238OooOOO0 = new C29238OooOOO0(latestOpenedNoteTabFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c29238OooOOO0.f103672OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29238OooOOO0.f103674OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C29250OooOoO0 c29250OooOoO0OooOoo0 = latestOpenedNoteTabFragment.OooOoo0();
            c29238OooOOO0.f103673OooOo0o = latestOpenedNoteTabFragment;
            c29238OooOOO0.f103674OooOoO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29247OooOo00(c29250OooOoO0OooOoo0, str, null), c29238OooOOO0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latestOpenedNoteTabFragment = c29238OooOOO0.f103673OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        String str2 = (String) objOooO0o;
        if (str2 != null) {
            latestOpenedNoteTabFragment.OooOoOO().OooOOoo(str2);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public static void OooOooO(LatestOpenedNoteTabFragment latestOpenedNoteTabFragment) {
        C29229OooO0Oo c29229OooO0Oo = latestOpenedNoteTabFragment.f74474Oooo00O;
        if (c29229OooO0Oo != null) {
            c29229OooO0Oo.f103648OooO0O0.dismiss();
        }
        C31102OooO00o c31102OooO00o = latestOpenedNoteTabFragment.f74475Oooo00o;
        if (c31102OooO00o != null) {
            c31102OooO00o.OooO00o();
        }
        for (Map.Entry entry : latestOpenedNoteTabFragment.f74478Oooo0o0.entrySet()) {
            ((Number) entry.getKey()).intValue();
            Object value = ((InterfaceC32440OooOO0) entry.getValue()).getValue();
            if (value instanceof C29869OooO0Oo) {
                ((C29869OooO0Oo) value).OooO00o();
            }
        }
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OooOoOO() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f74476Oooo0O0.getValue();
    }

    public final LockNoteFragment OooOoo() {
        Fragment fragmentOooOooo = getChildFragmentManager().OooOooo("LockNoteFragment");
        if (fragmentOooOooo != null) {
            return (LockNoteFragment) fragmentOooOooo;
        }
        LockNoteFragment lockNoteFragment = new LockNoteFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
        oooO00oOooO0OO.OooOO0O();
        return lockNoteFragment;
    }

    public final C29250OooOoO0 OooOoo0() {
        return (C29250OooOoO0) this.f74477Oooo0OO.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OooOooO(this);
        this.f74478Oooo0o0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OooOooO(this);
        Oooo0O0.OooOO0.OooO00o(this);
    }
}
