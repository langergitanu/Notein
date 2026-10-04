package o0o000OO;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOO0o.C27129OoooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o000OO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$special$$inlined$flatMapLatest$1", m80623f = "TextAnnoViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
public final class C29768OooOooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super String>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f105630OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105631OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105632OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105633OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29768OooOooO(Continuation continuation, OooOO0O oooOO0O) {
        super(3, continuation);
        this.f105632OooOoO = oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C29768OooOooO c29768OooOooO = new C29768OooOooO(continuation, this.f105632OooOoO);
        c29768OooOooO.f105630OooOo = interfaceC33723OooO0oO;
        c29768OooOooO.f105633OooOoO0 = str;
        return c29768OooOooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105631OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f105630OooOo;
            String str = (String) this.f105633OooOoO0;
            C27129OoooOOO c27129OoooOOO = this.f105632OooOoO.f105533OooO0o0;
            this.f105630OooOo = interfaceC33723OooO0oO;
            this.f105631OooOo0o = 1;
            obj = c27129OoooOOO.OooO0o0(str);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = this.f105630OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f105630OooOo = null;
        this.f105631OooOo0o = 2;
        C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
        Object objCollect = ((InterfaceC33721OooO0o) obj).collect(new C29772Oooo0O0(interfaceC33723OooO0oO), this);
        if (objCollect != enumC32485OooO00o) {
            objCollect = C32460OooOooO.f116667OooO00o;
        }
        if (objCollect != enumC32485OooO00o) {
            objCollect = C32460OooOooO.f116667OooO00o;
        }
    }
}
