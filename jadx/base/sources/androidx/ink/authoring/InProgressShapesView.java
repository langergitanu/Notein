package androidx.ink.authoring;

import OooOo.C20481OooOOoo;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import android.widget.FrameLayout;
import androidx.ink.authoring.internal.OooO0o;
import androidx.ink.authoring.internal.OooOO0;
import androidx.ink.authoring.internal.OooOOO;
import com.google.firebase.crashlytics.internal.concurrency.C22572OooO0oO;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import o000O0oO.C24409OooO00o;
import o000O0oO.C24410OooO0Oo;
import o000O0oO.InterfaceC24414OooOO0o;
import o000O0oO.OooO0O0;
import o000O0oo.C24431OooOo0;
import o000O0oo.C24442Oooo00o;
import o000Oo0o.C24532OooO00o;
import o00oOoo.C25625OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003*\b\b\u0002\u0010\u0005*\u00020\u00012\u00020\u0006:\u0001XJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00168\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cRR\u0010%\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R<\u0010-\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001e\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u00105\u001a\u0004\u0018\u00010.2\b\u0010\u000f\u001a\u0004\u0018\u00010.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010=\u001a\u0002062\u0006\u0010\u000f\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010B\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010AR.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u000bR4\u0010H\u001a\u0004\u0018\u00010G2\b\u0010\u000f\u001a\u0004\u0018\u00010G8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010A\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010T\u001a\u0004\u0018\u00010O2\b\u0010\u000f\u001a\u0004\u0018\u00010O8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010W\u001a\u0004\u0018\u00010O2\b\u0010\u000f\u001a\u0004\u0018\u00010O8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010S¨\u0006Y"}, m80612d2 = {"Landroidx/ink/authoring/InProgressShapesView;", "", "ShapeSpecT", "Lo000O0oO/OooO0O0;", "InProgressShapeT", "CompletedShapeT", "Landroid/widget/FrameLayout;", "Lo000Oo0o/OooO00o;", "strokePaintAnimator", "LoO00ooO/OooOooO;", "setPaintAnimator", "(Lo000Oo0o/OooO00o;)V", "Lo000O/OooO0O0;", "getLatencyDataCallback", "()Lo000O/OooO0O0;", "value", "setLatencyDataCallback", "(Lo000O/OooO0O0;)V", "", "Lo000O0oO/OooO0Oo;", "getCompletedShapes", "()Ljava/util/Map;", "", "OooOo0o", "J", "getHandoffDebounceTimeMs$ink_authoring", "()J", "setHandoffDebounceTimeMs$ink_authoring", "(J)V", "handoffDebounceTimeMs", "Lo000O0oO/OooOO0o;", "OooOo", "Lo000O0oO/OooOO0o;", "getCustomShapeWorkflow", "()Lo000O0oO/OooOO0o;", "setCustomShapeWorkflow", "(Lo000O0oO/OooOO0o;)V", "customShapeWorkflow", "Lkotlin/Function0;", "OooOoO0", "LoO0O000o/OooO00o;", "getCustomShapeWorkflowFactory$ink_authoring", "()LoO0O000o/OooO00o;", "setCustomShapeWorkflowFactory$ink_authoring", "(LoO0O000o/OooO00o;)V", "customShapeWorkflowFactory", "Landroid/graphics/Path;", "OooOoO", "Landroid/graphics/Path;", "getMaskPath", "()Landroid/graphics/Path;", "setMaskPath", "(Landroid/graphics/Path;)V", "maskPath", "Landroid/graphics/Matrix;", "OooOoOO", "Landroid/graphics/Matrix;", "getMotionEventToViewTransform", "()Landroid/graphics/Matrix;", "setMotionEventToViewTransform", "(Landroid/graphics/Matrix;)V", "motionEventToViewTransform", "OooOoo0", "Lo000O/OooO0O0;", "getLatencyDataCallback$annotations", "()V", "latencyDataCallback", "Lo000Oo0o/OooO00o;", "getStrokePaintAnimator$ink_authoring", "()Lo000Oo0o/OooO00o;", "setStrokePaintAnimator$ink_authoring", "Lo00oOoo/OooO00o;", "inProgressShapeCounter", "Lo00oOoo/OooO00o;", "getInProgressShapeCounter", "()Lo00oOoo/OooO00o;", "setInProgressShapeCounter", "(Lo00oOoo/OooO00o;)V", "getInProgressShapeCounter$annotations", "Ljava/util/concurrent/CountDownLatch;", "getCountDownWhenFlushInProgressTestLatch$ink_authoring", "()Ljava/util/concurrent/CountDownLatch;", "setCountDownWhenFlushInProgressTestLatch$ink_authoring", "(Ljava/util/concurrent/CountDownLatch;)V", "countDownWhenFlushInProgressTestLatch", "getAwaitAfterStartOfHandoffTestLatch$ink_authoring", "setAwaitAfterStartOfHandoffTestLatch$ink_authoring", "awaitAfterStartOfHandoffTestLatch", "OooO00o", "ink-authoring"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class InProgressShapesView<ShapeSpecT, InProgressShapeT extends OooO0O0<? super ShapeSpecT, ? extends CompletedShapeT>, CompletedShapeT> extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, CompletedShapeT> customShapeWorkflow;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public long handoffDebounceTimeMs;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name and from kotlin metadata */
    public Path maskPath;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    public oO0O000o.OooO00o<? extends InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, CompletedShapeT>> customShapeWorkflowFactory;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name and from kotlin metadata */
    public final Matrix motionEventToViewTransform;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o f65160OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public o000O.OooO0O0 latencyDataCallback;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final LinkedHashSet f65162OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final LinkedHashMap f65163OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C20481OooOOoo<C24410OooO0Oo> f65164Oooo000;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C24409OooO00o<CompletedShapeT> f65165OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65166OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOO0<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65167OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65168OooO0Oo;

        /* JADX INFO: renamed from: androidx.ink.authoring.InProgressShapesView$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final /* synthetic */ class C19021OooO00o extends C24019OooOO0o implements InterfaceC32507OooOO0o<Runnable, C32460OooOooO> {
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final C32460OooOooO invoke(Runnable runnable) {
                ((InProgressShapesView) this.receiver).postOnAnimation(runnable);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public static final /* synthetic */ class OooO0O0 extends kotlin.jvm.internal.OooO00o implements InterfaceC32507OooOO0o<Runnable, C32460OooOooO> {
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final C32460OooOooO invoke(Runnable runnable) {
                ((InProgressShapesView) this.f80923OooOo0o).post(runnable);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public static final class OooO0OO implements OooOO0.OooOO0O<CompletedShapeT> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o f65169OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65170OooO0O0;

            public OooO0OO(InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o, InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT> inProgressShapesView) {
                this.f65169OooO00o = oooO00o;
                this.f65170OooO0O0 = inProgressShapesView;
            }

            @Override // androidx.ink.authoring.internal.OooOO0.OooOO0O
            public final void OooO00o(List<C24431OooOo0<CompletedShapeT>> strokes) {
                OooOOO0.OooO0oO(strokes, "strokes");
                C24409OooO00o<CompletedShapeT> c24409OooO00o = this.f65169OooO00o.f65165OooO00o;
                c24409OooO00o.getClass();
                LinkedHashMap linkedHashMap = c24409OooO00o.f82417OooOo;
                for (Object obj : strokes) {
                    linkedHashMap.put(((C24431OooOo0) obj).f82452OooO00o, obj);
                }
                c24409OooO00o.invalidate();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (C24431OooOo0<CompletedShapeT> c24431OooOo0 : strokes) {
                    linkedHashMap2.put(c24431OooOo0.f82452OooO00o, c24431OooOo0.f82453OooO0O0);
                }
                InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT> inProgressShapesView = this.f65170OooO0O0;
                inProgressShapesView.f65163OooOooo.putAll(linkedHashMap2);
                Iterator it = inProgressShapesView.f65162OooOooO.iterator();
                while (it.hasNext()) {
                    ((o000O0oO.OooO0OO) it.next()).OooO00o(linkedHashMap2);
                }
            }
        }

        public OooO00o(InProgressShapesView inProgressShapesView, InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, CompletedShapeT> shapeWorkflow) {
            OooOOO0.OooO0oO(shapeWorkflow, "shapeWorkflow");
            this.f65168OooO0Oo = inProgressShapesView;
            Context context = inProgressShapesView.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            inProgressShapesView.getStrokePaintAnimator$ink_authoring();
            this.f65165OooO00o = new C24409OooO00o<>(context, shapeWorkflow);
            OooO0OO oooO0OO = new OooO0OO(this, inProgressShapesView);
            o000O0oO.OooOO0 oooOO0OooO00o = shapeWorkflow.OooO00o();
            int i = Build.VERSION.SDK_INT;
            OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = i >= 33 ? new OooO0o<>(inProgressShapesView, oooOO0OooO00o) : i >= 29 ? new androidx.ink.authoring.internal.OooO0O0<>(inProgressShapesView, oooOO0OooO00o) : new androidx.ink.authoring.internal.OooO00o<>(inProgressShapesView, oooOO0OooO00o);
            oooO0o.f65339OooO0O0 = inProgressShapesView.getMaskPath();
            this.f65166OooO0O0 = oooO0o;
            OooOO0<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooOO02 = new OooOO0<>(oooO0o, shapeWorkflow, new C19021OooO00o(1, inProgressShapesView, InProgressShapesView.class, "postOnAnimation", "postOnAnimation(Ljava/lang/Runnable;)V", 0), new OooO0O0(1, inProgressShapesView, InProgressShapesView.class, "post", "post(Ljava/lang/Runnable;)Z", 8), new C22572OooO0oO(inProgressShapesView));
            C24442Oooo00o.OooO00o();
            androidx.ink.authoring.internal.OooOOO0 oooOOO0 = oooOO02.f65273OooOO0O;
            oooOOO0.f65344OooO0o0.add(oooO0OO);
            Matrix value = inProgressShapesView.getMotionEventToViewTransform();
            OooOOO0.OooO0oO(value, "value");
            oooOO02.f65263OooO.set(value);
            oooOO02.OooOOo0(new OooOO0.C21947OooOO0o(new Matrix(value)));
            inProgressShapesView.getInProgressShapeCounter();
            long handoffDebounceTimeMs = inProgressShapesView.getHandoffDebounceTimeMs();
            if (oooOO02.f65264OooO00o.OooO0oo()) {
                C24442Oooo00o.OooO00o();
                oooOOO0.f65341OooO0O0 = handoffDebounceTimeMs;
                oooOO02.OooOOOo();
            }
            if (oooO0o.f65338OooO00o != null) {
                throw new IllegalStateException("callback must be set exactly once before use.");
            }
            oooO0o.f65338OooO00o = oooOO02;
            this.f65167OooO0OO = oooOO02;
        }
    }

    static {
        new Matrix();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InProgressShapesView(Context context) {
        super(context, null, 0);
        OooOOO0.OooO0oO(context, "context");
        this.motionEventToViewTransform = new Matrix();
        this.f65162OooOooO = new LinkedHashSet();
        this.f65163OooOooo = new LinkedHashMap();
        this.f65164Oooo000 = new C20481OooOOoo<>((Object) null);
    }

    public static /* synthetic */ void getInProgressShapeCounter$annotations() {
    }

    private static /* synthetic */ void getLatencyDataCallback$annotations() {
    }

    public final InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o OooO00o() {
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o = this.f65160OooOoo;
        if (oooO00o != null) {
            return oooO00o;
        }
        InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, CompletedShapeT> interfaceC24414OooOO0oInvoke = this.customShapeWorkflow;
        if (interfaceC24414OooOO0oInvoke == null) {
            oO0O000o.OooO00o<? extends InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, CompletedShapeT>> oooO00o2 = this.customShapeWorkflowFactory;
            if (oooO00o2 == null) {
                throw new IllegalStateException("Must set `InProgressShapesView.customShapeWorkflowFactory` before calling `startShape` or `eagerInit`. Consider using `InProgressStrokesView` instead for easier initialization and recommended behavior.");
            }
            interfaceC24414OooOO0oInvoke = oooO00o2.invoke();
            setCustomShapeWorkflow(interfaceC24414OooOO0oInvoke);
        }
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o3 = new OooO00o(this, interfaceC24414OooOO0oInvoke);
        this.f65160OooOoo = oooO00o3;
        if (isAttachedToWindow()) {
            addView(oooO00o3.f65165OooO00o, 0);
        }
        return oooO00o3;
    }

    public final CountDownLatch getAwaitAfterStartOfHandoffTestLatch$ink_authoring() {
        return OooO00o().f65167OooO0OO.f65271OooO0oo;
    }

    public final Map<C24410OooO0Oo, CompletedShapeT> getCompletedShapes() {
        return this.f65163OooOooo;
    }

    public final CountDownLatch getCountDownWhenFlushInProgressTestLatch$ink_authoring() {
        return OooO00o().f65167OooO0OO.f65270OooO0oO;
    }

    public final InterfaceC24414OooOO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> getCustomShapeWorkflow() {
        return this.customShapeWorkflow;
    }

    public final oO0O000o.OooO00o<InterfaceC24414OooOO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>> getCustomShapeWorkflowFactory$ink_authoring() {
        return this.customShapeWorkflowFactory;
    }

    /* JADX INFO: renamed from: getHandoffDebounceTimeMs$ink_authoring, reason: from getter */
    public final long getHandoffDebounceTimeMs() {
        return this.handoffDebounceTimeMs;
    }

    public final C25625OooO00o getInProgressShapeCounter() {
        return null;
    }

    public final o000O.OooO0O0 getLatencyDataCallback() {
        return this.latencyDataCallback;
    }

    public final Path getMaskPath() {
        return this.maskPath;
    }

    public final Matrix getMotionEventToViewTransform() {
        return this.motionEventToViewTransform;
    }

    public final C24532OooO00o getStrokePaintAnimator$ink_authoring() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o = this.f65160OooOoo;
        if (oooO00o != null) {
            oooO00o.f65168OooO0Oo.addView(oooO00o.f65165OooO00o, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o = this.f65160OooOoo;
        if (oooO00o != null) {
            oooO00o.f65168OooO0Oo.removeView(oooO00o.f65165OooO00o);
        }
    }

    public final void setAwaitAfterStartOfHandoffTestLatch$ink_authoring(CountDownLatch countDownLatch) {
        OooO00o().f65167OooO0OO.f65271OooO0oo = countDownLatch;
    }

    public final void setCountDownWhenFlushInProgressTestLatch$ink_authoring(CountDownLatch countDownLatch) {
        OooO00o().f65167OooO0OO.f65270OooO0oO = countDownLatch;
    }

    public final void setCustomShapeWorkflow(InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, CompletedShapeT> interfaceC24414OooOO0o) {
        if (this.f65160OooOoo != null) {
            throw new IllegalStateException("Cannot set customShapeAdapter after initialization.");
        }
        this.customShapeWorkflow = interfaceC24414OooOO0o;
    }

    public final void setCustomShapeWorkflowFactory$ink_authoring(oO0O000o.OooO00o<? extends InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, CompletedShapeT>> oooO00o) {
        this.customShapeWorkflowFactory = oooO00o;
    }

    public final void setHandoffDebounceTimeMs$ink_authoring(long j) {
        OooOO0<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooOO02;
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "Debounce time must not be negative, received ").toString());
        }
        this.handoffDebounceTimeMs = j;
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o = this.f65160OooOoo;
        if (oooO00o == null || (oooOO02 = oooO00o.f65167OooO0OO) == null || !oooOO02.f65264OooO00o.OooO0oo()) {
            return;
        }
        C24442Oooo00o.OooO00o();
        oooOO02.f65273OooOO0O.f65341OooO0O0 = j;
        oooOO02.OooOOOo();
    }

    public final void setInProgressShapeCounter(C25625OooO00o c25625OooO00o) {
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o = this.f65160OooOoo;
        if (oooO00o != null) {
            oooO00o.f65167OooO0OO.getClass();
        }
    }

    public final void setLatencyDataCallback(o000O.OooO0O0 value) {
        this.latencyDataCallback = value;
    }

    public final void setMaskPath(Path path) {
        this.maskPath = path;
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o = this.f65160OooOoo;
        if (oooO00o != null) {
            oooO00o.f65166OooO0O0.f65339OooO0O0 = path;
        }
    }

    public final void setMotionEventToViewTransform(Matrix value) {
        OooOOO0.OooO0oO(value, "value");
        this.motionEventToViewTransform.set(value);
        InProgressShapesView<ShapeSpecT, InProgressShapeT, CompletedShapeT>.OooO00o oooO00o = this.f65160OooOoo;
        if (oooO00o != null) {
            OooOO0<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooOO02 = oooO00o.f65167OooO0OO;
            oooOO02.getClass();
            oooOO02.f65263OooO.set(value);
            oooOO02.OooOOo0(new OooOO0.C21947OooOO0o(new Matrix(value)));
        }
    }

    public final void setPaintAnimator(C24532OooO00o strokePaintAnimator) {
        OooOOO0.OooO0oO(strokePaintAnimator, "strokePaintAnimator");
        throw null;
    }

    public final void setStrokePaintAnimator$ink_authoring(C24532OooO00o c24532OooO00o) {
        if (this.f65160OooOoo != null) {
            throw new IllegalStateException("Cannot set strokePaintAnimator after initialization.");
        }
    }
}
