package o0Oo0o00;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0OOo0oo.o0OO00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.o00Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$pauseAllSyncTasks$1", m80623f = "CloudSyncViewModel.kt", m80624l = {692, 696}, m80625m = "invokeSuspend")
public final class C28211o00Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f100006OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100007OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28211o00Ooo(C28201OooooO0 c28201OooooO0, Continuation<? super C28211o00Ooo> continuation) {
        super(2, continuation);
        this.f100006OooOo = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28211o00Ooo(this.f100006OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28211o00Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r12.OooO00o(r11) != r0) goto L24;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100007OooOo0o;
        C28201OooooO0 c28201OooooO0 = this.f100006OooOo;
        C33781o00o0O c33781o00o0O = c28201OooooO0.f99955OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Boolean bool = Boolean.TRUE;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudSyncDetailsVM");
                c20358OooO00o.OooO0o0("Pausing all sync tasks", new Object[0]);
                o00000OO o00000oo2 = c28201OooooO0.f99949OooOOo0;
                if (o00000oo2 != null) {
                    c20358OooO00o.OooOOO0("CloudSyncDetailsVM");
                    c20358OooO00o.OooO0o0("Cancelling and waiting for manual sync job", new Object[0]);
                    o00000oo2.cancel((CancellationException) null);
                    this.f100007OooOo0o = 1;
                    if (o00000oo2.join(this) == enumC32485OooO00o) {
                    }
                } else {
                    o0OO00O o0oo00o2 = c28201OooooO0.f99938OooO0o0;
                    this.f100007OooOo0o = 2;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CloudSyncDetailsVM");
                c20358OooO00o2.OooO0o0("All sync tasks paused", new Object[0]);
                Boolean bool2 = Boolean.FALSE;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool2);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("CloudSyncDetailsVM");
            c20358OooO00o3.OooO0o0("Manual sync job completed", new Object[0]);
            o0OO00O o0oo00o22 = c28201OooooO0.f99938OooO0o0;
            this.f100007OooOo0o = 2;
        } catch (Throwable th) {
            Boolean bool3 = Boolean.FALSE;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool3);
            throw th;
        }
    }
}
