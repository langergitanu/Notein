package OoooOOo;

import Oooo0oO.o000O0O;
import OoooOOo.C21200OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OoooOOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21194OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C21196OooOO0 f61473OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f61474OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f61475OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f61476OooO0Oo;

    /* JADX INFO: renamed from: OoooOOo.OooO0oO$OooO00o */
    public static final class OooO00o {
        public static Object OooO00o(oO0O000o.OooO00o oooO00o, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            AbstractC21194OooO0oO c21226Oooo0oO;
            if (interfaceC32507OooOO0o == null) {
                return oooO00o.invoke();
            }
            AbstractC21194OooO0oO abstractC21194OooO0oO = (AbstractC21194OooO0oO) C21200OooOOO0.f61495OooO0O0.OooO0o0();
            if (abstractC21194OooO0oO instanceof C21226Oooo0oO) {
                C21226Oooo0oO c21226Oooo0oO2 = (C21226Oooo0oO) abstractC21194OooO0oO;
                if (c21226Oooo0oO2.f61581OooOo00 == Thread.currentThread().getId()) {
                    InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o2 = c21226Oooo0oO2.f61578OooOOo;
                    InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o3 = c21226Oooo0oO2.f61580OooOOoo;
                    try {
                        ((C21226Oooo0oO) abstractC21194OooO0oO).f61578OooOOo = C21200OooOOO0.OooOO0o(interfaceC32507OooOO0o, interfaceC32507OooOO0o2, true);
                        ((C21226Oooo0oO) abstractC21194OooO0oO).f61580OooOOoo = interfaceC32507OooOO0o3;
                        return oooO00o.invoke();
                    } finally {
                        c21226Oooo0oO2.f61578OooOOo = interfaceC32507OooOO0o2;
                        c21226Oooo0oO2.f61580OooOOoo = interfaceC32507OooOO0o3;
                    }
                }
            }
            if (abstractC21194OooO0oO == null || (abstractC21194OooO0oO instanceof C21189OooO0O0)) {
                c21226Oooo0oO = new C21226Oooo0oO(abstractC21194OooO0oO instanceof C21189OooO0O0 ? (C21189OooO0O0) abstractC21194OooO0oO : null, interfaceC32507OooOO0o, null, true, false);
            } else {
                if (interfaceC32507OooOO0o == null) {
                    return oooO00o.invoke();
                }
                c21226Oooo0oO = abstractC21194OooO0oO.OooOo00(interfaceC32507OooOO0o);
            }
            try {
                AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0 = c21226Oooo0oO.OooOO0();
                try {
                    Object objInvoke = oooO00o.invoke();
                    AbstractC21194OooO0oO.OooOOOo(abstractC21194OooO0oOOooOO0);
                    return objInvoke;
                } catch (Throwable th) {
                    AbstractC21194OooO0oO.OooOOOo(abstractC21194OooO0oOOooOO0);
                    throw th;
                }
            } finally {
                c21226Oooo0oO.OooO0OO();
            }
        }
    }

    public AbstractC21194OooO0oO(int i, C21196OooOO0 c21196OooOO0) {
        int iOooO00o;
        int iNumberOfTrailingZeros;
        this.f61473OooO00o = c21196OooOO0;
        this.f61474OooO0O0 = i;
        if (i != 0) {
            C21196OooOO0 c21196OooOO0OooO0o0 = OooO0o0();
            C21200OooOOO0.OooO00o oooO00o = C21200OooOOO0.f61494OooO00o;
            int[] iArr = c21196OooOO0OooO0o0.f61481OooOoO;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = c21196OooOO0OooO0o0.f61479OooOo;
                int i2 = c21196OooOO0OooO0o0.f61482OooOoO0;
                if (j != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                } else {
                    long j2 = c21196OooOO0OooO0o0.f61480OooOo0o;
                    if (j2 != 0) {
                        i2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
                    }
                }
                i = iNumberOfTrailingZeros + i2;
            }
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                iOooO00o = C21200OooOOO0.f61498OooO0o.OooO00o(i);
            }
        } else {
            iOooO00o = -1;
        }
        this.f61476OooO0Oo = iOooO00o;
    }

    public static void OooOOOo(AbstractC21194OooO0oO abstractC21194OooO0oO) {
        C21200OooOOO0.f61495OooO0O0.OooO0o(abstractC21194OooO0oO);
    }

    public abstract InterfaceC32507OooOO0o<Object, C32460OooOooO> OooO();

    public final void OooO00o() {
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            OooO0O0();
            OooOOOO();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public void OooO0O0() {
        C21200OooOOO0.f61497OooO0Oo = C21200OooOOO0.f61497OooO0Oo.OooO0Oo(OooO0Oo());
    }

    public void OooO0OO() {
        this.f61475OooO0OO = true;
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            int i = this.f61476OooO0Oo;
            if (i >= 0) {
                C21200OooOOO0.OooOo0(i);
                this.f61476OooO0Oo = -1;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public int OooO0Oo() {
        return this.f61474OooO0O0;
    }

    public abstract InterfaceC32507OooOO0o<Object, C32460OooOooO> OooO0o();

    public C21196OooOO0 OooO0o0() {
        return this.f61473OooO00o;
    }

    public abstract boolean OooO0oO();

    public int OooO0oo() {
        return 0;
    }

    public final AbstractC21194OooO0oO OooOO0() {
        o000O0O o000o0o2 = C21200OooOOO0.f61495OooO0O0;
        AbstractC21194OooO0oO abstractC21194OooO0oO = (AbstractC21194OooO0oO) o000o0o2.OooO0o0();
        o000o0o2.OooO0o(this);
        return abstractC21194OooO0oO;
    }

    public abstract void OooOO0O();

    public abstract void OooOO0o();

    public abstract void OooOOO(InterfaceC21222Oooo0O0 interfaceC21222Oooo0O0);

    public abstract void OooOOO0();

    public void OooOOOO() {
        int i = this.f61476OooO0Oo;
        if (i >= 0) {
            C21200OooOOO0.OooOo0(i);
            this.f61476OooO0Oo = -1;
        }
    }

    public void OooOOo(C21196OooOO0 c21196OooOO0) {
        this.f61473OooO00o = c21196OooOO0;
    }

    public void OooOOo0(int i) {
        this.f61474OooO0O0 = i;
    }

    public void OooOOoo(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC21194OooO0oO OooOo00(InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o);
}
