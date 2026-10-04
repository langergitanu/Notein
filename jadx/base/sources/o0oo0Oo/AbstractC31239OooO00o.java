package o0oo0Oo;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Bundle;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.PressurePoint;
import java.util.ArrayList;
import java.util.List;
import o000oooo.C24761OooO;
import o00o0o0o.C25446OooO0Oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oo0oOOo.C35004OooO00o;

/* JADX INFO: renamed from: o0oo0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static boolean f111412OooOOOO = true;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public DrawRecord f111414OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f111415OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f111416OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f111417OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f111418OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f111419OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f111420OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f111421OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f111422OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f111423OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f111425OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f111426OooOOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C35004OooO00o f111413OooO = new C35004OooO00o();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f111424OooOO0o = 1.0f;

    public static PointF OooO0OO(float f, float f2, float f3, float f4) {
        float fAbs = Math.abs(f3 - f);
        float fAbs2 = Math.abs(f4 - f2);
        float fSqrt = (float) Math.sqrt((fAbs2 * fAbs2) + (fAbs * fAbs));
        float f5 = f + 10.0f;
        PointF pointFOooO0o = C25446OooO0Oo.OooO0o(new PointF(f, f2), new PointF(f5, f2 + 10.0f), new PointF(f3, f4));
        if (C25446OooO0Oo.OooO(f3, f4, pointFOooO0o.x, pointFOooO0o.y) / fSqrt < 0.05f) {
            return pointFOooO0o;
        }
        PointF pointFOooO0o2 = C25446OooO0Oo.OooO0o(new PointF(f, f2), new PointF(f5, f2 - 10.0f), new PointF(f3, f4));
        return C25446OooO0Oo.OooO(f3, f4, pointFOooO0o2.x, pointFOooO0o2.y) / fSqrt < 0.05f ? pointFOooO0o2 : fAbs2 / fSqrt < 0.05f ? new PointF(f3, f2) : fAbs / fSqrt < 0.05f ? new PointF(f, f4) : new PointF(f3, f4);
    }

    public DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        if (i == 0 || this.f111414OooO00o == null) {
            this.f111414OooO00o = new DrawRecord(C24761OooO.OooO00o("toString(...)"), OooO0oO(), OooO0Oo(), OooO0oo(), null, null, null, 0L, false, null, false, 2032, null);
        }
        DrawRecord drawRecord = this.f111414OooO00o;
        if (drawRecord != null) {
            drawRecord.addPoint(new PressurePoint(f, f2, f3, i));
        }
        PointF pointF = new PointF(f, f2);
        C35004OooO00o c35004OooO00o = this.f111413OooO;
        ArrayList arrayList = c35004OooO00o.f125706OooO00o;
        arrayList.add(pointF);
        c35004OooO00o.f125707OooO0O0 = arrayList;
        if (i == 0) {
            this.f111419OooO0o0 = f;
            this.f111418OooO0o = f2;
            this.f111420OooO0oO = 0.0f;
            this.f111421OooO0oo = 0.0f;
            this.f111423OooOO0O = 0L;
            this.f111422OooOO0 = false;
            c35004OooO00o.f125706OooO00o.clear();
        } else if (i == 1) {
            this.f111415OooO0O0 = false;
        } else if (i == 2) {
            if (f111412OooOOOO) {
                float f4 = this.f111419OooO0o0;
                float f5 = this.f111418OooO0o;
                if (this.f111423OooOO0O == 0) {
                    if (Math.abs(f4 - f) < 5.0f && Math.abs(f5 - f2) < 5.0f) {
                        this.f111423OooOO0O = System.currentTimeMillis();
                        this.f111420OooO0oO = f;
                        this.f111421OooO0oo = f2;
                    }
                } else if (Math.abs(this.f111420OooO0oO - f) >= 5.0f || Math.abs(this.f111421OooO0oo - f2) >= 5.0f) {
                    this.f111423OooOO0O = 0L;
                    this.f111420OooO0oO = 0.0f;
                    this.f111421OooO0oo = 0.0f;
                } else if (System.currentTimeMillis() - this.f111423OooOO0O > 600) {
                    this.f111422OooOO0 = true;
                }
            }
            this.f111419OooO0o0 = f;
            this.f111418OooO0o = f2;
        }
        DrawRecord drawRecord2 = this.f111414OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(drawRecord2);
        return new DrawResult(0, drawRecord2, null, null, null, false, false, null, null, false, null, 2044, null);
    }

    public float OooO0O0(float f, float f2) {
        return f;
    }

    public abstract int OooO0Oo();

    public float OooO0o() {
        return 1.0f;
    }

    public Bundle OooO0o0() {
        return new Bundle();
    }

    public abstract int OooO0oO();

    public abstract float OooO0oo();

    public void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
    }

    public void OooOO0O() {
    }

    public abstract void OooOO0o(float f);

    public void OooOOO(List<? extends InterfaceC31284OooO0O0> list) {
    }

    public void OooOOO0(ValueAnimator valueAnimator, float f) {
    }
}
