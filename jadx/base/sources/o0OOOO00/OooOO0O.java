package o0OOOO00;

import android.graphics.Color;
import androidx.core.view.InputDeviceCompat;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperColors;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import com.orion.notein.domain.models.papertheme.ThemeCategory;
import com.orion.notein.domain.models.papertheme.paperstyle.BlankPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NewCornellPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NewLawPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NonePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import java.util.List;
import kotlin.jvm.internal.C24018OooO0oo;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final List<Integer> f94366OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f94369OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f94370OooOo0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<PaperTheme> f94371OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f94372OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<PaperTheme> f94373OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PaperTheme> f94374OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<ColorPaperTheme> f94375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<PaperTheme> f94376OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<PaperTheme> f94377OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<PaperTheme> f94378OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<PaperTheme> f94379OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ThemeCategory f94356OooOO0 = new ThemeCategory(1, "基本");

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final ThemeCategory f94357OooOO0O = new ThemeCategory(2, "卡通");

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final ThemeCategory f94358OooOO0o = new ThemeCategory(3, "水果");

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final ThemeCategory f94360OooOOO0 = new ThemeCategory(4, "图形");

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final ThemeCategory f94359OooOOO = new ThemeCategory(5, "年度");

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ThemeCategory f94361OooOOOO = new ThemeCategory(EditingLanguage.ARABIC_LIBYA, "基本");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ThemeCategory f94362OooOOOo = new ThemeCategory(InputDeviceCompat.SOURCE_TOUCHSCREEN, "专业");

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final ThemeCategory f94364OooOOo0 = new ThemeCategory(4099, "计划");

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final ThemeCategory f94363OooOOo = new ThemeCategory(EditingLanguage.CHINESE_SINGAPORE, "自定义图片");

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final ThemeCategory f94365OooOOoo = new ThemeCategory(4101, "学习");

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final ThemeCategory f94368OooOo00 = new ThemeCategory(4102, "双栏");

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final ThemeCategory f94367OooOo0 = new ThemeCategory(EditingLanguage.GERMAN_LUXEMBOURG, "三栏");

    static {
        new ThemeCategory(EditingLanguage.ARABIC_OMAN, "我的模版");
        C24340OooO0oo.OooO0o0("pageColors");
        f94369OooOo0O = C24340OooO0oo.OooO0o0("customPageColors");
        f94370OooOo0o = C24340OooO0oo.OooO0o0("scratchPaperTheme");
        C24340OooO0oo.OooO00o("isAddCustomBaseColorGuideShown");
        PaperColors paperColors = PaperColors.INSTANCE;
        f94366OooOo = C34429OooOOo0.OooOO0o(Integer.valueOf(paperColors.getCOLOR_01()), Integer.valueOf(paperColors.getCOLOR_02()), Integer.valueOf(paperColors.getCOLOR_03()), Integer.valueOf(paperColors.getCOLOR_04()), Integer.valueOf(paperColors.getCOLOR_05()));
    }

    public OooOO0O(o0000o0O.OooOO0<AbstractC24338OooO0o0> ds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        this.f94372OooO00o = ds;
        ThemeCategory themeCategory = f94356OooOO0;
        LambdaPaperTheme lambdaPaperTheme = new LambdaPaperTheme(new ColorPaperTheme(null, Color.parseColor("#b3f9f9f9"), 1, null), themeCategory, null, null, new NonePaperStyle(0, 1, null), null, 44, null);
        int i = StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5;
        C24018OooO0oo c24018OooO0oo = null;
        PaperTheme paperTheme = null;
        PaperOrientation paperOrientation = null;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        LocalResPaperTheme localResPaperTheme = new LocalResPaperTheme(paperTheme, "跑车", themeCategory, paperOrientation, i2, i3, "cover_v_2", "cover_v_2_tn", str, i, c24018OooO0oo);
        LocalResPaperTheme localResPaperTheme2 = new LocalResPaperTheme(paperTheme, "战斗机", themeCategory, paperOrientation, i2, i3, "cover_v_3", "cover_v_3_tn", str, i, c24018OooO0oo);
        LocalResPaperTheme localResPaperTheme3 = new LocalResPaperTheme(paperTheme, "素描", themeCategory, paperOrientation, i2, i3, "cover_v_4", "cover_v_4_tn", str, i, c24018OooO0oo);
        LocalResPaperTheme localResPaperTheme4 = new LocalResPaperTheme(paperTheme, "注视", themeCategory, paperOrientation, i2, i3, "cover_v_5", "cover_v_5_tn", str, i, c24018OooO0oo);
        LocalResPaperTheme localResPaperTheme5 = new LocalResPaperTheme(paperTheme, "复古Van", themeCategory, paperOrientation, i2, i3, "cover_v_6", "cover_v_6_tn", str, i, c24018OooO0oo);
        LocalResPaperTheme localResPaperTheme6 = new LocalResPaperTheme(paperTheme, "人物", themeCategory, paperOrientation, i2, i3, "cover_v_7", "cover_v_7_tn", str, i, c24018OooO0oo);
        LocalResPaperTheme localResPaperTheme7 = new LocalResPaperTheme(paperTheme, "空白", themeCategory, paperOrientation, i2, i3, "cover_v_1", "cover_v_1_tn", str, i, c24018OooO0oo);
        ThemeCategory themeCategory2 = f94357OooOO0O;
        LocalResPaperTheme localResPaperTheme8 = new LocalResPaperTheme(null, "Ink and wash A", themeCategory2, null, 0, 0, "cover_v_120", "cover_v_120_tn", null, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, null);
        int i4 = StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5;
        C24018OooO0oo c24018OooO0oo2 = null;
        PaperTheme paperTheme2 = null;
        PaperOrientation paperOrientation2 = null;
        int i5 = 0;
        int i6 = 0;
        String str2 = null;
        LocalResPaperTheme localResPaperTheme9 = new LocalResPaperTheme(paperTheme2, "Ink and wash B", themeCategory2, paperOrientation2, i5, i6, "cover_v_121", "cover_v_121_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme10 = new LocalResPaperTheme(paperTheme2, "Ink and wash C", themeCategory2, paperOrientation2, i5, i6, "cover_v_122", "cover_v_122_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme11 = new LocalResPaperTheme(paperTheme2, "Ink and wash D", themeCategory2, paperOrientation2, i5, i6, "cover_v_123", "cover_v_123_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme12 = new LocalResPaperTheme(paperTheme2, "灵感", themeCategory2, paperOrientation2, i5, i6, "cover_v_8", "cover_v_8_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme13 = new LocalResPaperTheme(paperTheme2, "线条", themeCategory2, paperOrientation2, i5, i6, "cover_v_9", "cover_v_9_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme14 = new LocalResPaperTheme(paperTheme2, "手绘1", themeCategory2, paperOrientation2, i5, i6, "cover_v_10", "cover_v_10_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme15 = new LocalResPaperTheme(paperTheme2, "手绘2", themeCategory2, paperOrientation2, i5, i6, "cover_v_11", "cover_v_11_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme16 = new LocalResPaperTheme(paperTheme2, "手绘3", themeCategory2, paperOrientation2, i5, i6, "cover_v_12", "cover_v_12_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme17 = new LocalResPaperTheme(paperTheme2, "手绘4", themeCategory2, paperOrientation2, i5, i6, "cover_v_13", "cover_v_13_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme18 = new LocalResPaperTheme(paperTheme2, "手绘5", themeCategory2, paperOrientation2, i5, i6, "cover_v_14", "cover_v_14_tn", str2, i4, c24018OooO0oo2);
        LocalResPaperTheme localResPaperTheme19 = new LocalResPaperTheme(paperTheme2, "儿童", themeCategory2, paperOrientation2, i5, i6, "cover_v_15", "cover_v_15_tn", str2, i4, c24018OooO0oo2);
        ThemeCategory themeCategory3 = f94358OooOO0o;
        LocalResPaperTheme localResPaperTheme20 = new LocalResPaperTheme(null, "果汁", themeCategory3, null, 0, 0, "cover_v_16", "cover_v_16_tn", null, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, null);
        int i7 = StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5;
        C24018OooO0oo c24018OooO0oo3 = null;
        PaperTheme paperTheme3 = null;
        PaperOrientation paperOrientation3 = null;
        int i8 = 0;
        int i9 = 0;
        String str3 = null;
        LocalResPaperTheme localResPaperTheme21 = new LocalResPaperTheme(paperTheme3, "西瓜1", themeCategory3, paperOrientation3, i8, i9, "cover_v_17", "cover_v_17_tn", str3, i7, c24018OooO0oo3);
        LocalResPaperTheme localResPaperTheme22 = new LocalResPaperTheme(paperTheme3, "西瓜2", themeCategory3, paperOrientation3, i8, i9, "cover_v_18", "cover_v_18_tn", str3, i7, c24018OooO0oo3);
        LocalResPaperTheme localResPaperTheme23 = new LocalResPaperTheme(paperTheme3, "菠萝", themeCategory3, paperOrientation3, i8, i9, "cover_v_19", "cover_v_19_tn", str3, i7, c24018OooO0oo3);
        LocalResPaperTheme localResPaperTheme24 = new LocalResPaperTheme(paperTheme3, "柠檬1", themeCategory3, paperOrientation3, i8, i9, "cover_v_20", "cover_v_20_tn", str3, i7, c24018OooO0oo3);
        LocalResPaperTheme localResPaperTheme25 = new LocalResPaperTheme(paperTheme3, "柠檬2", themeCategory3, paperOrientation3, i8, i9, "cover_v_21", "cover_v_21_tn", str3, i7, c24018OooO0oo3);
        LocalResPaperTheme localResPaperTheme26 = new LocalResPaperTheme(paperTheme3, "柠檬3", themeCategory3, paperOrientation3, i8, i9, "cover_v_22", "cover_v_22_tn", str3, i7, c24018OooO0oo3);
        LocalResPaperTheme localResPaperTheme27 = new LocalResPaperTheme(paperTheme3, "柠檬4", themeCategory3, paperOrientation3, i8, i9, "cover_v_23", "cover_v_23_tn", str3, i7, c24018OooO0oo3);
        ThemeCategory themeCategory4 = f94360OooOOO0;
        LocalResPaperTheme localResPaperTheme28 = new LocalResPaperTheme(null, "Bauhaus A", themeCategory4, null, 0, 0, "cover_v_116", "cover_v_116_tn", null, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, null);
        int i10 = StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5;
        C24018OooO0oo c24018OooO0oo4 = null;
        PaperTheme paperTheme4 = null;
        PaperOrientation paperOrientation4 = null;
        int i11 = 0;
        int i12 = 0;
        String str4 = null;
        LocalResPaperTheme localResPaperTheme29 = new LocalResPaperTheme(paperTheme4, "Bauhaus B", themeCategory4, paperOrientation4, i11, i12, "cover_v_117", "cover_v_117_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme30 = new LocalResPaperTheme(paperTheme4, "Bauhaus C", themeCategory4, paperOrientation4, i11, i12, "cover_v_118", "cover_v_118_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme31 = new LocalResPaperTheme(paperTheme4, "Bauhaus D", themeCategory4, paperOrientation4, i11, i12, "cover_v_119", "cover_v_119_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme32 = new LocalResPaperTheme(paperTheme4, "几何1", themeCategory4, paperOrientation4, i11, i12, "cover_v_24", "cover_v_24_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme33 = new LocalResPaperTheme(paperTheme4, "几何2", themeCategory4, paperOrientation4, i11, i12, "cover_v_25", "cover_v_25_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme34 = new LocalResPaperTheme(paperTheme4, "几何3", themeCategory4, paperOrientation4, i11, i12, "cover_v_27", "cover_v_27_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme35 = new LocalResPaperTheme(paperTheme4, "图形1", themeCategory4, paperOrientation4, i11, i12, "cover_v_28", "cover_v_28_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme36 = new LocalResPaperTheme(paperTheme4, "图形2", themeCategory4, paperOrientation4, i11, i12, "cover_v_29", "cover_v_29_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme37 = new LocalResPaperTheme(paperTheme4, "图形3", themeCategory4, paperOrientation4, i11, i12, "cover_v_26", "cover_v_26_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme38 = new LocalResPaperTheme(paperTheme4, "图形4", themeCategory4, paperOrientation4, i11, i12, "cover_v_30", "cover_v_30_tn", str4, i10, c24018OooO0oo4);
        LocalResPaperTheme localResPaperTheme39 = new LocalResPaperTheme(paperTheme4, "图形5", themeCategory4, paperOrientation4, i11, i12, "cover_v_31", "cover_v_31_tn", str4, i10, c24018OooO0oo4);
        PaperOrientation paperOrientation5 = PaperOrientation.VERTICAL;
        int i13 = StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4;
        C24018OooO0oo c24018OooO0oo5 = null;
        PaperTheme paperTheme5 = null;
        ThemeCategory themeCategory5 = f94359OooOOO;
        int i14 = 0;
        int i15 = 0;
        String str5 = null;
        this.f94373OooO0O0 = C34429OooOOo0.OooOO0o(lambdaPaperTheme, localResPaperTheme, localResPaperTheme2, localResPaperTheme3, localResPaperTheme4, localResPaperTheme5, localResPaperTheme6, localResPaperTheme7, localResPaperTheme8, localResPaperTheme9, localResPaperTheme10, localResPaperTheme11, localResPaperTheme12, localResPaperTheme13, localResPaperTheme14, localResPaperTheme15, localResPaperTheme16, localResPaperTheme17, localResPaperTheme18, localResPaperTheme19, localResPaperTheme20, localResPaperTheme21, localResPaperTheme22, localResPaperTheme23, localResPaperTheme24, localResPaperTheme25, localResPaperTheme26, localResPaperTheme27, localResPaperTheme28, localResPaperTheme29, localResPaperTheme30, localResPaperTheme31, localResPaperTheme32, localResPaperTheme33, localResPaperTheme34, localResPaperTheme35, localResPaperTheme36, localResPaperTheme37, localResPaperTheme38, localResPaperTheme39, new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_2026_a_vertical", "ni_cover_2026_2026_a_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_2026_b_vertical", "ni_cover_2026_2026_b_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_2026_c_vertical", "ni_cover_2026_2026_c_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_2026_d_vertical", "ni_cover_2026_2026_d_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_merry_xmas_a_vertical", "ni_cover_2026_merry_xmas_a_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_merry_xmas_b_vertical", "ni_cover_2026_merry_xmas_b_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_happy_new_year_a_vertical", "ni_cover_2026_happy_new_year_a_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_happy_new_year_b_vertical", "ni_cover_2026_happy_new_year_b_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_happy_new_year_c_vertical", "ni_cover_2026_happy_new_year_c_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_happy_new_year_d_vertical", "ni_cover_2026_happy_new_year_d_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_happy_new_year_e_vertical", "ni_cover_2026_happy_new_year_e_vertical_tn", str5, i13, c24018OooO0oo5), new LocalResPaperTheme(paperTheme5, "", themeCategory5, paperOrientation5, i14, i15, "ni_cover_2026_happy_new_year_f_vertical", "ni_cover_2026_happy_new_year_f_vertical_tn", str5, i13, c24018OooO0oo5));
        ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, Color.parseColor("#b3f9f9f9"), 1, null);
        NonePaperStyle nonePaperStyle = new NonePaperStyle(0, 1, null);
        PaperOrientation paperOrientation6 = PaperOrientation.HORIZONTAL;
        LambdaPaperTheme lambdaPaperTheme2 = new LambdaPaperTheme(colorPaperTheme, themeCategory, paperOrientation6, null, nonePaperStyle, null, 40, null);
        int i16 = StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4;
        C24018OooO0oo c24018OooO0oo6 = null;
        PaperTheme paperTheme6 = null;
        int i17 = 0;
        int i18 = 0;
        String str6 = null;
        LocalResPaperTheme localResPaperTheme40 = new LocalResPaperTheme(paperTheme6, "跑车", themeCategory, paperOrientation6, i17, i18, "cover_h_2", "cover_h_2_tn", str6, i16, c24018OooO0oo6);
        LocalResPaperTheme localResPaperTheme41 = new LocalResPaperTheme(paperTheme6, "战斗机", themeCategory, paperOrientation6, i17, i18, "cover_h_3", "cover_h_3_tn", str6, i16, c24018OooO0oo6);
        LocalResPaperTheme localResPaperTheme42 = new LocalResPaperTheme(paperTheme6, "素描", themeCategory, paperOrientation6, i17, i18, "cover_h_4", "cover_h_4_tn", str6, i16, c24018OooO0oo6);
        LocalResPaperTheme localResPaperTheme43 = new LocalResPaperTheme(paperTheme6, "注视", themeCategory, paperOrientation6, i17, i18, "cover_h_5", "cover_h_5_tn", str6, i16, c24018OooO0oo6);
        LocalResPaperTheme localResPaperTheme44 = new LocalResPaperTheme(paperTheme6, "复古Van", themeCategory, paperOrientation6, i17, i18, "cover_h_6", "cover_h_6_tn", str6, i16, c24018OooO0oo6);
        LocalResPaperTheme localResPaperTheme45 = new LocalResPaperTheme(paperTheme6, "人物", themeCategory, paperOrientation6, i17, i18, "cover_h_7", "cover_h_7_tn", str6, i16, c24018OooO0oo6);
        LocalResPaperTheme localResPaperTheme46 = new LocalResPaperTheme(paperTheme6, "空白", themeCategory, paperOrientation6, i17, i18, "cover_h_1", "cover_h_1_tn", str6, i16, c24018OooO0oo6);
        int i19 = StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4;
        C24018OooO0oo c24018OooO0oo7 = null;
        PaperTheme paperTheme7 = null;
        int i20 = 0;
        int i21 = 0;
        String str7 = null;
        LocalResPaperTheme localResPaperTheme47 = new LocalResPaperTheme(paperTheme7, "Ink and wash A", themeCategory2, paperOrientation6, i20, i21, "cover_h_120", "cover_h_120_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme48 = new LocalResPaperTheme(paperTheme7, "Ink and wash B", themeCategory2, paperOrientation6, i20, i21, "cover_h_121", "cover_h_121_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme49 = new LocalResPaperTheme(paperTheme7, "Ink and wash C", themeCategory2, paperOrientation6, i20, i21, "cover_h_122", "cover_h_122_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme50 = new LocalResPaperTheme(paperTheme7, "Ink and wash D", themeCategory2, paperOrientation6, i20, i21, "cover_h_123", "cover_h_123_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme51 = new LocalResPaperTheme(paperTheme7, "灵感", themeCategory2, paperOrientation6, i20, i21, "cover_h_8", "cover_h_8_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme52 = new LocalResPaperTheme(paperTheme7, "线条", themeCategory2, paperOrientation6, i20, i21, "cover_h_9", "cover_h_9_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme53 = new LocalResPaperTheme(paperTheme7, "手绘1", themeCategory2, paperOrientation6, i20, i21, "cover_h_10", "cover_h_10_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme54 = new LocalResPaperTheme(paperTheme7, "手绘2", themeCategory2, paperOrientation6, i20, i21, "cover_h_11", "cover_h_11_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme55 = new LocalResPaperTheme(paperTheme7, "手绘3", themeCategory2, paperOrientation6, i20, i21, "cover_h_13", "cover_h_13_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme56 = new LocalResPaperTheme(paperTheme7, "手绘4", themeCategory2, paperOrientation6, i20, i21, "cover_h_12", "cover_h_12_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme57 = new LocalResPaperTheme(paperTheme7, "手绘5", themeCategory2, paperOrientation6, i20, i21, "cover_h_14", "cover_h_14_tn", str7, i19, c24018OooO0oo7);
        LocalResPaperTheme localResPaperTheme58 = new LocalResPaperTheme(paperTheme7, "儿童", themeCategory2, paperOrientation6, i20, i21, "cover_h_15", "cover_h_15_tn", str7, i19, c24018OooO0oo7);
        int i22 = StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4;
        C24018OooO0oo c24018OooO0oo8 = null;
        PaperTheme paperTheme8 = null;
        int i23 = 0;
        int i24 = 0;
        String str8 = null;
        LocalResPaperTheme localResPaperTheme59 = new LocalResPaperTheme(paperTheme8, "果汁", themeCategory3, paperOrientation6, i23, i24, "cover_h_16", "cover_h_16_tn", str8, i22, c24018OooO0oo8);
        LocalResPaperTheme localResPaperTheme60 = new LocalResPaperTheme(paperTheme8, "西瓜1", themeCategory3, paperOrientation6, i23, i24, "cover_h_17", "cover_h_17_tn", str8, i22, c24018OooO0oo8);
        LocalResPaperTheme localResPaperTheme61 = new LocalResPaperTheme(paperTheme8, "西瓜2", themeCategory3, paperOrientation6, i23, i24, "cover_h_18", "cover_h_18_tn", str8, i22, c24018OooO0oo8);
        LocalResPaperTheme localResPaperTheme62 = new LocalResPaperTheme(paperTheme8, "菠萝", themeCategory3, paperOrientation6, i23, i24, "cover_h_19", "cover_h_19_tn", str8, i22, c24018OooO0oo8);
        LocalResPaperTheme localResPaperTheme63 = new LocalResPaperTheme(paperTheme8, "柠檬1", themeCategory3, paperOrientation6, i23, i24, "cover_h_20", "cover_h_20_tn", str8, i22, c24018OooO0oo8);
        LocalResPaperTheme localResPaperTheme64 = new LocalResPaperTheme(paperTheme8, "柠檬2", themeCategory3, paperOrientation6, i23, i24, "cover_h_21", "cover_h_21_tn", str8, i22, c24018OooO0oo8);
        LocalResPaperTheme localResPaperTheme65 = new LocalResPaperTheme(paperTheme8, "柠檬3", themeCategory3, paperOrientation6, i23, i24, "cover_h_22", "cover_h_22_tn", str8, i22, c24018OooO0oo8);
        LocalResPaperTheme localResPaperTheme66 = new LocalResPaperTheme(paperTheme8, "柠檬4", themeCategory3, paperOrientation6, i23, i24, "cover_h_23", "cover_h_23_tn", str8, i22, c24018OooO0oo8);
        int i25 = StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4;
        C24018OooO0oo c24018OooO0oo9 = null;
        int i26 = 0;
        int i27 = 0;
        String str9 = null;
        LocalResPaperTheme localResPaperTheme67 = new LocalResPaperTheme(paperTheme4, "Bauhaus A", themeCategory4, paperOrientation6, i26, i27, "cover_h_116", "cover_h_116_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme68 = new LocalResPaperTheme(paperTheme4, "Bauhaus B", themeCategory4, paperOrientation6, i26, i27, "cover_h_117", "cover_h_117_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme69 = new LocalResPaperTheme(paperTheme4, "Bauhaus C", themeCategory4, paperOrientation6, i26, i27, "cover_h_118", "cover_h_118_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme70 = new LocalResPaperTheme(paperTheme4, "Bauhaus D", themeCategory4, paperOrientation6, i26, i27, "cover_h_119", "cover_h_119_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme71 = new LocalResPaperTheme(paperTheme4, "几何1", themeCategory4, paperOrientation6, i26, i27, "cover_h_24", "cover_h_24_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme72 = new LocalResPaperTheme(paperTheme4, "几何2", themeCategory4, paperOrientation6, i26, i27, "cover_h_25", "cover_h_25_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme73 = new LocalResPaperTheme(paperTheme4, "几何3", themeCategory4, paperOrientation6, i26, i27, "cover_h_27", "cover_h_27_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme74 = new LocalResPaperTheme(paperTheme4, "图形1", themeCategory4, paperOrientation6, i26, i27, "cover_h_28", "cover_h_28_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme75 = new LocalResPaperTheme(paperTheme4, "图形2", themeCategory4, paperOrientation6, i26, i27, "cover_h_29", "cover_h_29_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme76 = new LocalResPaperTheme(paperTheme4, "图形3", themeCategory4, paperOrientation6, i26, i27, "cover_h_26", "cover_h_26_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme77 = new LocalResPaperTheme(paperTheme4, "图形4", themeCategory4, paperOrientation6, i26, i27, "cover_h_30", "cover_h_30_tn", str9, i25, c24018OooO0oo9);
        LocalResPaperTheme localResPaperTheme78 = new LocalResPaperTheme(paperTheme4, "图形5", themeCategory4, paperOrientation6, i26, i27, "cover_h_31", "cover_h_31_tn", str9, i25, c24018OooO0oo9);
        int i28 = StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4;
        C24018OooO0oo c24018OooO0oo10 = null;
        PaperTheme paperTheme9 = null;
        int i29 = 0;
        int i30 = 0;
        String str10 = null;
        this.f94374OooO0OO = C34429OooOOo0.OooOO0o(lambdaPaperTheme2, localResPaperTheme40, localResPaperTheme41, localResPaperTheme42, localResPaperTheme43, localResPaperTheme44, localResPaperTheme45, localResPaperTheme46, localResPaperTheme47, localResPaperTheme48, localResPaperTheme49, localResPaperTheme50, localResPaperTheme51, localResPaperTheme52, localResPaperTheme53, localResPaperTheme54, localResPaperTheme55, localResPaperTheme56, localResPaperTheme57, localResPaperTheme58, localResPaperTheme59, localResPaperTheme60, localResPaperTheme61, localResPaperTheme62, localResPaperTheme63, localResPaperTheme64, localResPaperTheme65, localResPaperTheme66, localResPaperTheme67, localResPaperTheme68, localResPaperTheme69, localResPaperTheme70, localResPaperTheme71, localResPaperTheme72, localResPaperTheme73, localResPaperTheme74, localResPaperTheme75, localResPaperTheme76, localResPaperTheme77, localResPaperTheme78, new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_2026_a", "ni_cover_2026_2026_a_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_2026_b", "ni_cover_2026_2026_b_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_2026_c", "ni_cover_2026_2026_c_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_2026_d", "ni_cover_2026_2026_d_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_merry_xmas_a", "ni_cover_2026_merry_xmas_a_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_merry_xmas_b", "ni_cover_2026_merry_xmas_b_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_happy_new_year_a", "ni_cover_2026_happy_new_year_a_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_happy_new_year_b", "ni_cover_2026_happy_new_year_b_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_happy_new_year_c", "ni_cover_2026_happy_new_year_c_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_happy_new_year_d", "ni_cover_2026_happy_new_year_d_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_happy_new_year_e", "ni_cover_2026_happy_new_year_e_tn", str10, i28, c24018OooO0oo10), new LocalResPaperTheme(paperTheme9, "", themeCategory5, paperOrientation6, i29, i30, "ni_cover_2026_happy_new_year_f", "ni_cover_2026_happy_new_year_f_tn", str10, i28, c24018OooO0oo10));
        PaperColors paperColors = PaperColors.INSTANCE;
        this.f94375OooO0Oo = C34429OooOOo0.OooOO0o(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), new ColorPaperTheme(null, paperColors.getCOLOR_02(), 1, null), new ColorPaperTheme(null, paperColors.getCOLOR_03(), 1, null), new ColorPaperTheme(null, paperColors.getCOLOR_04(), 1, null), new ColorPaperTheme(null, paperColors.getCOLOR_05(), 1, null));
        ColorPaperTheme colorPaperTheme2 = new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null);
        PaperStyle.Companion companion = PaperStyle.INSTANCE;
        BlankPaperStyle blank_paper = companion.getBLANK_PAPER();
        int i31 = 40;
        C24018OooO0oo c24018OooO0oo11 = null;
        ThemeCategory themeCategory6 = f94361OooOOOO;
        String str11 = null;
        String str12 = null;
        this.f94377OooO0o0 = C34429OooOOo0.OooOO0o(new LambdaPaperTheme(colorPaperTheme2, themeCategory6, paperOrientation5, str11, blank_paper, str12, i31, c24018OooO0oo11), new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation5, str11, companion.getUNBOUNDED_LINE_PAPER(), str12, i31, c24018OooO0oo11), new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation5, str11, companion.getUNBOUNDED_SQUARE_PAPER(), str12, i31, c24018OooO0oo11), new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation5, str11, companion.getUNBOUNDED_DOT_PAPER(), str12, i31, c24018OooO0oo11));
        this.f94376OooO0o = OooOo.OooO0oO(new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_02(), 1, null), themeCategory6, paperOrientation5, str11, companion.getBLANK_PAPER(), str12, i31, c24018OooO0oo11));
        this.f94378OooO0oO = OooOo.OooO0oO(new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_02(), 1, null), themeCategory6, paperOrientation6, null, companion.getBLANK_PAPER(), null, 40, null));
        LambdaPaperTheme lambdaPaperTheme3 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation5, str11, companion.getBLANK_PAPER(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme4 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation5, str11, companion.getLINE_PAPER_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme5 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation5, str11, companion.getSQUARE_PAPER_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme6 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation5, str11, companion.getDOT_PAPER_V(), str12, i31, c24018OooO0oo11);
        ColorPaperTheme colorPaperTheme3 = new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null);
        NewLawPaperStyle law_paper_v = companion.getLAW_PAPER_V();
        ThemeCategory themeCategory7 = f94368OooOo00;
        LambdaPaperTheme lambdaPaperTheme7 = new LambdaPaperTheme(colorPaperTheme3, themeCategory7, paperOrientation5, str11, law_paper_v, str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme8 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation5, str11, companion.getTWO_LINE_PAPER_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme9 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation5, str11, companion.getTWO_BLANK_PAPER_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme10 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation5, str11, companion.getTWO_SQUARE_PAPER_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme11 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation5, str11, companion.getTWO_DOT_PAPER_V(), str12, i31, c24018OooO0oo11);
        ColorPaperTheme colorPaperTheme4 = new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null);
        NewCornellPaperStyle cornell_paper_v = companion.getCORNELL_PAPER_V();
        ThemeCategory themeCategory8 = f94367OooOo0;
        LambdaPaperTheme lambdaPaperTheme12 = new LambdaPaperTheme(colorPaperTheme4, themeCategory8, paperOrientation5, str11, cornell_paper_v, str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme13 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation5, str11, companion.getTHREE_LINE_PAPER_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme14 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation5, str11, companion.getTHREE_LINE_PAPER_FLIP_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme15 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation5, str11, companion.getTHREE_SQUARE_PAPER_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme16 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation5, str11, companion.getTHREE_SQUARE_PAPER_FLIP_V(), str12, i31, c24018OooO0oo11);
        LambdaPaperTheme lambdaPaperTheme17 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation5, str11, companion.getACCENTURE_PAPER_V(), str12, i31, c24018OooO0oo11);
        int color_01 = paperColors.getCOLOR_01();
        Boolean bool = Boolean.TRUE;
        int i32 = 64;
        C24018OooO0oo c24018OooO0oo12 = null;
        ThemeCategory themeCategory9 = f94365OooOOoo;
        String str13 = null;
        PdfSetPaperTheme pdfSetPaperTheme = new PdfSetPaperTheme("memorycurveword_v2", "a4", color_01, paperOrientation5, themeCategory9, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme2 = new PdfSetPaperTheme("wordbook_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory9, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme3 = new PdfSetPaperTheme("advwordbook_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory9, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme4 = new PdfSetPaperTheme("errorsets1_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory9, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme5 = new PdfSetPaperTheme("errorsets2_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory9, bool, str13, i32, c24018OooO0oo12);
        int color_012 = paperColors.getCOLOR_01();
        ThemeCategory themeCategory10 = f94362OooOOOo;
        PdfSetPaperTheme pdfSetPaperTheme6 = new PdfSetPaperTheme("readingnotes_v2", "a4", color_012, paperOrientation5, themeCategory10, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme7 = new PdfSetPaperTheme("meeting_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory10, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme8 = new PdfSetPaperTheme("matts_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory10, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme9 = new PdfSetPaperTheme("music_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory10, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme10 = new PdfSetPaperTheme("english1_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory10, bool, str13, i32, c24018OooO0oo12);
        PdfSetPaperTheme pdfSetPaperTheme11 = new PdfSetPaperTheme("english2_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory10, bool, str13, i32, c24018OooO0oo12);
        int color_013 = paperColors.getCOLOR_01();
        ThemeCategory themeCategory11 = f94364OooOOo0;
        this.f94379OooO0oo = C34429OooOOo0.OooOO0o(lambdaPaperTheme3, lambdaPaperTheme4, lambdaPaperTheme5, lambdaPaperTheme6, lambdaPaperTheme7, lambdaPaperTheme8, lambdaPaperTheme9, lambdaPaperTheme10, lambdaPaperTheme11, lambdaPaperTheme12, lambdaPaperTheme13, lambdaPaperTheme14, lambdaPaperTheme15, lambdaPaperTheme16, lambdaPaperTheme17, pdfSetPaperTheme, pdfSetPaperTheme2, pdfSetPaperTheme3, pdfSetPaperTheme4, pdfSetPaperTheme5, pdfSetPaperTheme6, pdfSetPaperTheme7, pdfSetPaperTheme8, pdfSetPaperTheme9, pdfSetPaperTheme10, pdfSetPaperTheme11, new PdfSetPaperTheme("daily_journal_v2", "a4", color_013, paperOrientation5, themeCategory11, bool, str13, i32, c24018OooO0oo12), new PdfSetPaperTheme("dailyplan_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory11, bool, str13, i32, c24018OooO0oo12), new PdfSetPaperTheme("weeklyplan_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory11, bool, str13, i32, c24018OooO0oo12), new PdfSetPaperTheme("weeklyplan_mon_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory11, bool, str13, i32, c24018OooO0oo12), new PdfSetPaperTheme("monthlyplan_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory11, bool, str13, i32, c24018OooO0oo12), new PdfSetPaperTheme("monthlyplan_mon_v2", "a4", paperColors.getCOLOR_01(), paperOrientation5, themeCategory11, bool, str13, i32, c24018OooO0oo12));
        int i33 = 40;
        C24018OooO0oo c24018OooO0oo13 = null;
        String str14 = null;
        LambdaPaperTheme lambdaPaperTheme18 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation6, null, companion.getBLANK_PAPER(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme19 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation6, null, companion.getLINE_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme20 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation6, null, companion.getSQUARE_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme21 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory6, paperOrientation6, null, companion.getDOT_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme22 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation6, null, companion.getLAW_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme23 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation6, null, companion.getTWO_LINE_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme24 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation6, null, companion.getTWO_BLANK_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme25 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation6, null, companion.getTWO_SQUARE_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme26 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory7, paperOrientation6, null, companion.getTWO_DOT_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme27 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation6, null, companion.getCORNELL_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme28 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation6, null, companion.getTHREE_LINE_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme29 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation6, null, companion.getTHREE_LINE_PAPER_FLIP_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme30 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation6, null, companion.getTHREE_SQUARE_PAPER_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme31 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation6, null, companion.getTHREE_SQUARE_PAPER_FLIP_H(), str14, i33, c24018OooO0oo13);
        LambdaPaperTheme lambdaPaperTheme32 = new LambdaPaperTheme(new ColorPaperTheme(null, paperColors.getCOLOR_01(), 1, null), themeCategory8, paperOrientation6, null, companion.getACCENTURE_PAPER_H(), str14, i33, c24018OooO0oo13);
        int i34 = 64;
        C24018OooO0oo c24018OooO0oo14 = null;
        String str15 = null;
        this.f94371OooO = C34429OooOOo0.OooOO0o(lambdaPaperTheme18, lambdaPaperTheme19, lambdaPaperTheme20, lambdaPaperTheme21, lambdaPaperTheme22, lambdaPaperTheme23, lambdaPaperTheme24, lambdaPaperTheme25, lambdaPaperTheme26, lambdaPaperTheme27, lambdaPaperTheme28, lambdaPaperTheme29, lambdaPaperTheme30, lambdaPaperTheme31, lambdaPaperTheme32, new PdfSetPaperTheme("memorycurveword_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory9, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("wordbook_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory9, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("advwordbook_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory9, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("errorsets1_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory9, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("errorsets2_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory9, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("readingnotes_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory10, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("meeting1_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory10, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("meeting2_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory10, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("matts_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory10, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("music_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory10, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("english1_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory10, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("english2_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory10, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("daily_journal_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory11, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("dailyplan_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory11, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("weeklyplan_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory11, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("weeklyplan_mon_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory11, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("monthlyplan_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory11, bool, str15, i34, c24018OooO0oo14), new PdfSetPaperTheme("monthlyplan_mon_v2", "a4", paperColors.getCOLOR_01(), paperOrientation6, themeCategory11, bool, str15, i34, c24018OooO0oo14));
    }
}
