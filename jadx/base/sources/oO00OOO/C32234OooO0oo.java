package oO00OOO;

import OoooOoO.C21236OooO0oo;
import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000ooo.C24746OooO00o;
import o00OooO0.C25150OooO00o;
import o00o00O0.C25252OooO0Oo;
import oO00O0o0.C32183OooO0Oo;
import oO00O0oO.C32214OooO0Oo;
import oO00OO.C32230OooO0oO;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33724OooO0oo;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33909OooO00o;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: renamed from: oO00OOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32234OooO0oo implements oO00OO.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC34457OooO0OO f115754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f115755OooO0O0;

    public C32234OooO0oo(AbstractC34457OooO0OO abstractC34457OooO0OO) {
        this.f115754OooO00o = abstractC34457OooO0OO;
        List<OooOO0> list = OooO00o.f115709OooO00o;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            oO00OOOo.OooO oooOOooO00o = ((OooOO0) it.next()).OooO00o(abstractC34457OooO0OO);
            if (oooOOooO00o != null) {
                arrayList.add(oooOOooO00o);
            }
        }
        this.f115755OooO0O0 = arrayList;
        boolean z = this.f115754OooO00o instanceof InterfaceC33909OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO00OO.OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Charset charset, oOOoOoOO.OooO00o oooO00o, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IllegalAccessException, C32230OooO0oO, InvocationTargetException {
        OooO0OO oooO0OO;
        C32234OooO0oo c32234OooO0oo;
        Charset charset2;
        InterfaceC33911OooO0OO interfaceC33911OooO0OO;
        C32234OooO0oo c32234OooO0oo2;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f115727OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f115727OooOoo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOo0 = oooO0OO.f115726OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f115727OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0);
            OooO0O0 oooO0O0 = new OooO0O0(new C33724OooO0oo(this.f115755OooO0O0), charset, oooO00o, interfaceC23986Ooooo0o);
            C32231OooO0Oo c32231OooO0Oo = new C32231OooO0Oo(interfaceC23986Ooooo0o, null);
            oooO0OO.f115723OooOo0o = this;
            oooO0OO.f115722OooOo = charset;
            oooO0OO.f115725OooOoO0 = oooO00o;
            oooO0OO.f115724OooOoO = interfaceC23986Ooooo0o;
            oooO0OO.f115727OooOoo = 1;
            objOooOo0 = C25252OooO0Oo.OooOo0(oooO0O0, c32231OooO0Oo, oooO0OO);
            if (objOooOo0 != enumC32485OooO00o) {
                c32234OooO0oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33911OooO0OO = (InterfaceC33911OooO0OO) oooO0OO.f115725OooOoO0;
            charset2 = oooO0OO.f115722OooOo;
            c32234OooO0oo2 = oooO0OO.f115723OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo0);
            try {
                return c32234OooO0oo2.f115754OooO00o.OooO0O0(C25150OooO00o.OooO0oo((C32266OooO0Oo) objOooOo0, charset2), interfaceC33911OooO0OO);
            } catch (Throwable th) {
                throw new C32230OooO0oO("Illegal input: " + th.getMessage(), th);
            }
        }
        interfaceC23986Ooooo0o = oooO0OO.f115724OooOoO;
        oooO00o = (oOOoOoOO.OooO00o) oooO0OO.f115725OooOoO0;
        charset = oooO0OO.f115722OooOo;
        c32234OooO0oo = oooO0OO.f115723OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOo0);
        if (objOooOo0 != null || interfaceC23986Ooooo0o.OooOoo()) {
            return objOooOo0;
        }
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0Oo = C21236OooO0oo.OooO0Oo(c32234OooO0oo.f115754OooO00o.f123492OooO0O0, oooO00o);
        oooO0OO.f115723OooOo0o = c32234OooO0oo;
        oooO0OO.f115722OooOo = charset;
        oooO0OO.f115725OooOoO0 = interfaceC33911OooO0OOOooO0Oo;
        oooO0OO.f115724OooOoO = null;
        oooO0OO.f115727OooOoo = 2;
        objOooOo0 = interfaceC23986Ooooo0o.OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, oooO0OO);
        if (objOooOo0 != enumC32485OooO00o) {
            charset2 = charset;
            interfaceC33911OooO0OO = interfaceC33911OooO0OOOooO0Oo;
            c32234OooO0oo2 = c32234OooO0oo;
            return c32234OooO0oo2.f115754OooO00o.OooO0O0(C25150OooO00o.OooO0oo((C32266OooO0Oo) objOooOo0, charset2), interfaceC33911OooO0OO);
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(C32183OooO0Oo c32183OooO0Oo, Charset charset, oOOoOoOO.OooO00o oooO00o, Object obj, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IllegalAccessException, InvocationTargetException {
        OooO0o oooO0o;
        C32234OooO0oo c32234OooO0oo;
        C32183OooO0Oo c32183OooO0Oo2;
        Charset charset2;
        oOOoOoOO.OooO00o oooO00o2;
        Object obj2;
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0OO;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f115738OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f115738OooOooO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOo0 = oooO0o.f115737OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f115738OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0);
            C32232OooO0o0 c32232OooO0o0 = new C32232OooO0o0(new C33724OooO0oo(this.f115755OooO0O0), c32183OooO0Oo, charset, oooO00o, obj);
            C32233OooO0oO c32233OooO0oO = new C32233OooO0oO(2, null);
            oooO0o.f115732OooOo0o = this;
            oooO0o.f115731OooOo = c32183OooO0Oo;
            oooO0o.f115734OooOoO0 = charset;
            oooO0o.f115733OooOoO = oooO00o;
            oooO0o.f115735OooOoOO = obj;
            oooO0o.f115738OooOooO = 1;
            objOooOo0 = C25252OooO0Oo.OooOo0(c32232OooO0o0, c32233OooO0oO, oooO0o);
            if (objOooOo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c32234OooO0oo = this;
            c32183OooO0Oo2 = c32183OooO0Oo;
            charset2 = charset;
            oooO00o2 = oooO00o;
            obj2 = obj;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = oooO0o.f115735OooOoOO;
            oooO00o2 = oooO0o.f115733OooOoO;
            charset2 = oooO0o.f115734OooOoO0;
            c32183OooO0Oo2 = oooO0o.f115731OooOo;
            c32234OooO0oo = oooO0o.f115732OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo0);
        }
        oO00O0oO.OooO0OO oooO0OO = (oO00O0oO.OooO0OO) objOooOo0;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        try {
            interfaceC33911OooO0OOOooO0OO = C21236OooO0oo.OooO0Oo(c32234OooO0oo.f115754OooO00o.f123492OooO0O0, oooO00o2);
        } catch (C33917OooOO0 unused) {
            interfaceC33911OooO0OOOooO0OO = C21236OooO0oo.OooO0OO(obj2, c32234OooO0oo.f115754OooO00o.f123492OooO0O0);
        }
        return new C32214OooO0Oo(c32234OooO0oo.f115754OooO00o.OooO00o(interfaceC33911OooO0OOOooO0OO, obj2), C24746OooO00o.OooO0oo(c32183OooO0Oo2, charset2));
    }
}
