package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31283OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0001bB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010\"\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020,H\u0016¢\u0006\u0004\b\u001c\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u00101J'\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u00102J\u001f\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u00103J\u001d\u00107\u001a\u00020,2\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020,H\u0016¢\u0006\u0004\b9\u0010:JW\u0010B\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010A0@2\u0006\u0010;\u001a\u0002052\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001b2\u0006\u0010=\u001a\u000205H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bG\u0010&J\u0017\u0010H\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bH\u0010&J\u0010\u0010I\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bI\u0010\u0010J\u0010\u0010J\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bJ\u0010\u0012J\u0012\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bK\u0010\u0012J\u0010\u0010L\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bL\u0010MJN\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bP\u0010\u0012J\u0010\u0010Q\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bQ\u0010\u0010J\u001a\u0010T\u001a\u00020,2\b\u0010S\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bX\u0010\u0012J\u0010\u0010Y\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\bY\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010ZR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b\\\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010Z\u001a\u0004\b]\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\b^\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010_\u001a\u0004\b`\u0010MR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010a¨\u0006c"}, m80612d2 = {"Lcom/orion/penkit/models/HyperLinkInfo;", "Lo0oo0o/OooO0O0;", "Lo0oo0o/OooO00o;", "", "id", "", C18437z2.f56754h, FirebaseAnalytics.Param.DESTINATION, "extras", "Landroid/graphics/RectF;", "bounds", "", C17625c.f52155b, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;J)V", "getItemType", "()I", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Lo0oo0o/OooO00o$OooO00o;", "iconPosition", "renderLinkIcon", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLo0oo0o/OooO00o$OooO00o;)V", "penWidthScale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "dx", "dy", "offset", "(FF)V", "zoom", "", "(FZ)V", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "layerId", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;J)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "", "Landroid/graphics/PointF;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "downCenter", "preCenter", "center", "width", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "r", "rotate", "(FLandroid/graphics/PointF;)V", "getClickableBound", "getFixedIconBounds", "component2", "component3", "component4", "component5", "()Landroid/graphics/RectF;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;J)Lcom/orion/penkit/models/HyperLinkInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "getLinkIconBoundingBox", "(FLo0oo0o/OooO00o$OooO00o;)Landroid/graphics/RectF;", "component1", "component6", "Ljava/lang/String;", "I", "getType", "getDestination", "getExtras", "Landroid/graphics/RectF;", "getBounds", "J", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class HyperLinkInfo implements InterfaceC31284OooO0O0, InterfaceC31283OooO00o {
    private static final float HYPERLINK_ICON_SIZE;
    public static final int LINK_TYPE_OTHER_NOTE = 2;
    public static final int LINK_TYPE_PAGE = 1;
    public static final int LINK_TYPE_URI = 0;
    public static final int RENDER_CONTENT = 2;
    public static final int RENDER_ICON = 1;
    public static final int RENDER_NONE = 0;
    private static final float STROKE_WIDTH;
    private static final Paint borderPaint;
    private static final Paint solidPaint;
    private final RectF bounds;
    private final long creationTime;
    private final String destination;
    private final String extras;
    private final String id;
    private final int type;

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC31283OooO00o.EnumC20168OooO00o.values().length];
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o2 = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o3 = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o4 = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float fOooO00o = C28460OooooO0.OooO00o(1.5f);
        STROKE_WIDTH = fOooO00o;
        HYPERLINK_ICON_SIZE = C28460OooooO0.OooO00o(18.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fOooO00o);
        paint.setColor(Color.parseColor("#FF007AFF"));
        borderPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeJoin(join);
        paint2.setStrokeCap(cap);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeWidth(0.0f);
        paint2.setColor(Color.parseColor("#33007AFF"));
        solidPaint = paint2;
    }

    public HyperLinkInfo(String id, int i, String destination, String str, RectF bounds, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(destination, "destination");
        OooOOO0.OooO0oO(bounds, "bounds");
        this.id = id;
        this.type = i;
        this.destination = destination;
        this.extras = str;
        this.bounds = bounds;
        this.creationTime = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    public static /* synthetic */ HyperLinkInfo copy$default(HyperLinkInfo hyperLinkInfo, String str, int i, String str2, String str3, RectF rectF, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hyperLinkInfo.id;
        }
        if ((i2 & 2) != 0) {
            i = hyperLinkInfo.type;
        }
        if ((i2 & 4) != 0) {
            str2 = hyperLinkInfo.destination;
        }
        if ((i2 & 8) != 0) {
            str3 = hyperLinkInfo.extras;
        }
        if ((i2 & 16) != 0) {
            rectF = hyperLinkInfo.bounds;
        }
        if ((i2 & 32) != 0) {
            j = hyperLinkInfo.creationTime;
        }
        long j2 = j;
        RectF rectF2 = rectF;
        String str4 = str2;
        return hyperLinkInfo.copy(str, i, str4, str3, rectF2, j2);
    }

    private final RectF getLinkIconBoundingBox(float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        float f = HYPERLINK_ICON_SIZE * scale;
        int i = WhenMappings.$EnumSwitchMapping$0[iconPosition.ordinal()];
        if (i == 1) {
            float fCenterY = this.bounds.centerY();
            float f2 = this.bounds.left;
            float f3 = f / 2.0f;
            return new RectF(f2, fCenterY - f3, f + f2, fCenterY + f3);
        }
        if (i == 2) {
            float fCenterX = this.bounds.centerX();
            float f4 = f / 2.0f;
            float f5 = this.bounds.bottom;
            return new RectF(fCenterX - f4, f5 - f, fCenterX + f4, f5);
        }
        if (i == 3) {
            float fCenterY2 = this.bounds.centerY();
            float f6 = this.bounds.right;
            float f7 = f6 - f;
            float f8 = f / 2.0f;
            return new RectF(f7, fCenterY2 - f8, f6, fCenterY2 + f8);
        }
        if (i != 4) {
            throw new C32442OooOO0o();
        }
        float fCenterX2 = this.bounds.centerX();
        float f9 = f / 2.0f;
        float f10 = this.bounds.top;
        return new RectF(fCenterX2 - f9, f10, fCenterX2 + f9, f + f10);
    }

    public static /* synthetic */ void renderLinkIcon$default(HyperLinkInfo hyperLinkInfo, o0O0oo00.OooO00o oooO00o, o0O0oo00.OooO0O0 oooO0O0, float f, InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o, int i, Object obj) {
        if ((i & 8) != 0) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
        }
        hyperLinkInfo.renderLinkIcon(oooO00o, oooO0O0, f, enumC20168OooO00o);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    public final HyperLinkInfo copy(String id, int type, String destination, String extras, RectF bounds, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(destination, "destination");
        OooOOO0.OooO0oO(bounds, "bounds");
        return new HyperLinkInfo(id, type, destination, extras, bounds, creationTime);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id) {
        OooOOO0.OooO0oO(id, "id");
        return deepCopy(id, getLayerId());
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean doesSupportLayer() {
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HyperLinkInfo)) {
            return false;
        }
        HyperLinkInfo hyperLinkInfo = (HyperLinkInfo) other;
        return OooOOO0.OooO0O0(this.id, hyperLinkInfo.id) && this.type == hyperLinkInfo.type && OooOOO0.OooO0O0(this.destination, hyperLinkInfo.destination) && OooOOO0.OooO0O0(this.extras, hyperLinkInfo.extras) && OooOOO0.OooO0O0(this.bounds, hyperLinkInfo.bounds) && this.creationTime == hyperLinkInfo.creationTime;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        return new RectF(this.bounds);
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
        return getLinkIconBoundingBox(scale, InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getExtras() {
        return this.extras;
    }

    @Override // o0oo0o.InterfaceC31283OooO00o
    public RectF getFixedIconBounds(float scale) {
        return new RectF();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 8;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return "none";
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.type, this.id.hashCode() * 31, 31), 31, this.destination);
        String str = this.extras;
        return Long.hashCode(this.creationTime) + C20424OooO0Oo.OooO0OO(this.bounds, (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31);
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
        return false;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        renderEngine.OooO0o(this.bounds, solidPaint);
        renderEngine.OooO0o(this.bounds, borderPaint);
    }

    public final <T> void renderLinkIcon(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        float f;
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(iconPosition, "iconPosition");
        RectF linkIconBoundingBox = getLinkIconBoundingBox(scale, iconPosition);
        int iOrdinal = iconPosition.ordinal();
        if (iOrdinal == 0) {
            f = 0.0f;
        } else if (iOrdinal == 1) {
            f = -270.0f;
        } else if (iOrdinal == 2) {
            f = -90.0f;
        } else {
            if (iOrdinal != 3) {
                throw new C32442OooOO0o();
            }
            f = -180.0f;
        }
        renderEngine.OooOo0o(DrawToolFactory.INSTANCE.getHyperLinkIconBitmap(), linkIconBoundingBox, f);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        Matrix matrix = new Matrix();
        matrix.postRotate(r, center.x, center.y);
        matrix.mapRect(this.bounds);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        o00OO0O0.OooO0O0.OooOO0O(this.bounds, zoom);
    }

    public String toString() {
        String str = this.id;
        int i = this.type;
        String str2 = this.destination;
        String str3 = this.extras;
        RectF rectF = this.bounds;
        long j = this.creationTime;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "HyperLinkInfo(id=", str, ", type=", ", destination=");
        OooOO0.OooO0OO.OooO0o0(sbOooO0OO, str2, ", extras=", str3, ", bounds=");
        sbOooO0OO.append(rectF);
        sbOooO0OO.append(", creationTime=");
        sbOooO0OO.append(j);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return deepCopy(id, layerId, this.creationTime);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return copy$default(this, id, 0, null, null, new RectF(this.bounds), creationTime, 14, null);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        return copy$default(this, id, 0, null, null, new RectF(bounds), 0L, 46, null);
    }

    public /* synthetic */ HyperLinkInfo(String str, int i, String str2, String str3, RectF rectF, long j, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, i, str2, str3, rectF, (i2 & 32) != 0 ? System.currentTimeMillis() : j);
    }
}
