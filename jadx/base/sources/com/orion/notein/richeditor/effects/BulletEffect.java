package com.orion.notein.richeditor.effects;

import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.BaseListItemSpan;
import com.orion.notein.richeditor.spans.BulletSpan;
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
public class BulletEffect extends ParagraphEffect {
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
        return rTSpan instanceof BulletSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$applyToSelection$1(RTSpan rTSpan) {
        return this.conflictSpans.contains(rTSpan.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onParagraphLayoutChanged$2(RTSpan rTSpan) {
        return rTSpan instanceof BulletSpan;
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
        return BulletSpan.class;
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ List getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        return super.getSpans(spannable, selection, spanCollectMode);
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect
    public void onParagraphLayoutChanged(RTEditText rTEditText) {
        this.processor.clear();
        Spannable text = rTEditText.getText();
        HashSet hashSet = new HashSet();
        ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
        int size = paragraphs.size();
        for (int i = 0; i < size; i++) {
            Paragraph paragraph = paragraphs.get(i);
            List<RTSpan> listItemSpans = getListItemSpans(text, paragraph);
            List list = (List) listItemSpans.stream().filter(new OooO0OO()).collect(Collectors.toList());
            RTSpan rTSpanCopy = list.isEmpty() ? null : (BulletSpan) list.get(0);
            if (rTSpanCopy != null) {
                if (hashSet.contains(Integer.valueOf(System.identityHashCode(rTSpanCopy)))) {
                    rTSpanCopy = rTSpanCopy.copy();
                }
                this.processor.addAddEvent(rTSpanCopy, paragraph);
                hashSet.add(Integer.valueOf(System.identityHashCode(rTSpanCopy)));
                for (int i2 = 0; i2 < listItemSpans.size(); i2++) {
                    RTSpan rTSpan = listItemSpans.get(i2);
                    if (rTSpan != rTSpanCopy) {
                        this.processor.addRemoveEvent(rTSpan, paragraph);
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

    @Override // com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        this.processor.clear();
        if (obj instanceof Boolean) {
            Spannable text = rTEditText.getText();
            ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
            int size = paragraphs.size();
            for (int i = 0; i < size; i++) {
                Paragraph paragraph = paragraphs.get(i);
                if (paragraph.isSelected(selection)) {
                    List<RTSpan> listItemSpans = getListItemSpans(text, paragraph);
                    List list = (List) listItemSpans.stream().filter(new C22978OooO0Oo()).collect(Collectors.toList());
                    BulletSpan bulletSpan = list.isEmpty() ? null : (BulletSpan) list.get(0);
                    if (Boolean.TRUE.equals(obj)) {
                        this.processor.addRemoveEvents((List) listItemSpans.stream().filter(new Predicate() { // from class: com.orion.notein.richeditor.effects.OooO0o0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj2) {
                                return this.f70422OooO00o.lambda$applyToSelection$1((RTSpan) obj2);
                            }
                        }).collect(Collectors.toList()), paragraph);
                        this.processor.addAddEvent(new BulletSpan(Helper.getLeadingMarging(), paragraph.isEmpty(), paragraph.isFirst(), paragraph.isLast()), paragraph);
                    } else if (bulletSpan != null) {
                        this.processor.addRemoveEvent(bulletSpan, paragraph);
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
