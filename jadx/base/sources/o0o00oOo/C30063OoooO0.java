package o0o00oOo;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27444o00O00oO;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oOo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$duplicatedNotes$1", m80623f = "NoteListViewModel.kt", m80624l = {1842, 1844, 1848}, m80625m = "invokeSuspend")
public final class C30063OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106942OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106943OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f106944OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30063OoooO0(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, List<String> list, Continuation<? super C30063OoooO0> continuation) {
        super(2, continuation);
        this.f106942OooOo = oooO0OO;
        this.f106944OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30063OoooO0(this.f106942OooOo, this.f106944OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30063OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r6.emit(r8, r7) != r0) goto L28;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106943OooOo0o;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106942OooOo;
        C33772OooooOo c33772OooooOo = oooO0OO.f77145OooOoo0;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteListViewModel");
            c20358OooO00o.OooO0Oo(e, "Unable to duplicate note.", new Object[0]);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Boolean bool = Boolean.TRUE;
            this.f106943OooOo0o = 1;
            if (c33772OooooOo.emit(bool, this) != obj2) {
            }
            return obj2;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            Boolean bool2 = Boolean.FALSE;
            this.f106943OooOo0o = 3;
        }
        C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
        List<String> list = this.f106944OooOoO0;
        this.f106943OooOo0o = 2;
        c27449o00O0OoO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27444o00O00oO(c27449o00O0OoO, list, null), this);
        if (objOooO0o != obj2) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO0o != obj2) {
            Boolean bool22 = Boolean.FALSE;
            this.f106943OooOo0o = 3;
        }
        return obj2;
    }
}
