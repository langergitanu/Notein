package com.orion.penkit.models;

import OooO0o.C20424OooO0Oo;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Html;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.view.ViewCompat;
import com.aspose.slides.C22227OoooO;
import com.aspose.slides.internal.p332p7.OooO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.converter.ConverterTextToHtml;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.notein.richeditor.fonts.RTTypeface;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25446OooO0Oo;
import o0oo0OOo.C31237OooO0O0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u0000 {2\u00020\u0001:\u0001{Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'J9\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010(J\r\u0010)\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u00103J\u001f\u0010\u001d\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u00052\u0006\u0010-\u001a\u000205H\u0016¢\u0006\u0004\b\u001d\u00106J\u001f\u0010:\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010>J'\u0010<\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b<\u0010?J\u001f\u0010<\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010@JW\u0010G\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010F0E2\u0006\u0010A\u001a\u0002082\u0006\u0010B\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010HJ\u001d\u0010K\u001a\u0002052\f\u0010J\u001a\b\u0012\u0004\u0012\u0002080IH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u000205H\u0016¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u0002052\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bS\u0010$J\u0010\u0010T\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bT\u0010*J\u0010\u0010U\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bU\u0010*J\u0010\u0010V\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bV\u0010*J\u0010\u0010W\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bW\u0010,J\u0010\u0010X\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bX\u0010*J\u0010\u0010Y\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bY\u0010\"J\u0010\u0010Z\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bZ\u0010\"J\u0010\u0010[\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0088\u0001\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b_\u0010$J\u0010\u0010`\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b`\u0010\"J\u001a\u0010c\u001a\u0002052\b\u0010b\u001a\u0004\u0018\u00010aHÖ\u0003¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\be\u0010$J\u0010\u0010f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\bf\u0010$J\u0010\u0010g\u001a\u00020\u000fHÂ\u0003¢\u0006\u0004\bg\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010h\u001a\u0004\bi\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010j\u001a\u0004\bk\u0010*R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010j\u001a\u0004\bl\u0010*\"\u0004\bm\u0010nR\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010j\u001a\u0004\bo\u0010*\"\u0004\bp\u0010nR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010q\u001a\u0004\br\u0010,R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010j\u001a\u0004\bs\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010t\u001a\u0004\bu\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010hR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010vR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010t\u001a\u0004\bw\u0010\"R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010x\u001a\u0004\by\u0010\\R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010z¨\u0006|"}, m80612d2 = {"Lcom/orion/penkit/models/TextBoxInfo;", "Lo0oo0o/OooO0O0;", "", "id", "text", "", "textSize", "boxWidth", "boxHeight", "Landroid/graphics/RectF;", "bounds", "lineHeight", "", "backgroundColor", "layerId", "", C17625c.f52155b, "defaultTextColor", "Landroid/graphics/Matrix;", "localTransform", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFFLandroid/graphics/RectF;FILjava/lang/String;JILandroid/graphics/Matrix;)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "Landroid/graphics/Bitmap;", "bitmap", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;Landroid/graphics/Bitmap;F)V", "getItemType", "()I", "getId", "()Ljava/lang/String;", "getLayerId", "getCreationTime", "()J", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "getRotationDeg", "()F", "getUnRotatedBoundingBox", "()Landroid/graphics/RectF;", "penWidthScale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "dx", "dy", "offset", "(FF)V", "zoom", "", "(FZ)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Ljava/lang/String;J)Lo0oo0o/OooO0O0;", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "downCenter", "preCenter", "width", "pixelEraser", "LoO00ooO/OooOOO;", "", "onEraserEvent", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;FZF)LoO00ooO/OooOOO;", "", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "Landroid/content/Context;", "context", "isPlainText", "(Landroid/content/Context;)Z", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component11", "component12", "()Landroid/graphics/Matrix;", "copy", "(Ljava/lang/String;Ljava/lang/String;FFFLandroid/graphics/RectF;FILjava/lang/String;JILandroid/graphics/Matrix;)Lcom/orion/penkit/models/TextBoxInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "component9", "component10", "Ljava/lang/String;", "getText", "F", "getTextSize", "getBoxWidth", "setBoxWidth", "(F)V", "getBoxHeight", "setBoxHeight", "Landroid/graphics/RectF;", "getBounds", "getLineHeight", "I", "getBackgroundColor", "J", "getDefaultTextColor", "Landroid/graphics/Matrix;", "getLocalTransform", "Landroid/graphics/Bitmap;", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TextBoxInfo implements InterfaceC31284OooO0O0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "TextBoxDrawInfo";
    private final int backgroundColor;
    private Bitmap bitmap;
    private final RectF bounds;
    private float boxHeight;
    private float boxWidth;
    private final long creationTime;
    private final int defaultTextColor;
    private final String id;
    private final String layerId;
    private final float lineHeight;
    private final Matrix localTransform;
    private final String text;
    private final float textSize;

    @Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0005J:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/penkit/models/TextBoxInfo$Companion;", "", "<init>", "()V", "TAG", "", "applyTextStyleIntoParagraph", "plainText", "styleMap", "", "", "fromText", "Lcom/orion/penkit/models/TextBoxInfo;", "context", "Landroid/content/Context;", "lineHeight", "", "boxColor", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private final String applyTextStyleIntoParagraph(String plainText, Map<Integer, ? extends Object> styleMap) {
            ConverterTextToHtml converterTextToHtml = new ConverterTextToHtml();
            Object obj = styleMap.get(0);
            Boolean bool = Boolean.TRUE;
            if (OooOOO0.OooO0O0(obj, bool)) {
                plainText = converterTextToHtml.applyBoldStyle(plainText);
            }
            if (OooOOO0.OooO0O0(styleMap.get(1), bool)) {
                plainText = converterTextToHtml.applyItalicStyle(plainText);
            }
            if (OooOOO0.OooO0O0(styleMap.get(2), bool)) {
                plainText = converterTextToHtml.applyUnderlineStyle(plainText);
            }
            Object obj2 = styleMap.get(10);
            String str = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = styleMap.get(13);
            Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
            Object obj4 = styleMap.get(12);
            Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
            if (str != null || num != null || num2 != null) {
                if (OooOOO0.OooO0O0(str, "多种字体") || str == null) {
                    str = "";
                }
                plainText = converterTextToHtml.applyFontStyle(plainText, str, ((num != null && num.intValue() == -1) || num == null) ? 30 : num.intValue(), num2 != null ? num2.intValue() : ViewCompat.MEASURED_STATE_MASK);
            }
            if (OooOOO0.OooO0O0(styleMap.get(7), bool)) {
                plainText = converterTextToHtml.applyAlignLeftStyle(plainText);
            }
            if (OooOOO0.OooO0O0(styleMap.get(8), bool)) {
                plainText = converterTextToHtml.applyAlignCenterStyle(plainText);
            }
            return OooOOO0.OooO0O0(styleMap.get(9), bool) ? converterTextToHtml.applyAlignRightStyle(plainText) : plainText;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence fromText$lambda$1(Map map, String str) {
            Companion companion = TextBoxInfo.INSTANCE;
            OooOOO0.OooO0Oo(str);
            return companion.applyTextStyleIntoParagraph(str, map);
        }

        public final TextBoxInfo fromText(Context context, String plainText) {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(plainText, "plainText");
            return fromText(context, plainText, C34436OooOoOO.f123455OooOo0o, 1.0f, 0);
        }

        private Companion() {
        }

        public final TextBoxInfo fromText(Context context, String plainText, Map<Integer, ? extends Object> styleMap, float lineHeight, int boxColor) {
            Typeface typeface;
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(plainText, "plainText");
            OooOOO0.OooO0oO(styleMap, "styleMap");
            List listOoooOO0 = C33599OooOo0O.OoooOO0(plainText, new String[]{IOUtils.LINE_SEPARATOR_UNIX});
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOoooOO0, 10));
            Iterator it = listOoooOO0.iterator();
            while (it.hasNext()) {
                arrayList.add(Html.escapeHtml((String) it.next()));
            }
            RTHtml rTHtml = new RTHtml(OooOo.o000oOoO(arrayList, "", null, null, new OooO0o(styleMap, 0), 30));
            Object obj = styleMap.get(13);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 30;
            int i = iIntValue != -1 ? iIntValue : 30;
            Object obj2 = styleMap.get(10);
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                str = "";
            }
            RTTypeface typeface2 = FontManager.getTypeface(str.equals("多种字体") ? "" : str);
            TextPaint textPaint = new TextPaint();
            textPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
            textPaint.setTextSize(i);
            if (typeface2 == null || (typeface = typeface2.getTypeface()) == null) {
                typeface = Typeface.DEFAULT;
            }
            textPaint.setTypeface(typeface);
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int length = ((String) next).length();
                do {
                    Object next2 = it2.next();
                    int length2 = ((String) next2).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
            String str2 = (String) next;
            Companion companion = TextBoxInfo.INSTANCE;
            OooOOO0.OooO0Oo(str2);
            RTHtml rTHtml2 = new RTHtml(companion.applyTextStyleIntoParagraph(str2, styleMap));
            RTFormat.Spanned spanned = RTFormat.SPANNED;
            CharSequence text = rTHtml2.convertTo(context, spanned).getText();
            float fMeasureText = textPaint.measureText(text, 0, text.length()) + (textPaint.getTextSize() * 3);
            if (fMeasureText > 1240.0f) {
                fMeasureText = 1240.0f;
            }
            CharSequence text2 = rTHtml.convertTo(context, spanned).getText();
            C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
            OooOOO0.OooO0Oo(text2);
            c31237OooO0O0.getClass();
            StaticLayout staticLayoutOooO0OO = C31237OooO0O0.OooO0OO(context, text2, (int) fMeasureText, lineHeight, textPaint);
            float width = staticLayoutOooO0OO.getWidth();
            float height = staticLayoutOooO0OO.getHeight();
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            String strEscapeHtml = styleMap.isEmpty() ? Html.escapeHtml(plainText) : rTHtml.getText();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, TextBoxInfo.TAG, "plainText: ", plainText, ", html: ");
            sbOooO00o.append(strEscapeHtml);
            sbOooO00o.append(", boxWidth: ");
            sbOooO00o.append(width);
            sbOooO00o.append(", boxHeight: ");
            sbOooO00o.append(height);
            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
            String string = UUID.randomUUID().toString();
            OooOOO0.OooO0o(string, "toString(...)");
            OooOOO0.OooO0Oo(strEscapeHtml);
            return new TextBoxInfo(string, strEscapeHtml, textPaint.getTextSize(), width, height, rectF, lineHeight, boxColor, LayerInfo.UNSPECIFIED_LAYER_ID, 0L, ViewCompat.MEASURED_STATE_MASK, new Matrix(), 512, null);
        }
    }

    public TextBoxInfo(String id, String text, float f, float f2, float f3, RectF bounds, float f4, int i, String layerId, long j, int i2, Matrix localTransform) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(layerId, "layerId");
        OooOOO0.OooO0oO(localTransform, "localTransform");
        this.id = id;
        this.text = text;
        this.textSize = f;
        this.boxWidth = f2;
        this.boxHeight = f3;
        this.bounds = bounds;
        this.lineHeight = f4;
        this.backgroundColor = i;
        this.layerId = layerId;
        this.creationTime = j;
        this.defaultTextColor = i2;
        this.localTransform = localTransform;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final String getLayerId() {
        return this.layerId;
    }

    public static /* synthetic */ TextBoxInfo copy$default(TextBoxInfo textBoxInfo, String str, String str2, float f, float f2, float f3, RectF rectF, float f4, int i, String str3, long j, int i2, Matrix matrix, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = textBoxInfo.id;
        }
        return textBoxInfo.copy(str, (i3 & 2) != 0 ? textBoxInfo.text : str2, (i3 & 4) != 0 ? textBoxInfo.textSize : f, (i3 & 8) != 0 ? textBoxInfo.boxWidth : f2, (i3 & 16) != 0 ? textBoxInfo.boxHeight : f3, (i3 & 32) != 0 ? textBoxInfo.bounds : rectF, (i3 & 64) != 0 ? textBoxInfo.lineHeight : f4, (i3 & 128) != 0 ? textBoxInfo.backgroundColor : i, (i3 & 256) != 0 ? textBoxInfo.layerId : str3, (i3 & 512) != 0 ? textBoxInfo.creationTime : j, (i3 & 1024) != 0 ? textBoxInfo.defaultTextColor : i2, (i3 & 2048) != 0 ? textBoxInfo.localTransform : matrix);
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDefaultTextColor() {
        return this.defaultTextColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Matrix getLocalTransform() {
        return this.localTransform;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBoxWidth() {
        return this.boxWidth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getBoxHeight() {
        return this.boxHeight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextBoxInfo copy(String id, String text, float textSize, float boxWidth, float boxHeight, RectF bounds, float lineHeight, int backgroundColor, String layerId, long creationTime, int defaultTextColor, Matrix localTransform) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(layerId, "layerId");
        OooOOO0.OooO0oO(localTransform, "localTransform");
        return new TextBoxInfo(id, text, textSize, boxWidth, boxHeight, bounds, lineHeight, backgroundColor, layerId, creationTime, defaultTextColor, localTransform);
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
        if (!(other instanceof TextBoxInfo)) {
            return false;
        }
        TextBoxInfo textBoxInfo = (TextBoxInfo) other;
        return OooOOO0.OooO0O0(this.id, textBoxInfo.id) && OooOOO0.OooO0O0(this.text, textBoxInfo.text) && Float.compare(this.textSize, textBoxInfo.textSize) == 0 && Float.compare(this.boxWidth, textBoxInfo.boxWidth) == 0 && Float.compare(this.boxHeight, textBoxInfo.boxHeight) == 0 && OooOOO0.OooO0O0(this.bounds, textBoxInfo.bounds) && Float.compare(this.lineHeight, textBoxInfo.lineHeight) == 0 && this.backgroundColor == textBoxInfo.backgroundColor && OooOOO0.OooO0O0(this.layerId, textBoxInfo.layerId) && this.creationTime == textBoxInfo.creationTime && this.defaultTextColor == textBoxInfo.defaultTextColor && OooOOO0.OooO0O0(this.localTransform, textBoxInfo.localTransform);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        if (this.localTransform.isIdentity()) {
            return new RectF(this.bounds);
        }
        float rotationDeg = getRotationDeg();
        PointF pointF = new PointF(this.bounds.centerX(), this.bounds.centerY());
        Matrix matrix = new Matrix();
        matrix.setRotate(rotationDeg, pointF.x, pointF.y);
        RectF rectF = new RectF(this.bounds);
        matrix.mapRect(rectF);
        return rectF;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float f) {
        return getBoundingBox(f);
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    public final float getBoxHeight() {
        return this.boxHeight;
    }

    public final float getBoxWidth() {
        return this.boxWidth;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return this.creationTime;
    }

    public final int getDefaultTextColor() {
        return this.defaultTextColor;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return this.id;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return 4;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return this.layerId;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final Matrix getLocalTransform() {
        return this.localTransform;
    }

    public final float getRotationDeg() {
        if (this.localTransform.isIdentity()) {
            return 0.0f;
        }
        this.localTransform.getValues(new float[9]);
        return (float) Math.toDegrees(Math.atan2(r0[3], r0[0]));
    }

    public final String getText() {
        return this.text;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final RectF getUnRotatedBoundingBox() {
        return new RectF(this.bounds);
    }

    public int hashCode() {
        return this.localTransform.hashCode() + C20785Oooo00o.OooO00o(this.defaultTextColor, C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.backgroundColor, C20509OooO0oo.OooO0OO(this.lineHeight, C20424OooO0Oo.OooO0OO(this.bounds, C20509OooO0oo.OooO0OO(this.boxHeight, C20509OooO0oo.OooO0OO(this.boxWidth, C20509OooO0oo.OooO0OO(this.textSize, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.text), 31), 31), 31), 31), 31), 31), 31, this.layerId), 31, this.creationTime), 31);
    }

    public final boolean isPlainText(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return OooOOO0.OooO0O0(new RTHtml(this.text).convertTo(context, RTFormat.PLAIN_TEXT).getText(), this.text);
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
        List listOooO0o = o00OO0O0.OooO0O0.OooO0o(getBoundingBox(1.0f));
        List list = listOooO0o;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C25446OooO0Oo.OooO0oO((PointF) it.next(), polygon)) {
                    return true;
                }
            }
        }
        List<? extends PointF> list2 = polygon;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (C25446OooO0Oo.OooO0oO((PointF) it2.next(), listOooO0o)) {
                return true;
            }
        }
        return false;
    }

    public final <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, Bitmap bitmap, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        this.bitmap = bitmap;
        render(renderEngine, renderTarget, scale);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        this.localTransform.postRotate(r, 0.0f, 0.0f);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
        o00OO0O0.OooO0O0.OooOO0O(this.bounds, zoom);
    }

    public final void setBoxHeight(float f) {
        this.boxHeight = f;
    }

    public final void setBoxWidth(float f) {
        this.boxWidth = f;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        float f = this.textSize;
        float f2 = this.boxWidth;
        float f3 = this.boxHeight;
        RectF rectF = this.bounds;
        float f4 = this.lineHeight;
        int i = this.backgroundColor;
        String str3 = this.layerId;
        long j = this.creationTime;
        int i2 = this.defaultTextColor;
        Matrix matrix = this.localTransform;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("TextBoxInfo(id=", str, ", text=", str2, ", textSize=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", boxWidth=");
        sbOooO0O0.append(f2);
        sbOooO0O0.append(", boxHeight=");
        sbOooO0O0.append(f3);
        sbOooO0O0.append(", bounds=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", lineHeight=");
        sbOooO0O0.append(f4);
        sbOooO0O0.append(", backgroundColor=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", layerId=");
        OooO.OooO00o(j, str3, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(", defaultTextColor=");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(", localTransform=");
        sbOooO0O0.append(matrix);
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
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return copy$default(this, id, null, 0.0f, 0.0f, 0.0f, new RectF(this.bounds), 0.0f, 0, layerId, creationTime, 0, new Matrix(this.localTransform), 1246, null);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            renderEngine.OooOo0o(bitmap, getBoundingBox(1.0f), 0.0f);
        }
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        return copy$default(this, id, null, 0.0f, 0.0f, 0.0f, new RectF(bounds), 0.0f, 0, null, 0L, 0, new Matrix(this.localTransform), 2014, null);
    }

    public /* synthetic */ TextBoxInfo(String str, String str2, float f, float f2, float f3, RectF rectF, float f4, int i, String str3, long j, int i2, Matrix matrix, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, f, f2, f3, rectF, f4, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? LayerInfo.UNSPECIFIED_LAYER_ID : str3, (i3 & 512) != 0 ? System.currentTimeMillis() : j, (i3 & 1024) != 0 ? -16777216 : i2, (i3 & 2048) != 0 ? new Matrix() : matrix);
    }
}
