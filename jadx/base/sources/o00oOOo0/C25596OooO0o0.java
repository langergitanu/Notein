package o00oOOo0;

import android.graphics.Bitmap;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24460OooOOoo;
import o00O00oO.OooOO0O;
import o00o0o.AbstractC25434OooO00o;
import o00oOOOO.C25585OooO00o;
import o00oOOOO.InterfaceC25586OooO0O0;
import o00oOOoO.C25599OooO0OO;
import o00oOo00.C25605OooO0o0;
import o00oOo00.C25606OooO0oO;
import o00oOo00.C25608OooOO0o;
import o00oOo00.OooO;
import o00oOo00.OooOO0;
import o00oOoo0.InterfaceC25626OooO00o;
import o00oOooO.C25631OooO00o;
import o00oo00O.C25647OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o00oOOo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25596OooO0o0 implements InterfaceC25592OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f87313OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f87314OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25631OooO00o f87315OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00oOo00.OooOO0O f87316OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f87317OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f87318OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f87319OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f87320OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOO0 f87321OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f87322OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C25595OooO0Oo f87323OooOO0O;

    public C25596OooO0o0(String str, OooOO0O oooOO0O, C25631OooO00o c25631OooO00o, o00oOo00.OooOO0O oooOO0O2, boolean z) {
        this.f87314OooO00o = oooOO0O;
        this.f87315OooO0O0 = c25631OooO00o;
        this.f87316OooO0OO = oooOO0O2;
        this.f87317OooO0Oo = z;
        this.f87319OooO0o0 = str == null ? String.valueOf(hashCode()) : str;
        this.f87318OooO0o = ((C25647OooO00o) ((InterfaceC25626OooO00o) oooOO0O.f84185OooO0O0)).f87537OooO0OO.getWidth();
        this.f87320OooO0oO = ((C25647OooO00o) ((InterfaceC25626OooO00o) oooOO0O.f84185OooO0O0)).f87537OooO0OO.getHeight();
        long millis = TimeUnit.SECONDS.toMillis(1L) / ((long) (oooOO0O.OooO0Oo() / oooOO0O.OooO0O0()));
        int i = (int) (millis >= 1 ? millis : 1L);
        this.f87313OooO = i;
        this.f87322OooOO0 = i;
        this.f87323OooOO0O = new C25595OooO0Oo(this);
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final AbstractC25434OooO00o<Bitmap> OooO00o(int i, int i2, int i3) {
        OooO0o oooO0oOooO0o0 = OooO0o0(i2, i3);
        OooOO0 oooOO0OooO0o = OooO0o();
        C25608OooOO0o c25608OooOO0oOooO0OO = oooOO0OooO0o != null ? oooOO0OooO0o.OooO0OO(i, oooO0oOooO0o0.f87311OooO00o, oooO0oOooO0o0.f87312OooO0O0) : null;
        if (c25608OooOO0oOooO0OO != null) {
            AtomicInteger atomicInteger = C25605OooO0o0.f87351OooO00o;
            C25595OooO0Oo animation = this.f87323OooOO0O;
            OooOOO0.OooO0oO(animation, "animation");
            ConcurrentHashMap<OooO, Integer> concurrentHashMap = C25605OooO0o0.f87354OooO0Oo;
            if (!concurrentHashMap.contains(animation)) {
                concurrentHashMap.put(animation, Integer.valueOf((int) (animation.f87309OooO00o * 0.2f)));
            }
            int iOrdinal = c25608OooOO0oOooO0OO.f87378OooO0O0.ordinal();
            if (iOrdinal == 0) {
                C25605OooO0o0.f87351OooO00o.incrementAndGet();
            } else if (iOrdinal == 1) {
                C25605OooO0o0.f87352OooO0O0.incrementAndGet();
            } else {
                if (iOrdinal != 2) {
                    throw new C32442OooOO0o();
                }
                C25605OooO0o0.f87353OooO0OO.incrementAndGet();
            }
        }
        if (c25608OooOO0oOooO0OO != null) {
            return c25608OooOO0oOooO0OO.f87377OooO00o;
        }
        return null;
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void OooO0O0() {
        OooOO0 oooOO0OooO0o = OooO0o();
        if (oooOO0OooO0o != null) {
            ConcurrentHashMap<String, o00oOo00.OooOOO0> concurrentHashMap = o00oOo00.OooOO0O.f87373OooO0Oo;
            String cacheKey = this.f87319OooO0o0;
            OooOOO0.OooO0oO(cacheKey, "cacheKey");
            o00oOo00.OooOO0O.f87373OooO0Oo.put(cacheKey, new o00oOo00.OooOOO0(oooOO0OooO0o, new Date()));
        }
        this.f87321OooO0oo = null;
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void OooO0OO(C25593OooO0O0 bitmapFramePreparer, InterfaceC25586OooO0O0 interfaceC25586OooO0O0, C25585OooO00o c25585OooO00o, int i) {
        OooOOO0.OooO0oO(bitmapFramePreparer, "bitmapFramePreparer");
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void OooO0Oo(int i, int i2) {
        if (i <= 0 || i2 <= 0 || this.f87318OooO0o <= 0 || this.f87320OooO0oO <= 0) {
            return;
        }
        OooO0o oooO0oOooO0o0 = OooO0o0(i, i2);
        OooOO0 oooOO0OooO0o = OooO0o();
        if (oooOO0OooO0o != null) {
            C24460OooOOoo c24460OooOOoo = new C24460OooOOoo(1);
            int i3 = oooO0oOooO0o0.f87311OooO00o;
            oooOO0OooO0o.OooO00o(i3, i3, c24460OooOOoo);
        }
    }

    public final OooOO0 OooO0o() {
        OooOO0 c25606OooO0oO;
        if (this.f87321OooO0oo == null) {
            o00oOo00.OooOO0O oooOO0O = this.f87316OooO0OO;
            String cacheKey = this.f87319OooO0o0;
            C25631OooO00o c25631OooO00o = this.f87315OooO0O0;
            OooOO0O oooOO0O2 = this.f87314OooO00o;
            OooOOO0.OooO0oO(cacheKey, "cacheKey");
            ConcurrentHashMap<String, o00oOo00.OooOOO0> concurrentHashMap = o00oOo00.OooOO0O.f87373OooO0Oo;
            synchronized (concurrentHashMap) {
                o00oOo00.OooOOO0 oooOOO0 = concurrentHashMap.get(cacheKey);
                if (oooOOO0 != null) {
                    concurrentHashMap.remove(cacheKey);
                    c25606OooO0oO = oooOOO0.f87383OooO00o;
                } else {
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    c25606OooO0oO = new C25606OooO0oO(oooOO0O.f87374OooO00o, c25631OooO00o, new C25599OooO0OO(oooOO0O.f87375OooO0O0), oooOO0O2, oooOO0O.f87376OooO0OO);
                }
            }
            this.f87321OooO0oo = c25606OooO0oO;
        }
        return this.f87321OooO0oo;
    }

    public final OooO0o OooO0o0(int i, int i2) {
        boolean z = this.f87317OooO0Oo;
        int i3 = this.f87320OooO0oO;
        int i4 = this.f87318OooO0o;
        if (!z) {
            return new OooO0o(i4, i3);
        }
        if (i < i4 || i2 < i3) {
            double d = ((double) i4) / ((double) i3);
            if (i2 > i) {
                if (i2 > i3) {
                    i2 = i3;
                }
                i4 = (int) (((double) i2) * d);
                i3 = i2;
            } else {
                if (i > i4) {
                    i = i4;
                }
                i3 = (int) (((double) i) / d);
                i4 = i;
            }
        }
        return new OooO0o(i4, i3);
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void onStop() {
        OooO0o();
        OooO0O0();
    }
}
