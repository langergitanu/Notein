package com.orion.notein.richeditor.effects;

import android.text.Editable;
import android.text.Spannable;
import android.util.Log;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.DividerSpan;
import com.orion.notein.richeditor.spans.ParagraphSpanProcessor;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Paragraph;
import com.orion.notein.richeditor.utils.Selection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes9.dex */
public class DividerEffect extends ParagraphEffect {
    private final ParagraphSpanProcessor processor = new ParagraphSpanProcessor();

    private List<RTSpan> getAllRTSpans(Spannable spannable, Selection selection) {
        return new ArrayList(Arrays.asList(getSpansAndroid(spannable, RTSpan.class, selection.start(), selection.end())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onParagraphLayoutChanged$0(RTSpan rTSpan) {
        return !(rTSpan instanceof DividerSpan);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect
    public /* bridge */ /* synthetic */ void addConflictEffect(ParagraphEffect paragraphEffect) {
        super.addConflictEffect(paragraphEffect);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void applyToSelection(RTEditText rTEditText, Object obj) {
        super.applyToSelection(rTEditText, obj);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ RTSpan createSpan(Object obj) {
        return super.createSpan(obj);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public Class<? extends RTSpan> getSpanClazz() {
        return DividerSpan.class;
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ List getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        return super.getSpans(spannable, selection, spanCollectMode);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect
    public void onParagraphLayoutChanged(RTEditText rTEditText) {
        this.processor.clear();
        Spannable text = rTEditText.getText();
        ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
        int size = paragraphs.size();
        for (int i = 0; i < size; i++) {
            Paragraph paragraph = paragraphs.get(i);
            List<RTSpan> allRTSpans = getAllRTSpans(text, paragraph);
            List<RTSpan> list = (List) allRTSpans.stream().filter(new OooO0o()).collect(Collectors.toList());
            if (list.size() < allRTSpans.size()) {
                this.processor.addRemoveEvents(list, paragraph);
            }
        }
        this.processor.process(text);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText) {
        super.removeFromSelection(rTEditText);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        Editable text = rTEditText.getText();
        if (text == null) {
            return;
        }
        if (obj == null) {
            Iterator it = getSpans(text, selection, SpanCollectMode.EXACT).iterator();
            while (it.hasNext()) {
                text.removeSpan((RTSpan) it.next());
            }
        } else {
            text.insert(selection.end(), "\n￼\n");
            try {
                text.setSpan(new DividerSpan(rTEditText.getContext()), selection.end() + 1, selection.end() + 2, 33);
            } catch (Exception e) {
                Log.e(getClass().getSimpleName(), "Failed to insert divider", e);
            }
        }
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText, Selection selection) {
        super.removeFromSelection(rTEditText, selection);
    }
}
