package com.orion.notein.p607ui.noteeditor.addimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26035OooOooo;
import o0OoO.OooO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addimage/ImageCropEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", C18437z2.f56754h, "LoO00ooO/OooOooO;", "setCropType", "(I)V", "Lcom/orion/notein/ui/noteeditor/addimage/ImageCropEditor$OooO00o;", "OooOooO", "Lcom/orion/notein/ui/noteeditor/addimage/ImageCropEditor$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/addimage/ImageCropEditor$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/addimage/ImageCropEditor$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImageCropEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageCustomCropView f73694OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageRectCropView f73695OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f73696OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractImageCropView f73697OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f73698OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RectF f73699OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Bitmap f73700OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    public interface OooO00o {
        void OooO00o(Bitmap bitmap, RectF rectF);

        void onCancel();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f73699OooOoo = new RectF();
        View.inflate(context, R.layout.layout_image_crop_editor, this);
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.btn_cancel);
        viewFindViewById.setOnClickListener(new OooO(this, 0));
        this.f73696OooOoO = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.btn_done);
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26035OooOooo(this, 1));
        this.f73698OooOoOO = viewFindViewById2;
        this.f73695OooOo0o = (ImageRectCropView) findViewById(R.id.img_rect_cropper);
        this.f73694OooOo = (ImageCustomCropView) findViewById(R.id.img_custom_cropper);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setCropType(int type) {
        if (type == 0) {
            ImageRectCropView imageRectCropView = this.f73695OooOo0o;
            if (imageRectCropView == null) {
                OooOOO0.OooOOOO("rectCropView");
                throw null;
            }
            this.f73697OooOoO0 = imageRectCropView;
            if (imageRectCropView == null) {
                OooOOO0.OooOOOO("rectCropView");
                throw null;
            }
            imageRectCropView.setVisibility(0);
            ImageCustomCropView imageCustomCropView = this.f73694OooOo;
            if (imageCustomCropView != null) {
                imageCustomCropView.setVisibility(8);
                return;
            } else {
                OooOOO0.OooOOOO("customCropView");
                throw null;
            }
        }
        ImageRectCropView imageRectCropView2 = this.f73695OooOo0o;
        if (imageRectCropView2 == null) {
            OooOOO0.OooOOOO("rectCropView");
            throw null;
        }
        imageRectCropView2.setVisibility(8);
        ImageCustomCropView imageCustomCropView2 = this.f73694OooOo;
        if (imageCustomCropView2 == null) {
            OooOOO0.OooOOOO("customCropView");
            throw null;
        }
        imageCustomCropView2.setVisibility(0);
        ImageCustomCropView imageCustomCropView3 = this.f73694OooOo;
        if (imageCustomCropView3 != null) {
            this.f73697OooOoO0 = imageCustomCropView3;
        } else {
            OooOOO0.OooOOOO("customCropView");
            throw null;
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
