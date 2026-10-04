package com.orion.editor;

import OooOoo.C20593OooO0Oo;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.haptic.ZuiPenHapticManager;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.animation.AccelerateInterpolator;
import androidx.core.util.Pair;
import com.huawei.hms.network.embedded.C18437z2;
import com.oplus.ipemanager.sdk.ISdkAidlInterface;
import com.oplus.ipemanager.sdk.IpeFeature;
import com.orion.editor.C22831OooO0o0;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import kotlin.jvm.internal.OooOOO0;
import o000Oo.InterfaceC24508OooO00o;
import o00O0oOo.C24953OooO0o0;
import o00o0OOo.C25408OooO0OO;
import o0O00000.C25828OooO0Oo;
import o0O0OoO0.C25895OooO00o;
import o0O0o00.C25927OooOo;
import o0O0o00.C25933OooOoO0;
import o0O0o00.C25959Ooooo00;
import o0O0o00.C25960Ooooo0o;
import o0O0o00.C25995o0ooOO0;
import o0O0o00.o000Oo0;
import o0O0o0O.InterfaceC25999OooO00o;
import o0O0o0O.InterfaceC26000OooO0O0;
import o0O0o0O.InterfaceC26001OooO0OO;
import o0O0o0O.InterfaceC26002OooO0Oo;
import o0O0o0o.C26011OooO00o;
import o0O0oooo.C26363OooO0oO;
import o0O0oooo.C26395Oooo0o0;
import o0oo0.C31177OooO00o;
import o0oo0.C31179OooO0OO;
import o0oo0.C31180OooO0Oo;
import o0oo0.C31181OooO0o0;
import o0oo00oO.C31210OooO0OO;
import o0oo00oO.InterfaceC31211OooO0Oo;
import o0oo00oO.InterfaceC31212OooO0o0;
import o0oo00oo.C31217OooO00o;
import o0oo0O0.C31220OooO00o;
import o0oo0O0o.InterfaceC31224OooO00o;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0Oo.C31247OooOO0;
import o0oo0Oo.C31248OooOO0O;
import o0oo0Oo.C31249OooOO0o;
import o0oo0Oo.C31250OooOOO;
import o0oo0Oo.C31251OooOOO0;
import o0oo0Oo.C31252OooOOOO;
import o0oo0Oo.InterfaceC31263OooOoO0;
import o0oo0OoO.AbstractC31268OooO00o;
import o0oo0OoO.C31267OooO;
import o0oo0o.InterfaceC31284OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.editor.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22831OooO0o0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final Set<Integer> f69131OooOoo = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 103, 0, 102, 10, 100, 12, 101, 2, 9, 11)));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f69133OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f69135OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ValueAnimator f69136OooO0Oo;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o000Oo0 f69146OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C31210OooO0OO f69147OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o0oo0.OooO0o f69148OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0oo00oO.OooO0o f69149OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C31177OooO00o f69150OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final VelocityTracker f69152OooOo0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AbstractC31239OooO00o f69134OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f69138OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f69137OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final PointF f69139OooO0oO = new PointF();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final PointF f69140OooO0oo = new PointF();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f69132OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f69141OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f69142OooOO0O = 60.0f;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f69143OooOO0o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f69145OooOOO0 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public double f69144OooOOO = 0.0d;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final RectF f69153OooOo00 = new RectF();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f69154OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f69155OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f69151OooOo = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f69157OooOoO0 = "";

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Optional<PointF> f69156OooOoO = Optional.empty();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Handler f69158OooOoOO = new Handler();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o f69159OooOoo0 = new OooO00o();

    /* JADX INFO: renamed from: com.orion.editor.OooO0o0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C22831OooO0o0 c22831OooO0o0 = C22831OooO0o0.this;
            if (c22831OooO0o0.f69151OooOo == 0) {
                c22831OooO0o0.f69151OooOo = 1;
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.editor.OooO0o0$OooO0O0 */
    public class OooO0O0 implements Animator.AnimatorListener {
        public OooO0O0() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ((com.orion.editor.OooO00o) C22831OooO0o0.this.f69135OooO0OO).f69056OooO00o.OoooOOo();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.orion.editor.OooO0o0$OooO0OO */
    public interface OooO0OO {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C22831OooO0o0(PDFView pDFView, OooO0OO oooO0OO, C31210OooO0OO c31210OooO0OO) {
        o0oo0.OooO0o c31177OooO00o;
        this.f69135OooO0OO = null;
        this.f69148OooOOo = null;
        this.f69150OooOOoo = null;
        this.f69152OooOo0 = null;
        this.f69133OooO00o = pDFView;
        this.f69135OooO0OO = oooO0OO;
        this.f69147OooOOOo = c31210OooO0OO;
        c31210OooO0OO.OooO00o();
        InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = c31210OooO0OO.f111297OooO00o;
        this.f69149OooOOo0 = interfaceC31211OooO0Oo != null ? (o0oo00oO.OooO0o) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111300OooOo) : null;
        this.f69150OooOOoo = new C31177OooO00o(pDFView);
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String upperCase = BRAND.toUpperCase(Locale.ROOT);
        OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("StrokeEstimator");
        c20358OooO00o.OooO0o0(androidx.core.database.OooO00o.OooO00o("getEstimator:product model: ", Build.MODEL, ",brand: ", upperCase, "."), new Object[0]);
        switch (upperCase.hashCode()) {
            case -2053026509:
                if (!upperCase.equals("LENOVO")) {
                    c31177OooO00o = new C31177OooO00o(pDFView);
                } else {
                    OooOOO0.OooO0o(pDFView.getContext(), "getContext(...)");
                    C31220OooO00o c31220OooO00o = new C31220OooO00o();
                    c31220OooO00o.f111345OooOo0o = 0.6f;
                    c20358OooO00o.OooOOO0("LenovoSDKPrediction");
                    c20358OooO00o.OooO00o("LenovoStrokeEstimator initialized.", new Object[0]);
                    c31177OooO00o = c31220OooO00o;
                }
                break;
            case -1706170181:
                if (upperCase.equals("XIAOMI")) {
                    c31177OooO00o = null;
                    break;
                }
                break;
            case -602397472:
                if (upperCase.equals("ONEPLUS")) {
                    try {
                        c31177OooO00o = new C25408OooO0OO();
                    } catch (Throwable th) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("StrokeEstimator");
                        c20358OooO00o2.OooO0Oo(th, "OppoEstimator initialization failed, fallback to DefaultEstimator.", new Object[0]);
                        c31177OooO00o = new C31177OooO00o(pDFView);
                    }
                    break;
                }
                break;
            case 2432928:
                if (!upperCase.equals("OPPO")) {
                }
                break;
            case 2634924:
                if (upperCase.equals("VIVO")) {
                    try {
                        Context context = pDFView.getContext();
                        OooOOO0.OooO0o(context, "getContext(...)");
                        c31177OooO00o = new C24953OooO0o0(context);
                    } catch (Throwable th2) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("StrokeEstimator");
                        c20358OooO00o3.OooO0Oo(th2, "VivoEstimator initialization failed, fallback to DefaultEstimator.", new Object[0]);
                        c31177OooO00o = new C31177OooO00o(pDFView);
                    }
                    break;
                }
                break;
            case 68924490:
                if (upperCase.equals("HONOR")) {
                    c31177OooO00o = !C25828OooO0Oo.OooO00o() ? new C31181OooO0o0() : new C31180OooO0Oo();
                    break;
                }
                break;
            case 2123736608:
                if (upperCase.equals("HANVON")) {
                    C31179OooO0OO c31179OooO0OO = new C31179OooO0OO(pDFView);
                    c31179OooO0OO.OooO0OO(0.1f);
                    c20358OooO00o.OooOOO0("HanvonEstimator");
                    c20358OooO00o.OooO0o0("HanvonEstimator initialized with predictionFactor: 0.1", new Object[0]);
                    c31177OooO00o = c31179OooO0OO;
                    break;
                }
                break;
            case 2141820391:
                if (upperCase.equals("HUAWEI")) {
                    c31177OooO00o = new C31181OooO0o0();
                    break;
                }
                break;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("StrokeEstimator");
        c20358OooO00o4.OooO0o0(C20593OooO0Oo.OooO0O0("StrokeEstimator.getEstimator: ", c31177OooO00o != null ? c31177OooO00o.getClass().getSimpleName() : null, "."), new Object[0]);
        this.f69148OooOOo = c31177OooO00o;
        o0oo00oO.OooO0o oooO0o = this.f69149OooOOo0;
        if (oooO0o != null) {
            this.f69146OooOOOO = new o000Oo0(pDFView, oooO0o);
        } else {
            this.f69146OooOOOO = new o000Oo0(pDFView, c31177OooO00o);
        }
        this.f69152OooOo0 = VelocityTracker.obtain();
    }

    public static MotionEvent OooO00o(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent.PointerProperties[] pointerPropertiesArr, MotionEvent.PointerCoords[] pointerCoordsArr, long j) {
        if (motionEvent2 == null) {
            return MotionEvent.obtain(motionEvent.getDownTime(), j, motionEvent.getAction(), 1, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        }
        motionEvent2.addBatch(j, pointerCoordsArr, motionEvent.getMetaState());
        return motionEvent2;
    }

    public static MotionEvent OooO0o(MotionEvent motionEvent, float f) {
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        int historySize = motionEvent.getHistorySize();
        if (historySize <= 0) {
            for (int i = 0; i < pointerCount; i++) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerPropertiesArr[i] = pointerProperties;
                motionEvent.getPointerProperties(i, pointerProperties);
                pointerPropertiesArr[i].toolType = 2;
                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                pointerCoordsArr[i] = pointerCoords;
                motionEvent.getPointerCoords(i, pointerCoords);
                pointerCoordsArr[i].pressure = f;
            }
            return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        }
        for (int i2 = 0; i2 < pointerCount; i2++) {
            MotionEvent.PointerProperties pointerProperties2 = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i2] = pointerProperties2;
            motionEvent.getPointerProperties(i2, pointerProperties2);
            pointerPropertiesArr[i2].toolType = 2;
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords();
            pointerCoordsArr[i2] = pointerCoords2;
            motionEvent.getHistoricalPointerCoords(i2, 0, pointerCoords2);
            pointerCoordsArr[i2].pressure = f;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getHistoricalEventTime(0), motionEvent.getActionMasked(), pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        for (int i3 = 1; i3 < historySize; i3++) {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                motionEvent.getHistoricalPointerCoords(i4, i3, pointerCoordsArr[i4]);
                pointerCoordsArr[i4].pressure = f;
            }
            motionEventObtain.addBatch(motionEvent.getHistoricalEventTime(i3), pointerCoordsArr, motionEvent.getMetaState());
        }
        for (int i5 = 0; i5 < pointerCount; i5++) {
            motionEvent.getPointerCoords(i5, pointerCoordsArr[i5]);
            pointerCoordsArr[i5].pressure = f;
        }
        motionEventObtain.addBatch(motionEvent.getEventTime(), pointerCoordsArr, motionEvent.getMetaState());
        return motionEventObtain;
    }

    public final boolean OooO(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, int i) {
        if (interfaceC31284OooO0O0 instanceof ShapeInfo) {
            return i == 8 || ((ShapeInfo) interfaceC31284OooO0O0).getType() != 7 || this.f69133OooO00o.f69235o0000ooO;
        }
        return false;
    }

    public final int OooO0O0(float f, float f2, boolean z, PointF pointF) {
        C26011OooO00o rulerConstraintState;
        PDFView pDFView = this.f69133OooO00o;
        if (pDFView == null || this.f69134OooO0O0 == null || (rulerConstraintState = pDFView.getRulerConstraintState()) == null) {
            return 0;
        }
        float fOooO0o = this.f69134OooO0O0.OooO0o();
        if (fOooO0o <= 0.0f) {
            fOooO0o = 1.0f;
        }
        float fMax = Math.max(0.0f, this.f69134OooO0O0.OooO0oo()) * fOooO0o * 0.5f;
        float f3 = rulerConstraintState.f88829OooO00o;
        float f4 = f - f3;
        float f5 = rulerConstraintState.f88830OooO0O0;
        float f6 = f2 - f5;
        float f7 = rulerConstraintState.f88833OooO0o0;
        double d = -f7;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f8 = (f4 * fCos) - (f6 * fSin);
        float f9 = (f6 * fCos) + (f4 * fSin);
        float f10 = rulerConstraintState.f88831OooO0OO / 2.0f;
        float f11 = rulerConstraintState.f88832OooO0Oo / 2.0f;
        float f12 = 1.5f + f11 + fMax;
        boolean z2 = Math.abs(f8) <= f10 + 1.5f;
        boolean z3 = Math.abs(f9) <= f12;
        int i = this.f69137OooO0o;
        if (i == 0) {
            if (!z2 || !z3) {
                return 0;
            }
            i = f9 >= 0.0f ? 1 : -1;
            if (z) {
                this.f69137OooO0o = i;
            }
        } else {
            if ((i != 1 || f9 < 0.0f) && (i != -1 || f9 > 0.0f)) {
                return 2;
            }
            if (!z2 || !z3) {
                return 0;
            }
        }
        float fMax2 = Math.max(-f10, Math.min(f10, f8));
        float f13 = i == 1 ? f11 + fMax : (-f11) - fMax;
        double d2 = f7;
        float fCos2 = (float) Math.cos(d2);
        float fSin2 = (float) Math.sin(d2);
        float f14 = (fMax2 * fCos2) - (f13 * fSin2);
        float f15 = (f13 * fCos2) + (fMax2 * fSin2);
        if (pointF != null) {
            pointF.set(f14 + f3, f15 + f5);
        }
        return 1;
    }

    public final void OooO0OO() {
        Handler handler = this.f69133OooO00o.getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.f69151OooOo == 2) {
            ((com.orion.editor.OooO00o) this.f69135OooO0OO).f69056OooO00o.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOOo0();
        }
        this.f69151OooOo = 0;
    }

    public final void OooO0Oo(MotionEvent motionEvent) {
        AbstractC31239OooO00o abstractC31239OooO00o = this.f69134OooO0O0;
        if (abstractC31239OooO00o instanceof AbstractC31268OooO00o) {
            InterfaceC31224OooO00o interfaceC31224OooO00o = ((AbstractC31268OooO00o) abstractC31239OooO00o).f111646OooOOOo;
            if (interfaceC31224OooO00o != null) {
                ((C25927OooOo) interfaceC31224OooO00o).OooO0O0(null);
                return;
            }
            return;
        }
        if ((abstractC31239OooO00o instanceof C31247OooOO0) || (abstractC31239OooO00o instanceof C31248OooOO0O)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            switch (action) {
                case 211:
                    action = 0;
                    break;
                case 212:
                    action = 1;
                    break;
                case 213:
                    action = 2;
                    break;
                case 214:
                    action = 3;
                    break;
            }
            abstractC31239OooO00o.OooO(x, y, 0.0f, action, Collections.EMPTY_LIST);
            if (abstractC31239OooO00o instanceof C31247OooOO0) {
                if (((C31247OooOO0) abstractC31239OooO00o).f111486OooOOOo != 0) {
                    return;
                }
            } else if (!(abstractC31239OooO00o instanceof C31248OooOO0O)) {
                return;
            }
            OooOO0O();
        }
    }

    public final void OooO0o0() {
        this.f69137OooO0o = 0;
        this.f69132OooO = false;
    }

    public final HashMap OooO0oO() {
        ArrayList arrayList;
        ArrayList arrayList2;
        PDFView pDFView = this.f69133OooO00o;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        Pair<Integer, Integer> screenPagesRange = pDFView.getScreenPagesRange();
        int iIntValue = screenPagesRange.second.intValue();
        HashMap map = new HashMap();
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        if (c26395Oooo0o0 == null) {
            arrayList2 = null;
        } else {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                ArrayList arrayList3 = c26395Oooo0o0.f90562OooOO0o;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(LayerInfo.copy$default((LayerInfo) it.next(), null, null, false, false, null, 31, null));
                }
            }
            arrayList2 = arrayList;
        }
        final Set set = (Set) arrayList2.stream().filter(new C25960Ooooo0o()).map(new C25959Ooooo00()).collect(Collectors.toSet());
        for (int iIntValue2 = screenPagesRange.first.intValue(); iIntValue2 <= iIntValue; iIntValue2++) {
            final RectF rectFOooOOo = abstractC22830OooO0Oo.OooOOo(iIntValue2);
            final float fOooOo0O = pDFView.OooOo0O(1, iIntValue2);
            final Pair<Float, Float> pairOooOOO = abstractC22830OooO0Oo.OooOOO(iIntValue2);
            C26395Oooo0o0 c26395Oooo0o02 = abstractC22830OooO0Oo.f69109OooO0O0;
            c26395Oooo0o02.getClass();
            map.put(Integer.valueOf(iIntValue2), (List) c26395Oooo0o02.OooOOO(iIntValue2, new C26363OooO0oO(c26395Oooo0o02, 0)).stream().filter(new Predicate() { // from class: o0O0o00.o00000oO
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                    if (interfaceC31284OooO0O0.doesSupportLayer()) {
                        if (!set.contains(interfaceC31284OooO0O0.getLayerId())) {
                            return false;
                        }
                    }
                    RectF rectF = rectFOooOOo;
                    return rectF == null || RectF.intersects(rectF, interfaceC31284OooO0O0.getBoundingBox(1.0f));
                }
            }).peek(new Consumer() { // from class: o0O0o00.o00000oo
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                    interfaceC31284OooO0O0.scale(fOooOo0O, this.f88691OooOo0o.f69133OooO00o.getPenWidthScale());
                    Pair pair = pairOooOOO;
                    interfaceC31284OooO0O0.offset(-((Float) pair.first).floatValue(), -((Float) pair.second).floatValue());
                }
            }).collect(Collectors.toList()));
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Type inference failed for: r1v51, types: [long] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oo(MotionEvent motionEvent) {
        float fMin;
        boolean z;
        RectF rectFOooOOOO;
        ArrayList arrayList;
        PointF pointF;
        boolean z2;
        String str = Build.BRAND;
        int iOooO0oO = this.f69134OooO0O0.OooO0oO();
        ArrayList arrayList2 = this.f69138OooO0o0;
        C25933OooOoO0 c25933OooOoO0 = new C25933OooOoO0();
        c25933OooOoO0.f88538OooO0O0 = 0;
        c25933OooOoO0.f88539OooO0OO = 0;
        c25933OooOoO0.f88540OooO0Oo = 0.0f;
        c25933OooOoO0.f88542OooO0o0 = 0.0f;
        c25933OooOoO0.f88541OooO0o = 0.0f;
        c25933OooOoO0.f88543OooO0oO = 0L;
        c25933OooOoO0.f88544OooO0oo = null;
        List listOooOOo = Collections.EMPTY_LIST;
        c25933OooOoO0.f88545OooOO0 = listOooOOo;
        c25933OooOoO0.f88546OooOO0O = listOooOOo;
        c25933OooOoO0.f88537OooO00o = str.toLowerCase();
        motionEvent.getToolType(0);
        c25933OooOoO0.f88538OooO0O0 = iOooO0oO;
        motionEvent.getButtonState();
        int action = motionEvent.getAction();
        switch (action) {
            case 211:
                action = 0;
                break;
            case 212:
                action = 1;
                break;
            case 213:
                action = 2;
                break;
            case 214:
                action = 3;
                break;
        }
        c25933OooOoO0.f88539OooO0OO = action;
        c25933OooOoO0.f88540OooO0Oo = motionEvent.getX();
        c25933OooOoO0.f88542OooO0o0 = motionEvent.getY();
        c25933OooOoO0.f88541OooO0o = Math.max(0.0f, Math.min(1.0f, motionEvent.getPressure()));
        c25933OooOoO0.f88543OooO0oO = motionEvent.getEventTime();
        c25933OooOoO0.f88544OooO0oo = null;
        if (action == 0) {
            c25933OooOoO0.f88536OooO = UUID.randomUUID().toString();
            arrayList2.clear();
        } else if (arrayList2 != null && !arrayList2.isEmpty()) {
            c25933OooOoO0.f88536OooO = ((C25933OooOoO0) arrayList2.get(0)).f88536OooO;
        }
        c25933OooOoO0.f88545OooOO0 = arrayList2;
        c25933OooOoO0.f88546OooOO0O = listOooOOo;
        if (c25933OooOoO0.f88539OooO0OO == 0) {
            this.f69143OooOO0o = Long.MIN_VALUE;
        }
        boolean zEqualsIgnoreCase = "honor".equalsIgnoreCase(c25933OooOoO0.f88537OooO00o);
        o0oo00oO.OooO0o oooO0o = this.f69149OooOOo0;
        if (!zEqualsIgnoreCase) {
            if (oooO0o != null) {
                c25933OooOoO0.f88544OooO0oo = oooO0o.OooO00o(motionEvent);
            } else {
                o0oo0.OooO0o oooO0o2 = this.f69148OooOOo;
                if (oooO0o2 != null) {
                    c25933OooOoO0.f88544OooO0oo = oooO0o2.OooO00o(motionEvent);
                }
            }
        }
        int i = c25933OooOoO0.f88538OooO0O0;
        PDFView pDFView = this.f69133OooO00o;
        if (i != 10 && c25933OooOoO0.f88539OooO0OO == 2) {
            float f = 60.0f;
            if (this.f69134OooO0O0.OooO0oO() != 3) {
                if (this.f69141OooOO0) {
                    if (!pDFView.f69230o0000oO0) {
                        f = 120.0f;
                    }
                    fMin = Math.min(f, this.f69142OooOO0O);
                    if (fMin > 0.0f) {
                        float f2 = 1000.0f / fMin;
                        long j = this.f69143OooOO0o;
                        long j2 = c25933OooOoO0.f88543OooO0oO;
                        boolean z3 = j == Long.MIN_VALUE || ((float) (j2 - j)) >= f2;
                        if (z3) {
                            this.f69143OooOO0o = j2;
                        }
                        z = !z3;
                    }
                }
                z = false;
            } else {
                fMin = Math.min(f, this.f69142OooOO0O);
                if (fMin > 0.0f) {
                    z = false;
                }
            }
        }
        if (z) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenKitGestureDetector");
            c20358OooO00o.OooO00o("drop move event", new Object[0]);
            return;
        }
        if ("honor".equalsIgnoreCase(c25933OooOoO0.f88537OooO00o)) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                this.f69156OooOoO = Optional.of(new PointF(motionEvent.getX(), motionEvent.getY()));
            } else if (action2 == 1) {
                this.f69156OooOoO = Optional.empty();
            } else if (action2 == 2) {
                if (this.f69156OooOoO.isPresent() && Math.abs(motionEvent.getX() - this.f69156OooOoO.get().x) < 3.0f && Math.abs(motionEvent.getY() - this.f69156OooOoO.get().y) < 3.0f) {
                    C34406OooO00o.f123390OooO00o.OooO00o("drop event", new Object[0]);
                    z2 = false;
                }
                if (z2) {
                    return;
                }
                if (oooO0o != null) {
                    c25933OooOoO0.f88544OooO0oo = oooO0o.OooO00o(motionEvent);
                } else {
                    o0oo0.OooO0o oooO0o3 = this.f69148OooOOo;
                    if (oooO0o3 != null) {
                        c25933OooOoO0.f88544OooO0oo = oooO0o3.OooO00o(motionEvent);
                    }
                }
            } else if (action2 == 3) {
            }
            z2 = true;
            if (z2) {
            }
        }
        if (c25933OooOoO0.f88541OooO0o <= 0.005f && pDFView.getInputType() == 1) {
            c25933OooOoO0.f88541OooO0o = 1.0f;
        }
        VelocityTracker velocityTracker = this.f69152OooOo0;
        velocityTracker.addMovement(motionEvent);
        AbstractC31239OooO00o abstractC31239OooO00o = this.f69134OooO0O0;
        float f3 = c25933OooOoO0.f88541OooO0o;
        velocityTracker.computeCurrentVelocity(1);
        float xVelocity = velocityTracker.getXVelocity();
        float yVelocity = velocityTracker.getYVelocity();
        c25933OooOoO0.f88541OooO0o = abstractC31239OooO00o.OooO0O0(f3, (float) Math.sqrt((yVelocity * yVelocity) + (xVelocity * xVelocity)));
        int i2 = c25933OooOoO0.f88538OooO0O0;
        int i3 = c25933OooOoO0.f88539OooO0OO;
        if (i2 == 3) {
            AbstractC31239OooO00o abstractC31239OooO00o2 = this.f69134OooO0O0;
            if (!(abstractC31239OooO00o2 instanceof C31250OooOOO)) {
                List<C25933OooOoO0> list = c25933OooOoO0.f88545OooOO0;
                C25933OooOoO0 c25933OooOoO02 = (list == null || list.isEmpty()) ? null : (C25933OooOoO0) System.currentTimeMillis();
                if (c25933OooOoO02 == null) {
                    c25933OooOoO02 = c25933OooOoO0;
                }
                float zoomLevel = pDFView.getZoomLevel() * this.f69134OooO0O0.OooO0oo();
                float fMin2 = Math.min(c25933OooOoO02.f88540OooO0Oo, c25933OooOoO0.f88540OooO0Oo) - zoomLevel;
                float fMin3 = Math.min(c25933OooOoO02.f88542OooO0o0, c25933OooOoO0.f88542OooO0o0) - zoomLevel;
                float fMax = Math.max(c25933OooOoO02.f88540OooO0Oo, c25933OooOoO0.f88540OooO0Oo) + zoomLevel;
                float fMax2 = Math.max(c25933OooOoO02.f88542OooO0o0, c25933OooOoO0.f88542OooO0o0) + zoomLevel;
                RectF rectF = this.f69153OooOo00;
                rectF.set(fMin2, fMin3, fMax, fMax2);
                listOooOOo = pDFView.OooOo00(false, rectF);
            } else if (i3 == 1) {
                listOooOOo = pDFView.OooOo00(false, ((C31250OooOOO) abstractC31239OooO00o2).OooO00o());
            }
        } else if (i2 == 4 && i3 == 1) {
            Object obj = this.f69134OooO0O0;
            if (!(obj instanceof C31251OooOOO0)) {
                if (obj instanceof InterfaceC31263OooOoO0) {
                    listOooOOo = pDFView.OooOo00(false, ((InterfaceC31263OooOoO0) obj).OooO00o());
                } else {
                    pDFView.getClass();
                    listOooOOo = pDFView.OooOOo(false, new C25995o0ooOO0(pDFView));
                }
            }
        }
        List list2 = listOooOOo;
        if (c25933OooOoO0.f88539OooO0OO != 0 && this.f69134OooO0O0.f111414OooO00o == null) {
            this.f69157OooOoO0 = UUID.randomUUID().toString();
            this.f69134OooO0O0.OooO(c25933OooOoO0.f88540OooO0Oo, c25933OooOoO0.f88542OooO0o0, c25933OooOoO0.f88541OooO0o, 0, list2);
        }
        if (c25933OooOoO0.f88539OooO0OO == 0) {
            this.f69157OooOoO0 = UUID.randomUUID().toString();
            OooO0o0();
        }
        if (pDFView.getPenWidthScale()) {
            this.f69134OooO0O0.OooOO0o(pDFView.getZoomLevel());
        } else {
            this.f69134OooO0O0.OooOO0o(1.0f);
        }
        this.f69134OooO0O0.f111424OooOO0o = pDFView.getZoomLevel();
        arrayList2.add(c25933OooOoO0);
        C31210OooO0OO c31210OooO0OO = this.f69147OooOOOo;
        if (c31210OooO0OO != null) {
            c31210OooO0OO.OooO00o();
            InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = c31210OooO0OO.f111297OooO00o;
            InterfaceC31212OooO0o0 interfaceC31212OooO0o0 = interfaceC31211OooO0Oo != null ? (InterfaceC31212OooO0o0) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111304OooOoOO) : null;
            if (interfaceC31212OooO0o0 != null && interfaceC31212OooO0o0.isSupported()) {
                AbstractC31239OooO00o abstractC31239OooO00o3 = this.f69134OooO0O0;
                interfaceC31212OooO0o0.OooO00o();
                abstractC31239OooO00o3.getClass();
            }
        }
        if (f69131OooOoo.contains(Integer.valueOf(this.f69134OooO0O0.OooO0oO()))) {
            float f4 = c25933OooOoO0.f88540OooO0Oo;
            float f5 = c25933OooOoO0.f88542OooO0o0;
            PointF pointF2 = this.f69139OooO0oO;
            int iOooO0O0 = OooO0O0(f4, f5, true, pointF2);
            PointF pointF3 = this.f69140OooO0oo;
            if (iOooO0O0 == 1) {
                float f6 = pointF2.x;
                c25933OooOoO0.f88540OooO0Oo = f6;
                float f7 = pointF2.y;
                c25933OooOoO0.f88542OooO0o0 = f7;
                pointF3.set(f6, f7);
                this.f69132OooO = true;
            } else if (iOooO0O0 == 2) {
                int i4 = c25933OooOoO0.f88539OooO0OO;
                if (i4 != 1 && i4 != 3) {
                    return;
                }
                if (!this.f69132OooO) {
                    OooO0o0();
                    return;
                } else {
                    c25933OooOoO0.f88540OooO0Oo = pointF3.x;
                    c25933OooOoO0.f88542OooO0o0 = pointF3.y;
                }
            }
        }
        DrawResult drawResultOooO = this.f69134OooO0O0.OooO(c25933OooOoO0.f88540OooO0Oo, c25933OooOoO0.f88542OooO0o0, c25933OooOoO0.f88541OooO0o, c25933OooOoO0.f88539OooO0OO, list2);
        if (c25933OooOoO0.f88539OooO0OO == 1) {
            pDFView.OoooO();
        }
        if (c25933OooOoO0.f88539OooO0OO != 2 || (pointF = c25933OooOoO0.f88544OooO0oo) == null) {
            this.f69134OooO0O0.f111415OooO0O0 = false;
        } else {
            AbstractC31239OooO00o abstractC31239OooO00o4 = this.f69134OooO0O0;
            float f8 = pointF.x;
            float f9 = pointF.y;
            abstractC31239OooO00o4.f111415OooO0O0 = true;
            abstractC31239OooO00o4.f111416OooO0OO = f8;
            abstractC31239OooO00o4.f111417OooO0Oo = f9;
        }
        int updateMode = drawResultOooO.getUpdateMode();
        int i5 = updateMode & 1;
        OooO0OO oooO0OO = this.f69135OooO0OO;
        if (i5 != 0) {
            ((com.orion.editor.OooO00o) oooO0OO).f69056OooO00o.OoooOOo();
        }
        if (drawResultOooO.getFloatingItem() != null) {
            drawResultOooO.getFloatingItem();
            ((com.orion.editor.OooO00o) oooO0OO).f69056OooO00o.OoooOOo();
        }
        if (updateMode == 4) {
            OooOO0O();
        }
        if ((updateMode & 2) != 0) {
            if (this.f69134OooO0O0.OooO0oO() == 3 && c25933OooOoO0.f88539OooO0OO == 2) {
                ((com.orion.editor.OooO00o) oooO0OO).f69056OooO00o.Oooo0(drawResultOooO, this.f69157OooOoO0, false);
            } else {
                ((com.orion.editor.OooO00o) oooO0OO).f69056OooO00o.Oooo0(drawResultOooO, this.f69157OooOoO0, true);
            }
        }
        int i6 = c25933OooOoO0.f88539OooO0OO;
        if (i6 == 1 || i6 == 3) {
            velocityTracker.clear();
            OooO0o0();
            this.f69143OooOO0o = Long.MIN_VALUE;
        }
        if (drawResultOooO.getWhenLassoCompleted()) {
            AbstractC31239OooO00o tool = pDFView.getTool();
            if (tool instanceof C31249OooOO0o) {
                C31249OooOO0o c31249OooOO0o = (C31249OooOO0o) tool;
                c31249OooOO0o.getClass();
                arrayList = new ArrayList(c31249OooOO0o.f111514OooOo0O);
                rectFOooOOOO = new RectF(c31249OooOO0o.f111515OooOo0o);
            } else {
                rectFOooOOOO = tool instanceof C31252OooOOOO ? ((C31252OooOOOO) tool).OooOOOO() : null;
                arrayList = null;
            }
            if (rectFOooOOOO != null) {
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoOO(new LassoParams(drawResultOooO.getSelectItemList(), rectFOooOOOO, arrayList));
                pDFView.getTool().OooOO0O();
            }
        }
        if (c25933OooOoO0.f88539OooO0OO == 1) {
            AbstractC31239OooO00o abstractC31239OooO00o5 = this.f69134OooO0O0;
            if (abstractC31239OooO00o5.OooO0oO() == 4 ? DrawToolFactory.LASSO_TYPE_CAPTURE.equals(abstractC31239OooO00o5.OooO0o0().getString(C18437z2.f56754h)) : false) {
                RectF rectFOooOOOO2 = ((C31251OooOOO0) this.f69134OooO0O0).OooOOOO();
                pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoO0(rectFOooOOOO2, pDFView.OooOOO(rectFOooOOOO2, pDFView.f69170OooOooO.OooOOOo(rectFOooOOOO2).second.intValue()));
                pDFView.f69207o000000o.OooOO0O();
            }
        }
        if (c25933OooOoO0.f88539OooO0OO == 1 && OooO(drawResultOooO.getItem(), this.f69134OooO0O0.OooO0oO())) {
            ShapeInfo shapeInfo = (ShapeInfo) drawResultOooO.getItem();
            Bundle bundle = new Bundle();
            bundle.putString("batch", this.f69157OooOoO0);
            pDFView.f69170OooOooO.f69109OooO0O0.OoooO(shapeInfo, bundle);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:384)(16:501|362|(19:364|503|365|366|383|499|386|(5:388|(1:390)(1:391)|392|(4:394|505|395|(14:397|(1:399)(1:400)|401|402|489|414|(6:416|(1:418)|419|(1:421)|422|(2:428|(1:430)))|431|(1:433)|(1:435)|(1:437)|(1:439)|(1:441)|(2:443|519)(1:518)))|407)(1:413)|408|489|414|(0)|431|(0)|(0)|(0)|(0)|(0)|(0)(0))(2:379|(1:381)(1:382))|373|374|450|(1:452)|(1:454)|(1:456)|(1:458)|(1:460)|(1:462)|463|(1:467)|468|469)|489|414|(0)|431|(0)|(0)|(0)|(0)|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:(1:339)(1:340)|341|(3:343|(1:345)(3:347|(1:(2:354|(1:356)(2:357|517))(2:353|516))|358)|346)(1:358)|(2:507|359)|(1:384)(16:501|362|(19:364|503|365|366|383|499|386|(5:388|(1:390)(1:391)|392|(4:394|505|395|(14:397|(1:399)(1:400)|401|402|489|414|(6:416|(1:418)|419|(1:421)|422|(2:428|(1:430)))|431|(1:433)|(1:435)|(1:437)|(1:439)|(1:441)|(2:443|519)(1:518)))|407)(1:413)|408|489|414|(0)|431|(0)|(0)|(0)|(0)|(0)|(0)(0))(2:379|(1:381)(1:382))|373|374|450|(1:452)|(1:454)|(1:456)|(1:458)|(1:460)|(1:462)|463|(1:467)|468|469)|385|383|499|386|(0)(0)|408|489|414|(0)|431|(0)|(0)|(0)|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x06a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x06a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x06da, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x065e A[Catch: all -> 0x06a0, Exception -> 0x06a2, TryCatch #18 {Exception -> 0x06a2, all -> 0x06a0, blocks: (B:386:0x0657, B:388:0x065e, B:392:0x0670, B:391:0x066c), top: B:499:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06b2 A[Catch: all -> 0x06d7, Exception -> 0x06da, TryCatch #5 {Exception -> 0x06da, blocks: (B:414:0x06a6, B:416:0x06b2, B:418:0x06ba, B:419:0x06c3, B:421:0x06c9, B:428:0x06de, B:430:0x06f1, B:431:0x070a), top: B:489:0x06a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:518:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean OooOO0(MotionEvent motionEvent) throws Throwable {
        int i;
        ISdkAidlInterface iSdkAidlInterface;
        ISdkAidlInterface iSdkAidlInterface2;
        boolean vibrationSwitchState;
        ISdkAidlInterface iSdkAidlInterface3;
        MotionEvent motionEventOooO00o;
        OooO0OO oooO0OO;
        MotionEvent motionEventOooO0o;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEventOooO0O0;
        MotionEvent motionEvent4;
        MotionEvent motionEvent5;
        MotionEvent motionEventOooO0o2;
        DrawResult drawResult;
        long j;
        double d;
        boolean z;
        int i2;
        long j2;
        long j3;
        double d2;
        boolean z2;
        float f;
        MotionEvent motionEventOooO00o2;
        int i3;
        int i4;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        int i5;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        double d3;
        double d4;
        long j4;
        long j5;
        boolean z3;
        InterfaceC25999OooO00o interfaceC25999OooO00o;
        InterfaceC26001OooO0OO interfaceC26001OooO0OO;
        InterfaceC26001OooO0OO interfaceC26001OooO0OO2;
        boolean zIsHapticReady;
        char c;
        boolean hapticContinuousParams;
        int i6;
        String str = Build.BRAND;
        int iOooO0oO = this.f69134OooO0O0.OooO0oO();
        ArrayList arrayList = this.f69138OooO0o0;
        List list = Collections.EMPTY_LIST;
        String lowerCase = str.toLowerCase();
        int toolType = motionEvent.getToolType(0);
        int buttonState = motionEvent.getButtonState();
        int action = motionEvent.getAction();
        switch (action) {
            case 211:
                i = 0;
                break;
            case 212:
                i = 1;
                break;
            case 213:
                i = 2;
                break;
            case 214:
                i = 3;
                break;
            default:
                i = action;
                break;
        }
        motionEvent.getX();
        motionEvent.getY();
        Math.max(0.0f, Math.min(1.0f, motionEvent.getPressure()));
        motionEvent.getEventTime();
        if (i == 0) {
            UUID.randomUUID().toString();
            arrayList.clear();
        } else if (arrayList != null && !arrayList.isEmpty()) {
            String str2 = ((C25933OooOoO0) arrayList.get(0)).f88536OooO;
        }
        o000Oo0 o000oo02 = this.f69146OooOOOO;
        o000oo02.getClass();
        if ("lenovo".equalsIgnoreCase(lowerCase) && toolType == 2) {
            o0O0O0o0.OooO0O0 oooO0O0 = o0O0O0o0.OooO0O0.f88283OooO0O0;
            ZuiPenHapticManager zuiPenHapticManager = oooO0O0.f88284OooO00o;
            if (zuiPenHapticManager != null) {
                try {
                    zIsHapticReady = zuiPenHapticManager.isHapticReady();
                } catch (Exception e) {
                    Log.e("PenHaptic", "isHapticReady failed cause =" + e.getMessage());
                    zIsHapticReady = false;
                }
                if (zIsHapticReady) {
                    if (i == 0) {
                        if (iOooO0oO == 1) {
                            c = 1;
                        } else if (iOooO0oO == 2) {
                            c = 3;
                        } else if (iOooO0oO == 3) {
                            c = 4;
                        } else if (iOooO0oO != 9) {
                            c = 2;
                        }
                        ZuiPenHapticManager zuiPenHapticManager2 = oooO0O0.f88284OooO00o;
                        if (zuiPenHapticManager2 == null) {
                            throw new RuntimeException("haptic service null, please init first");
                        }
                        try {
                            switch (c) {
                                case 1:
                                    i6 = 32;
                                    break;
                                case 2:
                                    i6 = 33;
                                    break;
                                case 3:
                                    i6 = 34;
                                    break;
                                case 4:
                                    i6 = 35;
                                    break;
                                case 5:
                                    i6 = 36;
                                    break;
                                case 6:
                                    i6 = 37;
                                    break;
                                case 7:
                                    i6 = 38;
                                    break;
                                case '\b':
                                    i6 = 39;
                                    break;
                                case '\t':
                                    i6 = 40;
                                    break;
                                case '\n':
                                    i6 = 41;
                                    break;
                                default:
                                    throw null;
                            }
                            hapticContinuousParams = zuiPenHapticManager2.setHapticContinuousParams(i6, 5, 1);
                        } catch (Exception e2) {
                            Log.e("PenHaptic", "setPenHapticContinuous failed cause" + e2.getMessage());
                            hapticContinuousParams = false;
                        }
                        if (!hapticContinuousParams) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("VendorStylusFeatures");
                            c20358OooO00o.OooOO0O("lenovo haptic is ready but setPenHapticContinuous failed. plz check haptic setting in system.", new Object[0]);
                        }
                    } else if (i == 1) {
                        ZuiPenHapticManager zuiPenHapticManager3 = oooO0O0.f88284OooO00o;
                        if (zuiPenHapticManager3 == null) {
                            throw new RuntimeException("haptic service null, please init first");
                        }
                        try {
                            zuiPenHapticManager3.stopHaptic(0);
                        } catch (Exception e3) {
                            Log.e("PenHaptic", "stopHaptic failed cause =" + e3.getMessage());
                        }
                    }
                }
            } else {
                Log.e("PenHaptic", "haptic service null, please init first");
            }
            zIsHapticReady = false;
            if (zIsHapticReady) {
            }
        }
        if ("oppo".equalsIgnoreCase(lowerCase) || "oneplus".equalsIgnoreCase(lowerCase)) {
            if (toolType == 2) {
                C25895OooO00o c25895OooO00o = C25895OooO00o.f88411OooO0Oo;
                if ((c25895OooO00o != null) && i != 2) {
                    if (c25895OooO00o == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("VendorStylusFeatures");
                        c20358OooO00o2.OooO0OO("handleOppoHapticFeedback: pencilManager is null", new Object[0]);
                    } else if (!c25895OooO00o.OooO00o().contains(IpeFeature.FEEDBACK_VIBRATION)) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("VendorStylusFeatures");
                        c20358OooO00o3.OooO0o0("handleOppoHapticFeedback: FEEDBACK_VIBRATION not supported", new Object[0]);
                    } else if (i == 0) {
                        if (iOooO0oO == 0) {
                            c25895OooO00o.OooO0O0(o0O0OoO0.OooO0o.f88420OooOoO0);
                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o4.OooOOO0("VendorStylusFeatures");
                            c20358OooO00o4.OooO0o0("handleOppoHapticFeedback: setVibrationType PEN", new Object[0]);
                            Log.d("PencilManager", "getVibrationSwitchState");
                            iSdkAidlInterface2 = c25895OooO00o.f88412OooO00o;
                            if (iSdkAidlInterface2 == null) {
                                vibrationSwitchState = false;
                                if (vibrationSwitchState && (iSdkAidlInterface3 = c25895OooO00o.f88412OooO00o) != null) {
                                    try {
                                        iSdkAidlInterface3.startFeedBackVibration();
                                    } catch (Exception e4) {
                                        Log.e("PencilManager", "startFeedBackVibration, error = ".concat(String.valueOf(e4)));
                                    }
                                }
                            } else {
                                try {
                                    vibrationSwitchState = iSdkAidlInterface2.getVibrationSwitchState();
                                } catch (RemoteException e5) {
                                    e5.printStackTrace();
                                    vibrationSwitchState = false;
                                }
                                if (vibrationSwitchState) {
                                    iSdkAidlInterface3.startFeedBackVibration();
                                }
                            }
                        } else if (iOooO0oO == 1) {
                            c25895OooO00o.OooO0O0(o0O0OoO0.OooO0o.f88417OooOo);
                            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o5.OooOOO0("VendorStylusFeatures");
                            c20358OooO00o5.OooO0o0("handleOppoHapticFeedback: setVibrationType BALLPEN", new Object[0]);
                            Log.d("PencilManager", "getVibrationSwitchState");
                            iSdkAidlInterface2 = c25895OooO00o.f88412OooO00o;
                            if (iSdkAidlInterface2 == null) {
                            }
                        } else if (iOooO0oO != 3) {
                            if (iOooO0oO != 102) {
                                if (iOooO0oO != 103) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o6.OooOOO0("VendorStylusFeatures");
                                    c20358OooO00o6.OooO0o0("handleOppoHapticFeedback: setVibrationType needVibration = false", new Object[0]);
                                }
                                c25895OooO00o.OooO0O0(o0O0OoO0.OooO0o.f88417OooOo);
                                C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o52.OooOOO0("VendorStylusFeatures");
                                c20358OooO00o52.OooO0o0("handleOppoHapticFeedback: setVibrationType BALLPEN", new Object[0]);
                                Log.d("PencilManager", "getVibrationSwitchState");
                                iSdkAidlInterface2 = c25895OooO00o.f88412OooO00o;
                                if (iSdkAidlInterface2 == null) {
                                }
                            }
                            c25895OooO00o.OooO0O0(o0O0OoO0.OooO0o.f88420OooOoO0);
                            C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o42.OooOOO0("VendorStylusFeatures");
                            c20358OooO00o42.OooO0o0("handleOppoHapticFeedback: setVibrationType PEN", new Object[0]);
                            Log.d("PencilManager", "getVibrationSwitchState");
                            iSdkAidlInterface2 = c25895OooO00o.f88412OooO00o;
                            if (iSdkAidlInterface2 == null) {
                            }
                        } else {
                            c25895OooO00o.OooO0O0(o0O0OoO0.OooO0o.f88418OooOo0o);
                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o7.OooOOO0("VendorStylusFeatures");
                            c20358OooO00o7.OooO0o0("handleOppoHapticFeedback: setVibrationType ERASER", new Object[0]);
                            Log.d("PencilManager", "getVibrationSwitchState");
                            iSdkAidlInterface2 = c25895OooO00o.f88412OooO00o;
                            if (iSdkAidlInterface2 == null) {
                            }
                        }
                    } else if (i == 1 && (iSdkAidlInterface = c25895OooO00o.f88412OooO00o) != null) {
                        try {
                            iSdkAidlInterface.stopFeedBackVibration();
                        } catch (Exception e6) {
                            Log.e("PencilManager", "stopFeedBackVibration, error = ".concat(String.valueOf(e6)));
                        }
                    }
                }
            }
        }
        if (o000oo02.f88760OooO0OO.contains(Build.BRAND.toLowerCase())) {
            boolean z4 = o000oo02.f88758OooO00o;
            PDFView pDFView = o000oo02.f88759OooO0O0;
            if (!z4 && (action == 211 || buttonState == 32 || buttonState == 64)) {
                o000oo02.f88758OooO00o = true;
                if ("lenovo".equalsIgnoreCase(lowerCase)) {
                    InterfaceC26000OooO0O0 interfaceC26000OooO0O0 = pDFView.f69239o000O000;
                    if (interfaceC26000OooO0O0 != null) {
                        interfaceC26000OooO0O0.OooO00o();
                    }
                } else if ("vivo".equalsIgnoreCase(lowerCase)) {
                    InterfaceC26002OooO0Oo interfaceC26002OooO0Oo = pDFView.f69261o000OoO;
                    if (interfaceC26002OooO0Oo != null) {
                        interfaceC26002OooO0Oo.OooO00o();
                    }
                } else if ("samsung".equalsIgnoreCase(lowerCase) && (interfaceC26001OooO0OO2 = pDFView.f69202o000) != null) {
                    interfaceC26001OooO0OO2.OooO00o();
                }
            } else if (z4 && (action == 212 || action == 214 || action == 1)) {
                o000oo02.f88758OooO00o = false;
                if ("lenovo".equalsIgnoreCase(lowerCase)) {
                    InterfaceC26000OooO0O0 interfaceC26000OooO0O02 = pDFView.f69239o000O000;
                    if (interfaceC26000OooO0O02 != null) {
                        interfaceC26000OooO0O02.OooO0O0();
                    }
                } else if ("vivo".equalsIgnoreCase(lowerCase)) {
                    InterfaceC26002OooO0Oo interfaceC26002OooO0Oo2 = pDFView.f69261o000OoO;
                    if (interfaceC26002OooO0Oo2 != null) {
                        interfaceC26002OooO0Oo2.OooO0O0();
                    }
                } else if ("samsung".equalsIgnoreCase(lowerCase) && (interfaceC26001OooO0OO = pDFView.f69202o000) != null) {
                    interfaceC26001OooO0OO.OooO0O0();
                }
            }
        }
        PDFView pDFView2 = this.f69133OooO00o;
        if (toolType == 4) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                InterfaceC25999OooO00o interfaceC25999OooO00o2 = pDFView2.f69244o000O0o;
                if (interfaceC25999OooO00o2 != null) {
                    interfaceC25999OooO00o2.OooO0O0();
                }
            } else if ((action2 == 1 || action2 == 3) && (interfaceC25999OooO00o = pDFView2.f69244o000O0o) != null) {
                interfaceC25999OooO00o.OooO00o();
            }
        }
        boolean nonStylusPressureEraser = pDFView2.getNonStylusPressureEraser();
        boolean z5 = toolType == 2;
        OooO0OO oooO0OO2 = this.f69135OooO0OO;
        if (z5 || nonStylusPressureEraser) {
            int action3 = motionEvent.getAction();
            switch (action3) {
                case 211:
                    action3 = 0;
                    break;
                case 212:
                    action3 = 1;
                    break;
                case 213:
                    action3 = 2;
                    break;
                case 214:
                    action3 = 3;
                    break;
            }
            OooO00o oooO00o = this.f69159OooOoo0;
            Handler handler = this.f69158OooOoOO;
            if (action3 == 0) {
                this.f69154OooOo0O = (int) motionEvent.getX();
                this.f69155OooOo0o = (int) motionEvent.getY();
                this.f69151OooOo = 0;
                handler.postDelayed(oooO00o, 500L);
            } else if (action3 == 1) {
                handler.removeCallbacks(oooO00o);
            } else if (action3 == 2) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x - this.f69154OooOo0O) > 10 || Math.abs(y - this.f69155OooOo0o) > 10) {
                    handler.removeCallbacks(oooO00o);
                }
            }
            if (this.f69151OooOo == 1 && motionEvent.getPressure() > pDFView2.getPressToEraserPressure() && (i == 0 || i == 2)) {
                this.f69151OooOo = 2;
                if (this.f69134OooO0O0.OooO0oO() != 7) {
                    motionEvent.getX();
                    motionEvent.getY();
                    List list2 = Collections.EMPTY_LIST;
                    C26395Oooo0o0 c26395Oooo0o0 = ((com.orion.editor.OooO00o) oooO0OO2).f69056OooO00o.f69170OooOooO.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    OooOOO0.OooO0oO(list2, "list");
                    c26395Oooo0o0.f90558OooO0oO.OooOo0();
                    this.f69156OooOoO = Optional.empty();
                }
            }
            if (this.f69151OooOo == 2 && i == 1) {
                this.f69151OooOo = 0;
                if (this.f69134OooO0O0.OooO0oO() != 7) {
                    ((com.orion.editor.OooO00o) oooO0OO2).f69056OooO00o.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOOo0();
                }
            }
        }
        if (!(this.f69134OooO0O0 instanceof AbstractC31268OooO00o)) {
            OooO0oo(motionEvent);
            return Boolean.TRUE;
        }
        if (pDFView2.getPenWidthScale()) {
            this.f69134OooO0O0.OooOO0o(pDFView2.getZoomLevel());
        } else {
            this.f69134OooO0O0.OooOO0o(1.0f);
        }
        int iOooO0oO2 = this.f69134OooO0O0.OooO0oO();
        C31217OooO00o c31217OooO00o = pDFView2.f69231o0000oOO;
        int iIntValue = c31217OooO00o.f111338OooO00o;
        if (iOooO0oO2 != -1) {
            Integer num = c31217OooO00o.f111339OooO0O0.get(Integer.valueOf(iOooO0oO2));
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        boolean z6 = iIntValue > 0 && iIntValue < 120;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && motionEvent.getToolType(0) == 2 && !z6) {
            pDFView2.requestUnbufferedDispatch(motionEvent);
        }
        long j6 = Long.MIN_VALUE;
        if (actionMasked == 0) {
            this.f69157OooOoO0 = UUID.randomUUID().toString();
            OooO0o0();
            this.f69145OooOOO0 = Long.MIN_VALUE;
            this.f69144OooOOO = 0.0d;
        }
        if (motionEvent.getActionMasked() == 2 && iIntValue > 0) {
            float f2 = 1000.0f / iIntValue;
            if (f2 <= 0.0f) {
                motionEventOooO00o = motionEvent;
                oooO0OO = oooO0OO2;
            } else {
                int historySize = motionEvent.getHistorySize();
                int actionIndex = motionEvent.getActionIndex();
                long j7 = this.f69145OooOOO0;
                double d5 = this.f69144OooOOO;
                long j8 = j7;
                double d6 = d5;
                int i7 = 0;
                int i8 = 0;
                while (i7 < historySize) {
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i7);
                    if (j8 == j6) {
                        j4 = j6;
                        z3 = true;
                        d6 = 0.0d;
                    } else {
                        long j9 = historicalEventTime - j8;
                        if (j9 < 0) {
                            j4 = j6;
                            j5 = 0;
                        } else {
                            j4 = j6;
                            j5 = j9;
                        }
                        d6 += j5;
                        double d7 = f2;
                        if (d6 >= d7) {
                            d6 %= d7;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        i8++;
                    }
                    i7++;
                    j8 = historicalEventTime;
                    j6 = j4;
                }
                long j10 = j6;
                long eventTime = motionEvent.getEventTime();
                if (j8 == j10) {
                    j = j7;
                    d = 0.0d;
                } else {
                    j = j7;
                    double d8 = d6 + (eventTime - j8 < 0 ? 0L : r20);
                    double d9 = f2;
                    if (d8 >= d9) {
                        d = d8 % d9;
                    } else {
                        d = d8;
                        z = false;
                        if (z) {
                            i8++;
                        }
                        i2 = i8;
                        if (i2 != 0) {
                            this.f69145OooOOO0 = eventTime;
                            this.f69144OooOOO = d;
                            oooO0OO = oooO0OO2;
                            motionEventOooO00o = null;
                        } else {
                            oooO0OO = oooO0OO2;
                            if (i2 == historySize + 1) {
                                this.f69145OooOOO0 = eventTime;
                                this.f69144OooOOO = d;
                                motionEventOooO00o = motionEvent;
                            } else {
                                MotionEvent.PointerProperties[] pointerPropertiesArr2 = {new MotionEvent.PointerProperties()};
                                motionEvent.getPointerProperties(actionIndex, pointerPropertiesArr2[0]);
                                MotionEvent.PointerCoords[] pointerCoordsArr2 = {new MotionEvent.PointerCoords()};
                                MotionEvent.PointerProperties[] pointerPropertiesArr3 = pointerPropertiesArr2;
                                int i9 = 0;
                                MotionEvent motionEvent6 = null;
                                while (i9 < historySize) {
                                    double d10 = d;
                                    long historicalEventTime2 = motionEvent.getHistoricalEventTime(i9);
                                    if (j == j10) {
                                        j3 = historicalEventTime2;
                                        z2 = true;
                                        d2 = 0.0d;
                                    } else {
                                        j3 = historicalEventTime2;
                                        d2 = d5 + (historicalEventTime2 - j < 0 ? 0L : r26);
                                        double d11 = f2;
                                        if (d2 >= d11) {
                                            d2 %= d11;
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    if (z2) {
                                        motionEvent.getHistoricalPointerCoords(actionIndex, i9, pointerCoordsArr2[0]);
                                        MotionEvent.PointerCoords[] pointerCoordsArr3 = pointerCoordsArr2;
                                        f = f2;
                                        MotionEvent motionEvent7 = motionEvent6;
                                        i3 = i9;
                                        i4 = actionIndex;
                                        pointerCoordsArr = pointerCoordsArr3;
                                        MotionEvent.PointerProperties[] pointerPropertiesArr4 = pointerPropertiesArr3;
                                        i5 = historySize;
                                        pointerPropertiesArr = pointerPropertiesArr4;
                                        d3 = d2;
                                        d4 = d10;
                                        motionEventOooO00o2 = OooO00o(motionEvent, motionEvent7, pointerPropertiesArr, pointerCoordsArr, j3);
                                    } else {
                                        MotionEvent.PointerCoords[] pointerCoordsArr4 = pointerCoordsArr2;
                                        f = f2;
                                        motionEventOooO00o2 = motionEvent6;
                                        i3 = i9;
                                        i4 = actionIndex;
                                        pointerCoordsArr = pointerCoordsArr4;
                                        MotionEvent.PointerProperties[] pointerPropertiesArr5 = pointerPropertiesArr3;
                                        i5 = historySize;
                                        pointerPropertiesArr = pointerPropertiesArr5;
                                        d3 = d2;
                                        d4 = d10;
                                    }
                                    int i10 = i3 + 1;
                                    int i11 = i5;
                                    pointerPropertiesArr3 = pointerPropertiesArr;
                                    historySize = i11;
                                    motionEvent6 = motionEventOooO00o2;
                                    f2 = f;
                                    pointerCoordsArr2 = pointerCoordsArr;
                                    actionIndex = i4;
                                    i9 = i10;
                                    d = d4;
                                    d5 = d3;
                                    j = j3;
                                }
                                int i12 = actionIndex;
                                double d12 = d;
                                MotionEvent.PointerCoords[] pointerCoordsArr5 = pointerCoordsArr2;
                                MotionEvent.PointerProperties[] pointerPropertiesArr6 = pointerPropertiesArr3;
                                motionEventOooO00o = motionEvent6;
                                if (z) {
                                    motionEvent.getPointerCoords(i12, pointerCoordsArr5[0]);
                                    j2 = eventTime;
                                    motionEventOooO00o = OooO00o(motionEvent, motionEventOooO00o, pointerPropertiesArr6, pointerCoordsArr5, j2);
                                } else {
                                    j2 = eventTime;
                                }
                                this.f69145OooOOO0 = j2;
                                this.f69144OooOOO = d12;
                            }
                        }
                    }
                }
                z = true;
                if (z) {
                }
                i2 = i8;
                if (i2 != 0) {
                }
            }
        }
        if (motionEventOooO00o == null) {
            return Boolean.TRUE;
        }
        boolean z7 = motionEventOooO00o != motionEvent;
        boolean zContains = f69131OooOoo.contains(Integer.valueOf(this.f69134OooO0O0.OooO0oO()));
        PointF pointF = this.f69139OooO0oO;
        if (zContains) {
            int iOooO0O0 = OooO0O0(motionEventOooO00o.getX(), motionEventOooO00o.getY(), true, pointF);
            PointF pointF2 = this.f69140OooO0oo;
            if (iOooO0O0 == 1) {
                motionEventOooO0o = MotionEvent.obtain(motionEventOooO00o);
                motionEventOooO0o.offsetLocation(pointF.x - motionEventOooO00o.getX(), pointF.y - motionEventOooO00o.getY());
                pointF2.set(pointF.x, pointF.y);
                this.f69132OooO = true;
            } else {
                if (iOooO0O0 == 2) {
                    if (actionMasked != 1 && actionMasked != 3) {
                        return Boolean.TRUE;
                    }
                    if (!this.f69132OooO) {
                        OooO0o0();
                        return Boolean.TRUE;
                    }
                    motionEventOooO0o = MotionEvent.obtain(motionEventOooO00o);
                    motionEventOooO0o.offsetLocation(pointF2.x - motionEventOooO00o.getX(), pointF2.y - motionEventOooO00o.getY());
                }
                motionEventOooO0o = motionEventOooO00o;
                motionEvent2 = null;
            }
            motionEvent2 = motionEventOooO0o;
        } else {
            motionEventOooO0o = motionEventOooO00o;
            motionEvent2 = null;
        }
        try {
            C31177OooO00o c31177OooO00o = this.f69150OooOOoo;
            c31177OooO00o.getClass();
            InterfaceC24508OooO00o interfaceC24508OooO00o = c31177OooO00o.f111205OooOo;
            interfaceC24508OooO00o.OooO00o(motionEventOooO0o);
            motionEventOooO0O0 = interfaceC24508OooO00o.OooO0O0();
        } catch (Exception e7) {
            e = e7;
            motionEvent3 = null;
            motionEventOooO0O0 = null;
        } catch (Throwable th) {
            th = th;
            motionEvent3 = null;
            motionEventOooO0O0 = null;
        }
        try {
            if (zContains && motionEventOooO0O0 != null) {
                try {
                    int iOooO0O02 = OooO0O0(motionEventOooO0O0.getX(), motionEventOooO0O0.getY(), false, pointF);
                    if (iOooO0O02 == 1) {
                        motionEventOooO0o2 = MotionEvent.obtain(motionEventOooO0O0);
                        try {
                            motionEventOooO0o2.offsetLocation(pointF.x - motionEventOooO0O0.getX(), pointF.y - motionEventOooO0O0.getY());
                            motionEvent3 = motionEventOooO0o2;
                            if (motionEventOooO0o.getToolType(0) != 1) {
                                motionEventOooO0o = OooO0o(motionEventOooO0o, motionEventOooO0o.getPressure() <= 0.005f ? 1.0f : motionEventOooO0o.getPressure());
                                if (motionEventOooO0o2 != null) {
                                    try {
                                        if (motionEventOooO0o2.getToolType(0) == 1) {
                                            motionEventOooO0o2 = OooO0o(motionEventOooO0o2, motionEventOooO0o2.getPressure() <= 0.005f ? 1.0f : motionEventOooO0o2.getPressure());
                                            motionEvent5 = motionEventOooO0o2;
                                            motionEvent4 = motionEventOooO0o;
                                            C31267OooO c31267OooOOooOOo = ((AbstractC31268OooO00o) this.f69134OooO0O0).OooOOo(motionEventOooO0o, motionEventOooO0o2);
                                            drawResult = c31267OooOOooOOo.f111645OooO0O0;
                                            if (drawResult != null) {
                                                int updateMode = drawResult.getUpdateMode();
                                                if ((updateMode & 1) != 0) {
                                                    ((com.orion.editor.OooO00o) oooO0OO).f69056OooO00o.OoooOOo();
                                                }
                                                if ((updateMode & 2) != 0) {
                                                    ((com.orion.editor.OooO00o) oooO0OO).f69056OooO00o.Oooo0(drawResult, this.f69157OooOoO0, true);
                                                }
                                                if (actionMasked == 1) {
                                                    pDFView2.OoooO();
                                                    if (OooO(drawResult.getItem(), this.f69134OooO0O0.OooO0oO())) {
                                                        ShapeInfo shapeInfo = (ShapeInfo) drawResult.getItem();
                                                        Bundle bundle = new Bundle();
                                                        bundle.putString("batch", this.f69157OooOoO0);
                                                        pDFView2.f69170OooOooO.f69109OooO0O0.OoooO(shapeInfo, bundle);
                                                    }
                                                }
                                            }
                                            Boolean boolValueOf = Boolean.valueOf(c31267OooOOooOOo.f111644OooO00o);
                                            if (motionEvent4 != null) {
                                                motionEvent4.recycle();
                                            }
                                            if (motionEvent5 != null) {
                                                motionEvent5.recycle();
                                            }
                                            if (motionEvent2 != null) {
                                                motionEvent2.recycle();
                                            }
                                            if (motionEvent3 != null) {
                                                motionEvent3.recycle();
                                            }
                                            if (motionEventOooO0O0 != null) {
                                                motionEventOooO0O0.recycle();
                                            }
                                            if (!z7) {
                                                return boolValueOf;
                                            }
                                            motionEventOooO00o.recycle();
                                            return boolValueOf;
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        motionEvent4 = motionEventOooO0o;
                                        motionEvent5 = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        motionEvent4 = motionEventOooO0o;
                                        motionEvent5 = null;
                                        if (motionEvent4 != null) {
                                        }
                                        if (motionEvent5 != null) {
                                        }
                                        if (motionEvent2 != null) {
                                        }
                                        if (motionEvent3 != null) {
                                        }
                                        if (motionEventOooO0O0 != null) {
                                        }
                                        if (z7) {
                                        }
                                        throw th;
                                    }
                                }
                                motionEvent4 = motionEventOooO0o;
                            } else {
                                motionEvent4 = null;
                            }
                            motionEvent5 = null;
                            C31267OooO c31267OooOOooOOo2 = ((AbstractC31268OooO00o) this.f69134OooO0O0).OooOOo(motionEventOooO0o, motionEventOooO0o2);
                            drawResult = c31267OooOOooOOo2.f111645OooO0O0;
                            if (drawResult != null) {
                            }
                            Boolean boolValueOf2 = Boolean.valueOf(c31267OooOOooOOo2.f111644OooO00o);
                            if (motionEvent4 != null) {
                            }
                            if (motionEvent5 != null) {
                            }
                            if (motionEvent2 != null) {
                            }
                            if (motionEvent3 != null) {
                            }
                            if (motionEventOooO0O0 != null) {
                            }
                            if (!z7) {
                            }
                        } catch (Exception e9) {
                            e = e9;
                            motionEvent3 = motionEventOooO0o2;
                        } catch (Throwable th3) {
                            th = th3;
                            motionEvent3 = motionEventOooO0o2;
                            motionEvent4 = null;
                            motionEvent5 = null;
                            if (motionEvent4 != null) {
                            }
                            if (motionEvent5 != null) {
                            }
                            if (motionEvent2 != null) {
                            }
                            if (motionEvent3 != null) {
                            }
                            if (motionEventOooO0O0 != null) {
                            }
                            if (z7) {
                            }
                            throw th;
                        }
                    } else {
                        motionEventOooO0o2 = iOooO0O02 == 2 ? null : motionEventOooO0O0;
                    }
                } catch (Exception e10) {
                    e = e10;
                    motionEvent3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    motionEvent3 = null;
                }
                motionEvent4 = null;
                motionEvent5 = null;
                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o8.OooOOO0("PenKitGestureDetector");
                c20358OooO00o8.OooO(e, new Object[0]);
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                }
                if (motionEventOooO0O0 != null) {
                    motionEventOooO0O0.recycle();
                }
                if (z7) {
                    motionEventOooO00o.recycle();
                }
                if (actionMasked != 1 || actionMasked == 3) {
                    OooO0o0();
                }
                return Boolean.FALSE;
            }
            motionEventOooO0o2 = motionEventOooO0O0;
            C31267OooO c31267OooOOooOOo22 = ((AbstractC31268OooO00o) this.f69134OooO0O0).OooOOo(motionEventOooO0o, motionEventOooO0o2);
            drawResult = c31267OooOOooOOo22.f111645OooO0O0;
            if (drawResult != null) {
            }
            Boolean boolValueOf22 = Boolean.valueOf(c31267OooOOooOOo22.f111644OooO00o);
            if (motionEvent4 != null) {
            }
            if (motionEvent5 != null) {
            }
            if (motionEvent2 != null) {
            }
            if (motionEvent3 != null) {
            }
            if (motionEventOooO0O0 != null) {
            }
            if (!z7) {
            }
        } catch (Throwable th5) {
            th = th5;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            if (motionEventOooO0O0 != null) {
                motionEventOooO0O0.recycle();
            }
            if (z7) {
                motionEventOooO00o.recycle();
            }
            throw th;
        }
        motionEvent3 = null;
        if (motionEventOooO0o.getToolType(0) != 1) {
        }
        motionEvent5 = null;
    }

    public final void OooOO0O() {
        final AbstractC31239OooO00o abstractC31239OooO00o = this.f69134OooO0O0;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f69136OooO0Oo = valueAnimatorOfFloat;
        int i = (int) this.f69134OooO0O0.OooO0o0().getDouble(PenInfo.LASER_DISAPPEAR_DURATION);
        if (i <= 0) {
            i = 3;
        }
        valueAnimatorOfFloat.setDuration(((long) i) * 1000);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0o00.o00000o0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22831OooO0o0 c22831OooO0o0 = this.f88685OooO00o;
                c22831OooO0o0.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abstractC31239OooO00o.OooOOO0(valueAnimatorOfFloat, fFloatValue);
                ((com.orion.editor.OooO00o) c22831OooO0o0.f69135OooO0OO).f69056OooO00o.OoooOOo();
            }
        });
        valueAnimatorOfFloat.addListener(new OooO0O0());
        valueAnimatorOfFloat.start();
    }
}
