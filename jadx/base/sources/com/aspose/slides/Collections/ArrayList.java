package com.aspose.slides.Collections;

import Oooo0oO.C21034OooOOOo;
import com.alipay.share.sdk.openapi.channel.APMessageAct;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14118yn;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class ArrayList implements IList, List {

    /* JADX INFO: renamed from: to */
    private static Object[] f1537to = new Object[0];

    /* JADX INFO: renamed from: k4 */
    private Object[] f1538k4;

    /* JADX INFO: renamed from: kk */
    private int f1539kk;

    /* JADX INFO: renamed from: x1 */
    private int f1540x1;

    public static final class ArrayListAdapter extends ArrayList {

        /* JADX INFO: renamed from: k4 */
        private IList f1541k4;

        public static final class EnumeratorWithRange implements IEnumerator, InterfaceC14059g8, Cloneable {

            /* JADX INFO: renamed from: k4 */
            private int f1542k4;

            /* JADX INFO: renamed from: kk */
            private int f1543kk;

            /* JADX INFO: renamed from: to */
            private IEnumerator f1544to;

            /* JADX INFO: renamed from: x1 */
            private int f1545x1;

            private EnumeratorWithRange() {
            }

            public Object clone() throws CloneNotSupportedException {
                EnumeratorWithRange enumeratorWithRange = new EnumeratorWithRange();
                enumeratorWithRange.f1542k4 = this.f1542k4;
                enumeratorWithRange.f1545x1 = this.f1545x1;
                enumeratorWithRange.f1543kk = this.f1543kk;
                enumeratorWithRange.f1544to = this.f1544to;
                return enumeratorWithRange;
            }

            @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
            public Object deepClone() {
                return m779k4();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                int i = this.f1545x1;
                if (i >= this.f1543kk) {
                    return false;
                }
                this.f1545x1 = i + 1;
                return this.f1544to.hasNext();
            }

            /* JADX INFO: renamed from: k4 */
            public Object m779k4() {
                try {
                    return clone();
                } catch (CloneNotSupportedException e) {
                    throw new IllegalStateException(e);
                }
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public Object next() {
                return this.f1544to.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new NotSupportedException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f1545x1 = 0;
                this.f1544to.reset();
                for (int i = 0; i < this.f1542k4; i++) {
                    this.f1544to.hasNext();
                }
            }

            public EnumeratorWithRange(IEnumerator iEnumerator, int i, int i2) {
                this.f1545x1 = 0;
                this.f1542k4 = i;
                this.f1543kk = i2;
                this.f1544to = iEnumerator;
                reset();
            }
        }

        public ArrayListAdapter(IList iList) {
            super(0, true);
            this.f1541k4 = iList;
        }

        /* JADX INFO: renamed from: k4 */
        private static void m777k4(IList iList, int i, int i2) {
            Object obj = iList.get_Item(i);
            iList.set_Item(i, iList.get_Item(i2));
            iList.set_Item(i2, obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            return this.f1541k4.addItem(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void addRange(ICollection iCollection) {
            Iterator it = iCollection.iterator();
            while (it.hasNext()) {
                this.f1541k4.addItem(it.next());
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(int i, int i2, Object obj, Comparator comparator) {
            ArrayList.m773k4(i, i2, this.f1541k4.size());
            if (comparator == null) {
                comparator = Comparer.Default;
            }
            int i3 = (i2 + i) - 1;
            while (i <= i3) {
                int iOooO00o = C21034OooOOOo.OooO00o(i3, i, 2, i);
                try {
                    int iCompare = comparator.compare(obj, this.f1541k4.get_Item(iOooO00o));
                    if (iCompare < 0) {
                        i3 = iOooO00o - 1;
                    } else {
                        if (iCompare <= 0) {
                            return iOooO00o;
                        }
                        i = iOooO00o + 1;
                    }
                } catch (Exception e) {
                    throw new InvalidOperationException("value is not of the same type", e);
                }
            }
            return ~i;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            this.f1541k4.clear();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1541k4.contains(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void copyTo(int i, AbstractC14092to abstractC14092to, int i2, int i3) {
            if (abstractC14092to == null) {
                throw new ArgumentNullException("array");
            }
            if (i < 0) {
                ArrayList.m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Can't be less than zero.");
            }
            if (i2 < 0) {
                ArrayList.m774k4("arrayIndex", Integer.valueOf(i2), "Can't be less than zero.");
            }
            if (i3 < 0) {
                ArrayList.m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Can't be less than zero.");
            }
            if (abstractC14092to.m67277to() > 1) {
                throw new ArgumentException("Can't copy into multi-dimensional array.");
            }
            if (abstractC14092to.m67265du() - i2 < i3) {
                throw new ArgumentException("Destination array is too small.");
            }
            if (i > this.f1541k4.size() - i3) {
                throw new ArgumentException("Index and count do not denote a valid range of elements.", FirebaseAnalytics.Param.INDEX);
            }
            for (int i4 = 0; i4 < i3; i4++) {
                abstractC14092to.m67276kk(this.f1541k4.get_Item(i + i4), i2 + i4);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public Object deepClone() {
            return new ArrayListAdapter(this.f1541k4);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int getCapacity() {
            return this.f1541k4.size();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public ArrayList getRange(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1541k4.size());
            return new RangedArrayList(this, i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1541k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return this.f1541k4.get_Item(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            return this.f1541k4.indexOf(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            this.f1541k4.insertItem(i, obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, ICollection iCollection) {
            if (iCollection == null) {
                throw new ArgumentNullException("c");
            }
            if (i > this.f1541k4.size()) {
                ArrayList.m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            Iterator it = iCollection.iterator();
            while (it.hasNext()) {
                this.f1541k4.insertItem(i, it.next());
                i++;
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return this.f1541k4.isFixedSize();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return this.f1541k4.isReadOnly();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return this.f1541k4.isSynchronized();
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.lang.Iterable, java.util.List, java.util.Collection
        public IEnumerator iterator() {
            return this.f1541k4.iterator();
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public int lastIndexOf(Object obj) {
            return lastIndexOf(obj, this.f1541k4.size() - 1);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            this.f1541k4.removeAt(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            this.f1541k4.removeItem(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void removeRange(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1541k4.size());
            for (int i3 = 0; i3 < i2; i3++) {
                this.f1541k4.removeAt(i);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void reverse() {
            reverse(0, this.f1541k4.size());
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void setCapacity(int i) {
            if (i < this.f1541k4.size()) {
                throw new ArgumentException("capacity");
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void setRange(int i, ICollection iCollection) {
            if (iCollection == null) {
                throw new ArgumentNullException("c");
            }
            if (i < 0 || iCollection.size() + i > this.f1541k4.size()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            Iterator it = iCollection.iterator();
            while (it.hasNext()) {
                this.f1541k4.set_Item(i, it.next());
                i++;
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            this.f1541k4.set_Item(i, obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1541k4.size();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void sort() {
            sort(Comparer.Default);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public AbstractC14092to toArray(AbstractC14068j5 abstractC14068j5) {
            AbstractC14092to abstractC14092toM67205k4 = AbstractC14092to.m67205k4(abstractC14068j5, this.f1541k4.size());
            this.f1541k4.copyTo(abstractC14092toM67205k4, 0);
            return abstractC14092toM67205k4;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void trimToSize() {
        }

        /* JADX INFO: renamed from: k4 */
        public static void m778k4(IList iList, int i, int i2, Comparator comparator) {
            if (i >= i2) {
                return;
            }
            int i3 = i2 - i;
            int i4 = (i3 / 2) + i;
            if (comparator.compare(iList.get_Item(i4), iList.get_Item(i)) < 0) {
                m777k4(iList, i4, i);
            }
            if (comparator.compare(iList.get_Item(i2), iList.get_Item(i)) < 0) {
                m777k4(iList, i2, i);
            }
            if (comparator.compare(iList.get_Item(i2), iList.get_Item(i4)) < 0) {
                m777k4(iList, i2, i4);
            }
            if (i3 + 1 <= 3) {
                return;
            }
            int i5 = i2 - 1;
            m777k4(iList, i5, i4);
            Object obj = iList.get_Item(i5);
            int i6 = i;
            int i7 = i5;
            while (true) {
                int i8 = i6 + 1;
                if (comparator.compare(iList.get_Item(i8), obj) >= 0) {
                    do {
                        i7--;
                    } while (comparator.compare(iList.get_Item(i7), obj) > 0);
                    if (i8 >= i7) {
                        m777k4(iList, i5, i8);
                        m778k4(iList, i, i6, comparator);
                        m778k4(iList, i6 + 2, i2, comparator);
                        return;
                    }
                    m777k4(iList, i8, i7);
                }
                i6 = i8;
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj) {
            return binarySearch(obj, null);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void copyTo(AbstractC14092to abstractC14092to) {
            this.f1541k4.copyTo(abstractC14092to, 0);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i) {
            return indexOf(obj, i, this.f1541k4.size() - i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public IEnumerator iterator(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1541k4.size());
            return new EnumeratorWithRange(this.f1541k4.iterator(), i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i) {
            return lastIndexOf(obj, i, i + 1);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void reverse(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1541k4.size());
            for (int i3 = 0; i3 < i2 / 2; i3++) {
                int i4 = i3 + i;
                Object obj = this.f1541k4.get_Item(i4);
                IList iList = this.f1541k4;
                int i5 = (((i + i2) - i3) + i) - 1;
                iList.set_Item(i4, iList.get_Item(i5));
                this.f1541k4.set_Item(i5, obj);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void sort(int i, int i2, Comparator comparator) {
            ArrayList.m773k4(i, i2, this.f1541k4.size());
            if (comparator == null) {
                comparator = Comparer.Default;
            }
            m778k4(this.f1541k4, i, (i2 + i) - 1, comparator);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public Object[] toArray() {
            Object[] objArr = new Object[this.f1541k4.size()];
            this.f1541k4.copyTo(AbstractC14092to.m67208k4((Object) objArr), 0);
            return objArr;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj, Comparator comparator) {
            return binarySearch(0, this.f1541k4.size(), obj, comparator);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            this.f1541k4.copyTo(abstractC14092to, i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i, int i2) {
            if (i < 0 || i > this.f1541k4.size()) {
                ArrayList.m774k4("startIndex", Integer.valueOf(i), "Does not specify valid index.");
            }
            if (i2 < 0) {
                ArrayList.m774k4(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
            }
            if (i > this.f1541k4.size() - i2) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Start index and count do not specify a valid range.");
            }
            if (obj == null) {
                for (int i3 = i; i3 < i + i2; i3++) {
                    if (this.f1541k4.get_Item(i3) == null) {
                        return i3;
                    }
                }
                return -1;
            }
            for (int i4 = i; i4 < i + i2; i4++) {
                if (obj.equals(this.f1541k4.get_Item(i4))) {
                    return i4;
                }
            }
            return -1;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i, int i2) {
            if (i < 0) {
                ArrayList.m774k4("startIndex", Integer.valueOf(i), "< 0");
            }
            if (i2 < 0) {
                ArrayList.m774k4(C18293o1.f55803f, Integer.valueOf(i2), "count is negative.");
            }
            int i3 = i - i2;
            if (i3 + 1 < 0) {
                ArrayList.m774k4(C18293o1.f55803f, Integer.valueOf(i2), "count is too large.");
            }
            if (obj == null) {
                while (i > i3) {
                    if (this.f1541k4.get_Item(i) == null) {
                        return i;
                    }
                    i--;
                }
                return -1;
            }
            while (i > i3) {
                if (obj.equals(this.f1541k4.get_Item(i))) {
                    return i;
                }
                i--;
            }
            return -1;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public void sort(Comparator comparator) {
            sort(0, this.f1541k4.size(), comparator);
        }
    }

    public static final class ArrayListEnumerator implements IEnumerator, InterfaceC14059g8, Cloneable {

        /* JADX INFO: renamed from: du */
        private int f1546du;

        /* JADX INFO: renamed from: h4 */
        private int f1547h4;

        /* JADX INFO: renamed from: k4 */
        private Object f1548k4;

        /* JADX INFO: renamed from: kk */
        private int f1549kk;

        /* JADX INFO: renamed from: to */
        private int f1550to;

        /* JADX INFO: renamed from: x1 */
        private ArrayList f1551x1;

        private ArrayListEnumerator() {
        }

        public Object clone() throws CloneNotSupportedException {
            ArrayListEnumerator arrayListEnumerator = new ArrayListEnumerator();
            arrayListEnumerator.f1548k4 = this.f1548k4;
            arrayListEnumerator.f1551x1 = this.f1551x1;
            arrayListEnumerator.f1549kk = this.f1549kk;
            arrayListEnumerator.f1550to = this.f1550to;
            arrayListEnumerator.f1546du = this.f1546du;
            arrayListEnumerator.f1547h4 = this.f1547h4;
            return arrayListEnumerator;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            return m780k4();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1551x1.getVersion() != this.f1547h4) {
                throw new IllegalStateException("List has changed.");
            }
            int i = this.f1549kk + 1;
            this.f1549kk = i;
            if (i - this.f1550to >= this.f1546du) {
                return false;
            }
            this.f1548k4 = this.f1551x1.get_Item(i);
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public Object m780k4() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            if (this.f1549kk != this.f1550to - 1) {
                return this.f1548k4;
            }
            throw new IllegalStateException("Enumerator unusable (Reset pending, or past end of array.");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            this.f1548k4 = null;
            this.f1549kk = this.f1550to - 1;
        }

        public ArrayListEnumerator(ArrayList arrayList, int i, int i2) {
            this.f1551x1 = arrayList;
            this.f1550to = i;
            this.f1546du = i2;
            this.f1549kk = i - 1;
            this.f1548k4 = null;
            this.f1547h4 = arrayList.getVersion();
        }
    }

    public static class ArrayListInternalized extends ArrayList {

        /* JADX INFO: renamed from: k4 */
        private List f1552k4;

        /* JADX INFO: renamed from: x1 */
        private int f1553x1;

        public ArrayListInternalized(List list) {
            this.f1552k4 = list;
            if (list instanceof ArrayList) {
                this.f1553x1 = ((ArrayList) list).getVersion();
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public void add(int i, Object obj) {
            this.f1552k4.add(i, obj);
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public boolean addAll(int i, Collection collection) {
            this.f1553x1++;
            return this.f1552k4.addAll(i, collection);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            int size = this.f1552k4.size();
            this.f1552k4.add(obj);
            this.f1553x1++;
            return size;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void addRange(ICollection iCollection) {
            if (iCollection == null) {
                throw new ArgumentNullException("c");
            }
            insertRange(size(), iCollection);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(int i, int i2, Object obj, Comparator comparator) {
            try {
                return C14118yn.m67554k4(this.f1552k4.toArray(), i, i2, obj, comparator);
            } catch (InvalidOperationException e) {
                throw new ArgumentException(e.getMessage());
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            this.f1552k4.clear();
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1552k4.contains(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f1552k4.containsAll(collection);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void copyTo(int i, AbstractC14092to abstractC14092to, int i2, int i3) {
            if (abstractC14092to == null) {
                throw new ArgumentNullException("array");
            }
            if (abstractC14092to.m67277to() != 1) {
                throw new ArgumentException("Must have only 1 dimensions.", "array");
            }
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1552k4.toArray()), i, abstractC14092to, i2, i3);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public Object deepClone() {
            AbstractC14092to.m67234k4(this.f1552k4.toArray(), 0, new Object[this.f1552k4.size()], 0, this.f1552k4.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(arrayList);
            return new ArrayListInternalized(arrayList);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public Object get(int i) {
            return this.f1552k4.get(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int getCapacity() {
            return Math.max(super.getCapacity(), this.f1552k4.size());
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public ArrayList getRange(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1552k4.size());
            return isSynchronized() ? ArrayList.sync((ArrayList) new RangedArrayList(this, i, i2)) : new RangedArrayList(this, i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int getVersion() {
            List list = this.f1552k4;
            return list instanceof ArrayList ? ((ArrayList) list).getVersion() : this.f1553x1;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return this.f1552k4.get(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            return this.f1552k4.indexOf(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            if (i < 0 || i > this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            this.f1552k4.add(i, obj);
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, ICollection iCollection) {
            if (iCollection == null) {
                throw new ArgumentNullException("c");
            }
            if (i < 0 || i > this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            Iterator it = iCollection.iterator();
            while (it.hasNext()) {
                this.f1552k4.add(i, it.next());
                i++;
            }
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f1552k4.size() == 0;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return false;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return false;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return false;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.lang.Iterable, java.util.List, java.util.Collection
        public IEnumerator iterator() {
            return new SimpleEnumerator(this);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public int lastIndexOf(Object obj) {
            return this.f1552k4.lastIndexOf(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public ListIterator listIterator() {
            return this.f1552k4.listIterator();
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public Object remove(int i) {
            this.f1553x1++;
            return this.f1552k4.remove(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            this.f1553x1++;
            return this.f1552k4.removeAll(collection);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            if (i < 0 || i > this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            this.f1552k4.remove(i);
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            this.f1552k4.remove(obj);
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void removeRange(int i, int i2) {
            if (i < 0 || i > this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
            }
            if (i > this.f1552k4.size() - i2) {
                throw new ArgumentException("Index and count do not denote a valid range of elements.", FirebaseAnalytics.Param.INDEX);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                this.f1552k4.remove(i);
            }
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            this.f1553x1++;
            return this.f1552k4.retainAll(collection);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void reverse() {
            reverse(0, this.f1552k4.size());
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public Object set(int i, Object obj) {
            this.f1553x1++;
            return this.f1552k4.set(i, obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void setCapacity(int i) {
            if (i < this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException("Capacity", Integer.valueOf(i), "Must be more than count.");
            }
            for (int i2 = 0; i2 < i - this.f1552k4.size(); i2++) {
                this.f1552k4.add(null);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void setRange(int i, ICollection iCollection) {
            if (iCollection == null) {
                throw new ArgumentNullException("c");
            }
            if (i < 0 || iCollection.size() + i > this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            Iterator it = iCollection.iterator();
            while (it.hasNext()) {
                this.f1552k4.set(i, it.next());
                i++;
            }
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            this.f1552k4.set(i, obj);
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1552k4.size();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void sort() {
            Collections.sort(this.f1552k4, null);
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public List subList(int i, int i2) {
            return this.f1552k4.subList(i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public AbstractC14092to toArray(AbstractC14068j5 abstractC14068j5) {
            AbstractC14092to abstractC14092toM67205k4 = AbstractC14092to.m67205k4(abstractC14068j5, this.f1552k4.size());
            copyTo(abstractC14092toM67205k4);
            return abstractC14092toM67205k4;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void trimToSize() {
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public boolean add(Object obj) {
            this.f1553x1++;
            return this.f1552k4.add(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f1553x1++;
            return this.f1552k4.addAll(collection);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void addRange(Object[] objArr) {
            if (objArr == null) {
                throw new ArgumentNullException("c");
            }
            insertRange(this.f1552k4.size(), objArr);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj) {
            if (obj == null) {
                return -1;
            }
            try {
                return C14118yn.m67553k4(this.f1552k4.toArray(), 0, this.f1552k4.size(), obj);
            } catch (InvalidOperationException e) {
                throw new ArgumentException(e.getMessage());
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void copyTo(AbstractC14092to abstractC14092to) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1552k4.toArray()), 0, abstractC14092to, 0, this.f1552k4.size());
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i) {
            return indexOf(obj, i, this.f1552k4.size() - i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, Object[] objArr) {
            if (objArr == null) {
                throw new ArgumentNullException("c");
            }
            if (i < 0 || i > this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                this.f1552k4.add(i, objArr[i2]);
                i2++;
                i++;
            }
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public IEnumerator iterator(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1552k4.size());
            return new ArrayListEnumerator(this, i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i) {
            return lastIndexOf(obj, i, i + 1);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public ListIterator listIterator(int i) {
            return this.f1552k4.listIterator(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            this.f1553x1++;
            return this.f1552k4.remove(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void reverse(int i, int i2) {
            if (i < 0) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Can't be less than 0.");
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
            }
            if (i > this.f1552k4.size() - i2) {
                throw new ArgumentException("Index and count do not denote a valid range of elements.", FirebaseAnalytics.Param.INDEX);
            }
            for (int size = (this.f1552k4.size() + i) - 1; i < size; size--) {
                Object obj = this.f1552k4.get(i);
                List list = this.f1552k4;
                list.set(i, list.get(size));
                this.f1552k4.set(size, obj);
                i++;
            }
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void sort(int i, int i2, Comparator comparator) {
            if (i < 0) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Can't be less than 0.");
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
            }
            if (i > this.f1552k4.size() - i2) {
                throw new ArgumentException("Index and count do not denote a valid range of elements.", FirebaseAnalytics.Param.INDEX);
            }
            List listSubList = this.f1552k4.subList(i, i2);
            if (comparator == null) {
                Collections.sort(listSubList);
            } else {
                Collections.sort(listSubList, comparator);
            }
            for (int i3 = i; i3 < i2; i3++) {
                this.f1552k4.set(i3, listSubList.get(i3 - i));
            }
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public Object[] toArray() {
            return this.f1552k4.toArray();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj, Comparator comparator) {
            try {
                return C14118yn.m67554k4(this.f1552k4.toArray(), 0, this.f1552k4.size(), obj, comparator);
            } catch (InvalidOperationException e) {
                throw new ArgumentException(e.getMessage());
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            copyTo(0, abstractC14092to, i, this.f1552k4.size());
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i, int i2) {
            if (i < 0 || i > this.f1552k4.size()) {
                throw new ArgumentOutOfRangeException("startIndex", Integer.valueOf(i), "Does not specify valid index.");
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
            }
            if (i <= this.f1552k4.size() - i2) {
                return AbstractC14092to.m67202k4(this.f1552k4.toArray(), obj, i, i2);
            }
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Start index and count do not specify a valid range.");
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i, int i2) {
            return C14118yn.m67555k4(this.f1552k4.toArray(), obj, i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public void sort(Comparator comparator) {
            Collections.sort(this.f1552k4, comparator);
            this.f1553x1++;
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return this.f1552k4.toArray(objArr);
        }
    }

    public static class ArrayListWrapper extends ArrayList {

        /* JADX INFO: renamed from: k4 */
        protected ArrayList f1554k4;

        public ArrayListWrapper(ArrayList arrayList) {
            this.f1554k4 = arrayList;
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            return this.f1554k4.addItem(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void addRange(ICollection iCollection) {
            this.f1554k4.addRange(iCollection);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(int i, int i2, Object obj, Comparator comparator) {
            return this.f1554k4.binarySearch(i, i2, obj, comparator);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            this.f1554k4.clear();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1554k4.contains(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void copyTo(int i, AbstractC14092to abstractC14092to, int i2, int i3) {
            this.f1554k4.copyTo(i, abstractC14092to, i2, i3);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public Object deepClone() {
            return this.f1554k4.deepClone();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int getCapacity() {
            return this.f1554k4.getCapacity();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public ArrayList getRange(int i, int i2) {
            return this.f1554k4.getRange(i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1554k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return this.f1554k4.get_Item(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            return this.f1554k4.indexOf(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            this.f1554k4.insertItem(i, obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, ICollection iCollection) {
            this.f1554k4.insertRange(i, iCollection);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return this.f1554k4.isFixedSize();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return this.f1554k4.isReadOnly();
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return this.f1554k4.isSynchronized();
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.lang.Iterable, java.util.List, java.util.Collection
        public IEnumerator iterator() {
            return this.f1554k4.iterator();
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public int lastIndexOf(Object obj) {
            return this.f1554k4.lastIndexOf(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            this.f1554k4.removeAt(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            this.f1554k4.removeItem(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void removeRange(int i, int i2) {
            this.f1554k4.removeRange(i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void reverse() {
            this.f1554k4.reverse();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void setCapacity(int i) {
            this.f1554k4.setCapacity(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void setRange(int i, ICollection iCollection) {
            this.f1554k4.setRange(i, iCollection);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            this.f1554k4.set_Item(i, obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1554k4.size();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void sort() {
            this.f1554k4.sort();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public AbstractC14092to toArray(AbstractC14068j5 abstractC14068j5) {
            return this.f1554k4.toArray(abstractC14068j5);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void trimToSize() {
            this.f1554k4.trimToSize();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj) {
            return this.f1554k4.binarySearch(obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void copyTo(AbstractC14092to abstractC14092to) {
            this.f1554k4.copyTo(abstractC14092to);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i) {
            return this.f1554k4.indexOf(obj, i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public IEnumerator iterator(int i, int i2) {
            return this.f1554k4.iterator(i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i) {
            return this.f1554k4.lastIndexOf(obj, i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void reverse(int i, int i2) {
            this.f1554k4.reverse(i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void sort(int i, int i2, Comparator comparator) {
            this.f1554k4.sort(i, i2, comparator);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public Object[] toArray() {
            return this.f1554k4.toArray();
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj, Comparator comparator) {
            return this.f1554k4.binarySearch(obj, comparator);
        }

        @Override // com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            this.f1554k4.copyTo(abstractC14092to, i);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i, int i2) {
            return this.f1554k4.indexOf(obj, i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i, int i2) {
            return this.f1554k4.lastIndexOf(obj, i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList, java.util.List
        public void sort(Comparator comparator) {
            this.f1554k4.sort(comparator);
        }
    }

    public static class FixedSizeArrayListWrapper extends ArrayListWrapper {
        public FixedSizeArrayListWrapper(ArrayList arrayList) {
            super(arrayList);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void addRange(ICollection iCollection) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int getCapacity() {
            return super.getCapacity();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, ICollection iCollection) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public String mo781k4() {
            return "Can't add or remove from a fixed-size list.";
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void removeRange(int i, int i2) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void setCapacity(int i) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void trimToSize() {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, Object[] objArr) {
            throw new NotSupportedException(mo781k4());
        }
    }

    public static class FixedSizeListWrapper extends ListWrapper {
        public FixedSizeListWrapper(IList iList) {
            super(iList);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            throw new NotSupportedException(mo782k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            throw new NotSupportedException(mo782k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            throw new NotSupportedException(mo782k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public String mo782k4() {
            return "List is fixed-size.";
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            throw new NotSupportedException(mo782k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            throw new NotSupportedException(mo782k4());
        }
    }

    public class Itr implements Iterator {

        /* JADX INFO: renamed from: k4 */
        int f1555k4;

        /* JADX INFO: renamed from: x1 */
        int f1557x1;

        private Itr() {
            this.f1557x1 = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1555k4 != ArrayList.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i = this.f1555k4;
            if (i >= ArrayList.this.size()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = ArrayList.this.f1538k4;
            if (i >= objArr.length) {
                throw new ConcurrentModificationException();
            }
            this.f1555k4 = i + 1;
            this.f1557x1 = i;
            return objArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.f1557x1;
            if (i < 0) {
                throw new IllegalStateException();
            }
            try {
                ArrayList.this.remove(i);
                this.f1555k4 = this.f1557x1;
                this.f1557x1 = -1;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public class ListItr extends Itr implements ListIterator {
        public ListItr(int i) {
            super();
            this.f1555k4 = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            try {
                int i = this.f1555k4;
                ArrayList.this.add(i, obj);
                this.f1555k4 = i + 1;
                this.f1557x1 = -1;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1555k4 != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f1555k4;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.f1555k4 - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            Object[] objArr = ArrayList.this.f1538k4;
            if (i >= objArr.length) {
                throw new ConcurrentModificationException();
            }
            this.f1555k4 = i;
            this.f1557x1 = i;
            return objArr[i];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f1555k4 - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            if (this.f1557x1 < 0) {
                throw new IllegalStateException();
            }
            try {
                ArrayList.this.f1538k4[this.f1557x1] = obj;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public static class ListWrapper implements IList {

        /* JADX INFO: renamed from: k4 */
        protected IList f1559k4;

        public ListWrapper(IList iList) {
            this.f1559k4 = iList;
        }

        @Override // com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            return this.f1559k4.addItem(obj);
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            this.f1559k4.clear();
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1559k4.contains(obj);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            this.f1559k4.copyTo(abstractC14092to, i);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1559k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return this.f1559k4.get_Item(i);
        }

        @Override // com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            return this.f1559k4.indexOf(obj);
        }

        @Override // com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            this.f1559k4.insertItem(i, obj);
        }

        @Override // com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            return this.f1559k4.isFixedSize();
        }

        @Override // com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return this.f1559k4.isReadOnly();
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return this.f1559k4.isSynchronized();
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return this.f1559k4.iterator();
        }

        @Override // com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            this.f1559k4.removeAt(i);
        }

        @Override // com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            this.f1559k4.removeItem(obj);
        }

        @Override // com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            this.f1559k4.set_Item(i, obj);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1559k4.size();
        }
    }

    public static final class RangedArrayList extends ArrayListWrapper {

        /* JADX INFO: renamed from: kk */
        private int f1560kk;

        /* JADX INFO: renamed from: to */
        private int f1561to;

        /* JADX INFO: renamed from: x1 */
        private int f1562x1;

        public RangedArrayList(ArrayList arrayList, int i, int i2) {
            super(arrayList);
            this.f1562x1 = i;
            this.f1560kk = i2;
            this.f1561to = arrayList.getVersion();
        }

        /* JADX INFO: renamed from: k4 */
        private void m783k4() {
            if (this.f1561to != ((ArrayListWrapper) this).f1554k4.getVersion()) {
                throw new IllegalStateException("ArrayList view is invalid because the underlying ArrayList was modified.");
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            m783k4();
            ((ArrayListWrapper) this).f1554k4.insertItem(this.f1562x1 + this.f1560kk, obj);
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
            int i = this.f1560kk + 1;
            this.f1560kk = i;
            return i;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void addRange(ICollection iCollection) {
            m783k4();
            ((ArrayListWrapper) this).f1554k4.insertRange(this.f1560kk, iCollection);
            this.f1560kk = iCollection.size() + this.f1560kk;
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int binarySearch(int i, int i2, Object obj, Comparator comparator) {
            ArrayList.m773k4(i, i2, this.f1560kk);
            return ((ArrayListWrapper) this).f1554k4.binarySearch(this.f1562x1 + i, i2, obj, comparator);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            m783k4();
            ((ArrayListWrapper) this).f1554k4.removeRange(this.f1562x1, this.f1560kk);
            this.f1560kk = 0;
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return ((ArrayListWrapper) this).f1554k4.m776k4(obj, this.f1562x1, this.f1560kk);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void copyTo(int i, AbstractC14092to abstractC14092to, int i2, int i3) {
            ArrayList.m773k4(i, i3, this.f1560kk);
            ((ArrayListWrapper) this).f1554k4.copyTo(this.f1562x1 + i, abstractC14092to, i2, i3);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public Object deepClone() {
            return new RangedArrayList((ArrayList) ((ArrayListWrapper) this).f1554k4.deepClone(), this.f1562x1, this.f1560kk);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int getCapacity() {
            return ((ArrayListWrapper) this).f1554k4.getCapacity();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public ArrayList getRange(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1560kk);
            return new RangedArrayList(this, i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            if (i < 0 || i > this.f1560kk) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            return ((ArrayListWrapper) this).f1554k4.get_Item(this.f1562x1 + i);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            return indexOf(obj, 0);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            m783k4();
            if (i < 0 || i > this.f1560kk) {
                ArrayList.m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            ((ArrayListWrapper) this).f1554k4.insertItem(this.f1562x1 + i, obj);
            this.f1560kk++;
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, ICollection iCollection) {
            m783k4();
            if (i < 0 || i > this.f1560kk) {
                ArrayList.m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            ((ArrayListWrapper) this).f1554k4.insertRange(this.f1562x1 + i, iCollection);
            this.f1560kk = iCollection.size() + this.f1560kk;
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return false;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.lang.Iterable, java.util.List, java.util.Collection
        public IEnumerator iterator() {
            return iterator(0, this.f1560kk);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.util.List
        public int lastIndexOf(Object obj) {
            return lastIndexOf(obj, this.f1560kk - 1);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            m783k4();
            if (i < 0 || i > this.f1560kk) {
                ArrayList.m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            ((ArrayListWrapper) this).f1554k4.removeAt(this.f1562x1 + i);
            this.f1560kk--;
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            m783k4();
            int iIndexOf = indexOf(obj);
            if (iIndexOf > -1) {
                removeAt(iIndexOf);
            }
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void removeRange(int i, int i2) {
            m783k4();
            ArrayList.m773k4(i, i2, this.f1560kk);
            ((ArrayListWrapper) this).f1554k4.removeRange(this.f1562x1 + i, i2);
            this.f1560kk -= i2;
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void reverse() {
            reverse(0, this.f1560kk);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void setCapacity(int i) {
            if (i < this.f1560kk) {
                throw new ArgumentOutOfRangeException();
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void setRange(int i, ICollection iCollection) {
            m783k4();
            if (i < 0 || i > this.f1560kk) {
                ArrayList.m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
            }
            ((ArrayListWrapper) this).f1554k4.setRange(this.f1562x1 + i, iCollection);
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            if (i < 0 || i > this.f1560kk) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            ((ArrayListWrapper) this).f1554k4.set_Item(this.f1562x1 + i, obj);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public int size() {
            m783k4();
            return this.f1560kk;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void sort() {
            sort(Comparer.Default);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public AbstractC14092to toArray(AbstractC14068j5 abstractC14068j5) {
            AbstractC14092to abstractC14092toM67205k4 = AbstractC14092to.m67205k4(abstractC14068j5, this.f1560kk);
            ((ArrayListWrapper) this).f1554k4.copyTo(this.f1562x1, abstractC14092toM67205k4, 0, this.f1560kk);
            return abstractC14092toM67205k4;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void trimToSize() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj) {
            return binarySearch(0, this.f1560kk, obj, Comparer.Default);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void copyTo(AbstractC14092to abstractC14092to) {
            copyTo(abstractC14092to, 0);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i) {
            return indexOf(obj, i, this.f1560kk - i);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public IEnumerator iterator(int i, int i2) {
            ArrayList.m773k4(i, i2, this.f1560kk);
            return ((ArrayListWrapper) this).f1554k4.iterator(this.f1562x1 + i, i2);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i) {
            return lastIndexOf(obj, i, i + 1);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void reverse(int i, int i2) {
            m783k4();
            ArrayList.m773k4(i, i2, this.f1560kk);
            ((ArrayListWrapper) this).f1554k4.reverse(this.f1562x1 + i, i2);
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void sort(int i, int i2, Comparator comparator) {
            m783k4();
            ArrayList.m773k4(i, i2, this.f1560kk);
            ((ArrayListWrapper) this).f1554k4.sort(this.f1562x1 + i, i2, comparator);
            this.f1561to = ((ArrayListWrapper) this).f1554k4.getVersion();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public Object[] toArray() {
            Object[] objArr = new Object[this.f1560kk];
            ((ArrayListWrapper) this).f1554k4.copyTo(this.f1562x1, AbstractC14092to.m67208k4((Object) objArr), 0, this.f1560kk);
            return objArr;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj, Comparator comparator) {
            return binarySearch(0, this.f1560kk, obj, comparator);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            copyTo(0, abstractC14092to, i, this.f1560kk);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i, int i2) {
            if (i < 0 || i > this.f1560kk) {
                ArrayList.m774k4("startIndex", Integer.valueOf(i), "Does not specify valid index.");
            }
            if (i2 < 0) {
                ArrayList.m774k4(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
            }
            if (i > this.f1560kk - i2) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Start index and count do not specify a valid range.");
            }
            int iIndexOf = ((ArrayListWrapper) this).f1554k4.indexOf(obj, this.f1562x1 + i, i2);
            if (iIndexOf == -1) {
                return -1;
            }
            return iIndexOf - this.f1562x1;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i, int i2) {
            if (i < 0) {
                ArrayList.m774k4("startIndex", Integer.valueOf(i), "< 0");
            }
            if (i2 < 0) {
                ArrayList.m774k4(C18293o1.f55803f, Integer.valueOf(i2), "count is negative.");
            }
            int iLastIndexOf = ((ArrayListWrapper) this).f1554k4.lastIndexOf(obj, this.f1562x1 + i, i2);
            if (iLastIndexOf == -1) {
                return -1;
            }
            return iLastIndexOf - this.f1562x1;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.util.List
        public void sort(Comparator comparator) {
            sort(0, this.f1560kk, comparator);
        }
    }

    public static final class ReadOnlyArrayListWrapper extends FixedSizeArrayListWrapper {
        public ReadOnlyArrayListWrapper(ArrayList arrayList) {
            super(arrayList);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return ((ArrayListWrapper) this).f1554k4.get_Item(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return true;
        }

        @Override // com.aspose.slides.Collections.ArrayList.FixedSizeArrayListWrapper
        /* JADX INFO: renamed from: k4 */
        public String mo781k4() {
            return "Can't modify a readonly list.";
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void reverse() {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void setRange(int i, ICollection iCollection) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void sort() {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void reverse(int i, int i2) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void sort(int i, int i2, Comparator comparator) {
            throw new NotSupportedException(mo781k4());
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.util.List
        public void sort(Comparator comparator) {
            throw new NotSupportedException(mo781k4());
        }
    }

    public static final class ReadOnlyListWrapper extends FixedSizeListWrapper {
        public ReadOnlyListWrapper(IList iList) {
            super(iList);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            return this.f1559k4.get_Item(i);
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            return true;
        }

        @Override // com.aspose.slides.Collections.ArrayList.FixedSizeListWrapper
        /* JADX INFO: renamed from: k4 */
        public String mo782k4() {
            return "List is read-only.";
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            throw new NotSupportedException(mo782k4());
        }
    }

    public static final class SimpleEnumerator implements IEnumerator, InterfaceC14059g8, Cloneable {

        /* JADX INFO: renamed from: k4 */
        static Object f1563k4 = new Object();

        /* JADX INFO: renamed from: du */
        private int f1564du;

        /* JADX INFO: renamed from: kk */
        private Object f1565kk;

        /* JADX INFO: renamed from: to */
        private int f1566to;

        /* JADX INFO: renamed from: x1 */
        private ArrayList f1567x1;

        private SimpleEnumerator() {
        }

        public Object clone() throws CloneNotSupportedException {
            SimpleEnumerator simpleEnumerator = new SimpleEnumerator();
            simpleEnumerator.f1567x1 = this.f1567x1;
            simpleEnumerator.f1565kk = this.f1565kk;
            simpleEnumerator.f1566to = this.f1566to;
            simpleEnumerator.f1564du = this.f1564du;
            return simpleEnumerator;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            return m784k4();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1564du != this.f1567x1.getVersion()) {
                throw new IllegalStateException("List has changed.");
            }
            int i = this.f1566to + 1;
            this.f1566to = i;
            if (i < this.f1567x1.size()) {
                this.f1565kk = this.f1567x1.get_Item(this.f1566to);
                return true;
            }
            this.f1565kk = f1563k4;
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public Object m784k4() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            Object obj = this.f1565kk;
            if (obj != f1563k4) {
                return obj;
            }
            if (this.f1566to == -1) {
                throw new IllegalStateException("Enumerator not started");
            }
            throw new IllegalStateException("Enumerator ended");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1564du != this.f1567x1.getVersion()) {
                throw new IllegalStateException("List has changed.");
            }
            this.f1565kk = f1563k4;
            this.f1566to = -1;
        }

        public SimpleEnumerator(ArrayList arrayList) {
            this.f1567x1 = arrayList;
            this.f1566to = -1;
            this.f1564du = arrayList.getVersion();
            this.f1565kk = f1563k4;
        }
    }

    public static final class SynchronizedArrayListWrapper extends ArrayListWrapper {

        /* JADX INFO: renamed from: x1 */
        private final Object f1568x1;

        public SynchronizedArrayListWrapper(ArrayList arrayList) {
            super(arrayList);
            this.f1568x1 = arrayList.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            int iAddItem;
            synchronized (this.f1568x1) {
                iAddItem = ((ArrayListWrapper) this).f1554k4.addItem(obj);
            }
            return iAddItem;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void addRange(ICollection iCollection) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.addRange(iCollection);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int binarySearch(int i, int i2, Object obj, Comparator comparator) {
            int iBinarySearch;
            synchronized (this.f1568x1) {
                iBinarySearch = ((ArrayListWrapper) this).f1554k4.binarySearch(i, i2, obj, comparator);
            }
            return iBinarySearch;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.clear();
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f1568x1) {
                zContains = ((ArrayListWrapper) this).f1554k4.contains(obj);
            }
            return zContains;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void copyTo(int i, AbstractC14092to abstractC14092to, int i2, int i3) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.copyTo(i, abstractC14092to, i2, i3);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public Object deepClone() {
            Object objDeepClone;
            synchronized (this.f1568x1) {
                objDeepClone = ((ArrayListWrapper) this).f1554k4.deepClone();
            }
            return objDeepClone;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int getCapacity() {
            int capacity;
            synchronized (this.f1568x1) {
                capacity = ((ArrayListWrapper) this).f1554k4.getCapacity();
            }
            return capacity;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public ArrayList getRange(int i, int i2) {
            ArrayList range;
            synchronized (this.f1568x1) {
                range = ((ArrayListWrapper) this).f1554k4.getRange(i, i2);
            }
            return range;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1568x1;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            Object obj;
            synchronized (this.f1568x1) {
                obj = ((ArrayListWrapper) this).f1554k4.get_Item(i);
            }
            return obj;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.f1568x1) {
                iIndexOf = ((ArrayListWrapper) this).f1554k4.indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.insertItem(i, obj);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void insertRange(int i, ICollection iCollection) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.insertRange(i, iCollection);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            boolean zIsFixedSize;
            synchronized (this.f1568x1) {
                zIsFixedSize = ((ArrayListWrapper) this).f1554k4.isFixedSize();
            }
            return zIsFixedSize;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            boolean zIsReadOnly;
            synchronized (this.f1568x1) {
                zIsReadOnly = ((ArrayListWrapper) this).f1554k4.isReadOnly();
            }
            return zIsReadOnly;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return true;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.lang.Iterable, java.util.List, java.util.Collection
        public IEnumerator iterator() {
            IEnumerator it;
            synchronized (this.f1568x1) {
                it = ((ArrayListWrapper) this).f1554k4.iterator();
            }
            return it;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.f1568x1) {
                iLastIndexOf = ((ArrayListWrapper) this).f1554k4.lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.removeAt(i);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.removeItem(obj);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void removeRange(int i, int i2) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.removeRange(i, i2);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void reverse() {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.reverse();
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void setCapacity(int i) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.setCapacity(i);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.set_Item(i, obj);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public int size() {
            int size;
            synchronized (this.f1568x1) {
                size = ((ArrayListWrapper) this).f1554k4.size();
            }
            return size;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void sort() {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.sort();
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public AbstractC14092to toArray(AbstractC14068j5 abstractC14068j5) {
            AbstractC14092to array;
            synchronized (this.f1568x1) {
                array = ((ArrayListWrapper) this).f1554k4.toArray(abstractC14068j5);
            }
            return array;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void trimToSize() {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.trimToSize();
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj) {
            int iBinarySearch;
            synchronized (this.f1568x1) {
                iBinarySearch = ((ArrayListWrapper) this).f1554k4.binarySearch(obj);
            }
            return iBinarySearch;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void copyTo(AbstractC14092to abstractC14092to) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.copyTo(abstractC14092to);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i) {
            int iIndexOf;
            synchronized (this.f1568x1) {
                iIndexOf = ((ArrayListWrapper) this).f1554k4.indexOf(obj, i);
            }
            return iIndexOf;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public IEnumerator iterator(int i, int i2) {
            IEnumerator it;
            synchronized (this.f1568x1) {
                it = ((ArrayListWrapper) this).f1554k4.iterator(i, i2);
            }
            return it;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i) {
            int iLastIndexOf;
            synchronized (this.f1568x1) {
                iLastIndexOf = ((ArrayListWrapper) this).f1554k4.lastIndexOf(obj, i);
            }
            return iLastIndexOf;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void reverse(int i, int i2) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.reverse(i, i2);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public void sort(int i, int i2, Comparator comparator) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.sort(i, i2, comparator);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.util.List, java.util.Collection
        public Object[] toArray() {
            Object[] array;
            synchronized (this.f1568x1) {
                array = ((ArrayListWrapper) this).f1554k4.toArray();
            }
            return array;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int binarySearch(Object obj, Comparator comparator) {
            int iBinarySearch;
            synchronized (this.f1568x1) {
                iBinarySearch = ((ArrayListWrapper) this).f1554k4.binarySearch(obj, comparator);
            }
            return iBinarySearch;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.copyTo(abstractC14092to, i);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int indexOf(Object obj, int i, int i2) {
            int iIndexOf;
            synchronized (this.f1568x1) {
                iIndexOf = ((ArrayListWrapper) this).f1554k4.indexOf(obj, i, i2);
            }
            return iIndexOf;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList
        public int lastIndexOf(Object obj, int i, int i2) {
            int iLastIndexOf;
            synchronized (this.f1568x1) {
                iLastIndexOf = ((ArrayListWrapper) this).f1554k4.lastIndexOf(obj, i, i2);
            }
            return iLastIndexOf;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ArrayListWrapper, com.aspose.slides.Collections.ArrayList, java.util.List
        public void sort(Comparator comparator) {
            synchronized (this.f1568x1) {
                ((ArrayListWrapper) this).f1554k4.sort(comparator);
            }
        }
    }

    public static final class SynchronizedListWrapper extends ListWrapper {

        /* JADX INFO: renamed from: x1 */
        private final Object f1569x1;

        public SynchronizedListWrapper(IList iList) {
            super(iList);
            this.f1569x1 = iList.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public int addItem(Object obj) {
            int iAddItem;
            synchronized (this.f1569x1) {
                iAddItem = this.f1559k4.addItem(obj);
            }
            return iAddItem;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public void clear() {
            synchronized (this.f1569x1) {
                this.f1559k4.clear();
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f1569x1) {
                zContains = this.f1559k4.contains(obj);
            }
            return zContains;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            synchronized (this.f1569x1) {
                this.f1559k4.copyTo(abstractC14092to, i);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            Object syncRoot;
            synchronized (this.f1569x1) {
                syncRoot = this.f1559k4.getSyncRoot();
            }
            return syncRoot;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public Object get_Item(int i) {
            Object obj;
            synchronized (this.f1569x1) {
                obj = this.f1559k4.get_Item(i);
            }
            return obj;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.f1569x1) {
                iIndexOf = this.f1559k4.indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void insertItem(int i, Object obj) {
            synchronized (this.f1569x1) {
                this.f1559k4.insertItem(i, obj);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public boolean isFixedSize() {
            boolean zIsFixedSize;
            synchronized (this.f1569x1) {
                zIsFixedSize = this.f1559k4.isFixedSize();
            }
            return zIsFixedSize;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public boolean isReadOnly() {
            boolean zIsReadOnly;
            synchronized (this.f1569x1) {
                zIsReadOnly = this.f1559k4.isReadOnly();
            }
            return zIsReadOnly;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return true;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, java.lang.Iterable
        public IEnumerator iterator() {
            IEnumerator<T> it;
            synchronized (this.f1569x1) {
                it = this.f1559k4.iterator();
            }
            return it;
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void removeAt(int i) {
            synchronized (this.f1569x1) {
                this.f1559k4.removeAt(i);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void removeItem(Object obj) {
            synchronized (this.f1569x1) {
                this.f1559k4.removeItem(obj);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.IList
        public void set_Item(int i, Object obj) {
            synchronized (this.f1569x1) {
                this.f1559k4.set_Item(i, obj);
            }
        }

        @Override // com.aspose.slides.Collections.ArrayList.ListWrapper, com.aspose.slides.Collections.ICollection
        public int size() {
            int size;
            synchronized (this.f1569x1) {
                size = this.f1559k4.size();
            }
            return size;
        }
    }

    public ArrayList() {
        this.f1538k4 = new Object[4];
    }

    public static ArrayList adapter(IList iList) {
        if (iList == null) {
            throw new ArgumentNullException("list");
        }
        ArrayList arrayList = iList instanceof ArrayList ? (ArrayList) iList : null;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayListAdapter arrayListAdapter = new ArrayListAdapter(iList);
        return iList.isSynchronized() ? sync((ArrayList) arrayListAdapter) : arrayListAdapter;
    }

    public static ArrayList fixedSize(ArrayList arrayList) {
        if (arrayList != null) {
            return arrayList.isFixedSize() ? arrayList : new FixedSizeArrayListWrapper(arrayList);
        }
        throw new ArgumentNullException("list");
    }

    public static ArrayList fromJava(List list) {
        if (list == null) {
            return null;
        }
        return new ArrayListInternalized(list);
    }

    /* JADX INFO: renamed from: k4 */
    private void m771k4(int i) {
        Object[] objArr = this.f1538k4;
        if (i <= objArr.length) {
            return;
        }
        int length = objArr.length == 0 ? 4 : objArr.length * 2;
        if (length >= i) {
            i = length;
        }
        setCapacity(i);
    }

    public static ArrayList readOnly(ArrayList arrayList) {
        if (arrayList != null) {
            return arrayList.isReadOnly() ? arrayList : new ReadOnlyArrayListWrapper(arrayList);
        }
        throw new ArgumentNullException("list");
    }

    public static ArrayList repeat(Object obj, int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.addItem(obj);
        }
        return arrayList;
    }

    public static ArrayList sync(ArrayList arrayList) {
        if (arrayList != null) {
            return arrayList.isSynchronized() ? arrayList : new SynchronizedArrayListWrapper(arrayList);
        }
        throw new ArgumentNullException("list");
    }

    public static List toJava(ArrayList arrayList) {
        return arrayList;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        insertItem(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection == null) {
            throw new ArgumentNullException("c");
        }
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            insertItem(i, it.next());
            i++;
        }
        return size != size();
    }

    @Override // com.aspose.slides.Collections.IList
    public int addItem(Object obj) {
        int length = this.f1538k4.length;
        int i = this.f1540x1;
        if (length <= i) {
            m771k4(i + 1);
        }
        Object[] objArr = this.f1538k4;
        int i2 = this.f1540x1;
        objArr[i2] = obj;
        this.f1539kk++;
        this.f1540x1 = i2 + 1;
        return i2;
    }

    public void addRange(ICollection iCollection) {
        if (iCollection == null) {
            throw new ArgumentNullException("c");
        }
        insertRange(this.f1540x1, iCollection);
    }

    public int binarySearch(int i, int i2, Object obj, Comparator comparator) {
        try {
            return C14118yn.m67554k4(this.f1538k4, i, i2, obj, comparator);
        } catch (InvalidOperationException e) {
            throw new ArgumentException(e.getMessage());
        }
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public void clear() {
        AbstractC14092to.m67232k4(this.f1538k4, 0, this.f1540x1);
        this.f1540x1 = 0;
        this.f1539kk++;
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj, 0, this.f1540x1) > -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void copyTo(int i, AbstractC14092to abstractC14092to, int i2, int i3) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14092to.m67277to() != 1) {
            throw new ArgumentException("Must have only 1 dimensions.", "array");
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1538k4), i, abstractC14092to, i2, i3);
    }

    public Object deepClone() {
        return new ArrayList(AbstractC14092to.m67208k4((Object) this.f1538k4), 0, this.f1540x1);
    }

    @Override // java.util.List
    public Object get(int i) {
        return get_Item(i);
    }

    public int getCapacity() {
        return this.f1538k4.length;
    }

    public ArrayList getRange(int i, int i2) {
        m773k4(i, i2, this.f1540x1);
        return isSynchronized() ? sync((ArrayList) new RangedArrayList(this, i, i2)) : new RangedArrayList(this, i, i2);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    public int getVersion() {
        return this.f1539kk;
    }

    @Override // com.aspose.slides.Collections.IList
    public Object get_Item(int i) {
        if (i < 0 || i >= this.f1540x1) {
            m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index is less than 0 or more than or equal to the list count.");
        }
        return this.f1538k4[i];
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List
    public int indexOf(Object obj) {
        return indexOf(obj, 0);
    }

    @Override // com.aspose.slides.Collections.IList
    public void insertItem(int i, Object obj) {
        if (i < 0 || i > this.f1540x1) {
            m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
        }
        m772k4(i, 1);
        this.f1538k4[i] = obj;
        this.f1540x1++;
        this.f1539kk++;
    }

    public void insertRange(int i, ICollection iCollection) {
        if (iCollection == null) {
            throw new ArgumentNullException("c");
        }
        if (i < 0 || i > this.f1540x1) {
            m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
        }
        int size = iCollection.size();
        if (size > 0) {
            int length = this.f1538k4.length;
            int i2 = this.f1540x1;
            if (length < i2 + size) {
                m771k4(i2 + size);
            }
            int i3 = this.f1540x1;
            if (i < i3) {
                Object[] objArr = this.f1538k4;
                AbstractC14092to.m67234k4(objArr, i, objArr, i + size, i3 - i);
            }
            if (this == iCollection.getSyncRoot()) {
                Object[] objArr2 = this.f1538k4;
                AbstractC14092to.m67234k4(objArr2, 0, objArr2, i, i);
                Object[] objArr3 = this.f1538k4;
                AbstractC14092to.m67234k4(objArr3, size + i, objArr3, i << 1, this.f1540x1 - i);
            } else {
                iCollection.copyTo(AbstractC14092to.m67208k4((Object) this.f1538k4), i);
            }
            this.f1540x1 = iCollection.size() + this.f1540x1;
            this.f1539kk++;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.aspose.slides.Collections.IList
    public boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.IList
    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable, java.util.List, java.util.Collection
    public IEnumerator iterator() {
        return new SimpleEnumerator(this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return lastIndexOf(obj, this.f1540x1 - 1);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new ListItr(0);
    }

    @Override // java.util.List
    public Object remove(int i) {
        Object obj = get_Item(i);
        removeAt(i);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection == null) {
            throw new ArgumentNullException("c");
        }
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            removeItem(it.next());
        }
        return size != size();
    }

    @Override // com.aspose.slides.Collections.IList
    public void removeAt(int i) {
        if (i < 0 || i >= this.f1540x1) {
            m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Less than 0 or more than list count.");
        }
        m772k4(i, -1);
        this.f1540x1--;
        this.f1539kk++;
    }

    @Override // com.aspose.slides.Collections.IList
    public void removeItem(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf > -1) {
            removeAt(iIndexOf);
        }
        this.f1539kk++;
    }

    public void removeRange(int i, int i2) {
        m773k4(i, i2, this.f1540x1);
        m772k4(i, -i2);
        this.f1540x1 -= i2;
        this.f1539kk++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection == null) {
            throw new ArgumentNullException("c");
        }
        int size = size();
        for (Object obj : toArray()) {
            if (!collection.contains(obj)) {
                remove(obj);
            }
        }
        return size != size();
    }

    public void reverse() {
        C14118yn.m67559k4(this.f1538k4, 0, this.f1540x1);
        this.f1539kk++;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        Object obj2 = get_Item(i);
        set_Item(i, obj);
        return obj2;
    }

    public void setCapacity(int i) {
        if (i < this.f1540x1) {
            m774k4("Capacity", Integer.valueOf(i), "Must be more than count.");
        }
        if (i > 0) {
            this.f1538k4 = Arrays.copyOf(this.f1538k4, i);
        } else {
            this.f1538k4 = new Object[4];
        }
    }

    public void setRange(int i, ICollection iCollection) {
        if (iCollection == null) {
            throw new ArgumentNullException("c");
        }
        if (i < 0 || iCollection.size() + i > this.f1540x1) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        iCollection.copyTo(AbstractC14092to.m67208k4((Object) this.f1538k4), i);
        this.f1539kk++;
    }

    @Override // com.aspose.slides.Collections.IList
    public void set_Item(int i, Object obj) {
        if (i < 0 || i >= this.f1540x1) {
            m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index is less than 0 or more than or equal to the list count.");
        }
        this.f1538k4[i] = obj;
        this.f1539kk++;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1540x1;
    }

    public void sort() {
        Arrays.sort(this.f1538k4, 0, this.f1540x1, Comparer.Default);
        this.f1539kk++;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return getRange(i, i2 - i);
    }

    public AbstractC14092to toArray(AbstractC14068j5 abstractC14068j5) {
        AbstractC14092to abstractC14092toM67205k4 = AbstractC14092to.m67205k4(abstractC14068j5, this.f1540x1);
        copyTo(abstractC14092toM67205k4);
        return abstractC14092toM67205k4;
    }

    public void trimToSize() {
        setCapacity(this.f1540x1);
    }

    public ArrayList(int i) {
        if (i < 0) {
            m774k4("capacity", Integer.valueOf(i), "The initial capacity can't be smaller than zero.");
        }
        this.f1538k4 = new Object[i == 0 ? 4 : i];
    }

    public static IList fixedSize(IList iList) {
        if (iList != null) {
            return iList.isFixedSize() ? iList : new FixedSizeListWrapper(iList);
        }
        throw new ArgumentNullException("list");
    }

    /* JADX INFO: renamed from: k4 */
    private void m772k4(int i, int i2) {
        if (i2 <= 0) {
            if (i2 < 0) {
                int i3 = i - i2;
                Object[] objArr = this.f1538k4;
                AbstractC14092to.m67234k4(objArr, i3, objArr, i, this.f1540x1 - i3);
                AbstractC14092to.m67232k4(this.f1538k4, this.f1540x1 + i2, -i2);
                return;
            }
            return;
        }
        int i4 = this.f1540x1;
        int i5 = i4 + i2;
        Object[] objArr2 = this.f1538k4;
        if (i5 <= objArr2.length) {
            AbstractC14092to.m67234k4(objArr2, i, objArr2, i2 + i, i4 - i);
            return;
        }
        int length = objArr2.length > 0 ? objArr2.length << 1 : 1;
        while (length < this.f1540x1 + i2) {
            length <<= 1;
        }
        Object[] objArr3 = new Object[length];
        AbstractC14092to.m67234k4(this.f1538k4, 0, objArr3, 0, i);
        AbstractC14092to.m67234k4(this.f1538k4, i, objArr3, i2 + i, this.f1540x1 - i);
        this.f1538k4 = objArr3;
    }

    public static IList readOnly(IList iList) {
        if (iList != null) {
            return iList.isReadOnly() ? iList : new ReadOnlyListWrapper(iList);
        }
        throw new ArgumentNullException("list");
    }

    public static IList sync(IList iList) {
        if (iList != null) {
            return iList.isSynchronized() ? iList : new SynchronizedListWrapper(iList);
        }
        throw new ArgumentNullException("list");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int size = size();
        addItem(obj);
        return size() != size;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(this.f1540x1, collection);
    }

    public void addRange(Object[] objArr) {
        if (objArr == null) {
            throw new ArgumentNullException("c");
        }
        insertRange(this.f1540x1, objArr);
    }

    public int binarySearch(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            return C14118yn.m67553k4(this.f1538k4, 0, this.f1540x1, obj);
        } catch (InvalidOperationException e) {
            throw new ArgumentException(e.getMessage());
        }
    }

    public void copyTo(AbstractC14092to abstractC14092to) {
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1538k4), 0, abstractC14092to, 0, this.f1540x1);
    }

    public int indexOf(Object obj, int i) {
        return indexOf(obj, i, this.f1540x1 - i);
    }

    public void insertRange(int i, Object[] objArr) {
        if (objArr == null) {
            throw new ArgumentNullException("c");
        }
        if (i < 0 || i > this.f1540x1) {
            m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Index must be >= 0 and <= Count.");
        }
        int length = objArr.length;
        if (length > 0) {
            int length2 = this.f1538k4.length;
            int i2 = this.f1540x1;
            if (length2 < i2 + length) {
                m771k4(i2 + length);
            }
            int i3 = this.f1540x1;
            if (i < i3) {
                Object[] objArr2 = this.f1538k4;
                AbstractC14092to.m67234k4(objArr2, i, objArr2, length + i, i3 - i);
            }
            AbstractC14092to.m67208k4((Object) objArr).copyTo(AbstractC14092to.m67208k4((Object) this.f1538k4), i);
            this.f1540x1 += objArr.length;
            this.f1539kk++;
        }
    }

    public IEnumerator iterator(int i, int i2) {
        m773k4(i, i2, this.f1540x1);
        return new ArrayListEnumerator(this, i, i2);
    }

    public int lastIndexOf(Object obj, int i) {
        return lastIndexOf(obj, i, i + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, java.lang.IndexOutOfBoundsException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, java.lang.String] */
    @Override // java.util.List
    public ListIterator listIterator(int i) {
        if (i >= 0 && i <= size()) {
            return new ListItr(i);
        }
        ?? indexOutOfBoundsException = new IndexOutOfBoundsException((String) APMessageAct.sendToZFB(i, "Index: ", indexOutOfBoundsException));
        throw indexOutOfBoundsException;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int size = size();
        removeItem(obj);
        return size() != size;
    }

    public void reverse(int i, int i2) {
        m773k4(i, i2, this.f1540x1);
        C14118yn.m67559k4(this.f1538k4, i, i2);
        this.f1539kk++;
    }

    public void sort(int i, int i2, Comparator comparator) {
        m773k4(i, i2, this.f1540x1);
        Arrays.sort(this.f1538k4, i, i2 + i, comparator);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.f1540x1];
        copyTo(AbstractC14092to.m67208k4((Object) objArr));
        return objArr;
    }

    private ArrayList(int i, boolean z) {
        if (!z) {
            throw new IllegalStateException("Use ArrayList(int)");
        }
        this.f1538k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m773k4(int i, int i2, int i3) {
        if (i < 0) {
            m774k4(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Can't be less than 0.");
        }
        if (i2 < 0) {
            m774k4(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
        }
        if (i > i3 - i2) {
            throw new ArgumentException("Index and count do not denote a valid range of elements.", FirebaseAnalytics.Param.INDEX);
        }
    }

    public int binarySearch(Object obj, Comparator comparator) {
        try {
            return C14118yn.m67554k4(this.f1538k4, 0, this.f1540x1, obj, comparator);
        } catch (InvalidOperationException e) {
            throw new ArgumentException(e.getMessage());
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        copyTo(0, abstractC14092to, i, this.f1540x1);
    }

    public int indexOf(Object obj, int i, int i2) {
        if (i < 0 || i > this.f1540x1) {
            m774k4("startIndex", Integer.valueOf(i), "Does not specify valid index.");
        }
        if (i2 < 0) {
            m774k4(C18293o1.f55803f, Integer.valueOf(i2), "Can't be less than 0.");
        }
        if (i <= this.f1540x1 - i2) {
            return AbstractC14092to.m67202k4(this.f1538k4, obj, i, i2);
        }
        throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Start index and count do not specify a valid range.");
    }

    public int lastIndexOf(Object obj, int i, int i2) {
        return C14118yn.m67555k4(this.f1538k4, obj, i, i2);
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        Arrays.sort(this.f1538k4, 0, this.f1540x1, comparator);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        if (objArr.length <= size()) {
            objArr = new Object[size()];
        }
        copyTo(AbstractC14092to.m67208k4((Object) objArr));
        return objArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m774k4(String str, Object obj, String str2) {
        throw new ArgumentOutOfRangeException(str, obj, str2);
    }

    public ArrayList(ICollection iCollection) {
        if (iCollection == null) {
            throw new ArgumentNullException("c", "collection is null");
        }
        this.f1538k4 = new Object[iCollection.size()];
        addRange(iCollection);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m776k4(Object obj, int i, int i2) {
        return indexOf(obj, i, i2) > -1;
    }

    private ArrayList(AbstractC14092to abstractC14092to, int i, int i2) {
        if (i2 == 0) {
            this.f1538k4 = new Object[4];
        } else {
            this.f1538k4 = new Object[i2];
        }
        AbstractC14092to.m67216k4(abstractC14092to, i, AbstractC14092to.m67208k4((Object) this.f1538k4), 0, i2);
        this.f1540x1 = i2;
    }
}
