package com.orion.notein.richeditor.effects;

import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Selection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class CharacterEffect extends Effect {
    private boolean isAttached(Spannable spannable, Selection selection, Object obj, SpanCollectMode spanCollectMode) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        int iStart = selection.start();
        int iEnd = selection.end();
        int iMax = Math.max(spanStart, iStart);
        int iMin = Math.min(spanEnd, iEnd);
        if (iMax > iMin) {
            return false;
        }
        if (iMax < iMin) {
            return true;
        }
        if ((spanStart > iStart && spanEnd < iEnd) || (iStart > spanStart && iEnd < spanEnd)) {
            return true;
        }
        if (spanCollectMode == SpanCollectMode.EXACT) {
            return false;
        }
        int spanFlags = spannable.getSpanFlags(obj) & 51;
        return spanEnd == iStart ? hasAnyFlagSet(spanFlags, 34, 18) : hasAnyFlagSet(spanFlags, 17, 18);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj) {
        applyToSelection(rTEditText, obj, getSelection(rTEditText));
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public final Selection getSelection(RTEditText rTEditText) {
        return new Selection(rTEditText);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public List<RTSpan> getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        ArrayList arrayList = new ArrayList();
        for (RTSpan rTSpan : getSpansAndroid(spannable, Math.max(0, selection.start() - 1), Math.min(spannable.length(), selection.end() + 1))) {
            if (isAttached(spannable, selection, rTSpan, spanCollectMode)) {
                arrayList.add(rTSpan);
            }
        }
        return arrayList;
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void removeFromSelection(RTEditText rTEditText) {
        removeFromSelection(rTEditText, getSelection(rTEditText));
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        Object objCreateSpan;
        int i = selection.isEmpty() ? 18 : 34;
        Spannable text = rTEditText.getText();
        if (text == null) {
            return;
        }
        for (RTSpan rTSpan : getSpans(text, selection, SpanCollectMode.SPAN_FLAGS)) {
            boolean zEquals = rTSpan.getValue().equals(obj);
            int spanStart = text.getSpanStart(rTSpan);
            if (spanStart < selection.start()) {
                if (zEquals) {
                    selection.offset(selection.start() - spanStart, 0);
                    i = 34;
                } else {
                    text.setSpan(rTSpan.copy(rTSpan.getValue()), spanStart, selection.start(), 33);
                }
            }
            int spanEnd = text.getSpanEnd(rTSpan);
            if (spanEnd > selection.end()) {
                if (zEquals) {
                    selection.offset(0, spanEnd - selection.end());
                } else {
                    text.setSpan(rTSpan.copy(rTSpan.getValue()), selection.end(), spanEnd, 34);
                }
            }
            text.removeSpan(rTSpan);
        }
        if (obj == null || (objCreateSpan = createSpan(obj)) == null) {
            return;
        }
        text.setSpan(objCreateSpan, selection.start(), selection.end(), i);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void removeFromSelection(RTEditText rTEditText, Selection selection) {
        Spannable text = rTEditText.getText();
        if (text == null) {
            return;
        }
        for (RTSpan rTSpan : getSpans(text, selection, SpanCollectMode.SPAN_FLAGS)) {
            int spanStart = text.getSpanStart(rTSpan);
            int spanEnd = text.getSpanEnd(rTSpan);
            if (spanStart < selection.start()) {
                text.setSpan(rTSpan.copy(rTSpan.getValue()), spanStart, selection.start(), 33);
            }
            if (spanEnd > selection.end()) {
                text.setSpan(rTSpan.copy(rTSpan.getValue()), selection.end(), spanEnd, 33);
            }
            text.removeSpan(rTSpan);
        }
    }
}
