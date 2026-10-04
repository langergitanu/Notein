package com.orion.notein.richeditor.effects;

import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Selection;
import java.util.ArrayList;
import java.util.List;
import oO00ooO.C32444OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
abstract class ParagraphEffect extends Effect {
    protected List<Class<? extends RTSpan>> conflictSpans = new ArrayList();

    public void addConflictEffect(ParagraphEffect paragraphEffect) {
        this.conflictSpans.add(paragraphEffect.getSpanClazz());
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj) {
        applyToSelection(rTEditText, obj, getSelection(rTEditText));
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public RTSpan createSpan(Object obj) {
        throw new C32444OooOOO0("An operation is not implemented");
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public final Selection getSelection(RTEditText rTEditText) {
        return rTEditText.getParagraphsInSelection();
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public List<RTSpan> getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        ArrayList arrayList = new ArrayList();
        for (RTSpan rTSpan : getSpansAndroid(spannable, selection.start(), selection.end())) {
            if (isSpanAttached(spannable, selection, rTSpan, spanCollectMode)) {
                arrayList.add(rTSpan);
            }
        }
        return arrayList;
    }

    public final boolean isSpanAttached(Spannable spannable, Selection selection, Object obj, SpanCollectMode spanCollectMode) {
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
            return spanStart == iStart && spanEnd == iEnd && iStart == iEnd;
        }
        int spanFlags = spannable.getSpanFlags(obj) & 51;
        return spanEnd == iStart ? hasAnyFlagSet(spanFlags, 34, 18) : hasAnyFlagSet(spanFlags, 17, 18);
    }

    public abstract void onParagraphLayoutChanged(RTEditText rTEditText);

    @Override // com.orion.notein.richeditor.effects.Effect
    public void removeFromSelection(RTEditText rTEditText, Selection selection) {
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void removeFromSelection(RTEditText rTEditText) {
        removeFromSelection(rTEditText, getSelection(rTEditText));
    }
}
