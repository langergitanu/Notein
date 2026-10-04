package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import androidx.lifecycle.C22026ooOO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.AiFeaturePublicTestingDialogFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0OOOoo.C27205OooO0OO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.o000000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$handleAiFeatureButtonClicked$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1580, 1589, 1596}, m80625m = "invokeSuspend")
public final class C28748o000000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f101811OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101812OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33163OooO0oO f101813OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101814OooOoO0;

    /* JADX INFO: renamed from: o0OoO0oo.o000000$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$handleAiFeatureButtonClicked$1$settings$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1597}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33163OooO0oO f101815OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101816OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33163OooO0oO c33163OooO0oO, Continuation continuation) {
            super(2, continuation);
            this.f101815OooOo = c33163OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f101815OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101816OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(this.f101815OooOo).getData();
            this.f101816OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(data, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28748o000000(int i, NoteEditorContainerFragment noteEditorContainerFragment, C33163OooO0oO c33163OooO0oO, Continuation continuation) {
        super(2, continuation);
        this.f101811OooOo = i;
        this.f101814OooOoO0 = noteEditorContainerFragment;
        this.f101813OooOoO = c33163OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28748o000000(this.f101811OooOo, this.f101814OooOoO0, this.f101813OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28748o000000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r12 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r12 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r12 == r0) goto L37;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101812OooOo0o;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101814OooOoO0;
        int i2 = this.f101811OooOo;
        C22026ooOO c22026ooOO = noteEditorContainerFragment.f72807OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i2 == 101 && ((C26320o0000OoO) c22026ooOO.getValue()).OooO0oO()) {
                this.f101812OooOo0o = 1;
                obj = NoteEditorContainerFragment.OooOoo0(noteEditorContainerFragment, 101, this);
            } else if (i2 == 100 && ((C26320o0000OoO) c22026ooOO.getValue()).OooO0oO()) {
                this.f101812OooOo0o = 2;
                obj = NoteEditorContainerFragment.OooOoo0(noteEditorContainerFragment, 100, this);
            } else {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                OooO00o oooO00o = new OooO00o(this.f101813OooOoO, null);
                this.f101812OooOo0o = 3;
                obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                NoteEditorContainerFragment.OooOoOO(noteEditorContainerFragment);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i == 2) {
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                NoteEditorContainerFragment.OooOoo(noteEditorContainerFragment);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
        boolean z = ((C26320o0000OoO) c22026ooOO.getValue()).f90227OooOoOO.f121747OooOo0o.getValue() == 0;
        Boolean bool = (Boolean) abstractC24338OooO0o0.OooO0OO(C27205OooO0OO.f95017OooOOo);
        if (!(bool != null ? bool.booleanValue() : false)) {
            boolean z2 = i2 == 101;
            if (noteEditorContainerFragment.getChildFragmentManager().OooOooo("AiFeaturePublicTestingDialogFragment") == null) {
                AiFeaturePublicTestingDialogFragment aiFeaturePublicTestingDialogFragment = new AiFeaturePublicTestingDialogFragment(z);
                aiFeaturePublicTestingDialogFragment.f70433Oooo00o = new C28746o0000(aiFeaturePublicTestingDialogFragment, z, noteEditorContainerFragment, z2);
                aiFeaturePublicTestingDialogFragment.show(noteEditorContainerFragment.getChildFragmentManager(), "AiFeaturePublicTestingDialogFragment");
            }
        } else if (z) {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_firebaseUserAuthFragment));
        } else if (i2 == 101) {
            NoteEditorContainerFragment.OooOoOO(noteEditorContainerFragment);
        } else if (i2 == 100) {
            NoteEditorContainerFragment.OooOoo(noteEditorContainerFragment);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
