package com.orion.notein.p607ui.noteeditor.addpage;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.C23365OooO0Oo;
import com.orion.notein.p607ui.noteeditor.addpage.PDFPageSelectorDialogFragment;
import com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment.OooO00o;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28157OooOO0O;
import o0Oo0o00.ViewOnClickListenerC28158OooOO0o;
import o0OoOO00.C29028OoooO0;
import o0OoOO00.C29030OoooO0O;
import o0OoOO00.ViewOnClickListenerC29029OoooO00;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addpage/PDFPageSelectorDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PDFPageSelectorDialogFragment extends Hilt_PDFPageSelectorDialogFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ViewOnClickListenerC28158OooOO0o f73915Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f73916Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f73917Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f73918Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ImageView f73919Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f73920Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f73921Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public EditText f73922Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f73923Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f73924Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f73925Oooo0oo;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f73926OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73926OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73926OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PDFPageSelectorDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$onResume$1$1", m80623f = "PDFPageSelectorDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f73928OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f73928OooOo = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return PDFPageSelectorDialogFragment.this.new OooO00o(this.f73928OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C23365OooO0Oo c23365OooO0OoOooo00o = PDFPageSelectorDialogFragment.this.Oooo00o();
            String str = this.f73928OooOo;
            C23365OooO0Oo.OooO00o oooO00o = (C23365OooO0Oo.OooO00o) c23365OooO0OoOooo00o.f73888OooO0oo.getValue();
            if (oooO00o != null && !OooOOO0.OooO0O0(oooO00o.f73897OooO0O0, str)) {
                C23365OooO0Oo.OooO00o OooO00o2 = C23365OooO0Oo.OooO00o.OooO00o(oooO00o, null, str, 1);
                C33781o00o0O c33781o00o0O = c23365OooO0OoOooo00o.f73887OooO0oO;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, OooO00o2);
            }
            return C32460OooOooO.f116667OooO00o;
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = PDFPageSelectorDialogFragment.this;
            try {
                int i4 = Integer.parseInt(String.valueOf(charSequence));
                int iIntValue = ((Number) pDFPageSelectorDialogFragment.Oooo00o().f73892OooOOO.f121747OooOo0o.getValue()).intValue();
                if (i4 < 1 || i4 > iIntValue) {
                    EditText editText = pDFPageSelectorDialogFragment.f73922Oooo0o;
                    if (editText != null) {
                        editText.setTextColor(ContextCompat.getColor(editText.getContext(), R.color.warning_color));
                        return;
                    } else {
                        OooOOO0.OooOOOO("inputPageNum");
                        throw null;
                    }
                }
                EditText editText2 = pDFPageSelectorDialogFragment.f73922Oooo0o;
                if (editText2 != null) {
                    editText2.setTextColor(ContextCompat.getColor(editText2.getContext(), R.color.item_text_name_color));
                } else {
                    OooOOO0.OooOOOO("inputPageNum");
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$onViewCreated$6", m80623f = "PDFPageSelectorDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f73932OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$onViewCreated$6$1", m80623f = "PDFPageSelectorDialogFragment.kt", m80624l = {160}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PDFPageSelectorDialogFragment f73933OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73934OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19273OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PDFPageSelectorDialogFragment f73935OooOo0o;

                public C19273OooO00o(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment) {
                    this.f73935OooOo0o = pDFPageSelectorDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        ImageView imageView = this.f73935OooOo0o.f73919Oooo00o;
                        if (imageView == null) {
                            OooOOO0.OooOOOO("preview");
                            throw null;
                        }
                        imageView.setImageBitmap(bitmap);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73933OooOo = pDFPageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73933OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73934OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f73933OooOo;
                    C23365OooO0Oo c23365OooO0OoOooo00o = pDFPageSelectorDialogFragment.Oooo00o();
                    C19273OooO00o c19273OooO00o = new C19273OooO00o(pDFPageSelectorDialogFragment);
                    this.f73934OooOo0o = 1;
                    if (c23365OooO0OoOooo00o.f73895OooOOOo.f121747OooOo0o.collect(c19273OooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$onViewCreated$6$2", m80623f = "PDFPageSelectorDialogFragment.kt", m80624l = {168}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PDFPageSelectorDialogFragment f73936OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73937OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PDFPageSelectorDialogFragment f73938OooOo0o;

                public OooO00o(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment) {
                    this.f73938OooOo0o = pDFPageSelectorDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f73938OooOo0o;
                    int iIntValue2 = ((Number) pDFPageSelectorDialogFragment.Oooo00o().f73892OooOOO.f121747OooOo0o.getValue()).intValue();
                    View view = pDFPageSelectorDialogFragment.f73916Oooo0;
                    if (view == null) {
                        OooOOO0.OooOOOO("btnBackwardToStart");
                        throw null;
                    }
                    view.setEnabled(iIntValue != 1);
                    View view2 = pDFPageSelectorDialogFragment.f73920Oooo0O0;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("btnBackward");
                        throw null;
                    }
                    view2.setEnabled(iIntValue != 1);
                    View view3 = pDFPageSelectorDialogFragment.f73921Oooo0OO;
                    if (view3 == null) {
                        OooOOO0.OooOOOO("btnForwardToEnd");
                        throw null;
                    }
                    view3.setEnabled(iIntValue != iIntValue2);
                    View view4 = pDFPageSelectorDialogFragment.f73923Oooo0o0;
                    if (view4 != null) {
                        view4.setEnabled(iIntValue != iIntValue2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnForward");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f73936OooOo = pDFPageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f73936OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73937OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f73936OooOo;
                C23365OooO0Oo c23365OooO0OoOooo00o = pDFPageSelectorDialogFragment.Oooo00o();
                OooO00o oooO00o = new OooO00o(pDFPageSelectorDialogFragment);
                this.f73937OooOo0o = 1;
                c23365OooO0OoOooo00o.f73889OooOO0.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$OooO0OO$OooO0OO, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$onViewCreated$6$3", m80623f = "PDFPageSelectorDialogFragment.kt", m80624l = {179}, m80625m = "invokeSuspend")
        public static final class C19274OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PDFPageSelectorDialogFragment f73939OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73940OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$OooO0OO$OooO0OO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PDFPageSelectorDialogFragment f73941OooOo0o;

                public OooO00o(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment) {
                    this.f73941OooOo0o = pDFPageSelectorDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    EditText editText = this.f73941OooOo0o.f73922Oooo0o;
                    if (editText != null) {
                        editText.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("inputPageNum");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19274OooO0OO(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment, Continuation<? super C19274OooO0OO> continuation) {
                super(2, continuation);
                this.f73939OooOo = pDFPageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19274OooO0OO(this.f73939OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19274OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73940OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f73939OooOo;
                    C23365OooO0Oo c23365OooO0OoOooo00o = pDFPageSelectorDialogFragment.Oooo00o();
                    OooO00o oooO00o = new OooO00o(pDFPageSelectorDialogFragment);
                    this.f73940OooOo0o = 1;
                    if (c23365OooO0OoOooo00o.f73894OooOOOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$onViewCreated$6$4", m80623f = "PDFPageSelectorDialogFragment.kt", m80624l = {187}, m80625m = "invokeSuspend")
        public static final class OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PDFPageSelectorDialogFragment f73942OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f73943OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$onViewCreated$6$4$1", m80623f = "PDFPageSelectorDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PDFPageSelectorDialogFragment f73944OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f73944OooOo0o = pDFPageSelectorDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(this.f73944OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this.f73944OooOo0o), new C29030OoooO0O(0));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0Oo(PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment, Continuation<? super OooO0Oo> continuation) {
                super(2, continuation);
                this.f73942OooOo = pDFPageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0Oo(this.f73942OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73943OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f73942OooOo;
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(pDFPageSelectorDialogFragment.Oooo00o().f73885OooO0o, 500L);
                    OooO00o oooO00o = new OooO00o(pDFPageSelectorDialogFragment, null);
                    this.f73943OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = PDFPageSelectorDialogFragment.this.new OooO0OO(continuation);
            oooO0OO.f73932OooOo0o = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f73932OooOo0o;
            PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = PDFPageSelectorDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(pDFPageSelectorDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(pDFPageSelectorDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19274OooO0OO(pDFPageSelectorDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0Oo(pDFPageSelectorDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23367OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23367OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = PDFPageSelectorDialogFragment.this;
            Bundle arguments = pDFPageSelectorDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + pDFPageSelectorDialogFragment + " has null arguments");
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23368OooO0o0 f73946OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23368OooO0o0 c23368OooO0o0) {
            super(0);
            this.f73946OooOo0o = c23368OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f73946OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23368OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23368OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return PDFPageSelectorDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23369OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73948OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23369OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73948OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f73948OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.PDFPageSelectorDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23370OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f73949OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23370OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f73949OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f73949OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public PDFPageSelectorDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f73917Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C29028OoooO0.class), new C23367OooO0Oo());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23368OooO0o0()));
        this.f73918Oooo00O = new C22026ooOO(oooo0.OooO0O0(C23365OooO0Oo.class), new C23369OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23370OooO0oo(interfaceC32440OooOO0OooO0O0));
        this.f73915Oooo = new ViewOnClickListenerC28158OooOO0o(this, 2);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_pdf_page_selector_dialog;
    }

    public final C23365OooO0Oo Oooo00o() {
        return (C23365OooO0Oo) this.f73918Oooo00O.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getSupportFragmentManager().Oooooo0("pdf_password", this, new InterfaceC21912Oooo0o() { // from class: o0OoOO00.Oooo0oO
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("password");
                PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f102835OooOo0o;
                if (string == null) {
                    pDFPageSelectorDialogFragment.dismiss();
                    return;
                }
                InterfaceC21987OooOoo viewLifecycleOwner = pDFPageSelectorDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, pDFPageSelectorDialogFragment.new OooO00o(string, null), 3);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C33781o00o0O c33781o00o0O = Oooo00o().f73890OooOO0O;
        Integer numValueOf = Integer.valueOf(getResources().getDisplayMetrics().densityDpi);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
        Oooo00o();
        C24568OooO0oO c24568OooO0oO = this.f73917Oooo000;
        Oooo00o();
        C23365OooO0Oo c23365OooO0OoOooo00o = Oooo00o();
        Uri uri = ((C29028OoooO0) c24568OooO0oO.getValue()).f102840OooO0Oo;
        C23365OooO0Oo.OooO00o oooO00o = (C23365OooO0Oo.OooO00o) c23365OooO0OoOooo00o.f73888OooO0oo.getValue();
        C33781o00o0O c33781o00o0O2 = c23365OooO0OoOooo00o.f73887OooO0oO;
        if (oooO00o == null) {
            C23365OooO0Oo.OooO00o oooO00o2 = new C23365OooO0Oo.OooO00o(uri, null);
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, oooO00o2);
        } else if (!oooO00o.f73896OooO00o.equals(uri)) {
            PdfiumCore pdfiumCore = (PdfiumCore) c23365OooO0OoOooo00o.f73891OooOO0o.f121747OooOo0o.getValue();
            PdfDocument pdfDocument = (PdfDocument) c23365OooO0OoOooo00o.f73893OooOOO0.f121747OooOo0o.getValue();
            if (pdfDocument != null) {
                pdfiumCore.closeDocument(pdfDocument);
            }
            C23365OooO0Oo.OooO00o OooO00o2 = C23365OooO0Oo.OooO00o.OooO00o(oooO00o, uri, null, 2);
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, OooO00o2);
        }
        this.f73919Oooo00o = (ImageView) view.findViewById(R.id.preview);
        View viewFindViewById = view.findViewById(R.id.btn_page_backward_to_start);
        this.f73916Oooo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnBackwardToStart");
            throw null;
        }
        ViewOnClickListenerC28158OooOO0o viewOnClickListenerC28158OooOO0o = this.f73915Oooo;
        viewFindViewById.setOnClickListener(viewOnClickListenerC28158OooOO0o);
        View viewFindViewById2 = view.findViewById(R.id.btn_page_backward);
        this.f73920Oooo0O0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBackward");
            throw null;
        }
        viewFindViewById2.setOnClickListener(viewOnClickListenerC28158OooOO0o);
        View viewFindViewById3 = view.findViewById(R.id.btn_page_forward_to_end);
        this.f73921Oooo0OO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnForwardToEnd");
            throw null;
        }
        viewFindViewById3.setOnClickListener(viewOnClickListenerC28158OooOO0o);
        View viewFindViewById4 = view.findViewById(R.id.btn_page_forward);
        this.f73923Oooo0o0 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnForward");
            throw null;
        }
        viewFindViewById4.setOnClickListener(viewOnClickListenerC28158OooOO0o);
        EditText editText = (EditText) view.findViewById(R.id.input_page_num);
        this.f73922Oooo0o = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoOO00.Oooo0oo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z) {
                    PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f102836OooO00o;
                    int iIntValue = ((Number) pDFPageSelectorDialogFragment.Oooo00o().f73889OooOO0.getValue()).intValue();
                    EditText editText2 = pDFPageSelectorDialogFragment.f73922Oooo0o;
                    if (editText2 != null) {
                        editText2.setText(String.valueOf(iIntValue));
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                        throw null;
                    }
                }
            }
        });
        EditText editText2 = this.f73922Oooo0o;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText2.addTextChangedListener(new OooO0O0());
        EditText editText3 = this.f73922Oooo0o;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0OoOO00.Oooo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = this.f102801OooOo0o;
                if (i == 2) {
                    try {
                        EditText editText4 = pDFPageSelectorDialogFragment.f73922Oooo0o;
                        if (editText4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                            throw null;
                        }
                        int i2 = Integer.parseInt(editText4.getText().toString());
                        int iIntValue = ((Number) pDFPageSelectorDialogFragment.Oooo00o().f73892OooOOO.f121747OooOo0o.getValue()).intValue();
                        if (i2 >= 1 && i2 <= iIntValue) {
                            if (i2 == ((Number) pDFPageSelectorDialogFragment.Oooo00o().f73889OooOO0.getValue()).intValue()) {
                                EditText editText5 = pDFPageSelectorDialogFragment.f73922Oooo0o;
                                if (editText5 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                                    throw null;
                                }
                                editText5.setText(i2 + "/" + iIntValue);
                            } else {
                                C33781o00o0O c33781o00o0O3 = pDFPageSelectorDialogFragment.Oooo00o().f73883OooO;
                                Integer numValueOf2 = Integer.valueOf(i2);
                                c33781o00o0O3.getClass();
                                c33781o00o0O3.OooOO0(null, numValueOf2);
                            }
                            Object systemService = textView.getContext().getSystemService("input_method");
                            kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                            ImageView imageView = pDFPageSelectorDialogFragment.f73919Oooo00o;
                            if (imageView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("preview");
                                throw null;
                            }
                            imageView.requestFocus();
                        }
                    } catch (Exception unused) {
                        Context contextRequireContext = pDFPageSelectorDialogFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        String string = pDFPageSelectorDialogFragment.getString(R.string.toast_enter_a_pdf_page_number);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    }
                }
                return true;
            }
        });
        View viewFindViewById5 = view.findViewById(R.id.btn_cancel);
        this.f73924Oooo0oO = viewFindViewById5;
        if (viewFindViewById5 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById5.setOnClickListener(new ViewOnClickListenerC28157OooOO0O(this, 1));
        View viewFindViewById6 = view.findViewById(R.id.btn_confirm);
        this.f73925Oooo0oo = viewFindViewById6;
        if (viewFindViewById6 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById6.setOnClickListener(new ViewOnClickListenerC29029OoooO00(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
    }
}
