package com.orion.notein.richeditor.spans;

import android.text.Spannable;
import com.orion.notein.richeditor.utils.Paragraph;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ParagraphSpanProcessor {
    public static final int ACTION_ADD = 1;
    public static final int ACTION_REMOVE = 0;
    private final List<ParagraphSpanEvent> mEvents = new CopyOnWriteArrayList();

    public static class ParagraphSpanEvent {
        final int mAction;
        final Paragraph mParagraph;
        final RTSpan mSpan;

        public ParagraphSpanEvent(RTSpan rTSpan, Paragraph paragraph, int i) {
            this.mSpan = rTSpan;
            this.mParagraph = paragraph;
            this.mAction = i;
        }
    }

    public void addAddEvent(RTSpan rTSpan, Paragraph paragraph) {
        this.mEvents.add(new ParagraphSpanEvent(rTSpan, paragraph, 1));
    }

    public void addRemoveEvent(RTSpan rTSpan, Paragraph paragraph) {
        this.mEvents.add(new ParagraphSpanEvent(rTSpan, paragraph, 0));
    }

    public void addRemoveEvents(List<RTSpan> list, Paragraph paragraph) {
        Iterator<RTSpan> it = list.iterator();
        while (it.hasNext()) {
            addRemoveEvent(it.next(), paragraph);
        }
    }

    public void clear() {
        this.mEvents.clear();
    }

    public void process(Spannable spannable) {
        for (ParagraphSpanEvent paragraphSpanEvent : this.mEvents) {
            Paragraph paragraph = paragraphSpanEvent.mParagraph;
            RTSpan rTSpan = paragraphSpanEvent.mSpan;
            int i = paragraphSpanEvent.mAction;
            int iStart = paragraph.start();
            int iEnd = paragraph.end();
            if (i == 0) {
                int spanStart = spannable.getSpanStart(rTSpan);
                if (spanStart > -1 && spanStart < iStart) {
                    spannable.setSpan(rTSpan.copy(), spanStart, iStart, 34);
                }
                spannable.removeSpan(rTSpan);
            } else {
                boolean z = false;
                boolean z2 = paragraph.isLast() && paragraph.isEmpty();
                if (paragraph.isFirst() && paragraph.isLast()) {
                    z = true;
                }
                boolean zIsLast = paragraph.isLast();
                if (z2) {
                    spannable.setSpan(rTSpan, iStart, iEnd, 18);
                } else if (z) {
                    spannable.setSpan(rTSpan, iStart, iEnd, 18);
                } else if (zIsLast) {
                    spannable.setSpan(rTSpan, iStart, iEnd, 34);
                } else {
                    spannable.setSpan(rTSpan, iStart, iEnd, 33);
                }
            }
        }
    }
}
