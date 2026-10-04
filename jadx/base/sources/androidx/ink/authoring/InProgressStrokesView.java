package androidx.ink.authoring;

import OooOo.C20481OooOOoo;
import OooOo.C20491OooOooo;
import Oooo.OooO0OO;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.ink.authoring.internal.C21954OooOO0o;
import androidx.ink.authoring.internal.OooOO0;
import androidx.ink.authoring.internal.OooOOO;
import androidx.ink.strokes.OooOOO0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import o000O0oO.C24410OooO0Oo;
import o000O0oO.C24413OooO0oo;
import o000O0oO.OooO;
import o000O0oO.OooO0o;
import o000O0oo.C24442Oooo00o;
import o000OO00.OooO0O0;
import o000OO00.o000oOoO;
import o000Oo0o.C24532OooO00o;
import o00oOoo.C25625OooO00o;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8@@@X\u0080\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*\u0004\b \u0010!R/\u0010)\u001a\u0004\u0018\u00010#2\b\u0010\u001b\u001a\u0004\u0018\u00010#8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'*\u0004\b(\u0010!R+\u00100\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.*\u0004\b/\u0010!R5\u00109\u001a\u0004\u0018\u0001012\b\u0010\u001b\u001a\u0004\u0018\u0001018F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105*\u0004\b8\u0010!R5\u0010A\u001a\u0004\u0018\u00010:2\b\u0010\u001b\u001a\u0004\u0018\u00010:8@@@X\u0081\u008e\u0002¢\u0006\u0018\u0012\u0004\b?\u00107\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>*\u0004\b@\u0010!R5\u0010F\u001a\u0004\u0018\u00010:2\b\u0010\u001b\u001a\u0004\u0018\u00010:8@@@X\u0081\u008e\u0002¢\u0006\u0018\u0012\u0004\bD\u00107\u001a\u0004\bB\u0010<\"\u0004\bC\u0010>*\u0004\bE\u0010!¨\u0006G"}, m80612d2 = {"Landroidx/ink/authoring/InProgressStrokesView;", "Landroid/widget/FrameLayout;", "Lo000Oo0o/OooO00o;", "strokePaintAnimator", "LoO00ooO/OooOooO;", "setPaintAnimator", "(Lo000Oo0o/OooO00o;)V", "Lo000O/OooO0O0;", "getLatencyDataCallback", "()Lo000O/OooO0O0;", "value", "setLatencyDataCallback", "(Lo000O/OooO0O0;)V", "", "Lo000O0oO/OooO0Oo;", "Landroidx/ink/strokes/OooOOO0;", "getFinishedStrokes", "()Ljava/util/Map;", "Lo000OO00/o000oOoO;", "OooOo", "Lo000OO00/o000oOoO;", "getTextureBitmapStore", "()Lo000OO00/o000oOoO;", "setTextureBitmapStore", "(Lo000OO00/o000oOoO;)V", "textureBitmapStore", "", "<set-?>", "getHandoffDebounceTimeMs$ink_authoring", "()J", "setHandoffDebounceTimeMs$ink_authoring", "(J)V", "getHandoffDebounceTimeMs$ink_authoring$delegate", "(Landroidx/ink/authoring/InProgressStrokesView;)Ljava/lang/Object;", "handoffDebounceTimeMs", "Landroid/graphics/Path;", "getMaskPath", "()Landroid/graphics/Path;", "setMaskPath", "(Landroid/graphics/Path;)V", "getMaskPath$delegate", "maskPath", "Landroid/graphics/Matrix;", "getMotionEventToViewTransform", "()Landroid/graphics/Matrix;", "setMotionEventToViewTransform", "(Landroid/graphics/Matrix;)V", "getMotionEventToViewTransform$delegate", "motionEventToViewTransform", "Lo00oOoo/OooO00o;", "getInProgressStrokeCounter", "()Lo00oOoo/OooO00o;", "setInProgressStrokeCounter", "(Lo00oOoo/OooO00o;)V", "getInProgressStrokeCounter$annotations", "()V", "getInProgressStrokeCounter$delegate", "inProgressStrokeCounter", "Ljava/util/concurrent/CountDownLatch;", "getCountDownWhenFlushInProgressTestLatch$ink_authoring", "()Ljava/util/concurrent/CountDownLatch;", "setCountDownWhenFlushInProgressTestLatch$ink_authoring", "(Ljava/util/concurrent/CountDownLatch;)V", "getCountDownWhenFlushInProgressTestLatch$ink_authoring$annotations", "getCountDownWhenFlushInProgressTestLatch$ink_authoring$delegate", "countDownWhenFlushInProgressTestLatch", "getAwaitAfterStartOfHandoffTestLatch$ink_authoring", "setAwaitAfterStartOfHandoffTestLatch$ink_authoring", "getAwaitAfterStartOfHandoffTestLatch$ink_authoring$annotations", "getAwaitAfterStartOfHandoffTestLatch$ink_authoring$delegate", "awaitAfterStartOfHandoffTestLatch", "ink-authoring"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class InProgressStrokesView extends FrameLayout {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f65171OooOoO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public o000oOoO textureBitmapStore;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InProgressShapesView<OooO0O0, OooO, OooOOO0> f65173OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final LinkedHashSet f65174OooOoO0;

    static {
        new Matrix();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InProgressStrokesView(Context context) {
        super(context, null, 0);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InProgressShapesView<OooO0O0, OooO, OooOOO0> inProgressShapesView = new InProgressShapesView<>(context);
        this.f65173OooOo0o = inProgressShapesView;
        C24413OooO0oo c24413OooO0oo = new C24413OooO0oo(this);
        inProgressShapesView.setCustomShapeWorkflowFactory$ink_authoring(new OooO0o(this, 0));
        inProgressShapesView.f65162OooOooO.add(c24413OooO0oo);
        this.textureBitmapStore = new androidx.concurrent.futures.OooO0o();
        this.f65174OooOoO0 = new LinkedHashSet();
    }

    public static /* synthetic */ void getAwaitAfterStartOfHandoffTestLatch$ink_authoring$annotations() {
    }

    /* JADX INFO: renamed from: getCountDownWhenFlushInProgressTestLatch$ink_authoring$annotations */
    public static /* synthetic */ void m39xe0d6716b() {
    }

    public static /* synthetic */ void getInProgressStrokeCounter$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(C24410OooO0Oo strokeId, MotionEvent motionEvent) {
        OooOO0<OooO0O0, InProgressShapeT, OooOOO0> oooOO02;
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeId, "strokeId");
        InProgressShapesView<OooO0O0, OooO, OooOOO0> inProgressShapesView = this.f65173OooOo0o;
        inProgressShapesView.getClass();
        C20481OooOOoo<C24410OooO0Oo> c20481OooOOoo = inProgressShapesView.f65164Oooo000;
        long[] jArr = c20481OooOOoo.f58480OooO00o;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = c20481OooOOoo.f58481OooO0O0[i4];
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0((C24410OooO0Oo) c20481OooOOoo.f58482OooO0OO[i4], strokeId)) {
                                c20481OooOOoo.OooO0o(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        InProgressShapesView<OooO0O0, OooO, OooOOO0>.OooO00o oooO00o = inProgressShapesView.f65160OooOoo;
        if (oooO00o == null || (oooOO02 = oooO00o.f65167OooO0OO) == 0) {
            return;
        }
        oooOO02.OooO0OO(strokeId, motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0O0(long j, boolean z) {
        OooO00o<Long> oooO00o;
        TimeUnit timeoutUnit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.OooOOO0.OooO0oO(timeoutUnit, "timeoutUnit");
        InProgressShapesView<OooO0O0, OooO, OooOOO0> inProgressShapesView = this.f65173OooOo0o;
        inProgressShapesView.getClass();
        InProgressShapesView<OooO0O0, OooO, OooOOO0>.OooO00o oooO00o2 = inProgressShapesView.f65160OooOoo;
        if (oooO00o2 == null) {
            return true;
        }
        C20481OooOOoo<C24410OooO0Oo> c20481OooOOoo = inProgressShapesView.f65164Oooo000;
        c20481OooOOoo.f58484OooO0o0 = 0;
        long[] jArr = c20481OooOOoo.f58480OooO00o;
        if (jArr != C20491OooOooo.f58536OooO00o) {
            OooO0OO.OooOOOo(jArr);
            long[] jArr2 = c20481OooOOoo.f58480OooO00o;
            int i = c20481OooOOoo.f58483OooO0Oo;
            int i2 = i >> 3;
            long j2 = 255 << ((i & 7) << 3);
            jArr2[i2] = ((~j2) & jArr2[i2]) | j2;
        }
        OooO0OO.OooOOOO(c20481OooOOoo.f58482OooO0OO, null, 0, c20481OooOOoo.f58483OooO0Oo);
        c20481OooOOoo.f58499OooO0o = C20491OooOooo.OooO0OO(c20481OooOOoo.f58483OooO0Oo) - c20481OooOOoo.f58484OooO0o0;
        OooOO0<OooO0O0, InProgressShapeT, OooOOO0> oooOO02 = oooO00o2.f65167OooO0OO;
        oooOO02.getClass();
        C24442Oooo00o.OooO00o();
        androidx.ink.authoring.internal.OooOOO0 oooOOO0 = oooOO02.f65273OooOO0O;
        LinkedHashMap linkedHashMap = oooOOO0.f65340OooO00o;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((OooOO0.OooOo0) entry.getValue()) instanceof OooOO0.OooOo0.C21953OooO0Oo) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oooO00o = oooOO02.f65268OooO0o;
            if (!zHasNext) {
                break;
            }
            C24410OooO0Oo c24410OooO0Oo = (C24410OooO0Oo) it.next();
            if (z) {
                oooOO02.OooO0OO(c24410OooO0Oo, null);
            } else {
                OooOO0.OooO0oO(oooOO02, null, c24410OooO0Oo, oooO00o.invoke().longValue() / ((long) 1000000), null, 16);
            }
        }
        CountDownLatch countDownLatch = oooOO02.f65270OooO0oO;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        long jLongValue = oooO00o.invoke().longValue();
        OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooOOO = oooOO02.f65264OooO00o;
        boolean zOooO0o = oooOOO.OooO0o();
        C21954OooOO0o c21954OooOO0o = oooOO02.f65275OooOOO;
        if (zOooO0o && (!c21954OooOO0o.f65332OooO0OO.isEmpty() || c21954OooOO0o.f65329OooO.get())) {
            c21954OooOO0o.f65336OooO0oO.set(false);
            OooOO0.OooO oooO = new OooOO0.OooO();
            oooOO02.OooOOo0(oooO);
            oooO.f65277OooO00o.await(j, timeoutUnit);
        }
        if (oooOOO.OooO0o()) {
            C24442Oooo00o.OooO00o();
            Collection collectionValues = oooOOO0.f65340OooO00o.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it2 = collectionValues.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!(((OooOO0.OooOo0) it2.next()) instanceof OooOO0.OooOo0.OooO00o)) {
                        long jLongValue2 = oooO00o.invoke().longValue() - jLongValue;
                        OooOO0.C19025OooOO0 c19025OooOO0 = c21954OooOO0o.f65337OooO0oo;
                        long nanos = timeoutUnit.toNanos(j) - jLongValue2;
                        TimeUnit unit = TimeUnit.NANOSECONDS;
                        c19025OooOO0.getClass();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(unit, "unit");
                        C24442Oooo00o.OooO00o();
                        CountDownLatch countDownLatch2 = c19025OooOO0.f65292OooO00o.get();
                        if (!(countDownLatch2 != null ? countDownLatch2.await(nanos, unit) : true)) {
                            return false;
                        }
                    }
                }
            }
        }
        C24442Oooo00o.OooO00o();
        oooOOO0.f65342OooO0OO = true;
        OooOO0.OooO0o oooO0oOooO0Oo = oooOO02.OooO0Oo();
        if (!(oooO0oOooO0Oo instanceof OooOO0.C21946OooO0oo)) {
            return oooO0oOooO0Oo instanceof OooOO0.OooOOOO;
        }
        oooOO02.OooO(((OooOO0.C21946OooO0oo) oooO0oOooO0Oo).f65291OooO00o);
        return true;
    }

    public final CountDownLatch getAwaitAfterStartOfHandoffTestLatch$ink_authoring() {
        return this.f65173OooOo0o.getAwaitAfterStartOfHandoffTestLatch$ink_authoring();
    }

    public final CountDownLatch getCountDownWhenFlushInProgressTestLatch$ink_authoring() {
        return this.f65173OooOo0o.getCountDownWhenFlushInProgressTestLatch$ink_authoring();
    }

    public final Map<C24410OooO0Oo, OooOOO0> getFinishedStrokes() {
        return this.f65173OooOo0o.getCompletedShapes();
    }

    public final long getHandoffDebounceTimeMs$ink_authoring() {
        return this.f65173OooOo0o.getHandoffDebounceTimeMs();
    }

    public final C25625OooO00o getInProgressStrokeCounter() {
        this.f65173OooOo0o.getInProgressShapeCounter();
        return null;
    }

    public final o000O.OooO0O0 getLatencyDataCallback() {
        return this.f65173OooOo0o.getLatencyDataCallback();
    }

    public final Path getMaskPath() {
        return this.f65173OooOo0o.getMaskPath();
    }

    public final Matrix getMotionEventToViewTransform() {
        return this.f65173OooOo0o.getMotionEventToViewTransform();
    }

    public final o000oOoO getTextureBitmapStore() {
        return this.textureBitmapStore;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addView(this.f65173OooOo0o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeView(this.f65173OooOo0o);
    }

    public final void setAwaitAfterStartOfHandoffTestLatch$ink_authoring(CountDownLatch countDownLatch) {
        this.f65173OooOo0o.setAwaitAfterStartOfHandoffTestLatch$ink_authoring(countDownLatch);
    }

    public final void setCountDownWhenFlushInProgressTestLatch$ink_authoring(CountDownLatch countDownLatch) {
        this.f65173OooOo0o.setCountDownWhenFlushInProgressTestLatch$ink_authoring(countDownLatch);
    }

    public final void setHandoffDebounceTimeMs$ink_authoring(long j) {
        this.f65173OooOo0o.setHandoffDebounceTimeMs$ink_authoring(j);
    }

    public final void setInProgressStrokeCounter(C25625OooO00o c25625OooO00o) {
        this.f65173OooOo0o.setInProgressShapeCounter(c25625OooO00o);
    }

    public final void setLatencyDataCallback(o000O.OooO0O0 value) {
        this.f65173OooOo0o.setLatencyDataCallback(value);
    }

    public final void setMaskPath(Path path) {
        this.f65173OooOo0o.setMaskPath(path);
    }

    public final void setMotionEventToViewTransform(Matrix matrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "<set-?>");
        this.f65173OooOo0o.setMotionEventToViewTransform(matrix);
    }

    public final void setPaintAnimator(C24532OooO00o strokePaintAnimator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokePaintAnimator, "strokePaintAnimator");
        throw null;
    }

    public final void setTextureBitmapStore(o000oOoO value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        if (this.f65173OooOo0o.getCustomShapeWorkflow() != null) {
            throw new IllegalStateException("Cannot set textureBitmapStore after initialization.");
        }
        this.textureBitmapStore = value;
    }
}
