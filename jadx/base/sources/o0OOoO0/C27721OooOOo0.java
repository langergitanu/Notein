package o0OOoO0;

import java.util.Set;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0OOoO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27721OooOOo0 implements OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f97798OooO00o;

    public C27721OooOOo0(o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f97798OooO00o = dataStore;
    }

    public static AbstractC24338OooO0o0.OooO00o OooO0o(String str) {
        return C24340OooO0oo.OooO0o0("migration_error_" + str);
    }

    @Override // o0OOoO0.OooOO0O
    public final Object OooO00o(OooOO0 oooOO02, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO00o = C24332OooO.OooO00o(this.f97798OooO00o, new OooOOOO(this, oooOO02, null), abstractC32479OooO0OO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOoO0.OooOO0O
    public final Object OooO0O0(String str, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO00o = C24332OooO.OooO00o(this.f97798OooO00o, new C27720OooOOOo(this, str, set, null), abstractC32479OooO0OO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOoO0.OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f97785OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f97785OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = oooOOO.f97784OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f97785OooOoO0;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            oooOOO.f97785OooOoO0 = 1;
            objOooO0o0 = OooO0o0(str, oooOOO);
            if (objOooO0o0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        OooOO0 oooOO02 = (OooOO0) objOooO0o0;
        if (oooOO02 == null) {
            return Boolean.FALSE;
        }
        OooO oooO = OooO.f97726OooOo;
        OooO oooO2 = oooOO02.f97776OooO0O0;
        if (oooO2 != oooO && oooO2 != OooO.f97729OooOoO0 && oooO2 != OooO.f97728OooOoO) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOoO0.OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO0 oooOOO0;
        C27721OooOOo0 c27721OooOOo0;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f97790OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f97790OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = oooOOO0.f97789OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f97790OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = this.f97798OooO00o.getData();
            oooOOO0.f97787OooOo0o = this;
            oooOOO0.f97786OooOo = str;
            oooOOO0.f97790OooOoOO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, oooOOO0);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27721OooOOo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oooOOO0.f97786OooOo;
            c27721OooOOo0 = oooOOO0.f97787OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        c27721OooOOo0.getClass();
        Set set = (Set) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(C24340OooO0oo.OooO0o("migration_migrated_ids_" + str));
        return set == null ? C34438OooOoo0.f123458OooOo0o : set;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOoO0.OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27719OooOO0o c27719OooOO0o;
        C27721OooOOo0 c27721OooOOo0;
        if (abstractC32479OooO0OO instanceof C27719OooOO0o) {
            c27719OooOO0o = (C27719OooOO0o) abstractC32479OooO0OO;
            int i = c27719OooOO0o.f97782OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27719OooOO0o.f97782OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27719OooOO0o = new C27719OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c27719OooOO0o.f97781OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27719OooOO0o.f97782OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = this.f97798OooO00o.getData();
            c27719OooOO0o.f97779OooOo0o = this;
            c27719OooOO0o.f97778OooOo = str;
            c27719OooOO0o.f97782OooOoOO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, c27719OooOO0o);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27721OooOOo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c27719OooOO0o.f97778OooOo;
            c27721OooOOo0 = c27719OooOO0o.f97779OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) objOooOOo;
        c27721OooOOo0.getClass();
        String str2 = (String) abstractC24338OooO0o0.OooO0OO(C24340OooO0oo.OooO0o0("migration_phase_" + str));
        if (str2 == null) {
            return null;
        }
        return new OooOO0(str, OooO.valueOf(str2), (String) abstractC24338OooO0o0.OooO0OO(OooO0o(str)));
    }
}
