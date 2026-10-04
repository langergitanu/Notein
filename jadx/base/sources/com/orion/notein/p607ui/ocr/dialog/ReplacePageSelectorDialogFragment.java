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
import androidx.core.content.ContextCompat;
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
import com.orion.notein.p607ui.ocr.dialog.ReplacePageSelectorDialogFragment;
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
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28243OooOo0O;
import o0Oo0o0o.ViewOnClickListenerC28244OooOo0o;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30418Oooo0o0;
import o0ooo.C31682OooO;
import o0ooo.C31687OooO0o;
import o0ooo.C31688OooO0o0;
import o0ooo.C31689OooO0oO;
import o0ooo.C31690OooO0oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/dialog/ReplacePageSelectorDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ReplacePageSelectorDialogFragment extends Hilt_ReplacePageSelectorDialogFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public EditText f78295Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f78296Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f78297Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f78298Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f78299Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public EditText f78300Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f78301Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f78302Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f78303Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f78304Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f78305Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f78306OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f78307OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final ViewOnClickListenerC28243OooOo0O f78308OoooO0O;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78309OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78309OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78309OooOo0o.getValue()).getViewModelStore();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78311OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$1", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {132}, m80625m = "invokeSuspend")
        public static final class C19439OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ReplacePageSelectorDialogFragment f78312OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78313OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19440OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ReplacePageSelectorDialogFragment f78314OooOo0o;

                public C19440OooO00o(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment) {
                    this.f78314OooOo0o = replacePageSelectorDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap == null || bitmap.isRecycled()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    ImageView imageView = this.f78314OooOo0o.f78301Oooo0OO;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("preview");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19439OooO00o(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super C19439OooO00o> continuation) {
                super(2, continuation);
                this.f78312OooOo = replacePageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19439OooO00o(this.f78312OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19439OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78313OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78312OooOo;
                    C30418Oooo0o0 c30418Oooo0o0Oooo0 = replacePageSelectorDialogFragment.Oooo0();
                    C19440OooO00o c19440OooO00o = new C19440OooO00o(replacePageSelectorDialogFragment);
                    this.f78313OooOo0o = 1;
                    if (c30418Oooo0o0Oooo0.f108662OooOo0.f121747OooOo0o.collect(c19440OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$2", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {141}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ReplacePageSelectorDialogFragment f78315OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78316OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19441OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ReplacePageSelectorDialogFragment f78317OooOo0o;

                public C19441OooO00o(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment) {
                    this.f78317OooOo0o = replacePageSelectorDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78317OooOo0o;
                    int iIntValue2 = ((Number) replacePageSelectorDialogFragment.Oooo0().f108655OooOOO.getValue()).intValue();
                    View view = replacePageSelectorDialogFragment.f78303Oooo0o0;
                    if (view == null) {
                        OooOOO0.OooOOOO("btnBackwardToStart");
                        throw null;
                    }
                    view.setEnabled(iIntValue != 1);
                    View view2 = replacePageSelectorDialogFragment.f78302Oooo0o;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("btnBackward");
                        throw null;
                    }
                    view2.setEnabled(iIntValue != 1);
                    View view3 = replacePageSelectorDialogFragment.f78304Oooo0oO;
                    if (view3 == null) {
                        OooOOO0.OooOOOO("btnForwardToEnd");
                        throw null;
                    }
                    view3.setEnabled(iIntValue != iIntValue2);
                    View view4 = replacePageSelectorDialogFragment.f78305Oooo0oo;
                    if (view4 != null) {
                        view4.setEnabled(iIntValue != iIntValue2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnForward");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78315OooOo = replacePageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78315OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78316OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78315OooOo;
                C30418Oooo0o0 c30418Oooo0o0Oooo0 = replacePageSelectorDialogFragment.Oooo0();
                C19441OooO00o c19441OooO00o = new C19441OooO00o(replacePageSelectorDialogFragment);
                this.f78316OooOo0o = 1;
                c30418Oooo0o0Oooo0.f108654OooOO0o.collect(c19441OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$3", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {152}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ReplacePageSelectorDialogFragment f78318OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78319OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$3$1", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19442OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ReplacePageSelectorDialogFragment f78320OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78321OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19442OooO00o(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super C19442OooO00o> continuation) {
                    super(2, continuation);
                    this.f78320OooOo = replacePageSelectorDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19442OooO00o c19442OooO00o = new C19442OooO00o(this.f78320OooOo, continuation);
                    c19442OooO00o.f78321OooOo0o = obj;
                    return c19442OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19442OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String str = (String) this.f78321OooOo0o;
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78320OooOo;
                    EditText editText = replacePageSelectorDialogFragment.f78295Oooo;
                    if (editText == null) {
                        OooOOO0.OooOOOO("inputPageNum");
                        throw null;
                    }
                    if (editText.hasFocus()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    EditText editText2 = replacePageSelectorDialogFragment.f78295Oooo;
                    if (editText2 != null) {
                        editText2.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("inputPageNum");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78318OooOo = replacePageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78318OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78319OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78318OooOo;
                    C30418Oooo0o0 c30418Oooo0o0Oooo0 = replacePageSelectorDialogFragment.Oooo0();
                    C19442OooO00o c19442OooO00o = new C19442OooO00o(replacePageSelectorDialogFragment, null);
                    this.f78319OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30418Oooo0o0Oooo0.f108657OooOOOO, c19442OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$4", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {161}, m80625m = "invokeSuspend")
        public static final class C23726OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ReplacePageSelectorDialogFragment f78322OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78323OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$4$1", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19443OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ReplacePageSelectorDialogFragment f78324OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f78325OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19443OooO00o(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super C19443OooO00o> continuation) {
                    super(2, continuation);
                    this.f78324OooOo = replacePageSelectorDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19443OooO00o c19443OooO00o = new C19443OooO00o(this.f78324OooOo, continuation);
                    c19443OooO00o.f78325OooOo0o = ((Number) obj).intValue();
                    return c19443OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19443OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    ((C30394OooOOOO) this.f78324OooOo.f78299Oooo00o.getValue()).OooOO0o(new Integer(this.f78325OooOo0o - 1));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23726OooO0Oo(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super C23726OooO0Oo> continuation) {
                super(2, continuation);
                this.f78322OooOo = replacePageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23726OooO0Oo(this.f78322OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23726OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78323OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78322OooOo;
                    C30418Oooo0o0 c30418Oooo0o0Oooo0 = replacePageSelectorDialogFragment.Oooo0();
                    C19443OooO00o c19443OooO00o = new C19443OooO00o(replacePageSelectorDialogFragment, null);
                    this.f78323OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30418Oooo0o0Oooo0.f108660OooOOo0, c19443OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$5", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {168}, m80625m = "invokeSuspend")
        public static final class C23727OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ReplacePageSelectorDialogFragment f78326OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78327OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$onViewCreated$3$5$1", m80623f = "ReplacePageSelectorDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19444OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ReplacePageSelectorDialogFragment f78328OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78329OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19444OooO00o(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super C19444OooO00o> continuation) {
                    super(2, continuation);
                    this.f78328OooOo = replacePageSelectorDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19444OooO00o c19444OooO00o = new C19444OooO00o(this.f78328OooOo, continuation);
                    c19444OooO00o.f78329OooOo0o = obj;
                    return c19444OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19444OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String str = (String) this.f78329OooOo0o;
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78328OooOo;
                    EditText editText = replacePageSelectorDialogFragment.f78300Oooo0O0;
                    if (editText == null) {
                        OooOOO0.OooOOOO("dstPageNum");
                        throw null;
                    }
                    if (editText.hasFocus()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    EditText editText2 = replacePageSelectorDialogFragment.f78300Oooo0O0;
                    if (editText2 != null) {
                        editText2.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("dstPageNum");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23727OooO0o0(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment, Continuation<? super C23727OooO0o0> continuation) {
                super(2, continuation);
                this.f78326OooOo = replacePageSelectorDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23727OooO0o0(this.f78326OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23727OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78327OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f78326OooOo;
                    C30418Oooo0o0 c30418Oooo0o0Oooo0 = replacePageSelectorDialogFragment.Oooo0();
                    C19444OooO00o c19444OooO00o = new C19444OooO00o(replacePageSelectorDialogFragment, null);
                    this.f78327OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30418Oooo0o0Oooo0.f108663OooOo00, c19444OooO00o, this) == enumC32485OooO00o) {
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
            OooO00o oooO00o = ReplacePageSelectorDialogFragment.this.new OooO00o(continuation);
            oooO00o.f78311OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78311OooOo0o;
            ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = ReplacePageSelectorDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19439OooO00o(replacePageSelectorDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(replacePageSelectorDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(replacePageSelectorDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23726OooO0Oo(replacePageSelectorDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23727OooO0o0(replacePageSelectorDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(ReplacePageSelectorDialogFragment.this).OooO0o(R.id.textRecognizeFragment);
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78331OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78331OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f78331OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23728OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78332OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23728OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78332OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f78332OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = ReplacePageSelectorDialogFragment.this;
            Bundle arguments = replacePageSelectorDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + replacePageSelectorDialogFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23729OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78334OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23729OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78334OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ReplacePageSelectorDialogFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f78334OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23730OooO0oO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23730OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return ReplacePageSelectorDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.ReplacePageSelectorDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23731OooO0oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23730OooO0oO f78337OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23731OooO0oo(C23730OooO0oO c23730OooO0oO) {
            super(0);
            this.f78337OooOo0o = c23730OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78337OooOo0o.invoke();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78338OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78338OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78338OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78339OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78339OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78339OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ReplacePageSelectorDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ReplacePageSelectorDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78297Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C31682OooO.class), new OooO0o());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23731OooO0oo(new C23730OooO0oO()));
        this.f78298Oooo00O = new C22026ooOO(oooo0.OooO0O0(C30418Oooo0o0.class), new OooO(interfaceC32440OooOO0OooO0O0), new OooOO0O(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0));
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0O0());
        OooO0OO oooO0OO = new OooO0OO(c32447OooOOoOooO0OO);
        this.f78299Oooo00o = new C22026ooOO(oooo0.OooO0O0(C30394OooOOOO.class), oooO0OO, new C23729OooO0o0(c32447OooOOoOooO0OO), new C23728OooO0Oo(c32447OooOOoOooO0OO));
        this.f78308OoooO0O = new ViewOnClickListenerC28243OooOo0O(this, 6);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_replace_page_selector_dialog;
    }

    public final C30418Oooo0o0 Oooo0() {
        return (C30418Oooo0o0) this.f78298Oooo00O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C31682OooO Oooo00o() {
        return (C31682OooO) this.f78297Oooo000.getValue();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        ((C30394OooOOOO) this.f78299Oooo00o.getValue()).OooOO0o(null);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws IOException {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Oooo0().OooO0oO(Oooo00o().f113218OooO00o);
        C30418Oooo0o0 c30418Oooo0o0Oooo0 = Oooo0();
        Integer numValueOf = Integer.valueOf(Oooo00o().f113219OooO0O0 + 1);
        C33781o00o0O c33781o00o0O = c30418Oooo0o0Oooo0.f108653OooOO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
        this.f78296Oooo0 = (TextView) view.findViewById(R.id.dialog_title);
        this.f78301Oooo0OO = (ImageView) view.findViewById(R.id.preview);
        View viewFindViewById = view.findViewById(R.id.btn_page_backward_to_start);
        this.f78303Oooo0o0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnBackwardToStart");
            throw null;
        }
        ViewOnClickListenerC28243OooOo0O viewOnClickListenerC28243OooOo0O = this.f78308OoooO0O;
        viewFindViewById.setOnClickListener(viewOnClickListenerC28243OooOo0O);
        View viewFindViewById2 = view.findViewById(R.id.btn_page_backward);
        this.f78302Oooo0o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBackward");
            throw null;
        }
        viewFindViewById2.setOnClickListener(viewOnClickListenerC28243OooOo0O);
        View viewFindViewById3 = view.findViewById(R.id.btn_page_forward_to_end);
        this.f78304Oooo0oO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnForwardToEnd");
            throw null;
        }
        viewFindViewById3.setOnClickListener(viewOnClickListenerC28243OooOo0O);
        View viewFindViewById4 = view.findViewById(R.id.btn_page_forward);
        this.f78305Oooo0oo = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnForward");
            throw null;
        }
        viewFindViewById4.setOnClickListener(viewOnClickListenerC28243OooOo0O);
        EditText editText = (EditText) view.findViewById(R.id.input_page_num);
        this.f78295Oooo = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0ooo.OooO00o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z) {
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f113222OooO00o;
                    int iIntValue = ((Number) replacePageSelectorDialogFragment.Oooo0().f108654OooOO0o.getValue()).intValue();
                    EditText editText2 = replacePageSelectorDialogFragment.f78295Oooo;
                    if (editText2 != null) {
                        editText2.setText(String.valueOf(iIntValue));
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                        throw null;
                    }
                }
            }
        });
        EditText editText2 = this.f78295Oooo;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText2.addTextChangedListener(new C31690OooO0oo(this));
        EditText editText3 = this.f78295Oooo;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText3.addTextChangedListener(new C31689OooO0oO(this));
        EditText editText4 = this.f78295Oooo;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputPageNum");
            throw null;
        }
        editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0ooo.OooO0O0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f113223OooOo0o;
                if (i == 2) {
                    try {
                        EditText editText5 = replacePageSelectorDialogFragment.f78295Oooo;
                        if (editText5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                            throw null;
                        }
                        int i2 = Integer.parseInt(editText5.getText().toString());
                        int iIntValue = ((Number) replacePageSelectorDialogFragment.Oooo0().f108655OooOOO.getValue()).intValue();
                        if (i2 >= 1 && i2 <= iIntValue) {
                            if (i2 == ((Number) replacePageSelectorDialogFragment.Oooo0().f108654OooOO0o.getValue()).intValue()) {
                                EditText editText6 = replacePageSelectorDialogFragment.f78295Oooo;
                                if (editText6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                                    throw null;
                                }
                                editText6.setText(i2 + "/" + iIntValue);
                            } else {
                                replacePageSelectorDialogFragment.Oooo0().OooO(i2);
                            }
                            Object systemService = textView.getContext().getSystemService("input_method");
                            kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                            ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                            ImageView imageView = replacePageSelectorDialogFragment.f78301Oooo0OO;
                            if (imageView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("preview");
                                throw null;
                            }
                            imageView.requestFocus();
                        }
                    } catch (Exception unused) {
                        Context contextRequireContext = replacePageSelectorDialogFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        String string = replacePageSelectorDialogFragment.getString(R.string.toast_enter_a_pdf_page_number);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    }
                }
                return true;
            }
        });
        EditText editText5 = (EditText) view.findViewById(R.id.et_replace_page);
        this.f78300Oooo0O0 = editText5;
        if (editText5 == null) {
            OooOOO0.OooOOOO("dstPageNum");
            throw null;
        }
        editText5.setVisibility(Oooo00o().f113221OooO0Oo > 0 ? 0 : 8);
        EditText editText6 = this.f78300Oooo0O0;
        if (editText6 == null) {
            OooOOO0.OooOOOO("dstPageNum");
            throw null;
        }
        editText6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0ooo.OooO0OO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                InputMethodManager inputMethodManager;
                ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f113224OooO00o;
                if (!z) {
                    String str = (String) replacePageSelectorDialogFragment.Oooo0().f108663OooOo00.f121747OooOo0o.getValue();
                    EditText editText7 = replacePageSelectorDialogFragment.f78300Oooo0O0;
                    if (editText7 != null) {
                        editText7.setText(str);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("dstPageNum");
                        throw null;
                    }
                }
                int iIntValue = ((Number) replacePageSelectorDialogFragment.Oooo0().f108660OooOOo0.getValue()).intValue();
                EditText editText8 = replacePageSelectorDialogFragment.f78300Oooo0O0;
                if (editText8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("dstPageNum");
                    throw null;
                }
                editText8.setText(String.valueOf(iIntValue));
                EditText editText9 = replacePageSelectorDialogFragment.f78300Oooo0O0;
                if (editText9 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("dstPageNum");
                    throw null;
                }
                editText9.setSelection(editText9.getText().length());
                EditText editText10 = replacePageSelectorDialogFragment.f78300Oooo0O0;
                if (editText10 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("dstPageNum");
                    throw null;
                }
                if (!editText10.requestFocus() || (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(replacePageSelectorDialogFragment.requireContext(), InputMethodManager.class)) == null) {
                    return;
                }
                inputMethodManager.showSoftInput(editText10, 1);
            }
        });
        EditText editText7 = this.f78300Oooo0O0;
        if (editText7 == null) {
            OooOOO0.OooOOOO("dstPageNum");
            throw null;
        }
        editText7.addTextChangedListener(new C31687OooO0o(this));
        EditText editText8 = this.f78300Oooo0O0;
        if (editText8 == null) {
            OooOOO0.OooOOOO("dstPageNum");
            throw null;
        }
        editText8.addTextChangedListener(new C31688OooO0o0(this));
        EditText editText9 = this.f78300Oooo0O0;
        if (editText9 == null) {
            OooOOO0.OooOOOO("dstPageNum");
            throw null;
        }
        editText9.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0ooo.OooO0Oo
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                int iIntValue;
                if (i == 6) {
                    ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f113225OooOo0o;
                    int iIntValue2 = ((Number) replacePageSelectorDialogFragment.Oooo0().f108661OooOOoo.getValue()).intValue();
                    EditText editText10 = replacePageSelectorDialogFragment.f78300Oooo0O0;
                    if (editText10 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("dstPageNum");
                        throw null;
                    }
                    Integer numOooOOO0 = C33596OooOOo0.OooOOO0(editText10.getText().toString());
                    if (numOooOOO0 != null && (iIntValue = numOooOOO0.intValue()) >= 1 && iIntValue <= iIntValue2) {
                        if (iIntValue == ((Number) replacePageSelectorDialogFragment.Oooo0().f108660OooOOo0.getValue()).intValue()) {
                            EditText editText11 = replacePageSelectorDialogFragment.f78300Oooo0O0;
                            if (editText11 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("dstPageNum");
                                throw null;
                            }
                            editText11.setText(iIntValue + "/" + iIntValue2);
                        } else {
                            C33781o00o0O c33781o00o0O2 = replacePageSelectorDialogFragment.Oooo0().f108658OooOOOo;
                            c33781o00o0O2.getClass();
                            c33781o00o0O2.OooOO0(null, numOooOOO0);
                        }
                        Object systemService = textView.getContext().getSystemService("input_method");
                        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                        return true;
                    }
                }
                return true;
            }
        });
        C30418Oooo0o0 c30418Oooo0o0Oooo02 = Oooo0();
        Integer numValueOf2 = Integer.valueOf(Oooo00o().f113221OooO0Oo);
        C33781o00o0O c33781o00o0O2 = c30418Oooo0o0Oooo02.f108659OooOOo;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, numValueOf2);
        C30418Oooo0o0 c30418Oooo0o0Oooo03 = Oooo0();
        Integer numValueOf3 = Integer.valueOf(Oooo00o().f113220OooO0OO + 1);
        C33781o00o0O c33781o00o0O3 = c30418Oooo0o0Oooo03.f108658OooOOOo;
        c33781o00o0O3.getClass();
        c33781o00o0O3.OooOO0(null, numValueOf3);
        TextView textView = this.f78296Oooo0;
        if (textView == null) {
            OooOOO0.OooOOOO("tvTitle");
            throw null;
        }
        textView.setText(getString(R.string.select_page_to_replace));
        View viewFindViewById5 = view.findViewById(R.id.btn_cancel);
        this.f78307OoooO00 = viewFindViewById5;
        if (viewFindViewById5 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById5.setOnClickListener(new ViewOnClickListenerC28244OooOo0o(this, 7));
        View viewFindViewById6 = view.findViewById(R.id.btn_confirm);
        this.f78306OoooO0 = viewFindViewById6;
        if (viewFindViewById6 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById6, 500L, new ViewOnClickListenerC26036Oooo(this, 8));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}
