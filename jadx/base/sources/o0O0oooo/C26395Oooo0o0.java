package o0O0oooo;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0.C20860Ooooooo;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.util.Log;
import android.util.LruCache;
import android.util.Size;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.words.WarningType;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.HyperLink;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.domain.models.page.PagePaddingStyle;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.domain.models.page.Shape;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.notein.domain.models.page.TextBox;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import com.orion.penkit.models.HyperLinkInfo;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import com.orion.penkit.tools.DrawToolFactory;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Predicate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.C24034Oooo00O;
import o000OoO.C24536OooO0Oo;
import o0O0oOO.C26110OooO0o0;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.C26112OooO0oo;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0OOo0o.C27445o00O0O0o;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27460o00O0oOo;
import o0OOo0o.C27462o00O0oo0;
import o0OOo0o.o00O0O0;
import o0OOo0o.o00O0OO;
import o0OOo0o.o00O0OO0;
import o0OOo0o.o00O0OOO;
import o0OOo0o.o00OO0;
import o0OOo0o.o00OO0O;
import o0OOo0o.o00OO0O0;
import o0OOo0o.o00OO0OO;
import o0OOooO.C27881OooOO0O;
import o0OOooo0.C27988OooO0oo;
import o0OOooo0.C27994OooOOOO;
import o0Oo0.C28023OooO00o;
import o0OoO0oo.C28694OooOO0O;
import o0OoO0oo.InterfaceC28962o00oOoOo;
import o0oo000O.C31183OooO00o;
import o0oo0OOo.C31237OooO0O0;
import o0oo0o.InterfaceC31283OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0O0oooo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26395Oooo0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PdfiumCore f90551OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C28694OooOO0O f90552OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27449o00O0OoO f90553OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27881OooOO0O f90554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f90555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f90556OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Integer f90557OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC28962o00oOoOo f90558OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Object f90559OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<Page> f90560OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ConcurrentHashMap<String, PdfDocument> f90561OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f90562OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final HashMap<Integer, List<InkStrokeInfo>> f90563OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final HashMap<Integer, List<DrawRecord>> f90564OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final HashMap<Integer, List<ShapeInfo>> f90565OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final HashMap<Integer, List<ImageInfo>> f90566OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final HashMap<Integer, List<TextBoxInfo>> f90567OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final HashMap<Integer, List<QuoteInfo>> f90568OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final HashMap<Integer, List<DualLinkSourceInfo>> f90569OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f90570OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final HashMap<Integer, List<HyperLinkInfo>> f90571OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final HashMap<Integer, List<DualLinkRefInfo>> f90572OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, List<RectF>> f90573OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LruCache<C26111OooO0oO, Bitmap> f90574OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f90575OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C26398OooO0oO f90576OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ConcurrentSkipListSet<Integer> f90577OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, HashSet<String>> f90578OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ConcurrentSkipListSet<Integer> f90579OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f90580OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Paint f90581OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f90582Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Paint f90583Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f90584Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f90585Oooo00o;

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO */
    public static final class OooO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((InkStrokeInfo) t).getCreationTime()), Long.valueOf(((InkStrokeInfo) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.adapter.NoteInCore$1", m80623f = "NoteInCore.kt", m80624l = {163, 165}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f90586OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C26395Oooo0o0 f90587OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C26395Oooo0o0.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (o0O0oooo.C26395Oooo0o0.OooO00o(r2, r6) == r0) goto L16;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C26395Oooo0o0 c26395Oooo0o0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90586OooOo;
            C26395Oooo0o0 c26395Oooo0o02 = C26395Oooo0o0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27449o00O0OoO c27449o00O0OoO = c26395Oooo0o02.f90553OooO0O0;
                C28694OooOO0O c28694OooOO0O = c26395Oooo0o02.f90552OooO00o;
                String str = c28694OooOO0O.f101667OooO00o;
                this.f90587OooOo0o = c26395Oooo0o02;
                this.f90586OooOo = 1;
                obj = c27449o00O0OoO.Oooo00o(str, c28694OooOO0O.f101668OooO0O0, this);
                if (obj != enumC32485OooO00o) {
                    c26395Oooo0o0 = c26395Oooo0o02;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c26395Oooo0o0 = this.f90587OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c26395Oooo0o0.f90560OooOO0 = (List) obj;
            this.f90587OooOo0o = null;
            this.f90586OooOo = 2;
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RectF f90589OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PaperTheme f90590OooO0O0;

        public OooO0O0(RectF rectF, PaperTheme theme) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(theme, "theme");
            this.f90589OooO00o = rectF;
            this.f90590OooO0O0 = theme;
        }

        public static OooO0O0 OooO00o(OooO0O0 oooO0O0, RectF rectF) {
            PaperTheme theme = oooO0O0.f90590OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(theme, "theme");
            return new OooO0O0(rectF, theme);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f90589OooO00o, oooO0O0.f90589OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f90590OooO0O0, oooO0O0.f90590OooO0O0);
        }

        public final int hashCode() {
            return this.f90590OooO0O0.hashCode() + (this.f90589OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "PaddingRenderRegion(rect=" + this.f90589OooO00o + ", theme=" + this.f90590OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Page f90591OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<String> f90592OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Page.RotationDirection f90593OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f90594OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f90595OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f90596OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final RectF f90597OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Bitmap f90598OooO0oo;

        public OooO0OO(Page page, List<String> list, Page.RotationDirection pageRotation, boolean z, int i, int i2, RectF unrotNormRenderBounds, Bitmap unrotBitmap) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageRotation, "pageRotation");
            kotlin.jvm.internal.OooOOO0.OooO0oO(unrotNormRenderBounds, "unrotNormRenderBounds");
            kotlin.jvm.internal.OooOOO0.OooO0oO(unrotBitmap, "unrotBitmap");
            this.f90591OooO00o = page;
            this.f90592OooO0O0 = list;
            this.f90593OooO0OO = pageRotation;
            this.f90594OooO0Oo = z;
            this.f90596OooO0o0 = i;
            this.f90595OooO0o = i2;
            this.f90597OooO0oO = unrotNormRenderBounds;
            this.f90598OooO0oo = unrotBitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f90591OooO00o, oooO0OO.f90591OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f90592OooO0O0, oooO0OO.f90592OooO0O0) && this.f90593OooO0OO == oooO0OO.f90593OooO0OO && this.f90594OooO0Oo == oooO0OO.f90594OooO0Oo && this.f90596OooO0o0 == oooO0OO.f90596OooO0o0 && this.f90595OooO0o == oooO0OO.f90595OooO0o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f90597OooO0oO, oooO0OO.f90597OooO0oO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f90598OooO0oo, oooO0OO.f90598OooO0oo);
        }

        public final int hashCode() {
            return this.f90598OooO0oo.hashCode() + C20424OooO0Oo.OooO0OO(this.f90597OooO0oO, C20785Oooo00o.OooO00o(this.f90595OooO0o, C20785Oooo00o.OooO00o(this.f90596OooO0o0, o00000.OooO0O0((this.f90593OooO0OO.hashCode() + C21445Oooo.OooO00o(this.f90592OooO0O0, this.f90591OooO00o.hashCode() * 31, 31)) * 31, 31, this.f90594OooO0Oo), 31), 31), 31);
        }

        public final String toString() {
            return "PaperThemeRenderContext(page=" + this.f90591OooO00o + ", layersToRender=" + this.f90592OooO0O0 + ", pageRotation=" + this.f90593OooO0OO + ", needsRotation=" + this.f90594OooO0Oo + ", renderWidth=" + this.f90596OooO0o0 + ", renderHeight=" + this.f90595OooO0o + ", unrotNormRenderBounds=" + this.f90597OooO0oO + ", unrotBitmap=" + this.f90598OooO0oo + ")";
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO0Oo, reason: case insensitive filesystem */
    public /* synthetic */ class C26396OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f90599OooO00o;

        static {
            int[] iArr = new int[Page.RotationDirection.values().length];
            try {
                iArr[Page.RotationDirection.CLOCKWISE_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Page.RotationDirection.CLOCKWISE_270.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f90599OooO00o = iArr;
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.adapter.NoteInCore$openPageLocked$1", m80623f = "NoteInCore.kt", m80624l = {404}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f90601OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f90602OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f90603OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Page f90604OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ RectF f90605OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, boolean z, Page page, RectF rectF, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f90603OooOoO0 = i;
            this.f90602OooOoO = z;
            this.f90604OooOoOO = page;
            this.f90605OooOoo0 = rectF;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C26395Oooo0o0.this.new OooO0o(this.f90603OooOoO0, this.f90602OooOoO, this.f90604OooOoOO, this.f90605OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90601OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f90601OooOo0o = 1;
                if (C26395Oooo0o0.OooO0O0(C26395Oooo0o0.this, this.f90603OooOoO0, this.f90602OooOoO, this.f90604OooOoOO, this.f90605OooOoo0, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO0o0, reason: case insensitive filesystem */
    public static final class C26397OooO0o0<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((InterfaceC31284OooO0O0) t).getCreationTime()), Long.valueOf(((InterfaceC31284OooO0O0) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO0oo, reason: case insensitive filesystem */
    public static final class C26399OooO0oo<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((DrawRecord) t).getCreationTime()), Long.valueOf(((DrawRecord) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooOO0 */
    public static final class OooOO0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((ShapeInfo) t).getCreationTime()), Long.valueOf(((ShapeInfo) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooOO0O */
    public static final class OooOO0O<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((QuoteInfo) t).getCreationTime()), Long.valueOf(((QuoteInfo) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooOO0o, reason: case insensitive filesystem */
    public static final class C26400OooOO0o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((ImageInfo) t).getCreationTime()), Long.valueOf(((ImageInfo) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooOOO */
    public static final class OooOOO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((DualLinkSourceInfo) t).getCreationTime()), Long.valueOf(((DualLinkSourceInfo) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooOOO0 */
    public static final class OooOOO0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((TextBoxInfo) t).getCreationTime()), Long.valueOf(((TextBoxInfo) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooOOOO */
    public static final class OooOOOO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((DualLinkRefInfo) t).getCreationTime()), Long.valueOf(((DualLinkRefInfo) t2).getCreationTime()));
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooOOOo, reason: case insensitive filesystem */
    public static final class C26401OooOOOo<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((HyperLinkInfo) t).getCreationTime()), Long.valueOf(((HyperLinkInfo) t2).getCreationTime()));
        }
    }

    public C26395Oooo0o0(C28694OooOO0O note, C27449o00O0OoO noteUseCase, C27881OooOO0O pageLayerUseCase, int i, Integer num, Context context, InterfaceC28962o00oOoOo listener) throws Throwable {
        kotlin.jvm.internal.OooOOO0.OooO0oO(note, "note");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteUseCase, "noteUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayerUseCase, "pageLayerUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.f90552OooO00o = note;
        this.f90553OooO0O0 = noteUseCase;
        this.f90554OooO0OO = pageLayerUseCase;
        this.f90555OooO0Oo = i;
        this.f90557OooO0o0 = num;
        this.f90556OooO0o = context;
        this.f90558OooO0oO = listener;
        this.f90559OooO0oo = new Object();
        this.f90551OooO = new PdfiumCore(context);
        this.f90561OooOO0O = new ConcurrentHashMap<>();
        this.f90562OooOO0o = new ArrayList();
        this.f90564OooOOO0 = new HashMap<>();
        this.f90563OooOOO = new HashMap<>();
        this.f90565OooOOOO = new HashMap<>();
        this.f90566OooOOOo = new HashMap<>();
        this.f90568OooOOo0 = new HashMap<>();
        this.f90567OooOOo = new HashMap<>();
        this.f90569OooOOoo = new HashMap<>();
        this.f90572OooOo00 = new HashMap<>();
        this.f90571OooOo0 = new HashMap<>();
        this.f90573OooOo0O = new ConcurrentHashMap<>();
        this.f90574OooOo0o = new LruCache<>(5);
        new LruCache(20);
        this.f90570OooOo = new Object();
        this.f90576OooOoO0 = new C26398OooO0oO(24, 0.75f, true);
        this.f90575OooOoO = 1.0f;
        this.f90577OooOoOO = new ConcurrentSkipListSet<>();
        this.f90579OooOoo0 = new ConcurrentSkipListSet<>();
        this.f90578OooOoo = new ConcurrentHashMap<>();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        this.f90581OooOooo = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-16776961);
        paint2.setAlpha(128);
        Paint paint3 = new Paint();
        paint3.setColor(C31183OooO00o.f111221OooO00o);
        this.f90583Oooo000 = paint3;
        C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooO00o(null));
        this.f90584Oooo00O = -1;
        this.f90585Oooo00o = -1;
        this.f90582Oooo0 = 30;
    }

    public static void OooO(Bitmap bitmap, Bitmap bitmap2, Page.RotationDirection rotationDirection) {
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint(3);
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        float width2 = bitmap2.getWidth() / 2.0f;
        float height2 = bitmap2.getHeight() / 2.0f;
        Matrix matrix = new Matrix();
        int i = C26396OooO0Oo.f90599OooO00o[rotationDirection.ordinal()];
        if (i == 1) {
            matrix.postRotate(90.0f, width, height);
            matrix.postTranslate(width2 - width, height2 - height);
        } else if (i == 2) {
            matrix.postRotate(270.0f, width, height);
            matrix.postTranslate(width2 - width, height2 - height);
        } else if (i == 3) {
            matrix.postRotate(180.0f, width, height);
            matrix.postTranslate(width2 - width, height2 - height);
        } else if (i != 4) {
            throw new C32442OooOO0o();
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C26395Oooo0o0 c26395Oooo0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26403Oooo0oo c26403Oooo0oo;
        c26395Oooo0o0.getClass();
        if (abstractC32479OooO0OO instanceof C26403Oooo0oo) {
            c26403Oooo0oo = (C26403Oooo0oo) abstractC32479OooO0OO;
            int i = c26403Oooo0oo.f90612OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26403Oooo0oo.f90612OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26403Oooo0oo = new C26403Oooo0oo(c26395Oooo0o0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c26403Oooo0oo.f90610OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26403Oooo0oo.f90612OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            C28694OooOO0O c28694OooOO0O = c26395Oooo0o0.f90552OooO00o;
            String str = c28694OooOO0O.f101667OooO00o;
            c26403Oooo0oo.f90611OooOo0o = c26395Oooo0o0;
            c26403Oooo0oo.f90612OooOoO = 1;
            objOooO0o0 = c26395Oooo0o0.f90554OooO0OO.OooO0o0(str, c28694OooOO0O.f101669OooO0OO, c26403Oooo0oo);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26395Oooo0o0 = c26403Oooo0oo.f90611OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        List<PageLayer> list = (List) objOooO0o0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (PageLayer pageLayer : list) {
            arrayList.add(new LayerInfo(pageLayer.getId(), pageLayer.getNoteId(), pageLayer.getVisible(), kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), c26395Oooo0o0.f90552OooO00o.f101673OooO0oO), pageLayer.getExtras()));
        }
        c26395Oooo0o0.o000oOoO(arrayList);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0222, code lost:
    
        if (r4 == r12) goto L223;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x083a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C26395Oooo0o0 c26395Oooo0o0, int i, boolean z, Page page, RectF rectF, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26387Oooo c26387Oooo;
        RectF rectF2;
        Object obj;
        RectF rectF3;
        List list;
        RectF rectF4;
        C26395Oooo0o0 c26395Oooo0o02;
        boolean z2;
        Page page2;
        RectF rectF5;
        Iterator it;
        List list2;
        List list3;
        C26395Oooo0o0 c26395Oooo0o03;
        Page page3;
        RectF rectF6;
        RectF rectF7;
        List list4;
        Iterator it2;
        List list5;
        List list6;
        Iterator it3;
        Object objOooO0o;
        RectF rectF8;
        C26395Oooo0o0 c26395Oooo0o04;
        List list7;
        List list8;
        Page page4;
        RectF rectF9;
        boolean z3;
        List list9;
        Iterator it4;
        List list10;
        List list11;
        List list12;
        C26395Oooo0o0 c26395Oooo0o05;
        Page page5;
        RectF rectF10;
        List list13;
        List list14;
        List list15;
        List list16;
        Iterator it5;
        Object objOooO0o2;
        List list17;
        int i2;
        boolean z4;
        Iterator it6;
        Object objOooO0o3;
        RectF rectF11;
        Page page6;
        int i3;
        List list18;
        List list19;
        List list20;
        List list21;
        List list22;
        List list23;
        boolean z5;
        Iterator it7;
        ArrayList arrayList;
        Iterator it8;
        Object objOooO0o4;
        List list24;
        C26395Oooo0o0 c26395Oooo0o06;
        RectF rectF12;
        boolean z6;
        int i4;
        List list25;
        List list26;
        List list27;
        List list28;
        Object obj2;
        List list29;
        Iterator it9;
        Iterator it10;
        C26395Oooo0o0 c26395Oooo0o07 = c26395Oooo0o0;
        int i5 = i;
        boolean z7 = z;
        Page page7 = page;
        RectF rectF13 = rectF;
        c26395Oooo0o07.getClass();
        if (abstractC32479OooO0OO instanceof C26387Oooo) {
            c26387Oooo = (C26387Oooo) abstractC32479OooO0OO;
            int i6 = c26387Oooo.f90542Oooo0OO;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c26387Oooo.f90542Oooo0OO = i6 - Integer.MIN_VALUE;
            } else {
                c26387Oooo = new C26387Oooo(c26395Oooo0o07, abstractC32479OooO0OO);
            }
        }
        C26387Oooo c26387Oooo2 = c26387Oooo;
        Object objOooO0o5 = c26387Oooo2.f90537Oooo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c26387Oooo2.f90542Oooo0OO) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0o5);
                if (i5 == 0) {
                    C26110OooO0o0.OooO0O0();
                }
                C26111OooO0oO c26111OooO0oOOooOoO0 = c26395Oooo0o0.OooOoO0(i);
                Rect unrotatedPaperPadding = c26395Oooo0o07.f90560OooOO0.get(i5).getUnrotatedPaperPadding();
                float f = unrotatedPaperPadding.left;
                float f2 = unrotatedPaperPadding.top;
                rectF2 = new RectF(-f, -f2, c26111OooO0oOOooOoO0.f89147OooO00o - f, c26111OooO0oOOooOoO0.f89148OooO0O0 - f2);
                if (rectF13 == null) {
                    C27449o00O0OoO c27449o00O0OoO = c26395Oooo0o07.f90553OooO0O0;
                    String id = page7.getId();
                    String noteId = page7.getNoteId();
                    c26387Oooo2.f90529OooOo0o = c26395Oooo0o07;
                    c26387Oooo2.f90528OooOo = page7;
                    c26387Oooo2.f90531OooOoO0 = rectF13;
                    c26387Oooo2.f90530OooOoO = rectF2;
                    c26387Oooo2.f90539Oooo00O = i5;
                    c26387Oooo2.f90540Oooo00o = z7;
                    c26387Oooo2.f90542Oooo0OO = 1;
                    c27449o00O0OoO.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o5 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0(id, noteId, null, c27449o00O0OoO), c26387Oooo2);
                    break;
                } else {
                    C27449o00O0OoO c27449o00O0OoO2 = c26395Oooo0o07.f90553OooO0O0;
                    String id2 = page7.getId();
                    String noteId2 = page7.getNoteId();
                    c26387Oooo2.f90529OooOo0o = c26395Oooo0o07;
                    c26387Oooo2.f90528OooOo = page7;
                    c26387Oooo2.f90531OooOoO0 = rectF13;
                    c26387Oooo2.f90530OooOoO = rectF2;
                    c26387Oooo2.f90539Oooo00O = i5;
                    c26387Oooo2.f90540Oooo00o = z7;
                    c26387Oooo2.f90542Oooo0OO = 2;
                    c27449o00O0OoO2.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o6 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0O0(c27449o00O0OoO2, id2, noteId2, rectF13, null), c26387Oooo2);
                    if (objOooO0o6 != enumC32485OooO00o) {
                        obj = objOooO0o6;
                        rectF3 = rectF;
                        List list30 = (List) obj;
                        rectF4 = rectF3;
                        list = list30;
                        c26395Oooo0o02 = c26395Oooo0o07;
                        z2 = z7;
                        page2 = page7;
                        rectF5 = rectF2;
                        ArrayList arrayList2 = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                            InterfaceC31284OooO0O0 displayItem = ((Stroke) it.next()).toDisplayItem(c26395Oooo0o02.f90556OooO0o);
                            if (!(displayItem instanceof InkStrokeInfo) && !(displayItem instanceof DrawRecord)) {
                                displayItem = null;
                            }
                            if (displayItem != null) {
                                arrayList2.add(displayItem);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj3;
                            if (page2.getUnbounded() || RectF.intersects(interfaceC31284OooO0O0.getBoundingBox(1.0f), rectF5)) {
                                arrayList3.add(obj3);
                            }
                        }
                        if (rectF4 == null) {
                            C27449o00O0OoO c27449o00O0OoO3 = c26395Oooo0o02.f90553OooO0O0;
                            String id3 = page2.getId();
                            String noteId3 = page2.getNoteId();
                            c26387Oooo2.f90529OooOo0o = c26395Oooo0o02;
                            c26387Oooo2.f90528OooOo = page2;
                            c26387Oooo2.f90531OooOoO0 = rectF4;
                            c26387Oooo2.f90530OooOoO = rectF5;
                            c26387Oooo2.f90532OooOoOO = arrayList3;
                            c26387Oooo2.f90539Oooo00O = i5;
                            c26387Oooo2.f90540Oooo00o = z2;
                            c26387Oooo2.f90542Oooo0OO = 3;
                            c27449o00O0OoO3.getClass();
                            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                            Object objOooO0o7 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OO(id3, noteId3, null, c27449o00O0OoO3), c26387Oooo2);
                            if (objOooO0o7 != enumC32485OooO00o) {
                                objOooO0o5 = objOooO0o7;
                                list2 = arrayList3;
                                list3 = (List) objOooO0o5;
                                c26395Oooo0o03 = c26395Oooo0o02;
                                page3 = page2;
                                rectF6 = rectF4;
                                rectF7 = rectF5;
                                list4 = list2;
                                ArrayList arrayList4 = new ArrayList();
                                it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC31284OooO0O0 displayItem2 = ((Image) it2.next()).toDisplayItem(c26395Oooo0o03.f90556OooO0o);
                                    ImageInfo imageInfo = displayItem2 instanceof ImageInfo ? (ImageInfo) displayItem2 : null;
                                    if (imageInfo != null) {
                                        arrayList4.add(imageInfo);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj4 : arrayList4) {
                                    ImageInfo imageInfo2 = (ImageInfo) obj4;
                                    if (page3.getUnbounded() || RectF.intersects(imageInfo2.getBoundingBox(1.0f), rectF7)) {
                                        arrayList5.add(obj4);
                                    }
                                }
                                if (rectF6 != null) {
                                    C27449o00O0OoO c27449o00O0OoO4 = c26395Oooo0o03.f90553OooO0O0;
                                    String id4 = page3.getId();
                                    String noteId4 = page3.getNoteId();
                                    c26387Oooo2.f90529OooOo0o = c26395Oooo0o03;
                                    c26387Oooo2.f90528OooOo = page3;
                                    c26387Oooo2.f90531OooOoO0 = rectF6;
                                    c26387Oooo2.f90530OooOoO = rectF7;
                                    c26387Oooo2.f90532OooOoOO = list4;
                                    c26387Oooo2.f90534OooOoo0 = arrayList5;
                                    c26387Oooo2.f90539Oooo00O = i5;
                                    c26387Oooo2.f90540Oooo00o = z2;
                                    c26387Oooo2.f90542Oooo0OO = 5;
                                    c27449o00O0OoO4.getClass();
                                    C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                                    Object objOooO0o8 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27460o00O0oOo(id4, noteId4, null, c27449o00O0OoO4), c26387Oooo2);
                                    if (objOooO0o8 != enumC32485OooO00o) {
                                        objOooO0o5 = objOooO0o8;
                                        list5 = arrayList5;
                                        list6 = (List) objOooO0o5;
                                        ArrayList arrayList6 = new ArrayList();
                                        it3 = list6.iterator();
                                        while (it3.hasNext()) {
                                            InterfaceC31284OooO0O0 displayItem3 = ((Shape) it3.next()).toDisplayItem(c26395Oooo0o03.f90556OooO0o);
                                            ShapeInfo shapeInfo = displayItem3 instanceof ShapeInfo ? (ShapeInfo) displayItem3 : null;
                                            if (shapeInfo != null) {
                                                arrayList6.add(shapeInfo);
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj5 : arrayList6) {
                                            ShapeInfo shapeInfo2 = (ShapeInfo) obj5;
                                            if (page3.getUnbounded() || RectF.intersects(shapeInfo2.getBoundingBox(1.0f), rectF7)) {
                                                arrayList7.add(obj5);
                                            }
                                        }
                                        C27449o00O0OoO c27449o00O0OoO5 = c26395Oooo0o03.f90553OooO0O0;
                                        String id5 = page3.getId();
                                        String noteId5 = page3.getNoteId();
                                        c26387Oooo2.f90529OooOo0o = c26395Oooo0o03;
                                        c26387Oooo2.f90528OooOo = page3;
                                        c26387Oooo2.f90531OooOoO0 = rectF6;
                                        c26387Oooo2.f90530OooOoO = rectF7;
                                        c26387Oooo2.f90532OooOoOO = list4;
                                        c26387Oooo2.f90534OooOoo0 = list5;
                                        c26387Oooo2.f90533OooOoo = arrayList7;
                                        c26387Oooo2.f90539Oooo00O = i5;
                                        c26387Oooo2.f90540Oooo00o = z2;
                                        c26387Oooo2.f90542Oooo0OO = 7;
                                        C27994OooOOOO c27994OooOOOO = c27449o00O0OoO5.f96058OooOoO;
                                        C33874OooO0OO c33874OooO0OO5 = C33649OoooOOo.f121328OooO00o;
                                        boolean z8 = z2;
                                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27988OooO0oo(c27994OooOOOO, id5, noteId5, null), c26387Oooo2);
                                        if (objOooO0o != enumC32485OooO00o) {
                                            rectF8 = rectF6;
                                            c26395Oooo0o04 = c26395Oooo0o03;
                                            list7 = list4;
                                            list8 = arrayList7;
                                            page4 = page3;
                                            objOooO0o5 = objOooO0o;
                                            rectF9 = rectF7;
                                            z3 = z8;
                                            list9 = list5;
                                            ArrayList arrayList8 = new ArrayList();
                                            it4 = ((Iterable) objOooO0o5).iterator();
                                            while (it4.hasNext()) {
                                                InterfaceC31284OooO0O0 displayItem4 = ((Quote) it4.next()).toDisplayItem(c26395Oooo0o04.f90556OooO0o);
                                                QuoteInfo quoteInfo = displayItem4 instanceof QuoteInfo ? (QuoteInfo) displayItem4 : null;
                                                if (quoteInfo != null) {
                                                    arrayList8.add(quoteInfo);
                                                }
                                            }
                                            ArrayList arrayList9 = new ArrayList();
                                            for (Object obj6 : arrayList8) {
                                                QuoteInfo quoteInfo2 = (QuoteInfo) obj6;
                                                if (page4.getUnbounded() || RectF.intersects(quoteInfo2.getBoundingBox(1.0f), rectF9)) {
                                                    arrayList9.add(obj6);
                                                }
                                            }
                                            if (rectF8 != null) {
                                                C27449o00O0OoO c27449o00O0OoO6 = c26395Oooo0o04.f90553OooO0O0;
                                                String id6 = page4.getId();
                                                String noteId6 = page4.getNoteId();
                                                c26387Oooo2.f90529OooOo0o = c26395Oooo0o04;
                                                c26387Oooo2.f90528OooOo = page4;
                                                c26387Oooo2.f90531OooOoO0 = rectF9;
                                                c26387Oooo2.f90530OooOoO = list7;
                                                c26387Oooo2.f90532OooOoOO = list9;
                                                c26387Oooo2.f90534OooOoo0 = list8;
                                                c26387Oooo2.f90533OooOoo = arrayList9;
                                                c26387Oooo2.f90539Oooo00O = i5;
                                                c26387Oooo2.f90540Oooo00o = z3;
                                                c26387Oooo2.f90542Oooo0OO = 8;
                                                c27449o00O0OoO6.getClass();
                                                C33874OooO0OO c33874OooO0OO6 = C33649OoooOOo.f121328OooO00o;
                                                List list31 = list8;
                                                Object objOooO0o9 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0O(id6, noteId6, null, c27449o00O0OoO6), c26387Oooo2);
                                                if (objOooO0o9 != enumC32485OooO00o) {
                                                    objOooO0o5 = objOooO0o9;
                                                    list10 = arrayList9;
                                                    list11 = list31;
                                                    list12 = (List) objOooO0o5;
                                                    c26395Oooo0o05 = c26395Oooo0o04;
                                                    page5 = page4;
                                                    rectF10 = rectF9;
                                                    list13 = list7;
                                                    list14 = list9;
                                                    list15 = list11;
                                                    list16 = list10;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    it5 = list12.iterator();
                                                    while (it5.hasNext()) {
                                                        InterfaceC31284OooO0O0 displayItem5 = ((TextBox) it5.next()).toDisplayItem(c26395Oooo0o05.f90556OooO0o);
                                                        TextBoxInfo textBoxInfo = displayItem5 instanceof TextBoxInfo ? (TextBoxInfo) displayItem5 : null;
                                                        if (textBoxInfo != null) {
                                                            arrayList10.add(textBoxInfo);
                                                        }
                                                    }
                                                    ArrayList arrayList11 = new ArrayList();
                                                    for (Object obj7 : arrayList10) {
                                                        TextBoxInfo textBoxInfo2 = (TextBoxInfo) obj7;
                                                        if (page5.getUnbounded() || RectF.intersects(textBoxInfo2.getBoundingBox(1.0f), rectF10)) {
                                                            arrayList11.add(obj7);
                                                        }
                                                    }
                                                    C27449o00O0OoO c27449o00O0OoO7 = c26395Oooo0o05.f90553OooO0O0;
                                                    String id7 = page5.getId();
                                                    String noteId7 = page5.getNoteId();
                                                    c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                                                    c26387Oooo2.f90528OooOo = page5;
                                                    c26387Oooo2.f90531OooOoO0 = rectF10;
                                                    c26387Oooo2.f90530OooOoO = list13;
                                                    c26387Oooo2.f90532OooOoOO = list14;
                                                    c26387Oooo2.f90534OooOoo0 = list15;
                                                    c26387Oooo2.f90533OooOoo = list16;
                                                    c26387Oooo2.f90535OooOooO = arrayList11;
                                                    c26387Oooo2.f90539Oooo00O = i5;
                                                    c26387Oooo2.f90540Oooo00o = z3;
                                                    c26387Oooo2.f90542Oooo0OO = 10;
                                                    c27449o00O0OoO7.getClass();
                                                    C33874OooO0OO c33874OooO0OO7 = C33649OoooOOo.f121328OooO00o;
                                                    boolean z9 = z3;
                                                    int i7 = i5;
                                                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27445o00O0O0o(id7, noteId7, null, c27449o00O0OoO7), c26387Oooo2);
                                                    if (objOooO0o2 != enumC32485OooO00o) {
                                                        list17 = arrayList11;
                                                        i2 = i7;
                                                        objOooO0o5 = objOooO0o2;
                                                        z4 = z9;
                                                        ArrayList arrayList12 = new ArrayList();
                                                        it6 = ((Iterable) objOooO0o5).iterator();
                                                        while (it6.hasNext()) {
                                                            InterfaceC31284OooO0O0 displayItem6 = ((DualLinkSource) it6.next()).toDisplayItem(c26395Oooo0o05.f90556OooO0o);
                                                            DualLinkSourceInfo dualLinkSourceInfo = displayItem6 instanceof DualLinkSourceInfo ? (DualLinkSourceInfo) displayItem6 : null;
                                                            if (dualLinkSourceInfo != null) {
                                                                arrayList12.add(dualLinkSourceInfo);
                                                            }
                                                        }
                                                        ArrayList arrayList13 = new ArrayList();
                                                        for (Object obj8 : arrayList12) {
                                                            DualLinkSourceInfo dualLinkSourceInfo2 = (DualLinkSourceInfo) obj8;
                                                            List list32 = list17;
                                                            if (page5.getUnbounded() || RectF.intersects(dualLinkSourceInfo2.getBoundingBox(1.0f), rectF10)) {
                                                                arrayList13.add(obj8);
                                                            }
                                                            list17 = list32;
                                                        }
                                                        List list33 = list17;
                                                        C27449o00O0OoO c27449o00O0OoO8 = c26395Oooo0o05.f90553OooO0O0;
                                                        String id8 = page5.getId();
                                                        String noteId8 = page5.getNoteId();
                                                        c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                                                        c26387Oooo2.f90528OooOo = page5;
                                                        c26387Oooo2.f90531OooOoO0 = rectF10;
                                                        c26387Oooo2.f90530OooOoO = list13;
                                                        c26387Oooo2.f90532OooOoOO = list14;
                                                        c26387Oooo2.f90534OooOoo0 = list15;
                                                        c26387Oooo2.f90533OooOoo = list16;
                                                        c26387Oooo2.f90535OooOooO = list33;
                                                        c26387Oooo2.f90536OooOooo = arrayList13;
                                                        c26387Oooo2.f90539Oooo00O = i2;
                                                        c26387Oooo2.f90540Oooo00o = z4;
                                                        c26387Oooo2.f90542Oooo0OO = 11;
                                                        c27449o00O0OoO8.getClass();
                                                        C33874OooO0OO c33874OooO0OO8 = C33649OoooOOo.f121328OooO00o;
                                                        boolean z10 = z4;
                                                        int i8 = i2;
                                                        objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O0(id8, noteId8, null, c27449o00O0OoO8), c26387Oooo2);
                                                        if (objOooO0o3 != enumC32485OooO00o) {
                                                            rectF11 = rectF10;
                                                            page6 = page5;
                                                            i3 = i8;
                                                            list18 = list14;
                                                            list19 = list13;
                                                            list20 = list16;
                                                            list21 = arrayList13;
                                                            list22 = list15;
                                                            list23 = list33;
                                                            objOooO0o5 = objOooO0o3;
                                                            z5 = z10;
                                                            ArrayList arrayList14 = new ArrayList();
                                                            for (Object obj9 : (Iterable) objOooO0o5) {
                                                                if (((DualLinkRef) obj9).getItem() != null) {
                                                                    arrayList14.add(obj9);
                                                                }
                                                            }
                                                            ArrayList arrayList15 = new ArrayList();
                                                            it7 = arrayList14.iterator();
                                                            while (it7.hasNext()) {
                                                                List list34 = list21;
                                                                InterfaceC31284OooO0O0 displayItem7 = ((DualLinkRef) it7.next()).toDisplayItem(c26395Oooo0o05.f90556OooO0o);
                                                                DualLinkRefInfo dualLinkRefInfo = displayItem7 instanceof DualLinkRefInfo ? (DualLinkRefInfo) displayItem7 : null;
                                                                if (dualLinkRefInfo != null) {
                                                                    arrayList15.add(dualLinkRefInfo);
                                                                }
                                                                list21 = list34;
                                                            }
                                                            List list35 = list21;
                                                            arrayList = new ArrayList();
                                                            it8 = arrayList15.iterator();
                                                            while (it8.hasNext()) {
                                                                Object next = it8.next();
                                                                DualLinkRefInfo dualLinkRefInfo2 = (DualLinkRefInfo) next;
                                                                Iterator it11 = it8;
                                                                if (page6.getUnbounded() || RectF.intersects(dualLinkRefInfo2.getBoundingBox(1.0f), rectF11)) {
                                                                    arrayList.add(next);
                                                                }
                                                                it8 = it11;
                                                            }
                                                            C27449o00O0OoO c27449o00O0OoO9 = c26395Oooo0o05.f90553OooO0O0;
                                                            String id9 = page6.getId();
                                                            String noteId9 = page6.getNoteId();
                                                            c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                                                            c26387Oooo2.f90528OooOo = page6;
                                                            c26387Oooo2.f90531OooOoO0 = rectF11;
                                                            c26387Oooo2.f90530OooOoO = list19;
                                                            RectF rectF14 = rectF11;
                                                            c26387Oooo2.f90532OooOoOO = list18;
                                                            c26387Oooo2.f90534OooOoo0 = list22;
                                                            c26387Oooo2.f90533OooOoo = list20;
                                                            c26387Oooo2.f90535OooOooO = list23;
                                                            c26387Oooo2.f90536OooOooo = list35;
                                                            c26387Oooo2.f90538Oooo000 = arrayList;
                                                            c26387Oooo2.f90539Oooo00O = i3;
                                                            c26387Oooo2.f90540Oooo00o = z5;
                                                            c26387Oooo2.f90542Oooo0OO = 12;
                                                            c27449o00O0OoO9.getClass();
                                                            C33874OooO0OO c33874OooO0OO9 = C33649OoooOOo.f121328OooO00o;
                                                            boolean z11 = z5;
                                                            int i9 = i3;
                                                            objOooO0o4 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OO0(id9, noteId9, null, c27449o00O0OoO9), c26387Oooo2);
                                                            if (objOooO0o4 != enumC32485OooO00o) {
                                                                list24 = list19;
                                                                c26395Oooo0o06 = c26395Oooo0o05;
                                                                rectF12 = rectF14;
                                                                z6 = z11;
                                                                i4 = i9;
                                                                list25 = list18;
                                                                list26 = list22;
                                                                list27 = list20;
                                                                list28 = list23;
                                                                obj2 = objOooO0o4;
                                                                list29 = list35;
                                                                ArrayList arrayList16 = new ArrayList();
                                                                it9 = ((Iterable) obj2).iterator();
                                                                while (it9.hasNext()) {
                                                                    InterfaceC31284OooO0O0 displayItem8 = ((HyperLink) it9.next()).toDisplayItem(c26395Oooo0o06.f90556OooO0o);
                                                                    HyperLinkInfo hyperLinkInfo = displayItem8 instanceof HyperLinkInfo ? (HyperLinkInfo) displayItem8 : null;
                                                                    if (hyperLinkInfo != null) {
                                                                        arrayList16.add(hyperLinkInfo);
                                                                    }
                                                                }
                                                                ArrayList arrayList17 = new ArrayList();
                                                                it10 = arrayList16.iterator();
                                                                while (it10.hasNext()) {
                                                                    Object next2 = it10.next();
                                                                    HyperLinkInfo hyperLinkInfo2 = (HyperLinkInfo) next2;
                                                                    Iterator it12 = it10;
                                                                    if (page6.getUnbounded() || RectF.intersects(hyperLinkInfo2.getBoundingBox(1.0f), rectF12)) {
                                                                        arrayList17.add(next2);
                                                                    }
                                                                    it10 = it12;
                                                                }
                                                                if (i4 == 0) {
                                                                    C26110OooO0o0.OooO0O0();
                                                                }
                                                                synchronized (c26395Oooo0o06.f90559OooO0oo) {
                                                                    C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                                                                    c32465OooO0O0OooO0Oo.addAll(list24);
                                                                    c32465OooO0O0OooO0Oo.addAll(list25);
                                                                    c32465OooO0O0OooO0Oo.addAll(list26);
                                                                    c32465OooO0O0OooO0Oo.addAll(list27);
                                                                    c32465OooO0O0OooO0Oo.addAll(list28);
                                                                    c32465OooO0O0OooO0Oo.addAll(list29);
                                                                    c32465OooO0O0OooO0Oo.addAll(arrayList);
                                                                    c32465OooO0O0OooO0Oo.addAll(arrayList17);
                                                                    C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                                                                    C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                                                                    c26395Oooo0o06.OoooOOO(i4, c32465OooO0O0OooO0O0, c34434OooOoO);
                                                                    if (i4 > 0) {
                                                                        C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, list24, z6));
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, list25, z6));
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, list26, z6));
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, list27, z6));
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, list28, z6));
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, list29, z6));
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, arrayList, z6));
                                                                        c32465OooO0O0OooO0Oo2.addAll(c26395Oooo0o06.OooOoo0(i4, arrayList17, z6));
                                                                        c26395Oooo0o06.OoooOOO(i4 - 1, com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2), c34434OooOoO);
                                                                        c26395Oooo0o06.f90579OooOoo0.add(new Integer(i4));
                                                                    }
                                                                    break;
                                                                }
                                                                return C32460OooOooO.f116667OooO00o;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                List list36 = list8;
                                                C27449o00O0OoO c27449o00O0OoO10 = c26395Oooo0o04.f90553OooO0O0;
                                                String id10 = page4.getId();
                                                String noteId10 = page4.getNoteId();
                                                c26387Oooo2.f90529OooOo0o = c26395Oooo0o04;
                                                c26387Oooo2.f90528OooOo = page4;
                                                c26387Oooo2.f90531OooOoO0 = rectF9;
                                                c26387Oooo2.f90530OooOoO = list7;
                                                c26387Oooo2.f90532OooOoOO = list9;
                                                c26387Oooo2.f90534OooOoo0 = list36;
                                                c26387Oooo2.f90533OooOoo = arrayList9;
                                                c26387Oooo2.f90539Oooo00O = i5;
                                                c26387Oooo2.f90540Oooo00o = z3;
                                                c26387Oooo2.f90542Oooo0OO = 9;
                                                c27449o00O0OoO10.getClass();
                                                C33874OooO0OO c33874OooO0OO10 = C33649OoooOOo.f121328OooO00o;
                                                Object objOooO0o10 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0OO(c27449o00O0OoO10, id10, noteId10, rectF8, null), c26387Oooo2);
                                                if (objOooO0o10 != enumC32485OooO00o) {
                                                    objOooO0o5 = objOooO0o10;
                                                    list10 = arrayList9;
                                                    list11 = list36;
                                                    list12 = (List) objOooO0o5;
                                                    c26395Oooo0o05 = c26395Oooo0o04;
                                                    page5 = page4;
                                                    rectF10 = rectF9;
                                                    list13 = list7;
                                                    list14 = list9;
                                                    list15 = list11;
                                                    list16 = list10;
                                                    ArrayList arrayList102 = new ArrayList();
                                                    it5 = list12.iterator();
                                                    while (it5.hasNext()) {
                                                    }
                                                    ArrayList arrayList112 = new ArrayList();
                                                    while (r2.hasNext()) {
                                                    }
                                                    C27449o00O0OoO c27449o00O0OoO72 = c26395Oooo0o05.f90553OooO0O0;
                                                    String id72 = page5.getId();
                                                    String noteId72 = page5.getNoteId();
                                                    c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                                                    c26387Oooo2.f90528OooOo = page5;
                                                    c26387Oooo2.f90531OooOoO0 = rectF10;
                                                    c26387Oooo2.f90530OooOoO = list13;
                                                    c26387Oooo2.f90532OooOoOO = list14;
                                                    c26387Oooo2.f90534OooOoo0 = list15;
                                                    c26387Oooo2.f90533OooOoo = list16;
                                                    c26387Oooo2.f90535OooOooO = arrayList112;
                                                    c26387Oooo2.f90539Oooo00O = i5;
                                                    c26387Oooo2.f90540Oooo00o = z3;
                                                    c26387Oooo2.f90542Oooo0OO = 10;
                                                    c27449o00O0OoO72.getClass();
                                                    C33874OooO0OO c33874OooO0OO72 = C33649OoooOOo.f121328OooO00o;
                                                    boolean z92 = z3;
                                                    int i72 = i5;
                                                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27445o00O0O0o(id72, noteId72, null, c27449o00O0OoO72), c26387Oooo2);
                                                    if (objOooO0o2 != enumC32485OooO00o) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C27449o00O0OoO c27449o00O0OoO11 = c26395Oooo0o03.f90553OooO0O0;
                                    String id11 = page3.getId();
                                    String noteId11 = page3.getNoteId();
                                    c26387Oooo2.f90529OooOo0o = c26395Oooo0o03;
                                    c26387Oooo2.f90528OooOo = page3;
                                    c26387Oooo2.f90531OooOoO0 = rectF6;
                                    c26387Oooo2.f90530OooOoO = rectF7;
                                    c26387Oooo2.f90532OooOoOO = list4;
                                    c26387Oooo2.f90534OooOoo0 = arrayList5;
                                    c26387Oooo2.f90539Oooo00O = i5;
                                    c26387Oooo2.f90540Oooo00o = z2;
                                    c26387Oooo2.f90542Oooo0OO = 6;
                                    c27449o00O0OoO11.getClass();
                                    C33874OooO0OO c33874OooO0OO11 = C33649OoooOOo.f121328OooO00o;
                                    Object objOooO0o11 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27462o00O0oo0(c27449o00O0OoO11, id11, noteId11, rectF6, null), c26387Oooo2);
                                    if (objOooO0o11 != enumC32485OooO00o) {
                                        objOooO0o5 = objOooO0o11;
                                        list5 = arrayList5;
                                        rectF6 = rectF6;
                                        list6 = (List) objOooO0o5;
                                        ArrayList arrayList62 = new ArrayList();
                                        it3 = list6.iterator();
                                        while (it3.hasNext()) {
                                        }
                                        ArrayList arrayList72 = new ArrayList();
                                        while (r9.hasNext()) {
                                        }
                                        C27449o00O0OoO c27449o00O0OoO52 = c26395Oooo0o03.f90553OooO0O0;
                                        String id52 = page3.getId();
                                        String noteId52 = page3.getNoteId();
                                        c26387Oooo2.f90529OooOo0o = c26395Oooo0o03;
                                        c26387Oooo2.f90528OooOo = page3;
                                        c26387Oooo2.f90531OooOoO0 = rectF6;
                                        c26387Oooo2.f90530OooOoO = rectF7;
                                        c26387Oooo2.f90532OooOoOO = list4;
                                        c26387Oooo2.f90534OooOoo0 = list5;
                                        c26387Oooo2.f90533OooOoo = arrayList72;
                                        c26387Oooo2.f90539Oooo00O = i5;
                                        c26387Oooo2.f90540Oooo00o = z2;
                                        c26387Oooo2.f90542Oooo0OO = 7;
                                        C27994OooOOOO c27994OooOOOO2 = c27449o00O0OoO52.f96058OooOoO;
                                        C33874OooO0OO c33874OooO0OO52 = C33649OoooOOo.f121328OooO00o;
                                        boolean z82 = z2;
                                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27988OooO0oo(c27994OooOOOO2, id52, noteId52, null), c26387Oooo2);
                                        if (objOooO0o != enumC32485OooO00o) {
                                        }
                                    }
                                }
                            }
                        } else {
                            C27449o00O0OoO c27449o00O0OoO12 = c26395Oooo0o02.f90553OooO0O0;
                            String id12 = page2.getId();
                            String noteId12 = page2.getNoteId();
                            c26387Oooo2.f90529OooOo0o = c26395Oooo0o02;
                            c26387Oooo2.f90528OooOo = page2;
                            c26387Oooo2.f90531OooOoO0 = rectF4;
                            c26387Oooo2.f90530OooOoO = rectF5;
                            c26387Oooo2.f90532OooOoOO = arrayList3;
                            c26387Oooo2.f90539Oooo00O = i5;
                            c26387Oooo2.f90540Oooo00o = z2;
                            c26387Oooo2.f90542Oooo0OO = 4;
                            c27449o00O0OoO12.getClass();
                            C33874OooO0OO c33874OooO0OO12 = C33649OoooOOo.f121328OooO00o;
                            RectF rectF15 = rectF4;
                            Object objOooO0o12 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OOO(c27449o00O0OoO12, id12, noteId12, rectF15, null), c26387Oooo2);
                            if (objOooO0o12 != enumC32485OooO00o) {
                                objOooO0o5 = objOooO0o12;
                                list2 = arrayList3;
                                rectF4 = rectF15;
                                list3 = (List) objOooO0o5;
                                c26395Oooo0o03 = c26395Oooo0o02;
                                page3 = page2;
                                rectF6 = rectF4;
                                rectF7 = rectF5;
                                list4 = list2;
                                ArrayList arrayList42 = new ArrayList();
                                it2 = list3.iterator();
                                while (it2.hasNext()) {
                                }
                                ArrayList arrayList52 = new ArrayList();
                                while (r2.hasNext()) {
                                }
                                if (rectF6 != null) {
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                boolean z12 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                RectF rectF16 = (RectF) c26387Oooo2.f90530OooOoO;
                RectF rectF17 = c26387Oooo2.f90531OooOoO0;
                Page page8 = c26387Oooo2.f90528OooOo;
                C26395Oooo0o0 c26395Oooo0o08 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                rectF2 = rectF16;
                rectF13 = rectF17;
                page7 = page8;
                z7 = z12;
                c26395Oooo0o07 = c26395Oooo0o08;
                list = (List) objOooO0o5;
                rectF4 = rectF13;
                c26395Oooo0o02 = c26395Oooo0o07;
                z2 = z7;
                page2 = page7;
                rectF5 = rectF2;
                ArrayList arrayList22 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList32 = new ArrayList();
                while (r2.hasNext()) {
                }
                if (rectF4 == null) {
                }
                return enumC32485OooO00o;
            case 2:
                boolean z13 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                RectF rectF18 = (RectF) c26387Oooo2.f90530OooOoO;
                RectF rectF19 = c26387Oooo2.f90531OooOoO0;
                Page page9 = c26387Oooo2.f90528OooOo;
                C26395Oooo0o0 c26395Oooo0o09 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                rectF3 = rectF19;
                page7 = page9;
                obj = objOooO0o5;
                rectF2 = rectF18;
                z7 = z13;
                c26395Oooo0o07 = c26395Oooo0o09;
                List list302 = (List) obj;
                rectF4 = rectF3;
                list = list302;
                c26395Oooo0o02 = c26395Oooo0o07;
                z2 = z7;
                page2 = page7;
                rectF5 = rectF2;
                ArrayList arrayList222 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList322 = new ArrayList();
                while (r2.hasNext()) {
                }
                if (rectF4 == null) {
                }
                return enumC32485OooO00o;
            case 3:
                z2 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                list2 = c26387Oooo2.f90532OooOoOO;
                rectF5 = (RectF) c26387Oooo2.f90530OooOoO;
                rectF4 = c26387Oooo2.f90531OooOoO0;
                page2 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o02 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list3 = (List) objOooO0o5;
                c26395Oooo0o03 = c26395Oooo0o02;
                page3 = page2;
                rectF6 = rectF4;
                rectF7 = rectF5;
                list4 = list2;
                ArrayList arrayList422 = new ArrayList();
                it2 = list3.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList522 = new ArrayList();
                while (r2.hasNext()) {
                }
                if (rectF6 != null) {
                }
                return enumC32485OooO00o;
            case 4:
                z2 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                list2 = c26387Oooo2.f90532OooOoOO;
                rectF5 = (RectF) c26387Oooo2.f90530OooOoO;
                rectF4 = c26387Oooo2.f90531OooOoO0;
                page2 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o02 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list3 = (List) objOooO0o5;
                c26395Oooo0o03 = c26395Oooo0o02;
                page3 = page2;
                rectF6 = rectF4;
                rectF7 = rectF5;
                list4 = list2;
                ArrayList arrayList4222 = new ArrayList();
                it2 = list3.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList5222 = new ArrayList();
                while (r2.hasNext()) {
                }
                if (rectF6 != null) {
                }
                return enumC32485OooO00o;
            case 5:
                z2 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                list5 = c26387Oooo2.f90534OooOoo0;
                list4 = c26387Oooo2.f90532OooOoOO;
                rectF7 = (RectF) c26387Oooo2.f90530OooOoO;
                rectF6 = c26387Oooo2.f90531OooOoO0;
                page3 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o03 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list6 = (List) objOooO0o5;
                ArrayList arrayList622 = new ArrayList();
                it3 = list6.iterator();
                while (it3.hasNext()) {
                }
                ArrayList arrayList722 = new ArrayList();
                while (r9.hasNext()) {
                }
                C27449o00O0OoO c27449o00O0OoO522 = c26395Oooo0o03.f90553OooO0O0;
                String id522 = page3.getId();
                String noteId522 = page3.getNoteId();
                c26387Oooo2.f90529OooOo0o = c26395Oooo0o03;
                c26387Oooo2.f90528OooOo = page3;
                c26387Oooo2.f90531OooOoO0 = rectF6;
                c26387Oooo2.f90530OooOoO = rectF7;
                c26387Oooo2.f90532OooOoOO = list4;
                c26387Oooo2.f90534OooOoo0 = list5;
                c26387Oooo2.f90533OooOoo = arrayList722;
                c26387Oooo2.f90539Oooo00O = i5;
                c26387Oooo2.f90540Oooo00o = z2;
                c26387Oooo2.f90542Oooo0OO = 7;
                C27994OooOOOO c27994OooOOOO22 = c27449o00O0OoO522.f96058OooOoO;
                C33874OooO0OO c33874OooO0OO522 = C33649OoooOOo.f121328OooO00o;
                boolean z822 = z2;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27988OooO0oo(c27994OooOOOO22, id522, noteId522, null), c26387Oooo2);
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                z2 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                list5 = c26387Oooo2.f90534OooOoo0;
                list4 = c26387Oooo2.f90532OooOoOO;
                rectF7 = (RectF) c26387Oooo2.f90530OooOoO;
                rectF6 = c26387Oooo2.f90531OooOoO0;
                page3 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o03 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list6 = (List) objOooO0o5;
                ArrayList arrayList6222 = new ArrayList();
                it3 = list6.iterator();
                while (it3.hasNext()) {
                }
                ArrayList arrayList7222 = new ArrayList();
                while (r9.hasNext()) {
                }
                C27449o00O0OoO c27449o00O0OoO5222 = c26395Oooo0o03.f90553OooO0O0;
                String id5222 = page3.getId();
                String noteId5222 = page3.getNoteId();
                c26387Oooo2.f90529OooOo0o = c26395Oooo0o03;
                c26387Oooo2.f90528OooOo = page3;
                c26387Oooo2.f90531OooOoO0 = rectF6;
                c26387Oooo2.f90530OooOoO = rectF7;
                c26387Oooo2.f90532OooOoOO = list4;
                c26387Oooo2.f90534OooOoo0 = list5;
                c26387Oooo2.f90533OooOoo = arrayList7222;
                c26387Oooo2.f90539Oooo00O = i5;
                c26387Oooo2.f90540Oooo00o = z2;
                c26387Oooo2.f90542Oooo0OO = 7;
                C27994OooOOOO c27994OooOOOO222 = c27449o00O0OoO5222.f96058OooOoO;
                C33874OooO0OO c33874OooO0OO5222 = C33649OoooOOo.f121328OooO00o;
                boolean z8222 = z2;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27988OooO0oo(c27994OooOOOO222, id5222, noteId5222, null), c26387Oooo2);
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                z3 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                List list37 = c26387Oooo2.f90533OooOoo;
                List list38 = c26387Oooo2.f90534OooOoo0;
                List list39 = c26387Oooo2.f90532OooOoOO;
                RectF rectF20 = (RectF) c26387Oooo2.f90530OooOoO;
                RectF rectF21 = c26387Oooo2.f90531OooOoO0;
                page4 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o04 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                rectF8 = rectF21;
                rectF9 = rectF20;
                list7 = list39;
                list9 = list38;
                list8 = list37;
                ArrayList arrayList82 = new ArrayList();
                it4 = ((Iterable) objOooO0o5).iterator();
                while (it4.hasNext()) {
                }
                ArrayList arrayList92 = new ArrayList();
                while (r2.hasNext()) {
                }
                if (rectF8 != null) {
                }
                return enumC32485OooO00o;
            case 8:
                z3 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                list10 = c26387Oooo2.f90533OooOoo;
                list11 = c26387Oooo2.f90534OooOoo0;
                list9 = c26387Oooo2.f90532OooOoOO;
                list7 = (List) c26387Oooo2.f90530OooOoO;
                rectF9 = c26387Oooo2.f90531OooOoO0;
                page4 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o04 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list12 = (List) objOooO0o5;
                c26395Oooo0o05 = c26395Oooo0o04;
                page5 = page4;
                rectF10 = rectF9;
                list13 = list7;
                list14 = list9;
                list15 = list11;
                list16 = list10;
                ArrayList arrayList1022 = new ArrayList();
                it5 = list12.iterator();
                while (it5.hasNext()) {
                }
                ArrayList arrayList1122 = new ArrayList();
                while (r2.hasNext()) {
                }
                C27449o00O0OoO c27449o00O0OoO722 = c26395Oooo0o05.f90553OooO0O0;
                String id722 = page5.getId();
                String noteId722 = page5.getNoteId();
                c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                c26387Oooo2.f90528OooOo = page5;
                c26387Oooo2.f90531OooOoO0 = rectF10;
                c26387Oooo2.f90530OooOoO = list13;
                c26387Oooo2.f90532OooOoOO = list14;
                c26387Oooo2.f90534OooOoo0 = list15;
                c26387Oooo2.f90533OooOoo = list16;
                c26387Oooo2.f90535OooOooO = arrayList1122;
                c26387Oooo2.f90539Oooo00O = i5;
                c26387Oooo2.f90540Oooo00o = z3;
                c26387Oooo2.f90542Oooo0OO = 10;
                c27449o00O0OoO722.getClass();
                C33874OooO0OO c33874OooO0OO722 = C33649OoooOOo.f121328OooO00o;
                boolean z922 = z3;
                int i722 = i5;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27445o00O0O0o(id722, noteId722, null, c27449o00O0OoO722), c26387Oooo2);
                if (objOooO0o2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 9:
                z3 = c26387Oooo2.f90540Oooo00o;
                i5 = c26387Oooo2.f90539Oooo00O;
                list10 = c26387Oooo2.f90533OooOoo;
                list11 = c26387Oooo2.f90534OooOoo0;
                list9 = c26387Oooo2.f90532OooOoOO;
                list7 = (List) c26387Oooo2.f90530OooOoO;
                rectF9 = c26387Oooo2.f90531OooOoO0;
                page4 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o04 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list12 = (List) objOooO0o5;
                c26395Oooo0o05 = c26395Oooo0o04;
                page5 = page4;
                rectF10 = rectF9;
                list13 = list7;
                list14 = list9;
                list15 = list11;
                list16 = list10;
                ArrayList arrayList10222 = new ArrayList();
                it5 = list12.iterator();
                while (it5.hasNext()) {
                }
                ArrayList arrayList11222 = new ArrayList();
                while (r2.hasNext()) {
                }
                C27449o00O0OoO c27449o00O0OoO7222 = c26395Oooo0o05.f90553OooO0O0;
                String id7222 = page5.getId();
                String noteId7222 = page5.getNoteId();
                c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                c26387Oooo2.f90528OooOo = page5;
                c26387Oooo2.f90531OooOoO0 = rectF10;
                c26387Oooo2.f90530OooOoO = list13;
                c26387Oooo2.f90532OooOoOO = list14;
                c26387Oooo2.f90534OooOoo0 = list15;
                c26387Oooo2.f90533OooOoo = list16;
                c26387Oooo2.f90535OooOooO = arrayList11222;
                c26387Oooo2.f90539Oooo00O = i5;
                c26387Oooo2.f90540Oooo00o = z3;
                c26387Oooo2.f90542Oooo0OO = 10;
                c27449o00O0OoO7222.getClass();
                C33874OooO0OO c33874OooO0OO7222 = C33649OoooOOo.f121328OooO00o;
                boolean z9222 = z3;
                int i7222 = i5;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27445o00O0O0o(id7222, noteId7222, null, c27449o00O0OoO7222), c26387Oooo2);
                if (objOooO0o2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 10:
                z4 = c26387Oooo2.f90540Oooo00o;
                i2 = c26387Oooo2.f90539Oooo00O;
                list17 = c26387Oooo2.f90535OooOooO;
                list16 = c26387Oooo2.f90533OooOoo;
                list15 = c26387Oooo2.f90534OooOoo0;
                list14 = c26387Oooo2.f90532OooOoOO;
                list13 = (List) c26387Oooo2.f90530OooOoO;
                rectF10 = c26387Oooo2.f90531OooOoO0;
                page5 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o05 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                ArrayList arrayList122 = new ArrayList();
                it6 = ((Iterable) objOooO0o5).iterator();
                while (it6.hasNext()) {
                }
                ArrayList arrayList132 = new ArrayList();
                while (r10.hasNext()) {
                }
                List list332 = list17;
                C27449o00O0OoO c27449o00O0OoO82 = c26395Oooo0o05.f90553OooO0O0;
                String id82 = page5.getId();
                String noteId82 = page5.getNoteId();
                c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                c26387Oooo2.f90528OooOo = page5;
                c26387Oooo2.f90531OooOoO0 = rectF10;
                c26387Oooo2.f90530OooOoO = list13;
                c26387Oooo2.f90532OooOoOO = list14;
                c26387Oooo2.f90534OooOoo0 = list15;
                c26387Oooo2.f90533OooOoo = list16;
                c26387Oooo2.f90535OooOooO = list332;
                c26387Oooo2.f90536OooOooo = arrayList132;
                c26387Oooo2.f90539Oooo00O = i2;
                c26387Oooo2.f90540Oooo00o = z4;
                c26387Oooo2.f90542Oooo0OO = 11;
                c27449o00O0OoO82.getClass();
                C33874OooO0OO c33874OooO0OO82 = C33649OoooOOo.f121328OooO00o;
                boolean z102 = z4;
                int i82 = i2;
                objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O0(id82, noteId82, null, c27449o00O0OoO82), c26387Oooo2);
                if (objOooO0o3 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 11:
                z5 = c26387Oooo2.f90540Oooo00o;
                i3 = c26387Oooo2.f90539Oooo00O;
                List list40 = c26387Oooo2.f90536OooOooo;
                List list41 = c26387Oooo2.f90535OooOooO;
                List list42 = c26387Oooo2.f90533OooOoo;
                List list43 = c26387Oooo2.f90534OooOoo0;
                List list44 = c26387Oooo2.f90532OooOoOO;
                List list45 = (List) c26387Oooo2.f90530OooOoO;
                RectF rectF22 = c26387Oooo2.f90531OooOoO0;
                page6 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o05 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list21 = list40;
                rectF11 = rectF22;
                list19 = list45;
                list18 = list44;
                list22 = list43;
                list20 = list42;
                list23 = list41;
                ArrayList arrayList142 = new ArrayList();
                while (r4.hasNext()) {
                }
                ArrayList arrayList152 = new ArrayList();
                it7 = arrayList142.iterator();
                while (it7.hasNext()) {
                }
                List list352 = list21;
                arrayList = new ArrayList();
                it8 = arrayList152.iterator();
                while (it8.hasNext()) {
                }
                C27449o00O0OoO c27449o00O0OoO92 = c26395Oooo0o05.f90553OooO0O0;
                String id92 = page6.getId();
                String noteId92 = page6.getNoteId();
                c26387Oooo2.f90529OooOo0o = c26395Oooo0o05;
                c26387Oooo2.f90528OooOo = page6;
                c26387Oooo2.f90531OooOoO0 = rectF11;
                c26387Oooo2.f90530OooOoO = list19;
                RectF rectF142 = rectF11;
                c26387Oooo2.f90532OooOoOO = list18;
                c26387Oooo2.f90534OooOoo0 = list22;
                c26387Oooo2.f90533OooOoo = list20;
                c26387Oooo2.f90535OooOooO = list23;
                c26387Oooo2.f90536OooOooo = list352;
                c26387Oooo2.f90538Oooo000 = arrayList;
                c26387Oooo2.f90539Oooo00O = i3;
                c26387Oooo2.f90540Oooo00o = z5;
                c26387Oooo2.f90542Oooo0OO = 12;
                c27449o00O0OoO92.getClass();
                C33874OooO0OO c33874OooO0OO92 = C33649OoooOOo.f121328OooO00o;
                boolean z112 = z5;
                int i92 = i3;
                objOooO0o4 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OO0(id92, noteId92, null, c27449o00O0OoO92), c26387Oooo2);
                if (objOooO0o4 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 12:
                z6 = c26387Oooo2.f90540Oooo00o;
                int i10 = c26387Oooo2.f90539Oooo00O;
                ArrayList arrayList18 = c26387Oooo2.f90538Oooo000;
                List list46 = c26387Oooo2.f90536OooOooo;
                List list47 = c26387Oooo2.f90535OooOooO;
                List list48 = c26387Oooo2.f90533OooOoo;
                List list49 = c26387Oooo2.f90534OooOoo0;
                List list50 = c26387Oooo2.f90532OooOoOO;
                List list51 = (List) c26387Oooo2.f90530OooOoO;
                rectF12 = c26387Oooo2.f90531OooOoO0;
                page6 = c26387Oooo2.f90528OooOo;
                c26395Oooo0o06 = c26387Oooo2.f90529OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o5);
                list24 = list51;
                list25 = list50;
                list26 = list49;
                list27 = list48;
                list28 = list47;
                obj2 = objOooO0o5;
                list29 = list46;
                arrayList = arrayList18;
                i4 = i10;
                ArrayList arrayList162 = new ArrayList();
                it9 = ((Iterable) obj2).iterator();
                while (it9.hasNext()) {
                }
                ArrayList arrayList172 = new ArrayList();
                it10 = arrayList162.iterator();
                while (it10.hasNext()) {
                }
                if (i4 == 0) {
                }
                synchronized (c26395Oooo0o06.f90559OooO0oo) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static PointF OooO0oo(float f, PointF pointF, int i) {
        return new PointF(pointF.x * f, i - (pointF.y * f));
    }

    public static Rect OooOo0o(RectF rectF, int i, int i2) {
        Matrix matrix = new Matrix();
        float f = i;
        float f2 = i2;
        matrix.postTranslate((-rectF.left) * f, (-rectF.top) * f2);
        float f3 = 1;
        matrix.postScale(f3 / rectF.width(), f3 / rectF.height());
        RectF rectF2 = new RectF(0.0f, 0.0f, f, f2);
        matrix.mapRect(rectF2);
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean OooOooo(Character ch) {
        return Character.isLowerCase(ch.charValue()) || Character.isUpperCase(ch.charValue());
    }

    public static void Oooo(Canvas canvas, C26120OooO0Oo c26120OooO0Oo, C26121OooO0o0 c26121OooO0o0, QuoteInfo quoteInfo, Page.RotationDirection rotationDirection, float f) {
        InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o;
        int i = C26396OooO0Oo.f90599OooO00o[rotationDirection.ordinal()];
        if (i == 1) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111700OooOoO0;
        } else if (i == 2) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111697OooOo;
        } else if (i == 3) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111699OooOoO;
        } else {
            if (i != 4) {
                throw new C32442OooOO0o();
            }
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
        }
        quoteInfo.drawCanvas(canvas, c26120OooO0Oo, c26121OooO0o0, f, enumC20168OooO00o);
    }

    public static void Oooo0(C26120OooO0Oo c26120OooO0Oo, C26121OooO0o0 c26121OooO0o0, DualLinkSourceInfo dualLinkSourceInfo, Page.RotationDirection rotationDirection, float f) {
        InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = dualLinkSourceInfo.deepCopy(dualLinkSourceInfo.getId());
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy, "null cannot be cast to non-null type com.orion.penkit.models.DualLinkSourceInfo");
        DualLinkSourceInfo dualLinkSourceInfo2 = (DualLinkSourceInfo) interfaceC31284OooO0O0DeepCopy;
        dualLinkSourceInfo2.scale(f, true);
        int i = C26396OooO0Oo.f90599OooO00o[rotationDirection.ordinal()];
        if (i == 1) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111700OooOoO0;
        } else if (i == 2) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111697OooOo;
        } else if (i == 3) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111699OooOoO;
        } else {
            if (i != 4) {
                throw new C32442OooOO0o();
            }
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
        }
        dualLinkSourceInfo2.render(c26120OooO0Oo, c26121OooO0o0, f, enumC20168OooO00o);
    }

    public static void Oooo0O0(C26120OooO0Oo c26120OooO0Oo, C26121OooO0o0 c26121OooO0o0, HyperLinkInfo hyperLinkInfo, float f, Page.RotationDirection rotationDirection, int i) {
        InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = hyperLinkInfo.deepCopy(hyperLinkInfo.getId());
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy, "null cannot be cast to non-null type com.orion.penkit.models.HyperLinkInfo");
            HyperLinkInfo hyperLinkInfo2 = (HyperLinkInfo) interfaceC31284OooO0O0DeepCopy;
            hyperLinkInfo2.scale(f, true);
            hyperLinkInfo2.render(c26120OooO0Oo, c26121OooO0o0, f);
            return;
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy2 = hyperLinkInfo.deepCopy(hyperLinkInfo.getId());
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy2, "null cannot be cast to non-null type com.orion.penkit.models.HyperLinkInfo");
        HyperLinkInfo hyperLinkInfo3 = (HyperLinkInfo) interfaceC31284OooO0O0DeepCopy2;
        hyperLinkInfo3.scale(f, true);
        int i2 = C26396OooO0Oo.f90599OooO00o[rotationDirection.ordinal()];
        if (i2 == 1) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111700OooOoO0;
        } else if (i2 == 2) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111697OooOo;
        } else if (i2 == 3) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111699OooOoO;
        } else {
            if (i2 != 4) {
                throw new C32442OooOO0o();
            }
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
        }
        hyperLinkInfo3.renderLinkIcon(c26120OooO0Oo, c26121OooO0o0, f, enumC20168OooO00o);
    }

    public final void OooO0OO(int i, boolean z) {
        HashMap<Integer, List<InkStrokeInfo>> map = this.f90563OooOOO;
        List<InkStrokeInfo> orDefault = map.getOrDefault(Integer.valueOf(i), new ArrayList());
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault, "getOrDefault(...)");
        List<InkStrokeInfo> list = orDefault;
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                RectF boundingBox = ((InkStrokeInfo) obj).getBoundingBox(1.0f);
                if (z) {
                    if (boundingBox.top < 0.0f) {
                        arrayList.add(obj);
                    }
                } else if (boundingBox.left < 0.0f) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                arrayList2.add(obj2);
            }
            List<InkStrokeInfo> orDefault2 = map.getOrDefault(Integer.valueOf(i - 1), new ArrayList());
            kotlin.jvm.internal.OooOOO0.OooO0o(orDefault2, "getOrDefault(...)");
            C34431OooOo0.OooOoOO(orDefault2, new C26371OooOOOo(arrayList2, 0));
        }
        if (i < this.f90560OooOO0.size() - 1) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                RectF boundingBox2 = ((InkStrokeInfo) obj3).getBoundingBox(1.0f);
                if (z) {
                    if (boundingBox2.bottom > OooOo0(i + 1).f89148OooO0O0) {
                        arrayList3.add(obj3);
                    }
                } else if (boundingBox2.right > OooOo0(i + 1).f89147OooO00o) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                arrayList4.add(obj4);
            }
            List<InkStrokeInfo> orDefault3 = map.getOrDefault(Integer.valueOf(i + 1), new ArrayList());
            kotlin.jvm.internal.OooOOO0.OooO0o(orDefault3, "getOrDefault(...)");
            C34431OooOo0.OooOoOO(orDefault3, new C26373OooOOo0(arrayList4, 0));
        }
        final C26372OooOOo c26372OooOOo = new C26372OooOOo(0);
        list.removeIf(new Predicate() { // from class: o0O0oooo.OooOOoo
            @Override // java.util.function.Predicate
            public final boolean test(Object obj5) {
                return ((Boolean) c26372OooOOo.invoke(obj5)).booleanValue();
            }
        });
    }

    public final void OooO0Oo(int i, boolean z) {
        HashMap<Integer, List<DrawRecord>> map = this.f90564OooOOO0;
        List<DrawRecord> orDefault = map.getOrDefault(Integer.valueOf(i), new ArrayList());
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault, "getOrDefault(...)");
        List<DrawRecord> list = orDefault;
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                DrawRecord drawRecord = (DrawRecord) obj;
                if (z) {
                    if (drawRecord.getBounds().top < 0.0f) {
                        arrayList.add(obj);
                    }
                } else if (drawRecord.getBounds().left < 0.0f) {
                    arrayList.add(obj);
                }
            }
            final ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                arrayList2.add(obj2);
            }
            List<DrawRecord> orDefault2 = map.getOrDefault(Integer.valueOf(i - 1), new ArrayList());
            kotlin.jvm.internal.OooOOO0.OooO0o(orDefault2, "getOrDefault(...)");
            C34431OooOo0.OooOoOO(orDefault2, new InterfaceC32507OooOO0o() { // from class: o0O0oooo.OooOo00
                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final Object invoke(Object obj3) {
                    DrawRecord record = (DrawRecord) obj3;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(record, "record");
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((DrawRecord) it.next()).getId());
                    }
                    return Boolean.valueOf(arrayList4.contains(record.getId()));
                }
            });
        }
        if (i < this.f90560OooOO0.size() - 1) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                DrawRecord drawRecord2 = (DrawRecord) obj3;
                if (z) {
                    if (drawRecord2.getBounds().bottom > OooOo0(i + 1).f89148OooO0O0) {
                        arrayList3.add(obj3);
                    }
                } else if (drawRecord2.getBounds().right > OooOo0(i + 1).f89147OooO00o) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList3) {
                arrayList4.add(obj4);
            }
            List<DrawRecord> orDefault3 = map.getOrDefault(Integer.valueOf(i + 1), new ArrayList());
            kotlin.jvm.internal.OooOOO0.OooO0o(orDefault3, "getOrDefault(...)");
            C34431OooOo0.OooOoOO(orDefault3, new C26378OooOo0O(arrayList4, 0));
        }
        final C26379OooOo0o c26379OooOo0o = new C26379OooOo0o(0);
        list.removeIf(new Predicate() { // from class: o0O0oooo.OooOo
            @Override // java.util.function.Predicate
            public final boolean test(Object obj5) {
                return ((Boolean) c26379OooOo0o.invoke(obj5)).booleanValue();
            }
        });
    }

    public final void OooO0o(ArrayList arrayList) {
        Iterable iterableO0OO00O;
        if (!arrayList.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInCore");
            c20358OooO00o.OooO00o("closePageLocked: " + arrayList, new Object[0]);
        }
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = this.f90577OooOoOO;
        List listOoooo00 = oOo000Oo.OooOo.Ooooo00(oOo000Oo.OooOo.ooOO(oOo000Oo.OooOo.o0ooOO0(concurrentSkipListSet)), oOo000Oo.OooOo.o0OO00O(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listOoooo00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Integer num = (Integer) it.next();
            List<Page> list = this.f90560OooOO0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(num);
            Page page = (Page) oOo000Oo.OooOo.OoooO00(num.intValue(), list);
            PaperTheme paperTheme = page != null ? page.getPaperTheme() : null;
            if (paperTheme != null) {
                arrayList2.add(paperTheme);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof PdfPaperTheme) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            String pdfPath = ((PdfPaperTheme) obj2).getPdfInfo().getPdfPath();
            Object arrayList4 = linkedHashMap.get(pdfPath);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(pdfPath, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Page page2 = (Page) oOo000Oo.OooOo.OoooO00(((Number) it2.next()).intValue(), this.f90560OooOO0);
            PaperTheme paperTheme2 = page2 != null ? page2.getPaperTheme() : null;
            if (paperTheme2 != null) {
                arrayList5.add(paperTheme2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList5) {
            if (obj3 instanceof PdfPaperTheme) {
                arrayList6.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj4 : arrayList6) {
            String pdfPath2 = ((PdfPaperTheme) obj4).getPdfInfo().getPdfPath();
            Object arrayList7 = linkedHashMap2.get(pdfPath2);
            if (arrayList7 == null) {
                arrayList7 = new ArrayList();
                linkedHashMap2.put(pdfPath2, arrayList7);
            }
            ((List) arrayList7).add(obj4);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            PdfDocument pdfDocument = this.f90561OooOO0O.get(str);
            if (pdfDocument != null) {
                List list3 = list2;
                ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(Integer.valueOf(((PdfPaperTheme) it3.next()).getPageNum()));
                }
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList8);
                List list4 = (List) linkedHashMap.get(str);
                if (list4 != null) {
                    List list5 = list4;
                    ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
                    Iterator it4 = list5.iterator();
                    while (it4.hasNext()) {
                        arrayList9.add(Integer.valueOf(((PdfPaperTheme) it4.next()).getPageNum()));
                    }
                    iterableO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList9);
                } else {
                    iterableO0OO00O = C34438OooOoo0.f123458OooOo0o;
                }
                Set setOooO0oO = C34449Oooo0oo.OooO0oO(setO0OO00O, iterableO0OO00O);
                this.f90551OooO.closePages(pdfDocument, oOo000Oo.OooOo.o0ooOO0(setOooO0oO));
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteInCore");
                c20358OooO00o2.OooO00o("closePageLocked: close pdf pages: " + setOooO0oO, new Object[0]);
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            OooOooO(null, ((Number) it5.next()).intValue());
        }
        concurrentSkipListSet.removeAll(oOo000Oo.OooOo.o0OO00O(arrayList));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            int iIntValue = ((Number) it6.next()).intValue();
            ConcurrentSkipListSet<Integer> concurrentSkipListSet2 = this.f90579OooOoo0;
            concurrentSkipListSet2.remove(Integer.valueOf(iIntValue));
            concurrentSkipListSet2.remove(Integer.valueOf(iIntValue + 1));
        }
    }

    public final boolean OooO0o0() {
        boolean z;
        synchronized (this.f90573OooOo0O) {
            z = !this.f90573OooOo0O.isEmpty();
            this.f90573OooOo0O.clear();
        }
        return z;
    }

    public final ArrayList OooO0oO(int i, List list, C26112OooO0oo c26112OooO0oo) {
        List<RectF> list2 = list;
        ArrayList<RectF> arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (RectF rectF : list2) {
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = c26112OooO0oo.f89150OooO0O0;
            arrayList.add(new RectF(f, f3 - f2, rectF.right, f3 - rectF.bottom));
        }
        C26111OooO0oO c26111OooO0oOOooOoO = OooOoO(i);
        C26112OooO0oo c26112OooO0ooOooOo0O = OooOo0O(i);
        Page page = this.f90560OooOO0.get(i);
        Rect rectOooOo00 = OooOo00(i);
        o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
        Page.RotationDirection rotationDirection = page.getRotationDirection();
        float f4 = c26111OooO0oOOooOoO.f89147OooO00o;
        float f5 = c26111OooO0oOOooOoO.f89148OooO0O0;
        oooOO02.getClass();
        Matrix matrixOooOO0O = o0oo000O.OooOO0.OooOO0O(rotationDirection, f4, f5);
        float f6 = f4 / c26112OooO0ooOooOo0O.f89149OooO00o;
        float f7 = f5 / c26112OooO0ooOooOo0O.f89150OooO0O0;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (RectF rectF2 : arrayList) {
            RectF rectF3 = new RectF(rectF2.left * f6, rectF2.top * f7, rectF2.right * f6, rectF2.bottom * f7);
            if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
                matrixOooOO0O.mapRect(rectF3);
            }
            rectF3.offset(rectOooOo00.left, rectOooOo00.top);
            arrayList2.add(rectF3);
        }
        return arrayList2;
    }

    public final int OooOO0(int i, boolean z, int i2, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        if (!((Boolean) interfaceC32507OooOO0o.invoke(Integer.valueOf(i))).booleanValue() || i2 > this.f90582Oooo0) {
            return i;
        }
        return OooOO0(z ? i - 1 : i + 1, z, i2 + 1, interfaceC32507OooOO0o);
    }

    public final int OooOO0O(int i, PointF pointF) {
        Page page = this.f90560OooOO0.get(i);
        if (!(page.getPaperTheme() instanceof PdfPaperTheme)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInCore");
            c20358OooO00o.OooOO0O("page.paperTheme is not PdfPaperTheme", new Object[0]);
            return -1;
        }
        PaperTheme paperTheme = page.getPaperTheme();
        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
        PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme;
        PdfDocument pdfDocument = this.f90561OooOO0O.get(pdfPaperTheme.getPdfInfo().getPdfPath());
        if (pdfDocument == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInCore");
            c20358OooO00o2.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("doc is null, pdfPath: ", pdfPaperTheme.getPdfInfo().getPdfPath()), new Object[0]);
            return -1;
        }
        C26111OooO0oO c26111OooO0oOOooOoO = OooOoO(i);
        C26112OooO0oo c26112OooO0ooOooOo0O = OooOo0O(i);
        float f = c26112OooO0ooOooOo0O.f89149OooO00o / c26111OooO0oOOooOoO.f89147OooO00o;
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        PointF pointFOooO0oo = OooO0oo(f, o0oo000O.OooOO0.OooO0O0(page, pointF), (int) c26112OooO0ooOooOo0O.f89150OooO0O0);
        return this.f90551OooO.getCharIndexAtPos(pdfDocument, pdfPaperTheme.getPageNum(), pointFOooO0oo.x, pointFOooO0oo.y, 10.0f, 10.0f);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.orion.penkit.models.DualLinkSourceInfo] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, com.orion.penkit.models.DualLinkRefInfo] */
    public final InterfaceC31284OooO0O0 OooOO0o(String str) {
        int i;
        Object next;
        synchronized (this.f90559OooO0oo) {
            try {
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                C24033OooOooo c24033OooOooo = new C24033OooOooo();
                c24033OooOooo.f80940OooOo0o = -1;
                Set<Map.Entry<Integer, List<DualLinkSourceInfo>>> setEntrySet = this.f90569OooOOoo.entrySet();
                kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet, "<get-entries>(...)");
                Iterator<T> it = setEntrySet.iterator();
                while (true) {
                    Object obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(entry);
                    Object key = entry.getKey();
                    kotlin.jvm.internal.OooOOO0.OooO0o(key, "component1(...)");
                    Integer num = (Integer) key;
                    Object value = entry.getValue();
                    kotlin.jvm.internal.OooOOO0.OooO0o(value, "component2(...)");
                    Iterator it2 = ((List) value).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkSourceInfo) next2).getId(), str)) {
                            obj = next2;
                            break;
                        }
                    }
                    ?? r6 = (DualLinkSourceInfo) obj;
                    if (r6 != 0) {
                        c24034Oooo00O.f80942OooOo0o = r6;
                        c24033OooOooo.f80940OooOo0o = num.intValue();
                    }
                }
                if (c24034Oooo00O.f80942OooOo0o == 0) {
                    Set<Map.Entry<Integer, List<DualLinkRefInfo>>> setEntrySet2 = this.f90572OooOo00.entrySet();
                    kotlin.jvm.internal.OooOOO0.OooO0o(setEntrySet2, "<get-entries>(...)");
                    Iterator<T> it3 = setEntrySet2.iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it3.next();
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(entry2);
                        Object key2 = entry2.getKey();
                        kotlin.jvm.internal.OooOOO0.OooO0o(key2, "component1(...)");
                        Integer num2 = (Integer) key2;
                        Object value2 = entry2.getValue();
                        kotlin.jvm.internal.OooOOO0.OooO0o(value2, "component2(...)");
                        Iterator it4 = ((List) value2).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkRefInfo) next).getId(), str)) {
                                break;
                            }
                        }
                        ?? r8 = (DualLinkRefInfo) next;
                        if (r8 != 0) {
                            c24034Oooo00O.f80942OooOo0o = r8;
                            c24033OooOooo.f80940OooOo0o = num2.intValue();
                        }
                    }
                }
                if (c24034Oooo00O.f80942OooOo0o != 0 && (i = c24033OooOooo.f80940OooOo0o) != -1) {
                    Page page = this.f90560OooOO0.get(i);
                    o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
                    T t = c24034Oooo00O.f80942OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(t);
                    List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(t);
                    oooOO02.getClass();
                    return (InterfaceC31284OooO0O0) oOo000Oo.OooOo.Oooo0oO(o0oo000O.OooOO0.OooO(page, listOooO0oO));
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList OooOOO(int i, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        List list = (List) interfaceC32507OooOO0o.invoke(Integer.valueOf(i));
        Page page = this.f90560OooOO0.get(i);
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        return o0oo000O.OooOO0.OooO(page, list);
    }

    public final ArrayList OooOOO0(Integer num) {
        int iIntValue = num.intValue();
        List<InterfaceC31284OooO0O0> listOooOOOO = OooOOOO(num.intValue());
        Page page = this.f90560OooOO0.get(iIntValue);
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        return o0oo000O.OooOO0.OooO(page, listOooOOOO);
    }

    public final List<InterfaceC31284OooO0O0> OooOOOO(int i) {
        List<InterfaceC31284OooO0O0> listO00O0O;
        synchronized (this.f90559OooO0oo) {
            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            Integer numValueOf = Integer.valueOf(i);
            HashMap<Integer, List<ImageInfo>> map = this.f90566OooOOOo;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            c32465OooO0O0OooO0Oo.addAll(map.getOrDefault(numValueOf, c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90571OooOo0.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90567OooOOo.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90569OooOOoo.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90572OooOo00.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90564OooOOO0.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90563OooOOO.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90565OooOOOO.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            c32465OooO0O0OooO0Oo.addAll(this.f90568OooOOo0.getOrDefault(Integer.valueOf(i), c34434OooOoO));
            listO00O0O = oOo000Oo.OooOo.o00O0O(com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo), new C26397OooO0o0());
        }
        return listO00O0O;
    }

    public final ArrayList OooOOOo(Integer num) {
        List<HyperLinkInfo> orDefault;
        int iIntValue = num.intValue();
        synchronized (this.f90559OooO0oo) {
            orDefault = this.f90571OooOo0.getOrDefault(num, C34434OooOoO.f123453OooOo0o);
        }
        Page page = this.f90560OooOO0.get(iIntValue);
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        return o0oo000O.OooOO0.OooO(page, orDefault);
    }

    public final int OooOOo(String pageId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        Iterator<Page> it = this.f90560OooOO0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(it.next().getId(), pageId)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final String OooOOo0(int i) {
        if (i < 0 || i >= this.f90560OooOO0.size()) {
            return null;
        }
        return this.f90560OooOO0.get(i).getId();
    }

    public final int OooOOoo(String str) {
        synchronized (this.f90559OooO0oo) {
            try {
                HashMap<Integer, List<DualLinkSourceInfo>> map = this.f90569OooOOoo;
                if (!map.isEmpty()) {
                    for (Map.Entry<Integer, List<DualLinkSourceInfo>> entry : map.entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        List<DualLinkSourceInfo> value = entry.getValue();
                        if (!(value instanceof Collection) || !value.isEmpty()) {
                            Iterator<T> it = value.iterator();
                            while (it.hasNext()) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkSourceInfo) it.next()).getId(), str)) {
                                    return iIntValue;
                                }
                            }
                        }
                    }
                }
                HashMap<Integer, List<DualLinkRefInfo>> map2 = this.f90572OooOo00;
                if (!map2.isEmpty()) {
                    for (Map.Entry<Integer, List<DualLinkRefInfo>> entry2 : map2.entrySet()) {
                        int iIntValue2 = entry2.getKey().intValue();
                        List<DualLinkRefInfo> value2 = entry2.getValue();
                        if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                            Iterator<T> it2 = value2.iterator();
                            while (it2.hasNext()) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkRefInfo) it2.next()).getId(), str)) {
                                    return iIntValue2;
                                }
                            }
                        }
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Character OooOo(PdfDocument pdfDocument, int i, int i2) {
        Object objOooO00o;
        try {
            String text = this.f90551OooO.getText(pdfDocument, i, i2, i2 + 1);
            kotlin.jvm.internal.OooOOO0.OooO0o(text, "getText(...)");
            char[] charArray = text.toCharArray();
            kotlin.jvm.internal.OooOOO0.OooO0o(charArray, "toCharArray(...)");
            objOooO00o = charArray.length == 0 ? null : Character.valueOf(charArray[0]);
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInCore");
            c20358OooO00o.OooO0OO("correctSelectIndexInEngEnv.getChar failure: " + thOooO00o + ".", new Object[0]);
        }
        return (Character) (objOooO00o instanceof C32445OooOOOO.OooO00o ? null : objOooO00o);
    }

    public final C26111OooO0oO OooOo0(int i) {
        C32443OooOOO<Integer, Integer> rotatedPageSize = this.f90560OooOO0.get(i).getRotatedPageSize();
        return new C26111OooO0oO(rotatedPageSize.f116638OooOo0o.intValue(), rotatedPageSize.f116637OooOo.intValue());
    }

    public final Rect OooOo00(int i) {
        return this.f90560OooOO0.get(i).getRotatedPaperPadding();
    }

    public final C26112OooO0oo OooOo0O(int i) {
        Page page = this.f90560OooOO0.get(i);
        if (!(page.getPaperTheme() instanceof PdfPaperTheme)) {
            return new C26112OooO0oo(0.0f, 0.0f);
        }
        PaperTheme paperTheme = page.getPaperTheme();
        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
        PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme;
        if (this.f90561OooOO0O.get(pdfPaperTheme.getPdfInfo().getPdfPath()) == null) {
            return new C26112OooO0oo(0.0f, 0.0f);
        }
        int pageNum = pdfPaperTheme.getPageNum();
        PdfiumCore pdfiumCore = this.f90551OooO;
        return new C26112OooO0oo(pdfiumCore.getPageWidthPoint(r0, pageNum), pdfiumCore.getPageHeightPoint(r0, pdfPaperTheme.getPageNum()));
    }

    public final C26111OooO0oO OooOoO(int i) {
        Page page = this.f90560OooOO0.get(i);
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        Size sizeOooOOO = o0oo000O.OooOO0.OooOOO(page);
        return new C26111OooO0oO(sizeOooOOO.getWidth(), sizeOooOOO.getHeight());
    }

    public final C26111OooO0oO OooOoO0(int i) {
        C32443OooOOO<Integer, Integer> unrotatedPageSize = this.f90560OooOO0.get(i).getUnrotatedPageSize();
        return new C26111OooO0oO(unrotatedPageSize.f116638OooOo0o.intValue(), unrotatedPageSize.f116637OooOo.intValue());
    }

    public final ArrayList OooOoOO() {
        ArrayList arrayList;
        synchronized (this.f90559OooO0oo) {
            try {
                ArrayList arrayList2 = this.f90562OooOO0o;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((LayerInfo) obj).getVisible()) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LayerInfo) it.next()).getId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void OooOoo() {
        synchronized (this.f90559OooO0oo) {
            this.f90564OooOOO0.clear();
            this.f90563OooOOO.clear();
            this.f90567OooOOo.clear();
            this.f90566OooOOOo.clear();
            this.f90568OooOOo0.clear();
            this.f90565OooOOOO.clear();
            this.f90573OooOo0O.clear();
            this.f90569OooOOoo.clear();
            this.f90572OooOo00.clear();
            this.f90571OooOo0.clear();
            this.f90577OooOoOO.clear();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public final ArrayList OooOoo0(int i, List list, boolean z) {
        int i2;
        float f;
        float f2;
        Page page = this.f90560OooOO0.get(i);
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        ArrayList arrayListOooO = o0oo000O.OooOO0.OooO(page, list);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListOooO.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i2 = this.f90555OooO0Oo;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            RectF boundingBox = ((InterfaceC31284OooO0O0) next).getBoundingBox(1.0f);
            if (z) {
                if (boundingBox.top < (-i2) * this.f90575OooOoO) {
                    arrayList.add(next);
                }
            } else if (boundingBox.left < (-i2) * this.f90575OooOoO) {
                arrayList.add(next);
            }
        }
        C26111OooO0oO c26111OooO0oOOooOo0 = OooOo0(i);
        int i3 = i - 1;
        C26111OooO0oO c26111OooO0oOOooOo02 = OooOo0(i3);
        int i4 = c26111OooO0oOOooOo02.f89148OooO0O0;
        int i5 = c26111OooO0oOOooOo02.f89147OooO00o;
        if (z) {
            f2 = (i5 - c26111OooO0oOOooOo0.f89147OooO00o) / 2.0f;
            f = (i2 * this.f90575OooOoO) + i4;
        } else {
            float f3 = i5 + (i2 * this.f90575OooOoO);
            f = (i4 - c26111OooO0oOOooOo0.f89148OooO0O0) / 2.0f;
            f2 = f3;
        }
        PointF pointF = new PointF(f2, f);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC31284OooO0O0) it2.next()).offset(pointF.x, pointF.y);
        }
        Page page2 = this.f90560OooOO0.get(i3);
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        o0oo000O.OooOO0.OooO0Oo(page2, arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void OooOooO(RectF rectF, int i) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        synchronized (this.f90559OooO0oo) {
            if (rectF != null) {
                try {
                    Page page = this.f90560OooOO0.get(i);
                    if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
                        o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
                        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(rectF);
                        oooOO02.getClass();
                        rectF = (RectF) oOo000Oo.OooOo.Oooo0oO(o0oo000O.OooOO0.OooO00o(page, listOooO0oO));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                rectF = null;
            }
            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            List<DrawRecord> list = this.f90564OooOOO0.get(Integer.valueOf(i));
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    DrawRecord drawRecord = (DrawRecord) obj;
                    if (rectF == null || rectF.contains(drawRecord.getBounds())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = C34434OooOoO.f123453OooOo0o;
            }
            c32465OooO0O0OooO0Oo.addAll((Collection) arrayList);
            List<InkStrokeInfo> list2 = this.f90563OooOOO.get(Integer.valueOf(i));
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) obj2;
                    if (rectF == null || rectF.contains(inkStrokeInfo.getBoundingBox(1.0f))) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = C34434OooOoO.f123453OooOo0o;
            }
            c32465OooO0O0OooO0Oo.addAll((Collection) arrayList2);
            List<ImageInfo> list3 = this.f90566OooOOOo.get(Integer.valueOf(i));
            if (list3 != null) {
                arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    ImageInfo imageInfo = (ImageInfo) obj3;
                    if (rectF == null || rectF.contains(imageInfo.getBounds())) {
                        arrayList3.add(obj3);
                    }
                }
            } else {
                arrayList3 = C34434OooOoO.f123453OooOo0o;
            }
            c32465OooO0O0OooO0Oo.addAll((Collection) arrayList3);
            List<ShapeInfo> list4 = this.f90565OooOOOO.get(Integer.valueOf(i));
            if (list4 != null) {
                arrayList4 = new ArrayList();
                for (Object obj4 : list4) {
                    ShapeInfo shapeInfo = (ShapeInfo) obj4;
                    if (rectF == null || rectF.contains(shapeInfo.getBoundingBox(1.0f))) {
                        arrayList4.add(obj4);
                    }
                }
            } else {
                arrayList4 = C34434OooOoO.f123453OooOo0o;
            }
            c32465OooO0O0OooO0Oo.addAll((Collection) arrayList4);
            OoooOOO(i, C34434OooOoO.f123453OooOo0o, com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo));
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public final Boolean Oooo000(int i, boolean z) {
        Boolean boolValueOf;
        synchronized (this.f90577OooOoOO) {
            try {
                boolean zOooo00O = Oooo00O(i, z, null);
                int i2 = i + 1;
                if (i2 >= 0 && i2 < this.f90560OooOO0.size()) {
                    Oooo00O(i2, z, null);
                }
                int iMax = Math.max(0, i - 3);
                int iMin = Math.min(this.f90560OooOO0.size(), i + 3);
                ConcurrentSkipListSet<Integer> concurrentSkipListSet = this.f90577OooOoOO;
                ArrayList arrayList = new ArrayList();
                for (Integer num : concurrentSkipListSet) {
                    Integer num2 = num;
                    if (num2.intValue() < iMax || num2.intValue() > iMin) {
                        arrayList.add(num);
                    }
                }
                OooO0o(arrayList);
                boolValueOf = Boolean.valueOf(zOooo00O);
            } catch (Throwable th) {
                throw th;
            }
        }
        return boolValueOf;
    }

    public final boolean Oooo00O(int i, boolean z, RectF rectF) throws Exception {
        String path;
        if (this.f90577OooOoOO.contains(Integer.valueOf(i)) && rectF == null) {
            if (!this.f90579OooOoo0.contains(Integer.valueOf(i)) && i > 0) {
                int i2 = i - 1;
                if (this.f90577OooOoOO.contains(Integer.valueOf(i2))) {
                    List<InterfaceC31284OooO0O0> listOooOOOO = OooOOOO(i);
                    if (!listOooOOOO.isEmpty()) {
                        ArrayList arrayListOooOoo0 = OooOoo0(i, listOooOOOO, z);
                        if (!arrayListOooOoo0.isEmpty()) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "NoteInCore", "maybeUpdatePreviousPageCrossItems: pageIndex=", i, ", isVertical=");
                            sbOooO00o.append(z);
                            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                            synchronized (this.f90559OooO0oo) {
                                OoooOOO(i2, arrayListOooOoo0, C34434OooOoO.f123453OooOo0o);
                                this.f90579OooOoo0.add(Integer.valueOf(i));
                            }
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        if (i == 0) {
            C26110OooO0o0.OooO0O0();
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooO00o("openPage start: pageIndex=" + i + ", isVertical=" + z, new Object[0]);
        Page page = this.f90560OooOO0.get(i);
        PaperTheme paperTheme = page.getPaperTheme();
        if (paperTheme instanceof PdfPaperTheme) {
            PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme;
            PdfInfo pdfInfo = pdfPaperTheme.getPdfInfo();
            if (!this.f90561OooOO0O.containsKey(pdfInfo.getPdfPath())) {
                try {
                    this.f90561OooOO0O.put(pdfInfo.getPdfPath(), this.f90551OooO.newDocument(ParcelFileDescriptor.open(new File(pdfInfo.getPdfPath()), WarningType.HINT), pdfInfo.getPassword()));
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("NoteInCore");
                    c20358OooO00o3.OooO0Oo(e, "NoteInCore.openPageLocked. open pdfPath file err.", new Object[0]);
                    throw e;
                }
            }
            PdfDocument pdfDocument = this.f90561OooOO0O.get(pdfInfo.getPdfPath());
            if (pdfDocument != null && !this.f90551OooO.isPageOpened(pdfDocument, pdfPaperTheme.getPageNum())) {
                int pageCount = this.f90551OooO.getPageCount(pdfDocument);
                if (pdfPaperTheme.getPageNum() >= pageCount) {
                    c20358OooO00o2.OooOOO0("NoteInCore");
                    StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(pdfPaperTheme.getPageNum(), "NoteInCore.openPageLocked. pdfPageNum >= pdfPageCount. pdfPath: ", pdfInfo.getPdfPath(), " pdfPageNum: ", ", pdfPageCount: ");
                    sbOooO0OO.append(pageCount);
                    c20358OooO00o2.OooO0OO(sbOooO0OO.toString(), new Object[0]);
                    this.f90551OooO.openPage(pdfDocument, pageCount - 1);
                } else {
                    this.f90551OooO.openPage(pdfDocument, pdfPaperTheme.getPageNum());
                }
            }
        }
        if (paperTheme instanceof TemplateMaterialPaperTheme) {
            TemplateMaterialPaperTheme templateMaterialPaperTheme = (TemplateMaterialPaperTheme) paperTheme;
            String variantPdfPath = templateMaterialPaperTheme.getVariantPdfPath();
            if (variantPdfPath == null) {
                c20358OooO00o2.OooOOO0("NoteInCore");
                c20358OooO00o2.OooO0OO("NoteInCore.openPageLocked. TemplateMaterialPaperTheme has no valid PDF path.", new Object[0]);
                return false;
            }
            if (!this.f90561OooOO0O.containsKey(variantPdfPath)) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(variantPdfPath), WarningType.HINT);
                    PdfiumCore pdfiumCore = this.f90551OooO;
                    PdfInfo pdfInfo2 = templateMaterialPaperTheme.getPdfInfo();
                    this.f90561OooOO0O.put(variantPdfPath, pdfiumCore.newDocument(parcelFileDescriptorOpen, pdfInfo2 != null ? pdfInfo2.getPassword() : null));
                } catch (Exception e2) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("NoteInCore");
                    c20358OooO00o4.OooO0Oo(e2, "NoteInCore.openPageLocked. open TemplateMaterialPaperTheme pdfPath file err.", new Object[0]);
                    throw e2;
                }
            }
            PdfDocument pdfDocument2 = this.f90561OooOO0O.get(variantPdfPath);
            if (pdfDocument2 != null && !this.f90551OooO.isPageOpened(pdfDocument2, 0)) {
                this.f90551OooO.openPage(pdfDocument2, 0);
            }
        }
        if ((paperTheme instanceof PdfSetPaperTheme) && (path = ((PdfSetPaperTheme) paperTheme).getPath(this.f90556OooO0o)) != null) {
            if (!this.f90561OooOO0O.containsKey(path)) {
                this.f90561OooOO0O.put(path, this.f90551OooO.newDocument(ParcelFileDescriptor.open(new File(path), WarningType.HINT), (String) null));
            }
            PdfDocument pdfDocument3 = this.f90561OooOO0O.get(path);
            if (pdfDocument3 != null && !this.f90551OooO.isPageOpened(pdfDocument3, 0)) {
                this.f90551OooO.openPage(pdfDocument3, 0);
            }
        }
        C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooO0o(i, z, page, rectF, null));
        this.f90577OooOoOO.add(Integer.valueOf(i));
        if (i == 0) {
            C26110OooO0o0.OooO0O0();
        }
        c20358OooO00o2.OooO00o(C21532OooOOo.OooO0OO(i, "openPage end: "), new Object[0]);
        return true;
    }

    public final void Oooo00o(Canvas canvas, C26120OooO0Oo c26120OooO0Oo, C26121OooO0o0 c26121OooO0o0, DualLinkRefInfo dualLinkRefInfo, boolean z, Page.RotationDirection rotationDirection, float f) {
        InterfaceC31283OooO00o.EnumC20168OooO00o enumC20168OooO00o;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = dualLinkRefInfo.deepCopy(dualLinkRefInfo.getId());
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy, "null cannot be cast to non-null type com.orion.penkit.models.DualLinkRefInfo");
        DualLinkRefInfo dualLinkRefInfo2 = (DualLinkRefInfo) interfaceC31284OooO0O0DeepCopy;
        dualLinkRefInfo2.scale(f, true);
        int i = C26396OooO0Oo.f90599OooO00o[rotationDirection.ordinal()];
        if (i == 1) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111700OooOoO0;
        } else if (i == 2) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111697OooOo;
        } else if (i == 3) {
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111699OooOoO;
        } else {
            if (i != 4) {
                throw new C32442OooOO0o();
            }
            enumC20168OooO00o = InterfaceC31283OooO00o.EnumC20168OooO00o.f111698OooOo0o;
        }
        dualLinkRefInfo2.render(c26120OooO0Oo, c26121OooO0o0, f, z, enumC20168OooO00o);
        InterfaceC31284OooO0O0 item = dualLinkRefInfo2.getItem();
        ImageInfo imageInfo = item instanceof ImageInfo ? (ImageInfo) item : null;
        if (imageInfo != null) {
            ImageInfo imageInfo2 = imageInfo.getFixed() ? imageInfo : null;
            if (imageInfo2 != null) {
                DrawToolFactory drawToolFactory = DrawToolFactory.INSTANCE;
                int width = drawToolFactory.getFixedIconBitmap().getWidth();
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                matrix.postTranslate(imageInfo2.getBounds().right - (width * f), imageInfo2.getBounds().top);
                float f2 = 2;
                matrix.postRotate(imageInfo2.getRotation(), (imageInfo2.getBounds().width() / f2) + imageInfo2.getBounds().left, (imageInfo2.getBounds().height() / f2) + imageInfo2.getBounds().top);
                canvas.drawBitmap(drawToolFactory.getFixedIconBitmap(), matrix, this.f90581OooOooo);
            }
        }
    }

    public final void Oooo0OO(Canvas canvas, ImageInfo imageInfo, float f) {
        Bitmap bitmap;
        Matrix matrix = new Matrix();
        boolean z = C33595OooOOo.OooOOo0(imageInfo.getUri(), ".svg", false) && f > 2.0f && ((int) imageInfo.getBounds().width()) == imageInfo.getBitmap().getWidth() && imageInfo.getBounds().width() * f < 2000.0f && imageInfo.getBounds().height() * f < 2000.0f;
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        Context context = this.f90556OooO0o;
        if (zIsHardwareAccelerated) {
            if (z) {
                bitmap = C28023OooO00o.OooO00o(context, Uri.fromFile(new File(imageInfo.getUri())), (int) (imageInfo.getBounds().width() * f), (int) (imageInfo.getBounds().height() * f), Bitmap.Config.HARDWARE);
                if (bitmap == null && (bitmap = imageInfo.getHwBitmap()) == null) {
                    bitmap = imageInfo.getBitmap();
                }
            } else {
                bitmap = imageInfo.getHwBitmap();
                if (bitmap == null) {
                    bitmap = imageInfo.getBitmap();
                }
            }
        } else if (!z || (bitmap = C28023OooO00o.OooO00o(context, Uri.fromFile(new File(imageInfo.getUri())), (int) (imageInfo.getBounds().width() * f), (int) (imageInfo.getBounds().height() * f), Bitmap.Config.ARGB_8888)) == null) {
            bitmap = imageInfo.getBitmap();
        }
        HashSet<String> hashSet = this.f90578OooOoo.get(Integer.valueOf(imageInfo.getItemType()));
        boolean zContains = hashSet != null ? hashSet.contains(imageInfo.getId()) : false;
        Paint paint = this.f90581OooOooo;
        if (zContains) {
            Paint paint2 = new Paint(paint);
            int alpha = (int) (((double) paint2.getAlpha()) * 0.5d);
            paint2.setAlpha(alpha >= 1 ? alpha : 1);
            paint = paint2;
        }
        matrix.postScale((imageInfo.getBounds().width() / bitmap.getWidth()) * f, (imageInfo.getBounds().height() / bitmap.getHeight()) * f);
        matrix.postTranslate(imageInfo.getBounds().left * f, imageInfo.getBounds().top * f);
        float f2 = 2;
        matrix.postRotate(imageInfo.getRotation(), ((imageInfo.getBounds().width() / f2) + imageInfo.getBounds().left) * f, ((imageInfo.getBounds().height() / f2) + imageInfo.getBounds().top) * f);
        canvas.drawBitmap(bitmap, matrix, paint);
        if (imageInfo.getFixed()) {
            DrawToolFactory drawToolFactory = DrawToolFactory.INSTANCE;
            int width = drawToolFactory.getFixedIconBitmap().getWidth();
            Matrix matrix2 = new Matrix();
            matrix2.postTranslate((imageInfo.getBounds().right * f) - width, imageInfo.getBounds().top * f);
            matrix2.postRotate(imageInfo.getRotation(), ((imageInfo.getBounds().width() / f2) + imageInfo.getBounds().left) * f, ((imageInfo.getBounds().height() / f2) + imageInfo.getBounds().top) * f);
            canvas.drawBitmap(drawToolFactory.getFixedIconBitmap(), matrix2, paint);
        }
    }

    /* JADX WARN: Type update failed for variable: r27v0 'this'  ??, new type: o0O0oooo.Oooo0o0
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26941. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
     */
    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void Oooo0o(android.graphics.Canvas r28, int r29, int r30, int r31, java.util.List<java.lang.String> r32, android.graphics.RectF r33, android.graphics.RectF r34, float r35, boolean r36, boolean r37, int r38, boolean r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0oooo.C26395Oooo0o0.Oooo0o(android.graphics.Canvas, int, int, int, java.util.List, android.graphics.RectF, android.graphics.RectF, float, boolean, boolean, int, boolean, int):void");
    }

    public final void Oooo0o0(C26120OooO0Oo c26120OooO0Oo, C26121OooO0o0 c26121OooO0o0, InkStrokeInfo inkStrokeInfo, float f, boolean z) {
        HashSet<String> hashSet = this.f90578OooOoo.get(Integer.valueOf(inkStrokeInfo.getItemType()));
        if (!(hashSet != null ? hashSet.contains(inkStrokeInfo.getId()) : false)) {
            inkStrokeInfo.render(c26120OooO0Oo, c26121OooO0o0, f, z);
        } else {
            int iOooO0O0 = inkStrokeInfo.getStroke().f65486OooO00o.OooO0O0();
            inkStrokeInfo.copyWithColorIntArgb(inkStrokeInfo.getId(), (iOooO0O0 & 16777215) | (oO0O00oo.OooOO0.OooO0o(((iOooO0O0 >> 24) & 255) / 2, 1, 255) << 24)).render(c26120OooO0Oo, c26121OooO0o0, f, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0oO(Bitmap dstBitmap, int i, RectF rectF, boolean z) {
        OooO0OO oooO0OO;
        Bitmap bitmap;
        PaperTheme paperTheme;
        Page page;
        OooO0O0 oooO0O0OooO00o;
        float f;
        C26111OooO0oO c26111OooO0oO;
        Rect rect;
        RectF rectF2;
        int i2;
        C32443OooOOO c32443OooOOO;
        C32449OooOOoo c32449OooOOoo;
        C32449OooOOoo c32449OooOOoo2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(dstBitmap, "dstBitmap");
        if (i == -1 || i < 0 || i >= this.f90560OooOO0.size()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o, "NoteInCore", "createRenderContext: invalid pageIndex: ", i), new Object[0]);
            oooO0OO = null;
        } else {
            Page page2 = this.f90560OooOO0.get(i);
            ArrayList arrayListOooOoOO = OooOoOO();
            Page.RotationDirection rotationDirection = page2.getRotationDirection();
            boolean z2 = rotationDirection != Page.RotationDirection.ROTATION_0;
            int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(dstBitmap.getWidth() / rectF.width());
            int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(dstBitmap.getHeight() / rectF.height());
            if (z2) {
                int[] iArr = C26396OooO0Oo.f90599OooO00o;
                int i3 = iArr[rotationDirection.ordinal()];
                if (i3 == 1) {
                    c32449OooOOoo = new C32449OooOOoo(new RectF(rectF.top, 1.0f - rectF.right, rectF.bottom, 1.0f - rectF.left), Integer.valueOf(iOooO0O02), Integer.valueOf(iOooO0O0));
                } else if (i3 == 2) {
                    c32449OooOOoo = new C32449OooOOoo(new RectF(1.0f - rectF.bottom, rectF.left, 1.0f - rectF.top, rectF.right), Integer.valueOf(iOooO0O02), Integer.valueOf(iOooO0O0));
                } else if (i3 == 3) {
                    c32449OooOOoo = new C32449OooOOoo(new RectF(1.0f - rectF.right, 1.0f - rectF.bottom, 1.0f - rectF.left, 1.0f - rectF.top), Integer.valueOf(iOooO0O0), Integer.valueOf(iOooO0O02));
                } else {
                    if (i3 != 4) {
                        throw new C32442OooOO0o();
                    }
                    c32449OooOOoo2 = new C32449OooOOoo(new RectF(rectF), Integer.valueOf(iOooO0O0), Integer.valueOf(iOooO0O02));
                    RectF rectF3 = (RectF) c32449OooOOoo2.f116648OooOo0o;
                    int i4 = iArr[rotationDirection.ordinal()];
                    c32443OooOOO = new C32443OooOOO(rectF3, (i4 != 1 || i4 == 2) ? Bitmap.createBitmap(dstBitmap.getHeight(), dstBitmap.getWidth(), Bitmap.Config.ARGB_8888) : i4 != 3 ? dstBitmap : Bitmap.createBitmap(dstBitmap.getWidth(), dstBitmap.getHeight(), Bitmap.Config.ARGB_8888));
                }
                c32449OooOOoo2 = c32449OooOOoo;
                RectF rectF32 = (RectF) c32449OooOOoo2.f116648OooOo0o;
                int i42 = iArr[rotationDirection.ordinal()];
                if (i42 != 1) {
                    c32443OooOOO = new C32443OooOOO(rectF32, (i42 != 1 || i42 == 2) ? Bitmap.createBitmap(dstBitmap.getHeight(), dstBitmap.getWidth(), Bitmap.Config.ARGB_8888) : i42 != 3 ? dstBitmap : Bitmap.createBitmap(dstBitmap.getWidth(), dstBitmap.getHeight(), Bitmap.Config.ARGB_8888));
                }
            } else {
                c32443OooOOO = new C32443OooOOO(rectF, dstBitmap);
            }
            oooO0OO = new OooO0OO(page2, arrayListOooOoOO, rotationDirection, z2, iOooO0O0, iOooO0O02, (RectF) c32443OooOOO.f116638OooOo0o, (Bitmap) c32443OooOOO.f116637OooOo);
        }
        if (oooO0OO == null) {
            return;
        }
        if (!oooO0OO.f90592OooO0O0.contains(LayerInfo.PAPER_THEME_LAYER_ID)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInCore");
            c20358OooO00o2.OooO0o0("renderPagePaperTheme: LayerInfo.PAPER_THEME_LAYER_ID not in layersToRender", new Object[0]);
            return;
        }
        Page page3 = this.f90560OooOO0.get(i);
        PaperTheme paperTheme2 = page3.getPaperTheme();
        int iOooO0O03 = oO0O00O.OooO00o.OooO0O0(oooO0OO.f90598OooO0oo.getWidth() / oooO0OO.f90597OooO0oO.width());
        int iOooO0O04 = oO0O00O.OooO00o.OooO0O0(oooO0OO.f90598OooO0oo.getHeight() / oooO0OO.f90597OooO0oO.height());
        if (page3.getUnbounded()) {
            bitmap = dstBitmap;
            paperTheme = paperTheme2;
            page = page3;
        } else {
            if (page3.hasValidPagePadding()) {
                C26111OooO0oO c26111OooO0oOOooOoO0 = OooOoO0(i);
                Rect unrotatedPaperPadding = page3.getUnrotatedPaperPadding();
                RectF rectF4 = oooO0OO.f90597OooO0oO;
                float f2 = rectF4.left;
                float f3 = c26111OooO0oOOooOoO0.f89147OooO00o;
                float f4 = rectF4.top;
                float f5 = c26111OooO0oOOooOoO0.f89148OooO0O0;
                RectF rectF5 = new RectF(f2 * f3, f4 * f5, rectF4.right * f3, rectF4.bottom * f5);
                PagePaddingStyle effectivePaddingStyle = page3.getEffectivePaddingStyle();
                Bitmap bitmap2 = oooO0OO.f90598OooO0oo;
                Page page4 = (Page) oOo000Oo.OooOo.OoooO00(i, this.f90560OooOO0);
                if (page4 == null) {
                    c26111OooO0oO = c26111OooO0oOOooOoO0;
                    rectF2 = rectF5;
                    f = 1.0f;
                    rect = unrotatedPaperPadding;
                } else {
                    String id = page4.getId();
                    synchronized (this.f90570OooOo) {
                        OooO0O0 oooO0O0 = (OooO0O0) this.f90576OooOoO0.get(id);
                        if (oooO0O0 != null) {
                            oooO0O0OooO00o = OooO0O0.OooO00o(oooO0O0, new RectF(oooO0O0.f90589OooO00o));
                        } else {
                            C32443OooOOO<RectF, PaperTheme> c32443OooOOOGeneratePaddingRenderRegion = effectivePaddingStyle.generatePaddingRenderRegion(page4);
                            RectF rectF6 = c32443OooOOOGeneratePaddingRenderRegion.f116638OooOo0o;
                            PaperTheme paperTheme3 = c32443OooOOOGeneratePaddingRenderRegion.f116637OooOo;
                            RectF rectF7 = new RectF(rectF6);
                            OooO0O0 oooO0O02 = new OooO0O0(rectF7, paperTheme3);
                            this.f90576OooOoO0.put(id, oooO0O02);
                            oooO0O0OooO00o = OooO0O0.OooO00o(oooO0O02, new RectF(rectF7));
                        }
                    }
                    RectF rectF8 = oooO0O0OooO00o.f90589OooO00o;
                    PaperTheme paperTheme4 = oooO0O0OooO00o.f90590OooO0O0;
                    if (paperTheme4 != null && rectF8.width() > 0.0f && rectF8.height() > 0.0f) {
                        RectF rectF9 = new RectF(rectF8);
                        if (rectF9.intersect(rectF5) && rectF5.width() > 0.0f && rectF5.height() > 0.0f) {
                            Matrix matrix = new Matrix();
                            matrix.postTranslate(-rectF8.left, -rectF8.top);
                            matrix.postScale(1.0f / rectF8.width(), 1.0f / rectF8.height());
                            RectF rectF10 = new RectF(rectF9);
                            matrix.mapRect(rectF10);
                            int iOooO0O05 = oO0O00O.OooO00o.OooO0O0(((rectF9.width() / rectF5.width()) * bitmap2.getWidth()) + 0.5f);
                            f = 1.0f;
                            int iOooO0O06 = oO0O00O.OooO00o.OooO0O0(((rectF9.height() / rectF5.height()) * bitmap2.getHeight()) + 0.5f);
                            if (iOooO0O05 <= 0 || iOooO0O06 <= 0) {
                                c26111OooO0oO = c26111OooO0oOOooOoO0;
                                rect = unrotatedPaperPadding;
                                rectF2 = rectF5;
                            } else {
                                float fWidth = ((rectF9.left - rectF5.left) / rectF5.width()) * bitmap2.getWidth();
                                float fHeight = ((rectF9.top - rectF5.top) / rectF5.height()) * bitmap2.getHeight();
                                float f6 = iOooO0O05 + fWidth;
                                float f7 = iOooO0O06 + fHeight;
                                Canvas canvas = new Canvas(bitmap2);
                                int iSave = canvas.save();
                                try {
                                    canvas.clipRect(fWidth, fHeight, f6, f7);
                                    canvas.translate(-fWidth, -fHeight);
                                    rectF2 = rectF5;
                                    rect = unrotatedPaperPadding;
                                    i2 = iSave;
                                    c26111OooO0oO = c26111OooO0oOOooOoO0;
                                    try {
                                        paperTheme4.renderPaperRegion(canvas, i, z, this.f90556OooO0o, rectF10, iOooO0O05, iOooO0O06, (int) rectF8.width(), (int) rectF8.height(), false);
                                        canvas.restoreToCount(i2);
                                        canvas.setBitmap(null);
                                    } catch (Throwable th) {
                                        th = th;
                                        canvas.restoreToCount(i2);
                                        canvas.setBitmap(null);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i2 = iSave;
                                }
                            }
                        }
                    }
                }
                Bitmap bitmap3 = oooO0OO.f90598OooO0oo;
                int i5 = (c26111OooO0oO.f89147OooO00o - rect.left) - rect.right;
                int i6 = (c26111OooO0oO.f89148OooO0O0 - rect.top) - rect.bottom;
                float f8 = rect.left;
                float f9 = rect.top;
                float f10 = i5;
                float f11 = i6;
                RectF rectF11 = new RectF(f8, f9, f8 + f10, f9 + f11);
                RectF rectF12 = new RectF(rectF11);
                if (rectF12.intersect(rectF2)) {
                    Matrix matrix2 = new Matrix();
                    matrix2.postTranslate(-rectF11.left, -rectF11.top);
                    matrix2.postScale(f / f10, f / f11);
                    RectF rectF13 = new RectF(rectF12);
                    matrix2.mapRect(rectF13);
                    if (rectF12.contains(rectF2)) {
                        Oooo0oo(bitmap3, paperTheme2, i, z, rectF13, bitmap3.getWidth(), bitmap3.getHeight(), false);
                    } else {
                        int iOooO0O07 = oO0O00O.OooO00o.OooO0O0(((rectF12.width() / rectF2.width()) * bitmap3.getWidth()) + 0.5f);
                        int iOooO0O08 = oO0O00O.OooO00o.OooO0O0(((rectF12.height() / rectF2.height()) * bitmap3.getHeight()) + 0.5f);
                        if (iOooO0O07 > 0 && iOooO0O08 > 0) {
                            C26111OooO0oO c26111OooO0oO2 = new C26111OooO0oO(iOooO0O07, iOooO0O08);
                            LruCache<C26111OooO0oO, Bitmap> lruCache = this.f90574OooOo0o;
                            Bitmap bitmapCreateBitmap = lruCache.get(c26111OooO0oO2);
                            if (bitmapCreateBitmap == null) {
                                bitmapCreateBitmap = Bitmap.createBitmap(iOooO0O07, iOooO0O08, Bitmap.Config.ARGB_8888);
                                lruCache.put(c26111OooO0oO2, bitmapCreateBitmap);
                            }
                            Bitmap bitmap4 = bitmapCreateBitmap;
                            Oooo0oo(bitmap4, paperTheme2, i, z, rectF13, i5, i6, false);
                            Canvas canvas2 = new Canvas(bitmap3);
                            canvas2.drawBitmap(bitmap4, ((rectF12.left - rectF2.left) / rectF2.width()) * bitmap3.getWidth(), ((rectF12.top - rectF2.top) / rectF2.height()) * bitmap3.getHeight(), this.f90581OooOooo);
                            canvas2.setBitmap(null);
                        }
                    }
                }
                if (oooO0OO.f90594OooO0Oo) {
                    OooO(oooO0OO.f90598OooO0oo, dstBitmap, oooO0OO.f90593OooO0OO);
                    return;
                }
                return;
            }
            bitmap = dstBitmap;
            page = page3;
            paperTheme = paperTheme2;
        }
        Oooo0oo(oooO0OO.f90598OooO0oo, paperTheme, i, z, oooO0OO.f90597OooO0oO, iOooO0O03, iOooO0O04, page.getUnbounded());
        if (oooO0OO.f90594OooO0Oo) {
            OooO(oooO0OO.f90598OooO0oo, bitmap, oooO0OO.f90593OooO0OO);
        }
    }

    public final void Oooo0oo(Bitmap bitmap, PaperTheme paperTheme, int i, boolean z, RectF rectF, int i2, int i3, boolean z2) {
        PdfDocument pdfDocumentOooO00o;
        PdfDocument pdfDocument;
        PdfDocument pdfDocument2;
        boolean z3 = paperTheme instanceof PdfPaperTheme;
        ConcurrentHashMap<String, PdfDocument> concurrentHashMap = this.f90561OooOO0O;
        if (z3) {
            PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme;
            int pageNum = pdfPaperTheme.getPageNum();
            PdfDocument pdfDocument3 = concurrentHashMap.get(pdfPaperTheme.getPdfInfo().getPdfPath());
            if (pdfDocument3 != null) {
                Rect rectOooOo0o = OooOo0o(rectF, bitmap.getWidth(), bitmap.getHeight());
                this.f90551OooO.renderPageBitmap(pdfDocument3, bitmap, pageNum, rectOooOo0o.left, rectOooOo0o.top, rectOooOo0o.width(), rectOooOo0o.height(), z);
                return;
            }
            return;
        }
        if (paperTheme instanceof TemplateMaterialPaperTheme) {
            String variantPdfPath = ((TemplateMaterialPaperTheme) paperTheme).getVariantPdfPath();
            if (variantPdfPath == null || (pdfDocument2 = concurrentHashMap.get(variantPdfPath)) == null) {
                return;
            }
            Rect rectOooOo0o2 = OooOo0o(rectF, bitmap.getWidth(), bitmap.getHeight());
            this.f90551OooO.renderPageBitmap(pdfDocument2, bitmap, 0, rectOooOo0o2.left, rectOooOo0o2.top, rectOooOo0o2.width(), rectOooOo0o2.height(), z);
            return;
        }
        boolean z4 = paperTheme instanceof PdfSetPaperTheme;
        Context context = this.f90556OooO0o;
        if (z4) {
            PdfSetPaperTheme pdfSetPaperTheme = (PdfSetPaperTheme) paperTheme;
            String path = pdfSetPaperTheme.getPath(context);
            if (path != null) {
                try {
                    pdfDocumentOooO00o = concurrentHashMap.get(path);
                } catch (Throwable th) {
                    pdfDocumentOooO00o = C32446OooOOOo.OooO00o(th);
                }
                Throwable thOooO00o = C32445OooOOOO.OooO00o(pdfDocumentOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteInCore");
                    c20358OooO00o.OooO0OO(C20593OooO0Oo.OooO0O0("NoteInCore.renderPaperTheme err: ", C32435OooO0Oo.OooO0O0(thOooO00o), "."), new Object[0]);
                }
                if (pdfDocumentOooO00o instanceof C32445OooOOOO.OooO00o) {
                    pdfDocumentOooO00o = null;
                }
                pdfDocument = (PdfDocument) pdfDocumentOooO00o;
            } else {
                pdfDocument = null;
            }
            if (pdfDocument != null) {
                Rect rectOooOo0o3 = OooOo0o(rectF, bitmap.getWidth(), bitmap.getHeight());
                this.f90551OooO.renderPageBitmap(pdfDocument, bitmap, 0, rectOooOo0o3.left, rectOooOo0o3.top, rectOooOo0o3.width(), rectOooOo0o3.height(), z);
                return;
            } else {
                Canvas canvas = new Canvas(bitmap);
                pdfSetPaperTheme.renderPaperRegion(canvas, i, z, context, rectF, bitmap.getWidth(), bitmap.getHeight(), i2, i3, z2);
                canvas.setBitmap(null);
                return;
            }
        }
        if (paperTheme instanceof LambdaPaperTheme) {
            Canvas canvas2 = new Canvas(bitmap);
            ((LambdaPaperTheme) paperTheme).renderPaperRegion(canvas2, i, z, context, rectF, bitmap.getWidth(), bitmap.getHeight(), i2, i3, z2);
            canvas2.setBitmap(null);
            return;
        }
        if (paperTheme instanceof LocalResPaperTheme) {
            Canvas canvas3 = new Canvas(bitmap);
            ((LocalResPaperTheme) paperTheme).renderPaperRegion(canvas3, i, z, context, rectF, bitmap.getWidth(), bitmap.getHeight(), i2, i3, z2);
            canvas3.setBitmap(null);
        } else {
            if (paperTheme instanceof LocalUriPaperTheme) {
                Canvas canvas4 = new Canvas(bitmap);
                ((LocalUriPaperTheme) paperTheme).renderPaperRegion(canvas4, i, z, context, rectF, bitmap.getWidth(), bitmap.getHeight(), i2, i3, z2);
                canvas4.setBitmap(null);
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInCore");
            c20358OooO00o2.OooOO0O("renderPaperThemeToBitmap - Unhandled paperTheme type: " + (paperTheme != null ? paperTheme.getClass().getSimpleName() : null) + ", pageIndex: " + i, new Object[0]);
        }
    }

    public final void OoooO(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, Bundle bundle) {
        int i = 0;
        if (interfaceC31284OooO0O0 instanceof ImageInfo) {
            ImageInfo imageInfo = (ImageInfo) interfaceC31284OooO0O0;
            if (imageInfo.getFixed()) {
                return;
            }
            synchronized (this.f90559OooO0oo) {
                try {
                    Collection<List<ImageInfo>> collectionValues = this.f90566OooOOOo.values();
                    kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "<get-values>(...)");
                    Iterator<T> it = collectionValues.iterator();
                    while (it.hasNext()) {
                        List list = (List) it.next();
                        final C26389Oooo000 c26389Oooo000 = new C26389Oooo000(imageInfo, i);
                        list.removeIf(new Predicate() { // from class: o0O0oooo.Oooo00O
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return ((Boolean) c26389Oooo000.invoke(obj)).booleanValue();
                            }
                        });
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f90558OooO0oO.OooOoo0(imageInfo, bundle);
            return;
        }
        if (interfaceC31284OooO0O0 instanceof TextBoxInfo) {
            this.f90558OooO0oO.OooOoo0((TextBoxInfo) interfaceC31284OooO0O0, bundle);
            return;
        }
        if (interfaceC31284OooO0O0 instanceof DualLinkSourceInfo) {
            throw new NotImplementedException("selectDualLinkSource");
        }
        if (interfaceC31284OooO0O0 instanceof DualLinkRefInfo) {
            DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) interfaceC31284OooO0O0;
            InterfaceC31284OooO0O0 item = dualLinkRefInfo.getItem();
            ImageInfo imageInfo2 = item instanceof ImageInfo ? (ImageInfo) item : null;
            if (imageInfo2 != null && imageInfo2.getFixed()) {
                this.f90558OooO0oO.OooOoo0(dualLinkRefInfo, null);
                return;
            }
            synchronized (this.f90559OooO0oo) {
                try {
                    Collection<List<DualLinkRefInfo>> collectionValues2 = this.f90572OooOo00.values();
                    kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues2, "<get-values>(...)");
                    Iterator<T> it2 = collectionValues2.iterator();
                    while (it2.hasNext()) {
                        List list2 = (List) it2.next();
                        final C26367OooOO0o c26367OooOO0o = new C26367OooOO0o(dualLinkRefInfo, i);
                        list2.removeIf(new Predicate() { // from class: o0O0oooo.OooOOO0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return ((Boolean) c26367OooOO0o.invoke(obj)).booleanValue();
                            }
                        });
                    }
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f90558OooO0oO.OooOoo0(dualLinkRefInfo, bundle);
            return;
        }
        if (interfaceC31284OooO0O0 instanceof ShapeInfo) {
            this.f90558OooO0oO.OooOoo0((ShapeInfo) interfaceC31284OooO0O0, bundle);
            return;
        }
        if (!(interfaceC31284OooO0O0 instanceof HyperLinkInfo)) {
            if (interfaceC31284OooO0O0 instanceof QuoteInfo) {
                OoooOO0((QuoteInfo) interfaceC31284OooO0O0, bundle);
                return;
            }
            return;
        }
        HyperLinkInfo hyperLinkInfo = (HyperLinkInfo) interfaceC31284OooO0O0;
        synchronized (this.f90559OooO0oo) {
            try {
                Collection<List<HyperLinkInfo>> collectionValues3 = this.f90571OooOo0.values();
                kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues3, "<get-values>(...)");
                Iterator<T> it3 = collectionValues3.iterator();
                while (it3.hasNext()) {
                    List list3 = (List) it3.next();
                    final C26376OooOo0 c26376OooOo0 = new C26376OooOo0(hyperLinkInfo);
                    list3.removeIf(new Predicate() { // from class: o0O0oooo.OooOooo
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Boolean) c26376OooOo0.invoke(obj)).booleanValue();
                        }
                    });
                }
                C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f90558OooO0oO.OooOoo0(hyperLinkInfo, bundle);
    }

    public final void OoooO0(Canvas canvas, DrawRecord drawRecord, boolean z, Page.RotationDirection rotationDirection, float f) {
        float f2;
        int i = C26396OooO0Oo.f90599OooO00o[rotationDirection.ordinal()];
        if (i == 1) {
            f2 = 270.0f;
        } else if (i == 2) {
            f2 = 90.0f;
        } else if (i == 3) {
            f2 = 180.0f;
        } else {
            if (i != 4) {
                throw new C32442OooOO0o();
            }
            f2 = 0.0f;
        }
        HashSet<String> hashSet = this.f90578OooOoo.get(Integer.valueOf(drawRecord.getItemType()));
        if (hashSet != null ? hashSet.contains(drawRecord.getId()) : false) {
            DrawRecord.copy$default(drawRecord, null, 0, (oO0O00oo.OooOO0.OooO0o(((drawRecord.getColor() >> 24) & 255) / 2, 1, 255) << 24) | (drawRecord.getColor() & 16777215), 0.0f, null, null, null, 0L, false, null, false, 2043, null).drawOnCanvasV2(canvas, f, z, f2);
        } else {
            drawRecord.drawOnCanvasV2(canvas, f, z, f2);
        }
    }

    public final void OoooO00(C26120OooO0Oo c26120OooO0Oo, C26121OooO0o0 c26121OooO0o0, ShapeInfo shapeInfo, Page.RotationDirection rotationDirection, float f) {
        float f2;
        HashSet<String> hashSet = this.f90578OooOoo.get(Integer.valueOf(shapeInfo.getItemType()));
        ShapeInfo shapeInfoDeepCopy = hashSet != null ? hashSet.contains(shapeInfo.getId()) : false ? shapeInfo.deepCopy(shapeInfo.getId(), (oO0O00oo.OooOO0.OooO0o(((shapeInfo.getColor() >> 24) & 255) / 2, 1, 255) << 24) | (shapeInfo.getColor() & 16777215)) : shapeInfo.deepCopy(shapeInfo.getId());
        shapeInfoDeepCopy.scale(f, true);
        int i = C26396OooO0Oo.f90599OooO00o[rotationDirection.ordinal()];
        if (i == 1) {
            f2 = 270.0f;
        } else if (i == 2) {
            f2 = 90.0f;
        } else if (i == 3) {
            f2 = 180.0f;
        } else {
            if (i != 4) {
                throw new C32442OooOO0o();
            }
            f2 = 0.0f;
        }
        shapeInfoDeepCopy.render(c26120OooO0Oo, c26121OooO0o0, f, f2);
    }

    public final void OoooO0O(Canvas canvas, RectF canvasRenderBoundary, TextBoxInfo textBoxInfo, float f) {
        int iOooO0O0;
        int iOooO0O02;
        HashSet<String> hashSet = this.f90578OooOoo.get(Integer.valueOf(textBoxInfo.getItemType()));
        boolean zContains = hashSet != null ? hashSet.contains(textBoxInfo.getId()) : false;
        Paint paint = this.f90581OooOooo;
        int i = 1;
        if (zContains) {
            Paint paint2 = new Paint(paint);
            int alpha = (int) (((double) paint2.getAlpha()) * 0.5d);
            if (alpha < 1) {
                alpha = 1;
            }
            paint2.setAlpha(alpha);
            paint = paint2;
        }
        C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
        c31237OooO0O0.getClass();
        Context context = this.f90556OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvasRenderBoundary, "canvasRenderBoundary");
        RectF unRotatedBoundingBox = textBoxInfo.getUnRotatedBoundingBox();
        RectF boundingBox = textBoxInfo.getBoundingBox(1.0f);
        RectF rectF = new RectF(boundingBox);
        if (rectF.intersect(canvasRenderBoundary)) {
            int iHashCode = textBoxInfo.hashCode();
            LruCache<Integer, Layout> lruCache = c31237OooO0O0.f111408OooO00o;
            Layout layoutOooO0OO = lruCache.get(Integer.valueOf(iHashCode));
            if (lruCache.get(Integer.valueOf(iHashCode)) != null) {
                lruCache.get(Integer.valueOf(iHashCode));
            } else {
                CharSequence charSequenceOooO0Oo = C31237OooO0O0.OooO0Oo(context, textBoxInfo);
                if (charSequenceOooO0Oo == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TextBoxRender");
                    c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unable to get the spannable string from TextBoxInfo. ", textBoxInfo.getText()), new Object[0]);
                    return;
                } else {
                    if (charSequenceOooO0Oo instanceof Spannable) {
                        C31237OooO0O0.OooO00o((Spannable) charSequenceOooO0Oo);
                    }
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTextSize(textBoxInfo.getTextSize());
                    textPaint.setColor(textBoxInfo.getDefaultTextColor());
                    layoutOooO0OO = C31237OooO0O0.OooO0OO(context, charSequenceOooO0Oo, (int) textBoxInfo.getBoxWidth(), textBoxInfo.getLineHeight(), textPaint);
                    lruCache.put(Integer.valueOf(iHashCode), layoutOooO0OO);
                }
            }
            float fWidth = rectF.width() * f;
            Float fValueOf = Float.valueOf(fWidth);
            if (Float.isNaN(fWidth)) {
                fValueOf = null;
            }
            if (fValueOf == null || (iOooO0O0 = oO0O00O.OooO00o.OooO0O0(fValueOf.floatValue())) < 1) {
                iOooO0O0 = 1;
            }
            float fHeight = rectF.height() * f;
            Float fValueOf2 = Float.valueOf(fHeight);
            if (Float.isNaN(fHeight)) {
                fValueOf2 = null;
            }
            if (fValueOf2 != null && (iOooO0O02 = oO0O00O.OooO00o.OooO0O0(fValueOf2.floatValue())) >= 1) {
                i = iOooO0O02;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iOooO0O0, i, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.scale(f, f);
            canvas2.translate(boundingBox.left - rectF.left, boundingBox.top - rectF.top);
            if (!textBoxInfo.getLocalTransform().isIdentity()) {
                float rotationDeg = textBoxInfo.getRotationDeg();
                canvas2.translate((boundingBox.width() - unRotatedBoundingBox.width()) / 2.0f, (boundingBox.height() - unRotatedBoundingBox.height()) / 2.0f);
                canvas2.rotate(rotationDeg, unRotatedBoundingBox.width() / 2.0f, unRotatedBoundingBox.height() / 2.0f);
            }
            canvas2.drawColor(textBoxInfo.getBackgroundColor());
            layoutOooO0OO.draw(canvas2);
            canvas2.setBitmap(null);
            Matrix matrix = new Matrix();
            matrix.postTranslate(rectF.left * f, rectF.top * f);
            canvas.drawBitmap(bitmapCreateBitmap, matrix, paint);
        }
    }

    public final void OoooOO0(QuoteInfo quoteInfo, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
        this.f90558OooO0oO.OooOoo0(quoteInfo, bundle);
    }

    public final void OoooOOO(int i, List<? extends InterfaceC31284OooO0O0> list, List<? extends InterfaceC31284OooO0O0> list2) {
        LinkedHashMap linkedHashMap;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = new ArrayList();
        HashMap<Integer, List<DrawRecord>> map = this.f90564OooOOO0;
        List<DrawRecord> orDefault = map.getOrDefault(numValueOf, arrayList);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault, "getOrDefault(...)");
        List<DrawRecord> list3 = orDefault;
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
        for (Object obj : list3) {
            linkedHashMap2.put(((DrawRecord) obj).getId(), obj);
        }
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(linkedHashMap2);
        Integer numValueOf2 = Integer.valueOf(i);
        ArrayList arrayList2 = new ArrayList();
        HashMap<Integer, List<InkStrokeInfo>> map2 = this.f90563OooOOO;
        List<InkStrokeInfo> orDefault2 = map2.getOrDefault(numValueOf2, arrayList2);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault2, "getOrDefault(...)");
        List<InkStrokeInfo> list4 = orDefault2;
        int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list4, 10));
        if (iOooO0Oo2 < 16) {
            iOooO0Oo2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo2);
        for (Object obj2 : list4) {
            linkedHashMap3.put(((InkStrokeInfo) obj2).getId(), obj2);
        }
        LinkedHashMap linkedHashMapOooOOOO2 = C34444Oooo0O0.OooOOOO(linkedHashMap3);
        Integer numValueOf3 = Integer.valueOf(i);
        ArrayList arrayList3 = new ArrayList();
        HashMap<Integer, List<ShapeInfo>> map3 = this.f90565OooOOOO;
        List<ShapeInfo> orDefault3 = map3.getOrDefault(numValueOf3, arrayList3);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault3, "getOrDefault(...)");
        List<ShapeInfo> list5 = orDefault3;
        int iOooO0Oo3 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list5, 10));
        if (iOooO0Oo3 < 16) {
            iOooO0Oo3 = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iOooO0Oo3);
        for (Object obj3 : list5) {
            linkedHashMap4.put(((ShapeInfo) obj3).getId(), obj3);
        }
        LinkedHashMap linkedHashMapOooOOOO3 = C34444Oooo0O0.OooOOOO(linkedHashMap4);
        Integer numValueOf4 = Integer.valueOf(i);
        ArrayList arrayList4 = new ArrayList();
        HashMap<Integer, List<QuoteInfo>> map4 = this.f90568OooOOo0;
        List<QuoteInfo> orDefault4 = map4.getOrDefault(numValueOf4, arrayList4);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault4, "getOrDefault(...)");
        List<QuoteInfo> list6 = orDefault4;
        int iOooO0Oo4 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list6, 10));
        if (iOooO0Oo4 < 16) {
            iOooO0Oo4 = 16;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(iOooO0Oo4);
        for (Object obj4 : list6) {
            linkedHashMap5.put(((QuoteInfo) obj4).getId(), obj4);
        }
        LinkedHashMap linkedHashMapOooOOOO4 = C34444Oooo0O0.OooOOOO(linkedHashMap5);
        Integer numValueOf5 = Integer.valueOf(i);
        ArrayList arrayList5 = new ArrayList();
        HashMap<Integer, List<ImageInfo>> map5 = this.f90566OooOOOo;
        List<ImageInfo> orDefault5 = map5.getOrDefault(numValueOf5, arrayList5);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault5, "getOrDefault(...)");
        List<ImageInfo> list7 = orDefault5;
        int iOooO0Oo5 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list7, 10));
        if (iOooO0Oo5 < 16) {
            iOooO0Oo5 = 16;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(iOooO0Oo5);
        for (Object obj5 : list7) {
            linkedHashMap6.put(((ImageInfo) obj5).getId(), obj5);
        }
        LinkedHashMap linkedHashMapOooOOOO5 = C34444Oooo0O0.OooOOOO(linkedHashMap6);
        Integer numValueOf6 = Integer.valueOf(i);
        ArrayList arrayList6 = new ArrayList();
        HashMap<Integer, List<TextBoxInfo>> map6 = this.f90567OooOOo;
        List<TextBoxInfo> orDefault6 = map6.getOrDefault(numValueOf6, arrayList6);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault6, "getOrDefault(...)");
        List<TextBoxInfo> list8 = orDefault6;
        int iOooO0Oo6 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list8, 10));
        if (iOooO0Oo6 < 16) {
            iOooO0Oo6 = 16;
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(iOooO0Oo6);
        for (Iterator it = list8.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            linkedHashMap7.put(((TextBoxInfo) next).getId(), next);
        }
        LinkedHashMap linkedHashMapOooOOOO6 = C34444Oooo0O0.OooOOOO(linkedHashMap7);
        Integer numValueOf7 = Integer.valueOf(i);
        ArrayList arrayList7 = new ArrayList();
        HashMap<Integer, List<DualLinkSourceInfo>> map7 = this.f90569OooOOoo;
        List<DualLinkSourceInfo> orDefault7 = map7.getOrDefault(numValueOf7, arrayList7);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault7, "getOrDefault(...)");
        List<DualLinkSourceInfo> list9 = orDefault7;
        int iOooO0Oo7 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list9, 10));
        if (iOooO0Oo7 < 16) {
            iOooO0Oo7 = 16;
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(iOooO0Oo7);
        Iterator it2 = list9.iterator();
        while (it2.hasNext()) {
            Iterator it3 = it2;
            Object next2 = it3.next();
            linkedHashMap8.put(((DualLinkSourceInfo) next2).getId(), next2);
            it2 = it3;
            map7 = map7;
        }
        HashMap<Integer, List<DualLinkSourceInfo>> map8 = map7;
        LinkedHashMap linkedHashMapOooOOOO7 = C34444Oooo0O0.OooOOOO(linkedHashMap8);
        Integer numValueOf8 = Integer.valueOf(i);
        ArrayList arrayList8 = new ArrayList();
        HashMap<Integer, List<DualLinkRefInfo>> map9 = this.f90572OooOo00;
        List<DualLinkRefInfo> orDefault8 = map9.getOrDefault(numValueOf8, arrayList8);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault8, "getOrDefault(...)");
        List<DualLinkRefInfo> list10 = orDefault8;
        int iOooO0Oo8 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list10, 10));
        if (iOooO0Oo8 < 16) {
            iOooO0Oo8 = 16;
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap(iOooO0Oo8);
        Iterator it4 = list10.iterator();
        while (it4.hasNext()) {
            Iterator it5 = it4;
            Object next3 = it5.next();
            linkedHashMap9.put(((DualLinkRefInfo) next3).getId(), next3);
            it4 = it5;
            map9 = map9;
        }
        HashMap<Integer, List<DualLinkRefInfo>> map10 = map9;
        LinkedHashMap linkedHashMapOooOOOO8 = C34444Oooo0O0.OooOOOO(linkedHashMap9);
        Integer numValueOf9 = Integer.valueOf(i);
        ArrayList arrayList9 = new ArrayList();
        HashMap<Integer, List<HyperLinkInfo>> map11 = this.f90571OooOo0;
        List<HyperLinkInfo> orDefault9 = map11.getOrDefault(numValueOf9, arrayList9);
        kotlin.jvm.internal.OooOOO0.OooO0o(orDefault9, "getOrDefault(...)");
        List<HyperLinkInfo> list11 = orDefault9;
        int iOooO0Oo9 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list11, 10));
        LinkedHashMap linkedHashMap10 = new LinkedHashMap(iOooO0Oo9 >= 16 ? iOooO0Oo9 : 16);
        for (Iterator it6 = list11.iterator(); it6.hasNext(); it6 = it6) {
            Object next4 = it6.next();
            linkedHashMap10.put(((HyperLinkInfo) next4).getId(), next4);
        }
        LinkedHashMap linkedHashMapOooOOOO9 = C34444Oooo0O0.OooOOOO(linkedHashMap10);
        Iterator it7 = list2.iterator();
        while (true) {
            Iterator it8 = it7;
            if (!it7.hasNext()) {
                break;
            }
            HashMap<Integer, List<HyperLinkInfo>> map12 = map11;
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) it8.next();
            HashMap<Integer, List<ShapeInfo>> map13 = map3;
            if (interfaceC31284OooO0O0 instanceof DrawRecord) {
                linkedHashMapOooOOOO.remove(((DrawRecord) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof InkStrokeInfo) {
                linkedHashMapOooOOOO2.remove(((InkStrokeInfo) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof ShapeInfo) {
                linkedHashMapOooOOOO3.remove(((ShapeInfo) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof QuoteInfo) {
                linkedHashMapOooOOOO4.remove(((QuoteInfo) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof ImageInfo) {
                linkedHashMapOooOOOO5.remove(((ImageInfo) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof TextBoxInfo) {
                linkedHashMapOooOOOO6.remove(((TextBoxInfo) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof DualLinkSourceInfo) {
                linkedHashMapOooOOOO7.remove(((DualLinkSourceInfo) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof DualLinkRefInfo) {
                linkedHashMapOooOOOO8.remove(((DualLinkRefInfo) interfaceC31284OooO0O0).getId());
            } else if (interfaceC31284OooO0O0 instanceof HyperLinkInfo) {
                linkedHashMapOooOOOO9.remove(((HyperLinkInfo) interfaceC31284OooO0O0).getId());
            } else {
                Log.w("NoteInCore", "updateDisplayItemsByPage " + interfaceC31284OooO0O0.getClass().getSimpleName() + " not add to removeList");
            }
            it7 = it8;
            map3 = map13;
            map11 = map12;
        }
        HashMap<Integer, List<ShapeInfo>> map14 = map3;
        HashMap<Integer, List<HyperLinkInfo>> map15 = map11;
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) it9.next();
            Iterator it10 = it9;
            if (interfaceC31284OooO0O02 instanceof DrawRecord) {
                linkedHashMapOooOOOO.put(((DrawRecord) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
            } else if (interfaceC31284OooO0O02 instanceof InkStrokeInfo) {
                linkedHashMapOooOOOO2.put(((InkStrokeInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
            } else if (interfaceC31284OooO0O02 instanceof ShapeInfo) {
                linkedHashMapOooOOOO3.put(((ShapeInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
            } else if (interfaceC31284OooO0O02 instanceof QuoteInfo) {
                linkedHashMapOooOOOO4.put(((QuoteInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
            } else {
                if (interfaceC31284OooO0O02 instanceof ImageInfo) {
                    if (this.f90580OooOooO) {
                        linkedHashMap = linkedHashMapOooOOOO;
                        ((ImageInfo) interfaceC31284OooO0O02).prepareHardwareBitmap(this.f90557OooO0o0);
                    } else {
                        linkedHashMap = linkedHashMapOooOOOO;
                    }
                    linkedHashMapOooOOOO5.put(((ImageInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
                } else {
                    linkedHashMap = linkedHashMapOooOOOO;
                    if (interfaceC31284OooO0O02 instanceof TextBoxInfo) {
                        linkedHashMapOooOOOO6.put(((TextBoxInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
                    } else if (interfaceC31284OooO0O02 instanceof DualLinkSourceInfo) {
                        linkedHashMapOooOOOO7.put(((DualLinkSourceInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
                    } else if (interfaceC31284OooO0O02 instanceof DualLinkRefInfo) {
                        linkedHashMapOooOOOO8.put(((DualLinkRefInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
                    } else if (interfaceC31284OooO0O02 instanceof HyperLinkInfo) {
                        linkedHashMapOooOOOO9.put(((HyperLinkInfo) interfaceC31284OooO0O02).getId(), interfaceC31284OooO0O02);
                    } else {
                        Log.w("NoteInCore", "updateDisplayItemsByPage " + interfaceC31284OooO0O02.getClass().getSimpleName() + " not add to newList");
                    }
                }
                it9 = it10;
                linkedHashMapOooOOOO = linkedHashMap;
            }
            linkedHashMap = linkedHashMapOooOOOO;
            it9 = it10;
            linkedHashMapOooOOOO = linkedHashMap;
        }
        map.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO.values(), new C26399OooO0oo())));
        map2.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO2.values(), new OooO())));
        map14.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO3.values(), new OooOO0())));
        map4.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO4.values(), new OooOO0O())));
        map5.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO5.values(), new C26400OooOO0o())));
        map6.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO6.values(), new OooOOO0())));
        map8.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO7.values(), new OooOOO())));
        map10.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO8.values(), new OooOOOO())));
        map15.put(Integer.valueOf(i), oOo000Oo.OooOo.o0ooOoO(oOo000Oo.OooOo.o00O0O(linkedHashMapOooOOOO9.values(), new C26401OooOOOo())));
    }

    public final void OoooOOo(int i, DrawResult drawResult, boolean z, String batchId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(batchId, "batchId");
        Page page = this.f90560OooOO0.get(i);
        o0oo000O.OooOO0.f111232OooO00o.getClass();
        DrawResult drawResultOooO0OO = o0oo000O.OooOO0.OooO0OO(page, drawResult);
        synchronized (this.f90559OooO0oo) {
            try {
                if (z) {
                    OoooOOO(i, drawResultOooO0OO.getNewItemList(), drawResultOooO0OO.getRemoveItemList());
                } else if (z) {
                    OoooOOO(i, drawResultOooO0OO.getNewItemList(), C34434OooOoO.f123453OooOo0o);
                } else {
                    OoooOOO(i, C34434OooOoO.f123453OooOo0o, drawResultOooO0OO.getRemoveItemList());
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        List<InterfaceC31284OooO0O0> newItemList = drawResultOooO0OO.getNewItemList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : newItemList) {
            if (obj instanceof TextBoxInfo) {
                arrayList.add(obj);
            }
        }
        List<InterfaceC31284OooO0O0> removeItemList = drawResultOooO0OO.getRemoveItemList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : removeItemList) {
            if (obj2 instanceof TextBoxInfo) {
                arrayList2.add(obj2);
            }
        }
        this.f90558OooO0oO.OooOo0o(page, drawResultOooO0OO, i, batchId);
    }

    public final void o000oOoO(List<LayerInfo> layers) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layers, "layers");
        List<LayerInfo> list = layers;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(LayerInfo.copy$default((LayerInfo) it.next(), null, null, false, false, null, 31, null));
        }
        synchronized (this.f90559OooO0oo) {
            try {
                this.f90562OooOO0o.clear();
                this.f90562OooOO0o.addAll(arrayList);
                ArrayList arrayList2 = this.f90562OooOO0o;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (((LayerInfo) it2.next()).getActivated()) {
                            break;
                        }
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteInCore");
                c20358OooO00o.OooO0OO("onNoActivatedPageLayer. " + this.f90552OooO00o.f101667OooO00o + ", " + this.f90562OooOO0o, new Object[0]);
                this.f90558OooO0oO.OooO0O0(this.f90552OooO00o.f101667OooO00o);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o0O0oooo.Oooo0o0$OooO0oO, reason: case insensitive filesystem */
    public static final class C26398OooO0oO extends LinkedHashMap<String, OooO0O0> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return super.containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof OooO0O0) {
                return super.containsValue((OooO0O0) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof String) {
                return (OooO0O0) super.get((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : (OooO0O0) super.getOrDefault((String) obj, (OooO0O0) obj2);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof String) {
                return (OooO0O0) super.remove((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, OooO0O0> eldest) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(eldest, "eldest");
            return super.size() > 24;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof OooO0O0)) {
                return super.remove((String) obj, (OooO0O0) obj2);
            }
            return false;
        }
    }
}
