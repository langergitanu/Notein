package com.orion.notein.p607ui.noteeditor.addpage.dialog;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o0OoO0oO.ViewOnClickListenerC28671OooO;
import o0OoO0oO.ViewOnClickListenerC28681OooOO0O;
import o0OoOO0o.C29035OooO0O0;
import o0OoOO0o.C29037OooO0Oo;
import o0OoOO0o.C29038OooO0o0;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;
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
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addpage/dialog/TemplateRenameDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TemplateRenameDialogFragment extends Hilt_TemplateRenameDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f73955Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f73956Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f73957Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f73958Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f73959Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public EditText f73960Oooo0OO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73961OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73961OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73961OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? TemplateRenameDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooO00o implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0O0 implements TextWatcher {
        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            TemplateRenameDialogFragment templateRenameDialogFragment = TemplateRenameDialogFragment.this;
            View view = templateRenameDialogFragment.f73955Oooo0;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = templateRenameDialogFragment.f73959Oooo0O0;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
            view2.setVisibility(charSequence.length() <= 0 ? 8 : 0);
            if (charSequence.length() == 0) {
                EditText editText = templateRenameDialogFragment.f73960Oooo0OO;
                if (editText != null) {
                    editText.setHint(((C29035OooO0O0) templateRenameDialogFragment.f73956Oooo000.getValue()).f102859OooO0O0);
                } else {
                    OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment$onViewCreated$6$1", m80623f = "TemplateRenameDialogFragment.kt", m80624l = {83}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73965OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Editable f73966OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Editable editable, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f73966OooOoO0 = editable;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TemplateRenameDialogFragment.this.new OooO0OO(this.f73966OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73965OooOo0o;
            TemplateRenameDialogFragment templateRenameDialogFragment = TemplateRenameDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29038OooO0o0 c29038OooO0o0 = (C29038OooO0o0) templateRenameDialogFragment.f73957Oooo00O.getValue();
                String str = ((C29035OooO0O0) templateRenameDialogFragment.f73956Oooo000.getValue()).f102858OooO00o;
                String string = this.f73966OooOoO0.toString();
                this.f73965OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29037OooO0Oo(c29038OooO0o0, str, string, null), this);
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
            Dialog dialog = templateRenameDialogFragment.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23371OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23371OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            TemplateRenameDialogFragment templateRenameDialogFragment = TemplateRenameDialogFragment.this;
            Bundle arguments = templateRenameDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + templateRenameDialogFragment + " has null arguments");
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23372OooO0o0 f73968OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23372OooO0o0 c23372OooO0o0) {
            super(0);
            this.f73968OooOo0o = c23372OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73968OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23372OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23372OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return TemplateRenameDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23373OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73970OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23373OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73970OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73970OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.dialog.TemplateRenameDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23374OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73971OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23374OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73971OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73971OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public TemplateRenameDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f73956Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C29035OooO0O0.class), new C23371OooO0Oo());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23372OooO0o0()));
        this.f73957Oooo00O = new C22026ooOO(oooo0.OooO0O0(C29038OooO0o0.class), new C23373OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23374OooO0oo(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_rename_my_template_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f73960Oooo0OO = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f73960Oooo0OO;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f73960Oooo0OO;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.setText(((C29035OooO0O0) this.f73956Oooo000.getValue()).f102859OooO0O0);
        EditText editText4 = this.f73960Oooo0OO;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO00o());
        EditText editText5 = this.f73960Oooo0OO;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText5.addTextChangedListener(new OooO0O0());
        EditText editText6 = this.f73960Oooo0OO;
        if (editText6 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText6.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById = view.findViewById(R.id.btn_clear);
        this.f73959Oooo0O0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29034OooO00o(this, 0));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f73958Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28671OooO(this, 1));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f73955Oooo0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28681OooOO0O(this, 1));
        } else {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
    }
}
