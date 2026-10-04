package o000Oo0O;

import Oooo0.C20856OooooOo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.ink.strokes.StrokeInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o000OO00.OooOo;
import o000OO00.o000oOoO;
import o000OO0o.C24495OooO00o;
import o000OOO.C24498OooO0o0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o000Oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24515OooO00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Matrix f82909OooO0o0 = new Matrix();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO f82910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f82911OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f82912OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakHashMap<OooOo, OooO0O0> f82913OooO0Oo;

    /* JADX INFO: renamed from: o000Oo0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19621OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f82914OooO00o;
    }

    /* JADX INFO: renamed from: o000Oo0O.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Paint f82915OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0OO f82916OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C19621OooO00o f82917OooO0OO;

        public OooO0O0(Paint paint, OooO0OO oooO0OO, C19621OooO00o c19621OooO00o) {
            this.f82915OooO00o = paint;
            this.f82916OooO0O0 = oooO0OO;
            this.f82917OooO0OO = c19621OooO00o;
        }
    }

    /* JADX INFO: renamed from: o000Oo0O.OooO00o$OooO0OO */
    public final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooOo.AbstractC24463OooO0Oo> f82918OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f82919OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f82920OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Matrix f82921OooO0Oo;

        public OooO0OO(List textureLayers, ArrayList arrayList, ArrayList arrayList2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(textureLayers, "textureLayers");
            this.f82918OooO00o = textureLayers;
            this.f82919OooO0O0 = arrayList;
            this.f82920OooO0OO = arrayList2;
            this.f82921OooO0Oo = new Matrix();
            if (arrayList.size() != textureLayers.size() || arrayList2.size() != textureLayers.size()) {
                throw new IllegalArgumentException("textureLayers, bitmaps, and bitmapShaders should be parallel lists.");
            }
            int size = textureLayers.size();
            for (int i = 0; i < size; i++) {
                if (this.f82920OooO0OO.get(i) != null && this.f82919OooO0O0.get(i) == null) {
                    throw new IllegalArgumentException(C20856OooooOo.OooO0O0("bitmap[", i, "] should be non-null if bitmapShaders[", "] is non-null.", i).toString());
                }
            }
        }
    }

    public C24515OooO00o(o000oOoO textureStore, int i, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textureStore, "textureStore");
        this.f82910OooO00o = textureStore;
        this.f82911OooO0O0 = i;
        this.f82912OooO0OO = z;
        this.f82913OooO0Oo = new WeakHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Paint OooO00o(OooOo brushPaint, long j, float f, StrokeInput firstInput, StrokeInput lastInput, Matrix matrix) {
        String str;
        Matrix matrix2;
        long j2;
        PorterDuff.Mode mode;
        OooO0OO oooO0OO;
        OooOo.AbstractC24463OooO0Oo.C19617OooO0Oo c19617OooO0Oo;
        OooOo.AbstractC24463OooO0Oo.C19617OooO0Oo c19617OooO0Oo2;
        Object next;
        int i;
        String str2;
        PorterDuff.Mode mode2;
        C19621OooO00o c19621OooO00o;
        Iterator it;
        BitmapShader bitmapShader;
        kotlin.jvm.internal.OooOOO0.OooO0oO(brushPaint, "brushPaint");
        kotlin.jvm.internal.OooOOO0.OooO0oO(firstInput, "firstInput");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lastInput, "lastInput");
        WeakHashMap<OooOo, OooO0O0> weakHashMap = this.f82913OooO0Oo;
        OooO0O0 oooO0O0 = weakHashMap.get(brushPaint);
        String str3 = "<this>";
        List<OooOo.AbstractC24463OooO0Oo> list = brushPaint.f82688OooO0O0;
        if (oooO0O0 == null) {
            Paint paint = new Paint(this.f82911OooO0O0);
            paint.setFilterBitmap(true);
            if (list.isEmpty()) {
                str = "<this>";
                matrix2 = null;
                oooO0O0 = new OooO0O0(paint, null, null);
            } else {
                List<OooOo.AbstractC24463OooO0Oo> list2 = list;
                matrix2 = null;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo = (OooOo.AbstractC24463OooO0Oo) it2.next();
                    boolean z = abstractC24463OooO0Oo instanceof OooOo.C24465OooO0o0;
                    Iterator it3 = it2;
                    o000oOoO o000oooo2 = this.f82910OooO00o;
                    arrayList.add(z ? o000oooo2.get(((OooOo.C24465OooO0o0) abstractC24463OooO0Oo).f82732OooO0o) : abstractC24463OooO0Oo instanceof OooOo.OooO0OO ? o000oooo2.get(((OooOo.OooO0OO) abstractC24463OooO0Oo).f82696OooO0o) : null);
                    it2 = it3;
                }
                Iterator<T> it4 = list2.iterator();
                Iterator it5 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(C34428OooOOo.OooOOoo(list2, 10), C34428OooOOo.OooOOoo(arrayList, 10)));
                while (it4.hasNext() && it5.hasNext()) {
                    Object next2 = it4.next();
                    Bitmap bitmap = (Bitmap) it5.next();
                    OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo2 = (OooOo.AbstractC24463OooO0Oo) next2;
                    if (bitmap == null) {
                        it = it5;
                        bitmapShader = null;
                    } else {
                        it = it5;
                        if (abstractC24463OooO0Oo2 instanceof OooOo.C24465OooO0o0) {
                            OooOo.C24465OooO0o0 c24465OooO0o0 = (OooOo.C24465OooO0o0) abstractC24463OooO0Oo2;
                            bitmapShader = new BitmapShader(bitmap, C24516OooO0O0.OooO00o(c24465OooO0o0.f82738OooOOO), C24516OooO0O0.OooO00o(c24465OooO0o0.f82740OooOOOO));
                        } else {
                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        }
                    }
                    arrayList2.add(bitmapShader);
                    it5 = it;
                }
                Iterator it6 = arrayList2.iterator();
                if (it6.hasNext()) {
                    int i2 = 1;
                    next = it6.next();
                    while (it6.hasNext()) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C34429OooOOo0.OooOOo();
                            throw null;
                        }
                        Iterator it7 = it6;
                        Shader shader = (Shader) it6.next();
                        Shader shader2 = (Shader) next;
                        Shader composeShader = shader2;
                        if (shader2 == null) {
                            composeShader = shader;
                        } else {
                            if (shader != null) {
                                i = i3;
                                OooOo.AbstractC24463OooO0Oo.OooO0O0 oooO0O02 = list.get(i2 - 1).f82705OooO0O0;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0O02, str3);
                                str2 = str3;
                                if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82710OooO0OO)) {
                                    mode2 = PorterDuff.Mode.MULTIPLY;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82711OooO0Oo)) {
                                    mode2 = PorterDuff.Mode.DST_IN;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82713OooO0o0)) {
                                    mode2 = PorterDuff.Mode.DST_OUT;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82712OooO0o)) {
                                    mode2 = PorterDuff.Mode.SRC_ATOP;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82714OooO0oO)) {
                                    mode2 = PorterDuff.Mode.SRC_IN;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82715OooO0oo)) {
                                    mode2 = PorterDuff.Mode.SRC_OVER;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82708OooO)) {
                                    mode2 = PorterDuff.Mode.DST_OVER;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82716OooOO0)) {
                                    mode2 = PorterDuff.Mode.SRC;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82717OooOO0O)) {
                                    mode2 = PorterDuff.Mode.DST;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82718OooOO0o)) {
                                    mode2 = PorterDuff.Mode.SRC_OUT;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82720OooOOO0)) {
                                    mode2 = PorterDuff.Mode.DST_ATOP;
                                } else if (oooO0O02.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82719OooOOO)) {
                                    mode2 = PorterDuff.Mode.XOR;
                                } else {
                                    Log.e("BlendModeConversion", "Unsupported BlendMode: " + oooO0O02 + ". Using PorterDuff.Mode.MULTIPLY instead.");
                                    mode2 = PorterDuff.Mode.MULTIPLY;
                                }
                                composeShader = new ComposeShader(shader, shader2, mode2);
                            }
                            str3 = str2;
                            it6 = it7;
                            i2 = i;
                            next = composeShader;
                        }
                        str2 = str3;
                        i = i3;
                        str3 = str2;
                        it6 = it7;
                        i2 = i;
                        next = composeShader;
                    }
                } else {
                    next = null;
                }
                str = str3;
                paint.setShader((Shader) next);
                OooO0OO oooO0OO2 = paint.getShader() != null ? new OooO0OO(list, arrayList, arrayList2) : null;
                if (!this.f82912OooO0OO || paint.getShader() == null) {
                    c19621OooO00o = null;
                } else {
                    c19621OooO00o = new C19621OooO00o();
                    c19621OooO00o.f82914OooO00o = C24495OooO00o.f82814OooO0OO;
                }
                oooO0O0 = new OooO0O0(paint, oooO0OO2, c19621OooO00o);
            }
            weakHashMap.put(brushPaint, oooO0O0);
        } else {
            str = "<this>";
            matrix2 = null;
        }
        OooO0O0 oooO0O03 = oooO0O0;
        OooO0OO oooO0OO3 = oooO0O03.f82916OooO0O0;
        if (oooO0OO3 != null) {
            List<OooOo.AbstractC24463OooO0Oo> list3 = oooO0OO3.f82918OooO00o;
            int size = list3.size();
            int i4 = 0;
            while (i4 < size) {
                Shader shader3 = (Shader) oooO0OO3.f82920OooO0OO.get(i4);
                if (shader3 == null) {
                    oooO0OO = oooO0OO3;
                } else {
                    OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo3 = list3.get(i4);
                    Object obj = oooO0OO3.f82919OooO0O0.get(i4);
                    if (obj == null) {
                        throw new IllegalStateException(C20856OooooOo.OooO0O0("bitmap[", i4, "] should be non-null if bitmapShaders[", "] is non-null.", i4).toString());
                    }
                    Bitmap bitmap2 = (Bitmap) obj;
                    Matrix matrix3 = oooO0OO3.f82921OooO0Oo;
                    matrix3.reset();
                    if (matrix != null) {
                        matrix3.preConcat(matrix);
                    }
                    if (abstractC24463OooO0Oo3 instanceof OooOo.C24465OooO0o0) {
                        OooOo.C24465OooO0o0 c24465OooO0o02 = (OooOo.C24465OooO0o0) abstractC24463OooO0Oo3;
                        OooOo.C24465OooO0o0.OooO00o oooO00o = c24465OooO0o02.f82739OooOOO0;
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o, OooOo.C24465OooO0o0.OooO00o.f82742OooO0OO)) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o, OooOo.C24465OooO0o0.OooO00o.f82743OooO0Oo)) {
                                matrix3.preTranslate(firstInput.f65490OooO00o, firstInput.f65491OooO0O0);
                            } else {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o, OooOo.C24465OooO0o0.OooO00o.f82744OooO0o0)) {
                                    oooO0OO = oooO0OO3;
                                    matrix3.preTranslate(lastInput.f65490OooO00o, lastInput.f65491OooO0O0);
                                }
                                c19617OooO0Oo = OooOo.AbstractC24463OooO0Oo.C19617OooO0Oo.f82723OooO0OO;
                                c19617OooO0Oo2 = c24465OooO0o02.f82737OooOO0o;
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c19617OooO0Oo2, c19617OooO0Oo)) {
                                    kotlin.jvm.internal.OooOOO0.OooO0O0(c19617OooO0Oo2, OooOo.AbstractC24463OooO0Oo.C19617OooO0Oo.f82724OooO0Oo);
                                } else {
                                    matrix3.preScale(f, f);
                                }
                                matrix3.preScale(c24465OooO0o02.f82733OooO0oO, c24465OooO0o02.f82734OooO0oo);
                                matrix3.preRotate(c24465OooO0o02.f82736OooOO0O, 0.5f, 0.5f);
                                matrix3.preTranslate(c24465OooO0o02.f82731OooO, c24465OooO0o02.f82735OooOO0);
                            }
                        }
                        oooO0OO = oooO0OO3;
                        c19617OooO0Oo = OooOo.AbstractC24463OooO0Oo.C19617OooO0Oo.f82723OooO0OO;
                        c19617OooO0Oo2 = c24465OooO0o02.f82737OooOO0o;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c19617OooO0Oo2, c19617OooO0Oo)) {
                        }
                        matrix3.preScale(c24465OooO0o02.f82733OooO0oO, c24465OooO0o02.f82734OooO0oo);
                        matrix3.preRotate(c24465OooO0o02.f82736OooOO0O, 0.5f, 0.5f);
                        matrix3.preTranslate(c24465OooO0o02.f82731OooO, c24465OooO0o02.f82735OooOO0);
                    } else {
                        oooO0OO = oooO0OO3;
                        boolean z2 = abstractC24463OooO0Oo3 instanceof OooOo.OooO0OO;
                    }
                    matrix3.preScale(1.0f / bitmap2.getWidth(), 1.0f / bitmap2.getHeight());
                    if (matrix3.equals(f82909OooO0o0)) {
                        matrix3 = matrix2;
                    }
                    shader3.setLocalMatrix(matrix3);
                }
                i4++;
                oooO0OO3 = oooO0OO;
            }
        }
        Paint paint2 = oooO0O03.f82915OooO00o;
        C19621OooO00o c19621OooO00o2 = oooO0O03.f82917OooO0OO;
        if (c19621OooO00o2 == null) {
            j2 = j;
        } else if (paint2.getColorFilter() != null) {
            long j3 = c19621OooO00o2.f82914OooO00o;
            int i5 = C24495OooO00o.f82815OooO0Oo;
            if (j3 != j) {
                Object objOoooOo0 = oOo000Oo.OooOo.OoooOo0(list);
                if (objOoooOo0 == null) {
                    throw new IllegalArgumentException("Paint.colorFilter should only be used when Paint.shader is set, which should only happen when there is at least one item in BrushPaint.textureLayers.");
                }
                OooOo.AbstractC24463OooO0Oo.OooO0O0 oooO0O04 = ((OooOo.AbstractC24463OooO0Oo) objOoooOo0).f82705OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0O04, str);
                if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82710OooO0OO)) {
                    mode = PorterDuff.Mode.MULTIPLY;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82711OooO0Oo)) {
                    mode = PorterDuff.Mode.SRC_IN;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82713OooO0o0)) {
                    mode = PorterDuff.Mode.SRC_OUT;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82712OooO0o)) {
                    mode = PorterDuff.Mode.DST_ATOP;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82714OooO0oO)) {
                    mode = PorterDuff.Mode.DST_IN;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82715OooO0oo)) {
                    mode = PorterDuff.Mode.DST_OVER;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82708OooO)) {
                    mode = PorterDuff.Mode.SRC_OVER;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82716OooOO0)) {
                    mode = PorterDuff.Mode.DST;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82717OooOO0O)) {
                    mode = PorterDuff.Mode.SRC;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82718OooOO0o)) {
                    mode = PorterDuff.Mode.DST_OUT;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82720OooOOO0)) {
                    mode = PorterDuff.Mode.SRC_ATOP;
                } else if (oooO0O04.equals(OooOo.AbstractC24463OooO0Oo.OooO0O0.f82719OooOOO)) {
                    mode = PorterDuff.Mode.XOR;
                } else {
                    Log.e("BlendModeConversion", "Unsupported TextureBlendMode: " + oooO0O04 + ". Using PorterDuff.Mode.MULTIPLY instead.");
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                paint2.setColorFilter(new PorterDuffColorFilter((int) (C24495OooO00o.OooO00o(j, C24498OooO0o0.f82834OooO0o0) >>> 32), mode));
                c19621OooO00o2.f82914OooO00o = j;
            }
            j2 = C24495OooO00o.f82813OooO0O0;
        }
        if (Build.VERSION.SDK_INT < 29) {
            paint2.setColor((int) (C24495OooO00o.OooO00o(j2, C24498OooO0o0.f82834OooO0o0) >>> 32));
            return paint2;
        }
        paint2.setColor(j2);
        return paint2;
    }
}
