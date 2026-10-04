package o000oo0;

import kotlin.coroutines.Continuation;
import o000ooOO.C24736OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", m80623f = "RoomDatabase.android.kt", m80624l = {2015}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f83571OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83572OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24736OooO0Oo f83573OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(C24736OooO0Oo c24736OooO0Oo, Continuation continuation) {
        super(2, continuation);
        this.f83573OooOoO0 = c24736OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOo oooOo = new OooOo(this.f83573OooOoO0, continuation);
        oooOo.f83571OooOo = obj;
        return oooOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C24685Oooo00O c24685Oooo00O;
        Throwable th;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83572OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24685Oooo00O = (C24685Oooo00O) this.f83571OooOo;
            try {
                C32446OooOOOo.OooO0O0(obj);
                if (c24685Oooo00O.f83654OooOo.decrementAndGet() < 0) {
                    return obj;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            } catch (Throwable th2) {
                th = th2;
                if (c24685Oooo00O.f83654OooOo.decrementAndGet() < 0) {
                    throw th;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = ((InterfaceC33636Oooo00o) this.f83571OooOo).OooOOO0().get(C24685Oooo00O.f83653OooOoO0);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
        C24685Oooo00O c24685Oooo00O2 = (C24685Oooo00O) oooO0O0;
        c24685Oooo00O2.f83654OooOo.incrementAndGet();
        try {
            C24736OooO0Oo c24736OooO0Oo = this.f83573OooOoO0;
            this.f83571OooOo = c24685Oooo00O2;
            this.f83572OooOo0o = 1;
            Object objInvoke = c24736OooO0Oo.invoke(this);
            if (objInvoke == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24685Oooo00O = c24685Oooo00O2;
            obj = objInvoke;
            if (c24685Oooo00O.f83654OooOo.decrementAndGet() < 0) {
            }
        } catch (Throwable th3) {
            c24685Oooo00O = c24685Oooo00O2;
            th = th3;
            if (c24685Oooo00O.f83654OooOo.decrementAndGet() < 0) {
            }
        }
    }
}
