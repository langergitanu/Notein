package o0OOooO0;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0OOooO0.C27883OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: o0OOooO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager$withCloudLock$2", m80623f = "CloudLockManager.kt", m80624l = {164}, m80625m = "invokeSuspend")
public final class C27903OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<Object>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98664OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98665OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27883OooO00o.OooO0OO f98666OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32508OooOOOo<String, Continuation<Object>, Object> f98667OooOoO0;

    /* JADX INFO: renamed from: o0OOooO0.OooOOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager$withCloudLock$2$invalidationJob$1", m80623f = "CloudLockManager.kt", m80624l = {159}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27883OooO00o.OooO0OO f98668OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f98669OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27883OooO00o.OooO0OO oooO0OO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f98668OooOo = oooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f98668OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) throws o00000OO {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws o00000OO {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f98669OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33622OooOo00<Throwable> interfaceC33622OooOo00 = this.f98668OooOo.f98569OooO0OO;
                this.f98669OooOo0o = 1;
                obj = interfaceC33622OooOo00.await(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new o00000OO("Lock invalidated during execution", (Throwable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27903OooOOoo(InterfaceC32508OooOOOo<? super String, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, C27883OooO00o.OooO0OO oooO0OO, Continuation<? super C27903OooOOoo> continuation) {
        super(2, continuation);
        this.f98667OooOoO0 = interfaceC32508OooOOOo;
        this.f98666OooOoO = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27903OooOOoo c27903OooOOoo = new C27903OooOOoo(this.f98667OooOoO0, this.f98666OooOoO, continuation);
        c27903OooOOoo.f98664OooOo = obj;
        return c27903OooOOoo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<Object>> continuation) {
        return ((C27903OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws o00000OO {
        InterfaceC33672o00ooo interfaceC33672o00ooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98665OooOo0o;
        C27883OooO00o.OooO0OO oooO0OO = this.f98666OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oO0o0OO.o00000OO o00000ooOooO0OO = C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f98664OooOo, null, null, new OooO00o(oooO0OO, null), 3);
                InterfaceC32508OooOOOo<String, Continuation<Object>, Object> interfaceC32508OooOOOo = this.f98667OooOoO0;
                String str = oooO0OO.f98567OooO00o;
                this.f98664OooOo = o00000ooOooO0OO;
                this.f98665OooOo0o = 1;
                Object objInvoke = interfaceC32508OooOOOo.invoke(str, this);
                if (objInvoke == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                interfaceC33672o00ooo = o00000ooOooO0OO;
                obj = objInvoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33672o00ooo = (InterfaceC33672o00ooo) this.f98664OooOo;
                C32446OooOOOo.OooO0O0(obj);
            }
            interfaceC33672o00ooo.cancel((CancellationException) null);
            return new C32445OooOOOO(obj);
        } catch (CancellationException e) {
            if (oooO0OO.f98569OooO0OO.isCompleted()) {
                throw new o00000OO("Lock invalidated during execution", oooO0OO.f98569OooO0OO.getCompleted());
            }
            throw e;
        }
    }
}
