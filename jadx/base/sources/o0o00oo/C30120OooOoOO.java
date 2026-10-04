package o0o00oo;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.AiFeaturePublicTestingDialogFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import io.ktor.utils.p616io.C23968Oooo00o;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o00o00O0.C25252OooO0Oo;
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

/* JADX INFO: renamed from: o0o00oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onMenuItemOpenAiOcrClicked$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1482, 1491}, m80625m = "invokeSuspend")
public final class C30120OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107241OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107242OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33163OooO0oO f107243OooOoO0;

    /* JADX INFO: renamed from: o0o00oo.OooOoOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onMenuItemOpenAiOcrClicked$1$settings$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1492}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33163OooO0oO f107244OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107245OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33163OooO0oO c33163OooO0oO, Continuation continuation) {
            super(2, continuation);
            this.f107244OooOo = c33163OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107244OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107245OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(this.f107244OooOo).getData();
            this.f107245OooOo0o = 1;
            Object objOooOOo = C25252OooO0Oo.OooOOo(data, this);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30120OooOoOO(NoteListContainerFragment noteListContainerFragment, C33163OooO0oO c33163OooO0oO, Continuation continuation) {
        super(2, continuation);
        this.f107241OooOo = noteListContainerFragment;
        this.f107243OooOoO0 = c33163OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30120OooOoOO(this.f107241OooOo, this.f107243OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30120OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r9 == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107242OooOo0o;
        NoteListContainerFragment noteListContainerFragment = this.f107241OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (noteListContainerFragment.OooOooO().OooO0oO()) {
                this.f107242OooOo0o = 1;
                obj = NoteListContainerFragment.Oooo00o(noteListContainerFragment, 101, 0, null, this, 6);
            } else {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                OooO00o oooO00o = new OooO00o(this.f107243OooOoO0, null);
                this.f107242OooOo0o = 2;
                obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), C23968Oooo00o.OooO0Oo());
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
        boolean z = noteListContainerFragment.OooOooO().f90227OooOoOO.f121747OooOo0o.getValue() == 0;
        Boolean bool = (Boolean) abstractC24338OooO0o0.OooO0OO(C27205OooO0OO.f95017OooOOo);
        if (bool != null ? bool.booleanValue() : false) {
            if (z) {
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), new C24564OooO00o(R.id.action_noteListFragment_to_firebaseUserAuthFragment));
            } else {
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), C23968Oooo00o.OooO0Oo());
            }
        } else if (noteListContainerFragment.getChildFragmentManager().OooOooo("AiFeaturePublicTestingDialogFragment") == null) {
            AiFeaturePublicTestingDialogFragment aiFeaturePublicTestingDialogFragment = new AiFeaturePublicTestingDialogFragment(z);
            aiFeaturePublicTestingDialogFragment.f70433Oooo00o = new C30123OooOooO(aiFeaturePublicTestingDialogFragment, z, noteListContainerFragment);
            aiFeaturePublicTestingDialogFragment.show(noteListContainerFragment.getChildFragmentManager(), "AiFeaturePublicTestingDialogFragment");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
