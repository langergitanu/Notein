package o0OoO0oo;

import android.graphics.PointF;
import android.widget.TextView;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0oOo0o0.C30982OooO0Oo;
import o0oo00oo.C31217OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00OOO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102224OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102225OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$1", m80623f = "NoteEditorFragment.kt", m80624l = {4177}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f102226OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public PDFView f102227OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102228OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102228OooOoO0 = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102228OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            PDFView pDFView;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102226OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102228OooOoO0;
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                this.f102227OooOo0o = pDFView2;
                this.f102226OooOo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28811o000o0O0(oooO0OOOoooO0, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                pDFView = pDFView2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pDFView = this.f102227OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            pDFView.setEnableDropFrameFor120HZ(((Boolean) obj).booleanValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$2", m80623f = "NoteEditorFragment.kt", m80624l = {4180}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f102229OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public PDFView f102230OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102231OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f102231OooOoO0 = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f102231OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            PDFView pDFView;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102229OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102231OooOoO0;
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                this.f102230OooOo0o = pDFView2;
                this.f102229OooOo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28790o000OO0o(oooO0OOOoooO0, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                pDFView = pDFView2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pDFView = this.f102230OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            pDFView.setInkSamplingRateConfig((C31217OooO00o) obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$3", m80623f = "NoteEditorFragment.kt", m80624l = {4185}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f102232OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public PDFView f102233OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102234OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f102234OooOoO0 = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f102234OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            PDFView pDFView;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102232OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102234OooOoO0;
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                this.f102233OooOo0o = pDFView2;
                this.f102232OooOo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28810o000o0O(oooO0OOOoooO0, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                pDFView = pDFView2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pDFView = this.f102233OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            pDFView.setEnablePalmDetection(((Boolean) obj).booleanValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$4", m80623f = "NoteEditorFragment.kt", m80624l = {4189}, m80625m = "invokeSuspend")
    public static final class C28861OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102235OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102236OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$4$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102237OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f102238OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f102237OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f102237OooOo, continuation);
                oooO00o.f102238OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f102238OooOo0o;
                PDFView pDFView = this.f102237OooOo.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.setEnableLayerMoveOperation(z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28861OooO0Oo(NoteEditorFragment noteEditorFragment, Continuation<? super C28861OooO0Oo> continuation) {
            super(2, continuation);
            this.f102235OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C28861OooO0Oo(this.f102235OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C28861OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102236OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102235OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                this.f102236OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOoooO0.f73385Oooo0o0, oooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$6", m80623f = "NoteEditorFragment.kt", m80624l = {4199}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102239OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102240OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$6$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102241OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ boolean f102242OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f102241OooOo = noteEditorFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f102241OooOo, continuation);
                oooO00o.f102242OooOo0o = ((Boolean) obj).booleanValue();
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = this.f102242OooOo0o;
                PDFView pDFView = this.f102241OooOo.f73015OoooO0;
                if (pDFView != null) {
                    pDFView.setShowAnchorOnStrokeToLine(z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NoteEditorFragment noteEditorFragment, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f102239OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0o(this.f102239OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102240OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102239OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
                OooO00o oooO00o = new OooO00o(noteEditorFragment, null);
                this.f102240OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOoooO0.f73384Oooo0o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$5", m80623f = "NoteEditorFragment.kt", m80624l = {4195}, m80625m = "invokeSuspend")
    public static final class C28862OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f102243OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public PDFView f102244OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102245OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28862OooO0o0(NoteEditorFragment noteEditorFragment, Continuation<? super C28862OooO0o0> continuation) {
            super(2, continuation);
            this.f102245OooOoO0 = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C28862OooO0o0(this.f102245OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C28862OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            PDFView pDFView;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102243OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102245OooOoO0;
                PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
                if (pDFView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                this.f102244OooOo0o = pDFView2;
                this.f102243OooOo = 1;
                obj = c23344OooOOoOoooOO0.OooOO0o(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                pDFView = pDFView2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pDFView = this.f102244OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            pDFView.setEstimatorConfigs((List) obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$7", m80623f = "NoteEditorFragment.kt", m80624l = {4205}, m80625m = "invokeSuspend")
    public static final class C28863OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102246OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102247OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0oO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102248OooOo0o;

            /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$7$1", m80623f = "NoteEditorFragment.kt", m80624l = {4208}, m80625m = "emit")
            public static final class C19940OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public List f102249OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public OooO00o f102250OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public /* synthetic */ Object f102251OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public boolean f102252OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public final /* synthetic */ OooO00o<T> f102253OooOoOO;

                /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
                public int f102254OooOoo0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C19940OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C19940OooO00o> continuation) {
                    super(continuation);
                    this.f102253OooOoOO = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f102251OooOoO = obj;
                    this.f102254OooOoo0 |= Integer.MIN_VALUE;
                    return this.f102253OooOoOO.emit(null, this);
                }
            }

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f102248OooOo0o = noteEditorFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(C32443OooOOO<? extends List<C28961o00oOoOO>, Boolean> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                C19940OooO00o c19940OooO00o;
                boolean zBooleanValue;
                OooO00o<T> oooO00o;
                List list;
                C28961o00oOoOO c28961o00oOoOO;
                if (continuation instanceof C19940OooO00o) {
                    c19940OooO00o = (C19940OooO00o) continuation;
                    int i = c19940OooO00o.f102254OooOoo0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19940OooO00o.f102254OooOoo0 = i - Integer.MIN_VALUE;
                    } else {
                        c19940OooO00o = new C19940OooO00o(this, continuation);
                    }
                }
                Object obj = c19940OooO00o.f102251OooOoO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19940OooO00o.f102254OooOoo0;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    List list2 = (List) c32443OooOOO.f116638OooOo0o;
                    zBooleanValue = c32443OooOOO.f116637OooOo.booleanValue();
                    NoteEditorFragment noteEditorFragment = this.f102248OooOo0o;
                    noteEditorFragment.Ooooooo();
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    c19940OooO00o.f102250OooOo0o = this;
                    c19940OooO00o.f102249OooOo = list2;
                    c19940OooO00o.f102252OooOoO0 = zBooleanValue;
                    c19940OooO00o.f102254OooOoo0 = 1;
                    if (c23344OooOOoOoooOO0.OooOO0(c19940OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    oooO00o = this;
                    list = list2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zBooleanValue = c19940OooO00o.f102252OooOoO0;
                    list = c19940OooO00o.f102249OooOo;
                    oooO00o = c19940OooO00o.f102250OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                }
                switch (oooO00o.f102248OooOo0o.getId()) {
                    case R.id.note_editor_fragment_1 /* 2131298349 */:
                        c28961o00oOoOO = (C28961o00oOoOO) list.get(0);
                        break;
                    case R.id.note_editor_fragment_2 /* 2131298350 */:
                        c28961o00oOoOO = (C28961o00oOoOO) list.get(1);
                        break;
                    default:
                        c28961o00oOoOO = null;
                        break;
                }
                if (c28961o00oOoOO == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C23344OooOOo c23344OooOOoOoooOO02 = oooO00o.f102248OooOo0o.OoooOO0();
                String id = c28961o00oOoOO.f102615OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                String defaultPageId = c28961o00oOoOO.f102616OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(defaultPageId, "defaultPageId");
                PointF pointF = c28961o00oOoOO.f102617OooO0OO;
                C33781o00o0O c33781o00o0O = c23344OooOOoOoooOO02.f73588OoooOOO;
                String str = (String) c33781o00o0O.getValue();
                int length = str.length();
                C30982OooO0Oo c30982OooO0Oo = c23344OooOOoOoooOO02.f73557OooOOo;
                if (length > 0) {
                    c30982OooO0Oo.OooO00o((String) c33781o00o0O.getValue(), false, new WeakReference<>(c23344OooOOoOoooOO02));
                    c23344OooOOoOoooOO02.f73565OooOoO.OooO00o(str, CloudMetaType.NOTE);
                }
                C23344OooOOo.OooO00o oooO00o2 = new C23344OooOOo.OooO00o(defaultPageId, pointF);
                C33781o00o0O c33781o00o0O2 = c23344OooOOoOoooOO02.f73584OoooO0;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, oooO00o2);
                c23344OooOOoOoooOO02.f73586OoooO0O.setValue(c28961o00oOoOO.f102618OooO0Oo);
                c33781o00o0O.OooOO0(null, id);
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                C33781o00o0O c33781o00o0O3 = c23344OooOOoOoooOO02.f73602o000oOoO;
                c33781o00o0O3.getClass();
                c33781o00o0O3.OooOO0(null, boolValueOf);
                c30982OooO0Oo.OooO00o(id, true, new WeakReference<>(c23344OooOOoOoooOO02));
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO02);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28933o00o0o0o(c23344OooOOoOoooOO02, id, null), 2);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28863OooO0oO(NoteEditorFragment noteEditorFragment, Continuation<? super C28863OooO0oO> continuation) {
            super(2, continuation);
            this.f102246OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C28863OooO0oO(this.f102246OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C28863OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102247OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102246OooOo;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0o = C25252OooO0Oo.OooOO0o(noteEditorFragment.OoooO0().f73388OoooO);
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f102247OooOo0o = 1;
                if (interfaceC33721OooO0oOooOO0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$19$8", m80623f = "NoteEditorFragment.kt", m80624l = {4225}, m80625m = "invokeSuspend")
    public static final class C28864OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102255OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102256OooOo0o;

        /* JADX INFO: renamed from: o0OoO0oo.o00OOO00$OooO0oo$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102257OooOo0o;

            public OooO00o(NoteEditorFragment noteEditorFragment) {
                this.f102257OooOo0o = noteEditorFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                String str;
                C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) obj;
                NoteEditorFragment noteEditorFragment = this.f102257OooOo0o;
                TextView textView = noteEditorFragment.f73017OoooO0O;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("debugTV");
                    throw null;
                }
                if (c28694OooOO0O == null || (str = c28694OooOO0O.f101667OooO00o) == null) {
                    str = "";
                }
                textView.setText("debug: NoteId: ".concat(str));
                noteEditorFragment.OooooOO(c28694OooOO0O, false);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28864OooO0oo(NoteEditorFragment noteEditorFragment, Continuation<? super C28864OooO0oo> continuation) {
            super(2, continuation);
            this.f102255OooOo = noteEditorFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C28864OooO0oo(this.f102255OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C28864OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102256OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102255OooOo;
                C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                OooO00o oooO00o = new OooO00o(noteEditorFragment);
                this.f102256OooOo0o = 1;
                if (c23344OooOOoOoooOO0.f73606o00o0O.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(NoteEditorFragment noteEditorFragment, Continuation<? super o00OOO00> continuation) {
        super(2, continuation);
        this.f102224OooOo = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00OOO00 o00ooo002 = new o00OOO00(this.f102224OooOo, continuation);
        o00ooo002.f102225OooOo0o = obj;
        return o00ooo002;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00OOO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f102225OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f102224OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28861OooO0Oo(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28862OooO0o0(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28863OooO0oO(noteEditorFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C28864OooO0oo(noteEditorFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
