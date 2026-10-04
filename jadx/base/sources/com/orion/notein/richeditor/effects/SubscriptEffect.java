package com.orion.notein.richeditor.effects;

import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.SubscriptSpan;
import com.orion.notein.richeditor.utils.Selection;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class SubscriptEffect extends CharacterEffect {
    @Override // com.orion.notein.richeditor.effects.CharacterEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void applyToSelection(RTEditText rTEditText, Object obj) {
        super.applyToSelection(rTEditText, obj);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public Class<? extends SubscriptSpan> getSpanClazz() {
        return SubscriptSpan.class;
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
    public /* bridge */ /* synthetic */ void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        super.applyToSelection(rTEditText, obj, selection);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public SubscriptSpan createSpan(Object obj) {
        if (Boolean.FALSE.equals(obj)) {
            return null;
        }
        return new SubscriptSpan();
    }

    @Override // com.orion.notein.richeditor.effects.CharacterEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText, Selection selection) {
        super.removeFromSelection(rTEditText, selection);
    }
}
