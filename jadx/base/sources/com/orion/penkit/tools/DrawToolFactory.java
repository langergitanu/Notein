package com.orion.penkit.tools;

import OooOoOO.C20519OooO0Oo;
import OooOoo.C20593OooO0Oo;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.ViewCompat;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18374u4;
import com.huawei.hms.network.embedded.C18437z2;
import com.lenovo.api.stylusprediction.LRPenPrediction;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.global.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o0Ooo.C25432OooOO0;
import o0O0oo00.OooO00o;
import o0oo0O0.C31220OooO00o;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0Oo.C31240OooO0O0;
import o0oo0Oo.C31241OooO0OO;
import o0oo0Oo.C31242OooO0Oo;
import o0oo0Oo.C31243OooO0o;
import o0oo0Oo.C31244OooO0o0;
import o0oo0Oo.C31245OooO0oO;
import o0oo0Oo.C31246OooO0oo;
import o0oo0Oo.C31247OooOO0;
import o0oo0Oo.C31248OooOO0O;
import o0oo0Oo.C31249OooOO0o;
import o0oo0Oo.C31250OooOOO;
import o0oo0Oo.C31251OooOOO0;
import o0oo0Oo.C31252OooOOOO;
import o0oo0Oo.C31253OooOOOo;
import o0oo0Oo.C31255OooOOo0;
import o0oo0Oo.C31257OooOo;
import o0oo0Oo.C31260OooOo0O;
import o0oo0Oo.C31261OooOo0o;
import o0oo0Oo.C31262OooOoO;
import o0oo0Oo.C31265OooOoo;
import o0oo0Oo.C31266OooOoo0;
import o0oo0OoO.C31273OooO0o0;
import o0oo0OoO.C31274OooO0oO;
import o0oo0OoO.C31275OooO0oo;
import o0oo0OoO.C31276OooOO0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooOO.C32466OooO0OO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002TUB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\r2\u0006\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\"\u00105\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\"\u00108\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R\"\u0010;\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\fR\u001b\u0010E\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010/R*\u0010H\u001a\u00020F2\u0006\u0010G\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010N\u001a\u00020F2\u0006\u0010G\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR*\u0010Q\u001a\u00020F2\u0006\u0010G\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010K\"\u0004\bS\u0010M¨\u0006V"}, m80612d2 = {"Lcom/orion/penkit/tools/DrawToolFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LoO00ooO/OooOooO;", "initLenovoPenPrediction", "(Landroid/content/Context;)V", "Landroid/app/Application;", "app", C18374u4.f56270c, "(Landroid/app/Application;)V", "T", "", "penType", "color", "", "width", "Landroid/os/Bundle;", "extra", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0oo0Oo/OooO00o;", "createToolByPenType", "(IIFLandroid/os/Bundle;Lo0O0oo00/OooO00o;)Lo0oo0Oo/OooO00o;", "toolType", "createTool", "", "ERASER_TYPE_PIXEL", "Ljava/lang/String;", "ERASER_TYPE_STROKE", "ERASER_TYPE_LASSO", "LASSO_TYPE_FREE", "LASSO_TYPE_RECT", "LASSO_TYPE_CAPTURE", "EXTRA_OPACITY_OF_SHAPE_FILL_COLOR", "DUAL_LINK_ICON", "I", "DUAL_LINK_ICON_INVALID", "HYPERLINK_ICON", "TEXT_ANNO_ICON_EDITING", "TEXT_ANNO_ICON_LARGE", "Landroid/graphics/Bitmap;", "dualLinkIconBitmap", "Landroid/graphics/Bitmap;", "getDualLinkIconBitmap", "()Landroid/graphics/Bitmap;", "setDualLinkIconBitmap", "(Landroid/graphics/Bitmap;)V", "dualLinkIconBitmapInvalid", "getDualLinkIconBitmapInvalid", "setDualLinkIconBitmapInvalid", "hyperLinkIconBitmap", "getHyperLinkIconBitmap", "setHyperLinkIconBitmap", "textAnnoIconEditingBitmap", "getTextAnnoIconEditingBitmap", "setTextAnnoIconEditingBitmap", "textAnnoIconLargeBitmap", "getTextAnnoIconLargeBitmap", "setTextAnnoIconLargeBitmap", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "setApp", "fixedIconBitmap$delegate", "LoO00ooO/OooOO0;", "getFixedIconBitmap", "fixedIconBitmap", "", "value", "enableCorrectToLine", "Z", "getEnableCorrectToLine", "()Z", "setEnableCorrectToLine", "(Z)V", "enableEraseHighLighterOnly", "getEnableEraseHighLighterOnly", "setEnableEraseHighLighterOnly", "enableEraseTapeOnly", "getEnableEraseTapeOnly", "setEnableEraseTapeOnly", "EraserType", "LassoType", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DrawToolFactory {
    public static final String ERASER_TYPE_LASSO = "lasso_type";
    public static final String ERASER_TYPE_PIXEL = "pixel_type";
    public static final String ERASER_TYPE_STROKE = "stroke_type";
    public static final String EXTRA_OPACITY_OF_SHAPE_FILL_COLOR = "opacity_of_shape_fill_color";
    public static final String LASSO_TYPE_CAPTURE = "capture";
    public static final String LASSO_TYPE_FREE = "free";
    public static final String LASSO_TYPE_RECT = "rect";
    public static Application app;
    public static Bitmap dualLinkIconBitmap;
    public static Bitmap dualLinkIconBitmapInvalid;
    private static boolean enableEraseHighLighterOnly;
    private static boolean enableEraseTapeOnly;
    public static Bitmap hyperLinkIconBitmap;
    public static Bitmap textAnnoIconEditingBitmap;
    public static Bitmap textAnnoIconLargeBitmap;
    public static final DrawToolFactory INSTANCE = new DrawToolFactory();
    private static final int DUAL_LINK_ICON = R.drawable.ic_dual_link;
    private static final int DUAL_LINK_ICON_INVALID = R.drawable.ic_dual_link_invalid;
    private static final int HYPERLINK_ICON = R.drawable.ic_render_hyperlink_icon;
    private static final int TEXT_ANNO_ICON_EDITING = R.drawable.ic_render_text_anno_icon_editing;
    private static final int TEXT_ANNO_ICON_LARGE = R.drawable.ic_render_text_anno_icon_large;

    /* JADX INFO: renamed from: fixedIconBitmap$delegate, reason: from kotlin metadata */
    private static final InterfaceC32440OooOO0 fixedIconBitmap = C20519OooO0Oo.OooO0OO(new C31241OooO0OO());
    private static boolean enableCorrectToLine = true;

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/penkit/tools/DrawToolFactory$EraserType;", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public @interface EraserType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/penkit/tools/DrawToolFactory$LassoType;", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public @interface LassoType {
    }

    private DrawToolFactory() {
    }

    public static /* synthetic */ AbstractC31239OooO00o createTool$default(DrawToolFactory drawToolFactory, int i, int i2, float f, Bundle bundle, OooO00o oooO00o, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = ViewCompat.MEASURED_STATE_MASK;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        return drawToolFactory.createTool(i, i4, f, bundle, oooO00o);
    }

    public static /* synthetic */ AbstractC31239OooO00o createToolByPenType$default(DrawToolFactory drawToolFactory, int i, int i2, float f, Bundle bundle, OooO00o oooO00o, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = ViewCompat.MEASURED_STATE_MASK;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        return drawToolFactory.createToolByPenType(i, i4, f, bundle, oooO00o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap fixedIconBitmap_delegate$lambda$0() {
        return BitmapFactory.decodeResource(INSTANCE.getApp().getResources(), R.drawable.ic_fixed);
    }

    public final <T> AbstractC31239OooO00o<T> createTool(int toolType, int color, float width, Bundle extra, OooO00o<T> renderEngine) {
        boolean z;
        OooOOO0.OooO0oO(extra, "extra");
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        boolean zOooO0O0 = OooOOO0.OooO0O0(extra.getString("straight_line", TranslateLanguage.NORWEGIAN), "yes");
        boolean z2 = false;
        int i = extra.getInt(EXTRA_OPACITY_OF_SHAPE_FILL_COLOR, 0);
        List listOoooOO0 = C34434OooOoO.f123453OooOo0o;
        switch (toolType) {
            case 0:
                return new C31243OooO0o(color, i, width, extra, renderEngine);
            case 1:
                return new C31240OooO0O0(color, width, i, renderEngine);
            case 2:
                return new C31246OooO0oo(color, width, zOooO0O0, i, renderEngine);
            case 3:
                String string = extra.getString(C18437z2.f56754h);
                if (string != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode != -28173997) {
                        if (iHashCode != 1834533855) {
                            if (iHashCode == 1931801825 && string.equals(ERASER_TYPE_STROKE)) {
                                return new C31242OooO0Oo(width, renderEngine);
                            }
                        } else if (string.equals(ERASER_TYPE_LASSO)) {
                            return new C31250OooOOO(renderEngine);
                        }
                    } else if (string.equals(ERASER_TYPE_PIXEL)) {
                        return new C31260OooOo0O(width, renderEngine);
                    }
                }
                return new C31242OooO0Oo(width, renderEngine);
            case 4:
                String string2 = extra.getString("filter");
                if (string2 != null) {
                    listOoooOO0 = C33599OooOo0O.OoooOO0(string2, new String[]{","});
                }
                String string3 = extra.getString(C18437z2.f56754h);
                if (string3 != null) {
                    int iHashCode2 = string3.hashCode();
                    if (iHashCode2 != 3151468) {
                        if (iHashCode2 != 3496420) {
                            if (iHashCode2 == 552585030 && string3.equals(LASSO_TYPE_CAPTURE)) {
                                return new C31251OooOOO0(renderEngine);
                            }
                        } else if (string3.equals(LASSO_TYPE_RECT)) {
                            return new C31252OooOOOO(listOoooOO0, renderEngine);
                        }
                    } else if (string3.equals(LASSO_TYPE_FREE)) {
                        return new C31249OooOO0o(listOoooOO0, renderEngine);
                    }
                }
                throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("unknown lasso type ", string3));
            case 5:
                return new C31262OooOoO(color, width, renderEngine);
            case 6:
                return new C31245OooO0oO(color, width, renderEngine);
            case 7:
                int i2 = 0;
                if (((int) extra.getDouble(PenInfo.LASER_DISAPPEAR_DURATION)) == -1) {
                    i2 = 1;
                }
                String string4 = extra.getString(C18437z2.f56754h);
                if (string4 != null) {
                    int iHashCode3 = string4.hashCode();
                    if (iHashCode3 != 3321844) {
                        if (iHashCode3 == 3537154 && string4.equals("spot")) {
                            return new C31248OooOO0O(width, color, extra, renderEngine);
                        }
                    } else if (string4.equals("line")) {
                        return new C31247OooOO0(color, i2, width, extra, renderEngine);
                    }
                }
                throw new IllegalArgumentException("unknown laser pen type");
            case 8:
                String string5 = extra.getString(C18437z2.f56754h, "7");
                OooOOO0.OooO0o(string5, "getString(...)");
                return new C31265OooOoo(color, width, Integer.parseInt(string5), i, renderEngine);
            case 9:
                return new C31257OooOo(color, width, zOooO0O0, i, renderEngine);
            case 10:
                return new C31255OooOOo0(color, width, renderEngine);
            case 11:
                try {
                    z = Boolean.parseBoolean(extra.getString("is_tape_visible"));
                } catch (Exception unused) {
                    z = false;
                }
                try {
                    z2 = Boolean.parseBoolean(extra.getString("draw_line_directly"));
                    break;
                } catch (Exception unused2) {
                }
                return new C31266OooOoo0(color, width, z, z2, renderEngine);
            case 12:
                return new C31261OooOo0o(color, width, zOooO0O0, renderEngine);
            default:
                switch (toolType) {
                    case 100:
                        return new C31275OooO0oo(color, width, renderEngine);
                    case 101:
                        return new C31276OooOO0(color, width, renderEngine);
                    case 102:
                        return new C31274OooO0oO(width, color, extra, renderEngine);
                    case 103:
                        return new C31273OooO0o0(width, color, extra, renderEngine);
                    default:
                        return new C31244OooO0o0();
                }
        }
    }

    public final <T> AbstractC31239OooO00o<T> createToolByPenType(int penType, int color, float width, Bundle extra, OooO00o<T> renderEngine) {
        OooOOO0.OooO0oO(extra, "extra");
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        C32466OooO0OO c32466OooO0OO = C31253OooOOOo.f111547OooO00o;
        int iIntValue = -1;
        if (penType != -1) {
            Integer num = C31253OooOOOo.f111549OooO0OO.get(Integer.valueOf(penType));
            if (num == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PenToolContract");
                c20358OooO00o.OooOO0O("No mapping found for pen type: " + penType + ", returning TOOL_FAKE.", new Object[0]);
                num = -1;
            }
            iIntValue = num.intValue();
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PenToolContract");
            c20358OooO00o2.OooOO0O("Invalid pen type: " + penType + ", returning TOOL_FAKE.", new Object[0]);
        }
        return createTool(iIntValue, color, width, extra, renderEngine);
    }

    public final Application getApp() {
        Application application = app;
        if (application != null) {
            return application;
        }
        OooOOO0.OooOOOO("app");
        throw null;
    }

    public final Bitmap getDualLinkIconBitmap() {
        Bitmap bitmap = dualLinkIconBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        OooOOO0.OooOOOO("dualLinkIconBitmap");
        throw null;
    }

    public final Bitmap getDualLinkIconBitmapInvalid() {
        Bitmap bitmap = dualLinkIconBitmapInvalid;
        if (bitmap != null) {
            return bitmap;
        }
        OooOOO0.OooOOOO("dualLinkIconBitmapInvalid");
        throw null;
    }

    public final boolean getEnableCorrectToLine() {
        return enableCorrectToLine;
    }

    public final boolean getEnableEraseHighLighterOnly() {
        return enableEraseHighLighterOnly;
    }

    public final boolean getEnableEraseTapeOnly() {
        return enableEraseTapeOnly;
    }

    public final Bitmap getFixedIconBitmap() {
        Object value = fixedIconBitmap.getValue();
        OooOOO0.OooO0o(value, "getValue(...)");
        return (Bitmap) value;
    }

    public final Bitmap getHyperLinkIconBitmap() {
        Bitmap bitmap = hyperLinkIconBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        OooOOO0.OooOOOO("hyperLinkIconBitmap");
        throw null;
    }

    public final Bitmap getTextAnnoIconEditingBitmap() {
        Bitmap bitmap = textAnnoIconEditingBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        OooOOO0.OooOOOO("textAnnoIconEditingBitmap");
        throw null;
    }

    public final Bitmap getTextAnnoIconLargeBitmap() {
        Bitmap bitmap = textAnnoIconLargeBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        OooOOO0.OooOOOO("textAnnoIconLargeBitmap");
        throw null;
    }

    public final void init(Application app2) {
        OooOOO0.OooO0oO(app2, "app");
        setDualLinkIconBitmap(BitmapFactory.decodeResource(app2.getResources(), DUAL_LINK_ICON));
        setDualLinkIconBitmapInvalid(BitmapFactory.decodeResource(app2.getResources(), DUAL_LINK_ICON_INVALID));
        setHyperLinkIconBitmap(BitmapFactory.decodeResource(app2.getResources(), HYPERLINK_ICON));
        setTextAnnoIconEditingBitmap(BitmapFactory.decodeResource(app2.getResources(), TEXT_ANNO_ICON_EDITING));
        setTextAnnoIconLargeBitmap(BitmapFactory.decodeResource(app2.getResources(), TEXT_ANNO_ICON_LARGE));
        setApp(app2);
    }

    public final void initLenovoPenPrediction(Context context) {
        OooOOO0.OooO0oO(context, "context");
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        if (C33599OooOo0O.OooOoOO(BRAND, "Lenovo", true)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("LenovoSDKPrediction");
            c20358OooO00o.OooO0o0("Lenovo init pen prediction, sPenPrediction: " + C31220OooO00o.f111344OooOo + ".", new Object[0]);
            try {
                if (C31220OooO00o.f111344OooOo == null) {
                    C25432OooOO0 c25432OooOO0 = new C25432OooOO0();
                    LRPenPrediction lRPenPrediction = new LRPenPrediction();
                    c25432OooOO0.f86707OooO00o = lRPenPrediction;
                    lRPenPrediction.initialPrediction(4, 1, 4);
                    C31220OooO00o.f111344OooOo = c25432OooOO0;
                }
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("LenovoSDKPrediction");
                c20358OooO00o2.OooO0Oo(e, C20593OooO0Oo.OooO0O0("Lenovo init pen prediction err: ", C32435OooO0Oo.OooO0O0(e), "."), new Object[0]);
            }
        }
    }

    public final void setApp(Application application) {
        OooOOO0.OooO0oO(application, "<set-?>");
        app = application;
    }

    public final void setDualLinkIconBitmap(Bitmap bitmap) {
        OooOOO0.OooO0oO(bitmap, "<set-?>");
        dualLinkIconBitmap = bitmap;
    }

    public final void setDualLinkIconBitmapInvalid(Bitmap bitmap) {
        OooOOO0.OooO0oO(bitmap, "<set-?>");
        dualLinkIconBitmapInvalid = bitmap;
    }

    public final void setEnableCorrectToLine(boolean z) {
        enableCorrectToLine = z;
        AbstractC31239OooO00o.f111412OooOOOO = z;
    }

    public final void setEnableEraseHighLighterOnly(boolean z) {
        enableEraseHighLighterOnly = z;
    }

    public final void setEnableEraseTapeOnly(boolean z) {
        enableEraseTapeOnly = z;
    }

    public final void setHyperLinkIconBitmap(Bitmap bitmap) {
        OooOOO0.OooO0oO(bitmap, "<set-?>");
        hyperLinkIconBitmap = bitmap;
    }

    public final void setTextAnnoIconEditingBitmap(Bitmap bitmap) {
        OooOOO0.OooO0oO(bitmap, "<set-?>");
        textAnnoIconEditingBitmap = bitmap;
    }

    public final void setTextAnnoIconLargeBitmap(Bitmap bitmap) {
        OooOOO0.OooO0oO(bitmap, "<set-?>");
        textAnnoIconLargeBitmap = bitmap;
    }
}
