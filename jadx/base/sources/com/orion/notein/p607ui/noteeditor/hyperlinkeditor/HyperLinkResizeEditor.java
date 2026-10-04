package com.orion.notein.p607ui.noteeditor.hyperlinkeditor;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/HyperLinkResizeEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/RectF;", "getContentBoundingBox", "()Landroid/graphics/RectF;", "OooO00o", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class HyperLinkResizeEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f74504Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f74505OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO f74506OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ImageView f74507OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ViewGroup f74508OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f74509OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f74510OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f74511OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f74512OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public CardView f74513OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f74514Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f74515Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f74516Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f74517Oooo00o;

    public final class OooO00o implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f74518OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public float f74519OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final PointF f74521OooOoO0 = new PointF();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final PointF f74520OooOoO = new PointF();

        public OooO00o() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01f4  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View v, MotionEvent event) {
            ViewGroup viewGroup;
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            int action = event.getAction();
            HyperLinkResizeEditor hyperLinkResizeEditor = HyperLinkResizeEditor.this;
            if (action == 0) {
                int i = HyperLinkResizeEditor.f74504Oooo0O0;
                hyperLinkResizeEditor.OooO00o();
                hyperLinkResizeEditor.requestDisallowInterceptTouchEvent(true);
                this.f74521OooOoO0.set(event.getRawX(), event.getRawY());
                this.f74519OooOo0o = event.getRawX();
                this.f74518OooOo = event.getRawY();
            } else if (action == 1) {
                int i2 = HyperLinkResizeEditor.f74504Oooo0O0;
                hyperLinkResizeEditor.OooO0O0();
                this.f74519OooOo0o = event.getRawX();
                this.f74518OooOo = event.getRawY();
                hyperLinkResizeEditor.requestDisallowInterceptTouchEvent(false);
                RectF contentBoundingBox = hyperLinkResizeEditor.getContentBoundingBox();
                OooO0OO oooO0OO = hyperLinkResizeEditor.f74506OooOo0o;
                if (oooO0OO == null) {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                oooO0OO.OooO0o(contentBoundingBox);
            } else if (action == 2) {
                this.f74520OooOoO.set(event.getRawX(), event.getRawY());
                float rawX = event.getRawX() - this.f74519OooOo0o;
                float rawY = event.getRawY() - this.f74518OooOo;
                this.f74519OooOo0o = event.getRawX();
                this.f74518OooOo = event.getRawY();
                int i3 = (int) rawX;
                int i4 = (int) rawY;
                ViewGroup viewGroup2 = hyperLinkResizeEditor.f74508OooOoO0;
                if (viewGroup2 == null) {
                    OooOOO0.OooOOOO("contentContainer");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                int id = v.getId();
                float f = hyperLinkResizeEditor.f74505OooOo;
                switch (id) {
                    case R.id.v_scale_handle_left_bottom /* 2131299342 */:
                        if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                            OooOOO0.OooOOOO("contentContainer");
                            throw null;
                        }
                        float f2 = f * 2;
                        if (r9.getWidth() - i3 >= f2) {
                            if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            if (r9.getHeight() + i4 >= f2) {
                                int i5 = layoutParams.width;
                                ViewGroup viewGroup3 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup3 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.width = viewGroup3.getWidth() - i3;
                                ViewGroup viewGroup4 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup4 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                viewGroup4.setX(viewGroup4.getX() + (i5 - layoutParams.width));
                                ViewGroup viewGroup5 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup5 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.height = viewGroup5.getHeight() + i4;
                                viewGroup = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                viewGroup.setLayoutParams(layoutParams);
                                ViewGroup viewGroup6 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup6 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                viewGroup6.requestLayout();
                            }
                        }
                        break;
                        break;
                    case R.id.v_scale_handle_left_top /* 2131299343 */:
                        if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                            OooOOO0.OooOOOO("contentContainer");
                            throw null;
                        }
                        float f3 = f * 2;
                        if (r9.getWidth() - i3 >= f3) {
                            if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            if (r9.getHeight() - i4 >= f3) {
                                int i6 = layoutParams.width;
                                ViewGroup viewGroup7 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup7 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.width = viewGroup7.getWidth() - i3;
                                ViewGroup viewGroup8 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup8 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                viewGroup8.setX(viewGroup8.getX() + (i6 - layoutParams.width));
                                int i7 = layoutParams.height;
                                ViewGroup viewGroup9 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup9 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.height = viewGroup9.getHeight() - i4;
                                ViewGroup viewGroup10 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup10 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                viewGroup10.setY(viewGroup10.getY() + (i7 - layoutParams.height));
                                viewGroup = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup == null) {
                                }
                            }
                        }
                        break;
                    case R.id.v_scale_handle_right_bottom /* 2131299344 */:
                        if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                            OooOOO0.OooOOOO("contentContainer");
                            throw null;
                        }
                        float f4 = f * 2;
                        if (r9.getWidth() + i3 >= f4) {
                            if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            if (r9.getHeight() + i4 >= f4) {
                                ViewGroup viewGroup11 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup11 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.width = viewGroup11.getWidth() + i3;
                                ViewGroup viewGroup12 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup12 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.height = viewGroup12.getHeight() + i4;
                                viewGroup = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup == null) {
                                }
                            }
                        }
                        break;
                    case R.id.v_scale_handle_right_top /* 2131299345 */:
                        if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                            OooOOO0.OooOOOO("contentContainer");
                            throw null;
                        }
                        float f5 = f * 2;
                        if (r9.getWidth() + i3 >= f5) {
                            if (hyperLinkResizeEditor.f74508OooOoO0 == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            if (r9.getHeight() - i4 >= f5) {
                                ViewGroup viewGroup13 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup13 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.width = viewGroup13.getWidth() + i3;
                                int i8 = layoutParams.height;
                                ViewGroup viewGroup14 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup14 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                layoutParams.height = viewGroup14.getHeight() - i4;
                                ViewGroup viewGroup15 = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup15 == null) {
                                    OooOOO0.OooOOOO("contentContainer");
                                    throw null;
                                }
                                viewGroup15.setY(viewGroup15.getY() + (i8 - layoutParams.height));
                                viewGroup = hyperLinkResizeEditor.f74508OooOoO0;
                                if (viewGroup == null) {
                                }
                            }
                        }
                        break;
                    default:
                        viewGroup = hyperLinkResizeEditor.f74508OooOoO0;
                        if (viewGroup == null) {
                        }
                        break;
                }
            } else if (action == 3) {
            }
            return true;
        }
    }

    public final class OooO0O0 implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f74523OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public float f74524OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final PointF f74526OooOoO0 = new PointF();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final PointF f74525OooOoO = new PointF();

        public OooO0O0() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View v, MotionEvent event) {
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            int action = event.getAction() & 255;
            HyperLinkResizeEditor hyperLinkResizeEditor = HyperLinkResizeEditor.this;
            if (action != 0) {
                PointF pointF = this.f74525OooOoO;
                if (action == 1) {
                    int i = HyperLinkResizeEditor.f74504Oooo0O0;
                    hyperLinkResizeEditor.OooO0O0();
                    hyperLinkResizeEditor.requestDisallowInterceptTouchEvent(false);
                    pointF.set(event.getRawX(), event.getRawY());
                    RectF contentBoundingBox = hyperLinkResizeEditor.getContentBoundingBox();
                    OooO0OO oooO0OO = hyperLinkResizeEditor.f74506OooOo0o;
                    if (oooO0OO == null) {
                        OooOOO0.OooOOOO("viewModel");
                        throw null;
                    }
                    oooO0OO.OooO0o(contentBoundingBox);
                } else if (action == 2) {
                    pointF.set(event.getRawX(), event.getRawY());
                    float rawX = event.getRawX() - this.f74524OooOo0o;
                    float rawY = event.getRawY() - this.f74523OooOo;
                    this.f74524OooOo0o = event.getRawX();
                    this.f74523OooOo = event.getRawY();
                    int i2 = (int) rawX;
                    int i3 = (int) rawY;
                    ViewGroup viewGroup = hyperLinkResizeEditor.f74508OooOoO0;
                    if (viewGroup == null) {
                        OooOOO0.OooOOOO("contentContainer");
                        throw null;
                    }
                    viewGroup.setX(viewGroup.getX() + i2);
                    ViewGroup viewGroup2 = hyperLinkResizeEditor.f74508OooOoO0;
                    if (viewGroup2 == null) {
                        OooOOO0.OooOOOO("contentContainer");
                        throw null;
                    }
                    viewGroup2.setY(viewGroup2.getY() + i3);
                } else if (action == 3) {
                }
            } else {
                int i4 = HyperLinkResizeEditor.f74504Oooo0O0;
                hyperLinkResizeEditor.OooO00o();
                hyperLinkResizeEditor.requestDisallowInterceptTouchEvent(true);
                System.currentTimeMillis();
                this.f74526OooOoO0.set(event.getRawX(), event.getRawY());
                this.f74524OooOo0o = event.getRawX();
                this.f74523OooOo = event.getRawY();
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperLinkResizeEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f74505OooOo = o000000O.OooO0o0(18.0f);
        View.inflate(context, R.layout.layout_hyperlink_editor, this);
    }

    public final void OooO00o() {
        CardView cardView = this.f74513OooOooo;
        if (cardView != null) {
            cardView.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("editMenu");
            throw null;
        }
    }

    public final void OooO0O0() {
        ViewGroup viewGroup = this.f74508OooOoO0;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup viewGroup2 = this.f74508OooOoO0;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float x = viewGroup2.getX();
        ViewGroup viewGroup3 = this.f74508OooOoO0;
        if (viewGroup3 == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float x2 = viewGroup3.getX() + layoutParams.width;
        ViewGroup viewGroup4 = this.f74508OooOoO0;
        if (viewGroup4 == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float x3 = (layoutParams.width / 2.0f) + viewGroup4.getX();
        ViewGroup viewGroup5 = this.f74508OooOoO0;
        if (viewGroup5 == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float y = viewGroup5.getY();
        ViewGroup viewGroup6 = this.f74508OooOoO0;
        if (viewGroup6 == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float y2 = viewGroup6.getY() + layoutParams.height;
        ViewGroup viewGroup7 = this.f74508OooOoO0;
        if (viewGroup7 == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float y3 = (layoutParams.height / 2.0f) + viewGroup7.getY();
        int iOooO0o = o000000O.OooO0o(167);
        int iOooO0o2 = o000000O.OooO0o(136);
        OooOOO0.OooO0o0(getParent(), "null cannot be cast to non-null type android.view.View");
        float width = ((View) r10).getWidth() - x2;
        OooOOO0.OooO0o0(getParent(), "null cannot be cast to non-null type android.view.View");
        float height = ((View) r12).getHeight() - y2;
        float f = iOooO0o;
        if (width >= f) {
            CardView cardView = this.f74513OooOooo;
            if (cardView == null) {
                OooOOO0.OooOOOO("editMenu");
                throw null;
            }
            cardView.setX(x2);
            CardView cardView2 = this.f74513OooOooo;
            if (cardView2 == null) {
                OooOOO0.OooOOOO("editMenu");
                throw null;
            }
            cardView2.setY(y3 - (iOooO0o2 / 2.0f));
        } else {
            float f2 = iOooO0o2;
            if (x >= f2) {
                CardView cardView3 = this.f74513OooOooo;
                if (cardView3 == null) {
                    OooOOO0.OooOOOO("editMenu");
                    throw null;
                }
                cardView3.setX(x - f);
                CardView cardView4 = this.f74513OooOooo;
                if (cardView4 == null) {
                    OooOOO0.OooOOOO("editMenu");
                    throw null;
                }
                cardView4.setY(y3 - (f2 / 2.0f));
            } else if (height >= f2) {
                CardView cardView5 = this.f74513OooOooo;
                if (cardView5 == null) {
                    OooOOO0.OooOOOO("editMenu");
                    throw null;
                }
                cardView5.setX(x3 - (f / 2.0f));
                CardView cardView6 = this.f74513OooOooo;
                if (cardView6 == null) {
                    OooOOO0.OooOOOO("editMenu");
                    throw null;
                }
                cardView6.setY(y2);
            } else {
                CardView cardView7 = this.f74513OooOooo;
                if (cardView7 == null) {
                    OooOOO0.OooOOOO("editMenu");
                    throw null;
                }
                cardView7.setX(x3 - (f / 2.0f));
                CardView cardView8 = this.f74513OooOooo;
                if (cardView8 == null) {
                    OooOOO0.OooOOOO("editMenu");
                    throw null;
                }
                cardView8.setY(y - f2);
            }
        }
        CardView cardView9 = this.f74513OooOooo;
        if (cardView9 != null) {
            cardView9.setVisibility(0);
        } else {
            OooOOO0.OooOOOO("editMenu");
            throw null;
        }
    }

    public final RectF getContentBoundingBox() {
        float x = getX();
        ViewGroup viewGroup = this.f74508OooOoO0;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float x2 = viewGroup.getX() + x;
        float y = getY();
        ViewGroup viewGroup2 = this.f74508OooOoO0;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("contentContainer");
            throw null;
        }
        float y2 = viewGroup2.getY() + y;
        ImageView imageView = this.f74507OooOoO;
        if (imageView == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        float x3 = imageView.getX();
        ImageView imageView2 = this.f74507OooOoO;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        float y3 = imageView2.getY();
        ImageView imageView3 = this.f74507OooOoO;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        float x4 = imageView3.getX();
        if (this.f74507OooOoO == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        float width = x4 + r8.getWidth();
        ImageView imageView4 = this.f74507OooOoO;
        if (imageView4 == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        float y4 = imageView4.getY();
        if (this.f74507OooOoO == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        RectF rectF = new RectF(x3, y3, width, y4 + r9.getHeight());
        rectF.offset(x2, y2);
        return rectF;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        if (event.getActionMasked() == 0) {
            RectF contentBoundingBox = getContentBoundingBox();
            o00OO0O0.OooO0O0.OooOO0O(contentBoundingBox, 1.5f);
            if (!contentBoundingBox.contains(event.getX(), event.getY())) {
                OooO0OO oooO0OO = this.f74506OooOo0o;
                if (oooO0OO == null) {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                oooO0OO.OooO0oo(OooO0OO.OooO00o.f74573OooOooO, null);
            }
        }
        return super.onTouchEvent(event);
    }
}
