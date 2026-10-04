package com.orion.notein.p607ui.label;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.core.os.BundleKt;
import androidx.core.view.C21714Oooo00O;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C22102OooOOo;
import com.orion.notein.domain.models.Label;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.OooO0o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooO.C28443Oooo0OO;
import o0Oo0ooO.C28445Oooo0o0;
import o0Oo0ooO.C28456OoooOoO;
import o0Oo0ooO.C28458Ooooo00;
import o0Oo0ooO.C28459Ooooo0o;
import o0Oo0ooO.ViewOnClickListenerC28438Oooo0;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/label/LabelManagementDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabelManagementDialogFragment extends Hilt_LabelManagementDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public com.orion.notein.p607ui.label.OooO0o f71913Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f71914Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f71915Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public RecyclerView f71916Oooo00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelManagementDialogFragment$onResume$1$1", m80623f = "LabelManagementDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ long f71917OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71917OooOo = j;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LabelManagementDialogFragment.this.new OooO00o(this.f71917OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            LabelManagementDialogFragment labelManagementDialogFragment = LabelManagementDialogFragment.this;
            C23139OooOO0o c23139OooOO0oOooo0 = labelManagementDialogFragment.Oooo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23139OooOO0oOooo0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28458Ooooo00(c23139OooOO0oOooo0, this.f71917OooOo, null), 2);
            C23139OooOO0o c23139OooOO0oOooo02 = labelManagementDialogFragment.Oooo0();
            Integer num = new Integer(-1);
            C33781o00o0O c33781o00o0O = c23139OooOO0oOooo02.f72076OooOO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, num);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 implements OooO0o.OooO0OO {

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelManagementDialogFragment$onViewCreated$2$onLabelSaveClick$1", m80623f = "LabelManagementDialogFragment.kt", m80624l = {95}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f71920OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public String f71921OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ C28456OoooOoO f71922OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ LabelManagementDialogFragment f71923OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(LabelManagementDialogFragment labelManagementDialogFragment, C28456OoooOoO c28456OoooOoO, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f71923OooOoO0 = labelManagementDialogFragment;
                this.f71922OooOoO = c28456OoooOoO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f71923OooOoO0, this.f71922OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object objOooO0o0;
                String str;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71920OooOo;
                C28456OoooOoO c28456OoooOoO = this.f71922OooOoO;
                LabelManagementDialogFragment labelManagementDialogFragment = this.f71923OooOoO0;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    RecyclerView recyclerView = labelManagementDialogFragment.f71916Oooo00o;
                    if (recyclerView == null) {
                        OooOOO0.OooOOOO("labelList");
                        throw null;
                    }
                    C22102OooOOo.OooO00o(recyclerView, new androidx.transition.OooO0O0());
                    String string = C33599OooOo0O.Oooooo0(c28456OoooOoO.f100834OooO0O0).toString();
                    C23139OooOO0o c23139OooOO0oOooo0 = labelManagementDialogFragment.Oooo0();
                    Long l = new Long(c28456OoooOoO.f100833OooO00o);
                    this.f71921OooOo0o = string;
                    this.f71920OooOo = 1;
                    objOooO0o0 = c23139OooOO0oOooo0.f72072OooO0o0.OooO0o0(string, l, this);
                    if (objOooO0o0 == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    str = string;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = this.f71921OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0o0 = obj;
                    str = str2;
                }
                int iIntValue = ((Number) objOooO0o0).intValue();
                if (iIntValue == -3) {
                    Toast.makeText(labelManagementDialogFragment.requireContext(), "error: Label name already exists", 0).show();
                } else if (iIntValue == -2) {
                    Toast.makeText(labelManagementDialogFragment.requireContext(), "error: Label name is too long", 0).show();
                } else if (iIntValue != -1) {
                    Label label = new Label(c28456OoooOoO.f100833OooO00o, str, c28456OoooOoO.f100835OooO0OO, 0L, 0L, c28456OoooOoO.f100836OooO0Oo, 24, null);
                    C23139OooOO0o c23139OooOO0oOooo02 = labelManagementDialogFragment.Oooo0();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c23139OooOO0oOooo02);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28459Ooooo0o(c23139OooOO0oOooo02, label, null), 2);
                    C23139OooOO0o c23139OooOO0oOooo03 = labelManagementDialogFragment.Oooo0();
                    Integer num = new Integer(-1);
                    C33781o00o0O c33781o00o0O = c23139OooOO0oOooo03.f72076OooOO0O;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, num);
                    View viewRequireView = labelManagementDialogFragment.requireView();
                    OooOOO0.OooO0o(viewRequireView, "requireView(...)");
                    LabelManagementDialogFragment.Oooo00o(labelManagementDialogFragment, viewRequireView);
                } else {
                    Toast.makeText(labelManagementDialogFragment.requireContext(), "error: Label name is blank", 0).show();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0() {
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO(C28456OoooOoO vo, final int i) {
            OooOOO0.OooO0oO(vo, "vo");
            final LabelManagementDialogFragment labelManagementDialogFragment = LabelManagementDialogFragment.this;
            RecyclerView recyclerView = labelManagementDialogFragment.f71916Oooo00o;
            if (recyclerView == null) {
                OooOOO0.OooOOOO("labelList");
                throw null;
            }
            C22102OooOOo.OooO00o(recyclerView, new androidx.transition.OooO0O0());
            C23139OooOO0o c23139OooOO0oOooo0 = labelManagementDialogFragment.Oooo0();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = c23139OooOO0oOooo0.f72075OooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            C33781o00o0O c33781o00o0O2 = labelManagementDialogFragment.Oooo0().f72069OooO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, "");
            Iterator it = ((List) labelManagementDialogFragment.Oooo0().f72077OooOO0o.f121747OooOo0o.getValue()).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (((C28456OoooOoO) it.next()).f100833OooO00o == vo.f100833OooO00o) {
                    break;
                } else {
                    i2++;
                }
            }
            C23139OooOO0o c23139OooOO0oOooo02 = labelManagementDialogFragment.Oooo0();
            Boolean bool2 = Boolean.FALSE;
            C33781o00o0O c33781o00o0O3 = c23139OooOO0oOooo02.f72075OooOO0;
            c33781o00o0O3.getClass();
            c33781o00o0O3.OooOO0(null, bool2);
            C23139OooOO0o c23139OooOO0oOooo03 = labelManagementDialogFragment.Oooo0();
            Integer numValueOf = Integer.valueOf(i2);
            C33781o00o0O c33781o00o0O4 = c23139OooOO0oOooo03.f72076OooOO0O;
            c33781o00o0O4.getClass();
            c33781o00o0O4.OooOO0(null, numValueOf);
            RecyclerView recyclerView2 = labelManagementDialogFragment.f71916Oooo00o;
            if (recyclerView2 != null) {
                recyclerView2.post(new Runnable() { // from class: o0Oo0ooO.Oooo0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView recyclerView3 = labelManagementDialogFragment.f71916Oooo00o;
                        if (recyclerView3 != null) {
                            recyclerView3.smoothScrollToPosition(i);
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelList");
                            throw null;
                        }
                    }
                });
            } else {
                OooOOO0.OooOOOO("labelList");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO00o(int i) {
            C23139OooOO0o c23139OooOO0oOooo0 = LabelManagementDialogFragment.this.Oooo0();
            Integer numValueOf = Integer.valueOf(i);
            C33781o00o0O c33781o00o0O = c23139OooOO0oOooo0.f72074OooO0oo;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO0O0() {
            final LabelManagementDialogFragment labelManagementDialogFragment = LabelManagementDialogFragment.this;
            View viewRequireView = labelManagementDialogFragment.requireView();
            OooOOO0.OooO0o(viewRequireView, "requireView(...)");
            LabelManagementDialogFragment.Oooo00o(labelManagementDialogFragment, viewRequireView);
            RecyclerView recyclerView = labelManagementDialogFragment.f71916Oooo00o;
            if (recyclerView == null) {
                OooOOO0.OooOOOO("labelList");
                throw null;
            }
            C22102OooOOo.OooO00o(recyclerView, new androidx.transition.OooO0O0());
            C33781o00o0O c33781o00o0O = labelManagementDialogFragment.Oooo0().f72076OooOO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, -1);
            C23139OooOO0o c23139OooOO0oOooo0 = labelManagementDialogFragment.Oooo0();
            Boolean bool = Boolean.TRUE;
            C33781o00o0O c33781o00o0O2 = c23139OooOO0oOooo0.f72075OooOO0;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, bool);
            RecyclerView recyclerView2 = labelManagementDialogFragment.f71916Oooo00o;
            if (recyclerView2 != null) {
                recyclerView2.post(new Runnable() { // from class: o0Oo0ooO.Oooo0oO
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView recyclerView3 = labelManagementDialogFragment.f71916Oooo00o;
                        if (recyclerView3 != null) {
                            recyclerView3.smoothScrollToPosition(0);
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelList");
                            throw null;
                        }
                    }
                });
            } else {
                OooOOO0.OooOOOO("labelList");
                throw null;
            }
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO0OO(String name) {
            OooOOO0.OooO0oO(name, "name");
            C33781o00o0O c33781o00o0O = LabelManagementDialogFragment.this.Oooo0().f72069OooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, name);
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO0Oo() {
            LabelManagementDialogFragment labelManagementDialogFragment = LabelManagementDialogFragment.this;
            View viewRequireView = labelManagementDialogFragment.requireView();
            OooOOO0.OooO0o(viewRequireView, "requireView(...)");
            LabelManagementDialogFragment.Oooo00o(labelManagementDialogFragment, viewRequireView);
            RecyclerView recyclerView = labelManagementDialogFragment.f71916Oooo00o;
            if (recyclerView == null) {
                OooOOO0.OooOOOO("labelList");
                throw null;
            }
            C22102OooOOo.OooO00o(recyclerView, new androidx.transition.OooO0O0());
            C23139OooOO0o c23139OooOO0oOooo0 = labelManagementDialogFragment.Oooo0();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = c23139OooOO0oOooo0.f72075OooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            C33781o00o0O c33781o00o0O2 = labelManagementDialogFragment.Oooo0().f72069OooO;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, "");
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO0o(int i, String name) {
            OooOOO0.OooO0oO(name, "name");
            LabelManagementDialogFragment labelManagementDialogFragment = LabelManagementDialogFragment.this;
            String string = C33599OooOo0O.Oooooo0(name).toString();
            InterfaceC21987OooOoo viewLifecycleOwner = labelManagementDialogFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28443Oooo0OO(labelManagementDialogFragment, string, i, null), 3);
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO0o0(C28456OoooOoO c28456OoooOoO) {
            LabelManagementDialogFragment labelManagementDialogFragment = LabelManagementDialogFragment.this;
            InterfaceC21987OooOoo viewLifecycleOwner = labelManagementDialogFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(labelManagementDialogFragment, c28456OoooOoO, null), 3);
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO0oO(C28456OoooOoO vo) {
            OooOOO0.OooO0oO(vo, "vo");
            LabelManagementDialogFragment labelManagementDialogFragment = LabelManagementDialogFragment.this;
            View viewRequireView = labelManagementDialogFragment.requireView();
            OooOOO0.OooO0o(viewRequireView, "requireView(...)");
            LabelManagementDialogFragment.Oooo00o(labelManagementDialogFragment, viewRequireView);
            RecyclerView recyclerView = labelManagementDialogFragment.f71916Oooo00o;
            if (recyclerView == null) {
                OooOOO0.OooOOOO("labelList");
                throw null;
            }
            C22102OooOOo.OooO00o(recyclerView, new androidx.transition.OooO0O0());
            C33781o00o0O c33781o00o0O = labelManagementDialogFragment.Oooo0().f72076OooOO0O;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, -1);
        }

        @Override // com.orion.notein.ui.label.OooO0o.OooO0OO
        public final void OooO0oo(C28456OoooOoO vo) {
            OooOOO0.OooO0oO(vo, "vo");
            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(LabelManagementDialogFragment.this), R.id.deleteLabelDialogFragment, BundleKt.bundleOf(new C32443OooOOO("labelId", Long.valueOf(vo.f100833OooO00o))));
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return LabelManagementDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelManagementDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23121OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f71925OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23121OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f71925OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71925OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71926OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71926OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71926OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelManagementDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23122OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71927OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23122OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71927OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71927OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.LabelManagementDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23123OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71928OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23123OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71928OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71928OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LabelManagementDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public LabelManagementDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23121OooO0Oo(new OooO0OO()));
        this.f71914Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C23139OooOO0o.class), new C23122OooO0o0(interfaceC32440OooOO0OooO0O0), new C23123OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
    }

    public static final void Oooo00o(LabelManagementDialogFragment labelManagementDialogFragment, View view) {
        Context context = labelManagementDialogFragment.getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.dialog_card);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.label_management_dialog_host;
    }

    public final C23139OooOO0o Oooo0() {
        return (C23139OooOO0o) this.f71914Oooo000.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getSupportFragmentManager().Oooooo0("delete_label", this, new C21714Oooo00O(this, 3));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.handle);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = view.findViewById(R.id.close_button);
        this.f71915Oooo00O = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("closeButton");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28438Oooo0(this, 0));
        this.f71916Oooo00o = (RecyclerView) view.findViewById(R.id.label_list);
        com.orion.notein.p607ui.label.OooO0o oooO0o = new com.orion.notein.p607ui.label.OooO0o(new OooO0O0());
        this.f71913Oooo0 = oooO0o;
        RecyclerView recyclerView = this.f71916Oooo00o;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("labelList");
            throw null;
        }
        recyclerView.setAdapter(oooO0o);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28445Oooo0o0(this, null), 3);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("creationFlag", false) : false) {
            C23139OooOO0o c23139OooOO0oOooo0 = Oooo0();
            Boolean bool = Boolean.TRUE;
            C33781o00o0O c33781o00o0O = c23139OooOO0oOooo0.f72075OooOO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            RecyclerView recyclerView2 = this.f71916Oooo00o;
            if (recyclerView2 != null) {
                recyclerView2.post(new Runnable() { // from class: o0Oo0ooO.Oooo0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView recyclerView3 = this.f100808OooOo0o.f71916Oooo00o;
                        if (recyclerView3 != null) {
                            recyclerView3.smoothScrollToPosition(0);
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelList");
                            throw null;
                        }
                    }
                });
            } else {
                OooOOO0.OooOOOO("labelList");
                throw null;
            }
        }
    }
}
