package com.orion.notein.domain.models.papertheme.paperstyle;

import OooO.OooO00o;
import Oooo0.o000000O;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.gson.annotations.Expose;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.LineThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.SquareThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.BlankTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.DotTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.LineTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.SquareTwoColumnPaperStyle;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o00O0oo0.C24970OooOO0O;
import o0O0oo00.OooO0O0;
import oO00ooO.C32443OooOOO;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 ^2\u00020\u0001:\u0002^_BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J9\u0010)\u001a\u00020\u0016\"\u0004\b\u0000\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*JA\u0010)\u001a\u00020\u0016\"\u0004\b\u0000\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b)\u0010-J'\u00101\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020+2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J/\u00108\u001a\u0002072\u0006\u0010!\u001a\u00020 2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020+H\u0016¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b=\u0010>R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010?\u001a\u0004\bD\u0010A\"\u0004\bE\u0010CR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010F\u001a\u0004\bK\u0010H\"\u0004\bL\u0010JR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010F\u001a\u0004\bO\u0010H\"\u0004\bP\u0010JR?\u0010T\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001b0R0Qj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001b0R`S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\"\u0010X\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006`"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle;", "", "", "paperWidth", "paperHeight", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Landroid/content/res/Resources;", "res", "", "getName", "(Landroid/content/res/Resources;)Ljava/lang/String;", "w", C18773h.f57233c, "left", "top", "right", "bottom", "LoO00ooO/OooOooO;", "initSize", "Landroid/graphics/Path;", "key", "scale", "Landroid/graphics/Paint;", "getScaledPaint", "(Landroid/graphics/Path;F)Landroid/graphics/Paint;", "initPath", "()V", "Landroid/graphics/Canvas;", "canvas", "drawText", "(Landroid/graphics/Canvas;)V", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "Landroid/graphics/RectF;", "renderTargetViewport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;FLandroid/graphics/RectF;)V", "normRenderBounds", "Landroid/graphics/Matrix;", "transform", "drawPage", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Matrix;)V", "normRegionBounds", "", "regionWidthPx", "regionHeightPx", "", "drawRegion", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;II)Z", "getRenderPadding", "()Landroid/graphics/RectF;", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getPaperWidth", "()F", "setPaperWidth", "(F)V", "getPaperHeight", "setPaperHeight", "Ljava/lang/Float;", "getLeftPadding", "()Ljava/lang/Float;", "setLeftPadding", "(Ljava/lang/Float;)V", "getTopPadding", "setTopPadding", "getRightPadding", "setRightPadding", "getBottomPadding", "setBottomPadding", "Ljava/util/ArrayList;", "LoO00ooO/OooOOO;", "Lkotlin/collections/ArrayList;", "pathList", "Ljava/util/ArrayList;", "getPathList", "()Ljava/util/ArrayList;", "defaultColor", "I", "getDefaultColor", "()I", "setDefaultColor", "(I)V", "Companion", "EditablePaperStyle", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class PaperStyle {
    private static final RectF ACCENTURE_H_PADDING;
    private static final AccenturePaperStyle ACCENTURE_PAPER_H;
    private static final AccenturePaperStyle ACCENTURE_PAPER_V;
    private static final RectF ACCENTURE_V_PADDING;
    private static final BlankPaperStyle BLANK_PAPER;
    private static final NewCornellPaperStyle CORNELL_PAPER_H;
    private static final NewCornellPaperStyle CORNELL_PAPER_V;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final float DEFAULT_FOREGROUND_ALPHA;
    private static final float DEFAULT_REQUIRED_ITEM_SPACE;
    private static final NewDotPaperStyle DOT_PAPER_H;
    private static final NewDotPaperStyle DOT_PAPER_V;
    private static final RectF DOT_STYLE_H_PADDING;
    private static final RectF DOT_STYLE_V_PADDING;
    private static final NewLawPaperStyle LAW_PAPER_H;
    private static final NewLawPaperStyle LAW_PAPER_V;
    private static final NewLinePaperStyle LINE_PAPER_H;
    private static final NewLinePaperStyle LINE_PAPER_V;
    private static final float LONG_SIDE_SIZE;
    private static final MusicPaperStyle MUSIC_PAPER;
    private static final NonePaperStyle NONE_PAPER;
    private static final float SHORT_SIDE_SIZE;
    private static final NewSquarePaperStyle SQUARE_PAPER_H;
    private static final NewSquarePaperStyle SQUARE_PAPER_V;
    private static final RectF SQUARE_STYLE_H_PADDING;
    private static final RectF SQUARE_STYLE_V_PADDING;
    private static final LineThreeColumnPaperStyle THREE_LINE_PAPER_FLIP_H;
    private static final LineThreeColumnPaperStyle THREE_LINE_PAPER_FLIP_V;
    private static final LineThreeColumnPaperStyle THREE_LINE_PAPER_H;
    private static final LineThreeColumnPaperStyle THREE_LINE_PAPER_V;
    private static final SquareThreeColumnPaperStyle THREE_SQUARE_PAPER_FLIP_H;
    private static final SquareThreeColumnPaperStyle THREE_SQUARE_PAPER_FLIP_V;
    private static final SquareThreeColumnPaperStyle THREE_SQUARE_PAPER_H;
    private static final SquareThreeColumnPaperStyle THREE_SQUARE_PAPER_V;
    private static final BlankTwoColumnPaperStyle TWO_BLANK_PAPER_H;
    private static final BlankTwoColumnPaperStyle TWO_BLANK_PAPER_V;
    private static final DotTwoColumnPaperStyle TWO_DOT_PAPER_H;
    private static final DotTwoColumnPaperStyle TWO_DOT_PAPER_V;
    private static final LineTwoColumnPaperStyle TWO_LINE_PAPER_H;
    private static final LineTwoColumnPaperStyle TWO_LINE_PAPER_V;
    private static final SquareTwoColumnPaperStyle TWO_SQUARE_PAPER_H;
    private static final SquareTwoColumnPaperStyle TWO_SQUARE_PAPER_V;
    private static final UnboundedDotPaperStyle UNBOUNDED_DOT_PAPER;
    private static final UnboundedLinePaperStyle UNBOUNDED_LINE_PAPER;
    private static final UnboundedSquarePaperStyle UNBOUNDED_SQUARE_PAPER;

    @Expose
    private Float bottomPadding;
    private int defaultColor;

    @Expose
    private Float leftPadding;

    @Expose
    private float paperHeight;

    @Expose
    private float paperWidth;
    private final ArrayList<C32443OooOOO<Path, Paint>> pathList;

    @Expose
    private Float rightPadding;

    @Expose
    private Float topPadding;

    @Metadata(m80611d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010\fR\u0011\u0010!\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0011\u0010#\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\fR\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\fR\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\fR\u0011\u0010-\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010\fR\u0011\u0010/\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\fR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\fR\u0011\u00103\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u0010\fR\u0011\u00105\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u0010\fR\u0011\u00107\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u0010\fR\u0011\u00109\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010\fR\u0011\u0010;\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b<\u0010\fR\u0011\u0010=\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b>\u0010\fR\u000e\u0010?\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010I\u001a\u00020F¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0011\u0010K\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bP\u0010NR\u0011\u0010Q\u001a\u00020R¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010U\u001a\u00020R¢\u0006\b\n\u0000\u001a\u0004\bV\u0010TR\u0011\u0010W\u001a\u00020X¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010[\u001a\u00020X¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010ZR\u0011\u0010]\u001a\u00020^¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010a\u001a\u00020^¢\u0006\b\n\u0000\u001a\u0004\bb\u0010`R\u0011\u0010c\u001a\u00020d¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010g\u001a\u00020d¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u0011\u0010i\u001a\u00020j¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0011\u0010m\u001a\u00020j¢\u0006\b\n\u0000\u001a\u0004\bn\u0010lR\u0011\u0010o\u001a\u00020p¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0011\u0010s\u001a\u00020p¢\u0006\b\n\u0000\u001a\u0004\bt\u0010rR\u0011\u0010u\u001a\u00020v¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0011\u0010y\u001a\u00020v¢\u0006\b\n\u0000\u001a\u0004\bz\u0010xR\u0011\u0010{\u001a\u00020|¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0012\u0010\u007f\u001a\u00020|¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010~R\u0013\u0010\u0081\u0001\u001a\u00020|¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010~R\u0013\u0010\u0083\u0001\u001a\u00020|¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010~R\u0015\u0010\u0085\u0001\u001a\u00030\u0086\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010\u0089\u0001\u001a\u00030\u0086\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0015\u0010\u008b\u0001\u001a\u00030\u0086\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0015\u0010\u008d\u0001\u001a\u00030\u0086\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u0088\u0001R\u0015\u0010\u008f\u0001\u001a\u00030\u0090\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0093\u0001\u001a\u00030\u0090\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u0015\u0010\u0095\u0001\u001a\u00030\u0096\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u0010\u0099\u0001\u001a\u00030\u009a\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0015\u0010\u009d\u0001\u001a\u00030\u009e\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0015\u0010¡\u0001\u001a\u00030¢\u0001¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001R\u0015\u0010¥\u0001\u001a\u00030¦\u0001¢\u0006\n\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001¨\u0006©\u0001"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle$Companion;", "", "<init>", "()V", "SHORT_SIDE_SIZE", "", "LONG_SIDE_SIZE", "DEFAULT_FOREGROUND_ALPHA", "DEFAULT_REQUIRED_ITEM_SPACE", "LINE_STYLE_V_PADDING", "Landroid/graphics/RectF;", "getLINE_STYLE_V_PADDING", "()Landroid/graphics/RectF;", "LINE_STYLE_H_PADDING", "getLINE_STYLE_H_PADDING", "SQUARE_STYLE_V_PADDING", "getSQUARE_STYLE_V_PADDING", "SQUARE_STYLE_H_PADDING", "getSQUARE_STYLE_H_PADDING", "DOT_STYLE_V_PADDING", "getDOT_STYLE_V_PADDING", "DOT_STYLE_H_PADDING", "getDOT_STYLE_H_PADDING", "LAW_STYLE_V_PADDING", "getLAW_STYLE_V_PADDING", "LAW_STYLE_H_PADDING", "getLAW_STYLE_H_PADDING", "TWO_LINE_STYLE_V_PADDING", "getTWO_LINE_STYLE_V_PADDING", "TWO_LINE_STYLE_H_PADDING", "getTWO_LINE_STYLE_H_PADDING", "TWO_BLANK_STYLE_V_PADDING", "getTWO_BLANK_STYLE_V_PADDING", "TWO_BLANK_STYLE_H_PADDING", "getTWO_BLANK_STYLE_H_PADDING", "TWO_SQUARE_STYLE_V_PADDING", "getTWO_SQUARE_STYLE_V_PADDING", "TWO_SQUARE_STYLE_H_PADDING", "getTWO_SQUARE_STYLE_H_PADDING", "TWO_DOT_STYLE_V_PADDING", "getTWO_DOT_STYLE_V_PADDING", "TWO_DOT_STYLE_H_PADDING", "getTWO_DOT_STYLE_H_PADDING", "CORNELL_V_PADDING", "getCORNELL_V_PADDING", "CORNELL_H_PADDING", "getCORNELL_H_PADDING", "THREE_LINE_V_PADDING", "getTHREE_LINE_V_PADDING", "THREE_LINE_H_PADDING", "getTHREE_LINE_H_PADDING", "THREE_LINE_V_FLIP_PADDING", "getTHREE_LINE_V_FLIP_PADDING", "THREE_LINE_H_FLIP_PADDING", "getTHREE_LINE_H_FLIP_PADDING", "THREE_SQUARE_V_PADDING", "getTHREE_SQUARE_V_PADDING", "THREE_SQUARE_H_PADDING", "getTHREE_SQUARE_H_PADDING", "THREE_SQUARE_V_FLIP_PADDING", "getTHREE_SQUARE_V_FLIP_PADDING", "THREE_SQUARE_H_FLIP_PADDING", "getTHREE_SQUARE_H_FLIP_PADDING", "ACCENTURE_V_PADDING", "ACCENTURE_H_PADDING", "BLANK_PAPER", "Lcom/orion/notein/domain/models/papertheme/paperstyle/BlankPaperStyle;", "getBLANK_PAPER", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/BlankPaperStyle;", "LINE_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewLinePaperStyle;", "getLINE_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NewLinePaperStyle;", "LINE_PAPER_H", "getLINE_PAPER_H", "SQUARE_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewSquarePaperStyle;", "getSQUARE_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NewSquarePaperStyle;", "SQUARE_PAPER_H", "getSQUARE_PAPER_H", "DOT_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewDotPaperStyle;", "getDOT_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NewDotPaperStyle;", "DOT_PAPER_H", "getDOT_PAPER_H", "LAW_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewLawPaperStyle;", "getLAW_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NewLawPaperStyle;", "LAW_PAPER_H", "getLAW_PAPER_H", "TWO_LINE_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/LineTwoColumnPaperStyle;", "getTWO_LINE_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/LineTwoColumnPaperStyle;", "TWO_LINE_PAPER_H", "getTWO_LINE_PAPER_H", "TWO_BLANK_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/BlankTwoColumnPaperStyle;", "getTWO_BLANK_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/BlankTwoColumnPaperStyle;", "TWO_BLANK_PAPER_H", "getTWO_BLANK_PAPER_H", "TWO_SQUARE_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/SquareTwoColumnPaperStyle;", "getTWO_SQUARE_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/SquareTwoColumnPaperStyle;", "TWO_SQUARE_PAPER_H", "getTWO_SQUARE_PAPER_H", "TWO_DOT_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/DotTwoColumnPaperStyle;", "getTWO_DOT_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/twocolumns/DotTwoColumnPaperStyle;", "TWO_DOT_PAPER_H", "getTWO_DOT_PAPER_H", "CORNELL_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NewCornellPaperStyle;", "getCORNELL_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NewCornellPaperStyle;", "CORNELL_PAPER_H", "getCORNELL_PAPER_H", "THREE_LINE_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/LineThreeColumnPaperStyle;", "getTHREE_LINE_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/LineThreeColumnPaperStyle;", "THREE_LINE_PAPER_H", "getTHREE_LINE_PAPER_H", "THREE_LINE_PAPER_FLIP_V", "getTHREE_LINE_PAPER_FLIP_V", "THREE_LINE_PAPER_FLIP_H", "getTHREE_LINE_PAPER_FLIP_H", "THREE_SQUARE_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/SquareThreeColumnPaperStyle;", "getTHREE_SQUARE_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/SquareThreeColumnPaperStyle;", "THREE_SQUARE_PAPER_H", "getTHREE_SQUARE_PAPER_H", "THREE_SQUARE_PAPER_FLIP_V", "getTHREE_SQUARE_PAPER_FLIP_V", "THREE_SQUARE_PAPER_FLIP_H", "getTHREE_SQUARE_PAPER_FLIP_H", "ACCENTURE_PAPER_V", "Lcom/orion/notein/domain/models/papertheme/paperstyle/AccenturePaperStyle;", "getACCENTURE_PAPER_V", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/AccenturePaperStyle;", "ACCENTURE_PAPER_H", "getACCENTURE_PAPER_H", "UNBOUNDED_DOT_PAPER", "Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedDotPaperStyle;", "getUNBOUNDED_DOT_PAPER", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedDotPaperStyle;", "UNBOUNDED_SQUARE_PAPER", "Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedSquarePaperStyle;", "getUNBOUNDED_SQUARE_PAPER", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedSquarePaperStyle;", "UNBOUNDED_LINE_PAPER", "Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedLinePaperStyle;", "getUNBOUNDED_LINE_PAPER", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/UnboundedLinePaperStyle;", "MUSIC_PAPER", "Lcom/orion/notein/domain/models/papertheme/paperstyle/MusicPaperStyle;", "getMUSIC_PAPER", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/MusicPaperStyle;", "NONE_PAPER", "Lcom/orion/notein/domain/models/papertheme/paperstyle/NonePaperStyle;", "getNONE_PAPER", "()Lcom/orion/notein/domain/models/papertheme/paperstyle/NonePaperStyle;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final AccenturePaperStyle getACCENTURE_PAPER_H() {
            return PaperStyle.ACCENTURE_PAPER_H;
        }

        public final AccenturePaperStyle getACCENTURE_PAPER_V() {
            return PaperStyle.ACCENTURE_PAPER_V;
        }

        public final BlankPaperStyle getBLANK_PAPER() {
            return PaperStyle.BLANK_PAPER;
        }

        public final RectF getCORNELL_H_PADDING() {
            return getLINE_STYLE_H_PADDING();
        }

        public final NewCornellPaperStyle getCORNELL_PAPER_H() {
            return PaperStyle.CORNELL_PAPER_H;
        }

        public final NewCornellPaperStyle getCORNELL_PAPER_V() {
            return PaperStyle.CORNELL_PAPER_V;
        }

        public final RectF getCORNELL_V_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final NewDotPaperStyle getDOT_PAPER_H() {
            return PaperStyle.DOT_PAPER_H;
        }

        public final NewDotPaperStyle getDOT_PAPER_V() {
            return PaperStyle.DOT_PAPER_V;
        }

        public final RectF getDOT_STYLE_H_PADDING() {
            return PaperStyle.DOT_STYLE_H_PADDING;
        }

        public final RectF getDOT_STYLE_V_PADDING() {
            return PaperStyle.DOT_STYLE_V_PADDING;
        }

        public final NewLawPaperStyle getLAW_PAPER_H() {
            return PaperStyle.LAW_PAPER_H;
        }

        public final NewLawPaperStyle getLAW_PAPER_V() {
            return PaperStyle.LAW_PAPER_V;
        }

        public final RectF getLAW_STYLE_H_PADDING() {
            return getLINE_STYLE_H_PADDING();
        }

        public final RectF getLAW_STYLE_V_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final NewLinePaperStyle getLINE_PAPER_H() {
            return PaperStyle.LINE_PAPER_H;
        }

        public final NewLinePaperStyle getLINE_PAPER_V() {
            return PaperStyle.LINE_PAPER_V;
        }

        public final RectF getLINE_STYLE_H_PADDING() {
            return new RectF(o000000O.OooO0oO(26), o000000O.OooO0oO(63), o000000O.OooO0oO(26), o000000O.OooO0oO(36));
        }

        public final RectF getLINE_STYLE_V_PADDING() {
            return new RectF(o000000O.OooO0oO(22), o000000O.OooO0oO(63), o000000O.OooO0oO(22), o000000O.OooO0oO(24));
        }

        public final MusicPaperStyle getMUSIC_PAPER() {
            return PaperStyle.MUSIC_PAPER;
        }

        public final NonePaperStyle getNONE_PAPER() {
            return PaperStyle.NONE_PAPER;
        }

        public final NewSquarePaperStyle getSQUARE_PAPER_H() {
            return PaperStyle.SQUARE_PAPER_H;
        }

        public final NewSquarePaperStyle getSQUARE_PAPER_V() {
            return PaperStyle.SQUARE_PAPER_V;
        }

        public final RectF getSQUARE_STYLE_H_PADDING() {
            return PaperStyle.SQUARE_STYLE_H_PADDING;
        }

        public final RectF getSQUARE_STYLE_V_PADDING() {
            return PaperStyle.SQUARE_STYLE_V_PADDING;
        }

        public final RectF getTHREE_LINE_H_FLIP_PADDING() {
            return getLINE_STYLE_H_PADDING();
        }

        public final RectF getTHREE_LINE_H_PADDING() {
            return getLINE_STYLE_H_PADDING();
        }

        public final LineThreeColumnPaperStyle getTHREE_LINE_PAPER_FLIP_H() {
            return PaperStyle.THREE_LINE_PAPER_FLIP_H;
        }

        public final LineThreeColumnPaperStyle getTHREE_LINE_PAPER_FLIP_V() {
            return PaperStyle.THREE_LINE_PAPER_FLIP_V;
        }

        public final LineThreeColumnPaperStyle getTHREE_LINE_PAPER_H() {
            return PaperStyle.THREE_LINE_PAPER_H;
        }

        public final LineThreeColumnPaperStyle getTHREE_LINE_PAPER_V() {
            return PaperStyle.THREE_LINE_PAPER_V;
        }

        public final RectF getTHREE_LINE_V_FLIP_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final RectF getTHREE_LINE_V_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final RectF getTHREE_SQUARE_H_FLIP_PADDING() {
            return getTHREE_SQUARE_H_PADDING();
        }

        public final RectF getTHREE_SQUARE_H_PADDING() {
            return new RectF(o000000O.OooO0oO(18), o000000O.OooO0oO(63), o000000O.OooO0oO(18), o000000O.OooO0oO(36));
        }

        public final SquareThreeColumnPaperStyle getTHREE_SQUARE_PAPER_FLIP_H() {
            return PaperStyle.THREE_SQUARE_PAPER_FLIP_H;
        }

        public final SquareThreeColumnPaperStyle getTHREE_SQUARE_PAPER_FLIP_V() {
            return PaperStyle.THREE_SQUARE_PAPER_FLIP_V;
        }

        public final SquareThreeColumnPaperStyle getTHREE_SQUARE_PAPER_H() {
            return PaperStyle.THREE_SQUARE_PAPER_H;
        }

        public final SquareThreeColumnPaperStyle getTHREE_SQUARE_PAPER_V() {
            return PaperStyle.THREE_SQUARE_PAPER_V;
        }

        public final RectF getTHREE_SQUARE_V_FLIP_PADDING() {
            return getTHREE_SQUARE_V_PADDING();
        }

        public final RectF getTHREE_SQUARE_V_PADDING() {
            return new RectF(o000000O.OooO0oO(23), o000000O.OooO0oO(63), o000000O.OooO0oO(23), o000000O.OooO0oO(24));
        }

        public final BlankTwoColumnPaperStyle getTWO_BLANK_PAPER_H() {
            return PaperStyle.TWO_BLANK_PAPER_H;
        }

        public final BlankTwoColumnPaperStyle getTWO_BLANK_PAPER_V() {
            return PaperStyle.TWO_BLANK_PAPER_V;
        }

        public final RectF getTWO_BLANK_STYLE_H_PADDING() {
            return getLINE_STYLE_H_PADDING();
        }

        public final RectF getTWO_BLANK_STYLE_V_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final DotTwoColumnPaperStyle getTWO_DOT_PAPER_H() {
            return PaperStyle.TWO_DOT_PAPER_H;
        }

        public final DotTwoColumnPaperStyle getTWO_DOT_PAPER_V() {
            return PaperStyle.TWO_DOT_PAPER_V;
        }

        public final RectF getTWO_DOT_STYLE_H_PADDING() {
            return getLINE_STYLE_H_PADDING();
        }

        public final RectF getTWO_DOT_STYLE_V_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final LineTwoColumnPaperStyle getTWO_LINE_PAPER_H() {
            return PaperStyle.TWO_LINE_PAPER_H;
        }

        public final LineTwoColumnPaperStyle getTWO_LINE_PAPER_V() {
            return PaperStyle.TWO_LINE_PAPER_V;
        }

        public final RectF getTWO_LINE_STYLE_H_PADDING() {
            return getLINE_STYLE_H_PADDING();
        }

        public final RectF getTWO_LINE_STYLE_V_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final SquareTwoColumnPaperStyle getTWO_SQUARE_PAPER_H() {
            return PaperStyle.TWO_SQUARE_PAPER_H;
        }

        public final SquareTwoColumnPaperStyle getTWO_SQUARE_PAPER_V() {
            return PaperStyle.TWO_SQUARE_PAPER_V;
        }

        public final RectF getTWO_SQUARE_STYLE_H_PADDING() {
            return new RectF(o000000O.OooO0oO(18), o000000O.OooO0oO(63), o000000O.OooO0oO(10), o000000O.OooO0oO(18));
        }

        public final RectF getTWO_SQUARE_STYLE_V_PADDING() {
            return getLINE_STYLE_V_PADDING();
        }

        public final UnboundedDotPaperStyle getUNBOUNDED_DOT_PAPER() {
            return PaperStyle.UNBOUNDED_DOT_PAPER;
        }

        public final UnboundedLinePaperStyle getUNBOUNDED_LINE_PAPER() {
            return PaperStyle.UNBOUNDED_LINE_PAPER;
        }

        public final UnboundedSquarePaperStyle getUNBOUNDED_SQUARE_PAPER() {
            return PaperStyle.UNBOUNDED_SQUARE_PAPER;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/PaperStyle$EditablePaperStyle;", "", "<init>", "(Ljava/lang/String;I)V", "BLANK", "LINE", "SQUARE", "DOT", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class EditablePaperStyle {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ EditablePaperStyle[] $VALUES;
        public static final EditablePaperStyle BLANK = new EditablePaperStyle("BLANK", 0);
        public static final EditablePaperStyle LINE = new EditablePaperStyle("LINE", 1);
        public static final EditablePaperStyle SQUARE = new EditablePaperStyle("SQUARE", 2);
        public static final EditablePaperStyle DOT = new EditablePaperStyle("DOT", 3);

        private static final /* synthetic */ EditablePaperStyle[] $values() {
            return new EditablePaperStyle[]{BLANK, LINE, SQUARE, DOT};
        }

        static {
            EditablePaperStyle[] editablePaperStyleArr$values = $values();
            $VALUES = editablePaperStyleArr$values;
            $ENTRIES = OooO00o.OooO0O0(editablePaperStyleArr$values);
        }

        private EditablePaperStyle(String str, int i) {
        }

        public static InterfaceC34452OooO00o<EditablePaperStyle> getEntries() {
            return $ENTRIES;
        }

        public static EditablePaperStyle valueOf(String str) {
            return (EditablePaperStyle) Enum.valueOf(EditablePaperStyle.class, str);
        }

        public static EditablePaperStyle[] values() {
            return (EditablePaperStyle[]) $VALUES.clone();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        PaperSpec.Companion companion2 = PaperSpec.INSTANCE;
        float width = companion2.getA4().getWidth();
        SHORT_SIDE_SIZE = width;
        float height = companion2.getA4().getHeight();
        LONG_SIDE_SIZE = height;
        Float fValueOf = Float.valueOf(1.0f);
        DEFAULT_FOREGROUND_ALPHA = 1.0f;
        float fOooO0oO = o000000O.OooO0oO(25);
        DEFAULT_REQUIRED_ITEM_SPACE = fOooO0oO;
        RectF rectF = new RectF(o000000O.OooO0oO(18), o000000O.OooO0oO(9), o000000O.OooO0oO(18), o000000O.OooO0oO(9));
        SQUARE_STYLE_V_PADDING = rectF;
        RectF rectF2 = new RectF(o000000O.OooO0oO(10), o000000O.OooO0oO(18), o000000O.OooO0oO(10), o000000O.OooO0oO(18));
        SQUARE_STYLE_H_PADDING = rectF2;
        RectF rectF3 = new RectF(o000000O.OooO0oO(23), o000000O.OooO0oO(25), o000000O.OooO0oO(23), o000000O.OooO0oO(25));
        DOT_STYLE_V_PADDING = rectF3;
        RectF rectF4 = new RectF(o000000O.OooO0oO(26), o000000O.OooO0oO(24), o000000O.OooO0oO(26), o000000O.OooO0oO(24));
        DOT_STYLE_H_PADDING = rectF4;
        RectF line_style_v_padding = companion.getLINE_STYLE_V_PADDING();
        ACCENTURE_V_PADDING = line_style_v_padding;
        RectF line_style_h_padding = companion.getLINE_STYLE_H_PADDING();
        ACCENTURE_H_PADDING = line_style_h_padding;
        BlankPaperStyle blankPaperStyle = new BlankPaperStyle();
        blankPaperStyle.setPaperWidth(width);
        blankPaperStyle.setPaperHeight(height);
        BLANK_PAPER = blankPaperStyle;
        LINE_PAPER_V = new NewLinePaperStyle(width, height, fValueOf, Float.valueOf(fOooO0oO), Float.valueOf(companion.getLINE_STYLE_V_PADDING().left), Float.valueOf(companion.getLINE_STYLE_V_PADDING().top), Float.valueOf(companion.getLINE_STYLE_V_PADDING().right), Float.valueOf(companion.getLINE_STYLE_V_PADDING().bottom));
        LINE_PAPER_H = new NewLinePaperStyle(height, width, fValueOf, Float.valueOf(fOooO0oO), Float.valueOf(companion.getLINE_STYLE_H_PADDING().left), Float.valueOf(companion.getLINE_STYLE_H_PADDING().top), Float.valueOf(companion.getLINE_STYLE_H_PADDING().right), Float.valueOf(companion.getLINE_STYLE_H_PADDING().bottom));
        SQUARE_PAPER_V = new NewSquarePaperStyle(width, height, fValueOf, Float.valueOf(fOooO0oO), Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom));
        SQUARE_PAPER_H = new NewSquarePaperStyle(height, width, fValueOf, Float.valueOf(fOooO0oO), Float.valueOf(rectF2.left), Float.valueOf(rectF2.top), Float.valueOf(rectF2.right), Float.valueOf(rectF2.bottom));
        DOT_PAPER_V = new NewDotPaperStyle(width, height, fValueOf, Float.valueOf(fOooO0oO), Float.valueOf(rectF3.left), Float.valueOf(rectF3.top), Float.valueOf(rectF3.right), Float.valueOf(rectF3.bottom));
        DOT_PAPER_H = new NewDotPaperStyle(height, width, fValueOf, Float.valueOf(fOooO0oO), Float.valueOf(rectF4.left), Float.valueOf(rectF4.top), Float.valueOf(rectF4.right), Float.valueOf(rectF4.bottom));
        LAW_PAPER_V = new NewLawPaperStyle(width, height, Float.valueOf(companion.getLAW_STYLE_V_PADDING().left), Float.valueOf(companion.getLAW_STYLE_V_PADDING().top), Float.valueOf(companion.getLAW_STYLE_V_PADDING().right), Float.valueOf(companion.getLAW_STYLE_V_PADDING().bottom));
        LAW_PAPER_H = new NewLawPaperStyle(height, width, Float.valueOf(companion.getLAW_STYLE_H_PADDING().left), Float.valueOf(companion.getLAW_STYLE_H_PADDING().top), Float.valueOf(companion.getLAW_STYLE_H_PADDING().right), Float.valueOf(companion.getLAW_STYLE_H_PADDING().bottom));
        TWO_LINE_PAPER_V = new LineTwoColumnPaperStyle(width, height, Float.valueOf(companion.getTWO_LINE_STYLE_V_PADDING().left), Float.valueOf(companion.getTWO_LINE_STYLE_V_PADDING().top), Float.valueOf(companion.getTWO_LINE_STYLE_V_PADDING().right), Float.valueOf(companion.getTWO_LINE_STYLE_V_PADDING().bottom));
        TWO_LINE_PAPER_H = new LineTwoColumnPaperStyle(height, width, Float.valueOf(companion.getTWO_LINE_STYLE_H_PADDING().left), Float.valueOf(companion.getTWO_LINE_STYLE_H_PADDING().top), Float.valueOf(companion.getTWO_LINE_STYLE_H_PADDING().right), Float.valueOf(companion.getTWO_LINE_STYLE_H_PADDING().bottom));
        TWO_BLANK_PAPER_V = new BlankTwoColumnPaperStyle(width, height, Float.valueOf(companion.getTWO_BLANK_STYLE_V_PADDING().left), Float.valueOf(companion.getTWO_BLANK_STYLE_V_PADDING().top), Float.valueOf(companion.getTWO_BLANK_STYLE_V_PADDING().right), Float.valueOf(companion.getTWO_BLANK_STYLE_V_PADDING().bottom));
        TWO_BLANK_PAPER_H = new BlankTwoColumnPaperStyle(height, width, Float.valueOf(companion.getTWO_BLANK_STYLE_H_PADDING().left), Float.valueOf(companion.getTWO_BLANK_STYLE_V_PADDING().top), Float.valueOf(companion.getTWO_BLANK_STYLE_V_PADDING().right), Float.valueOf(companion.getTWO_BLANK_STYLE_V_PADDING().bottom));
        TWO_SQUARE_PAPER_V = new SquareTwoColumnPaperStyle(width, height, Float.valueOf(companion.getTWO_SQUARE_STYLE_V_PADDING().left), Float.valueOf(companion.getTWO_SQUARE_STYLE_V_PADDING().top), Float.valueOf(companion.getTWO_SQUARE_STYLE_V_PADDING().right), Float.valueOf(companion.getTWO_SQUARE_STYLE_V_PADDING().bottom));
        TWO_SQUARE_PAPER_H = new SquareTwoColumnPaperStyle(height, width, Float.valueOf(companion.getTWO_SQUARE_STYLE_H_PADDING().left), Float.valueOf(companion.getTWO_SQUARE_STYLE_H_PADDING().top), Float.valueOf(companion.getTWO_SQUARE_STYLE_H_PADDING().right), Float.valueOf(companion.getTWO_SQUARE_STYLE_H_PADDING().bottom));
        TWO_DOT_PAPER_V = new DotTwoColumnPaperStyle(width, height, Float.valueOf(companion.getTWO_DOT_STYLE_V_PADDING().left), Float.valueOf(companion.getTWO_DOT_STYLE_V_PADDING().top), Float.valueOf(companion.getTWO_DOT_STYLE_V_PADDING().right), Float.valueOf(companion.getTWO_DOT_STYLE_V_PADDING().bottom));
        TWO_DOT_PAPER_H = new DotTwoColumnPaperStyle(height, width, Float.valueOf(companion.getTWO_DOT_STYLE_H_PADDING().left), Float.valueOf(companion.getTWO_DOT_STYLE_H_PADDING().top), Float.valueOf(companion.getTWO_DOT_STYLE_H_PADDING().right), Float.valueOf(companion.getTWO_DOT_STYLE_H_PADDING().bottom));
        CORNELL_PAPER_V = new NewCornellPaperStyle(width, height, Float.valueOf(companion.getCORNELL_V_PADDING().left), Float.valueOf(companion.getCORNELL_V_PADDING().top), Float.valueOf(companion.getCORNELL_V_PADDING().right), Float.valueOf(companion.getCORNELL_V_PADDING().bottom));
        CORNELL_PAPER_H = new NewCornellPaperStyle(height, width, Float.valueOf(companion.getCORNELL_H_PADDING().left), Float.valueOf(companion.getCORNELL_H_PADDING().top), Float.valueOf(companion.getCORNELL_H_PADDING().right), Float.valueOf(companion.getCORNELL_H_PADDING().bottom));
        float f = companion.getTHREE_LINE_V_PADDING().left;
        float f2 = companion.getTHREE_LINE_V_PADDING().right;
        float f3 = companion.getTHREE_LINE_V_PADDING().top;
        float f4 = companion.getTHREE_LINE_V_PADDING().bottom;
        Float fValueOf2 = Float.valueOf(f);
        Float fValueOf3 = Float.valueOf(f3);
        Float fValueOf4 = Float.valueOf(f2);
        Float fValueOf5 = Float.valueOf(f4);
        int i = 64;
        C24018OooO0oo c24018OooO0oo = null;
        Boolean bool = null;
        int i2 = R.string.paper_style_cornell_02;
        THREE_LINE_PAPER_V = new LineThreeColumnPaperStyle(width, height, fValueOf2, fValueOf3, fValueOf4, fValueOf5, bool, i2, i, c24018OooO0oo);
        THREE_LINE_PAPER_H = new LineThreeColumnPaperStyle(height, width, Float.valueOf(companion.getTHREE_LINE_H_PADDING().left), Float.valueOf(companion.getTHREE_LINE_H_PADDING().top), Float.valueOf(companion.getTHREE_LINE_H_PADDING().right), Float.valueOf(companion.getTHREE_LINE_H_PADDING().bottom), bool, i2, i, c24018OooO0oo);
        float f5 = companion.getTHREE_LINE_V_FLIP_PADDING().left;
        float f6 = companion.getTHREE_LINE_V_FLIP_PADDING().right;
        float f7 = companion.getTHREE_LINE_V_FLIP_PADDING().top;
        float f8 = companion.getTHREE_LINE_V_FLIP_PADDING().bottom;
        Float fValueOf6 = Float.valueOf(f5);
        Float fValueOf7 = Float.valueOf(f7);
        Float fValueOf8 = Float.valueOf(f6);
        Float fValueOf9 = Float.valueOf(f8);
        Boolean bool2 = Boolean.TRUE;
        THREE_LINE_PAPER_FLIP_V = new LineThreeColumnPaperStyle(width, height, fValueOf6, fValueOf7, fValueOf8, fValueOf9, bool2, R.string.paper_style_cornell_03);
        THREE_LINE_PAPER_FLIP_H = new LineThreeColumnPaperStyle(height, width, Float.valueOf(companion.getTHREE_LINE_H_FLIP_PADDING().left), Float.valueOf(companion.getTHREE_LINE_H_FLIP_PADDING().top), Float.valueOf(companion.getTHREE_LINE_H_FLIP_PADDING().right), Float.valueOf(companion.getTHREE_LINE_H_FLIP_PADDING().bottom), bool2, R.string.paper_style_cornell_03);
        float f9 = companion.getTHREE_SQUARE_V_PADDING().left;
        float f10 = companion.getTHREE_SQUARE_V_PADDING().right;
        float f11 = companion.getTHREE_SQUARE_V_PADDING().top;
        float f12 = companion.getTHREE_SQUARE_V_PADDING().bottom;
        Float fValueOf10 = Float.valueOf(f9);
        Float fValueOf11 = Float.valueOf(f11);
        Float fValueOf12 = Float.valueOf(f10);
        Float fValueOf13 = Float.valueOf(f12);
        Boolean bool3 = null;
        int i3 = R.string.paper_style_cornell_04;
        THREE_SQUARE_PAPER_V = new SquareThreeColumnPaperStyle(width, height, fValueOf10, fValueOf11, fValueOf12, fValueOf13, bool3, i3, i, c24018OooO0oo);
        THREE_SQUARE_PAPER_H = new SquareThreeColumnPaperStyle(height, width, Float.valueOf(companion.getTHREE_SQUARE_H_PADDING().left), Float.valueOf(companion.getTHREE_SQUARE_H_PADDING().top), Float.valueOf(companion.getTHREE_SQUARE_H_PADDING().right), Float.valueOf(companion.getTHREE_SQUARE_H_PADDING().bottom), bool3, i3, i, c24018OooO0oo);
        THREE_SQUARE_PAPER_FLIP_V = new SquareThreeColumnPaperStyle(width, height, Float.valueOf(companion.getTHREE_SQUARE_V_FLIP_PADDING().left), Float.valueOf(companion.getTHREE_SQUARE_V_FLIP_PADDING().top), Float.valueOf(companion.getTHREE_SQUARE_V_FLIP_PADDING().right), Float.valueOf(companion.getTHREE_SQUARE_V_FLIP_PADDING().bottom), bool2, R.string.paper_style_cornell_05);
        THREE_SQUARE_PAPER_FLIP_H = new SquareThreeColumnPaperStyle(height, width, Float.valueOf(companion.getTHREE_SQUARE_H_FLIP_PADDING().left), Float.valueOf(companion.getTHREE_SQUARE_H_FLIP_PADDING().top), Float.valueOf(companion.getTHREE_SQUARE_H_FLIP_PADDING().right), Float.valueOf(companion.getTHREE_SQUARE_H_FLIP_PADDING().bottom), bool2, R.string.paper_style_cornell_05);
        ACCENTURE_PAPER_V = new AccenturePaperStyle(width, height, Float.valueOf(line_style_v_padding.left), Float.valueOf(line_style_v_padding.top), Float.valueOf(line_style_v_padding.right), Float.valueOf(line_style_v_padding.bottom));
        ACCENTURE_PAPER_H = new AccenturePaperStyle(height, width, Float.valueOf(line_style_h_padding.left), Float.valueOf(line_style_h_padding.top), Float.valueOf(line_style_h_padding.right), Float.valueOf(line_style_h_padding.bottom));
        float f13 = 0.0f;
        Float f14 = null;
        UNBOUNDED_DOT_PAPER = new UnboundedDotPaperStyle(0.0f, f13, null, f14, 15, null);
        float f15 = 0.0f;
        Float f16 = null;
        UNBOUNDED_SQUARE_PAPER = new UnboundedSquarePaperStyle(f13, f15, f14, f16, 15, null);
        UNBOUNDED_LINE_PAPER = new UnboundedLinePaperStyle(f15, 0.0f, f16, null, 15, null);
        MUSIC_PAPER = new MusicPaperStyle();
        NONE_PAPER = new NonePaperStyle(0, 1, null);
    }

    public PaperStyle() {
        this(0.0f, 0.0f, null, null, null, null, 63, null);
    }

    public static /* synthetic */ void initSize$default(PaperStyle paperStyle, float f, float f2, Float f3, Float f4, Float f5, Float f6, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initSize");
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        if ((i & 16) != 0) {
            f5 = null;
        }
        if ((i & 32) != 0) {
            f6 = null;
        }
        paperStyle.initSize(f, f2, f3, f4, f5, f6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawPage(Canvas canvas, RectF normRenderBounds, Matrix transform) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRenderBounds, "normRenderBounds");
        OooOOO0.OooO0oO(transform, "transform");
        initPath();
        Iterator<T> it = this.pathList.iterator();
        while (it.hasNext()) {
            Path path = (Path) ((C32443OooOOO) it.next()).f116638OooOo0o;
            Path path2 = new Path();
            path.transform(transform, path2);
            Paint scaledPaint = getScaledPaint(path, C24970OooOO0O.OooO00o(transform));
            if (scaledPaint != null) {
                canvas.drawPath(path2, scaledPaint);
            }
        }
        drawText(canvas);
    }

    public boolean drawRegion(Canvas canvas, RectF normRegionBounds, int regionWidthPx, int regionHeightPx) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(normRegionBounds, "normRegionBounds");
        return false;
    }

    public void drawText(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !getClass().equals(other.getClass())) {
            return false;
        }
        PaperStyle paperStyle = (PaperStyle) other;
        return getPaperWidth() == paperStyle.getPaperWidth() && getPaperHeight() == paperStyle.getPaperHeight();
    }

    public Float getBottomPadding() {
        return this.bottomPadding;
    }

    public int getDefaultColor() {
        return this.defaultColor;
    }

    public Float getLeftPadding() {
        return this.leftPadding;
    }

    public abstract String getName(Resources res);

    public float getPaperHeight() {
        return this.paperHeight;
    }

    public float getPaperWidth() {
        return this.paperWidth;
    }

    public final ArrayList<C32443OooOOO<Path, Paint>> getPathList() {
        return this.pathList;
    }

    public RectF getRenderPadding() {
        Float leftPadding = getLeftPadding();
        float fFloatValue = leftPadding != null ? leftPadding.floatValue() : 0.0f;
        Float topPadding = getTopPadding();
        float fFloatValue2 = topPadding != null ? topPadding.floatValue() : 0.0f;
        Float rightPadding = getRightPadding();
        float fFloatValue3 = rightPadding != null ? rightPadding.floatValue() : 0.0f;
        Float bottomPadding = getBottomPadding();
        return new RectF(fFloatValue, fFloatValue2, fFloatValue3, bottomPadding != null ? bottomPadding.floatValue() : 0.0f);
    }

    public Float getRightPadding() {
        return this.rightPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Paint getScaledPaint(Path key, float scale) {
        Object next;
        OooOOO0.OooO0oO(key, "key");
        Iterator<T> it = this.pathList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OooOOO0.OooO0O0(((C32443OooOOO) next).f116638OooOo0o, key)) {
                break;
            }
        }
        C32443OooOOO c32443OooOOO = (C32443OooOOO) next;
        if (c32443OooOOO == null) {
            return null;
        }
        Paint paint = new Paint();
        B b = c32443OooOOO.f116637OooOo;
        paint.set((Paint) b);
        paint.setStrokeWidth(((Paint) b).getStrokeWidth() * scale);
        return paint;
    }

    public Float getTopPadding() {
        return this.topPadding;
    }

    public void initPath() {
        this.pathList.clear();
    }

    public final void initSize(float w, float h, Float left, Float top, Float right, Float bottom) {
        setPaperWidth(w);
        setPaperHeight(h);
        setLeftPadding(left);
        setTopPadding(top);
        setRightPadding(right);
        setBottomPadding(bottom);
    }

    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
    }

    public void setBottomPadding(Float f) {
        this.bottomPadding = f;
    }

    public void setDefaultColor(int i) {
        this.defaultColor = i;
    }

    public void setLeftPadding(Float f) {
        this.leftPadding = f;
    }

    public void setPaperHeight(float f) {
        this.paperHeight = f;
    }

    public void setPaperWidth(float f) {
        this.paperWidth = f;
    }

    public void setRightPadding(Float f) {
        this.rightPadding = f;
    }

    public void setTopPadding(Float f) {
        this.topPadding = f;
    }

    public PaperStyle(float f, float f2, Float f3, Float f4, Float f5, Float f6) {
        this.paperWidth = f;
        this.paperHeight = f2;
        this.leftPadding = f3;
        this.topPadding = f4;
        this.rightPadding = f5;
        this.bottomPadding = f6;
        this.pathList = new ArrayList<>();
        this.defaultColor = Color.parseColor("#C3D0E0");
    }

    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, float scale, RectF renderTargetViewport) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(renderTargetViewport, "renderTargetViewport");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PaperStyle(float r2, float r3, java.lang.Float r4, java.lang.Float r5, java.lang.Float r6, java.lang.Float r7, int r8, kotlin.jvm.internal.C24018OooO0oo r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto Lb
            r2 = 1142210560(0x4414c000, float:595.0)
            float r2 = Oooo0.o000000O.OooO0o0(r2)
        Lb:
            r9 = r8 & 2
            if (r9 == 0) goto L16
            r3 = 1146257408(0x44528000, float:842.0)
            float r3 = Oooo0.o000000O.OooO0o0(r3)
        L16:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L1c
            r4 = r0
        L1c:
            r9 = r8 & 8
            if (r9 == 0) goto L21
            r5 = r0
        L21:
            r9 = r8 & 16
            if (r9 == 0) goto L26
            r6 = r0
        L26:
            r8 = r8 & 32
            if (r8 == 0) goto L32
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L39
        L32:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L39:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle.<init>(float, float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
