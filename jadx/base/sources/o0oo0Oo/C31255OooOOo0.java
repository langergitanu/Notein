package o0oo0Oo;

import Oooo0.C20860Ooooooo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.pencil.PencilTextureCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0O0oOOO.C26121OooO0o0;
import o0O0oOo0.C26147OooO0O0;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo0Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31255OooOOo0<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Paint f111554OooOo;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111555OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f111556OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111557OooOOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final PencilTextureCache.TexturePair f111561OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f111558OooOOoo = 1.0f;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooO00o f111560OooOo00 = OooO00o.f111564OooOo0o;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final PointF f111559OooOo0 = new PointF();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f111562OooOo0o = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: o0oo0Oo.OooOOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f111563OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f111564OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f111565OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f111566OooOoO0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                o0oo0Oo.OooOOo0$OooO00o r0 = new o0oo0Oo.OooOOo0$OooO00o
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                o0oo0Oo.C31255OooOOo0.OooO00o.f111564OooOo0o = r0
                o0oo0Oo.OooOOo0$OooO00o r1 = new o0oo0Oo.OooOOo0$OooO00o
                java.lang.String r2 = "DRAWING"
                r3 = 1
                r1.<init>(r2, r3)
                o0oo0Oo.C31255OooOOo0.OooO00o.f111563OooOo = r1
                o0oo0Oo.OooOOo0$OooO00o r2 = new o0oo0Oo.OooOOo0$OooO00o
                java.lang.String r3 = "FINISHED"
                r4 = 2
                r2.<init>(r3, r4)
                o0oo0Oo.C31255OooOOo0.OooO00o.f111566OooOoO0 = r2
                o0oo0Oo.OooOOo0$OooO00o[] r0 = new o0oo0Oo.C31255OooOOo0.OooO00o[]{r0, r1, r2}
                o0oo0Oo.C31255OooOOo0.OooO00o.f111565OooOoO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0oo0Oo.C31255OooOOo0.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f111565OooOoO.clone();
        }
    }

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        f111554OooOo = paint;
    }

    public C31255OooOOo0(int i, float f, o0O0oo00.OooO00o oooO00o) {
        this.f111555OooOOOo = oooO00o;
        this.f111557OooOOo0 = f;
        this.f111556OooOOo = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 0, false, 24);
        this.f111561OooOo0O = PencilTextureCache.INSTANCE.getOrCreatePencilTexture(16, 16, 567L, i);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        int i2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, displayItems);
        PointF pointF = this.f111559OooOo0;
        ArrayList arrayList = this.f111562OooOo0o;
        if (i == 0) {
            this.f111560OooOo00 = OooO00o.f111563OooOo;
            arrayList.clear();
            pointF.set(f, f2);
            arrayList.add(new C31264OooOoOO(f, f2, ((float) Math.random()) * 360.0f, Math.max(f3, 0.5f)));
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        int i3 = 1;
        if (i == 1) {
            this.f111560OooOo00 = OooO00o.f111566OooOoO0;
            return new DrawResult(3, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
        }
        if (i != 2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o, "InkPencilLegacy", "Unknown action: ", i), new Object[0]);
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        float f4 = f - pointF.x;
        float f5 = f2 - pointF.y;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
        if (fSqrt > 0.0f && (i2 = (int) (fSqrt / ((this.f111557OooOOo0 * this.f111558OooOOoo) / 6))) >= 1) {
            if (1 <= i2) {
                while (true) {
                    float f6 = i3 / i2;
                    ArrayList arrayList2 = arrayList;
                    float f7 = f4;
                    arrayList2.add(new C31264OooOoOO((f4 * f6) + pointF.x, (f6 * f5) + pointF.y, ((float) Math.random()) * 360.0f, Math.max(f3, 0.5f)));
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                    f4 = f7;
                    arrayList = arrayList2;
                }
            }
            pointF.set(f, f2);
        }
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111556OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111558OooOOoo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 10;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111557OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) throws Throwable {
        ArrayList arrayList;
        float f;
        Bitmap bitmap;
        Bitmap softwareBitmap;
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (z && this.f111560OooOo00 != OooO00o.f111563OooOo) {
            return;
        }
        o0O0oo00.OooO00o<T> oooO00o = this.f111555OooOOOo;
        oooO00o.OooOo00(target);
        ArrayList<C31264OooOoOO> arrayList2 = this.f111562OooOo0o;
        float f2 = this.f111557OooOOo0;
        PencilTextureCache.TexturePair texturePair = this.f111561OooOo0O;
        int i = 1;
        if (texturePair == null) {
            arrayList = arrayList2;
            f = f2;
        } else {
            if (target instanceof C26121OooO0o0) {
                C26121OooO0o0 c26121OooO0o0 = (C26121OooO0o0) target;
                RectF rectF = new RectF(c26121OooO0o0.OooO0OO().getClipBounds());
                if (!c26121OooO0o0.OooO0OO().isHardwareAccelerated() || (softwareBitmap = texturePair.getHardwareBitmap()) == null) {
                    softwareBitmap = texturePair.getSoftwareBitmap();
                }
                RectF rectF2 = new RectF();
                for (C31264OooOoOO c31264OooOoOO : arrayList2) {
                    float f3 = ((this.f111558OooOOoo * f2) * c31264OooOoOO.f111616OooO0Oo) / 2;
                    float f4 = c31264OooOoOO.f111613OooO00o;
                    float f5 = c31264OooOoOO.f111614OooO0O0;
                    rectF2.set(f4 - f3, f5 - f3, f4 + f3, f5 + f3);
                    if (RectF.intersects(rectF, rectF2)) {
                        oooO00o.OooOo0o(softwareBitmap, rectF2, c31264OooOoOO.f111615OooO0OO);
                    }
                }
            } else if (target instanceof C26147OooO0O0) {
                Bitmap softwareBitmap2 = texturePair.getSoftwareBitmap();
                RectF rectF3 = new RectF();
                for (C31264OooOoOO c31264OooOoOO2 : arrayList2) {
                    float f6 = ((this.f111558OooOOoo * f2) * c31264OooOoOO2.f111616OooO0Oo) / 2;
                    boolean zIsEmpty = rectF3.isEmpty();
                    float f7 = c31264OooOoOO2.f111614OooO0O0;
                    float f8 = c31264OooOoOO2.f111613OooO00o;
                    if (zIsEmpty) {
                        rectF3.set(f8 - f6, f7 - f6, f8 + f6, f7 + f6);
                    } else {
                        rectF3.union(f8 - f6, f7 - f6, f8 + f6, f7 + f6);
                    }
                }
                float f9 = 512.0f;
                int iCeil = (int) Math.ceil(rectF3.width() / 512.0f);
                int iCeil2 = (int) Math.ceil(rectF3.height() / 512.0f);
                int i2 = 0;
                while (i2 < iCeil2) {
                    int i3 = 0;
                    while (i3 < iCeil) {
                        float f10 = rectF3.left;
                        float f11 = f9;
                        i3++;
                        ArrayList arrayList3 = arrayList2;
                        float f12 = i;
                        RectF rectF4 = new RectF((i3 * f11) + f10, (i2 * f11) + rectF3.top, Math.min((i3 * f11) + f10, rectF3.right + f12), Math.min(((i2 + 1) * f11) + rectF3.top, rectF3.bottom + f12));
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            C31264OooOoOO c31264OooOoOO3 = (C31264OooOoOO) next;
                            float f13 = f2;
                            float f14 = ((this.f111558OooOOoo * f2) * c31264OooOoOO3.f111616OooO0Oo) / 2;
                            float f15 = c31264OooOoOO3.f111613OooO00o;
                            RectF rectF5 = rectF3;
                            float f16 = c31264OooOoOO3.f111614OooO0O0;
                            Iterator it2 = it;
                            if (RectF.intersects(rectF4, new RectF(f15 - f14, f16 - f14, f15 + f14, f16 + f14))) {
                                arrayList4.add(next);
                            }
                            f2 = f13;
                            rectF3 = rectF5;
                            it = it2;
                        }
                        float f17 = f2;
                        RectF rectF6 = rectF3;
                        if (!arrayList4.isEmpty()) {
                            try {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, ((int) rectF4.width()) * 4), Math.max(1, ((int) rectF4.height()) * 4), Bitmap.Config.ARGB_8888);
                                try {
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    RectF rectF7 = new RectF();
                                    Iterator it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        C31264OooOoOO c31264OooOoOO4 = (C31264OooOoOO) it3.next();
                                        float f18 = ((this.f111558OooOOoo * f17) * c31264OooOoOO4.f111616OooO0Oo) / 2;
                                        float f19 = c31264OooOoOO4.f111613OooO00o;
                                        Iterator it4 = it3;
                                        float f20 = rectF4.left;
                                        float f21 = (f19 - f18) - f20;
                                        float f22 = c31264OooOoOO4.f111614OooO0O0;
                                        float f23 = f22 - f18;
                                        float f24 = rectF4.top;
                                        rectF7.set(f21, f23 - f24, (f19 + f18) - f20, (f22 + f18) - f24);
                                        o00OO0O0.OooO0O0.OooOO0O(rectF7, 4.0f);
                                        float f25 = c31264OooOoOO4.f111615OooO0OO;
                                        float fCenterX = rectF7.centerX();
                                        float fCenterY = rectF7.centerY();
                                        int iSave = canvas.save();
                                        canvas.rotate(f25, fCenterX, fCenterY);
                                        try {
                                            canvas.drawBitmap(softwareBitmap2, (Rect) null, rectF7, f111554OooOo);
                                            canvas.restoreToCount(iSave);
                                            it3 = it4;
                                        } catch (Throwable th) {
                                            canvas.restoreToCount(iSave);
                                            throw th;
                                        }
                                    }
                                    canvas.setBitmap(null);
                                    oooO00o.OooOo0o(bitmapCreateBitmap, rectF4, 0.0f);
                                    bitmapCreateBitmap.recycle();
                                } catch (Throwable th2) {
                                    th = th2;
                                    bitmap = bitmapCreateBitmap;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bitmap = null;
                            }
                        }
                        f9 = f11;
                        arrayList2 = arrayList3;
                        f2 = f17;
                        rectF3 = rectF6;
                        i = 1;
                    }
                    i2++;
                    i = 1;
                }
            } else {
                arrayList = arrayList2;
                f = f2;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("InkPencilLegacy");
                c20358OooO00o.OooOO0O("Unsupported render target: ".concat(target.getClass().getSimpleName()), new Object[0]);
            }
            arrayList = arrayList2;
            f = f2;
        }
        if (!this.f111415OooO0O0 || this.f111422OooOO0 || this.f111560OooOo00 != OooO00o.f111563OooOo) {
            return;
        }
        RectF rectF8 = new RectF();
        C31264OooOoOO c31264OooOoOO5 = (C31264OooOoOO) oOo000Oo.OooOo.OoooOo0(arrayList);
        if (c31264OooOoOO5 == null) {
            return;
        }
        float f26 = this.f111416OooO0OO - c31264OooOoOO5.f111613OooO00o;
        float f27 = this.f111417OooO0Oo - c31264OooOoOO5.f111614OooO0O0;
        float fSqrt = (float) Math.sqrt((f27 * f27) + (f26 * f26));
        if (fSqrt <= 0.0f) {
            return;
        }
        int i4 = (int) (fSqrt / ((this.f111558OooOOoo * f) / 6));
        int i5 = 1;
        if (i4 < 1 || 1 > i4) {
            return;
        }
        while (true) {
            float f28 = i5 / i4;
            PointF pointF = this.f111559OooOo0;
            float f29 = (f26 * f28) + pointF.x;
            float f30 = (f28 * f27) + pointF.y;
            float f31 = ((this.f111558OooOOoo * f) * c31264OooOoOO5.f111616OooO0Oo) / 2;
            rectF8.set(f29 - f31, f30 - f31, f29 + f31, f30 + f31);
            if (i5 == i4) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111555OooOOOo.reset();
        this.f111560OooOo00 = OooO00o.f111564OooOo0o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111558OooOOoo = f;
    }
}
