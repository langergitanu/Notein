package com.orion.notein.p607ui.noteeditor.recognize;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0o00.C25995o0ooOO0;
import o0O0o0oO.ViewOnClickListenerC26035OooOooo;
import o0Oo0O0.C28050OooO0OO;
import o0Ooo000.ViewOnClickListenerC29364Oooo0OO;
import o0o0o00O.C30761OooO;
import o0o0o00O.C30762OooO00o;
import o0o0o00O.C30766OooO0o;
import o0o0o00O.C30767OooO0o0;
import o0o0o00O.C30769OooO0oo;
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
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/recognize/TextRecognizeDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextRecognizeDialogFragment extends Hilt_TextRecognizeDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f76163OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EditText f76164OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f76165Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f76166Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C30762OooO00o f76167Oooo00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$onViewCreated$4", m80623f = "TextRecognizeDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76169OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$onViewCreated$4$1", m80623f = "TextRecognizeDialogFragment.kt", m80624l = {79}, m80625m = "invokeSuspend")
        public static final class C19376OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeDialogFragment f76170OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76171OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$onViewCreated$4$1$1", m80623f = "TextRecognizeDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19377OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextRecognizeDialogFragment f76172OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76173OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19377OooO00o(TextRecognizeDialogFragment textRecognizeDialogFragment, Continuation<? super C19377OooO00o> continuation) {
                    super(2, continuation);
                    this.f76172OooOo = textRecognizeDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19377OooO00o c19377OooO00o = new C19377OooO00o(this.f76172OooOo, continuation);
                    c19377OooO00o.f76173OooOo0o = obj;
                    return c19377OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19377OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String str = (String) this.f76173OooOo0o;
                    boolean z = str == null || str.length() == 0;
                    TextRecognizeDialogFragment textRecognizeDialogFragment = this.f76172OooOo;
                    View view = textRecognizeDialogFragment.f76165Oooo000;
                    if (view == null) {
                        OooOOO0.OooOOOO("btnCopy");
                        throw null;
                    }
                    view.setEnabled(!z);
                    View view2 = textRecognizeDialogFragment.f76166Oooo00O;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("btnTextBox");
                        throw null;
                    }
                    view2.setEnabled(true ^ z);
                    if (str == null) {
                        EditText editText = textRecognizeDialogFragment.f76164OooOooo;
                        if (editText == null) {
                            OooOOO0.OooOOOO("result");
                            throw null;
                        }
                        editText.setHint(textRecognizeDialogFragment.getString(R.string.text_recognize_in_progress));
                    } else if (str.length() == 0) {
                        EditText editText2 = textRecognizeDialogFragment.f76164OooOooo;
                        if (editText2 == null) {
                            OooOOO0.OooOOOO("result");
                            throw null;
                        }
                        editText2.setHint(textRecognizeDialogFragment.getString(R.string.text_recognize_empty_hint));
                    } else {
                        EditText editText3 = textRecognizeDialogFragment.f76164OooOooo;
                        if (editText3 == null) {
                            OooOOO0.OooOOOO("result");
                            throw null;
                        }
                        editText3.setHint("");
                    }
                    EditText editText4 = textRecognizeDialogFragment.f76164OooOooo;
                    if (editText4 != null) {
                        editText4.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("result");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19376OooO00o(TextRecognizeDialogFragment textRecognizeDialogFragment, Continuation<? super C19376OooO00o> continuation) {
                super(2, continuation);
                this.f76170OooOo = textRecognizeDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19376OooO00o(this.f76170OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19376OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76171OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TextRecognizeDialogFragment textRecognizeDialogFragment = this.f76170OooOo;
                    C30761OooO c30761OooOOooOoo = textRecognizeDialogFragment.OooOoo();
                    C19377OooO00o c19377OooO00o = new C19377OooO00o(textRecognizeDialogFragment, null);
                    this.f76171OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30761OooOOooOoo.f110010OooO0oO, c19377OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$onViewCreated$4$2", m80623f = "TextRecognizeDialogFragment.kt", m80624l = {100}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeDialogFragment f76174OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76175OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$onViewCreated$4$2$1", m80623f = "TextRecognizeDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19378OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Map<Integer, ? extends Object>, Continuation<? super C32460OooOooO>, Object> {
                public C19378OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19378OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Map<Integer, ? extends Object> map, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19378OooO00o) create(map, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(TextRecognizeDialogFragment textRecognizeDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f76174OooOo = textRecognizeDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f76174OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76175OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C30761OooO c30761OooOOooOoo = this.f76174OooOo.OooOoo();
                    C19378OooO00o c19378OooO00o = new C19378OooO00o(2, null);
                    this.f76175OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30761OooOOooOoo.f110011OooO0oo, c19378OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$onViewCreated$4$3", m80623f = "TextRecognizeDialogFragment.kt", m80624l = {104}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeDialogFragment f76176OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76177OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$onViewCreated$4$3$1", m80623f = "TextRecognizeDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19379OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Map<Integer, ? extends Object>, Continuation<? super C32460OooOooO>, Object> {
                public C19379OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19379OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Map<Integer, ? extends Object> map, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19379OooO00o) create(map, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(TextRecognizeDialogFragment textRecognizeDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f76176OooOo = textRecognizeDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f76176OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76177OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C30761OooO c30761OooOOooOoo = this.f76176OooOo.OooOoo();
                    C19379OooO00o c19379OooO00o = new C19379OooO00o(2, null);
                    this.f76177OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30761OooOOooOoo.f110011OooO0oo, c19379OooO00o, this) == enumC32485OooO00o) {
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
            OooO00o oooO00o = TextRecognizeDialogFragment.this.new OooO00o(continuation);
            oooO00o.f76169OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76169OooOo0o;
            TextRecognizeDialogFragment textRecognizeDialogFragment = TextRecognizeDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19376OooO00o(textRecognizeDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(textRecognizeDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(textRecognizeDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return TextRecognizeDialogFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f76179OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f76179OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76179OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23562OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76180OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23562OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76180OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76180OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76181OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76181OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76181OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? TextRecognizeDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.recognize.TextRecognizeDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23563OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76183OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23563OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76183OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76183OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public TextRecognizeDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f76163OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30761OooO.class), new C23562OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23563OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    public final C30761OooO OooOoo() {
        return (C30761OooO) this.f76163OooOooO.getValue();
    }

    public final TextBoxInfo OooOoo0() {
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        C30761OooO c30761OooOOooOoo = OooOoo();
        EditText editText = this.f76164OooOooo;
        if (editText == null) {
            OooOOO0.OooOOOO("result");
            throw null;
        }
        String text = editText.getText().toString();
        OooOOO0.OooO0oO(text, "text");
        Map<Integer, ? extends Object> map = (Map) c30761OooOOooOoo.f110011OooO0oo.f121747OooOo0o.getValue();
        C30766OooO0o c30766OooO0o = new C30766OooO0o(c30761OooOOooOoo, null);
        OooO oooO = OooO.f123416OooOo0o;
        return TextBoxInfo.INSTANCE.fromText(contextRequireContext, text, map, ((Number) C33609OooO0oo.OooO0Oo(oooO, c30766OooO0o)).floatValue(), ((Number) C33609OooO0oo.OooO0Oo(oooO, new C30767OooO0o0(c30761OooOOooOoo, null))).intValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_text_recognize_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        view.findViewById(R.id.btn_close).setOnClickListener(new ViewOnClickListenerC29364Oooo0OO(this, 1));
        EditText editText = (EditText) view.findViewById(R.id.et_result);
        this.f76164OooOooo = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("result");
            throw null;
        }
        editText.setTextSize(0, 30.0f);
        View viewFindViewById = view.findViewById(R.id.btn_copy);
        this.f76165Oooo000 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o0OoO.OooO(this, 1));
        View viewFindViewById2 = view.findViewById(R.id.btn_convert_to_text_box);
        this.f76166Oooo00O = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnTextBox");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC26035OooOooo(this, 4));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
        C30762OooO00o c30762OooO00o = this.f76167Oooo00o;
        if (c30762OooO00o != null) {
            PDFView pDFView = c30762OooO00o.f110017OooO00o;
            pDFView.getClass();
            ArrayList arrayListOooOOo = pDFView.OooOOo(false, new C25995o0ooOO0(pDFView));
            LassoParams lassoParams = c30762OooO00o.f110020OooO0Oo;
            OooOOO0.OooO0oO(lassoParams, "lassoParams");
            C30761OooO c30761OooOOooOoo = OooOoo();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30761OooOOooOoo);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30769OooO0oo(c30761OooOOooOoo, arrayListOooOOo, lassoParams, null), 2);
        }
    }
}
