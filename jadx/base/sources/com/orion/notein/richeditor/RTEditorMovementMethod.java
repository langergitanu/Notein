package com.orion.notein.richeditor;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.LeadingMarginSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes9.dex */
public class RTEditorMovementMethod extends ArrowKeyMovementMethod {
    private static RTEditorMovementMethod sInstance;
    private static Rect sLineBounds = new Rect();

    private int getCharIndexAt(TextView textView, MotionEvent motionEvent) {
        int leadingMargin;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + totalPaddingLeft;
        int scrollY = textView.getScrollY() + totalPaddingTop;
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        synchronized (sLineBounds) {
            try {
                layout.getLineBounds(lineForVertical, sLineBounds);
                if (!sLineBounds.contains(scrollX, scrollY)) {
                    return -1;
                }
                Spanned spanned = (Spanned) textView.getText();
                int lineStart = layout.getLineStart(lineForVertical);
                int lineEnd = layout.getLineEnd(lineForVertical);
                int i = lineEnd - lineStart;
                if (i == 0) {
                    return -1;
                }
                Spanned spanned2 = (Spanned) spanned.subSequence(lineStart, lineEnd);
                int i2 = 0;
                LeadingMarginSpan[] leadingMarginSpanArr = (LeadingMarginSpan[]) spanned2.getSpans(0, i, LeadingMarginSpan.class);
                if (leadingMarginSpanArr != null) {
                    leadingMargin = 0;
                    for (LeadingMarginSpan leadingMarginSpan : leadingMarginSpanArr) {
                        leadingMargin += leadingMarginSpan.getLeadingMargin(true);
                    }
                } else {
                    leadingMargin = 0;
                }
                int i3 = scrollX - leadingMargin;
                float[] fArr = new float[i];
                textView.getPaint().getTextWidths(spanned2, 0, i, fArr);
                float textSize = textView.getTextSize();
                AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spanned2.getSpans(0, i, AbsoluteSizeSpan.class);
                if (absoluteSizeSpanArr != null) {
                    for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                        int spanStart = spanned2.getSpanStart(absoluteSizeSpan);
                        int spanEnd = spanned2.getSpanEnd(absoluteSizeSpan);
                        float size = absoluteSizeSpan.getSize() / textSize;
                        int iMin = Math.min(lineEnd, spanEnd);
                        for (int iMax = Math.max(lineStart, spanStart); iMax < iMin; iMax++) {
                            fArr[iMax] = fArr[iMax] * size;
                        }
                    }
                }
                float f = 0.0f;
                while (i2 < i) {
                    float f2 = fArr[i2] + f;
                    float f3 = i3;
                    if (f2 >= f3) {
                        if (f3 - f >= f2 - f3) {
                            i2++;
                        }
                        return lineStart + i2;
                    }
                    i2++;
                    f = f2;
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized MovementMethod getInstance() {
        try {
            if (sInstance == null) {
                sInstance = new RTEditorMovementMethod();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int charIndexAt;
        int action = motionEvent.getAction();
        if ((action == 1 || action == 0) && (charIndexAt = getCharIndexAt(textView, motionEvent)) != -1) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(charIndexAt, charIndexAt, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                } else if (action == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
