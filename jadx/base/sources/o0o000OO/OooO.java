package o0o000OO;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import com.orion.penkit.models.QuoteInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o000OO.OooOO0O;
import o0o000Oo.C29774OooO0O0;
import o0o000o0.C29775OooO00o;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9", m80623f = "TextAnnoTextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105486OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f105487OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TextAnnoTextEditor f105488OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9$1", m80623f = "TextAnnoTextEditor.kt", m80624l = {182}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f105489OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105490OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextAnnoTextEditor f105491OooOoO0;

        /* JADX INFO: renamed from: o0o000OO.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20020OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ TextAnnoTextEditor f105492OooOo0o;

            public C20020OooO00o(TextAnnoTextEditor textAnnoTextEditor) {
                this.f105492OooOo0o = textAnnoTextEditor;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                final TextAnnoTextEditor textAnnoTextEditor = this.f105492OooOo0o;
                final List<T> list = textAnnoTextEditor.f76403OooOooo.f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                Runnable runnable = new Runnable() { // from class: o0o000OO.OooO0oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        final TextAnnoTextEditor textAnnoTextEditor2 = textAnnoTextEditor;
                        Iterable iterable = textAnnoTextEditor2.f76403OooOooo.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(iterable, "getCurrentList(...)");
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((C29775OooO00o) it.next()).f105679OooO0oO) {
                                    return;
                                }
                            }
                        }
                        Iterable iterable2 = iterable;
                        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                            return;
                        }
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C29775OooO00o) it2.next()).f105679OooO0oO) {
                                if (textAnnoTextEditor2.f76404Oooo) {
                                    final int i = 0;
                                    textAnnoTextEditor2.f76404Oooo = false;
                                    List<T> list3 = textAnnoTextEditor2.f76403OooOooo.f66021OooO00o.f65811OooO0o;
                                    kotlin.jvm.internal.OooOOO0.OooO0o(list3, "getCurrentList(...)");
                                    Iterator it3 = list3.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            i = -1;
                                            break;
                                        } else if (((C29775OooO00o) it3.next()).f105679OooO0oO) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                    if (i == -1) {
                                        return;
                                    }
                                    RecyclerView recyclerView = textAnnoTextEditor2.f76402OooOooO;
                                    if (recyclerView == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextList");
                                        throw null;
                                    }
                                    recyclerView.scrollToPosition(i);
                                    RecyclerView recyclerView2 = textAnnoTextEditor2.f76402OooOooO;
                                    if (recyclerView2 != null) {
                                        recyclerView2.post(new Runnable() { // from class: o0o000OO.OooO0o
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RecyclerView recyclerView3 = textAnnoTextEditor2.f76402OooOooO;
                                                if (recyclerView3 == null) {
                                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextList");
                                                    throw null;
                                                }
                                                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = recyclerView3.findViewHolderForAdapterPosition(i);
                                                C29774OooO0O0.OooO00o oooO00o = abstractC22078OooOooOFindViewHolderForAdapterPosition instanceof C29774OooO0O0.OooO00o ? (C29774OooO0O0.OooO00o) abstractC22078OooOooOFindViewHolderForAdapterPosition : null;
                                                if (oooO00o != null) {
                                                    EditText editText = oooO00o.f105669OooO0OO;
                                                    if (editText.requestFocus()) {
                                                        Object systemService = oooO00o.itemView.getContext().getSystemService("input_method");
                                                        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                                        ((InputMethodManager) systemService).showSoftInput(editText, 1);
                                                    }
                                                }
                                            }
                                        });
                                        return;
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextList");
                                        throw null;
                                    }
                                }
                                return;
                            }
                        }
                    }
                };
                textAnnoTextEditor.f76403OooOooo.OooO0o0((List) obj, runnable);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O oooOO0O, TextAnnoTextEditor textAnnoTextEditor, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105489OooOo = oooOO0O;
            this.f105491OooOoO0 = textAnnoTextEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105489OooOo, this.f105491OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105490OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooOO0O oooOO0O = this.f105489OooOo;
                C20020OooO00o c20020OooO00o = new C20020OooO00o(this.f105491OooOoO0);
                this.f105490OooOo0o = 1;
                if (oooOO0O.f105549OooOo0O.f121747OooOo0o.collect(c20020OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9$2", m80623f = "TextAnnoTextEditor.kt", m80624l = {196}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f105493OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105494OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextAnnoTextEditor f105495OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9$2$1", m80623f = "TextAnnoTextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<QuoteInfo, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextAnnoTextEditor f105496OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105497OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextAnnoTextEditor textAnnoTextEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105496OooOo = textAnnoTextEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105496OooOo, continuation);
                oooO00o.f105497OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(QuoteInfo quoteInfo, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(quoteInfo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                QuoteInfo quoteInfo = (QuoteInfo) this.f105497OooOo0o;
                if (quoteInfo == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                int bgColor = quoteInfo.getBgColor();
                int i = TextAnnoTextEditor.f76394OoooO0O;
                TextAnnoTextEditor textAnnoTextEditor = this.f105496OooOo;
                textAnnoTextEditor.OooO0o0(bgColor);
                if (quoteInfo.getBgColor() == 0) {
                    Context context = textAnnoTextEditor.getContext();
                    if (context != null) {
                        textAnnoTextEditor.OooO0oo(context.getColor(R.color.text_anno_editor_btn_color_2));
                    }
                } else {
                    textAnnoTextEditor.OooO0oo(quoteInfo.getBgColor());
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOO0O oooOO0O, TextAnnoTextEditor textAnnoTextEditor, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f105493OooOo = oooOO0O;
            this.f105495OooOoO0 = textAnnoTextEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f105493OooOo, this.f105495OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105494OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooOO0O oooOO0O = this.f105493OooOo;
                OooO00o oooO00o = new OooO00o(this.f105495OooOoO0, null);
                this.f105494OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooOO0O.f105543OooOOo, oooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9$3", m80623f = "TextAnnoTextEditor.kt", m80624l = {214}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f105498OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105499OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextAnnoTextEditor f105500OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9$3$1", m80623f = "TextAnnoTextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooOO0O.OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextAnnoTextEditor f105501OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105502OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextAnnoTextEditor textAnnoTextEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105501OooOo = textAnnoTextEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105501OooOo, continuation);
                oooO00o.f105502OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooOO0O.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooOO0O.OooO00o oooO00o = (OooOO0O.OooO00o) this.f105502OooOo0o;
                View view = this.f105501OooOo.f76410Oooo0OO;
                if (view != null) {
                    view.setEnabled(oooO00o != null);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnPrev");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooOO0O oooOO0O, TextAnnoTextEditor textAnnoTextEditor, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f105498OooOo = oooOO0O;
            this.f105500OooOoO0 = textAnnoTextEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f105498OooOo, this.f105500OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105499OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooOO0O oooOO0O = this.f105498OooOo;
                OooO00o oooO00o = new OooO00o(this.f105500OooOoO0, null);
                this.f105499OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooOO0O.f105546OooOo, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o000OO.OooO$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9$4", m80623f = "TextAnnoTextEditor.kt", m80624l = {220}, m80625m = "invokeSuspend")
    public static final class C29748OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f105503OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105504OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ TextAnnoTextEditor f105505OooOoO0;

        /* JADX INFO: renamed from: o0o000OO.OooO$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoTextEditor$initByViewModel$9$4$1", m80623f = "TextAnnoTextEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooOO0O.OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextAnnoTextEditor f105506OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105507OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextAnnoTextEditor textAnnoTextEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f105506OooOo = textAnnoTextEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f105506OooOo, continuation);
                oooO00o.f105507OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooOO0O.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooOO0O.OooO00o oooO00o = (OooOO0O.OooO00o) this.f105507OooOo0o;
                View view = this.f105506OooOo.f76412Oooo0o0;
                if (view != null) {
                    view.setEnabled(oooO00o != null);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnNext");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29748OooO0Oo(OooOO0O oooOO0O, TextAnnoTextEditor textAnnoTextEditor, Continuation<? super C29748OooO0Oo> continuation) {
            super(2, continuation);
            this.f105503OooOo = oooOO0O;
            this.f105505OooOoO0 = textAnnoTextEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C29748OooO0Oo(this.f105503OooOo, this.f105505OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C29748OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105504OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooOO0O oooOO0O = this.f105503OooOo;
                OooO00o oooO00o = new OooO00o(this.f105505OooOoO0, null);
                this.f105504OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooOO0O.f105550OooOo0o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooOO0O oooOO0O, TextAnnoTextEditor textAnnoTextEditor, Continuation<? super OooO> continuation) {
        super(2, continuation);
        this.f105486OooOo = oooOO0O;
        this.f105488OooOoO0 = textAnnoTextEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO oooO = new OooO(this.f105486OooOo, this.f105488OooOoO0, continuation);
        oooO.f105487OooOo0o = obj;
        return oooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105487OooOo0o;
        OooOO0O oooOO0O = this.f105486OooOo;
        TextAnnoTextEditor textAnnoTextEditor = this.f105488OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(oooOO0O, textAnnoTextEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(oooOO0O, textAnnoTextEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(oooOO0O, textAnnoTextEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C29748OooO0Oo(oooOO0O, textAnnoTextEditor, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
