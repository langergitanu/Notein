package o0OoO0oo;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.aspose.slides.C22212OooOoO0;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0O0o0oO.C26020OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class o0o0Oo implements C26020OooO0oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102653OooO00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$4$onRefDelete$1", m80623f = "NoteEditorFragment.kt", m80624l = {3743, 3749}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102654OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102655OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ DualLinkRefInfo f102656OooOoO0;

        /* JADX INFO: renamed from: o0OoO0oo.o0o0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$4$onRefDelete$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19946OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ DualLinkSource f102657OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102658OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19946OooO00o(NoteEditorFragment noteEditorFragment, DualLinkSource dualLinkSource, Continuation<? super C19946OooO00o> continuation) {
                super(2, continuation);
                this.f102658OooOo0o = noteEditorFragment;
                this.f102657OooOo = dualLinkSource;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19946OooO00o(this.f102658OooOo0o, this.f102657OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19946OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object next;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102658OooOo0o;
                Fragment parentFragment = noteEditorFragment.getParentFragment();
                if (parentFragment != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
                    if (noteEditorContainerFragment != null) {
                        DualLinkSource dualLinkSource = this.f102657OooOo;
                        Iterator<T> it = NoteEditorContainer.f76968Oooo0o.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((Number) next).intValue() != noteEditorFragment.getId()) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
                            NoteEditorFragment noteEditorFragment2 = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
                            if (noteEditorFragment2 != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("source_id", dualLinkSource.getId());
                                bundle.putString("source_note_id", dualLinkSource.getNoteId());
                                Message.obtain(noteEditorFragment2.f73044o00000oo, 17, bundle).sendToTarget();
                            }
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, DualLinkRefInfo dualLinkRefInfo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102654OooOo = noteEditorFragment;
            this.f102656OooOoO0 = dualLinkRefInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102654OooOo, this.f102656OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r1, r6, r8) == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            DualLinkSource dualLinkSource;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102655OooOo0o;
            NoteEditorFragment noteEditorFragment = this.f102654OooOo;
            DualLinkRefInfo dualLinkRefInfo = this.f102656OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (((Number) ((C32443OooOOO) noteEditorFragment.OoooO0().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue() != 0) {
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    String id = dualLinkRefInfo.getId();
                    this.f102655OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28911o00o000o(c23344OooOOoOoooOO0, id, null), this);
                    if (obj != enumC32485OooO00o) {
                        dualLinkSource = (DualLinkSource) obj;
                        if (dualLinkSource != null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                C23344OooOOo c23344OooOOoOoooOO02 = noteEditorFragment.OoooOO0();
                String refId = dualLinkRefInfo.getId();
                kotlin.jvm.internal.OooOOO0.OooO0oO(refId, "refId");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO02);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28901o00OooOO(c23344OooOOoOoooOO02, refId, null), 2);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                C23344OooOOo c23344OooOOoOoooOO022 = noteEditorFragment.OoooOO0();
                String refId2 = dualLinkRefInfo.getId();
                kotlin.jvm.internal.OooOOO0.OooO0oO(refId2, "refId");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO022);
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28901o00OooOO(c23344OooOOoOoooOO022, refId2, null), 2);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            dualLinkSource = (DualLinkSource) obj;
            if (dualLinkSource != null) {
                Log.d("NoteEditorFragment", "source is null");
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            C19946OooO00o c19946OooO00o = new C19946OooO00o(noteEditorFragment, dualLinkSource, null);
            this.f102655OooOo0o = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$4$onSourceDelete$1", m80623f = "NoteEditorFragment.kt", m80624l = {3717, 3723}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102659OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102660OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ DualLinkSourceInfo f102661OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$4$onSourceDelete$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ DualLinkRef f102662OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorFragment f102663OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(DualLinkRef dualLinkRef, NoteEditorFragment noteEditorFragment, Continuation continuation) {
                super(2, continuation);
                this.f102663OooOo0o = noteEditorFragment;
                this.f102662OooOo = dualLinkRef;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f102662OooOo, this.f102663OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object next;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102663OooOo0o;
                Fragment parentFragment = noteEditorFragment.getParentFragment();
                if (parentFragment != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
                    if (noteEditorContainerFragment != null) {
                        DualLinkRef dualLinkRef = this.f102662OooOo;
                        Iterator<T> it = NoteEditorContainer.f76968Oooo0o.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((Number) next).intValue() != noteEditorFragment.getId()) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
                            NoteEditorFragment noteEditorFragment2 = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
                            if (noteEditorFragment2 != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("ref_id", dualLinkRef.getId());
                                bundle.putString("ref_note_id", dualLinkRef.getNoteId());
                                Message.obtain(noteEditorFragment2.f73044o00000oo, 16, bundle).sendToTarget();
                            }
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorFragment noteEditorFragment, DualLinkSourceInfo dualLinkSourceInfo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f102659OooOo = noteEditorFragment;
            this.f102661OooOoO0 = dualLinkSourceInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f102659OooOo, this.f102661OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r1, r6, r8) == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            DualLinkRef dualLinkRef;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102660OooOo0o;
            NoteEditorFragment noteEditorFragment = this.f102659OooOo;
            DualLinkSourceInfo dualLinkSourceInfo = this.f102661OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (((Number) ((C32443OooOOO) noteEditorFragment.OoooO0().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue() != 0) {
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    String id = dualLinkSourceInfo.getId();
                    this.f102660OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28910o00o000O(c23344OooOOoOoooOO0, id, null), this);
                    if (obj != enumC32485OooO00o) {
                        dualLinkRef = (DualLinkRef) obj;
                        if (dualLinkRef != null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                C23344OooOOo c23344OooOOoOoooOO02 = noteEditorFragment.OoooOO0();
                String sourceId = dualLinkSourceInfo.getId();
                kotlin.jvm.internal.OooOOO0.OooO0oO(sourceId, "sourceId");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO02);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0O00o0(c23344OooOOoOoooOO02, sourceId, null), 2);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                C23344OooOOo c23344OooOOoOoooOO022 = noteEditorFragment.OoooOO0();
                String sourceId2 = dualLinkSourceInfo.getId();
                kotlin.jvm.internal.OooOOO0.OooO0oO(sourceId2, "sourceId");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO022);
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0O00o0(c23344OooOOoOoooOO022, sourceId2, null), 2);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            dualLinkRef = (DualLinkRef) obj;
            if (dualLinkRef != null) {
                Log.d("NoteEditorFragment", "ref is null");
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(dualLinkRef, noteEditorFragment, null);
            this.f102660OooOo0o = 2;
        }
    }

    public o0o0Oo(NoteEditorFragment noteEditorFragment) {
        this.f102653OooO00o = noteEditorFragment;
    }

    @Override // o0O0o0oO.C26020OooO0oo.OooO00o
    public final void OooO00o(DualLinkRefInfo refInfo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(refInfo, "refInfo");
        NoteEditorFragment noteEditorFragment = this.f102653OooO00o;
        androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(noteEditorFragment, refInfo, null), 2);
    }

    @Override // o0O0o0oO.C26020OooO0oo.OooO00o
    public final void OooO0O0(DualLinkSourceInfo sourceInfo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sourceInfo, "sourceInfo");
        NoteEditorFragment noteEditorFragment = this.f102653OooO00o;
        androidx.lifecycle.OooOo oooOoOooO0O0 = C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0O0(noteEditorFragment, sourceInfo, null), 2);
    }
}
