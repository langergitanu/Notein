package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class SortedList<TKey, TValue> implements IGenericCollection<KeyValuePair<TKey, TValue>>, IGenericDictionary<TKey, TValue>, IGenericEnumerable<KeyValuePair<TKey, TValue>> {

    /* JADX INFO: renamed from: k4 */
    private static Object[] f1728k4 = new Object[0];

    /* JADX INFO: renamed from: x1 */
    private static Object[] f1729x1 = new Object[0];

    /* JADX INFO: renamed from: c5 */
    private SortedList<TKey, TValue>.ValueList<TKey, TValue> f1730c5;

    /* JADX INFO: renamed from: du */
    private int f1731du;

    /* JADX INFO: renamed from: dy */
    private SortedList<TKey, TValue>.KeyList<TKey, TValue> f1732dy;

    /* JADX INFO: renamed from: h4 */
    private int f1733h4;

    /* JADX INFO: renamed from: jd */
    private final Object f1734jd;

    /* JADX INFO: renamed from: kk */
    private Object[] f1735kk;

    /* JADX INFO: renamed from: m9 */
    private Comparator<TKey> f1736m9;

    /* JADX INFO: renamed from: to */
    private Object[] f1737to;

    public static class Enumerator<TKey, TValue> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator, IDictionaryEnumerator, IDisposable {

        /* JADX INFO: renamed from: du */
        private int f1738du;

        /* JADX INFO: renamed from: h4 */
        private int f1739h4;

        /* JADX INFO: renamed from: k4 */
        private SortedList<TKey, TValue> f1740k4;

        /* JADX INFO: renamed from: kk */
        private TValue f1741kk;

        /* JADX INFO: renamed from: to */
        private int f1742to;

        /* JADX INFO: renamed from: x1 */
        private TKey f1743x1;

        public Enumerator() {
        }

        /* JADX INFO: renamed from: dy */
        private boolean m963dy(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1740k4, this.f1740k4) && C14067j2.m66728k4(enumerator.f1743x1, this.f1743x1) && C14067j2.m66728k4(enumerator.f1741kk, this.f1741kk) && enumerator.f1742to == this.f1742to && enumerator.f1738du == this.f1738du && enumerator.f1739h4 == this.f1739h4;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            this.f1742to = 0;
            this.f1743x1 = null;
            this.f1741kk = null;
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Enumerator) {
                return m963dy((Enumerator) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public final DictionaryEntry getEntry() {
            int i = this.f1742to;
            if (i == 0 || i == this.f1740k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            return new DictionaryEntry(this.f1743x1, this.f1741kk);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public final Object getKey() {
            int i = this.f1742to;
            if (i == 0 || i == this.f1740k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            return this.f1743x1;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public final Object getValue() {
            int i = this.f1742to;
            if (i == 0 || i == this.f1740k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            return this.f1741kk;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f1738du != ((SortedList) this.f1740k4).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            if ((((long) this.f1742to) & 4294967295L) >= (4294967295L & ((long) this.f1740k4.size()))) {
                this.f1742to = this.f1740k4.size() + 1;
                this.f1743x1 = null;
                this.f1741kk = null;
                return false;
            }
            this.f1743x1 = (TKey) ((SortedList) this.f1740k4).f1735kk[this.f1742to];
            Object[] objArr = ((SortedList) this.f1740k4).f1737to;
            int i = this.f1742to;
            this.f1741kk = (TValue) objArr[i];
            this.f1742to = i + 1;
            return true;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public Enumerator Clone() {
            Enumerator enumerator = new Enumerator();
            CloneTo(enumerator);
            return enumerator;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final Object next() {
            int i = this.f1742to;
            if (i == 0 || i == this.f1740k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            return this.f1739h4 == 2 ? new DictionaryEntry(this.f1743x1, this.f1741kk) : new KeyValuePair(this.f1743x1, this.f1741kk);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            if (this.f1738du != ((SortedList) this.f1740k4).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            this.f1742to = 0;
            this.f1743x1 = null;
            this.f1741kk = null;
        }

        public Enumerator(SortedList<TKey, TValue> sortedList, int i) {
            this.f1740k4 = sortedList;
            this.f1742to = 0;
            this.f1738du = ((SortedList) sortedList).f1733h4;
            this.f1739h4 = i;
            this.f1743x1 = null;
            this.f1741kk = null;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(Enumerator enumerator) {
            if (enumerator == null) {
                enumerator = new Enumerator();
            }
            enumerator.f1740k4 = this.f1740k4;
            enumerator.f1743x1 = this.f1743x1;
            enumerator.f1741kk = this.f1741kk;
            enumerator.f1742to = this.f1742to;
            enumerator.f1738du = this.f1738du;
            enumerator.f1739h4 = this.f1739h4;
        }
    }

    @Deprecated
    public static class EnumeratorJava<TKey, TValue> extends AbstractC7020m9<EnumeratorJava> implements IGenericEnumerator, IDictionaryEnumerator, IDisposable {

        /* JADX INFO: renamed from: du */
        private int f1744du;

        /* JADX INFO: renamed from: h4 */
        private int f1745h4;

        /* JADX INFO: renamed from: k4 */
        private SortedList<TKey, TValue> f1746k4;

        /* JADX INFO: renamed from: kk */
        private TValue f1747kk;

        /* JADX INFO: renamed from: to */
        private int f1748to;

        /* JADX INFO: renamed from: x1 */
        private TKey f1749x1;

        public EnumeratorJava() {
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            this.f1748to = 0;
            this.f1749x1 = null;
            this.f1747kk = null;
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof EnumeratorJava) {
                return m971k4((Enumerator) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public final DictionaryEntry getEntry() {
            int i = this.f1748to;
            if (i == 0 || i == this.f1746k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            return new DictionaryEntry(this.f1749x1, this.f1747kk);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public final Object getKey() {
            int i = this.f1748to;
            if (i == 0 || i == this.f1746k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            return this.f1749x1;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public final Object getValue() {
            int i = this.f1748to;
            if (i == 0 || i == this.f1746k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            return this.f1747kk;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f1744du != ((SortedList) this.f1746k4).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            return (((long) this.f1748to) & 4294967295L) < (4294967295L & ((long) this.f1746k4.size()));
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public EnumeratorJava Clone() {
            EnumeratorJava enumeratorJava = new EnumeratorJava();
            CloneTo(enumeratorJava);
            return enumeratorJava;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final Object next() {
            if (this.f1744du != ((SortedList) this.f1746k4).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            if (this.f1748to == this.f1746k4.size() + 1) {
                ThrowHelper.throwInvalidOperationException("Enum operation cant happen");
            }
            if ((((long) this.f1748to) & 4294967295L) < (4294967295L & ((long) this.f1746k4.size()))) {
                this.f1749x1 = (TKey) ((SortedList) this.f1746k4).f1735kk[this.f1748to];
                Object[] objArr = ((SortedList) this.f1746k4).f1737to;
                int i = this.f1748to;
                this.f1747kk = (TValue) objArr[i];
                this.f1748to = i + 1;
            } else {
                this.f1748to = this.f1746k4.size() + 1;
                this.f1749x1 = null;
                this.f1747kk = null;
            }
            return this.f1745h4 == 2 ? new DictionaryEntry(this.f1749x1, this.f1747kk) : new KeyValuePair(this.f1749x1, this.f1747kk);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            if (this.f1744du != ((SortedList) this.f1746k4).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            this.f1748to = 0;
            this.f1749x1 = null;
            this.f1747kk = null;
        }

        public EnumeratorJava(SortedList<TKey, TValue> sortedList, int i) {
            this.f1746k4 = sortedList;
            this.f1748to = 0;
            this.f1744du = ((SortedList) sortedList).f1733h4;
            this.f1745h4 = i;
            this.f1749x1 = null;
            this.f1747kk = null;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(EnumeratorJava enumeratorJava) {
            if (enumeratorJava == null) {
                enumeratorJava = new EnumeratorJava();
            }
            enumeratorJava.f1746k4 = this.f1746k4;
            enumeratorJava.f1749x1 = this.f1749x1;
            enumeratorJava.f1747kk = this.f1747kk;
            enumeratorJava.f1748to = this.f1748to;
            enumeratorJava.f1744du = this.f1744du;
            enumeratorJava.f1745h4 = this.f1745h4;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m971k4(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1740k4, this.f1746k4) && C14067j2.m66728k4(enumerator.f1743x1, this.f1749x1) && C14067j2.m66728k4(enumerator.f1741kk, this.f1747kk) && enumerator.f1742to == this.f1748to && enumerator.f1738du == this.f1744du && enumerator.f1739h4 == this.f1745h4;
        }
    }

    public final class KeyList<TKey, TValue> implements IGenericCollection<TKey>, IGenericEnumerable<TKey>, IGenericList<TKey> {

        /* JADX INFO: renamed from: x1 */
        private SortedList<TKey, TValue> f1751x1;

        public KeyList(SortedList<TKey, TValue> sortedList) {
            this.f1751x1 = sortedList;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final void addItem(TKey tkey) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final void clear() {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final boolean containsItem(TKey tkey) {
            return this.f1751x1.containsKey(tkey);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final void copyToTArray(TKey[] tkeyArr, int i) {
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(((SortedList) this.f1751x1).f1735kk, AbstractC14092to.class), 0, (AbstractC14092to) C7019kk.m27458kk(tkeyArr, AbstractC14092to.class), i, this.f1751x1.size());
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final TKey get_Item(int i) {
            return (TKey) this.f1751x1.m955kk(i);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final int indexOfItem(TKey tkey) {
            if (tkey == null) {
                ThrowHelper.throwArgumentNullException("key");
            }
            int iM67195k4 = AbstractC14092to.m67195k4(AbstractC14092to.m67208k4((Object) ((SortedList) this.f1751x1).f1735kk), 0, this.f1751x1.size(), tkey, ((SortedList) this.f1751x1).f1736m9);
            if (iM67195k4 >= 0) {
                return iM67195k4;
            }
            return -1;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final void insertItem(int i, TKey tkey) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final boolean isReadOnly() {
            return true;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<TKey> iterator() {
            return new SortedListKeyEnumerator(this.f1751x1);
        }

        @Deprecated
        /* JADX INFO: renamed from: k4 */
        public final IGenericEnumerator<TKey> m974k4() {
            return new SortedListKeyEnumeratorJava(this.f1751x1);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final void removeAt(int i) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final boolean removeItem(TKey tkey) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final void set_Item(int i, TKey tkey) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final int size() {
            return ((SortedList) this.f1751x1).f1731du;
        }
    }

    public final class SortedListKeyEnumerator<TKey, TValue> implements IGenericEnumerator<TKey>, IDisposable {

        /* JADX INFO: renamed from: du */
        private TKey f1752du;

        /* JADX INFO: renamed from: kk */
        private int f1754kk;

        /* JADX INFO: renamed from: to */
        private int f1755to;

        /* JADX INFO: renamed from: x1 */
        private SortedList<TKey, TValue> f1756x1;

        public SortedListKeyEnumerator(SortedList<TKey, TValue> sortedList) {
            this.f1756x1 = sortedList;
            this.f1755to = ((SortedList) sortedList).f1733h4;
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            this.f1754kk = 0;
            this.f1752du = null;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f1755to != ((SortedList) this.f1756x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            if ((((long) this.f1754kk) & 4294967295L) >= (4294967295L & ((long) this.f1756x1.size()))) {
                this.f1754kk = this.f1756x1.size() + 1;
                this.f1752du = null;
                return false;
            }
            Object[] objArr = ((SortedList) this.f1756x1).f1735kk;
            int i = this.f1754kk;
            this.f1752du = (TKey) objArr[i];
            this.f1754kk = i + 1;
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final TKey next() {
            return this.f1752du;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            if (this.f1755to != ((SortedList) this.f1756x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            this.f1754kk = 0;
            this.f1752du = null;
        }
    }

    @Deprecated
    public final class SortedListKeyEnumeratorJava<TKey, TValue> implements IGenericEnumerator<TKey>, IDisposable {

        /* JADX INFO: renamed from: du */
        private TKey f1757du;

        /* JADX INFO: renamed from: kk */
        private int f1759kk;

        /* JADX INFO: renamed from: to */
        private int f1760to;

        /* JADX INFO: renamed from: x1 */
        private SortedList<TKey, TValue> f1761x1;

        public SortedListKeyEnumeratorJava(SortedList<TKey, TValue> sortedList) {
            this.f1761x1 = sortedList;
            this.f1760to = ((SortedList) sortedList).f1733h4;
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            this.f1759kk = 0;
            this.f1757du = null;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f1760to != ((SortedList) this.f1761x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            return (((long) this.f1759kk) & 4294967295L) < (4294967295L & ((long) this.f1761x1.size()));
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final TKey next() {
            if (this.f1760to != ((SortedList) this.f1761x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            if ((((long) this.f1759kk) & 4294967295L) < (4294967295L & ((long) this.f1761x1.size()))) {
                Object[] objArr = ((SortedList) this.f1761x1).f1735kk;
                int i = this.f1759kk;
                this.f1757du = (TKey) objArr[i];
                this.f1759kk = i + 1;
            } else {
                this.f1759kk = this.f1761x1.size() + 1;
                this.f1757du = null;
            }
            return this.f1757du;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            if (this.f1760to != ((SortedList) this.f1761x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            this.f1759kk = 0;
            this.f1757du = null;
        }
    }

    public final class SortedListValueEnumerator<TKey, TValue> implements IGenericEnumerator<TValue>, IDisposable {

        /* JADX INFO: renamed from: du */
        private TValue f1762du;

        /* JADX INFO: renamed from: kk */
        private int f1764kk;

        /* JADX INFO: renamed from: to */
        private int f1765to;

        /* JADX INFO: renamed from: x1 */
        private SortedList<TKey, TValue> f1766x1;

        public SortedListValueEnumerator(SortedList<TKey, TValue> sortedList) {
            this.f1766x1 = sortedList;
            this.f1765to = ((SortedList) sortedList).f1733h4;
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            this.f1764kk = 0;
            this.f1762du = null;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f1765to != ((SortedList) this.f1766x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            if ((((long) this.f1764kk) & 4294967295L) >= (4294967295L & ((long) this.f1766x1.size()))) {
                this.f1764kk = this.f1766x1.size() + 1;
                this.f1762du = null;
                return false;
            }
            Object[] objArr = ((SortedList) this.f1766x1).f1737to;
            int i = this.f1764kk;
            this.f1762du = (TValue) objArr[i];
            this.f1764kk = i + 1;
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final TValue next() {
            return this.f1762du;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            if (this.f1765to != ((SortedList) this.f1766x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            this.f1764kk = 0;
            this.f1762du = null;
        }
    }

    @Deprecated
    public final class SortedListValueEnumeratorJava<TKey, TValue> implements IGenericEnumerator<TValue>, IDisposable {

        /* JADX INFO: renamed from: du */
        private TValue f1767du;

        /* JADX INFO: renamed from: kk */
        private int f1769kk;

        /* JADX INFO: renamed from: to */
        private int f1770to;

        /* JADX INFO: renamed from: x1 */
        private SortedList<TKey, TValue> f1771x1;

        public SortedListValueEnumeratorJava(SortedList<TKey, TValue> sortedList) {
            this.f1771x1 = sortedList;
            this.f1770to = ((SortedList) sortedList).f1733h4;
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            this.f1769kk = 0;
            this.f1767du = null;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            if (this.f1770to != ((SortedList) this.f1771x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            return (((long) this.f1769kk) & 4294967295L) < (4294967295L & ((long) this.f1771x1.size()));
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final TValue next() {
            if (this.f1770to != ((SortedList) this.f1771x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            if ((((long) this.f1769kk) & 4294967295L) < (4294967295L & ((long) this.f1771x1.size()))) {
                Object[] objArr = ((SortedList) this.f1771x1).f1737to;
                int i = this.f1769kk;
                this.f1767du = (TValue) objArr[i];
                this.f1769kk = i + 1;
            } else {
                this.f1769kk = this.f1771x1.size() + 1;
                this.f1767du = null;
            }
            return this.f1767du;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            if (this.f1770to != ((SortedList) this.f1771x1).f1733h4) {
                ThrowHelper.throwInvalidOperationException("failed version");
            }
            this.f1769kk = 0;
            this.f1767du = null;
        }
    }

    public static class ThrowHelper {
        public static void throwArgumentException(String str) {
            throw new ArgumentException(str);
        }

        public static void throwArgumentNullException(String str) {
            throw new ArgumentNullException(str);
        }

        public static void throwArgumentOutOfRangeException(String str, String str2) {
            throw new ArgumentOutOfRangeException(str, str2);
        }

        public static void throwInvalidOperationException(String str) {
            throw new InvalidOperationException(str);
        }

        public static void throwKeyNotFoundException() {
            throw new KeyNotFoundException();
        }

        public static void throwNotSupportedException(String str) {
            throw new NotSupportedException(str);
        }
    }

    public final class ValueList<TKey, TValue> implements IGenericCollection<TValue>, IGenericEnumerable<TValue>, IGenericList<TValue> {

        /* JADX INFO: renamed from: x1 */
        private SortedList<TKey, TValue> f1773x1;

        public ValueList(SortedList<TKey, TValue> sortedList) {
            this.f1773x1 = sortedList;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final void addItem(TValue tvalue) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final void clear() {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final boolean containsItem(TValue tvalue) {
            return this.f1773x1.containsValue(tvalue);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final void copyToTArray(TValue[] tvalueArr, int i) {
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(((SortedList) this.f1773x1).f1737to, AbstractC14092to.class), 0, (AbstractC14092to) C7019kk.m27458kk(tvalueArr, AbstractC14092to.class), i, this.f1773x1.size());
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final TValue get_Item(int i) {
            return (TValue) this.f1773x1.m959x1(i);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final int indexOfItem(TValue tvalue) {
            return AbstractC14092to.m67202k4((TValue[]) ((SortedList) this.f1773x1).f1737to, tvalue, 0, this.f1773x1.size());
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final void insertItem(int i, TValue tvalue) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final boolean isReadOnly() {
            return true;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<TValue> iterator() {
            return new SortedListValueEnumerator(this.f1773x1);
        }

        @Deprecated
        /* JADX INFO: renamed from: k4 */
        public final IGenericEnumerator<TValue> m975k4() {
            return new SortedListValueEnumeratorJava(this.f1773x1);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final void removeAt(int i) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final boolean removeItem(TValue tvalue) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public final void set_Item(int i, TValue tvalue) {
            ThrowHelper.throwNotSupportedException("Operation not supported");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public final int size() {
            return ((SortedList) this.f1773x1).f1731du;
        }
    }

    public SortedList() {
        this.f1734jd = new Object();
        this.f1735kk = f1728k4;
        this.f1737to = f1729x1;
        this.f1731du = 0;
        this.f1736m9 = Comparer.getDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public TKey m955kk(int i) {
        if (i < 0 || i >= this.f1731du) {
            ThrowHelper.throwArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than zero or index is equal to or greater than Count");
        }
        return (TKey) this.f1735kk[i];
    }

    /* JADX INFO: renamed from: x1 */
    private SortedList<TKey, TValue>.ValueList<TKey, TValue> m958x1() {
        if (this.f1730c5 == null) {
            this.f1730c5 = new ValueList<>(this);
        }
        return this.f1730c5;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void addItem(KeyValuePair<TKey, TValue> keyValuePair) {
        addItem(keyValuePair.getKey(), keyValuePair.getValue());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f1733h4++;
        AbstractC14092to.m67215k4((AbstractC14092to) C7019kk.m27458kk(this.f1735kk, AbstractC14092to.class), 0, this.f1731du);
        AbstractC14092to.m67215k4((AbstractC14092to) C7019kk.m27458kk(this.f1737to, AbstractC14092to.class), 0, this.f1731du);
        this.f1731du = 0;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean containsItem(KeyValuePair<TKey, TValue> keyValuePair) {
        int iIndexOfKey = indexOfKey(keyValuePair.getKey());
        return iIndexOfKey >= 0 && EqualityComparer.getDefault().equals(this.f1737to[iIndexOfKey], keyValuePair.getValue());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean containsKey(TKey tkey) {
        return indexOfKey(tkey) >= 0;
    }

    public final boolean containsValue(TValue tvalue) {
        return indexOfValue(tvalue) >= 0;
    }

    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            ThrowHelper.throwArgumentNullException("array");
        }
        if (abstractC14092to.m67277to() != 1) {
            ThrowHelper.throwArgumentException("array is multidimensional");
        }
        int i2 = 0;
        if (abstractC14092to.m67279x1(0) != 0) {
            ThrowHelper.throwArgumentException("array does not have zero-based indexing");
        }
        if (i < 0 || i > abstractC14092to.m67265du()) {
            ThrowHelper.throwArgumentOutOfRangeException("arrayIndex", "index is less than zero or index is equal to or greater than size of array");
        }
        if (abstractC14092to.m67265du() - i < size()) {
            ThrowHelper.throwArgumentException("The number of elements in the source collection is greater than the available space from arrayIndex to the end of the destination array");
        }
        KeyValuePair[] keyValuePairArr = (KeyValuePair[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to), KeyValuePair[].class);
        if (keyValuePairArr != null) {
            while (i2 < size()) {
                keyValuePairArr[i2 + i] = new KeyValuePair(this.f1735kk[i2], this.f1737to[i2]);
                i2++;
            }
            return;
        }
        Object[] objArr = (Object[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to), Object[].class);
        if (objArr == null) {
            ThrowHelper.throwArgumentException("The type of the source collection cannot be cast automatically to the type of the destination array");
        }
        while (i2 < size()) {
            try {
                objArr[i2 + i] = new KeyValuePair(this.f1735kk[i2], this.f1737to[i2]);
                i2++;
            } catch (Exception unused) {
                ThrowHelper.throwArgumentException("The type of the source collection cannot be cast automatically to the type of the destination array");
                return;
            }
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void copyToTArray(KeyValuePair<TKey, TValue>[] keyValuePairArr, int i) {
        if (keyValuePairArr == null) {
            ThrowHelper.throwArgumentNullException("array");
        }
        if (i < 0 || i > keyValuePairArr.length) {
            ThrowHelper.throwArgumentOutOfRangeException("arrayIndex", "index is less than zero or index is equal to or greater than size of array");
        }
        if (keyValuePairArr.length - i < size()) {
            ThrowHelper.throwArgumentException("The number of elements in the source collection is greater than the available space from arrayIndex to the end of the destination array");
        }
        for (int i2 = 0; i2 < size(); i2++) {
            new KeyValuePair(this.f1735kk[i2], this.f1737to[i2]).CloneTo((KeyValuePair) keyValuePairArr[i + i2]);
        }
    }

    public final int getCapacity() {
        return this.f1735kk.length;
    }

    public final Comparator<TKey> getComparer() {
        return this.f1736m9;
    }

    public final Object getSyncRoot() {
        return this.f1734jd;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final TValue get_Item(TKey tkey) {
        int iIndexOfKey = indexOfKey(tkey);
        if (iIndexOfKey >= 0) {
            return (TValue) this.f1737to[iIndexOfKey];
        }
        ThrowHelper.throwKeyNotFoundException();
        return null;
    }

    public final int indexOfKey(TKey tkey) {
        if (tkey == null) {
            ThrowHelper.throwArgumentNullException("key");
        }
        int iM67195k4 = AbstractC14092to.m67195k4(AbstractC14092to.m67208k4((Object) this.f1735kk), 0, this.f1731du, tkey, this.f1736m9);
        if (iM67195k4 < 0) {
            return -1;
        }
        return iM67195k4;
    }

    public final int indexOfValue(TValue tvalue) {
        return AbstractC14092to.m67202k4((TValue[]) this.f1737to, tvalue, 0, this.f1731du);
    }

    public final boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return false;
    }

    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iterator() {
        return new Enumerator(this, 1);
    }

    @Deprecated
    public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iteratorJava() {
        return new EnumeratorJava(this, 1);
    }

    @Deprecated
    public final IGenericEnumerator<TKey> iteratorJavaKeys() {
        return ((KeyList) getKeys()).m974k4();
    }

    @Deprecated
    public final IGenericEnumerator<TValue> iteratorJavaValues() {
        return ((ValueList) getValues()).m975k4();
    }

    @Deprecated
    public final IDictionaryEnumerator iteratorJava_IDictionary() {
        return new EnumeratorJava(this, 2);
    }

    public final IDictionaryEnumerator iterator_IDictionary() {
        return new Enumerator(this, 2);
    }

    public final void removeAt(int i) {
        if (i < 0 || i >= this.f1731du) {
            ThrowHelper.throwArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than zero or index is equal to or greater than Count");
        }
        int i2 = this.f1731du - 1;
        this.f1731du = i2;
        if (i < i2) {
            int i3 = i + 1;
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(this.f1735kk, AbstractC14092to.class), i3, (AbstractC14092to) C7019kk.m27458kk(this.f1735kk, AbstractC14092to.class), i, this.f1731du - i);
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(this.f1737to, AbstractC14092to.class), i3, (AbstractC14092to) C7019kk.m27458kk(this.f1737to, AbstractC14092to.class), i, this.f1731du - i);
        }
        Object[] objArr = this.f1735kk;
        int i4 = this.f1731du;
        objArr[i4] = null;
        this.f1737to[i4] = null;
        this.f1733h4++;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean removeItem(KeyValuePair<TKey, TValue> keyValuePair) {
        int iIndexOfKey = indexOfKey(keyValuePair.getKey());
        if (iIndexOfKey < 0 || !EqualityComparer.getDefault().equals(this.f1737to[iIndexOfKey], keyValuePair.getValue())) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean removeItemByKey(TKey tkey) {
        int iIndexOfKey = indexOfKey(tkey);
        if (iIndexOfKey >= 0) {
            removeAt(iIndexOfKey);
        }
        return iIndexOfKey >= 0;
    }

    public final void setCapacity(int i) {
        if (i == this.f1735kk.length) {
            return;
        }
        if (i < this.f1731du) {
            ThrowHelper.throwArgumentOutOfRangeException("value", "Capacity is set to a value that is less than Count");
        }
        if (i <= 0) {
            this.f1735kk = f1728k4;
            this.f1737to = f1729x1;
            return;
        }
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        if (this.f1731du > 0) {
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(this.f1735kk, AbstractC14092to.class), 0, (AbstractC14092to) C7019kk.m27458kk(objArr, AbstractC14092to.class), 0, this.f1731du);
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(this.f1737to, AbstractC14092to.class), 0, (AbstractC14092to) C7019kk.m27458kk(objArr2, AbstractC14092to.class), 0, this.f1731du);
        }
        this.f1735kk = objArr;
        this.f1737to = objArr2;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final void set_Item(TKey tkey, TValue tvalue) {
        if (tkey == null) {
            ThrowHelper.throwArgumentNullException("key");
        }
        int iM67195k4 = AbstractC14092to.m67195k4(AbstractC14092to.m67208k4((Object) this.f1735kk), 0, this.f1731du, tkey, this.f1736m9);
        if (iM67195k4 < 0) {
            m953k4(~iM67195k4, tkey, tvalue);
        } else {
            this.f1737to[iM67195k4] = tvalue;
            this.f1733h4++;
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f1731du;
    }

    public final void trimExcess() {
        if (this.f1731du >= OooO00o.OooO00o(this.f1735kk.length, 0.9d, 14)) {
            return;
        }
        setCapacity(this.f1731du);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean tryGetValue(TKey tkey, Object[] objArr) {
        int iIndexOfKey = indexOfKey(tkey);
        if (iIndexOfKey >= 0) {
            objArr[0] = this.f1737to[iIndexOfKey];
            return true;
        }
        objArr[0] = null;
        return false;
    }

    public SortedList(int i) {
        this.f1734jd = new Object();
        if (i < 0) {
            ThrowHelper.throwArgumentOutOfRangeException("capacity", "capacity is less than zero");
        }
        this.f1735kk = new Object[i];
        this.f1737to = new Object[i];
        this.f1736m9 = Comparer.getDefault();
    }

    /* JADX INFO: renamed from: k4 */
    private SortedList<TKey, TValue>.KeyList<TKey, TValue> m950k4() {
        if (this.f1732dy == null) {
            this.f1732dy = new KeyList<>(this);
        }
        return this.f1732dy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public TValue m959x1(int i) {
        if (i < 0 || i >= this.f1731du) {
            ThrowHelper.throwArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than zero or index is equal to or greater than Count");
        }
        return (TValue) this.f1737to[i];
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericList<TKey> getKeys() {
        return m950k4();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericList<TValue> getValues() {
        return m958x1();
    }

    public SortedList(int i, Comparator<TKey> comparator) {
        this(comparator);
        setCapacity(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final void addItem(TKey tkey, TValue tvalue) {
        if (tkey == null) {
            ThrowHelper.throwArgumentNullException("key");
        }
        int iM67195k4 = AbstractC14092to.m67195k4(AbstractC14092to.m67208k4((Object) this.f1735kk), 0, this.f1731du, tkey, this.f1736m9);
        if (iM67195k4 >= 0) {
            ThrowHelper.throwArgumentException("An element with the same key already exists");
        }
        m953k4(~iM67195k4, tkey, tvalue);
    }

    public SortedList(IGenericDictionary<TKey, TValue> iGenericDictionary) {
        this(iGenericDictionary, (Comparator) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m952k4(int i) {
        Object[] objArr = this.f1735kk;
        int length = objArr.length == 0 ? 4 : objArr.length * 2;
        if (length >= i) {
            i = length;
        }
        setCapacity(i);
    }

    public SortedList(IGenericDictionary<TKey, TValue> iGenericDictionary, Comparator<TKey> comparator) {
        this(iGenericDictionary != null ? iGenericDictionary.size() : 0, comparator);
        if (iGenericDictionary == null) {
            ThrowHelper.throwArgumentNullException("dictionary");
        }
        m954k4(iGenericDictionary.getKeys(), this.f1735kk, 0);
        m954k4(iGenericDictionary.getValues(), this.f1737to, 0);
        AbstractC14092to.m67223k4(AbstractC14092to.m67208k4((Object) this.f1735kk), AbstractC14092to.m67208k4((Object) this.f1737to), (Comparator) comparator);
        this.f1731du = iGenericDictionary.size();
    }

    /* JADX INFO: renamed from: k4 */
    private void m953k4(int i, TKey tkey, TValue tvalue) {
        int i2 = this.f1731du;
        if (i2 == this.f1735kk.length) {
            m952k4(i2 + 1);
        }
        if (i < this.f1731du) {
            int i3 = i + 1;
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(this.f1735kk, AbstractC14092to.class), i, (AbstractC14092to) C7019kk.m27458kk(this.f1735kk, AbstractC14092to.class), i3, this.f1731du - i);
            AbstractC14092to.m67216k4((AbstractC14092to) C7019kk.m27458kk(this.f1737to, AbstractC14092to.class), i, (AbstractC14092to) C7019kk.m27458kk(this.f1737to, AbstractC14092to.class), i3, this.f1731du - i);
        }
        this.f1735kk[i] = tkey;
        this.f1737to[i] = tvalue;
        this.f1731du++;
        this.f1733h4++;
    }

    public SortedList(Comparator<TKey> comparator) {
        this();
        if (comparator == null) {
            return;
        }
        this.f1736m9 = comparator;
    }

    /* JADX INFO: renamed from: k4 */
    private <T> void m954k4(IGenericCollection<T> iGenericCollection, Object[] objArr, int i) {
        IGenericEnumerator<T> it = iGenericCollection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }
}
