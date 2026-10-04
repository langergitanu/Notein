package androidx.ink.strokes;

import OooOo.C20481OooOOoo;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import androidx.ink.nativeloader.UsedByNative;
import kotlin.Metadata;
import o000OO00.C24478Oooo00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m80612d2 = {"Landroidx/ink/strokes/StrokeInput;", "", "<init>", "()V", "", "x", "y", "", "elapsedTimeMillis", "", "toolTypeInt", "strokeUnitLengthCm", "pressure", "tiltRadians", "orientationRadians", "LoO00ooO/OooOooO;", "update", "(FFJIFFFF)V", "ink-strokes"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokeInput {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f65490OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f65491OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f65492OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f65495OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C24478Oooo00o f65493OooO0Oo = C24478Oooo00o.f82772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f65494OooO0o = -1.0f;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f65496OooO0oO = -1.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f65497OooO0oo = -1.0f;

    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6, long j, C24478Oooo00o toolType) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(toolType, "toolType");
        this.f65493OooO0Oo = toolType;
        this.f65490OooO00o = f;
        this.f65491OooO0O0 = f2;
        this.f65492OooO0OO = j;
        this.f65495OooO0o0 = f3;
        this.f65494OooO0o = f4;
        this.f65496OooO0oO = f5;
        this.f65497OooO0oo = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrokeInput)) {
            return false;
        }
        StrokeInput strokeInput = (StrokeInput) obj;
        return this.f65490OooO00o == strokeInput.f65490OooO00o && this.f65491OooO0O0 == strokeInput.f65491OooO0O0 && this.f65492OooO0OO == strokeInput.f65492OooO0OO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f65493OooO0Oo, strokeInput.f65493OooO0Oo) && this.f65495OooO0o0 == strokeInput.f65495OooO0o0 && this.f65494OooO0o == strokeInput.f65494OooO0o && this.f65496OooO0oO == strokeInput.f65496OooO0oO && this.f65497OooO0oo == strokeInput.f65497OooO0oo;
    }

    public final int hashCode() {
        return Float.hashCode(this.f65497OooO0oo) + C20509OooO0oo.OooO0OO(this.f65496OooO0oO, C20509OooO0oo.OooO0OO(this.f65494OooO0o, C20509OooO0oo.OooO0OO(this.f65495OooO0o0, (this.f65493OooO0Oo.hashCode() + C20703o000000o.OooO0O0(C20509OooO0oo.OooO0OO(this.f65491OooO0O0, Float.hashCode(this.f65490OooO00o) * 31, 31), 31, this.f65492OooO0OO)) * 31, 31), 31), 31);
    }

    public final String toString() {
        float f = this.f65490OooO00o;
        float f2 = this.f65491OooO0O0;
        long j = this.f65492OooO0OO;
        C24478Oooo00o c24478Oooo00o = this.f65493OooO0Oo;
        float f3 = this.f65495OooO0o0;
        float f4 = this.f65494OooO0o;
        float f5 = this.f65496OooO0oO;
        float f6 = this.f65497OooO0oo;
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("StrokeInput(x=", f, ", y=", f2, ", elapsedTimeMillis=");
        sbOooO0Oo.append(j);
        sbOooO0Oo.append(", toolType=");
        sbOooO0Oo.append(c24478Oooo00o);
        sbOooO0Oo.append(", strokeUnitLengthCm=");
        sbOooO0Oo.append(f3);
        sbOooO0Oo.append(", pressure=");
        sbOooO0Oo.append(f4);
        sbOooO0Oo.append(", tiltRadians=");
        sbOooO0Oo.append(f5);
        sbOooO0Oo.append(", orientationRadians=");
        sbOooO0Oo.append(f6);
        sbOooO0Oo.append(")");
        return sbOooO0Oo.toString();
    }

    @UsedByNative
    public final void update(float x, float y, long elapsedTimeMillis, int toolTypeInt, float strokeUnitLengthCm, float pressure, float tiltRadians, float orientationRadians) {
        C20481OooOOoo<C24478Oooo00o> c20481OooOOoo = C24478Oooo00o.f82771OooO0OO;
        OooO00o(x, y, strokeUnitLengthCm, pressure, tiltRadians, orientationRadians, elapsedTimeMillis, C24478Oooo00o.OooO00o.OooO00o(toolTypeInt));
    }
}
