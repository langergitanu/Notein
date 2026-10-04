package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.C22106OooOo0O;
import androidx.transition.OooOOO0;
import com.orion.notein.global.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo0 extends OooOOO0 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public static class OooO00o extends AnimatorListenerAdapter implements OooOOO0.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f66408OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f66409OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ViewGroup f66410OooO0OO;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f66413OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f66412OooO0o = false;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f66411OooO0Oo = true;

        public OooO00o(int i, View view) {
            this.f66408OooO00o = view;
            this.f66409OooO0O0 = i;
            this.f66410OooO0OO = (ViewGroup) view.getParent();
            OooO00o(true);
        }

        public final void OooO00o(boolean z) {
            ViewGroup viewGroup;
            if (!this.f66411OooO0Oo || this.f66413OooO0o0 == z || (viewGroup = this.f66410OooO0OO) == null) {
                return;
            }
            this.f66413OooO0o0 = z;
            C22108OooOoO.OooO00o(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f66412OooO0o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f66412OooO0o) {
                C22110OooOoOO.OooO0O0(this.f66408OooO00o, this.f66409OooO0O0);
                ViewGroup viewGroup = this.f66410OooO0OO;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            OooO00o(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionCancel(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionEnd(OooOOO0 oooOOO0) {
            oooOOO0.removeListener(this);
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionPause(OooOOO0 oooOOO0) {
            OooO00o(false);
            if (this.f66412OooO0o) {
                return;
            }
            C22110OooOoOO.OooO0O0(this.f66408OooO00o, this.f66409OooO0O0);
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionResume(OooOOO0 oooOOO0) {
            OooO00o(true);
            if (this.f66412OooO0o) {
                return;
            }
            C22110OooOoOO.OooO0O0(this.f66408OooO00o, 0);
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionStart(OooOOO0 oooOOO0) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                C22110OooOoOO.OooO0O0(this.f66408OooO00o, 0);
                ViewGroup viewGroup = this.f66410OooO0OO;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.f66412OooO0o) {
                C22110OooOoOO.OooO0O0(this.f66408OooO00o, this.f66409OooO0O0);
                ViewGroup viewGroup = this.f66410OooO0OO;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            OooO00o(false);
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter implements OooOOO0.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ViewGroup f66414OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f66415OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f66416OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f66417OooO0Oo = true;

        public OooO0O0(ViewGroup viewGroup, View view, View view2) {
            this.f66414OooO00o = viewGroup;
            this.f66415OooO0O0 = view;
            this.f66416OooO0OO = view2;
        }

        public final void OooO00o() {
            this.f66416OooO0OO.setTag(R.id.save_overlay_view, null);
            this.f66414OooO00o.getOverlay().remove(this.f66415OooO0O0);
            this.f66417OooO0Oo = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            OooO00o();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f66414OooO00o.getOverlay().remove(this.f66415OooO0O0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f66415OooO0O0;
            if (view.getParent() == null) {
                this.f66414OooO00o.getOverlay().add(view);
            } else {
                Oooo0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.f66416OooO0OO;
                View view2 = this.f66415OooO0O0;
                view.setTag(R.id.save_overlay_view, view2);
                this.f66414OooO00o.getOverlay().add(view2);
                this.f66417OooO0Oo = true;
            }
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionCancel(OooOOO0 oooOOO0) {
            if (this.f66417OooO0Oo) {
                OooO00o();
            }
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionEnd(OooOOO0 oooOOO0) {
            oooOOO0.removeListener(this);
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionPause(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionResume(OooOOO0 oooOOO0) {
        }

        @Override // androidx.transition.OooOOO0.OooO
        public final void onTransitionStart(OooOOO0 oooOOO0) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            OooO00o();
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f66419OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f66420OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66421OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f66422OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ViewGroup f66423OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ViewGroup f66424OooO0o0;
    }

    public Oooo0() {
        this.mMode = 3;
    }

    private void captureValues(C22107OooOo0o c22107OooOo0o) {
        Integer numValueOf = Integer.valueOf(c22107OooOo0o.f66395OooO0O0.getVisibility());
        HashMap map = c22107OooOo0o.f66394OooO00o;
        map.put(PROPNAME_VISIBILITY, numValueOf);
        map.put(PROPNAME_PARENT, c22107OooOo0o.f66395OooO0O0.getParent());
        int[] iArr = new int[2];
        c22107OooOo0o.f66395OooO0O0.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private OooO0OO getVisibilityChangeInfo(C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f66419OooO00o = false;
        oooO0OO.f66420OooO0O0 = false;
        if (c22107OooOo0o != null) {
            HashMap map = c22107OooOo0o.f66394OooO00o;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                oooO0OO.f66421OooO0OO = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                oooO0OO.f66424OooO0o0 = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                oooO0OO.f66421OooO0OO = -1;
                oooO0OO.f66424OooO0o0 = null;
            }
        }
        if (c22107OooOo0o2 != null) {
            HashMap map2 = c22107OooOo0o2.f66394OooO00o;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                oooO0OO.f66422OooO0Oo = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                oooO0OO.f66423OooO0o = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                oooO0OO.f66422OooO0Oo = -1;
                oooO0OO.f66423OooO0o = null;
            }
        }
        if (c22107OooOo0o != null && c22107OooOo0o2 != null) {
            int i = oooO0OO.f66421OooO0OO;
            int i2 = oooO0OO.f66422OooO0Oo;
            if (i != i2 || oooO0OO.f66424OooO0o0 != oooO0OO.f66423OooO0o) {
                if (i != i2) {
                    if (i == 0) {
                        oooO0OO.f66420OooO0O0 = false;
                        oooO0OO.f66419OooO00o = true;
                        return oooO0OO;
                    }
                    if (i2 == 0) {
                        oooO0OO.f66420OooO0O0 = true;
                        oooO0OO.f66419OooO00o = true;
                        return oooO0OO;
                    }
                } else {
                    if (oooO0OO.f66423OooO0o == null) {
                        oooO0OO.f66420OooO0O0 = false;
                        oooO0OO.f66419OooO00o = true;
                        return oooO0OO;
                    }
                    if (oooO0OO.f66424OooO0o0 == null) {
                        oooO0OO.f66420OooO0O0 = true;
                        oooO0OO.f66419OooO00o = true;
                        return oooO0OO;
                    }
                }
            }
        } else {
            if (c22107OooOo0o == null && oooO0OO.f66422OooO0Oo == 0) {
                oooO0OO.f66420OooO0O0 = true;
                oooO0OO.f66419OooO00o = true;
                return oooO0OO;
            }
            if (c22107OooOo0o2 == null && oooO0OO.f66421OooO0OO == 0) {
                oooO0OO.f66420OooO0O0 = false;
                oooO0OO.f66419OooO00o = true;
            }
        }
        return oooO0OO;
    }

    @Override // androidx.transition.OooOOO0
    public void captureEndValues(C22107OooOo0o c22107OooOo0o) {
        captureValues(c22107OooOo0o);
    }

    @Override // androidx.transition.OooOOO0
    public void captureStartValues(C22107OooOo0o c22107OooOo0o) {
        captureValues(c22107OooOo0o);
    }

    @Override // androidx.transition.OooOOO0
    public Animator createAnimator(ViewGroup viewGroup, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        OooO0OO visibilityChangeInfo = getVisibilityChangeInfo(c22107OooOo0o, c22107OooOo0o2);
        if (!visibilityChangeInfo.f66419OooO00o) {
            return null;
        }
        if (visibilityChangeInfo.f66424OooO0o0 == null && visibilityChangeInfo.f66423OooO0o == null) {
            return null;
        }
        return visibilityChangeInfo.f66420OooO0O0 ? onAppear(viewGroup, c22107OooOo0o, visibilityChangeInfo.f66421OooO0OO, c22107OooOo0o2, visibilityChangeInfo.f66422OooO0Oo) : onDisappear(viewGroup, c22107OooOo0o, visibilityChangeInfo.f66421OooO0OO, c22107OooOo0o2, visibilityChangeInfo.f66422OooO0Oo);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.OooOOO0
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.OooOOO0
    public boolean isTransitionRequired(C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        if (c22107OooOo0o == null && c22107OooOo0o2 == null) {
            return false;
        }
        if (c22107OooOo0o != null && c22107OooOo0o2 != null && c22107OooOo0o2.f66394OooO00o.containsKey(PROPNAME_VISIBILITY) != c22107OooOo0o.f66394OooO00o.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        OooO0OO visibilityChangeInfo = getVisibilityChangeInfo(c22107OooOo0o, c22107OooOo0o2);
        if (visibilityChangeInfo.f66419OooO00o) {
            return visibilityChangeInfo.f66421OooO0OO == 0 || visibilityChangeInfo.f66422OooO0Oo == 0;
        }
        return false;
    }

    public boolean isVisible(C22107OooOo0o c22107OooOo0o) {
        if (c22107OooOo0o == null) {
            return false;
        }
        HashMap map = c22107OooOo0o.f66394OooO00o;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        return null;
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    public Animator onAppear(ViewGroup viewGroup, C22107OooOo0o c22107OooOo0o, int i, C22107OooOo0o c22107OooOo0o2, int i2) {
        if ((this.mMode & 1) != 1 || c22107OooOo0o2 == null) {
            return null;
        }
        if (c22107OooOo0o == null) {
            View view = (View) c22107OooOo0o2.f66395OooO0O0.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f66419OooO00o) {
                return null;
            }
        }
        return onAppear(viewGroup, c22107OooOo0o2.f66395OooO0O0, c22107OooOo0o, c22107OooOo0o2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator onDisappear(ViewGroup viewGroup, C22107OooOo0o c22107OooOo0o, int i, C22107OooOo0o c22107OooOo0o2, int i2) {
        View view;
        boolean z;
        View view2;
        char c;
        Animator animator;
        int i3;
        View view3;
        ViewGroup viewGroup2;
        boolean z2;
        int i4;
        Bitmap bitmapCreateBitmap;
        if ((this.mMode & 2) != 2 || c22107OooOo0o == null) {
            return null;
        }
        View view4 = c22107OooOo0o.f66395OooO0O0;
        View view5 = c22107OooOo0o2 != null ? c22107OooOo0o2.f66395OooO0O0 : null;
        View view6 = (View) view4.getTag(R.id.save_overlay_view);
        int i5 = 1;
        if (view6 != null) {
            c = 1;
            animator = null;
            view3 = null;
            i3 = 0;
        } else {
            if (view5 == null || view5.getParent() == null) {
                if (view5 != null) {
                    view = null;
                    z = false;
                }
                z = true;
                view5 = null;
                view = null;
            } else {
                if (i2 == 4 || view4 == view5) {
                    view = view5;
                    view5 = null;
                    z = false;
                }
                z = true;
                view5 = null;
                view = null;
            }
            if (z) {
                if (view4.getParent() == null) {
                    view2 = view;
                    c = 1;
                    animator = null;
                    i3 = 0;
                } else {
                    if (view4.getParent() instanceof View) {
                        View view7 = (View) view4.getParent();
                        if (getVisibilityChangeInfo(getTransitionValues(view7, true), getMatchedTransitionValues(view7, true)).f66419OooO00o) {
                            view2 = view;
                            c = 1;
                            animator = null;
                            i3 = 0;
                            int id = view7.getId();
                            if (view7.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                            }
                            i5 = i3;
                            view3 = view2;
                        } else {
                            boolean z3 = C22106OooOo0O.f66393OooO00o;
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                            C22115Oooo00O c22115Oooo00O = C22110OooOoOO.f66401OooO00o;
                            c22115Oooo00O.OooO0Oo(view4, matrix);
                            c22115Oooo00O.OooO0o0(viewGroup, matrix);
                            animator = null;
                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            c = 1;
                            int iRound4 = Math.round(rectF.bottom);
                            i3 = 0;
                            ImageView imageView = new ImageView(view4.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            boolean zIsAttachedToWindow = view4.isAttachedToWindow();
                            boolean z4 = viewGroup != null && viewGroup.isAttachedToWindow();
                            if (zIsAttachedToWindow) {
                                viewGroup2 = null;
                                z2 = zIsAttachedToWindow;
                                i4 = 0;
                            } else if (z4) {
                                ViewGroup viewGroup3 = (ViewGroup) view4.getParent();
                                int iIndexOfChild = viewGroup3.indexOfChild(view4);
                                viewGroup.getOverlay().add(view4);
                                z2 = zIsAttachedToWindow;
                                i4 = iIndexOfChild;
                                viewGroup2 = viewGroup3;
                            } else {
                                bitmapCreateBitmap = null;
                                view2 = view;
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view6 = imageView;
                                i5 = i3;
                                view3 = view2;
                            }
                            view2 = view;
                            int iRound5 = Math.round(rectF.width());
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (C22106OooOo0O.f66393OooO00o) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view4.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = C22106OooOo0O.OooO00o.OooO00o(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view4.draw(canvas);
                                }
                            }
                            if (!z2) {
                                viewGroup.getOverlay().remove(view4);
                                viewGroup2.addView(view4, i4);
                            }
                            if (bitmapCreateBitmap != null) {
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view6 = imageView;
                            i5 = i3;
                            view3 = view2;
                        }
                    }
                    view6 = view5;
                    i5 = i3;
                    view3 = view2;
                }
                view6 = view4;
                i5 = i3;
                view3 = view2;
            } else {
                view2 = view;
                c = 1;
                animator = null;
                i3 = 0;
                view6 = view5;
                i5 = i3;
                view3 = view2;
            }
        }
        if (view6 == null) {
            if (view3 == null) {
                return animator;
            }
            int visibility = view3.getVisibility();
            C22110OooOoOO.OooO0O0(view3, i3);
            Animator animatorOnDisappear = onDisappear(viewGroup, view3, c22107OooOo0o, c22107OooOo0o2);
            if (animatorOnDisappear == null) {
                C22110OooOoOO.OooO0O0(view3, visibility);
                return animatorOnDisappear;
            }
            OooO00o oooO00o = new OooO00o(i2, view3);
            animatorOnDisappear.addListener(oooO00o);
            getRootTransition().addListener(oooO00o);
            return animatorOnDisappear;
        }
        if (i5 == 0) {
            int[] iArr = (int[]) c22107OooOo0o.f66394OooO00o.get(PROPNAME_SCREEN_LOCATION);
            int i6 = iArr[i3];
            int i7 = iArr[c];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view6.offsetLeftAndRight((i6 - iArr2[i3]) - view6.getLeft());
            view6.offsetTopAndBottom((i7 - iArr2[c]) - view6.getTop());
            viewGroup.getOverlay().add(view6);
        }
        Animator animatorOnDisappear2 = onDisappear(viewGroup, view6, c22107OooOo0o, c22107OooOo0o2);
        if (i5 == 0) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view6);
                return animatorOnDisappear2;
            }
            view4.setTag(R.id.save_overlay_view, view6);
            OooO0O0 oooO0O0 = new OooO0O0(viewGroup, view6, view4);
            animatorOnDisappear2.addListener(oooO0O0);
            animatorOnDisappear2.addPauseListener(oooO0O0);
            getRootTransition().addListener(oooO0O0);
        }
        return animatorOnDisappear2;
    }

    public Oooo0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C22096OooOO0o.f66351OooO0O0);
        int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }
}
