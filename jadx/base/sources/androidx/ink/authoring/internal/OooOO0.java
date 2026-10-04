package androidx.ink.authoring.internal;

import android.graphics.Matrix;
import android.view.MotionEvent;
import androidx.ink.authoring.InProgressShapesView;
import androidx.ink.authoring.internal.OooOOO;
import androidx.ink.geometry.MutableBox;
import androidx.ink.strokes.C21970OooO0oo;
import androidx.ink.strokes.MutableStrokeInputBatchNative;
import androidx.ink.strokes.StrokeInput;
import com.facebook.soloader.OooOo;
import com.google.firebase.crashlytics.internal.concurrency.C22572OooO0oO;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o000O.C24359OooO0Oo;
import o000O.OooO00o;
import o000O0oO.C24410OooO0Oo;
import o000O0oO.InterfaceC24414OooOO0o;
import o000O0oO.OooO0O0;
import o000O0oo.C24417OooO0O0;
import o000O0oo.C24431OooOo0;
import o000O0oo.C24434OooOoO;
import o000O0oo.C24437OooOoo;
import o000O0oo.C24442Oooo00o;
import o000O0oo.InterfaceC24435OooOoO0;
import o000O0oo.Oooo000;
import o000O0oo.RunnableC24436OooOoOO;
import o000O0oo.RunnableC24438OooOoo0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0<ShapeSpecT, InProgressShapeT extends o000O0oO.OooO0O0<? super ShapeSpecT, ? extends CompletedShapeT>, CompletedShapeT> implements OooOOO.OooO00o<CompletedShapeT> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Matrix f65263OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.ink.authoring.internal.OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65264OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC24414OooOO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65265OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InProgressShapesView.OooO00o.C19021OooO00o f65266OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InProgressShapesView.OooO00o.OooO0O0 f65267OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO0O000o.OooO00o<Long> f65268OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O.OooO0O0 f65269OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public CountDownLatch f65270OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CountDownLatch f65271OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C24359OooO0Oo f65272OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final androidx.ink.authoring.internal.OooOOO0 f65273OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final RunnableC24438OooOoo0 f65274OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C21954OooOO0o f65275OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final androidx.ink.authoring.internal.OooOO0O f65276OooOOO0;

    public static final class OooO implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CountDownLatch f65277OooO00o = new CountDownLatch(1);
    }

    public interface OooO00o {
    }

    public static final class OooO0O0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C21970OooO0oo f65278OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C21970OooO0oo f65279OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C24410OooO0Oo f65280OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C34426OooOO0o<o000O.OooO00o> f65281OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C34426OooOO0o<o000O.OooO00o> f65282OooO0o0;

        public OooO0O0() {
            this(null);
        }

        public OooO0O0(Object obj) {
            C21970OooO0oo c21970OooO0oo = new C21970OooO0oo();
            C21970OooO0oo c21970OooO0oo2 = new C21970OooO0oo();
            C24410OooO0Oo c24410OooO0Oo = new C24410OooO0Oo();
            C34426OooOO0o<o000O.OooO00o> c34426OooOO0o = new C34426OooOO0o<>(15);
            C34426OooOO0o<o000O.OooO00o> c34426OooOO0o2 = new C34426OooOO0o<>(15);
            this.f65278OooO00o = c21970OooO0oo;
            this.f65279OooO0O0 = c21970OooO0oo2;
            this.f65280OooO0OO = c24410OooO0Oo;
            this.f65281OooO0Oo = c34426OooOO0o;
            this.f65282OooO0o0 = c34426OooOO0o2;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ConcurrentLinkedQueue<OooO0O0> f65283OooO00o = new ConcurrentLinkedQueue<>();

        public final void OooO00o(OooO0O0 oooO0O0) {
            C21970OooO0oo c21970OooO0oo = oooO0O0.f65278OooO00o;
            c21970OooO0oo.getClass();
            MutableStrokeInputBatchNative mutableStrokeInputBatchNative = MutableStrokeInputBatchNative.f65459OooO00o;
            mutableStrokeInputBatchNative.clear(c21970OooO0oo.OooO0O0());
            C21970OooO0oo c21970OooO0oo2 = oooO0O0.f65279OooO0O0;
            c21970OooO0oo2.getClass();
            mutableStrokeInputBatchNative.clear(c21970OooO0oo2.OooO0O0());
            oooO0O0.f65281OooO0Oo.clear();
            oooO0O0.f65282OooO0o0.clear();
            this.f65283OooO00o.offer(oooO0O0);
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21943OooO0Oo implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C21943OooO0Oo f65284OooO00o = new C21943OooO0Oo();
    }

    public interface OooO0o {
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooO0o0, reason: case insensitive filesystem */
    public static final class C21944OooO0o0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C24410OooO0Oo f65285OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O.OooO00o f65286OooO0O0;

        public C21944OooO0o0(C24410OooO0Oo strokeId, o000O.OooO00o oooO00o) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(strokeId, "strokeId");
            this.f65285OooO00o = strokeId;
            this.f65286OooO0O0 = oooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooO0oO, reason: case insensitive filesystem */
    public static final class C21945OooO0oO implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final StrokeInput f65287OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C24410OooO0Oo f65288OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f65289OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000O.OooO00o f65290OooO0Oo;

        public C21945OooO0oO(StrokeInput strokeInput, C24410OooO0Oo strokeId, boolean z, o000O.OooO00o oooO00o) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(strokeId, "strokeId");
            this.f65287OooO00o = strokeInput;
            this.f65288OooO0O0 = strokeId;
            this.f65289OooO0OO = z;
            this.f65290OooO0Oo = oooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooO0oo, reason: case insensitive filesystem */
    public static final class C21946OooO0oo<CompletedShapeT> implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C32465OooO0O0 f65291OooO00o;

        public C21946OooO0oo(C32465OooO0O0 finishedCohort) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(finishedCohort, "finishedCohort");
            this.f65291OooO00o = finishedCohort;
            if (finishedCohort.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOO0, reason: collision with other inner class name */
    public static final class C19025OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReference<CountDownLatch> f65292OooO00o = new AtomicReference<>(null);
    }

    public interface OooOO0O<CompletedShapeT> {
        void OooO00o(List<C24431OooOo0<CompletedShapeT>> list);
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOO0o, reason: case insensitive filesystem */
    public static final class C21947OooOO0o implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f65293OooO00o;

        public C21947OooOO0o(Matrix matrix) {
            this.f65293OooO00o = matrix;
        }
    }

    public static final class OooOOO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO f65294OooO00o = new OooOOO();
    }

    public static final class OooOOO0 implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO0 f65295OooO00o = new OooOOO0();
    }

    public static final class OooOOOO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOOO f65296OooO00o = new OooOOOO();
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOOo, reason: case insensitive filesystem */
    public static final class C21948OooOOOo<ShapeSpecT, InProgressShapeT extends o000O0oO.OooO0O0<? super ShapeSpecT, ? extends CompletedShapeT>, CompletedShapeT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InProgressShapeT f65297OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Matrix f65298OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f65299OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public InterfaceC21949OooO0Oo f65300OooO0Oo;

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOOo$OooO00o */
        public static final class OooO00o implements InterfaceC21949OooO0Oo {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o f65301OooO00o = new OooO00o();
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOOo$OooO0O0 */
        public static final class OooO0O0 implements InterfaceC21949OooO0Oo {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0O0 f65302OooO00o = new OooO0O0();
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOOo$OooO0OO */
        public static final class OooO0OO implements InterfaceC21949OooO0Oo {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0OO f65303OooO00o = new OooO0OO();
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOOo$OooO0Oo, reason: case insensitive filesystem */
        public interface InterfaceC21949OooO0Oo {
        }

        public C21948OooOOOo() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C21948OooOOOo(o000O0oO.OooO0O0 inProgressShape, Matrix matrix, long j) {
            OooO0OO oooO0OO = OooO0OO.f65303OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressShape, "inProgressShape");
            this.f65297OooO00o = inProgressShape;
            this.f65298OooO0O0 = matrix;
            this.f65299OooO0OO = j;
            this.f65300OooO0Oo = oooO0OO;
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOo, reason: case insensitive filesystem */
    public static final class C21950OooOOo implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C21950OooOOo f65304OooO00o = new C21950OooOOo();
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOo0, reason: case insensitive filesystem */
    public static final class C21951OooOOo0<ShapeSpecT> implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final StrokeInput f65305OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C24410OooO0Oo f65306OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Matrix f65307OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000OO00.OooO0O0 f65308OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f65309OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000O.OooO00o f65310OooO0o0;

        public C21951OooOOo0(StrokeInput strokeInput, C24410OooO0Oo c24410OooO0Oo, Matrix matrix, o000OO00.OooO0O0 oooO0O0, o000O.OooO00o oooO00o, long j) {
            this.f65305OooO00o = strokeInput;
            this.f65306OooO0O0 = c24410OooO0Oo;
            this.f65307OooO0OO = matrix;
            this.f65308OooO0Oo = oooO0O0;
            this.f65310OooO0o0 = oooO00o;
            this.f65309OooO0o = j;
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOOoo, reason: case insensitive filesystem */
    public static final class C21952OooOOoo implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C21952OooOOoo f65311OooO00o = new C21952OooOOoo();
    }

    public interface OooOo0 {

        public static final class OooO00o implements OooOo0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o f65312OooO00o = new OooO00o();
        }

        public static final class OooO0O0<CompletedShapeT> implements OooOo0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final C24431OooOo0<CompletedShapeT> f65313OooO00o;

            public OooO0O0(C24431OooOo0<CompletedShapeT> c24431OooOo0) {
                this.f65313OooO00o = c24431OooOo0;
            }
        }

        public static final class OooO0OO implements OooOo0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0OO f65314OooO00o = new OooO0OO();
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooOO0$OooOo0$OooO0Oo, reason: case insensitive filesystem */
        public static final class C21953OooO0Oo implements OooOo0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Matrix f65315OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final long f65316OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final float f65317OooO0OO;

            public C21953OooO0Oo(Matrix matrix, long j, float f) {
                this.f65315OooO00o = matrix;
                this.f65316OooO0O0 = j;
                this.f65317OooO0OO = f;
            }
        }
    }

    public static final class OooOo00 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CountDownLatch f65318OooO00o = new CountDownLatch(1);
    }

    public OooOO0() {
        throw null;
    }

    public OooOO0(androidx.ink.authoring.internal.OooOOO oooOOO, InterfaceC24414OooOO0o shapeWorkflow, InProgressShapesView.OooO00o.C19021OooO00o c19021OooO00o, InProgressShapesView.OooO00o.OooO0O0 oooO0O0, C22572OooO0oO c22572OooO0oO) {
        C24437OooOoo getSystemElapsedTimeNanos = C24437OooOoo.f82467OooOo0o;
        C24434OooOoO c24434OooOoO = new C24434OooOoO(shapeWorkflow);
        kotlin.jvm.internal.OooOOO0.OooO0oO(shapeWorkflow, "shapeWorkflow");
        kotlin.jvm.internal.OooOOO0.OooO0oO(getSystemElapsedTimeNanos, "getSystemElapsedTimeNanos");
        this.f65264OooO00o = oooOOO;
        this.f65265OooO0O0 = shapeWorkflow;
        this.f65266OooO0OO = c19021OooO00o;
        this.f65267OooO0Oo = oooO0O0;
        this.f65269OooO0o0 = c22572OooO0oO;
        this.f65268OooO0o = getSystemElapsedTimeNanos;
        this.f65263OooO = new Matrix();
        this.f65272OooOO0 = new C24359OooO0Oo();
        this.f65273OooOO0O = new androidx.ink.authoring.internal.OooOOO0();
        this.f65274OooOO0o = new RunnableC24438OooOoo0(this, 0);
        this.f65276OooOOO0 = new androidx.ink.authoring.internal.OooOO0O(this, c24434OooOoO);
        this.f65275OooOOO = new C21954OooOO0o(this);
    }

    public static void OooO0oO(OooOO0 oooOO02, StrokeInput strokeInput, C24410OooO0Oo c24410OooO0Oo, long j, o000O.OooO00o oooO00o, int i) {
        boolean z = (i & 8) == 0;
        if ((i & 16) != 0) {
            oooO00o = null;
        }
        oooOO02.OooO0O0(c24410OooO0Oo);
        C24442Oooo00o.OooO00o();
        androidx.ink.authoring.internal.OooOOO0 oooOOO0 = oooOO02.f65273OooOO0O;
        oooOOO0.f65343OooO0Oo = j;
        C24442Oooo00o.OooO00o();
        oooOOO0.f65340OooO00o.put(c24410OooO0Oo, OooOo0.OooO0OO.f65314OooO00o);
        oooOO02.OooOOo0(new C21945OooO0oO(strokeInput, c24410OooO0Oo, z, oooO00o));
    }

    public static void OooOOoo(C21948OooOOOo c21948OooOOOo, long j, boolean z) {
        c21948OooOOOo.f65297OooO00o.OooO0o0((j / 1000000) - c21948OooOOOo.f65299OooO0OO);
        if (z) {
            c21948OooOOOo.f65297OooO00o.OooO0Oo();
        }
    }

    public final void OooO(C32465OooO0O0 c32465OooO0O0) {
        CountDownLatch countDownLatch = this.f65271OooO0oo;
        androidx.ink.authoring.internal.OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooOOO = this.f65264OooO00o;
        if (countDownLatch != null) {
            oooOOO.OooO0Oo(new RunnableC24436OooOoOO(countDownLatch, 0));
        }
        C24442Oooo00o.OooO00o();
        androidx.ink.authoring.internal.OooOOO0 oooOOO0 = this.f65273OooOO0O;
        oooOOO0.f65342OooO0OO = false;
        C24442Oooo00o.OooO00o();
        oooOOO0.f65343OooO0Oo = Long.MIN_VALUE;
        this.f65275OooOOO.f65336OooO0oO.set(true);
        OooOOo0(C21950OooOOo.f65304OooO00o);
        oooOOO.OooOO0O(c32465OooO0O0);
    }

    public final void OooO00o() {
        this.f65264OooO00o.OooO0O0();
    }

    public final OooOo0.C21953OooO0Oo OooO0O0(C24410OooO0Oo c24410OooO0Oo) {
        C24442Oooo00o.OooO00o();
        OooOo0 oooOo0 = (OooOo0) this.f65273OooOO0O.f65340OooO00o.get(c24410OooO0Oo);
        if (oooOo0 instanceof OooOo0.C21953OooO0Oo) {
            return (OooOo0.C21953OooO0Oo) oooOo0;
        }
        if (oooOo0 instanceof OooOo0.OooO00o) {
            throw new IllegalStateException(("Stroke with ID " + c24410OooO0Oo + " was already canceled.").toString());
        }
        if ((oooOo0 instanceof OooOo0.OooO0OO) || (oooOo0 instanceof OooOo0.OooO0O0)) {
            throw new IllegalStateException(("Stroke with ID " + c24410OooO0Oo + " is already finished.").toString());
        }
        if (oooOo0 != null) {
            throw new C32442OooOO0o();
        }
        throw new IllegalStateException(("Stroke with ID " + c24410OooO0Oo + " was not found.").toString());
    }

    public final void OooO0OO(C24410OooO0Oo strokeId, MotionEvent motionEvent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeId, "strokeId");
        long jLongValue = this.f65268OooO0o.invoke().longValue();
        C24442Oooo00o.OooO00o();
        androidx.ink.authoring.internal.OooOOO0 oooOOO0 = this.f65273OooOO0O;
        if (oooOOO0.f65340OooO00o.get(strokeId) instanceof OooOo0.C21953OooO0Oo) {
            C24442Oooo00o.OooO00o();
            oooOOO0.f65340OooO00o.put(strokeId, OooOo0.OooO00o.f65312OooO00o);
            C24442Oooo00o.OooO00o();
            oooOOO0.f65343OooO0Oo = jLongValue / ((long) 1000000);
            OooOOo0(new C21944OooO0o0(strokeId, C24359OooO0Oo.OooO0OO(this.f65272OooOO0, motionEvent, OooO00o.C24358OooO0Oo.f82159OooO0o, strokeId, jLongValue)));
        }
    }

    public final OooO0o OooO0Oo() {
        while (true) {
            C21954OooOO0o c21954OooOO0o = this.f65275OooOOO;
            boolean zIsEmpty = c21954OooOO0o.f65331OooO0O0.isEmpty();
            androidx.ink.authoring.internal.OooOOO0 oooOOO0 = this.f65273OooOO0O;
            if (zIsEmpty) {
                C24442Oooo00o.OooO00o();
                boolean z = false;
                for (OooOo0 oooOo0 : oooOOO0.f65340OooO00o.values()) {
                    if ((oooOo0 instanceof OooOo0.C21953OooO0Oo) || (oooOo0 instanceof OooOo0.OooO0OO)) {
                        return C21952OooOOoo.f65311OooO00o;
                    }
                    if (!(oooOo0 instanceof OooOo0.OooO00o)) {
                        if (!(oooOo0 instanceof OooOo0.OooO0O0)) {
                            throw new C32442OooOO0o();
                        }
                        z = true;
                    }
                }
                if (!z) {
                    return OooOOOO.f65296OooO00o;
                }
                if (c21954OooOO0o.f65337OooO0oo.f65292OooO00o.get() != null) {
                    return OooOOO.f65294OooO00o;
                }
                if (this.f65264OooO00o.OooO0oo()) {
                    C24442Oooo00o.OooO00o();
                    if (!oooOOO0.f65342OooO0OO) {
                        long jLongValue = this.f65268OooO0o.invoke().longValue() / ((long) 1000000);
                        C24442Oooo00o.OooO00o();
                        long j = oooOOO0.f65343OooO0Oo;
                        C24442Oooo00o.OooO00o();
                        if (jLongValue < j + oooOOO0.f65341OooO0O0) {
                            return OooOOO0.f65295OooO00o;
                        }
                    }
                }
                C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
                C24442Oooo00o.OooO00o();
                LinkedHashMap linkedHashMap = oooOOO0.f65340OooO00o;
                for (OooOo0 oooOo02 : linkedHashMap.values()) {
                    if (oooOo02 instanceof OooOo0.OooO0O0) {
                        c32465OooO0O0OooO0Oo.add(((OooOo0.OooO0O0) oooOo02).f65313OooO00o);
                    }
                }
                C21946OooO0oo c21946OooO0oo = new C21946OooO0oo(OooOo.OooO0O0(c32465OooO0O0OooO0Oo));
                C24442Oooo00o.OooO00o();
                linkedHashMap.clear();
                return c21946OooO0oo;
            }
            C24431OooOo0<Object> c24431OooOo0Poll = c21954OooOO0o.f65331OooO0O0.poll();
            if (c24431OooOo0Poll == null) {
                throw new IllegalStateException("finishedStrokes should only be polled on the UI thread, so it should not be empty here.");
            }
            C24431OooOo0<Object> c24431OooOo0 = c24431OooOo0Poll;
            C24442Oooo00o.OooO00o();
            LinkedHashMap linkedHashMap2 = oooOOO0.f65340OooO00o;
            C24410OooO0Oo c24410OooO0Oo = c24431OooOo0.f82452OooO00o;
            if (linkedHashMap2.get(c24410OooO0Oo) instanceof OooOo0.OooO0OO) {
                C24442Oooo00o.OooO00o();
                oooOOO0.f65340OooO00o.put(c24410OooO0Oo, new OooOo0.OooO0O0(c24431OooOo0));
            }
        }
    }

    public final void OooO0o(C21948OooOOOo<ShapeSpecT, InProgressShapeT, CompletedShapeT> c21948OooOOOo) {
        OooO00o();
        androidx.ink.authoring.internal.OooOO0O oooOO0O = this.f65276OooOOO0;
        oooOO0O.f65326OooO0oO.set(c21948OooOOOo.f65298OooO0O0);
        OooO00o();
        Matrix matrix = oooOO0O.f65326OooO0oO;
        OooO00o();
        matrix.postConcat(oooOO0O.f65324OooO0o);
    }

    public final void OooO0o0(MutableBox mutableBox) {
        androidx.ink.authoring.internal.OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooOOO = this.f65264OooO00o;
        oooOOO.OooO(mutableBox);
        OooO00o();
        androidx.ink.authoring.internal.OooOO0O oooOO0O = this.f65276OooOOO0;
        for (C21948OooOOOo<ShapeSpecT, InProgressShapeT, CompletedShapeT> c21948OooOOOo : oooOO0O.f65321OooO0O0.values()) {
            if (!c21948OooOOOo.f65297OooO00o.isCanceled()) {
                OooO0o(c21948OooOOOo);
                OooO00o();
                oooOOO.OooO0OO(c21948OooOOOo.f65297OooO00o, oooOO0O.f65326OooO0oO);
            }
        }
        oooOOO.OooO00o();
    }

    public final void OooO0oo() {
        ConcurrentLinkedQueue<o000O.OooO00o> concurrentLinkedQueue = this.f65275OooOOO.f65334OooO0o;
        OooO00o();
        androidx.ink.authoring.internal.OooOO0O oooOO0O = this.f65276OooOOO0;
        concurrentLinkedQueue.addAll(oooOO0O.f65325OooO0o0);
        OooO00o();
        oooOO0O.f65325OooO0o0.clear();
        this.f65267OooO0Oo.invoke(this.f65274OooOO0o);
    }

    public final void OooOO0(C24410OooO0Oo c24410OooO0Oo, C21948OooOOOo<ShapeSpecT, InProgressShapeT, CompletedShapeT> c21948OooOOOo) {
        androidx.ink.strokes.OooOOO0 oooOOO0OooOO0 = c21948OooOOOo.f65297OooO00o.OooOO0();
        if (oooOOO0OooOO0 == null) {
            c21948OooOOOo.f65300OooO0Oo = C21948OooOOOo.OooO0O0.f65302OooO00o;
            return;
        }
        c21948OooOOOo.f65300OooO0Oo = C21948OooOOOo.OooO00o.f65301OooO00o;
        ConcurrentLinkedQueue<C24431OooOo0<Object>> concurrentLinkedQueue = this.f65275OooOOO.f65331OooO0O0;
        OooO00o();
        androidx.ink.authoring.internal.OooOO0O oooOO0O = this.f65276OooOOO0;
        concurrentLinkedQueue.add(new C24431OooOo0<>(c24410OooO0Oo, oooOOO0OooOO0, new Matrix(oooOO0O.f65326OooO0oO)));
        OooO00o();
        oooOO0O.f65322OooO0OO = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02fd, code lost:
    
        OooO00o();
        r0 = r10.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x030c, code lost:
    
        if (r0.hasNext() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x030e, code lost:
    
        OooOOoo((androidx.ink.authoring.internal.OooOO0.C21948OooOOOo) r0.next(), r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0319, code lost:
    
        r0 = r11.OooO0oO();
        r2 = r3.f65328OooOO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x031f, code lost:
    
        if (r0 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0321, code lost:
    
        OooO00o();
        r0 = r10.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0330, code lost:
    
        if (r0.hasNext() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0332, code lost:
    
        r4 = (androidx.ink.authoring.internal.OooOO0.C21948OooOOOo) r0.next();
        OooO00o();
        r5 = r4.f65297OooO00o.OooO0O0();
        r6 = r3.f65319OooO;
        r6.reset();
        r6.OooO00o(r5);
        r4.f65297OooO00o.OooO00o();
        OooO00o();
        r5 = r6.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0355, code lost:
    
        if (r5 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0357, code lost:
    
        OooO00o();
        r2.getClass();
        r2.f65389OooO00o = r5.f65389OooO00o;
        r2.f65390OooO0O0 = r5.f65390OooO0O0;
        r2.f65391OooO0OO = r5.f65391OooO0OO;
        r2.f65392OooO0Oo = r5.f65392OooO0Oo;
        OooO0o(r4);
        OooO00o();
        OooO00o();
        r4 = r3.f65326OooO0oO;
        r5 = o000O0oo.C24440OooOooo.f82470OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(r2, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(r4, "transform");
        o000O0oo.C24440OooOooo.OooO00o()[0] = r2.f65389OooO00o;
        o000O0oo.C24440OooOooo.OooO00o()[r16 ? 1 : 0] = r2.f65390OooO0O0;
        o000O0oo.C24440OooOooo.OooO00o()[r17] = r2.f65389OooO00o;
        r7 = 3;
        o000O0oo.C24440OooOooo.OooO00o()[3] = r2.f65392OooO0Oo;
        o000O0oo.C24440OooOooo.OooO00o()[4] = r2.f65391OooO0OO;
        o000O0oo.C24440OooOooo.OooO00o()[5] = r2.f65390OooO0O0;
        o000O0oo.C24440OooOooo.OooO00o()[6] = r2.f65391OooO0OO;
        o000O0oo.C24440OooOooo.OooO00o()[7] = r2.f65392OooO0Oo;
        r4.mapPoints(o000O0oo.C24440OooOooo.OooO00o());
        r4 = o000O0oo.C24440OooOooo.OooO00o()[0];
        r5 = o000O0oo.C24440OooOooo.OooO00o()[r16 ? 1 : 0];
        r6 = o000O0oo.C24440OooOooo.OooO00o()[0];
        r10 = o000O0oo.C24440OooOooo.OooO00o()[r16 ? 1 : 0];
        r11 = r17;
        r8 = o0000OOo.C24217OooO0O0.OooO0oo(r11, 6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03f2, code lost:
    
        if (r11 > r8) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03f4, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03f5, code lost:
    
        r12 = o000O0oo.C24440OooOooo.OooO00o()[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03fd, code lost:
    
        if (r12 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03ff, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0403, code lost:
    
        if (r12 <= r6) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0405, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0406, code lost:
    
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0407, code lost:
    
        if (r11 == r8) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0409, code lost:
    
        r11 = r11 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x040b, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x040c, code lost:
    
        r8 = o0000OOo.C24217OooO0O0.OooO0oo(3, 7, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0410, code lost:
    
        if (3 > r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0412, code lost:
    
        r9 = o000O0oo.C24440OooOooo.OooO00o()[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x041a, code lost:
    
        if (r9 >= r5) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x041c, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0420, code lost:
    
        if (r9 <= r10) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0422, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0423, code lost:
    
        if (r7 == r8) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0425, code lost:
    
        r7 = r7 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x042a, code lost:
    
        r17 = 2;
        r7 = new androidx.ink.geometry.ImmutableVec(r4, r5);
        r4 = new androidx.ink.geometry.ImmutableVec(r6, r10);
        r2.setXBounds(r7.f65384OooO0O0, r4.f65384OooO0O0);
        r2.setYBounds(r7.f65385OooO0OO, r4.f65385OooO0OO);
        OooO00o();
        OooO0o0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0450, code lost:
    
        OooO00o();
        r2.setXBounds(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
        OooO00o();
        r2.setYBounds(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
        OooO00o();
        OooO0o0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0466, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r16 = r5;
        r17 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0O() {
        boolean z;
        C21954OooOO0o c21954OooOO0o;
        OooO00o();
        OooO00o();
        androidx.ink.authoring.internal.OooOO0O oooOO0O = this.f65276OooOOO0;
        if (!oooOO0O.f65327OooO0oo.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        C21954OooOO0o c21954OooOO0o2 = this.f65275OooOOO;
        if (c21954OooOO0o2.f65336OooO0oO.get()) {
            return;
        }
        boolean z2 = true;
        c21954OooOO0o2.f65329OooO.set(true);
        long jLongValue = this.f65268OooO0o.invoke().longValue();
        while (true) {
            ConcurrentLinkedQueue<OooO00o> concurrentLinkedQueue = c21954OooOO0o2.f65332OooO0OO;
            boolean zIsEmpty = concurrentLinkedQueue.isEmpty();
            LinkedHashMap linkedHashMap = oooOO0O.f65321OooO0O0;
            androidx.ink.authoring.internal.OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooOOO = this.f65264OooO00o;
            if (zIsEmpty || ((concurrentLinkedQueue.peek() instanceof C21950OooOOo) && c21954OooOO0o2.f65336OooO0oO.get())) {
                break;
            }
            OooO00o oooO00oPoll = concurrentLinkedQueue.poll();
            if (oooO00oPoll == null) {
                throw new IllegalStateException("Actions should only be removed by onDraw.");
            }
            OooO00o();
            boolean z3 = oooO00oPoll instanceof C21951OooOOo0;
            InterfaceC24435OooOoO0<Object, o000O0oO.OooO0O0<Object, Object>> interfaceC24435OooOoO0 = oooOO0O.f65323OooO0Oo;
            C34426OooOO0o<o000O.OooO00o> c34426OooOO0o = oooOO0O.f65325OooO0o0;
            Oooo000 oooo000 = c21954OooOO0o2.f65335OooO0o0;
            if (z3) {
                C21951OooOOo0 c21951OooOOo0 = (C21951OooOOo0) oooO00oPoll;
                OooO00o();
                Matrix matrix = new Matrix();
                StrokeInput strokeInput = c21951OooOOo0.f65305OooO00o;
                z = z2;
                c21951OooOOo0.f65307OooO0OO.invert(matrix);
                OooO00o();
                o000OO00.OooO0O0 oooO0O0 = c21951OooOOo0.f65308OooO0Oo;
                o000O0oO.OooO0O0 OooO0O02 = interfaceC24435OooOoO0.OooO0O0(oooO0O0);
                C21948OooOOOo c21948OooOOOo = new C21948OooOOOo(OooO0O02, matrix, c21951OooOOo0.f65309OooO0o);
                OooO0O02.OooO0o(oooO0O0);
                C21970OooO0oo c21970OooO0oo = new C21970OooO0oo();
                try {
                    c21970OooO0oo.OooO0oo(strokeInput);
                } catch (Throwable th) {
                    C32446OooOOOo.OooO00o(th);
                }
                OooO0O02.OooO0oo(c21970OooO0oo, androidx.ink.strokes.OooO00o.f65463OooO0Oo);
                OooOOoo(c21948OooOOOo, jLongValue, false);
                oooo000.getClass();
                oooo000.f82471OooO00o.offer(strokeInput);
                OooO00o();
                linkedHashMap.put(c21951OooOOo0.f65306OooO0O0, c21948OooOOOo);
                o000O.OooO00o oooO00o = c21951OooOOo0.f65310OooO0o0;
                OooO00o();
                c34426OooOO0o.addLast(oooO00o);
            } else {
                z = z2;
                if (oooO00oPoll instanceof OooO0O0) {
                    OooO0O0 oooO0O02 = (OooO0O0) oooO00oPoll;
                    OooO00o();
                    OooO00o();
                    C21948OooOOOo c21948OooOOOo2 = (C21948OooOOOo) linkedHashMap.get(oooO0O02.f65280OooO0OO);
                    if (c21948OooOOOo2 == null) {
                        throw new IllegalStateException(("Stroke state with ID " + oooO0O02.f65280OooO0OO + " was not found.").toString());
                    }
                    if (!(c21948OooOOOo2.f65300OooO0Oo instanceof C21948OooOOOo.OooO0OO)) {
                        throw new IllegalStateException(("Stroke with ID " + oooO0O02.f65280OooO0OO + " was already finished.").toString());
                    }
                    InProgressShapeT inprogressshapet = c21948OooOOOo2.f65297OooO00o;
                    if (inprogressshapet.isCanceled()) {
                        throw new IllegalStateException(("Stroke with ID " + oooO0O02.f65280OooO0OO + " was canceled.").toString());
                    }
                    inprogressshapet.OooO0oo(oooO0O02.f65278OooO00o, oooO0O02.f65279OooO0O0);
                    OooO00o();
                    c34426OooOO0o.addAll(oooO0O02.f65281OooO0Oo);
                    OooO00o();
                    c34426OooOO0o.addAll(oooO0O02.f65282OooO0o0);
                    c21954OooOO0o2.f65333OooO0Oo.OooO00o(oooO0O02);
                } else {
                    c21954OooOO0o = c21954OooOO0o2;
                    if (oooO00oPoll instanceof C21945OooO0oO) {
                        C21945OooO0oO c21945OooO0oO = (C21945OooO0oO) oooO00oPoll;
                        OooO00o();
                        OooO00o();
                        C24410OooO0Oo c24410OooO0Oo = c21945OooO0oO.f65288OooO0O0;
                        C21948OooOOOo<ShapeSpecT, InProgressShapeT, CompletedShapeT> c21948OooOOOo3 = (C21948OooOOOo) linkedHashMap.get(c24410OooO0Oo);
                        if (c21948OooOOOo3 == null) {
                            throw new IllegalStateException(("Stroke state with ID " + c24410OooO0Oo + " was not found.").toString());
                        }
                        if (!(c21948OooOOOo3.f65300OooO0Oo instanceof C21948OooOOOo.OooO0OO)) {
                            throw new IllegalStateException(("Stroke with ID " + c24410OooO0Oo + " was already finished.").toString());
                        }
                        InProgressShapeT inprogressshapet2 = c21948OooOOOo3.f65297OooO00o;
                        if (inprogressshapet2.isCanceled()) {
                            throw new IllegalStateException(("Stroke with ID " + c24410OooO0Oo + " was canceled.").toString());
                        }
                        if (inprogressshapet2.isCanceled()) {
                            throw new IllegalStateException(("Stroke with ID " + c24410OooO0Oo + " was canceled.").toString());
                        }
                        OooO0o(c21948OooOOOo3);
                        StrokeInput strokeInput2 = c21945OooO0oO.f65287OooO00o;
                        if (strokeInput2 != null) {
                            C21970OooO0oo c21970OooO0oo2 = new C21970OooO0oo();
                            try {
                                c21970OooO0oo2.OooO0oo(strokeInput2);
                            } catch (Throwable th2) {
                                C32446OooOOOo.OooO00o(th2);
                            }
                            inprogressshapet2.OooO0oo(c21970OooO0oo2, androidx.ink.strokes.OooO00o.f65463OooO0Oo);
                        }
                        inprogressshapet2.OooO();
                        OooOOoo(c21948OooOOOo3, jLongValue, c21945OooO0oO.f65289OooO0OO);
                        OooOO0(c24410OooO0Oo, c21948OooOOOo3);
                        if (strokeInput2 != null) {
                            oooo000.getClass();
                            oooo000.f82471OooO00o.offer(strokeInput2);
                        }
                        o000O.OooO00o oooO00o2 = c21945OooO0oO.f65290OooO0Oo;
                        if (oooO00o2 != null) {
                            OooO00o();
                            c34426OooOO0o.addLast(oooO00o2);
                        }
                    } else if (oooO00oPoll instanceof C21944OooO0o0) {
                        C21944OooO0o0 c21944OooO0o0 = (C21944OooO0o0) oooO00oPoll;
                        OooO00o();
                        OooO00o();
                        Object obj = c21944OooO0o0.f65285OooO00o;
                        Object obj2 = linkedHashMap.get(obj);
                        if (obj2 == null) {
                            throw new IllegalStateException(("Stroke state with ID " + obj + " was not found.").toString());
                        }
                        C21948OooOOOo c21948OooOOOo4 = (C21948OooOOOo) obj2;
                        if (!(c21948OooOOOo4.f65300OooO0Oo instanceof C21948OooOOOo.OooO0OO)) {
                            throw new IllegalStateException(("Stroke with ID " + obj + " was already finished.").toString());
                        }
                        c21948OooOOOo4.f65297OooO00o.cancel();
                        OooO00o();
                        c34426OooOO0o.addLast(c21944OooO0o0.f65286OooO0O0);
                    } else if (oooO00oPoll instanceof C21947OooOO0o) {
                        OooO00o();
                        OooO00o();
                        oooOO0O.f65324OooO0o.set(((C21947OooOO0o) oooO00oPoll).f65293OooO00o);
                    } else if (oooO00oPoll instanceof C21950OooOOo) {
                        OooO00o();
                        OooO00o();
                        for (C21948OooOOOo c21948OooOOOo5 : linkedHashMap.values()) {
                            OooO00o();
                            interfaceC24435OooOoO0.OooO00o(c21948OooOOOo5.f65297OooO00o);
                        }
                        OooO00o();
                        linkedHashMap.clear();
                        oooOOO.OooOO0o();
                    } else if (oooO00oPoll instanceof OooO) {
                        ((OooO) oooO00oPoll).f65277OooO00o.countDown();
                    }
                    OooO00o();
                    oooOO0O.f65327OooO0oo.add(oooO00oPoll);
                    z2 = z;
                    c21954OooOO0o2 = c21954OooOO0o;
                }
            }
            c21954OooOO0o = c21954OooOO0o2;
            OooO00o();
            oooOO0O.f65327OooO0oo.add(oooO00oPoll);
            z2 = z;
            c21954OooOO0o2 = c21954OooOO0o;
        }
    }

    public final void OooOO0o() {
        LinkedHashMap linkedHashMap;
        OooO00o();
        androidx.ink.authoring.internal.OooOO0O oooOO0O = this.f65276OooOOO0;
        Iterator<OooO00o> it = oooOO0O.f65327OooO0oo.iterator();
        kotlin.jvm.internal.OooOOO0.OooO0o(it, "iterator(...)");
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = oooOO0O.f65321OooO0O0;
            if (!zHasNext) {
                break;
            }
            OooO00o next = it.next();
            kotlin.jvm.internal.OooOOO0.OooO0o(next, "next(...)");
            OooO00o oooO00o = next;
            OooO00o();
            if (oooO00o instanceof C21943OooO0Oo) {
                OooO00o();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    C24410OooO0Oo c24410OooO0Oo = (C24410OooO0Oo) entry.getKey();
                    C21948OooOOOo<ShapeSpecT, InProgressShapeT, CompletedShapeT> c21948OooOOOo = (C21948OooOOOo) entry.getValue();
                    if (c21948OooOOOo.f65300OooO0Oo instanceof C21948OooOOOo.OooO0O0) {
                        OooOO0(c24410OooO0Oo, c21948OooOOOo);
                    }
                }
            } else if (oooO00o instanceof C21944OooO0o0) {
                OooO00o();
                C21948OooOOOo c21948OooOOOo2 = (C21948OooOOOo) linkedHashMap.remove(((C21944OooO0o0) oooO00o).f65285OooO00o);
                if (c21948OooOOOo2 != null) {
                    OooO00o();
                    oooOO0O.f65323OooO0Oo.OooO00o(c21948OooOOOo2.f65297OooO00o);
                }
                OooO00o();
                oooOO0O.f65322OooO0OO = true;
            } else if (oooO00o instanceof OooOo00) {
                ((OooOo00) oooO00o).f65318OooO00o.countDown();
            }
        }
        OooO00o();
        oooOO0O.f65327OooO0oo.clear();
        this.f65275OooOOO.f65329OooO.set(false);
        OooO00o();
        if (oooOO0O.f65322OooO0OO) {
            OooO00o();
            Collection collectionValues = linkedHashMap.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                OooOOOo();
                OooO00o();
                oooOO0O.f65322OooO0OO = false;
            } else {
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (!(((C21948OooOOOo) it2.next()).f65300OooO0Oo instanceof C21948OooOOOo.OooO00o)) {
                        break;
                    }
                }
                OooOOOo();
                OooO00o();
                oooOO0O.f65322OooO0OO = false;
            }
        }
        OooO00o();
        Collection<C21948OooOOOo> collectionValues2 = linkedHashMap.values();
        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
            return;
        }
        for (C21948OooOOOo c21948OooOOOo3 : collectionValues2) {
            if ((c21948OooOOOo3.f65300OooO0Oo instanceof C21948OooOOOo.OooO0O0) || c21948OooOOOo3.f65297OooO00o.OooO0OO()) {
                OooO00o();
                C24417OooO0O0 c24417OooO0O0 = oooOO0O.f65320OooO00o;
                c24417OooO0O0.f82431OooO0O0.set(true);
                this.f65266OooO0OO.invoke(c24417OooO0O0.f82432OooO0OO);
                return;
            }
        }
    }

    public final void OooOOO() {
        this.f65275OooOOO.f65336OooO0oO.set(false);
        this.f65264OooO00o.OooOO0();
    }

    public final void OooOOO0(List<C24431OooOo0<CompletedShapeT>> cohort) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cohort, "cohort");
        C24442Oooo00o.OooO00o();
        Iterator it = this.f65273OooOO0O.f65344OooO0o0.iterator();
        while (it.hasNext()) {
            ((OooOO0O) it.next()).OooO00o(cohort);
        }
    }

    public final void OooOOOO() {
        C24442Oooo00o.OooO00o();
        C19025OooOO0 c19025OooOO0 = this.f65275OooOOO.f65337OooO0oo;
        c19025OooOO0.getClass();
        C24442Oooo00o.OooO00o();
        AtomicReference<CountDownLatch> atomicReference = c19025OooOO0.f65292OooO00o;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        while (!atomicReference.compareAndSet(null, countDownLatch) && atomicReference.get() == null) {
        }
    }

    public final void OooOOOo() {
        C24417OooO0O0 c24417OooO0O0 = this.f65275OooOOO.f65330OooO00o;
        c24417OooO0O0.f82431OooO0O0.set(true);
        this.f65266OooO0OO.invoke(c24417OooO0O0.f82432OooO0OO);
    }

    public final void OooOOo(InterfaceC32508OooOOOo<? super o000O.OooO00o, ? super Long, C32460OooOooO> setter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(setter, "setter");
        long jLongValue = this.f65268OooO0o.invoke().longValue();
        OooO00o();
        Iterator<o000O.OooO00o> it = this.f65276OooOOO0.f65325OooO0o0.iterator();
        while (it.hasNext()) {
            setter.invoke(it.next(), Long.valueOf(jLongValue));
        }
    }

    public final void OooOOo0(OooO00o oooO00o) {
        C21954OooOO0o c21954OooOO0o = this.f65275OooOOO;
        c21954OooOO0o.f65332OooO0OO.offer(oooO00o);
        if (c21954OooOO0o.f65336OooO0oO.get()) {
            return;
        }
        this.f65264OooO00o.OooOO0();
    }
}
