package o0oo0Ooo;

import OooOoO.C20509OooO0oo;
import OooOoo.C20593OooO0Oo;
import android.graphics.Matrix;
import androidx.ink.strokes.OooOOO0;
import androidx.ink.strokes.StrokeInput;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import com.orion.ni_render_engine.impl.ink.OooO0o;
import com.orion.penkit.models.RPointF;
import java.util.List;
import java.util.Map;
import o000OO00.C24457OooOOo;
import o0O0oOo0.C26146OooO00o;
import o0O0oo00.OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO0O00oo.OooOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0oo0Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31279OooO0O0 implements OooO0o {

    /* JADX INFO: renamed from: o0oo0Ooo.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f111679OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f111680OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f111681OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f111682OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f111683OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f111684OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f111685OooO0oO;

        public OooO00o(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.f111679OooO00o = f;
            this.f111680OooO0O0 = f2;
            this.f111681OooO0OO = f3;
            this.f111682OooO0Oo = f4;
            this.f111684OooO0o0 = f5;
            this.f111683OooO0o = f6;
            this.f111685OooO0oO = f7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Float.compare(this.f111679OooO00o, oooO00o.f111679OooO00o) == 0 && Float.compare(this.f111680OooO0O0, oooO00o.f111680OooO0O0) == 0 && Float.compare(this.f111681OooO0OO, oooO00o.f111681OooO0OO) == 0 && Float.compare(this.f111682OooO0Oo, oooO00o.f111682OooO0Oo) == 0 && Float.compare(this.f111684OooO0o0, oooO00o.f111684OooO0o0) == 0 && Float.compare(this.f111683OooO0o, oooO00o.f111683OooO0o) == 0 && Float.compare(this.f111685OooO0oO, oooO00o.f111685OooO0oO) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f111685OooO0oO) + C20509OooO0oo.OooO0OO(this.f111683OooO0o, C20509OooO0oo.OooO0OO(this.f111684OooO0o0, C20509OooO0oo.OooO0OO(this.f111682OooO0Oo, C20509OooO0oo.OooO0OO(this.f111681OooO0OO, C20509OooO0oo.OooO0OO(this.f111680OooO0O0, Float.hashCode(this.f111679OooO00o) * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MotionSample(speedCmS=");
            sb.append(this.f111679OooO00o);
            sb.append(", dirX=");
            sb.append(this.f111680OooO0O0);
            sb.append(", dirY=");
            sb.append(this.f111681OooO0OO);
            sb.append(", accForward=");
            sb.append(this.f111682OooO0Oo);
            sb.append(", accLateral=");
            sb.append(this.f111684OooO0o0);
            sb.append(", vx=");
            sb.append(this.f111683OooO0o);
            sb.append(", vy=");
            return Oooo00o.OooO0OO.OooO0OO(sb, this.f111685OooO0oO, ")");
        }
    }

    public static void OooO0OO(C26146OooO00o c26146OooO00o, List list, List list2) {
        c26146OooO00o.moveTo(((RPointF) list.get(0)).getX(), ((RPointF) list.get(0)).getY());
        c26146OooO00o.lineTo(((RPointF) list.get(1)).getX(), ((RPointF) list.get(1)).getY());
        c26146OooO00o.OooO0O0(((RPointF) list2.get(0)).getX(), ((RPointF) list2.get(0)).getY(), ((RPointF) list.get(2)).getX(), ((RPointF) list.get(2)).getY());
        c26146OooO00o.lineTo(((RPointF) list.get(3)).getX(), ((RPointF) list.get(3)).getY());
        c26146OooO00o.OooO0O0(((RPointF) list2.get(1)).getX(), ((RPointF) list2.get(1)).getY(), ((RPointF) list.get(0)).getX(), ((RPointF) list.get(0)).getY());
    }

    public static List OooO0Oo(RPointF rPointF, float f, float f2, double d) {
        return C34429OooOOo0.OooOO0o(new RPointF((float) ((((double) (rPointF.getR() * f2)) / d) + ((double) rPointF.getX())), (float) (((double) rPointF.getY()) - (((double) (rPointF.getR() * f)) / d)), 0.0f, 4, null), new RPointF((float) (((double) rPointF.getX()) - (((double) (rPointF.getR() * f2)) / d)), (float) ((((double) (rPointF.getR() * f)) / d) + ((double) rPointF.getY())), 0.0f, 4, null));
    }

    @Override // com.orion.ni_render_engine.impl.ink.OooO0o
    public final boolean OooO00o(OooOOO0 stroke) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        return BrushFamilyProvider.InkBrushFamilyId.INSTANCE.isFountain(stroke.f65486OooO00o.f82632OooO0O0.OooO00o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034e  */
    @Override // com.orion.ni_render_engine.impl.ink.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(C26146OooO00o c26146OooO00o, OooOOO0 stroke, Matrix matrix, Map map) {
        EnumC31282OooO0o0 enumC31282OooO0o0;
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr;
        float f5;
        float f6;
        float fOooO0O0;
        float f7;
        float fFloatValue;
        C32443OooOOO c32443OooOOO;
        float f8;
        float f9;
        float fOooO0o0;
        float f10;
        float f11;
        androidx.ink.strokes.OooO00o oooO00o;
        float fPow;
        float f12;
        OooO00o oooO00o2;
        Float f13;
        Float f14;
        Matrix matrix2 = matrix;
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FountainPdfRenderer");
        o000OO00.OooO0O0 oooO0O0 = stroke.f65486OooO00o;
        String strOooO00o = oooO0O0.f82632OooO0O0.OooO00o();
        androidx.ink.strokes.OooO00o oooO00o3 = stroke.f65488OooO0OO;
        c20358OooO00o.OooO00o("render: brushFamilyId=%s, inputCount=%d, brushSize=%.2f, color=#%08X, behaviorParams=%s", strOooO00o, Integer.valueOf(oooO00o3.OooO0OO()), Float.valueOf(oooO0O0.OooO0o()), Integer.valueOf(oooO0O0.OooO0O0()), map);
        float f15 = 1.0f;
        float f16 = 0.0f;
        float fOooO0o02 = (map == null || (f14 = (Float) map.get("pressure_correct")) == null) ? 1.0f : OooOO0.OooO0o0(f14.floatValue(), 0.0f, 2.0f);
        float fOooO0o03 = (map == null || (f13 = (Float) map.get("speed_correct")) == null) ? 1.0f : OooOO0.OooO0o0(f13.floatValue(), 0.0f, 1.0f);
        C24457OooOOo c24457OooOOo = oooO0O0.f82632OooO0O0;
        String strOooO00o2 = c24457OooOOo.OooO00o();
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o2, "notein-fountain-v1")) {
            enumC31282OooO0o0 = EnumC31282OooO0o0.f111693OooOo;
        } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o2, "notein-fountain-v2")) {
            enumC31282OooO0o0 = EnumC31282OooO0o0.f111695OooOoO0;
        } else {
            c20358OooO00o.OooOO0O(C20593OooO0Oo.OooO0O0("Unknown fountain brush family: ", c24457OooOOo.OooO00o(), ", fallback to V2"), new Object[0]);
            enumC31282OooO0o0 = EnumC31282OooO0o0.f111695OooOoO0;
        }
        EnumC31282OooO0o0 enumC31282OooO0o02 = enumC31282OooO0o0;
        int iOooO0OO = oooO00o3.OooO0OO();
        if (iOooO0OO == 0) {
            c20358OooO00o.OooOOO0("FountainPdfRenderer");
            c20358OooO00o.OooOO0O("drawFountainStroke: empty inputs, skip", new Object[0]);
            return;
        }
        StrokeInput strokeInput = new StrokeInput();
        float fOooO0o = oooO0O0.OooO0o() / 2.0f;
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        float f17 = fArr2[0];
        float f18 = fArr2[3];
        float f19 = fArr2[4];
        float f20 = fArr2[1];
        int i = 1;
        float fSqrt = (((float) Math.sqrt((f18 * f18) + (f17 * f17))) + ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / 2.0f;
        c20358OooO00o.OooOOO0("FountainPdfRenderer");
        c20358OooO00o.OooO00o("drawFountainStroke: version=%s, count=%d, baseRadius=%.2f, scaleFactor=%.4f, pressureCorrect=%.2f, speedCorrect=%.2f", enumC31282OooO0o02, Integer.valueOf(iOooO0OO), Float.valueOf(fOooO0o), Float.valueOf(fSqrt), Float.valueOf(fOooO0o02), Float.valueOf(fOooO0o03));
        int i2 = 0;
        while (i2 < iOooO0OO) {
            oooO00o3.OooO0o0(i2, strokeInput);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("FountainPdfRenderer");
            c20358OooO00o2.OooO00o("  input[%d/%d]: x=%.2f, y=%.2f, pressure=%.3f, time=%dms, unitCm=%.4f", Integer.valueOf(i2), Integer.valueOf(iOooO0OO), Float.valueOf(strokeInput.f65490OooO00o), Float.valueOf(strokeInput.f65491OooO0O0), Float.valueOf(strokeInput.f65494OooO0o), Long.valueOf(strokeInput.f65492OooO0OO), Float.valueOf(strokeInput.f65495OooO0o0));
            i2++;
            f15 = f15;
            f16 = f16;
        }
        float f21 = f15;
        float f22 = f16;
        OooO00o.C19734OooO00o.OooO00o(c26146OooO00o, oooO0O0.OooO0O0(), 1.0f, 1, 0, false, 24);
        RPointF rPointF = new RPointF(0.0f, 0.0f, 0.0f, 7, null);
        new RPointF(0.0f, 0.0f, 0.0f, 7, null);
        float f23 = f22;
        float f24 = f23;
        float f25 = f24;
        float f26 = f25;
        float f27 = f26;
        float f28 = f27;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        RPointF rPointF2 = new RPointF(0.0f, 0.0f, 0.0f, 7, null);
        long j = 0;
        while (i3 < iOooO0OO) {
            oooO00o3.OooO0o0(i3, strokeInput);
            if (z) {
                long j2 = strokeInput.f65492OooO0OO - j;
                f = f22;
                if (j2 > 0) {
                    f22 = j2 / 1000.0f;
                }
                if (j2 <= 0) {
                    oooO00o2 = new OooO00o(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    float f29 = strokeInput.f65490OooO00o - f25;
                    float f30 = strokeInput.f65491OooO0O0 - f26;
                    float fSqrt2 = (float) Math.sqrt((f30 * f30) + (f29 * f29));
                    float f31 = fSqrt2 > f ? f29 / fSqrt2 : f;
                    float f32 = fSqrt2 > f ? f30 / fSqrt2 : f;
                    float f33 = strokeInput.f65495OooO0o0;
                    if (f33 <= f) {
                        f33 = f21;
                    }
                    float f34 = j2 / 1000.0f;
                    float f35 = f34 > f ? (fSqrt2 * f33) / f34 : f;
                    float f36 = f31 * f35;
                    float f37 = f32 * f35;
                    float f38 = f34 > f ? (f36 - f27) / f34 : f;
                    float f39 = f34 > f ? (f37 - f28) / f34 : f;
                    oooO00o2 = new OooO00o(f35, f31, f32, (f39 * f32) + (f38 * f31), -Math.abs((f39 * f31) + ((-f38) * f32)), f36, f37);
                }
                OooO00o oooO00o4 = oooO00o2;
                float f40 = oooO00o4.f111679OooO00o;
                float f41 = oooO00o4.f111681OooO0OO;
                f3 = oooO00o4.f111684OooO0o0;
                float f42 = oooO00o4.f111683OooO0o;
                f28 = oooO00o4.f111685OooO0oO;
                f2 = f22;
                f4 = f40;
                f27 = f42;
                f24 = f41;
            } else {
                f = f22;
                f2 = f;
                f3 = f2;
                f4 = f3;
            }
            float f43 = strokeInput.f65490OooO00o;
            float f44 = f24;
            float f45 = strokeInput.f65491OooO0O0;
            float[] fArr3 = new float[2];
            fArr3[0] = f43;
            fArr3[i] = f45;
            matrix2.mapPoints(fArr3);
            if (fOooO0o03 <= f) {
                fArr = fArr3;
                c32443OooOOO = new C32443OooOOO(Float.valueOf(f21), Float.valueOf(f23));
                f8 = f;
                fFloatValue = f23;
            } else {
                float fOooO0O02 = C31281OooO0Oo.OooO0O0(enumC31282OooO0o02);
                if (fOooO0O02 < f21) {
                    fArr = fArr3;
                    f5 = f;
                    f6 = fOooO0O02;
                    fOooO0O0 = C31281OooO0Oo.OooO0Oo(OooOO0.OooO0o0(f4 / C31281OooO0Oo.OooO0OO(enumC31282OooO0o02), f5, f21), enumC31282OooO0o02);
                } else {
                    fArr = fArr3;
                    f5 = f;
                    f6 = fOooO0O02;
                    fOooO0O0 = f5;
                }
                if (i4 != 0 && f2 > f5) {
                    f7 = 1.0f;
                    fFloatValue = f23;
                    fOooO0O0 = OooOO0.OooO0OO.OooO0O0(fOooO0O0, fFloatValue, 1.0f - ((float) Math.exp((-f2) / 0.02f)), fFloatValue);
                } else {
                    fFloatValue = f23;
                    f7 = 1.0f;
                }
                c32443OooOOO = new C32443OooOOO(Float.valueOf((((((f6 - f7) * fOooO0o03) + f7) - f7) * fOooO0O0) + f7), Float.valueOf(fOooO0O0));
                f8 = 0.0f;
            }
            if (fOooO0o03 > f8) {
                fFloatValue = ((Number) c32443OooOOO.f116637OooOo).floatValue();
                i4 = i;
            }
            float fFloatValue2 = ((Number) c32443OooOOO.f116638OooOo0o).floatValue();
            float f46 = strokeInput.f65494OooO0o;
            if (f46 < 0.0f) {
                fOooO0o0 = -1.0f;
                f9 = fFloatValue2;
            } else {
                f9 = fFloatValue2;
                fOooO0o0 = OooOO0.OooO0o0(f46, 0.0f, 1.0f);
            }
            if (fOooO0o02 <= 0.0f || fOooO0o0 < 0.0f) {
                f10 = fFloatValue;
                f11 = fSqrt;
                oooO00o = oooO00o3;
                fPow = 1.0f;
            } else {
                float[] fArr4 = C31280OooO0OO.f111686OooO00o;
                int iOrdinal = enumC31282OooO0o02.ordinal();
                if (iOrdinal == 0) {
                    f10 = fFloatValue;
                    oooO00o = oooO00o3;
                    float fOooO0o04 = OooOO0.OooO0o0(fOooO0o0, 0.0f, 1.0f);
                    double d = fOooO0o02;
                    float fPow2 = (float) Math.pow(0.33333334f, d);
                    f11 = fSqrt;
                    float fPow3 = (float) Math.pow(0.6666667f, d);
                    if (fOooO0o04 <= 0.0f) {
                        fPow = 0.0f;
                    } else {
                        fPow = 1.0f;
                        if (fOooO0o04 >= 1.0f) {
                            f12 = 1.0f;
                            if (fOooO0o02 == f12) {
                                fPow *= 0.96f;
                            }
                        } else {
                            float f47 = fPow3 * 3.0f;
                            float f48 = 3.0f * fPow2;
                            float f49 = (1.0f - f47) + f48;
                            float f50 = f47 - (fPow2 * 6.0f);
                            float f51 = fOooO0o04;
                            for (int i5 = 0; i5 < 8; i5++) {
                                float f52 = (((0.0f * f51) + 0.0f) * f51) + 1.0f;
                                float f53 = f52 * f51;
                                if (f52 == 0.0f) {
                                    break;
                                }
                                float f54 = f53 - fOooO0o04;
                                if (Math.abs(f54) < 1.0E-4f) {
                                    fPow = ((((f49 * f51) + f50) * f51) + f48) * f51;
                                    break;
                                }
                                f51 -= f54 / f52;
                            }
                            float f55 = 1.0f;
                            float f56 = 0.0f;
                            for (int i6 = 0; i6 < 10; i6++) {
                                float f57 = ((((0.0f * f51) + 0.0f) * f51) + 1.0f) * f51;
                                if (Math.abs(f57 - fOooO0o04) < 1.0E-4f) {
                                    break;
                                }
                                if (f57 > fOooO0o04) {
                                    f55 = f51;
                                } else {
                                    f56 = f51;
                                }
                                f51 = (f56 + f55) * 0.5f;
                            }
                            fPow = ((((f49 * f51) + f50) * f51) + f48) * f51;
                        }
                    }
                    f12 = 1.0f;
                    if (fOooO0o02 == f12) {
                    }
                } else {
                    if (iOrdinal != i) {
                        throw new C32442OooOO0o();
                    }
                    if (fOooO0o02 > 0.0f) {
                        float f58 = C31280OooO0OO.f111690OooO0o0;
                        if (fOooO0o02 >= f58) {
                            f58 = fOooO0o02;
                        }
                        f10 = fFloatValue;
                        oooO00o = oooO00o3;
                        fPow = (float) Math.pow(OooOO0.OooO0o0(fOooO0o0, 0.0f, 1.0f), f58);
                        f11 = fSqrt;
                    }
                }
            }
            RPointF rPointF3 = new RPointF(fArr[0], fArr[1], fPow * f9 * 1.0f * ((((OooOO0.OooO0o0(Math.abs(f44), Math.min(0.45f, 0.65f), Math.max(0.45f, 0.65f)) - 0.45f) / 0.19999999f) * 0.08000004f) + 1.0f) * ((((OooOO0.OooO0o0(f3, Math.min(-80.0f, -230.0f), Math.max(-80.0f, -230.0f)) - (-80.0f)) / (-150.0f)) * 0.08000004f) + 1.0f) * fOooO0o * f11);
            if (i3 == 0) {
                c26146OooO00o.OooOOOo(rPointF3.getX(), rPointF3.getY(), rPointF3.getR());
                rPointF = RPointF.copy$default(rPointF3, 0.0f, 0.0f, 0.0f, 7, null);
                rPointF2 = RPointF.copy$default(rPointF3, 0.0f, 0.0f, 0.0f, 7, null);
            } else {
                RPointF rPointFCopy$default = RPointF.copy$default(rPointF2, 0.0f, 0.0f, 0.0f, 7, null);
                RPointF.Companion companion = RPointF.INSTANCE;
                RPointF midPoint = companion.getMidPoint(rPointF, rPointF3);
                double distance = companion.getDistance(rPointFCopy$default, midPoint);
                if (distance > Math.abs(rPointFCopy$default.getR() - midPoint.getR())) {
                    OooO0OO(c26146OooO00o, companion.getTangencyPoints(rPointFCopy$default, midPoint), OooO0Oo(rPointF, midPoint.getX() - rPointFCopy$default.getX(), midPoint.getY() - rPointFCopy$default.getY(), distance));
                    c26146OooO00o.OooOOOo(midPoint.getX(), midPoint.getY(), midPoint.getR());
                }
                rPointF2 = midPoint;
                RPointF rPointFCopy$default2 = RPointF.copy$default(rPointF3, 0.0f, 0.0f, 0.0f, 7, null);
                RPointF rPointFCopy$default3 = RPointF.copy$default(rPointF2, 0.0f, 0.0f, 0.0f, 7, null);
                if (i3 == iOooO0OO - 1) {
                    double distance2 = companion.getDistance(rPointFCopy$default3, rPointF3);
                    if (distance2 > Math.abs(rPointFCopy$default3.getR() - rPointF3.getR())) {
                        OooO0OO(c26146OooO00o, companion.getTangencyPoints(rPointFCopy$default3, rPointF3), OooO0Oo(rPointFCopy$default2, rPointF3.getX() - rPointFCopy$default3.getX(), rPointF3.getY() - rPointFCopy$default3.getY(), distance2));
                        c26146OooO00o.OooOOOo(rPointF3.getX(), rPointF3.getY(), rPointF3.getR());
                    }
                }
                rPointF = rPointFCopy$default2;
            }
            f25 = strokeInput.f65490OooO00o;
            f26 = strokeInput.f65491OooO0O0;
            i = 1;
            i3++;
            matrix2 = matrix;
            j = strokeInput.f65492OooO0OO;
            f24 = f44;
            z = true;
            f23 = f10;
            oooO00o3 = oooO00o;
            fSqrt = f11;
            f21 = 1.0f;
            f22 = 0.0f;
        }
        c26146OooO00o.OooOOOO(f21);
    }
}
