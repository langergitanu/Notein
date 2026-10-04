package com.orion.notein.p607ui.ocr.dialog;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.ocr.dialog.ScannedPageSelectDialogFragment;
import java.io.IOException;
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
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0o0oO.ViewOnClickListenerC26055Ooooo00;
import o0O0o0oO.ViewOnClickListenerC26056Ooooo0o;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import o0Oo0O0.C28050OooO0OO;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30418Oooo0o0;
import o0ooo.C31694OooOOO;
import o0ooo.C31695OooOOO0;
import o0ooo.C31696OooOOOO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
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
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/dialog/ScannedPageSelectDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ScannedPageSelectDialogFragment extends Hilt_ScannedPageSelectDialogFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f78341Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ImageView f78342Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f78343Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f78344Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f78345Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f78346Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f78347Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f78348Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f78349Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public EditText f78350Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f78351Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final ViewOnClickListenerC26054OoooOoo f78352OoooO00;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78353OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78353OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78353OooOo0o.getValue()).getViewModelStore();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$onViewCreated$4", m80623f = "ScannedPageSelectDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78355OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$onViewCreated$4$1", m80623f = "ScannedPageSelectDialogFragment.kt", m80624l = {127}, m80625m = "invokeSuspend")
        public static final class C19445OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ScannedPageSelectDialogFragment f78356OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78357OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19446OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ScannedPageSelectDialogFragment f78358OooOo0o;

                public C19446OooO00o(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment) {
                    this.f78358OooOo0o = scannedPageSelectDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap == null || bitmap.isRecycled()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    ImageView imageView = this.f78358OooOo0o.f78342Oooo0;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("preview");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19445OooO00o(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment, Continuation<? super C19445OooO00o> continuation) {
                super(2, continuation);
                this.f78356OooOo = scannedPageSelectDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19445OooO00o(this.f78356OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19445OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78357OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f78356OooOo;
                    C30418Oooo0o0 c30418Oooo0o0Oooo00o = scannedPageSelectDialogFragment.Oooo00o();
                    C19446OooO00o c19446OooO00o = new C19446OooO00o(scannedPageSelectDialogFragment);
                    this.f78357OooOo0o = 1;
                    if (c30418Oooo0o0Oooo00o.f108662OooOo0.f121747OooOo0o.collect(c19446OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$onViewCreated$4$2", m80623f = "ScannedPageSelectDialogFragment.kt", m80624l = {136}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ScannedPageSelectDialogFragment f78359OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78360OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19447OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ScannedPageSelectDialogFragment f78361OooOo0o;

                public C19447OooO00o(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment) {
                    this.f78361OooOo0o = scannedPageSelectDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f78361OooOo0o;
                    int iIntValue2 = ((Number) scannedPageSelectDialogFragment.Oooo00o().f108655OooOOO.getValue()).intValue();
                    View view = scannedPageSelectDialogFragment.f78346Oooo0O0;
                    if (view == null) {
                        OooOOO0.OooOOOO("btnBackwardToStart");
                        throw null;
                    }
                    view.setEnabled(iIntValue != 1);
                    View view2 = scannedPageSelectDialogFragment.f78347Oooo0OO;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("btnBackward");
                        throw null;
                    }
                    view2.setEnabled(iIntValue != 1);
                    View view3 = scannedPageSelectDialogFragment.f78349Oooo0o0;
                    if (view3 == null) {
                        OooOOO0.OooOOOO("btnForwardToEnd");
                        throw null;
                    }
                    view3.setEnabled(iIntValue != iIntValue2);
                    View view4 = scannedPageSelectDialogFragment.f78348Oooo0o;
                    if (view4 != null) {
                        view4.setEnabled(iIntValue != iIntValue2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnForward");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78359OooOo = scannedPageSelectDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78359OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78360OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f78359OooOo;
                C30418Oooo0o0 c30418Oooo0o0Oooo00o = scannedPageSelectDialogFragment.Oooo00o();
                C19447OooO00o c19447OooO00o = new C19447OooO00o(scannedPageSelectDialogFragment);
                this.f78360OooOo0o = 1;
                c30418Oooo0o0Oooo00o.f108654OooOO0o.collect(c19447OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$onViewCreated$4$3", m80623f = "ScannedPageSelectDialogFragment.kt", m80624l = {147}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ScannedPageSelectDialogFragment f78362OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78363OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$onViewCreated$4$3$1", m80623f = "ScannedPageSelectDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19448OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ScannedPageSelectDialogFragment f78364OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78365OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19448OooO00o(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment, Continuation<? super C19448OooO00o> continuation) {
                    super(2, continuation);
                    this.f78364OooOo = scannedPageSelectDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19448OooO00o c19448OooO00o = new C19448OooO00o(this.f78364OooOo, continuation);
                    c19448OooO00o.f78365OooOo0o = obj;
                    return c19448OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19448OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String str = (String) this.f78365OooOo0o;
                    ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f78364OooOo;
                    EditText editText = scannedPageSelectDialogFragment.f78350Oooo0oO;
                    if (editText == null) {
                        OooOOO0.OooOOOO("inputPageNum");
                        throw null;
                    }
                    if (editText.hasFocus()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    EditText editText2 = scannedPageSelectDialogFragment.f78350Oooo0oO;
                    if (editText2 == null) {
                        OooOOO0.OooOOOO("inputPageNum");
                        throw null;
                    }
                    editText2.setText(str);
                    TextView textView = scannedPageSelectDialogFragment.f78341Oooo;
                    if (textView != null) {
                        textView.setVisibility(((Number) scannedPageSelectDialogFragment.Oooo00o().f108655OooOOO.getValue()).intValue() > 1 ? 0 : 8);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnConfirmAll");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78362OooOo = scannedPageSelectDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78362OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78363OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f78362OooOo;
                    C30418Oooo0o0 c30418Oooo0o0Oooo00o = scannedPageSelectDialogFragment.Oooo00o();
                    C19448OooO00o c19448OooO00o = new C19448OooO00o(scannedPageSelectDialogFragment, null);
                    this.f78363OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30418Oooo0o0Oooo00o.f108657OooOOOO, c19448OooO00o, this) == enumC32485OooO00o) {
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

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = ScannedPageSelectDialogFragment.this.new OooO00o(continuation);
            oooO00o.f78355OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78355OooOo0o;
            ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = ScannedPageSelectDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19445OooO00o(scannedPageSelectDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(scannedPageSelectDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(scannedPageSelectDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(ScannedPageSelectDialogFragment.this).OooO0o(R.id.textRecognizeFragment);
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78367OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78367OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f78367OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23732OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78368OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23732OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78368OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f78368OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = ScannedPageSelectDialogFragment.this;
            Bundle arguments = scannedPageSelectDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + scannedPageSelectDialogFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23733OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78370OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23733OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78370OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ScannedPageSelectDialogFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f78370OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23734OooO0oO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23734OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return ScannedPageSelectDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ScannedPageSelectDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23735OooO0oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23734OooO0oO f78373OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23735OooO0oo(C23734OooO0oO c23734OooO0oO) {
            super(0);
            this.f78373OooOo0o = c23734OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78373OooOo0o.invoke();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78374OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78374OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78374OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78375OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78375OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78375OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ScannedPageSelectDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ScannedPageSelectDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78343Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C31696OooOOOO.class), new OooO0o());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23735OooO0oo(new C23734OooO0oO()));
        this.f78344Oooo00O = new C22026ooOO(oooo0.OooO0O0(C30418Oooo0o0.class), new OooO(interfaceC32440OooOO0OooO0O0), new OooOO0O(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0));
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0O0());
        OooO0OO oooO0OO = new OooO0OO(c32447OooOOoOooO0OO);
        this.f78345Oooo00o = new C22026ooOO(oooo0.OooO0O0(C30394OooOOOO.class), oooO0OO, new C23733OooO0o0(c32447OooOOoOooO0OO), new C23732OooO0Oo(c32447OooOOoOooO0OO));
        this.f78352OoooO00 = new ViewOnClickListenerC26054OoooOoo(this, 7);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_aicor_scanned_page_select_dialog;
    }

    public final void Oooo0(boolean z) {
        int iIntValue = ((Number) Oooo00o().f108655OooOOO.getValue()).intValue();
        int iIntValue2 = ((Number) Oooo00o().f108654OooOO0o.getValue()).intValue();
        int i = iIntValue2 - 1;
        if (!z) {
            iIntValue = iIntValue2;
        }
        C24568OooO0oO c24568OooO0oO = this.f78343Oooo000;
        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("input_source_id", ((C31696OooOOOO) c24568OooO0oO.getValue()).f113234OooO00o.getId()), new C32443OooOOO("page_start_index", Integer.valueOf(i)), new C32443OooOOO("page_end_index", Integer.valueOf(iIntValue)));
        ((C30394OooOOOO) this.f78345Oooo00o.getValue()).f108500OooOO0o = i;
        int sourceType = ((C31696OooOOOO) c24568OooO0oO.getValue()).f113234OooO00o.getSourceType();
        if (sourceType != 0) {
            if (sourceType == 1) {
                C30418Oooo0o0.OooO00o oooO00o = Oooo00o().f108646OooO;
                if (oooO00o == null) {
                    return;
                } else {
                    bundleBundleOf.putString("pdf_password", oooO00o.f108665OooO0O0);
                }
            } else if (sourceType != 3) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PDFPageSelectorDialogFragment");
                c20358OooO00o.OooO0OO(C21532OooOOo.OooO0OO(((C31696OooOOOO) c24568OooO0oO.getValue()).f113234OooO00o.getSourceType(), "Unsupported input source type: "), new Object[0]);
                return;
            }
        }
        getParentFragmentManager().OooooOo(bundleBundleOf, "insert_page_selection");
        C21030OooOO0o.OooO0OO(this).OooOOOo();
    }

    public final C30418Oooo0o0 Oooo00o() {
        return (C30418Oooo0o0) this.f78344Oooo00O.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        ((C30394OooOOOO) this.f78345Oooo00o.getValue()).OooOO0o(null);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws IOException {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30418Oooo0o0 c30418Oooo0o0Oooo00o = Oooo00o();
        C24568OooO0oO c24568OooO0oO = this.f78343Oooo000;
        c30418Oooo0o0Oooo00o.OooO0oO(((C31696OooOOOO) c24568OooO0oO.getValue()).f113234OooO00o);
        C30418Oooo0o0 c30418Oooo0o0Oooo00o2 = Oooo00o();
        Integer numValueOf = Integer.valueOf(((C31696OooOOOO) c24568OooO0oO.getValue()).f113235OooO0O0 + 1);
        C33781o00o0O c33781o00o0O = c30418Oooo0o0Oooo00o2.f108653OooOO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f78351Oooo0oo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC26055Ooooo00(this, 6));
        this.f78342Oooo0 = (ImageView) view.findViewById(R.id.preview);
        View viewFindViewById2 = view.findViewById(R.id.btn_page_backward_to_start);
        this.f78346Oooo0O0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBackwardToStart");
            throw null;
        }
        ViewOnClickListenerC26054OoooOoo viewOnClickListenerC26054OoooOoo = this.f78352OoooO00;
        viewFindViewById2.setOnClickListener(viewOnClickListenerC26054OoooOoo);
        View viewFindViewById3 = view.findViewById(R.id.btn_page_backward);
        this.f78347Oooo0OO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnBackward");
            throw null;
        }
        viewFindViewById3.setOnClickListener(viewOnClickListenerC26054OoooOoo);
        View viewFindViewById4 = view.findViewById(R.id.btn_page_forward_to_end);
        this.f78349Oooo0o0 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnForwardToEnd");
            throw null;
        }
        viewFindViewById4.setOnClickListener(viewOnClickListenerC26054OoooOoo);
        View viewFindViewById5 = view.findViewById(R.id.btn_page_forward);
        this.f78348Oooo0o = viewFindViewById5;
        if (viewFindViewById5 == null) {
            OooOOO0.OooOOOO("btnForward");
            throw null;
        }
        viewFindViewById5.setOnClickListener(viewOnClickListenerC26054OoooOoo);
        EditText editText = (EditText) view.findViewById(R.id.input_page_num);
        this.f78350Oooo0oO = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0ooo.OooOO0O
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z) {
                    ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f113230OooO00o;
                    int iIntValue = ((Number) scannedPageSelectDialogFragment.Oooo00o().f108654OooOO0o.getValue()).intValue();
                    EditText editText2 = scannedPageSelectDialogFragment.f78350Oooo0oO;
                    if (editText2 != null) {
                        editText2.setText(String.valueOf(iIntValue));
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                        throw null;
                    }
                }
            }
        });
        EditText editText2 = this.f78350Oooo0oO;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText2.addTextChangedListener(new C31694OooOOO(this));
        EditText editText3 = this.f78350Oooo0oO;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText3.addTextChangedListener(new C31695OooOOO0(this));
        EditText editText4 = this.f78350Oooo0oO;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0ooo.OooOO0o
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f113231OooOo0o;
                if (i == 2) {
                    try {
                        EditText editText5 = scannedPageSelectDialogFragment.f78350Oooo0oO;
                        if (editText5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                            throw null;
                        }
                        int i2 = Integer.parseInt(editText5.getText().toString());
                        int iIntValue = ((Number) scannedPageSelectDialogFragment.Oooo00o().f108655OooOOO.getValue()).intValue();
                        if (i2 >= 1 && i2 <= iIntValue) {
                            if (i2 == ((Number) scannedPageSelectDialogFragment.Oooo00o().f108654OooOO0o.getValue()).intValue()) {
                                EditText editText6 = scannedPageSelectDialogFragment.f78350Oooo0oO;
                                if (editText6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                                    throw null;
                                }
                                editText6.setText(i2 + "/" + iIntValue);
                            } else {
                                scannedPageSelectDialogFragment.Oooo00o().OooO(i2);
                            }
                            Object systemService = textView.getContext().getSystemService("input_method");
                            kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                            ImageView imageView = scannedPageSelectDialogFragment.f78342Oooo0;
                            if (imageView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("preview");
                                throw null;
                            }
                            imageView.requestFocus();
                        }
                    } catch (Exception unused) {
                        Context contextRequireContext = scannedPageSelectDialogFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        String string = scannedPageSelectDialogFragment.getString(R.string.toast_enter_a_pdf_page_number);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    }
                }
                return true;
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.btn_scan_single);
        if (textView == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC26056Ooooo0o(this, 5));
        TextView textView2 = (TextView) view.findViewById(R.id.btn_scan_all);
        this.f78341Oooo = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnConfirmAll");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView2, 500L, new ViewOnClickListenerC26057OooooO0(this, 8));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}
