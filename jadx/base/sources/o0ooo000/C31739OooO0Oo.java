package o0ooo000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31435OooO0OO;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooOoo.InterfaceC31671OooO0OO;

/* JADX INFO: renamed from: o0ooo000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31739OooO0Oo implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC31745OooOO0O f113367OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113368OooOo0o;

    public C31739OooO0Oo() {
        this.f113368OooOo0o = new C31436OooO0Oo();
    }

    public final C31738OooO0OO OooO00o(C31441OooOO0 c31441OooOO0) {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113368OooOo0o.o0000O0O(C31441OooOO0.f112270OooooOo);
        if (!(abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo)) {
            return null;
        }
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = ((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O).o0000O0O(c31441OooOO0);
        if (!(abstractC31434OooO0O0O0000O0O2 instanceof C31436OooO0Oo)) {
            return null;
        }
        C31738OooO0OO c31738OooO0OO = new C31738OooO0OO();
        c31738OooO0OO.f113366OooOo0o = (C31436OooO0Oo) abstractC31434OooO0O0O0000O0O2;
        return c31738OooO0OO;
    }

    public final AbstractC31745OooOO0O OooO0O0() throws IOException {
        AbstractC31745OooOO0O abstractC31745OooOO0O = this.f113367OooOo;
        if (abstractC31745OooOO0O != null) {
            return abstractC31745OooOO0O;
        }
        throw new IOException("No security handler for filter " + this.f113368OooOo0o.o000OOO(C31441OooOO0.f112295o0000OOo));
    }

    public final int OooO0OO() {
        return this.f113368OooOo0o.o000O00O(C31441OooOO0.f112420o00OOOO0, null, 0);
    }

    public final boolean OooO0Oo() {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = this.f113368OooOo0o.o0000O0O(C31441OooOO0.f112289o0000O);
        if (abstractC31434OooO0O0O0000O0O instanceof C31435OooO0OO) {
            return ((C31435OooO0OO) abstractC31434OooO0O0O0000O0O).f112220OooOo;
        }
        return true;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113368OooOo0o;
    }

    public C31739OooO0Oo(C31436OooO0Oo c31436OooO0Oo) {
        AbstractC31745OooOO0O abstractC31745OooOO0O;
        this.f113368OooOo0o = c31436OooO0Oo;
        C31746OooOO0o c31746OooOO0o = C31746OooOO0o.f113381OooO0O0;
        Class cls = (Class) c31746OooOO0o.f113382OooO00o.get(c31436OooO0Oo.o000OOO(C31441OooOO0.f112295o0000OOo));
        if (cls == null) {
            abstractC31745OooOO0O = null;
        } else {
            try {
                abstractC31745OooOO0O = (AbstractC31745OooOO0O) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        this.f113367OooOo = abstractC31745OooOO0O;
    }
}
