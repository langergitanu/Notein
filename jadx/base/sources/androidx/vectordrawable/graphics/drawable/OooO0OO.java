package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.OooO0o;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends AbstractC22122OooO0o0 implements Animatable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f66434OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C22117OooO0Oo f66435OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Context f66436OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ArrayList<androidx.vectordrawable.graphics.drawable.OooO0O0> f66437OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o f66438OooOoo0;

    public class OooO00o implements Drawable.Callback {
        public OooO00o() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            OooO0OO.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            OooO0OO.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            OooO0OO.this.unscheduleSelf(runnable);
        }
    }

    public static class OooO0O0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0o f66440OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public AnimatorSet f66441OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ArrayList<Animator> f66442OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOo.OooO00o<Animator, String> f66443OooO0Oo;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public OooO0OO(Context context) {
        this.f66435OooOoO = null;
        this.f66437OooOoOO = null;
        this.f66438OooOoo0 = new OooO00o();
        this.f66436OooOoO0 = context;
        this.f66434OooOo = new OooO0O0();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC22122OooO0o0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.applyTheme(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            return DrawableCompat.canApplyTheme(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        OooO0O0 oooO0O0 = this.f66434OooOo;
        oooO0O0.f66440OooO00o.draw(canvas);
        if (oooO0O0.f66441OooO0O0.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f66434OooOo.f66440OooO00o.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f66434OooOo.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? DrawableCompat.getColorFilter(drawable) : this.f66434OooOo.f66440OooO00o.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f66509OooOo0o != null) {
            return new C19044OooO0OO(this.f66509OooOo0o.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f66434OooOo.f66440OooO00o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f66434OooOo.f66440OooO00o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.getOpacity() : this.f66434OooOo.f66440OooO00o.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r3.f66441OooO0O0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        r3.f66441OooO0O0 = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        r3.f66441OooO0O0.playTogether(r3.f66442OooO0OO);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            OooO0O0 oooO0O0 = this.f66434OooOo;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.OooO00o.f66432OooO0o0);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        OooO0o oooO0o = new OooO0o();
                        oooO0o.f66509OooOo0o = ResourcesCompat.getDrawable(resources, resourceId, theme);
                        new OooO0o.C22121OooO0oo(oooO0o.f66509OooOo0o.getConstantState());
                        oooO0o.f66452OooOoo0 = false;
                        oooO0o.setCallback(this.f66438OooOoo0);
                        OooO0o oooO0o2 = oooO0O0.f66440OooO00o;
                        if (oooO0o2 != null) {
                            oooO0o2.setCallback(null);
                        }
                        oooO0O0.f66440OooO00o = oooO0o;
                    }
                    typedArrayObtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.OooO00o.f66431OooO0o);
                    String string = typedArrayObtainAttributes2.getString(0);
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f66436OooOoO0;
                        if (context == null) {
                            typedArrayObtainAttributes2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(oooO0O0.f66440OooO00o.f66447OooOo.f66498OooO0O0.f66492OooOOOO.get(string));
                        if (oooO0O0.f66442OooO0OO == null) {
                            oooO0O0.f66442OooO0OO = new ArrayList<>();
                            oooO0O0.f66443OooO0Oo = new OooOo.OooO00o<>();
                        }
                        oooO0O0.f66442OooO0OO.add(animatorLoadAnimator);
                        oooO0O0.f66443OooO0Oo.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f66434OooOo.f66440OooO00o.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f66434OooOo.f66441OooO0O0.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.isStateful() : this.f66434OooOo.f66440OooO00o.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f66434OooOo.f66440OooO00o.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC22122OooO0o0, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.setLevel(i) : this.f66434OooOo.f66440OooO00o.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.setState(iArr) : this.f66434OooOo.f66440OooO00o.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f66434OooOo.f66440OooO00o.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f66434OooOo.f66440OooO00o.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f66434OooOo.f66440OooO00o.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(int i) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            this.f66434OooOo.f66440OooO00o.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        } else {
            this.f66434OooOo.f66440OooO00o.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        } else {
            this.f66434OooOo.f66440OooO00o.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f66434OooOo.f66440OooO00o.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        OooO0O0 oooO0O0 = this.f66434OooOo;
        if (oooO0O0.f66441OooO0O0.isStarted()) {
            return;
        }
        oooO0O0.f66441OooO0O0.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f66434OooOo.f66441OooO0O0.end();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C19044OooO0OO extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable.ConstantState f66444OooO00o;

        public C19044OooO0OO(Drawable.ConstantState constantState) {
            this.f66444OooO00o = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f66444OooO00o.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f66444OooO00o.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            OooO0OO oooO0OO = new OooO0OO();
            Drawable drawableNewDrawable = this.f66444OooO00o.newDrawable();
            oooO0OO.f66509OooOo0o = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooO0OO.f66438OooOoo0);
            return oooO0OO;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            OooO0OO oooO0OO = new OooO0OO();
            Drawable drawableNewDrawable = this.f66444OooO00o.newDrawable(resources);
            oooO0OO.f66509OooOo0o = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooO0OO.f66438OooOoo0);
            return oooO0OO;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            OooO0OO oooO0OO = new OooO0OO();
            Drawable drawableNewDrawable = this.f66444OooO00o.newDrawable(resources, theme);
            oooO0OO.f66509OooOo0o = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooO0OO.f66438OooOoo0);
            return oooO0OO;
        }
    }

    public OooO0OO() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
