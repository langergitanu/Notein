package o0O0o00;

import OooOo.C20481OooOOoo;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.ink.authoring.InProgressShapesView;
import androidx.ink.authoring.InProgressStrokesView;
import androidx.ink.authoring.internal.C21954OooOO0o;
import androidx.ink.authoring.internal.OooOO0;
import androidx.ink.strokes.C21970OooO0oo;
import androidx.ink.strokes.StrokeInput;
import androidx.ink.strokes.StrokeInputBatchNative;
import com.orion.editor.PDFView;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o000O.C24359OooO0Oo;
import o000O.OooO00o;
import o000O0oO.C24409OooO00o;
import o000O0oO.C24410OooO0Oo;
import o000O0oO.InterfaceC24411OooO0o0;
import o000O0oo.C24442Oooo00o;
import o00oo0OO.C25683OooO0OO;
import o0oo0O0o.InterfaceC31224OooO00o;
import o0oo0OO.C31225OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: o0O0o00.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25927OooOo implements InterfaceC31224OooO00o {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static boolean f88498OooOO0o = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InProgressStrokesView f88500OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PDFView f88501OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f88502OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f88503OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f88505OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C24410OooO0Oo f88504OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConcurrentHashMap<C24410OooO0Oo, InkStrokeInfo> f88506OooO0oO = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ConcurrentHashMap<C24410OooO0Oo, Matrix> f88507OooO0oo = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ConcurrentHashMap<C24410OooO0Oo, Map<String, Float>> f88499OooO = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f88508OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO00o f88509OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: o0O0o00.OooOo$OooO00o */
    public class OooO00o implements InterfaceC24411OooO0o0 {
        public OooO00o() {
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x028b  */
        @Override // o000O0oO.InterfaceC24411OooO0o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o(LinkedHashMap linkedHashMap) {
            C24409OooO00o<androidx.ink.strokes.OooOOO0> c24409OooO00o;
            Iterator it;
            C24410OooO0Oo c24410OooO0Oo;
            int i;
            Matrix matrix;
            boolean z;
            androidx.ink.strokes.OooOOO0 oooOOO0;
            float f;
            int i2;
            Matrix matrix2;
            Matrix matrix3;
            int i3;
            float f2;
            float f3;
            float f4;
            float f5;
            int i4;
            boolean z2;
            boolean z3;
            long j;
            float f6;
            int i5;
            Matrix matrix4;
            int i6;
            boolean z4;
            C25927OooOo c25927OooOo = C25927OooOo.this;
            c25927OooOo.f88506OooO0oO.clear();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                C24410OooO0Oo c24410OooO0Oo2 = (C24410OooO0Oo) entry.getKey();
                androidx.ink.strokes.OooOOO0 stroke = (androidx.ink.strokes.OooOOO0) entry.getValue();
                Matrix matrixRemove = c25927OooOo.f88507OooO0oo.remove(c24410OooO0Oo2);
                if (matrixRemove == null) {
                    C34406OooO00o.f123390OooO00o.OooOO0O("StrokeToWorldTransform is null for strokeId: %s", c24410OooO0Oo2);
                    matrixRemove = new Matrix();
                }
                Matrix matrix5 = matrixRemove;
                Map<String, Float> mapRemove = c25927OooOo.f88499OooO.remove(c24410OooO0Oo2);
                if (C25927OooOo.f88498OooOO0o) {
                    float[] fArr = new float[9];
                    matrix5.getValues(fArr);
                    float fAbs = (Math.abs(fArr[4]) + Math.abs(fArr[0])) / 2.0f;
                    if (fAbs < 1.0E-6f) {
                        fAbs = 1.0f;
                    }
                    kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
                    o000OO00.OooO0O0 oooO0O0 = stroke.f65486OooO00o;
                    String strOooO00o = oooO0O0.f82632OooO0O0.OooO00o();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, "notein-pencil-v1") || kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, "notein-pencil-v2") || kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, "notein-pencil-v2") || kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, "notein-rainbow-v1") || kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, "notein-rainbow-v2") || kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, "notein-rainbow-v2")) {
                        it = it2;
                        oooOOO0 = stroke;
                        c24410OooO0Oo = c24410OooO0Oo2;
                        i = 0;
                        matrix = matrix5;
                        z = true;
                    } else {
                        androidx.ink.strokes.OooO00o oooO00o = stroke.f65488OooO0OO;
                        int iOooO0OO = oooO00o.OooO0OO();
                        if (iOooO0OO < 12) {
                            it = it2;
                            oooOOO0 = stroke;
                            c24410OooO0Oo = c24410OooO0Oo2;
                            i = 0;
                            matrix2 = matrix5;
                            z = true;
                        } else {
                            ArrayList arrayList = new ArrayList(iOooO0OO);
                            float[] fArr2 = new float[iOooO0OO];
                            i = 0;
                            float[] fArr3 = new float[iOooO0OO];
                            z = true;
                            StrokeInput strokeInput = new StrokeInput();
                            int i7 = 0;
                            while (i7 < iOooO0OO) {
                                oooO00o.OooO0o0(i7, strokeInput);
                                StrokeInput strokeInput2 = new StrokeInput();
                                strokeInput2.OooO00o(strokeInput.f65490OooO00o, strokeInput.f65491OooO0O0, strokeInput.f65495OooO0o0, strokeInput.f65494OooO0o, strokeInput.f65496OooO0oO, strokeInput.f65497OooO0oo, strokeInput.f65492OooO0OO, strokeInput.f65493OooO0Oo);
                                arrayList.add(strokeInput2);
                                fArr2[i7] = strokeInput2.f65490OooO00o;
                                fArr3[i7] = strokeInput2.f65491OooO0O0;
                                i7++;
                                it2 = it2;
                                stroke = stroke;
                            }
                            it = it2;
                            oooOOO0 = stroke;
                            boolean[] zArr = new boolean[iOooO0OO];
                            zArr[0] = true;
                            int i8 = iOooO0OO - 1;
                            zArr[i8] = true;
                            float fMax = Math.max(1.0f, Math.max(oooO0O0.OooO0o(), 1.0E-4f) * fAbs);
                            c24410OooO0Oo = c24410OooO0Oo2;
                            float fMax2 = Math.max(1.0E-4f, Math.min(0.1f, C31225OooO00o.f111349OooO00o / (fMax * ((float) Math.sqrt(fMax)))));
                            C31225OooO00o.OooO00o(fArr2, fArr3, 0, i8, fMax2, zArr);
                            if (BrushFamilyProvider.InkBrushFamilyId.INSTANCE.isFountain(oooO0O0.f82632OooO0O0.OooO00o())) {
                                float fMax3 = Math.max(1.0f, Math.max(oooO0O0.OooO0o(), 1.0E-4f) * fAbs);
                                float fMax4 = Math.max(1.0E-4f, Math.min(0.1f, 1.2f / (fMax3 * ((float) Math.sqrt(fMax3)))));
                                int size = arrayList.size();
                                float f7 = -1.0f;
                                float f8 = -1.0f;
                                i2 = 0;
                                int i9 = 1;
                                while (i9 < size) {
                                    StrokeInput strokeInput3 = (StrokeInput) arrayList.get(i9 - 1);
                                    StrokeInput strokeInput4 = (StrokeInput) arrayList.get(i9);
                                    float f9 = strokeInput3.f65494OooO0o;
                                    if (f9 == f7) {
                                        f3 = f7;
                                    } else {
                                        f3 = f7;
                                        float f10 = strokeInput4.f65494OooO0o;
                                        boolean z5 = f10 != f3 && Math.abs(f10 - f9) > fMax4;
                                        f4 = strokeInput3.f65496OooO0oO;
                                        if (f4 != f3) {
                                            float f11 = strokeInput4.f65496OooO0oO;
                                            if (f11 != f3 && Math.abs(f11 - f4) > 0.08f) {
                                                z5 = true;
                                            }
                                        }
                                        f5 = strokeInput3.f65497OooO0oo;
                                        if (f5 != f3) {
                                            i4 = size;
                                            z2 = z5;
                                            z3 = z2;
                                        } else {
                                            float f12 = strokeInput4.f65497OooO0oo;
                                            if (f12 != f3) {
                                                float fAbs2 = Math.abs(f12 - f5);
                                                i4 = size;
                                                z2 = z5;
                                                if (fAbs2 > 3.141592653589793d) {
                                                    fAbs2 = 6.2831855f - fAbs2;
                                                }
                                                if (fAbs2 > 0.12f) {
                                                    z3 = true;
                                                }
                                            }
                                            z3 = z2;
                                        }
                                        j = strokeInput4.f65492OooO0OO - strokeInput3.f65492OooO0OO;
                                        if (j > 0) {
                                            f6 = fMax4;
                                            i5 = i9;
                                            matrix4 = matrix5;
                                            i6 = i4;
                                            z4 = true;
                                        } else {
                                            f6 = fMax4;
                                            float f13 = strokeInput4.f65490OooO00o - strokeInput3.f65490OooO00o;
                                            float f14 = strokeInput4.f65491OooO0O0 - strokeInput3.f65491OooO0O0;
                                            boolean z6 = z3;
                                            i5 = i9;
                                            double d = f13;
                                            matrix4 = matrix5;
                                            i6 = i4;
                                            float fHypot = ((float) Math.hypot(d, f14)) / j;
                                            if (f8 < 0.0f || fHypot <= 1.0E-4f || f8 <= 1.0E-4f) {
                                                z4 = z6;
                                                f8 = fHypot;
                                            } else {
                                                if (Math.abs(fHypot - f8) / Math.max(fHypot, f8) > 0.4f) {
                                                    z4 = true;
                                                }
                                                f8 = fHypot;
                                            }
                                        }
                                        if (!z4 && !zArr[i5]) {
                                            zArr[i5] = true;
                                            i2++;
                                        }
                                        i9 = i5 + 1;
                                        matrix5 = matrix4;
                                        f7 = f3;
                                        fMax4 = f6;
                                        size = i6;
                                    }
                                    f4 = strokeInput3.f65496OooO0oO;
                                    if (f4 != f3) {
                                    }
                                    f5 = strokeInput3.f65497OooO0oo;
                                    if (f5 != f3) {
                                    }
                                    j = strokeInput4.f65492OooO0OO - strokeInput3.f65492OooO0OO;
                                    if (j > 0) {
                                    }
                                    if (!z4) {
                                    }
                                    i9 = i5 + 1;
                                    matrix5 = matrix4;
                                    f7 = f3;
                                    fMax4 = f6;
                                    size = i6;
                                }
                                f = fMax4;
                            } else {
                                f = 0.0f;
                                i2 = 0;
                            }
                            matrix2 = matrix5;
                            int i10 = 0;
                            for (int i11 = 0; i11 < iOooO0OO; i11++) {
                                if (zArr[i11]) {
                                    i10++;
                                }
                            }
                            if (i10 != iOooO0OO) {
                                C21970OooO0oo c21970OooO0oo = new C21970OooO0oo();
                                int i12 = 0;
                                while (i12 < iOooO0OO) {
                                    if (zArr[i12]) {
                                        Object obj = arrayList.get(i12);
                                        kotlin.jvm.internal.OooOOO0.OooO0o(obj, "get(...)");
                                        StrokeInput strokeInput5 = (StrokeInput) obj;
                                        i3 = i12;
                                        f2 = f;
                                        matrix3 = matrix2;
                                        c21970OooO0oo.OooO0oO(strokeInput5.f65490OooO00o, strokeInput5.f65491OooO0O0, strokeInput5.f65495OooO0o0, strokeInput5.f65494OooO0o, strokeInput5.f65496OooO0oO, strokeInput5.f65497OooO0oo, strokeInput5.f65492OooO0OO, strokeInput5.f65493OooO0Oo);
                                    } else {
                                        matrix3 = matrix2;
                                        i3 = i12;
                                        f2 = f;
                                    }
                                    i12 = i3 + 1;
                                    c21970OooO0oo = c21970OooO0oo;
                                    f = f2;
                                    matrix2 = matrix3;
                                }
                                matrix = matrix2;
                                float f15 = f;
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("RdpStrokeSimplifier");
                                int i13 = iOooO0OO - i10;
                                c20358OooO00o.OooOO0("RDP simplify: %d -> %d points (saved=%d, %.1f%%, protected=%d, eps=%.4f, pDelta=%.4f)", Integer.valueOf(iOooO0OO), Integer.valueOf(i10), Integer.valueOf(i13), Float.valueOf((i13 * 100.0f) / iOooO0OO), Integer.valueOf(i2), Float.valueOf(fMax2), Float.valueOf(f15));
                                stroke = new androidx.ink.strokes.OooOOO0(oooO0O0, c21970OooO0oo);
                            }
                        }
                        matrix = matrix2;
                    }
                    stroke = oooOOO0;
                } else {
                    it = it2;
                    c24410OooO0Oo = c24410OooO0Oo2;
                    i = 0;
                    matrix = matrix5;
                    z = true;
                }
                if (c25927OooOo.f88508OooOO0) {
                    o000OO00.OooO0O0 oooO0O02 = stroke.f65486OooO00o;
                    stroke = stroke.OooO00o(o000OO00.OooO0O0.OooO00o(oooO0O02, C25927OooOo.OooO0Oo(oooO0O02.OooO0O0())));
                }
                androidx.ink.strokes.OooOOO0 oooOOO02 = stroke;
                Matrix matrix6 = matrix;
                int i14 = i;
                InkStrokeInfo inkStrokeInfo = new InkStrokeInfo(UUID.randomUUID().toString(), oooOOO02, matrix6, new Matrix(), LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis(), mapRemove);
                InkStrokeInfo inkStrokeInfo2 = new InkStrokeInfo(inkStrokeInfo.getId(), new androidx.ink.strokes.OooOOO0(oooOOO02.f65486OooO00o, new C21970OooO0oo()), new Matrix(matrix6), new Matrix(), LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis(), mapRemove);
                List listSingletonList = Collections.singletonList(inkStrokeInfo);
                List list = Collections.EMPTY_LIST;
                DrawResult drawResult = new DrawResult(3, inkStrokeInfo2, listSingletonList, list, list, false, false, new Point(i14, i14), new RectF(), false, null);
                ConcurrentHashMap<C24410OooO0Oo, InkStrokeInfo> concurrentHashMap = c25927OooOo.f88506OooO0oO;
                C24410OooO0Oo c24410OooO0Oo3 = c24410OooO0Oo;
                concurrentHashMap.put(c24410OooO0Oo3, inkStrokeInfo);
                c25927OooOo.f88501OooO0O0.Oooo0(drawResult, UUID.randomUUID().toString(), z);
                concurrentHashMap.remove(c24410OooO0Oo3);
                it2 = it;
            }
            Set strokeIds = linkedHashMap.keySet();
            InProgressStrokesView inProgressStrokesView = c25927OooOo.f88500OooO00o;
            inProgressStrokesView.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(strokeIds, "strokeIds");
            InProgressShapesView<o000OO00.OooO0O0, o000O0oO.OooO, androidx.ink.strokes.OooOOO0> inProgressShapesView = inProgressStrokesView.f65173OooOo0o;
            inProgressShapesView.getClass();
            Iterator it3 = strokeIds.iterator();
            while (it3.hasNext()) {
                inProgressShapesView.f65163OooOooo.remove((C24410OooO0Oo) it3.next());
            }
            InProgressShapesView<o000OO00.OooO0O0, o000O0oO.OooO, androidx.ink.strokes.OooOOO0>.OooO00o oooO00o2 = inProgressShapesView.f65160OooOoo;
            if (oooO00o2 == null || (c24409OooO00o = oooO00o2.f65165OooO00o) == null) {
                return;
            }
            Iterator it4 = strokeIds.iterator();
            while (it4.hasNext()) {
                c24409OooO00o.f82417OooOo.remove((C24410OooO0Oo) it4.next());
            }
            c24409OooO00o.invalidate();
        }
    }

    public C25927OooOo(Context context) {
        InProgressStrokesView inProgressStrokesView = new InProgressStrokesView(context);
        inProgressStrokesView.setTextureBitmapStore(new C25683OooO0OO());
        this.f88500OooO00o = inProgressStrokesView;
    }

    public static int OooO0Oo(int i) {
        return (i & ViewCompat.MEASURED_STATE_MASK) | ((255 - ((i >> 16) & 255)) << 16) | ((255 - ((i >> 8) & 255)) << 8) | (255 - (i & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(MotionEvent motionEvent, MotionEvent motionEvent2) {
        androidx.ink.authoring.internal.OooOO0<o000OO00.OooO0O0, InProgressShapeT, androidx.ink.strokes.OooOOO0> oooOO02;
        MotionEvent motionEvent3;
        int iFindPointerIndex;
        int i;
        C24410OooO0Oo c24410OooO0Oo;
        long j;
        C21954OooOO0o c21954OooOO0o;
        int iFindPointerIndex2;
        C25927OooOo c25927OooOo = this;
        MotionEvent motionEvent4 = motionEvent;
        MotionEvent motionEvent5 = motionEvent2;
        int i2 = c25927OooOo.f88505OooO0o0;
        C24410OooO0Oo c24410OooO0Oo2 = c25927OooOo.f88504OooO0o;
        if (i2 == -1 || c24410OooO0Oo2 == null) {
            throw new IllegalStateException("PointerId or StrokeId is null");
        }
        int i3 = 0;
        while (i3 < motionEvent4.getPointerCount()) {
            if (motionEvent4.getPointerId(i3) != i2) {
                i = i3;
                c24410OooO0Oo = c24410OooO0Oo2;
            } else {
                InProgressStrokesView inProgressStrokesView = c25927OooOo.f88500OooO00o;
                inProgressStrokesView.getClass();
                InProgressShapesView<o000OO00.OooO0O0, o000O0oO.OooO, androidx.ink.strokes.OooOOO0> inProgressShapesView = inProgressStrokesView.f65173OooOo0o;
                inProgressShapesView.getClass();
                InProgressShapesView<o000OO00.OooO0O0, o000O0oO.OooO, androidx.ink.strokes.OooOOO0>.OooO00o oooO00o = inProgressShapesView.f65160OooOoo;
                if (oooO00o != null && (oooOO02 = oooO00o.f65167OooO0OO) != 0) {
                    if (motionEvent5 != null) {
                        if (motionEvent5.getEventTime() == 0) {
                            Log.e("InProgressStrokesView", "prediction motionevent has eventTime = 0L and is being ignored.");
                        } else {
                            int historySize = motionEvent5.getHistorySize();
                            for (int i4 = 0; i4 < historySize; i4++) {
                                if (motionEvent5.getHistoricalEventTime(i4) == 0) {
                                    Log.e("InProgressStrokesView", "Prediction motionevent has historicalEventTime[" + i4 + "] = 0L and is being ignored.");
                                }
                            }
                            motionEvent3 = motionEvent5;
                            long jLongValue = oooOO02.f65268OooO0o.invoke().longValue();
                            OooOO0.OooOo0.C21953OooO0Oo c21953OooO0OoOooO0O0 = oooOO02.OooO0O0(c24410OooO0Oo2);
                            c21953OooO0OoOooO0O0.getClass();
                            iFindPointerIndex = motionEvent4.findPointerIndex(i2);
                            if (iFindPointerIndex < 0) {
                                throw new IllegalArgumentException(Oooo0oO.o0Oo0oo.OooO0O0(i2, "Pointer id ", " is not present in event.").toString());
                            }
                            C21954OooOO0o c21954OooOO0o2 = oooOO02.f65275OooOOO;
                            OooOO0.OooO0O0 oooO0O0Poll = c21954OooOO0o2.f65333OooO0Oo.f65283OooO00o.poll();
                            if (oooO0O0Poll == null) {
                                oooO0O0Poll = new OooOO0.OooO0O0(null);
                            }
                            OooOO0.OooO0O0 oooO0O0 = oooO0O0Poll;
                            Matrix matrix = c21953OooO0OoOooO0O0.f65315OooO00o;
                            C24410OooO0Oo c24410OooO0Oo3 = c24410OooO0Oo2;
                            MotionEvent motionEvent6 = motionEvent3;
                            i = i3;
                            c21954OooOO0o2.f65335OooO0o0.OooO0O0(motionEvent4, iFindPointerIndex, matrix, c21953OooO0OoOooO0O0.f65316OooO0O0, c21953OooO0OoOooO0O0.f65317OooO0OO, null, null, null, oooO0O0.f65278OooO00o);
                            C21970OooO0oo c21970OooO0oo = oooO0O0.f65278OooO00o;
                            if (c21970OooO0oo.OooO0Oo()) {
                                c24410OooO0Oo = c24410OooO0Oo3;
                                j = jLongValue;
                            } else {
                                OooO00o.C24358OooO0Oo c24358OooO0Oo = OooO00o.C24358OooO0Oo.f82157OooO0OO;
                                C34426OooOO0o<o000O.OooO00o> c34426OooOO0o = oooO0O0.f65281OooO0Oo;
                                c24410OooO0Oo = c24410OooO0Oo3;
                                j = jLongValue;
                                oooOO02.f65272OooOO0.OooO0O0(motionEvent, c24358OooO0Oo, c24410OooO0Oo, j, false, c34426OooOO0o);
                            }
                            C21970OooO0oo c21970OooO0oo2 = oooO0O0.f65279OooO0O0;
                            if (!c21970OooO0oo2.OooO0Oo()) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (!oooO0O0.f65282OooO0o0.isEmpty()) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (motionEvent6 == null || c21970OooO0oo.OooO0Oo() || (iFindPointerIndex2 = motionEvent6.findPointerIndex(i2)) < 0) {
                                c21954OooOO0o = c21954OooOO0o2;
                            } else {
                                StrokeInputBatchNative strokeInputBatchNative = StrokeInputBatchNative.f65498OooO00o;
                                c21954OooOO0o = c21954OooOO0o2;
                                c21954OooOO0o.f65335OooO0o0.OooO0O0(motionEvent6, iFindPointerIndex2, matrix, c21953OooO0OoOooO0O0.f65316OooO0O0, c21953OooO0OoOooO0O0.f65317OooO0OO, Boolean.valueOf(strokeInputBatchNative.hasPressure(c21970OooO0oo.OooO0O0())), Boolean.valueOf(strokeInputBatchNative.hasTilt(c21970OooO0oo.OooO0O0())), Boolean.valueOf(strokeInputBatchNative.hasOrientation(c21970OooO0oo.OooO0O0())), oooO0O0.f65279OooO0O0);
                                if (!c21970OooO0oo2.OooO0Oo()) {
                                    oooOO02.f65272OooOO0.OooO0O0(motionEvent6, OooO00o.C24358OooO0Oo.f82158OooO0Oo, c24410OooO0Oo, j, true, oooO0O0.f65282OooO0o0);
                                }
                            }
                            oooO0O0.f65280OooO0OO = c24410OooO0Oo;
                            if (c21970OooO0oo.OooO0Oo() && c21970OooO0oo2.OooO0Oo()) {
                                c21954OooOO0o.f65333OooO0Oo.OooO00o(oooO0O0);
                            } else {
                                oooOO02.OooOOo0(oooO0O0);
                            }
                        }
                        motionEvent3 = null;
                        long jLongValue2 = oooOO02.f65268OooO0o.invoke().longValue();
                        OooOO0.OooOo0.C21953OooO0Oo c21953OooO0OoOooO0O02 = oooOO02.OooO0O0(c24410OooO0Oo2);
                        c21953OooO0OoOooO0O02.getClass();
                        iFindPointerIndex = motionEvent4.findPointerIndex(i2);
                        if (iFindPointerIndex < 0) {
                        }
                    } else {
                        motionEvent3 = null;
                        long jLongValue22 = oooOO02.f65268OooO0o.invoke().longValue();
                        OooOO0.OooOo0.C21953OooO0Oo c21953OooO0OoOooO0O022 = oooOO02.OooO0O0(c24410OooO0Oo2);
                        c21953OooO0OoOooO0O022.getClass();
                        iFindPointerIndex = motionEvent4.findPointerIndex(i2);
                        if (iFindPointerIndex < 0) {
                        }
                    }
                }
            }
            i3 = i + 1;
            c25927OooOo = this;
            motionEvent4 = motionEvent;
            motionEvent5 = motionEvent2;
            c24410OooO0Oo2 = c24410OooO0Oo;
        }
    }

    public final void OooO0O0(MotionEvent motionEvent) {
        InProgressStrokesView inProgressStrokesView = this.f88500OooO00o;
        if (inProgressStrokesView == null) {
            return;
        }
        ConcurrentHashMap<C24410OooO0Oo, Map<String, Float>> concurrentHashMap = this.f88499OooO;
        ConcurrentHashMap<C24410OooO0Oo, Matrix> concurrentHashMap2 = this.f88507OooO0oo;
        if (motionEvent != null) {
            if (motionEvent.getPointerId(motionEvent.getActionIndex()) != this.f88505OooO0o0) {
                throw new IllegalStateException("PointerId does not match");
            }
            this.f88505OooO0o0 = -1;
            C24410OooO0Oo c24410OooO0Oo = this.f88504OooO0o;
            this.f88504OooO0o = null;
            if (c24410OooO0Oo == null) {
                throw new IllegalStateException("StrokeId is null");
            }
            concurrentHashMap2.remove(c24410OooO0Oo);
            concurrentHashMap.remove(c24410OooO0Oo);
            inProgressStrokesView.OooO00o(c24410OooO0Oo, motionEvent);
            return;
        }
        C24410OooO0Oo c24410OooO0Oo2 = this.f88504OooO0o;
        int i = this.f88505OooO0o0;
        if (c24410OooO0Oo2 == null || i == -1) {
            return;
        }
        this.f88504OooO0o = null;
        this.f88505OooO0o0 = -1;
        concurrentHashMap2.remove(c24410OooO0Oo2);
        concurrentHashMap.remove(c24410OooO0Oo2);
        inProgressStrokesView.getClass();
        inProgressStrokesView.OooO00o(c24410OooO0Oo2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        r21 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO(MotionEvent motionEvent) {
        char c;
        int i;
        int iNumberOfTrailingZeros;
        androidx.ink.authoring.internal.OooOO0<o000OO00.OooO0O0, InProgressShapeT, androidx.ink.strokes.OooOOO0> oooOO02;
        MotionEvent motionEvent2 = motionEvent;
        int pointerId = motionEvent2.getPointerId(motionEvent2.getActionIndex());
        if (pointerId != this.f88505OooO0o0) {
            throw new IllegalStateException("PointerId does not match");
        }
        this.f88505OooO0o0 = -1;
        C24410OooO0Oo c24410OooO0Oo = this.f88504OooO0o;
        this.f88504OooO0o = null;
        if (c24410OooO0Oo == null) {
            throw new IllegalStateException("StrokeId is null");
        }
        InProgressStrokesView inProgressStrokesView = this.f88500OooO00o;
        inProgressStrokesView.getClass();
        InProgressShapesView<o000OO00.OooO0O0, o000O0oO.OooO, androidx.ink.strokes.OooOOO0> inProgressShapesView = inProgressStrokesView.f65173OooOo0o;
        inProgressShapesView.getClass();
        C20481OooOOoo<C24410OooO0Oo> c20481OooOOoo = inProgressShapesView.f65164Oooo000;
        c20481OooOOoo.getClass();
        int iHashCode = Integer.hashCode(pointerId) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = c20481OooOOoo.f58483OooO0Oo;
        char c2 = 7;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = c20481OooOOoo.f58480OooO00o;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            c = c2;
            long j = (jArr[i7] >>> i8) | (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8)));
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                i = 8;
                if (c20481OooOOoo.f58481OooO0O0[iNumberOfTrailingZeros] == pointerId) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            motionEvent2 = motionEvent;
            c2 = c;
        }
        if (iNumberOfTrailingZeros < 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(c20481OooOOoo.f58482OooO0OO[iNumberOfTrailingZeros], c24410OooO0Oo)) {
            long[] jArr2 = c20481OooOOoo.f58480OooO00o;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j4 = jArr2[i9];
                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j4) < 128) {
                                int i12 = (i9 << 3) + i11;
                                int i13 = c20481OooOOoo.f58481OooO0O0[i12];
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0((C24410OooO0Oo) c20481OooOOoo.f58482OooO0OO[i12], c24410OooO0Oo)) {
                                    c20481OooOOoo.OooO0o(i12);
                                }
                            }
                            j4 >>= i;
                        }
                        if (i10 != i) {
                            break;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        i = 8;
                    }
                }
            }
        } else {
            c20481OooOOoo.OooO0o(iNumberOfTrailingZeros);
        }
        InProgressShapesView<o000OO00.OooO0O0, o000O0oO.OooO, androidx.ink.strokes.OooOOO0>.OooO00o oooO00o = inProgressShapesView.f65160OooOoo;
        if (oooO00o != null && (oooOO02 = oooO00o.f65167OooO0OO) != 0) {
            long jLongValue = oooOO02.f65268OooO0o.invoke().longValue();
            C24442Oooo00o.OooO00o();
            OooOO0.OooOo0 oooOo0 = (OooOO0.OooOo0) oooOO02.f65273OooOO0O.f65340OooO00o.get(c24410OooO0Oo);
            if (oooOo0 instanceof OooOO0.OooOo0.C21953OooO0Oo) {
                OooOO0.OooOo0.C21953OooO0Oo c21953OooO0Oo = (OooOO0.OooOo0.C21953OooO0Oo) oooOo0;
                c21953OooO0Oo.getClass();
                int iFindPointerIndex = motionEvent2.findPointerIndex(pointerId);
                if (iFindPointerIndex < 0) {
                    throw new IllegalArgumentException(Oooo0oO.o0Oo0oo.OooO0O0(pointerId, "Pointer id ", " is not present in event.").toString());
                }
                o000O0oo.Oooo000 oooo000 = oooOO02.f65275OooOOO.f65335OooO0o0;
                Matrix matrix = c21953OooO0Oo.f65315OooO00o;
                oooo000.getClass();
                androidx.ink.authoring.internal.OooOO0.OooO0oO(oooOO02, oooo000.OooO0OO(motionEvent2, iFindPointerIndex, motionEvent2.getHistorySize(), matrix, c21953OooO0Oo.f65316OooO0O0, c21953OooO0Oo.f65317OooO0OO, null, null, null), c24410OooO0Oo, motionEvent.getEventTime(), C24359OooO0Oo.OooO0OO(oooOO02.f65272OooOO0, motionEvent, OooO00o.C24358OooO0Oo.f82160OooO0o0, c24410OooO0Oo, jLongValue), 8);
            }
        }
        inProgressStrokesView.performClick();
    }

    public final void OooO0o() {
        InProgressStrokesView inProgressStrokesView = this.f88500OooO00o;
        inProgressStrokesView.f65174OooOoO0.clear();
        OooO00o listener = this.f88509OooOO0O;
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        inProgressStrokesView.f65174OooOoO0.add(listener);
    }

    public final void OooO0o0() {
        if (this.f88503OooO0Oo) {
            this.f88503OooO0Oo = false;
            this.f88500OooO00o.setVisibility(0);
            OooO0o();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("InProgressStrokeViewWrapper");
            c20358OooO00o.OooO0o0("Resume InProgressStrokesView after split resize", new Object[0]);
        }
    }
}
