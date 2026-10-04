package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p407st.C10521l7;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14096u4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14118yn;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class List<T> implements IGenericList<T>, java.util.List<T> {

    /* JADX INFO: renamed from: h4 */
    static Object[] f1654h4 = new Object[0];

    /* JADX INFO: renamed from: k4 */
    private Object[] f1655k4;

    /* JADX INFO: renamed from: kk */
    private int f1656kk;

    /* JADX INFO: renamed from: to */
    private final Object f1657to;

    /* JADX INFO: renamed from: x1 */
    private int f1658x1;

    public static class Enumerator<T> extends AbstractC7020m9<Enumerator<T>> implements IGenericEnumerator<T>, IDisposable {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1659k4 = true;

        /* JADX INFO: renamed from: du */
        private T f1660du;

        /* JADX INFO: renamed from: kk */
        private int f1661kk;

        /* JADX INFO: renamed from: to */
        private int f1662to;

        /* JADX INFO: renamed from: x1 */
        private List<T> f1663x1;

        public Enumerator() {
            this.f1663x1 = new List<>();
        }

        public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
            return enumerator.equals(enumerator2);
        }

        /* JADX INFO: renamed from: k4 */
        private void m860k4() {
            if (this.f1662to != this.f1663x1.getVersion()) {
                throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
            }
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Enumerator<T> Clone() {
            Enumerator<T> enumerator = new Enumerator<>();
            CloneTo((Enumerator) enumerator);
            return enumerator;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Enumerator<T> enumerator) {
            enumerator.f1663x1 = this.f1663x1;
            enumerator.f1661kk = this.f1661kk;
            enumerator.f1662to = this.f1662to;
            enumerator.f1660du = this.f1660du;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1662to != this.f1663x1.getVersion()) {
                throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
            }
            int i = this.f1661kk;
            if (i < 0) {
                return false;
            }
            if (i >= this.f1663x1.size()) {
                this.f1661kk = this.f1663x1.size() + 1;
                return false;
            }
            List<T> list = this.f1663x1;
            int i2 = this.f1661kk;
            this.f1661kk = i2 + 1;
            this.f1660du = list.get_Item(i2);
            return true;
        }

        public int hashCode() {
            List<T> list = this.f1663x1;
            int iHashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.f1661kk) * 31) + this.f1662to) * 31;
            T t = this.f1660du;
            return iHashCode + (t != null ? t.hashCode() : 0);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public T next() {
            int i = this.f1661kk;
            if (i < 0 || i >= this.f1663x1.size() + 1) {
                throw new InvalidOperationException("Enumeration has either not started or has already finished.");
            }
            return this.f1660du;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m860k4();
            this.f1661kk = 0;
        }

        public Enumerator(List<T> list) {
            this();
            this.f1663x1 = list;
            this.f1662to = list.getVersion();
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m861k4(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1663x1, this.f1663x1) && enumerator.f1661kk == this.f1661kk && enumerator.f1662to == this.f1662to && C14067j2.m66728k4(enumerator.f1660du, this.f1660du);
        }

        public boolean equals(Object obj) {
            if (!f1659k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Enumerator) {
                return m861k4((Enumerator) obj);
            }
            return false;
        }
    }

    @Deprecated
    public static class EnumeratorJava<T> extends AbstractC7020m9<EnumeratorJava<T>> implements IGenericEnumerator<T>, IDisposable {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1664k4 = true;

        /* JADX INFO: renamed from: du */
        private T f1665du;

        /* JADX INFO: renamed from: kk */
        private int f1666kk;

        /* JADX INFO: renamed from: to */
        private int f1667to;

        /* JADX INFO: renamed from: x1 */
        private List<T> f1668x1;

        public EnumeratorJava() {
            this.f1668x1 = new List<>();
        }

        public static boolean equals(EnumeratorJava enumeratorJava, EnumeratorJava enumeratorJava2) {
            return enumeratorJava.equals(enumeratorJava2);
        }

        /* JADX INFO: renamed from: k4 */
        private void m862k4() {
            if (this.f1667to != this.f1668x1.getVersion()) {
                throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
            }
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public EnumeratorJava<T> Clone() {
            EnumeratorJava<T> enumeratorJava = new EnumeratorJava<>();
            CloneTo((EnumeratorJava) enumeratorJava);
            return enumeratorJava;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(EnumeratorJava<T> enumeratorJava) {
            enumeratorJava.f1668x1 = this.f1668x1;
            enumeratorJava.f1666kk = this.f1666kk;
            enumeratorJava.f1667to = this.f1667to;
            enumeratorJava.f1665du = this.f1665du;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1667to != this.f1668x1.getVersion()) {
                throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
            }
            int i = this.f1666kk;
            return i >= 0 && i < this.f1668x1.size();
        }

        public int hashCode() {
            List<T> list = this.f1668x1;
            int iHashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.f1666kk) * 31) + this.f1667to) * 31;
            T t = this.f1665du;
            return iHashCode + (t != null ? t.hashCode() : 0);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public T next() {
            int i = this.f1666kk;
            if (i < 0 || i >= this.f1668x1.size() + 1) {
                throw new InvalidOperationException("Enumeration has either not started or has already finished.");
            }
            if (this.f1667to != this.f1668x1.getVersion()) {
                throw new InvalidOperationException("Collection was modified; enumeration operation may not execute.");
            }
            List<T> list = this.f1668x1;
            int i2 = this.f1666kk;
            this.f1666kk = i2 + 1;
            T t = list.get_Item(i2);
            this.f1665du = t;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m862k4();
            this.f1666kk = 0;
        }

        public EnumeratorJava(List<T> list) {
            this();
            this.f1668x1 = list;
            this.f1667to = list.getVersion();
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m863k4(EnumeratorJava enumeratorJava) {
            return C14067j2.m66728k4(enumeratorJava.f1668x1, this.f1668x1) && enumeratorJava.f1666kk == this.f1666kk && enumeratorJava.f1667to == this.f1667to && C14067j2.m66728k4(enumeratorJava.f1665du, this.f1665du);
        }

        public boolean equals(Object obj) {
            if (!f1664k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof EnumeratorJava) {
                return m863k4((EnumeratorJava) obj);
            }
            return false;
        }
    }

    public class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k4 */
        int f1669k4;

        /* JADX INFO: renamed from: x1 */
        int f1671x1;

        private Itr() {
            this.f1671x1 = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1669k4 != List.this.f1658x1;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f1669k4;
            if (i >= List.this.f1658x1) {
                throw new NoSuchElementException();
            }
            Object[] objArr = List.this.f1655k4;
            if (i >= objArr.length) {
                throw new ConcurrentModificationException();
            }
            this.f1669k4 = i + 1;
            this.f1671x1 = i;
            return (T) objArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.f1671x1;
            if (i < 0) {
                throw new IllegalStateException();
            }
            try {
                List.this.remove(i);
                this.f1669k4 = this.f1671x1;
                this.f1671x1 = -1;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public static class ListInternalized<T> extends List<T> {

        /* JADX INFO: renamed from: k4 */
        private java.util.List<T> f1672k4;

        /* JADX INFO: renamed from: x1 */
        private int f1673x1;

        public ListInternalized() {
            this.f1672k4 = new ArrayList();
        }

        /* JADX INFO: renamed from: k4 */
        private int m864k4(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
            int i3 = i2 + i;
            while (i < i3) {
                if (abstractC14041ai.invoke(this.f1672k4.get(i))) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        /* JADX INFO: renamed from: kk */
        private List<T> m868kk(AbstractC14041ai<T> abstractC14041ai) {
            List<T> list = new List<>();
            for (int i = 0; i < size(); i++) {
                if (abstractC14041ai.invoke(this.f1672k4.get(i))) {
                    list.addItem(this.f1672k4.get(i));
                }
            }
            return list;
        }

        /* JADX INFO: renamed from: x1 */
        private int m869x1(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
            int i3 = i2 + i;
            while (i3 != i) {
                i3--;
                if (abstractC14041ai.invoke(this.f1672k4.get(i3))) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public void add(int i, T t) {
            this.f1673x1++;
            this.f1672k4.add(i, t);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            this.f1673x1++;
            return this.f1672k4.addAll(i, collection);
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
        public void addItem(T t) {
            this.f1672k4.add(t);
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void addRange(IGenericEnumerable<T> iGenericEnumerable) {
            if (iGenericEnumerable == null) {
                throw new ArgumentNullException("collection");
            }
            m867k4(iGenericEnumerable);
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public ReadOnlyCollection<T> asReadOnly() {
            return new ReadOnlyCollection<>(this);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int binarySearch(int i, int i2, T t, Comparator<T> comparator) {
            m866k4(i, i2);
            return C14118yn.m67554k4(this.f1672k4.toArray(), i, i2, t, comparator);
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
        public void clear() {
            this.f1672k4.clear();
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            if (obj == null) {
                for (int i = 0; i < this.f1672k4.size(); i++) {
                    if (get(i) == null) {
                        return true;
                    }
                }
                return false;
            }
            for (int i2 = 0; i2 < this.f1672k4.size(); i2++) {
                if (get(i2).equals(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f1672k4.containsAll(collection);
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean containsItem(T t) {
            if (t == null) {
                for (int i = 0; i < this.f1672k4.size(); i++) {
                    if (this.f1672k4.get(i) == null) {
                        return true;
                    }
                }
                return false;
            }
            for (int i2 = 0; i2 < this.f1672k4.size(); i2++) {
                if (this.f1672k4.get(i2).equals(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public <TOutput> List<TOutput> convertAll(AbstractC14096u4<T, TOutput> abstractC14096u4) {
            if (abstractC14096u4 == null) {
                throw new ArgumentNullException("converter");
            }
            List<TOutput> list = new List<>(this.f1672k4.size());
            for (int i = 0; i < this.f1672k4.size(); i++) {
                ((List) list).f1655k4[i] = abstractC14096u4.mo6770k4(get_Item(i));
            }
            ((List) list).f1658x1 = this.f1672k4.size();
            return list;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void copyTo(int i, T[] tArr, int i2, int i3) {
            m866k4(i, i3);
            AbstractC14092to.m67234k4(this.f1672k4.toArray(), i, tArr, i2, i3);
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
        public void copyToTArray(T[] tArr, int i) {
            AbstractC14092to.m67234k4(this.f1672k4.toArray(), 0, tArr, i, this.f1672k4.size());
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public boolean exists(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            return m864k4(0, this.f1672k4.size(), abstractC14041ai) != -1;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public T find(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            int iM864k4 = m864k4(0, this.f1672k4.size(), abstractC14041ai);
            if (iM864k4 != -1) {
                return this.f1672k4.get(iM864k4);
            }
            return null;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public List<T> findAll(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            return m868kk(abstractC14041ai);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int findIndex(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            m866k4(i, i2);
            return m864k4(i, i2, abstractC14041ai);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public T findLast(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            int iM869x1 = m869x1(0, this.f1672k4.size(), abstractC14041ai);
            if (iM869x1 == -1) {
                return null;
            }
            return get_Item(iM869x1);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int findLastIndex(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            int i3 = (i - i2) + 1;
            m866k4(i3, i2);
            return m869x1(i3, i2, abstractC14041ai);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void forEach(AbstractC14071k4<T> abstractC14071k4) {
            if (abstractC14071k4 == null) {
                throw new ArgumentNullException("action");
            }
            for (int i = 0; i < this.f1672k4.size(); i++) {
                abstractC14071k4.invoke(this.f1672k4.get(i));
            }
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public T get(int i) {
            return this.f1672k4.get(i);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int getCapacity() {
            return this.f1672k4.size();
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public List<T> getRange(int i, int i2) {
            m866k4(i, i2);
            Object[] objArr = new Object[i2];
            AbstractC14092to.m67234k4(this.f1672k4.toArray(), i, objArr, 0, i2);
            return new List<>(objArr, i2);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public Object getSyncRoot() {
            return this;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int getVersion() {
            return this.f1673x1;
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericList
        public T get_Item(int i) {
            return this.f1672k4.get(i);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public int indexOf(Object obj) {
            return this.f1672k4.indexOf(obj);
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericList
        public int indexOfItem(T t) {
            return this.f1672k4.indexOf(t);
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericList
        public void insertItem(int i, T t) {
            this.f1672k4.add(i, t);
            this.f1673x1++;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.slides.Collections.Generic.List
        public void insertRange(int i, IGenericEnumerable<T> iGenericEnumerable) {
            if (iGenericEnumerable == null) {
                throw new ArgumentNullException("collection");
            }
            if (i < 0 || (((long) i) & 4294967295L) > (4294967295L & ((long) this.f1672k4.size()))) {
                throw new ArgumentOutOfRangeException("Parameter name: index");
            }
            if (iGenericEnumerable == this) {
                int size = size();
                Object[] objArr = new Object[size];
                copyTo(objArr);
                int i2 = 0;
                while (i2 < size) {
                    this.f1672k4.add(i, (T) objArr[i2]);
                    i2++;
                    i++;
                }
            } else {
                IGenericEnumerator<T> it = iGenericEnumerable.iterator();
                while (it.hasNext()) {
                    this.f1672k4.add(i, it.next());
                    i++;
                }
            }
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() != 0;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public boolean isFixedSize() {
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean isReadOnly() {
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public boolean isSynchronized() {
            return false;
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public int lastIndexOf(Object obj) {
            if (this.f1672k4.size() == 0) {
                return -1;
            }
            return C14118yn.m67555k4(this.f1672k4.toArray(), obj, this.f1672k4.size() - 1, this.f1672k4.size());
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public ListIterator listIterator() {
            return this.f1672k4.listIterator();
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public T remove(int i) {
            this.f1673x1++;
            return this.f1672k4.remove(i);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int removeAll(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            int i = 0;
            while (i < this.f1672k4.size() && !abstractC14041ai.invoke(this.f1672k4.get(i))) {
                i++;
            }
            if (i == this.f1672k4.size()) {
                return 0;
            }
            this.f1673x1++;
            int i2 = i + 1;
            while (i2 < this.f1672k4.size()) {
                if (!abstractC14041ai.invoke(this.f1672k4.get(i2))) {
                    java.util.List<T> list = this.f1672k4;
                    list.set(i, list.get(i2));
                    i++;
                }
                i2++;
            }
            int i3 = i2 - i;
            if (i3 > 0) {
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f1672k4.remove(r7.size() - 1);
                }
            }
            return i3;
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericList
        public void removeAt(int i) {
            if (i < 0 || (((long) i) & 4294967295L) >= (4294967295L & ((long) this.f1672k4.size()))) {
                throw new ArgumentOutOfRangeException("Parameter name: index");
            }
            this.f1672k4.remove(i);
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean removeItem(T t) {
            int iIndexOfItem = indexOfItem(t);
            if (iIndexOfItem != -1) {
                removeAt(iIndexOfItem);
            }
            return iIndexOfItem != -1;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void removeRange(int i, int i2) {
            m866k4(i, i2);
            if (i2 > 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    this.f1672k4.remove(i);
                }
                this.f1673x1++;
            }
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            this.f1673x1++;
            return this.f1672k4.retainAll(collection);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void reverse() {
            reverse(0, size());
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public T set(int i, T t) {
            this.f1673x1++;
            return this.f1672k4.set(i, t);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void setCapacity(int i) {
            if ((((long) i) & 4294967295L) < (4294967295L & ((long) this.f1672k4.size()))) {
                throw new ArgumentOutOfRangeException();
            }
            for (int i2 = 0; i2 < i - this.f1672k4.size(); i2++) {
                this.f1672k4.add(null);
            }
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericList
        public void set_Item(int i, T t) {
            m865k4(i);
            if (i == this.f1672k4.size()) {
                throw new ArgumentOutOfRangeException("Parameter name: index");
            }
            this.f1672k4.set(i, t);
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
        public int size() {
            return this.f1672k4.size();
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void sort() {
            Collections.sort(this.f1672k4, null);
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public java.util.List<T> subList(int i, int i2) {
            return this.f1672k4.subList(i, i2);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public Object[] toArray() {
            return this.f1672k4.toArray();
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void trimExcess() {
            setCapacity(this.f1672k4.size());
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public boolean trueForAll(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            for (int i = 0; i < this.f1672k4.size(); i++) {
                if (!abstractC14041ai.invoke(this.f1672k4.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public ListInternalized(java.util.List<T> list) {
            super(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                super.addItem(it.next());
            }
            this.f1672k4 = list;
        }

        /* JADX INFO: renamed from: k4 */
        private void m865k4(int i) {
            if (i < 0 || (((long) i) & 4294967295L) > (4294967295L & ((long) this.f1672k4.size()))) {
                throw new ArgumentOutOfRangeException("Parameter name: index");
            }
        }

        /* JADX INFO: renamed from: x1 */
        public static <T> void m870x1(AbstractC14041ai<T> abstractC14041ai) {
            if (abstractC14041ai == null) {
                throw new ArgumentNullException("match");
            }
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean add(T t) {
            this.f1673x1++;
            return this.f1672k4.add(t);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            this.f1673x1++;
            return this.f1672k4.addAll(collection);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void addRange(T[] tArr) {
            if (tArr == null) {
                throw new ArgumentNullException("collection");
            }
            for (T t : tArr) {
                addItem(t);
            }
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int binarySearch(T t) {
            return C14118yn.m67553k4(this.f1672k4.toArray(), 0, this.f1672k4.size(), t);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            if (abstractC14092to == null) {
                throw new ArgumentNullException("array");
            }
            if (abstractC14092to.m67277to() > 1 || abstractC14092to.m67279x1(0) != 0) {
                throw new ArgumentException("Array must be zero based and single dimentional\r\nParameter name: array");
            }
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1672k4.toArray()), 0, abstractC14092to, i, this.f1672k4.size());
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int findIndex(int i, AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            m865k4(i);
            return m864k4(i, this.f1672k4.size() - i, abstractC14041ai);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int findLastIndex(int i, AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            m865k4(i);
            return m869x1(0, i + 1, abstractC14041ai);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int indexOf(T t, int i) {
            m865k4(i);
            return AbstractC14092to.m67202k4(this.f1672k4.toArray(), t, i, this.f1672k4.size() - i);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.lang.Iterable, java.util.List, java.util.Collection
        public Enumerator<T> iterator() {
            return new Enumerator<>(this);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int lastIndexOf(T t, int i) {
            m865k4(i);
            return C14118yn.m67555k4(this.f1672k4.toArray(), t, i, i + 1);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public ListIterator listIterator(int i) {
            return this.f1672k4.listIterator(i);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            this.f1673x1++;
            return this.f1672k4.remove(obj);
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            this.f1673x1++;
            return this.f1672k4.removeAll(collection);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void reverse(int i, int i2) {
            m866k4(i, i2);
            for (int i3 = (i2 + i) - 1; i < i3; i3--) {
                T t = this.f1672k4.get(i);
                java.util.List<T> list = this.f1672k4;
                list.set(i, list.get(i3));
                this.f1672k4.set(i3, t);
                i++;
            }
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void sort(int i, int i2, Comparator<T> comparator) {
            m866k4(i, i2);
            java.util.List<T> listSubList = this.f1672k4.subList(i, i2);
            Collections.sort(listSubList, comparator);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f1672k4.set(i + i3, listSubList.get(i3));
            }
            this.f1673x1++;
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List, java.util.Collection
        public <T1> T1[] toArray(T1[] t1Arr) {
            return (T1[]) this.f1672k4.toArray(t1Arr);
        }

        /* JADX INFO: renamed from: k4 */
        private void m866k4(int i, int i2) {
            if (i < 0) {
                throw new ArgumentOutOfRangeException("Parameter name: index");
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException("Parameter name: count");
            }
            if ((((long) i) & 4294967295L) + (((long) i2) & 4294967295L) > (((long) this.f1672k4.size()) & 4294967295L)) {
                throw new ArgumentException("index and count exceed length of list");
            }
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int binarySearch(T t, Comparator<T> comparator) {
            return C14118yn.m67554k4(this.f1672k4.toArray(), 0, this.f1672k4.size(), t, comparator);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void copyTo(T[] tArr) {
            AbstractC14092to.m67234k4(this.f1672k4.toArray(), 0, tArr, 0, this.f1672k4.size());
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int findIndex(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            return m864k4(0, this.f1672k4.size(), abstractC14041ai);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int findLastIndex(AbstractC14041ai<T> abstractC14041ai) {
            m870x1((AbstractC14041ai) abstractC14041ai);
            return m869x1(0, this.f1672k4.size(), abstractC14041ai);
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int indexOf(T t, int i, int i2) {
            if (i < 0) {
                throw new ArgumentOutOfRangeException("Parameter name: index");
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException("Parameter name: count");
            }
            if ((((long) i) & 4294967295L) + (((long) i2) & 4294967295L) <= (4294967295L & ((long) this.f1672k4.size()))) {
                return AbstractC14092to.m67202k4(this.f1672k4.toArray(), t, i, i2);
            }
            throw new ArgumentOutOfRangeException("Parameter name: index and count exceed length of list");
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public int lastIndexOf(T t, int i, int i2) {
            if (i < 0) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "index is negative");
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f, Integer.valueOf(i2), "count is negative");
            }
            if ((i - i2) + 1 >= 0) {
                return C14118yn.m67555k4(this.f1672k4.toArray(), t, i, i2);
            }
            throw new ArgumentOutOfRangeException("cound", Integer.valueOf(i2), "count is too large");
        }

        @Override // com.aspose.slides.Collections.Generic.List
        public void sort(final AbstractC14074ks<T> abstractC14074ks) {
            if (abstractC14074ks == null) {
                throw new ArgumentNullException("comparison");
            }
            Collections.sort(this.f1672k4, new Comparator() { // from class: com.aspose.slides.Collections.Generic.List.ListInternalized.1
                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    return abstractC14074ks.mo1193k4(obj, obj2);
                }
            });
            this.f1673x1++;
        }

        /* JADX INFO: renamed from: k4 */
        private void m867k4(IGenericEnumerable<T> iGenericEnumerable) {
            Iterator<T> it = iGenericEnumerable.iterator();
            while (it.hasNext()) {
                addItem(it.next());
            }
        }

        @Override // com.aspose.slides.Collections.Generic.List, java.util.List
        public void sort(Comparator<? super T> comparator) {
            Collections.sort(this.f1672k4, comparator);
            this.f1673x1++;
        }
    }

    public class ListItr extends Itr implements ListIterator {
        public ListItr(int i) {
            super();
            this.f1669k4 = i;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            try {
                int i = this.f1669k4;
                List.this.add(i, t);
                this.f1669k4 = i + 1;
                this.f1671x1 = -1;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1669k4 != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f1669k4;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.f1669k4 - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            Object[] objArr = List.this.f1655k4;
            if (i >= objArr.length) {
                throw new ConcurrentModificationException();
            }
            this.f1669k4 = i;
            this.f1671x1 = i;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f1669k4 - 1;
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            int i = this.f1671x1;
            if (i < 0) {
                throw new IllegalStateException();
            }
            try {
                List.this.set(i, t);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public List() {
        this.f1657to = new Object();
        this.f1655k4 = f1654h4;
    }

    public static <T> List<T> fromJava(java.util.List<T> list) {
        if (list == null) {
            return null;
        }
        return new ListInternalized(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private int m846k4(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
        int i3 = i2 + i;
        while (i < i3) {
            if (abstractC14041ai.invoke(this.f1655k4[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> java.util.List<T> toJava(List<T> list) {
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private int m854x1(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
        int i3 = i2 + i;
        while (i3 != i) {
            i3--;
            if (abstractC14041ai.invoke(this.f1655k4[i3])) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public void add(int i, T t) {
        insertItem(i, t);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        int size = size();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            insertItem(i, it.next());
            i++;
        }
        return size != size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(T t) {
        if (this.f1658x1 == this.f1655k4.length) {
            m849k4(1);
        }
        Object[] objArr = this.f1655k4;
        int i = this.f1658x1;
        this.f1658x1 = i + 1;
        objArr[i] = t;
        this.f1656kk++;
    }

    public void addRange(IGenericEnumerable<T> iGenericEnumerable) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("collection");
        }
        m852k4((IGenericEnumerable) new List(iGenericEnumerable));
        this.f1656kk++;
    }

    public ReadOnlyCollection<T> asReadOnly() {
        return new ReadOnlyCollection<>(this);
    }

    public int binarySearch(int i, int i2, T t, Comparator<T> comparator) {
        m850k4(i, i2);
        return C14118yn.m67554k4(this.f1655k4, i, i2, t, comparator);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        Object[] objArr = this.f1655k4;
        AbstractC14092to.m67232k4(objArr, 0, objArr.length);
        this.f1658x1 = 0;
        this.f1656kk++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            for (int i = 0; i < this.f1658x1; i++) {
                if (this.f1655k4[i] == null) {
                    return true;
                }
            }
            return false;
        }
        for (int i2 = 0; i2 < this.f1658x1; i2++) {
            if (this.f1655k4[i2].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(T t) {
        if (t == null) {
            for (int i = 0; i < this.f1658x1; i++) {
                if (this.f1655k4[i] == null) {
                    return true;
                }
            }
            return false;
        }
        for (int i2 = 0; i2 < this.f1658x1; i2++) {
            if (this.f1655k4[i2].equals(t)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOutput> List<TOutput> convertAll(AbstractC14096u4<T, TOutput> abstractC14096u4) {
        if (abstractC14096u4 == 0) {
            throw new ArgumentNullException("converter");
        }
        List<TOutput> list = new List<>(this.f1658x1);
        int i = 0;
        while (true) {
            int i2 = this.f1658x1;
            if (i >= i2) {
                list.f1658x1 = i2;
                return list;
            }
            list.f1655k4[i] = abstractC14096u4.mo6770k4(this.f1655k4[i]);
            i++;
        }
    }

    public void copyTo(int i, T[] tArr, int i2, int i3) {
        m850k4(i, i3);
        AbstractC14092to.m67234k4(this.f1655k4, i, tArr, i2, i3);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(T[] tArr, int i) {
        AbstractC14092to.m67234k4(this.f1655k4, 0, tArr, i, this.f1658x1);
    }

    public boolean exists(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        return m846k4(0, this.f1658x1, abstractC14041ai) != -1;
    }

    public T find(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        int iM846k4 = m846k4(0, this.f1658x1, abstractC14041ai);
        if (iM846k4 != -1) {
            return (T) this.f1655k4[iM846k4];
        }
        return null;
    }

    public List<T> findAll(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        return m855x1(abstractC14041ai);
    }

    public int findIndex(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        m850k4(i, i2);
        return m846k4(i, i2, abstractC14041ai);
    }

    public T findLast(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        int iM854x1 = m854x1(0, this.f1658x1, abstractC14041ai);
        if (iM854x1 == -1) {
            return null;
        }
        return get_Item(iM854x1);
    }

    public int findLastIndex(int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        int i3 = (i - i2) + 1;
        m850k4(i3, i2);
        return m854x1(i3, i2, abstractC14041ai);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void forEach(AbstractC14071k4<T> abstractC14071k4) {
        if (abstractC14071k4 == 0) {
            throw new ArgumentNullException("action");
        }
        for (int i = 0; i < this.f1658x1; i++) {
            abstractC14071k4.invoke(this.f1655k4[i]);
        }
    }

    @Override // java.util.List
    public T get(int i) {
        return get_Item(i);
    }

    public int getCapacity() {
        return this.f1655k4.length;
    }

    public List<T> getRange(int i, int i2) {
        m850k4(i, i2);
        Object[] objArr = new Object[i2];
        AbstractC14092to.m67234k4(this.f1655k4, i, objArr, 0, i2);
        return new List<>(objArr, i2);
    }

    public Object getSyncRoot() {
        return this.f1657to;
    }

    public int getVersion() {
        return this.f1656kk;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public T get_Item(int i) {
        if ((((long) i) & 4294967295L) < (4294967295L & ((long) this.f1658x1))) {
            return (T) this.f1655k4[i];
        }
        throw new ArgumentOutOfRangeException("Parameter name: index");
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        if (obj == null) {
            while (i < this.f1658x1) {
                if (this.f1655k4[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < this.f1658x1) {
            if (obj.equals(this.f1655k4[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public int indexOfItem(T t) {
        return AbstractC14092to.m67202k4(this.f1655k4, t, 0, this.f1658x1);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void insertItem(int i, T t) {
        m856x1(i);
        if (this.f1658x1 == this.f1655k4.length) {
            m849k4(1);
        }
        m857x1(i, 1);
        this.f1655k4[i] = t;
        this.f1656kk++;
    }

    public void insertRange(int i, IGenericEnumerable<T> iGenericEnumerable) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("collection");
        }
        m856x1(i);
        if (iGenericEnumerable == this) {
            m859kk(i);
        } else {
            m851k4(i, iGenericEnumerable);
        }
        this.f1656kk++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f1658x1 == 0;
    }

    public boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean isReadOnly() {
        return false;
    }

    public boolean isSynchronized() {
        return false;
    }

    @Deprecated
    public EnumeratorJava<T> iteratorJava() {
        return new EnumeratorJava<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public void m859kk(int i) {
        int i2 = this.f1658x1;
        Object[] objArr = new Object[i2];
        copyToTArray(objArr, 0);
        m849k4(this.f1658x1);
        m857x1(i, i2);
        AbstractC14092to.m67234k4(objArr, 0, this.f1655k4, i, i2);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i = this.f1658x1;
        if (i == 0) {
            return -1;
        }
        return C14118yn.m67555k4(this.f1655k4, obj, i - 1, i);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new ListItr(0);
    }

    @Override // java.util.List
    public T remove(int i) {
        T t = get_Item(i);
        removeAt(i);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int removeAll(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        int i = 0;
        while (i < this.f1658x1 && !abstractC14041ai.invoke(this.f1655k4[i])) {
            i++;
        }
        if (i == this.f1658x1) {
            return 0;
        }
        this.f1656kk++;
        int i2 = i + 1;
        while (i2 < this.f1658x1) {
            if (!abstractC14041ai.invoke(this.f1655k4[i2])) {
                Object[] objArr = this.f1655k4;
                objArr[i] = objArr[i2];
                i++;
            }
            i2++;
        }
        int i3 = i2 - i;
        if (i3 > 0) {
            AbstractC14092to.m67232k4(this.f1655k4, i, i3);
        }
        this.f1658x1 = i;
        return i3;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void removeAt(int i) {
        if (i < 0 || (((long) i) & 4294967295L) >= (4294967295L & ((long) this.f1658x1))) {
            throw new ArgumentOutOfRangeException("Parameter name: index");
        }
        m857x1(i, -1);
        AbstractC14092to.m67232k4(this.f1655k4, this.f1658x1, 1);
        this.f1656kk++;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(T t) {
        int iIndexOfItem = indexOfItem(t);
        if (iIndexOfItem != -1) {
            removeAt(iIndexOfItem);
        }
        return iIndexOfItem != -1;
    }

    public void removeRange(int i, int i2) {
        m850k4(i, i2);
        if (i2 > 0) {
            m857x1(i, -i2);
            AbstractC14092to.m67232k4(this.f1655k4, this.f1658x1, i2);
            this.f1656kk++;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        int size = size();
        for (Object obj : toArray()) {
            if (!collection.contains(obj)) {
                remove(obj);
            }
        }
        return size != size();
    }

    public void reverse() {
        C14118yn.m67559k4(this.f1655k4, 0, this.f1658x1);
        this.f1656kk++;
    }

    @Override // java.util.List
    public T set(int i, T t) {
        T t2 = get_Item(i);
        set_Item(i, t);
        return t2;
    }

    public void setCapacity(int i) {
        if ((((long) i) & 4294967295L) < (4294967295L & ((long) this.f1658x1))) {
            throw new ArgumentOutOfRangeException();
        }
        this.f1655k4 = Arrays.copyOf(this.f1655k4, i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void set_Item(int i, T t) {
        m856x1(i);
        if (i == this.f1658x1) {
            throw new ArgumentOutOfRangeException("Parameter name: index");
        }
        this.f1655k4[i] = t;
        this.f1656kk++;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return this.f1658x1;
    }

    public void sort() {
        Arrays.sort(this.f1655k4, 0, this.f1658x1);
        this.f1656kk++;
    }

    @Override // java.util.List
    public java.util.List<T> subList(int i, int i2) {
        return getRange(i, i2 - i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        int i = this.f1658x1;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1655k4, 0, objArr, 0, i);
        return objArr;
    }

    public void trimExcess() {
        setCapacity(this.f1658x1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean trueForAll(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        for (int i = 0; i < this.f1658x1; i++) {
            if (!abstractC14041ai.invoke(this.f1655k4[i])) {
                return false;
            }
        }
        return true;
    }

    public List(int i) {
        this.f1657to = new Object();
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Parameter name: capacity");
        }
        this.f1655k4 = new Object[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private List<T> m855x1(AbstractC14041ai<T> abstractC14041ai) {
        C10521l7 c10521l7 = (List<T>) new List();
        for (int i = 0; i < this.f1658x1; i++) {
            if (abstractC14041ai.invoke(this.f1655k4[i])) {
                c10521l7.addItem(this.f1655k4[i]);
            }
        }
        return c10521l7;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        int i = this.f1658x1;
        addItem(t);
        return i != this.f1658x1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        Iterator<? extends T> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            insertItem(i, it.next());
            i++;
        }
        return size != size();
    }

    public void addRange(T[] tArr) {
        if (tArr == null) {
            throw new ArgumentNullException("collection");
        }
        for (T t : tArr) {
            addItem(t);
        }
        this.f1656kk++;
    }

    public int binarySearch(T t) {
        return C14118yn.m67553k4(this.f1655k4, 0, this.f1658x1, t);
    }

    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14092to.m67277to() > 1 || abstractC14092to.m67279x1(0) != 0) {
            throw new ArgumentException("Array must be zero based and single dimentional\r\nParameter name: array");
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1655k4), 0, abstractC14092to, i, this.f1658x1);
    }

    public int findIndex(int i, AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        m856x1(i);
        return m846k4(i, this.f1658x1 - i, abstractC14041ai);
    }

    public int findLastIndex(int i, AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        m856x1(i);
        return m854x1(0, i + 1, abstractC14041ai);
    }

    public int indexOf(T t, int i) {
        m856x1(i);
        return AbstractC14092to.m67202k4(this.f1655k4, t, i, this.f1658x1 - i);
    }

    @Override // java.lang.Iterable, java.util.List, java.util.Collection
    public Enumerator<T> iterator() {
        return new Enumerator<>(this);
    }

    public int lastIndexOf(T t, int i) {
        m856x1(i);
        return C14118yn.m67555k4(this.f1655k4, t, i, i + 1);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new ListItr(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.f1658x1;
        removeItem(obj);
        return i != this.f1658x1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public void reverse(int i, int i2) {
        m850k4(i, i2);
        C14118yn.m67559k4(this.f1655k4, i, i2);
        this.f1656kk++;
    }

    public void sort(int i, int i2, Comparator<T> comparator) {
        m850k4(i, i2);
        Arrays.sort(this.f1655k4, i, i2 + i, comparator);
        this.f1656kk++;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.f1658x1;
        if (length < i) {
            return (T[]) Arrays.copyOf(this.f1655k4, i, tArr.getClass());
        }
        System.arraycopy(this.f1655k4, 0, tArr, 0, i);
        int length2 = tArr.length;
        int i2 = this.f1658x1;
        if (length2 > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public List(IGenericEnumerable<T> iGenericEnumerable) {
        this.f1657to = new Object();
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("collection");
        }
        this.f1655k4 = f1654h4;
        m852k4(iGenericEnumerable);
    }

    /* JADX INFO: renamed from: x1 */
    private void m856x1(int i) {
        if (i < 0 || (((long) i) & 4294967295L) > (4294967295L & ((long) this.f1658x1))) {
            throw new ArgumentOutOfRangeException("Parameter name: index");
        }
    }

    public int binarySearch(T t, Comparator<T> comparator) {
        return C14118yn.m67554k4(this.f1655k4, 0, this.f1658x1, t, comparator);
    }

    public void copyTo(T[] tArr) {
        AbstractC14092to.m67234k4(this.f1655k4, 0, tArr, 0, this.f1658x1);
    }

    public int findIndex(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        return m846k4(0, this.f1658x1, abstractC14041ai);
    }

    public int findLastIndex(AbstractC14041ai<T> abstractC14041ai) {
        m853k4(abstractC14041ai);
        return m854x1(0, this.f1658x1, abstractC14041ai);
    }

    public int indexOf(T t, int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Parameter name: index");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("Parameter name: count");
        }
        if ((((long) i) & 4294967295L) + (((long) i2) & 4294967295L) <= (4294967295L & ((long) this.f1658x1))) {
            return AbstractC14092to.m67202k4(this.f1655k4, t, i, i2);
        }
        throw new ArgumentOutOfRangeException("Parameter name: index and count exceed length of list");
    }

    public int lastIndexOf(T t, int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "index is negative");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, Integer.valueOf(i2), "count is negative");
        }
        if ((i - i2) + 1 >= 0) {
            return C14118yn.m67555k4(this.f1655k4, t, i, i2);
        }
        throw new ArgumentOutOfRangeException("cound", Integer.valueOf(i2), "count is too large");
    }

    public void sort(AbstractC14074ks<T> abstractC14074ks) {
        if (abstractC14074ks == null) {
            throw new ArgumentNullException("comparison");
        }
        Arrays.sort(this.f1655k4, 0, this.f1658x1, new C14118yn.k4(abstractC14074ks));
        this.f1656kk++;
    }

    private List(T[] tArr, int i) {
        this.f1657to = new Object();
        this.f1655k4 = tArr;
        this.f1658x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m849k4(int i) {
        int i2 = this.f1658x1 + i;
        if (i2 > this.f1655k4.length) {
            setCapacity(Math.max(Math.max(getCapacity() * 2, 4), i2));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m857x1(int i, int i2) {
        if (i2 < 0) {
            i -= i2;
        }
        int i3 = this.f1658x1;
        if (i < i3) {
            Object[] objArr = this.f1655k4;
            AbstractC14092to.m67234k4(objArr, i, objArr, i + i2, i3 - i);
        }
        int i4 = this.f1658x1 + i2;
        this.f1658x1 = i4;
        if (i2 < 0) {
            AbstractC14092to.m67232k4(this.f1655k4, i4, -i2);
        }
    }

    @Override // java.util.List
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(this.f1655k4, 0, this.f1658x1, comparator);
        this.f1656kk++;
    }

    /* JADX INFO: renamed from: k4 */
    private void m850k4(int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Parameter name: index");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("Parameter name: count");
        }
        if ((((long) i) & 4294967295L) + (((long) i2) & 4294967295L) > (((long) this.f1658x1) & 4294967295L)) {
            throw new ArgumentException("index and count exceed length of list");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m851k4(int i, IGenericEnumerable<T> iGenericEnumerable) {
        Iterator<T> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            insertItem(i, it.next());
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m852k4(IGenericEnumerable<T> iGenericEnumerable) {
        Iterator<T> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            addItem(it.next());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m853k4(AbstractC14041ai<T> abstractC14041ai) {
        if (abstractC14041ai == null) {
            throw new ArgumentNullException("match");
        }
    }
}
