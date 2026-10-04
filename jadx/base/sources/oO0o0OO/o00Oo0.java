package oO0o0OO;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m80623f = "Interruptible.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<Object> f121373OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f121374OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(oO0O000o.OooO00o<Object> oooO00o, Continuation<? super o00Oo0> continuation) {
        super(2, continuation);
        this.f121373OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00Oo0 o00oo02 = new o00Oo0(this.f121373OooOo, continuation);
        o00oo02.f121374OooOo0o = obj;
        return o00oo02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((o00Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r1.OooOO0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw r5;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooOOO0 = ((InterfaceC33636Oooo00o) this.f121374OooOo0o).OooOOO0();
        oO0O000o.OooO00o<Object> oooO00o = this.f121373OooOo;
        try {
            C33667o00000oo c33667o00000oo = new C33667o00000oo();
            c33667o00000oo.f121359OooOoo0 = oO00o00.OooO0OO.OooO0o0(oO00o00.OooO0OO.OooO0Oo(interfaceC34415OooO0ooOooOOO0), c33667o00000oo);
            while (true) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C33667o00000oo.f121357OooOoo;
                int i = atomicIntegerFieldUpdater.get(c33667o00000oo);
                if (i != 0) {
                    if (i != 2 && i != 3) {
                        C33667o00000oo.OooOO0o(i);
                        throw null;
                    }
                } else if (!atomicIntegerFieldUpdater.compareAndSet(c33667o00000oo, i, 0)) {
                }
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
