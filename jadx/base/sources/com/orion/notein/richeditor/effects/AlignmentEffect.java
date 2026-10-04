package com.orion.notein.richeditor.effects;

import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.spans.AlignmentSpan;
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
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes9.dex */
public class AlignmentEffect extends ParagraphEffect {
    private final ParagraphSpanProcessor processor = new ParagraphSpanProcessor();

    private ArrayList<ArrayList<Paragraph>> getEffectedParagraphGroup(RTEditText rTEditText, Selection selection) {
        Editable text = rTEditText.getText();
        ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
        ArrayList<ArrayList<Paragraph>> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int size = paragraphs.size();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Paragraph paragraph = paragraphs.get(i);
            RTSpan[] spansAndroid = getSpansAndroid(text, BaseListItemSpan.class, paragraph.start(), paragraph.end());
            if (spansAndroid.length == 0 || !z2) {
                if (!arrayList2.isEmpty() && z) {
                    arrayList.add(new ArrayList<>(arrayList2));
                }
                arrayList2 = new ArrayList();
                z = false;
            }
            if (paragraph.isSelected(selection)) {
                z = true;
            }
            if (spansAndroid.length > 0 || z) {
                arrayList2.add(paragraph);
            }
            z2 = spansAndroid.length > 0;
        }
        if (!arrayList2.isEmpty() && z) {
            arrayList.add(new ArrayList<>(arrayList2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$applyToSelection$0(RTSpan rTSpan) {
        return rTSpan instanceof AlignmentSpan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onParagraphLayoutChanged$1(RTSpan rTSpan) {
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
        return AlignmentSpan.class;
    }

    @Override // com.orion.notein.richeditor.effects.ParagraphEffect, com.orion.notein.richeditor.effects.Effect
    public /* bridge */ /* synthetic */ List getSpans(Spannable spannable, Selection selection, SpanCollectMode spanCollectMode) {
        return super.getSpans(spannable, selection, spanCollectMode);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.orion.notein.richeditor.effects.ParagraphEffect
    public void onParagraphLayoutChanged(RTEditText rTEditText) {
        this.processor.clear();
        Spannable text = rTEditText.getText();
        HashSet hashSet = new HashSet();
        ArrayList<Paragraph> paragraphs = rTEditText.getParagraphs();
        int size = paragraphs.size();
        for (int i = 0; i < size; i++) {
            Paragraph paragraph = paragraphs.get(i);
            List list = (List) getSpans(text, paragraph, SpanCollectMode.SPAN_FLAGS).stream().filter(new OooO0O0(0)).collect(Collectors.toList());
            AlignmentSpan alignmentSpan = list.isEmpty() ? null : (AlignmentSpan) list.get(0);
            if (alignmentSpan != null) {
                alignmentSpan.confirmValueChanged();
                boolean zContains = hashSet.contains(Integer.valueOf(System.identityHashCode(alignmentSpan)));
                AlignmentSpan alignmentSpanCopy = alignmentSpan;
                if (zContains) {
                    alignmentSpanCopy = alignmentSpan.copy();
                }
                this.processor.addAddEvent(alignmentSpanCopy, paragraph);
                hashSet.add(Integer.valueOf(System.identityHashCode(alignmentSpanCopy)));
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

    @Override // com.orion.notein.richeditor.effects.Effect
    public void applyToSelection(RTEditText rTEditText, Object obj, Selection selection) {
        this.processor.clear();
        if (obj instanceof Layout.Alignment) {
            Spannable text = rTEditText.getText();
            ArrayList<ArrayList<Paragraph>> effectedParagraphGroup = getEffectedParagraphGroup(rTEditText, selection);
            int size = effectedParagraphGroup.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Paragraph> arrayList = effectedParagraphGroup.get(i);
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Paragraph paragraph = arrayList.get(i2);
                    List list = (List) getSpans(text, paragraph, SpanCollectMode.SPAN_FLAGS).stream().filter(new OooO00o()).collect(Collectors.toList());
                    AlignmentSpan alignmentSpan = list.isEmpty() ? null : (AlignmentSpan) list.get(0);
                    if (alignmentSpan == null && obj != Layout.Alignment.ALIGN_NORMAL) {
                        this.processor.addAddEvent(new AlignmentSpan((Layout.Alignment) obj, Helper.isRTL(text, paragraph.start(), paragraph.end())), paragraph);
                    } else if (alignmentSpan != null && obj == Layout.Alignment.ALIGN_NORMAL) {
                        this.processor.addRemoveEvent(alignmentSpan, paragraph);
                    } else if (alignmentSpan != null) {
                        alignmentSpan.setAlignment((Layout.Alignment) obj);
                        this.processor.addAddEvent(alignmentSpan, paragraph);
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
