package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.WarningType;
import com.orion.notein.global.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22041OooOOo extends RecyclerView.OooOOO implements RecyclerView.InterfaceC22068OooOOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f65942OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f65946OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f65947OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f65948OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f65949OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f65950OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f65951OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f65952OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AbstractC22042OooO0Oo f65955OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f65956OooOOOO;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f65958OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f65959OooOOo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public GestureDetectorCompat f65961OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList f65962OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public VelocityTracker f65963OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ArrayList f65964OooOo0O;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C22043OooO0o0 f65967OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Rect f65968OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f65969OooOoo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f65943OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f65944OooO0O0 = new float[2];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public RecyclerView.AbstractC22078OooOooO f65945OooO0OO = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f65953OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f65954OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList f65957OooOOOo = new ArrayList();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO00o f65960OooOOoo = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f65965OooOo0o = null;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0O0 f65966OooOoO = new OooO0O0();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int iOooO;
            int iOooO2;
            C22041OooOOo c22041OooOOo = C22041OooOOo.this;
            if (c22041OooOOo.f65945OooO0OO != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = c22041OooOOo.f65969OooOoo0;
                long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                RecyclerView.OooOOOO layoutManager = c22041OooOOo.f65958OooOOo.getLayoutManager();
                if (c22041OooOOo.f65968OooOoOO == null) {
                    c22041OooOOo.f65968OooOoOO = new Rect();
                }
                layoutManager.calculateItemDecorationsForChild(c22041OooOOo.f65945OooO0OO.itemView, c22041OooOOo.f65968OooOoOO);
                if (layoutManager.canScrollHorizontally()) {
                    int i = (int) (c22041OooOOo.f65951OooOO0 + c22041OooOOo.f65950OooO0oo);
                    int paddingLeft = (i - c22041OooOOo.f65968OooOoOO.left) - c22041OooOOo.f65958OooOOo.getPaddingLeft();
                    float f = c22041OooOOo.f65950OooO0oo;
                    iOooO = ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((c22041OooOOo.f65945OooO0OO.itemView.getWidth() + i) + c22041OooOOo.f65968OooOoOO.right) - (c22041OooOOo.f65958OooOOo.getWidth() - c22041OooOOo.f65958OooOOo.getPaddingRight())) <= 0)) ? 0 : paddingLeft;
                }
                if (layoutManager.canScrollVertically()) {
                    int i2 = (int) (c22041OooOOo.f65952OooOO0O + c22041OooOOo.f65942OooO);
                    iOooO2 = (i2 - c22041OooOOo.f65968OooOoOO.top) - c22041OooOOo.f65958OooOOo.getPaddingTop();
                    float f2 = c22041OooOOo.f65942OooO;
                    if ((f2 >= 0.0f || iOooO2 >= 0) && (f2 <= 0.0f || (iOooO2 = ((c22041OooOOo.f65945OooO0OO.itemView.getHeight() + i2) + c22041OooOOo.f65968OooOoOO.bottom) - (c22041OooOOo.f65958OooOOo.getHeight() - c22041OooOOo.f65958OooOOo.getPaddingBottom())) <= 0)) {
                        iOooO2 = 0;
                    }
                }
                if (iOooO != 0) {
                    RecyclerView recyclerView = c22041OooOOo.f65958OooOOo;
                    int width = c22041OooOOo.f65945OooO0OO.itemView.getWidth();
                    c22041OooOOo.f65958OooOOo.getWidth();
                    iOooO = c22041OooOOo.f65955OooOOO0.OooO(recyclerView, width, iOooO, j2);
                }
                int i3 = iOooO;
                if (iOooO2 != 0) {
                    RecyclerView recyclerView2 = c22041OooOOo.f65958OooOOo;
                    int height = c22041OooOOo.f65945OooO0OO.itemView.getHeight();
                    c22041OooOOo.f65958OooOOo.getHeight();
                    iOooO2 = c22041OooOOo.f65955OooOOO0.OooO(recyclerView2, height, iOooO2, j2);
                }
                if (i3 == 0 && iOooO2 == 0) {
                    c22041OooOOo.f65969OooOoo0 = Long.MIN_VALUE;
                    return;
                }
                if (c22041OooOOo.f65969OooOoo0 == Long.MIN_VALUE) {
                    c22041OooOOo.f65969OooOoo0 = jCurrentTimeMillis;
                }
                c22041OooOOo.f65958OooOOo.scrollBy(i3, iOooO2);
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = c22041OooOOo.f65945OooO0OO;
                if (abstractC22078OooOooO != null) {
                    c22041OooOOo.OooOOO(abstractC22078OooOooO);
                }
                c22041OooOOo.f65958OooOOo.removeCallbacks(c22041OooOOo.f65960OooOOoo);
                ViewCompat.postOnAnimation(c22041OooOOo.f65958OooOOo, this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0O0 */
    public class OooO0O0 implements RecyclerView.InterfaceC22069OooOOoo {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final void OooO00o(RecyclerView recyclerView, MotionEvent motionEvent) {
            C22041OooOOo c22041OooOOo = C22041OooOOo.this;
            c22041OooOOo.f65961OooOo.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = c22041OooOOo.f65963OooOo00;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (c22041OooOOo.f65953OooOO0o == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(c22041OooOOo.f65953OooOO0o);
            if (iFindPointerIndex >= 0) {
                c22041OooOOo.OooO0oo(motionEvent, actionMasked, iFindPointerIndex);
            }
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = c22041OooOOo.f65945OooO0OO;
            if (abstractC22078OooOooO == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        c22041OooOOo.OooOOo0(motionEvent, c22041OooOOo.f65956OooOOOO, iFindPointerIndex);
                        c22041OooOOo.OooOOO(abstractC22078OooOooO);
                        RecyclerView recyclerView2 = c22041OooOOo.f65958OooOOo;
                        OooO00o oooO00o = c22041OooOOo.f65960OooOOoo;
                        recyclerView2.removeCallbacks(oooO00o);
                        oooO00o.run();
                        c22041OooOOo.f65958OooOOo.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == c22041OooOOo.f65953OooOO0o) {
                        c22041OooOOo.f65953OooOO0o = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        c22041OooOOo.OooOOo0(motionEvent, c22041OooOOo.f65956OooOOOO, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c22041OooOOo.f65963OooOo00;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            c22041OooOOo.OooOOOo(null, 0);
            c22041OooOOo.f65953OooOO0o = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final boolean OooO0OO(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            C22041OooOOo c22041OooOOo = C22041OooOOo.this;
            c22041OooOOo.f65961OooOo.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            OooO0o oooO0o = null;
            if (actionMasked == 0) {
                c22041OooOOo.f65953OooOO0o = motionEvent.getPointerId(0);
                c22041OooOOo.f65946OooO0Oo = motionEvent.getX();
                c22041OooOOo.f65948OooO0o0 = motionEvent.getY();
                VelocityTracker velocityTracker = c22041OooOOo.f65963OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c22041OooOOo.f65963OooOo00 = VelocityTracker.obtain();
                if (c22041OooOOo.f65945OooO0OO == null) {
                    ArrayList arrayList = c22041OooOOo.f65957OooOOOo;
                    if (!arrayList.isEmpty()) {
                        View viewOooOO0O = c22041OooOOo.OooOO0O(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            OooO0o oooO0o2 = (OooO0o) arrayList.get(size);
                            if (oooO0o2.f65984OooO0o0.itemView == viewOooOO0O) {
                                oooO0o = oooO0o2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (oooO0o != null) {
                        c22041OooOOo.f65946OooO0Oo -= oooO0o.f65978OooO;
                        c22041OooOOo.f65948OooO0o0 -= oooO0o.f65987OooOO0;
                        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = oooO0o.f65984OooO0o0;
                        c22041OooOOo.OooOO0(abstractC22078OooOooO, true);
                        if (c22041OooOOo.f65943OooO00o.remove(abstractC22078OooOooO.itemView)) {
                            c22041OooOOo.f65955OooOOO0.OooO0OO(c22041OooOOo.f65958OooOOo, abstractC22078OooOooO);
                        }
                        c22041OooOOo.OooOOOo(abstractC22078OooOooO, oooO0o.f65983OooO0o);
                        c22041OooOOo.OooOOo0(motionEvent, c22041OooOOo.f65956OooOOOO, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                c22041OooOOo.f65953OooOO0o = -1;
                c22041OooOOo.OooOOOo(null, 0);
            } else {
                int i = c22041OooOOo.f65953OooOO0o;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    c22041OooOOo.OooO0oo(motionEvent, actionMasked, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = c22041OooOOo.f65963OooOo00;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return c22041OooOOo.f65945OooO0OO != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final void OooO0o0(boolean z) {
            if (z) {
                C22041OooOOo.this.OooOOOo(null, 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0OO */
    public class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f65972OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.AbstractC22078OooOooO f65973OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, float f, float f2, float f3, float f4, int i2, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2) {
            super(abstractC22078OooOooO, i, f, f2, f3, f4);
            this.f65972OooOOO = i2;
            this.f65973OooOOOO = abstractC22078OooOooO2;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.OooO0o, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f65988OooOO0O) {
                return;
            }
            int i = this.f65972OooOOO;
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65973OooOOOO;
            C22041OooOOo c22041OooOOo = C22041OooOOo.this;
            if (i <= 0) {
                c22041OooOOo.f65955OooOOO0.OooO0OO(c22041OooOOo.f65958OooOOo, abstractC22078OooOooO);
            } else {
                c22041OooOOo.f65943OooO00o.add(abstractC22078OooOooO.itemView);
                this.f65986OooO0oo = true;
                if (i > 0) {
                    c22041OooOOo.f65958OooOOo.post(new RunnableC22047OooOOoo(c22041OooOOo, this, i));
                }
            }
            View view = c22041OooOOo.f65965OooOo0o;
            View view2 = abstractC22078OooOooO.itemView;
            if (view == view2) {
                c22041OooOOo.OooOOOO(view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC22042OooO0Oo {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f65975OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f65976OooO0OO = new OooO0O0();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f65977OooO00o;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0Oo$OooO00o */
        public class OooO00o implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0Oo$OooO0O0 */
        public class OooO0O0 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int OooO0Oo(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public static int OooO0o0(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int OooOO0O(int i) {
            return i | (i << 16);
        }

        public final int OooO(RecyclerView recyclerView, int i, int i2, long j) {
            if (this.f65977OooO00o == -1) {
                this.f65977OooO00o = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (f65975OooO0O0.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f65976OooO0OO.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f65977OooO00o)));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public boolean OooO00o(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2) {
            return true;
        }

        public RecyclerView.AbstractC22078OooOooO OooO0O0(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, ArrayList arrayList, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = abstractC22078OooOooO.itemView.getWidth() + i;
            int height = abstractC22078OooOooO.itemView.getHeight() + i2;
            int left2 = i - abstractC22078OooOooO.itemView.getLeft();
            int top2 = i2 - abstractC22078OooOooO.itemView.getTop();
            int size = arrayList.size();
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO3 = (RecyclerView.AbstractC22078OooOooO) arrayList.get(i4);
                if (left2 > 0 && (right = abstractC22078OooOooO3.itemView.getRight() - width) < 0 && abstractC22078OooOooO3.itemView.getRight() > abstractC22078OooOooO.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    abstractC22078OooOooO2 = abstractC22078OooOooO3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = abstractC22078OooOooO3.itemView.getLeft() - i) > 0 && abstractC22078OooOooO3.itemView.getLeft() < abstractC22078OooOooO.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    abstractC22078OooOooO2 = abstractC22078OooOooO3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = abstractC22078OooOooO3.itemView.getTop() - i2) > 0 && abstractC22078OooOooO3.itemView.getTop() < abstractC22078OooOooO.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    abstractC22078OooOooO2 = abstractC22078OooOooO3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = abstractC22078OooOooO3.itemView.getBottom() - height) < 0 && abstractC22078OooOooO3.itemView.getBottom() > abstractC22078OooOooO.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    abstractC22078OooOooO2 = abstractC22078OooOooO3;
                    i3 = iAbs;
                }
            }
            return abstractC22078OooOooO2;
        }

        public void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
            View view = abstractC22078OooOooO.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                ViewCompat.setElevation(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int OooO0o() {
            return 0;
        }

        public float OooO0oO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
            return 0.5f;
        }

        public abstract int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO);

        public boolean OooOO0() {
            return true;
        }

        public void OooOO0o(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, float f, float f2, int i, boolean z) {
            View view = abstractC22078OooOooO.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float fValueOf = Float.valueOf(ViewCompat.getElevation(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        float elevation = ViewCompat.getElevation(childAt);
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                ViewCompat.setElevation(view, f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void OooOOO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        }

        public abstract boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2);

        public abstract void OooOOOO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0o */
    public static class OooO0o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f65978OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f65979OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f65980OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f65981OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f65982OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f65983OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final RecyclerView.AbstractC22078OooOooO f65984OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final ValueAnimator f65985OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f65986OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f65987OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f65988OooOO0O = false;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f65989OooOO0o = false;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f65990OooOOO0;

        public OooO0o(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, float f, float f2, float f3, float f4) {
            this.f65983OooO0o = i;
            this.f65984OooO0o0 = abstractC22078OooOooO;
            this.f65979OooO00o = f;
            this.f65980OooO0O0 = f2;
            this.f65981OooO0OO = f3;
            this.f65982OooO0Oo = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f65985OooO0oO = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new OooOo00(this));
            valueAnimatorOfFloat.setTarget(abstractC22078OooOooO.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.f65990OooOOO0 = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f65990OooOOO0 = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f65989OooOO0o) {
                this.f65984OooO0o0.setIsRecyclable(true);
            }
            this.f65989OooOO0o = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0o0, reason: case insensitive filesystem */
    public class C22043OooO0o0 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f65991OooO00o = true;

        public C22043OooO0o0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            C22041OooOOo c22041OooOOo;
            View viewOooOO0O;
            RecyclerView.AbstractC22078OooOooO childViewHolder;
            if (!this.f65991OooO00o || (viewOooOO0O = (c22041OooOOo = C22041OooOOo.this).OooOO0O(motionEvent)) == null || (childViewHolder = c22041OooOOo.f65958OooOOo.getChildViewHolder(viewOooOO0O)) == null) {
                return;
            }
            AbstractC22042OooO0Oo abstractC22042OooO0Oo = c22041OooOOo.f65955OooOOO0;
            RecyclerView recyclerView = c22041OooOOo.f65958OooOOo;
            if ((AbstractC22042OooO0Oo.OooO0Oo(abstractC22042OooO0Oo.OooO0oo(recyclerView, childViewHolder), ViewCompat.getLayoutDirection(recyclerView)) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = c22041OooOOo.f65953OooOO0o;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    c22041OooOOo.f65946OooO0Oo = x;
                    c22041OooOOo.f65948OooO0o0 = y;
                    c22041OooOOo.f65942OooO = 0.0f;
                    c22041OooOOo.f65950OooO0oo = 0.0f;
                    if (c22041OooOOo.f65955OooOOO0.OooOO0()) {
                        c22041OooOOo.OooOOOo(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0oO, reason: case insensitive filesystem */
    public static abstract class AbstractC22044OooO0oO extends AbstractC22042OooO0Oo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f65993OooO0Oo;

        public AbstractC22044OooO0oO(int i) {
            this.f65977OooO00o = -1;
            this.f65993OooO0Oo = i;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
            return AbstractC22042OooO0Oo.OooOO0O(this.f65993OooO0Oo);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOo$OooO0oo, reason: case insensitive filesystem */
    public interface InterfaceC22045OooO0oo {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    public C22041OooOOo(AbstractC22042OooO0Oo abstractC22042OooO0Oo) {
        this.f65955OooOOO0 = abstractC22042OooO0Oo;
    }

    public static boolean OooOOO0(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final int OooO(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f65942OooO > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f65963OooOo00;
        AbstractC22042OooO0Oo abstractC22042OooO0Oo = this.f65955OooOOO0;
        if (velocityTracker != null && this.f65953OooOO0o > -1) {
            float f = this.f65949OooO0oO;
            abstractC22042OooO0Oo.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f65963OooOo00.getXVelocity(this.f65953OooOO0o);
            float yVelocity = this.f65963OooOo00.getYVelocity(this.f65953OooOO0o);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f65947OooO0o && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f65958OooOOo.getHeight();
        abstractC22042OooO0Oo.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f65942OooO) <= f2) {
            return 0;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22068OooOOo0
    public final void OooO0O0(View view) {
        OooOOOO(view);
        RecyclerView.AbstractC22078OooOooO childViewHolder = this.f65958OooOOo.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65945OooO0OO;
        if (abstractC22078OooOooO != null && childViewHolder == abstractC22078OooOooO) {
            OooOOOo(null, 0);
            return;
        }
        OooOO0(childViewHolder, false);
        if (this.f65943OooO00o.remove(childViewHolder.itemView)) {
            this.f65955OooOOO0.OooO0OO(this.f65958OooOOo, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22068OooOOo0
    public final void OooO0Oo(View view) {
    }

    public final void OooO0o(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f65958OooOOo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        OooO0O0 oooO0O0 = this.f65966OooOoO;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f65958OooOOo.removeOnItemTouchListener(oooO0O0);
            this.f65958OooOOo.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f65957OooOOOo;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                OooO0o oooO0o = (OooO0o) arrayList.get(0);
                oooO0o.f65985OooO0oO.cancel();
                this.f65955OooOOO0.OooO0OO(this.f65958OooOOo, oooO0o.f65984OooO0o0);
            }
            arrayList.clear();
            this.f65965OooOo0o = null;
            VelocityTracker velocityTracker = this.f65963OooOo00;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f65963OooOo00 = null;
            }
            C22043OooO0o0 c22043OooO0o0 = this.f65967OooOoO0;
            if (c22043OooO0o0 != null) {
                c22043OooO0o0.f65991OooO00o = false;
                this.f65967OooOoO0 = null;
            }
            if (this.f65961OooOo != null) {
                this.f65961OooOo = null;
            }
        }
        this.f65958OooOOo = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f65947OooO0o = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f65949OooO0oO = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f65959OooOOo0 = ViewConfiguration.get(this.f65958OooOOo.getContext()).getScaledTouchSlop();
            this.f65958OooOOo.addItemDecoration(this);
            this.f65958OooOOo.addOnItemTouchListener(oooO0O0);
            this.f65958OooOOo.addOnChildAttachStateChangeListener(this);
            this.f65967OooOoO0 = new C22043OooO0o0();
            this.f65961OooOo = new GestureDetectorCompat(this.f65958OooOOo.getContext(), this.f65967OooOoO0);
        }
    }

    public final int OooO0oO(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f65950OooO0oo > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f65963OooOo00;
        AbstractC22042OooO0Oo abstractC22042OooO0Oo = this.f65955OooOOO0;
        if (velocityTracker != null && this.f65953OooOO0o > -1) {
            float f = this.f65949OooO0oO;
            abstractC22042OooO0Oo.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f65963OooOo00.getXVelocity(this.f65953OooOO0o);
            float yVelocity = this.f65963OooOo00.getYVelocity(this.f65953OooOO0o);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f65947OooO0o && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f65958OooOOo.getWidth();
        abstractC22042OooO0Oo.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f65950OooO0oo) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void OooO0oo(MotionEvent motionEvent, int i, int i2) {
        View viewOooOO0O;
        if (this.f65945OooO0OO == null && i == 2 && this.f65954OooOOO != 2) {
            AbstractC22042OooO0Oo abstractC22042OooO0Oo = this.f65955OooOOO0;
            abstractC22042OooO0Oo.getClass();
            if (this.f65958OooOOo.getScrollState() == 1) {
                return;
            }
            RecyclerView.OooOOOO layoutManager = this.f65958OooOOo.getLayoutManager();
            int i3 = this.f65953OooOO0o;
            RecyclerView.AbstractC22078OooOooO childViewHolder = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.f65946OooO0Oo;
                float y = motionEvent.getY(iFindPointerIndex) - this.f65948OooO0o0;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.f65959OooOOo0;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewOooOO0O = OooOO0O(motionEvent)) != null))) {
                    childViewHolder = this.f65958OooOOo.getChildViewHolder(viewOooOO0O);
                }
            }
            if (childViewHolder == null) {
                return;
            }
            RecyclerView recyclerView = this.f65958OooOOo;
            int iOooO0Oo = (AbstractC22042OooO0Oo.OooO0Oo(abstractC22042OooO0Oo.OooO0oo(recyclerView, childViewHolder), ViewCompat.getLayoutDirection(recyclerView)) & 65280) >> 8;
            if (iOooO0Oo == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.f65946OooO0Oo;
            float f3 = y2 - this.f65948OooO0o0;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.f65959OooOOo0;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iOooO0Oo & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iOooO0Oo & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iOooO0Oo & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iOooO0Oo & 2) == 0) {
                        return;
                    }
                }
                this.f65942OooO = 0.0f;
                this.f65950OooO0oo = 0.0f;
                this.f65953OooOO0o = motionEvent.getPointerId(0);
                OooOOOo(childViewHolder, 1);
            }
        }
    }

    public final void OooOO0(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, boolean z) {
        ArrayList arrayList = this.f65957OooOOOo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooO0o oooO0o = (OooO0o) arrayList.get(size);
            if (oooO0o.f65984OooO0o0 == abstractC22078OooOooO) {
                oooO0o.f65988OooOO0O |= z;
                if (!oooO0o.f65989OooOO0o) {
                    oooO0o.f65985OooO0oO.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View OooOO0O(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65945OooO0OO;
        if (abstractC22078OooOooO != null) {
            View view = abstractC22078OooOooO.itemView;
            if (OooOOO0(view, x, y, this.f65951OooOO0 + this.f65950OooO0oo, this.f65952OooOO0O + this.f65942OooO)) {
                return view;
            }
        }
        ArrayList arrayList = this.f65957OooOOOo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooO0o oooO0o = (OooO0o) arrayList.get(size);
            View view2 = oooO0o.f65984OooO0o0.itemView;
            if (OooOOO0(view2, x, y, oooO0o.f65978OooO, oooO0o.f65987OooOO0)) {
                return view2;
            }
        }
        return this.f65958OooOOo.findChildViewUnder(x, y);
    }

    public final void OooOO0o(float[] fArr) {
        if ((this.f65956OooOOOO & 12) != 0) {
            fArr[0] = (this.f65951OooOO0 + this.f65950OooO0oo) - this.f65945OooO0OO.itemView.getLeft();
        } else {
            fArr[0] = this.f65945OooO0OO.itemView.getTranslationX();
        }
        if ((this.f65956OooOOOO & 3) != 0) {
            fArr[1] = (this.f65952OooOO0O + this.f65942OooO) - this.f65945OooO0OO.itemView.getTop();
        } else {
            fArr[1] = this.f65945OooO0OO.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        int i;
        int i2;
        int i3;
        if (this.f65958OooOOo.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.f65954OooOOO != 2) {
            return;
        }
        AbstractC22042OooO0Oo abstractC22042OooO0Oo = this.f65955OooOOO0;
        float fOooO0oO = abstractC22042OooO0Oo.OooO0oO(abstractC22078OooOooO);
        int i4 = (int) (this.f65951OooOO0 + this.f65950OooO0oo);
        int i5 = (int) (this.f65952OooOO0O + this.f65942OooO);
        if (Math.abs(i5 - abstractC22078OooOooO.itemView.getTop()) >= abstractC22078OooOooO.itemView.getHeight() * fOooO0oO || Math.abs(i4 - abstractC22078OooOooO.itemView.getLeft()) >= abstractC22078OooOooO.itemView.getWidth() * fOooO0oO) {
            ArrayList arrayList = this.f65962OooOo0;
            if (arrayList == null) {
                this.f65962OooOo0 = new ArrayList();
                this.f65964OooOo0O = new ArrayList();
            } else {
                arrayList.clear();
                this.f65964OooOo0O.clear();
            }
            int iOooO0o = abstractC22042OooO0Oo.OooO0o();
            int iRound = Math.round(this.f65951OooOO0 + this.f65950OooO0oo) - iOooO0o;
            int iRound2 = Math.round(this.f65952OooOO0O + this.f65942OooO) - iOooO0o;
            int i6 = iOooO0o * 2;
            int width = abstractC22078OooOooO.itemView.getWidth() + iRound + i6;
            int height = abstractC22078OooOooO.itemView.getHeight() + iRound2 + i6;
            int i7 = (iRound + width) / 2;
            int i8 = (iRound2 + height) / 2;
            RecyclerView.OooOOOO layoutManager = this.f65958OooOOo.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                char c2 = c;
                View childAt = layoutManager.getChildAt(i9);
                if (childAt != abstractC22078OooOooO.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                    RecyclerView.AbstractC22078OooOooO childViewHolder = this.f65958OooOOo.getChildViewHolder(childAt);
                    i = i7;
                    if (abstractC22042OooO0Oo.OooO00o(this.f65958OooOOo, this.f65945OooO0OO, childViewHolder)) {
                        int iAbs = Math.abs(i - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int iAbs2 = Math.abs(i8 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i10 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                        int size = this.f65962OooOo0.size();
                        i2 = iRound;
                        i3 = iRound2;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < size) {
                            int i13 = size;
                            if (i10 <= ((Integer) this.f65964OooOo0O.get(i11)).intValue()) {
                                break;
                            }
                            i12++;
                            i11++;
                            size = i13;
                        }
                        this.f65962OooOo0.add(i12, childViewHolder);
                        this.f65964OooOo0O.add(i12, Integer.valueOf(i10));
                    }
                    i9++;
                    c = c2;
                    iRound = i2;
                    i7 = i;
                    iRound2 = i3;
                } else {
                    i = i7;
                }
                i2 = iRound;
                i3 = iRound2;
                i9++;
                c = c2;
                iRound = i2;
                i7 = i;
                iRound2 = i3;
            }
            ArrayList arrayList2 = this.f65962OooOo0;
            if (arrayList2.size() == 0) {
                return;
            }
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOOooO0O0 = abstractC22042OooO0Oo.OooO0O0(abstractC22078OooOooO, arrayList2, i4, i5);
            if (abstractC22078OooOooOOooO0O0 == null) {
                this.f65962OooOo0.clear();
                this.f65964OooOo0O.clear();
                return;
            }
            int absoluteAdapterPosition = abstractC22078OooOooOOooO0O0.getAbsoluteAdapterPosition();
            abstractC22078OooOooO.getAbsoluteAdapterPosition();
            if (abstractC22042OooO0Oo.OooOOO0(this.f65958OooOOo, abstractC22078OooOooO, abstractC22078OooOooOOooO0O0)) {
                RecyclerView recyclerView = this.f65958OooOOo;
                RecyclerView.OooOOOO layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 instanceof InterfaceC22045OooO0oo) {
                    ((InterfaceC22045OooO0oo) layoutManager2).prepareForDrop(abstractC22078OooOooO.itemView, abstractC22078OooOooOOooO0O0.itemView, i4, i5);
                    return;
                }
                if (layoutManager2.canScrollHorizontally()) {
                    if (layoutManager2.getDecoratedLeft(abstractC22078OooOooOOooO0O0.itemView) <= recyclerView.getPaddingLeft()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    if (layoutManager2.getDecoratedRight(abstractC22078OooOooOOooO0O0.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
                if (layoutManager2.canScrollVertically()) {
                    if (layoutManager2.getDecoratedTop(abstractC22078OooOooOOooO0O0.itemView) <= recyclerView.getPaddingTop()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                    if (layoutManager2.getDecoratedBottom(abstractC22078OooOooOOooO0O0.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                        recyclerView.scrollToPosition(absoluteAdapterPosition);
                    }
                }
            }
        }
    }

    public final void OooOOOO(View view) {
        if (view == this.f65965OooOo0o) {
            this.f65965OooOo0o = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.OooOOo$OooO0Oo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.RecyclerView$OooOooO] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.recyclerview.widget.OooOOo$OooO0Oo] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.recyclerview.widget.OooOOo$OooO0Oo] */
    /* JADX WARN: Type inference failed for: r3v4 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOOo(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r122;
        ?? r32;
        int iOooO;
        VelocityTracker velocityTracker;
        char c;
        float fSignum;
        if (abstractC22078OooOooO == this.f65945OooO0OO && i == this.f65954OooOOO) {
            return;
        }
        this.f65969OooOoo0 = Long.MIN_VALUE;
        int i2 = this.f65954OooOOO;
        OooOO0(abstractC22078OooOooO, true);
        this.f65954OooOOO = i;
        if (i == 2) {
            if (abstractC22078OooOooO == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f65965OooOo0o = abstractC22078OooOooO.itemView;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f65945OooO0OO;
        ?? r0 = this.f65955OooOOO0;
        if (r2 != 0) {
            if (r2.itemView.getParent() == null) {
                r122 = 0;
                OooOOOO(r2.itemView);
                ?? r33 = r0;
                r33.OooO0OO(this.f65958OooOOo, r2);
                z = false;
                r32 = r33;
            } else if (i2 != 2 && this.f65954OooOOO != 2) {
                int iOooO0oo = r0.OooO0oo(this.f65958OooOOo, r2);
                int iOooO0Oo = (AbstractC22042OooO0Oo.OooO0Oo(iOooO0oo, ViewCompat.getLayoutDirection(this.f65958OooOOo)) & 65280) >> 8;
                if (iOooO0Oo == 0) {
                    iOooO = 0;
                    velocityTracker = this.f65963OooOo00;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f65963OooOo00 = null;
                    }
                    char c2 = 4;
                    float fSignum2 = 0.0f;
                    if (iOooO == 1 || iOooO == 2) {
                        c = 0;
                        fSignum = Math.signum(this.f65942OooO) * this.f65958OooOOo.getHeight();
                    } else if (iOooO == 4 || iOooO == 8 || iOooO == 16 || iOooO == 32) {
                        c = 0;
                        fSignum = 0.0f;
                        fSignum2 = Math.signum(this.f65950OooO0oo) * this.f65958OooOOo.getWidth();
                    } else {
                        fSignum = 0.0f;
                        c = 0;
                    }
                    if (i2 != 2) {
                        c2 = '\b';
                    } else if (iOooO > 0) {
                        c2 = 2;
                    }
                    float[] fArr = this.f65944OooO0O0;
                    OooOO0o(fArr);
                    char c3 = c2;
                    ?? r123 = c;
                    OooO0OO oooO0OO = new OooO0OO(r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iOooO, r2);
                    RecyclerView recyclerView = this.f65958OooOOo;
                    r0.getClass();
                    RecyclerView.AbstractC22064OooOO0o itemAnimator = recyclerView.getItemAnimator();
                    long j = itemAnimator != null ? c3 == '\b' ? 200L : 250L : c3 == '\b' ? itemAnimator.f66061OooO0o0 : itemAnimator.f66059OooO0Oo;
                    ValueAnimator valueAnimator = oooO0OO.f65985OooO0oO;
                    valueAnimator.setDuration(j);
                    this.f65957OooOOOo.add(oooO0OO);
                    r2.setIsRecyclable(r123);
                    valueAnimator.start();
                    r32 = r0;
                    z = true;
                    r122 = r123;
                } else {
                    int i4 = (iOooO0oo & 65280) >> 8;
                    if (Math.abs(this.f65950OooO0oo) > Math.abs(this.f65942OooO)) {
                        iOooO = OooO0oO(iOooO0Oo);
                        if (iOooO <= 0) {
                            iOooO = OooO(iOooO0Oo);
                            if (iOooO <= 0) {
                            }
                        } else if ((i4 & iOooO) == 0) {
                            iOooO = AbstractC22042OooO0Oo.OooO0o0(iOooO, ViewCompat.getLayoutDirection(this.f65958OooOOo));
                        }
                        velocityTracker = this.f65963OooOo00;
                        if (velocityTracker != null) {
                        }
                        char c22 = 4;
                        float fSignum22 = 0.0f;
                        if (iOooO == 1) {
                            c = 0;
                            fSignum = Math.signum(this.f65942OooO) * this.f65958OooOOo.getHeight();
                            if (i2 != 2) {
                            }
                            float[] fArr2 = this.f65944OooO0O0;
                            OooOO0o(fArr2);
                            char c32 = c22;
                            ?? r1232 = c;
                            OooO0OO oooO0OO2 = new OooO0OO(r2, i2, fArr2[c], fArr2[1], fSignum22, fSignum, iOooO, r2);
                            RecyclerView recyclerView2 = this.f65958OooOOo;
                            r0.getClass();
                            RecyclerView.AbstractC22064OooOO0o itemAnimator2 = recyclerView2.getItemAnimator();
                            if (itemAnimator2 != null) {
                            }
                            ValueAnimator valueAnimator2 = oooO0OO2.f65985OooO0oO;
                            valueAnimator2.setDuration(j);
                            this.f65957OooOOOo.add(oooO0OO2);
                            r2.setIsRecyclable(r1232);
                            valueAnimator2.start();
                            r32 = r0;
                            z = true;
                            r122 = r1232;
                        }
                    } else {
                        iOooO = OooO(iOooO0Oo);
                        if (iOooO <= 0) {
                            iOooO = OooO0oO(iOooO0Oo);
                            if (iOooO > 0) {
                                if ((i4 & iOooO) == 0) {
                                    iOooO = AbstractC22042OooO0Oo.OooO0o0(iOooO, ViewCompat.getLayoutDirection(this.f65958OooOOo));
                                }
                            }
                        }
                        velocityTracker = this.f65963OooOo00;
                        if (velocityTracker != null) {
                        }
                        char c222 = 4;
                        float fSignum222 = 0.0f;
                        if (iOooO == 1) {
                        }
                    }
                }
            }
            this.f65945OooO0OO = null;
            r3 = r32;
            r12 = r122;
        } else {
            r3 = r0;
            r12 = 0;
            z = false;
        }
        if (abstractC22078OooOooO != null) {
            RecyclerView recyclerView3 = this.f65958OooOOo;
            this.f65956OooOOOO = (AbstractC22042OooO0Oo.OooO0Oo(r3.OooO0oo(recyclerView3, abstractC22078OooOooO), ViewCompat.getLayoutDirection(recyclerView3)) & i3) >> (this.f65954OooOOO * 8);
            this.f65951OooOO0 = abstractC22078OooOooO.itemView.getLeft();
            this.f65952OooOO0O = abstractC22078OooOooO.itemView.getTop();
            this.f65945OooO0OO = abstractC22078OooOooO;
            if (i == 2) {
                abstractC22078OooOooO.itemView.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f65958OooOOo.getParent();
        if (parent != 0) {
            ?? r124 = r12;
            if (this.f65945OooO0OO != null) {
                r124 = 1;
            }
            parent.requestDisallowInterceptTouchEvent(r124);
        }
        if (!z) {
            this.f65958OooOOo.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        r3.OooOOO(this.f65945OooO0OO, this.f65954OooOOO);
        this.f65958OooOOo.invalidate();
    }

    public final void OooOOo0(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f65946OooO0Oo;
        this.f65950OooO0oo = f;
        this.f65942OooO = y - this.f65948OooO0o0;
        if ((i & 4) == 0) {
            this.f65950OooO0oo = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f65950OooO0oo = Math.min(0.0f, this.f65950OooO0oo);
        }
        if ((i & 1) == 0) {
            this.f65942OooO = Math.max(0.0f, this.f65942OooO);
        }
        if ((i & 2) == 0) {
            this.f65942OooO = Math.min(0.0f, this.f65942OooO);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        float f;
        float f2;
        if (this.f65945OooO0OO != null) {
            float[] fArr = this.f65944OooO0O0;
            OooOO0o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65945OooO0OO;
        ArrayList arrayList = this.f65957OooOOOo;
        int i = this.f65954OooOOO;
        AbstractC22042OooO0Oo abstractC22042OooO0Oo = this.f65955OooOOO0;
        abstractC22042OooO0Oo.getClass();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO0o oooO0o = (OooO0o) arrayList.get(i2);
            float f4 = oooO0o.f65979OooO00o;
            float f5 = oooO0o.f65981OooO0OO;
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2 = oooO0o.f65984OooO0o0;
            if (f4 == f5) {
                oooO0o.f65978OooO = abstractC22078OooOooO2.itemView.getTranslationX();
            } else {
                oooO0o.f65978OooO = OooOO0.OooO0OO.OooO0O0(f5, f4, oooO0o.f65990OooOOO0, f4);
            }
            float f6 = oooO0o.f65980OooO0O0;
            float f7 = oooO0o.f65982OooO0Oo;
            if (f6 == f7) {
                oooO0o.f65987OooOO0 = abstractC22078OooOooO2.itemView.getTranslationY();
            } else {
                oooO0o.f65987OooOO0 = OooOO0.OooO0OO.OooO0O0(f7, f6, oooO0o.f65990OooOOO0, f6);
            }
            int iSave = canvas.save();
            abstractC22042OooO0Oo.OooOO0o(canvas, recyclerView, oooO0o.f65984OooO0o0, oooO0o.f65978OooO, oooO0o.f65987OooOO0, oooO0o.f65983OooO0o, false);
            canvas.restoreToCount(iSave);
        }
        if (abstractC22078OooOooO != null) {
            int iSave2 = canvas.save();
            abstractC22042OooO0Oo.OooOO0o(canvas, recyclerView, abstractC22078OooOooO, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        boolean z = false;
        if (this.f65945OooO0OO != null) {
            float[] fArr = this.f65944OooO0O0;
            OooOO0o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65945OooO0OO;
        ArrayList arrayList = this.f65957OooOOOo;
        this.f65955OooOOO0.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooO0o oooO0o = (OooO0o) arrayList.get(i);
            int iSave = canvas.save();
            View view = oooO0o.f65984OooO0o0.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC22078OooOooO != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            OooO0o oooO0o2 = (OooO0o) arrayList.get(i2);
            boolean z2 = oooO0o2.f65989OooOO0o;
            if (z2 && !oooO0o2.f65986OooO0oo) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
