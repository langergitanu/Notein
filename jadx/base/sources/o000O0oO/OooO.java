package o000O0oO;

import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import androidx.ink.geometry.BoxAccumulator;
import androidx.ink.geometry.MutableBox;
import androidx.ink.strokes.C21967OooO0Oo;
import androidx.ink.strokes.C21970OooO0oo;
import androidx.ink.strokes.InProgressStrokeNative;
import androidx.ink.strokes.OooOOO;
import androidx.ink.strokes.OooOOO0;
import kotlin.jvm.internal.C24035Oooo00o;
import o000OO00.C24457OooOOo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements OooO0O0<o000OO00.OooO0O0, OooOOO0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final BoxAccumulator f82407OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21967OooO0Oo f82408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f82409OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f82410OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f82411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f82412OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f82413OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f82414OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final BoxAccumulator f82415OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final BoxAccumulator f82416OooOO0;

    public OooO(int i) {
        this.f82408OooO00o = new C21967OooO0Oo();
        this.f82409OooO0O0 = Integer.MIN_VALUE;
        this.f82411OooO0Oo = Long.MIN_VALUE;
        this.f82415OooO0oo = new BoxAccumulator();
        this.f82407OooO = new BoxAccumulator();
        this.f82416OooOO0 = new BoxAccumulator();
    }

    @Override // o000O0oO.OooO0O0
    public final void OooO() {
        C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
        c21967OooO0Oo.getClass();
        InProgressStrokeNative.f65457OooO00o.finishInput(c21967OooO0Oo.OooO0o0());
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        c21967OooO0Oo.f65471OooO0OO++;
    }

    @Override // o000O0oO.OooO0O0
    public final void OooO00o() {
        this.f82414OooO0oO = false;
        this.f82412OooO0o = false;
        C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
        c21967OooO0Oo.getClass();
        InProgressStrokeNative.f65457OooO00o.resetUpdatedRegion(c21967OooO0Oo.OooO0o0());
    }

    @Override // o000O0oO.OooO0O0
    public final MutableBox OooO0O0() {
        BoxAccumulator boxAccumulator = this.f82415OooO0oo;
        boxAccumulator.reset();
        if (this.f82414OooO0oO) {
            boxAccumulator.OooO00o(OooOO0O());
        }
        if (this.f82412OooO0o) {
            C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
            c21967OooO0Oo.getClass();
            BoxAccumulator outUpdatedRegion = this.f82416OooOO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(outUpdatedRegion, "outUpdatedRegion");
            InProgressStrokeNative.f65457OooO00o.fillUpdatedRegion(c21967OooO0Oo.OooO0o0(), outUpdatedRegion);
            MutableBox mutableBoxOooO0OO = outUpdatedRegion.OooO0OO();
            if (mutableBoxOooO0OO != null) {
                boxAccumulator.OooO0O0(mutableBoxOooO0OO.f65389OooO00o, mutableBoxOooO0OO.f65390OooO0O0);
                boxAccumulator.OooO0O0(mutableBoxOooO0OO.f65391OooO0OO, mutableBoxOooO0OO.f65392OooO0Oo);
            }
            if (this.f82411OooO0Oo > 0) {
                boxAccumulator.OooO00o(OooOO0O());
            }
        }
        return boxAccumulator.OooO0OO();
    }

    @Override // o000O0oO.OooO0O0
    public final boolean OooO0OO() {
        return this.f82410OooO0OO || this.f82411OooO0Oo > 0;
    }

    @Override // o000O0oO.OooO0O0
    public final void OooO0Oo() {
        C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
        c21967OooO0Oo.getClass();
        if (!InProgressStrokeNative.f65457OooO00o.updateShape(c21967OooO0Oo.OooO0o0(), LocationRequestCompat.PASSIVE_INTERVAL)) {
            throw new IllegalStateException("Should have thrown an exception if updateShape failed.");
        }
        c21967OooO0Oo.f65471OooO0OO++;
    }

    @Override // o000O0oO.OooO0O0
    public final void OooO0o(o000OO00.OooO0O0 oooO0O0) {
        float f;
        OooO0oO();
        oO0O00o.OooO0OO.f116801OooOo0o.getClass();
        this.f82409OooO0O0 = oO0O00o.OooO0OO.f116800OooOo.OooO0OO();
        C24457OooOOo c24457OooOOo = oooO0O0.f82632OooO0O0;
        long jOooO0OO = c24457OooOOo.OooO0OO();
        if (jOooO0OO == 0) {
            f = 0.0f;
        } else {
            long j = 0 % jOooO0OO;
            f = (j + ((((j ^ jOooO0OO) & ((-j) | j)) >> 63) & jOooO0OO)) / jOooO0OO;
        }
        float f2 = f;
        int i = this.f82409OooO0O0;
        C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
        c21967OooO0Oo.getClass();
        InProgressStrokeNative inProgressStrokeNative = InProgressStrokeNative.f65457OooO00o;
        inProgressStrokeNative.start(c21967OooO0Oo.OooO0o0(), oooO0O0.OooO0o0(), i, f2);
        c21967OooO0Oo.f65470OooO0O0 = oooO0O0;
        c21967OooO0Oo.f65471OooO0OO++;
        this.f82410OooO0OO = inProgressStrokeNative.changesWithTime(c21967OooO0Oo.OooO0o0());
        this.f82411OooO0Oo = c24457OooOOo.OooO0OO();
    }

    @Override // o000O0oO.OooO0O0
    public final void OooO0o0(long j) {
        Object objOooO00o;
        C21967OooO0Oo c21967OooO0Oo;
        this.f82412OooO0o = true;
        try {
            c21967OooO0Oo = this.f82408OooO00o;
            c21967OooO0Oo.getClass();
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (!InProgressStrokeNative.f65457OooO00o.updateShape(c21967OooO0Oo.OooO0o0(), j)) {
            throw new IllegalStateException("Should have thrown an exception if updateShape failed.");
        }
        c21967OooO0Oo.f65471OooO0OO++;
        objOooO00o = C32460OooOooO.f116667OooO00o;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            Log.w(C24035Oooo00o.f80943OooO00o.OooO0O0(OooO.class).OooOO0(), "Error during InProgressStroke.updateShape", thOooO00o);
        }
    }

    @Override // o000O0oO.OooO0O0
    public final void OooO0oO() {
        this.f82412OooO0o = false;
        this.f82414OooO0oO = false;
        this.f82413OooO0o0 = false;
        this.f82411OooO0Oo = Long.MIN_VALUE;
        this.f82410OooO0OO = false;
        C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
        c21967OooO0Oo.getClass();
        InProgressStrokeNative.f65457OooO00o.clear(c21967OooO0Oo.OooO0o0());
        c21967OooO0Oo.f65470OooO0O0 = null;
        c21967OooO0Oo.f65471OooO0OO++;
    }

    @Override // o000O0oO.OooO0O0
    public final void OooO0oo(C21970OooO0oo realInputs, OooOOO predictedInputs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(realInputs, "realInputs");
        kotlin.jvm.internal.OooOOO0.OooO0oO(predictedInputs, "predictedInputs");
        try {
            this.f82408OooO00o.OooO00o(realInputs, predictedInputs);
        } catch (Throwable th) {
            Log.w("InkInProgressShape", "Error during InProgressStroke.enqueueInputs", th);
        }
    }

    @Override // o000O0oO.OooO0O0
    public final OooOOO0 OooOO0() {
        C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
        c21967OooO0Oo.getClass();
        InProgressStrokeNative inProgressStrokeNative = InProgressStrokeNative.f65457OooO00o;
        if (!inProgressStrokeNative.isInputFinished(c21967OooO0Oo.OooO0o0()) || inProgressStrokeNative.isUpdateNeeded(c21967OooO0Oo.OooO0o0())) {
            return null;
        }
        OooOOO0.OooO00o oooO00o = OooOOO0.f65485OooO0o0;
        o000OO00.OooO0O0 oooO0O0 = c21967OooO0Oo.f65470OooO0O0;
        if (oooO0O0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        androidx.ink.strokes.OooO0O0 oooO0O02 = new androidx.ink.strokes.OooO0O0(c21967OooO0Oo, 0);
        oooO00o.getClass();
        return new OooOOO0(oooO0O02, oooO0O0, (OooOOO) null, 12);
    }

    public final MutableBox OooOO0O() {
        BoxAccumulator boxAccumulator = this.f82407OooO;
        boxAccumulator.reset();
        C21967OooO0Oo c21967OooO0Oo = this.f82408OooO00o;
        int iOooO0O0 = c21967OooO0Oo.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            BoxAccumulator boxAccumulator2 = this.f82416OooOO0;
            c21967OooO0Oo.OooO(i, boxAccumulator2);
            MutableBox mutableBoxOooO0OO = boxAccumulator2.OooO0OO();
            if (mutableBoxOooO0OO != null) {
                boxAccumulator.OooO0O0(mutableBoxOooO0OO.f65389OooO00o, mutableBoxOooO0OO.f65390OooO0O0);
                boxAccumulator.OooO0O0(mutableBoxOooO0OO.f65391OooO0OO, mutableBoxOooO0OO.f65392OooO0Oo);
            }
        }
        return boxAccumulator.OooO0OO();
    }

    @Override // o000O0oO.OooO0O0
    public final void cancel() {
        this.f82413OooO0o0 = true;
        this.f82414OooO0oO = true;
    }

    @Override // o000O0oO.OooO0O0
    public final boolean isCanceled() {
        return this.f82413OooO0o0;
    }

    public OooO() {
        this(0);
    }
}
