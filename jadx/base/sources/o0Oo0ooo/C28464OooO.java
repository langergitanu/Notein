package o0Oo0ooo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.LoginViewModel$adoptOrphanNotesAndFolders$1", m80623f = "LoginViewModel.kt", m80624l = {104, 105}, m80625m = "invokeSuspend")
public final class C28464OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f100856OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f100857OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28477OooOOO0 f100858OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28464OooO(C28477OooOOO0 c28477OooOOO0, Continuation<? super C28464OooO> continuation) {
        super(2, continuation);
        this.f100858OooOoO0 = c28477OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28464OooO(this.f100858OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28464OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r2.f100897OooO0o.OooO00o(r1, r5) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strOooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100856OooOo;
        C28477OooOOO0 c28477OooOOO0 = this.f100858OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            strOooO0Oo = c28477OooOOO0.f100896OooO0Oo.OooO0Oo();
            this.f100857OooOo0o = strOooO0Oo;
            this.f100856OooOo = 1;
            if (c28477OooOOO0.f100898OooO0o0.OooO0o0(strOooO0Oo, this) != enumC32485OooO00o) {
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
        strOooO0Oo = this.f100857OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        this.f100857OooOo0o = null;
        this.f100856OooOo = 2;
    }
}
