package o0000o0O;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import o00OooO0.C25150OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.C33621OooOo0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0000o0O.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24304ooOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f81813OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f81814OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f81815OooO0OO;

    public AbstractC24304ooOO(String content, List parameters) {
        this.f81813OooO00o = 2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parameters, "parameters");
        this.f81814OooO0O0 = content;
        this.f81815OooO0OO = parameters;
    }

    public void OooO00o(int i, String str) {
        ((HashMap) this.f81814OooO0O0).put(Integer.valueOf(i), str);
        ((HashMap) this.f81815OooO0OO).put(str, Integer.valueOf(i));
    }

    public abstract Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO);

    public String OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List list = (List) this.f81815OooO0OO;
        int iOooOO0O = C34429OooOOo0.OooOO0O(list);
        if (iOooOO0O < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            oO00O0o0.OooO oooO = (oO00O0o0.OooO) list.get(i);
            if (C33595OooOOo.OooOOo(oooO.f115509OooO00o, name, true)) {
                return oooO.f115510OooO0O0;
            }
            if (i == iOooOO0O) {
                return null;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o0OoOo0 o0oooo02;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        AbstractC24304ooOO abstractC24304ooOO;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        AbstractC24304ooOO abstractC24304ooOO2;
        if (abstractC32479OooO0OO instanceof o0OoOo0) {
            o0oooo02 = (o0OoOo0) abstractC32479OooO0OO;
            int i = o0oooo02.f81802OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oooo02.f81802OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o0oooo02 = new o0OoOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0oooo02.f81801OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oooo02.f81802OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (((C33621OooOo0) this.f81815OooO0OO).isCompleted()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                o0oooo02.f81799OooOo0o = this;
                interfaceC33895OooO00o = (C33898OooO0Oo) this.f81814OooO0O0;
                o0oooo02.f81798OooOo = interfaceC33895OooO00o;
                o0oooo02.f81802OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(o0oooo02) != enumC32485OooO00o) {
                    abstractC24304ooOO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = o0oooo02.f81798OooOo;
                abstractC24304ooOO2 = o0oooo02.f81799OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C33621OooOo0 c33621OooOo0 = (C33621OooOo0) abstractC24304ooOO2.f81815OooO0OO;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    c33621OooOo0.OoooO00(c32460OooOooO);
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return c32460OooOooO;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = o0oooo02.f81798OooOo;
            abstractC24304ooOO = o0oooo02.f81799OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            if (((C33621OooOo0) abstractC24304ooOO.f81815OooO0OO).isCompleted()) {
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o.OooOOO0(null);
                return c32460OooOooO2;
            }
            o0oooo02.f81799OooOo0o = abstractC24304ooOO;
            o0oooo02.f81798OooOo = interfaceC33895OooO00o;
            o0oooo02.f81802OooOoOO = 2;
            if (abstractC24304ooOO.OooO0O0(o0oooo02) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                abstractC24304ooOO2 = abstractC24304ooOO;
                C33621OooOo0 c33621OooOo02 = (C33621OooOo0) abstractC24304ooOO2.f81815OooO0OO;
                C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                c33621OooOo02.OoooO00(c32460OooOooO3);
                interfaceC33895OooO00o2.OooOOO0(null);
                return c32460OooOooO3;
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d A[LOOP:1: B:16:0x0058->B:67:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int length;
        int i;
        int length2;
        int i2;
        int i3 = 2;
        switch (this.f81813OooO00o) {
            case 2:
                List<oO00O0o0.OooO> list = (List) this.f81815OooO0OO;
                boolean zIsEmpty = list.isEmpty();
                String str = (String) this.f81814OooO0O0;
                if (zIsEmpty) {
                    return str;
                }
                int length3 = str.length();
                int length4 = 0;
                for (oO00O0o0.OooO oooO : list) {
                    length4 += oooO.f115510OooO0O0.length() + oooO.f115509OooO00o.length() + 3;
                }
                StringBuilder sb = new StringBuilder(length3 + length4);
                sb.append(str);
                int iOooOO0O = C34429OooOOo0.OooOO0O(list);
                if (iOooOO0O >= 0) {
                    int i4 = 0;
                    while (true) {
                        oO00O0o0.OooO oooO2 = (oO00O0o0.OooO) list.get(i4);
                        sb.append("; ");
                        sb.append(oooO2.f115509OooO00o);
                        sb.append("=");
                        Set<Character> set = oO00O0o0.OooOO0.f115532OooO00o;
                        String str2 = oooO2.f115510OooO0O0;
                        if (str2.length() == 0) {
                            StringBuilder sb2 = new StringBuilder("\"");
                            length = str2.length();
                            while (i < length) {
                            }
                            sb2.append("\"");
                            String string = sb2.toString();
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
                            sb.append(string);
                            if (i4 != iOooOO0O) {
                            }
                        } else if (str2.length() >= i3 && C33600OooOo0o.OoooooO(str2) == '\"' && C33600OooOo0o.Ooooooo(str2) == '\"') {
                            int i5 = 1;
                            do {
                                int iOooo0 = C33599OooOo0O.Oooo0(str2, '\"', i5, 4);
                                if (iOooo0 != C33599OooOo0O.Oooo000(str2)) {
                                    int i6 = 0;
                                    for (int i7 = iOooo0 - 1; str2.charAt(i7) == '\\'; i7--) {
                                        i6++;
                                    }
                                    if (i6 % i3 == 0) {
                                        length2 = str2.length();
                                        for (i2 = 0; i2 < length2; i2++) {
                                            if (oO00O0o0.OooOO0.f115532OooO00o.contains(Character.valueOf(str2.charAt(i2)))) {
                                                StringBuilder sb22 = new StringBuilder("\"");
                                                length = str2.length();
                                                for (i = 0; i < length; i++) {
                                                    char cCharAt = str2.charAt(i);
                                                    if (cCharAt == '\\') {
                                                        sb22.append("\\\\");
                                                    } else if (cCharAt == '\n') {
                                                        sb22.append("\\n");
                                                    } else if (cCharAt == '\r') {
                                                        sb22.append("\\r");
                                                    } else if (cCharAt == '\t') {
                                                        sb22.append("\\t");
                                                    } else if (cCharAt == '\"') {
                                                        sb22.append("\\\"");
                                                    } else {
                                                        sb22.append(cCharAt);
                                                    }
                                                }
                                                sb22.append("\"");
                                                String string2 = sb22.toString();
                                                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
                                                sb.append(string2);
                                                if (i4 != iOooOO0O) {
                                                    i4++;
                                                    i3 = 2;
                                                }
                                            }
                                        }
                                    } else {
                                        i5 = iOooo0 + 1;
                                    }
                                }
                                sb.append(str2);
                                if (i4 != iOooOO0O) {
                                }
                            } while (i5 < str2.length());
                            sb.append(str2);
                            if (i4 != iOooOO0O) {
                            }
                        } else {
                            length2 = str2.length();
                            while (i2 < length2) {
                            }
                            sb.append(str2);
                            if (i4 != iOooOO0O) {
                            }
                        }
                    }
                }
                String string3 = sb.toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "{\n            val size =…   }.toString()\n        }");
                return string3;
            default:
                return super.toString();
        }
    }

    public AbstractC24304ooOO(int i) {
        this.f81813OooO00o = i;
        switch (i) {
            case 1:
                this.f81814OooO0O0 = new HashMap(250);
                this.f81815OooO0OO = new HashMap(250);
                break;
            default:
                this.f81814OooO0O0 = C33900OooO0o0.OooO00o();
                this.f81815OooO0OO = C25150OooO00o.OooO0Oo();
                break;
        }
    }
}
