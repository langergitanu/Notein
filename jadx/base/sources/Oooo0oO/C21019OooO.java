package Oooo0oO;

import Oooo0oO.C21082o00000oO;
import androidx.fragment.app.C21904OooOoo0;
import java.util.ArrayList;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: Oooo0oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21019OooO implements InterfaceC21078Ooooooo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21082o00000oO.C21084OooO0o0 f60871OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Throwable f60873OooOoO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f60870OooOo = new Object();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f60872OooOoO = new ArrayList();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ArrayList f60874OooOoOO = new ArrayList();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C21027OooO0oo f60875OooOoo0 = new C21027OooO0oo(0);

    /* JADX INFO: renamed from: Oooo0oO.OooO$OooO00o */
    public static final class OooO00o<R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC32507OooOO0o<Long, R> f60876OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C33614OooOOO0 f60877OooO0O0;

        public OooO00o(InterfaceC32507OooOO0o interfaceC32507OooOO0o, C33614OooOOO0 c33614OooOOO0) {
            this.f60876OooO00o = interfaceC32507OooOO0o;
            this.f60877OooO0O0 = c33614OooOOO0;
        }
    }

    public C21019OooO(C21082o00000oO.C21084OooO0o0 c21084OooO0o0) {
        this.f60871OooOo0o = c21084OooO0o0;
    }

    public final void OooO0O0(long j) {
        Object objOooO00o;
        synchronized (this.f60870OooOo) {
            try {
                ArrayList arrayList = this.f60872OooOoO;
                this.f60872OooOoO = this.f60874OooOoOO;
                this.f60874OooOoOO = arrayList;
                this.f60875OooOoo0.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    OooO00o oooO00o = (OooO00o) arrayList.get(i);
                    oooO00o.getClass();
                    try {
                        objOooO00o = oooO00o.f60876OooO00o.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    oooO00o.f60877OooO0O0.resumeWith(objOooO00o);
                }
                arrayList.clear();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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

    @Override // Oooo0oO.InterfaceC21078Ooooooo
    public final Object o00000oO(InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        c33614OooOOO0.OooOOoo();
        OooO00o oooO00o = new OooO00o(interfaceC32507OooOO0o, c33614OooOOO0);
        synchronized (this.f60870OooOo) {
            Throwable th = this.f60873OooOoO0;
            if (th != null) {
                c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(th));
            } else {
                boolean zIsEmpty = this.f60872OooOoO.isEmpty();
                this.f60872OooOoO.add(oooO00o);
                if (zIsEmpty) {
                    this.f60875OooOoo0.set(1);
                }
                c33614OooOOO0.OooOo0(new C21028OooOO0(this, oooO00o));
                if (zIsEmpty) {
                    try {
                        this.f60871OooOo0o.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f60870OooOo) {
                            try {
                                if (this.f60873OooOoO0 == null) {
                                    this.f60873OooOoO0 = th2;
                                    ArrayList arrayList = this.f60872OooOoO;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        ((OooO00o) arrayList.get(i)).f60877OooO0O0.resumeWith(C32446OooOOOo.OooO00o(th2));
                                    }
                                    this.f60872OooOoO.clear();
                                    this.f60875OooOoo0.set(0);
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }
}
