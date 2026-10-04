package o0OOOO0o;

import OooOoOO.C20519OooO0Oo;
import com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.p610mm.opensdk.openapi.IWXAPI;
import java.util.Formatter;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO0o.C27147o0ooOO0;
import o0OOOo0.C27174OooO0O0;
import o0OOOo00.C27175OooO00o;
import o0OOOo00.C27178OooO0Oo;
import o0OOOo00.C27180OooO0o0;
import o0Oo00oO.C28036OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0O00 extends OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOOO0.OooOOO0 f94737OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f94738OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C27147o0ooOO0.OooO00o f94739OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32447OooOOo f94740OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f94741OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32447OooOOo f94742OooO0o0;

    public o0O0O00(o0OOOOO0.OooOOO0 wxLoginService, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(wxLoginService, "wxLoginService");
        this.f94737OooO00o = wxLoginService;
        this.f94738OooO0O0 = abstractApplicationC26277OooOoOO;
        this.f94740OooO0Oo = C20519OooO0Oo.OooO0OO(new C27144o00o0O(this, 0));
        this.f94742OooO0o0 = C20519OooO0Oo.OooO0OO(new C27146o00ooo());
        this.f94741OooO0o = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0OOOO0o.oo000o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return new o0Oo0oo(this.f94769OooOo0o);
            }
        });
    }

    public static final IDiffDevOAuth OooO0O0(o0O0O00 o0o0o00) {
        Object value = o0o0o00.f94742OooO0o0.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
        return (IDiffDevOAuth) value;
    }

    public static String OooO0Oo(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b : bArr) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String string = formatter.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        formatter.close();
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, String str3, String str4, String str5, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0OOO0o o0ooo0o2;
        o0O0O00 o0o0o00;
        if (abstractC32479OooO0OO instanceof o0OOO0o) {
            o0ooo0o2 = (o0OOO0o) abstractC32479OooO0OO;
            int i = o0ooo0o2.f94749OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0ooo0o2.f94749OooOoO = i - Integer.MIN_VALUE;
            } else {
                o0ooo0o2 = new o0OOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = o0ooo0o2.f94747OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0ooo0o2.f94749OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                o0OOOOO0.OooOOO0 oooOOO0 = this.f94737OooO00o;
                C27175OooO00o c27175OooO00o = new C27175OooO00o(C28036OooO0O0.OooO0OO(str), str2, str3, str4, str5);
                o0ooo0o2.f94748OooOo0o = this;
                o0ooo0o2.f94749OooOoO = 1;
                objOooO0OO = oooOOO0.OooO0OO(c27175OooO00o, o0ooo0o2);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o0o0o00 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0o0o00 = o0ooo0o2.f94748OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            o0o0o00.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0OO, "WXAuthorizeService", "bindPhoneNumber");
        } catch (Exception unused) {
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0OO00O o0oo00o2;
        o0O0O00 o0o0o00;
        if (abstractC32479OooO0OO instanceof o0OO00O) {
            o0oo00o2 = (o0OO00O) abstractC32479OooO0OO;
            int i = o0oo00o2.f94745OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo00o2.f94745OooOoO = i - Integer.MIN_VALUE;
            } else {
                o0oo00o2 = new o0OO00O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o0oo00o2.f94743OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oo00o2.f94745OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                o0OOOOO0.OooOOO0 oooOOO0 = this.f94737OooO00o;
                C27180OooO0o0 c27180OooO0o0 = new C27180OooO0o0(str);
                o0oo00o2.f94744OooOo0o = this;
                o0oo00o2.f94745OooOoO = 1;
                objOooO00o = oooOOO0.OooO00o(c27180OooO0o0, o0oo00o2);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o0o0o00 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0o0o00 = o0oo00o2.f94744OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            o0o0o00.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO00o, "WXAuthorizeService", "login");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("WXAuthorizeService");
            c20358OooO00o.OooO0Oo(e, "login error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }

    public final IWXAPI OooO0o0() {
        Object value = this.f94740OooO0Oo.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
        return (IWXAPI) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0o0Oo oo0o0oo;
        o0O0O00 o0o0o00;
        if (abstractC32479OooO0OO instanceof oo0o0Oo) {
            oo0o0oo = (oo0o0Oo) abstractC32479OooO0OO;
            int i = oo0o0oo.f94772OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o0oo.f94772OooOoO = i - Integer.MIN_VALUE;
            } else {
                oo0o0oo = new oo0o0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oo0o0oo.f94770OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0o0oo.f94772OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("WXAuthorizeService");
                c20358OooO00o.OooO0o0("skipBindPhoneNumber, " + System.currentTimeMillis(), new Object[0]);
                o0OOOOO0.OooOOO0 oooOOO0 = this.f94737OooO00o;
                C27178OooO0Oo c27178OooO0Oo = new C27178OooO0Oo(str, str2);
                oo0o0oo.f94771OooOo0o = this;
                oo0o0oo.f94772OooOoO = 1;
                objOooO0O0 = oooOOO0.OooO0O0(c27178OooO0Oo, oo0o0oo);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                o0o0o00 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0o0o00 = oo0o0oo.f94771OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            o0o0o00.getClass();
            return OooO00o.OooO00o((C35238OooOoO) objOooO0O0, "WXAuthorizeService", "skipBindPhoneNumber");
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("WXAuthorizeService");
            c20358OooO00o2.OooO0Oo(e, "skipBindPhoneNumber error", new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        }
    }
}
