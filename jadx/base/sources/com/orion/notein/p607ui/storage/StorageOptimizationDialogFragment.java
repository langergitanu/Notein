package com.orion.notein.p607ui.storage;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27536o00o0o;
import o0OOo0o.C27540o00o0oO;
import o0oOo00O.C30944OooO0OO;
import o0oOo00O.C30945OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/storage/StorageOptimizationDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StorageOptimizationDialogFragment extends Hilt_StorageOptimizationDialogFragment {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f79578Oooo000;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.storage.StorageOptimizationDialogFragment$onViewCreated$1", m80623f = "StorageOptimizationDialogFragment.kt", m80624l = {40}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79580OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ TextView f79581OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ProgressBar f79582OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.storage.StorageOptimizationDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.storage.StorageOptimizationDialogFragment$onViewCreated$1$1", m80623f = "StorageOptimizationDialogFragment.kt", m80624l = {43}, m80625m = "invokeSuspend")
        public static final class C19539OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C27174OooO0O0<Float>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f79583OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79584OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ ProgressBar f79585OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ StorageOptimizationDialogFragment f79586OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ TextView f79587OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19539OooO00o(StorageOptimizationDialogFragment storageOptimizationDialogFragment, ProgressBar progressBar, TextView textView, Continuation<? super C19539OooO00o> continuation) {
                super(2, continuation);
                this.f79586OooOoO0 = storageOptimizationDialogFragment;
                this.f79585OooOoO = progressBar;
                this.f79587OooOoOO = textView;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19539OooO00o c19539OooO00o = new C19539OooO00o(this.f79586OooOoO0, this.f79585OooOoO, this.f79587OooOoOO, continuation);
                c19539OooO00o.f79583OooOo = obj;
                return c19539OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C27174OooO0O0<Float> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((C19539OooO00o) create(c27174OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79584OooOo0o;
                StorageOptimizationDialogFragment storageOptimizationDialogFragment = this.f79586OooOoO0;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) this.f79583OooOo;
                    C34406OooO00o.f123390OooO00o.OooO00o("success: " + c27174OooO0O0.f94862OooO00o + ", progress: " + c27174OooO0O0.OooO0O0(), new Object[0]);
                    if (!c27174OooO0O0.f94862OooO00o) {
                        Float f = (Float) c27174OooO0O0.OooO0O0();
                        int iFloatValue = f != null ? (int) f.floatValue() : 0;
                        this.f79585OooOoO.setProgress(iFloatValue);
                        this.f79587OooOoOO.setText(String.valueOf(iFloatValue));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C30945OooO0Oo c30945OooO0Oo = (C30945OooO0Oo) storageOptimizationDialogFragment.f79578Oooo000.getValue();
                    this.f79584OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30944OooO0OO(c30945OooO0Oo, null), this);
                    if (objOooO0o != obj2) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                storageOptimizationDialogFragment.dismissAllowingStateLoss();
                storageOptimizationDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(), "storage_optimization");
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ProgressBar progressBar, TextView textView, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f79582OooOoO0 = progressBar;
            this.f79581OooOoO = textView;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StorageOptimizationDialogFragment.this.new OooO00o(this.f79582OooOoO0, this.f79581OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79580OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                StorageOptimizationDialogFragment storageOptimizationDialogFragment = StorageOptimizationDialogFragment.this;
                C27540o00o0oO c27540o00o0oO = ((C30945OooO0Oo) storageOptimizationDialogFragment.f79578Oooo000.getValue()).f110593OooO0Oo;
                c27540o00o0oO.getClass();
                C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new C27536o00o0o(c27540o00o0oO, null));
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOo0O = C25252OooO0Oo.OooOo0O(c33770OooooO0, ExecutorC33873OooO0O0.f122045OooOoO0);
                C19539OooO00o c19539OooO00o = new C19539OooO00o(storageOptimizationDialogFragment, this.f79582OooOoO0, this.f79581OooOoO, null);
                this.f79580OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOo0O, c19539OooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return StorageOptimizationDialogFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f79589OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f79589OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79589OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.storage.StorageOptimizationDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23859OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79590OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23859OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79590OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79590OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79591OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79591OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79591OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? StorageOptimizationDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.storage.StorageOptimizationDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23860OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79593OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23860OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79593OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79593OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public StorageOptimizationDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f79578Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30945OooO0Oo.class), new C23859OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23860OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_storage_optimiazation_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
        TextView textView = (TextView) view.findViewById(R.id.progress_txt);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(progressBar, textView, null), 3);
    }
}
