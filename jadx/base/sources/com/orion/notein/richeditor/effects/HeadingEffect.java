package com.orion.notein.richeditor.effects;

import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.BaseListItemSpan;
import com.orion.notein.richeditor.spans.HeadingSpan;
import com.orion.notein.richeditor.spans.ParagraphSpanProcessor;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Paragraph;
import com.orion.notein.richeditor.utils.Selection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes9.dex */
public class HeadingEffect extends ParagraphEffect {
    public static final int FORMAT_HEADING_1 = 1;
    public static final int FORMAT_HEADING_2 = 2;
    public static final int FORMAT_HEADING_3 = 3;
    public static final int FORMAT_HEADING_BODY = 0;
    private final ParagraphSpanProcessor processor = new ParagraphSpanProcessor();

    private List<RTSpan> getListItemSpans(Spannable spannable, Selection selection) {
        ArrayList arrayList = new ArrayList();
        for (RTSpan rTSpan : getSpansAndroid(spannable, BaseListItemSpan.class, selection.start(), selection.end())) {
            if (isSpanAttached(spannable, selection, rTSpan, SpanCollectMode.SPAN_FLAGS)) {
                arrayList.add(rTSpan);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$applyToSelection$0(RTSpan rTSpan) {
        return rTSpan instanceof HeadingSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onParagraphLayoutChanged$1(RTSpan rTSpan) {
        return rTSpan instanceof HeadingSpan;
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
        return HeadingSpan.class;
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ List getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        return super.getSpans(spannable, selection, spanCollectMode);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect
    public void onParagraphLayoutChanged(RTEditText rTEditText) {
        this.processor.clear();
        Spannable text = rTEditText.getText();
        if (text == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
        int size = paragraphs.size();
        for (int i = 0; i < size; i++) {
            Paragraph paragraph = paragraphs.get(i);
            List list = (List) getSpans(text, paragraph, SpanCollectMode.SPAN_FLAGS).stream().filter(new C22981OooO0oo()).collect(Collectors.toList());
            HeadingSpan headingSpan = list.isEmpty() ? null : (HeadingSpan) list.get(0);
            if (headingSpan != null) {
                if (hashSet.contains(Integer.valueOf(System.identityHashCode(headingSpan)))) {
                    this.processor.addRemoveEvent(headingSpan, paragraph);
                } else {
                    this.processor.addRemoveEvents(getListItemSpans(text, paragraph), paragraph);
                    this.processor.addAddEvent(headingSpan, paragraph);
                    hashSet.add(Integer.valueOf(System.identityHashCode(headingSpan)));
                }
                if (list.size() > 1) {
                    for (int i2 = 1; i2 < list.size(); i2++) {
                        this.processor.addRemoveEvent((RTSpan) list.get(i2), paragraph);
                    }
                }
            }
        }
        this.processor.process(text);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText) {
        super.removeFromSelection(rTEditText);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    @Override // com.orion.notein.richeditor.effects.Effect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        this.processor.clear();
        if (obj instanceof Integer) {
            Spannable text = rTEditText.getText();
            ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
            int size = paragraphs.size();
            for (int i = 0; i < size; i++) {
                Paragraph paragraph = paragraphs.get(i);
                if (paragraph.isSelected(selection)) {
                    List list = (List) getSpans(text, paragraph, SpanCollectMode.SPAN_FLAGS).stream().filter(new C22980OooO0oO()).collect(Collectors.toList());
                    HeadingSpan headingSpan = list.isEmpty() ? null : (HeadingSpan) list.get(0);
                    if (headingSpan == null) {
                        Integer num = (Integer) obj;
                        if (num.intValue() != 0) {
                            this.processor.addRemoveEvents(getListItemSpans(text, paragraph), paragraph);
                            this.processor.addAddEvent(new HeadingSpan(num.intValue()), paragraph);
                        } else if (headingSpan != null && ((Integer) obj).intValue() == 0) {
                            this.processor.addRemoveEvent(headingSpan, paragraph);
                        } else if (headingSpan != null) {
                            headingSpan.setHeadingLevel(((Integer) obj).intValue());
                            this.processor.addAddEvent(headingSpan, paragraph);
                        }
                    }
                }
            }
            this.processor.process(text);
        }
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText, Selection selection) {
        super.removeFromSelection(rTEditText, selection);
    }
}
