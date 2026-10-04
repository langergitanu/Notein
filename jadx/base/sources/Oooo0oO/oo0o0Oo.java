package Oooo0oO;

import OooOoo0.C20675Oooo;
import androidx.fragment.app.C21904OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo implements InterfaceC21078Ooooooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C21074OooooOo f61268OooOo = new C21074OooooOo();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC21078Ooooooo f61269OooOo0o;

    public oo0o0Oo(InterfaceC21078Ooooooo interfaceC21078Ooooooo) {
        this.f61269OooOo0o = interfaceC21078Ooooooo;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Oooo0oO.InterfaceC21078Ooooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000oO(InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o0OO00O o0oo00o2;
        boolean z;
        Object objOooOOo;
        oo0o0Oo oo0o0oo;
        if (abstractC32479OooO0OO instanceof o0OO00O) {
            o0oo00o2 = (o0OO00O) abstractC32479OooO0OO;
            int i = o0oo00o2.f61262OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo00o2.f61262OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o0oo00o2 = new o0OO00O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0oo00o2.f61261OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oo00o2.f61262OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C21074OooooOo c21074OooooOo = this.f61268OooOo;
            o0oo00o2.f61259OooOo0o = this;
            o0oo00o2.f61258OooOo = interfaceC32507OooOO0o;
            o0oo00o2.f61262OooOoOO = 1;
            synchronized (c21074OooooOo.f61040OooO00o) {
                z = c21074OooooOo.f61043OooO0Oo;
            }
            if (z) {
                objOooOOo = C32460OooOooO.f116667OooO00o;
            } else {
                C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(o0oo00o2));
                c33614OooOOO0.OooOOoo();
                synchronized (c21074OooooOo.f61040OooO00o) {
                    c21074OooooOo.f61041OooO0O0.add(c33614OooOOO0);
                }
                c33614OooOOO0.OooOo0(new C20675Oooo(1, c21074OooooOo, c33614OooOOO0));
                objOooOOo = c33614OooOOO0.OooOOo();
                if (objOooOOo != enumC32485OooO00o) {
                    objOooOOo = C32460OooOooO.f116667OooO00o;
                }
            }
            if (objOooOOo != enumC32485OooO00o) {
                oo0o0oo = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        interfaceC32507OooOO0o = o0oo00o2.f61258OooOo;
        oo0o0oo = o0oo00o2.f61259OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC21078Ooooooo interfaceC21078Ooooooo = oo0o0oo.f61269OooOo0o;
        o0oo00o2.f61259OooOo0o = null;
        o0oo00o2.f61258OooOo = null;
        o0oo00o2.f61262OooOoOO = 2;
        Object objO00000oO = interfaceC21078Ooooooo.o00000oO(interfaceC32507OooOO0o, o0oo00o2);
        return objO00000oO == enumC32485OooO00o ? enumC32485OooO00o : objO00000oO;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }
}
