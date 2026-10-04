package o000oo;

import o000oo0.InterfaceC24687Oooo0O0;
import o000oo0.InterfaceC24688Oooo0OO;
import o000oo0o.InterfaceC24729OooOo0o;
import o000ooo.InterfaceC24747OooO0O0;
import o000oooO.InterfaceC24756OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o000oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24651OooO0OO implements InterfaceC24688Oooo0OO, InterfaceC24729OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24649OooO00o f83492OooO00o;

    /* JADX INFO: renamed from: o000oo.OooO0OO$OooO00o */
    public final class OooO00o<T> implements InterfaceC24687Oooo0O0<T>, InterfaceC24729OooOo0o {
        public OooO00o() {
        }

        @Override // o000oo0o.InterfaceC24729OooOo0o
        public final InterfaceC24747OooO0O0 OooO00o() {
            return C24651OooO0OO.this.f83492OooO00o;
        }

        @Override // o000oo0.OooOOOO
        public final Object OooO0O0(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
            return C24651OooO0OO.this.OooO0O0(str, interfaceC32507OooOO0o, abstractC32479OooO0OO);
        }
    }

    public C24651OooO0OO(C24649OooO00o c24649OooO00o) {
        this.f83492OooO00o = c24649OooO00o;
    }

    @Override // o000oo0o.InterfaceC24729OooOo0o
    public final InterfaceC24747OooO0O0 OooO00o() {
        return this.f83492OooO00o;
    }

    @Override // o000oo0.OooOOOO
    public final Object OooO0O0(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        AbstractC24653OooO0o0 abstractC24653OooO0o0O0ooOOo = this.f83492OooO00o.o0ooOOo(str);
        try {
            Object objInvoke = interfaceC32507OooOO0o.invoke(abstractC24653OooO0o0O0ooOOo);
            abstractC24653OooO0o0O0ooOOo.close();
            return objInvoke;
        } finally {
        }
    }

    @Override // o000oo0.InterfaceC24688Oooo0OO
    public final Object OooO0OO(AbstractC32476OooO abstractC32476OooO) {
        return Boolean.valueOf(this.f83492OooO00o.f83490OooOo0o.o000O00());
    }

    @Override // o000oo0.InterfaceC24688Oooo0OO
    public final Object OooO0Oo(InterfaceC24688Oooo0OO.OooO00o oooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32476OooO abstractC32476OooO) {
        return OooO0o0(oooO00o, interfaceC32508OooOOOo, abstractC32476OooO);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(InterfaceC24688Oooo0OO.OooO00o oooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C24652OooO0Oo c24652OooO0Oo;
        Throwable th;
        InterfaceC24756OooO0O0 interfaceC24756OooO0O0;
        C24651OooO0OO c24651OooO0OO;
        if (abstractC32479OooO0OO instanceof C24652OooO0Oo) {
            c24652OooO0Oo = (C24652OooO0Oo) abstractC32479OooO0OO;
            int i = c24652OooO0Oo.f83498OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24652OooO0Oo.f83498OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c24652OooO0Oo = new C24652OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24652OooO0Oo.f83497OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24652OooO0Oo.f83498OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC24756OooO0O0 interfaceC24756OooO0O02 = this.f83492OooO00o.f83490OooOo0o;
            interfaceC24756OooO0O02.o000O00();
            int iOrdinal = oooO00o.ordinal();
            if (iOrdinal == 0) {
                interfaceC24756OooO0O02.OoooOOO();
            } else if (iOrdinal == 1) {
                interfaceC24756OooO0O02.OooOoo();
            } else {
                if (iOrdinal != 2) {
                    throw new C32442OooOO0o();
                }
                interfaceC24756OooO0O02.OooOOo();
            }
            try {
                OooO00o oooO00o2 = new OooO00o();
                c24652OooO0Oo.f83495OooOo0o = this;
                c24652OooO0Oo.f83494OooOo = interfaceC24756OooO0O02;
                c24652OooO0Oo.f83498OooOoOO = 1;
                Object objInvoke = interfaceC32508OooOOOo.invoke(oooO00o2, c24652OooO0Oo);
                if (objInvoke == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = objInvoke;
                interfaceC24756OooO0O0 = interfaceC24756OooO0O02;
                c24651OooO0OO = this;
            } catch (Throwable th2) {
                th = th2;
                interfaceC24756OooO0O0 = interfaceC24756OooO0O02;
                c24651OooO0OO = this;
                interfaceC24756OooO0O0.o0000Ooo();
                if (!interfaceC24756OooO0O0.o000O00()) {
                    c24651OooO0OO.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC24756OooO0O0 = c24652OooO0Oo.f83494OooOo;
            c24651OooO0OO = c24652OooO0Oo.f83495OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable th3) {
                th = th3;
                interfaceC24756OooO0O0.o0000Ooo();
                if (!interfaceC24756OooO0O0.o000O00()) {
                }
                throw th;
            }
        }
        interfaceC24756OooO0O0.o00000O0();
        interfaceC24756OooO0O0.o0000Ooo();
        if (!interfaceC24756OooO0O0.o000O00()) {
            c24651OooO0OO.getClass();
        }
        return obj;
    }
}
