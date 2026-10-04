package o0Oo0ooo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.LoginViewModel$setProgressBarVisible$2", m80623f = "LoginViewModel.kt", m80624l = {58, 61, 64, 67}, m80625m = "invokeSuspend")
public final class C28475OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f100890OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100891OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f100892OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28477OooOOO0 f100893OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28475OooOO0o(int i, C28477OooOOO0 c28477OooOOO0, boolean z, Continuation<? super C28475OooOO0o> continuation) {
        super(2, continuation);
        this.f100890OooOo = i;
        this.f100893OooOoO0 = c28477OooOOO0;
        this.f100892OooOoO = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28475OooOO0o(this.f100890OooOo, this.f100893OooOoO0, this.f100892OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28475OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100891OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f100892OooOoO;
            C28477OooOOO0 c28477OooOOO0 = this.f100893OooOoO0;
            int i2 = this.f100890OooOo;
            if (i2 == 0) {
                C33781o00o0O c33781o00o0O = c28477OooOOO0.f100900OooO0oo;
                Boolean boolValueOf = Boolean.valueOf(z);
                this.f100891OooOo0o = 1;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, boolValueOf);
            } else if (i2 == 1) {
                C33781o00o0O c33781o00o0O2 = c28477OooOOO0.f100901OooOO0;
                Boolean boolValueOf2 = Boolean.valueOf(z);
                this.f100891OooOo0o = 2;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, boolValueOf2);
            } else if (i2 == 2) {
                C33781o00o0O c33781o00o0O3 = c28477OooOOO0.f100903OooOO0o;
                Boolean boolValueOf3 = Boolean.valueOf(z);
                this.f100891OooOo0o = 3;
                c33781o00o0O3.getClass();
                c33781o00o0O3.OooOO0(null, boolValueOf3);
            } else if (i2 == 3) {
                C33781o00o0O c33781o00o0O4 = c28477OooOOO0.f100904OooOOO;
                Boolean boolValueOf4 = Boolean.valueOf(z);
                this.f100891OooOo0o = 4;
                c33781o00o0O4.getClass();
                c33781o00o0O4.OooOO0(null, boolValueOf4);
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
