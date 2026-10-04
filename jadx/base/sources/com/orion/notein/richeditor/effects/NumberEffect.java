package com.orion.notein.richeditor.effects;

import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.BaseListItemSpan;
import com.orion.notein.richeditor.spans.NumberSpan;
import com.orion.notein.richeditor.spans.ParagraphSpanProcessor;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Helper;
import com.orion.notein.richeditor.utils.Paragraph;
import com.orion.notein.richeditor.utils.Selection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes9.dex */
public class NumberEffect extends ParagraphEffect {
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
        return rTSpan instanceof NumberSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$applyToSelection$1(RTSpan rTSpan) {
        return this.conflictSpans.contains(rTSpan.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onParagraphLayoutChanged$2(RTSpan rTSpan) {
        return rTSpan instanceof NumberSpan;
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
        return NumberSpan.class;
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ List getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        return super.getSpans(spannable, selection, spanCollectMode);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect
    public void onParagraphLayoutChanged(RTEditText rTEditText) {
        this.processor.clear();
        HashSet hashSet = new HashSet();
        Spannable text = rTEditText.getText();
        ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
        int size = paragraphs.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            Paragraph paragraph = paragraphs.get(i2);
            List<RTSpan> listItemSpans = getListItemSpans(text, paragraph);
            List list = (List) listItemSpans.stream().filter(new OooO()).collect(Collectors.toList());
            NumberSpan numberSpan = list.isEmpty() ? null : (NumberSpan) list.get(0);
            if (numberSpan != null) {
                RTSpan rTSpanCopy = i != numberSpan.getNumber() ? numberSpan.copy(Integer.valueOf(i)) : hashSet.contains(Integer.valueOf(System.identityHashCode(numberSpan))) ? numberSpan.copy() : numberSpan;
                this.processor.addAddEvent(rTSpanCopy, paragraph);
                hashSet.add(Integer.valueOf(System.identityHashCode(rTSpanCopy)));
                for (int i3 = 0; i3 < listItemSpans.size(); i3++) {
                    RTSpan rTSpan = listItemSpans.get(i3);
                    if (rTSpan != rTSpanCopy) {
                        this.processor.addRemoveEvent(rTSpan, paragraph);
                    }
                }
            }
            i = numberSpan != null ? i + 1 : 1;
        }
        this.processor.process(text);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText) {
        super.removeFromSelection(rTEditText);
    }

    @Override // com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        NumberSpan numberSpan;
        this.processor.clear();
        if (obj instanceof Boolean) {
            Spannable text = rTEditText.getText();
            ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
            int size = paragraphs.size();
            int i = 1;
            for (int i2 = 0; i2 < size; i2++) {
                Paragraph paragraph = paragraphs.get(i2);
                boolean zIsSelected = paragraph.isSelected(selection);
                List<RTSpan> listItemSpans = getListItemSpans(text, paragraph);
                List list = (List) listItemSpans.stream().filter(new OooOO0(0)).collect(Collectors.toList());
                NumberSpan numberSpan2 = list.isEmpty() ? null : (NumberSpan) list.get(0);
                if (!zIsSelected) {
                    numberSpan = numberSpan2;
                    if (numberSpan != null && numberSpan.getNumber() != i) {
                        numberSpan.setNumber(i);
                        this.processor.addAddEvent(numberSpan, paragraph);
                    }
                } else if (Boolean.TRUE.equals(obj)) {
                    this.processor.addRemoveEvents((List) listItemSpans.stream().filter(new Predicate() { // from class: com.orion.notein.richeditor.effects.OooOO0O
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return this.f70424OooO00o.lambda$applyToSelection$1((RTSpan) obj2);
                        }
                    }).collect(Collectors.toList()), paragraph);
                    numberSpan = numberSpan2;
                    this.processor.addAddEvent(new NumberSpan(i, Helper.getLeadingMarging(), paragraph.isEmpty(), paragraph.isFirst(), paragraph.isLast()), paragraph);
                } else {
                    numberSpan = numberSpan2;
                    if (numberSpan != null) {
                        this.processor.addRemoveEvent(numberSpan, paragraph);
                    }
                }
                i = (!zIsSelected ? numberSpan != null : Boolean.TRUE.equals(obj)) ? 1 : i + 1;
            }
            this.processor.process(text);
        }
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ void removeFromSelection(RTEditText rTEditText, Selection selection) {
        super.removeFromSelection(rTEditText, selection);
    }
}
