package com.orion.notein.p607ui.noteeditor.shapeeditor;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.aspose.slides.C22234OoooOo0;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesAnchorEditor;
import com.orion.penkit.models.AnchorAssistAware;
import com.orion.penkit.models.AnchorAssistLine;
import com.orion.penkit.models.AnchorAssistLinePainter;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00OO0O0.OooO0O0;
import o00o0o0o.C25446OooO0Oo;
import o00oo0Oo.C25689OooO0o;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0OoO000.C28597o00oO0o;
import o0OoO000.oo000o;
import o0o000O0.C29742OooO0oO;
import o0o000O0.C29743OooO0oo;
import o0o000O0.OooO0o;
import oO00ooO.C32447OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001(J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR,\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006.²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020)8\nX\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/shapeeditor/ShapesAnchorEditor;", "Lcom/orion/notein/ui/noteeditor/shapeeditor/AbstractShapeEditor;", "", "mode", "LoO00ooO/OooOooO;", "setAnchorEditMode", "(Z)V", "", "Lcom/orion/penkit/models/ShapeInfo;", "getItems", "()Ljava/util/List;", "Lcom/orion/penkit/models/LassoParams;", "lassoParams", "setLassoParams", "(Lcom/orion/penkit/models/LassoParams;)V", "", "Lcom/orion/penkit/models/AnchorAssistLine;", "Oooo00O", "Ljava/util/Set;", "getCurrentAssistLines", "()Ljava/util/Set;", "setCurrentAssistLines", "(Ljava/util/Set;)V", "currentAssistLines", "value", "Oooo0o", "Lcom/orion/penkit/models/LassoParams;", "getLassoParams", "()Lcom/orion/penkit/models/LassoParams;", "Landroid/graphics/Path;", "Oooo0oo", "LoO00ooO/OooOO0;", "getLassoPath", "()Landroid/graphics/Path;", "lassoPath", "Landroid/graphics/PointF;", "Oooo", "getLassoStartPointF", "()Landroid/graphics/PointF;", "lassoStartPointF", "OooO00o", "", "dx", "dy", "isOnVerticalLine", "isOnHorizontalLine", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ShapesAnchorEditor extends AbstractShapeEditor {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final /* synthetic */ int f76279OoooO00 = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f76280OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f76281OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f76282OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f76283OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C26120OooO0Oo f76284OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f76285OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Paint f76286OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C32447OooOOo f76287Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public OooO00o f76288Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Paint f76289Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public Set<? extends AnchorAssistLine<?>> currentAssistLines;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f76291Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public List<ShapeInfo> f76292Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final PointF f76293Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public LassoParams lassoParams;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final float f76295Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Paint f76296Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C32447OooOOo f76297Oooo0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f76298OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PointF f76299OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ShapeInfo f76300OooO0OO;

        public OooO00o(int i, PointF pointF, ShapeInfo shapeInfo) {
            this.f76298OooO00o = i;
            this.f76299OooO0O0 = pointF;
            this.f76300OooO0OO = shapeInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f76298OooO00o == oooO00o.f76298OooO00o && OooOOO0.OooO0O0(this.f76299OooO0O0, oooO00o.f76299OooO0O0) && OooOOO0.OooO0O0(this.f76300OooO0OO, oooO00o.f76300OooO0OO);
        }

        public final int hashCode() {
            return this.f76300OooO0OO.hashCode() + ((this.f76299OooO0O0.hashCode() + (Integer.hashCode(this.f76298OooO00o) * 31)) * 31);
        }

        public final String toString() {
            return "Anchor(index=" + this.f76298OooO00o + ", pos=" + this.f76299OooO0O0 + ", info=" + this.f76300OooO0OO + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShapesAnchorEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76280OooOoO = new ArrayList();
        this.f76282OooOoOO = 1.0f;
        this.f76284OooOoo0 = new C26120OooO0Oo();
        this.f76285OooOooO = true;
        Paint paintOooO00o = C22234OoooOo0.OooO00o(true, true);
        Paint.Style style = Paint.Style.FILL;
        paintOooO00o.setStyle(style);
        paintOooO00o.setColor(-1);
        this.f76286OooOooo = paintOooO00o;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(style);
        paint.setColor(Color.parseColor("#007AFF"));
        this.f76289Oooo000 = paint;
        this.currentAssistLines = C34438OooOoo0.f123458OooOo0o;
        if (Build.VERSION.SDK_INT <= 27) {
            setLayerType(1, null);
        }
        this.f76292Oooo0O0 = C34434OooOoO.f123453OooOo0o;
        this.f76293Oooo0OO = new PointF();
        this.f76295Oooo0o0 = 4.0f;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(Color.parseColor("#007AFF"));
        paint2.setStrokeWidth(o000000O.OooO0o0(1.5f));
        paint2.setPathEffect(new DashPathEffect(new float[]{o000000O.OooO0o0(4.0f), o000000O.OooO0o0(4.0f)}, 0.0f));
        this.f76296Oooo0oO = paint2;
        this.f76297Oooo0oo = C20519OooO0Oo.OooO0OO(new C29742OooO0oO());
        this.f76287Oooo = C20519OooO0Oo.OooO0OO(new C29743OooO0oo());
    }

    public static final float OooO0Oo(float f, ShapesAnchorEditor shapesAnchorEditor) {
        AnchorAssistAware.Companion companion = AnchorAssistAware.INSTANCE;
        if (companion.getEnableAssistLine() && companion.getEnableAssistLineMagneticAttraction() && Math.abs(f) < shapesAnchorEditor.f76295Oooo0o0) {
            return 0.0f;
        }
        return f;
    }

    public static final void OooO0o(PointF pointF, C32447OooOOo c32447OooOOo, C32447OooOOo c32447OooOOo2, ShapesAnchorEditor shapesAnchorEditor, float f, float f2) {
        if (((Boolean) c32447OooOOo.getValue()).booleanValue() && OooO0o0(c32447OooOOo2)) {
            pointF.offset(OooO0Oo(f, shapesAnchorEditor), OooO0Oo(f2, shapesAnchorEditor));
            return;
        }
        if (((Boolean) c32447OooOOo.getValue()).booleanValue()) {
            pointF.offset(OooO0Oo(f, shapesAnchorEditor), f2);
        } else if (OooO0o0(c32447OooOOo2)) {
            pointF.offset(f, OooO0Oo(f2, shapesAnchorEditor));
        } else {
            pointF.offset(f, f2);
        }
    }

    public static final boolean OooO0o0(C32447OooOOo c32447OooOOo) {
        return ((Boolean) c32447OooOOo.getValue()).booleanValue();
    }

    private final Path getLassoPath() {
        return (Path) this.f76297Oooo0oo.getValue();
    }

    private final PointF getLassoStartPointF() {
        return (PointF) this.f76287Oooo.getValue();
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public final void OooO00o(float f, float f2) {
        Collection arrayList;
        ArrayList arrayList2 = this.f76281OooOoO0;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((ShapeInfo) it.next()).offset(f, f2);
            }
        }
        this.f76280OooOoO.clear();
        ArrayList<ShapeInfo> arrayList3 = this.f76281OooOoO0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            for (ShapeInfo shapeInfo : arrayList3) {
                List<PointF> anchorPoints = shapeInfo.getAnchorPoints();
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(anchorPoints, 10));
                int i = 0;
                for (Object obj : anchorPoints) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    PointF pointF = (PointF) obj;
                    arrayList4.add(new OooO00o(i, new PointF(pointF.x, pointF.y), shapeInfo));
                    i = i2;
                }
                C34431OooOo0.OooOo0o(arrayList, arrayList4);
            }
        } else {
            arrayList = C34434OooOoO.f123453OooOo0o;
        }
        this.f76280OooOoO.addAll(arrayList);
        this.f76283OooOoo = true;
        invalidate();
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public final void OooO0O0(List<ShapeInfo> list, RectF rectF, float f, boolean z) {
        this.f76283OooOoo = false;
        this.f76280OooOoO.clear();
        setTranslationX(rectF.left);
        setTranslationY(rectF.top);
        this.f76282OooOoOO = f;
        this.f76285OooOooO = z;
        ArrayList arrayList = new ArrayList();
        for (ShapeInfo shapeInfo : list) {
            List<PointF> anchorPoints = shapeInfo.getAnchorPoints();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(anchorPoints, 10));
            int i = 0;
            for (Object obj : anchorPoints) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                PointF pointF = (PointF) obj;
                arrayList2.add(new OooO00o(i, new PointF(pointF.x + rectF.left, pointF.y + rectF.top), shapeInfo));
                i = i2;
            }
            C34431OooOo0.OooOo0o(arrayList, arrayList2);
        }
        this.f76281OooOoO0 = (ArrayList) list;
        this.f76280OooOoO.addAll(arrayList);
        int iWidth = (int) rectF.width();
        int iHeight = (int) rectF.height();
        OooO0o eventListener = getEventListener();
        if (eventListener != null) {
            eventListener.OooO0O0(iWidth, iHeight);
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public final void OooO0OO(float f, float f2) {
        setTranslationX(f);
        setTranslationY(f2);
        setVisibility(0);
        requestFocus();
        invalidate();
    }

    public final Set<AnchorAssistLine<?>> getCurrentAssistLines() {
        return this.currentAssistLines;
    }

    @Override // com.orion.notein.p607ui.noteeditor.shapeeditor.AbstractShapeEditor
    public List<ShapeInfo> getItems() {
        ArrayList arrayList = this.f76281OooOoO0;
        return arrayList == null ? C34434OooOoO.f123453OooOo0o : arrayList;
    }

    public final LassoParams getLassoParams() {
        return this.lassoParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        Context context = getContext();
        float f = this.f76282OooOoOO;
        C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, context, f, f);
        c26121OooO0o0.f89175OooO0OO = getColorInversion();
        c26121OooO0o0.f89176OooO0Oo = true;
        C26120OooO0Oo c26120OooO0Oo = this.f76284OooOoo0;
        c26120OooO0Oo.OooOo00(c26121OooO0o0);
        c26120OooO0Oo.OooO0oO(this.f76282OooOoOO);
        ArrayList<ShapeInfo> arrayList = this.f76281OooOoO0;
        if (arrayList != null) {
            for (ShapeInfo shapeInfo : arrayList) {
                if (this.f76285OooOooO) {
                    shapeInfo.render(c26120OooO0Oo, c26121OooO0o0, this.f76282OooOoOO);
                } else {
                    shapeInfo.render(c26120OooO0Oo, c26121OooO0o0, 1.0f);
                }
                if (this.f76283OooOoo && this.f76291Oooo00o) {
                    ArrayList arrayList2 = this.f76280OooOoO;
                    ArrayList<PointF> arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((OooO00o) it.next()).f76299OooO0O0);
                    }
                    for (PointF pointF : arrayList3) {
                        canvas.drawCircle(pointF.x, pointF.y, o000000O.OooO0o0(5.0f), this.f76286OooOooo);
                        canvas.drawCircle(pointF.x, pointF.y, o000000O.OooO0o0(4.0f), this.f76289Oooo000);
                    }
                }
            }
        }
        AnchorAssistAware<?, ?> anchorAssistAware = (AnchorAssistAware) OooOo.o0OoOo0(this.f76292Oooo0O0);
        if (anchorAssistAware != null) {
            AnchorAssistLinePainter.INSTANCE.drawTypedRect(anchorAssistAware, canvas);
        }
        LassoParams lassoParams = this.lassoParams;
        if (lassoParams != null) {
            List<PointF> polygonBorder = lassoParams.getPolygonBorder();
            Paint paint = this.f76296Oooo0oO;
            if (polygonBorder == null) {
                LassoParams lassoParams2 = this.lassoParams;
                OooOOO0.OooO0Oo(lassoParams2);
                canvas.drawRect(lassoParams2.getBorder(), paint);
                return;
            }
            getLassoPath().reset();
            getLassoStartPointF().set(0.0f, 0.0f);
            Path lassoPath = getLassoPath();
            PointF lassoStartPointF = getLassoStartPointF();
            int i = 0;
            for (Object obj : polygonBorder) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                PointF pointF2 = (PointF) obj;
                if (i == 0) {
                    lassoStartPointF.set(pointF2.x, pointF2.y);
                    lassoPath.moveTo(pointF2.x, pointF2.y);
                } else {
                    lassoPath.lineTo(pointF2.x, pointF2.y);
                }
                if (i == polygonBorder.size() - 1) {
                    lassoPath.lineTo(lassoStartPointF.x, lassoStartPointF.y);
                }
                i = i2;
            }
            canvas.drawPath(lassoPath, paint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.orion.penkit.models.ShapeInfo>, oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.orion.penkit.models.ShapeInfo>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.orion.penkit.models.ShapeInfo>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.orion.penkit.models.ShapeInfo] */
    @Override // android.view.View
    public final boolean onTouchEvent(final MotionEvent event) {
        Object next;
        ShapeInfo shapeInfo;
        Object next2;
        LassoParams lassoParamsCopy$default;
        OooOOO0.OooO0oO(event, "event");
        if (!this.f76283OooOoo) {
            return false;
        }
        int action = event.getAction();
        PointF pointF = this.f76293Oooo0OO;
        ?? arrayList = C34434OooOoO.f123453OooOo0o;
        if (action == 0) {
            pointF.set(event.getX(), event.getY());
            LassoParams lassoParams = this.lassoParams;
            if (lassoParams != null) {
                List<PointF> polygonBorder = lassoParams.getPolygonBorder();
                ?? r0 = polygonBorder;
                if (polygonBorder == null) {
                    r0 = arrayList;
                }
                if (((Collection) r0).isEmpty()) {
                    LassoParams lassoParams2 = this.lassoParams;
                    RectF border = lassoParams2 != null ? lassoParams2.getBorder() : null;
                    if (border != null) {
                        PointF pointF2 = new PointF(event.getX(), event.getY());
                        if (border.contains(pointF2.x, pointF2.y)) {
                            this.f76288Oooo0 = null;
                            ArrayList arrayList2 = this.f76281OooOoO0;
                            if (arrayList2 != null) {
                                arrayList = new ArrayList();
                                for (Object obj : arrayList2) {
                                    if (((ShapeInfo) obj).onLassoEvent(OooO0O0.OooO0o(border))) {
                                        arrayList.add(obj);
                                    }
                                }
                            }
                            this.f76292Oooo0O0 = arrayList;
                            invalidate();
                            return true;
                        }
                    }
                } else if (C25446OooO0Oo.OooO0oO(new PointF(event.getX(), event.getY()), r0)) {
                    this.f76288Oooo0 = null;
                    ArrayList arrayList3 = this.f76281OooOoO0;
                    if (arrayList3 != null) {
                        arrayList = new ArrayList();
                        for (Object obj2 : arrayList3) {
                            if (((ShapeInfo) obj2).onLassoEvent(r0)) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    this.f76292Oooo0O0 = arrayList;
                    invalidate();
                    return true;
                }
            }
            float x = event.getX();
            float y = event.getY();
            Iterator it = this.f76280OooOoO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C25446OooO0Oo.OooO0Oo(((OooO00o) next).f76299OooO0O0, new PointF(x, y)) < o000000O.OooO0o0(5.0f) * 3) {
                    break;
                }
            }
            OooO00o oooO00o = (OooO00o) next;
            if (oooO00o != null) {
                this.f76288Oooo0 = oooO00o;
                this.f76292Oooo0O0 = arrayList;
                invalidate();
                return true;
            }
            float x2 = event.getX();
            float y2 = event.getY();
            ArrayList arrayList4 = this.f76281OooOoO0;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((ShapeInfo) next2).pointInShapeArea(new PointF(x2, y2))) {
                        break;
                    }
                }
                shapeInfo = (ShapeInfo) next2;
            } else {
                shapeInfo = null;
            }
            if (shapeInfo == null) {
                this.f76292Oooo0O0 = arrayList;
                this.f76288Oooo0 = null;
                return false;
            }
            this.f76288Oooo0 = null;
            this.f76292Oooo0O0 = com.facebook.soloader.OooOo.OooO0oO(shapeInfo);
            invalidate();
            return true;
        }
        if (action == 1) {
            this.f76288Oooo0 = null;
            this.f76292Oooo0O0 = arrayList;
            OooO0o eventListener = getEventListener();
            if (eventListener != null) {
                eventListener.onFinish();
            }
        } else if (action == 2) {
            if (this.lassoParams != null && this.f76288Oooo0 != null && this.f76292Oooo0O0.isEmpty()) {
                return true;
            }
            int i = 1;
            C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C25689OooO0o(i, event, this));
            C32447OooOOo c32447OooOOoOooO0OO2 = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o000O0.OooO
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    int i2 = ShapesAnchorEditor.f76279OoooO00;
                    return Float.valueOf(event.getY() - this.f76293Oooo0OO.y);
                }
            });
            C32447OooOOo c32447OooOOoOooO0OO3 = C20519OooO0Oo.OooO0OO(new oo000o(this, i));
            C32447OooOOo c32447OooOOoOooO0OO4 = C20519OooO0Oo.OooO0OO(new C28597o00oO0o(this, 1));
            for (ShapeInfo shapeInfo2 : this.f76292Oooo0O0) {
                float fFloatValue = ((Number) c32447OooOOoOooO0OO.getValue()).floatValue();
                float fFloatValue2 = ((Number) c32447OooOOoOooO0OO2.getValue()).floatValue();
                if (((Boolean) c32447OooOOoOooO0OO3.getValue()).booleanValue() && OooO0o0(c32447OooOOoOooO0OO4)) {
                    shapeInfo2.offset(OooO0Oo(fFloatValue, this), OooO0Oo(fFloatValue2, this));
                } else if (((Boolean) c32447OooOOoOooO0OO3.getValue()).booleanValue()) {
                    shapeInfo2.offset(OooO0Oo(fFloatValue, this), fFloatValue2);
                } else if (OooO0o0(c32447OooOOoOooO0OO4)) {
                    shapeInfo2.offset(fFloatValue, OooO0Oo(fFloatValue2, this));
                } else {
                    shapeInfo2.offset(fFloatValue, fFloatValue2);
                }
                ArrayList arrayList5 = this.f76280OooOoO;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList5) {
                    if (((OooO00o) obj3).f76300OooO0OO.equals(shapeInfo2)) {
                        arrayList6.add(obj3);
                    }
                }
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    OooO0o(((OooO00o) it3.next()).f76299OooO0O0, c32447OooOOoOooO0OO3, c32447OooOOoOooO0OO4, this, ((Number) c32447OooOOoOooO0OO.getValue()).floatValue(), ((Number) c32447OooOOoOooO0OO2.getValue()).floatValue());
                }
                pointF.set(event.getX(), event.getY());
                OooO0o eventListener2 = getEventListener();
                if (eventListener2 != null) {
                    eventListener2.OooO0Oo(shapeInfo2);
                }
                invalidate();
            }
            LassoParams lassoParams3 = this.lassoParams;
            if (lassoParams3 != null) {
                if (lassoParams3.getPolygonBorder() != null) {
                    LassoParams lassoParams4 = this.lassoParams;
                    OooOOO0.OooO0Oo(lassoParams4);
                    List<PointF> polygonBorder2 = lassoParams4.getPolygonBorder();
                    OooOOO0.OooO0Oo(polygonBorder2);
                    List<PointF> list = polygonBorder2;
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        OooO0o((PointF) it4.next(), c32447OooOOoOooO0OO3, c32447OooOOoOooO0OO4, this, ((Number) c32447OooOOoOooO0OO.getValue()).floatValue(), ((Number) c32447OooOOoOooO0OO2.getValue()).floatValue());
                    }
                    LassoParams lassoParams5 = this.lassoParams;
                    OooOOO0.OooO0Oo(lassoParams5);
                    lassoParamsCopy$default = LassoParams.copy$default(lassoParams5, null, null, list, 3, null);
                } else {
                    LassoParams lassoParams6 = this.lassoParams;
                    OooOOO0.OooO0Oo(lassoParams6);
                    RectF border2 = lassoParams6.getBorder();
                    float fFloatValue3 = ((Number) c32447OooOOoOooO0OO.getValue()).floatValue();
                    float fFloatValue4 = ((Number) c32447OooOOoOooO0OO2.getValue()).floatValue();
                    if (((Boolean) c32447OooOOoOooO0OO3.getValue()).booleanValue() && OooO0o0(c32447OooOOoOooO0OO4)) {
                        border2.offset(OooO0Oo(fFloatValue3, this), OooO0Oo(fFloatValue4, this));
                    } else if (((Boolean) c32447OooOOoOooO0OO3.getValue()).booleanValue()) {
                        border2.offset(OooO0Oo(fFloatValue3, this), fFloatValue4);
                    } else if (OooO0o0(c32447OooOOoOooO0OO4)) {
                        border2.offset(fFloatValue3, OooO0Oo(fFloatValue4, this));
                    } else {
                        border2.offset(fFloatValue3, fFloatValue4);
                    }
                    LassoParams lassoParams7 = this.lassoParams;
                    OooOOO0.OooO0Oo(lassoParams7);
                    lassoParamsCopy$default = LassoParams.copy$default(lassoParams7, null, border2, null, 5, null);
                }
                this.lassoParams = lassoParamsCopy$default;
            }
            OooO00o oooO00o2 = this.f76288Oooo0;
            if (oooO00o2 != null) {
                float x3 = event.getX();
                float y3 = event.getY();
                PointF pointF3 = oooO00o2.f76299OooO0O0;
                pointF3.set(x3, y3);
                oooO00o2.f76300OooO0OO.updateAnchorPoint(oooO00o2.f76298OooO00o, pointF3);
                ArrayList<ShapeInfo> arrayList7 = this.f76281OooOoO0;
                OooOOO0.OooO0Oo(arrayList7);
                ArrayList arrayList8 = new ArrayList();
                for (ShapeInfo shapeInfo3 : arrayList7) {
                    List<PointF> anchorPoints = shapeInfo3.getAnchorPoints();
                    ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(anchorPoints, 10));
                    int i2 = 0;
                    for (Object obj4 : anchorPoints) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C34429OooOOo0.OooOOo();
                            throw null;
                        }
                        PointF pointF4 = (PointF) obj4;
                        arrayList9.add(new OooO00o(i2, new PointF(pointF4.x, pointF4.y), shapeInfo3));
                        i2 = i3;
                    }
                    C34431OooOo0.OooOo0o(arrayList8, arrayList9);
                }
                this.f76280OooOoO = OooOo.o0ooOoO(arrayList8);
                invalidate();
                return true;
            }
        }
        invalidate();
        return true;
    }

    public final void setAnchorEditMode(boolean mode) {
        this.f76291Oooo00o = mode;
    }

    public final void setCurrentAssistLines(Set<? extends AnchorAssistLine<?>> set) {
        OooOOO0.OooO0oO(set, "<set-?>");
        this.currentAssistLines = set;
    }

    public final void setLassoParams(LassoParams lassoParams) {
        this.lassoParams = lassoParams;
    }
}
