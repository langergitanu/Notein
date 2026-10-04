package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.LockNoteFragment$removeMarkTimeIfNotReachLimit$1", m80623f = "LockNoteFragment.kt", m80624l = {96, 99}, m80625m = "invokeSuspend")
public final class C28718Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101743OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101744OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101745OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28718Oooo00O(LockNoteFragment lockNoteFragment, String str, Continuation<? super C28718Oooo00O> continuation) {
        super(2, continuation);
        this.f101743OooOo = lockNoteFragment;
        this.f101745OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28718Oooo00O(this.f101743OooOo, this.f101745OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28718Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r8 == r0) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101744OooOo0o;
        LockNoteFragment lockNoteFragment = this.f101743OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28729OoooO0O c28729OoooO0OOooOoOO = lockNoteFragment.OooOoOO();
            this.f101744OooOo0o = 1;
            String str = this.f101745OooOoO0;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28722Oooo0o(c28729OoooO0OOooOoOO, str, null), this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                C28729OoooO0O c28729OoooO0OOooOoOO2 = lockNoteFragment.OooOoOO();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C28727OoooO0(c28729OoooO0OOooOoOO2, null), 3);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (((Boolean) obj).booleanValue()) {
            C28729OoooO0O c28729OoooO0OOooOoOO3 = lockNoteFragment.OooOoOO();
            this.f101744OooOo0o = 2;
            obj = c28729OoooO0OOooOoOO3.f101773OooO0Oo.OooO0Oo(this);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
