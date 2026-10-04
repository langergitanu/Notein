package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00000O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initEditor$2", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28752o00000O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101829OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f101830OooOo0o;

    /* JADX INFO: renamed from: o0OoO0oo.o00000O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initEditor$2$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1817}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f101831OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101832OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00000O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initEditor$2$1$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19924OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101833OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ int f101834OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19924OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19924OooO00o> continuation) {
                super(2, continuation);
                this.f101833OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19924OooO00o c19924OooO00o = new C19924OooO00o(this.f101833OooOo, continuation);
                c19924OooO00o.f101834OooOo0o = ((Number) obj).intValue();
                return c19924OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                return ((C19924OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i = this.f101834OooOo0o;
                NoteEditorContainer noteEditorContainer = this.f101833OooOo.f72831OoooOoo;
                if (noteEditorContainer != null) {
                    noteEditorContainer.setFocusedEditorIndex(i);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f101831OooOo = noteEditorContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f101831OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101832OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101831OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                C19924OooO00o c19924OooO00o = new C19924OooO00o(noteEditorContainerFragment, null);
                this.f101832OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73393OoooOOO, c19924OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoO0oo.o00000O0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initEditor$2$2", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1822}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f101835OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101836OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00000O0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initEditor$2$2$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends Float>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f101837OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f101838OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f101837OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f101837OooOo, continuation);
                oooO00o.f101838OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends Integer, ? extends Float> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f101838OooOo0o;
                int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                Float f = (Float) c32443OooOOO.f116637OooOo;
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101837OooOo;
                if (f != null) {
                    NoteEditorContainer noteEditorContainer = noteEditorContainerFragment.f72831OoooOoo;
                    if (noteEditorContainer == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                        throw null;
                    }
                    noteEditorContainer.OooO0O0(iIntValue, f.floatValue());
                } else {
                    NoteEditorContainer noteEditorContainer2 = noteEditorContainerFragment.f72831OoooOoo;
                    if (noteEditorContainer2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                        throw null;
                    }
                    List<Integer> list = NoteEditorContainer.f76968Oooo0o;
                    noteEditorContainer2.OooO0O0(iIntValue, 0.5f);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f101835OooOo = noteEditorContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f101835OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101836OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101835OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                OooO00o oooO00o = new OooO00o(noteEditorContainerFragment, null);
                this.f101836OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73387Oooo0oo, oooO00o, this) == enumC32485OooO00o) {
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
    public C28752o00000O0(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C28752o00000O0> continuation) {
        super(2, continuation);
        this.f101829OooOo = noteEditorContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28752o00000O0 c28752o00000O0 = new C28752o00000O0(this.f101829OooOo, continuation);
        c28752o00000O0.f101830OooOo0o = obj;
        return c28752o00000O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28752o00000O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f101830OooOo0o;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101829OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorContainerFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorContainerFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
