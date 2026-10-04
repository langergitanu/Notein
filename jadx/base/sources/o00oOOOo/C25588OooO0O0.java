package o00oOOOo;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o00.C25438OooO00o;
import o00oOOOO.InterfaceC25586OooO0O0;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.InterfaceC25637OooO0o0;
import o00oo.OooO0o;
import o00oo.OooOO0O;
import o00oo00O.C25649OooO0OO;

/* JADX INFO: renamed from: o00oOOOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25588OooO0O0 implements InterfaceC25586OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25649OooO0OO f87287OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f87288OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseArray<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> f87289OooO0OO = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AbstractC25434OooO00o<InterfaceC25636OooO0Oo> f87290OooO0Oo;

    /* JADX INFO: renamed from: o00oOOOo.OooO0O0$OooO00o */
    public static final class OooO00o {
        public static AbstractC25434OooO00o OooO00o(AbstractC25434OooO00o abstractC25434OooO00o) {
            try {
                if (AbstractC25434OooO00o.ooOO(abstractC25434OooO00o)) {
                    OooOOO0.OooO0Oo(abstractC25434OooO00o);
                    if (abstractC25434OooO00o.Oooo000() instanceof InterfaceC25637OooO0o0) {
                        AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oOooOo00 = ((InterfaceC25637OooO0o0) abstractC25434OooO00o.Oooo000()).OooOo00();
                        abstractC25434OooO00o.close();
                        return abstractC25434OooO00oOooOo00;
                    }
                }
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
                return null;
            } catch (Throwable th) {
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
                throw th;
            }
        }
    }

    public C25588OooO0O0(C25649OooO0OO c25649OooO0OO, boolean z) {
        this.f87287OooO00o = c25649OooO0OO;
        this.f87288OooO0O0 = z;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized AbstractC25434OooO00o OooO00o() {
        return OooO00o.OooO00o(AbstractC25434OooO00o.OooOOO0(this.f87290OooO0Oo));
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized AbstractC25434OooO00o OooO0O0() {
        InterfaceC25397OooO00o next;
        AbstractC25434OooO00o abstractC25434OooO00o = null;
        if (!this.f87288OooO0O0) {
            return null;
        }
        C25649OooO0OO c25649OooO0OO = this.f87287OooO00o;
        while (true) {
            synchronized (c25649OooO0OO) {
                Iterator<InterfaceC25397OooO00o> it = c25649OooO0OO.f87550OooO0Oo.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    it.remove();
                } else {
                    next = null;
                }
            }
            if (next == null) {
                break;
            }
            AbstractC25434OooO00o abstractC25434OooO00oOooO00o = c25649OooO0OO.f87548OooO0O0.OooO00o(next);
            if (abstractC25434OooO00oOooO00o != null) {
                abstractC25434OooO00o = abstractC25434OooO00oOooO00o;
                break;
            }
        }
        return OooO00o.OooO00o(abstractC25434OooO00o);
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized void OooO0OO(int i, AbstractC25434OooO00o bitmapReference) {
        C25435OooO0O0 c25435OooO0O0O00Oo0;
        OooOOO0.OooO0oO(bitmapReference, "bitmapReference");
        OooO0oO(i);
        try {
            OooOO0O oooOO0O = OooOO0O.f87512OooO0Oo;
            int i2 = OooO0o.f87495OooOooo;
            c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(new OooO0o(bitmapReference, oooOO0O, 0, 0));
            if (c25435OooO0O0O00Oo0 != null) {
                try {
                    AbstractC25434OooO00o.OooOooo(this.f87290OooO0Oo);
                    C25649OooO0OO c25649OooO0OO = this.f87287OooO00o;
                    this.f87290OooO0Oo = c25649OooO0OO.f87548OooO0O0.OooO0OO(new C25649OooO0OO.OooO00o(c25649OooO0OO.f87547OooO00o, i), c25435OooO0O0O00Oo0, c25649OooO0OO.f87549OooO0OO);
                } catch (Throwable th) {
                    th = th;
                    AbstractC25434OooO00o.OooOooo(c25435OooO0O0O00Oo0);
                    throw th;
                }
            }
            AbstractC25434OooO00o.OooOooo(c25435OooO0O0O00Oo0);
        } catch (Throwable th2) {
            th = th2;
            c25435OooO0O0O00Oo0 = null;
        }
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized boolean OooO0Oo(int i) {
        C25649OooO0OO c25649OooO0OO;
        c25649OooO0OO = this.f87287OooO00o;
        return c25649OooO0OO.f87548OooO0O0.OooO0O0(new C25649OooO0OO.OooO00o(c25649OooO0OO.f87547OooO00o, i));
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized AbstractC25434OooO00o<Bitmap> OooO0o(int i) {
        C25649OooO0OO c25649OooO0OO;
        c25649OooO0OO = this.f87287OooO00o;
        return OooO00o.OooO00o(c25649OooO0OO.f87548OooO0O0.get(new C25649OooO0OO.OooO00o(c25649OooO0OO.f87547OooO00o, i)));
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized void OooO0o0(int i, AbstractC25434OooO00o bitmapReference) {
        C25435OooO0O0 c25435OooO0O0O00Oo0;
        OooOOO0.OooO0oO(bitmapReference, "bitmapReference");
        try {
            OooOO0O oooOO0O = OooOO0O.f87512OooO0Oo;
            int i2 = OooO0o.f87495OooOooo;
            c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(new OooO0o(bitmapReference, oooOO0O, 0, 0));
            if (c25435OooO0O0O00Oo0 == null) {
                AbstractC25434OooO00o.OooOooo(c25435OooO0O0O00Oo0);
                return;
            }
            try {
                C25649OooO0OO c25649OooO0OO = this.f87287OooO00o;
                C25435OooO0O0 c25435OooO0O0OooO0OO = c25649OooO0OO.f87548OooO0O0.OooO0OO(new C25649OooO0OO.OooO00o(c25649OooO0OO.f87547OooO00o, i), c25435OooO0O0O00Oo0, c25649OooO0OO.f87549OooO0OO);
                if (AbstractC25434OooO00o.ooOO(c25435OooO0O0OooO0OO)) {
                    AbstractC25434OooO00o.OooOooo(this.f87289OooO0OO.get(i));
                    this.f87289OooO0OO.put(i, c25435OooO0O0OooO0OO);
                    C25438OooO00o.OooO0o0(C25588OooO0O0.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.f87289OooO0OO);
                }
                c25435OooO0O0O00Oo0.close();
            } catch (Throwable th) {
                th = th;
                AbstractC25434OooO00o.OooOooo(c25435OooO0O0O00Oo0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c25435OooO0O0O00Oo0 = null;
        }
    }

    public final synchronized void OooO0oO(int i) {
        AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o = this.f87289OooO0OO.get(i);
        if (abstractC25434OooO00o != null) {
            this.f87289OooO0OO.delete(i);
            abstractC25434OooO00o.close();
            C25438OooO00o.OooO0o0(C25588OooO0O0.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.f87289OooO0OO);
        }
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized void clear() {
        try {
            AbstractC25434OooO00o.OooOooo(this.f87290OooO0Oo);
            this.f87290OooO0Oo = null;
            int size = this.f87289OooO0OO.size();
            for (int i = 0; i < size; i++) {
                AbstractC25434OooO00o.OooOooo(this.f87289OooO0OO.valueAt(i));
            }
            this.f87289OooO0OO.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
