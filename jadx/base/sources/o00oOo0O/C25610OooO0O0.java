package o00oOo0O;

import Ooooo00.C21246OooO0OO;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import kotlin.jvm.internal.OooOOO0;
import o00o0o00.C25438OooO00o;
import o00o0ooo.InterfaceC25472OooO00o;
import o00oO0O0.C25554OooO0o0;
import o00oOOO0.C25583OooO0OO;
import o00oOOO0.InterfaceC25581OooO00o;
import o00oOOOO.C25585OooO00o;
import o00oOoO0.C25616OooO00o;
import o00oOooO.C25631OooO00o;
import o00oo00O.C25647OooO00o;
import o00oo00O.C25650OooO0Oo;

/* JADX INFO: renamed from: o00oOo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25610OooO0O0 extends Drawable implements Animatable, InterfaceC25472OooO00o {

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final C21246OooO0OO f87386Oooo0o0 = new C21246OooO0OO();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25616OooO00o f87387OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C25583OooO0OO f87388OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f87389OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile boolean f87390OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f87391OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f87392OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f87393OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f87394OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f87395OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public volatile C21246OooO0OO f87396Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f87397Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final long f87398Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f87399Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C25554OooO0o0 f87400Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final RunnableC25609OooO00o f87401Oooo0OO;

    public C25610OooO0O0() {
        this(null);
    }

    @Override // o00o0ooo.InterfaceC25472OooO00o
    public final void OooO00o() {
        C25585OooO00o c25585OooO00o;
        C25583OooO0OO c25583OooO0OO = this.f87388OooOo0o;
        if (c25583OooO0OO == null || (c25585OooO00o = (C25585OooO00o) c25583OooO0OO.f87265OooO0O0) == null) {
            return;
        }
        c25585OooO00o.OooO0Oo();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) throws Throwable {
        long j;
        OooOOO0.OooO0oO(canvas, "canvas");
        if (this.f87388OooOo0o == null || this.f87387OooOo == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMax = this.f87390OooOoO0 ? jUptimeMillis - this.f87389OooOoO : (long) Math.max(this.f87391OooOoOO, 0.0d);
        C25616OooO00o c25616OooO00o = this.f87387OooOo;
        OooOOO0.OooO0Oo(c25616OooO00o);
        long jOooO00o = c25616OooO00o.OooO00o();
        int iOooO0O0 = 0;
        InterfaceC25581OooO00o interfaceC25581OooO00o = c25616OooO00o.f87414OooO00o;
        if (jOooO00o == 0) {
            long jOooO0OO = 0;
            while (true) {
                jOooO0OO += (long) interfaceC25581OooO00o.OooO0OO(iOooO0O0);
                int i = iOooO0O0 + 1;
                if (0 < jOooO0OO) {
                    break;
                } else {
                    iOooO0O0 = i;
                }
            }
        } else if (interfaceC25581OooO00o.OooO00o() != 0 && jMax / jOooO00o >= interfaceC25581OooO00o.OooO00o()) {
            iOooO0O0 = -1;
        } else {
            long j2 = jMax % jOooO00o;
            long jOooO0OO2 = 0;
            while (true) {
                jOooO0OO2 += (long) interfaceC25581OooO00o.OooO0OO(iOooO0O0);
                int i2 = iOooO0O0 + 1;
                if (j2 < jOooO0OO2) {
                    break;
                } else {
                    iOooO0O0 = i2;
                }
            }
        }
        if (iOooO0O0 == -1) {
            C25583OooO0OO c25583OooO0OO = this.f87388OooOo0o;
            OooOOO0.OooO0Oo(c25583OooO0OO);
            iOooO0O0 = c25583OooO0OO.OooO0O0() - 1;
            this.f87396Oooo0.getClass();
            this.f87390OooOoO0 = false;
        } else if (iOooO0O0 == 0 && this.f87392OooOoo != -1 && jUptimeMillis >= this.f87393OooOoo0) {
            this.f87396Oooo0.getClass();
        }
        C25583OooO0OO c25583OooO0OO2 = this.f87388OooOo0o;
        OooOOO0.OooO0Oo(c25583OooO0OO2);
        boolean zOooO0o0 = c25583OooO0OO2.OooO0o0(this, canvas, iOooO0O0);
        if (zOooO0o0) {
            this.f87396Oooo0.getClass();
            this.f87392OooOoo = iOooO0O0;
        }
        if (!zOooO0o0) {
            this.f87399Oooo00o++;
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25438OooO00o.OooO0Oo(C25610OooO0O0.class, Integer.valueOf(this.f87399Oooo00o), "Dropped a frame. Count: %s");
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.f87390OooOoO0) {
            C25616OooO00o c25616OooO00o2 = this.f87387OooOo;
            OooOOO0.OooO0Oo(c25616OooO00o2);
            long j3 = jUptimeMillis2 - this.f87389OooOoO;
            long jOooO00o2 = c25616OooO00o2.OooO00o();
            if (jOooO00o2 == 0) {
                j = -1;
                if (j == -1) {
                    long j4 = this.f87389OooOoO + j + this.f87398Oooo00O;
                    this.f87393OooOoo0 = j4;
                    scheduleSelf(this.f87401Oooo0OO, j4);
                } else {
                    this.f87396Oooo0.getClass();
                    this.f87390OooOoO0 = false;
                }
            } else {
                InterfaceC25581OooO00o interfaceC25581OooO00o2 = c25616OooO00o2.f87414OooO00o;
                if ((interfaceC25581OooO00o2.OooO00o() == 0) || j3 / jOooO00o2 < interfaceC25581OooO00o2.OooO00o()) {
                    long j5 = j3 % jOooO00o2;
                    int iOooO0O02 = interfaceC25581OooO00o2.OooO0O0();
                    long jOooO0OO3 = 0;
                    for (int i3 = 0; i3 < iOooO0O02 && jOooO0OO3 <= j5; i3++) {
                        jOooO0OO3 += (long) interfaceC25581OooO00o2.OooO0OO(i3);
                    }
                    j = j3 + (jOooO0OO3 - j5);
                }
                if (j == -1) {
                }
            }
        }
        this.f87391OooOoOO = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C25583OooO0OO c25583OooO0OO = this.f87388OooOo0o;
        if (c25583OooO0OO == null) {
            return super.getIntrinsicHeight();
        }
        C25585OooO00o c25585OooO00o = (C25585OooO00o) c25583OooO0OO.f87265OooO0O0;
        if (c25585OooO00o == null) {
            return -1;
        }
        return c25585OooO00o.f87284OooOOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C25583OooO0OO c25583OooO0OO = this.f87388OooOo0o;
        if (c25583OooO0OO == null) {
            return super.getIntrinsicWidth();
        }
        C25585OooO00o c25585OooO00o = (C25585OooO00o) c25583OooO0OO.f87265OooO0O0;
        if (c25585OooO00o == null) {
            return -1;
        }
        return c25585OooO00o.f87283OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f87390OooOoO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        C25585OooO00o c25585OooO00o;
        OooOOO0.OooO0oO(bounds, "bounds");
        super.onBoundsChange(bounds);
        C25583OooO0OO c25583OooO0OO = this.f87388OooOo0o;
        if (c25583OooO0OO == null || (c25585OooO00o = (C25585OooO00o) c25583OooO0OO.f87265OooO0O0) == null) {
            return;
        }
        c25585OooO00o.f87282OooOO0O = bounds;
        C25631OooO00o c25631OooO00o = c25585OooO00o.f87278OooO0o0;
        C25647OooO00o c25647OooO00o = (C25647OooO00o) c25631OooO00o.f87483OooO0O0;
        if (!C25647OooO00o.OooO00o(c25647OooO00o.f87537OooO0OO, bounds).equals(c25647OooO00o.f87538OooO0Oo)) {
            c25647OooO00o = new C25647OooO00o(c25647OooO00o.f87535OooO00o, c25647OooO00o.f87536OooO0O0, bounds, c25647OooO00o.f87543OooOO0);
        }
        if (c25647OooO00o != c25631OooO00o.f87483OooO0O0) {
            c25631OooO00o.f87483OooO0O0 = c25647OooO00o;
            c25631OooO00o.f87485OooO0Oo = new C25650OooO0Oo(c25647OooO00o, c25631OooO00o.f87484OooO0OO, c25631OooO00o.f87486OooO0o0);
        }
        c25585OooO00o.OooO0oO();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.f87390OooOoO0) {
            return false;
        }
        long j = i;
        if (this.f87391OooOoOO == j) {
            return false;
        }
        this.f87391OooOoOO = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C25585OooO00o c25585OooO00o;
        if (this.f87400Oooo0O0 == null) {
            this.f87400Oooo0O0 = new C25554OooO0o0();
        }
        C25554OooO0o0 c25554OooO0o0 = this.f87400Oooo0O0;
        OooOOO0.OooO0Oo(c25554OooO0o0);
        c25554OooO0o0.f87152OooO00o = i;
        C25583OooO0OO c25583OooO0OO = this.f87388OooOo0o;
        if (c25583OooO0OO == null || (c25585OooO00o = (C25585OooO00o) c25583OooO0OO.f87265OooO0O0) == null) {
            return;
        }
        c25585OooO00o.f87281OooOO0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C25585OooO00o c25585OooO00o;
        if (this.f87400Oooo0O0 == null) {
            this.f87400Oooo0O0 = new C25554OooO0o0();
        }
        C25554OooO0o0 c25554OooO0o0 = this.f87400Oooo0O0;
        OooOOO0.OooO0Oo(c25554OooO0o0);
        c25554OooO0o0.f87154OooO0OO = colorFilter;
        c25554OooO0o0.f87153OooO0O0 = colorFilter != null;
        C25583OooO0OO c25583OooO0OO = this.f87388OooOo0o;
        if (c25583OooO0OO == null || (c25585OooO00o = (C25585OooO00o) c25583OooO0OO.f87265OooO0O0) == null) {
            return;
        }
        c25585OooO00o.f87281OooOO0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        C25583OooO0OO c25583OooO0OO;
        if (this.f87390OooOoO0 || (c25583OooO0OO = this.f87388OooOo0o) == null || c25583OooO0OO.OooO0O0() <= 1) {
            return;
        }
        this.f87390OooOoO0 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.f87394OooOooO;
        this.f87389OooOoO = j;
        this.f87393OooOoo0 = j;
        this.f87391OooOoOO = jUptimeMillis - this.f87395OooOooo;
        this.f87392OooOoo = this.f87397Oooo000;
        invalidateSelf();
        this.f87396Oooo0.getClass();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f87390OooOoO0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f87394OooOooO = jUptimeMillis - this.f87389OooOoO;
            this.f87395OooOooo = jUptimeMillis - this.f87391OooOoOO;
            this.f87397Oooo000 = this.f87392OooOoo;
            this.f87390OooOoO0 = false;
            this.f87389OooOoO = 0L;
            this.f87393OooOoo0 = 0L;
            this.f87391OooOoOO = -1L;
            this.f87392OooOoo = -1;
            unscheduleSelf(this.f87401Oooo0OO);
            this.f87396Oooo0.getClass();
        }
    }

    public C25610OooO0O0(C25583OooO0OO c25583OooO0OO) {
        this.f87388OooOo0o = c25583OooO0OO;
        this.f87398Oooo00O = 8L;
        this.f87396Oooo0 = f87386Oooo0o0;
        this.f87401Oooo0OO = new RunnableC25609OooO00o(this);
        this.f87387OooOo = c25583OooO0OO == null ? null : new C25616OooO00o(c25583OooO0OO);
    }
}
