package com.orion.notein.p607ui.noteeditor.addimage;

import OooO0Oo.C20398OooO0O0;
import OooO0o.C20424OooO0Oo;
import Oooo0.C20855OooooOO;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.aspose.slides.C22213OooOoOO;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addimage.ImageCropEditor;
import com.orion.notein.p607ui.noteeditor.addimage.ImageSizeAndRotationEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o000oo0.C24672OooOo0;
import o0O0oOO.C26112OooO0oo;
import o0Oo0.C28023OooO00o;
import o0OoO.OooOO0;
import o0oo000O.C31182OooO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0010\u0011\u0012\u0013J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addimage/ImageEditorPanel;", "Landroid/widget/FrameLayout;", "Lcom/orion/notein/ui/noteeditor/addimage/ImageSizeAndRotationEditor$OooO00o;", "", "style", "LoO00ooO/OooOooO;", "setStyle", "(I)V", "Lcom/orion/notein/ui/noteeditor/addimage/ImageEditorPanel$OooO00o;", "OooOo0o", "Lcom/orion/notein/ui/noteeditor/addimage/ImageEditorPanel$OooO00o;", "getImageEventListener", "()Lcom/orion/notein/ui/noteeditor/addimage/ImageEditorPanel$OooO00o;", "setImageEventListener", "(Lcom/orion/notein/ui/noteeditor/addimage/ImageEditorPanel$OooO00o;)V", "imageEventListener", "OooO00o", "OooO0Oo", "OooO0O0", "OooO0OO", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImageEditorPanel extends FrameLayout implements ImageSizeAndRotationEditor.OooO00o {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final int f73715Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final int f73716Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final int f73717Oooo0o0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TextView f73718OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public OooO00o imageEventListener;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ImageCropEditor f73720OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageSizeAndRotationEditor f73721OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Uri f73722OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public List<? extends Uri> f73723OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Bitmap f73724OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Map<Uri, Bitmap> f73725OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Object f73726OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f73727Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public RectF f73728Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final RectF f73729Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f73730Oooo00o;

    public interface OooO00o {
        void OooO(List<OooO0O0> list);

        void OooO0O0();

        void OooO0OO(RectF rectF, float f);

        boolean OooO0Oo();

        void OooO0o();

        void OooO0o0();

        void OooO0oO();

        void OooO0oo(Bitmap bitmap, RectF rectF, float f, Uri uri);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Bitmap f73731OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C23354OooO0Oo f73732OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final RectF f73733OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f73734OooO0Oo;

        public OooO0O0(Bitmap bitmap, C23354OooO0Oo c23354OooO0Oo, RectF bounds, float f) {
            OooOOO0.OooO0oO(bitmap, "bitmap");
            OooOOO0.OooO0oO(bounds, "bounds");
            this.f73731OooO00o = bitmap;
            this.f73732OooO0O0 = c23354OooO0Oo;
            this.f73733OooO0OO = bounds;
            this.f73734OooO0Oo = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f73731OooO00o, oooO0O0.f73731OooO00o) && OooOOO0.OooO0O0(this.f73732OooO0O0, oooO0O0.f73732OooO0O0) && OooOOO0.OooO0O0(this.f73733OooO0OO, oooO0O0.f73733OooO0OO) && Float.compare(this.f73734OooO0Oo, oooO0O0.f73734OooO0Oo) == 0;
        }

        public final int hashCode() {
            int iHashCode = this.f73731OooO00o.hashCode() * 31;
            C23354OooO0Oo c23354OooO0Oo = this.f73732OooO0O0;
            return Float.hashCode(this.f73734OooO0Oo) + C20424OooO0Oo.OooO0OO(this.f73733OooO0OO, (iHashCode + (c23354OooO0Oo == null ? 0 : c23354OooO0Oo.hashCode())) * 31, 31);
        }

        public final String toString() {
            return "ImageOriginInfo(bitmap=" + this.f73731OooO00o + ", source=" + this.f73732OooO0O0 + ", bounds=" + this.f73733OooO0OO + ", rotation=" + this.f73734OooO0Oo + ")";
        }
    }

    public static final class OooO0OO extends Exception {
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23354OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Uri f73735OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f73736OooO0O0;

        public C23354OooO0Oo(Uri uri, String str) {
            this.f73735OooO00o = uri;
            this.f73736OooO0O0 = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23354OooO0Oo)) {
                return false;
            }
            C23354OooO0Oo c23354OooO0Oo = (C23354OooO0Oo) obj;
            return OooOOO0.OooO0O0(this.f73735OooO00o, c23354OooO0Oo.f73735OooO00o) && OooOOO0.OooO0O0(this.f73736OooO0O0, c23354OooO0Oo.f73736OooO0O0);
        }

        public final int hashCode() {
            Uri uri = this.f73735OooO00o;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f73736OooO0O0;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "ImageSource(imageUri=" + this.f73735OooO00o + ", imagePath=" + this.f73736OooO0O0 + ")";
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel$showMultiImagesDirectly$1", m80623f = "ImageEditorPanel.kt", m80624l = {131}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73738OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ ArrayList f73739OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f73740OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ float f73741OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ float f73742OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ArrayList arrayList, ArrayList arrayList2, float f, float f2, Continuation continuation) {
            super(2, continuation);
            this.f73740OooOoO0 = arrayList;
            this.f73739OooOoO = arrayList2;
            this.f73741OooOoOO = f;
            this.f73742OooOoo0 = f2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ImageEditorPanel.this.new OooO0o(this.f73740OooOoO0, this.f73739OooOoO, this.f73741OooOoOO, this.f73742OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            OooO0o oooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73738OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f73738OooOo0o = 1;
                oooO0o = this;
                if (ImageEditorPanel.this.OooOO0(this.f73740OooOoO0, this.f73739OooOoO, this.f73741OooOoOO, this.f73742OooOoo0, oooO0o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                oooO0o = this;
            }
            C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
            ImageEditorPanel imageEditorPanel = ImageEditorPanel.this;
            imageEditorPanel.f73725OooOooO = c34436OooOoOO;
            imageEditorPanel.f73726OooOooo = c34436OooOoOO;
            imageEditorPanel.f73723OooOoo = C34434OooOoO.f123453OooOo0o;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel$OooO0o0, reason: case insensitive filesystem */
    public static final class C23355OooO0o0 implements ImageCropEditor.OooO00o {
        public C23355OooO0o0() {
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageCropEditor.OooO00o
        public final void OooO00o(Bitmap bitmap, RectF rectF) {
            ImageEditorPanel imageEditorPanel = ImageEditorPanel.this;
            rectF.offset(imageEditorPanel.f73729Oooo00O.left + o000000O.OooO0o(10), imageEditorPanel.f73729Oooo00O.top + o000000O.OooO0o(10));
            imageEditorPanel.OooOOO0(bitmap, null, rectF.centerX(), rectF.centerY(), imageEditorPanel.f73730Oooo00o, true, rectF);
        }

        @Override // com.orion.notein.ui.noteeditor.addimage.ImageCropEditor.OooO00o
        public final void onCancel() {
            int i = ImageEditorPanel.f73715Oooo0O0;
            ImageEditorPanel.this.OooOOOO();
        }
    }

    static {
        o000000O.OooO0o(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
        f73715Oooo0O0 = o000000O.OooO0o(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
        f73716Oooo0OO = o000000O.OooO0o(600);
        f73717Oooo0o0 = o000000O.OooO0o(80) + o000000O.OooO0o(40);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f73723OooOoo = C34434OooOoO.f123453OooOo0o;
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        this.f73725OooOooO = c34436OooOoOO;
        this.f73726OooOooo = c34436OooOoOO;
        this.f73729Oooo00O = new RectF();
        View.inflate(context, R.layout.layout_image_insertion_panel, this);
    }

    public static C32443OooOOO OooO0o(int i, Bitmap bitmap) {
        float width = bitmap.getWidth() / bitmap.getHeight();
        return width > 1.0f ? new C32443OooOOO(Integer.valueOf(i), Integer.valueOf((int) (i / width))) : new C32443OooOOO(Integer.valueOf((int) (i * width)), Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO(Bitmap bitmap, C23354OooO0Oo c23354OooO0Oo, RectF rectF, float f, boolean z) throws OooO0OO {
        Uri uri;
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        if (imageSizeAndRotationEditor.getVisibility() == 0) {
            OooO0oO(true);
        }
        if (bitmap.getWidth() > 2560 || bitmap.getHeight() > 2560) {
            if (!z) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ImageEditorPanel");
                c20358OooO00o.OooO0o0(C20855OooooOO.OooO0OO(bitmap.getWidth(), bitmap.getHeight(), "image dimension out of limit: ", "x"), new Object[0]);
                throw new OooO0OO("图片尺寸超限, 最长边不能超过2560");
            }
            bitmap = C31182OooO.OooO0Oo(bitmap);
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.left -= o000000O.OooO0o(10);
        rectF2.top -= o000000O.OooO0o(10);
        rectF2.right += o000000O.OooO0o(10);
        rectF2.bottom += o000000O.OooO0o(10);
        this.f73729Oooo00O.set(rectF2);
        this.f73730Oooo00o = f;
        this.f73724OooOoo0 = bitmap;
        if (c23354OooO0Oo == null || (uri = c23354OooO0Oo.f73735OooO00o) == null) {
            uri = null;
        } else {
            String string = uri.toString();
            OooOOO0.OooO0o(string, "toString(...)");
            if (!C33595OooOOo.OooOOo0(string, ".svg", false)) {
            }
        }
        this.f73722OooOoOO = uri;
        ImageSizeAndRotationEditor imageSizeAndRotationEditor2 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor2 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor2.setScaleHOrScaleVEnable(uri == null);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor3 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor3 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        OooOOO0.OooO0Oo(bitmap);
        Log.i("ImageEditor", "setImageBitmap: " + bitmap.getWidth() + " x " + bitmap.getHeight());
        ImageView imageView = imageSizeAndRotationEditor3.f73765OooOo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setImageBitmap(bitmap);
        if (c23354OooO0Oo != null) {
            imageSizeAndRotationEditor3.f73774Oooo000 = c23354OooO0Oo;
        }
        OooOOOO();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor4 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor4 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor4.setTranslationX(rectF2.left);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor5 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor5 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor5.setTranslationY(rectF2.top);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor6 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor6 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor6.setRotation(f);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor7 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor7 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = imageSizeAndRotationEditor7.getLayoutParams();
        layoutParams.width = (int) rectF2.width();
        layoutParams.height = (int) rectF2.height();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor8 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor8 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor8.setLayoutParams(layoutParams);
        requestLayout();
        TextView textView = this.f73718OooOo;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("txtTip");
            throw null;
        }
    }

    @Override // com.orion.notein.ui.noteeditor.addimage.ImageSizeAndRotationEditor.OooO00o
    public final void OooO00o(float f, float f2) {
        double d = this.f73730Oooo00o + f;
        double dOooO00o = oO0O00O.OooO00o.OooO00o(d / ((double) 45.0f)) * 45.0f;
        if (Math.abs(d - dOooO00o) < 6.0f) {
            d = dOooO00o;
        }
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor.setRotation((float) d);
        RectF rectF = this.f73729Oooo00O;
        float fWidth = ((rectF.width() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        float fHeight = ((rectF.height() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor2 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor2 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = imageSizeAndRotationEditor2.getLayoutParams();
        if (fWidth >= 0.0f || layoutParams.width > o000000O.OooO0o(40)) {
            if (fHeight >= 0.0f || layoutParams.height > o000000O.OooO0o(40)) {
                ImageSizeAndRotationEditor imageSizeAndRotationEditor3 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor3 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float f3 = 2;
                imageSizeAndRotationEditor3.setTranslationX(rectF.left - ((fWidth - rectF.width()) / f3));
                ImageSizeAndRotationEditor imageSizeAndRotationEditor4 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor4 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                imageSizeAndRotationEditor4.setTranslationY(rectF.top - ((fHeight - rectF.height()) / f3));
                layoutParams.width = oO0O00O.OooO00o.OooO0O0(fWidth);
                layoutParams.height = oO0O00O.OooO00o.OooO0O0(fHeight);
                ImageSizeAndRotationEditor imageSizeAndRotationEditor5 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor5 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                imageSizeAndRotationEditor5.setLayoutParams(layoutParams);
                requestLayout();
            }
        }
    }

    @Override // com.orion.notein.ui.noteeditor.addimage.ImageSizeAndRotationEditor.OooO00o
    public final void OooO0O0() {
        OooO00o oooO00o = this.imageEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0O0();
        }
    }

    @Override // com.orion.notein.ui.noteeditor.addimage.ImageSizeAndRotationEditor.OooO00o
    public final void OooO0OO() {
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float left = imageSizeAndRotationEditor.getLeft();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor2 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor2 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float translationX = imageSizeAndRotationEditor2.getTranslationX() + left + o000000O.OooO0o(10);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor3 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor3 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float top = imageSizeAndRotationEditor3.getTop();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor4 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor4 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float translationY = imageSizeAndRotationEditor4.getTranslationY() + top + o000000O.OooO0o(10);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor5 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor5 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float right = imageSizeAndRotationEditor5.getRight();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor6 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor6 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float translationX2 = (imageSizeAndRotationEditor6.getTranslationX() + right) - o000000O.OooO0o(10);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor7 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor7 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float bottom = imageSizeAndRotationEditor7.getBottom();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor8 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor8 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        RectF rectF = new RectF(translationX, translationY, translationX2, (imageSizeAndRotationEditor8.getTranslationY() + bottom) - o000000O.OooO0o(10));
        ImageSizeAndRotationEditor imageSizeAndRotationEditor9 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor9 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float rotation = imageSizeAndRotationEditor9.getRotation();
        OooO00o oooO00o = this.imageEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0OO(rectF, rotation);
        }
    }

    @Override // com.orion.notein.ui.noteeditor.addimage.ImageSizeAndRotationEditor.OooO00o
    public final void OooO0Oo(int i, int i2) {
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = imageSizeAndRotationEditor.getLayoutParams();
        if (i >= 0 || layoutParams.width > o000000O.OooO0o(80)) {
            if (i2 >= 0 || layoutParams.height > o000000O.OooO0o(80)) {
                ImageSizeAndRotationEditor imageSizeAndRotationEditor2 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor2 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                RectF rectF = this.f73729Oooo00O;
                imageSizeAndRotationEditor2.setTranslationX(rectF.left - i);
                layoutParams.width = (int) (rectF.width() + (i * 2));
                ImageSizeAndRotationEditor imageSizeAndRotationEditor3 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor3 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                imageSizeAndRotationEditor3.setTranslationY(rectF.top - i2);
                layoutParams.height = (int) (rectF.height() + (i2 * 2));
                ImageSizeAndRotationEditor imageSizeAndRotationEditor4 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor4 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                imageSizeAndRotationEditor4.setLayoutParams(layoutParams);
                requestLayout();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RectF OooO0o0(Bitmap bitmap, C26112OooO0oo c26112OooO0oo, float f, float f2, int i, int i2) {
        float f3;
        int i3;
        int iMax;
        int i4;
        int iMax2;
        C32443OooOOO c32443OooOOO;
        int iMax3;
        C32443OooOOO c32443OooOOO2;
        float f4;
        float f5;
        int i5 = (int) c26112OooO0oo.f89149OooO00o;
        int i6 = (int) c26112OooO0oo.f89150OooO0O0;
        Object parent = getParent();
        OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((View) parent).getWidth();
        Object parent2 = getParent();
        OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.View");
        int height = ((View) parent2).getHeight();
        OooO00o oooO00o = this.imageEventListener;
        boolean z = oooO00o != null && oooO00o.OooO0Oo();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("ImageEditorPanel");
        StringBuilder sb = new StringBuilder("pageSize: ");
        sb.append(c26112OooO0oo);
        sb.append(", parentWidth: ");
        C24472OooOoo.OooO0O0(sb, ", parentHeight: ", ", isFlipVertical: ", width, height);
        sb.append(z);
        c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
        float f6 = i2 == 1 ? 0.6f : 0.8f;
        if (i2 != 1) {
            if (i2 == 2 || i2 == 4) {
                f4 = i5 * f6;
                f5 = 2;
            } else {
                f4 = i5 * f6;
                f5 = 3;
            }
            f3 = f4 / f5;
        } else {
            f3 = i5 * f6;
        }
        int i7 = (int) f3;
        C32443OooOOO c32443OooOOOOooO0o = OooO0o(i7, bitmap);
        int iIntValue = ((Number) c32443OooOOOOooO0o.f116638OooOo0o).intValue();
        int iIntValue2 = ((Number) c32443OooOOOOooO0o.f116637OooOo).intValue();
        if (z) {
            i3 = 2;
            iMax = (((int) ((1 - f6) * i5)) / 2) + Math.max((width - i5) / 2, 0);
        } else {
            i3 = 2;
            iMax = 0;
        }
        if (z) {
            iMax2 = 0;
            i4 = 0;
        } else {
            i4 = 0;
            iMax2 = Math.max(((int) f) - (i7 / 2), 0);
        }
        int i8 = i7 / 2;
        int iMax4 = Math.max(((int) f2) - i8, i4);
        if (!z) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                    iMax4 = Math.max(iMax4, (height - i6) / 2);
                    break;
                case 4:
                case 5:
                case 6:
                    if (height - iMax4 <= i7 * 1.5f) {
                        iMax4 = i7 * 2;
                    }
                    break;
                default:
                    iMax4 = (((int) ((1 - f6) * i6)) / 2) + Math.max((height - i6) / 2, i4);
                    break;
            }
        }
        if (iMax4 == 0) {
            iMax4 = o000000O.OooO0o(50);
        }
        switch (i) {
            case 0:
                if (i2 != 1) {
                    c32443OooOOO = new C32443OooOOO(Integer.valueOf(iMax + iMax2), Integer.valueOf(iMax4));
                } else {
                    if (f > width) {
                        iMax3 = Math.max(width - i5, 0);
                    } else {
                        int i9 = (int) f;
                        iMax3 = i9 == 0 ? Math.max(o000000O.OooO0o(30) + ((width - i5) / 2), o000000O.OooO0o(30)) : Math.max(i9 - i8, 0);
                    }
                    c32443OooOOO2 = new C32443OooOOO(Integer.valueOf(iMax3), Integer.valueOf(iMax4));
                    c32443OooOOO = c32443OooOOO2;
                }
                break;
            case 1:
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(iMax + i7 + iMax2), Integer.valueOf(iMax4));
                break;
            case 2:
                if (i2 != 4) {
                    c32443OooOOO2 = new C32443OooOOO(Integer.valueOf(C22213OooOoOO.OooO0O0(i7, i3, iMax, iMax2)), Integer.valueOf(iMax4));
                    c32443OooOOO = c32443OooOOO2;
                } else {
                    c32443OooOOO = new C32443OooOOO(Integer.valueOf(iMax + iMax2), Integer.valueOf(iMax4 + i7));
                }
                break;
            case 3:
                c32443OooOOO = i2 != 4 ? new C32443OooOOO(Integer.valueOf(iMax + iMax2), Integer.valueOf(iMax4 + i7)) : new C32443OooOOO(Integer.valueOf(iMax + i7 + iMax2), Integer.valueOf(iMax4 + i7));
                break;
            case 4:
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(iMax + i7 + iMax2), Integer.valueOf(iMax4 + i7));
                break;
            case 5:
                c32443OooOOO2 = new C32443OooOOO(Integer.valueOf(C22213OooOoOO.OooO0O0(i7, 2, iMax, iMax2)), Integer.valueOf(iMax4 + i7));
                c32443OooOOO = c32443OooOOO2;
                break;
            case 6:
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(iMax + iMax2), Integer.valueOf((i7 * 2) + iMax4));
                break;
            case 7:
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(iMax + i7 + iMax2), Integer.valueOf((i7 * 2) + iMax4));
                break;
            case 8:
                int i10 = i7 * 2;
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(iMax + i10 + iMax2), Integer.valueOf(iMax4 + i10));
                break;
            default:
                c32443OooOOO = new C32443OooOOO(0, 0);
                break;
        }
        return new RectF(((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue(), r1 + iIntValue, r0 + iIntValue2);
    }

    public final void OooO0oO(boolean z) {
        OooO00o oooO00o;
        if (z) {
            ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
            if (imageSizeAndRotationEditor == null) {
                OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                throw null;
            }
            if (imageSizeAndRotationEditor.getVisibility() == 0) {
                ImageSizeAndRotationEditor imageSizeAndRotationEditor2 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor2 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float left = imageSizeAndRotationEditor2.getLeft();
                ImageSizeAndRotationEditor imageSizeAndRotationEditor3 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor3 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float translationX = imageSizeAndRotationEditor3.getTranslationX() + left + o000000O.OooO0o(10);
                ImageSizeAndRotationEditor imageSizeAndRotationEditor4 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor4 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float top = imageSizeAndRotationEditor4.getTop();
                ImageSizeAndRotationEditor imageSizeAndRotationEditor5 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor5 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float translationY = imageSizeAndRotationEditor5.getTranslationY() + top + o000000O.OooO0o(10);
                ImageSizeAndRotationEditor imageSizeAndRotationEditor6 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor6 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float right = imageSizeAndRotationEditor6.getRight();
                ImageSizeAndRotationEditor imageSizeAndRotationEditor7 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor7 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float translationX2 = (imageSizeAndRotationEditor7.getTranslationX() + right) - o000000O.OooO0o(10);
                ImageSizeAndRotationEditor imageSizeAndRotationEditor8 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor8 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float bottom = imageSizeAndRotationEditor8.getBottom();
                ImageSizeAndRotationEditor imageSizeAndRotationEditor9 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor9 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                RectF rectF = new RectF(translationX, translationY, translationX2, (imageSizeAndRotationEditor9.getTranslationY() + bottom) - o000000O.OooO0o(10));
                ImageSizeAndRotationEditor imageSizeAndRotationEditor10 = this.f73721OooOoO0;
                if (imageSizeAndRotationEditor10 == null) {
                    OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                    throw null;
                }
                float rotation = imageSizeAndRotationEditor10.getRotation();
                Bitmap bitmap = this.f73724OooOoo0;
                if (bitmap != null && (oooO00o = this.imageEventListener) != null) {
                    oooO00o.OooO0oo(bitmap, rectF, rotation, this.f73722OooOoOO);
                }
            }
        }
        this.f73724OooOoo0 = null;
        this.f73722OooOoOO = null;
        this.f73727Oooo0 = 0;
        ImageSizeAndRotationEditor imageSizeAndRotationEditor11 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor11 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor11.setRotation(0.0f);
        imageSizeAndRotationEditor11.setTranslationX(0.0f);
        imageSizeAndRotationEditor11.setTranslationY(0.0f);
        imageSizeAndRotationEditor11.setVisibility(8);
        imageSizeAndRotationEditor11.f73774Oooo000 = null;
        setVisibility(8);
        TextView textView = this.f73718OooOo;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("txtTip");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C32460OooOooO OooO0oo(ArrayList arrayList, boolean z) {
        int i;
        Bitmap bitmapOooO0O0;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            Bitmap bitmap = null;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C32443OooOOO c32443OooOOO = (C32443OooOOO) it.next();
            Uri uri = (Uri) c32443OooOOO.f116638OooOo0o;
            float fFloatValue = ((Number) c32443OooOOO.f116637OooOo).floatValue();
            String string = uri.toString();
            OooOOO0.OooO0o(string, "toString(...)");
            if (C33595OooOOo.OooOOo0(string, ".svg", false)) {
                Context context = getContext();
                OooOOO0.OooO0o(context, "getContext(...)");
                bitmapOooO0O0 = C28023OooO00o.OooO00o(context, uri, 500, (int) (500 / fFloatValue), Bitmap.Config.ARGB_8888);
            } else {
                int iOooO00o = C31182OooO.OooO00o(getContext(), uri);
                C24672OooOo0 c24672OooOo0 = new C24672OooOo0(this, 1);
                bitmapOooO0O0 = iOooO00o != 0 ? C31182OooO.OooO0O0(iOooO00o, (Bitmap) c24672OooOo0.invoke(uri)) : (Bitmap) c24672OooOo0.invoke(uri);
                if (bitmapOooO0O0 == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ImageEditorPanel");
                    c20358OooO00o.OooOO0O("setImageUris: getBitmapFromUri failed: " + uri, new Object[0]);
                    arrayList2.add(bitmap);
                } else if (bitmapOooO0O0.getWidth() > 2560 || bitmapOooO0O0.getHeight() > 2560) {
                    if (z) {
                        bitmapOooO0O0 = C31182OooO.OooO0Oo(bitmapOooO0O0);
                    } else {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("ImageEditorPanel");
                        c20358OooO00o2.OooOO0O(C20855OooooOO.OooO0OO(bitmapOooO0O0.getWidth(), bitmapOooO0O0.getHeight(), "image dimension out of limit: ", "x"), new Object[0]);
                    }
                }
            }
            bitmap = bitmapOooO0O0;
            arrayList2.add(bitmap);
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            Uri uri2 = (Uri) ((C32443OooOOO) obj).f116638OooOo0o;
            Bitmap bitmap2 = (Bitmap) arrayList2.get(i);
            arrayList3.add(bitmap2 == null ? null : new C32443OooOOO(uri2, bitmap2));
            i = i2;
        }
        Map<Uri, Bitmap> mapOooOO0o = C34444Oooo0O0.OooOO0o(OooOo.Oooo0o0(arrayList3));
        this.f73725OooOooO = mapOooOO0o;
        List<? extends Uri> listO0ooOO0 = OooOo.o0ooOO0(mapOooOO0o.keySet());
        this.f73723OooOoo = listO0ooOO0;
        List<? extends Uri> list = listO0ooOO0;
        int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (Object obj2 : list) {
            linkedHashMap.put(obj2, new C23354OooO0Oo((Uri) obj2, null));
        }
        this.f73726OooOooo = linkedHashMap;
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object OooOO0(ArrayList arrayList, ArrayList arrayList2, float f, float f2, AbstractC32476OooO abstractC32476OooO) {
        C26112OooO0oo c26112OooO0oo;
        String str;
        RectF rectF;
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("bitmapList.size != source.size");
        }
        Object parent = getParent();
        String str2 = "null cannot be cast to non-null type android.view.View";
        OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
        PDFView pDFView = (PDFView) ((View) parent).findViewById(R.id.expr_editor);
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        boolean z = false;
        C26112OooO0oo c26112OooO0ooOooOo0o = pDFView.getZoom() < 1.0f ? abstractC22830OooO0Oo.OooOo0o(0, pDFView.getZoom()) : abstractC22830OooO0Oo.OooOOo0(0);
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            Bitmap bitmap = (Bitmap) obj;
            if (this.f73727Oooo0 == 0) {
                OooOOO0.OooO0Oo(c26112OooO0ooOooOo0o);
                rectF = OooO0o0(bitmap, c26112OooO0ooOooOo0o, f, f2, i, arrayList.size());
                c26112OooO0oo = c26112OooO0ooOooOo0o;
                str = str2;
            } else {
                OooOOO0.OooO0Oo(c26112OooO0ooOooOo0o);
                int i3 = (int) c26112OooO0ooOooOo0o.f89149OooO00o;
                int i4 = (int) c26112OooO0ooOooOo0o.f89150OooO0O0;
                Object parent2 = getParent();
                OooOOO0.OooO0o0(parent2, str2);
                int width = ((View) parent2).getWidth();
                Object parent3 = getParent();
                OooOOO0.OooO0o0(parent3, str2);
                int height = ((View) parent3).getHeight();
                OooO00o oooO00o = this.imageEventListener;
                boolean z2 = (oooO00o == null || !oooO00o.OooO0Oo()) ? z : true;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c26112OooO0oo = c26112OooO0ooOooOo0o;
                str = str2;
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("pageWidth: ", i3, ", pageHeight: ", ", parentWidth: ", i4);
                C24472OooOoo.OooO0O0(sbOooO0O0, ", parentHeight: ", ", isFlipVertical: ", width, height);
                sbOooO0O0.append(z2);
                c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
                C32443OooOOO c32443OooOOOOooO0o = OooO0o(300, bitmap);
                int iIntValue = ((Number) c32443OooOOOOooO0o.f116638OooOo0o).intValue();
                int iIntValue2 = ((Number) c32443OooOOOOooO0o.f116637OooOo).intValue();
                int iMax = z2 ? Math.max(o000000O.OooO0o(30) + ((width - i3) / 2), o000000O.OooO0o(30)) : Math.max(o000000O.OooO0o(30) + ((width - i3) / 2), o000000O.OooO0o(30));
                int iOooO0o = o000000O.OooO0o(50);
                int iOooO0o2 = ((width < i3 || !z2) ? width - (o000000O.OooO0o(30) * 2) : i3 - (o000000O.OooO0o(30) * 2)) / 300;
                if (iOooO0o2 < 1) {
                    iOooO0o2 = 1;
                }
                int i5 = i / iOooO0o2;
                rectF = new RectF(((i % iOooO0o2) * 300) + iMax, (i5 * 300) + iOooO0o, r3 + iIntValue, r6 + iIntValue2);
            }
            arrayList3.add(new OooO0O0(bitmap, (C23354OooO0Oo) OooOo.OoooO00(i, arrayList2), rectF, 0.0f));
            i = i2;
            c26112OooO0ooOooOo0o = c26112OooO0oo;
            str2 = str;
            z = false;
        }
        Object objOooOO0O = OooOO0O(arrayList3, z, abstractC32476OooO);
        return objOooOO0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0O : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007d -> B:25:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0087 -> B:26:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(List list, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0 oooOO02;
        ImageEditorPanel imageEditorPanel;
        Iterator it;
        boolean z2;
        List list2;
        int i;
        List list3;
        ImageEditorPanel imageEditorPanel2;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i2 = oooOO02.f101061Oooo000;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOO02.f101061Oooo000 = i2 - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOO02.f101059OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooOO02.f101061Oooo000;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            imageEditorPanel = this;
            it = list.iterator();
            z2 = z;
            list2 = list;
            i = 0;
            if (!it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = oooOO02.f101057OooOoo;
            int i4 = oooOO02.f101058OooOoo0;
            boolean z3 = oooOO02.f101056OooOoOO;
            OooO0O0 oooO0O0 = oooOO02.f101054OooOoO;
            it = oooOO02.f101055OooOoO0;
            List list4 = oooOO02.f101052OooOo;
            imageEditorPanel = oooOO02.f101053OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            try {
                boolean z4 = z3;
                OooO0O0 oooO0O02 = oooO0O0;
                list3 = list4;
                imageEditorPanel2.OooO(oooO0O02.f73731OooO00o, oooO0O02.f73732OooO0O0, oooO0O02.f73733OooO0OO, oooO0O02.f73734OooO0Oo, z4);
                i = i4;
                list2 = list3;
                imageEditorPanel = imageEditorPanel2;
                z2 = z4;
                it = it;
                if (!it.hasNext()) {
                    Object next = it.next();
                    int i5 = i + 1;
                    if (i < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    oooO0O02 = (OooO0O0) next;
                    if (i > 0) {
                        oooOO02.f101053OooOo0o = imageEditorPanel;
                        oooOO02.f101052OooOo = list2;
                        oooOO02.f101055OooOoO0 = it;
                        oooOO02.f101054OooOoO = oooO0O02;
                        oooOO02.f101056OooOoOO = z2;
                        oooOO02.f101058OooOoo0 = i5;
                        oooOO02.f101057OooOoo = i;
                        oooOO02.f101061Oooo000 = 1;
                        if (C33644OoooO0.OooO00o(60L, oooOO02) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        list4 = list2;
                        i4 = i5;
                        oooO0O0 = oooO0O02;
                        z3 = z2;
                        boolean z42 = z3;
                        OooO0O0 oooO0O022 = oooO0O0;
                        list3 = list4;
                        Iterator it2 = it;
                        imageEditorPanel2 = imageEditorPanel;
                        imageEditorPanel2.OooO(oooO0O022.f73731OooO00o, oooO0O022.f73732OooO0O0, oooO0O022.f73733OooO0OO, oooO0O022.f73734OooO0Oo, z42);
                        i = i4;
                        list2 = list3;
                        imageEditorPanel = imageEditorPanel2;
                        z2 = z42;
                        it = it2;
                        if (!it.hasNext()) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        z42 = z2;
                        list3 = list2;
                        i4 = i5;
                        Iterator it22 = it;
                        imageEditorPanel2 = imageEditorPanel;
                        imageEditorPanel2.OooO(oooO0O022.f73731OooO00o, oooO0O022.f73732OooO0O0, oooO0O022.f73733OooO0OO, oooO0O022.f73734OooO0Oo, z42);
                        i = i4;
                        list2 = list3;
                        imageEditorPanel = imageEditorPanel2;
                        z2 = z42;
                        it = it22;
                        if (!it.hasNext()) {
                        }
                    }
                }
            } catch (OooO0OO unused) {
                List<OooO0O0> listSubList = list3.subList(i, list3.size());
                imageEditorPanel2.OooO0oO(true);
                OooO00o oooO00o = imageEditorPanel2.imageEventListener;
                if (oooO00o != null) {
                    oooO00o.OooO(listSubList);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator it222 = it;
            imageEditorPanel2 = imageEditorPanel;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public final void OooOO0o(float f, float f2) {
        if (this.f73723OooOoo.isEmpty()) {
            return;
        }
        List<? extends Uri> list = this.f73723OooOoo;
        this.f73723OooOoo = C34434OooOoO.f123453OooOo0o;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            C32443OooOOO c32443OooOOO = null;
            if (!it.hasNext()) {
                break;
            }
            Uri uri = (Uri) it.next();
            Bitmap bitmap = this.f73725OooOooO.get(uri);
            C23354OooO0Oo c23354OooO0Oo = (C23354OooO0Oo) this.f73726OooOooo.get(uri);
            if (bitmap != null && c23354OooO0Oo != null) {
                c32443OooOOO = new C32443OooOOO(bitmap, c23354OooO0Oo);
            }
            if (c32443OooOOO != null) {
                arrayList.add(c32443OooOOO);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((Bitmap) ((C32443OooOOO) it2.next()).f116638OooOo0o);
        }
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add((C23354OooO0Oo) ((C32443OooOOO) it3.next()).f116637OooOo);
        }
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new OooO0o(arrayList2, arrayList3, f, f2, null), 3);
    }

    public final void OooOOO(Bitmap bitmap, C23354OooO0Oo c23354OooO0Oo, RectF bounds, float f, boolean z) {
        OooOOO0.OooO0oO(bitmap, "bitmap");
        OooOOO0.OooO0oO(bounds, "bounds");
        try {
            OooO(bitmap, c23354OooO0Oo, bounds, f, z);
        } catch (OooO0OO unused) {
            OooO0oO(true);
            OooO0O0 oooO0O0 = new OooO0O0(bitmap, c23354OooO0Oo, bounds, f);
            OooO00o oooO00o = this.imageEventListener;
            if (oooO00o != null) {
                oooO00o.OooO(com.facebook.soloader.OooOo.OooO0oO(oooO0O0));
            }
        }
    }

    public final void OooOOO0(Bitmap bitmap, C23354OooO0Oo c23354OooO0Oo, float f, float f2, float f3, boolean z, RectF rectF) {
        C23354OooO0Oo c23354OooO0Oo2;
        Bitmap bitmap2;
        RectF rectF2;
        ImageEditorPanel imageEditorPanel;
        Object parent = getParent();
        OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
        PDFView pDFView = (PDFView) ((View) parent).findViewById(R.id.expr_editor);
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return;
        }
        C26112OooO0oo c26112OooO0ooOooOo0o = pDFView.getZoom() < 1.0f ? abstractC22830OooO0Oo.OooOo0o(0, pDFView.getZoom()) : abstractC22830OooO0Oo.OooOOo0(0);
        if (rectF == null) {
            OooOOO0.OooO0Oo(c26112OooO0ooOooOo0o);
            RectF rectFOooO0o0 = OooO0o0(bitmap, c26112OooO0ooOooOo0o, f, f2, 0, 1);
            c23354OooO0Oo2 = c23354OooO0Oo;
            bitmap2 = bitmap;
            imageEditorPanel = this;
            rectF2 = rectFOooO0o0;
        } else {
            c23354OooO0Oo2 = c23354OooO0Oo;
            bitmap2 = bitmap;
            rectF2 = rectF;
            imageEditorPanel = this;
        }
        imageEditorPanel.OooOOO(bitmap2, c23354OooO0Oo2, rectF2, f3, z);
    }

    public final void OooOOOO() {
        setVisibility(0);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor.setVisibility(0);
        ImageCropEditor imageCropEditor = this.f73720OooOoO;
        if (imageCropEditor == null) {
            OooOOO0.OooOOOO("imageCropEditor");
            throw null;
        }
        imageCropEditor.setVisibility(8);
        requestFocus();
    }

    public final OooO00o getImageEventListener() {
        return this.imageEventListener;
    }

    @Override // com.orion.notein.ui.noteeditor.addimage.ImageSizeAndRotationEditor.OooO00o
    public final void onCancel() {
        OooO00o oooO00o = this.imageEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0oO();
        }
        OooO0oO(false);
    }

    @Override // com.orion.notein.ui.noteeditor.addimage.ImageSizeAndRotationEditor.OooO00o
    public final void onFinish() {
        RectF rectF = this.f73729Oooo00O;
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float translationX = imageSizeAndRotationEditor.getTranslationX();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor2 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor2 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float translationY = imageSizeAndRotationEditor2.getTranslationY();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor3 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor3 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float translationX2 = imageSizeAndRotationEditor3.getTranslationX();
        if (this.f73721OooOoO0 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float width = translationX2 + r6.getWidth();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor4 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor4 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        float translationY2 = imageSizeAndRotationEditor4.getTranslationY();
        if (this.f73721OooOoO0 == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        rectF.set(translationX, translationY, width, translationY2 + r7.getHeight());
        ImageSizeAndRotationEditor imageSizeAndRotationEditor5 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor5 != null) {
            this.f73730Oooo00o = imageSizeAndRotationEditor5.getRotation();
        } else {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = (ImageSizeAndRotationEditor) findViewById(R.id.img_editor);
        this.f73721OooOoO0 = imageSizeAndRotationEditor;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        imageSizeAndRotationEditor.setEventListener(this);
        ImageCropEditor imageCropEditor = (ImageCropEditor) findViewById(R.id.img_crop_editor);
        this.f73720OooOoO = imageCropEditor;
        if (imageCropEditor == null) {
            OooOOO0.OooOOOO("imageCropEditor");
            throw null;
        }
        imageCropEditor.setEventListener(new C23355OooO0o0());
        this.f73718OooOo = (TextView) findViewById(R.id.txt_tip);
    }

    @Override // com.orion.notein.ui.noteeditor.addimage.ImageSizeAndRotationEditor.OooO00o
    public final void onMove(int i, int i2) {
        ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor == null) {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
        RectF rectF = this.f73729Oooo00O;
        imageSizeAndRotationEditor.setTranslationX(rectF.left + i);
        ImageSizeAndRotationEditor imageSizeAndRotationEditor2 = this.f73721OooOoO0;
        if (imageSizeAndRotationEditor2 != null) {
            imageSizeAndRotationEditor2.setTranslationY(rectF.top + i2);
        } else {
            OooOOO0.OooOOOO("imageSizeAndRotationEditor");
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        if (event.getActionMasked() == 0) {
            ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f73721OooOoO0;
            if (imageSizeAndRotationEditor == null) {
                OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                throw null;
            }
            if (imageSizeAndRotationEditor.getVisibility() == 0) {
                RectF rectF = this.f73728Oooo000;
                if (rectF != null && rectF.contains(event.getX(), event.getY())) {
                    return false;
                }
                OooO0oO(true);
            } else {
                OooOO0o(event.getX(), event.getY());
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        OooOOO0.OooO0oO(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (changedView.equals(this)) {
            if (i == 0) {
                OooO00o oooO00o = this.imageEventListener;
                if (oooO00o != null) {
                    oooO00o.OooO0o0();
                    return;
                }
                return;
            }
            OooO00o oooO00o2 = this.imageEventListener;
            if (oooO00o2 != null) {
                oooO00o2.OooO0o();
            }
        }
    }

    public final void setImageEventListener(OooO00o oooO00o) {
        this.imageEventListener = oooO00o;
    }

    public final void setStyle(int style) {
        this.f73727Oooo0 = style;
    }
}
