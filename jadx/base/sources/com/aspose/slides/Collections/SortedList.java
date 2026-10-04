package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.facebook.common.callercontext.ContextChain;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class SortedList implements IDictionary, InterfaceC14059g8 {

    /* JADX INFO: renamed from: du */
    private int f1834du;

    /* JADX INFO: renamed from: h4 */
    private int f1835h4;

    /* JADX INFO: renamed from: k4 */
    private final Object f1836k4;

    /* JADX INFO: renamed from: kk */
    private Comparator f1837kk;

    /* JADX INFO: renamed from: to */
    private int f1838to;

    /* JADX INFO: renamed from: x1 */
    private Slot[] f1839x1;

    public static final class Enumerator implements IDictionaryEnumerator, InterfaceC14059g8 {

        /* JADX INFO: renamed from: c5 */
        private static String f1840c5 = "SortedList.Enumerator: snapshot out of sync.";

        /* JADX INFO: renamed from: du */
        private int f1841du;

        /* JADX INFO: renamed from: dy */
        private boolean f1842dy = false;

        /* JADX INFO: renamed from: h4 */
        private int f1843h4;

        /* JADX INFO: renamed from: k4 */
        private SortedList f1844k4;

        /* JADX INFO: renamed from: kk */
        private Object f1845kk;

        /* JADX INFO: renamed from: m9 */
        private int f1846m9;

        /* JADX INFO: renamed from: to */
        private int f1847to;

        /* JADX INFO: renamed from: x1 */
        private Object f1848x1;

        public Enumerator(SortedList sortedList, int i) {
            this.f1844k4 = sortedList;
            this.f1847to = sortedList.f1834du;
            this.f1843h4 = sortedList.size();
            this.f1846m9 = i;
            reset();
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            Enumerator enumerator = new Enumerator(this.f1844k4, this.f1846m9);
            enumerator.f1847to = this.f1847to;
            enumerator.f1841du = this.f1841du;
            enumerator.f1843h4 = this.f1843h4;
            enumerator.f1848x1 = this.f1848x1;
            enumerator.f1845kk = this.f1845kk;
            enumerator.f1842dy = this.f1842dy;
            return enumerator;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            int i;
            if (this.f1842dy || (i = this.f1841du) >= this.f1843h4 || i == -1) {
                throw new IllegalStateException(f1840c5);
            }
            return new DictionaryEntry(this.f1848x1, this.f1845kk);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            int i;
            if (this.f1842dy || (i = this.f1841du) >= this.f1843h4 || i == -1) {
                throw new IllegalStateException(f1840c5);
            }
            return this.f1848x1;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            int i;
            if (this.f1842dy || (i = this.f1841du) >= this.f1843h4 || i == -1) {
                throw new IllegalStateException(f1840c5);
            }
            return this.f1845kk;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1844k4.f1834du != this.f1847to || this.f1842dy) {
                throw new InvalidOperationException(f1840c5);
            }
            Slot[] slotArr = this.f1844k4.f1839x1;
            int i = this.f1841du + 1;
            this.f1841du = i;
            if (i >= this.f1843h4) {
                this.f1848x1 = null;
                this.f1845kk = null;
                return false;
            }
            Slot slotClone = slotArr[i].Clone();
            this.f1848x1 = slotClone.f1861k4;
            this.f1845kk = slotClone.f1862x1;
            return true;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            int i;
            if (this.f1842dy || (i = this.f1841du) >= this.f1843h4 || i == -1) {
                throw new IllegalStateException(f1840c5);
            }
            int i2 = this.f1846m9;
            if (i2 == 0) {
                return this.f1848x1;
            }
            if (i2 == 1) {
                return this.f1845kk;
            }
            if (i2 == 2) {
                return getEntry();
            }
            throw new NotSupportedException(C14113y2.m67408k4(AbstractC14106wy.getName((Class<?>) EnumeratorMode.class, this.f1846m9), " is not a supported mode."));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1844k4.f1834du != this.f1847to || this.f1842dy) {
                throw new IllegalStateException(f1840c5);
            }
            this.f1841du = -1;
            this.f1848x1 = null;
            this.f1845kk = null;
        }
    }

    @Deprecated
    public static final class EnumeratorJava implements IDictionaryEnumerator, InterfaceC14059g8 {

        /* JADX INFO: renamed from: c5 */
        private static String f1849c5 = "SortedList.EnumeratorJava: snapshot out of sync.";

        /* JADX INFO: renamed from: du */
        private int f1850du;

        /* JADX INFO: renamed from: dy */
        private boolean f1851dy = false;

        /* JADX INFO: renamed from: h4 */
        private int f1852h4;

        /* JADX INFO: renamed from: k4 */
        private SortedList f1853k4;

        /* JADX INFO: renamed from: kk */
        private Object f1854kk;

        /* JADX INFO: renamed from: m9 */
        private int f1855m9;

        /* JADX INFO: renamed from: to */
        private int f1856to;

        /* JADX INFO: renamed from: x1 */
        private Object f1857x1;

        public EnumeratorJava(SortedList sortedList, int i) {
            this.f1853k4 = sortedList;
            this.f1856to = sortedList.f1834du;
            this.f1852h4 = sortedList.size();
            this.f1855m9 = i;
            reset();
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            EnumeratorJava enumeratorJava = new EnumeratorJava(this.f1853k4, this.f1855m9);
            enumeratorJava.f1856to = this.f1856to;
            enumeratorJava.f1850du = this.f1850du;
            enumeratorJava.f1852h4 = this.f1852h4;
            enumeratorJava.f1857x1 = this.f1857x1;
            enumeratorJava.f1854kk = this.f1854kk;
            enumeratorJava.f1851dy = this.f1851dy;
            return enumeratorJava;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            int i;
            if (this.f1851dy || (i = this.f1850du) >= this.f1852h4 || i == -1) {
                throw new IllegalStateException(f1849c5);
            }
            return new DictionaryEntry(this.f1857x1, this.f1854kk);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            int i;
            if (this.f1851dy || (i = this.f1850du) >= this.f1852h4 || i == -1) {
                throw new IllegalStateException(f1849c5);
            }
            return this.f1857x1;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            int i;
            if (this.f1851dy || (i = this.f1850du) >= this.f1852h4 || i == -1) {
                throw new IllegalStateException(f1849c5);
            }
            return this.f1854kk;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1853k4.f1834du != this.f1856to || this.f1851dy) {
                throw new InvalidOperationException(f1849c5);
            }
            int i = this.f1850du + 1;
            this.f1850du = i;
            return i < this.f1852h4;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            boolean z;
            int i;
            if (this.f1853k4.f1834du != this.f1856to || (z = this.f1851dy)) {
                throw new InvalidOperationException(f1849c5);
            }
            if (z || (i = this.f1850du) >= this.f1852h4 || i == -1) {
                if (this.f1850du >= this.f1852h4) {
                    this.f1857x1 = null;
                    this.f1854kk = null;
                }
                throw new IllegalStateException(f1849c5);
            }
            Slot slotClone = this.f1853k4.f1839x1[this.f1850du].Clone();
            Object obj = slotClone.f1861k4;
            this.f1857x1 = obj;
            Object obj2 = slotClone.f1862x1;
            this.f1854kk = obj2;
            int i2 = this.f1855m9;
            if (i2 == 0) {
                return obj;
            }
            if (i2 == 1) {
                return obj2;
            }
            if (i2 == 2) {
                return getEntry();
            }
            throw new NotSupportedException(C14113y2.m67408k4(AbstractC14106wy.getName((Class<?>) EnumeratorMode.class, this.f1855m9), " is not a supported mode."));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1853k4.f1834du != this.f1856to || this.f1851dy) {
                throw new IllegalStateException(f1849c5);
            }
            this.f1850du = -1;
            this.f1857x1 = null;
            this.f1854kk = null;
        }
    }

    public static final class EnumeratorMode extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(EnumeratorMode.class, Integer.class) { // from class: com.aspose.slides.Collections.SortedList.EnumeratorMode.1
                {
                    addConstant("KEY_MODE", 0L);
                    addConstant("VALUE_MODE", 1L);
                    addConstant("ENTRY_MODE", 2L);
                }
            });
        }

        private EnumeratorMode() {
        }
    }

    public static class ListKeys implements IList {

        /* JADX INFO: renamed from: k4 */
        private SortedList f1858k4;

        public ListKeys(SortedList sortedList) {
            if (sortedList == null) {
                throw new ArgumentNullException();
            }
            this.f1858k4 = sortedList;
        }

        @Override // com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            throw new NotSupportedException("IList::Add not supported");
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            throw new NotSupportedException("IList::Clear not supported");
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1858k4.contains(obj);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            this.f1858k4.m1018k4(abstractC14092to, i, 0);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1858k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return this.f1858k4.getKey(i);
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            return this.f1858k4.indexOfKey(obj);
        }

        @Override // com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            throw new NotSupportedException("IList::Insert not supported");
        }

        @Override // com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return true;
        }

        @Override // com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return true;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return this.f1858k4.isSynchronized();
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return new Enumerator(this.f1858k4, 0);
        }

        @Override // com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            throw new NotSupportedException("IList::RemoveAt not supported");
        }

        @Override // com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            throw new NotSupportedException("IList::Remove not supported");
        }

        @Override // com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            throw new NotSupportedException("attempt to modify a key");
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1858k4.size();
        }
    }

    public static class ListValues implements IList {

        /* JADX INFO: renamed from: k4 */
        private SortedList f1859k4;

        public ListValues(SortedList sortedList) {
            if (sortedList == null) {
                throw new ArgumentNullException();
            }
            this.f1859k4 = sortedList;
        }

        @Override // com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            throw new NotSupportedException("IList::Add not supported");
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            throw new NotSupportedException("IList::Clear not supported");
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1859k4.containsValue(obj);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            this.f1859k4.m1018k4(abstractC14092to, i, 1);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1859k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return this.f1859k4.getByIndex(i);
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            return this.f1859k4.indexOfValue(obj);
        }

        @Override // com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            throw new NotSupportedException("IList::Insert not supported");
        }

        @Override // com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return true;
        }

        @Override // com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return true;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return this.f1859k4.isSynchronized();
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return new Enumerator(this.f1859k4, 1);
        }

        @Override // com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            throw new NotSupportedException("IList::RemoveAt not supported");
        }

        @Override // com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            throw new NotSupportedException("IList::Remove not supported");
        }

        @Override // com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            throw new NotSupportedException("This operation is not supported on GetValueList return");
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1859k4.size();
        }
    }

    public static class Slot extends AbstractC7020m9<Slot> {

        /* JADX INFO: renamed from: kk */
        static final /* synthetic */ boolean f1860kk = true;

        /* JADX INFO: renamed from: k4 */
        Object f1861k4;

        /* JADX INFO: renamed from: x1 */
        Object f1862x1;

        public static boolean equals(Slot slot, Slot slot2) {
            return slot.equals(slot2);
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m1027k4(Slot slot) {
            return C14067j2.m66728k4(slot.f1861k4, this.f1861k4) && C14067j2.m66728k4(slot.f1862x1, this.f1862x1);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Slot Clone() {
            Slot slot = new Slot();
            CloneTo(slot);
            return slot;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Slot slot) {
            slot.f1861k4 = this.f1861k4;
            slot.f1862x1 = this.f1862x1;
        }

        public Object clone() {
            return Clone();
        }

        public int hashCode() {
            Object obj = this.f1861k4;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.f1862x1;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (!f1860kk && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Slot) {
                return m1027k4((Slot) obj);
            }
            return false;
        }
    }

    public static class SynchedSortedList extends SortedList {

        /* JADX INFO: renamed from: k4 */
        private SortedList f1863k4;

        public SynchedSortedList(SortedList sortedList) {
            if (sortedList == null) {
                throw new ArgumentNullException();
            }
            this.f1863k4 = sortedList;
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public void addItem(Object obj, Object obj2) {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.m1019k4(obj, obj2, false);
            }
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public void clear() {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.clear();
            }
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public boolean contains(Object obj) {
            boolean z;
            synchronized (this.f1863k4.getSyncRoot()) {
                z = this.f1863k4.m1024x1(obj) >= 0;
            }
            return z;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public boolean containsKey(Object obj) {
            boolean zContains;
            synchronized (this.f1863k4.getSyncRoot()) {
                zContains = this.f1863k4.contains(obj);
            }
            return zContains;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f1863k4.getSyncRoot()) {
                zContainsValue = this.f1863k4.containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.copyTo(abstractC14092to, i);
            }
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            Object objDeepClone;
            synchronized (this.f1863k4.getSyncRoot()) {
                objDeepClone = this.f1863k4.deepClone();
            }
            return objDeepClone;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public Object getByIndex(int i) {
            Object byIndex;
            synchronized (this.f1863k4.getSyncRoot()) {
                byIndex = this.f1863k4.getByIndex(i);
            }
            return byIndex;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public int getCapacity() {
            int capacity;
            synchronized (this.f1863k4.getSyncRoot()) {
                capacity = this.f1863k4.getCapacity();
            }
            return capacity;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public Object getKey(int i) {
            Object key;
            synchronized (this.f1863k4.getSyncRoot()) {
                key = this.f1863k4.getKey(i);
            }
            return key;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public IList getKeyList() {
            ListKeys listKeys;
            synchronized (this.f1863k4.getSyncRoot()) {
                listKeys = new ListKeys(this.f1863k4);
            }
            return listKeys;
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public ICollection getKeys() {
            ICollection keys;
            synchronized (this.f1863k4.getSyncRoot()) {
                keys = this.f1863k4.getKeys();
            }
            return keys;
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1863k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.SortedList
        public IList getValueList() {
            ListValues listValues;
            synchronized (this.f1863k4.getSyncRoot()) {
                listValues = new ListValues(this.f1863k4);
            }
            return listValues;
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public ICollection getValues() {
            ICollection values;
            synchronized (this.f1863k4.getSyncRoot()) {
                values = this.f1863k4.getValues();
            }
            return values;
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public Object get_Item(Object obj) {
            Object objM1013k4;
            synchronized (this.f1863k4.getSyncRoot()) {
                objM1013k4 = this.f1863k4.m1013k4(obj);
            }
            return objM1013k4;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public int indexOfKey(Object obj) {
            int iIndexOfKey;
            synchronized (this.f1863k4.getSyncRoot()) {
                iIndexOfKey = this.f1863k4.indexOfKey(obj);
            }
            return iIndexOfKey;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public int indexOfValue(Object obj) {
            int iIndexOfValue;
            synchronized (this.f1863k4.getSyncRoot()) {
                iIndexOfValue = this.f1863k4.indexOfValue(obj);
            }
            return iIndexOfValue;
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public boolean isFixedSize() {
            return this.f1863k4.isFixedSize();
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public boolean isReadOnly() {
            return this.f1863k4.isReadOnly();
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return true;
        }

        @Override // com.aspose.slides.Collections.SortedList, java.lang.Iterable
        public IDictionaryEnumerator iterator() {
            IDictionaryEnumerator it;
            synchronized (this.f1863k4.getSyncRoot()) {
                it = this.f1863k4.iterator();
            }
            return it;
        }

        @Override // com.aspose.slides.Collections.SortedList
        @Deprecated
        public IDictionaryEnumerator iteratorJava() {
            IDictionaryEnumerator iDictionaryEnumeratorIteratorJava;
            synchronized (this.f1863k4.getSyncRoot()) {
                iDictionaryEnumeratorIteratorJava = this.f1863k4.iteratorJava();
            }
            return iDictionaryEnumeratorIteratorJava;
        }

        @Override // com.aspose.slides.Collections.SortedList
        public void removeAt(int i) {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.removeAt(i);
            }
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public void removeItem(Object obj) {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.removeItem(obj);
            }
        }

        @Override // com.aspose.slides.Collections.SortedList
        public void setByIndex(int i, Object obj) {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.setByIndex(i, obj);
            }
        }

        @Override // com.aspose.slides.Collections.SortedList
        public void setCapacity(int i) {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.setCapacity(i);
            }
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.IDictionary
        public void set_Item(Object obj, Object obj2) {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.m1019k4(obj, obj2, true);
            }
        }

        @Override // com.aspose.slides.Collections.SortedList, com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1863k4.size();
        }

        @Override // com.aspose.slides.Collections.SortedList
        public void trimToSize() {
            synchronized (this.f1863k4.getSyncRoot()) {
                this.f1863k4.trimToSize();
            }
        }
    }

    public SortedList() {
        this((Comparator) null, 16);
    }

    public static SortedList sync(SortedList sortedList) {
        if (sortedList != null) {
            return new SynchedSortedList(sortedList);
        }
        throw new ArgumentNullException("Base list is null.");
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void addItem(Object obj, Object obj2) {
        m1019k4(obj, obj2, false);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void clear() {
        this.f1835h4 = 16;
        this.f1839x1 = m1022k4(16);
        this.f1838to = 0;
        this.f1834du++;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean contains(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException();
        }
        try {
            return m1024x1(obj) >= 0;
        } catch (RuntimeException unused) {
            throw new IllegalStateException();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException();
        }
        try {
            return contains(obj);
        } catch (RuntimeException unused) {
            throw new IllegalStateException();
        }
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new ArgumentException("array is multi-dimensional");
        }
        if (i >= abstractC14092to.m67265du()) {
            throw new ArgumentNullException("arrayIndex is greater than or equal to array.Length");
        }
        if (size() > abstractC14092to.m67265du() - i) {
            throw new ArgumentNullException("Not enough space in array from arrayIndex to end of array");
        }
        IDictionaryEnumerator it = iterator();
        while (it.hasNext()) {
            abstractC14092to.m67276kk(it.getEntry().Clone(), i);
            i++;
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        SortedList sortedList = new SortedList(this, this.f1837kk);
        sortedList.f1834du = this.f1834du;
        return sortedList;
    }

    public Object getByIndex(int i) {
        if (i < 0 || i >= size()) {
            throw new ArgumentOutOfRangeException("index out of range");
        }
        return this.f1839x1[i].f1862x1;
    }

    public int getCapacity() {
        return this.f1839x1.length;
    }

    public Object getKey(int i) {
        if (i < 0 || i >= size()) {
            throw new ArgumentOutOfRangeException("index out of range");
        }
        return this.f1839x1[i].f1861k4;
    }

    public IList getKeyList() {
        return new ListKeys(this);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getKeys() {
        return new ListKeys(this);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this.f1836k4;
    }

    public IList getValueList() {
        return new ListValues(this);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getValues() {
        return new ListValues(this);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public Object get_Item(Object obj) {
        if (obj != null) {
            return m1013k4(obj);
        }
        throw new ArgumentNullException();
    }

    public int indexOfKey(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException();
        }
        try {
            int iM1024x1 = m1024x1(obj);
            return iM1024x1 | (iM1024x1 >> 31);
        } catch (RuntimeException unused) {
            throw new InvalidOperationException();
        }
    }

    public int indexOfValue(Object obj) {
        if (this.f1838to == 0) {
            return -1;
        }
        for (int i = 0; i < this.f1838to; i++) {
            if (C14067j2.m66728k4(obj, this.f1839x1[i].Clone().f1862x1)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IDictionaryEnumerator iterator() {
        return new Enumerator(this, 2);
    }

    @Deprecated
    public IDictionaryEnumerator iteratorJava() {
        return new EnumeratorJava(this, 2);
    }

    public void removeAt(int i) {
        Slot[] slotArr = this.f1839x1;
        int size = size();
        if (i < 0 || i >= size) {
            throw new ArgumentOutOfRangeException("index out of range");
        }
        int i2 = size - 1;
        if (i != i2) {
            m1020k4(slotArr, i + 1, slotArr, i, i2 - i);
        } else {
            Slot slot = slotArr[i];
            slot.f1861k4 = null;
            slot.f1862x1 = null;
        }
        this.f1838to--;
        this.f1834du++;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void removeItem(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            removeAt(iIndexOfKey);
        }
    }

    public void setByIndex(int i, Object obj) {
        if (i < 0 || i >= size()) {
            throw new ArgumentOutOfRangeException("index out of range");
        }
        this.f1839x1[i].f1862x1 = obj;
    }

    public void setCapacity(int i) {
        int length = this.f1839x1.length;
        int i2 = this.f1838to;
        if (i2 > i) {
            throw new ArgumentOutOfRangeException("capacity too small");
        }
        if (i == 0) {
            Slot[] slotArrM1022k4 = m1022k4(this.f1835h4);
            m1020k4(this.f1839x1, 0, slotArrM1022k4, 0, this.f1838to);
            this.f1839x1 = slotArrM1022k4;
        } else if (i > i2) {
            Slot[] slotArrM1022k42 = m1022k4(i);
            m1020k4(this.f1839x1, 0, slotArrM1022k42, 0, this.f1838to);
            this.f1839x1 = slotArrM1022k42;
        } else if (i > length) {
            Slot[] slotArrM1022k43 = m1022k4(i);
            m1020k4(this.f1839x1, 0, slotArrM1022k43, 0, length);
            this.f1839x1 = slotArrM1022k43;
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void set_Item(Object obj, Object obj2) {
        if (obj == null) {
            throw new ArgumentNullException();
        }
        if (isReadOnly()) {
            throw new NotSupportedException("SortedList is Read Only.");
        }
        if (m1024x1(obj) < 0 && isFixedSize()) {
            throw new NotSupportedException("Key not found and SortedList is fixed size.");
        }
        m1019k4(obj, obj2, true);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1838to;
    }

    public void trimToSize() {
        int size;
        boolean z;
        if (size() == 0) {
            size = this.f1835h4;
            z = false;
        } else {
            size = size();
            z = true;
        }
        m1015k4(size, z);
    }

    public SortedList(int i) {
        this((Comparator) null, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public int m1024x1(Object obj) {
        Slot[] slotArr = this.f1839x1;
        int size = size();
        if (size == 0) {
            return -1;
        }
        Comparator comparator = this.f1837kk;
        if (comparator == null) {
            comparator = Comparer.Default;
        }
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >> 1;
            int iCompare = comparator.compare(slotArr[i3].f1861k4, obj);
            if (iCompare == 0) {
                return i3;
            }
            if (iCompare < 0) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        return ~i2;
    }

    public SortedList(IDictionary iDictionary) {
        this(iDictionary, (Comparator) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public Object m1013k4(Object obj) {
        int iM1024x1 = m1024x1(obj);
        if (iM1024x1 >= 0) {
            return this.f1839x1[iM1024x1].f1862x1;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private void m1025x1(int i, boolean z) {
        int i2;
        if (!z && i < (i2 = this.f1835h4)) {
            i = i2;
        }
        this.f1839x1 = m1022k4(i);
        this.f1838to = 0;
        this.f1834du = 0;
    }

    public SortedList(IDictionary iDictionary, Comparator comparator) {
        this.f1836k4 = new Object();
        if (iDictionary == null) {
            throw new ArgumentNullException("dictionary");
        }
        m1025x1(iDictionary.size(), true);
        this.f1837kk = comparator;
        IDictionaryEnumerator it = iDictionary.iterator();
        while (it.hasNext()) {
            addItem(it.getKey(), it.getValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m1014k4(int i, int i2) {
        Slot[] slotArr = this.f1839x1;
        int capacity = getCapacity();
        boolean z = i2 >= 0 && i2 < size();
        Slot[] slotArrM1022k4 = i > capacity ? m1022k4(i << 1) : null;
        if (slotArrM1022k4 == null) {
            if (z) {
                m1020k4(slotArr, i2, slotArr, i2 + 1, size() - i2);
                return;
            }
            return;
        }
        if (z) {
            if (i2 > 0) {
                m1020k4(slotArr, 0, slotArrM1022k4, 0, i2);
            }
            int size = size() - i2;
            if (size > 0) {
                m1020k4(slotArr, i2, slotArrM1022k4, i2 + 1, size);
            }
        } else {
            m1020k4(slotArr, 0, slotArrM1022k4, 0, size());
        }
        this.f1839x1 = slotArrM1022k4;
    }

    public SortedList(Comparator comparator) {
        this.f1836k4 = new Object();
        this.f1837kk = comparator;
        m1025x1(16, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1015k4(int i, boolean z) {
        Slot[] slotArr = this.f1839x1;
        Slot[] slotArrM1022k4 = m1022k4(i);
        if (z) {
            m1020k4(slotArr, 0, slotArrM1022k4, 0, i);
        }
        this.f1839x1 = slotArrM1022k4;
    }

    public SortedList(Comparator comparator, int i) {
        this.f1836k4 = new Object();
        if (i < 0) {
            throw new ArgumentOutOfRangeException("capacity");
        }
        this.f1835h4 = i == 0 ? 0 : 16;
        this.f1837kk = comparator;
        m1025x1(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m1018k4(AbstractC14092to abstractC14092to, int i, int i2) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("arr");
        }
        if (i < 0 || size() + i > abstractC14092to.m67265du()) {
            throw new ArgumentOutOfRangeException(ContextChain.TAG_INFRA);
        }
        Enumerator enumerator = new Enumerator(this, i2);
        while (enumerator.hasNext()) {
            abstractC14092to.m67276kk(enumerator.next(), i);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m1019k4(Object obj, Object obj2, boolean z) {
        if (obj == null) {
            throw new ArgumentNullException("null key");
        }
        Slot[] slotArr = this.f1839x1;
        try {
            int iM1024x1 = m1024x1(obj);
            if (iM1024x1 < 0) {
                int i = ~iM1024x1;
                if (i > getCapacity() + 1) {
                    throw new RuntimeException(C14113y2.m67407k4("SortedList::internal error (", obj, ", ", obj2, ") at [", Integer.valueOf(i), "]"));
                }
                m1014k4(size() + 1, i);
                Slot slot = this.f1839x1[i];
                slot.f1861k4 = obj;
                slot.f1862x1 = obj2;
                this.f1838to++;
            } else {
                if (!z) {
                    throw new ArgumentException(C14113y2.m67402k4("Key '{0}' already exists in list.", obj));
                }
                slotArr[iM1024x1].f1862x1 = obj2;
            }
            this.f1834du++;
        } catch (RuntimeException unused) {
            throw new InvalidOperationException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m1020k4(Slot[] slotArr, int i, Slot[] slotArr2, int i2, int i3) {
        if (slotArr == slotArr2 && m1021k4(i, i2, i3)) {
            Slot[] slotArr3 = new Slot[i3];
            System.arraycopy(slotArr, i, slotArr3, 0, i3);
            i = 0;
            slotArr = slotArr3;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            slotArr2[i2 + i4] = slotArr[i + i4].Clone();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m1021k4(int i, int i2, int i3) {
        if (i >= i2 || i + i3 <= i2) {
            return i2 < i && i2 + i3 > i;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static Slot[] m1022k4(int i) {
        Slot[] slotArr = new Slot[i];
        for (int i2 = 0; i2 < i; i2++) {
            slotArr[i2] = new Slot();
        }
        return slotArr;
    }
}
