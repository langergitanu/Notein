package com.orion.notein.richeditor;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import com.aspose.words.WarningType;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes9.dex */
public class ClonedSpannableString extends SpannableString {
    private static final int COLUMNS = 3;
    private static final int END = 1;
    private static final int FLAGS = 2;
    private static final int START = 0;
    private int mSpanCount;
    private int[] mSpanData;
    private Object[] mSpans;

    public ClonedSpannableString(Spanned spanned) {
        this((CharSequence) spanned);
    }

    private void init(CharSequence charSequence, int i, int i2) {
        this.mSpans = new Object[20];
        this.mSpanData = new int[60];
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(i, i2, Object.class)) {
                if ((obj instanceof CharacterStyle) || (obj instanceof ParagraphStyle)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    int spanFlags = spanned.getSpanFlags(obj);
                    if (spanStart < i) {
                        spanStart = i;
                    }
                    if (spanEnd > i2) {
                        spanEnd = i2;
                    }
                    setSpan(obj, spanStart - i, spanEnd - i, spanFlags);
                }
            }
        }
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanEnd(Object obj) {
        int i = this.mSpanCount;
        Object[] objArr = this.mSpans;
        int[] iArr = this.mSpanData;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                return iArr[(i2 * 3) + 1];
            }
        }
        return -1;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanFlags(Object obj) {
        int i = this.mSpanCount;
        Object[] objArr = this.mSpans;
        int[] iArr = this.mSpanData;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                return iArr[(i2 * 3) + 2];
            }
        }
        return 0;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int getSpanStart(Object obj) {
        int i = this.mSpanCount;
        Object[] objArr = this.mSpans;
        int[] iArr = this.mSpanData;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                return iArr[i2 * 3];
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableString, android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = this.mSpanCount;
        Object[] objArr = this.mSpans;
        int[] iArr = this.mSpanData;
        Object[] objArr2 = (T[]) null;
        int i4 = 0;
        Object obj = null;
        for (int i5 = 0; i5 < i3; i5++) {
            if (cls == null || cls.isInstance(objArr[i5])) {
                int i6 = i5 * 3;
                int i7 = iArr[i6];
                int i8 = iArr[i6 + 1];
                if (i7 <= i2 && i8 >= i && (i7 == i8 || i == i2 || (i7 != i2 && i8 != i))) {
                    if (i4 == 0) {
                        obj = objArr[i5];
                    } else {
                        if (i4 == 1) {
                            objArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, (i3 - i5) + 1));
                            objArr2[0] = obj;
                        }
                        int i9 = iArr[i6 + 2] & WarningType.MINOR_FORMATTING_LOSS_CATEGORY;
                        if (i9 != 0) {
                            int i10 = 0;
                            while (i10 < i4 && i9 <= (getSpanFlags(objArr2[i10]) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) {
                                i10++;
                            }
                            System.arraycopy(objArr2, i10, objArr2, i10 + 1, i4 - i10);
                            objArr2[i10] = objArr[i5];
                        } else {
                            objArr2[i4] = objArr[i5];
                            i4++;
                        }
                    }
                    i4++;
                }
            }
        }
        if (i4 == 0) {
            return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        }
        if (i4 == 1) {
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 1));
            tArr[0] = obj;
            return tArr;
        }
        if (i4 == objArr2.length) {
            return (T[]) objArr2;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i4));
        System.arraycopy(objArr2, 0, tArr2, 0, i4);
        return tArr2;
    }

    @Override // android.text.SpannableString, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        int i3 = this.mSpanCount;
        Object[] objArr = this.mSpans;
        int[] iArr = this.mSpanData;
        if (cls == null) {
            cls = Object.class;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            if (i6 > i && i6 < i2 && cls.isInstance(objArr[i4])) {
                i2 = i6;
            }
            if (i7 > i && i7 < i2 && cls.isInstance(objArr[i4])) {
                i2 = i7;
            }
        }
        return i2;
    }

    @Override // android.text.SpannableString, android.text.Spannable
    public void removeSpan(Object obj) {
        int i = this.mSpanCount;
        Object[] objArr = this.mSpans;
        int[] iArr = this.mSpanData;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                int i3 = i2 + 1;
                int i4 = i - i3;
                System.arraycopy(objArr, i3, objArr, i2, i4);
                System.arraycopy(iArr, i3 * 3, iArr, i2 * 3, i4 * 3);
                this.mSpanCount--;
                return;
            }
        }
    }

    @Override // android.text.SpannableString, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        int i4 = this.mSpanCount;
        int i5 = i4 + 1;
        Object[] objArr = this.mSpans;
        if (i5 >= objArr.length) {
            int i6 = i4 + 10;
            Object[] objArr2 = new Object[i6];
            int[] iArr = new int[i6 * 3];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            System.arraycopy(this.mSpanData, 0, iArr, 0, this.mSpanCount * 3);
            this.mSpans = objArr2;
            this.mSpanData = iArr;
        }
        Object[] objArr3 = this.mSpans;
        int i7 = this.mSpanCount;
        objArr3[i7] = obj;
        int[] iArr2 = this.mSpanData;
        iArr2[i7 * 3] = i;
        iArr2[(i7 * 3) + 1] = i2;
        iArr2[(i7 * 3) + 2] = i3;
        this.mSpanCount = i7 + 1;
    }

    public ClonedSpannableString(CharSequence charSequence) {
        super(charSequence.toString());
        init(charSequence, 0, charSequence.length());
    }
}
