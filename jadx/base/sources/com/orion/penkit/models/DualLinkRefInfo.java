package com.orion.penkit.models;

import OooOoo0.o00000;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25446OooO0Oo;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31283OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b)\b\u0086\b\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001lB5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J?\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010$J9\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020!2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010\u001d\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010/J\u0017\u00100\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00103J'\u00100\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00104J\u001f\u00100\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00106J\u001d\u0010:\u001a\u00020\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010=JW\u0010E\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010D\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010D0C2\u0006\u0010>\u001a\u0002082\u0006\u0010?\u001a\u0002082\u0006\u0010@\u001a\u0002082\u0006\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010)J\u0017\u0010H\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bH\u0010)J\u0017\u0010I\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010)J\u001f\u0010K\u001a\u00020!2\u0006\u0010J\u001a\u00020\u001c2\u0006\u0010@\u001a\u000208H\u0016¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bO\u0010=J\u0012\u0010P\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bP\u0010QJD\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bT\u0010\u0013J\u0010\u0010U\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bU\u0010\u0011J\u001a\u0010W\u001a\u00020\u00072\b\u0010V\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\bW\u0010XJ9\u0010Y\u001a\u00020!\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bY\u0010%J3\u0010Z\u001a\u00020!\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bZ\u0010[J'\u0010^\u001a\u00020'2\u0006\u0010\\\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010]\u001a\u00020\u001fH\u0002¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b`\u0010\u0013J\u0010\u0010a\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\ba\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010bR\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010c\u001a\u0004\bd\u0010NR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010e\u001a\u0004\bf\u0010=R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010g\u001a\u0004\bh\u0010Q\"\u0004\bi\u0010jR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010k¨\u0006m"}, m80612d2 = {"Lcom/orion/penkit/models/DualLinkRefInfo;", "Lo0oo0o/OooO0O0;", "Lo0oo0o/OooO00o;", "", "", "id", "item", "", "validation", "Landroid/os/Bundle;", "extra", "", C17625c.f52155b, "<init>", "(Ljava/lang/String;Lo0oo0o/OooO0O0;ZLandroid/os/Bundle;J)V", "", "getItemType", "()I", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "showIcon", "Lo0oo0o/OooO00o$OooO00o;", "iconPosition", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FZLo0oo0o/OooO00o$OooO00o;)V", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLo0oo0o/OooO00o$OooO00o;)V", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "penWidthScale", "Landroid/graphics/RectF;", "getBoundingBox", "(F)Landroid/graphics/RectF;", "dx", "dy", "offset", "(FF)V", "zoom", "(FZ)V", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "layerId", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;J)Lo0oo0o/OooO0O0;", "bounds", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "", "Landroid/graphics/PointF;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "downCenter", "preCenter", "center", "width", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "getClickableBound", "getFixedIconBounds", "getLongPressBounds", "r", "rotate", "(FLandroid/graphics/PointF;)V", "component2", "()Lo0oo0o/OooO0O0;", "component3", "component4", "()Landroid/os/Bundle;", "copy", "(Ljava/lang/String;Lo0oo0o/OooO0O0;ZLandroid/os/Bundle;J)Lcom/orion/penkit/models/DualLinkRefInfo;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "drawItem", "drawDualLinkIcon", "(Lo0O0oo00/OooO00o;FLo0oo0o/OooO00o$OooO00o;)V", "itemBounds", RequestParameters.POSITION, "getDualLinkIconBounds", "(Landroid/graphics/RectF;FLo0oo0o/OooO00o$OooO00o;)Landroid/graphics/RectF;", "component1", "component5", "Ljava/lang/String;", "Lo0oo0o/OooO0O0;", "getItem", "Z", "getValidation", "Landroid/os/Bundle;", "getExtra", "setExtra", "(Landroid/os/Bundle;)V", "J", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DualLinkRefInfo implements InterfaceC31284OooO0O0, InterfaceC31283OooO00o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float DUAL_LINK_ICON_SIZE = C28460OooooO0.OooO00o(17.0f);
    public static final String EXTRA_OF_IS_FIXED_ICON_CLICKED = "isFixedIconClicked";
    public static final String EXTRA_OF_IS_REF_ICON_CLICKED = "isRefIconClicked";
    private static final String TAG = "DualLinkRefInfo";
    private final long creationTime;
    private Bundle extra;
    private final String id;
    private final InterfaceC31284OooO0O0 item;
    private final boolean validation;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m80612d2 = {"Lcom/orion/penkit/models/DualLinkRefInfo$Companion;", "", "<init>", "()V", "TAG", "", "DUAL_LINK_ICON_SIZE", "", "getDUAL_LINK_ICON_SIZE", "()F", "EXTRA_OF_IS_FIXED_ICON_CLICKED", "EXTRA_OF_IS_REF_ICON_CLICKED", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final float getDUAL_LINK_ICON_SIZE() {
            return DualLinkRefInfo.DUAL_LINK_ICON_SIZE;
        }

        private Companion() {
        }
    }

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

    public DualLinkRefInfo(String id, InterfaceC31284OooO0O0 item, boolean z, Bundle bundle, long j) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(item, "item");
        this.id = id;
        this.item = item;
        this.validation = z;
        this.extra = bundle;
        this.creationTime = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    public static /* synthetic */ DualLinkRefInfo copy$default(DualLinkRefInfo dualLinkRefInfo, String str, InterfaceC31284OooO0O0 interfaceC31284OooO0O0, boolean z, Bundle bundle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dualLinkRefInfo.id;
        }
        if ((i & 2) != 0) {
            interfaceC31284OooO0O0 = dualLinkRefInfo.item;
        }
        if ((i & 4) != 0) {
            z = dualLinkRefInfo.validation;
        }
        if ((i & 8) != 0) {
            bundle = dualLinkRefInfo.extra;
        }
        if ((i & 16) != 0) {
            j = dualLinkRefInfo.creationTime;
        }
        long j2 = j;
        return dualLinkRefInfo.copy(str, interfaceC31284OooO0O0, z, bundle, j2);
    }

    private final <T> void drawDualLinkIcon(o0O0oo00.OooO00o<T> renderEngine, float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        float f;
        RectF dualLinkIconBounds = getDualLinkIconBounds(this.item.getBoundingBox(scale), scale, iconPosition);
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

    private final <T> void drawItem(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        this.item.render(renderEngine, renderTarget, scale);
    }

    private final RectF getDualLinkIconBounds(RectF itemBounds, float scale, InterfaceC31283OooO00o.EnumC20168OooO00o position) {
        float f = DUAL_LINK_ICON_SIZE * scale;
        int i = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i == 1) {
            return new RectF((itemBounds.left - f) - (C28460OooooO0.OooO00o(4.0f) * scale), itemBounds.top, itemBounds.left - (C28460OooooO0.OooO00o(4.0f) * scale), itemBounds.top + f);
        }
        if (i == 2) {
            return new RectF(itemBounds.left, (C28460OooooO0.OooO00o(4.0f) * scale) + itemBounds.bottom, itemBounds.left + f, (C28460OooooO0.OooO00o(4.0f) * scale) + itemBounds.bottom + f);
        }
        if (i != 3) {
            if (i == 4) {
                return new RectF(itemBounds.right - f, (itemBounds.top - f) - (C28460OooooO0.OooO00o(4.0f) * scale), itemBounds.right, itemBounds.top - (C28460OooooO0.OooO00o(4.0f) * scale));
            }
            throw new C32442OooOO0o();
        }
        return new RectF((C28460OooooO0.OooO00o(4.0f) * scale) + itemBounds.right, itemBounds.bottom - f, (C28460OooooO0.OooO00o(4.0f) * scale) + itemBounds.right + f, itemBounds.bottom);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InterfaceC31284OooO0O0 getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bundle getExtra() {
        return this.extra;
    }

    public final DualLinkRefInfo copy(String id, InterfaceC31284OooO0O0 item, boolean validation, Bundle extra, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(item, "item");
        return new DualLinkRefInfo(id, item, validation, extra, creationTime);
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
        if (!(other instanceof DualLinkRefInfo)) {
            return false;
        }
        DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) other;
        return OooOOO0.OooO0O0(this.id, dualLinkRefInfo.id) && OooOOO0.OooO0O0(this.item, dualLinkRefInfo.item) && this.validation == dualLinkRefInfo.validation && OooOOO0.OooO0O0(this.extra, dualLinkRefInfo.extra) && this.creationTime == dualLinkRefInfo.creationTime;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        RectF boundingBox = this.item.getBoundingBox(penWidthScale);
        float f = boundingBox.left;
        float f2 = DUAL_LINK_ICON_SIZE;
        return new RectF((f - (f2 * penWidthScale)) - (C28460OooooO0.OooO00o(4.0f) * penWidthScale), (boundingBox.top - (f2 * penWidthScale)) - (C28460OooooO0.OooO00o(4.0f) * penWidthScale), (C28460OooooO0.OooO00o(4.0f) * penWidthScale) + (f2 * penWidthScale) + boundingBox.right, (C28460OooooO0.OooO00o(4.0f) * penWidthScale) + (f2 * penWidthScale) + boundingBox.bottom);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float f) {
        return getBoundingBox(f);
    }

    @Override // o0oo0o.InterfaceC31283OooO00o
    public RectF getClickableBound(float scale) {
        RectF boundingBox = this.item.getBoundingBox(scale);
        float fOooO00o = boundingBox.left - (C28460OooooO0.OooO00o(4.0f) * scale);
        float f = DUAL_LINK_ICON_SIZE;
        return new RectF(fOooO00o - (f * scale), boundingBox.top, boundingBox.left - (C28460OooooO0.OooO00o(4.0f) * scale), (f * scale) + boundingBox.top);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    @Override // o0oo0o.InterfaceC31283OooO00o
    public RectF getFixedIconBounds(float scale) {
        RectF fixedIconBounds;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = this.item;
        ImageInfo imageInfo = interfaceC31284OooO0O0 instanceof ImageInfo ? (ImageInfo) interfaceC31284OooO0O0 : null;
        return (imageInfo == null || (fixedIconBounds = imageInfo.getFixedIconBounds(scale)) == null) ? new RectF() : fixedIconBounds;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    public final InterfaceC31284OooO0O0 getItem() {
        return this.item;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 7;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return "none";
    }

    public RectF getLongPressBounds(float scale) {
        return this.item.getBoundingBox(scale);
    }

    public final boolean getValidation() {
        return this.validation;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0((this.item.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.validation);
        Bundle bundle = this.extra;
        return Long.hashCode(this.creationTime) + ((iOooO0O0 + (bundle == null ? 0 : bundle.hashCode())) * 31);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void offset(float dx, float dy) {
        this.item.offset(dx, dy);
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
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = this.item;
        OooOOO0.OooO0o0(interfaceC31284OooO0O0, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
        if (((ImageInfo) interfaceC31284OooO0O0).getFixed()) {
            return false;
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = this.item;
        OooOOO0.OooO0o0(interfaceC31284OooO0O02, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
        RectF bounds = ((ImageInfo) interfaceC31284OooO0O02).getBounds();
        InterfaceC31284OooO0O0 interfaceC31284OooO0O03 = this.item;
        OooOOO0.OooO0o0(interfaceC31284OooO0O03, "null cannot be cast to non-null type com.orion.penkit.models.ImageInfo");
        float rotation = ((ImageInfo) interfaceC31284OooO0O03).getRotation();
        List listOooO0o = o00OO0O0.OooO0O0.OooO0o(bounds);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0o, 10));
        Iterator it = listOooO0o.iterator();
        while (it.hasNext()) {
            arrayList.add(C25446OooO0Oo.OooOO0O((PointF) it.next(), o00OO0O0.OooO0O0.OooO0OO(bounds), rotation));
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

    public final <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, boolean showIcon, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(iconPosition, "iconPosition");
        if (showIcon) {
            render(renderEngine, renderTarget, scale, iconPosition);
        } else {
            this.item.render(renderEngine, renderTarget, scale);
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        this.item.rotate(r, center);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        this.item.scale(zoom, penWidthScale);
    }

    public final void setExtra(Bundle bundle) {
        this.extra = bundle;
    }

    public String toString() {
        String str = this.id;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = this.item;
        boolean z = this.validation;
        Bundle bundle = this.extra;
        long j = this.creationTime;
        StringBuilder sb = new StringBuilder("DualLinkRefInfo(id=");
        sb.append(str);
        sb.append(", item=");
        sb.append(interfaceC31284OooO0O0);
        sb.append(", validation=");
        sb.append(z);
        sb.append(", extra=");
        sb.append(bundle);
        sb.append(", creationTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(j, ")", sb);
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
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = this.item;
        return copy$default(this, id, interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId(), layerId, creationTime), false, null, creationTime, 12, null);
    }

    public final <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale, InterfaceC31283OooO00o.EnumC20168OooO00o iconPosition) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(iconPosition, "iconPosition");
        drawItem(renderEngine, renderTarget, scale);
        drawDualLinkIcon(renderEngine, scale, iconPosition);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        if (!OooOOO0.OooO0O0(this.item, this)) {
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = this.item;
            return copy$default(this, id, interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId(), bounds), false, null, this.creationTime, 12, null);
        }
        throw new IllegalArgumentException("item can not be self");
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        render(renderEngine, renderTarget, scale, InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o);
    }

    public /* synthetic */ DualLinkRefInfo(String str, InterfaceC31284OooO0O0 interfaceC31284OooO0O0, boolean z, Bundle bundle, long j, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, interfaceC31284OooO0O0, z, (i & 8) != 0 ? null : bundle, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }
}
