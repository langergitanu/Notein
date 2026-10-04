package o0oOO0Oo;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.p607ui.noteeditor.noteswitch.NoteEditorSwitchFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0o0O0o.C30294OooO0OO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oOO0Oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$initRecentNoteList$4", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30810OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorSwitchFragment f110114OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f110115OooOo0o;

    /* JADX INFO: renamed from: o0oOO0Oo.OooOO0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$initRecentNoteList$4$1", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorSwitchFragment f110116OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110117OooOo0o;

        /* JADX INFO: renamed from: o0oOO0Oo.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20128OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorSwitchFragment f110118OooOo0o;

            public C20128OooO00o(NoteEditorSwitchFragment noteEditorSwitchFragment) {
                this.f110118OooOo0o = noteEditorSwitchFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<T> list = (List) obj;
                C30801OooO00o c30801OooO00o = this.f110118OooOo0o.f74717Oooo00o;
                if (c30801OooO00o != null) {
                    c30801OooO00o.OooO0Oo(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("recentNoteAdapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorSwitchFragment noteEditorSwitchFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110116OooOo = noteEditorSwitchFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110116OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110117OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorSwitchFragment noteEditorSwitchFragment = this.f110116OooOo;
                C30821OooOo0O c30821OooOo0OOooOooO = noteEditorSwitchFragment.OooOooO();
                C20128OooO00o c20128OooO00o = new C20128OooO00o(noteEditorSwitchFragment);
                this.f110117OooOo0o = 1;
                if (c30821OooOo0OOooOooO.f110168OooOOO0.f121747OooOo0o.collect(c20128OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0oOO0Oo.OooOO0O$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$initRecentNoteList$4$2", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorSwitchFragment f110119OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110120OooOo0o;

        /* JADX INFO: renamed from: o0oOO0Oo.OooOO0O$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorSwitchFragment f110121OooOo0o;

            public OooO00o(NoteEditorSwitchFragment noteEditorSwitchFragment) {
                this.f110121OooOo0o = noteEditorSwitchFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                C30821OooOo0O c30821OooOo0OOooOooO = this.f110121OooOo0o.OooOooO();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = ((List) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Set setO0OO00O = OooOo.o0OO00O(arrayList);
                        C33781o00o0O c33781o00o0O = c30821OooOo0OOooOooO.f110165OooOO0;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, setO0OO00O);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    NoteContent noteContent = (NoteContent) it.next();
                    String id = noteContent != null ? noteContent.getId() : null;
                    if (id != null) {
                        arrayList.add(id);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorSwitchFragment noteEditorSwitchFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f110119OooOo = noteEditorSwitchFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f110119OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110120OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorSwitchFragment noteEditorSwitchFragment = this.f110119OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo = noteEditorSwitchFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(noteEditorSwitchFragment);
                this.f110120OooOo0o = 1;
                if (oooO0OOOooOoo.f73392OoooOO0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0oOO0Oo.OooOO0O$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$initRecentNoteList$4$3", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {304}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorSwitchFragment f110122OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110123OooOo0o;

        /* JADX INFO: renamed from: o0oOO0Oo.OooOO0O$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteEditorSwitchFragment$initRecentNoteList$4$3$1", m80623f = "NoteEditorSwitchFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends SortKeyVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorSwitchFragment f110124OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f110125OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorSwitchFragment noteEditorSwitchFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f110124OooOo = noteEditorSwitchFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f110124OooOo, continuation);
                oooO00o.f110125OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends SortKeyVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<SortKeyVO> list = (List) this.f110125OooOo0o;
                C30294OooO0OO c30294OooO0OO = this.f110124OooOo.f74718Oooo0O0;
                if (c30294OooO0OO != null) {
                    c30294OooO0OO.OooO0OO(list);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(NoteEditorSwitchFragment noteEditorSwitchFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f110122OooOo = noteEditorSwitchFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f110122OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110123OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorSwitchFragment noteEditorSwitchFragment = this.f110122OooOo;
                C30821OooOo0O c30821OooOo0OOooOooO = noteEditorSwitchFragment.OooOooO();
                OooO00o oooO00o = new OooO00o(noteEditorSwitchFragment, null);
                this.f110123OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c30821OooOo0OOooOooO.f110167OooOO0o, oooO00o, this) == enumC32485OooO00o) {
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
    public C30810OooOO0O(NoteEditorSwitchFragment noteEditorSwitchFragment, Continuation<? super C30810OooOO0O> continuation) {
        super(2, continuation);
        this.f110114OooOo = noteEditorSwitchFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30810OooOO0O c30810OooOO0O = new C30810OooOO0O(this.f110114OooOo, continuation);
        c30810OooOO0O.f110115OooOo0o = obj;
        return c30810OooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30810OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f110115OooOo0o;
        NoteEditorSwitchFragment noteEditorSwitchFragment = this.f110114OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorSwitchFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorSwitchFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteEditorSwitchFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
