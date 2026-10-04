package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import OooOoO.C20504OooO0O0;
import OooooOo.C21392OooOo00;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/preview/NoteTnNavigatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/orion/notein/ui/noteeditor/propertypanel/preview/PagePreviewVO;", "getPagePreviewVO", "()Lcom/orion/notein/ui/noteeditor/propertypanel/preview/PagePreviewVO;", "Lcom/orion/notein/ui/noteeditor/propertypanel/preview/NoteTnNavigatorView$OooO0O0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LoO00ooO/OooOooO;", "setOnNavigatorWindowMovedListener", "(Lcom/orion/notein/ui/noteeditor/propertypanel/preview/NoteTnNavigatorView$OooO0O0;)V", "Lcom/orion/notein/ui/noteeditor/propertypanel/preview/NoteTnNavigatorView$OooO00o;", "setOnButtonClickedListener", "(Lcom/orion/notein/ui/noteeditor/propertypanel/preview/NoteTnNavigatorView$OooO00o;)V", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteTnNavigatorView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final /* synthetic */ int f76040Oooo0o0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f76041OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ConstraintLayout f76042OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f76043OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f76044OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f76045OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public RectF f76046OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public SizeF f76047OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f76048OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public float f76049OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public OooO0O0 f76050Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f76051Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f76052Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f76053Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public OooO00o f76054Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final OooO0OO f76055Oooo0OO;

    public interface OooO00o {
        void OooO00o(View view, PagePreviewVO pagePreviewVO);
    }

    public interface OooO0O0 {
        void OooO00o(float f, float f2);
    }

    public final class OooO0OO implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f76056OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public float f76057OooOo0o;

        public OooO0OO() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View v, MotionEvent event) {
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            float rawX = event.getRawX();
            float rawY = event.getRawY();
            int action = event.getAction();
            NoteTnNavigatorView noteTnNavigatorView = NoteTnNavigatorView.this;
            if (action == 0) {
                noteTnNavigatorView.requestDisallowInterceptTouchEvent(true);
                this.f76057OooOo0o = rawX;
                this.f76056OooOo = rawY;
            } else if (action == 1) {
                noteTnNavigatorView.requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                float f = rawX - this.f76057OooOo0o;
                float f2 = rawY - this.f76056OooOo;
                this.f76057OooOo0o = rawX;
                this.f76056OooOo = rawY;
                int i = NoteTnNavigatorView.f76040Oooo0o0;
                noteTnNavigatorView.OooO00o(f, f2);
            } else if (action == 3) {
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteTnNavigatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76047OooOoo0 = new SizeF(0.0f, 0.0f);
        this.f76046OooOoo = new RectF();
        View.inflate(context, R.layout.layout_unbounded_note_navigator, this);
        this.f76055Oooo0OO = new OooO0OO();
    }

    public final void OooO00o(float f, float f2) {
        float height;
        float fMax;
        float fMax2;
        View view = this.f76044OooOoO0;
        if (view == null) {
            OooOOO0.OooOOOO("window");
            throw null;
        }
        float x = view.getX();
        View view2 = this.f76044OooOoO0;
        if (view2 == null) {
            OooOOO0.OooOOOO("window");
            throw null;
        }
        float y = view2.getY();
        if (this.f76047OooOoo0.getWidth() > this.f76047OooOoo0.getHeight()) {
            float fWidth = this.f76046OooOoo.width();
            if (this.f76041OooOo == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            height = fWidth / r9.getWidth();
            float height2 = this.f76047OooOoo0.getHeight() / this.f76047OooOoo0.getWidth();
            ImageView imageView = this.f76041OooOo;
            if (imageView == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            float left = imageView.getLeft();
            if (this.f76041OooOo == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            float right = 1.0f * r11.getRight();
            if (this.f76044OooOoO0 == null) {
                OooOOO0.OooOOOO("window");
                throw null;
            }
            float width = right - r11.getWidth();
            View view3 = this.f76044OooOoO0;
            if (view3 == null) {
                OooOOO0.OooOOOO("window");
                throw null;
            }
            fMax = Math.max(left, Math.min(width, view3.getX() + f));
            View view4 = this.f76044OooOoO0;
            if (view4 == null) {
                OooOOO0.OooOOOO("window");
                throw null;
            }
            float height3 = view4.getHeight();
            if (this.f76041OooOo == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            if (height3 > r10.getHeight() * height2) {
                ConstraintLayout constraintLayout = this.f76042OooOo0o;
                if (constraintLayout == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                int height4 = constraintLayout.getHeight();
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float height5 = (height4 - r8.getHeight()) * 0.5f;
                ConstraintLayout constraintLayout2 = this.f76042OooOo0o;
                if (constraintLayout2 == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                int height6 = constraintLayout2.getHeight();
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float height7 = (r8.getHeight() + height6) * 0.5f;
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float height8 = height7 - r6.getHeight();
                View view5 = this.f76044OooOoO0;
                if (view5 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                fMax2 = Math.max(height5, Math.min(height8, view5.getY() + f2));
            } else {
                ConstraintLayout constraintLayout3 = this.f76042OooOo0o;
                if (constraintLayout3 == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                float height9 = constraintLayout3.getHeight();
                if (this.f76041OooOo == null) {
                    OooOOO0.OooOOOO("noteTn");
                    throw null;
                }
                float fOooO00o = C21392OooOo00.OooO00o(r10.getHeight(), height2, height9, 0.5f);
                ConstraintLayout constraintLayout4 = this.f76042OooOo0o;
                if (constraintLayout4 == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                float height10 = constraintLayout4.getHeight();
                if (this.f76041OooOo == null) {
                    OooOOO0.OooOOOO("noteTn");
                    throw null;
                }
                float fOooO0O0 = C20504OooO0O0.OooO0O0(r10.getHeight(), height2, height10, 0.5f);
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float height11 = fOooO0O0 - r7.getHeight();
                View view6 = this.f76044OooOoO0;
                if (view6 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                fMax2 = Math.max(fOooO00o, Math.min(height11, view6.getY() + f2));
            }
        } else {
            float fHeight = this.f76046OooOoo.height();
            if (this.f76041OooOo == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            height = fHeight / r9.getHeight();
            float width2 = this.f76047OooOoo0.getWidth() / this.f76047OooOoo0.getHeight();
            View view7 = this.f76044OooOoO0;
            if (view7 == null) {
                OooOOO0.OooOOOO("window");
                throw null;
            }
            float width3 = view7.getWidth();
            if (this.f76041OooOo == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            if (width3 > r11.getWidth() * width2) {
                ConstraintLayout constraintLayout5 = this.f76042OooOo0o;
                if (constraintLayout5 == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                int width4 = constraintLayout5.getWidth();
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float width5 = (width4 - r10.getWidth()) * 0.5f;
                ConstraintLayout constraintLayout6 = this.f76042OooOo0o;
                if (constraintLayout6 == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                int width6 = constraintLayout6.getWidth();
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float width7 = (r10.getWidth() + width6) * 0.5f;
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float width8 = width7 - r6.getWidth();
                View view8 = this.f76044OooOoO0;
                if (view8 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                fMax = Math.max(width5, Math.min(width8, view8.getX() + f));
            } else {
                ConstraintLayout constraintLayout7 = this.f76042OooOo0o;
                if (constraintLayout7 == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                float width9 = constraintLayout7.getWidth();
                if (this.f76041OooOo == null) {
                    OooOOO0.OooOOOO("noteTn");
                    throw null;
                }
                float fOooO00o2 = C21392OooOo00.OooO00o(r11.getWidth(), width2, width9, 0.5f);
                ConstraintLayout constraintLayout8 = this.f76042OooOo0o;
                if (constraintLayout8 == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                float width10 = constraintLayout8.getWidth();
                if (this.f76041OooOo == null) {
                    OooOOO0.OooOOOO("noteTn");
                    throw null;
                }
                float fOooO0O02 = C20504OooO0O0.OooO0O0(r11.getWidth(), width2, width10, 0.5f);
                if (this.f76044OooOoO0 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                float width11 = fOooO0O02 - r7.getWidth();
                View view9 = this.f76044OooOoO0;
                if (view9 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                fMax = Math.max(fOooO00o2, Math.min(width11, view9.getX() + f));
            }
            ImageView imageView2 = this.f76041OooOo;
            if (imageView2 == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            float top = imageView2.getTop();
            if (this.f76041OooOo == null) {
                OooOOO0.OooOOOO("noteTn");
                throw null;
            }
            float bottom = 1.0f * r7.getBottom();
            if (this.f76044OooOoO0 == null) {
                OooOOO0.OooOOOO("window");
                throw null;
            }
            float height12 = bottom - r7.getHeight();
            View view10 = this.f76044OooOoO0;
            if (view10 == null) {
                OooOOO0.OooOOOO("window");
                throw null;
            }
            fMax2 = Math.max(top, Math.min(height12, view10.getY() + f2));
        }
        OooO0O0 oooO0O0 = this.f76050Oooo0;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o((fMax - x) * height, (fMax2 - y) * height);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(OooO0OO.OooO0O0 oooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO0o oooO0o;
        NoteTnNavigatorView noteTnNavigatorView;
        View view;
        OooO0OO.OooO0O0 oooO0O02 = oooO0O0;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f76118OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f76118OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooO0o.f76117OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f76118OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            setTag(oooO0O02 != null ? oooO0O02.f76098OooO00o : null);
            if (oooO0O02 == null) {
                View view2 = this.f76044OooOoO0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("window");
                throw null;
            }
            long j = this.f76045OooOoOO;
            long j2 = oooO0O02.f76100OooO0OO;
            if (j2 == j) {
                noteTnNavigatorView = this;
                view = noteTnNavigatorView.f76044OooOoO0;
                if (view != null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                view.setVisibility(0);
                androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
                ConstraintLayout constraintLayout = noteTnNavigatorView.f76042OooOo0o;
                if (constraintLayout == null) {
                    OooOOO0.OooOOOO("navigatorWrapper");
                    throw null;
                }
                oooO0OO.OooO0o0(constraintLayout);
                View view3 = noteTnNavigatorView.f76044OooOoO0;
                if (view3 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                oooO0OO.OooOO0(view3.getId()).f64011OooO0OO.f64110OooO0O0 = 0;
                RectF rectF = new RectF(oooO0O02.f76102OooO0o0);
                RectF rectF2 = oooO0O02.f76101OooO0Oo;
                rectF.intersect(rectF2);
                boolean z = rectF2.width() > rectF2.height();
                float fWidth = z ? 1.0f : rectF2.width() / rectF2.height();
                float fHeight = z ? rectF2.height() / rectF2.width() : 1.0f;
                float fWidth2 = (rectF.width() / rectF2.width()) * fWidth;
                float fHeight2 = (rectF.height() / rectF2.height()) * fHeight;
                float fMax = Math.max(0.0f, Math.min(1.0f, fWidth2));
                float fMax2 = Math.max(0.0f, Math.min(1.0f, fHeight2));
                float fMax3 = Math.max(0.05f, fMax);
                float fMax4 = Math.max(0.05f, fMax2);
                View view4 = noteTnNavigatorView.f76044OooOoO0;
                if (view4 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                oooO0OO.OooOO0(view4.getId()).f64014OooO0o0.f64085OooooOO = fMax3;
                View view5 = noteTnNavigatorView.f76044OooOoO0;
                if (view5 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                oooO0OO.OooOO0(view5.getId()).f64014OooO0o0.f64086OooooOo = fMax4;
                float fWidth3 = z ? 0.0f : 0.5f - ((rectF2.width() / rectF2.height()) / 2.0f);
                float fHeight3 = z ? 0.5f - ((rectF2.height() / rectF2.width()) / 2.0f) : 0.0f;
                float f = (fMax4 - fMax2) * 0.5f;
                float fWidth4 = ((((rectF.left - rectF2.left) / rectF2.width()) * fWidth) + fWidth3) - ((fMax3 - fMax) * 0.5f);
                float f2 = ((1.0f - fMax3) - fWidth4) + fWidth4;
                float f3 = Math.abs(f2) > 1.0E-6f ? fWidth4 / f2 : 0.0f;
                float fHeight4 = ((((rectF.top - rectF2.top) / rectF2.height()) * fHeight) + fHeight3) - f;
                float f4 = ((1.0f - fMax4) - fHeight4) + fHeight4;
                float f5 = Math.abs(f4) > 1.0E-6f ? fHeight4 / f4 : 0.0f;
                float fMax5 = Math.max(0.0f, Math.min(1.0f, f3));
                float fMax6 = Math.max(0.0f, Math.min(1.0f, f5));
                View view6 = noteTnNavigatorView.f76044OooOoO0;
                if (view6 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                oooO0OO.OooOO0(view6.getId()).f64014OooO0o0.f64049OooOo = fMax5;
                View view7 = noteTnNavigatorView.f76044OooOoO0;
                if (view7 == null) {
                    OooOOO0.OooOOOO("window");
                    throw null;
                }
                oooO0OO.OooOO0(view7.getId()).f64014OooO0o0.f64055OooOoO0 = fMax6;
                ConstraintLayout constraintLayout2 = noteTnNavigatorView.f76042OooOo0o;
                if (constraintLayout2 != null) {
                    oooO0OO.OooO0O0(constraintLayout2);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("navigatorWrapper");
                throw null;
            }
            this.f76045OooOoOO = j2;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C23557OooO0oO c23557OooO0oO = new C23557OooO0oO(oooO0O02, null);
            oooO0o.f76115OooOo0o = this;
            oooO0o.f76114OooOo = oooO0O02;
            oooO0o.f76118OooOoOO = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c23557OooO0oO, oooO0o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            noteTnNavigatorView = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0O02 = oooO0o.f76114OooOo;
            noteTnNavigatorView = oooO0o.f76115OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        Bitmap bitmap = (Bitmap) objOooO0o;
        if (bitmap == null) {
            View view8 = noteTnNavigatorView.f76044OooOoO0;
            if (view8 != null) {
                view8.setVisibility(8);
                return C32460OooOooO.f116667OooO00o;
            }
            OooOOO0.OooOOOO("window");
            throw null;
        }
        noteTnNavigatorView.f76047OooOoo0 = new SizeF(bitmap.getWidth(), bitmap.getHeight());
        noteTnNavigatorView.f76046OooOoo = new RectF(oooO0O02.f76101OooO0Oo);
        ImageView imageView = noteTnNavigatorView.f76041OooOo;
        if (imageView == null) {
            OooOOO0.OooOOOO("noteTn");
            throw null;
        }
        imageView.setImageBitmap(bitmap);
        view = noteTnNavigatorView.f76044OooOoO0;
        if (view != null) {
        }
    }

    public final PagePreviewVO getPagePreviewVO() {
        Object tag = getTag();
        if (tag instanceof PagePreviewVO) {
            return (PagePreviewVO) tag;
        }
        return null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f76042OooOo0o = (ConstraintLayout) findViewById(R.id.cl_navigator_wrapper);
        this.f76041OooOo = (ImageView) findViewById(R.id.iv_note_tn);
        View viewFindViewById = findViewById(R.id.v_nav_window);
        this.f76044OooOoO0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("window");
            throw null;
        }
        viewFindViewById.setOnTouchListener(this.f76055Oooo0OO);
        View viewFindViewById2 = findViewById(R.id.btn_more);
        this.f76043OooOoO = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26051OoooOOo(this, 3));
        } else {
            OooOOO0.OooOOOO("btnMore");
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        if (event.isButtonPressed(2) || event.isButtonPressed(4)) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.f76048OooOooO = System.currentTimeMillis();
            this.f76049OooOooo = rawX;
            this.f76051Oooo000 = rawY;
            this.f76052Oooo00O = rawX;
            this.f76053Oooo00o = rawY;
        } else if (action != 1) {
            if (action == 2) {
                this.f76052Oooo00O = rawX;
                this.f76053Oooo00o = rawY;
            }
        } else if (System.currentTimeMillis() - this.f76048OooOooO < 100 && Math.abs(rawX - this.f76049OooOooo) < 1.0E-6f && Math.abs(rawY - this.f76051Oooo000) < 1.0E-6f && Math.abs(rawX - this.f76052Oooo00O) < 1.0E-6f && Math.abs(rawY - this.f76053Oooo00o) < 1.0E-6f) {
            float x = event.getX();
            float y = event.getY();
            View view = this.f76044OooOoO0;
            if (view == null) {
                OooOOO0.OooOOOO("window");
                throw null;
            }
            if (view.getVisibility() == 0) {
                if (this.f76047OooOoo0.getHeight() * this.f76047OooOoo0.getWidth() >= 1.0E-6f) {
                    View view2 = this.f76044OooOoO0;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("window");
                        throw null;
                    }
                    float x2 = view2.getX();
                    if (this.f76044OooOoO0 == null) {
                        OooOOO0.OooOOOO("window");
                        throw null;
                    }
                    float width = x - (x2 + (r5.getWidth() / 2));
                    View view3 = this.f76044OooOoO0;
                    if (view3 == null) {
                        OooOOO0.OooOOOO("window");
                        throw null;
                    }
                    float y2 = view3.getY();
                    if (this.f76044OooOoO0 == null) {
                        OooOOO0.OooOOOO("window");
                        throw null;
                    }
                    OooO00o(width, y - (y2 + (r5.getHeight() / 2)));
                }
            }
        }
        return true;
    }

    public final void setOnButtonClickedListener(OooO00o listener) {
        OooOOO0.OooO0oO(listener, "listener");
        this.f76054Oooo0O0 = listener;
    }

    public final void setOnNavigatorWindowMovedListener(OooO0O0 listener) {
        OooOOO0.OooO0oO(listener, "listener");
        this.f76050Oooo0 = listener;
    }
}
