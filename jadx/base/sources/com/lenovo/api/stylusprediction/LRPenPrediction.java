package com.lenovo.api.stylusprediction;

import OooO0O0.C20396OooO0oO;
import OooO0O0.OooO0O0;
import OooOoO.C20509OooO0oo;
import Oooo0.C20855OooooOO;
import Oooo0.C20856OooooOo;
import android.graphics.PointF;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.StyleIdentifier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class LRPenPrediction {
    private static final int MAX_BUFFER_SIZE = 24;
    private C20396OooO0oO calc;
    private boolean couldPrediction;
    private List<TouchPointP> fwPointBuffer;
    private int logLevel;
    private boolean pen_report_rate_initialed;
    private List<PointF> pointBuffer;
    private List<Long> timeBuffer;
    private final String LOG_LEVEL_STR = "vendor.debug.pen.predict.logLevel";
    private int report_rate_level = 240;
    private int add_count = 0;
    private int max_press = 0;
    private int newest_press = 0;

    public LRPenPrediction() {
        this.logLevel = 0;
        DebugMsg("Call LRPenPrediction constructor");
        C20396OooO0oO c20396OooO0oO = new C20396OooO0oO();
        c20396OooO0oO.f58151OooO00o = null;
        c20396OooO0oO.f58152OooO0O0 = new float[]{0.0f, 0.2f, 0.3f, 0.35f};
        c20396OooO0oO.f58153OooO0OO = new float[]{-1.0f, -0.98f, -0.95f, -0.9f, -0.8f};
        c20396OooO0oO.f58154OooO0Oo = new float[][]{new float[]{1.4375f, -0.5625f, 0.0625f, 0.0625f}, new float[]{1.875f, -1.125f, 0.125f, 0.125f}, new float[]{2.3125f, -1.6875f, 0.1875f, 0.1875f}, new float[]{2.6666667f, -2.5f, 1.0f, -0.16666667f}, new float[]{3.1527777f, -3.2916667f, 1.375f, -0.2361111f}, new float[]{3.6388888f, -4.0833335f, 1.75f, -0.30555555f}, new float[]{3.9166667f, -4.375f, 1.75f, -0.29166666f}, new float[]{4.611111f, -5.6666665f, 2.5f, -0.44444445f}, new float[]{4.75f, -5.625f, 2.25f, -0.375f}, new float[]{5.3055553f, -6.5833335f, 2.75f, -0.4722222f}, new float[]{5.7222223f, -7.2222223f, 3.0f, -0.5f}};
        c20396OooO0oO.f58156OooO0o0 = true;
        c20396OooO0oO.f58150OooO = 240;
        c20396OooO0oO.f58159OooOO0 = new PointF(0.0f, 0.0f);
        c20396OooO0oO.f58160OooOO0O = 0.0f;
        c20396OooO0oO.f58161OooOO0o = 0.0f;
        c20396OooO0oO.f58164OooOOOO = 0L;
        c20396OooO0oO.f58165OooOOOo = 80L;
        c20396OooO0oO.f58167OooOOo0 = 120L;
        c20396OooO0oO.f58166OooOOo = 180L;
        c20396OooO0oO.f58168OooOOoo = false;
        c20396OooO0oO.f58171OooOo00 = 0;
        c20396OooO0oO.f58170OooOo0 = 0.0f;
        c20396OooO0oO.f58172OooOo0O = 0.0f;
        c20396OooO0oO.f58173OooOo0o = 0;
        c20396OooO0oO.f58169OooOo = 0;
        c20396OooO0oO.f58175OooOoO0 = false;
        c20396OooO0oO.f58174OooOoO = 0;
        c20396OooO0oO.f58176OooOoOO = null;
        c20396OooO0oO.f58176OooOoOO = new ArrayList();
        c20396OooO0oO.f58151OooO00o = new PointF[4];
        c20396OooO0oO.f58158OooO0oo = PreSysProp.get("vendor.debug.pen.predict.algo.logSwitch", 0);
        this.calc = c20396OooO0oO;
        this.couldPrediction = false;
        this.fwPointBuffer = new ArrayList();
        this.pointBuffer = new ArrayList();
        this.timeBuffer = new ArrayList();
        setTailingFilter(true, new float[]{0.0f, 0.3f, 0.35f, 0.4f}, new float[]{-1.0f, -0.9995f, -0.92f, -0.87f, -0.77f});
        this.logLevel = PreSysProp.get("vendor.debug.pen.predict.logLevel", 0);
    }

    private void DebugMsg(String str) {
        if (this.logLevel >= 4) {
            Log.d("LRPenPrediction:DEBUG", str);
        }
    }

    private void ErrorMsg(String str) {
        Log.e("LRPenPrediction", str);
    }

    private void InfoMsg(String str) {
        Log.i("LRPenPrediction", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0911  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<TouchPointP> getEstimatedPointList() {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        float fOooO00o;
        int i3;
        float f7;
        float f8;
        float f9;
        float f10;
        float fOooO00o2;
        float f11;
        long j;
        float f12;
        float f13;
        float f14;
        float f15;
        long j2;
        double d;
        double d2;
        String str;
        DebugMsg("Call getEstimatedPointList()");
        ArrayList arrayList2 = new ArrayList();
        if (this.fwPointBuffer.size() == 0) {
            str = "getEstimatedPointList failed : no point exist in buffer";
        } else {
            if (this.couldPrediction) {
                if (this.fwPointBuffer.size() >= 16) {
                    if (this.newest_press * 3 < this.max_press * 2) {
                        str = "pen will lift : prediction stop";
                    } else if (!this.pen_report_rate_initialed && this.add_count > 10) {
                        calcPenReportRate();
                        setReportRate(this.report_rate_level);
                    }
                }
                C20396OooO0oO c20396OooO0oO = this.calc;
                List<PointF> list = this.pointBuffer;
                c20396OooO0oO.f58176OooOoOO = list;
                if (c20396OooO0oO.f58168OooOOoo) {
                    c20396OooO0oO.f58168OooOOoo = false;
                    c20396OooO0oO.f58159OooOO0 = list.get(0);
                }
                if (c20396OooO0oO.f58176OooOoOO.size() < 24) {
                    String str2 = "size: " + list.size();
                    if (c20396OooO0oO.f58158OooO0oo >= 1) {
                        Log.d("POINTBUFFSIZE", str2);
                    }
                    c20396OooO0oO.f58151OooO00o = new PointF[0];
                    arrayList = arrayList2;
                } else {
                    c20396OooO0oO.f58151OooO00o = new PointF[]{(PointF) OooO0O0.OooO0O0(1, list)};
                    if (c20396OooO0oO.f58156OooO0o0) {
                        int i4 = c20396OooO0oO.f58155OooO0o;
                        c20396OooO0oO.OooO0O0("LenovoFiltering", "call LenovoFiltering");
                        for (int size = c20396OooO0oO.f58176OooOoOO.size() - 1; size > 0; size--) {
                            if (c20396OooO0oO.f58176OooOoOO.get(size).x != c20396OooO0oO.f58159OooOO0.x && c20396OooO0oO.f58176OooOoOO.get(size).y != c20396OooO0oO.f58159OooOO0.y) {
                                c20396OooO0oO.f58164OooOOOO++;
                            }
                        }
                        PointF[] pointFArr = new PointF[3];
                        pointFArr[0] = c20396OooO0oO.f58159OooOO0;
                        PointF pointF = c20396OooO0oO.f58176OooOoOO.get(0);
                        pointFArr[1] = pointF;
                        PointF pointF2 = pointFArr[0];
                        if (pointF2.x == pointF.x && pointF2.y == pointF.y) {
                            pointFArr[1] = c20396OooO0oO.f58176OooOoOO.get(7);
                        }
                        pointFArr[2] = (PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO);
                        if (c20396OooO0oO.OooO0o0(pointFArr)[0] > -0.995f) {
                            PointF pointF3 = c20396OooO0oO.f58176OooOoOO.get(0);
                            c20396OooO0oO.f58159OooOO0 = pointF3;
                            pointFArr[0] = pointF3;
                            pointFArr[1] = c20396OooO0oO.f58176OooOoOO.get(7);
                        }
                        PointF[] pointFArr2 = {c20396OooO0oO.f58159OooOO0, (PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO)};
                        c20396OooO0oO.f58172OooOo0O += C20396OooO0oO.OooO0Oo(pointFArr2[0], pointFArr2[1])[0];
                        float f16 = C20396OooO0oO.OooO0Oo(c20396OooO0oO.f58159OooOO0, pointFArr[2])[0];
                        c20396OooO0oO.f58170OooOo0 = f16;
                        if (f16 >= 100.0f || c20396OooO0oO.f58172OooOo0O >= 400.0f) {
                            if (c20396OooO0oO.f58169OooOo != 2) {
                                c20396OooO0oO.f58175OooOoO0 = true;
                            } else {
                                c20396OooO0oO.f58175OooOoO0 = false;
                            }
                            c20396OooO0oO.f58169OooOo = 2;
                            c20396OooO0oO.f58173OooOo0o = 0;
                        }
                        float f17 = (((PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO)).x + ((PointF) OooO0O0.OooO0O0(5, c20396OooO0oO.f58176OooOoOO)).x) - (((PointF) OooO0O0.OooO0O0(3, c20396OooO0oO.f58176OooOoOO)).x * 2.0f);
                        float f18 = (((PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO)).y + ((PointF) OooO0O0.OooO0O0(5, c20396OooO0oO.f58176OooOoOO)).y) - (((PointF) OooO0O0.OooO0O0(3, c20396OooO0oO.f58176OooOoOO)).y * 2.0f);
                        float f19 = (((PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO)).x - ((PointF) OooO0O0.OooO0O0(4, c20396OooO0oO.f58176OooOoOO)).x) / 3.0f;
                        float f20 = (((PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO)).y - ((PointF) OooO0O0.OooO0O0(4, c20396OooO0oO.f58176OooOoOO)).y) / 3.0f;
                        float fHypot = (float) Math.hypot(f19, f20);
                        float f21 = f17 * f19;
                        if (f21 > 0.0f) {
                            z = false;
                            z2 = true;
                        } else if (f21 < 0.0f) {
                            z2 = false;
                            z = true;
                        } else {
                            z = false;
                            z2 = false;
                        }
                        float f22 = f18 * f20;
                        if (f22 > 0.0f) {
                            z3 = false;
                            z4 = true;
                        } else if (f22 < 0.0f) {
                            z4 = false;
                            z3 = true;
                        } else {
                            z3 = false;
                            z4 = false;
                        }
                        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("interval 2 avg_x=", f19, ", avg_y=", f20, ", acc_x=");
                        sbOooO0Oo.append(f17);
                        sbOooO0Oo.append(", acc_y=");
                        sbOooO0Oo.append(f18);
                        c20396OooO0oO.OooO0O0("LenovoFiltering===", sbOooO0Oo.toString());
                        if (fHypot < 1.0f) {
                            fHypot = 1.0f;
                        }
                        float f23 = C20396OooO0oO.OooO0Oo(pointFArr[0], pointFArr[2])[0];
                        float f24 = (f23 * 6.0f) / fHypot;
                        if (f24 < 80) {
                            f = 6.0f;
                            i = 0;
                        } else if (f24 < 160) {
                            f = 6.0f;
                            i = 1;
                        } else if (f24 < 200) {
                            f = 6.0f;
                            i = 2;
                        } else if (f24 < 300) {
                            f = 6.0f;
                            i = 3;
                        } else {
                            c20396OooO0oO.f58171OooOo00 = 0;
                            f = 6.0f;
                            i = 4;
                        }
                        arrayList = arrayList2;
                        c20396OooO0oO.OooO0O0("LenovoFiltering===", "sPoint[0].x=" + pointFArr[0].x + ", levels=" + f24 + ", dis1=" + f23 + ", straightLevel=" + i);
                        PointF pointF4 = new PointF(0.0f, 0.0f);
                        List<PointF> list2 = c20396OooO0oO.f58176OooOoOO;
                        List<PointF> list3 = c20396OooO0oO.f58176OooOoOO;
                        List<PointF> list4 = c20396OooO0oO.f58176OooOoOO;
                        PointF[] pointFArr3 = {(PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO), list2.get((list2.size() - 1) - i4), list3.get((list3.size() - 1) - (i4 * 2)), list4.get((list4.size() - 1) - (i4 * 3))};
                        PointF pointF5 = (PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO);
                        List<PointF> list5 = c20396OooO0oO.f58176OooOoOO;
                        float f25 = c20396OooO0oO.OooO0o0(new PointF[]{pointF5, list5.get((list5.size() - 1) - c20396OooO0oO.f58157OooO0oO), c20396OooO0oO.f58176OooOoOO.get((r13.size() - 1) - (c20396OooO0oO.f58157OooO0oO * 2))})[1];
                        if (f25 == -1.0f) {
                            c20396OooO0oO.OooO0O0("LenovoFiltering", "irregular case");
                            c20396OooO0oO.f58151OooO00o = new PointF[0];
                            c20396OooO0oO.f58160OooOO0O = 0.0f;
                            c20396OooO0oO.f58161OooOO0o = 0.0f;
                            c20396OooO0oO.f58171OooOo00++;
                        } else {
                            int i5 = c20396OooO0oO.f58150OooO;
                            if (i5 != 360) {
                                fHypot = (fHypot * i5) / 360.0f;
                            }
                            if (fHypot <= 4.0f) {
                                f2 = 8.0f;
                                f3 = 360.0f;
                                f4 = 32.0f;
                                f5 = 32.0f;
                            } else if (fHypot < 8.0f) {
                                f3 = 360.0f;
                                f5 = 28.0f;
                                f2 = 8.0f;
                                f4 = 28.0f;
                            } else {
                                if (fHypot < 15.0f) {
                                    f2 = 8.0f;
                                    f3 = 360.0f;
                                    f4 = 24.0f;
                                } else {
                                    f2 = 8.0f;
                                    f3 = 360.0f;
                                    f4 = 16.0f;
                                }
                                f5 = f4;
                            }
                            c20396OooO0oO.OooO0O0("LenovoFiltering===", "before straight latency_x =" + f4 + " latency_y =" + f5);
                            float f26 = fHypot;
                            boolean z5 = z;
                            long j3 = c20396OooO0oO.f58164OooOOOO;
                            long j4 = c20396OooO0oO.f58167OooOOo0;
                            if (j3 > j4 && i == 1) {
                                f4 -= 4.0f;
                                f5 -= 4.0f;
                            }
                            if (j3 > j4 && i == 0) {
                                f4 -= f2;
                                f5 -= f2;
                            }
                            if (j3 > j4) {
                                f6 = 10.0f;
                                if (i >= 2) {
                                    f4 += 10.0f;
                                    f5 += 10.0f;
                                }
                            } else {
                                f6 = 10.0f;
                            }
                            if (j3 < j4 && i < 1 && f26 > 3.0f) {
                                f4 -= 4.0f;
                                f5 -= 4.0f;
                            }
                            if (j3 > j4 && i == 0 && (f4 > 16.0f || f5 > 16.0f)) {
                                f4 = 16.0f;
                                f5 = 16.0f;
                            }
                            c20396OooO0oO.OooO0O0("LenovoFiltering===", "before curve latency_x =" + f4 + " latency_y =" + f5);
                            float[] fArr = c20396OooO0oO.f58152OooO0O0;
                            if (f25 == fArr[1]) {
                                if (f4 > 24.0f) {
                                    f4 -= 4.0f;
                                }
                                if (f5 > 24.0f) {
                                    f5 -= 4.0f;
                                }
                            } else if (f25 >= fArr[2]) {
                                f4 = c20396OooO0oO.f58164OooOOOO < c20396OooO0oO.f58167OooOOo0 ? 24.0f : 16.0f;
                                f5 = f4;
                            }
                            c20396OooO0oO.OooO0O0("LenovoFiltering===", "after curve latency_x =" + f4 + " latency_y =" + f5);
                            if ((z5 || z3) && (Math.abs(f17) > 1.0f || Math.abs(f18) > 1.0f)) {
                                f4 -= f2;
                                f5 -= f2;
                            }
                            if ((z2 || z4) && (Math.abs(f17) > 1.0f || Math.abs(f18) > 1.0f)) {
                                if (c20396OooO0oO.f58164OooOOOO > c20396OooO0oO.f58165OooOOOo) {
                                    f4 += f2;
                                    f5 += f2;
                                } else {
                                    f4 += 4.0f;
                                    f5 += 4.0f;
                                }
                            }
                            if (Math.abs(f17) > 12.0f || Math.abs(f18) > 12.0f) {
                                c20396OooO0oO.OooO0O0("LenovoFiltering", "irregular case -- change too fast");
                                c20396OooO0oO.f58151OooO00o = new PointF[0];
                                c20396OooO0oO.f58160OooOO0O = 0.0f;
                                c20396OooO0oO.f58161OooOO0o = 0.0f;
                            } else {
                                StringBuilder sbOooO0Oo2 = C20509OooO0oo.OooO0Oo("after acc latency_x =", f4, " latency_y =", f5, " irregular_cnt = ");
                                sbOooO0Oo2.append(c20396OooO0oO.f58171OooOo00);
                                c20396OooO0oO.OooO0O0("LenovoFiltering===", sbOooO0Oo2.toString());
                                if (i >= 2) {
                                    if (f25 == c20396OooO0oO.f58152OooO0O0[0]) {
                                        f4 += 2.0f;
                                        f5 += 2.0f;
                                    }
                                    i2 = 1;
                                } else {
                                    i2 = 1;
                                    if (f25 >= c20396OooO0oO.f58152OooO0O0[1]) {
                                        f4 -= 4.0f;
                                        f5 -= 4.0f;
                                    }
                                }
                                int i6 = c20396OooO0oO.f58171OooOo00;
                                if (i6 >= i2) {
                                    float f27 = f4 - 4.0f;
                                    float f28 = f5 - 4.0f;
                                    if (i6 < 3) {
                                        fOooO00o = f27;
                                        f5 = f28;
                                    } else if (f27 >= 12.0f) {
                                        fOooO00o = f2;
                                        f5 = fOooO00o;
                                    } else {
                                        fOooO00o = f27 - 4.0f;
                                        f5 = f28 - 4.0f;
                                    }
                                } else {
                                    fOooO00o = f4;
                                }
                                c20396OooO0oO.OooO0O0("LenovoFiltering===", "before project custom latency_x =" + fOooO00o + " latency_y =" + f5);
                                int i7 = c20396OooO0oO.f58150OooO;
                                if (i7 != 360) {
                                    float f29 = i7;
                                    fOooO00o = (fOooO00o * f29) / f3;
                                    f5 = (f5 * f29) / f3;
                                }
                                c20396OooO0oO.OooO0O0("LenovoFiltering===", "after project custom latency_x =" + fOooO00o + " latency_y =" + f5);
                                c20396OooO0oO.OooO0O0("LenovoFiltering===", "write mode " + c20396OooO0oO.f58169OooOo + " write_mode_change = " + c20396OooO0oO.f58175OooOoO0);
                                int i8 = c20396OooO0oO.f58169OooOo;
                                if (i8 != 0) {
                                    if (i8 == 1) {
                                        fOooO00o = 0.0f;
                                        f5 = 0.0f;
                                    } else if (i8 == 2 && c20396OooO0oO.f58175OooOoO0) {
                                        c20396OooO0oO.f58160OooOO0O = fOooO00o;
                                        c20396OooO0oO.f58161OooOO0o = f5;
                                    }
                                } else if (fOooO00o >= 16.0f) {
                                    fOooO00o = 12.0f;
                                    f5 = 12.0f;
                                }
                                int iOooO0oO = c20396OooO0oO.OooO0oO();
                                if (iOooO0oO != 0) {
                                    i3 = 2;
                                    if (iOooO0oO == 1) {
                                        fOooO00o += 4.0f;
                                        f5 += 4.0f;
                                    } else if (iOooO0oO == 2) {
                                    }
                                    if (iOooO0oO <= i3 && c20396OooO0oO.f58174OooOoO > i3) {
                                        c20396OooO0oO.f58160OooOO0O = fOooO00o;
                                        c20396OooO0oO.f58161OooOO0o = f5;
                                    }
                                    c20396OooO0oO.f58174OooOoO = iOooO0oO;
                                    f7 = c20396OooO0oO.f58160OooOO0O;
                                    if (f7 != 0.0f) {
                                        fOooO00o = (fOooO00o + f7) / 2.0f;
                                    }
                                    f8 = c20396OooO0oO.f58161OooOO0o;
                                    if (f8 != 0.0f) {
                                        f5 = (f5 + f8) / 2.0f;
                                    }
                                    if (c20396OooO0oO.f58169OooOo == 2 && i == 4 && f25 == c20396OooO0oO.f58152OooO0O0[0] && Math.abs(fOooO00o - f7) <= 4.0f) {
                                        int i9 = c20396OooO0oO.f58150OooO;
                                        fOooO00o = i9 == 360 ? C20855OooooOO.OooO00o(i9, 44.0f, f3, 3.0f) : 44.0f;
                                        f5 = fOooO00o;
                                    }
                                    c20396OooO0oO.f58160OooOO0O = fOooO00o;
                                    c20396OooO0oO.f58161OooOO0o = f5;
                                    c20396OooO0oO.OooO0O0("LenovoFiltering*******", "after filter: final latency_x =" + fOooO00o + " latency_y =" + f5);
                                    float[] fArrOooO0OO = c20396OooO0oO.OooO0OO((long) fOooO00o);
                                    float[] fArrOooO0OO2 = c20396OooO0oO.OooO0OO((long) f5);
                                    float f30 = fArrOooO0OO[0];
                                    PointF pointF6 = pointFArr3[0];
                                    float f31 = f30 * pointF6.x;
                                    float f32 = fArrOooO0OO[1];
                                    PointF pointF7 = pointFArr3[1];
                                    float f33 = (f32 * pointF7.x) + f31;
                                    float f34 = fArrOooO0OO[2];
                                    PointF pointF8 = pointFArr3[2];
                                    float f35 = (f34 * pointF8.x) + f33;
                                    float f36 = fArrOooO0OO[3];
                                    PointF pointF9 = pointFArr3[3];
                                    float f37 = (f36 * pointF9.x) + f35;
                                    pointF4.x = f37;
                                    float f38 = (fArrOooO0OO2[3] * pointF9.y) + (fArrOooO0OO2[2] * pointF8.y) + (fArrOooO0OO2[1] * pointF7.y) + (fArrOooO0OO2[0] * pointF6.y);
                                    pointF4.y = f38;
                                    PointF pointF10 = c20396OooO0oO.f58163OooOOO0;
                                    f9 = pointF10.x;
                                    if (f9 == 0.0f) {
                                        float f39 = pointF10.y;
                                        if (f39 != 0.0f) {
                                            PointF pointF11 = c20396OooO0oO.f58162OooOOO;
                                            float f40 = pointF11.x;
                                            if (f40 != 0.0f) {
                                                float f41 = pointF11.y;
                                                if (f41 == 0.0f) {
                                                    f10 = 5.0f;
                                                    float f42 = f6;
                                                    pointF4.x = C20855OooooOO.OooO00o(pointF6.x, 1.0f, f42, (f37 * 9.0f) / f6);
                                                    fOooO00o2 = C20855OooooOO.OooO00o(pointF6.y, 1.0f, f42, (f38 * 9.0f) / f42);
                                                } else if (f26 < f6) {
                                                    pointF4.x = C20855OooooOO.OooO00o(f40, 1.0f, 32.0f, C20855OooooOO.OooO00o(f9, 3.0f, 32.0f, (f37 * 7.0f) / f2));
                                                    pointF4.y = C20855OooooOO.OooO00o(f41, 1.0f, 32.0f, C20855OooooOO.OooO00o(f39, 3.0f, 32.0f, (f38 * 7.0f) / f2));
                                                    f10 = 5.0f;
                                                    c20396OooO0oO.OooO0O0("LenovoFiltering==smooth", "point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                    if (f25 >= c20396OooO0oO.f58152OooO0O0[1] || f25 == 1.0f) {
                                                        f11 = fOooO00o;
                                                    } else {
                                                        if (f26 > 30.0f) {
                                                            f15 = f25 * f10;
                                                        } else if (f26 > 20.0f) {
                                                            f15 = f25 * 3.0f;
                                                        } else {
                                                            if (f26 > 15.0f) {
                                                                f13 = f25 * 2.0f;
                                                            } else if (f26 > 8.0f) {
                                                                f14 = (f25 * 1.0f) / 2.0f;
                                                                j2 = c20396OooO0oO.f58164OooOOOO;
                                                                if (j2 < c20396OooO0oO.f58167OooOOo0) {
                                                                    d = f14;
                                                                    d2 = 0.2d;
                                                                } else {
                                                                    if (j2 < c20396OooO0oO.f58166OooOOo) {
                                                                        d = f14;
                                                                        d2 = 0.1d;
                                                                    }
                                                                    if (f26 > 45.0f) {
                                                                        f14 = 0.3f;
                                                                    }
                                                                    if (c20396OooO0oO.f58172OooOo0O >= 400.0f) {
                                                                        f14 = (f14 * 1.0f) / 2.0f;
                                                                    }
                                                                    double d3 = f14;
                                                                    float fPow = (float) ((Math.pow(d3, 4.0d) * ((double) pointFArr3[3].x)) + (Math.pow(d3, 3.0d) * ((double) pointFArr3[2].x)) + (Math.pow(d3, 2.0d) * ((double) pointFArr3[1].x)) + ((double) ((pointFArr3[0].x * f14) + pointF4.x)));
                                                                    f11 = fOooO00o;
                                                                    float fPow2 = (float) ((Math.pow(d3, 4.0d) * ((double) pointFArr3[3].y)) + (Math.pow(d3, 3.0d) * ((double) pointFArr3[2].y)) + (Math.pow(d3, 2.0d) * ((double) pointFArr3[1].y)) + ((double) ((pointFArr3[0].y * f14) + pointF4.y)));
                                                                    float fPow3 = (float) (Math.pow(d3, 4.0d) + Math.pow(d3, 3.0d) + Math.pow(d3, 2.0d) + ((double) (f14 + 1.0f)));
                                                                    pointF4.x = fPow / fPow3;
                                                                    pointF4.y = fPow2 / fPow3;
                                                                    c20396OooO0oO.OooO0O0("LenovoFiltering===", "param = " + f14 + " point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                                }
                                                                f14 = (float) (d + d2);
                                                                if (f26 > 45.0f) {
                                                                }
                                                                if (c20396OooO0oO.f58172OooOo0O >= 400.0f) {
                                                                }
                                                                double d32 = f14;
                                                                float fPow4 = (float) ((Math.pow(d32, 4.0d) * ((double) pointFArr3[3].x)) + (Math.pow(d32, 3.0d) * ((double) pointFArr3[2].x)) + (Math.pow(d32, 2.0d) * ((double) pointFArr3[1].x)) + ((double) ((pointFArr3[0].x * f14) + pointF4.x)));
                                                                f11 = fOooO00o;
                                                                float fPow22 = (float) ((Math.pow(d32, 4.0d) * ((double) pointFArr3[3].y)) + (Math.pow(d32, 3.0d) * ((double) pointFArr3[2].y)) + (Math.pow(d32, 2.0d) * ((double) pointFArr3[1].y)) + ((double) ((pointFArr3[0].y * f14) + pointF4.y)));
                                                                float fPow32 = (float) (Math.pow(d32, 4.0d) + Math.pow(d32, 3.0d) + Math.pow(d32, 2.0d) + ((double) (f14 + 1.0f)));
                                                                pointF4.x = fPow4 / fPow32;
                                                                pointF4.y = fPow22 / fPow32;
                                                                c20396OooO0oO.OooO0O0("LenovoFiltering===", "param = " + f14 + " point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                            } else {
                                                                f13 = f25 * 1.0f;
                                                            }
                                                            f14 = f13 / 3.0f;
                                                            j2 = c20396OooO0oO.f58164OooOOOO;
                                                            if (j2 < c20396OooO0oO.f58167OooOOo0) {
                                                            }
                                                            f14 = (float) (d + d2);
                                                            if (f26 > 45.0f) {
                                                            }
                                                            if (c20396OooO0oO.f58172OooOo0O >= 400.0f) {
                                                            }
                                                            double d322 = f14;
                                                            float fPow42 = (float) ((Math.pow(d322, 4.0d) * ((double) pointFArr3[3].x)) + (Math.pow(d322, 3.0d) * ((double) pointFArr3[2].x)) + (Math.pow(d322, 2.0d) * ((double) pointFArr3[1].x)) + ((double) ((pointFArr3[0].x * f14) + pointF4.x)));
                                                            f11 = fOooO00o;
                                                            float fPow222 = (float) ((Math.pow(d322, 4.0d) * ((double) pointFArr3[3].y)) + (Math.pow(d322, 3.0d) * ((double) pointFArr3[2].y)) + (Math.pow(d322, 2.0d) * ((double) pointFArr3[1].y)) + ((double) ((pointFArr3[0].y * f14) + pointF4.y)));
                                                            float fPow322 = (float) (Math.pow(d322, 4.0d) + Math.pow(d322, 3.0d) + Math.pow(d322, 2.0d) + ((double) (f14 + 1.0f)));
                                                            pointF4.x = fPow42 / fPow322;
                                                            pointF4.y = fPow222 / fPow322;
                                                            c20396OooO0oO.OooO0O0("LenovoFiltering===", "param = " + f14 + " point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                        }
                                                        f14 = f15 / 4.0f;
                                                        j2 = c20396OooO0oO.f58164OooOOOO;
                                                        if (j2 < c20396OooO0oO.f58167OooOOo0) {
                                                        }
                                                        f14 = (float) (d + d2);
                                                        if (f26 > 45.0f) {
                                                        }
                                                        if (c20396OooO0oO.f58172OooOo0O >= 400.0f) {
                                                        }
                                                        double d3222 = f14;
                                                        float fPow422 = (float) ((Math.pow(d3222, 4.0d) * ((double) pointFArr3[3].x)) + (Math.pow(d3222, 3.0d) * ((double) pointFArr3[2].x)) + (Math.pow(d3222, 2.0d) * ((double) pointFArr3[1].x)) + ((double) ((pointFArr3[0].x * f14) + pointF4.x)));
                                                        f11 = fOooO00o;
                                                        float fPow2222 = (float) ((Math.pow(d3222, 4.0d) * ((double) pointFArr3[3].y)) + (Math.pow(d3222, 3.0d) * ((double) pointFArr3[2].y)) + (Math.pow(d3222, 2.0d) * ((double) pointFArr3[1].y)) + ((double) ((pointFArr3[0].y * f14) + pointF4.y)));
                                                        float fPow3222 = (float) (Math.pow(d3222, 4.0d) + Math.pow(d3222, 3.0d) + Math.pow(d3222, 2.0d) + ((double) (f14 + 1.0f)));
                                                        pointF4.x = fPow422 / fPow3222;
                                                        pointF4.y = fPow2222 / fPow3222;
                                                        c20396OooO0oO.OooO0O0("LenovoFiltering===", "param = " + f14 + " point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                    }
                                                    if (c20396OooO0oO.f58169OooOo == 2 && i >= 2 && iOooO0oO <= 1 && f26 <= 10.0f) {
                                                        double[] dArrOooO0o = c20396OooO0oO.OooO0o();
                                                        float f43 = (float) dArrOooO0o[0];
                                                        f12 = (float) dArrOooO0o[1];
                                                        float f44 = (float) dArrOooO0o[2];
                                                        float f45 = (float) dArrOooO0o[3];
                                                        if (f12 != 0.0f) {
                                                            pointF4.x = pointFArr3[0].x;
                                                        } else if (f43 == 0.0f) {
                                                            pointF4.y = pointFArr3[0].y;
                                                        } else {
                                                            float f46 = (((pointF4.y - f45) * f44) + pointF4.x) / ((f44 * f44) + 1.0f);
                                                            pointF4.x = f46;
                                                            pointF4.y = (f44 * f46) + f45;
                                                        }
                                                    }
                                                    if (f11 <= 8.0f) {
                                                        pointFArr3[0] = (PointF) OooO0O0.OooO0O0(1, c20396OooO0oO.f58176OooOoOO);
                                                        pointFArr3[1] = (PointF) OooO0O0.OooO0O0(2, c20396OooO0oO.f58176OooOoOO);
                                                        pointFArr3[2] = (PointF) OooO0O0.OooO0O0(3, c20396OooO0oO.f58176OooOoOO);
                                                        pointFArr3[3] = (PointF) OooO0O0.OooO0O0(4, c20396OooO0oO.f58176OooOoOO);
                                                        float[] fArrOooO0OO3 = c20396OooO0oO.OooO0OO(0L);
                                                        if (f11 <= 4.0f) {
                                                            j = f11 > 2.0f ? 16L : 20L;
                                                            float f47 = fArrOooO0OO3[0];
                                                            PointF pointF12 = pointFArr3[0];
                                                            float f48 = pointF12.x * f47;
                                                            float f49 = fArrOooO0OO3[1];
                                                            PointF pointF13 = pointFArr3[1];
                                                            float f50 = (pointF13.x * f49) + f48;
                                                            float f51 = fArrOooO0OO3[2];
                                                            PointF pointF14 = pointFArr3[2];
                                                            float f52 = (pointF14.x * f51) + f50;
                                                            float f53 = fArrOooO0OO3[3];
                                                            PointF pointF15 = pointFArr3[3];
                                                            pointF4.x = (pointF15.x * f53) + f52;
                                                            pointF4.y = (f53 * pointF15.y) + (f51 * pointF14.y) + (f49 * pointF13.y) + (f47 * pointF12.y);
                                                            c20396OooO0oO.OooO0O0("LenovoFiltering===switch", "original predict point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                        }
                                                        fArrOooO0OO3 = c20396OooO0oO.OooO0OO(j);
                                                        float f472 = fArrOooO0OO3[0];
                                                        PointF pointF122 = pointFArr3[0];
                                                        float f482 = pointF122.x * f472;
                                                        float f492 = fArrOooO0OO3[1];
                                                        PointF pointF132 = pointFArr3[1];
                                                        float f502 = (pointF132.x * f492) + f482;
                                                        float f512 = fArrOooO0OO3[2];
                                                        PointF pointF142 = pointFArr3[2];
                                                        float f522 = (pointF142.x * f512) + f502;
                                                        float f532 = fArrOooO0OO3[3];
                                                        PointF pointF152 = pointFArr3[3];
                                                        pointF4.x = (pointF152.x * f532) + f522;
                                                        pointF4.y = (f532 * pointF152.y) + (f512 * pointF142.y) + (f492 * pointF132.y) + (f472 * pointF122.y);
                                                        c20396OooO0oO.OooO0O0("LenovoFiltering===switch", "original predict point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                    }
                                                    PointF pointF16 = c20396OooO0oO.f58162OooOOO;
                                                    PointF pointF17 = c20396OooO0oO.f58163OooOOO0;
                                                    pointF16.x = pointF17.x;
                                                    pointF16.y = pointF17.y;
                                                    pointF17.x = pointF4.x;
                                                    pointF17.y = pointF4.y;
                                                    c20396OooO0oO.f58151OooO00o[0] = pointF4;
                                                } else {
                                                    f10 = 5.0f;
                                                    if (f26 < 15.0f) {
                                                        pointF4.x = C20855OooooOO.OooO00o(f40, 1.0f, 24.0f, C20855OooooOO.OooO00o(f9, 3.0f, 24.0f, (f37 * 5.0f) / f));
                                                        fOooO00o2 = C20855OooooOO.OooO00o(f41, 1.0f, 24.0f, C20855OooooOO.OooO00o(f39, 3.0f, 24.0f, (f38 * 5.0f) / f));
                                                    } else {
                                                        float f54 = f2;
                                                        pointF4.x = C20855OooooOO.OooO00o(pointF6.x, 1.0f, f54, C20855OooooOO.OooO00o(f9, 1.0f, f54, (f37 * 3.0f) / 4.0f));
                                                        fOooO00o2 = C20855OooooOO.OooO00o(pointF6.y, 1.0f, f54, C20855OooooOO.OooO00o(f39, 1.0f, f54, (f38 * 3.0f) / 4.0f));
                                                    }
                                                }
                                                pointF4.y = fOooO00o2;
                                                c20396OooO0oO.OooO0O0("LenovoFiltering==smooth", "point[0].x = " + pointFArr3[0].x + " point[0].y = " + pointFArr3[0].y + " fPredict.x =" + pointF4.x + " fPredict.y = " + pointF4.y);
                                                if (f25 >= c20396OooO0oO.f58152OooO0O0[1]) {
                                                    f11 = fOooO00o;
                                                    if (c20396OooO0oO.f58169OooOo == 2) {
                                                        double[] dArrOooO0o2 = c20396OooO0oO.OooO0o();
                                                        float f432 = (float) dArrOooO0o2[0];
                                                        f12 = (float) dArrOooO0o2[1];
                                                        float f442 = (float) dArrOooO0o2[2];
                                                        float f452 = (float) dArrOooO0o2[3];
                                                        if (f12 != 0.0f) {
                                                        }
                                                    }
                                                    if (f11 <= 8.0f) {
                                                    }
                                                    PointF pointF162 = c20396OooO0oO.f58162OooOOO;
                                                    PointF pointF172 = c20396OooO0oO.f58163OooOOO0;
                                                    pointF162.x = pointF172.x;
                                                    pointF162.y = pointF172.y;
                                                    pointF172.x = pointF4.x;
                                                    pointF172.y = pointF4.y;
                                                    c20396OooO0oO.f58151OooO00o[0] = pointF4;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i3 = 2;
                                }
                                fOooO00o += 2.0f;
                                f5 += 2.0f;
                                if (iOooO0oO <= i3) {
                                    c20396OooO0oO.f58160OooOO0O = fOooO00o;
                                    c20396OooO0oO.f58161OooOO0o = f5;
                                }
                                c20396OooO0oO.f58174OooOoO = iOooO0oO;
                                f7 = c20396OooO0oO.f58160OooOO0O;
                                if (f7 != 0.0f) {
                                }
                                f8 = c20396OooO0oO.f58161OooOO0o;
                                if (f8 != 0.0f) {
                                }
                                if (c20396OooO0oO.f58169OooOo == 2) {
                                    int i92 = c20396OooO0oO.f58150OooO;
                                    if (i92 == 360) {
                                    }
                                    f5 = fOooO00o;
                                }
                                c20396OooO0oO.f58160OooOO0O = fOooO00o;
                                c20396OooO0oO.f58161OooOO0o = f5;
                                c20396OooO0oO.OooO0O0("LenovoFiltering*******", "after filter: final latency_x =" + fOooO00o + " latency_y =" + f5);
                                float[] fArrOooO0OO4 = c20396OooO0oO.OooO0OO((long) fOooO00o);
                                float[] fArrOooO0OO22 = c20396OooO0oO.OooO0OO((long) f5);
                                float f302 = fArrOooO0OO4[0];
                                PointF pointF62 = pointFArr3[0];
                                float f312 = f302 * pointF62.x;
                                float f322 = fArrOooO0OO4[1];
                                PointF pointF72 = pointFArr3[1];
                                float f332 = (f322 * pointF72.x) + f312;
                                float f342 = fArrOooO0OO4[2];
                                PointF pointF82 = pointFArr3[2];
                                float f352 = (f342 * pointF82.x) + f332;
                                float f362 = fArrOooO0OO4[3];
                                PointF pointF92 = pointFArr3[3];
                                float f372 = (f362 * pointF92.x) + f352;
                                pointF4.x = f372;
                                float f382 = (fArrOooO0OO22[3] * pointF92.y) + (fArrOooO0OO22[2] * pointF82.y) + (fArrOooO0OO22[1] * pointF72.y) + (fArrOooO0OO22[0] * pointF62.y);
                                pointF4.y = f382;
                                PointF pointF102 = c20396OooO0oO.f58163OooOOO0;
                                f9 = pointF102.x;
                                if (f9 == 0.0f) {
                                }
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                        PointF pointF18 = new PointF(0.0f, 0.0f);
                        ArrayList arrayList3 = new ArrayList();
                        int i10 = 1;
                        if (c20396OooO0oO.f58158OooO0oo >= 1) {
                            Log.d("PredictionPointCalc", "coef(PRED_LINEAR_BOOST_SAMPLES_0) adapted.");
                        }
                        float[] fArr2 = {2.6666667f, -2.5f, 1.0f, -0.16666667f};
                        int i11 = c20396OooO0oO.f58155OooO0o;
                        String strOooO0OO = C21532OooOOo.OooO0OO(i11, "UpdatePredict1PointLinear: targetIndex = ");
                        if (c20396OooO0oO.f58158OooO0oo >= 1) {
                            Log.d("PredictionPointCalc", strOooO0OO);
                        }
                        int i12 = 0;
                        while (i12 < i11) {
                            List<PointF> list6 = c20396OooO0oO.f58176OooOoOO;
                            float f55 = list6.get((list6.size() - i12) - i10).x;
                            int i13 = i11 - 1;
                            float f56 = c20396OooO0oO.f58176OooOoOO.get(((r6.size() - i12) - 2) - i13).x;
                            int i14 = i13 * 2;
                            float f57 = c20396OooO0oO.f58176OooOoOO.get(((r8.size() - i12) - 3) - i14).x;
                            List<PointF> list7 = c20396OooO0oO.f58176OooOoOO;
                            int i15 = i13 * 3;
                            float[] fArr3 = {f55, f56, f57, list7.get(((list7.size() - i12) - 4) - i15).x};
                            float f58 = c20396OooO0oO.f58176OooOoOO.get((r4.size() - i12) - 1).y;
                            float f59 = c20396OooO0oO.f58176OooOoOO.get(((r6.size() - i12) - 2) - i13).y;
                            float f60 = c20396OooO0oO.f58176OooOoOO.get(((r8.size() - i12) - 3) - i14).y;
                            List<PointF> list8 = c20396OooO0oO.f58176OooOoOO;
                            float[] fArr4 = {f58, f59, f60, list8.get(((list8.size() - i12) - 4) - i15).y};
                            float f61 = fArr2[0];
                            float f62 = fArr3[0] * f61;
                            float f63 = fArr2[1];
                            float f64 = (fArr3[1] * f63) + f62;
                            float f65 = fArr2[2];
                            float f66 = (fArr3[2] * f65) + f64;
                            float f67 = fArr2[3];
                            pointF18.x = (fArr3[3] * f67) + f66;
                            pointF18.y = (f67 * fArr4[3]) + (f65 * fArr4[2]) + (f63 * fArr4[1]) + (f61 * fArr4[0]);
                            arrayList3.add(new PointF(pointF18.x, pointF18.y));
                            i12++;
                            i10 = 1;
                        }
                        c20396OooO0oO.f58151OooO00o = (PointF[]) arrayList3.toArray(new PointF[arrayList3.size() - 1]);
                    }
                }
                PointF[] pointFArr4 = c20396OooO0oO.f58151OooO00o;
                DebugMsg("estimatedPointListSize = " + pointFArr4.length);
                for (int length = pointFArr4.length + (-1); length >= 0; length += -1) {
                    long time = this.fwPointBuffer.get((r3.size() - length) - 1).getTime();
                    float pressure = this.fwPointBuffer.get((r3.size() - length) - 1).getPressure();
                    float tilt = this.fwPointBuffer.get((r3.size() - length) - 1).getTilt();
                    float orientation = this.fwPointBuffer.get((r3.size() - length) - 1).getOrientation();
                    PointF pointF19 = pointFArr4[length];
                    arrayList.add(new TouchPointP(pointF19.x, pointF19.y, time, pressure, tilt, orientation));
                    DebugMsg("tp" + length + "(x = " + pointFArr4[length].x + ", y = " + pointFArr4[length].y + ", time = " + time + ", pressure = " + pressure + ", tilt = " + tilt + ", orientation = " + orientation + ")");
                }
                return arrayList;
            }
            str = "getEstimatedPointList failed : bad condition, could not prediction";
        }
        DebugMsg(str);
        return arrayList2;
    }

    private boolean validPredSamples(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private boolean validStraightLineBoost(int i) {
        return i == 0 || i == 1 || i == 2;
    }

    private boolean validStraightLineJudgeTap(int i) {
        return i == 2 || i == 3 || i == 4;
    }

    public synchronized boolean addPoint(TouchPointP touchPointP) {
        if (touchPointP != null) {
            if (this.couldPrediction) {
                DebugMsg("Call addPoint(X = " + touchPointP.getX() + ", Y = " + touchPointP.getY() + ", time = " + touchPointP.getTime() + ", pressure = " + touchPointP.getPressure() + ", tilt = " + touchPointP.getTilt() + ", orientation = " + touchPointP.getOrientation() + ")");
                if (touchPointP.getPressure() <= 0.0f) {
                    this.fwPointBuffer.clear();
                    this.pointBuffer.clear();
                    this.timeBuffer.clear();
                    DebugMsg("addPoint: pressure<=0, *Buffer.clear() -> *.size=" + this.fwPointBuffer.size());
                    return false;
                }
                this.fwPointBuffer.add(touchPointP);
                this.pointBuffer.add(new PointF(touchPointP.getX(), touchPointP.getY()));
                this.timeBuffer.add(Long.valueOf(touchPointP.getTime()));
                if (this.fwPointBuffer.size() > 24) {
                    this.fwPointBuffer.remove(0);
                    this.pointBuffer.remove(0);
                    this.timeBuffer.remove(0);
                }
                this.add_count++;
                int pressure = (int) touchPointP.getPressure();
                this.newest_press = pressure;
                if (pressure > this.max_press) {
                    this.max_press = pressure;
                }
                return true;
            }
        }
        DebugMsg(touchPointP == null ? "addPoint failed : argument tp = null" : "addPoint failed : bad condition, could not prediction");
        return false;
    }

    public void calcPenReportRate() {
        DebugMsg("call calcPenReportRate: add_point_count = " + this.add_count);
        long j = 0L;
        for (int i = 0; i <= 10; i++) {
            List<TouchPointP> list = this.fwPointBuffer;
            long time = list.get((list.size() - i) - 1).getTime();
            List<TouchPointP> list2 = this.fwPointBuffer;
            float pressure = list2.get((list2.size() - i) - 1).getPressure();
            List<TouchPointP> list3 = this.fwPointBuffer;
            float x = list3.get((list3.size() - i) - 1).getX();
            List<TouchPointP> list4 = this.fwPointBuffer;
            DebugMsg("call calcPenReportRate: frame_t " + i + " is " + time + " pressure is " + pressure + " [x,y]:" + x + "," + list4.get((list4.size() - i) - 1).getY());
            if (time == 0) {
                j++;
            }
        }
        if (j > 5) {
            InfoMsg("FrameTime not set in driver,old project!  use default level");
            this.report_rate_level = 240;
            this.pen_report_rate_initialed = true;
            return;
        }
        if (j >= 1) {
            InfoMsg("get frame time is 0, we need wait next time to initial");
            return;
        }
        float time2 = (((TouchPointP) OooO0O0.OooO0O0(1, this.fwPointBuffer)).getTime() - ((TouchPointP) OooO0O0.OooO0O0(11, this.fwPointBuffer)).getTime()) / 10.0f;
        DebugMsg("call calcPenReportRate: time_interval is " + time2);
        double d = (double) time2;
        if (d < 3.5d) {
            this.report_rate_level = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        }
        if (d > 4.0d && d < 6.0d) {
            this.report_rate_level = 240;
        }
        if (d > 7.0d) {
            this.report_rate_level = 120;
        }
        this.pen_report_rate_initialed = true;
    }

    public void clearPoints() {
        DebugMsg("Call clearPoints()");
        this.fwPointBuffer = new ArrayList();
        this.pointBuffer = new ArrayList();
        this.timeBuffer = new ArrayList();
        this.calc.OooO00o();
        this.add_count = 0;
        this.max_press = 0;
        this.newest_press = 0;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    public TouchPointP getEstimatedPoint() {
        String str;
        DebugMsg("Call getEstimatedPoint");
        TouchPointP touchPointP = null;
        if (!this.couldPrediction) {
            DebugMsg("getEstimatedPoint failed : bad condition, could not prediction");
            return null;
        }
        if (getEstimatedPointList().size() != 0) {
            touchPointP = (TouchPointP) System.currentTimeMillis();
            str = "return TouchPointP(x = " + touchPointP.getX() + ", y = " + touchPointP.getY() + ", time = " + touchPointP.getTime() + ", pressure = " + touchPointP.getPressure() + ", tilt = " + touchPointP.getTilt() + ", orientation = " + touchPointP.getOrientation() + ")";
        } else {
            str = "return null";
        }
        DebugMsg(str);
        this.add_count = 0;
        this.max_press = 0;
        return touchPointP;
    }

    public List<TouchPointP> getPointBuffer() {
        DebugMsg("Call getPointBuffer()");
        return this.fwPointBuffer;
    }

    public boolean initialPrediction(int i, int i2, int i3) {
        DebugMsg(C20856OooooOo.OooO0O0("Call initialPrediction(predSamples = ", i, ", slBoost = ", ")", i2));
        if (!validPredSamples(i) || !validStraightLineBoost(i2) || !validStraightLineJudgeTap(i3)) {
            ErrorMsg("initialPrediction failed : invalid arguments");
            this.couldPrediction = false;
            return false;
        }
        C20396OooO0oO c20396OooO0oO = this.calc;
        c20396OooO0oO.f58155OooO0o = i;
        c20396OooO0oO.f58157OooO0oO = i3;
        c20396OooO0oO.OooO00o();
        this.couldPrediction = true;
        InfoMsg("LRPenPrediction initial succeeded! version is 3.2.3");
        return true;
    }

    public void setReportRate(int i) {
        if (this.pen_report_rate_initialed) {
            C20396OooO0oO c20396OooO0oO = this.calc;
            c20396OooO0oO.f58150OooO = i;
            Log.i("PredictionPointCalc", "pen_report_rate = " + c20396OooO0oO.f58150OooO);
            int i2 = c20396OooO0oO.f58150OooO;
            if (i2 != 360) {
                long j = i2;
                c20396OooO0oO.f58165OooOOOo = (c20396OooO0oO.f58165OooOOOo * j) / 360;
                c20396OooO0oO.f58167OooOOo0 = (c20396OooO0oO.f58167OooOOo0 * j) / 360;
                c20396OooO0oO.f58166OooOOo = (c20396OooO0oO.f58166OooOOo * j) / 360;
            }
        }
    }

    public void setTailingFilter(boolean z, float[] fArr, float[] fArr2) {
        DebugMsg("Call setTailingFilter(tailingFilter = " + z + ", values = " + fArr + ", thresholds = " + fArr2 + ")");
        C20396OooO0oO c20396OooO0oO = this.calc;
        c20396OooO0oO.f58156OooO0o0 = z;
        c20396OooO0oO.f58152OooO0O0 = fArr;
        c20396OooO0oO.f58153OooO0OO = fArr2;
    }
}
