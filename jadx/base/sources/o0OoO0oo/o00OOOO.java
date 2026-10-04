package o0OoO0oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.aspose.slides.C22212OooOoO0;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView;
import com.orion.notein.p607ui.noteeditor.addimage.ImageCropEditor;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import com.orion.notein.p607ui.noteeditor.addimage.ImageSizeAndRotationEditor;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.ImageInfo;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o00o00.C25206OooO0Oo;
import o0O0o0oO.C26029OooOoO;
import o0OOo0o.AbstractC27507o00OoooO;
import o0OOo0o.C27510o00Ooooo;
import o0OOo0o.C27515o00o0000;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class o00OOOO implements C26029OooOoO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102266OooO00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$7$onMoveToNextLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {3912}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102267OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102268OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ImageInfo f102269OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, ImageInfo imageInfo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102267OooOo = noteEditorFragment;
            this.f102269OooOoO0 = imageInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102267OooOo, this.f102269OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102268OooOo0o;
            NoteEditorFragment noteEditorFragment = this.f102267OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f102268OooOo0o = 1;
                obj = NoteEditorFragment.Oooo000(27, noteEditorFragment, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                PageLayer pageLayerOooOO0o = noteEditorFragment.o000oOoO().OooOO0o(com.facebook.soloader.OooOo.OooO0oO(this.f102269OooOoO0));
                if (pageLayerOooOO0o == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                noteEditorFragment.OoooO0().Oooo0o0(true);
                NoteEditorFragment.Oooo0(noteEditorFragment, pageLayerOooOO0o.getId());
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$7$onMoveToPreviousLayer$1", m80623f = "NoteEditorFragment.kt", m80624l = {3926}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102270OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102271OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ImageInfo f102272OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteEditorFragment noteEditorFragment, ImageInfo imageInfo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f102270OooOo = noteEditorFragment;
            this.f102272OooOoO0 = imageInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f102270OooOo, this.f102272OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102271OooOo0o;
            NoteEditorFragment noteEditorFragment = this.f102270OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f102271OooOo0o = 1;
                obj = NoteEditorFragment.Oooo000(27, noteEditorFragment, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                PageLayer pageLayerOooOOO0 = noteEditorFragment.o000oOoO().OooOOO0(com.facebook.soloader.OooOo.OooO0oO(this.f102272OooOoO0));
                if (pageLayerOooOOO0 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                noteEditorFragment.OoooO0().Oooo0o0(true);
                NoteEditorFragment.Oooo0(noteEditorFragment, pageLayerOooOOO0.getId());
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$7$onSaveToLocal$1", m80623f = "NoteEditorFragment.kt", m80624l = {3940}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102273OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102274OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ImageInfo f102275OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(NoteEditorFragment noteEditorFragment, ImageInfo imageInfo, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f102273OooOo = noteEditorFragment;
            this.f102275OooOoO0 = imageInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f102273OooOo, this.f102275OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102274OooOo0o;
            NoteEditorFragment noteEditorFragment = this.f102273OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                this.f102274OooOo0o = 1;
                C27515o00o0000 c27515o00o0000 = c23344OooOOoOoooOO0.f73566OooOoO0;
                c27515o00o0000.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27510o00Ooooo(this.f102275OooOoO0, c27515o00o0000, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            AbstractC27507o00OoooO abstractC27507o00OoooO = (AbstractC27507o00OoooO) obj;
            if (abstractC27507o00OoooO instanceof AbstractC27507o00OoooO.C27509OooO0o0) {
                Context context = noteEditorFragment.getContext();
                if (context != null) {
                    String string = noteEditorFragment.getString(R.string.image_saved_to_gallery);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC27507o00OoooO, AbstractC27507o00OoooO.OooO00o.f96403OooO00o)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooOO0O("Save failed: bitmap is null", new Object[0]);
                Context context2 = noteEditorFragment.getContext();
                if (context2 != null) {
                    String string2 = noteEditorFragment.getString(R.string.image_save_failed);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context2, string2);
                }
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC27507o00OoooO, AbstractC27507o00OoooO.C27508OooO0Oo.f96406OooO00o)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteEditorFragment");
                c20358OooO00o2.OooOO0O("Save failed: permission denied", new Object[0]);
                Context context3 = noteEditorFragment.getContext();
                if (context3 != null) {
                    String string3 = noteEditorFragment.getString(R.string.permission_required_storage);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context3, string3);
                }
            } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC27507o00OoooO, AbstractC27507o00OoooO.OooO0OO.f96405OooO00o)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("NoteEditorFragment");
                c20358OooO00o3.OooO0OO("Save failed: IO error", new Object[0]);
                Context context4 = noteEditorFragment.getContext();
                if (context4 != null) {
                    String string4 = noteEditorFragment.getString(R.string.image_save_failed);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context4, string4);
                }
            } else if (abstractC27507o00OoooO instanceof AbstractC27507o00OoooO.OooO0o) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("NoteEditorFragment");
                c20358OooO00o4.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Save failed: ", ((AbstractC27507o00OoooO.OooO0o) abstractC27507o00OoooO).f96407OooO00o), new Object[0]);
                Context context5 = noteEditorFragment.getContext();
                if (context5 != null) {
                    String string5 = noteEditorFragment.getString(R.string.image_save_failed);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string5, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context5, string5);
                }
            } else {
                if (!(abstractC27507o00OoooO instanceof AbstractC27507o00OoooO.OooO0O0)) {
                    throw new C32442OooOO0o();
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("NoteEditorFragment");
                c20358OooO00o5.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Save failed: ", ((AbstractC27507o00OoooO.OooO0O0) abstractC27507o00OoooO).f96404OooO00o), new Object[0]);
                Context context6 = noteEditorFragment.getContext();
                if (context6 != null) {
                    String string6 = noteEditorFragment.getString(R.string.image_save_failed);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string6, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context6, string6);
                }
            }
            ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
            if (imageEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            imageEditorPanel.OooO0oO(true);
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOoO();
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    public o00OOOO(NoteEditorFragment noteEditorFragment) {
        this.f102266OooO00o = noteEditorFragment;
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO(ImageInfo imageInfo) {
        if (imageInfo == null) {
            return;
        }
        NoteEditorFragment noteEditorFragment = this.f102266OooO00o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO0OO(noteEditorFragment, imageInfo, null), 3);
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO00o(View v, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        ImageEditorPanel imageEditorPanel = this.f102266OooO00o.f73023OoooOoo;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        if (z) {
            imageEditorPanel.f73728Oooo000 = new RectF(v.getX(), v.getY(), v.getX() + v.getWidth(), v.getY() + v.getHeight());
        } else {
            imageEditorPanel.f73728Oooo000 = null;
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0O0(ImageInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        NoteEditorFragment noteEditorFragment = this.f102266OooO00o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO0O0(noteEditorFragment, info, null), 3);
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0OO(ImageInfo imageInfo) {
        NoteEditorFragment noteEditorFragment = this.f102266OooO00o;
        ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        imageEditorPanel.OooO0oO(false);
        ArrayList arrayListOooOoO = oOo000Oo.OooOOO.OooOoO(new Object[]{(ImageInfo) noteEditorFragment.OoooOO0().f73577Oooo0O0.getValue(), (DualLinkRefInfo) noteEditorFragment.OoooOO0().f73573Oooo0.getValue()});
        noteEditorFragment.OoooOO0().f73577Oooo0O0.setValue(null);
        noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView != null) {
            pDFView.OooOO0O(arrayListOooOoO, C34434OooOoO.f123453OooOo0o, noteEditorFragment.f73063oo000o);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0Oo(ImageInfo imageInfo, int i) {
        ImageEditorPanel imageEditorPanel = this.f102266OooO00o.f73023OoooOoo;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        Bitmap bitmap = imageEditorPanel.f73724OooOoo0;
        if (bitmap != null) {
            int iMin = Math.min(Math.max(ImageEditorPanel.f73715Oooo0O0, (int) (imageEditorPanel.getResources().getDisplayMetrics().widthPixels * 0.5f)), ImageEditorPanel.f73716Oooo0OO) - ImageEditorPanel.f73717Oooo0o0;
            float width = bitmap.getWidth() / bitmap.getHeight();
            C32443OooOOO c32443OooOOO = width > 1.0f ? new C32443OooOOO(Integer.valueOf(iMin), Integer.valueOf((int) (iMin / width))) : new C32443OooOOO(Integer.valueOf((int) (width * iMin)), Integer.valueOf(iMin));
            int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
            int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
            ImageCropEditor imageCropEditor = imageEditorPanel.f73720OooOoO;
            if (imageCropEditor == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageCropEditor");
                throw null;
            }
            imageCropEditor.setCropType(i);
            RectF rectF = new RectF(imageEditorPanel.f73729Oooo00O);
            rectF.left += Oooo0.o000000O.OooO0o(10);
            rectF.top += Oooo0.o000000O.OooO0o(10);
            rectF.right -= Oooo0.o000000O.OooO0o(10);
            rectF.bottom -= Oooo0.o000000O.OooO0o(10);
            ImageCropEditor imageCropEditor2 = imageEditorPanel.f73720OooOoO;
            if (imageCropEditor2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageCropEditor");
                throw null;
            }
            imageCropEditor2.f73700OooOoo0 = bitmap;
            RectF rectF2 = imageCropEditor2.f73699OooOoo;
            rectF2.set(rectF);
            AbstractImageCropView abstractImageCropView = imageCropEditor2.f73697OooOoO0;
            if (abstractImageCropView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("cropView");
                throw null;
            }
            abstractImageCropView.OooO00o(bitmap, rectF2, iIntValue, iIntValue2);
            AbstractImageCropView abstractImageCropView2 = imageCropEditor2.f73697OooOoO0;
            if (abstractImageCropView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("cropView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = abstractImageCropView2.getLayoutParams();
            layoutParams.width = Oooo0.o000000O.OooO0o(8) + iIntValue;
            layoutParams.height = Oooo0.o000000O.OooO0o(8) + iIntValue2;
            AbstractImageCropView abstractImageCropView3 = imageCropEditor2.f73697OooOoO0;
            if (abstractImageCropView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("cropView");
                throw null;
            }
            abstractImageCropView3.setLayoutParams(layoutParams);
            imageCropEditor2.requestLayout();
            imageEditorPanel.setVisibility(0);
            ImageSizeAndRotationEditor imageSizeAndRotationEditor = imageEditorPanel.f73721OooOoO0;
            if (imageSizeAndRotationEditor == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageSizeAndRotationEditor");
                throw null;
            }
            imageSizeAndRotationEditor.setVisibility(8);
            if (imageEditorPanel.f73724OooOoo0 != null) {
                ImageCropEditor imageCropEditor3 = imageEditorPanel.f73720OooOoO;
                if (imageCropEditor3 != null) {
                    imageCropEditor3.setVisibility(0);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("imageCropEditor");
                    throw null;
                }
            }
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0o(ImageInfo imageInfo) {
        if (imageInfo == null) {
            return;
        }
        NoteEditorFragment.OooOoO(this.f102266OooO00o, imageInfo.getBitmap());
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0o0(ImageInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        NoteEditorFragment noteEditorFragment = this.f102266OooO00o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO00o(noteEditorFragment, info, null), 3);
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0oO(ImageInfo info) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(info, "info");
        NoteEditorFragment noteEditorFragment = this.f102266OooO00o;
        ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        imageEditorPanel.OooO0oO(true);
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView != null) {
            pDFView.OooOoO();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088 A[PHI: r14
      0x0088: PHI (r14v1 com.orion.penkit.models.ImageInfo) = (r14v0 com.orion.penkit.models.ImageInfo), (r14v3 com.orion.penkit.models.ImageInfo) binds: [B:12:0x005d, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oo(ImageInfo imageInfo) {
        ImageInfo imageInfoCopy$default;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0Copy$default;
        if (imageInfo == null || (imageInfoCopy$default = ImageInfo.copy$default(imageInfo, null, null, null, 0.0f, null, 0L, null, !imageInfo.getFixed(), 127, null)) == null) {
            return;
        }
        boolean fixed = imageInfo.getFixed();
        NoteEditorFragment noteEditorFragment = this.f102266OooO00o;
        if (!fixed) {
            C33781o00o0O c33781o00o0O = noteEditorFragment.OoooOO0().f73577Oooo0O0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, imageInfoCopy$default);
            ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
            if (imageEditorPanel == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
                throw null;
            }
            imageEditorPanel.OooO0oO(true);
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView != null) {
                pDFView.OooOoO();
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
        }
        C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
        String imageId = imageInfo.getId();
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageId, "imageId");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28940o00o0ooo(c23344OooOOoOoooOO0, imageId, null), 2);
        DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) noteEditorFragment.OoooOO0().f73573Oooo0.getValue();
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = dualLinkRefInfo == null ? imageInfo : dualLinkRefInfo;
        if (dualLinkRefInfo != null) {
            interfaceC31284OooO0O0Copy$default = DualLinkRefInfo.copy$default(dualLinkRefInfo, null, imageInfoCopy$default, false, null, 0L, 29, null);
            imageInfoCopy$default = imageInfoCopy$default;
            if (interfaceC31284OooO0O0Copy$default != null) {
                noteEditorFragment.OoooOO0().f73573Oooo0.setValue(null);
                noteEditorFragment.OoooOO0().f73577Oooo0O0.setValue(null);
            } else {
                interfaceC31284OooO0O0Copy$default = ImageInfo.copy$default(imageInfoCopy$default, C24761OooO.OooO00o("toString(...)"), null, null, 0.0f, null, 0L, null, false, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, null);
            }
        }
        noteEditorFragment.Oooooo(oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(interfaceC31284OooO0O0.getId(), interfaceC31284OooO0O0Copy$default.getId())));
        PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
        if (pDFView2 != null) {
            pDFView2.o00oO0O(com.facebook.soloader.OooOo.OooO0oO(interfaceC31284OooO0O0), com.facebook.soloader.OooOo.OooO0oO(interfaceC31284OooO0O0Copy$default), noteEditorFragment.f73063oo000o);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }
}
