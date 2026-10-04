package com.aspose.slides;

import com.aspose.slides.Collections.Generic.LinkedList;
import com.aspose.slides.Collections.Generic.LinkedListNode;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.t2 */
/* JADX INFO: loaded from: classes3.dex */
class C14483t2 {

    /* JADX INFO: renamed from: du */
    private SortedList<Long, LinkedListNode<FontFallBackRule>> f49011du;

    /* JADX INFO: renamed from: k4 */
    private boolean f49014k4;

    /* JADX INFO: renamed from: kk */
    private LinkedList<FontFallBackRule> f49015kk;

    /* JADX INFO: renamed from: x1 */
    private C14317pv f49018x1;

    /* JADX INFO: renamed from: to */
    private LinkedListNode<FontFallBackRule> f49017to = null;

    /* JADX INFO: renamed from: h4 */
    private long f49013h4 = 0;

    /* JADX INFO: renamed from: m9 */
    private final int f49016m9 = 8;

    /* JADX INFO: renamed from: dy */
    private final int f49012dy = 4;

    public C14483t2(C14317pv c14317pv) {
        this.f49015kk = null;
        this.f49011du = null;
        this.f49018x1 = c14317pv;
        m70923k4(true);
        this.f49011du = new SortedList<>();
        this.f49015kk = new LinkedList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IFontFallBackRule m70919k4(long j) {
        IFontFallBackRule iFontFallBackRule;
        boolean z;
        long j2;
        if (m70925x1() == 0) {
            return null;
        }
        long j3 = 4294967295L;
        long j4 = j & 4294967295L;
        long j5 = j4 >> 8;
        long j6 = j5 & 4294967295L;
        LinkedListNode<FontFallBackRule> linkedListNode = this.f49011du.containsKey(Long.valueOf(j6)) ? this.f49011du.get_Item(Long.valueOf(j6)) : null;
        long rangeStartIndex = ((this.f49017to.getValue().getRangeStartIndex() & 4294967295L) >> 8) & 4294967295L;
        long rangeEndIndex = ((this.f49017to.getValue().getRangeEndIndex() & 4294967295L) >> 8) & 4294967295L;
        if (linkedListNode != null) {
            iFontFallBackRule = null;
            if ((linkedListNode.getValue().m1500x1() & 4294967295L) == (this.f49013h4 & 4294967295L)) {
                z = false;
            }
            if (rangeStartIndex != j6 || rangeEndIndex == j6) {
                j2 = 4294967295L;
                if (z) {
                    this.f49017to.getValue().m1494k4(this.f49013h4);
                    SortedList<Long, LinkedListNode<FontFallBackRule>> sortedList = this.f49011du;
                    Long lValueOf = Long.valueOf(j6);
                    LinkedListNode<FontFallBackRule> linkedListNode2 = this.f49017to;
                    if (linkedListNode == null) {
                        sortedList.addItem(lValueOf, linkedListNode2);
                    } else {
                        sortedList.set_Item(lValueOf, linkedListNode2);
                    }
                    z = false;
                }
                if ((this.f49017to.getValue().getRangeStartIndex() & 4294967295L) > j4 || j4 > (this.f49017to.getValue().getRangeEndIndex() & 4294967295L)) {
                }
                return this.f49017to.getValue();
            }
            int i = 0;
            while (linkedListNode == null && i < 4) {
                i++;
                int i2 = (i >> 1) * (-(i & 1));
                if (i2 >= 0) {
                    long j7 = j3;
                    long j8 = ((j5 & j3) + (((long) i2) & j7)) & j7;
                    if (this.f49011du.containsKey(Long.valueOf(j8))) {
                        linkedListNode = this.f49011du.get_Item(Long.valueOf(j8));
                    }
                    j3 = j7;
                }
            }
            j2 = j3;
            if (linkedListNode != null) {
                this.f49017to = linkedListNode;
            }
            while (this.f49017to.getPrevious() != null && (this.f49017to.getPrevious().getValue().getRangeEndIndex() & j2) >= j4) {
                this.f49017to = this.f49017to.getPrevious();
            }
            while (this.f49017to.getNext() != null && (this.f49017to.getNext().getValue().getRangeStartIndex() & j2) <= j4) {
                this.f49017to = this.f49017to.getNext();
            }
            if ((this.f49017to.getValue().getRangeStartIndex() & j2) <= j4 || j4 > (this.f49017to.getValue().getRangeEndIndex() & j2)) {
                return iFontFallBackRule;
            }
            if (z) {
                this.f49017to.getValue().m1494k4(this.f49013h4);
                SortedList<Long, LinkedListNode<FontFallBackRule>> sortedList2 = this.f49011du;
                Long lValueOf2 = Long.valueOf(j6);
                LinkedListNode<FontFallBackRule> linkedListNode3 = this.f49017to;
                if (linkedListNode == null) {
                    sortedList2.addItem(lValueOf2, linkedListNode3);
                } else {
                    sortedList2.set_Item(lValueOf2, linkedListNode3);
                }
            }
            return this.f49017to.getValue();
        }
        iFontFallBackRule = null;
        z = true;
        if (rangeStartIndex != j6) {
            j2 = 4294967295L;
            if (z) {
            }
            if ((this.f49017to.getValue().getRangeStartIndex() & 4294967295L) > j4) {
                while (this.f49017to.getPrevious() != null) {
                }
                while (this.f49017to.getNext() != null) {
                }
                if ((this.f49017to.getValue().getRangeStartIndex() & j2) <= j4) {
                }
                return iFontFallBackRule;
            }
            while (this.f49017to.getPrevious() != null) {
                this.f49017to = this.f49017to.getPrevious();
            }
            while (this.f49017to.getNext() != null) {
                this.f49017to = this.f49017to.getNext();
            }
            if ((this.f49017to.getValue().getRangeStartIndex() & j2) <= j4) {
            }
            return iFontFallBackRule;
        }
        return this.f49017to.getValue();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m70924kk() {
        return this.f49014k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m70925x1() {
        return this.f49015kk.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m70920k4() {
        LinkedList.Enumerator it = this.f49015kk.iterator();
        while (it.hasNext()) {
            try {
                ((FontFallBackRule) it.next()).m1498kk();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f49015kk.clear();
        this.f49017to = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70921k4(long j, long j2, String str) {
        m70922k4(new FontFallBackRule(j, j2, str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70922k4(FontFallBackRule fontFallBackRule) {
        FontFallBackRule fontFallBackRule2;
        long j;
        FontFallBackRule fontFallBackRule3 = fontFallBackRule;
        if (fontFallBackRule3 == null) {
            throw new ArgumentNullException("sourceFallBackRule", "The source rule for adding doesn't specified!");
        }
        this.f49018x1.m69261k4(fontFallBackRule3);
        if (m70925x1() == 0) {
            this.f49017to = this.f49015kk.addFirst(fontFallBackRule3);
            return;
        }
        long rangeStartIndex = fontFallBackRule3.getRangeStartIndex();
        long rangeEndIndex = fontFallBackRule3.getRangeEndIndex();
        long j2 = rangeEndIndex & 4294967295L;
        if (j2 < (this.f49015kk.getFirst().getValue().getRangeStartIndex() & 4294967295L)) {
            this.f49017to = this.f49015kk.addFirst(fontFallBackRule3);
            return;
        }
        long j3 = rangeStartIndex & 4294967295L;
        if (j3 > (this.f49015kk.getLast().getValue().getRangeEndIndex() & 4294967295L)) {
            this.f49017to = this.f49015kk.addLast(fontFallBackRule3);
            return;
        }
        while (this.f49017to.getPrevious() != null && (this.f49017to.getPrevious().getValue().getRangeEndIndex() & 4294967295L) >= j3) {
            this.f49017to = this.f49017to.getPrevious();
        }
        while (this.f49017to.getNext() != null && (this.f49017to.getNext().getValue().getRangeEndIndex() & 4294967295L) < j3) {
            this.f49017to = this.f49017to.getNext();
        }
        long rangeEndIndex2 = rangeStartIndex;
        for (long j4 = 4294967295L; j2 >= (this.f49017to.getValue().getRangeStartIndex() & j4); j4 = j) {
            long j5 = rangeEndIndex;
            if ((rangeEndIndex2 & j4) < (this.f49017to.getValue().getRangeStartIndex() & j4)) {
                LinkedList<FontFallBackRule> linkedList = this.f49015kk;
                LinkedListNode<FontFallBackRule> linkedListNode = this.f49017to;
                j = j4;
                fontFallBackRule2 = fontFallBackRule;
                linkedList.addBefore(linkedListNode, new FontFallBackRule(rangeEndIndex2, ((linkedListNode.getValue().getRangeStartIndex() & j4) - 1) & j4, fontFallBackRule2));
                rangeEndIndex2 = this.f49017to.getValue().getRangeStartIndex();
            } else {
                fontFallBackRule2 = fontFallBackRule;
                j = j4;
            }
            if (m70918k4(this.f49017to, rangeEndIndex2)) {
                this.f49017to = this.f49017to.getNext();
            }
            long j6 = rangeEndIndex2 & j;
            if (j6 > j2) {
                return;
            }
            if (m70918k4(this.f49017to, (j2 + 1) & j)) {
                this.f49017to.getValue().m1495k4(fontFallBackRule2, m70924kk());
                return;
            }
            if (j2 < (this.f49017to.getValue().getRangeEndIndex() & j)) {
                rangeEndIndex = j5;
            } else {
                if (j6 <= (this.f49017to.getValue().getRangeEndIndex() & j)) {
                    this.f49017to.getValue().m1495k4(fontFallBackRule2, m70924kk());
                    rangeEndIndex2 = ((this.f49017to.getValue().getRangeEndIndex() & j) + 1) & j;
                }
                if (this.f49017to.getNext() == null) {
                    if ((rangeEndIndex2 & j) <= j2) {
                        this.f49017to = this.f49015kk.addAfter(this.f49017to, new FontFallBackRule(rangeEndIndex2, j5, fontFallBackRule2));
                        return;
                    }
                    rangeEndIndex = j5;
                } else {
                    rangeEndIndex = j5;
                    this.f49017to = this.f49017to.getNext();
                }
            }
            if ((rangeEndIndex2 & j) > j2) {
                return;
            }
            fontFallBackRule3 = fontFallBackRule;
        }
        this.f49017to = this.f49015kk.addBefore(this.f49017to, new FontFallBackRule(rangeEndIndex2, rangeEndIndex, fontFallBackRule3));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70923k4(boolean z) {
        this.f49014k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m70918k4(LinkedListNode<FontFallBackRule> linkedListNode, long j) {
        long j2 = j & 4294967295L;
        if (j2 <= (linkedListNode.getValue().getRangeStartIndex() & 4294967295L) || j2 > (linkedListNode.getValue().getRangeEndIndex() & 4294967295L)) {
            return false;
        }
        FontFallBackRule fontFallBackRule = new FontFallBackRule(j, linkedListNode.getValue().getRangeEndIndex(), linkedListNode.getValue());
        linkedListNode.getValue().setRangeEndIndex(4294967295L & (j2 - 1));
        this.f49015kk.addAfter(linkedListNode, fontFallBackRule);
        return true;
    }
}
