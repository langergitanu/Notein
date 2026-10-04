package o000Oo0O;

import OooOo.C20481OooOOoo;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import androidx.ink.geometry.BoxAccumulator;
import androidx.ink.geometry.C21956OooO0o0;
import androidx.ink.geometry.MutableBox;
import androidx.ink.geometry.MutableVec;
import androidx.ink.strokes.C21967OooO0Oo;
import androidx.ink.strokes.InProgressStrokeNative;
import androidx.ink.strokes.StrokeInput;
import java.util.Set;
import java.util.WeakHashMap;
import o000OO00.OooOo;
import o000OO00.Oooo0;
import o000OO00.o000oOoO;

/* JADX INFO: renamed from: o000Oo0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24526OooOOo implements InterfaceC24528OooOOoo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Set<Oooo0> f82959OooO = oOo000Oo.OooOOO.OoooOo0(new Oooo0[]{Oooo0.f82760OooO0Oo, Oooo0.f82761OooO0o});

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakHashMap<androidx.ink.geometry.OooOo00, C20481OooOOoo<OooO0O0>> f82960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final WeakHashMap<C21967OooO0Oo, C20481OooOOoo<OooO00o>> f82961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24515OooO00o f82962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MutableVec f82963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final StrokeInput f82964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Matrix f82965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final StrokeInput f82966OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final BoxAccumulator f82967OooO0oo;

    /* JADX INFO: renamed from: o000Oo0O.OooOOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f82968OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Matrix f82969OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Path f82970OooO0OO;

        public OooO00o(long j, Matrix strokeToScreenTransform, Path path) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToScreenTransform, "strokeToScreenTransform");
            this.f82968OooO00o = j;
            this.f82969OooO0O0 = strokeToScreenTransform;
            this.f82970OooO0OO = path;
        }
    }

    /* JADX INFO: renamed from: o000Oo0O.OooOOo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f82971OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Path f82972OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f82973OooO0OO;

        public OooO0O0(long j, Matrix matrix, Path path) {
            this.f82971OooO00o = matrix;
            this.f82972OooO0O0 = path;
            this.f82973OooO0OO = j;
        }
    }

    public C24526OooOOo(o000oOoO textureStore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textureStore, "textureStore");
        this.f82960OooO00o = new WeakHashMap<>();
        this.f82961OooO0O0 = new WeakHashMap<>();
        this.f82962OooO0OO = new C24515OooO00o(textureStore, 1, true);
        this.f82963OooO0Oo = new MutableVec();
        this.f82965OooO0o0 = new Matrix();
        this.f82964OooO0o = new StrokeInput();
        this.f82966OooO0oO = new StrokeInput();
        this.f82967OooO0oo = new BoxAccumulator();
    }

    public static boolean OooO0o0(int i, int i2, androidx.ink.geometry.OooO0o oooO0o, OooOo oooOo) {
        if (!(i2 == 0 || oooO0o == null)) {
            if (i != 0) {
                if (f82959OooO.contains(oooOo.f82690OooO0Oo)) {
                    int iOooO0O0 = OooOo00.OooO0O0(oooOo);
                    OooOo.AbstractC24463OooO0Oo.OooO0OO oooO0OO = OooOo.AbstractC24463OooO0Oo.f82701OooO0OO;
                    if (iOooO0O0 != 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // o000Oo0O.InterfaceC24528OooOOoo
    public final boolean OooO00o(Canvas canvas, C21967OooO0Oo inProgressStroke, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressStroke, "inProgressStroke");
        int iOooO0o = inProgressStroke.OooO0o(i);
        int inputCount = InProgressStrokeNative.f65457OooO00o.getInputCount(inProgressStroke.OooO0o0());
        BoxAccumulator boxAccumulator = this.f82967OooO0oo;
        inProgressStroke.OooO(i, boxAccumulator);
        MutableBox mutableBoxOooO0OO = boxAccumulator.OooO0OO();
        o000OO00.OooO0O0 oooO0O0 = inProgressStroke.f65470OooO0O0;
        if (oooO0O0 != null) {
            return OooO0o0(iOooO0o, inputCount, mutableBoxOooO0OO, OooOo00.OooO00o(oooO0O0, i, i2));
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    @Override // o000Oo0O.InterfaceC24528OooOOoo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(Canvas canvas, C21967OooO0Oo inProgressStroke, int i, int i2, Matrix strokeToScreenTransform, float f) {
        Path path;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressStroke, "inProgressStroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToScreenTransform, "strokeToScreenTransform");
        int inputCount = InProgressStrokeNative.f65457OooO00o.getInputCount(inProgressStroke.OooO0o0());
        BoxAccumulator boxAccumulator = this.f82967OooO0oo;
        inProgressStroke.OooO(i, boxAccumulator);
        MutableBox mutableBoxOooO0OO = boxAccumulator.OooO0OO();
        if (inputCount == 0 || mutableBoxOooO0OO == null) {
            return;
        }
        o000OO00.OooO0O0 oooO0O0 = inProgressStroke.f65470OooO0O0;
        if (oooO0O0 == null) {
            throw new IllegalStateException("Attempting to draw an InProgressStroke that has not been started.");
        }
        int i3 = 0;
        inProgressStroke.OooO0oo(0, this.f82964OooO0o);
        int i4 = 1;
        inProgressStroke.OooO0oo(inputCount - 1, this.f82966OooO0oO);
        WeakHashMap<C21967OooO0Oo, C20481OooOOoo<OooO00o>> weakHashMap = this.f82961OooO0O0;
        C20481OooOOoo<OooO00o> c20481OooOOoo = weakHashMap.get(inProgressStroke);
        if (c20481OooOOoo == null) {
            c20481OooOOoo = new C20481OooOOoo<>((Object) null);
            weakHashMap.put(inProgressStroke, c20481OooOOoo);
        }
        OooO00o oooO00oOooO0O0 = c20481OooOOoo.OooO0O0(i);
        if (oooO00oOooO0O0 != null) {
            if (oooO00oOooO0O0.f82968OooO00o != inProgressStroke.f65471OooO0OO || (Build.VERSION.SDK_INT < 28 && !kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00oOooO0O0.f82969OooO0O0, strokeToScreenTransform))) {
                Path path2 = new Path();
                path2.rewind();
                int iOooO0o = inProgressStroke.OooO0o(i);
                int i5 = 0;
                while (i5 < iOooO0o) {
                    int iOooO0oO = inProgressStroke.OooO0oO(i, i5);
                    if (iOooO0oO != 0) {
                        MutableVec mutableVec = this.f82963OooO0Oo;
                        inProgressStroke.OooOO0(i, i5, i3, mutableVec);
                        path2.moveTo(mutableVec.x, mutableVec.y);
                        for (int i6 = i4; i6 < iOooO0oO; i6++) {
                            inProgressStroke.OooOO0(i, i5, i6, mutableVec);
                            path2.lineTo(mutableVec.x, mutableVec.y);
                        }
                        path2.close();
                    }
                    i5++;
                    i3 = 0;
                    i4 = 1;
                }
                if (Build.VERSION.SDK_INT < 28) {
                    path2.transform(strokeToScreenTransform);
                }
                c20481OooOOoo.OooO0oO(i, new OooO00o(inProgressStroke.f65471OooO0OO, strokeToScreenTransform, path2));
                path = path2;
            } else {
                path = oooO00oOooO0O0.f82970OooO0OO;
            }
        }
        OooO0o(canvas, path, strokeToScreenTransform, OooOo00.OooO00o(oooO0O0, i, i2), oooO0O0.OooO0Oo(), oooO0O0.OooO0o(), this.f82964OooO0o, this.f82966OooO0oO);
    }

    @Override // o000Oo0O.InterfaceC24528OooOOoo
    public final boolean OooO0OO(Canvas canvas, androidx.ink.strokes.OooOOO0 stroke, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        androidx.ink.geometry.OooOo00 oooOo00 = stroke.f65489OooO0Oo;
        return OooO0o0(oooOo00.OooO0OO(i), stroke.f65488OooO0OO.OooO0OO(), oooOo00.OooO00o(), OooOo00.OooO00o(stroke.f65486OooO00o, i, i2));
    }

    @Override // o000Oo0O.InterfaceC24528OooOOoo
    public final void OooO0Oo(Canvas canvas, androidx.ink.strokes.OooOOO0 stroke, int i, int i2, Matrix strokeToScreenTransform, float f) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToScreenTransform, "strokeToScreenTransform");
        androidx.ink.strokes.OooO00o oooO00o = stroke.f65488OooO0OO;
        int iOooO0OO = oooO00o.OooO0OO();
        androidx.ink.geometry.OooOo00 oooOo00 = stroke.f65489OooO0Oo;
        androidx.ink.geometry.OooO0o oooO0oOooO00o = oooOo00.OooO00o();
        if (iOooO0OO == 0 || oooO0oOooO00o == null) {
            return;
        }
        oooO00o.OooO0o0(0, this.f82964OooO0o);
        oooO00o.OooO0o0(iOooO0OO - 1, this.f82966OooO0oO);
        WeakHashMap<androidx.ink.geometry.OooOo00, C20481OooOOoo<OooO0O0>> weakHashMap = this.f82960OooO00o;
        C20481OooOOoo<OooO0O0> c20481OooOOoo = weakHashMap.get(oooOo00);
        if (c20481OooOOoo == null) {
            c20481OooOOoo = new C20481OooOOoo<>((Object) null);
            weakHashMap.put(oooOo00, c20481OooOOoo);
        }
        OooO0O0 OooO0O02 = c20481OooOOoo.OooO0O0(i);
        if (OooO0O02 == null) {
            o000OOo0.OooO00o oooO00o2 = C21956OooO0o0.f65403OooO00o;
            Path path = new Path();
            C21956OooO0o0.OooO0O0(oooOo00, i, path);
            if (Build.VERSION.SDK_INT < 28) {
                path.transform(strokeToScreenTransform);
            }
            OooO0O0 oooO0O0 = new OooO0O0(oooOo00.OooO0O0(), new Matrix(strokeToScreenTransform), path);
            c20481OooOOoo.OooO0oO(i, oooO0O0);
            OooO0O02 = oooO0O0;
        } else {
            if (oooOo00.OooO0O0() != OooO0O02.f82973OooO0OO) {
                throw new IllegalStateException("Must update PartitionedMeshData using the same PartitionedMesh used to create it.");
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 28) {
                Matrix matrix = OooO0O02.f82971OooO00o;
                if (!strokeToScreenTransform.equals(matrix)) {
                    Path path2 = OooO0O02.f82972OooO0O0;
                    C21956OooO0o0.OooO0O0(oooOo00, i, path2);
                    if (i3 < 28) {
                        path2.transform(strokeToScreenTransform);
                    }
                    matrix.set(strokeToScreenTransform);
                }
            }
        }
        o000OO00.OooO0O0 oooO0O02 = stroke.f65486OooO00o;
        OooO0o(canvas, OooO0O02.f82972OooO0O0, strokeToScreenTransform, OooOo00.OooO00o(oooO0O02, i, i2), oooO0O02.OooO0Oo(), oooO0O02.OooO0o(), this.f82964OooO0o, this.f82966OooO0oO);
    }

    public final void OooO0o(Canvas canvas, Path path, Matrix matrix, OooOo oooOo, long j, float f, StrokeInput strokeInput, StrokeInput strokeInput2) {
        long jOooO00o = oooOo.OooO00o(j);
        if (Build.VERSION.SDK_INT >= 28) {
            Matrix matrix2 = C24515OooO00o.f82909OooO0o0;
            canvas.drawPath(path, this.f82962OooO0OO.OooO00o(oooOo, jOooO00o, f, strokeInput, strokeInput2, null));
            return;
        }
        Paint paintOooO00o = this.f82962OooO0OO.OooO00o(oooOo, jOooO00o, f, strokeInput, strokeInput2, matrix);
        Matrix matrix3 = this.f82965OooO0o0;
        matrix.invert(matrix3);
        int iSave = canvas.save();
        canvas.concat(matrix3);
        try {
            canvas.drawPath(path, paintOooO00o);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
