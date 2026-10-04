package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import OooOoo0.o00000;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import java.util.Set;
import java.util.UUID;
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
@Metadata(m80611d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J9\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0010J\u001f\u0010)\u001a\u00020!2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010\u000e\u001a\u00020!2\u0006\u0010+\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010,J\u0017\u0010-\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010-\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u00100J'\u0010-\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u00101J\u001f\u0010-\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u00102J\u001d\u00106\u001a\u00020\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u00109JW\u0010A\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010@\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010@0?2\u0006\u0010:\u001a\u0002042\u0006\u0010;\u001a\u0002042\u0006\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020!2\u0006\u0010C\u001a\u00020\r2\u0006\u0010<\u001a\u000204H\u0016¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bH\u00109J8\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bK\u0010\u0016J\u0010\u0010L\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\bL\u0010\u0014J\u001a\u0010O\u001a\u00020\u00072\b\u0010N\u001a\u0004\u0018\u00010MHÖ\u0003¢\u0006\u0004\bO\u0010PJ3\u0010Q\u001a\u00020!\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u001fH\u0002¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\bV\u0010\u0016J\u0010\u0010W\u001a\u00020\tHÂ\u0003¢\u0006\u0004\bW\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010XR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\bZ\u0010GR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b\\\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010]¨\u0006_"}, m80612d2 = {"Lcom/orion/penkit/models/DualLinkSourceInfo;", "Lo0oo0o/OooO0O0;", "Lo0oo0o/OooO00o;", "", "id", "Landroid/graphics/RectF;", "bounds", "", "validation", "", C17625c.f52155b, "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;ZJ)V", "", "scale", "getClickableBound", "(F)Landroid/graphics/RectF;", "getFixedIconBounds", "", "getItemType", "()I", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "Lo0oo0o/OooO00o$OooO00o;", "iconPosition", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLo0oo0o/OooO00o$OooO00o;)V", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "penWidthScale", "getBoundingBox", "dx", "dy", "offset", "(FF)V", "zoom", "(FZ)V", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "layerId", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;J)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "", "Landroid/graphics/PointF;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "downCenter", "preCenter", "center", "width", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "r", "rotate", "(FLandroid/graphics/PointF;)V", "component2", "()Landroid/graphics/RectF;", "component3", "copy", "(Ljava/lang/String;Landroid/graphics/RectF;ZJ)Lcom/orion/penkit/models/DualLinkSourceInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "drawDualLinkIcon", "(Lo0O0oo00/OooO00o;FLo0oo0o/OooO00o$OooO00o;)V", RequestParameters.POSITION, "getDualLinkIconBounds", "(FLo0oo0o/OooO00o$OooO00o;)Landroid/graphics/RectF;", "component1", "component4", "Ljava/lang/String;", "Landroid/graphics/RectF;", "getBounds", "Z", "getValidation", "J", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DualLinkSourceInfo implements InterfaceC31284OooO0O0, InterfaceC31283OooO00o {
    private static final float DUAL_LINK_ICON_SIZE = C28460OooooO0.OooO00o(17.0f);
    private static final String TAG = "DualLinkSourceInfo";
    private final RectF bounds;
    private final long creationTime;
    private final String id;
    private final boolean validation;

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

    public DualLinkSourceInfo(String id, RectF bounds, boolean z, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        this.id = id;
        this.bounds = bounds;
        this.validation = z;
        this.creationTime = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    public static /* synthetic */ DualLinkSourceInfo copy$default(DualLinkSourceInfo dualLinkSourceInfo, String str, RectF rectF, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dualLinkSourceInfo.id;
        }
        if ((i & 2) != 0) {
            rectF = dualLinkSourceInfo.bounds;
        }
        if ((i & 4) != 0) {
            z = dualLinkSourceInfo.validation;
        }
        if ((i & 8) != 0) {
            j = dualLinkSourceInfo.creationTime;
        }
        boolean z2 = z;
        return dualLinkSourceInfo.copy(str, rectF, z2, j);
    }

    private final <T> void drawDualLinkIcon(o0O0oo00.OooO00o<T> renderEngine, float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        float f;
        RectF dualLinkIconBounds = getDualLinkIconBounds(scale, iconPosition);
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
        if (this.validation) {
            renderEngine.OooOo0o(DrawToolFactory.INSTANCE.getDualLinkIconBitmap(), dualLinkIconBounds, f);
        } else {
            renderEngine.OooOo0o(DrawToolFactory.INSTANCE.getDualLinkIconBitmapInvalid(), dualLinkIconBounds, f);
        }
    }

    private final RectF getDualLinkIconBounds(float scale, InterfaceC31283OooO00o.EnumC20168OooO00o position) {
        float f = DUAL_LINK_ICON_SIZE * scale;
        int i = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i == 1) {
            float fOooO00o = (this.bounds.left - f) - (C28460OooooO0.OooO00o(4.0f) * scale);
            RectF rectF = this.bounds;
            return new RectF(fOooO00o, rectF.top, rectF.left - (C28460OooooO0.OooO00o(4.0f) * scale), this.bounds.top + f);
        }
        if (i == 2) {
            RectF rectF2 = this.bounds;
            float f2 = rectF2.left;
            float fOooO00o2 = (C28460OooooO0.OooO00o(4.0f) * scale) + rectF2.bottom;
            RectF rectF3 = this.bounds;
            return new RectF(f2, fOooO00o2, rectF3.left + f, (C28460OooooO0.OooO00o(4.0f) * scale) + rectF3.bottom + f);
        }
        if (i == 3) {
            float fOooO00o3 = (C28460OooooO0.OooO00o(4.0f) * scale) + this.bounds.right;
            RectF rectF4 = this.bounds;
            return new RectF(fOooO00o3, rectF4.bottom - f, (C28460OooooO0.OooO00o(4.0f) * scale) + rectF4.right + f, this.bounds.bottom);
        }
        if (i != 4) {
            throw new C32442OooOO0o();
        }
        RectF rectF5 = this.bounds;
        float f3 = rectF5.right - f;
        float fOooO00o4 = (rectF5.top - f) - (C28460OooooO0.OooO00o(4.0f) * scale);
        RectF rectF6 = this.bounds;
        return new RectF(f3, fOooO00o4, rectF6.right, rectF6.top - (C28460OooooO0.OooO00o(4.0f) * scale));
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getValidation() {
        return this.validation;
    }

    public final DualLinkSourceInfo copy(String id, RectF bounds, boolean validation, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        return new DualLinkSourceInfo(id, bounds, validation, creationTime);
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
        if (!(other instanceof DualLinkSourceInfo)) {
            return false;
        }
        DualLinkSourceInfo dualLinkSourceInfo = (DualLinkSourceInfo) other;
        return OooOOO0.OooO0O0(this.id, dualLinkSourceInfo.id) && OooOOO0.OooO0O0(this.bounds, dualLinkSourceInfo.bounds) && this.validation == dualLinkSourceInfo.validation && this.creationTime == dualLinkSourceInfo.creationTime;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        float f = DUAL_LINK_ICON_SIZE * penWidthScale;
        return new RectF((this.bounds.left - f) - (C28460OooooO0.OooO00o(4.0f) * penWidthScale), (this.bounds.top - f) - (C28460OooooO0.OooO00o(4.0f) * penWidthScale), (C28460OooooO0.OooO00o(4.0f) * penWidthScale) + this.bounds.right + f, (C28460OooooO0.OooO00o(4.0f) * penWidthScale) + this.bounds.bottom + f);
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
        return getDualLinkIconBounds(scale, InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
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
        return 6;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return "none";
    }

    public final boolean getValidation() {
        return this.validation;
    }

    public int hashCode() {
        return Long.hashCode(this.creationTime) + o00000.OooO0O0(C20424OooO0Oo.OooO0OO(this.bounds, this.id.hashCode() * 31, 31), 31, this.validation);
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

    public final <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(iconPosition, "iconPosition");
        drawDualLinkIcon(renderEngine, scale, iconPosition);
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
        return "DualLinkSourceInfo(id=" + this.id + ", bounds=" + this.bounds + ", validation=" + this.validation + ", creationTime=" + this.creationTime + ")";
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return deepCopy(id, layerId, this.creationTime);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return copy$default(this, id, new RectF(this.bounds), false, creationTime, 4, null);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        return copy$default(this, id, new RectF(bounds), false, 0L, 12, null);
    }

    public /* synthetic */ DualLinkSourceInfo(String str, RectF rectF, boolean z, long j, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, rectF, z, (i & 8) != 0 ? System.currentTimeMillis() : j);
    }
}
