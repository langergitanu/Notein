package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.words.StyleIdentifier;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25446OooO0Oo;
import o0oo0o.InterfaceC31283OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b!\b\u0086\b\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0001vBO\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020#2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010\"\u001a\u00020#2\u0006\u0010-\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010.J\u001f\u00102\u001a\u00020#2\u0006\u0010/\u001a\u00020\b2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00104\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u00106J\u001f\u00104\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u00107J'\u00104\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u00108JW\u0010?\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010>0=2\u0006\u00109\u001a\u0002002\u0006\u0010:\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010@J\u001d\u0010C\u001a\u00020\u000f2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002000AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010(J\u0017\u0010H\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\bH\u0010(J\u0019\u0010J\u001a\u00020#2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bL\u0010\u0019J\u0010\u0010M\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bQ\u0010FJ`\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bT\u0010\u0019J\u0010\u0010U\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bU\u0010\u0017J\u001a\u0010X\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bX\u0010YJ\u001f\u0010\\\u001a\u00020#2\u0006\u0010Z\u001a\u00020\b2\u0006\u0010[\u001a\u000200H\u0002¢\u0006\u0004\b\\\u00103J\u0017\u0010^\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bH\u0002¢\u0006\u0004\b^\u0010_J/\u0010c\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\b2\u0006\u0010a\u001a\u00020\b2\u0006\u0010b\u001a\u00020\bH\u0002¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\be\u0010\u0019J\u0010\u0010f\u001a\u00020\bHÂ\u0003¢\u0006\u0004\bf\u0010\u0014J\u0010\u0010g\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bg\u0010\u0019J\u0010\u0010h\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\bh\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010iR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010i\u001a\u0004\bj\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010k\u001a\u0004\bl\u0010NR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010mR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010iR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010nR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010o\u001a\u0004\bp\u0010PR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010q\u001a\u0004\br\u0010FR(\u0010t\u001a\u0004\u0018\u00010\r2\b\u0010s\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bt\u0010o\u001a\u0004\bu\u0010P¨\u0006w"}, m80612d2 = {"Lcom/orion/penkit/models/ImageInfo;", "Lo0oo0o/OooO0O0;", "Lo0oo0o/OooO00o;", "", "id", "uri", "Landroid/graphics/RectF;", "bounds", "", "rotation", "layerId", "", C17625c.f52155b, "Landroid/graphics/Bitmap;", "bitmap", "", "fixed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;FLjava/lang/String;JLandroid/graphics/Bitmap;Z)V", "getRotation", "()F", "", "getItemType", "()I", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "penWidthScale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "dx", "dy", "offset", "(FF)V", "zoom", "(FZ)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;J)Lo0oo0o/OooO0O0;", "downCenter", "preCenter", "width", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "getClickableBound", "getFixedIconBounds", "maxDimension", "prepareHardwareBitmap", "(Ljava/lang/Integer;)V", "component2", "component3", "()Landroid/graphics/RectF;", "component7", "()Landroid/graphics/Bitmap;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;FLjava/lang/String;JLandroid/graphics/Bitmap;Z)Lcom/orion/penkit/models/ImageInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "rotationAngle", "rotationCenter", "adjustPositionForRotation", "angle", "normalizeAngle", "(F)F", "rectF", "centerX", "centerY", "rotateRectF", "(Landroid/graphics/RectF;FFF)Landroid/graphics/RectF;", "component1", "component4", "component5", "component6", "Ljava/lang/String;", "getUri", "Landroid/graphics/RectF;", "getBounds", "F", "J", "Landroid/graphics/Bitmap;", "getBitmap", "Z", "getFixed", "value", "hwBitmap", "getHwBitmap", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ImageInfo implements InterfaceC31284OooO0O0, InterfaceC31283OooO00o {
    private static final boolean DEBUG = false;
    private static final String TAG = "ImageInfo";
    private final Bitmap bitmap;
    private final RectF bounds;
    private final long creationTime;
    private final boolean fixed;
    private Bitmap hwBitmap;
    private final String id;
    private final String layerId;
    private float rotation;
    private final String uri;

    public ImageInfo(String id, String uri, RectF bounds, float f, String layerId, long j, Bitmap bitmap, boolean z) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(layerId, "layerId");
        OooOOO0.OooO0oO(bitmap, "bitmap");
        this.id = id;
        this.uri = uri;
        this.bounds = bounds;
        this.rotation = f;
        this.layerId = layerId;
        this.creationTime = j;
        this.bitmap = bitmap;
        this.fixed = z;
    }

    private final void adjustPositionForRotation(float rotationAngle, PointF rotationCenter) {
        this.bounds.set(rotateRectF(this.bounds, rotationAngle, rotationCenter.x, rotationCenter.y));
        RectF rectF = this.bounds;
        this.bounds.set(rotateRectF(rectF, -rotationAngle, rectF.centerX(), this.bounds.centerY()));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    public static /* synthetic */ ImageInfo copy$default(ImageInfo imageInfo, String str, String str2, RectF rectF, float f, String str3, long j, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = imageInfo.uri;
        }
        if ((i & 4) != 0) {
            rectF = imageInfo.bounds;
        }
        if ((i & 8) != 0) {
            f = imageInfo.rotation;
        }
        if ((i & 16) != 0) {
            str3 = imageInfo.layerId;
        }
        if ((i & 32) != 0) {
            j = imageInfo.creationTime;
        }
        if ((i & 64) != 0) {
            bitmap = imageInfo.bitmap;
        }
        if ((i & 128) != 0) {
            z = imageInfo.fixed;
        }
        long j2 = j;
        float f2 = f;
        String str4 = str3;
        RectF rectF2 = rectF;
        return imageInfo.copy(str, str2, rectF2, f2, str4, j2, bitmap, z);
    }

    private final float normalizeAngle(float angle) {
        float f = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        return ((angle % f) + f) % f;
    }

    public static /* synthetic */ void prepareHardwareBitmap$default(ImageInfo imageInfo, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        imageInfo.prepareHardwareBitmap(num);
    }

    private final RectF rotateRectF(RectF rectF, float angle, float centerX, float centerY) {
        double radians = (float) Math.toRadians(angle);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f = rectF.left;
        float fOooO0O0 = OooOO0.OooO0OO.OooO0O0(f, centerX, fCos, centerX);
        float f2 = rectF.top;
        float f3 = fOooO0O0 - ((f2 - centerY) * fSin);
        float fOooO0O02 = OooOO0.OooO0OO.OooO0O0(f2, centerY, fCos, OooOO0.OooO0OO.OooO0O0(f, centerX, fSin, centerY));
        float f4 = rectF.right;
        float fOooO0O03 = OooOO0.OooO0OO.OooO0O0(f4, centerX, fCos, centerX);
        float f5 = rectF.bottom;
        return new RectF(f3, fOooO0O02, fOooO0O03 - ((f5 - centerY) * fSin), OooOO0.OooO0OO.OooO0O0(f5, centerY, fCos, OooOO0.OooO0OO.OooO0O0(f4, centerX, fSin, centerY)));
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getFixed() {
        return this.fixed;
    }

    public final ImageInfo copy(String id, String uri, RectF bounds, float rotation, String layerId, long creationTime, Bitmap bitmap, boolean fixed) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(layerId, "layerId");
        OooOOO0.OooO0oO(bitmap, "bitmap");
        return new ImageInfo(id, uri, bounds, rotation, layerId, creationTime, bitmap, fixed);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id) {
        OooOOO0.OooO0oO(id, "id");
        return deepCopy(id, this.layerId);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean doesSupportLayer() {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) other;
        return OooOOO0.OooO0O0(this.id, imageInfo.id) && OooOOO0.OooO0O0(this.uri, imageInfo.uri) && OooOOO0.OooO0O0(this.bounds, imageInfo.bounds) && Float.compare(this.rotation, imageInfo.rotation) == 0 && OooOOO0.OooO0O0(this.layerId, imageInfo.layerId) && this.creationTime == imageInfo.creationTime && OooOOO0.OooO0O0(this.bitmap, imageInfo.bitmap) && this.fixed == imageInfo.fixed;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        List listOooO0o = o00OO0O0.OooO0O0.OooO0o(this.bounds);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0o, 10));
        Iterator it = listOooO0o.iterator();
        while (it.hasNext()) {
            arrayList.add(C25446OooO0Oo.OooOO0O((PointF) it.next(), o00OO0O0.OooO0O0.OooO0OO(this.bounds), this.rotation));
        }
        return C25446OooO0Oo.OooO0OO(arrayList);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float f) {
        return getBoundingBox(f);
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    @Override // o0oo0o.InterfaceC31283OooO00o
    public RectF getClickableBound(float scale) {
        return new RectF();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getFixed() {
        return this.fixed;
    }

    @Override // o0oo0o.InterfaceC31283OooO00o
    public RectF getFixedIconBounds(float scale) {
        int width = DrawToolFactory.INSTANCE.getFixedIconBitmap().getWidth();
        Matrix matrix = new Matrix();
        float f = width * scale;
        RectF rectF = new RectF(0.0f, 0.0f, f, f);
        RectF rectF2 = this.bounds;
        matrix.postTranslate(rectF2.right - f, rectF2.top);
        float f2 = this.rotation;
        RectF rectF3 = this.bounds;
        float f3 = 2;
        float fWidth = (rectF3.width() / f3) + rectF3.left;
        RectF rectF4 = this.bounds;
        matrix.postRotate(f2, fWidth, (rectF4.height() / f3) + rectF4.top);
        RectF rectF5 = new RectF();
        matrix.mapRect(rectF5, rectF);
        return rectF5;
    }

    public final Bitmap getHwBitmap() {
        return this.hwBitmap;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 5;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return this.layerId;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fixed) + ((this.bitmap.hashCode() + C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20509OooO0oo.OooO0OO(this.rotation, C20424OooO0Oo.OooO0OO(this.bounds, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.uri), 31), 31), 31, this.layerId), 31, this.creationTime)) * 31);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void offset(float dx, float dy) {
        this.bounds.offset(dx, dy);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> onEraserEvent(PointF downCenter, PointF preCenter, PointF center, float width, boolean pixelEraser, float scale) {
        OooOOO0.OooO0oO(downCenter, "downCenter");
        OooOOO0.OooO0oO(preCenter, "preCenter");
        OooOOO0.OooO0oO(center, "center");
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        return new C32443OooOOO<>(c34438OooOoo0, c34438OooOoo0);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean onLassoEvent(List<? extends PointF> polygon) {
        OooOOO0.OooO0oO(polygon, "polygon");
        if (this.fixed) {
            return false;
        }
        List listOooO0o = o00OO0O0.OooO0O0.OooO0o(this.bounds);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0o, 10));
        Iterator it = listOooO0o.iterator();
        while (it.hasNext()) {
            arrayList.add(C25446OooO0Oo.OooOO0O((PointF) it.next(), o00OO0O0.OooO0O0.OooO0OO(this.bounds), this.rotation));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C25446OooO0Oo.OooO0oO((PointF) it2.next(), polygon)) {
                    return true;
                }
            }
        }
        List<? extends PointF> list = polygon;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (C25446OooO0Oo.OooO0oO((PointF) it3.next(), arrayList)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void prepareHardwareBitmap(Integer maxDimension) {
        Bitmap bitmapCreateScaledBitmap;
        if (this.hwBitmap != null) {
            return;
        }
        try {
            int iMax = Math.max(this.bitmap.getWidth(), this.bitmap.getHeight());
            if (maxDimension == null || iMax <= maxDimension.intValue()) {
                bitmapCreateScaledBitmap = this.bitmap;
            } else {
                float fIntValue = maxDimension.intValue() / iMax;
                int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(this.bitmap.getWidth() * fIntValue);
                int i = 1;
                if (iOooO0O0 < 1) {
                    iOooO0O0 = 1;
                }
                int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(this.bitmap.getHeight() * fIntValue);
                if (iOooO0O02 >= 1) {
                    i = iOooO0O02;
                }
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.bitmap, iOooO0O0, i, false);
            }
            OooOOO0.OooO0Oo(bitmapCreateScaledBitmap);
            Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(Bitmap.Config.HARDWARE, false);
            this.hwBitmap = bitmapCopy;
            if (bitmapCopy != null) {
                bitmapCopy.prepareToDraw();
            }
            if (bitmapCreateScaledBitmap.equals(this.bitmap)) {
                return;
            }
            bitmapCreateScaledBitmap.recycle();
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0Oo(e, "prepareHardwareBitmap error", new Object[0]);
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        renderEngine.OooOo0o(this.bitmap, this.bounds, this.rotation);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        adjustPositionForRotation(r, center);
        this.rotation = normalizeAngle(this.rotation + r);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        o00OO0O0.OooO0O0.OooOO0O(this.bounds, zoom);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.uri;
        RectF rectF = this.bounds;
        float f = this.rotation;
        String str3 = this.layerId;
        long j = this.creationTime;
        Bitmap bitmap = this.bitmap;
        boolean z = this.fixed;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("ImageInfo(id=", str, ", uri=", str2, ", bounds=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", rotation=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", layerId=");
        OooO.OooO00o(j, str3, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(", bitmap=");
        sbOooO0O0.append(bitmap);
        sbOooO0O0.append(", fixed=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return deepCopy(id, layerId, this.creationTime);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        ImageInfo imageInfoCopy$default = copy$default(this, id, null, new RectF(bounds), 0.0f, null, 0L, null, false, 250, null);
        imageInfoCopy$default.hwBitmap = this.hwBitmap;
        return imageInfoCopy$default;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        ImageInfo imageInfoCopy$default = copy$default(this, id, null, new RectF(this.bounds), 0.0f, layerId, creationTime, null, false, 202, null);
        imageInfoCopy$default.hwBitmap = this.hwBitmap;
        return imageInfoCopy$default;
    }

    public /* synthetic */ ImageInfo(String str, String str2, RectF rectF, float f, String str3, long j, Bitmap bitmap, boolean z, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, rectF, f, (i & 16) != 0 ? LayerInfo.UNSPECIFIED_LAYER_ID : str3, (i & 32) != 0 ? System.currentTimeMillis() : j, bitmap, (i & 128) != 0 ? false : z);
    }
}
