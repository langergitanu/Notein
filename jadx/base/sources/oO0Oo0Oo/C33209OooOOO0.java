package oO0Oo0Oo;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import o0o00oOo.o0000O0O;
import oO000o.C32084OooO0oo;
import oO000oo.C32132OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Ooo0O.C33400OooOoO0;
import oO0Ooo0O.InterfaceC33394OooOo;
import oO0o0OO.InterfaceC33623OooOo0O;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0Oo0Oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33209OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32132OooO0Oo f120174OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO000o0.OooO0o f120175OooO0O0;

    public C33209OooOOO0(C32132OooO0Oo c32132OooO0Oo, oO000o0.OooO0o client) {
        Set setKeySet;
        kotlin.jvm.internal.OooOOO0.OooO0oO(client, "client");
        this.f120174OooO00o = c32132OooO0Oo;
        this.f120175OooO0O0 = client;
        Map map = (Map) c32132OooO0Oo.f115207OooO0o.OooO0OO(C32084OooO0oo.f114926OooO00o);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<InterfaceC33394OooOo> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof InterfaceC33394OooOo) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC33394OooOo interfaceC33394OooOo : arrayList) {
            if (C33400OooOoO0.OooO0O0(this.f120175OooO0O0, interfaceC33394OooOo) == null) {
                throw new IllegalArgumentException(("Consider installing " + interfaceC33394OooOo + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC33200OooO0OO abstractC33200OooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33197OooO c33197OooO;
        if (abstractC32479OooO0OO instanceof C33197OooO) {
            c33197OooO = (C33197OooO) abstractC32479OooO0OO;
            int i = c33197OooO.f120137OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33197OooO.f120137OooOoO = i - Integer.MIN_VALUE;
            } else {
                c33197OooO = new C33197OooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c33197OooO.f120135OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33197OooO.f120137OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = abstractC33200OooO0OO.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
            InterfaceC33623OooOo0O interfaceC33623OooOo0O = (InterfaceC33623OooOo0O) oooO0O0;
            interfaceC33623OooOo0O.complete();
            try {
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0O0 = abstractC33200OooO0OO.OooO0O0();
                kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC23986Ooooo0oOooO0O0, "<this>");
                interfaceC23986Ooooo0oOooO0O0.cancel(null);
            } catch (Throwable unused) {
            }
            c33197OooO.f120136OooOo0o = interfaceC33623OooOo0O;
            c33197OooO.f120137OooOoO = 1;
            if (interfaceC33623OooOo0O.join(c33197OooO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:57|(1:(1:(1:(1:(2:14|15)(3:16|17|50))(3:21|22|23))(5:24|53|25|42|(2:44|49)(1:45)))(2:29|30))(3:32|33|(2:35|49)(1:36))|37|55|38|(3:41|42|(0)(0))|49) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if (r2.OooO00o(r11, r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33206OooOO0 c33206OooOO0;
        C33209OooOOO0 c33209OooOOO0;
        AbstractC33200OooO0OO abstractC33200OooO0OO;
        AbstractC33200OooO0OO abstractC33200OooO0OO2;
        if (abstractC32479OooO0OO instanceof C33206OooOO0) {
            c33206OooOO0 = (C33206OooOO0) abstractC32479OooO0OO;
            int i = c33206OooOO0.f120168OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33206OooOO0.f120168OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c33206OooOO0 = new C33206OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c33206OooOO0.f120167OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33206OooOO0.f120168OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                c33206OooOO0.f120165OooOo0o = this;
                c33206OooOO0.f120164OooOo = interfaceC32508OooOOOo;
                c33206OooOO0.f120168OooOoOO = 1;
                objOooO0OO = OooO0OO(c33206OooOO0);
                if (objOooO0OO != enumC32485OooO00o) {
                    c33209OooOOO0 = this;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            Object obj = c33206OooOO0.f120165OooOo0o;
                            C32446OooOOOo.OooO0O0(objOooO0OO);
                            return obj;
                        }
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) c33206OooOO0.f120165OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0OO);
                        throw th;
                    }
                    abstractC33200OooO0OO2 = (AbstractC33200OooO0OO) c33206OooOO0.f120164OooOo;
                    c33209OooOOO0 = (C33209OooOOO0) c33206OooOO0.f120165OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0OO);
                        c33206OooOO0.f120165OooOo0o = objOooO0OO;
                        c33206OooOO0.f120164OooOo = null;
                        c33206OooOO0.f120168OooOoOO = 3;
                    } catch (Throwable th) {
                        abstractC33200OooO0OO = abstractC33200OooO0OO2;
                        th = th;
                        c33206OooOO0.f120165OooOo0o = th;
                        c33206OooOO0.f120164OooOo = null;
                        c33206OooOO0.f120168OooOoOO = 4;
                    }
                    return c33209OooOOO0.OooO00o(abstractC33200OooO0OO2, c33206OooOO0) != enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
                }
                interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) c33206OooOO0.f120164OooOo;
                c33209OooOOO0 = (C33209OooOOO0) c33206OooOO0.f120165OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            abstractC33200OooO0OO = (AbstractC33200OooO0OO) objOooO0OO;
            c33206OooOO0.f120165OooOo0o = c33209OooOOO0;
            c33206OooOO0.f120164OooOo = abstractC33200OooO0OO;
            c33206OooOO0.f120168OooOoOO = 2;
            Object objInvoke = interfaceC32508OooOOOo.invoke(abstractC33200OooO0OO, c33206OooOO0);
            if (objInvoke != enumC32485OooO00o) {
                objOooO0OO = objInvoke;
                abstractC33200OooO0OO2 = abstractC33200OooO0OO;
                c33206OooOO0.f120165OooOo0o = objOooO0OO;
                c33206OooOO0.f120164OooOo = null;
                c33206OooOO0.f120168OooOoOO = 3;
                if (c33209OooOOO0.OooO00o(abstractC33200OooO0OO2, c33206OooOO0) != enumC32485OooO00o) {
                }
            }
        } catch (CancellationException e) {
            throw o0000O0O.OooO00o(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33208OooOO0o c33208OooOO0o;
        if (abstractC32479OooO0OO instanceof C33208OooOO0o) {
            c33208OooOO0o = (C33208OooOO0o) abstractC32479OooO0OO;
            int i = c33208OooOO0o.f120173OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33208OooOO0o.f120173OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33208OooOO0o = new C33208OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c33208OooOO0o.f120172OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33208OooOO0o.f120173OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                C32132OooO0Oo c32132OooO0Oo = new C32132OooO0Oo();
                c32132OooO0Oo.OooO0o0(this.f120174OooO00o);
                oO000o0.OooO0o oooO0o = this.f120175OooO0O0;
                c33208OooOO0o.f120173OooOoO0 = 1;
                objOooO00o = oooO0o.OooO00o(c32132OooO0Oo, c33208OooOO0o);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            return ((ooOOOOOo.OooO0OO) objOooO00o).OooO0o0();
        } catch (CancellationException e) {
            throw o0000O0O.OooO00o(e);
        }
    }

    public final String toString() {
        return "HttpStatement[" + this.f120174OooO00o.f115203OooO00o + ']';
    }
}
