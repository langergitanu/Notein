package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.EqualityComparer;
import com.aspose.slides.Collections.Generic.RBTree;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p342pq.C9478du;
import com.aspose.slides.internal.p342pq.C9480kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class SortedDictionary<TKey, TValue> implements IGenericCollection<KeyValuePair<TKey, TValue>>, IGenericDictionary<TKey, TValue>, IGenericEnumerable<KeyValuePair<TKey, TValue>> {

    /* JADX INFO: renamed from: k4 */
    private RBTree f1699k4;

    /* JADX INFO: renamed from: x1 */
    private NodeHelper f1700x1;

    public static class Enumerator<TKey, TValue> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<KeyValuePair<TKey, TValue>>, IDisposable {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1705k4 = true;

        /* JADX INFO: renamed from: kk */
        private KeyValuePair<TKey, TValue> f1706kk;

        /* JADX INFO: renamed from: x1 */
        private RBTree.NodeEnumerator f1707x1;

        public Enumerator() {
            this.f1707x1 = new RBTree.NodeEnumerator();
            this.f1706kk = new KeyValuePair<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: du */
        public Node m920du() {
            this.f1707x1.m905x1();
            return (Node) this.f1707x1.next();
        }

        public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
            return enumerator.equals(enumerator2);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Enumerator Clone() {
            Enumerator enumerator = new Enumerator();
            CloneTo(enumerator);
            return enumerator;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Enumerator enumerator) {
            this.f1707x1.CloneTo(enumerator.f1707x1);
            this.f1706kk.CloneTo((KeyValuePair) enumerator.f1706kk);
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
            this.f1707x1.dispose();
        }

        public IDictionaryEnumerator getIDictionaryEnumerator() {
            return new IDictionaryEnumerator() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.Enumerator.1
                @Override // com.aspose.slides.Collections.IDictionaryEnumerator
                public DictionaryEntry getEntry() {
                    return Enumerator.this.m920du().m937x1();
                }

                @Override // com.aspose.slides.Collections.IDictionaryEnumerator
                public Object getKey() {
                    return Enumerator.this.m920du().f1717k4;
                }

                @Override // com.aspose.slides.Collections.IDictionaryEnumerator
                public Object getValue() {
                    return Enumerator.this.m920du().f1718x1;
                }

                @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                public boolean hasNext() {
                    return Enumerator.this.m926x1();
                }

                @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                public Object next() {
                    return Enumerator.this.m923k4();
                }

                @Override // java.util.Iterator
                public void remove() {
                    Enumerator.this.m925to();
                }

                @Override // com.aspose.slides.Collections.IEnumerator
                public void reset() {
                    Enumerator.this.m924kk();
                }
            };
        }

        public IEnumerator getIEnumerator() {
            return new IEnumerator() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.Enumerator.2
                @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                public boolean hasNext() {
                    return Enumerator.this.m926x1();
                }

                @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                public Object next() {
                    return Enumerator.this.m920du().m936k4();
                }

                @Override // java.util.Iterator
                public void remove() {
                    Enumerator.this.m925to();
                }

                @Override // com.aspose.slides.Collections.IEnumerator
                public void reset() {
                    Enumerator.this.m924kk();
                }
            };
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            return m926x1();
        }

        public int hashCode() {
            RBTree.NodeEnumerator nodeEnumerator = this.f1707x1;
            int iHashCode = (nodeEnumerator != null ? nodeEnumerator.hashCode() : 0) * 31;
            KeyValuePair<TKey, TValue> keyValuePair = this.f1706kk;
            return iHashCode + (keyValuePair != null ? keyValuePair.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k4 */
        public KeyValuePair<TKey, TValue> m923k4() {
            return this.f1706kk;
        }

        /* JADX INFO: renamed from: kk */
        public void m924kk() {
            this.f1707x1.reset();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public KeyValuePair<TKey, TValue> next() {
            return m923k4();
        }

        @Override // java.util.Iterator
        public void remove() {
            m925to();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m924kk();
        }

        /* JADX INFO: renamed from: to */
        public void m925to() {
            throw new NotSupportedException();
        }

        /* JADX INFO: renamed from: x1 */
        public boolean m926x1() {
            if (!this.f1707x1.hasNext()) {
                return false;
            }
            ((Node) this.f1707x1.next()).m936k4().CloneTo((KeyValuePair) this.f1706kk);
            return true;
        }

        public Enumerator(SortedDictionary<TKey, TValue> sortedDictionary) {
            this();
            ((SortedDictionary) sortedDictionary).f1699k4.m896to().CloneTo(this.f1707x1);
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m922x1(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1707x1, this.f1707x1) && C14067j2.m66728k4(enumerator.f1706kk, this.f1706kk);
        }

        public boolean equals(Object obj) {
            if (!f1705k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Enumerator) {
                return m922x1((Enumerator) obj);
            }
            return false;
        }
    }

    public static final class KeyCollection<TKey, TValue> implements IGenericCollection<TKey>, IGenericEnumerable<TKey> {

        /* JADX INFO: renamed from: k4 */
        private SortedDictionary<TKey, TValue> f1710k4;

        public static class Enumerator<TKey, TValue> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<TKey>, IDisposable {

            /* JADX INFO: renamed from: k4 */
            static final /* synthetic */ boolean f1713k4 = true;

            /* JADX INFO: renamed from: kk */
            private TKey f1714kk;

            /* JADX INFO: renamed from: x1 */
            private RBTree.NodeEnumerator f1715x1;

            public Enumerator() {
                this.f1715x1 = new RBTree.NodeEnumerator();
            }

            public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
                return enumerator.equals(enumerator2);
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public Enumerator Clone() {
                Enumerator enumerator = new Enumerator();
                CloneTo(enumerator);
                return enumerator;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public void CloneTo(Enumerator enumerator) {
                this.f1715x1.CloneTo(enumerator.f1715x1);
                enumerator.f1714kk = this.f1714kk;
            }

            public void _remove() {
                throw new NotSupportedException();
            }

            public Object clone() {
                return Clone();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public void dispose() {
                this.f1715x1.dispose();
            }

            public IEnumerator getIEnumerator() {
                return new IEnumerator() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.KeyCollection.Enumerator.1
                    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                    public boolean hasNext() {
                        return Enumerator.this.m935x1();
                    }

                    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                    public Object next() {
                        Enumerator.this.f1715x1.m905x1();
                        return Enumerator.this.f1714kk;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        Enumerator.this._remove();
                    }

                    @Override // com.aspose.slides.Collections.IEnumerator
                    public void reset() {
                        Enumerator.this.m934kk();
                    }
                };
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return m935x1();
            }

            public int hashCode() {
                RBTree.NodeEnumerator nodeEnumerator = this.f1715x1;
                int iHashCode = (nodeEnumerator != null ? nodeEnumerator.hashCode() : 0) * 31;
                TKey tkey = this.f1714kk;
                return iHashCode + (tkey != null ? tkey.hashCode() : 0);
            }

            /* JADX INFO: renamed from: kk */
            public void m934kk() {
                this.f1715x1.reset();
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public TKey next() {
                return m933k4();
            }

            @Override // java.util.Iterator
            public void remove() {
                _remove();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                m934kk();
            }

            public Enumerator(SortedDictionary<TKey, TValue> sortedDictionary) {
                this();
                ((SortedDictionary) sortedDictionary).f1699k4.m896to().CloneTo(this.f1715x1);
            }

            /* JADX INFO: renamed from: kk */
            private boolean m931kk(Enumerator enumerator) {
                return C14067j2.m66728k4(enumerator.f1715x1, this.f1715x1) && C14067j2.m66728k4(enumerator.f1714kk, this.f1714kk);
            }

            public boolean equals(Object obj) {
                if (!f1713k4 && obj == null) {
                    throw new AssertionError();
                }
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof Enumerator) {
                    return m931kk((Enumerator) obj);
                }
                return false;
            }

            /* JADX INFO: renamed from: k4 */
            public TKey m933k4() {
                return this.f1714kk;
            }

            /* JADX INFO: renamed from: x1 */
            public boolean m935x1() {
                if (!this.f1715x1.hasNext()) {
                    return false;
                }
                this.f1714kk = ((Node) this.f1715x1.next()).f1717k4;
                return true;
            }
        }

        public KeyCollection(SortedDictionary<TKey, TValue> sortedDictionary) {
            this.f1710k4 = sortedDictionary;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void addItem(TKey tkey) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void clear() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean containsItem(TKey tkey) {
            return this.f1710k4.containsKey(tkey);
        }

        public void copyTo(TKey[] tkeyArr, int i) {
            m929k4(tkeyArr, i);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void copyToTArray(TKey[] tkeyArr, int i) {
            m929k4(tkeyArr, i);
        }

        public ICollection getICollection() {
            return new ICollection() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.KeyCollection.1
                @Override // com.aspose.slides.Collections.ICollection
                public void copyTo(AbstractC14092to abstractC14092to, int i) {
                    if (size() == 0) {
                        return;
                    }
                    if (abstractC14092to == null) {
                        throw new ArgumentNullException();
                    }
                    if (i < 0 || abstractC14092to.m67265du() <= i) {
                        throw new ArgumentOutOfRangeException();
                    }
                    if (abstractC14092to.m67265du() - i < size()) {
                        throw new ArgumentException();
                    }
                    Iterator<T> it = KeyCollection.this.f1710k4.f1699k4.m892h4().iterator();
                    while (it.hasNext()) {
                        abstractC14092to.m67276kk(((Node) it.next()).f1717k4, i);
                        i++;
                    }
                }

                @Override // com.aspose.slides.Collections.ICollection
                public Object getSyncRoot() {
                    return KeyCollection.this.m928k4();
                }

                @Override // com.aspose.slides.Collections.ICollection
                public boolean isSynchronized() {
                    return false;
                }

                @Override // java.lang.Iterable
                public IEnumerator iterator() {
                    return new Enumerator(KeyCollection.this.f1710k4).getIEnumerator();
                }

                @Override // com.aspose.slides.Collections.ICollection
                public int size() {
                    return KeyCollection.this.f1710k4.size();
                }
            };
        }

        public IEnumerable getIEnumerable() {
            return new IEnumerable() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.KeyCollection.2
                @Override // java.lang.Iterable
                public IEnumerator iterator() {
                    return new Enumerator(KeyCollection.this.f1710k4).getIEnumerator();
                }
            };
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean isReadOnly() {
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean removeItem(TKey tkey) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public int size() {
            return this.f1710k4.size();
        }

        @Override // java.lang.Iterable
        public Enumerator<TKey, TValue> iterator() {
            return new Enumerator<>(this.f1710k4);
        }

        /* JADX INFO: renamed from: k4 */
        public Object m928k4() {
            return this.f1710k4;
        }

        /* JADX INFO: renamed from: k4 */
        public void m929k4(TKey[] tkeyArr, int i) {
            if (size() == 0) {
                return;
            }
            if (tkeyArr == null) {
                throw new ArgumentNullException();
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException();
            }
            if (tkeyArr.length <= i) {
                throw new ArgumentException();
            }
            if (tkeyArr.length - i < size()) {
                throw new ArgumentException();
            }
            Iterator<T> it = ((SortedDictionary) this.f1710k4).f1699k4.m892h4().iterator();
            while (it.hasNext()) {
                tkeyArr[i] = ((Node) it.next()).f1717k4;
                i++;
            }
        }
    }

    public static class Node<TKey, TValue> extends RBTree.Node {

        /* JADX INFO: renamed from: k4 */
        public TKey f1717k4;

        /* JADX INFO: renamed from: x1 */
        public TValue f1718x1;

        public Node(TKey tkey) {
            this.f1717k4 = tkey;
        }

        /* JADX INFO: renamed from: k4 */
        public KeyValuePair<TKey, TValue> m936k4() {
            return new KeyValuePair<>(this.f1717k4, this.f1718x1);
        }

        @Override // com.aspose.slides.Collections.Generic.RBTree.Node
        public void swapValue(RBTree.Node node) {
            Node node2 = (Node) node;
            TKey tkey = this.f1717k4;
            this.f1717k4 = node2.f1717k4;
            node2.f1717k4 = tkey;
            TValue tvalue = this.f1718x1;
            this.f1718x1 = node2.f1718x1;
            node2.f1718x1 = tvalue;
        }

        /* JADX INFO: renamed from: x1 */
        public DictionaryEntry m937x1() {
            return new DictionaryEntry(this.f1717k4, this.f1718x1);
        }

        public Node(TKey tkey, TValue tvalue) {
            this.f1717k4 = tkey;
            this.f1718x1 = tvalue;
        }
    }

    public static class NodeHelper<TKey> implements RBTree.INodeHelper<TKey> {

        /* JADX INFO: renamed from: x1 */
        static NodeHelper f1719x1 = new NodeHelper(Comparer.getDefault());

        /* JADX INFO: renamed from: k4 */
        public Comparator<TKey> f1720k4;

        private NodeHelper(Comparator<TKey> comparator) {
            this.f1720k4 = comparator;
        }

        /* JADX INFO: renamed from: k4 */
        public static NodeHelper m938k4(Comparator comparator) {
            return (comparator == null || comparator == Comparer.getDefault()) ? f1719x1 : new NodeHelper(comparator);
        }

        @Override // com.aspose.slides.Collections.Generic.RBTree.INodeHelper
        public int compare(TKey tkey, RBTree.Node node) {
            return this.f1720k4.compare(tkey, ((Node) node).f1717k4);
        }

        @Override // com.aspose.slides.Collections.Generic.RBTree.INodeHelper
        public RBTree.Node createNode(TKey tkey) {
            return new Node(tkey);
        }
    }

    public static final class ValueCollection<TKey, TValue> implements IGenericCollection<TValue>, IGenericEnumerable<TValue> {

        /* JADX INFO: renamed from: k4 */
        private SortedDictionary<TKey, TValue> f1721k4;

        public static class Enumerator<TKey, TValue> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<TValue>, IDisposable {

            /* JADX INFO: renamed from: k4 */
            static final /* synthetic */ boolean f1724k4 = true;

            /* JADX INFO: renamed from: kk */
            private TValue f1725kk;

            /* JADX INFO: renamed from: x1 */
            private RBTree.NodeEnumerator f1726x1;

            public Enumerator() {
                this.f1726x1 = new RBTree.NodeEnumerator();
            }

            public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
                return enumerator.equals(enumerator2);
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public Enumerator Clone() {
                Enumerator enumerator = new Enumerator();
                CloneTo(enumerator);
                return enumerator;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public void CloneTo(Enumerator enumerator) {
                this.f1726x1.CloneTo(enumerator.f1726x1);
                enumerator.f1725kk = this.f1725kk;
            }

            public Object clone() {
                return Clone();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public void dispose() {
                this.f1726x1.dispose();
            }

            public IEnumerator getIEnumerator() {
                return new IEnumerator() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.ValueCollection.Enumerator.1
                    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                    public boolean hasNext() {
                        return Enumerator.this.m947x1();
                    }

                    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
                    public Object next() {
                        Enumerator.this.f1726x1.m905x1();
                        return Enumerator.this.f1725kk;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        Enumerator.this.m946to();
                    }

                    @Override // com.aspose.slides.Collections.IEnumerator
                    public void reset() {
                        Enumerator.this.m945kk();
                    }
                };
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return m947x1();
            }

            public int hashCode() {
                RBTree.NodeEnumerator nodeEnumerator = this.f1726x1;
                int iHashCode = (nodeEnumerator != null ? nodeEnumerator.hashCode() : 0) * 31;
                TValue tvalue = this.f1725kk;
                return iHashCode + (tvalue != null ? tvalue.hashCode() : 0);
            }

            /* JADX INFO: renamed from: kk */
            public void m945kk() {
                this.f1726x1.reset();
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public TValue next() {
                return m944k4();
            }

            @Override // java.util.Iterator
            public void remove() {
                m946to();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                m945kk();
            }

            /* JADX INFO: renamed from: to */
            public void m946to() {
                throw new NotSupportedException();
            }

            public Enumerator(SortedDictionary<TKey, TValue> sortedDictionary) {
                this();
                ((SortedDictionary) sortedDictionary).f1699k4.m896to().CloneTo(this.f1726x1);
            }

            /* JADX INFO: renamed from: kk */
            private boolean m942kk(Enumerator enumerator) {
                return C14067j2.m66728k4(enumerator.f1726x1, this.f1726x1) && C14067j2.m66728k4(enumerator.f1725kk, this.f1725kk);
            }

            public boolean equals(Object obj) {
                if (!f1724k4 && obj == null) {
                    throw new AssertionError();
                }
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof Enumerator) {
                    return m942kk((Enumerator) obj);
                }
                return false;
            }

            /* JADX INFO: renamed from: k4 */
            public TValue m944k4() {
                return this.f1725kk;
            }

            /* JADX INFO: renamed from: x1 */
            public boolean m947x1() {
                if (!this.f1726x1.hasNext()) {
                    return false;
                }
                this.f1725kk = ((Node) this.f1726x1.next()).f1718x1;
                return true;
            }
        }

        public ValueCollection(SortedDictionary<TKey, TValue> sortedDictionary) {
            this.f1721k4 = sortedDictionary;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void addItem(TValue tvalue) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void clear() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean containsItem(TValue tvalue) {
            return this.f1721k4.containsValue(tvalue);
        }

        public void copyTo(TValue[] tvalueArr, int i) {
            m940k4(tvalueArr, i);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void copyToTArray(TValue[] tvalueArr, int i) {
            m940k4(tvalueArr, i);
        }

        public ICollection getICollection() {
            return new ICollection() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.ValueCollection.1
                @Override // com.aspose.slides.Collections.ICollection
                public void copyTo(AbstractC14092to abstractC14092to, int i) {
                    if (size() == 0) {
                        return;
                    }
                    if (abstractC14092to == null) {
                        throw new ArgumentNullException();
                    }
                    if (i < 0 || abstractC14092to.m67265du() <= i) {
                        throw new ArgumentOutOfRangeException();
                    }
                    if (abstractC14092to.m67265du() - i < size()) {
                        throw new ArgumentException();
                    }
                    Iterator<T> it = ValueCollection.this.f1721k4.f1699k4.m892h4().iterator();
                    while (it.hasNext()) {
                        abstractC14092to.m67276kk(((Node) it.next()).f1718x1, i);
                        i++;
                    }
                }

                @Override // com.aspose.slides.Collections.ICollection
                public Object getSyncRoot() {
                    return ValueCollection.this.f1721k4;
                }

                @Override // com.aspose.slides.Collections.ICollection
                public boolean isSynchronized() {
                    return false;
                }

                @Override // java.lang.Iterable
                public IEnumerator iterator() {
                    return new Enumerator(ValueCollection.this.f1721k4).getIEnumerator();
                }

                @Override // com.aspose.slides.Collections.ICollection
                public int size() {
                    return ValueCollection.this.f1721k4.size();
                }
            };
        }

        public IEnumerable getIEnumerable() {
            return new IEnumerable() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.ValueCollection.2
                @Override // java.lang.Iterable
                public IEnumerator iterator() {
                    return new Enumerator(ValueCollection.this.f1721k4).getIEnumerator();
                }
            };
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean isReadOnly() {
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean removeItem(TValue tvalue) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public int size() {
            return this.f1721k4.size();
        }

        @Override // java.lang.Iterable
        public Enumerator<TKey, TValue> iterator() {
            return new Enumerator<>(this.f1721k4);
        }

        /* JADX INFO: renamed from: k4 */
        public void m940k4(TValue[] tvalueArr, int i) {
            if (size() == 0) {
                return;
            }
            if (tvalueArr == null) {
                throw new ArgumentNullException();
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException();
            }
            if (tvalueArr.length <= i) {
                throw new ArgumentException();
            }
            if (tvalueArr.length - i < size()) {
                throw new ArgumentException();
            }
            Iterator<T> it = ((SortedDictionary) this.f1721k4).f1699k4.m892h4().iterator();
            while (it.hasNext()) {
                tvalueArr[i] = ((Node) it.next()).f1718x1;
                i++;
            }
        }
    }

    public SortedDictionary() {
        this((Comparator) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: du */
    public TValue m906du(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public TKey m909to(Object obj) {
        if (obj != 0) {
            return obj;
        }
        throw new ArgumentNullException("key");
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(KeyValuePair<TKey, TValue> keyValuePair) {
        addItem(keyValuePair.getKey(), keyValuePair.getValue());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        m917x1();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(KeyValuePair<TKey, TValue> keyValuePair) {
        Object[] objArr = {null};
        return tryGetValue(keyValuePair.getKey(), objArr) && new EqualityComparer.DefaultComparer().equals(keyValuePair.getValue(), objArr[0]);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public boolean containsKey(TKey tkey) {
        return m919x1(tkey);
    }

    public boolean containsValue(TValue tvalue) {
        EqualityComparer.DefaultComparer defaultComparer = new EqualityComparer.DefaultComparer();
        Iterator<T> it = this.f1699k4.m892h4().iterator();
        while (it.hasNext()) {
            if (defaultComparer.equals(tvalue, ((Node) it.next()).f1718x1)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(KeyValuePair<TKey, TValue>[] keyValuePairArr, int i) {
        m914k4(keyValuePairArr, i);
    }

    public Comparator<TKey> getComparer() {
        return this.f1700x1.f1720k4;
    }

    public ICollection getICollection() {
        return new ICollection() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.2
            @Override // com.aspose.slides.Collections.ICollection
            public void copyTo(AbstractC14092to abstractC14092to, int i) {
                if (size() == 0) {
                    return;
                }
                if (abstractC14092to == null) {
                    throw new ArgumentNullException();
                }
                if (i < 0) {
                    throw new ArgumentOutOfRangeException();
                }
                if (abstractC14092to.m67265du() <= i) {
                    throw new ArgumentException();
                }
                if (abstractC14092to.m67265du() - i < size()) {
                    throw new ArgumentException();
                }
                if (!(AbstractC14092to.m67212k4(abstractC14092to) instanceof KeyValuePair[])) {
                    throw new ArgumentException();
                }
                Iterator<T> it = SortedDictionary.this.f1699k4.m892h4().iterator();
                while (it.hasNext()) {
                    abstractC14092to.m67276kk(((Node) it.next()).m936k4().Clone(), i);
                    i++;
                }
            }

            @Override // com.aspose.slides.Collections.ICollection
            public Object getSyncRoot() {
                return SortedDictionary.this.m915kk();
            }

            @Override // com.aspose.slides.Collections.ICollection
            public boolean isSynchronized() {
                return false;
            }

            @Override // java.lang.Iterable
            public IEnumerator iterator() {
                return new Enumerator(SortedDictionary.this.m915kk()).getIEnumerator();
            }

            @Override // com.aspose.slides.Collections.ICollection
            public int size() {
                return SortedDictionary.this.m911k4();
            }
        };
    }

    public IDictionary getIDictionary() {
        return new IDictionary() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.aspose.slides.Collections.IDictionary
            public void addItem(Object obj, Object obj2) {
                SortedDictionary sortedDictionary = SortedDictionary.this;
                sortedDictionary.m918x1(sortedDictionary.m909to(obj), SortedDictionary.this.m906du(obj2));
            }

            @Override // com.aspose.slides.Collections.IDictionary
            public void clear() {
                SortedDictionary.this.m917x1();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.aspose.slides.Collections.IDictionary
            public boolean contains(Object obj) {
                SortedDictionary sortedDictionary = SortedDictionary.this;
                return sortedDictionary.m919x1(sortedDictionary.m909to(obj));
            }

            @Override // com.aspose.slides.Collections.ICollection
            public void copyTo(AbstractC14092to abstractC14092to, int i) {
                if (!(AbstractC14092to.m67212k4(abstractC14092to) instanceof KeyValuePair[])) {
                    throw new ArgumentException();
                }
                SortedDictionary.this.m914k4((KeyValuePair[]) AbstractC14092to.m67212k4(abstractC14092to), i);
            }

            @Override // com.aspose.slides.Collections.IDictionary
            public ICollection getKeys() {
                return new KeyCollection(SortedDictionary.this.m915kk()).getICollection();
            }

            @Override // com.aspose.slides.Collections.ICollection
            public Object getSyncRoot() {
                return SortedDictionary.this.m915kk();
            }

            @Override // com.aspose.slides.Collections.IDictionary
            public ICollection getValues() {
                return new ValueCollection(SortedDictionary.this.m915kk()).getICollection();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.aspose.slides.Collections.IDictionary
            public Object get_Item(Object obj) {
                SortedDictionary sortedDictionary = SortedDictionary.this;
                return sortedDictionary.m912k4(sortedDictionary.m909to(obj));
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
                return new Enumerator(SortedDictionary.this.m915kk()).getIDictionaryEnumerator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.aspose.slides.Collections.IDictionary
            public void removeItem(Object obj) {
                SortedDictionary sortedDictionary = SortedDictionary.this;
                sortedDictionary.m916kk(sortedDictionary.m909to(obj));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.aspose.slides.Collections.IDictionary
            public void set_Item(Object obj, Object obj2) {
                SortedDictionary sortedDictionary = SortedDictionary.this;
                sortedDictionary.m913k4(sortedDictionary.m909to(obj), SortedDictionary.this.m906du(obj2));
            }

            @Override // com.aspose.slides.Collections.ICollection
            public int size() {
                return SortedDictionary.this.m911k4();
            }
        };
    }

    public IEnumerable getIEnumerable() {
        return new IEnumerable() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.3
            @Override // java.lang.Iterable
            public IEnumerator iterator() {
                return new Enumerator(SortedDictionary.this.m915kk()).getIEnumerator();
            }
        };
    }

    public IGenericEnumerable<KeyValuePair<TKey, TValue>> getIGenericEnumerable() {
        return new IGenericEnumerable() { // from class: com.aspose.slides.Collections.Generic.SortedDictionary.4
            @Override // java.lang.Iterable
            public IGenericEnumerator iterator() {
                return new Enumerator(SortedDictionary.this.m915kk());
            }
        };
    }

    public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
        if (c9480kk == null) {
            throw new ArgumentNullException("info");
        }
        KeyValuePair<TKey, TValue>[] keyValuePairArr = (KeyValuePair[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) KeyValuePair.class), size()));
        copyToTArray((KeyValuePair[]) keyValuePairArr, 0);
        c9480kk.m46669k4("KeyValuePairs", keyValuePairArr);
        c9480kk.m46669k4("Helper", this.f1700x1);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public TValue get_Item(TKey tkey) {
        return m912k4(tkey);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean isReadOnly() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public int m911k4() {
        return this.f1699k4.m895kk();
    }

    /* JADX INFO: renamed from: kk */
    public SortedDictionary<TKey, TValue> m915kk() {
        return this;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(KeyValuePair<TKey, TValue> keyValuePair) {
        return removeItemByKey(keyValuePair.getKey());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public boolean removeItemByKey(TKey tkey) {
        return m916kk(tkey);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public void set_Item(TKey tkey, TValue tvalue) {
        m913k4(tkey, tvalue);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return m911k4();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public boolean tryGetValue(TKey tkey, Object[] objArr) {
        Node node = (Node) this.f1699k4.m897x1(tkey);
        objArr[0] = node == null ? null : node.f1718x1;
        return node != null;
    }

    public SortedDictionary(IGenericDictionary<TKey, TValue> iGenericDictionary) {
        this(iGenericDictionary, (Comparator) null);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public KeyCollection<TKey, TValue> getKeys() {
        return new KeyCollection<>(this);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public ValueCollection<TKey, TValue> getValues() {
        return new ValueCollection<>(this);
    }

    @Override // java.lang.Iterable
    public Enumerator<TKey, TValue> iterator() {
        return new Enumerator<>(this);
    }

    /* JADX INFO: renamed from: kk */
    public boolean m916kk(TKey tkey) {
        return this.f1699k4.m893k4(tkey) != null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m917x1() {
        this.f1699k4.m898x1();
    }

    public SortedDictionary(IGenericDictionary<TKey, TValue> iGenericDictionary, Comparator<TKey> comparator) {
        this(comparator);
        if (iGenericDictionary == null) {
            throw new ArgumentNullException("dictionary");
        }
        for (KeyValuePair<TKey, TValue> keyValuePair : iGenericDictionary) {
            addItem(keyValuePair.getKey(), keyValuePair.getValue());
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public void addItem(TKey tkey, TValue tvalue) {
        m918x1(tkey, tvalue);
    }

    /* JADX INFO: renamed from: x1 */
    public void m918x1(TKey tkey, TValue tvalue) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        Node node = new Node(tkey, tvalue);
        if (this.f1699k4.m894k4(tkey, node) != node) {
            throw new ArgumentException("key already present in dictionary", "key");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SortedDictionary(C9480kk c9480kk, C9478du c9478du) {
        NodeHelper nodeHelper = (NodeHelper) c9480kk.m46666k4("Helper", C7019kk.m27443k4((Class<?>) NodeHelper.class));
        this.f1700x1 = nodeHelper;
        this.f1699k4 = new RBTree(nodeHelper);
        for (KeyValuePair keyValuePair : (KeyValuePair[]) c9480kk.m46666k4("KeyValuePairs", C7019kk.m27443k4((Class<?>) KeyValuePair[].class))) {
            addItem(keyValuePair.getKey(), keyValuePair.getValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public TValue m912k4(TKey tkey) {
        Node node = (Node) this.f1699k4.m897x1(tkey);
        if (node != null) {
            return node.f1718x1;
        }
        throw new KeyNotFoundException();
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m919x1(TKey tkey) {
        if (tkey != null) {
            return this.f1699k4.m897x1(tkey) != null;
        }
        throw new ArgumentNullException();
    }

    public SortedDictionary(Comparator<TKey> comparator) {
        NodeHelper nodeHelperM938k4 = NodeHelper.m938k4(comparator);
        this.f1700x1 = nodeHelperM938k4;
        this.f1699k4 = new RBTree(nodeHelperM938k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m913k4(TKey tkey, TValue tvalue) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        ((Node) this.f1699k4.m894k4(tkey, (RBTree.Node) null)).f1718x1 = tvalue;
    }

    /* JADX INFO: renamed from: k4 */
    public void m914k4(KeyValuePair<TKey, TValue>[] keyValuePairArr, int i) {
        if (size() == 0) {
            return;
        }
        if (keyValuePairArr == null) {
            throw new ArgumentNullException();
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        if (keyValuePairArr.length <= i) {
            throw new ArgumentException();
        }
        if (keyValuePairArr.length < size()) {
            throw new ArgumentException();
        }
        if (keyValuePairArr.length - i < size()) {
            throw new ArgumentException();
        }
        Iterator<T> it = this.f1699k4.m892h4().iterator();
        while (it.hasNext()) {
            keyValuePairArr[i] = ((Node) it.next()).m936k4().Clone();
            i++;
        }
    }
}
