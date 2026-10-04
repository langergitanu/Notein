package ooOOoOO0;

import com.facebook.imagepipeline.producers.C22306Ooooooo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooO.AbstractC32433OooO0O0;
import oO00ooO.C32432OooO00o;
import oO00ooO.C32434OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32477OooO00o;
import oO00ooo0.C32489OooO0o;
import oO00ooo0.C32491OooO0oO;
import oO00ooo0.EnumC32485OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo00O0O.AbstractC34475OooOooO;
import oOo00O0O.C34458OooO0Oo;
import oOo00O0O.C34461OooO0oo;
import oOo00O0O.C34468OooOo0O;
import oOo00O0O.C34471OooOoO0;
import oOo00O0O.C34474OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC35114OooO00o f126175OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f126176OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f126177OooO0OO;

    public Oooo000(C34461OooO0oo c34461OooO0oo, AbstractC35114OooO00o abstractC35114OooO00o) {
        this.f126175OooO00o = abstractC35114OooO00o;
        this.f126176OooO0O0 = c34461OooO0oo.f123514OooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(Oooo000 oooo000, AbstractC32433OooO0O0 abstractC32433OooO0O0, AbstractC32477OooO00o abstractC32477OooO00o) {
        C35137OooOooo c35137OooOooo;
        byte bOooO0oO;
        LinkedHashMap linkedHashMap;
        Oooo000 oooo0002;
        byte bOooO0o;
        LinkedHashMap linkedHashMap2;
        if (abstractC32477OooO00o instanceof C35137OooOooo) {
            c35137OooOooo = (C35137OooOooo) abstractC32477OooO00o;
            int i = c35137OooOooo.f126164OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35137OooOooo.f126164OooOoo = i - Integer.MIN_VALUE;
            } else {
                c35137OooOooo = new C35137OooOooo(oooo000, abstractC32477OooO00o);
            }
        }
        Object obj = c35137OooOooo.f126163OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c35137OooOooo.f126164OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC35114OooO00o abstractC35114OooO00o = oooo000.f126175OooO00o;
            bOooO0oO = abstractC35114OooO00o.OooO0oO((byte) 6);
            if (abstractC35114OooO00o.OooOo() == 4) {
                AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            linkedHashMap = new LinkedHashMap();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = c35137OooOooo.f126161OooOoO;
            linkedHashMap2 = c35137OooOooo.f126162OooOoO0;
            oooo0002 = c35137OooOooo.f126159OooOo;
            AbstractC32433OooO0O0 abstractC32433OooO0O02 = c35137OooOooo.f126160OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            linkedHashMap2.put(str, (oOo00O0O.OooOO0O) obj);
            bOooO0o = oooo0002.f126175OooO00o.OooO0o();
            if (bOooO0o != 4) {
                if (bOooO0o != 7) {
                    AbstractC35114OooO00o.OooOOo(oooo0002.f126175OooO00o, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
                AbstractC35114OooO00o abstractC35114OooO00o2 = oooo0002.f126175OooO00o;
                if (bOooO0o != 6) {
                    abstractC35114OooO00o2.OooO0oO((byte) 7);
                } else if (bOooO0o == 4) {
                    OoooO0O.OooOo.OooOOO0(abstractC35114OooO00o2, "object");
                    throw null;
                }
                return new C34474OooOoo0(linkedHashMap2);
            }
            bOooO0oO = bOooO0o;
            oooo000 = oooo0002;
            linkedHashMap = linkedHashMap2;
            abstractC32433OooO0O0 = abstractC32433OooO0O02;
        }
        AbstractC35114OooO00o abstractC35114OooO00o3 = oooo000.f126175OooO00o;
        if (!abstractC35114OooO00o3.OooO0OO()) {
            byte b = bOooO0oO;
            oooo0002 = oooo000;
            bOooO0o = b;
            linkedHashMap2 = linkedHashMap;
            AbstractC35114OooO00o abstractC35114OooO00o22 = oooo0002.f126175OooO00o;
            if (bOooO0o != 6) {
            }
            return new C34474OooOoo0(linkedHashMap2);
        }
        String strOooOO0o = oooo000.f126176OooO0O0 ? abstractC35114OooO00o3.OooOO0o() : abstractC35114OooO00o3.OooOO0();
        abstractC35114OooO00o3.OooO0oO((byte) 5);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        c35137OooOooo.f126160OooOo0o = abstractC32433OooO0O0;
        c35137OooOooo.f126159OooOo = oooo000;
        c35137OooOooo.f126162OooOoO0 = linkedHashMap;
        c35137OooOooo.f126161OooOoO = strOooOO0o;
        c35137OooOooo.f126164OooOoo = 1;
        abstractC32433OooO0O0.OooO00o(c32460OooOooO, c35137OooOooo);
        return enumC32485OooO00o;
    }

    public final oOo00O0O.OooOO0O OooO0O0() {
        oOo00O0O.OooOO0O c34474OooOoo0;
        Object obj;
        Object objInvoke;
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126175OooO00o;
        byte bOooOo = abstractC35114OooO00o.OooOo();
        if (bOooOo == 1) {
            return OooO0Oo(true);
        }
        if (bOooOo == 0) {
            return OooO0Oo(false);
        }
        if (bOooOo != 6) {
            if (bOooOo == 8) {
                return OooO0OO();
            }
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Cannot read Json element because of unexpected ".concat(C22306Ooooooo.OooO0o0(bOooOo)), 0, null, 6);
            throw null;
        }
        int i = this.f126177OooO0OO + 1;
        this.f126177OooO0OO = i;
        if (i == 200) {
            C35136OooOooO c35136OooOooO = new C35136OooOooO(this, null);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            EnumC32485OooO00o enumC32485OooO00o = C32432OooO00o.f116627OooO00o;
            C32434OooO0OO c32434OooO0OO = new C32434OooO0OO();
            c32434OooO0OO.f116629OooOo0o = c35136OooOooO;
            c32434OooO0OO.f116628OooOo = c32460OooOooO;
            c32434OooO0OO.f116631OooOoO0 = c32434OooO0OO;
            EnumC32485OooO00o enumC32485OooO00o2 = C32432OooO00o.f116627OooO00o;
            c32434OooO0OO.f116630OooOoO = enumC32485OooO00o2;
            while (true) {
                obj = c32434OooO0OO.f116630OooOoO;
                Continuation<? super oOo00O0O.OooOO0O> continuation = c32434OooO0OO.f116631OooOoO0;
                if (continuation == null) {
                    break;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(enumC32485OooO00o2, obj)) {
                    try {
                        C35136OooOooO c35136OooOooO2 = c32434OooO0OO.f116629OooOo0o;
                        C32460OooOooO c32460OooOooO2 = c32434OooO0OO.f116628OooOo;
                        if (c35136OooOooO2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(c35136OooOooO2, "<this>");
                            InterfaceC34415OooO0oo context = continuation.getContext();
                            Continuation<? super oOo00O0O.OooOO0O> c32489OooO0o = context == oOo0000O.OooO.f123416OooOo0o ? new C32489OooO0o(continuation) : new C32491OooO0oO(continuation, context);
                            C24039Oooo0o0.OooO0o0(3, c35136OooOooO2);
                            objInvoke = c35136OooOooO2.invoke(c32434OooO0OO, c32460OooOooO2, c32489OooO0o);
                        } else {
                            C24039Oooo0o0.OooO0o0(3, c35136OooOooO2);
                            objInvoke = c35136OooOooO2.invoke(c32434OooO0OO, c32460OooOooO2, continuation);
                        }
                        if (objInvoke != EnumC32485OooO00o.f116726OooOo0o) {
                            continuation.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        continuation.resumeWith(C32446OooOOOo.OooO00o(th));
                    }
                } else {
                    c32434OooO0OO.f116630OooOoO = enumC32485OooO00o2;
                    continuation.resumeWith(obj);
                }
            }
            C32446OooOOOo.OooO0O0(obj);
            c34474OooOoo0 = (oOo00O0O.OooOO0O) obj;
        } else {
            byte bOooO0oO = abstractC35114OooO00o.OooO0oO((byte) 6);
            if (abstractC35114OooO00o.OooOo() == 4) {
                AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!abstractC35114OooO00o.OooO0OO()) {
                    break;
                }
                String strOooOO0o = this.f126176OooO0O0 ? abstractC35114OooO00o.OooOO0o() : abstractC35114OooO00o.OooOO0();
                abstractC35114OooO00o.OooO0oO((byte) 5);
                linkedHashMap.put(strOooOO0o, OooO0O0());
                bOooO0oO = abstractC35114OooO00o.OooO0o();
                if (bOooO0oO != 4) {
                    if (bOooO0oO != 7) {
                        AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bOooO0oO == 6) {
                abstractC35114OooO00o.OooO0oO((byte) 7);
            } else if (bOooO0oO == 4) {
                OoooO0O.OooOo.OooOOO0(abstractC35114OooO00o, "object");
                throw null;
            }
            c34474OooOoo0 = new C34474OooOoo0(linkedHashMap);
        }
        this.f126177OooO0OO--;
        return c34474OooOoo0;
    }

    public final C34458OooO0Oo OooO0OO() {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126175OooO00o;
        byte bOooO0o = abstractC35114OooO00o.OooO0o();
        if (abstractC35114OooO00o.OooOo() == 4) {
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC35114OooO00o.OooO0OO()) {
            arrayList.add(OooO0O0());
            bOooO0o = abstractC35114OooO00o.OooO0o();
            if (bOooO0o != 4) {
                boolean z = bOooO0o == 9;
                int i = abstractC35114OooO00o.f126099OooO00o;
                if (!z) {
                    AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bOooO0o == 8) {
            abstractC35114OooO00o.OooO0oO((byte) 9);
        } else if (bOooO0o == 4) {
            OoooO0O.OooOo.OooOOO0(abstractC35114OooO00o, "array");
            throw null;
        }
        return new C34458OooO0Oo(arrayList);
    }

    public final AbstractC34475OooOooO OooO0Oo(boolean z) {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126175OooO00o;
        String strOooOO0o = (this.f126176OooO0O0 || !z) ? abstractC35114OooO00o.OooOO0o() : abstractC35114OooO00o.OooOO0();
        return (z || !kotlin.jvm.internal.OooOOO0.OooO0O0(strOooOO0o, CloudMetaExtra.DEFINE_NON_PARENT_ID)) ? new C34468OooOo0O(strOooOO0o, z) : C34471OooOoO0.INSTANCE;
    }
}
