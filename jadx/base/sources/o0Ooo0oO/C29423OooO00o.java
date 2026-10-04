package o0Ooo0oO;

import OooOooo.C20785Oooo00o;
import Oooo0.o000000O;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.util.SizeF;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PagePaddingStyle;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
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
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27585o00ooO0;
import o0Ooo0Oo.C29406OooO0OO;
import o0Ooo0Oo.C29410OooO0oO;
import o0Ooo0o0.C29417OooO00o;
import o0Ooo0o0.C29420OooO0Oo;
import o0Ooo0o0.C29421OooO0o0;
import o0Ooo0o0.EnumC29418OooO0O0;
import o0Ooo0o0.EnumC29419OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33758OoooO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Ooo0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lo0Ooo0oO/OooO00o;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C29423OooO00o extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f104360OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f104361OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f104362OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27585o00ooO0 f104363OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<Integer> f104364OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<C29410OooO0oO> f104365OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f104366OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33769Ooooo0o f104367OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f104368OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33781o00o0O f104369OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33769Ooooo0o f104370OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33769Ooooo0o f104371OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f104372OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33769Ooooo0o f104373OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33769Ooooo0o f104374OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33769Ooooo0o f104375OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33781o00o0O f104376OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f104377OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33769Ooooo0o f104378OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33769Ooooo0o f104379OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33769Ooooo0o f104380OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33772OooooOo f104381OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33769Ooooo0o f104382OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33772OooooOo f104383OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f104358OooOoo0 = C24340OooO0oo.OooO00o("page_padding_apply_to_all");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f104357OooOoo = C24340OooO0oo.OooO00o("page_padding_apply_to_first_page");

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f104359OooOooO = C24340OooO0oo.OooO0o0("page_padding_colors");

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$patternOptions$1", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<EnumC29418OooO0O0, EnumC29419OooO0OO, Continuation<? super List<? extends C29421OooO0o0>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ EnumC29419OooO0OO f104384OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ EnumC29418OooO0O0 f104385OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(EnumC29418OooO0O0 enumC29418OooO0O0, EnumC29419OooO0OO enumC29419OooO0OO, Continuation<? super List<? extends C29421OooO0o0>> continuation) {
            OooO oooO = new OooO(3, continuation);
            oooO.f104385OooOo0o = enumC29418OooO0O0;
            oooO.f104384OooOo = enumC29419OooO0OO;
            return oooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            EnumC29418OooO0O0 enumC29418OooO0O0 = this.f104385OooOo0o;
            EnumC29419OooO0OO enumC29419OooO0OO = this.f104384OooOo;
            EnumC29419OooO0OO[] enumC29419OooO0OOArrValues = EnumC29419OooO0OO.values();
            ArrayList arrayList = new ArrayList(enumC29419OooO0OOArrValues.length);
            int length = enumC29419OooO0OOArrValues.length;
            for (int i = 0; i < length; i++) {
                EnumC29419OooO0OO enumC29419OooO0OO2 = enumC29419OooO0OOArrValues[i];
                boolean zContains = enumC29418OooO0O0.f104337OooOo.contains(enumC29419OooO0OO2);
                arrayList.add(new C29421OooO0o0(enumC29419OooO0OO2, enumC29419OooO0OO2.f104344OooOo0o, zContains && enumC29419OooO0OO2 == enumC29419OooO0OO, zContains));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19987OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f104386OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f104387OooO0O0;

        public C19987OooO00o(int i, boolean z) {
            this.f104386OooO00o = i;
            this.f104387OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19987OooO00o)) {
                return false;
            }
            C19987OooO00o c19987OooO00o = (C19987OooO00o) obj;
            c19987OooO00o.getClass();
            return this.f104386OooO00o == c19987OooO00o.f104386OooO00o && this.f104387OooO0O0 == c19987OooO00o.f104387OooO0O0;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f104387OooO0O0) + C20785Oooo00o.OooO00o(this.f104386OooO00o, C20785Oooo00o.OooO00o(25, C20785Oooo00o.OooO00o(100, Integer.hashCode(10) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemSpaceOptions(min=10, max=100, default=25, current=");
            sb.append(this.f104386OooO00o);
            sb.append(", isEnabled=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f104387OooO0O0);
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PaperSpec f104388OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Rect f104389OooO0O0;

        public OooO0O0(PaperSpec paperSpec, Rect paperPadding) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(paperSpec, "paperSpec");
            kotlin.jvm.internal.OooOOO0.OooO0oO(paperPadding, "paperPadding");
            this.f104388OooO00o = paperSpec;
            this.f104389OooO0O0 = paperPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104388OooO00o, oooO0O0.f104388OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104389OooO0O0, oooO0O0.f104389OooO0O0);
        }

        public final int hashCode() {
            return this.f104389OooO0O0.hashCode() + (this.f104388OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "PaperSpecAndPadding(paperSpec=" + this.f104388OooO00o + ", paperPadding=" + this.f104389OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO0OO */
    public /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f104390OooO00o;

        static {
            int[] iArr = new int[Page.RotationDirection.values().length];
            try {
                iArr[Page.RotationDirection.ROTATION_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Page.RotationDirection.CLOCKWISE_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Page.RotationDirection.CLOCKWISE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104390OooO00o = iArr;
            int[] iArr2 = new int[EnumC29418OooO0O0.values().length];
            try {
                iArr2[EnumC29418OooO0O0.f104332OooOoO0.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC29418OooO0O0.f104331OooOoO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC29418OooO0O0.f104334OooOoo.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC29418OooO0O0.f104333OooOoOO.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC29418OooO0O0.f104335OooOoo0.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$_originPage$1", m80623f = "PagePaddingViewModel.kt", m80624l = {178}, m80625m = "invokeSuspend")
    public static final class C29424OooO0Oo extends AbstractC32476OooO implements InterfaceC32509OooOOo<String, String, Page, Continuation<? super Page>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ String f104391OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f104392OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Page f104393OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ String f104394OooOoO0;

        public C29424OooO0Oo(Continuation<? super C29424OooO0Oo> continuation) {
            super(4, continuation);
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public final Object invoke(String str, String str2, Page page, Continuation<? super Page> continuation) {
            C29424OooO0Oo c29424OooO0Oo = C29423OooO00o.this.new C29424OooO0Oo(continuation);
            c29424OooO0Oo.f104391OooOo = str;
            c29424OooO0Oo.f104394OooOoO0 = str2;
            c29424OooO0Oo.f104393OooOoO = page;
            return c29424OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Page page;
            Object objOooo0OO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104392OooOo0o;
            C29423OooO00o c29423OooO00o = C29423OooO00o.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f104391OooOo;
                String str2 = this.f104394OooOoO0;
                page = this.f104393OooOoO;
                if (page == null) {
                    C27449o00O0OoO c27449o00O0OoO = c29423OooO00o.f104361OooO0Oo;
                    List listOooO0oO = OooOo.OooO0oO(str2);
                    this.f104391OooOo = null;
                    this.f104394OooOoO0 = null;
                    this.f104392OooOo0o = 1;
                    objOooo0OO = c27449o00O0OoO.Oooo0OO(21, str, listOooO0oO, this);
                    if (objOooo0OO == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                if (page != null) {
                    return null;
                }
                PaperSpec paperSpec = page.getPaperSpec();
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C29423OooO00o.f104358OooOoo0;
                c29423OooO00o.getClass();
                Float preciseWidth = paperSpec.getPreciseWidth();
                Float preciseHeight = paperSpec.getPreciseHeight();
                if (preciseWidth == null || preciseHeight == null) {
                    paperSpec = (paperSpec.getWidth() == 1240 && paperSpec.getHeight() == 1754 && kotlin.jvm.internal.OooOOO0.OooO0O0(paperSpec.getName(), "A4")) ? PaperSpec.INSTANCE.getA4() : PaperSpec.copy$default(paperSpec, null, null, false, 0, 0, Float.valueOf(paperSpec.getWidth()), Float.valueOf(paperSpec.getHeight()), 0, 0, 415, null);
                }
                page.setPaperSpec(paperSpec);
                OooO0O0 oooO0O0 = new OooO0O0(page.getPaperSpec(), page.getUnrotatedPaperPadding());
                C33781o00o0O c33781o00o0O = c29423OooO00o.f104368OooOO0o;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, oooO0O0);
                return page;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooo0OO = obj;
            page = (Page) oOo000Oo.OooOo.Oooo((List) objOooo0OO);
            if (page != null) {
            }
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$itemSpaceOptions$1", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32509OooOOo<Integer, EnumC29418OooO0O0, EnumC29419OooO0OO, Continuation<? super C19987OooO00o>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ EnumC29419OooO0OO f104396OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ int f104397OooOo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(4, continuation);
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public final Object invoke(Integer num, EnumC29418OooO0O0 enumC29418OooO0O0, EnumC29419OooO0OO enumC29419OooO0OO, Continuation<? super C19987OooO00o> continuation) {
            int iIntValue = num.intValue();
            OooO0o oooO0o = C29423OooO00o.this.new OooO0o(continuation);
            oooO0o.f104397OooOo0o = iIntValue;
            oooO0o.f104396OooOo = enumC29419OooO0OO;
            return oooO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            int i = this.f104397OooOo0o;
            EnumC29419OooO0OO enumC29419OooO0OO = this.f104396OooOo;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C29423OooO00o.f104358OooOoo0;
            C29423OooO00o.this.getClass();
            return new C19987OooO00o(i, enumC29419OooO0OO != EnumC29419OooO0OO.f104339OooOo);
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$composedPage$1", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C29425OooO0o0 extends AbstractC32476OooO implements InterfaceC32509OooOOo<Page, OooO0O0, PagePaddingStyle, Continuation<? super Page>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ OooO0O0 f104399OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Page f104400OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ PagePaddingStyle f104402OooOoO0;

        public C29425OooO0o0(Continuation<? super C29425OooO0o0> continuation) {
            super(4, continuation);
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public final Object invoke(Page page, OooO0O0 oooO0O0, PagePaddingStyle pagePaddingStyle, Continuation<? super Page> continuation) {
            C29425OooO0o0 c29425OooO0o0 = C29423OooO00o.this.new C29425OooO0o0(continuation);
            c29425OooO0o0.f104400OooOo0o = page;
            c29425OooO0o0.f104399OooOo = oooO0O0;
            c29425OooO0o0.f104402OooOoO0 = pagePaddingStyle;
            return c29425OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Page page = this.f104400OooOo0o;
            OooO0O0 oooO0O0 = this.f104399OooOo;
            PagePaddingStyle pagePaddingStyle = this.f104402OooOoO0;
            if (page == null || oooO0O0 == null) {
                return null;
            }
            if (pagePaddingStyle != null) {
                return Page.copy$default(page, null, null, oooO0O0.f104388OooO00o, null, null, pagePaddingStyle, oooO0O0.f104389OooO0O0, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524187, null);
            }
            PagePaddingStyle effectivePaddingStyle = page.getEffectivePaddingStyle();
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C29423OooO00o.f104358OooOoo0;
            C29423OooO00o.this.OooOOo0(effectivePaddingStyle);
            return null;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$layoutOptions$1", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C29426OooO0oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<EnumC29418OooO0O0, EnumC29419OooO0OO, Continuation<? super List<? extends C29420OooO0Oo>>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ EnumC29418OooO0O0 f104403OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(EnumC29418OooO0O0 enumC29418OooO0O0, EnumC29419OooO0OO enumC29419OooO0OO, Continuation<? super List<? extends C29420OooO0Oo>> continuation) {
            C29426OooO0oO c29426OooO0oO = new C29426OooO0oO(3, continuation);
            c29426OooO0oO.f104403OooOo0o = enumC29418OooO0O0;
            return c29426OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            EnumC29418OooO0O0 enumC29418OooO0O0 = this.f104403OooOo0o;
            EnumC29418OooO0O0[] enumC29418OooO0O0ArrValues = EnumC29418OooO0O0.values();
            ArrayList arrayList = new ArrayList(enumC29418OooO0O0ArrValues.length);
            int length = enumC29418OooO0O0ArrValues.length;
            for (int i = 0; i < length; i++) {
                EnumC29418OooO0O0 enumC29418OooO0O02 = enumC29418OooO0O0ArrValues[i];
                arrayList.add(new C29420OooO0Oo(enumC29418OooO0O02, enumC29418OooO0O02.f104338OooOo0o, enumC29418OooO0O02 == enumC29418OooO0O0));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$pagePaddingColorVoList$1", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C29427OooO0oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Integer>, PagePaddingStyle, Continuation<? super List<? extends C29406OooO0OO>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ PagePaddingStyle f104404OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f104405OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(List<? extends Integer> list, PagePaddingStyle pagePaddingStyle, Continuation<? super List<? extends C29406OooO0OO>> continuation) {
            C29427OooO0oo c29427OooO0oo = new C29427OooO0oo(3, continuation);
            c29427OooO0oo.f104405OooOo0o = list;
            c29427OooO0oo.f104404OooOo = pagePaddingStyle;
            return c29427OooO0oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = this.f104405OooOo0o;
            PagePaddingStyle pagePaddingStyle = this.f104404OooOo;
            Integer uniformColorIfApplicable = pagePaddingStyle != null ? pagePaddingStyle.getUniformColorIfApplicable() : null;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                arrayList.add(new C29406OooO0OO(iIntValue, uniformColorIfApplicable != null && uniformColorIfApplicable.intValue() == iIntValue));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOO0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$selectedPatternTypeFlow$1", m80623f = "PagePaddingViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<PagePaddingStyle, EnumC29418OooO0O0, Continuation<? super EnumC29419OooO0OO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ EnumC29418OooO0O0 f104406OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ PagePaddingStyle f104407OooOo0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(PagePaddingStyle pagePaddingStyle, EnumC29418OooO0O0 enumC29418OooO0O0, Continuation<? super EnumC29419OooO0OO> continuation) {
            OooOO0 oooOO02 = C29423OooO00o.this.new OooOO0(continuation);
            oooOO02.f104407OooOo0o = pagePaddingStyle;
            oooOO02.f104406OooOo = enumC29418OooO0O0;
            return oooOO02.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC29419OooO0OO enumC29419OooO0OOOooOO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            PagePaddingStyle pagePaddingStyle = this.f104407OooOo0o;
            EnumC29418OooO0O0 enumC29418OooO0O0 = this.f104406OooOo;
            if (pagePaddingStyle != null) {
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C29423OooO00o.f104358OooOoo0;
                C29423OooO00o.this.getClass();
                enumC29419OooO0OOOooOO0 = C29423OooO00o.OooOO0(pagePaddingStyle);
            } else {
                enumC29419OooO0OOOooOO0 = null;
            }
            EnumC29419OooO0OO enumC29419OooO0OO = EnumC29419OooO0OO.f104339OooOo;
            if (enumC29419OooO0OOOooOO0 == null) {
                enumC29419OooO0OOOooOO0 = enumC29419OooO0OO;
            }
            return enumC29418OooO0O0.OooO00o(enumC29419OooO0OOOooOO0);
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOO0O */
    public static final class OooOO0O implements InterfaceC33721OooO0o<List<? extends Integer>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29423OooO00o f104409OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f104410OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOO0O$OooO00o, reason: collision with other inner class name */
        public static final class C19988OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C29423OooO00o f104411OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f104412OooOo0o;

            /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$special$$inlined$map$1$2", m80623f = "PagePaddingViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19989OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f104413OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f104414OooOo0o;

                public C19989OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f104414OooOo0o = obj;
                    this.f104413OooOo |= Integer.MIN_VALUE;
                    return C19988OooO00o.this.emit(null, this);
                }
            }

            public C19988OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C29423OooO00o c29423OooO00o) {
                this.f104412OooOo0o = interfaceC33723OooO0oO;
                this.f104411OooOo = c29423OooO00o;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r5v5, types: [oO0o0Oo.OooO0oO] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List<java.lang.Integer>] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19989OooO00o c19989OooO00o;
                ?? arrayList;
                if (continuation instanceof C19989OooO00o) {
                    c19989OooO00o = (C19989OooO00o) continuation;
                    int i = c19989OooO00o.f104413OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19989OooO00o.f104413OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19989OooO00o = new C19989OooO00o(continuation);
                    }
                }
                Object obj2 = c19989OooO00o.f104414OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19989OooO00o.f104413OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(C29423OooO00o.f104359OooOooO);
                    if (str == null || str.length() == 0) {
                        arrayList = this.f104411OooOo.f104364OooO0oO;
                    } else {
                        List listOoooOO0 = C33599OooOo0O.OoooOO0(str, new String[]{","});
                        arrayList = new ArrayList();
                        Iterator<T> it = listOoooOO0.iterator();
                        while (it.hasNext()) {
                            Integer numOooOOO0 = C33596OooOOo0.OooOOO0((String) it.next());
                            if (numOooOOO0 != null) {
                                arrayList.add(numOooOOO0);
                            }
                        }
                    }
                    c19989OooO00o.f104413OooOo = 1;
                    if (this.f104412OooOo0o.emit(arrayList, c19989OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOO0O(InterfaceC33721OooO0o interfaceC33721OooO0o, C29423OooO00o c29423OooO00o) {
            this.f104410OooOo0o = interfaceC33721OooO0o;
            this.f104409OooOo = c29423OooO00o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Integer>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f104410OooOo0o.collect(new C19988OooO00o(interfaceC33723OooO0oO, this.f104409OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOO0o, reason: case insensitive filesystem */
    public static final class C29428OooOO0o implements InterfaceC33721OooO0o<EnumC29418OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29423OooO00o f104416OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f104417OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOO0o$OooO00o, reason: collision with other inner class name */
        public static final class C19990OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C29423OooO00o f104418OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f104419OooOo0o;

            /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$special$$inlined$map$2$2", m80623f = "PagePaddingViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19991OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f104420OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f104421OooOo0o;

                public C19991OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f104421OooOo0o = obj;
                    this.f104420OooOo |= Integer.MIN_VALUE;
                    return C19990OooO00o.this.emit(null, this);
                }
            }

            public C19990OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C29423OooO00o c29423OooO00o) {
                this.f104419OooOo0o = interfaceC33723OooO0oO;
                this.f104418OooOo = c29423OooO00o;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19991OooO00o c19991OooO00o;
                EnumC29418OooO0O0 enumC29418OooO0O0OooO;
                if (continuation instanceof C19991OooO00o) {
                    c19991OooO00o = (C19991OooO00o) continuation;
                    int i = c19991OooO00o.f104420OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19991OooO00o.f104420OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19991OooO00o = new C19991OooO00o(continuation);
                    }
                }
                Object obj2 = c19991OooO00o.f104421OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19991OooO00o.f104420OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    PagePaddingStyle pagePaddingStyle = (PagePaddingStyle) obj;
                    if (pagePaddingStyle != null) {
                        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C29423OooO00o.f104358OooOoo0;
                        this.f104418OooOo.getClass();
                        enumC29418OooO0O0OooO = C29423OooO00o.OooO(pagePaddingStyle);
                    } else {
                        enumC29418OooO0O0OooO = null;
                    }
                    if (enumC29418OooO0O0OooO == null) {
                        enumC29418OooO0O0OooO = EnumC29418OooO0O0.f104332OooOoO0;
                    }
                    c19991OooO00o.f104420OooOo = 1;
                    if (this.f104419OooOo0o.emit(enumC29418OooO0O0OooO, c19991OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C29428OooOO0o(C33781o00o0O c33781o00o0O, C29423OooO00o c29423OooO00o) {
            this.f104417OooOo0o = c33781o00o0O;
            this.f104416OooOo = c29423OooO00o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super EnumC29418OooO0O0> interfaceC33723OooO0oO, Continuation continuation) {
            this.f104417OooOo0o.collect(new C19990OooO00o(interfaceC33723OooO0oO, this.f104416OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOO */
    public static final class OooOOO implements InterfaceC33721OooO0o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f104423OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOO$OooO00o, reason: collision with other inner class name */
        public static final class C19992OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f104424OooOo0o;

            /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$special$$inlined$map$4$2", m80623f = "PagePaddingViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19993OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f104425OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f104426OooOo0o;

                public C19993OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f104426OooOo0o = obj;
                    this.f104425OooOo |= Integer.MIN_VALUE;
                    return C19992OooO00o.this.emit(null, this);
                }
            }

            public C19992OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f104424OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19993OooO00o c19993OooO00o;
                if (continuation instanceof C19993OooO00o) {
                    c19993OooO00o = (C19993OooO00o) continuation;
                    int i = c19993OooO00o.f104425OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19993OooO00o.f104425OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19993OooO00o = new C19993OooO00o(continuation);
                    }
                }
                Object obj2 = c19993OooO00o.f104426OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19993OooO00o.f104425OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Boolean bool = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(C29423OooO00o.f104358OooOoo0);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    c19993OooO00o.f104425OooOo = 1;
                    if (this.f104424OooOo0o.emit(boolValueOf, c19993OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f104423OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f104423OooOo0o.collect(new C19992OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOO0 */
    public static final class OooOOO0 implements InterfaceC33721OooO0o<List<? extends C29410OooO0oO>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29423OooO00o f104428OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f104429OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOO0$OooO00o, reason: collision with other inner class name */
        public static final class C19994OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C29423OooO00o f104430OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f104431OooOo0o;

            /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$special$$inlined$map$3$2", m80623f = "PagePaddingViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19995OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f104432OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f104433OooOo0o;

                public C19995OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f104433OooOo0o = obj;
                    this.f104432OooOo |= Integer.MIN_VALUE;
                    return C19994OooO00o.this.emit(null, this);
                }
            }

            public C19994OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C29423OooO00o c29423OooO00o) {
                this.f104431OooOo0o = interfaceC33723OooO0oO;
                this.f104430OooOo = c29423OooO00o;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19995OooO00o c19995OooO00o;
                T next;
                List<C29410OooO0oO> list;
                int i;
                if (continuation instanceof C19995OooO00o) {
                    c19995OooO00o = (C19995OooO00o) continuation;
                    int i2 = c19995OooO00o.f104432OooOo;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c19995OooO00o.f104432OooOo = i2 - Integer.MIN_VALUE;
                    } else {
                        c19995OooO00o = new C19995OooO00o(continuation);
                    }
                }
                Object obj2 = c19995OooO00o.f104433OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i3 = c19995OooO00o.f104432OooOo;
                if (i3 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Page page = (Page) obj;
                    C29423OooO00o c29423OooO00o = this.f104430OooOo;
                    if (page == null) {
                        list = c29423OooO00o.f104365OooO0oo;
                    } else {
                        C32443OooOOO<Integer, Integer> rotatedPageSize = page.getRotatedPageSize();
                        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                        Iterator<T> it = c29423OooO00o.f104365OooO0oo.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            C29410OooO0oO c29410OooO0oO = (C29410OooO0oO) next;
                            if (c29410OooO0oO.f104294OooO0Oo == rotatedPageSize.f116638OooOo0o.intValue()) {
                                if (c29410OooO0oO.f104296OooO0o0 == rotatedPageSize.f116637OooOo.intValue()) {
                                    break;
                                }
                            }
                        }
                        c24034Oooo00O.f80942OooOo0o = (T) next;
                        List<C29410OooO0oO> list2 = c29423OooO00o.f104365OooO0oo;
                        if (next == null) {
                            c24034Oooo00O.f80942OooOo0o = (T) list2.get(0);
                        }
                        o0oo000O.OooOO0.f111232OooO00o.getClass();
                        Size sizeOooOO0o = o0oo000O.OooOO0.OooOO0o(page);
                        int width = sizeOooOO0o.getWidth();
                        int height = sizeOooOO0o.getHeight();
                        List<C29410OooO0oO> list3 = list2;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                        for (C29410OooO0oO c29410OooO0oO2 : list3) {
                            int i4 = c29410OooO0oO2.f104294OooO0Oo;
                            boolean z = (1 <= i4 && i4 < width) || (1 <= (i = c29410OooO0oO2.f104296OooO0o0) && i < height);
                            arrayList.add(new C29410OooO0oO(c29410OooO0oO2.f104291OooO00o, c29410OooO0oO2.f104292OooO0O0, c29410OooO0oO2.f104293OooO0OO, c29410OooO0oO2.f104294OooO0Oo, c29410OooO0oO2.f104296OooO0o0, c29410OooO0oO2.equals(c24034Oooo00O.f80942OooOo0o) && !z, z));
                        }
                        list = arrayList;
                    }
                    c19995OooO00o.f104432OooOo = 1;
                    if (this.f104431OooOo0o.emit(list, c19995OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOO0(C33769Ooooo0o c33769Ooooo0o, C29423OooO00o c29423OooO00o) {
            this.f104429OooOo0o = c33769Ooooo0o;
            this.f104428OooOo = c29423OooO00o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends C29410OooO0oO>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f104429OooOo0o.f121747OooOo0o.collect(new C19994OooO00o(interfaceC33723OooO0oO, this.f104428OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOOO */
    public static final class OooOOOO implements InterfaceC33721OooO0o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f104435OooOo0o;

        /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOOO$OooO00o, reason: collision with other inner class name */
        public static final class C19996OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f104436OooOo0o;

            /* JADX INFO: renamed from: o0Ooo0oO.OooO00o$OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.viewmodel.PagePaddingViewModel$special$$inlined$map$5$2", m80623f = "PagePaddingViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19997OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f104437OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f104438OooOo0o;

                public C19997OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f104438OooOo0o = obj;
                    this.f104437OooOo |= Integer.MIN_VALUE;
                    return C19996OooO00o.this.emit(null, this);
                }
            }

            public C19996OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f104436OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19997OooO00o c19997OooO00o;
                if (continuation instanceof C19997OooO00o) {
                    c19997OooO00o = (C19997OooO00o) continuation;
                    int i = c19997OooO00o.f104437OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19997OooO00o.f104437OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19997OooO00o = new C19997OooO00o(continuation);
                    }
                }
                Object obj2 = c19997OooO00o.f104438OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19997OooO00o.f104437OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Boolean bool = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(C29423OooO00o.f104357OooOoo);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    c19997OooO00o.f104437OooOo = 1;
                    if (this.f104436OooOo0o.emit(boolValueOf, c19997OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOOO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
            this.f104435OooOo0o = interfaceC33721OooO0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f104435OooOo0o.collect(new C19996OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29423OooO00o(C27449o00O0OoO c27449o00O0OoO, C27585o00ooO0 c27585o00ooO0, o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f104361OooO0Oo = c27449o00O0OoO;
        this.f104363OooO0o0 = c27585o00ooO0;
        this.f104362OooO0o = dataStore;
        this.f104364OooO0oO = C34429OooOOo0.OooOO0o(-1, -5443, -198156, -1576977, -1581090);
        this.f104365OooO0oo = C34429OooOOo0.OooOO0o(new C29410OooO0oO(R.string.custom, 0.0f, 0.0f, 0, 0, false, false), new C29410OooO0oO(R.string.page_padding_spec_a4, 1240.1575f, 1753.937f, 1240, 1754, false, false), new C29410OooO0oO(R.string.page_padding_spec_a3, 1753.937f, 2480.315f, 1754, 2480, false, false), new C29410OooO0oO(R.string.page_padding_spec_a2, 2480.315f, 3507.874f, 2480, 3508, false, false), new C29410OooO0oO(R.string.page_padding_spec_a1, 3507.874f, 4966.535f, 3508, 4967, false, false), new C29410OooO0oO(R.string.page_padding_spec_letter, 1275.0f, 1760.0f, 1275, 1650, false, false), new C29410OooO0oO(R.string.page_padding_spec_legal, 1275.0f, 2100.0f, 1275, 2100, false, false));
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o("");
        this.f104360OooO = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o("");
        this.f104366OooOO0 = c33781o00o0OOooO00o2;
        C33758OoooO c33758OoooOOooO0oo = C25252OooO0Oo.OooO0oo(c33781o00o0OOooO00o, c33781o00o0OOooO00o2, C33784o00ooo.OooO00o(null), new C29424OooO0Oo(null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        int i = 2;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(c33758OoooOOooO0oo, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f104367OooOO0O = c33769Ooooo0oOooOoO0;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(null);
        this.f104368OooOO0o = c33781o00o0OOooO00o3;
        OooOO0O oooOO0O = new OooOO0O(dataStore.getData(), this);
        C33822OooO0OO c33822OooO0OOOooO0oO = C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f104370OooOOO0 = C25252OooO0Oo.OooOoO0(oooOO0O, c33822OooO0OOOooO0oO, c33779o00Oo0OooO00o, c34434OooOoO);
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(null);
        this.f104369OooOOO = c33781o00o0OOooO00o4;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(new C29428OooOO0o(c33781o00o0OOooO00o4, this), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), EnumC29418OooO0O0.f104332OooOoO0);
        this.f104371OooOOOO = c33769Ooooo0oOooOoO02;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o4, c33769Ooooo0oOooOoO02, new OooOO0(null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), EnumC29419OooO0OO.f104339OooOo);
        this.f104372OooOOOo = c33769Ooooo0oOooOoO03;
        this.f104374OooOOo0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO0, c33781o00o0OOooO00o3, c33781o00o0OOooO00o4, new C29425OooO0o0(null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(c33769Ooooo0oOooOoO02, c33769Ooooo0oOooOoO03, new C29426OooO0oO(3, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o2 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        EnumC29418OooO0O0[] enumC29418OooO0O0ArrValues = EnumC29418OooO0O0.values();
        ArrayList arrayList = new ArrayList(enumC29418OooO0O0ArrValues.length);
        int length = enumC29418OooO0O0ArrValues.length;
        int i2 = 0;
        while (i2 < length) {
            EnumC29418OooO0O0 enumC29418OooO0O0 = enumC29418OooO0O0ArrValues[i2];
            int i3 = i;
            arrayList.add(new C29420OooO0Oo(enumC29418OooO0O0, enumC29418OooO0O0.f104338OooOo0o, enumC29418OooO0O0 == this.f104371OooOOOO.f121747OooOo0o.getValue()));
            i2++;
            i = i3;
        }
        int i4 = i;
        this.f104373OooOOo = C25252OooO0Oo.OooOoO0(c33763OoooOOO, interfaceC33636Oooo00oOooO00o2, c33779o00Oo0OooO00o2, arrayList);
        C33763OoooOOO c33763OoooOOO2 = new C33763OoooOOO(this.f104371OooOOOO, this.f104372OooOOOo, new OooO(3, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o3 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o3 = InterfaceC33788ooOO.OooO00o.OooO00o(i4);
        EnumC29419OooO0OO[] enumC29419OooO0OOArrValues = EnumC29419OooO0OO.values();
        ArrayList arrayList2 = new ArrayList(enumC29419OooO0OOArrValues.length);
        int length2 = enumC29419OooO0OOArrValues.length;
        for (int i5 = 0; i5 < length2; i5++) {
            EnumC29419OooO0OO enumC29419OooO0OO = enumC29419OooO0OOArrValues[i5];
            arrayList2.add(new C29421OooO0o0(enumC29419OooO0OO, enumC29419OooO0OO.f104344OooOo0o, enumC29419OooO0OO == this.f104372OooOOOo.f121747OooOo0o.getValue(), ((EnumC29418OooO0O0) this.f104371OooOOOO.f121747OooOo0o.getValue()).f104337OooOo.contains(enumC29419OooO0OO)));
        }
        this.f104375OooOOoo = C25252OooO0Oo.OooOoO0(c33763OoooOOO2, interfaceC33636Oooo00oOooO00o3, c33779o00Oo0OooO00o3, arrayList2);
        this.f104378OooOo00 = C25252OooO0Oo.OooOoO0(new OooOOO0(this.f104374OooOOo0, this), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(i4), this.f104365OooO0oo);
        this.f104377OooOo0 = C25252OooO0Oo.OooOoO0(new OooOOO(this.f104362OooO0o.getData()), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(i4), Boolean.TRUE);
        this.f104379OooOo0O = C25252OooO0Oo.OooOoO0(new OooOOOO(this.f104362OooO0o.getData()), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(i4), Boolean.FALSE);
        this.f104380OooOo0o = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(this.f104370OooOOO0, this.f104369OooOOO, new C29427OooO0oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(i4), c34434OooOoO);
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(25);
        this.f104376OooOo = c33781o00o0OOooO00o5;
        C33758OoooO c33758OoooOOooO0oo2 = C25252OooO0Oo.OooO0oo(c33781o00o0OOooO00o5, this.f104371OooOOOO, this.f104372OooOOOo, new OooO0o(null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o4 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o4 = InterfaceC33788ooOO.OooO00o.OooO00o(i4);
        EnumC29418OooO0O0 enumC29418OooO0O02 = EnumC29418OooO0O0.f104332OooOoO0;
        EnumC29419OooO0OO enumC29419OooO0OO2 = EnumC29419OooO0OO.f104339OooOo;
        this.f104382OooOoO0 = C25252OooO0Oo.OooOoO0(c33758OoooOOooO0oo2, interfaceC33636Oooo00oOooO00o4, c33779o00Oo0OooO00o4, new C19987OooO00o(25, false));
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f104381OooOoO = c33772OooooOoOooO0O0;
        this.f104383OooOoOO = c33772OooooOoOooO0O0;
    }

    public static EnumC29418OooO0O0 OooO(PagePaddingStyle pagePaddingStyle) {
        PaperStyle paperStyle;
        LambdaPaperTheme lambdaPaperThemeOooOO0o = OooOO0o(pagePaddingStyle);
        if (lambdaPaperThemeOooOO0o == null || (paperStyle = lambdaPaperThemeOooOO0o.getPaperStyle()) == null) {
            return null;
        }
        if ((paperStyle instanceof BlankPaperStyle) || (paperStyle instanceof HollowLinePaperStyle) || (paperStyle instanceof HollowDotPaperStyle) || (paperStyle instanceof HollowSquarePaperStyle)) {
            return EnumC29418OooO0O0.f104332OooOoO0;
        }
        if ((paperStyle instanceof HollowLineTwoColumnPaperStyle) || (paperStyle instanceof HollowDotTwoColumnPaperStyle) || (paperStyle instanceof HollowSquareTwoColumnPaperStyle) || (paperStyle instanceof HollowBlankTwoColumnPaperStyle)) {
            return ((HollowPaperStyle) paperStyle).getHorizontalFlip() ? EnumC29418OooO0O0.f104333OooOoOO : EnumC29418OooO0O0.f104331OooOoO;
        }
        if ((paperStyle instanceof HollowLineThreeColumnPaperStyle) || (paperStyle instanceof HollowDotThreeColumnPaperStyle) || (paperStyle instanceof HollowSquareThreeColumnPaperStyle) || (paperStyle instanceof HollowBlankThreeColumnPaperStyle)) {
            return ((HollowPaperStyle) paperStyle).getHorizontalFlip() ? EnumC29418OooO0O0.f104335OooOoo0 : EnumC29418OooO0O0.f104334OooOoo;
        }
        return null;
    }

    public static final Bitmap OooO0o0(C29423OooO00o c29423OooO00o, Bitmap bitmap, Page.RotationDirection rotationDirection) {
        if (rotationDirection == Page.RotationDirection.ROTATION_0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int i = OooO0OO.f104390OooO00o[rotationDirection.ordinal()];
        matrix.postRotate(i != 2 ? i != 3 ? i != 4 ? 0.0f : 270.0f : 180.0f : 90.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static Rect OooO0oo(Rect rect, Page.RotationDirection rotationDirection) {
        int i = OooO0OO.f104390OooO00o[rotationDirection.ordinal()];
        if (i == 1) {
            return rect;
        }
        if (i == 2) {
            return new Rect(rect.top, rect.right, rect.bottom, rect.left);
        }
        if (i == 3) {
            return new Rect(rect.right, rect.bottom, rect.left, rect.top);
        }
        if (i == 4) {
            return new Rect(rect.bottom, rect.left, rect.top, rect.right);
        }
        throw new C32442OooOO0o();
    }

    public static EnumC29419OooO0OO OooOO0(PagePaddingStyle pagePaddingStyle) {
        PaperStyle paperStyle;
        LambdaPaperTheme lambdaPaperThemeOooOO0o = OooOO0o(pagePaddingStyle);
        if (lambdaPaperThemeOooOO0o == null || (paperStyle = lambdaPaperThemeOooOO0o.getPaperStyle()) == null) {
            return null;
        }
        if ((paperStyle instanceof HollowLinePaperStyle) || (paperStyle instanceof HollowLineTwoColumnPaperStyle) || (paperStyle instanceof HollowLineThreeColumnPaperStyle)) {
            return EnumC29419OooO0OO.f104341OooOoO0;
        }
        if ((paperStyle instanceof HollowDotPaperStyle) || (paperStyle instanceof HollowDotTwoColumnPaperStyle) || (paperStyle instanceof HollowDotThreeColumnPaperStyle)) {
            return EnumC29419OooO0OO.f104342OooOoOO;
        }
        if ((paperStyle instanceof HollowSquarePaperStyle) || (paperStyle instanceof HollowSquareTwoColumnPaperStyle) || (paperStyle instanceof HollowSquareThreeColumnPaperStyle)) {
            return EnumC29419OooO0OO.f104340OooOoO;
        }
        if ((paperStyle instanceof BlankPaperStyle) || (paperStyle instanceof HollowBlankTwoColumnPaperStyle) || (paperStyle instanceof HollowBlankThreeColumnPaperStyle)) {
            return EnumC29419OooO0OO.f104339OooOo;
        }
        return null;
    }

    public static LambdaPaperTheme OooOO0o(PagePaddingStyle pagePaddingStyle) {
        PaperTheme theme = pagePaddingStyle.getTheme();
        if (theme instanceof LambdaPaperTheme) {
            return (LambdaPaperTheme) theme;
        }
        return null;
    }

    public static C32443OooOOO OooOOO0(Page page) {
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        Size sizeOooOOO = o0oo000O.OooOO0.OooOOO(page);
        return new C32443OooOOO(Integer.valueOf(sizeOooOOO.getWidth()), Integer.valueOf(sizeOooOOO.getHeight()));
    }

    public final PagePaddingStyle OooO0o(EnumC29418OooO0O0 enumC29418OooO0O0, EnumC29419OooO0OO patternType, Integer num, Float f, PagePaddingStyle pagePaddingStyle) {
        boolean z;
        C29417OooO00o c29417OooO00o;
        PaperStyle blankPaperStyle;
        PaperStyle hollowLinePaperStyle;
        PaperStyle paperStyle;
        int color;
        ThemeCategory category;
        PaperOrientation orientation;
        String name;
        PaperStyle hollowBlankTwoColumnPaperStyle;
        LambdaPaperTheme lambdaPaperThemeOooOO0o = OooOO0o(pagePaddingStyle);
        int iOrdinal = enumC29418OooO0O0.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            z = false;
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            z = true;
        } else {
            if (iOrdinal != 4) {
                throw new C32442OooOO0o();
            }
            z = false;
        }
        PaperStyle paperStyle2 = lambdaPaperThemeOooOO0o != null ? lambdaPaperThemeOooOO0o.getPaperStyle() : null;
        if (paperStyle2 instanceof HollowPaperStyle) {
            HollowPaperStyle hollowPaperStyle = (HollowPaperStyle) paperStyle2;
            c29417OooO00o = new C29417OooO00o(hollowPaperStyle.getPaperWidth(), hollowPaperStyle.getPaperHeight(), hollowPaperStyle.getForegroundAlpha(), f == null ? hollowPaperStyle.getRequiredItemSpace() : f, z, hollowPaperStyle.getLeftPadding(), hollowPaperStyle.getTopPadding(), hollowPaperStyle.getRightPadding(), hollowPaperStyle.getBottomPadding());
        } else {
            OooO0O0 oooO0O0 = (OooO0O0) this.f104368OooOO0o.getValue();
            if (oooO0O0 != null) {
                PaperSpec paperSpec = oooO0O0.f104388OooO00o;
                Float preciseWidth = paperSpec.getPreciseWidth();
                float fFloatValue = preciseWidth != null ? preciseWidth.floatValue() : paperSpec.getWidth();
                Float preciseHeight = paperSpec.getPreciseHeight();
                float fFloatValue2 = preciseHeight != null ? preciseHeight.floatValue() : paperSpec.getHeight();
                Rect rect = oooO0O0.f104389OooO0O0;
                c29417OooO00o = new C29417OooO00o(fFloatValue, fFloatValue2, null, null, false, Float.valueOf(rect.left), Float.valueOf(rect.top), Float.valueOf(rect.right), Float.valueOf(rect.bottom));
            } else {
                c29417OooO00o = C29417OooO00o.f104321OooOO0;
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(patternType, "patternType");
        EnumC29419OooO0OO enumC29419OooO0OOOooO00o = enumC29418OooO0O0.OooO00o(patternType);
        int iOrdinal2 = enumC29418OooO0O0.ordinal();
        if (iOrdinal2 == 0) {
            int iOrdinal3 = enumC29419OooO0OOOooO00o.ordinal();
            if (iOrdinal3 == 0) {
                blankPaperStyle = new BlankPaperStyle();
            } else if (iOrdinal3 == 1) {
                hollowLinePaperStyle = new HollowLinePaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, false, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO, 16, null);
                paperStyle = hollowLinePaperStyle;
            } else if (iOrdinal3 == 2) {
                blankPaperStyle = new HollowSquarePaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, false, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO, 16, null);
            } else {
                if (iOrdinal3 != 3) {
                    throw new C32442OooOO0o();
                }
                blankPaperStyle = new HollowDotPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, false, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO, 16, null);
            }
            paperStyle = blankPaperStyle;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            int iOrdinal4 = enumC29419OooO0OOOooO00o.ordinal();
            if (iOrdinal4 == 0) {
                hollowBlankTwoColumnPaperStyle = new HollowBlankTwoColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                paperStyle = hollowBlankTwoColumnPaperStyle;
            } else if (iOrdinal4 != 1) {
                if (iOrdinal4 == 2) {
                    blankPaperStyle = new HollowSquareTwoColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                } else {
                    if (iOrdinal4 != 3) {
                        throw new C32442OooOO0o();
                    }
                    blankPaperStyle = new HollowDotTwoColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                }
                paperStyle = blankPaperStyle;
            } else {
                hollowLinePaperStyle = new HollowLineTwoColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                paperStyle = hollowLinePaperStyle;
            }
        } else {
            if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                throw new C32442OooOO0o();
            }
            int iOrdinal5 = enumC29419OooO0OOOooO00o.ordinal();
            if (iOrdinal5 == 0) {
                hollowBlankTwoColumnPaperStyle = new HollowBlankThreeColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                paperStyle = hollowBlankTwoColumnPaperStyle;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 == 2) {
                    blankPaperStyle = new HollowSquareThreeColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                } else {
                    if (iOrdinal5 != 3) {
                        throw new C32442OooOO0o();
                    }
                    blankPaperStyle = new HollowDotThreeColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                }
                paperStyle = blankPaperStyle;
            } else {
                hollowLinePaperStyle = new HollowLineThreeColumnPaperStyle(c29417OooO00o.f104323OooO00o, c29417OooO00o.f104324OooO0O0, c29417OooO00o.f104325OooO0OO, c29417OooO00o.f104326OooO0Oo, c29417OooO00o.f104328OooO0o0, c29417OooO00o.f104327OooO0o, c29417OooO00o.f104329OooO0oO, c29417OooO00o.f104330OooO0oo, c29417OooO00o.f104322OooO);
                paperStyle = hollowLinePaperStyle;
            }
        }
        if (num != null) {
            color = num.intValue();
        } else {
            PaperTheme baseTheme = lambdaPaperThemeOooOO0o != null ? lambdaPaperThemeOooOO0o.getBaseTheme() : null;
            color = baseTheme instanceof ColorPaperTheme ? ((ColorPaperTheme) baseTheme).getColor() : -1;
        }
        if (lambdaPaperThemeOooOO0o == null || (category = lambdaPaperThemeOooOO0o.getCategory()) == null) {
            category = o0OOOO00.OooOO0O.f94361OooOOOO;
        }
        ThemeCategory themeCategory = category;
        if (lambdaPaperThemeOooOO0o == null || (orientation = lambdaPaperThemeOooOO0o.getOrientation()) == null) {
            orientation = PaperOrientation.VERTICAL;
        }
        PaperOrientation paperOrientation = orientation;
        if (lambdaPaperThemeOooOO0o == null || (name = lambdaPaperThemeOooOO0o.getName()) == null) {
            name = "";
        }
        String str = name;
        String myTemplateId = lambdaPaperThemeOooOO0o != null ? lambdaPaperThemeOooOO0o.getMyTemplateId() : null;
        ColorPaperTheme colorPaperTheme = new ColorPaperTheme(null, color, 1, null);
        return PagePaddingStyle.INSTANCE.createByTheme(lambdaPaperThemeOooOO0o != null ? lambdaPaperThemeOooOO0o.copy(colorPaperTheme, themeCategory, paperOrientation, str, paperStyle, myTemplateId) : new LambdaPaperTheme(colorPaperTheme, themeCategory, paperOrientation, str, paperStyle, myTemplateId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO0O0 OooO0oO(Rect rect) {
        SizeF sizeF;
        PaperSpec paperSpec;
        Page page = (Page) this.f104367OooOO0O.f121747OooOo0o.getValue();
        if (page != null) {
            o0oo000O.OooOO0.f111232OooO00o.getClass();
            C32443OooOOO<Float, Float> unrotatedPrecisePageSize = page.getUnrotatedPrecisePageSize();
            if (unrotatedPrecisePageSize == null) {
                sizeF = null;
            } else {
                Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
                sizeF = new SizeF((unrotatedPrecisePageSize.f116638OooOo0o.floatValue() - unrotatedPaperPadding.left) - unrotatedPaperPadding.right, (unrotatedPrecisePageSize.f116637OooOo.floatValue() - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom);
            }
            C32443OooOOO c32443OooOOO = sizeF == null ? null : new C32443OooOOO(Float.valueOf(sizeF.getWidth()), Float.valueOf(sizeF.getHeight()));
            if (c32443OooOOO != null) {
                OooOOO0(page);
                Rect rectOooO0oo = OooO0oo(rect, page.getRotationDirection());
                int i = rectOooO0oo.left + rectOooO0oo.right;
                int i2 = rectOooO0oo.top + rectOooO0oo.bottom;
                PaperOrientation paperOrientation = page.getPaperOrientation();
                PaperOrientation paperOrientation2 = PaperOrientation.VERTICAL;
                B b = c32443OooOOO.f116637OooOo;
                A a = c32443OooOOO.f116638OooOo0o;
                if (paperOrientation == paperOrientation2) {
                    Number number = (Number) a;
                    float f = i;
                    Number number2 = (Number) b;
                    float f2 = i2;
                    paperSpec = new PaperSpec("Custom", null, false, oO0O00O.OooO00o.OooO0O0(number.floatValue() + f), oO0O00O.OooO00o.OooO0O0(number2.floatValue() + f2), Float.valueOf(number.floatValue() + f), Float.valueOf(number2.floatValue() + f2), 0, 0, 6, null);
                } else {
                    Number number3 = (Number) b;
                    float f3 = i2;
                    Number number4 = (Number) a;
                    float f4 = i;
                    paperSpec = new PaperSpec("Custom", null, false, oO0O00O.OooO00o.OooO0O0(number3.floatValue() + f3), oO0O00O.OooO00o.OooO0O0(number4.floatValue() + f4), Float.valueOf(number3.floatValue() + f3), Float.valueOf(number4.floatValue() + f4), 0, 0, 6, null);
                }
                return new OooO0O0(paperSpec, rectOooO0oo);
            }
        }
        return null;
    }

    public final Float OooOO0O(EnumC29419OooO0OO enumC29419OooO0OO) {
        if (enumC29419OooO0OO != EnumC29419OooO0OO.f104339OooOo) {
            return Float.valueOf(o000000O.OooO0o0(((Number) this.f104376OooOo.getValue()).intValue()));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Page OooOOO(Rect rect) {
        OooO0O0 oooO0O0OooO0oO = OooO0oO(rect);
        if (oooO0O0OooO0oO == null) {
            return null;
        }
        Page page = (Page) this.f104374OooOOo0.f121747OooOo0o.getValue();
        if (page == null && (page = (Page) this.f104367OooOO0O.f121747OooOo0o.getValue()) == null) {
            return null;
        }
        PagePaddingStyle effectivePaddingStyle = (PagePaddingStyle) this.f104369OooOOO.getValue();
        if (effectivePaddingStyle == null) {
            effectivePaddingStyle = page.getEffectivePaddingStyle();
        }
        return Page.copy$default(page, null, null, PaperSpec.copy$default(oooO0O0OooO0oO.f104388OooO00o, null, null, false, 0, 0, null, null, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null), null, null, effectivePaddingStyle, new Rect(oooO0O0OooO0oO.f104389OooO0O0), null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524187, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOOO(int i) {
        PagePaddingStyle pagePaddingStyle = (PagePaddingStyle) this.f104369OooOOO.getValue();
        if (pagePaddingStyle == null) {
            return;
        }
        EnumC29418OooO0O0 enumC29418OooO0O0 = (EnumC29418OooO0O0) this.f104371OooOOOO.f121747OooOo0o.getValue();
        EnumC29419OooO0OO enumC29419OooO0OO = (EnumC29419OooO0OO) this.f104372OooOOOo.f121747OooOo0o.getValue();
        PagePaddingStyle pagePaddingStyleOooO0o = OooO0o(enumC29418OooO0O0, enumC29419OooO0OO, Integer.valueOf(i), OooOO0O(enumC29419OooO0OO), pagePaddingStyle);
        if (pagePaddingStyleOooO0o == null) {
            return;
        }
        OooOOo0(pagePaddingStyleOooO0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOOo(float f, float f2) {
        Number number;
        int i;
        PaperSpec paperSpec;
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(f);
        int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(f2);
        Page page = (Page) this.f104367OooOO0O.f121747OooOo0o.getValue();
        if (page == null) {
            return;
        }
        C32443OooOOO c32443OooOOOOooOOO0 = OooOOO0(page);
        Number number2 = (Number) c32443OooOOOOooOOO0.f116638OooOo0o;
        int iIntValue = (iOooO0O0 - number2.intValue()) / 2;
        Number number3 = (Number) c32443OooOOOOooOOO0.f116637OooOo;
        int iIntValue2 = (iOooO0O02 - number3.intValue()) / 2;
        if (iIntValue < 0 || iIntValue2 < 0) {
            return;
        }
        if (page.getPaperOrientation() == PaperOrientation.VERTICAL) {
            number = number2;
            i = iIntValue2;
            paperSpec = new PaperSpec("Custom", null, false, iOooO0O0, iOooO0O02, Float.valueOf(f), Float.valueOf(f2), 0, 0, 6, null);
        } else {
            number = number2;
            i = iIntValue2;
            paperSpec = new PaperSpec("Custom", null, false, iOooO0O02, iOooO0O0, Float.valueOf(f2), Float.valueOf(f), 0, 0, 6, null);
            iOooO0O02 = iOooO0O02;
            iOooO0O0 = iOooO0O0;
        }
        Rect rect = new Rect(iIntValue, i, (iOooO0O0 - number.intValue()) - iIntValue, (iOooO0O02 - number3.intValue()) - i);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PagePaddingViewModel");
        c20358OooO00o.OooO00o("setPaperSize: " + paperSpec + ", " + rect, new Object[0]);
        OooO0O0 oooO0O0 = new OooO0O0(paperSpec, rect);
        C33781o00o0O c33781o00o0O = this.f104368OooOO0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO0O0);
    }

    public final void OooOOo(PagePaddingStyle pagePaddingStyle) {
        EnumC29419OooO0OO enumC29419OooO0OOOooOO0;
        if (OooO(pagePaddingStyle) == null || (enumC29419OooO0OOOooOO0 = OooOO0(pagePaddingStyle)) == null || enumC29419OooO0OOOooOO0 == EnumC29419OooO0OO.f104339OooOo) {
            return;
        }
        LambdaPaperTheme lambdaPaperThemeOooOO0o = OooOO0o(pagePaddingStyle);
        PaperStyle paperStyle = lambdaPaperThemeOooOO0o != null ? lambdaPaperThemeOooOO0o.getPaperStyle() : null;
        HollowPaperStyle hollowPaperStyle = paperStyle instanceof HollowPaperStyle ? (HollowPaperStyle) paperStyle : null;
        if (hollowPaperStyle == null) {
            return;
        }
        Float requiredItemSpace = hollowPaperStyle.getRequiredItemSpace();
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0(requiredItemSpace != null ? requiredItemSpace.floatValue() / Resources.getSystem().getDisplayMetrics().density : 25.0f), 10, 100);
        C33781o00o0O c33781o00o0O = this.f104376OooOo;
        if (((Number) c33781o00o0O.getValue()).intValue() != iOooO0o) {
            Integer numValueOf = Integer.valueOf(iOooO0o);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }
    }

    public final void OooOOo0(PagePaddingStyle pagePaddingStyle) {
        C33781o00o0O c33781o00o0O = this.f104369OooOOO;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c33781o00o0O.getValue(), pagePaddingStyle)) {
            OooOOo(pagePaddingStyle);
        } else {
            c33781o00o0O.setValue(pagePaddingStyle);
            OooOOo(pagePaddingStyle);
        }
    }

    public final float OooOOoo(float f) {
        for (C29410OooO0oO c29410OooO0oO : this.f104365OooO0oo) {
            int iOooO0O0 = oO0O00O.OooO00o.OooO0O0((c29410OooO0oO.f104292OooO0O0 / 150.0f) * 72.0f);
            float f2 = c29410OooO0oO.f104293OooO0OO;
            int iOooO0O02 = oO0O00O.OooO00o.OooO0O0((f2 / 150.0f) * 72.0f);
            if (f == c29410OooO0oO.f104292OooO0O0) {
                return iOooO0O0;
            }
            if (f == f2) {
                return iOooO0O02;
            }
        }
        return (f / 150.0f) * 72;
    }
}
