package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.ToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OoOOoO.C29192OooO0o0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;

/* JADX INFO: renamed from: o0OoO0oo.o00000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initPenBarView$3", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1271}, m80625m = "invokeSuspend")
public final class C28751o00000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101821OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101822OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f101823OooOoO0;

    /* JADX INFO: renamed from: o0OoO0oo.o00000O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initPenBarView$3$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Boolean, Continuation<? super C32443OooOOO<? extends Integer, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Boolean f101824OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Integer f101825OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(Integer num, Boolean bool, Continuation<? super C32443OooOOO<? extends Integer, ? extends Boolean>> continuation) {
            OooO00o oooO00o = new OooO00o(3, continuation);
            oooO00o.f101825OooOo0o = num;
            oooO00o.f101824OooOo = bool;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return new C32443OooOOO(this.f101825OooOo0o, this.f101824OooOo);
        }
    }

    /* JADX INFO: renamed from: o0OoO0oo.o00000O$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$initPenBarView$3$2", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends Boolean>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f101826OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f101827OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f101828OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorContainerFragment noteEditorContainerFragment, Continuation continuation, boolean z) {
            super(2, continuation);
            this.f101826OooOo = z;
            this.f101828OooOoO0 = noteEditorContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f101828OooOoO0, continuation, this.f101826OooOo);
            oooO0O0.f101827OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C32443OooOOO<? extends Integer, ? extends Boolean> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f101827OooOo0o;
            Integer num = (Integer) c32443OooOOO.f116638OooOo0o;
            Boolean bool = (Boolean) c32443OooOOO.f116637OooOo;
            NoteEditorContainerFragment noteEditorContainerFragment = this.f101828OooOoO0;
            if (num == null || this.f101826OooOo || kotlin.jvm.internal.OooOOO0.OooO0O0(bool, Boolean.FALSE)) {
                NoteEditorContainer noteEditorContainer = noteEditorContainerFragment.f72831OoooOoo;
                if (noteEditorContainer != null) {
                    NoteEditorContainerFragment.Oooo0oO(noteEditorContainer, 0, 0, 0, 0);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                throw null;
            }
            int iOooO0o = Oooo0.o000000O.OooO0o(40);
            if (num.intValue() == 1) {
                NoteEditorContainer noteEditorContainer2 = noteEditorContainerFragment.f72831OoooOoo;
                if (noteEditorContainer2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                    throw null;
                }
                i = iOooO0o;
                NoteEditorContainerFragment.Oooo0oo(noteEditorContainer2, 0, i, 0, 0, 26);
            } else {
                i = iOooO0o;
                if (num.intValue() == 7) {
                    NoteEditorContainer noteEditorContainer3 = noteEditorContainerFragment.f72831OoooOoo;
                    if (noteEditorContainer3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                        throw null;
                    }
                    NoteEditorContainerFragment.Oooo0oo(noteEditorContainer3, i, 0, 0, 0, 28);
                    i = i;
                } else if (num.intValue() == 3) {
                    NoteEditorContainer noteEditorContainer4 = noteEditorContainerFragment.f72831OoooOoo;
                    if (noteEditorContainer4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                        throw null;
                    }
                    NoteEditorContainerFragment.Oooo0oo(noteEditorContainer4, 0, 0, i, 0, 22);
                    i = i;
                } else if (num.intValue() == 5) {
                    NoteEditorContainer noteEditorContainer5 = noteEditorContainerFragment.f72831OoooOoo;
                    if (noteEditorContainer5 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                        throw null;
                    }
                    NoteEditorContainerFragment.Oooo0oo(noteEditorContainer5, 0, 0, 0, i, 14);
                    i = i;
                } else {
                    NoteEditorContainer noteEditorContainer6 = noteEditorContainerFragment.f72831OoooOoo;
                    if (noteEditorContainer6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                        throw null;
                    }
                    NoteEditorContainerFragment.Oooo0oO(noteEditorContainer6, 0, 0, 0, 0);
                }
            }
            ToolbarChildFragment toolbarChildFragment = noteEditorContainerFragment.f72821Oooo0oo;
            if (toolbarChildFragment != null) {
                int iIntValue = num.intValue();
                LinkedHashMap linkedHashMap = toolbarChildFragment.f76496OoooOO0;
                InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) linkedHashMap.get(3);
                Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                C29192OooO0o0 c29192OooO0o0 = value instanceof C29192OooO0o0 ? (C29192OooO0o0) value : null;
                InterfaceC32440OooOO0 interfaceC32440OooOO02 = (InterfaceC32440OooOO0) linkedHashMap.get(2);
                Object value2 = interfaceC32440OooOO02 != null ? interfaceC32440OooOO02.getValue() : null;
                o0OoO.OooO0o oooO0o = value2 instanceof o0OoO.OooO0o ? (o0OoO.OooO0o) value2 : null;
                if (iIntValue == 3) {
                    if (c29192OooO0o0 != null) {
                        c29192OooO0o0.f103537OooOOO = i;
                    }
                    if (oooO0o != null) {
                        oooO0o.f101044OooOOOO = i;
                    }
                } else {
                    if (c29192OooO0o0 != null) {
                        c29192OooO0o0.f103537OooOOO = 0;
                    }
                    if (oooO0o != null) {
                        oooO0o.f101044OooOOOO = 0;
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28751o00000O(NoteEditorContainerFragment noteEditorContainerFragment, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f101821OooOo = noteEditorContainerFragment;
        this.f101823OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28751o00000O(this.f101821OooOo, continuation, this.f101823OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28751o00000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101822OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorContainerFragment noteEditorContainerFragment = this.f101821OooOo;
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo000 = noteEditorContainerFragment.Oooo000();
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
            C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0O0Oooo000.f75160OooOo0o, oooO0OOOooo00O.f73373OooOoo, new OooO00o(3, null));
            OooO0O0 oooO0O0 = new OooO0O0(noteEditorContainerFragment, null, this.f101823OooOoO0);
            this.f101822OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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
