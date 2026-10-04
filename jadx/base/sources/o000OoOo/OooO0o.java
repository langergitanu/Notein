package o000OoOo;

import android.util.Log;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import o000OoOO.C24537OooO00o;
import o000OoOo.C24540OooO00o;
import o000OoOo.C24540OooO00o.C19626OooO00o.C19627OooO00o;
import o000Ooo0.C24549OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C24549OooO00o f83025OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24544OooO0o0 f83026OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24549OooO00o f83027OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f83028OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f83029OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedList f83030OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f83031OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f83032OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public double f83033OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C24549OooO00o f83034OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C24549OooO00o f83035OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C24549OooO00o f83036OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f83037OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f83038OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public double f83039OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public double f83040OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f83041OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public double f83042OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f83043OooOOoo;

    public OooO0o(int i, int i2, int i3) {
        C24544OooO0o0 c24544OooO0o0 = new C24544OooO0o0();
        this.f83026OooO00o = c24544OooO0o0;
        this.f83027OooO0O0 = new C24549OooO00o();
        this.f83030OooO0o = new LinkedList();
        this.f83032OooO0oO = -1;
        this.f83033OooO0oo = 0.0d;
        this.f83025OooO = new C24549OooO00o();
        this.f83034OooOO0 = new C24549OooO00o();
        this.f83035OooOO0O = new C24549OooO00o();
        this.f83036OooOO0o = new C24549OooO00o();
        this.f83039OooOOOO = 0.0d;
        this.f83040OooOOOo = 0.0d;
        this.f83042OooOOo0 = 0.0d;
        this.f83043OooOOoo = i;
        C24541OooO0O0 c24541OooO0O0 = c24544OooO0o0.f83045OooO00o;
        Arrays.fill(c24541OooO0O0.f83006OooO00o.f83122OooO0OO, 0.0d);
        o000Ooo0.OooO0O0.OooO0oO(c24541OooO0O0.f83007OooO0O0);
        C24541OooO0O0 c24541OooO0O02 = c24544OooO0o0.f83046OooO0O0;
        Arrays.fill(c24541OooO0O02.f83006OooO00o.f83122OooO0OO, 0.0d);
        o000Ooo0.OooO0O0.OooO0oO(c24541OooO0O02.f83007OooO0O0);
        C24541OooO0O0 c24541OooO0O03 = c24544OooO0o0.f83047OooO0OO;
        Arrays.fill(c24541OooO0O03.f83006OooO00o.f83122OooO0OO, 0.0d);
        o000Ooo0.OooO0O0.OooO0oO(c24541OooO0O03.f83007OooO0O0);
        c24544OooO0o0.f83053OooOO0 = 0;
        this.f83028OooO0OO = 0L;
        this.f83029OooO0Oo = 0.0d;
        this.f83031OooO0o0 = 0L;
        this.f83038OooOOO0 = i2;
        this.f83037OooOOO = i3;
        this.f83041OooOOo = C24537OooO00o.OooO00o().f82992OooO00o;
    }

    public final void OooO00o(MotionEvent motionEvent) {
        long j;
        C24540OooO00o.C19626OooO00o.C19627OooO00o c19627OooO00o;
        float f;
        char c;
        OooO0o oooO0o = this;
        int actionMasked = motionEvent.getActionMasked();
        long j2 = 0;
        C24544OooO0o0 c24544OooO0o0 = oooO0o.f83026OooO00o;
        if (actionMasked == 3) {
            C24541OooO0O0 c24541OooO0O0 = c24544OooO0o0.f83045OooO00o;
            Arrays.fill(c24541OooO0O0.f83006OooO00o.f83122OooO0OO, 0.0d);
            o000Ooo0.OooO0O0.OooO0oO(c24541OooO0O0.f83007OooO0O0);
            C24541OooO0O0 c24541OooO0O02 = c24544OooO0o0.f83046OooO0O0;
            Arrays.fill(c24541OooO0O02.f83006OooO00o.f83122OooO0OO, 0.0d);
            o000Ooo0.OooO0O0.OooO0oO(c24541OooO0O02.f83007OooO0O0);
            C24541OooO0O0 c24541OooO0O03 = c24544OooO0o0.f83047OooO0OO;
            Arrays.fill(c24541OooO0O03.f83006OooO00o.f83122OooO0OO, 0.0d);
            o000Ooo0.OooO0O0.OooO0oO(c24541OooO0O03.f83007OooO0O0);
            c24544OooO0o0.f83053OooOO0 = 0;
            oooO0o.f83028OooO0OO = 0L;
            oooO0o.f83029OooO0Oo = 0.0d;
            return;
        }
        int i = oooO0o.f83038OooOOO0;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex == -1) {
            Locale locale = Locale.ROOT;
            Log.i("SinglePointerPredictor", "onTouchEvent: Cannot find pointerId=" + i + " in motionEvent=" + motionEvent);
            return;
        }
        oooO0o.f83031OooO0o0 = motionEvent.getDownTime();
        C24540OooO00o.C19626OooO00o.C19627OooO00o c19627OooO00o2 = new C24540OooO00o.C19626OooO00o(motionEvent).new C19627OooO00o();
        while (c19627OooO00o2.hasNext()) {
            C24540OooO00o c24540OooO00o = (C24540OooO00o) c19627OooO00o2.next();
            MotionEvent.PointerCoords pointerCoords = c24540OooO00o.f82999OooO00o[iFindPointerIndex];
            float f2 = pointerCoords.x;
            float f3 = pointerCoords.y;
            float f4 = pointerCoords.pressure;
            float f5 = pointerCoords.orientation;
            float axisValue = pointerCoords.getAxisValue(25);
            long j3 = j2;
            long j4 = c24540OooO00o.f83000OooO0O0;
            double d = f2;
            C24549OooO00o c24549OooO00o = oooO0o.f83027OooO0O0;
            int i2 = iFindPointerIndex;
            if (d == c24549OooO00o.f83118OooO00o) {
                j = j4;
                if (f3 == c24549OooO00o.f83119OooO0O0 && j <= oooO0o.f83028OooO0OO + 20) {
                    c19627OooO00o = c19627OooO00o2;
                    c = 3;
                }
                c19627OooO00o2 = c19627OooO00o;
                j2 = j3;
                iFindPointerIndex = i2;
            } else {
                j = j4;
            }
            int i3 = c24544OooO0o0.f83053OooOO0;
            C24541OooO0O0 c24541OooO0O04 = c24544OooO0o0.f83047OooO0OO;
            C24541OooO0O0 c24541OooO0O05 = c24544OooO0o0.f83046OooO0O0;
            C24541OooO0O0 c24541OooO0O06 = c24544OooO0o0.f83045OooO00o;
            if (i3 == 0) {
                c24541OooO0O06.f83006OooO00o.OooO0o(d, 0, 0);
                c19627OooO00o = c19627OooO00o2;
                c24541OooO0O05.f83006OooO00o.OooO0o(f3, 0, 0);
                f = axisValue;
                c24541OooO0O04.f83006OooO00o.OooO0o(f4, 0, 0);
            } else {
                c19627OooO00o = c19627OooO00o2;
                f = axisValue;
                o000Ooo0.OooO0O0 oooO0O0 = c24544OooO0o0.f83054OooOO0O;
                oooO0O0.OooO0o(d, 0, 0);
                c24541OooO0O06.OooO00o();
                c24541OooO0O06.OooO0O0(oooO0O0);
                o000Ooo0.OooO0O0 oooO0O02 = c24544OooO0o0.f83055OooOO0o;
                oooO0O02.OooO0o(f3, 0, 0);
                c24541OooO0O05.OooO00o();
                c24541OooO0O05.OooO0O0(oooO0O02);
                o000Ooo0.OooO0O0 oooO0O03 = c24544OooO0o0.f83056OooOOO0;
                oooO0O03.OooO0o(f4, 0, 0);
                c24541OooO0O04.OooO00o();
                c24541OooO0O04.OooO0O0(oooO0O03);
            }
            c24544OooO0o0.f83053OooOO0++;
            double dOooO0OO = c24541OooO0O06.f83006OooO00o.OooO0OO(0, 0);
            C24549OooO00o c24549OooO00o2 = c24544OooO0o0.f83048OooO0Oo;
            c24549OooO00o2.f83118OooO00o = dOooO0OO;
            c24549OooO00o2.f83119OooO0O0 = c24541OooO0O05.f83006OooO00o.OooO0OO(0, 0);
            double dOooO0OO2 = c24541OooO0O06.f83006OooO00o.OooO0OO(1, 0);
            C24549OooO00o c24549OooO00o3 = c24544OooO0o0.f83050OooO0o0;
            c24549OooO00o3.f83118OooO00o = dOooO0OO2;
            c24549OooO00o3.f83119OooO0O0 = c24541OooO0O05.f83006OooO00o.OooO0OO(1, 0);
            double dOooO0OO3 = c24541OooO0O06.f83006OooO00o.OooO0OO(2, 0);
            C24549OooO00o c24549OooO00o4 = c24544OooO0o0.f83049OooO0o;
            c24549OooO00o4.f83118OooO00o = dOooO0OO3;
            c24549OooO00o4.f83119OooO0O0 = c24541OooO0O05.f83006OooO00o.OooO0OO(2, 0);
            c = 3;
            double dOooO0OO4 = c24541OooO0O06.f83006OooO00o.OooO0OO(3, 0);
            C24549OooO00o c24549OooO00o5 = c24544OooO0o0.f83051OooO0oO;
            c24549OooO00o5.f83118OooO00o = dOooO0OO4;
            c24549OooO00o5.f83119OooO0O0 = c24541OooO0O05.f83006OooO00o.OooO0OO(3, 0);
            c24544OooO0o0.f83052OooO0oo = c24541OooO0O04.f83006OooO00o.OooO0OO(0, 0);
            c24544OooO0o0.f83044OooO = c24541OooO0O04.f83006OooO00o.OooO0OO(1, 0);
            c24549OooO00o.f83118OooO00o = d;
            c24549OooO00o.f83119OooO0O0 = f3;
            oooO0o = this;
            oooO0o.f83040OooOOOo = f5;
            oooO0o.f83042OooOOo0 = f;
            LinkedList linkedList = oooO0o.f83030OooO0o;
            if (linkedList != null && linkedList.size() < 20) {
                if (oooO0o.f83028OooO0OO > j3) {
                    oooO0o.f83030OooO0o.add(Double.valueOf(j - r1));
                    Iterator it = oooO0o.f83030OooO0o.iterator();
                    double dDoubleValue = 0.0d;
                    while (it.hasNext()) {
                        dDoubleValue += ((Double) it.next()).doubleValue();
                    }
                    oooO0o.f83033OooO0oo = dDoubleValue / ((double) oooO0o.f83030OooO0o.size());
                }
            }
            oooO0o.f83028OooO0OO = j;
            c19627OooO00o2 = c19627OooO00o;
            j2 = j3;
            iFindPointerIndex = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MotionEvent OooO0O0(int i) {
        float f;
        float f2;
        double d;
        MotionEvent motionEvent;
        if (this.f83030OooO0o == null) {
            this.f83032OooO0oO = (int) Math.ceil(((double) i) / this.f83033OooO0oo);
        }
        int i2 = this.f83032OooO0oO;
        C24544OooO0o0 c24544OooO0o0 = this.f83026OooO00o;
        if (i2 == -1 && c24544OooO0o0.f83053OooOO0 < 4) {
            return null;
        }
        C24549OooO00o c24549OooO00o = this.f83025OooO;
        c24549OooO00o.getClass();
        C24549OooO00o c24549OooO00o2 = this.f83027OooO0O0;
        c24549OooO00o.f83118OooO00o = c24549OooO00o2.f83118OooO00o;
        c24549OooO00o.f83119OooO0O0 = c24549OooO00o2.f83119OooO0O0;
        C24549OooO00o c24549OooO00o3 = c24544OooO0o0.f83050OooO0o0;
        C24549OooO00o c24549OooO00o4 = this.f83034OooOO0;
        c24549OooO00o4.getClass();
        c24549OooO00o4.f83118OooO00o = c24549OooO00o3.f83118OooO00o;
        c24549OooO00o4.f83119OooO0O0 = c24549OooO00o3.f83119OooO0O0;
        C24549OooO00o c24549OooO00o5 = c24544OooO0o0.f83049OooO0o;
        C24549OooO00o c24549OooO00o6 = this.f83035OooOO0O;
        c24549OooO00o6.getClass();
        c24549OooO00o6.f83118OooO00o = c24549OooO00o5.f83118OooO00o;
        c24549OooO00o6.f83119OooO0O0 = c24549OooO00o5.f83119OooO0O0;
        C24549OooO00o c24549OooO00o7 = c24544OooO0o0.f83051OooO0oO;
        C24549OooO00o c24549OooO00o8 = this.f83036OooOO0o;
        c24549OooO00o8.getClass();
        c24549OooO00o8.f83118OooO00o = c24549OooO00o7.f83118OooO00o;
        c24549OooO00o8.f83119OooO0O0 = c24549OooO00o7.f83119OooO0O0;
        this.f83039OooOOOO = c24544OooO0o0.f83052OooO0oo;
        double d2 = c24544OooO0o0.f83044OooO;
        double dHypot = Math.hypot(c24549OooO00o4.f83118OooO00o, c24549OooO00o4.f83119OooO0O0) / this.f83033OooO0oo;
        int i3 = this.f83037OooOOO;
        if (i3 != 1) {
            f2 = 0.1f;
            f = 0.0f;
        } else {
            f = 2.0f;
            f2 = 0.02f;
        }
        double d3 = 0.0f;
        double d4 = f2;
        double dMin = (1.0d - Math.min(1.0d, Math.max((Math.hypot(c24549OooO00o8.f83118OooO00o, c24549OooO00o8.f83119OooO0O0) - d4) / (((double) 0.2f) - d4), 0.0d))) * Math.min(1.0d, Math.max((dHypot - d3) / (((double) f) - d3), 0.0d));
        int i4 = this.f83043OooOOoo;
        if (i4 == 2) {
            dMin = 1.0d;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = {new MotionEvent.PointerProperties()};
        int i5 = 0;
        MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr[0];
        pointerProperties.id = this.f83038OooOOO0;
        pointerProperties.toolType = i3;
        int iCeil = (int) Math.ceil((((double) i) / this.f83033OooO0oo) * dMin);
        int i6 = this.f83032OooO0oO;
        if (i6 != -1 && iCeil > i6) {
            iCeil = i6;
        }
        if (i4 == 1) {
            iCeil = Math.max(iCeil, 1);
        }
        double d5 = this.f83028OooO0OO;
        double d6 = this.f83033OooO0oo + d5;
        int i7 = 0;
        MotionEvent motionEventObtain = null;
        while (true) {
            double d7 = d6;
            d = d5;
            d5 = d7;
            if (i7 >= iCeil && d5 > this.f83029OooO0Oo) {
                motionEvent = motionEventObtain;
                break;
            }
            int i8 = i5;
            motionEvent = motionEventObtain;
            double d8 = (c24549OooO00o8.f83118OooO00o * 0.10000000149011612d) + c24549OooO00o6.f83118OooO00o;
            c24549OooO00o6.f83118OooO00o = d8;
            double d9 = (c24549OooO00o8.f83119OooO0O0 * 0.10000000149011612d) + c24549OooO00o6.f83119OooO0O0;
            c24549OooO00o6.f83119OooO0O0 = d9;
            double d10 = (d8 * 0.5d) + c24549OooO00o4.f83118OooO00o;
            c24549OooO00o4.f83118OooO00o = d10;
            double d11 = (0.5d * d9) + c24549OooO00o4.f83119OooO0O0;
            c24549OooO00o4.f83119OooO0O0 = d11;
            c24549OooO00o.f83118OooO00o = (d10 * 1.0d) + c24549OooO00o.f83118OooO00o;
            c24549OooO00o.f83119OooO0O0 = (d11 * 1.0d) + c24549OooO00o.f83119OooO0O0;
            double d12 = this.f83039OooOOOO + d2;
            this.f83039OooOOOO = d12;
            if (d12 >= 0.0d) {
                if (d12 > 1.0d) {
                    this.f83039OooOOOO = 1.0d;
                }
                if (!this.f83041OooOOo && this.f83039OooOOOO < 0.1d && d5 > this.f83029OooO0Oo) {
                    break;
                }
                MotionEvent.PointerCoords[] pointerCoordsArr = {new MotionEvent.PointerCoords()};
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
                pointerCoords.x = (float) c24549OooO00o.f83118OooO00o;
                pointerCoords.y = (float) c24549OooO00o.f83119OooO0O0;
                pointerCoords.pressure = (float) this.f83039OooOOOO;
                pointerCoords.orientation = (float) this.f83040OooOOOo;
                pointerCoords.setAxisValue(25, (float) this.f83042OooOOo0);
                if (motionEvent != null) {
                    motionEventObtain = MotionEvent.obtain(this.f83031OooO0o0, (long) d5, 2, 1, pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                } else {
                    motionEventObtain = motionEvent;
                    motionEventObtain.addBatch((long) d5, pointerCoordsArr, i8);
                }
                d6 = this.f83033OooO0oo + d5;
                i7++;
                i5 = i8;
            } else {
                this.f83039OooOOOO = 0.0d;
            }
            if (!this.f83041OooOOo) {
            }
            MotionEvent.PointerCoords[] pointerCoordsArr2 = {new MotionEvent.PointerCoords()};
            MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr2[i8];
            pointerCoords2.x = (float) c24549OooO00o.f83118OooO00o;
            pointerCoords2.y = (float) c24549OooO00o.f83119OooO0O0;
            pointerCoords2.pressure = (float) this.f83039OooOOOO;
            pointerCoords2.orientation = (float) this.f83040OooOOOo;
            pointerCoords2.setAxisValue(25, (float) this.f83042OooOOo0);
            if (motionEvent != null) {
            }
            d6 = this.f83033OooO0oo + d5;
            i7++;
            i5 = i8;
        }
        this.f83029OooO0Oo = d;
        return motionEvent;
    }
}
