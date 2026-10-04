package o0OoO0oo;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import kotlin.coroutines.Continuation;
import o0OoO0oo.C28710OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$addLockForNote$1", m80623f = "LockNoteFragment.kt", m80624l = {52}, m80625m = "invokeSuspend")
public final class C28710OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101715OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28708OooOoO f101716OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.OooOo f101717OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101718OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f101719OooOoOO;

    /* JADX INFO: renamed from: o0OoO0oo.OooOoOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$addLockForNote$1$addLockToNote$1$1", m80623f = "LockNoteFragment.kt", m80624l = {46}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f101720OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public LockNoteFragment f101721OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ LockNoteFragment f101722OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f101723OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LockNoteFragment lockNoteFragment, String str, Continuation continuation) {
            super(2, continuation);
            this.f101723OooOoO0 = str;
            this.f101722OooOoO = lockNoteFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f101722OooOoO, this.f101723OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            LockNoteFragment lockNoteFragment;
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101720OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f101723OooOoO0;
                if (str != null) {
                    LockNoteFragment lockNoteFragment2 = this.f101722OooOoO;
                    C28729OoooO0O c28729OoooO0OOooOoOO = lockNoteFragment2.OooOoOO();
                    this.f101721OooOo0o = lockNoteFragment2;
                    this.f101720OooOo = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28721Oooo0OO(c28729OoooO0OOooOoOO, str, null), this);
                    if (objOooO0o != obj2) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o == obj2) {
                        return obj2;
                    }
                    lockNoteFragment = lockNoteFragment2;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lockNoteFragment = this.f101721OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            lockNoteFragment.OooOoo0(R.string.add_lock_success);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28710OooOoOO(LockNoteFragment lockNoteFragment, androidx.lifecycle.OooOo oooOo, String str, Continuation continuation) {
        super(2, continuation);
        this.f101718OooOoO0 = lockNoteFragment;
        this.f101717OooOoO = oooOo;
        this.f101719OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28710OooOoOO(this.f101718OooOoO0, this.f101717OooOoO, this.f101719OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28710OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oO0O000o.OooO00o] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [o0OoO0oo.OooOoO] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ?? r0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101715OooOo;
        final LockNoteFragment lockNoteFragment = this.f101718OooOoO0;
        final androidx.lifecycle.OooOo oooOo = this.f101717OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            final String str = this.f101719OooOoOO;
            ?? r6 = new oO0O000o.OooO00o() { // from class: o0OoO0oo.OooOoO
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return C33609OooO0oo.OooO0OO(oooOo, null, null, new C28710OooOoOO.OooO00o(lockNoteFragment, str, null), 3);
                }
            };
            C28729OoooO0O c28729OoooO0OOooOoOO = lockNoteFragment.OooOoOO();
            this.f101716OooOo0o = r6;
            this.f101715OooOo = 1;
            Object objOooO0Oo = c28729OoooO0OOooOoOO.f101773OooO0Oo.OooO0Oo(this);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            r0 = r6;
            obj = objOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C28708OooOoO c28708OooOoO = this.f101716OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            r0 = c28708OooOoO;
        }
        if (((Boolean) obj).booleanValue()) {
            String string = lockNoteFragment.getString(R.string.biometric_prompt_title_using_note_lock);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            LockNoteFragment.OooOoO(lockNoteFragment, oooOo, string, new o000O0oO.OooO0o(r0, 3), new com.google.firebase.crashlytics.internal.concurrency.OooO(1));
        } else {
            r0.invoke();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
