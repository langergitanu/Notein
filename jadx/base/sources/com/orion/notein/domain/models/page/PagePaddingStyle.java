package com.orion.notein.domain.models.page;

import android.graphics.Rect;
import android.graphics.RectF;
import com.google.gson.annotations.Expose;
import com.orion.notein.data.repo.backup.C22906OooOoo0;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import com.orion.notein.domain.models.papertheme.paperstyle.BlankPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.HollowDotPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.HollowLinePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.HollowPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.HollowSquarePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.HollowBlankThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.HollowDotThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.HollowLineThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.HollowSquareThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.HollowBlankTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.HollowDotTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.HollowLineTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.HollowSquareTwoColumnPaperStyle;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0OOOO00.OooOO0O;
import o0OOo00O.C27270OooO;
import o0OOo00O.C27271OooO00o;
import o0OOo00O.C27272OooO0O0;
import o0OOo00O.C27273OooO0OO;
import o0OOo00O.C27274OooO0Oo;
import o0OOo00O.C27275OooO0o;
import o0OOo00O.C27276OooO0o0;
import o0OOo00O.C27277OooO0oO;
import o0OOo00O.C27278OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00142\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\b\b\u0001\u0010%\u001a\u00020\"¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010)¨\u00068"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "theme", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "Lcom/orion/notein/domain/models/page/Page;", "page", "Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowPaperStyle;", "style", "Landroid/graphics/RectF;", "resolveHolePaddingRect", "(Lcom/orion/notein/domain/models/page/Page;Lcom/orion/notein/domain/models/papertheme/paperstyle/HollowPaperStyle;)Landroid/graphics/RectF;", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "Lkotlin/Function0;", "vertical", "horizontal", "selectByOrientation", "(Lcom/orion/notein/domain/models/page/PaperOrientation;LoO0O000o/OooO00o;LoO0O000o/OooO00o;)Landroid/graphics/RectF;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "oldPaperStyle", "", "paperWidth", "paperHeight", "dupPaperStyle", "(Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;FF)Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "Ljava/lang/Class;", "clz", "instantiatePaperStyle", "(Ljava/lang/Class;)Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "LoO00ooO/OooOOO;", "generatePaddingRenderRegion", "(Lcom/orion/notein/domain/models/page/Page;)LoO00ooO/OooOOO;", "", "getUniformColorIfApplicable", "()Ljava/lang/Integer;", "color", "withColorVariant", "(I)Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "component1", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "copy", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getTheme", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PagePaddingStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PagePaddingStyle DEFAULT = new PagePaddingStyle(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    public static final int DEFAULT_PADDING_COLOR = -1;

    @Expose
    private final PaperTheme theme;

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PagePaddingStyle$Companion;", "", "<init>", "()V", "DEFAULT_PADDING_COLOR", "", "DEFAULT", "Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "getDEFAULT", "()Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "uniform", "style", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "createByColor", "color", "createByTheme", "theme", "fromLegacyColor", "paddingColor", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private final PagePaddingStyle uniform(PaperTheme style) {
            return new PagePaddingStyle(style);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final PagePaddingStyle createByColor(int color) {
            ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, color, 1, 0 == true ? 1 : 0);
            ThemeCategory themeCategory = OooOO0O.f94356OooOO0;
            return uniform(new LambdaPaperTheme(colorPaperTheme, OooOO0O.f94361OooOOOO, PaperOrientation.VERTICAL, null, new BlankPaperStyle(), null, 40, null));
        }

        public final PagePaddingStyle createByTheme(PaperTheme theme) {
            OooOOO0.OooO0oO(theme, "theme");
            return uniform(theme);
        }

        public final PagePaddingStyle fromLegacyColor(int paddingColor) {
            return createByColor(paddingColor);
        }

        public final PagePaddingStyle getDEFAULT() {
            return PagePaddingStyle.DEFAULT;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagePaddingStyle() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PagePaddingStyle copy$default(PagePaddingStyle pagePaddingStyle, PaperTheme paperTheme, int i, Object obj) {
        if ((i & 1) != 0) {
            paperTheme = pagePaddingStyle.theme;
        }
        return pagePaddingStyle.copy(paperTheme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PaperStyle dupPaperStyle(PaperStyle oldPaperStyle, float paperWidth, float paperHeight) {
        if (oldPaperStyle instanceof HollowPaperStyle) {
            return ((HollowPaperStyle) oldPaperStyle).duplicate(paperWidth, paperHeight);
        }
        PaperStyle paperStyleInstantiatePaperStyle = instantiatePaperStyle(oldPaperStyle.getClass());
        paperStyleInstantiatePaperStyle.initSize(paperWidth, paperHeight, oldPaperStyle.getLeftPadding(), oldPaperStyle.getTopPadding(), oldPaperStyle.getRightPadding(), oldPaperStyle.getBottomPadding());
        return paperStyleInstantiatePaperStyle;
    }

    private final PaperStyle instantiatePaperStyle(Class<? extends PaperStyle> clz) {
        PaperStyle paperStyleOooO00o;
        try {
            Constructor<? extends PaperStyle> declaredConstructor = clz.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            paperStyleOooO00o = declaredConstructor.newInstance(new Object[0]);
        } catch (Throwable th) {
            paperStyleOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(paperStyleOooO00o);
        if (thOooO00o != null) {
            throw new IllegalStateException("Cannot instantiate PaperStyle: ".concat(clz.getName()), thOooO00o);
        }
        OooOOO0.OooO0o(paperStyleOooO00o, "getOrElse(...)");
        return (PaperStyle) paperStyleOooO00o;
    }

    private final RectF resolveHolePaddingRect(Page page, HollowPaperStyle style) {
        PaperOrientation orientation = page.getOrientation();
        RectF rectFSelectByOrientation = style instanceof HollowBlankThreeColumnPaperStyle ? selectByOrientation(orientation, new C27271OooO00o(), new C27272OooO0O0()) : style instanceof HollowBlankTwoColumnPaperStyle ? selectByOrientation(orientation, new C27273OooO0OO(), new C27274OooO0Oo()) : ((style instanceof HollowLinePaperStyle) || (style instanceof HollowLineTwoColumnPaperStyle) || (style instanceof HollowLineThreeColumnPaperStyle)) ? selectByOrientation(orientation, new C27276OooO0o0(), new C27275OooO0o()) : ((style instanceof HollowSquarePaperStyle) || (style instanceof HollowSquareTwoColumnPaperStyle) || (style instanceof HollowSquareThreeColumnPaperStyle)) ? selectByOrientation(orientation, new C27277OooO0oO(), new C27278OooO0oo()) : ((style instanceof HollowDotPaperStyle) || (style instanceof HollowDotTwoColumnPaperStyle) || (style instanceof HollowDotThreeColumnPaperStyle)) ? selectByOrientation(orientation, new C22906OooOoo0(1), new C27270OooO()) : style.getRenderPadding();
        RectF rectF = new RectF(rectFSelectByOrientation);
        if (!(style instanceof HollowDotPaperStyle) && !(style instanceof HollowSquarePaperStyle) && !(style instanceof HollowDotTwoColumnPaperStyle) && !(style instanceof HollowSquareTwoColumnPaperStyle) && !(style instanceof HollowDotThreeColumnPaperStyle) && !(style instanceof HollowSquareThreeColumnPaperStyle)) {
            return rectF;
        }
        float itemSpace = style.getItemSpace();
        PaperOrientation paperOrientation = PaperOrientation.VERTICAL;
        int width = orientation == paperOrientation ? PaperSpec.INSTANCE.getA4().getWidth() : PaperSpec.INSTANCE.getA4().getHeight();
        int height = orientation == paperOrientation ? PaperSpec.INSTANCE.getA4().getHeight() : PaperSpec.INSTANCE.getA4().getWidth();
        float f = (width - rectFSelectByOrientation.left) - rectFSelectByOrientation.right;
        float f2 = (f - (((int) (f / itemSpace)) * itemSpace)) / 2.0f;
        float f3 = (((height - rectFSelectByOrientation.top) - rectFSelectByOrientation.bottom) - (((int) (r5 / itemSpace)) * itemSpace)) / 2.0f;
        rectF.left += f2;
        rectF.top += f3;
        rectF.right += f2;
        rectF.bottom += f3;
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$0() {
        return PaperStyle.INSTANCE.getTHREE_LINE_V_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$1() {
        return PaperStyle.INSTANCE.getTHREE_LINE_H_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$2() {
        return PaperStyle.INSTANCE.getTWO_BLANK_STYLE_V_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$3() {
        return PaperStyle.INSTANCE.getTWO_BLANK_STYLE_H_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$4() {
        return PaperStyle.INSTANCE.getLINE_STYLE_V_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$5() {
        return PaperStyle.INSTANCE.getLINE_STYLE_H_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$6() {
        return PaperStyle.INSTANCE.getSQUARE_STYLE_V_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$7() {
        return PaperStyle.INSTANCE.getSQUARE_STYLE_H_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$8() {
        return PaperStyle.INSTANCE.getDOT_STYLE_V_PADDING();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectF resolveHolePaddingRect$lambda$9() {
        return PaperStyle.INSTANCE.getDOT_STYLE_H_PADDING();
    }

    private final RectF selectByOrientation(PaperOrientation orientation, OooO00o<? extends RectF> vertical, OooO00o<? extends RectF> horizontal) {
        return orientation == PaperOrientation.VERTICAL ? vertical.invoke() : horizontal.invoke();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaperTheme getTheme() {
        return this.theme;
    }

    public final PagePaddingStyle copy(PaperTheme theme) {
        OooOOO0.OooO0oO(theme, "theme");
        return new PagePaddingStyle(theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PagePaddingStyle) && OooOOO0.OooO0O0(this.theme, ((PagePaddingStyle) other).theme);
    }

    public final C32443OooOOO<RectF, PaperTheme> generatePaddingRenderRegion(Page page) {
        OooOOO0.OooO0oO(page, "page");
        C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
        float fIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
        float fIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
        Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
        RectF rectF = new RectF(0.0f, 0.0f, fIntValue, fIntValue2);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        Object objCopy$default = this.theme;
        if (objCopy$default instanceof LambdaPaperTheme) {
            LambdaPaperTheme lambdaPaperTheme = (LambdaPaperTheme) objCopy$default;
            PaperStyle paperStyleDupPaperStyle = dupPaperStyle(lambdaPaperTheme.getPaperStyle(), fWidth, fHeight);
            if (paperStyleDupPaperStyle instanceof HollowPaperStyle) {
                RectF rectF2 = new RectF(unrotatedPaperPadding.left, unrotatedPaperPadding.top, fIntValue - unrotatedPaperPadding.right, fIntValue2 - unrotatedPaperPadding.bottom);
                HollowPaperStyle hollowPaperStyle = (HollowPaperStyle) paperStyleDupPaperStyle;
                hollowPaperStyle.setHole(rectF2, resolveHolePaddingRect(page, hollowPaperStyle));
            }
            objCopy$default = LambdaPaperTheme.copy$default(lambdaPaperTheme, null, null, null, null, paperStyleDupPaperStyle, null, 47, null);
        }
        return new C32443OooOOO<>(rectF, objCopy$default);
    }

    public final PaperTheme getTheme() {
        return this.theme;
    }

    public final Integer getUniformColorIfApplicable() {
        PaperTheme paperTheme = this.theme;
        if (!(paperTheme instanceof LambdaPaperTheme)) {
            if (paperTheme instanceof ColorPaperTheme) {
                return Integer.valueOf(((ColorPaperTheme) paperTheme).getColor());
            }
            return null;
        }
        PaperTheme baseTheme = ((LambdaPaperTheme) paperTheme).getBaseTheme();
        ColorPaperTheme colorPaperTheme = baseTheme instanceof ColorPaperTheme ? (ColorPaperTheme) baseTheme : null;
        if (colorPaperTheme != null) {
            return Integer.valueOf(colorPaperTheme.getColor());
        }
        return null;
    }

    public int hashCode() {
        return this.theme.hashCode();
    }

    public String toString() {
        return "PagePaddingStyle(theme=" + this.theme + ")";
    }

    public final PagePaddingStyle withColorVariant(int color) {
        PaperTheme paperThemeCopy$default;
        PaperTheme paperTheme = this.theme;
        if (paperTheme instanceof LambdaPaperTheme) {
            LambdaPaperTheme lambdaPaperTheme = (LambdaPaperTheme) paperTheme;
            PaperTheme baseTheme = lambdaPaperTheme.getBaseTheme();
            paperThemeCopy$default = LambdaPaperTheme.copy$default(lambdaPaperTheme, baseTheme instanceof ColorPaperTheme ? ColorPaperTheme.copy$default((ColorPaperTheme) baseTheme, null, color, 1, null) : new ColorPaperTheme(baseTheme, color), null, null, null, null, null, 62, null);
        } else {
            if (!(paperTheme instanceof ColorPaperTheme)) {
                return this;
            }
            paperThemeCopy$default = ColorPaperTheme.copy$default((ColorPaperTheme) paperTheme, null, color, 1, null);
        }
        return copy(paperThemeCopy$default);
    }

    public PagePaddingStyle(PaperTheme theme) {
        OooOOO0.OooO0oO(theme, "theme");
        this.theme = theme;
    }

    public /* synthetic */ PagePaddingStyle(PaperTheme paperTheme, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? PagePaddingStyleKt.defaultPagePaddingTheme() : paperTheme);
    }
}
