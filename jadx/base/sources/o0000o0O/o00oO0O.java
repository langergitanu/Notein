package o0000o0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0O implements o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33898OooO0Oo f81783OooO00o = C33900OooO0o0.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24247OooO00o f81784OooO0O0 = new C24247OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33770OooooO0 f81785OooO0OO = new C33770OooooO0(new OooO00o(2, null));

    @InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", m80623f = "SingleProcessCoordinator.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super C32460OooOooO>, Continuation<? super C32460OooOooO>, Object> {
        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(2, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super C32460OooOooO> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public o00oO0O(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0000o0O.o000oOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24300o00oO0o c24300o00oO0o;
        C33898OooO0Oo c33898OooO0Oo;
        Throwable th;
        boolean z;
        if (abstractC32479OooO0OO instanceof C24300o00oO0o) {
            c24300o00oO0o = (C24300o00oO0o) abstractC32479OooO0OO;
            int i = c24300o00oO0o.f81790OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24300o00oO0o.f81790OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c24300o00oO0o = new C24300o00oO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24300o00oO0o.f81789OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24300o00oO0o.f81790OooOoOO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c24300o00oO0o.f81786OooOo;
            c33898OooO0Oo = c24300o00oO0o.f81787OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                if (z) {
                    c33898OooO0Oo.OooOOO0(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                }
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        C33898OooO0Oo c33898OooO0Oo2 = this.f81783OooO00o;
        boolean zOooO0o0 = c33898OooO0Oo2.OooO0o0();
        try {
            Boolean boolValueOf = Boolean.valueOf(zOooO0o0);
            c24300o00oO0o.f81787OooOo0o = c33898OooO0Oo2;
            c24300o00oO0o.f81786OooOo = zOooO0o0;
            c24300o00oO0o.f81790OooOoOO = 1;
            Object objInvoke = interfaceC32508OooOOOo.invoke(boolValueOf, c24300o00oO0o);
            if (objInvoke == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c33898OooO0Oo = c33898OooO0Oo2;
            obj = objInvoke;
            z = zOooO0o0;
            if (z) {
            }
            return obj;
        } catch (Throwable th3) {
            c33898OooO0Oo = c33898OooO0Oo2;
            th = th3;
            z = zOooO0o0;
            if (z) {
                c33898OooO0Oo.OooOOO0(null);
            }
            throw th;
        }
    }

    @Override // o0000o0O.o000oOoO
    public final InterfaceC33721OooO0o<C32460OooOooO> OooO0O0() {
        return this.f81785OooO0OO;
    }

    @Override // o0000o0O.o000oOoO
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return new Integer(this.f81784OooO0O0.f81528OooO00o.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0000o0O.o000oOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        oo000o oo000oVar;
        C33898OooO0Oo c33898OooO0Oo;
        Throwable th;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        if (abstractC32479OooO0OO instanceof oo000o) {
            oo000oVar = (oo000o) abstractC32479OooO0OO;
            int i = oo000oVar.f81810OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo000oVar.f81810OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oo000oVar = new oo000o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oo000oVar.f81809OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo000oVar.f81810OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oo000oVar.f81807OooOo0o = interfaceC32507OooOO0o;
                c33898OooO0Oo = this.f81783OooO00o;
                oo000oVar.f81806OooOo = c33898OooO0Oo;
                oo000oVar.f81810OooOoOO = 1;
                if (c33898OooO0Oo.OooO00o(oo000oVar) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) oo000oVar.f81807OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC33895OooO00o.OooOOO0(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o.OooOOO0(null);
                    throw th;
                }
            }
            C33898OooO0Oo c33898OooO0Oo2 = oo000oVar.f81806OooOo;
            InterfaceC32507OooOO0o interfaceC32507OooOO0o2 = (InterfaceC32507OooOO0o) oo000oVar.f81807OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            interfaceC32507OooOO0o = interfaceC32507OooOO0o2;
            oo000oVar.f81807OooOo0o = c33898OooO0Oo;
            oo000oVar.f81806OooOo = null;
            oo000oVar.f81810OooOoOO = 2;
            Object objInvoke = interfaceC32507OooOO0o.invoke(oo000oVar);
            if (objInvoke != enumC32485OooO00o) {
                C33898OooO0Oo c33898OooO0Oo3 = c33898OooO0Oo;
                obj = objInvoke;
                interfaceC33895OooO00o = c33898OooO0Oo3;
                interfaceC33895OooO00o.OooOOO0(null);
                return obj;
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            C33898OooO0Oo c33898OooO0Oo4 = c33898OooO0Oo;
            th = th3;
            interfaceC33895OooO00o = c33898OooO0Oo4;
            interfaceC33895OooO00o.OooOOO0(null);
            throw th;
        }
    }

    @Override // o0000o0O.o000oOoO
    public final Object OooO0o0(C24273Oooo00o c24273Oooo00o) {
        return new Integer(this.f81784OooO0O0.f81528OooO00o.incrementAndGet());
    }
}
