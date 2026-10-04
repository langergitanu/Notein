package com.orion.notein.richeditor;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.ParagraphStyle;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.orion.notein.richeditor.api.format.RTEditable;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.api.format.RTPlainText;
import com.orion.notein.richeditor.api.format.RTText;
import com.orion.notein.richeditor.effects.Effect;
import com.orion.notein.richeditor.effects.Effects;
import com.orion.notein.richeditor.spans.AlignmentSpan;
import com.orion.notein.richeditor.spans.BulletSpan;
import com.orion.notein.richeditor.spans.ImageSpan;
import com.orion.notein.richeditor.spans.NumberSpan;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Paragraph;
import com.orion.notein.richeditor.utils.RTLayout;
import com.orion.notein.richeditor.utils.Selection;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class RTEditText extends AppCompatEditText implements TextWatcher, SpanWatcher {
    private boolean mIgnoreParagraphChanges;
    private boolean mIgnoreTextChanges;
    private boolean mIsAlignSpanSelected;
    private boolean mIsBulletSpanSelected;
    private boolean mIsNumberSpanSelected;
    private boolean mIsSelectionChanging;
    private boolean mLayoutChanged;
    private RTEditTextListener mListener;
    private String mNewText;
    private int mOldSelEnd;
    private int mOldSelStart;
    private Spannable mOldSpannable;
    private String mOldText;
    private boolean mParagraphsAreUp2Date;
    private int mPreviousTextLength;
    private RTLayout mRTLayout;
    private int mSelEndBefore;
    private int mSelStartBefore;
    private boolean mTextChanged;
    private boolean mTextSelected;
    private boolean mUseRTFormatting;

    public RTEditText(Context context) {
        super(context);
        this.mUseRTFormatting = true;
        this.mIsSelectionChanging = false;
        this.mOldSelStart = -1;
        this.mOldSelEnd = -1;
        init();
    }

    private void addSpanWatcher() {
        Editable text = getText();
        if (text.getSpans(0, text.length(), getClass()) != null) {
            text.setSpan(this, 0, text.length(), 18);
        }
    }

    private boolean findRedundantParagraphAndDelete() {
        ArrayList<Paragraph> paragraphs = getParagraphs();
        for (int size = paragraphs.size() - 1; size >= 0; size--) {
            Paragraph paragraph = paragraphs.get(size);
            if (paragraph.isEmpty() && !paragraph.isFirst()) {
                getText().delete(paragraph.start() - 1, paragraph.end());
                return true;
            }
        }
        return false;
    }

    private RTLayout getRTLayout() {
        synchronized (this) {
            try {
                if (this.mRTLayout == null || this.mLayoutChanged) {
                    this.mRTLayout = new RTLayout(getText());
                    this.mLayoutChanged = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mRTLayout;
    }

    private void init() {
        addTextChangedListener(this);
        setMovementMethod(RTEditorMovementMethod.getInstance());
    }

    private synchronized void setParagraphsAreUp2Date(boolean z) {
        if (!this.mIgnoreParagraphChanges) {
            this.mParagraphsAreUp2Date = z;
        }
    }

    @Override // android.text.TextWatcher
    public synchronized void afterTextChanged(Editable editable) throws Throwable {
        Throwable th;
        RTEditText rTEditText;
        try {
            try {
                boolean z = this.mPreviousTextLength >= editable.length();
                boolean zEndsWith = editable.toString().endsWith(IOUtils.LINE_SEPARATOR_UNIX);
                if (z || !zEndsWith) {
                    String string = editable.toString();
                    String str = this.mNewText;
                    if (str == null) {
                        str = "";
                    }
                    if (this.mListener == null || this.mIgnoreTextChanges || str.equals(string)) {
                        rTEditText = this;
                    } else {
                        rTEditText = this;
                        this.mListener.onTextChanged(rTEditText, 5, this.mOldSpannable, cloneSpannable(), this.mSelStartBefore, this.mSelEndBefore, getSelectionStart(), getSelectionEnd());
                        rTEditText.mNewText = string;
                    }
                    rTEditText.mLayoutChanged = true;
                    rTEditText.mTextChanged = true;
                    setParagraphsAreUp2Date(false);
                    addSpanWatcher();
                    return;
                }
                try {
                    append("\ufeff");
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public void applyEffect(Effect effect, Object obj, boolean z) throws Throwable {
        RTEditText rTEditText;
        if (!this.mUseRTFormatting || this.mIsSelectionChanging) {
            return;
        }
        Spannable spannableCloneSpannable = this.mIgnoreTextChanges ? null : cloneSpannable();
        if (z) {
            effect.applyToSelection(this, obj, new Selection(0, length()));
        } else {
            effect.applyToSelection(this, obj);
        }
        synchronized (this) {
            try {
                try {
                    if (this.mListener == null || this.mIgnoreTextChanges) {
                        rTEditText = this;
                    } else {
                        rTEditText = this;
                        this.mListener.onTextChanged(rTEditText, 3, spannableCloneSpannable, cloneSpannable(), getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
                    }
                    rTEditText.mLayoutChanged = true;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // android.text.TextWatcher
    public synchronized void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            String str = this.mOldText;
            if (str == null) {
                str = "";
            }
            if (!this.mIgnoreTextChanges && !charSequence.toString().equals(str)) {
                this.mSelStartBefore = getSelectionStart();
                this.mSelEndBefore = getSelectionEnd();
                String string = charSequence.toString();
                this.mOldText = string;
                this.mNewText = string;
                this.mOldSpannable = cloneSpannable();
            }
            this.mLayoutChanged = true;
            this.mPreviousTextLength = charSequence.length();
        } catch (Throwable th) {
            throw th;
        }
    }

    public Spannable cloneSpannable() {
        CharSequence text = super.getText();
        if (text == null) {
            text = "";
        }
        return new ClonedSpannableString(text);
    }

    public ArrayList<Paragraph> getParagraphs() {
        return getRTLayout().getParagraphs();
    }

    public Selection getParagraphsInSelection() {
        return getParagraphsInSelection(new Selection(this));
    }

    public RTText getRichText(RTFormat rTFormat) {
        return new RTEditable(this).convertTo(getContext(), rTFormat);
    }

    public String getSelectedText() {
        Editable text = getText();
        Selection selection = getSelection();
        if (selection.start() < 0 || selection.end() < 0 || selection.end() > text.length()) {
            return null;
        }
        return text.subSequence(selection.start(), selection.end()).toString();
    }

    public Selection getSelection() {
        return new Selection(getSelectionStart(), getSelectionEnd());
    }

    public String getText(RTFormat rTFormat) {
        return getRichText(rTFormat).getText().toString();
    }

    public boolean hasChanged() {
        return this.mTextChanged;
    }

    public synchronized void ignoreTextChanges() {
        this.mIgnoreTextChanges = true;
    }

    public void insertImage(Uri uri) {
        Spannable spannableCloneSpannable = cloneSpannable();
        Editable text = getText();
        if (text == null) {
            return;
        }
        Selection selection = getSelection();
        if (selection.start() == -1 || selection.end() == -1) {
            selection = new Selection(0, text.length());
        }
        text.insert(selection.end(), "￼");
        try {
            text.setSpan(new ImageSpan(getContext(), uri), selection.end(), selection.end() + 1, 33);
            this.mListener.onTextChanged(this, 3, spannableCloneSpannable, text, getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
        } catch (Exception e) {
            Log.e(getClass().getSimpleName(), "Failed to insert image", e);
        }
    }

    public void onDestroy(boolean z) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        RTEditTextListener rTEditTextListener;
        super.onFocusChanged(z, i, rect);
        if (!this.mUseRTFormatting || (rTEditTextListener = this.mListener) == null) {
            return;
        }
        rTEditTextListener.onFocusChanged(this, z);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        RTEditTextListener rTEditTextListener;
        if (this.mOldSelStart == i && this.mOldSelEnd == i2) {
            return;
        }
        this.mOldSelStart = i;
        this.mOldSelEnd = i2;
        this.mTextSelected = i2 > i;
        super.onSelectionChanged(i, i2);
        if (this.mUseRTFormatting) {
            if (!this.mParagraphsAreUp2Date) {
                this.mIgnoreParagraphChanges = true;
                Effects.cleanupParagraphs(this, new Effect[0]);
                this.mIgnoreParagraphChanges = false;
                setParagraphsAreUp2Date(true);
            }
            if (findRedundantParagraphAndDelete() || (rTEditTextListener = this.mListener) == null) {
                return;
            }
            this.mIsSelectionChanging = true;
            rTEditTextListener.onSelectionChanged(this, i, i2, 4);
            this.mIsSelectionChanging = false;
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        this.mTextChanged = true;
        if (obj instanceof BulletSpan) {
            this.mIsBulletSpanSelected = true;
            if (spannable.toString().isEmpty()) {
                append("\u200b");
            }
        } else if (obj instanceof NumberSpan) {
            this.mIsNumberSpanSelected = true;
            if (spannable.toString().isEmpty()) {
                append("\u200b");
            }
        } else if (obj instanceof AlignmentSpan) {
            this.mIsAlignSpanSelected = true;
        }
        boolean z = obj instanceof RTSpan;
        if (z && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
        RTEditTextListener rTEditTextListener = this.mListener;
        if (rTEditTextListener == null || !z) {
            return;
        }
        rTEditTextListener.onSelectionChanged(this, i, i2, 0);
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        this.mTextChanged = true;
        if ((obj instanceof RTSpan) && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
        if (this.mListener != null && (obj instanceof AlignmentSpan) && ((AlignmentSpan) obj).confirmValueChanged()) {
            this.mListener.onSelectionChanged(this, i3, i4, 3);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        this.mTextChanged = true;
        if (obj instanceof BulletSpan) {
            this.mIsBulletSpanSelected = false;
        } else if (obj instanceof NumberSpan) {
            this.mIsNumberSpanSelected = false;
        } else if (obj instanceof AlignmentSpan) {
            this.mIsAlignSpanSelected = false;
        }
        boolean z = obj instanceof RTSpan;
        if (z && (obj instanceof ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
        RTEditTextListener rTEditTextListener = this.mListener;
        if (rTEditTextListener == null || !z) {
            return;
        }
        rTEditTextListener.onSelectionChanged(this, i, i2, 1);
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public synchronized void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.mLayoutChanged = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (this.mUseRTFormatting && !z && this.mTextSelected) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    public synchronized void registerTextChanges() {
        this.mIgnoreTextChanges = false;
    }

    public void removeEffect(Effect effect, boolean z) throws Throwable {
        RTEditText rTEditText;
        if (!this.mUseRTFormatting || this.mIsSelectionChanging) {
            return;
        }
        Spannable spannableCloneSpannable = this.mIgnoreTextChanges ? null : cloneSpannable();
        if (z) {
            effect.removeFromSelection(this, new Selection(0, length()));
        } else {
            effect.removeFromSelection(this);
        }
        synchronized (this) {
            try {
                try {
                    if (this.mListener == null || this.mIgnoreTextChanges) {
                        rTEditText = this;
                    } else {
                        rTEditText = this;
                        this.mListener.onTextChanged(rTEditText, 3, spannableCloneSpannable, cloneSpannable(), getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
                    }
                    rTEditText.mLayoutChanged = true;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public void removeRTEditTextListener() {
        this.mListener = null;
    }

    public void resetHasChanged() {
        this.mTextChanged = false;
        setParagraphsAreUp2Date(false);
    }

    public void setRTEditTextListener(RTEditTextListener rTEditTextListener) {
        this.mListener = rTEditTextListener;
    }

    public void setRichTextEditing(boolean z, boolean z2) {
        if (z != this.mUseRTFormatting) {
            this.mUseRTFormatting = z;
            if (z2) {
                setText(getRichText(z ? RTFormat.PLAIN_TEXT : RTFormat.HTML));
            }
            RTEditTextListener rTEditTextListener = this.mListener;
            if (rTEditTextListener != null) {
                rTEditTextListener.onRichTextEditingChanged(this, this.mUseRTFormatting);
            }
        }
    }

    public void setText(RTText rTText) {
        Context context = getContext();
        if (rTText.getFormat() instanceof RTFormat.Html) {
            if (this.mUseRTFormatting) {
                super.setText(rTText.convertTo(context, RTFormat.SPANNED).getText(), TextView.BufferType.EDITABLE);
                addSpanWatcher();
                getText();
                Effects.cleanupParagraphs(this, new Effect[0]);
            } else {
                super.setText(rTText.convertTo(context, RTFormat.PLAIN_TEXT).getText());
            }
        } else if (rTText.getFormat() instanceof RTFormat.PlainText) {
            CharSequence text = rTText.getText();
            super.setText(text == null ? "" : text.toString());
        }
        onSelectionChanged(0, 0);
    }

    public boolean usesRTFormatting() {
        return this.mUseRTFormatting;
    }

    public Selection getParagraphsInSelection(Selection selection) {
        RTLayout rTLayout = getRTLayout();
        int lineForOffset = rTLayout.getLineForOffset(selection.start());
        boolean zIsEmpty = selection.isEmpty();
        int iEnd = selection.end();
        if (!zIsEmpty) {
            iEnd--;
        }
        return new Selection(rTLayout.getLineStart(lineForOffset), rTLayout.getLineEnd(rTLayout.getLineForOffset(iEnd)));
    }

    public RTEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUseRTFormatting = true;
        this.mIsSelectionChanging = false;
        this.mOldSelStart = -1;
        this.mOldSelEnd = -1;
        init();
    }

    public void setRichTextEditing(boolean z, String str) {
        RTText rTPlainText;
        if (z != this.mUseRTFormatting) {
            this.mUseRTFormatting = z;
            RTEditTextListener rTEditTextListener = this.mListener;
            if (rTEditTextListener != null) {
                rTEditTextListener.onRichTextEditingChanged(this, z);
            }
        }
        if (z) {
            rTPlainText = new RTHtml(RTFormat.HTML, str);
        } else {
            rTPlainText = new RTPlainText(str);
        }
        setText(rTPlainText);
    }

    public RTEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUseRTFormatting = true;
        this.mIsSelectionChanging = false;
        this.mOldSelStart = -1;
        this.mOldSelEnd = -1;
        init();
    }
}
