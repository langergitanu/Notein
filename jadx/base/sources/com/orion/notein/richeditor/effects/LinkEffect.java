package com.orion.notein.richeditor.effects;

import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.spans.URLSpan;
import com.orion.notein.richeditor.utils.Selection;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class LinkEffect extends CharacterEffect {
    @Override // com.orion.notein.richeditor.effects.CharacterEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void applyToSelection(RTEditText rTEditText, Object obj) {
        super.applyToSelection(rTEditText, obj);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public RTSpan createSpan(Object obj) {
        return new URLSpan((String) obj);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public Class<? extends RTSpan> getSpanClazz() {
        return URLSpan.class;
    }

    @Override // com.orion.notein.richeditor.effects.CharacterEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ List getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        return super.getSpans(spannable, selection, spanCollectMode);
    }

    @Override // com.orion.notein.richeditor.effects.CharacterEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText) {
        super.removeFromSelection(rTEditText);
    }

    @Override // com.orion.notein.richeditor.effects.CharacterEffect, com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        Spannable text = rTEditText.getText();
        if (text == null) {
            return;
        }
        List spans = getSpans(text, selection, SpanCollectMode.EXACT);
        if (obj != null) {
            String str = (String) obj;
            if (!str.isEmpty()) {
                if (spans.isEmpty()) {
                    text.setSpan(new URLSpan(str), selection.start(), selection.end(), 33);
                    return;
                }
                URLSpan uRLSpan = (URLSpan) spans.get(0);
                uRLSpan.setURL(str);
                text.setSpan(uRLSpan, selection.start(), selection.end(), 33);
                for (int i = 1; i < spans.size(); i++) {
                    text.removeSpan(spans.get(i));
                }
                return;
            }
        }
        for (int i2 = 0; i2 < spans.size(); i2++) {
            text.removeSpan(spans.get(i2));
        }
    }

    @Override // com.orion.notein.richeditor.effects.CharacterEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText, Selection selection) {
        super.removeFromSelection(rTEditText, selection);
    }
}
