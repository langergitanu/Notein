package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21536OooOo0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final RectF f62956OooOO0o = new RectF();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f62957OooOOO0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final TextView f62958OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextPaint f62966OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Context f62967OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0O0 f62968OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f62959OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f62960OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f62961OooO0OO = -1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f62962OooO0Oo = -1.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f62964OooO0o0 = -1.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f62963OooO0o = new int[0];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f62965OooO0oO = false;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOo0$OooO00o */
    public static final class OooO00o {
        public static StaticLayout OooO00o(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C21537OooO0Oo c21537OooO0Oo) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c21537OooO0Oo.OooO00o(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOo0$OooO0O0 */
    public static class OooO0O0 extends C21537OooO0Oo {
        @Override // androidx.appcompat.widget.C21536OooOo0.C21537OooO0Oo
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C21536OooOo0.OooO0o0(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOo0$OooO0OO */
    public static class OooO0OO extends OooO0O0 {
        @Override // androidx.appcompat.widget.C21536OooOo0.OooO0O0, androidx.appcompat.widget.C21536OooOo0.C21537OooO0Oo
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C21536OooOo0.C21537OooO0Oo
        public boolean OooO0O0(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooOo0$OooO0Oo, reason: case insensitive filesystem */
    public static class C21537OooO0Oo {
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean OooO0O0(TextView textView) {
            return ((Boolean) C21536OooOo0.OooO0o0(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C21536OooOo0(TextView textView) {
        this.f62958OooO = textView;
        this.f62967OooOO0 = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f62968OooOO0O = new OooO0OO();
        } else {
            this.f62968OooOO0O = new OooO0O0();
        }
    }

    public static int[] OooO0O0(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method OooO0Oo(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f62957OooOOO0;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static <T> T OooO0o0(Object obj, String str, T t) {
        try {
            return (T) OooO0Oo(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    public final boolean OooO() {
        boolean z = this.f62963OooO0o.length > 0;
        this.f62965OooO0oO = z;
        if (z) {
            this.f62959OooO00o = 1;
            this.f62962OooO0Oo = r0[0];
            this.f62964OooO0o0 = r0[r1 - 1];
            this.f62961OooO0OO = -1.0f;
        }
        return z;
    }

    public final void OooO00o() {
        if (OooO0o()) {
            if (this.f62960OooO0O0) {
                if (this.f62958OooO.getMeasuredHeight() <= 0 || this.f62958OooO.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f62968OooOO0O.OooO0O0(this.f62958OooO) ? 1048576 : (this.f62958OooO.getMeasuredWidth() - this.f62958OooO.getTotalPaddingLeft()) - this.f62958OooO.getTotalPaddingRight();
                int height = (this.f62958OooO.getHeight() - this.f62958OooO.getCompoundPaddingBottom()) - this.f62958OooO.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f62956OooOO0o;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fOooO0OO = OooO0OO(rectF);
                        if (fOooO0OO != this.f62958OooO.getTextSize()) {
                            OooO0oO(0, fOooO0OO);
                        }
                    } finally {
                    }
                }
            }
            this.f62960OooO0O0 = true;
        }
    }

    public final int OooO0OO(RectF rectF) {
        CharSequence transformation;
        int length = this.f62963OooO0o.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f62963OooO0o[i4];
            TextView textView = this.f62958OooO;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f62966OooO0oo;
            if (textPaint == null) {
                this.f62966OooO0oo = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f62966OooO0oo.set(textView.getPaint());
            this.f62966OooO0oo.setTextSize(i5);
            StaticLayout staticLayoutOooO00o = OooO00o.OooO00o(charSequence, (Layout.Alignment) OooO0o0(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f62958OooO, this.f62966OooO0oo, this.f62968OooOO0O);
            if ((maxLines == -1 || (staticLayoutOooO00o.getLineCount() <= maxLines && staticLayoutOooO00o.getLineEnd(staticLayoutOooO00o.getLineCount() - 1) == charSequence.length())) && staticLayoutOooO00o.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f62963OooO0o[i2];
    }

    public final boolean OooO0o() {
        return OooOO0() && this.f62959OooO00o != 0;
    }

    public final void OooO0oO(int i, float f) {
        Context context = this.f62967OooOO0;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f62958OooO;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f62960OooO0O0 = false;
                try {
                    Method methodOooO0Oo = OooO0Oo("nullLayouts");
                    if (methodOooO0Oo != null) {
                        methodOooO0Oo.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean OooO0oo() {
        if (OooOO0() && this.f62959OooO00o == 1) {
            if (!this.f62965OooO0oO || this.f62963OooO0o.length == 0) {
                int iFloor = ((int) Math.floor((this.f62964OooO0o0 - this.f62962OooO0Oo) / this.f62961OooO0OO)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f62961OooO0OO) + this.f62962OooO0Oo);
                }
                this.f62963OooO0o = OooO0O0(iArr);
            }
            this.f62960OooO0O0 = true;
        } else {
            this.f62960OooO0O0 = false;
        }
        return this.f62960OooO0O0;
    }

    public final boolean OooOO0() {
        return !(this.f62958OooO instanceof AppCompatEditText);
    }

    public final void OooOO0O(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f62959OooO00o = 1;
        this.f62962OooO0Oo = f;
        this.f62964OooO0o0 = f2;
        this.f62961OooO0OO = f3;
        this.f62965OooO0oO = false;
    }
}
