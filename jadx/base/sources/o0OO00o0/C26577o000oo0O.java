package o0OO00o0;

import OooOoOO.C20519OooO0Oo;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO00o0.o000oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26577o000oo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f91598OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f91599OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f91600OooO0OO;

    public C26577o000oo0O(o0000o0O.OooOO0 ds, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        this.f91598OooO00o = ds;
        this.f91599OooO0O0 = abstractApplicationC26277OooOoOO;
        this.f91600OooO0OO = C20519OooO0Oo.OooO0OO(new C26618o00Oo0(0));
    }

    public final Object OooO00o(AbstractC24338OooO0o0.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO00o = C24332OooO.OooO00o(this.f91598OooO00o, new C26640o00Ooo(oooO00o, null), abstractC32479OooO0OO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final C26663o00o0O OooO0O0(AbstractC24338OooO0o0.OooO00o key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return new C26663o00o0O(this.f91598OooO00o.getData(), key);
    }

    public final C26522o000000o OooO0OO(AbstractC24338OooO0o0.OooO00o key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return new C26522o000000o(this.f91598OooO00o.getData(), key);
    }

    public final o00000O0 OooO0Oo(AbstractC24338OooO0o0.OooO00o key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return new o00000O0(this.f91598OooO00o.getData(), key);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC24338OooO0o0.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26538o0000oOO c26538o0000oOO;
        if (abstractC32479OooO0OO instanceof C26538o0000oOO) {
            c26538o0000oOO = (C26538o0000oOO) abstractC32479OooO0OO;
            int i = c26538o0000oOO.f91394OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26538o0000oOO.f91394OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26538o0000oOO = new C26538o0000oOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26538o0000oOO.f91392OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26538o0000oOO.f91394OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = this.f91598OooO00o.getData();
            c26538o0000oOO.f91393OooOo0o = oooO00o;
            c26538o0000oOO.f91394OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, c26538o0000oOO);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = c26538o0000oOO.f91393OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        Boolean bool = (Boolean) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(oooO00o);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    public final Object OooO0o0(AbstractC24338OooO0o0.OooO00o oooO00o) {
        return C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C26530o0000OoO(oooO00o, new C26528o0000Oo(this.f91598OooO00o.getData(), oooO00o), null));
    }

    public final Object OooO0oO(AbstractC24338OooO0o0.OooO00o oooO00o, boolean z, AbstractC32476OooO abstractC32476OooO) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("GlobalSettingRepoImpl");
        c20358OooO00o.OooO0o0("saveEnableFillShape: " + oooO00o.f81922OooO00o + ", " + z, new Object[0]);
        Object objOooO00o = C24332OooO.OooO00o(this.f91598OooO00o, new o000O0Oo(oooO00o, z, null), abstractC32476OooO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0oo(AbstractC24338OooO0o0.OooO00o oooO00o, boolean z, AbstractC32476OooO abstractC32476OooO) {
        Object objOooO00o = C24332OooO.OooO00o(this.f91598OooO00o, new o000O(oooO00o, z, null), abstractC32476OooO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
