package com.orion.notein.p607ui.widget;

import OooOoOO.C20519OooO0Oo;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.notein.R$styleable;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oo0Oo.C25709OooOoo;
import o00oo0Oo.C25710OooOoo0;
import o0OoO0oo.o00OO0OO;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"¨\u0006$"}, m80612d2 = {"Lcom/orion/notein/ui/widget/NoteInSidebar;", "Landroid/view/View;", "", "letter", "LoO00ooO/OooOooO;", "setCurrentSelectLetter", "(Ljava/lang/String;)V", "Lkotlin/Function2;", "", "Lcom/orion/notein/ui/widget/LetterChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTouchLetterChangeListener", "(LoO0O000o/OooOOOo;)V", "", "value", "OooOoo0", "F", "getBubbleAlpha", "()F", "setBubbleAlpha", "(F)V", "bubbleAlpha", "Landroid/text/TextPaint;", "OoooOOo", "LoO00ooO/OooOO0;", "getLetterPaint", "()Landroid/text/TextPaint;", "letterPaint", "OoooOo0", "getBubbleTextPaint", "bubbleTextPaint", "Landroid/graphics/Paint;", "OoooOoO", "getMinorPaint", "()Landroid/graphics/Paint;", "minorPaint", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteInSidebar extends View {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f80104OoooOoo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f80105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC32508OooOOOo<? super Integer, ? super String, C32460OooOooO> f80106OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f80107OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f80108OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f80109OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ObjectAnimator f80110OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public float bubbleAlpha;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f80112OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int f80113OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f80114Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final boolean f80115Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f80116Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f80117Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final int f80118Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f80119Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int f80120Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f80121Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final boolean f80122Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f80123Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f80124Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f80125OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final RectF f80126OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f80127OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f80128OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f80129OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f80130OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final C32447OooOOo f80131OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final C32447OooOOo f80132OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final C32447OooOOo f80133OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f80134o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteInSidebar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f80105OooOo = new ArrayList();
        this.f80108OooOoO0 = -1;
        this.f80107OooOoO = -1;
        this.f80122Oooo0o0 = true;
        this.f80126OoooO0 = new RectF();
        this.f80131OoooOOo = C20519OooO0Oo.OooO0OO(new C25710OooOoo0(this, 1));
        this.f80132OoooOo0 = C20519OooO0Oo.OooO0OO(new C25709OooOoo(this, 2));
        this.f80133OoooOoO = C20519OooO0Oo.OooO0OO(new o00OO0OO(1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f69777OooO0O0, 0, 0);
        OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f80112OooOooO = typedArrayObtainStyledAttributes.getColor(10, ContextCompat.getColor(context, R.color.notein_sidebar_index_text_color));
        this.f80113OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, getResources().getDimensionPixelSize(R.dimen.notein_sidebar_index_text_size));
        this.f80116Oooo000 = typedArrayObtainStyledAttributes.getColor(9, ContextCompat.getColor(context, R.color.notein_sidebar_index_text_choose_color));
        this.f80117Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, getResources().getDimensionPixelSize(R.dimen.notein_sidebar_index_rect_padding_horizontal));
        this.f80118Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, getResources().getDimensionPixelSize(R.dimen.notein_sidebar_index_rect_padding_vertical));
        this.f80115Oooo0 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f80119Oooo0O0 = typedArrayObtainStyledAttributes.getColor(6, ContextCompat.getColor(context, R.color.notein_sidebar_index_rect_bg_color));
        this.f80120Oooo0OO = typedArrayObtainStyledAttributes.getColor(8, ContextCompat.getColor(context, R.color.notein_sidebar_index_rect_stroke_color));
        this.f80122Oooo0o0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f80121Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.notein_sidebar_bubble_text_size));
        this.f80123Oooo0oO = typedArrayObtainStyledAttributes.getColor(4, ContextCompat.getColor(context, R.color.notein_sidebar_bubble_text_color));
        this.f80124Oooo0oo = typedArrayObtainStyledAttributes.getColor(0, ContextCompat.getColor(context, R.color.notein_sidebar_bubble_bg_color));
        this.f80114Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.notein_sidebar_bubble_size));
        this.f80127OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.notein_sidebar_bubble_margin_index));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final TextPaint getBubbleTextPaint() {
        return (TextPaint) this.f80132OoooOo0.getValue();
    }

    private final TextPaint getLetterPaint() {
        return (TextPaint) this.f80131OoooOOo.getValue();
    }

    private final Paint getMinorPaint() {
        return (Paint) this.f80133OoooOoO.getValue();
    }

    public final void OooO00o(float f) {
        int iOooOO0O;
        this.f80109OooOoOO = f;
        this.f80108OooOoO0 = this.f80107OooOoO;
        ArrayList arrayList = this.f80105OooOo;
        if (arrayList.isEmpty()) {
            iOooOO0O = -1;
        } else {
            float f2 = this.f80129OoooOO0;
            iOooOO0O = f < f2 ? 0 : f > this.f80134o000oOoO ? C34429OooOOo0.OooOO0O(arrayList) : (int) ((f - f2) / this.f80130OoooOOO);
        }
        this.f80107OooOoO = iOooOO0O;
    }

    public final void OooO0O0() {
        InterfaceC32508OooOOOo<? super Integer, ? super String, C32460OooOooO> interfaceC32508OooOOOo;
        if (this.f80107OooOoO != this.f80108OooOoO0) {
            ArrayList arrayList = this.f80105OooOo;
            int size = arrayList.size();
            int i = this.f80107OooOoO;
            if (i < 0 || i >= size || (interfaceC32508OooOOOo = this.f80106OooOo0o) == null) {
                return;
            }
            interfaceC32508OooOOOo.invoke(Integer.valueOf(i), arrayList.get(this.f80107OooOoO));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        float y = event.getY();
        float x = event.getX();
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                float[] fArr = {1.0f, 0.0f};
                ObjectAnimator objectAnimator = this.f80110OooOoo;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                float[] fArrCopyOf = Arrays.copyOf(fArr, 2);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "bubbleAlpha", Arrays.copyOf(fArrCopyOf, fArrCopyOf.length));
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.start();
                this.f80110OooOoo = objectAnimatorOfFloat;
            } else if (action == 2) {
                OooO00o(y);
                OooO0O0();
                invalidate();
            } else if (action == 3) {
            }
        } else {
            if (x < (getMeasuredWidth() - getPaddingRight()) - this.f80128OoooO0O || y < this.f80129OoooOO0 || y > this.f80134o000oOoO) {
                return false;
            }
            OooO00o(y);
            OooO0O0();
            ObjectAnimator objectAnimator2 = this.f80110OooOoo;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            setBubbleAlpha(1.0f);
        }
        return true;
    }

    public final float getBubbleAlpha() {
        return this.bubbleAlpha;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        ArrayList arrayList = this.f80105OooOo;
        if (arrayList.isEmpty()) {
            return;
        }
        if (this.f80115Oooo0) {
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            float f = this.f80128OoooO0O;
            float f2 = measuredWidth - f;
            float f3 = f / 2.0f;
            RectF rectF = this.f80126OoooO0;
            rectF.left = f2;
            rectF.right = f2 + f;
            rectF.top = this.f80129OoooOO0;
            rectF.bottom = this.f80134o000oOoO;
            getMinorPaint().reset();
            getMinorPaint().setStyle(Paint.Style.FILL);
            getMinorPaint().setColor(this.f80119Oooo0O0);
            getMinorPaint().setAntiAlias(true);
            canvas.drawRoundRect(rectF, f3, f3, getMinorPaint());
            getMinorPaint().reset();
            getMinorPaint().setStyle(Paint.Style.STROKE);
            getMinorPaint().setColor(this.f80120Oooo0OO);
            getMinorPaint().setAntiAlias(true);
            canvas.drawRoundRect(rectF, f3, f3, getMinorPaint());
        }
        if (!arrayList.isEmpty()) {
            float f4 = this.f80130OoooOOO;
            float f5 = 2;
            float measuredWidth2 = (getMeasuredWidth() - getPaddingRight()) - (this.f80128OoooO0O / f5);
            float f6 = this.f80129OoooOO0;
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                String str = (String) obj;
                getLetterPaint().setColor(i == this.f80107OooOoO ? this.f80116Oooo000 : this.f80112OooOooO);
                Paint.FontMetrics fontMetrics = getLetterPaint().getFontMetrics();
                float f7 = fontMetrics.bottom;
                canvas.drawText(str, measuredWidth2, ((((f7 - fontMetrics.top) / f5) + (f4 / f5)) - f7) + f6, getLetterPaint());
                f6 += f4;
                i = i2;
            }
        }
        if (!this.f80122Oooo0o0 || this.bubbleAlpha <= 0.0f) {
            return;
        }
        int size = arrayList.size();
        int i3 = this.f80107OooOoO;
        if (i3 < 0 || i3 >= size) {
            return;
        }
        String str2 = (String) arrayList.get(i3);
        int i4 = (int) (this.bubbleAlpha * 255);
        float measuredWidth3 = getMeasuredWidth() - (((getPaddingRight() + this.f80128OoooO0O) + this.f80127OoooO00) + (this.f80114Oooo / 2));
        float f8 = this.f80129OoooOO0;
        float f9 = this.f80130OoooOOO / 2.0f;
        float f10 = f8 + f9;
        float f11 = this.f80134o000oOoO - f9;
        float f12 = this.f80109OooOoOO;
        if (f12 >= f10) {
            f10 = f12 > f11 ? f11 : f12;
        }
        getMinorPaint().reset();
        getMinorPaint().setStyle(Paint.Style.FILL);
        getMinorPaint().setColor(this.f80124Oooo0oo);
        getMinorPaint().setAlpha(i4);
        getMinorPaint().setAntiAlias(true);
        canvas.drawCircle(measuredWidth3, f10, this.f80114Oooo / 2.0f, getMinorPaint());
        Paint.FontMetrics fontMetrics2 = getBubbleTextPaint().getFontMetrics();
        float f13 = fontMetrics2.bottom;
        float f14 = (((f13 - fontMetrics2.top) / 2) + f10) - f13;
        getBubbleTextPaint().setAlpha(i4);
        canvas.drawText(str2, measuredWidth3, f14, getBubbleTextPaint());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        float measuredHeight;
        super.onMeasure(i, i2);
        ArrayList arrayList = this.f80105OooOo;
        if (arrayList.isEmpty()) {
            setMeasuredDimension(View.resolveSize(0, i), View.resolveSize(0, i2));
            return;
        }
        Iterator it = arrayList.iterator();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            float fMeasureText = getLetterPaint().measureText((String) it.next());
            if (fMeasureText >= f3) {
                f3 = fMeasureText;
            }
        }
        this.f80128OoooO0O = f3 + (this.f80117Oooo00O * 2);
        int iCeil = (int) Math.ceil(getPaddingRight() + getPaddingLeft() + this.f80114Oooo + this.f80127OoooO00 + this.f80128OoooO0O);
        Paint.FontMetrics fontMetrics = getLetterPaint().getFontMetrics();
        float f4 = (fontMetrics.bottom - fontMetrics.top) + (this.f80118Oooo00o * 2);
        this.f80130OoooOOO = f4;
        this.f80125OoooO = f4 * arrayList.size();
        float paddingBottom = getPaddingBottom() + getPaddingTop() + this.f80125OoooO;
        if (this.f80122Oooo0o0) {
            float f5 = this.f80114Oooo;
            float f6 = this.f80130OoooOOO;
            if (f5 > f6) {
                f = (f5 - f6) / 2.0f;
            }
        } else {
            f = 0.0f;
        }
        int iCeil2 = (int) Math.ceil((f * 2) + paddingBottom);
        setMeasuredDimension(View.resolveSize(iCeil, i), View.resolveSize(iCeil2, i2));
        if (getMeasuredHeight() > iCeil2) {
            measuredHeight = (getMeasuredHeight() - this.f80125OoooO) / 2.0f;
        } else {
            float paddingTop = getPaddingTop();
            if (this.f80122Oooo0o0) {
                float f7 = this.f80114Oooo;
                float f8 = this.f80130OoooOOO;
                if (f7 > f8) {
                    f2 = (f7 - f8) / 2.0f;
                }
            }
            measuredHeight = paddingTop + f2;
        }
        this.f80129OoooOO0 = measuredHeight;
        float f9 = measuredHeight + this.f80125OoooO;
        float measuredHeight2 = getMeasuredHeight();
        if (f9 > measuredHeight2) {
            f9 = measuredHeight2;
        }
        this.f80134o000oOoO = f9;
    }

    public final void setBubbleAlpha(float f) {
        this.bubbleAlpha = f;
        invalidate();
    }

    public final void setCurrentSelectLetter(String letter) {
        ArrayList arrayList = this.f80105OooOo;
        OooOOO0.OooO0oO(arrayList, "<this>");
        int iIndexOf = arrayList.indexOf(letter);
        int i = this.f80107OooOoO;
        if (iIndexOf != i) {
            this.f80108OooOoO0 = i;
            this.f80107OooOoO = iIndexOf;
            invalidate();
        }
    }

    public final void setOnTouchLetterChangeListener(InterfaceC32508OooOOOo<? super Integer, ? super String, C32460OooOooO> listener) {
        this.f80106OooOo0o = listener;
    }
}
