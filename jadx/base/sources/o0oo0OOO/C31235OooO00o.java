package o0oo0OOO;

import OooOoO.C20509OooO0oo;
import OooOooo.C20785Oooo00o;
import Oooo.OooO0OO;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o0oo0OOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31235OooO00o {

    /* JADX INFO: renamed from: o0oo0OOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20167OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f111394OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f111395OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f111396OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f111397OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f111398OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f111399OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f111400OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f111401OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f111402OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f111403OooOO0;

        public C20167OooO00o() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20167OooO00o)) {
                return false;
            }
            C20167OooO00o c20167OooO00o = (C20167OooO00o) obj;
            return this.f111395OooO00o == c20167OooO00o.f111395OooO00o && Float.compare(this.f111396OooO0O0, c20167OooO00o.f111396OooO0O0) == 0 && Float.compare(this.f111397OooO0OO, c20167OooO00o.f111397OooO0OO) == 0 && Float.compare(this.f111398OooO0Oo, c20167OooO00o.f111398OooO0Oo) == 0 && Float.compare(this.f111400OooO0o0, c20167OooO00o.f111400OooO0o0) == 0 && this.f111399OooO0o == c20167OooO00o.f111399OooO0o && Float.compare(this.f111401OooO0oO, c20167OooO00o.f111401OooO0oO) == 0 && Float.compare(this.f111402OooO0oo, c20167OooO00o.f111402OooO0oo) == 0 && Float.compare(this.f111394OooO, c20167OooO00o.f111394OooO) == 0 && Float.compare(this.f111403OooOO0, c20167OooO00o.f111403OooOO0) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f111403OooOO0) + C20509OooO0oo.OooO0OO(this.f111394OooO, C20509OooO0oo.OooO0OO(this.f111402OooO0oo, C20509OooO0oo.OooO0OO(this.f111401OooO0oO, C20785Oooo00o.OooO00o(this.f111399OooO0o, C20509OooO0oo.OooO0OO(this.f111400OooO0o0, C20509OooO0oo.OooO0OO(this.f111398OooO0Oo, C20509OooO0oo.OooO0OO(this.f111397OooO0OO, C20509OooO0oo.OooO0OO(this.f111396OooO0O0, Integer.hashCode(this.f111395OooO00o) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            return "DirectionalFlowStats(intraPairs=" + this.f111395OooO00o + ", intraAbsDx=" + this.f111396OooO0O0 + ", intraAbsDy=" + this.f111397OooO0OO + ", intraSignedDx=" + this.f111398OooO0Oo + ", intraSignedDy=" + this.f111400OooO0o0 + ", jumpPairs=" + this.f111399OooO0o + ", jumpAbsDx=" + this.f111401OooO0oO + ", jumpAbsDy=" + this.f111402OooO0oo + ", jumpSignedDx=" + this.f111394OooO + ", jumpSignedDy=" + this.f111403OooOO0 + ")";
        }

        public C20167OooO00o(int i) {
            this.f111395OooO00o = 0;
            this.f111396OooO0O0 = 0.0f;
            this.f111397OooO0OO = 0.0f;
            this.f111398OooO0Oo = 0.0f;
            this.f111400OooO0o0 = 0.0f;
            this.f111399OooO0o = 0;
            this.f111401OooO0oO = 0.0f;
            this.f111402OooO0oo = 0.0f;
            this.f111394OooO = 0.0f;
            this.f111403OooOO0 = 0.0f;
        }
    }

    public static C20167OooO00o OooO00o(ArrayList arrayList) {
        C20167OooO00o c20167OooO00o = new C20167OooO00o(0);
        if (!arrayList.isEmpty() && arrayList.size() >= 2) {
            int size = arrayList.size() - 1;
            float[] fArr = new float[size];
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            float[] fArr4 = new float[size];
            float[] fArr5 = new float[size];
            int i = 0;
            while (i < size) {
                RectF rectF = (RectF) arrayList.get(i);
                int i2 = i + 1;
                RectF rectF2 = (RectF) arrayList.get(i2);
                float fCenterX = rectF2.centerX() - rectF.centerX();
                float fCenterY = rectF2.centerY() - rectF.centerY();
                float fAbs = Math.abs(fCenterX);
                float fAbs2 = Math.abs(fCenterY);
                fArr2[i] = fCenterX;
                fArr3[i] = fCenterY;
                fArr4[i] = fAbs;
                fArr5[i] = fAbs2;
                fArr[i] = (float) Math.hypot(fAbs, fAbs2);
                i = i2;
            }
            float fOooO0OO = OooO0OO(fArr);
            float f = fOooO0OO <= 1.0E-6f ? Float.POSITIVE_INFINITY : fOooO0OO * 1.8f;
            for (int i3 = 0; i3 < size; i3++) {
                float f2 = fArr2[i3];
                float f3 = fArr3[i3];
                float f4 = fArr4[i3];
                float f5 = fArr5[i3];
                if (fArr[i3] <= f) {
                    c20167OooO00o.f111395OooO00o++;
                    c20167OooO00o.f111396OooO0O0 += f4;
                    c20167OooO00o.f111397OooO0OO += f5;
                    c20167OooO00o.f111398OooO0Oo += f2;
                    c20167OooO00o.f111400OooO0o0 += f3;
                } else {
                    c20167OooO00o.f111399OooO0o++;
                    c20167OooO00o.f111401OooO0oO += f4;
                    c20167OooO00o.f111402OooO0oo += f5;
                    c20167OooO00o.f111394OooO += f2;
                    c20167OooO00o.f111403OooOO0 += f3;
                }
            }
        }
        return c20167OooO00o;
    }

    public static boolean OooO0O0(ArrayList arrayList) {
        float fMax;
        if (arrayList.isEmpty()) {
            return false;
        }
        float fMax2 = Float.NEGATIVE_INFINITY;
        float fMin = Float.POSITIVE_INFINITY;
        float fMax3 = 0.0f;
        if (arrayList.isEmpty()) {
            fMax = 0.0f;
        } else {
            Iterator it = arrayList.iterator();
            float fMax4 = Float.NEGATIVE_INFINITY;
            float fMin2 = Float.POSITIVE_INFINITY;
            while (it.hasNext()) {
                RectF rectF = (RectF) it.next();
                fMin2 = Math.min(fMin2, rectF.left);
                fMax4 = Math.max(fMax4, rectF.right);
            }
            fMax = Math.max(0.0f, fMax4 - fMin2);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                RectF rectF2 = (RectF) it2.next();
                fMin = Math.min(fMin, rectF2.top);
                fMax2 = Math.max(fMax2, rectF2.bottom);
            }
            fMax3 = Math.max(0.0f, fMax2 - fMin);
        }
        return fMax <= 1.0E-6f || fMax3 / fMax > 1.5f;
    }

    public static float OooO0OO(float[] fArr) {
        if (fArr.length == 0) {
            return 0.0f;
        }
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        Float[] fArr3 = fArr2;
        if (fArr3.length > 1) {
            Arrays.sort(fArr3);
        }
        List listOooO0Oo = OooO0OO.OooO0Oo(fArr2);
        int size = listOooO0Oo.size() / 2;
        if (listOooO0Oo.size() % 2 == 1) {
            return ((Number) listOooO0Oo.get(size)).floatValue();
        }
        return (((Number) listOooO0Oo.get(size)).floatValue() + ((Number) listOooO0Oo.get(size - 1)).floatValue()) * 0.5f;
    }
}
