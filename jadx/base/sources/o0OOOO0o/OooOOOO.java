package o0OOOO0o;

import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOo0.C27174OooO0O0;
import o0OOOo00.C27175OooO00o;
import o0OOOo00.C27178OooO0Oo;
import o0OOOo00.C27180OooO0o0;
import o0Oo00oO.C28036OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOOO extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOOO0.OooO f94458OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94459OooO0O0;

    public OooOOOO(o0OOOOO0.OooO honorLoginApi, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(honorLoginApi, "honorLoginApi");
        this.f94458OooO00o = honorLoginApi;
        this.f94459OooO0O0 = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, String str3, String str4, String str5, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27100OooOO0o c27100OooOO0o;
        OooOOOO oooOOOO;
        if (abstractC32479OooO0OO instanceof C27100OooOO0o) {
            c27100OooOO0o = (C27100OooOO0o) abstractC32479OooO0OO;
            int i = c27100OooOO0o.f94448OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27100OooOO0o.f94448OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27100OooOO0o = new C27100OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27100OooOO0o.f94446OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27100OooOO0o.f94448OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                o0OOOOO0.OooO oooO = this.f94458OooO00o;
                C27175OooO00o c27175OooO00o = new C27175OooO00o(C28036OooO0O0.OooO0OO(str), str2, str3, str4, "");
                c27100OooOO0o.f94447OooOo0o = this;
                c27100OooOO0o.f94448OooOoO = 1;
                objOooO0OO = oooO.OooO0OO(c27175OooO00o, c27100OooOO0o);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                oooOOOO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = c27100OooOO0o.f94447OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            oooOOOO.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0OO, "HonorAuthorizeService", "bindPhoneNumber");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HonorAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "bindPhoneNumber error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO0 oooOOO0;
        OooOOOO oooOOOO;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f94456OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f94456OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooOOO0.f94454OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f94456OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                o0OOOOO0.OooO oooO = this.f94458OooO00o;
                C27180OooO0o0 c27180OooO0o0 = new C27180OooO0o0(str);
                oooOOO0.f94455OooOo0o = this;
                oooOOO0.f94456OooOoO = 1;
                objOooO00o = oooO.OooO00o(c27180OooO0o0, oooOOO0);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                oooOOOO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = oooOOO0.f94455OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            oooOOOO.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO00o, "HonorAuthorizeService", "login");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HonorAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "login failed.", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        OooOOOO oooOOOO;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f94452OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f94452OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oooOOO.f94450OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f94452OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                o0OOOOO0.OooO oooO = this.f94458OooO00o;
                C27178OooO0Oo c27178OooO0Oo = new C27178OooO0Oo(str);
                oooOOO.f94451OooOo0o = this;
                oooOOO.f94452OooOoO = 1;
                objOooO0O0 = oooO.OooO0O0(c27178OooO0Oo, oooOOO);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                oooOOOO = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = oooOOO.f94451OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            oooOOOO.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0O0, "HonorAuthorizeService", "skipBindPhoneNumber");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HonorAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "skipBindPhoneNumber error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }
}
