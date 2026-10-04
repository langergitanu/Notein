package com.orion.notein.p607ui.noteeditor.addimage;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import com.orion.notein.p607ui.noteeditor.addimage.ImageSizeAndRotationEditor;
import kotlin.Metadata;
import o0Oo0o0o.ViewOnClickListenerC28240OooOOo0;
import o0OoO.OooOO0O;
import o0OoO.OooOOO0;
import o0OoO.ViewOnTouchListenerC28505OooOO0o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addimage/ImageSizeAndRotationEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "enable", "LoO00ooO/OooOooO;", "setScaleHOrScaleVEnable", "(Z)V", "Lcom/orion/notein/ui/noteeditor/addimage/ImageSizeAndRotationEditor$OooO00o;", "Oooo0", "Lcom/orion/notein/ui/noteeditor/addimage/ImageSizeAndRotationEditor$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/addimage/ImageSizeAndRotationEditor$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/addimage/ImageSizeAndRotationEditor$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImageSizeAndRotationEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f73763Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f73764OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f73765OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f73766OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f73767OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f73768OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final PointF f73769OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final PointF f73770OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final PointF f73771OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Handler f73772OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ImageEditorPanel.C23354OooO0Oo f73774Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ViewOnTouchListenerC28505OooOO0o f73775Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final OooOOO0 f73776Oooo00o;

    public interface OooO00o {
        void OooO00o(float f, float f2);

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo(int i, int i2);

        void onCancel();

        void onFinish();

        void onMove(int i, int i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0OoO.OooOOO0] */
    public ImageSizeAndRotationEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.f73770OooOoo0 = new PointF();
        this.f73769OooOoo = new PointF();
        this.f73771OooOooO = new PointF();
        this.f73772OooOooo = new Handler(Looper.getMainLooper());
        this.f73775Oooo00O = new ViewOnTouchListenerC28505OooOO0o(this, 0);
        this.f73776Oooo00o = new View.OnTouchListener() { // from class: o0OoO.OooOOO0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C32443OooOOO c32443OooOOO;
                int i = 0;
                int i2 = ImageSizeAndRotationEditor.f73763Oooo0O0;
                int action = motionEvent.getAction();
                ImageSizeAndRotationEditor imageSizeAndRotationEditor = this.f101068OooOo0o;
                if (action == 0) {
                    imageSizeAndRotationEditor.requestDisallowInterceptTouchEvent(true);
                    imageSizeAndRotationEditor.f73770OooOoo0.set(motionEvent.getRawX(), motionEvent.getRawY());
                    if (view.getId() == R.id.img_content) {
                        imageSizeAndRotationEditor.f73772OooOooo.postDelayed(new OooOOO(imageSizeAndRotationEditor, i), 1000L);
                    }
                    ImageSizeAndRotationEditor.OooO00o oooO00o = imageSizeAndRotationEditor.eventListener;
                    if (oooO00o != null) {
                        oooO00o.OooO0O0();
                    }
                } else if (action == 1) {
                    imageSizeAndRotationEditor.f73772OooOooo.removeCallbacksAndMessages(null);
                    ImageSizeAndRotationEditor.OooO00o oooO00o2 = imageSizeAndRotationEditor.eventListener;
                    if (oooO00o2 != null) {
                        oooO00o2.onFinish();
                    }
                    imageSizeAndRotationEditor.requestDisallowInterceptTouchEvent(false);
                    ImageSizeAndRotationEditor.OooO00o oooO00o3 = imageSizeAndRotationEditor.eventListener;
                    if (oooO00o3 != null) {
                        oooO00o3.OooO0OO();
                        return true;
                    }
                } else if (action == 2) {
                    imageSizeAndRotationEditor.f73769OooOoo.set(motionEvent.getRawX(), motionEvent.getRawY());
                    PointF pointF = imageSizeAndRotationEditor.f73769OooOoo;
                    float f = pointF.x;
                    PointF pointF2 = imageSizeAndRotationEditor.f73770OooOoo0;
                    if (Math.abs(f - pointF2.x) > 20.0f || Math.abs(pointF.y - pointF2.y) > 20.0f) {
                        imageSizeAndRotationEditor.f73772OooOooo.removeCallbacksAndMessages(null);
                    }
                    float f2 = pointF.x - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    if (view.getId() == R.id.img_content) {
                        ImageSizeAndRotationEditor.OooO00o oooO00o4 = imageSizeAndRotationEditor.eventListener;
                        if (oooO00o4 != null) {
                            oooO00o4.onMove((int) f2, (int) f3);
                            return true;
                        }
                    } else {
                        switch (view.getId()) {
                            case R.id.img_scale_h /* 2131297773 */:
                                c32443OooOOO = new C32443OooOOO(Integer.valueOf((int) (Math.cos((((((double) ((-((float) Math.atan2(f3, f2))) * 180)) / 3.141592653589793d) + ((double) imageSizeAndRotationEditor.getRotation())) / ((double) 180)) * 3.141592653589793d) * ((double) ((float) Math.sqrt((f3 * f3) + (f2 * f2)))))), 0);
                                break;
                            case R.id.img_scale_v /* 2131297774 */:
                                c32443OooOOO = new C32443OooOOO(0, Integer.valueOf((int) (Math.cos((((((double) ((-((float) Math.atan2(f2, f3))) * 180)) / 3.141592653589793d) - ((double) imageSizeAndRotationEditor.getRotation())) / ((double) 180)) * 3.141592653589793d) * ((double) ((float) Math.sqrt((f3 * f3) + (f2 * f2)))))));
                                break;
                            default:
                                c32443OooOOO = new C32443OooOOO(0, 0);
                                break;
                        }
                        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                        int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                        ImageSizeAndRotationEditor.OooO00o oooO00o5 = imageSizeAndRotationEditor.eventListener;
                        if (oooO00o5 != null) {
                            oooO00o5.OooO0Oo(iIntValue, iIntValue2);
                            return true;
                        }
                    }
                }
                return true;
            }
        };
        View.inflate(context, R.layout.layout_image_editor, this);
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.img_cancel);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28240OooOOo0(this, 1));
        this.f73764OooOo = viewFindViewById;
        ImageView imageView = (ImageView) findViewById(R.id.img_content);
        OooOOO0 oooOOO0 = this.f73776Oooo00o;
        imageView.setOnTouchListener(oooOOO0);
        imageView.setOnLongClickListener(new OooOO0O(this, 0));
        this.f73765OooOo0o = imageView;
        View viewFindViewById2 = findViewById(R.id.img_scale_h);
        viewFindViewById2.setOnTouchListener(oooOOO0);
        this.f73767OooOoO0 = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.img_scale_v);
        viewFindViewById3.setOnTouchListener(oooOOO0);
        this.f73766OooOoO = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.img_scale);
        viewFindViewById4.setOnTouchListener(this.f73775Oooo00O);
        this.f73768OooOoOO = viewFindViewById4;
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }

    public final void setScaleHOrScaleVEnable(boolean enable) {
        View view = this.f73767OooOoO0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("scaleHorizontal");
            throw null;
        }
        view.setVisibility(enable ? 0 : 8);
        View view2 = this.f73766OooOoO;
        if (view2 != null) {
            view2.setVisibility(enable ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("scaleVertical");
            throw null;
        }
    }
}
