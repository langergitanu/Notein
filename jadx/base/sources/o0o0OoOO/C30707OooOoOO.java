package o0o0OoOO;

import com.orion.notein.p607ui.settings.debug.DebugFragment;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOo0o.C27361OoooOO0;
import o0OOo0o.C27428o000oOoO;
import o0o0OoOo.C30722OooO00o;
import o0o0OoOo.C30749OooOoo0;
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

/* JADX INFO: renamed from: o0o0OoOO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$showPenDebugDialogInternal$dialog$1$1", m80623f = "DebugFragment.kt", m80624l = {485, 486}, m80625m = "invokeSuspend")
public final class C30707OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DebugFragment f109815OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109816OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f109817OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f109818OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30707OooOoOO(DebugFragment debugFragment, boolean z, int i, Continuation<? super C30707OooOoOO> continuation) {
        super(2, continuation);
        this.f109815OooOo = debugFragment;
        this.f109818OooOoO0 = z;
        this.f109817OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30707OooOoOO(this.f109815OooOo, this.f109818OooOoO0, this.f109817OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30707OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r8 == r0) goto L24;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109816OooOo0o;
        DebugFragment debugFragment = this.f109815OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
            C30722OooO00o c30722OooO00oOooOoO = debugFragment.OooOoO();
            this.f109816OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30749OooOoo0(c30722OooO00oOooOoO, this.f109818OooOoO0, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != obj2) {
            }
            return obj2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = DebugFragment.f79020Oooo0OO;
        C30722OooO00o c30722OooO00oOooOoO2 = debugFragment.OooOoO();
        this.f109816OooOo0o = 2;
        C27428o000oOoO c27428o000oOoO = c30722OooO00oOooOoO2.f109876OooOo00;
        c27428o000oOoO.getClass();
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27361OoooOO0(c27428o000oOoO, this.f109817OooOoO, null), this);
        if (objOooO0o2 != obj2) {
            objOooO0o2 = C32460OooOooO.f116667OooO00o;
        }
        if (objOooO0o2 != obj2) {
            objOooO0o2 = C32460OooOooO.f116667OooO00o;
        }
    }
}
