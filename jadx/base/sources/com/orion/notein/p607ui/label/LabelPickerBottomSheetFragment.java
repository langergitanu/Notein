package com.orion.notein.p607ui.label;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.LabelPickerBottomSheetFragment;
import com.orion.notein.p607ui.label.OooO0OO;
import com.orion.notein.p607ui.label.OooOO0O;
import com.orion.notein.p607ui.label.TriStateCheckBox;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00O0.C25252OooO0Oo;
import o0Oo0ooO.C28417OooOO0o;
import o0Oo0ooO.C28420OooOOOO;
import o0Oo0ooO.C28448OoooO;
import o0Oo0ooO.C28451OoooO0O;
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
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/label/LabelPickerBottomSheetFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabelPickerBottomSheetFragment extends Hilt_LabelPickerBottomSheetFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f71930OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f71931OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public com.orion.notein.p607ui.label.OooO0OO f71932Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f71933Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f71934Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public RecyclerView f71935Oooo00o;

    public static final class OooO00o implements OooO0OO.InterfaceC19211OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ View f71937OooO0O0;

        public OooO00o(View view) {
            this.f71937OooO0O0 = view;
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO00o(int i) {
            C23135OooO0o0 c23135OooO0o0OooOoo0 = LabelPickerBottomSheetFragment.this.OooOoo0();
            Integer numValueOf = Integer.valueOf(i);
            C33781o00o0O c33781o00o0O = c23135OooO0o0OooOoo0.f72019OooOOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0O0() {
            C23135OooO0o0 c23135OooO0o0OooOoo0 = LabelPickerBottomSheetFragment.this.OooOoo0();
            Boolean bool = Boolean.TRUE;
            C33781o00o0O c33781o00o0O = c23135OooO0o0OooOoo0.f72021OooOOOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0OO(String name) {
            OooOOO0.OooO0oO(name, "name");
            C23135OooO0o0 c23135OooO0o0OooOoo0 = LabelPickerBottomSheetFragment.this.OooOoo0();
            c23135OooO0o0OooOoo0.f72020OooOOO0.setValue(C33599OooOo0O.Oooooo0(name).toString());
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0Oo(long j, TriStateCheckBox.OooO00o state) {
            OooOOO0.OooO0oO(state, "state");
            int iOrdinal = state.ordinal();
            LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = LabelPickerBottomSheetFragment.this;
            if (iOrdinal == 0) {
                C23135OooO0o0 c23135OooO0o0OooOoo0 = labelPickerBottomSheetFragment.OooOoo0();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23135OooO0o0OooOoo0);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28417OooOO0o(c23135OooO0o0OooOoo0, j, null), 2);
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            C23135OooO0o0 c23135OooO0o0OooOoo02 = labelPickerBottomSheetFragment.OooOoo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c23135OooO0o0OooOoo02);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28420OooOOOO(c23135OooO0o0OooOoo02, j, null), 2);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0o() {
            LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = LabelPickerBottomSheetFragment.this;
            labelPickerBottomSheetFragment.OooOoo0().OooO0oO();
            labelPickerBottomSheetFragment.OooOoo(this.f71937OooO0O0);
        }

        @Override // com.orion.notein.p607ui.label.OooO0OO.InterfaceC19211OooO0OO
        public final void OooO0o0(int i, String name) {
            OooOOO0.OooO0oO(name, "name");
            LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = LabelPickerBottomSheetFragment.this;
            String string = C33599OooOo0O.Oooooo0(name).toString();
            InterfaceC21987OooOoo viewLifecycleOwner = labelPickerBottomSheetFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28451OoooO0O(labelPickerBottomSheetFragment, string, i, null), 3);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelPickerBottomSheetFragment$onViewCreated$3", m80623f = "LabelPickerBottomSheetFragment.kt", m80624l = {116}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71939OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelPickerBottomSheetFragment$onViewCreated$3$1", m80623f = "LabelPickerBottomSheetFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends OooOO0O>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LabelPickerBottomSheetFragment f71940OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71941OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(LabelPickerBottomSheetFragment labelPickerBottomSheetFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f71940OooOo = labelPickerBottomSheetFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f71940OooOo, continuation);
                oooO00o.f71941OooOo0o = obj;
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
                List list = (List) this.f71941OooOo0o;
                final LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = this.f71940OooOo;
                Object objOooo = OooOo.Oooo(list);
                OooOO0O.OooO00o oooO00o = objOooo instanceof OooOO0O.OooO00o ? (OooOO0O.OooO00o) objOooo : null;
                final boolean z = false;
                if (oooO00o != null && oooO00o.f72062OooO00o) {
                    z = true;
                }
                com.orion.notein.p607ui.label.OooO0OO oooO0OO = labelPickerBottomSheetFragment.f71932Oooo0;
                if (oooO0OO != null) {
                    oooO0OO.OooO0o0(list, new Runnable() { // from class: o0Oo0ooO.OoooO00
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (z) {
                                final LabelPickerBottomSheetFragment labelPickerBottomSheetFragment2 = labelPickerBottomSheetFragment;
                                RecyclerView recyclerView = labelPickerBottomSheetFragment2.f71935Oooo00o;
                                if (recyclerView != null) {
                                    recyclerView.post(new Runnable() { // from class: o0Oo0ooO.OoooO0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            EditText editText;
                                            LabelPickerBottomSheetFragment labelPickerBottomSheetFragment3 = labelPickerBottomSheetFragment2;
                                            RecyclerView recyclerView2 = labelPickerBottomSheetFragment3.f71935Oooo00o;
                                            if (recyclerView2 == null) {
                                                kotlin.jvm.internal.OooOOO0.OooOOOO("labelList");
                                                throw null;
                                            }
                                            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(0);
                                            if (abstractC22078OooOooOFindViewHolderForAdapterPosition == null || (editText = (EditText) abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView.findViewById(R.id.input_text)) == null) {
                                                return;
                                            }
                                            if (!editText.hasFocus()) {
                                                editText.requestFocus();
                                            }
                                            Context context = labelPickerBottomSheetFragment3.getContext();
                                            Object systemService = context != null ? context.getSystemService("input_method") : null;
                                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                                            if (inputMethodManager != null) {
                                                inputMethodManager.showSoftInput(editText, 1);
                                            }
                                        }
                                    });
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("labelList");
                                    throw null;
                                }
                            }
                        }
                    });
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
            return LabelPickerBottomSheetFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71939OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = LabelPickerBottomSheetFragment.this;
                C23135OooO0o0 c23135OooO0o0OooOoo0 = labelPickerBottomSheetFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(labelPickerBottomSheetFragment, null);
                this.f71939OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23135OooO0o0OooOoo0.f72022OooOOOo, oooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = LabelPickerBottomSheetFragment.this;
            Bundle arguments = labelPickerBottomSheetFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + labelPickerBottomSheetFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelPickerBottomSheetFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23124OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23124OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return LabelPickerBottomSheetFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71944OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71944OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71944OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelPickerBottomSheetFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23125OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23124OooO0Oo f71945OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23125OooO0o0(C23124OooO0Oo c23124OooO0Oo) {
            super(0);
            this.f71945OooOo0o = c23124OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71945OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelPickerBottomSheetFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23126OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71946OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23126OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71946OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71946OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelPickerBottomSheetFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23127OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71947OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23127OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71947OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71947OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LabelPickerBottomSheetFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public LabelPickerBottomSheetFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f71930OooOooO = new C24568OooO0oO(oooo0.OooO0O0(C28448OoooO.class), new OooO0OO());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23125OooO0o0(new C23124OooO0Oo()));
        this.f71931OooOooo = new C22026ooOO(oooo0.OooO0O0(C23135OooO0o0.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23127OooO0oo(interfaceC32440OooOO0OooO0O0), new C23126OooO0oO(interfaceC32440OooOO0OooO0O0));
    }

    public final void OooOoo(View view) {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public final C23135OooO0o0 OooOoo0() {
        return (C23135OooO0o0) this.f71931OooOooo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.label_picker_bottom_sheet_host, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f70450OooOo = -1;
        this.f70451OooOo0o = Integer.valueOf(oO0O00O.OooO00o.OooO0O0(displayMetrics.heightPixels * 0.9f));
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C23135OooO0o0 c23135OooO0o0OooOoo0 = OooOoo0();
        List listOoooOO0 = OooOOO.OoooOO0(((C28448OoooO) this.f71930OooOooO.getValue()).f100819OooO00o);
        C33781o00o0O c33781o00o0O = c23135OooO0o0OooOoo0.f72017OooOO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, listOoooOO0);
        this.f71933Oooo000 = view.findViewById(R.id.btn_close);
        this.f71934Oooo00O = view.findViewById(R.id.edit_labels_button);
        this.f71935Oooo00o = (RecyclerView) view.findViewById(R.id.label_list);
        com.google.android.material.snackbar.OooO0O0 oooO0O0 = new com.google.android.material.snackbar.OooO0O0(1, this, view);
        View view2 = this.f71933Oooo000;
        if (view2 == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        view2.setOnClickListener(oooO0O0);
        View view3 = this.f71934Oooo00O;
        if (view3 == null) {
            OooOOO0.OooOOOO("btnEditLabels");
            throw null;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.Oooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                LabelPickerBottomSheetFragment labelPickerBottomSheetFragment = this.f100802OooOo0o;
                labelPickerBottomSheetFragment.OooOoo0().OooO0oO();
                labelPickerBottomSheetFragment.OooOoo(view);
                C21030OooOO0o.OooO0OO(labelPickerBottomSheetFragment).OooOOo(R.id.label_picker_bottom_sheet, true);
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = labelPickerBottomSheetFragment.requireActivity();
                MainActivity mainActivity = activityC21897OooOo0RequireActivity instanceof MainActivity ? (MainActivity) activityC21897OooOo0RequireActivity : null;
                if (mainActivity != null) {
                    mainActivity.openLabelManagement(false);
                }
            }
        });
        com.orion.notein.p607ui.label.OooO0OO oooO0OO = new com.orion.notein.p607ui.label.OooO0OO(new OooO00o(view));
        this.f71932Oooo0 = oooO0OO;
        RecyclerView recyclerView = this.f71935Oooo00o;
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
