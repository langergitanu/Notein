package o000Oo0O;

import OooOo.C20484OooOo0o;
import OooOo.C20491OooOooo;
import Oooo0.C20856OooooOo;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.MeshSpecification;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import androidx.ink.brush.BrushPaintNative;
import androidx.ink.geometry.BoxAccumulator;
import androidx.ink.geometry.C21958OooO0oo;
import androidx.ink.geometry.MeshFormatNative;
import androidx.ink.geometry.MutableBox;
import androidx.ink.geometry.OooOOO0;
import androidx.ink.rendering.android.canvas.internal.CanvasMeshRendererNative;
import androidx.ink.strokes.C21967OooO0Oo;
import androidx.ink.strokes.InProgressStrokeNative;
import androidx.ink.strokes.StrokeInput;
import com.google.android.gms.measurement.internal.C22350OooO0Oo;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import o000OO00.OooOo;
import o000OO00.Oooo0;
import o000OO00.o000oOoO;
import o000OO0o.C24495OooO00o;
import o000OOO.C24498OooO0o0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;

/* JADX INFO: renamed from: o000Oo0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24522OooO0oo implements InterfaceC24528OooOOoo {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Set<Oooo0> f82923OooOOOO = oOo000Oo.OooOOO.OoooOo0(new Oooo0[]{Oooo0.f82760OooO0Oo, Oooo0.f82762OooO0o0});

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<C32443OooOOO<androidx.ink.geometry.OooOOO, OooO00o.C19622OooO00o>> f82924OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O000o.OooO00o<Long> f82925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24527OooOOo0 f82926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24515OooO00o f82927OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakHashMap<androidx.ink.geometry.OooOO0O, OooO0OO> f82928OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f82929OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C20484OooOo0o<Mesh> f82930OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final WeakHashMap<C21967OooO0Oo, List<OooO0O0>> f82931OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<C32443OooOOO<androidx.ink.geometry.OooOOO, OooO00o.C19622OooO00o>> f82932OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f82933OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float[] f82934OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float[] f82935OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final StrokeInput f82936OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final StrokeInput f82937OooOOO0;

    /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19622OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final MeshSpecification f82938OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final ArrayList f82939OooO0O0;

            public C19622OooO00o(MeshSpecification meshSpecification, ArrayList arrayList) {
                this.f82938OooO00o = meshSpecification;
                this.f82939OooO0O0 = arrayList;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO00o$OooO0O0 */
        public static final class OooO0O0 {

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final /* synthetic */ OooO0O0[] f82940OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final C19623OooO00o f82941OooOoO0;

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final int f82942OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final int f82943OooOo0o;

            /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19623OooO00o {
            }

            static {
                OooO0O0[] oooO0O0Arr = {new OooO0O0("FLOAT", 0, 0, 0), new OooO0O0("FLOAT2", 1, 1, 1), new OooO0O0("FLOAT3", 2, 2, 2), new OooO0O0("FLOAT4", 3, 3, 3), new OooO0O0("UBYTE4", 4, 4, 4)};
                f82940OooOoO = oooO0O0Arr;
                OooO.OooO00o.OooO0O0(oooO0O0Arr);
                f82941OooOoO0 = new C19623OooO00o();
            }

            public OooO0O0(String str, int i, int i2, int i3) {
                this.f82943OooOo0o = i2;
                this.f82942OooOo = i3;
            }

            public static OooO0O0 valueOf(String str) {
                return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
            }

            public static OooO0O0[] values() {
                return (OooO0O0[]) f82940OooOoO.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO00o$OooO0OO */
        public static final class OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final C19624OooO00o f82944OooOo;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final /* synthetic */ OooO0OO[] f82945OooOoO0;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final int f82946OooOo0o;

            /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C19624OooO00o {
            }

            static {
                OooO0OO[] oooO0OOArr = {new OooO0OO("OBJECT_TO_CANVAS_LINEAR_COMPONENT", 0, 0), new OooO0OO("BRUSH_COLOR", 1, 1), new OooO0OO("POSITION_UNPACKING_TRANSFORM", 2, 2), new OooO0OO("SIDE_DERIVATIVE_UNPACKING_TRANSFORM", 3, 3), new OooO0OO("FORWARD_DERIVATIVE_UNPACKING_TRANSFORM", 4, 4), new OooO0OO("TEXTURE_MAPPING", 5, 5), new OooO0OO("TEXTURE_ANIMATION_PROGRESS", 6, 6), new OooO0OO("NUM_TEXTURE_ANIMATION_FRAMES", 7, 7), new OooO0OO("NUM_TEXTURE_ANIMATION_ROWS", 8, 8), new OooO0OO("NUM_TEXTURE_ANIMATION_COLUMNS", 9, 9)};
                f82945OooOoO0 = oooO0OOArr;
                OooO.OooO00o.OooO0O0(oooO0OOArr);
                f82944OooOo = new C19624OooO00o();
            }

            public OooO0OO(String str, int i, int i2) {
                this.f82946OooOo0o = i2;
            }

            public static OooO0OO valueOf(String str) {
                return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
            }

            public static OooO0OO[] values() {
                return (OooO0OO[]) f82945OooOoO0.clone();
            }
        }

        /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        public static final class C24523OooO0Oo {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final OooO0OO f82947OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f82948OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final int f82949OooO0OO;

            public C24523OooO0Oo(OooO0OO oooO0OO, String name, int i) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
                this.f82947OooO00o = oooO0OO;
                this.f82948OooO0O0 = name;
                this.f82949OooO0OO = i;
            }
        }

        public static final BlendMode OooO00o(OooOo oooOo) {
            BlendMode blendMode;
            Set<Oooo0> set = C24522OooO0oo.f82923OooOOOO;
            OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo = (OooOo.AbstractC24463OooO0Oo) oOo000Oo.OooOo.OoooOo0(oooOo.f82688OooO0O0);
            if (abstractC24463OooO0Oo != null) {
                OooOo.AbstractC24463OooO0Oo.OooO0O0 oooO0O0 = abstractC24463OooO0Oo.f82705OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0O0, "<this>");
                if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82710OooO0OO)) {
                    blendMode = BlendMode.MODULATE;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82711OooO0Oo)) {
                    blendMode = BlendMode.DST_IN;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82713OooO0o0)) {
                    blendMode = BlendMode.DST_OUT;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82712OooO0o)) {
                    blendMode = BlendMode.SRC_ATOP;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82714OooO0oO)) {
                    blendMode = BlendMode.SRC_IN;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82715OooO0oo)) {
                    blendMode = BlendMode.SRC_OVER;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82708OooO)) {
                    blendMode = BlendMode.DST_OVER;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82716OooOO0)) {
                    blendMode = BlendMode.SRC;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82717OooOO0O)) {
                    blendMode = BlendMode.DST;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82718OooOO0o)) {
                    blendMode = BlendMode.SRC_OUT;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82720OooOOO0)) {
                    blendMode = BlendMode.DST_ATOP;
                } else if (oooO0O0.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82719OooOOO)) {
                    blendMode = BlendMode.XOR;
                } else {
                    Log.e("BlendModeConversion", "Unsupported BlendMode: " + oooO0O0 + ". Using BlendMode.MODULATE instead.");
                    blendMode = BlendMode.MODULATE;
                }
                if (blendMode != null) {
                    return blendMode;
                }
            }
            return BlendMode.MODULATE;
        }
    }

    /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f82950OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C32465OooO0O0 f82951OooO0O0;

        public OooO0O0(long j, C32465OooO0O0 androidMeshes) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(androidMeshes, "androidMeshes");
            this.f82950OooO00o = j;
            this.f82951OooO0O0 = androidMeshes;
        }
    }

    /* JADX INFO: renamed from: o000Oo0O.OooO0oo$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Mesh f82952OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f82953OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float[] f82954OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f82955OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f82956OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f82957OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f82958OooO0oO;

        public OooO0OO(Mesh mesh, long j, float[] fArr, float f, int i, int i2, int i3) {
            this.f82952OooO00o = mesh;
            this.f82953OooO0O0 = j;
            this.f82954OooO0OO = fArr;
            this.f82955OooO0Oo = f;
            this.f82957OooO0o0 = i;
            this.f82956OooO0o = i2;
            this.f82958OooO0oO = i3;
        }
    }

    public C24522OooO0oo(o000oOoO textureStore) {
        C24521OooO0oO getDurationTimeMillis = C24521OooO0oO.f82922OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(textureStore, "textureStore");
        kotlin.jvm.internal.OooOOO0.OooO0oO(getDurationTimeMillis, "getDurationTimeMillis");
        this.f82925OooO00o = getDurationTimeMillis;
        this.f82926OooO0O0 = new C24527OooOOo0();
        this.f82927OooO0OO = new C24515OooO00o(textureStore, 0, false);
        this.f82928OooO0Oo = new WeakHashMap<>();
        C20484OooOo0o<Mesh> c20484OooOo0o = new C20484OooOo0o<>();
        c20484OooOo0o.OooO0O0(C20491OooOooo.OooO0o(6));
        this.f82930OooO0o0 = c20484OooOo0o;
        this.f82929OooO0o = Long.MIN_VALUE;
        this.f82931OooO0oO = new WeakHashMap<>();
        this.f82932OooO0oo = new ArrayList<>();
        this.f82924OooO = new ArrayList<>();
        this.f82933OooOO0 = new float[9];
        this.f82934OooOO0O = new float[4];
        this.f82935OooOO0o = new float[4];
        this.f82937OooOOO0 = new StrokeInput();
        this.f82936OooOOO = new StrokeInput();
    }

    @Override // o000Oo0O.InterfaceC24528OooOOoo
    public final boolean OooO00o(Canvas canvas, C21967OooO0Oo inProgressStroke, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressStroke, "inProgressStroke");
        int iOooO0Oo = inProgressStroke.OooO0Oo(i);
        int inputCount = InProgressStrokeNative.f65457OooO00o.getInputCount(inProgressStroke.OooO0o0());
        androidx.ink.geometry.OooOOO oooOOOOooO0OO = inProgressStroke.OooO0OO(i);
        o000OO00.OooO0O0 oooO0O0 = inProgressStroke.f65470OooO0O0;
        if (oooO0O0 != null) {
            return OooO0o0(canvas, iOooO0Oo, inputCount, oooOOOOooO0OO, OooOo00.OooO00o(oooO0O0, i, i2));
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0213  */
    @Override // o000Oo0O.InterfaceC24528OooOOoo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(Canvas canvas, C21967OooO0Oo inProgressStroke, int i, int i2, Matrix strokeToScreenTransform, float f) {
        androidx.ink.geometry.OooOOO oooOOO;
        int i3;
        int iOooO0O0;
        int i4;
        BlendMode blendMode;
        int i5;
        int i6;
        int i7;
        Paint paint;
        o000OO00.OooO0O0 oooO0O0;
        OooOo oooOo;
        OooO0O0 oooO0O02;
        int i8;
        int i9;
        o000OO00.OooO0O0 oooO0O03;
        Paint paint2;
        OooOo oooOo2;
        int iOooO0O02;
        int i10;
        OooOo oooOo3;
        int i11;
        OooO0O0 oooO0O04;
        BlendMode blendMode2;
        int i12;
        int i13;
        Paint paint3;
        C24522OooO0oo c24522OooO0oo = this;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressStroke, "inProgressStroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToScreenTransform, "strokeToScreenTransform");
        int inputCount = InProgressStrokeNative.f65457OooO00o.getInputCount(inProgressStroke.OooO0o0());
        if (inProgressStroke.OooO0Oo(i) == 0 || inputCount == 0) {
            return;
        }
        inProgressStroke.OooO0oo(0, c24522OooO0oo.f82937OooOOO0);
        inProgressStroke.OooO0oo(inputCount - 1, c24522OooO0oo.f82936OooOOO);
        androidx.ink.geometry.OooOOO oooOOOOooO0OO = inProgressStroke.OooO0OO(i);
        o000OO00.OooO0O0 oooO0O05 = inProgressStroke.f65470OooO0O0;
        if (oooO0O05 == null) {
            throw new IllegalStateException("Attempting to draw an InProgressStroke that has not been started.");
        }
        OooOo oooOoOooO00o = OooOo00.OooO00o(oooO0O05, i, i2);
        float[] fArr = c24522OooO0oo.f82933OooOO0;
        strokeToScreenTransform.getValues(fArr);
        float f2 = fArr[0];
        float[] fArr2 = c24522OooO0oo.f82934OooOO0O;
        fArr2[0] = f2;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[1];
        fArr2[3] = fArr[4];
        int iOooO0O03 = OooOo00.OooO0O0(oooOoOooO00o);
        List<OooOo.AbstractC24463OooO0Oo> list = oooOoOooO00o.f82688OooO0O0;
        OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo = (OooOo.AbstractC24463OooO0Oo) oOo000Oo.OooOo.Oooo(list);
        int iOooO0Oo = abstractC24463OooO0Oo instanceof OooOo.OooO0OO ? ((OooOo.OooO0OO) abstractC24463OooO0Oo).OooO0Oo() : 1;
        OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo2 = (OooOo.AbstractC24463OooO0Oo) oOo000Oo.OooOo.Oooo(list);
        int iOooO0o0 = abstractC24463OooO0Oo2 instanceof OooOo.OooO0OO ? ((OooOo.OooO0OO) abstractC24463OooO0Oo2).OooO0o0() : 1;
        OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo3 = (OooOo.AbstractC24463OooO0Oo) oOo000Oo.OooOo.Oooo(list);
        int iOooO0O04 = abstractC24463OooO0Oo3 instanceof OooOo.OooO0OO ? ((OooOo.OooO0OO) abstractC24463OooO0Oo3).OooO0O0() : 1;
        BlendMode blendModeOooO00o = OooO00o.OooO00o(oooOoOooO00o);
        long j = C24495OooO00o.f82813OooO0O0;
        float fOooO0o = oooO0O05.OooO0o();
        Matrix matrix = C24515OooO00o.f82909OooO0o0;
        Paint paintOooO00o = c24522OooO0oo.f82927OooO0OO.OooO00o(oooOoOooO00o, j, fOooO0o, c24522OooO0oo.f82937OooOOO0, c24522OooO0oo.f82936OooOOO, null);
        OooOo oooOo4 = oooOoOooO00o;
        WeakHashMap<C21967OooO0Oo, List<OooO0O0>> weakHashMap = c24522OooO0oo.f82931OooO0oO;
        List<OooO0O0> list2 = weakHashMap.get(inProgressStroke);
        if (list2 != null) {
            oooOOO = oooOOOOooO0OO;
            if (list2.size() == inProgressStroke.OooO0O0()) {
                OooO0O0 oooO0O06 = list2.get(i);
                i3 = iOooO0O03;
                if (oooO0O06.f82950OooO00o == inProgressStroke.f65471OooO0OO) {
                    blendMode = blendModeOooO00o;
                    i5 = iOooO0Oo;
                    i6 = iOooO0o0;
                    i7 = iOooO0O04;
                    paint = paintOooO00o;
                    oooO0O0 = oooO0O05;
                    oooOo = oooOo4;
                    oooO0O02 = oooO0O06;
                }
                iOooO0O02 = oooO0O02.f82951OooO0O0.OooO0O0();
                i10 = 0;
                while (i10 < iOooO0O02) {
                    Mesh meshOooO0O0 = com.google.android.gms.measurement.internal.OooO00o.OooO0O0(oooO0O02.f82951OooO0O0.get(i10));
                    if (meshOooO0O0 == null) {
                        i11 = i3;
                        oooO0O04 = oooO0O02;
                        blendMode2 = blendMode;
                        i12 = i5;
                        i13 = i6;
                        paint3 = paint;
                        oooOo3 = oooOo;
                    } else {
                        oooOo3 = oooOo;
                        i11 = i3;
                        oooO0O04 = oooO0O02;
                        blendMode2 = blendMode;
                        i12 = i5;
                        i13 = i6;
                        OooO0oO(meshOooO0O0, oooOOO, this.f82934OooOO0O, oooOo3.OooO00o(oooO0O0.OooO0Oo()), null, i11, f, i12, i13, i7);
                        paint3 = paint;
                        canvas.drawMesh(meshOooO0O0, blendMode2, paint3);
                    }
                    i10++;
                    paint = paint3;
                    i3 = i11;
                    i5 = i12;
                    i6 = i13;
                    blendMode = blendMode2;
                    oooOo = oooOo3;
                    oooO0O02 = oooO0O04;
                }
            }
            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            iOooO0O0 = inProgressStroke.OooO0O0();
            i4 = 0;
            while (i4 < iOooO0O0) {
                C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
                int i14 = iOooO0O0;
                int iOooO0Oo2 = inProgressStroke.OooO0Oo(i4);
                BlendMode blendMode3 = blendModeOooO00o;
                int i15 = 0;
                while (i15 < iOooO0Oo2) {
                    int i16 = iOooO0Oo2;
                    BoxAccumulator boxAccumulator = new BoxAccumulator();
                    inProgressStroke.OooO(i4, boxAccumulator);
                    int i17 = iOooO0Oo;
                    Mesh meshOooO00o = null;
                    if (!boxAccumulator.f65372OooO0O0) {
                        i8 = iOooO0o0;
                        i9 = iOooO0O04;
                    } else {
                        if (i15 < 0 || i15 >= inProgressStroke.OooO0Oo(i4)) {
                            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Cannot get vertex count at partitionIndex ", i15, " out of range [0, ", ").", inProgressStroke.OooO0Oo(i4)).toString());
                        }
                        i8 = iOooO0o0;
                        i9 = iOooO0O04;
                        int vertexCount = InProgressStrokeNative.f65457OooO00o.getVertexCount(inProgressStroke.OooO0o0(), i4, i15);
                        if (vertexCount >= 3) {
                            MeshSpecification meshSpecification = c24522OooO0oo.OooO0o(inProgressStroke.OooO0OO(i4), false).f82938OooO00o;
                            ByteBuffer byteBufferOooO0O0 = androidx.ink.strokes.OooO0o.OooO0O0(inProgressStroke, i4, i15);
                            ShortBuffer shortBufferOooO00o = androidx.ink.strokes.OooO0o.OooO00o(inProgressStroke, i4, i15);
                            oooO0O03 = oooO0O05;
                            MutableBox mutableBoxOooO0OO = boxAccumulator.OooO0OO();
                            if (mutableBoxOooO0OO != null) {
                                paint2 = paintOooO00o;
                                oooOo2 = oooOo4;
                                meshOooO00o = com.google.android.gms.measurement.internal.OooO0OO.OooO00o(meshSpecification, byteBufferOooO0O0, vertexCount, shortBufferOooO00o, new RectF(mutableBoxOooO0OO.f65389OooO00o, mutableBoxOooO0OO.f65390OooO0O0, mutableBoxOooO0OO.f65391OooO0OO, mutableBoxOooO0OO.f65392OooO0Oo));
                                c32465OooO0O0OooO0Oo2.add(meshOooO00o);
                                i15++;
                                c24522OooO0oo = this;
                                iOooO0Oo2 = i16;
                                iOooO0Oo = i17;
                                iOooO0o0 = i8;
                                iOooO0O04 = i9;
                                paintOooO00o = paint2;
                                oooO0O05 = oooO0O03;
                                oooOo4 = oooOo2;
                            } else {
                                paint2 = paintOooO00o;
                            }
                        }
                        oooOo2 = oooOo4;
                        c32465OooO0O0OooO0Oo2.add(meshOooO00o);
                        i15++;
                        c24522OooO0oo = this;
                        iOooO0Oo2 = i16;
                        iOooO0Oo = i17;
                        iOooO0o0 = i8;
                        iOooO0O04 = i9;
                        paintOooO00o = paint2;
                        oooO0O05 = oooO0O03;
                        oooOo4 = oooOo2;
                    }
                    paint2 = paintOooO00o;
                    oooO0O03 = oooO0O05;
                    oooOo2 = oooOo4;
                    c32465OooO0O0OooO0Oo2.add(meshOooO00o);
                    i15++;
                    c24522OooO0oo = this;
                    iOooO0Oo2 = i16;
                    iOooO0Oo = i17;
                    iOooO0o0 = i8;
                    iOooO0O04 = i9;
                    paintOooO00o = paint2;
                    oooO0O05 = oooO0O03;
                    oooOo4 = oooOo2;
                }
                c32465OooO0O0OooO0Oo.add(new OooO0O0(inProgressStroke.f65471OooO0OO, com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2)));
                i4++;
                c24522OooO0oo = this;
                iOooO0O0 = i14;
                blendModeOooO00o = blendMode3;
                iOooO0Oo = iOooO0Oo;
                iOooO0o0 = iOooO0o0;
                iOooO0O04 = iOooO0O04;
                paintOooO00o = paintOooO00o;
                oooO0O05 = oooO0O05;
                oooOo4 = oooOo4;
            }
            blendMode = blendModeOooO00o;
            i5 = iOooO0Oo;
            i6 = iOooO0o0;
            i7 = iOooO0O04;
            paint = paintOooO00o;
            oooO0O0 = oooO0O05;
            oooOo = oooOo4;
            C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
            weakHashMap.put(inProgressStroke, c32465OooO0O0OooO0O0);
            oooO0O02 = (OooO0O0) c32465OooO0O0OooO0O0.get(i);
            iOooO0O02 = oooO0O02.f82951OooO0O0.OooO0O0();
            i10 = 0;
            while (i10 < iOooO0O02) {
            }
        }
        oooOOO = oooOOOOooO0OO;
        i3 = iOooO0O03;
        C32465OooO0O0 c32465OooO0O0OooO0Oo3 = com.facebook.soloader.OooOo.OooO0Oo();
        iOooO0O0 = inProgressStroke.OooO0O0();
        i4 = 0;
        while (i4 < iOooO0O0) {
        }
        blendMode = blendModeOooO00o;
        i5 = iOooO0Oo;
        i6 = iOooO0o0;
        i7 = iOooO0O04;
        paint = paintOooO00o;
        oooO0O0 = oooO0O05;
        oooOo = oooOo4;
        C32465OooO0O0 c32465OooO0O0OooO0O02 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo3);
        weakHashMap.put(inProgressStroke, c32465OooO0O0OooO0O02);
        oooO0O02 = (OooO0O0) c32465OooO0O0OooO0O02.get(i);
        iOooO0O02 = oooO0O02.f82951OooO0O0.OooO0O0();
        i10 = 0;
        while (i10 < iOooO0O02) {
        }
    }

    @Override // o000Oo0O.InterfaceC24528OooOOoo
    public final boolean OooO0OO(Canvas canvas, androidx.ink.strokes.OooOOO0 stroke, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        androidx.ink.geometry.OooOo00 oooOo00 = stroke.f65489OooO0Oo;
        return OooO0o0(canvas, oooOo00.OooO0oo(i).size(), stroke.f65488OooO0OO.OooO0OO(), oooOo00.OooO0oO(i), OooOo00.OooO00o(stroke.f65486OooO00o, i, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03a5, code lost:
    
        r5[r1] = (r7 & (~(255 << r51))) | (((long) (r23 & 127)) << r51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03b8, code lost:
    
        if (r15 != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03ba, code lost:
    
        r15 = OooOo.C20491OooOooo.OooO0O0(r5, r9 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03c2, code lost:
    
        r46[r15] = r46[r30];
        r46[r30] = r46[r9];
        r46[r9] = r46[r15];
        r45[r15] = r45[r30];
        r45[r30] = r45[r9];
        r45[r9] = r45[r15];
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03de, code lost:
    
        r5[r5.length - 1] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03ee, code lost:
    
        r44 = r1;
        r4.f58502OooO0o = OooOo.C20491OooOooo.OooO0OO(r4.f58528OooO0Oo) - r4.f58529OooO0o0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0402, code lost:
    
        r44 = r1;
        r1 = OooOo.C20491OooOooo.OooO0Oo(r4.f58528OooO0Oo);
        r5 = r4.f58525OooO00o;
        r6 = r4.f58526OooO0O0;
        r8 = r4.f58527OooO0OO;
        r9 = r4.f58528OooO0Oo;
        r4.OooO0O0(r1);
        r1 = r4.f58525OooO00o;
        r15 = r4.f58526OooO0O0;
        r7 = r4.f58527OooO0OO;
        r1 = r4.f58528OooO0Oo;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0425, code lost:
    
        if (r1 >= r9) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0435, code lost:
    
        if (((r5[r1 >> 3] >> ((r1 & 7) << 3)) & 255) >= 128) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0437, code lost:
    
        r23 = r6[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0439, code lost:
    
        if (r23 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x043b, code lost:
    
        r25 = r23.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0440, code lost:
    
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0442, code lost:
    
        r25 = r25 * (-862048943);
        r25 = r25 ^ (r25 << 16);
        r26 = r1;
        r1 = r4.OooO00o(r25 >>> 7);
        r1 = r25 & 127;
        r25 = r5;
        r45 = r6;
        r5 = r1;
        r1 = r1 >> 3;
        r46 = (r1 & 7) << 3;
        r5 = (r1[r1] & (~(255 << r46))) | (r5 << r46);
        r1[r1] = r5;
        r1[(((r1 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r15[r1] = r23;
        r7[r1] = r8[r26];
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0483, code lost:
    
        r26 = r1;
        r25 = r5;
        r45 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x048a, code lost:
    
        r1 = r26 + 1;
        r5 = r25;
        r6 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0491, code lost:
    
        r5 = r4.OooO00o(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0495, code lost:
    
        r4.f58529OooO0o0++;
        r1 = r4.f58502OooO0o;
        r6 = r4.f58525OooO00o;
        r7 = r5 >> 3;
        r8 = r6[r7];
        r14 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04ad, code lost:
    
        if (((r8 >> r14) & 255) != 128) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04af, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04b1, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04b2, code lost:
    
        r4.f58502OooO0o = r1 - r15;
        r1 = r4.f58528OooO0Oo;
        r6 = ((~(255 << r14)) & r8) | (r8 << r14);
        r6[r7] = r6;
        r6[(((r5 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r1 = ~r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0294, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0296, code lost:
    
        r5 = r4.OooO00o(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029c, code lost:
    
        if (r4.f58502OooO0o != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ae, code lost:
    
        if (((r4.f58525OooO00o[r5 >> 3] >> ((r5 & 7) << 3)) & 255) != 254) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b0, code lost:
    
        r44 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b8, code lost:
    
        r5 = r4.f58528OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02bc, code lost:
    
        if (r5 <= 8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02cd, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.f58529OooO0o0) * 32, ((long) r5) * 25) > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02cf, code lost:
    
        r5 = r4.f58525OooO00o;
        r6 = r4.f58528OooO0Oo;
        r7 = r4.f58526OooO0O0;
        r8 = r4.f58527OooO0OO;
        OooOo.C20491OooOooo.OooO00o(r5, r6);
        r9 = 0;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02dc, code lost:
    
        if (r9 == r6) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02de, code lost:
    
        r18 = r9 >> 3;
        r19 = (r9 & 7) << 3;
        r44 = (r5[r18] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ec, code lost:
    
        if (r44 != 128) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02ee, code lost:
    
        r15 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02fc, code lost:
    
        if (r44 == 254) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02fe, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0301, code lost:
    
        r23 = r7[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0303, code lost:
    
        if (r23 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0305, code lost:
    
        r23 = r23.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x030a, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x030c, code lost:
    
        r23 = r23 * (-862048943);
        r23 = r23 ^ (r23 << 16);
        r44 = r1;
        r1 = r23 >>> 7;
        r30 = r4.OooO00o(r1);
        r1 = r1 & r6;
        r46 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0334, code lost:
    
        if ((((r30 - r1) & r6) / 8) != (((r9 - r1) & r6) / 8)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0336, code lost:
    
        r45 = r8;
        r5[r18] = (r5[r18] & (~(255 << r19))) | (((long) (r23 & 127)) << r19);
        r5[r5.length - 1] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0358, code lost:
    
        r9 = r9 + 1;
        r1 = r44;
        r8 = r45;
        r7 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0362, code lost:
    
        r45 = r8;
        r1 = r30 >> 3;
        r7 = r5[r1];
        r51 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0372, code lost:
    
        if (((r7 >> r51) & 255) != 128) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0374, code lost:
    
        r5[r1] = (r7 & (~(255 << r51))) | (((long) (r23 & 127)) << r51);
        r5[r18] = (r5[r18] & (~(255 << r19))) | (128 << r19);
        r46[r30] = r46[r9];
        r46[r9] = null;
        r45[r30] = r45[r9];
        r45[r9] = 0;
        r15 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    @Override // o000Oo0O.InterfaceC24528OooOOoo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0Oo(Canvas canvas, androidx.ink.strokes.OooOOO0 stroke, int i, int i2, Matrix matrix, float f) {
        Paint paint;
        OooOo oooOo;
        o000OO00.OooO0O0 oooO0O0;
        BlendMode blendMode;
        Mesh meshOooO00o;
        int i3;
        int i4;
        int i5;
        Mesh mesh;
        int i6;
        int i7;
        long[] jArr;
        long[] jArr2;
        int i8;
        long j;
        WeakHashMap<androidx.ink.geometry.OooOO0O, OooO0OO> weakHashMap;
        int i9;
        Canvas canvas2 = canvas;
        Matrix strokeToScreenTransform = matrix;
        int i10 = 1;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas2, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToScreenTransform, "strokeToScreenTransform");
        List<androidx.ink.geometry.OooOO0O> listOooO0oo = stroke.f65489OooO0Oo.OooO0oo(i);
        androidx.ink.strokes.OooO00o oooO00o = stroke.f65488OooO0OO;
        int iOooO0OO = oooO00o.OooO0OO();
        if (listOooO0oo.size() == 0 || iOooO0OO == 0) {
            return;
        }
        o000OO00.OooO0O0 oooO0O02 = stroke.f65486OooO00o;
        OooOo oooOoOooO00o = OooOo00.OooO00o(oooO0O02, i, i2);
        oooO00o.OooO0o0(0, this.f82937OooOOO0);
        oooO00o.OooO0o0(iOooO0OO - 1, this.f82936OooOOO);
        int iOooO0O0 = OooOo00.OooO0O0(oooOoOooO00o);
        List<OooOo.AbstractC24463OooO0Oo> list = oooOoOooO00o.f82688OooO0O0;
        OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo = (OooOo.AbstractC24463OooO0Oo) oOo000Oo.OooOo.Oooo(list);
        int iOooO0Oo = abstractC24463OooO0Oo instanceof OooOo.OooO0OO ? ((OooOo.OooO0OO) abstractC24463OooO0Oo).OooO0Oo() : 1;
        OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo2 = (OooOo.AbstractC24463OooO0Oo) oOo000Oo.OooOo.Oooo(list);
        int iOooO0o0 = abstractC24463OooO0Oo2 instanceof OooOo.OooO0OO ? ((OooOo.OooO0OO) abstractC24463OooO0Oo2).OooO0o0() : 1;
        OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo3 = (OooOo.AbstractC24463OooO0Oo) oOo000Oo.OooOo.Oooo(list);
        int iOooO0O02 = abstractC24463OooO0Oo3 instanceof OooOo.OooO0OO ? ((OooOo.OooO0OO) abstractC24463OooO0Oo3).OooO0O0() : 1;
        BlendMode blendModeOooO00o = OooO00o.OooO00o(oooOoOooO00o);
        long j2 = C24495OooO00o.f82813OooO0O0;
        float fOooO0o = oooO0O02.OooO0o();
        Matrix matrix2 = C24515OooO00o.f82909OooO0o0;
        int i11 = 0;
        Paint paintOooO00o = this.f82927OooO0OO.OooO00o(oooOoOooO00o, j2, fOooO0o, this.f82937OooOOO0, this.f82936OooOOO, null);
        OooOo oooOo2 = oooOoOooO00o;
        for (androidx.ink.geometry.OooOO0O oooOO0O : listOooO0oo) {
            int i12 = i10;
            long jOooO00o = oooOo2.OooO00o(oooO0O02.OooO0Oo());
            float[] fArr = this.f82933OooOO0;
            strokeToScreenTransform.getValues(fArr);
            float f2 = fArr[i11];
            float[] fArr2 = this.f82934OooOO0O;
            fArr2[i11] = f2;
            fArr2[i12] = fArr[3];
            fArr2[2] = fArr[i12];
            fArr2[3] = fArr[4];
            WeakHashMap<androidx.ink.geometry.OooOO0O, OooO0OO> weakHashMap2 = this.f82928OooO0Oo;
            OooO0OO oooO0OO = weakHashMap2.get(oooOO0O);
            o000OO00.OooO0O0 oooO0O03 = oooO0O02;
            int i13 = Build.VERSION.SDK_INT >= 35 ? i12 : i11;
            if (oooO0OO != null) {
                Paint paint2 = paintOooO00o;
                if (i13 != 0 || (jOooO00o == oooO0OO.f82953OooO0O0 && Arrays.equals(fArr2, oooO0OO.f82954OooO0OO) && iOooO0Oo == (i9 = oooO0OO.f82957OooO0o0) && iOooO0o0 == oooO0OO.f82956OooO0o && iOooO0O02 == oooO0OO.f82958OooO0oO && (i9 == i12 || f == oooO0OO.f82955OooO0Oo))) {
                    if (i13 != 0) {
                        oooOo = oooOo2;
                        blendMode = blendModeOooO00o;
                        paint = paint2;
                        oooO0O0 = oooO0O03;
                        OooO0oO(oooO0OO.f82952OooO00o, oooOO0O.f65412OooO0O0, this.f82934OooOO0O, jOooO00o, oooOO0O.f65415OooO0o0, iOooO0O0, f, iOooO0Oo, iOooO0o0, iOooO0O02);
                    } else {
                        oooOo = oooOo2;
                        blendMode = blendModeOooO00o;
                        paint = paint2;
                        oooO0O0 = oooO0O03;
                    }
                    meshOooO00o = oooO0OO.f82952OooO00o;
                    Paint paint3 = paint;
                    canvas2.drawMesh(meshOooO00o, blendMode, paint3);
                    if (i13 != 0) {
                        long jLongValue = this.f82925OooO00o.invoke().longValue();
                        C20484OooOo0o<Mesh> c20484OooOo0o = this.f82930OooO0o0;
                        c20484OooOo0o.getClass();
                        int iHashCode = meshOooO00o.hashCode() * (-862048943);
                        int i14 = iHashCode ^ (iHashCode << 16);
                        int i15 = i14 >>> 7;
                        int i16 = i14 & 127;
                        int i17 = c20484OooOo0o.f58528OooO0Oo;
                        int i18 = i15 & i17;
                        int i19 = 0;
                        while (true) {
                            long[] jArr3 = c20484OooOo0o.f58525OooO00o;
                            int i20 = i18 >> 3;
                            int i21 = (i18 & 7) << 3;
                            i3 = iOooO0O0;
                            long j3 = (jArr3[i20] >>> i21) | ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63));
                            paint = paint3;
                            i4 = iOooO0Oo;
                            long j4 = i16;
                            long j5 = j3 ^ (j4 * 72340172838076673L);
                            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                            while (true) {
                                i5 = i16;
                                if (j6 == 0) {
                                    break;
                                }
                                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j6) >> 3)) & i17;
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c20484OooOo0o.f58526OooO0O0[iNumberOfTrailingZeros], meshOooO00o)) {
                                    mesh = meshOooO00o;
                                    i6 = iNumberOfTrailingZeros;
                                    break;
                                } else {
                                    j6 &= j6 - 1;
                                    i16 = i5;
                                }
                            }
                            i19 += 8;
                            i18 = (i18 + i19) & i17;
                            iOooO0O0 = i3;
                            iOooO0Oo = i4;
                            i16 = i5;
                            paint3 = paint;
                        }
                        if (i6 < 0) {
                            i6 = ~i6;
                        }
                        c20484OooOo0o.f58526OooO0O0[i6] = mesh;
                        c20484OooOo0o.f58527OooO0OO[i6] = jLongValue;
                        if (this.f82929OooO0o + ((long) 2000) > jLongValue) {
                            i7 = 1;
                        } else {
                            long[] jArr4 = c20484OooOo0o.f58525OooO00o;
                            int length = jArr4.length - 2;
                            if (length >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j7 = jArr4[i22];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length)) >>> 31);
                                        long j8 = j7;
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j8 & 255) < 128) {
                                                int i25 = (i22 << 3) + i24;
                                                jArr2 = jArr4;
                                                Object obj = c20484OooOo0o.f58526OooO0O0[i25];
                                                long j9 = c20484OooOo0o.f58527OooO0OO[i25];
                                                com.google.android.gms.measurement.internal.OooO0O0.OooO0O0(obj);
                                                i8 = i24;
                                                if (j9 + ((long) 5000) < jLongValue) {
                                                    c20484OooOo0o.f58529OooO0o0--;
                                                    long[] jArr5 = c20484OooOo0o.f58525OooO00o;
                                                    int i26 = c20484OooOo0o.f58528OooO0Oo;
                                                    int i27 = i25 >> 3;
                                                    int i28 = (i25 & 7) << 3;
                                                    long j10 = (jArr5[i27] & (~(255 << i28))) | (254 << i28);
                                                    jArr5[i27] = j10;
                                                    jArr5[(((i25 - 7) & i26) + (i26 & 7)) >> 3] = j10;
                                                    c20484OooOo0o.f58526OooO0O0[i25] = null;
                                                }
                                            } else {
                                                jArr2 = jArr4;
                                                i8 = i24;
                                            }
                                            j8 >>= 8;
                                            i24 = i8 + 1;
                                            jArr4 = jArr2;
                                        }
                                        jArr = jArr4;
                                        i7 = 1;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr4;
                                        i7 = 1;
                                    }
                                    if (i22 == length) {
                                        break;
                                    }
                                    i22++;
                                    jArr4 = jArr;
                                }
                            } else {
                                i7 = 1;
                            }
                            this.f82929OooO0o = jLongValue;
                        }
                        blendModeOooO00o = blendMode;
                        iOooO0O0 = i3;
                        iOooO0Oo = i4;
                        i10 = i7;
                        oooO0O02 = oooO0O0;
                        oooOo2 = oooOo;
                        paintOooO00o = paint;
                        i11 = 0;
                        strokeToScreenTransform = matrix;
                    } else {
                        i3 = iOooO0O0;
                        paint = paint3;
                        i4 = iOooO0Oo;
                        i7 = 1;
                        blendModeOooO00o = blendMode;
                        iOooO0O0 = i3;
                        iOooO0Oo = i4;
                        i10 = i7;
                        oooO0O02 = oooO0O0;
                        oooOo2 = oooOo;
                        paintOooO00o = paint;
                        i11 = 0;
                        strokeToScreenTransform = matrix;
                    }
                } else {
                    paint = paint2;
                }
            } else {
                paint = paintOooO00o;
            }
            oooOo = oooOo2;
            blendMode = blendModeOooO00o;
            oooO0O0 = oooO0O03;
            androidx.ink.geometry.OooO0o oooO0o = (androidx.ink.geometry.OooO0o) oooOO0O.f65414OooO0Oo.getValue();
            if (oooO0o == null) {
                j = jOooO00o;
                weakHashMap = weakHashMap2;
                i3 = iOooO0O0;
                meshOooO00o = null;
            } else {
                MeshSpecification meshSpecification = OooO0o(oooOO0O.f65412OooO0O0, true).f82938OooO00o;
                C22350OooO0Oo.OooO00o();
                j = jOooO00o;
                weakHashMap = weakHashMap2;
                i3 = iOooO0O0;
                meshOooO00o = com.google.android.gms.measurement.internal.OooO0OO.OooO00o(meshSpecification, C21958OooO0oo.OooO0O0(oooOO0O), oooOO0O.f65413OooO0OO, C21958OooO0oo.OooO00o(oooOO0O), new RectF(oooO0o.getF65374OooO00o(), oooO0o.getF65375OooO0O0(), oooO0o.getF65376OooO0OO(), oooO0o.getF65377OooO0Oo()));
            }
            if (meshOooO00o != null) {
                long j11 = j;
                iOooO0O0 = i3;
                OooO0oO(meshOooO00o, oooOO0O.f65412OooO0O0, this.f82934OooOO0O, j11, oooOO0O.f65415OooO0o0, iOooO0O0, f, iOooO0Oo, iOooO0o0, iOooO0O02);
                float[] fArr3 = new float[4];
                System.arraycopy(fArr2, 0, fArr3, 0, 4);
                weakHashMap.put(oooOO0O, new OooO0OO(meshOooO00o, j11, fArr3, f, iOooO0Oo, iOooO0o0, iOooO0O02));
                canvas2 = canvas;
                Paint paint32 = paint;
                canvas2.drawMesh(meshOooO00o, blendMode, paint32);
                if (i13 != 0) {
                }
            }
            i4 = iOooO0Oo;
            i7 = 1;
            blendModeOooO00o = blendMode;
            iOooO0O0 = i3;
            iOooO0Oo = i4;
            i10 = i7;
            oooO0O02 = oooO0O0;
            oooOo2 = oooOo;
            paintOooO00o = paint;
            i11 = 0;
            strokeToScreenTransform = matrix;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OooO00o.C19622OooO00o OooO0o(androidx.ink.geometry.OooOOO meshFormat, boolean z) {
        OooO00o.C19622OooO00o c19622OooO00o;
        OooO00o.OooO0OO oooO0OO;
        OooO00o.OooO0O0 oooO0O0;
        OooO00o.OooO0O0 oooO0O02;
        kotlin.jvm.internal.OooOOO0.OooO0oO(meshFormat, "meshFormat");
        ArrayList<C32443OooOOO<androidx.ink.geometry.OooOOO, OooO00o.C19622OooO00o>> arrayList = z ? this.f82932OooO0oo : this.f82924OooO;
        Iterator<C32443OooOOO<androidx.ink.geometry.OooOOO, OooO00o.C19622OooO00o>> it = arrayList.iterator();
        kotlin.jvm.internal.OooOOO0.OooO0o(it, "iterator(...)");
        while (it.hasNext()) {
            C32443OooOOO<androidx.ink.geometry.OooOOO, OooO00o.C19622OooO00o> next = it.next();
            kotlin.jvm.internal.OooOOO0.OooO0o(next, "next(...)");
            C32443OooOOO<androidx.ink.geometry.OooOOO, OooO00o.C19622OooO00o> c32443OooOOO = next;
            androidx.ink.geometry.OooOOO oooOOO = c32443OooOOO.f116638OooOo0o;
            if (z) {
                oooOOO.getClass();
                if (oooOOO != meshFormat && oooOOO.OooO00o() != meshFormat.OooO00o() && !MeshFormatNative.f65387OooO00o.isPackedEquivalent(oooOOO.OooO00o(), meshFormat.OooO00o())) {
                    if (!z) {
                        oooOOO.getClass();
                        if (oooOOO == meshFormat || oooOOO.OooO00o() == meshFormat.OooO00o() || MeshFormatNative.f65387OooO00o.isUnpackedEquivalent(oooOOO.OooO00o(), meshFormat.OooO00o())) {
                        }
                    }
                }
                c19622OooO00o = c32443OooOOO.f116637OooOo;
                break;
            }
        }
        c19622OooO00o = null;
        OooO00o.C19622OooO00o c19622OooO00o2 = c19622OooO00o;
        if (c19622OooO00o2 != null) {
            return c19622OooO00o2;
        }
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        int[] iArr2 = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr2[i2] = -1;
        }
        String[] strArr = new String[8];
        for (int i3 = 0; i3 < 8; i3++) {
            strArr[i3] = ")";
        }
        int[] iArr3 = {-1};
        int[] iArr4 = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr4[i4] = -1;
        }
        String[] strArr2 = new String[6];
        for (int i5 = 0; i5 < 6; i5++) {
            strArr2[i5] = ")";
        }
        int[] iArr5 = new int[10];
        for (int i6 = 0; i6 < 10; i6++) {
            iArr5[i6] = -1;
        }
        int[] iArr6 = new int[10];
        for (int i7 = 0; i7 < 10; i7++) {
            iArr6[i7] = -1;
        }
        String[] strArr3 = new String[10];
        for (int i8 = 0; i8 < 10; i8++) {
            strArr3[i8] = ")";
        }
        String[] strArr4 = {"unset vertex shader"};
        String[] strArr5 = {"unset fragment shader"};
        CanvasMeshRendererNative.f65444OooO00o.fillSkiaMeshSpecData(meshFormat.OooO00o(), z, iArr, iArr2, strArr, iArr3, iArr4, strArr2, iArr5, iArr6, strArr3, strArr4, strArr5);
        ArrayList arrayList2 = new ArrayList();
        int i9 = 0;
        for (int i10 = 8; i9 < i10; i10 = 8) {
            OooO00o.OooO0O0.C19623OooO00o c19623OooO00o = OooO00o.OooO0O0.f82941OooOoO0;
            int i11 = iArr[i9];
            c19623OooO00o.getClass();
            OooO00o.OooO0O0[] oooO0O0ArrValues = OooO00o.OooO0O0.values();
            int length = oooO0O0ArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    oooO0O02 = null;
                    break;
                }
                oooO0O02 = oooO0O0ArrValues[i12];
                if (oooO0O02.f82943OooOo0o == i11) {
                    break;
                }
                i12++;
            }
            if (oooO0O02 == null) {
                break;
            }
            arrayList2.add(new MeshSpecification.Attribute(oooO0O02.f82942OooOo, iArr2[i9], strArr[i9]));
            i9++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < 6; i13++) {
            OooO00o.OooO0O0.C19623OooO00o c19623OooO00o2 = OooO00o.OooO0O0.f82941OooOoO0;
            int i14 = iArr4[i13];
            c19623OooO00o2.getClass();
            OooO00o.OooO0O0[] oooO0O0ArrValues2 = OooO00o.OooO0O0.values();
            int length2 = oooO0O0ArrValues2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    oooO0O0 = null;
                    break;
                }
                oooO0O0 = oooO0O0ArrValues2[i15];
                if (oooO0O0.f82943OooOo0o == i14) {
                    break;
                }
                i15++;
            }
            if (oooO0O0 == null) {
                break;
            }
            arrayList3.add(new MeshSpecification.Varying(oooO0O0.f82942OooOo, strArr2[i13]));
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i16 = 0; i16 < 10; i16++) {
            OooO00o.OooO0OO.C19624OooO00o c19624OooO00o = OooO00o.OooO0OO.f82944OooOo;
            int i17 = iArr5[i16];
            c19624OooO00o.getClass();
            OooO00o.OooO0OO[] oooO0OOArrValues = OooO00o.OooO0OO.values();
            int length3 = oooO0OOArrValues.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length3) {
                    oooO0OO = null;
                    break;
                }
                oooO0OO = oooO0OOArrValues[i18];
                if (oooO0OO.f82946OooOo0o == i17) {
                    break;
                }
                i18++;
            }
            if (oooO0OO == null) {
                break;
            }
            arrayList4.add(new OooO00o.C24523OooO0Oo(oooO0OO, strArr3[i16], iArr6[i16]));
        }
        MeshSpecification.Attribute[] attributeArr = (MeshSpecification.Attribute[]) arrayList2.toArray(new MeshSpecification.Attribute[0]);
        int i19 = iArr3[0];
        if (4 > i19 || i19 >= 1025) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MeshSpecification meshSpecificationMake = MeshSpecification.make(attributeArr, i19, (MeshSpecification.Varying[]) arrayList3.toArray(new MeshSpecification.Varying[0]), strArr4[0], strArr5[0], ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB), 2);
        kotlin.jvm.internal.OooOOO0.OooO0o(meshSpecificationMake, "make(...)");
        OooO00o.C19622OooO00o c19622OooO00o3 = new OooO00o.C19622OooO00o(meshSpecificationMake, arrayList4);
        arrayList.add(new C32443OooOOO<>(meshFormat, c19622OooO00o3));
        return c19622OooO00o3;
    }

    public final boolean OooO0o0(Canvas canvas, int i, int i2, androidx.ink.geometry.OooOOO oooOOO, OooOo oooOo) {
        Object objOooO00o;
        boolean zBooleanValue;
        if (!(i == 0 || i2 == 0)) {
            C24527OooOOo0 c24527OooOOo0 = this.f82926OooO0O0;
            c24527OooOOo0.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
            if (canvas.isHardwareAccelerated()) {
                zBooleanValue = true;
            } else {
                WeakHashMap<Canvas, Boolean> weakHashMap = c24527OooOOo0.f82977OooO00o;
                Boolean bool = weakHashMap.get(canvas);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Mesh meshOooO0O0 = com.google.android.gms.measurement.internal.OooO00o.OooO0O0(C24527OooOOo0.f82975OooO0OO.getValue());
                        BlendMode unused = BlendMode.DST;
                        canvas.drawMesh(meshOooO0O0, BlendMode.DST, C24527OooOOo0.f82976OooO0Oo);
                        objOooO00o = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    boolean z = !(objOooO00o instanceof C32445OooOOOO.OooO00o);
                    weakHashMap.put(canvas, Boolean.valueOf(z));
                    zBooleanValue = z;
                }
            }
            if (zBooleanValue) {
                oooOo.getClass();
                if (BrushPaintNative.f65349OooO00o.isCompatibleWithMeshFormat(oooOo.OooO0O0(), oooOOO.OooO00o()) && f82923OooOOOO.contains(oooOo.f82690OooO0Oo)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void OooO0oO(Mesh mesh, androidx.ink.geometry.OooOOO oooOOO, float[] fArr, long j, ArrayList arrayList, int i, float f, int i2, int i3, int i4) {
        boolean z = arrayList != null;
        Iterator it = OooO0o(oooOOO, z).f82939OooO0O0.iterator();
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        String str = ")";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        boolean z2 = z;
        String str10 = str9;
        while (it.hasNext()) {
            Iterator it2 = it;
            OooO00o.C24523OooO0Oo c24523OooO0Oo = (OooO00o.C24523OooO0Oo) it.next();
            String str11 = str4;
            int iOrdinal = c24523OooO0Oo.f82947OooO00o.ordinal();
            int i8 = i7;
            i7 = c24523OooO0Oo.f82949OooO0OO;
            String str12 = c24523OooO0Oo.f82948OooO0O0;
            switch (iOrdinal) {
                case 0:
                    str = str12;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                case 1:
                    str8 = str12;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                case 2:
                    if (!z2) {
                        throw new IllegalStateException("Unpacking transform uniform is only supported for packed meshes.");
                    }
                    str9 = str12;
                    i6 = i7;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                    break;
                case 3:
                    if (!z2) {
                        throw new IllegalStateException("Unpacking transform uniform is only supported for packed meshes.");
                    }
                    str2 = str12;
                    str4 = str11;
                    it = it2;
                    break;
                    break;
                case 4:
                    if (!z2) {
                        throw new IllegalStateException("Unpacking transform uniform is only supported for packed meshes.");
                    }
                    str3 = str12;
                    i5 = i7;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                    break;
                case 5:
                    str4 = str12;
                    it = it2;
                    i7 = i8;
                    break;
                case 6:
                    str6 = str12;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                case 7:
                    str5 = str12;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                case 8:
                    str10 = str12;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                case 9:
                    str7 = str12;
                    str4 = str11;
                    it = it2;
                    i7 = i8;
                    break;
                default:
                    throw new C32442OooOO0o();
            }
        }
        String str13 = str4;
        int i9 = i7;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, ")")) {
            throw new IllegalStateException("Check failed.");
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str8, ")")) {
            throw new IllegalStateException("Check failed.");
        }
        if (z2 && (kotlin.jvm.internal.OooOOO0.OooO0O0(str9, ")") || kotlin.jvm.internal.OooOOO0.OooO0O0(str2, ")") || kotlin.jvm.internal.OooOOO0.OooO0O0(str3, ")"))) {
            throw new IllegalStateException("Check failed.");
        }
        String str14 = str2;
        String str15 = str3;
        mesh.setFloatUniform(str, fArr[0], fArr[1], fArr[2], fArr[3]);
        long jOooO00o = C24495OooO00o.OooO00o(j, C24498OooO0o0.f82833OooO0o);
        float fOooO0o = C24495OooO00o.OooO0o(jOooO00o);
        float[] fArr2 = this.f82935OooOO0o;
        fArr2[0] = fOooO0o;
        fArr2[1] = C24495OooO00o.OooO0o0(jOooO00o);
        fArr2[2] = C24495OooO00o.OooO0OO(jOooO00o);
        fArr2[3] = C24495OooO00o.OooO0O0(jOooO00o);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        mesh.setFloatUniform(str8, fArr2);
        mesh.setIntUniform(str13, i);
        mesh.setFloatUniform(str6, f);
        mesh.setIntUniform(str5, i2);
        mesh.setIntUniform(str10, i3);
        mesh.setIntUniform(str7, i4);
        if (z2) {
            androidx.ink.geometry.OooOOO0 oooOOO0 = (androidx.ink.geometry.OooOOO0) arrayList.get(i6);
            float f2 = oooOOO0.f65421OooO00o.get(0).f65422OooO00o;
            List<OooOOO0.OooO00o> list = oooOOO0.f65421OooO00o;
            mesh.setFloatUniform(str9, f2, list.get(0).f65423OooO0O0, list.get(1).f65422OooO00o, list.get(1).f65423OooO0O0);
            androidx.ink.geometry.OooOOO0 oooOOO02 = (androidx.ink.geometry.OooOOO0) arrayList.get(i9);
            float f3 = oooOOO02.f65421OooO00o.get(0).f65422OooO00o;
            List<OooOOO0.OooO00o> list2 = oooOOO02.f65421OooO00o;
            mesh.setFloatUniform(str14, f3, list2.get(0).f65423OooO0O0, list2.get(1).f65422OooO00o, list2.get(1).f65423OooO0O0);
            androidx.ink.geometry.OooOOO0 oooOOO03 = (androidx.ink.geometry.OooOOO0) arrayList.get(i5);
            float f4 = oooOOO03.f65421OooO00o.get(0).f65422OooO00o;
            List<OooOOO0.OooO00o> list3 = oooOOO03.f65421OooO00o;
            mesh.setFloatUniform(str15, f4, list3.get(0).f65423OooO0O0, list3.get(1).f65422OooO00o, list3.get(1).f65423OooO0O0);
        }
    }
}
