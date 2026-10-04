package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22039OooOOOo extends RecyclerView.OooOOO implements RecyclerView.InterfaceC22069OooOOoo {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f65907OooOoo = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f65908OooOooO = new int[0];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f65909OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f65910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f65911OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StateListDrawable f65912OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Drawable f65913OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f65914OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f65915OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final StateListDrawable f65916OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Drawable f65917OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f65918OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f65919OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f65920OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f65921OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f65922OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f65923OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f65924OooOOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final RecyclerView f65927OooOOoo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ValueAnimator f65933OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f65935OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o f65936OooOoo0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f65926OooOOo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f65925OooOOo = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f65930OooOo00 = false;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f65929OooOo0 = false;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f65931OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f65932OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int[] f65928OooOo = new int[2];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int[] f65934OooOoO0 = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOOo$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C22039OooOOOo c22039OooOOOo = C22039OooOOOo.this;
            int i = c22039OooOOOo.f65935OooOoOO;
            ValueAnimator valueAnimator = c22039OooOOOo.f65933OooOoO;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            c22039OooOOOo.f65935OooOoOO = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOOo$OooO0O0 */
    public class OooO0O0 extends RecyclerView.OooOo00 {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            C22039OooOOOo c22039OooOOOo = C22039OooOOOo.this;
            int iComputeVerticalScrollRange = c22039OooOOOo.f65927OooOOoo.computeVerticalScrollRange();
            int i3 = c22039OooOOOo.f65925OooOOo;
            int i4 = iComputeVerticalScrollRange - i3;
            int i5 = c22039OooOOOo.f65910OooO00o;
            c22039OooOOOo.f65930OooOo00 = i4 > 0 && i3 >= i5;
            int iComputeHorizontalScrollRange = c22039OooOOOo.f65927OooOOoo.computeHorizontalScrollRange();
            int i6 = c22039OooOOOo.f65926OooOOo0;
            boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
            c22039OooOOOo.f65929OooOo0 = z;
            boolean z2 = c22039OooOOOo.f65930OooOo00;
            if (!z2 && !z) {
                if (c22039OooOOOo.f65931OooOo0O != 0) {
                    c22039OooOOOo.OooO(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                c22039OooOOOo.f65920OooOO0o = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                c22039OooOOOo.f65919OooOO0O = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (c22039OooOOOo.f65929OooOo0) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i6;
                c22039OooOOOo.f65923OooOOOO = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                c22039OooOOOo.f65921OooOOO = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
            }
            int i7 = c22039OooOOOo.f65931OooOo0O;
            if (i7 == 0 || i7 == 1) {
                c22039OooOOOo.OooO(1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOOo$OooO0OO */
    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f65939OooO00o = false;

        public OooO0OO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f65939OooO00o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f65939OooO00o) {
                this.f65939OooO00o = false;
                return;
            }
            C22039OooOOOo c22039OooOOOo = C22039OooOOOo.this;
            if (((Float) c22039OooOOOo.f65933OooOoO.getAnimatedValue()).floatValue() == 0.0f) {
                c22039OooOOOo.f65935OooOoOO = 0;
                c22039OooOOOo.OooO(0);
            } else {
                c22039OooOOOo.f65935OooOoOO = 2;
                c22039OooOOOo.f65927OooOOoo.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOOo$OooO0Oo, reason: case insensitive filesystem */
    public class C22040OooO0Oo implements ValueAnimator.AnimatorUpdateListener {
        public C22040OooO0Oo() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C22039OooOOOo c22039OooOOOo = C22039OooOOOo.this;
            c22039OooOOOo.f65912OooO0OO.setAlpha(iFloatValue);
            c22039OooOOOo.f65913OooO0Oo.setAlpha(iFloatValue);
            c22039OooOOOo.f65927OooOOoo.invalidate();
        }
    }

    public C22039OooOOOo(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f65933OooOoO = valueAnimatorOfFloat;
        this.f65935OooOoOO = 0;
        OooO00o oooO00o = new OooO00o();
        this.f65936OooOoo0 = oooO00o;
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f65912OooO0OO = stateListDrawable;
        this.f65913OooO0Oo = drawable;
        this.f65916OooO0oO = stateListDrawable2;
        this.f65917OooO0oo = drawable2;
        this.f65915OooO0o0 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f65914OooO0o = Math.max(i, drawable.getIntrinsicWidth());
        this.f65909OooO = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f65918OooOO0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f65910OooO00o = i2;
        this.f65911OooO0O0 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new OooO0OO());
        valueAnimatorOfFloat.addUpdateListener(new C22040OooO0Oo());
        RecyclerView recyclerView2 = this.f65927OooOOoo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f65927OooOOoo.removeOnItemTouchListener(this);
            this.f65927OooOOoo.removeOnScrollListener(oooO0O0);
            this.f65927OooOOoo.removeCallbacks(oooO00o);
        }
        this.f65927OooOOoo = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f65927OooOOoo.addOnItemTouchListener(this);
        this.f65927OooOOoo.addOnScrollListener(oooO0O0);
    }

    public static int OooO0oo(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final void OooO(int i) {
        OooO00o oooO00o = this.f65936OooOoo0;
        StateListDrawable stateListDrawable = this.f65912OooO0OO;
        if (i == 2 && this.f65931OooOo0O != 2) {
            stateListDrawable.setState(f65907OooOoo);
            this.f65927OooOOoo.removeCallbacks(oooO00o);
        }
        if (i == 0) {
            this.f65927OooOOoo.invalidate();
        } else {
            OooOO0();
        }
        if (this.f65931OooOo0O == 2 && i != 2) {
            stateListDrawable.setState(f65908OooOooO);
            this.f65927OooOOoo.removeCallbacks(oooO00o);
            this.f65927OooOOoo.postDelayed(oooO00o, 1200);
        } else if (i == 1) {
            this.f65927OooOOoo.removeCallbacks(oooO00o);
            this.f65927OooOOoo.postDelayed(oooO00o, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f65931OooOo0O = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
    public final void OooO00o(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f65931OooOo0O == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zOooO0oO = OooO0oO(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0o = OooO0o(motionEvent.getX(), motionEvent.getY());
            if (zOooO0oO || zOooO0o) {
                if (zOooO0o) {
                    this.f65932OooOo0o = 1;
                    this.f65924OooOOOo = (int) motionEvent.getX();
                } else if (zOooO0oO) {
                    this.f65932OooOo0o = 2;
                    this.f65922OooOOO0 = (int) motionEvent.getY();
                }
                OooO(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f65931OooOo0O == 2) {
            this.f65922OooOOO0 = 0.0f;
            this.f65924OooOOOo = 0.0f;
            OooO(1);
            this.f65932OooOo0o = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f65931OooOo0O == 2) {
            OooOO0();
            int i = this.f65932OooOo0o;
            int i2 = this.f65911OooO0O0;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f65934OooOoO0;
                iArr[0] = i2;
                int i3 = this.f65926OooOOo0 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f65923OooOOOO - fMax) >= 2.0f) {
                    int iOooO0oo = OooO0oo(this.f65924OooOOOo, fMax, iArr, this.f65927OooOOoo.computeHorizontalScrollRange(), this.f65927OooOOoo.computeHorizontalScrollOffset(), this.f65926OooOOo0);
                    if (iOooO0oo != 0) {
                        this.f65927OooOOoo.scrollBy(iOooO0oo, 0);
                    }
                    this.f65924OooOOOo = fMax;
                }
            }
            if (this.f65932OooOo0o == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f65928OooOo;
                iArr2[0] = i2;
                int i4 = this.f65925OooOOo - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f65920OooOO0o - fMax2) < 2.0f) {
                    return;
                }
                int iOooO0oo2 = OooO0oo(this.f65922OooOOO0, fMax2, iArr2, this.f65927OooOOoo.computeVerticalScrollRange(), this.f65927OooOOoo.computeVerticalScrollOffset(), this.f65925OooOOo);
                if (iOooO0oo2 != 0) {
                    this.f65927OooOOoo.scrollBy(0, iOooO0oo2);
                }
                this.f65922OooOOO0 = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
    public final boolean OooO0OO(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f65931OooOo0O;
        if (i != 1) {
            return i == 2;
        }
        boolean zOooO0oO = OooO0oO(motionEvent.getX(), motionEvent.getY());
        boolean zOooO0o = OooO0o(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zOooO0oO && !zOooO0o) {
            return false;
        }
        if (zOooO0o) {
            this.f65932OooOo0o = 1;
            this.f65924OooOOOo = (int) motionEvent.getX();
        } else if (zOooO0oO) {
            this.f65932OooOo0o = 2;
            this.f65922OooOOO0 = (int) motionEvent.getY();
        }
        OooO(2);
        return true;
    }

    public final boolean OooO0o(float f, float f2) {
        if (f2 < this.f65925OooOOo - this.f65909OooO) {
            return false;
        }
        int i = this.f65923OooOOOO;
        int i2 = this.f65921OooOOO;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
    public final void OooO0o0(boolean z) {
    }

    public final boolean OooO0oO(float f, float f2) {
        boolean z = ViewCompat.getLayoutDirection(this.f65927OooOOoo) == 1;
        int i = this.f65915OooO0o0;
        if (!z ? f >= this.f65926OooOOo0 - i : f <= i) {
            int i2 = this.f65920OooOO0o;
            int i3 = this.f65919OooOO0O / 2;
            if (f2 >= i2 - i3 && f2 <= i3 + i2) {
                return true;
            }
        }
        return false;
    }

    public final void OooOO0() {
        int i = this.f65935OooOoOO;
        ValueAnimator valueAnimator = this.f65933OooOoO;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f65935OooOoOO = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C22075OooOoOO c22075OooOoOO) {
        if (this.f65926OooOOo0 != this.f65927OooOOoo.getWidth() || this.f65925OooOOo != this.f65927OooOOoo.getHeight()) {
            this.f65926OooOOo0 = this.f65927OooOOoo.getWidth();
            this.f65925OooOOo = this.f65927OooOOoo.getHeight();
            OooO(0);
            return;
        }
        if (this.f65935OooOoOO != 0) {
            if (this.f65930OooOo00) {
                int i = this.f65926OooOOo0;
                int i2 = this.f65915OooO0o0;
                int i3 = i - i2;
                int i4 = this.f65920OooOO0o;
                int i5 = this.f65919OooOO0O;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.f65912OooO0OO;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.f65925OooOOo;
                int i8 = this.f65914OooO0o;
                Drawable drawable = this.f65913OooO0Oo;
                drawable.setBounds(0, 0, i8, i7);
                if (ViewCompat.getLayoutDirection(this.f65927OooOOoo) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.f65929OooOo0) {
                int i9 = this.f65925OooOOo;
                int i10 = this.f65909OooO;
                int i11 = i9 - i10;
                int i12 = this.f65923OooOOOO;
                int i13 = this.f65921OooOOO;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.f65916OooO0oO;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.f65926OooOOo0;
                int i16 = this.f65918OooOO0;
                Drawable drawable2 = this.f65917OooO0oo;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }
}
