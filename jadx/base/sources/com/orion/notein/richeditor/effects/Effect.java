package com.orion.notein.richeditor.effects;

import android.text.Editable;
import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Selection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Effect {
    public abstract void applyToSelection(RTEditText rTEditText, Object obj);

    public abstract void applyToSelection(RTEditText rTEditText, Object obj, Selection selection);

    public final void clearFormattingInSelection(RTEditText rTEditText) {
        Editable text = rTEditText.getText();
        Iterator<RTSpan> it = getSpans(text, new Selection(rTEditText).isEmpty() ? new Selection(0, text.length()) : getSelection(rTEditText), SpanCollectMode.EXACT).iterator();
        while (it.hasNext()) {
            rTEditText.getText().removeSpan(it.next());
        }
    }

    public abstract RTSpan createSpan(Object obj);

    public abstract Selection getSelection(RTEditText rTEditText);

    public abstract Class<? extends RTSpan> getSpanClazz();

    public abstract List<RTSpan> getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode);

    public final RTSpan[] getSpansAndroid(Spannable spannable, int i, int i2) {
        return getSpansAndroid(spannable, getSpanClazz(), i, i2);
    }

    public final boolean hasAnyFlagSet(int i, int... iArr) {
        for (int i2 : iArr) {
            if ((i & i2) == i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasSpansInSelection(RTEditText rTEditText) {
        return !getSpans(rTEditText.getText(), getSelection(rTEditText), SpanCollectMode.SPAN_FLAGS).isEmpty();
    }

    public abstract void removeFromSelection(RTEditText rTEditText);

    public abstract void removeFromSelection(RTEditText rTEditText, Selection selection);

    public final List<RTSpan> spansInSelection(RTEditText rTEditText) {
        return spansInSelection(rTEditText, getSelection(rTEditText));
    }

    public final RTSpan[] getSpansAndroid(Spannable spannable, Class<? extends RTSpan> cls, int i, int i2) {
        RTSpan[] rTSpanArr = (RTSpan[]) spannable.getSpans(i, i2, cls);
        return rTSpanArr == null ? (RTSpan[]) Array.newInstance(cls, new int[0]) : rTSpanArr;
    }

    public final List<RTSpan> spansInSelection(RTEditText rTEditText, Selection selection) {
        return new ArrayList(getSpans(rTEditText.getText(), selection, SpanCollectMode.SPAN_FLAGS));
    }
}
