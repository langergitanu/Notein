package o0o0OOO;

import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0OOO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$setupTitleInputContainer$1$5", m80623f = "PaperConfigDialogFragment.kt", m80624l = {StyleIdentifier.BOOK_TITLE}, m80625m = "invokeSuspend")
public final class C30498Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PaperConfigDialogFragment f108907OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108908OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ TextView f108909OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EditText f108910OooOoO0;

    /* JADX INFO: renamed from: o0o0OOO.Oooo0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$setupTitleInputContainer$1$5$1", m80623f = "PaperConfigDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PaperConfigDialogFragment f108911OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f108912OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ TextView f108913OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ EditText f108914OooOoO0;

        /* JADX INFO: renamed from: o0o0OOO.Oooo0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$setupTitleInputContainer$1$5$1$1", m80623f = "PaperConfigDialogFragment.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_1}, m80625m = "invokeSuspend")
        public static final class C20090OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PaperConfigDialogFragment f108915OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108916OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ TextView f108917OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ EditText f108918OooOoO0;

            /* JADX INFO: renamed from: o0o0OOO.Oooo0o0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C20091OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextView f108919OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditText f108920OooOo0o;

                public C20091OooO00o(EditText editText, TextView textView) {
                    this.f108920OooOo0o = editText;
                    this.f108919OooOo = textView;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    int i = zBooleanValue ? 0 : 8;
                    EditText editText = this.f108920OooOo0o;
                    editText.setVisibility(i);
                    TextView textView = this.f108919OooOo;
                    if (textView != null) {
                        textView.setVisibility(zBooleanValue ? 8 : 0);
                    }
                    if (zBooleanValue && !editText.hasFocus()) {
                        editText.setSelection(editText.getText().length());
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20090OooO00o(PaperConfigDialogFragment paperConfigDialogFragment, EditText editText, TextView textView, Continuation<? super C20090OooO00o> continuation) {
                super(2, continuation);
                this.f108915OooOo = paperConfigDialogFragment;
                this.f108918OooOoO0 = editText;
                this.f108917OooOoO = textView;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20090OooO00o(this.f108915OooOo, this.f108918OooOoO0, this.f108917OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C20090OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108916OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C30520o000000o c30520o000000oOooOoo = this.f108915OooOo.OooOoo();
                    C20091OooO00o c20091OooO00o = new C20091OooO00o(this.f108918OooOoO0, this.f108917OooOoO);
                    this.f108916OooOo0o = 1;
                    if (c30520o000000oOooOoo.f109038OoooO0.f121747OooOo0o.collect(c20091OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0o0OOO.Oooo0o0$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$setupTitleInputContainer$1$5$1$2", m80623f = "PaperConfigDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PaperConfigDialogFragment f108921OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f108922OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ TextView f108923OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ EditText f108924OooOoO0;

            /* JADX INFO: renamed from: o0o0OOO.Oooo0o0$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C20092OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextView f108925OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditText f108926OooOo0o;

                public C20092OooO00o(EditText editText, TextView textView) {
                    this.f108926OooOo0o = editText;
                    this.f108925OooOo = textView;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    EditText editText = this.f108926OooOo0o;
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(editText.getText().toString(), str)) {
                        editText.setText(str);
                    }
                    TextView textView = this.f108925OooOo;
                    if (textView != null) {
                        textView.setText(str);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PaperConfigDialogFragment paperConfigDialogFragment, EditText editText, TextView textView, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f108921OooOo = paperConfigDialogFragment;
                this.f108924OooOoO0 = editText;
                this.f108923OooOoO = textView;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f108921OooOo, this.f108924OooOoO0, this.f108923OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f108922OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                C30520o000000o c30520o000000oOooOoo = this.f108921OooOo.OooOoo();
                C20092OooO00o c20092OooO00o = new C20092OooO00o(this.f108924OooOoO0, this.f108923OooOoO);
                this.f108922OooOo0o = 1;
                c30520o000000oOooOoo.f109031Oooo0O0.collect(c20092OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PaperConfigDialogFragment paperConfigDialogFragment, EditText editText, TextView textView, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f108911OooOo = paperConfigDialogFragment;
            this.f108914OooOoO0 = editText;
            this.f108913OooOoO = textView;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f108911OooOo, this.f108914OooOoO0, this.f108913OooOoO, continuation);
            oooO00o.f108912OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f108912OooOo0o;
            PaperConfigDialogFragment paperConfigDialogFragment = this.f108911OooOo;
            EditText editText = this.f108914OooOoO0;
            TextView textView = this.f108913OooOoO;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C20090OooO00o(paperConfigDialogFragment, editText, textView, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(paperConfigDialogFragment, editText, textView, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30498Oooo0o0(PaperConfigDialogFragment paperConfigDialogFragment, EditText editText, TextView textView, Continuation<? super C30498Oooo0o0> continuation) {
        super(2, continuation);
        this.f108907OooOo = paperConfigDialogFragment;
        this.f108910OooOoO0 = editText;
        this.f108909OooOoO = textView;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30498Oooo0o0(this.f108907OooOo, this.f108910OooOoO0, this.f108909OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30498Oooo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108908OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PaperConfigDialogFragment paperConfigDialogFragment = this.f108907OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = paperConfigDialogFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(paperConfigDialogFragment, this.f108910OooOoO0, this.f108909OooOoO, null);
            this.f108908OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
