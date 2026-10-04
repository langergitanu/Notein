package o0OoO0OO;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0OO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.PhoneBindingSkipViewModel$adoptOrphanNotesAndFolders$1", m80623f = "PhoneBindingSkipViewModel.kt", m80624l = {69, 70}, m80625m = "invokeSuspend")
public final class C28622OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101448OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f101449OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C28625OooOo0o f101450OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f101451OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28622OooOo0(C28625OooOo0o c28625OooOo0o, Continuation<? super C28622OooOo0> continuation) {
        super(2, continuation);
        this.f101450OooOoO = c28625OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28622OooOo0 c28622OooOo0 = new C28622OooOo0(this.f101450OooOoO, continuation);
        c28622OooOo0.f101451OooOoO0 = obj;
        return c28622OooOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28622OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r6.OooO00o(r1, r5) == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        String strOooO0Oo;
        C28625OooOo0o c28625OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101448OooOo;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28625OooOo0o c28625OooOo0o2 = this.f101450OooOoO;
            strOooO0Oo = c28625OooOo0o2.f101465OooO0Oo.OooO0Oo();
            C27449o00O0OoO c27449o00O0OoO = c28625OooOo0o2.f101467OooO0o0;
            this.f101451OooOoO0 = c28625OooOo0o2;
            this.f101449OooOo0o = strOooO0Oo;
            this.f101448OooOo = 1;
            if (c27449o00O0OoO.OooO0o0(strOooO0Oo, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28625OooOo0o = c28625OooOo0o2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = C32460OooOooO.f116667OooO00o;
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.f123390OooO00o.OooOO0o(thOooO00o, "Failed to adopt orphan resources after skipping phone binding", new Object[0]);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            strOooO0Oo = this.f101449OooOo0o;
            c28625OooOo0o = (C28625OooOo0o) this.f101451OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        C27600o0ooOO0 c27600o0ooOO0 = c28625OooOo0o.f101466OooO0o;
        this.f101451OooOoO0 = null;
        this.f101449OooOo0o = null;
        this.f101448OooOo = 2;
    }
}
