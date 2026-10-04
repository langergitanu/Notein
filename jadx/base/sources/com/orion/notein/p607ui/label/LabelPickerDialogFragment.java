package com.orion.notein.p607ui.label;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.LabelManagementDialogFragment;
import com.orion.notein.p607ui.label.LabelPickerDialogFragment;
import com.orion.notein.p607ui.label.OooO0OO;
import com.orion.notein.p607ui.label.OooOO0O;
import com.orion.notein.p607ui.label.TriStateCheckBox;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0Oo0ooO.C28417OooOO0o;
import o0Oo0ooO.C28420OooOOOO;
import o0Oo0ooO.C28454OoooOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/label/LabelPickerDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabelPickerDialogFragment extends Hilt_LabelPickerDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public RecyclerView f71949Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f71950Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f71951Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f71952Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public com.orion.notein.p607ui.label.OooO0OO f71953Oooo0O0;

    public static final class OooO00o implements OooO0OO.InterfaceC19211OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ View f71955OooO0O0;

        public OooO00o(View view) {
            this.f71955OooO0O0 = view;
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO00o(int i) {
            C23135OooO0o0 c23135OooO0o0Oooo00o = LabelPickerDialogFragment.this.Oooo00o();
            Integer numValueOf = Integer.valueOf(i);
            C33781o00o0O c33781o00o0O = c23135OooO0o0Oooo00o.f72019OooOOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0O0() {
            C23135OooO0o0 c23135OooO0o0Oooo00o = LabelPickerDialogFragment.this.Oooo00o();
            Boolean bool = Boolean.TRUE;
            C33781o00o0O c33781o00o0O = c23135OooO0o0Oooo00o.f72021OooOOOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0OO(String name) {
            OooOOO0.OooO0oO(name, "name");
            C23135OooO0o0 c23135OooO0o0Oooo00o = LabelPickerDialogFragment.this.Oooo00o();
            c23135OooO0o0Oooo00o.f72020OooOOO0.setValue(C33599OooOo0O.Oooooo0(name).toString());
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0Oo(long j, TriStateCheckBox.OooO00o state) {
            OooOOO0.OooO0oO(state, "state");
            int iOrdinal = state.ordinal();
            LabelPickerDialogFragment labelPickerDialogFragment = LabelPickerDialogFragment.this;
            if (iOrdinal == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("LabelPickerDialog");
                c20358OooO00o.OooO00o("addLabelToItems: %s", Long.valueOf(j));
                C23135OooO0o0 c23135OooO0o0Oooo00o = labelPickerDialogFragment.Oooo00o();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23135OooO0o0Oooo00o);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28417OooOO0o(c23135OooO0o0Oooo00o, j, null), 2);
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("LabelPickerDialog");
            c20358OooO00o2.OooO00o("removeLabelFromItems: %s", Long.valueOf(j));
            C23135OooO0o0 c23135OooO0o0Oooo00o2 = labelPickerDialogFragment.Oooo00o();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c23135OooO0o0Oooo00o2);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28420OooOOOO(c23135OooO0o0Oooo00o2, j, null), 2);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0o() {
            LabelPickerDialogFragment labelPickerDialogFragment = LabelPickerDialogFragment.this;
            labelPickerDialogFragment.Oooo00o().OooO0oO();
            labelPickerDialogFragment.Oooo0(this.f71955OooO0O0);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0o0(int i, String name) {
            OooOOO0.OooO0oO(name, "name");
            LabelPickerDialogFragment labelPickerDialogFragment = LabelPickerDialogFragment.this;
            String string = C33599OooOo0O.Oooooo0(name).toString();
            InterfaceC21987OooOoo viewLifecycleOwner = labelPickerDialogFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28454OoooOOo(labelPickerDialogFragment, string, i, null), 3);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelPickerDialogFragment$onViewCreated$3", m80623f = "LabelPickerDialogFragment.kt", m80624l = {114}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71957OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelPickerDialogFragment$onViewCreated$3$1", m80623f = "LabelPickerDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends OooOO0O>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LabelPickerDialogFragment f71958OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71959OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(LabelPickerDialogFragment labelPickerDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f71958OooOo = labelPickerDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f71958OooOo, continuation);
                oooO00o.f71959OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends OooOO0O> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) this.f71959OooOo0o;
                LabelPickerDialogFragment labelPickerDialogFragment = this.f71958OooOo;
                Object objOooo = OooOo.Oooo(list);
                OooOO0O.OooO00o oooO00o = objOooo instanceof OooOO0O.OooO00o ? (OooOO0O.OooO00o) objOooo : null;
                boolean z = false;
                if (oooO00o != null && oooO00o.f72062OooO00o) {
                    z = true;
                }
                com.orion.notein.p607ui.label.OooO0OO oooO0OO = labelPickerDialogFragment.f71953Oooo0O0;
                if (oooO0OO != null) {
                    oooO0OO.OooO0o0(list, new com.google.firebase.installations.OooO0O0(z, labelPickerDialogFragment));
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("labelListAdapter");
                throw null;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LabelPickerDialogFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71957OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LabelPickerDialogFragment labelPickerDialogFragment = LabelPickerDialogFragment.this;
                C23135OooO0o0 c23135OooO0o0Oooo00o = labelPickerDialogFragment.Oooo00o();
                OooO00o oooO00o = new OooO00o(labelPickerDialogFragment, null);
                this.f71957OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23135OooO0o0Oooo00o.f72022OooOOOo, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return LabelPickerDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelPickerDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23128OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f71961OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23128OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f71961OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71961OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71962OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71962OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71962OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelPickerDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23129OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71963OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23129OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71963OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71963OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelPickerDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23130OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71964OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23130OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71964OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71964OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LabelPickerDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public LabelPickerDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23128OooO0Oo(new OooO0OO()));
        this.f71950Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C23135OooO0o0.class), new C23129OooO0o0(interfaceC32440OooOO0OooO0O0), new C23130OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.dialog_card);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.label_picker_dialog_host;
    }

    public final void Oooo0(View view) {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public final C23135OooO0o0 Oooo00o() {
        return (C23135OooO0o0) this.f71950Oooo000.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Object arrayList;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Parcelable[] parcelableArray = requireArguments().getParcelableArray(FirebaseAnalytics.Param.ITEMS);
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                ItemData itemData = parcelable instanceof ItemData ? (ItemData) parcelable : null;
                if (itemData != null) {
                    arrayList.add(itemData);
                }
            }
        } else {
            arrayList = C34434OooOoO.f123453OooOo0o;
        }
        C33781o00o0O c33781o00o0O = Oooo00o().f72017OooOO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayList);
        this.f71951Oooo00O = view.findViewById(R.id.btn_close);
        this.f71952Oooo00o = view.findViewById(R.id.edit_labels_button);
        this.f71949Oooo0 = (RecyclerView) view.findViewById(R.id.label_list);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o0Oo0ooO.o000oOoO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabelPickerDialogFragment labelPickerDialogFragment = this.f100855OooOo0o;
                labelPickerDialogFragment.Oooo00o().OooO0oO();
                labelPickerDialogFragment.Oooo0(view);
                labelPickerDialogFragment.dismiss();
            }
        };
        View view2 = this.f71951Oooo00O;
        if (view2 == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f71952Oooo00o;
        if (view3 == null) {
            OooOOO0.OooOOOO("btnEditLabels");
            throw null;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.OoooOOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                LabelPickerDialogFragment labelPickerDialogFragment = this.f100828OooOo0o;
                labelPickerDialogFragment.Oooo00o().OooO0oO();
                labelPickerDialogFragment.Oooo0(view);
                LabelManagementDialogFragment labelManagementDialogFragment = new LabelManagementDialogFragment();
                labelManagementDialogFragment.setArguments(BundleKt.bundleOf(new C32443OooOOO("creationFlag", Boolean.FALSE)));
                labelManagementDialogFragment.show(labelPickerDialogFragment.getParentFragmentManager(), "LabelManagementDialogFragment");
                labelPickerDialogFragment.dismiss();
            }
        });
        com.orion.notein.p607ui.label.OooO0OO oooO0OO = new com.orion.notein.p607ui.label.OooO0OO(new OooO00o(view));
        this.f71953Oooo0O0 = oooO0OO;
        RecyclerView recyclerView = this.f71949Oooo0;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("labelList");
            throw null;
        }
        recyclerView.setAdapter(oooO0OO);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
