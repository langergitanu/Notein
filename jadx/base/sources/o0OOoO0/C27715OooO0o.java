package o0OOoO0;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOoO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27715OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f97755OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97756OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33898OooO0Oo f97757OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentHashMap f97758OooO0Oo;

    public C27715OooO0o(OooOO0O store, InterfaceC27605OooO00o cloudSyncRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(store, "store");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f97755OooO00o = store;
        this.f97756OooO0O0 = cloudSyncRepo;
        this.f97757OooO0OO = C33900OooO0o0.OooO00o();
        this.f97758OooO0Oo = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27711OooO00o c27711OooO00o;
        C27715OooO0o c27715OooO0o;
        String str2;
        C33898OooO0Oo c33898OooO0Oo;
        C27715OooO0o c27715OooO0o2;
        if (abstractC32479OooO0OO instanceof C27711OooO00o) {
            c27711OooO00o = (C27711OooO00o) abstractC32479OooO0OO;
            int i = c27711OooO00o.f97738OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27711OooO00o.f97738OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27711OooO00o = new C27711OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27711OooO00o.f97735OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27711OooO00o.f97738OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            c27711OooO00o.f97734OooOo0o = this;
            c27711OooO00o.f97733OooOo = str;
            c27711OooO00o.f97738OooOoo0 = 1;
            if (this.f97755OooO00o.OooO0O0(str, c34438OooOoo0, c27711OooO00o) != enumC32485OooO00o) {
                c27715OooO0o = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c27711OooO00o.f97736OooOoO0;
            str2 = c27711OooO00o.f97733OooOo;
            c27715OooO0o2 = c27711OooO00o.f97734OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            try {
                c33898OooO0Oo.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                c33898OooO0Oo.OooOOO0(null);
                throw th;
            }
        }
        str = c27711OooO00o.f97733OooOo;
        c27715OooO0o = c27711OooO00o.f97734OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33898OooO0Oo c33898OooO0Oo2 = c27715OooO0o.f97757OooO0OO;
        c27711OooO00o.f97734OooOo0o = c27715OooO0o;
        c27711OooO00o.f97733OooOo = str;
        c27711OooO00o.f97736OooOoO0 = c33898OooO0Oo2;
        c27711OooO00o.f97738OooOoo0 = 2;
        if (c33898OooO0Oo2.OooO00o(c27711OooO00o) != enumC32485OooO00o) {
            str2 = str;
            c33898OooO0Oo = c33898OooO0Oo2;
            c27715OooO0o2 = c27715OooO0o;
            c33898OooO0Oo.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27712OooO0O0 c27712OooO0O0;
        C27715OooO0o c27715OooO0o;
        String str3;
        if (abstractC32479OooO0OO instanceof C27712OooO0O0) {
            c27712OooO0O0 = (C27712OooO0O0) abstractC32479OooO0OO;
            int i = c27712OooO0O0.f97744OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27712OooO0O0.f97744OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27712OooO0O0 = new C27712OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27712OooO0O0.f97741OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27712OooO0O0.f97744OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            c27712OooO0O0.f97740OooOo0o = this;
            c27712OooO0O0.f97739OooOo = str;
            c27712OooO0O0.f97742OooOoO0 = str2;
            c27712OooO0O0.f97744OooOoo0 = 1;
            objOooO0o0 = this.f97755OooO00o.OooO0o0(str, c27712OooO0O0);
            if (objOooO0o0 != enumC32485OooO00o) {
                c27715OooO0o = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) c27712OooO0O0.f97740OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
            return Boolean.valueOf(((Set) objOooO0o0).contains(str3));
        }
        str2 = c27712OooO0O0.f97742OooOoO0;
        str = c27712OooO0O0.f97739OooOo;
        c27715OooO0o = (C27715OooO0o) c27712OooO0O0.f97740OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o0);
        OooOO0 oooOO02 = (OooOO0) objOooO0o0;
        if (oooOO02 == null) {
            return Boolean.FALSE;
        }
        if (oooOO02.f97776OooO0O0 == OooO.f97730OooOoOO) {
            return Boolean.FALSE;
        }
        c27712OooO0O0.f97740OooOo0o = str2;
        c27712OooO0O0.f97739OooOo = null;
        c27712OooO0O0.f97742OooOoO0 = null;
        c27712OooO0O0.f97744OooOoo0 = 2;
        objOooO0o0 = c27715OooO0o.OooO0Oo(str, c27712OooO0O0);
        if (objOooO0o0 != enumC32485OooO00o) {
            str3 = str2;
            return Boolean.valueOf(((Set) objOooO0o0).contains(str3));
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27713OooO0OO c27713OooO0OO;
        Object objOooO0Oo;
        C27715OooO0o c27715OooO0o;
        if (abstractC32479OooO0OO instanceof C27713OooO0OO) {
            c27713OooO0OO = (C27713OooO0OO) abstractC32479OooO0OO;
            int i = c27713OooO0OO.f97747OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27713OooO0OO.f97747OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27713OooO0OO = new C27713OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27713OooO0OO.f97745OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27713OooO0OO.f97747OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27713OooO0OO.f97746OooOo0o = this;
            c27713OooO0OO.f97747OooOoO = 1;
            objOooO0Oo = this.f97756OooO0O0.OooO0Oo(c27713OooO0OO);
            if (objOooO0Oo != enumC32485OooO00o) {
                c27715OooO0o = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        c27715OooO0o = c27713OooO0OO.f97746OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO0Oo = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
            objOooO0Oo = null;
        }
        String str = (String) objOooO0Oo;
        if (str == null) {
            return Boolean.FALSE;
        }
        OooOO0O oooOO0O = c27715OooO0o.f97755OooO00o;
        c27713OooO0OO.f97746OooOo0o = null;
        c27713OooO0OO.f97747OooOoO = 2;
        Object objOooO0OO = oooOO0O.OooO0OO(str, c27713OooO0OO);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27714OooO0Oo c27714OooO0Oo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C27715OooO0o c27715OooO0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Object objO0Oo0oo;
        String str2;
        Map map;
        if (abstractC32479OooO0OO instanceof C27714OooO0Oo) {
            c27714OooO0Oo = (C27714OooO0Oo) abstractC32479OooO0OO;
            int i = c27714OooO0Oo.f97754OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27714OooO0Oo.f97754OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27714OooO0Oo = new C27714OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27714OooO0Oo.f97751OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27714OooO0Oo.f97754OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c27714OooO0Oo.f97750OooOo0o = this;
                c27714OooO0Oo.f97749OooOo = str;
                interfaceC33895OooO00o = this.f97757OooO0OO;
                c27714OooO0Oo.f97752OooOoO0 = interfaceC33895OooO00o;
                c27714OooO0Oo.f97754OooOoo0 = 1;
                if (interfaceC33895OooO00o.OooO00o(c27714OooO0Oo) != enumC32485OooO00o) {
                    c27715OooO0o = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) c27714OooO0Oo.f97752OooOoO0;
                interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c27714OooO0Oo.f97749OooOo;
                str2 = (String) c27714OooO0Oo.f97750OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    objO0Oo0oo = OooOo.o0Oo0oo((Iterable) obj);
                    map.put(str2, objO0Oo0oo);
                    Set set = (Set) objO0Oo0oo;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return set;
                } catch (Throwable th) {
                    th = th;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) c27714OooO0Oo.f97752OooOoO0;
            String str3 = (String) c27714OooO0Oo.f97749OooOo;
            c27715OooO0o = (C27715OooO0o) c27714OooO0Oo.f97750OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = str3;
            ConcurrentHashMap concurrentHashMap = c27715OooO0o.f97758OooO0Oo;
            objO0Oo0oo = concurrentHashMap.get(str);
            if (objO0Oo0oo != null) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                Set set2 = (Set) objO0Oo0oo;
                interfaceC33895OooO00o2.OooOOO0(null);
                return set2;
            }
            OooOO0O oooOO0O = c27715OooO0o.f97755OooO00o;
            c27714OooO0Oo.f97750OooOo0o = str;
            c27714OooO0Oo.f97749OooOo = interfaceC33895OooO00o;
            c27714OooO0Oo.f97752OooOoO0 = concurrentHashMap;
            c27714OooO0Oo.f97754OooOoo0 = 2;
            Object objOooO0Oo = oooOO0O.OooO0Oo(str, c27714OooO0Oo);
            if (objOooO0Oo != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                obj = objOooO0Oo;
                str2 = str;
                map = concurrentHashMap;
                objO0Oo0oo = OooOo.o0Oo0oo((Iterable) obj);
                map.put(str2, objO0Oo0oo);
                Set set22 = (Set) objO0Oo0oo;
                interfaceC33895OooO00o2.OooOOO0(null);
                return set22;
            }
            return enumC32485OooO00o;
        } catch (Throwable th2) {
            th = th2;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r7.OooO0O0(r6, r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27716OooO0o0 c27716OooO0o0;
        C27715OooO0o c27715OooO0o;
        if (abstractC32479OooO0OO instanceof C27716OooO0o0) {
            c27716OooO0o0 = (C27716OooO0o0) abstractC32479OooO0OO;
            int i = c27716OooO0o0.f97764OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27716OooO0o0.f97764OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27716OooO0o0 = new C27716OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27716OooO0o0.f97761OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27716OooO0o0.f97764OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27716OooO0o0.f97760OooOo0o = this;
            c27716OooO0o0.f97759OooOo = str;
            c27716OooO0o0.f97762OooOoO0 = str2;
            c27716OooO0o0.f97764OooOoo0 = 1;
            objOooO0Oo = OooO0Oo(str, c27716OooO0o0);
            if (objOooO0Oo != enumC32485OooO00o) {
                c27715OooO0o = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            return C32460OooOooO.f116667OooO00o;
        }
        str2 = c27716OooO0o0.f97762OooOoO0;
        str = c27716OooO0o0.f97759OooOo;
        c27715OooO0o = c27716OooO0o0.f97760OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        Set set = (Set) objOooO0Oo;
        if (!set.remove(str2)) {
            return C32460OooOooO.f116667OooO00o;
        }
        OooOO0O oooOO0O = c27715OooO0o.f97755OooO00o;
        c27716OooO0o0.f97760OooOo0o = null;
        c27716OooO0o0.f97759OooOo = null;
        c27716OooO0o0.f97762OooOoO0 = null;
        c27716OooO0o0.f97764OooOoo0 = 2;
    }
}
