package androidx.ink.strokes;

import OooO0Oo.C20398OooO0O0;
import Oooo0.C20855OooooOO;
import Oooo0.C20856OooooOo;
import androidx.ink.geometry.BoxAccumulator;
import androidx.ink.geometry.MutableVec;
import androidx.ink.geometry.OooOOO;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: androidx.ink.strokes.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21967OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f65468OooO0Oo = {new C24028OooOoO0(C21967OooO0Oo.class, "nativePointer", "getNativePointer$ink_strokes()J", 0)};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f65469OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000OO00.OooO0O0 f65470OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f65471OooO0OO;

    /* JADX INFO: renamed from: androidx.ink.strokes.OooO0Oo$OooO00o */
    public static final /* synthetic */ class OooO00o extends C24019OooOO0o implements oO0O000o.OooO00o<Long> {
        @Override // oO0O000o.OooO00o
        public final Long invoke() {
            return Long.valueOf(((InProgressStrokeNative) this.receiver).create());
        }
    }

    public C21967OooO0Oo() {
        InProgressStrokeNative inProgressStrokeNative = InProgressStrokeNative.f65457OooO00o;
        this.f65469OooO00o = new o000OOoO.OooO0O0(new OooO00o(0, inProgressStrokeNative, InProgressStrokeNative.class, "create", "create()J", 0), new C21968OooO0o0(1, inProgressStrokeNative, InProgressStrokeNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0, 0));
    }

    public final void OooO(int i, BoxAccumulator outMeshBounds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outMeshBounds, "outMeshBounds");
        if (i < 0 || i >= OooO0O0()) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, OooO0O0(), "coatIndex=", " must be between 0 and brushCoatCount=").toString());
        }
        InProgressStrokeNative.f65457OooO00o.fillMeshBounds(OooO0o0(), i, outMeshBounds);
    }

    public final void OooO00o(C21970OooO0oo realInputs, OooOOO predictedInputs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(realInputs, "realInputs");
        kotlin.jvm.internal.OooOOO0.OooO0oO(predictedInputs, "predictedInputs");
        if (!InProgressStrokeNative.f65457OooO00o.enqueueInputs(OooO0o0(), realInputs.OooO0O0(), predictedInputs.OooO0O0())) {
            throw new IllegalStateException("Should have thrown an exception if enqueueInputs failed.");
        }
        this.f65471OooO0OO++;
    }

    public final int OooO0O0() {
        int brushCoatCount = InProgressStrokeNative.f65457OooO00o.getBrushCoatCount(OooO0o0());
        if (brushCoatCount >= 0) {
            return brushCoatCount;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final androidx.ink.geometry.OooOOO OooO0OO(final int i) {
        if (i < 0 || i >= OooO0O0()) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Cannot get mesh format at coatIndex ", i, " out of range [0, ", ").", OooO0O0()).toString());
        }
        OooOOO.OooO00o oooO00o = androidx.ink.geometry.OooOOO.f65418OooO0O0;
        oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o() { // from class: androidx.ink.strokes.OooO0OO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return Long.valueOf(InProgressStrokeNative.f65457OooO00o.newCopyOfMeshFormat(this.f65467OooOo0o.OooO0o0(), i));
            }
        };
        oooO00o.getClass();
        return new androidx.ink.geometry.OooOOO(oooO00o2);
    }

    public final int OooO0Oo(int i) {
        if (i < 0 || i >= OooO0O0()) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, OooO0O0(), "coatIndex=", " must be between 0 and brushCoatCount=").toString());
        }
        return InProgressStrokeNative.f65457OooO00o.getMeshPartitionCount(OooO0o0(), i);
    }

    public final int OooO0o(int i) {
        if (i < 0 || i >= OooO0O0()) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, OooO0O0(), "coatIndex=", " must be between 0 and brushCoatCount=").toString());
        }
        int outlineCount = InProgressStrokeNative.f65457OooO00o.getOutlineCount(OooO0o0(), i);
        if (outlineCount >= 0) {
            return outlineCount;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final long OooO0o0() {
        return this.f65469OooO00o.OooO00o(this, f65468OooO0Oo[0]);
    }

    public final int OooO0oO(int i, int i2) {
        if (i2 < 0 || i2 >= OooO0o(i)) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, OooO0o(i), "outlineIndex=", " must be between 0 and outlineCount=").toString());
        }
        int outlineVertexCount = InProgressStrokeNative.f65457OooO00o.getOutlineVertexCount(OooO0o0(), i, i2);
        if (outlineVertexCount >= 0) {
            return outlineVertexCount;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void OooO0oo(int i, StrokeInput out) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(out, "out");
        InProgressStrokeNative inProgressStrokeNative = InProgressStrokeNative.f65457OooO00o;
        int inputCount = inProgressStrokeNative.getInputCount(OooO0o0());
        if (i >= inputCount || i < 0) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("index (", i, ") must be in [0, inputCount=", ")", inputCount).toString());
        }
        inProgressStrokeNative.getAndOverwriteInput(OooO0o0(), out, i);
    }

    public final void OooOO0(int i, int i2, int i3, MutableVec outPosition) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outPosition, "outPosition");
        int iOooO0oO = OooO0oO(i, i2);
        if (i3 >= 0 && i3 < iOooO0oO) {
            InProgressStrokeNative.f65457OooO00o.fillOutlinePosition(OooO0o0(), i, i2, i3, outPosition);
        } else {
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("outlineVertexIndex=", i3, " must be between 0 and outlineVertexCount(", ")=", i3);
            sbOooO0O0.append(iOooO0oO);
            throw new IllegalArgumentException(sbOooO0O0.toString().toString());
        }
    }
}
