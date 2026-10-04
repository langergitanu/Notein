package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.EqualityComparer;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p432tz.C11245k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Dictionary<TKey, TValue> implements IGenericDictionary<TKey, TValue> {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f1590fa = new C7017h4("Version", "Comparer", "HashSize", "KeyValuePairs");

    /* JADX INFO: renamed from: c5 */
    private int f1591c5;

    /* JADX INFO: renamed from: ck */
    private final Object f1592ck;

    /* JADX INFO: renamed from: du */
    private IGenericEqualityComparer<TKey> f1593du;

    /* JADX INFO: renamed from: dy */
    private int f1594dy;

    /* JADX INFO: renamed from: h4 */
    private int f1595h4;

    /* JADX INFO: renamed from: jd */
    private int f1596jd;

    /* JADX INFO: renamed from: k4 */
    private int[] f1597k4;

    /* JADX INFO: renamed from: kk */
    private Object[] f1598kk;

    /* JADX INFO: renamed from: m9 */
    private int f1599m9;

    /* JADX INFO: renamed from: to */
    private Object[] f1600to;

    /* JADX INFO: renamed from: x1 */
    private Link[] f1601x1;

    public static class Enumerator<TKey, TValue> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<KeyValuePair<TKey, TValue>>, IDictionaryEnumerator<KeyValuePair<TKey, TValue>> {

        /* JADX INFO: renamed from: h4 */
        private static final C7017h4 f1603h4 = new C7017h4("Version", "Comparer", "HashSize", "KeyValuePairs");

        /* JADX INFO: renamed from: x1 */
        static final /* synthetic */ boolean f1604x1 = true;

        /* JADX INFO: renamed from: du */
        private int f1605du;

        /* JADX INFO: renamed from: k4 */
        KeyValuePair<TKey, TValue> f1606k4;

        /* JADX INFO: renamed from: kk */
        private Dictionary<TKey, TValue> f1607kk;

        /* JADX INFO: renamed from: to */
        private int f1608to;

        public Enumerator() {
            this.f1606k4 = new KeyValuePair<>();
        }

        public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
            return enumerator.equals(enumerator2);
        }

        /* JADX INFO: renamed from: kk */
        private void m822kk() {
            Dictionary<TKey, TValue> dictionary = this.f1607kk;
            if (dictionary == null) {
                throw new ObjectDisposedException(getClass().getName());
            }
            if (((Dictionary) dictionary).f1596jd != this.f1605du) {
                throw new InvalidOperationException("out of sync");
            }
        }

        /* JADX INFO: renamed from: to */
        private void m823to() {
            m822kk();
            if (this.f1608to <= 0) {
                throw new InvalidOperationException("Current is not valid");
            }
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Enumerator Clone() {
            Enumerator enumerator = new Enumerator();
            CloneTo(enumerator);
            return enumerator;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Enumerator enumerator) {
            enumerator.f1607kk = this.f1607kk;
            enumerator.f1608to = this.f1608to;
            enumerator.f1605du = this.f1605du;
            this.f1606k4.CloneTo((KeyValuePair) enumerator.f1606k4);
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
            this.f1607kk = null;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            m823to();
            return new DictionaryEntry(this.f1606k4.getKey(), this.f1606k4.getValue());
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            return m824k4();
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            return m825x1();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            m822kk();
            if (this.f1608to < 0) {
                return false;
            }
            while (this.f1608to < ((Dictionary) this.f1607kk).f1595h4) {
                int i = this.f1608to;
                this.f1608to = i + 1;
                if ((((Dictionary) this.f1607kk).f1601x1[i].HashCode & Integer.MIN_VALUE) != 0) {
                    this.f1606k4 = new KeyValuePair<>(((Dictionary) this.f1607kk).f1598kk[i], ((Dictionary) this.f1607kk).f1600to[i]);
                    return true;
                }
            }
            this.f1608to = -1;
            return false;
        }

        public int hashCode() {
            Dictionary<TKey, TValue> dictionary = this.f1607kk;
            int iHashCode = (((((dictionary != null ? dictionary.hashCode() : 0) * 31) + this.f1608to) * 31) + this.f1605du) * 31;
            KeyValuePair<TKey, TValue> keyValuePair = this.f1606k4;
            return iHashCode + (keyValuePair != null ? keyValuePair.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k4 */
        public TKey m824k4() {
            m823to();
            return this.f1606k4.getKey();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public KeyValuePair<TKey, TValue> next() {
            m823to();
            return this.f1606k4;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m822kk();
            this.f1608to = 0;
        }

        /* JADX INFO: renamed from: x1 */
        public TValue m825x1() {
            m823to();
            return this.f1606k4.getValue();
        }

        public Enumerator(Dictionary<TKey, TValue> dictionary) {
            this();
            this.f1607kk = dictionary;
            this.f1605du = ((Dictionary) dictionary).f1596jd;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m821k4(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1607kk, this.f1607kk) && enumerator.f1608to == this.f1608to && enumerator.f1605du == this.f1605du && C14067j2.m66728k4(enumerator.f1606k4, this.f1606k4);
        }

        public boolean equals(Object obj) {
            if (!f1604x1 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Enumerator) {
                return m821k4((Enumerator) obj);
            }
            return false;
        }
    }

    @Deprecated
    public static class EnumeratorJava<TKey, TValue> extends AbstractC7020m9<EnumeratorJava> implements IGenericEnumerator<KeyValuePair<TKey, TValue>>, IDictionaryEnumerator<KeyValuePair<TKey, TValue>> {

        /* JADX INFO: renamed from: h4 */
        private static final C7017h4 f1609h4 = new C7017h4("Version", "Comparer", "HashSize", "KeyValuePairs");

        /* JADX INFO: renamed from: x1 */
        static final /* synthetic */ boolean f1610x1 = true;

        /* JADX INFO: renamed from: du */
        private int f1611du;

        /* JADX INFO: renamed from: k4 */
        KeyValuePair<TKey, TValue> f1612k4;

        /* JADX INFO: renamed from: kk */
        private Dictionary<TKey, TValue> f1613kk;

        /* JADX INFO: renamed from: to */
        private int f1614to;

        public EnumeratorJava() {
            this.f1612k4 = new KeyValuePair<>();
        }

        public static boolean equals(EnumeratorJava enumeratorJava, EnumeratorJava enumeratorJava2) {
            return enumeratorJava.equals(enumeratorJava2);
        }

        /* JADX INFO: renamed from: kk */
        private void m827kk() {
            Dictionary<TKey, TValue> dictionary = this.f1613kk;
            if (dictionary == null) {
                throw new ObjectDisposedException(getClass().getName());
            }
            if (((Dictionary) dictionary).f1596jd != this.f1611du) {
                throw new InvalidOperationException("out of sync");
            }
        }

        /* JADX INFO: renamed from: to */
        private void m828to() {
            m827kk();
            if (this.f1614to < 0) {
                throw new InvalidOperationException("Current is not valid");
            }
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public EnumeratorJava Clone() {
            EnumeratorJava enumeratorJava = new EnumeratorJava();
            CloneTo(enumeratorJava);
            return enumeratorJava;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(EnumeratorJava enumeratorJava) {
            enumeratorJava.f1613kk = this.f1613kk;
            enumeratorJava.f1614to = this.f1614to;
            enumeratorJava.f1611du = this.f1611du;
            this.f1612k4.CloneTo((KeyValuePair) enumeratorJava.f1612k4);
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
            this.f1613kk = null;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            m828to();
            return new DictionaryEntry(this.f1612k4.getKey(), this.f1612k4.getValue());
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            return m829k4();
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            return m830x1();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            m827kk();
            int i = this.f1614to;
            if (i < 0) {
                return false;
            }
            while (this.f1614to < ((Dictionary) this.f1613kk).f1595h4) {
                if ((((Dictionary) this.f1613kk).f1601x1[i].HashCode & Integer.MIN_VALUE) != 0) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Dictionary<TKey, TValue> dictionary = this.f1613kk;
            int iHashCode = (((((dictionary != null ? dictionary.hashCode() : 0) * 31) + this.f1614to) * 31) + this.f1611du) * 31;
            KeyValuePair<TKey, TValue> keyValuePair = this.f1612k4;
            return iHashCode + (keyValuePair != null ? keyValuePair.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k4 */
        public TKey m829k4() {
            m828to();
            return this.f1612k4.getKey();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public KeyValuePair<TKey, TValue> next() {
            m827kk();
            while (this.f1614to < ((Dictionary) this.f1613kk).f1595h4) {
                int i = this.f1614to;
                this.f1614to = i + 1;
                if ((((Dictionary) this.f1613kk).f1601x1[i].HashCode & Integer.MIN_VALUE) != 0) {
                    KeyValuePair<TKey, TValue> keyValuePair = new KeyValuePair<>(((Dictionary) this.f1613kk).f1598kk[i], ((Dictionary) this.f1613kk).f1600to[i]);
                    this.f1612k4 = keyValuePair;
                    return keyValuePair;
                }
            }
            this.f1614to = -1;
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m827kk();
            this.f1614to = 0;
        }

        /* JADX INFO: renamed from: x1 */
        public TValue m830x1() {
            m828to();
            return this.f1612k4.getValue();
        }

        public EnumeratorJava(Dictionary<TKey, TValue> dictionary) {
            this();
            this.f1613kk = dictionary;
            this.f1611du = ((Dictionary) dictionary).f1596jd;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m826k4(EnumeratorJava enumeratorJava) {
            return C14067j2.m66728k4(enumeratorJava.f1613kk, this.f1613kk) && enumeratorJava.f1614to == this.f1614to && enumeratorJava.f1611du == this.f1611du && C14067j2.m66728k4(enumeratorJava.f1612k4, this.f1612k4);
        }

        public boolean equals(Object obj) {
            if (!f1610x1 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof EnumeratorJava) {
                return m826k4((EnumeratorJava) obj);
            }
            return false;
        }
    }

    public static final class KeyCollection<TKey, TValue> implements IGenericCollection<TKey>, IGenericEnumerable<TKey> {

        /* JADX INFO: renamed from: k4 */
        private Dictionary<TKey, TValue> f1615k4;

        public static class Enumerator<TKey, TValue> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<TKey> {

            /* JADX INFO: renamed from: k4 */
            static final /* synthetic */ boolean f1617k4 = true;

            /* JADX INFO: renamed from: kk */
            private static final C7017h4 f1618kk = new C7017h4("Version", "Comparer", "HashSize", "KeyValuePairs");

            /* JADX INFO: renamed from: x1 */
            private Enumerator<TKey, TValue> f1619x1 = new Enumerator<>();

            public Enumerator() {
            }

            public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
                return enumerator.equals(enumerator2);
            }

            /* JADX INFO: renamed from: k4 */
            private boolean m831k4(Enumerator enumerator) {
                return C14067j2.m66728k4(enumerator.f1619x1, this.f1619x1);
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public Enumerator Clone() {
                Enumerator enumerator = new Enumerator();
                CloneTo(enumerator);
                return enumerator;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public void CloneTo(Enumerator enumerator) {
                this.f1619x1.CloneTo((Enumerator) enumerator.f1619x1);
            }

            public Object clone() {
                return Clone();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public void dispose() {
                this.f1619x1.dispose();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return this.f1619x1.hasNext();
            }

            public int hashCode() {
                Enumerator<TKey, TValue> enumerator = this.f1619x1;
                if (enumerator != null) {
                    return enumerator.hashCode();
                }
                return 0;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public TKey next() {
                return this.f1619x1.f1606k4.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new NotSupportedException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f1619x1.reset();
            }

            public Enumerator(Dictionary<TKey, TValue> dictionary) {
                dictionary.m817k4().CloneTo((Enumerator) this.f1619x1);
            }

            public boolean equals(Object obj) {
                if (!f1617k4 && obj == null) {
                    throw new AssertionError();
                }
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof Enumerator) {
                    return m831k4((Enumerator) obj);
                }
                return false;
            }
        }

        @Deprecated
        public static class EnumeratorJava<TKey, TValue> extends AbstractC7020m9<EnumeratorJava> implements IGenericEnumerator<TKey> {

            /* JADX INFO: renamed from: k4 */
            static final /* synthetic */ boolean f1620k4 = true;

            /* JADX INFO: renamed from: kk */
            private static final C7017h4 f1621kk = new C7017h4("Version", "Comparer", "HashSize", "KeyValuePairs");

            /* JADX INFO: renamed from: x1 */
            private EnumeratorJava<TKey, TValue> f1622x1 = new EnumeratorJava<>();

            public EnumeratorJava() {
            }

            public static boolean equals(EnumeratorJava enumeratorJava, EnumeratorJava enumeratorJava2) {
                return enumeratorJava.equals(enumeratorJava2);
            }

            /* JADX INFO: renamed from: k4 */
            private boolean m832k4(EnumeratorJava enumeratorJava) {
                return C14067j2.m66728k4(enumeratorJava.f1622x1, this.f1622x1);
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public EnumeratorJava Clone() {
                EnumeratorJava enumeratorJava = new EnumeratorJava();
                CloneTo(enumeratorJava);
                return enumeratorJava;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public void CloneTo(EnumeratorJava enumeratorJava) {
                this.f1622x1.CloneTo((EnumeratorJava) enumeratorJava.f1622x1);
            }

            public Object clone() {
                return Clone();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public void dispose() {
                this.f1622x1.dispose();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return this.f1622x1.hasNext();
            }

            public int hashCode() {
                EnumeratorJava<TKey, TValue> enumeratorJava = this.f1622x1;
                if (enumeratorJava != null) {
                    return enumeratorJava.hashCode();
                }
                return 0;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public TKey next() {
                return this.f1622x1.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new NotSupportedException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f1622x1.reset();
            }

            public EnumeratorJava(Dictionary<TKey, TValue> dictionary) {
                dictionary.m818x1().CloneTo((EnumeratorJava) this.f1622x1);
            }

            public boolean equals(Object obj) {
                if (!f1620k4 && obj == null) {
                    throw new AssertionError();
                }
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof EnumeratorJava) {
                    return m832k4((EnumeratorJava) obj);
                }
                return false;
            }
        }

        public KeyCollection(Dictionary<TKey, TValue> dictionary) {
            if (dictionary == null) {
                throw new ArgumentNullException("dictionary");
            }
            this.f1615k4 = dictionary;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void addItem(TKey tkey) {
            throw new NotSupportedException("this is a read-only collection");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void clear() {
            throw new NotSupportedException("this is a read-only collection");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean containsItem(TKey tkey) {
            return this.f1615k4.containsKey(tkey);
        }

        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            this.f1615k4.m804k4(abstractC14092to, i);
            this.f1615k4.m805k4(abstractC14092to, i, new Transform() { // from class: com.aspose.slides.Collections.Generic.Dictionary.KeyCollection.1
                @Override // com.aspose.slides.Collections.Generic.Dictionary.Transform
                /* JADX INFO: renamed from: x1 */
                public Object mo820x1(Object obj, Object obj2) {
                    return Dictionary.m813x1(obj, obj2);
                }
            });
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void copyToTArray(TKey[] tkeyArr, int i) {
            this.f1615k4.m804k4(AbstractC14092to.m67208k4((Object) tkeyArr), i);
            this.f1615k4.m806k4(tkeyArr, i);
        }

        public Object getSyncRoot() {
            return ((ICollection) this.f1615k4).getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean isReadOnly() {
            return true;
        }

        public boolean isSynchronized() {
            return false;
        }

        @Override // java.lang.Iterable
        public Enumerator<TKey, TValue> iterator() {
            return new Enumerator<>(this.f1615k4);
        }

        @Deprecated
        public EnumeratorJava<TKey, TValue> iteratorJava() {
            return new EnumeratorJava<>(this.f1615k4);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean removeItem(TKey tkey) {
            throw new NotSupportedException("this is a read-only collection");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public int size() {
            return this.f1615k4.size();
        }
    }

    public static class Link extends AbstractC7020m9<Link> {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1623k4 = true;
        public int HashCode;
        public int Next;

        public static boolean equals(Link link, Link link2) {
            return link.equals(link2);
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m833k4(Link link) {
            return link.HashCode == this.HashCode && link.Next == this.Next;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Link Clone() {
            Link link = new Link();
            CloneTo(link);
            return link;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Link link) {
            link.HashCode = this.HashCode;
            link.Next = this.Next;
        }

        public Object clone() {
            return Clone();
        }

        public int hashCode() {
            return (this.HashCode * 31) + this.Next;
        }

        public boolean equals(Object obj) {
            if (!f1623k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Link) {
                return m833k4((Link) obj);
            }
            return false;
        }
    }

    public class ShimEnumerator<TKey, TValue> implements IDictionaryEnumerator, IEnumerable<DictionaryEntry> {

        /* JADX INFO: renamed from: x1 */
        private Enumerator f1625x1 = new Enumerator();

        public ShimEnumerator(Dictionary<TKey, TValue> dictionary) {
            dictionary.m817k4().CloneTo(this.f1625x1);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            return this.f1625x1.getEntry();
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            return this.f1625x1.next().getKey();
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            return this.f1625x1.next().getValue();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            return this.f1625x1.hasNext();
        }

        @Override // java.lang.Iterable
        public IEnumerator<DictionaryEntry> iterator() {
            return this;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            return getEntry();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            this.f1625x1.reset();
        }
    }

    @Deprecated
    public class ShimEnumeratorJava<TKey, TValue> implements IDictionaryEnumerator, IEnumerable<DictionaryEntry> {

        /* JADX INFO: renamed from: x1 */
        private EnumeratorJava f1627x1 = new EnumeratorJava();

        public ShimEnumeratorJava(Dictionary<TKey, TValue> dictionary) {
            dictionary.m818x1().CloneTo(this.f1627x1);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            return this.f1627x1.getEntry();
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            return this.f1627x1.next().getKey();
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            return this.f1627x1.next().getValue();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            return this.f1627x1.hasNext();
        }

        @Override // java.lang.Iterable
        public IEnumerator<DictionaryEntry> iterator() {
            return this;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            this.f1627x1.next();
            return getEntry();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            this.f1627x1.reset();
        }
    }

    public interface Transform<TKey, TValue, TRet> {
        /* JADX INFO: renamed from: x1 */
        TRet mo820x1(TKey tkey, TValue tvalue);
    }

    public static final class ValueCollection<TKey, TValue> implements IGenericCollection<TValue>, IGenericEnumerable<TValue> {

        /* JADX INFO: renamed from: k4 */
        private Dictionary<TKey, TValue> f1628k4;

        public static class Enumerator<TKey, TValue> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<TValue> {

            /* JADX INFO: renamed from: k4 */
            static final /* synthetic */ boolean f1630k4 = true;

            /* JADX INFO: renamed from: kk */
            private static final C7017h4 f1631kk = new C7017h4("Version", "Comparer", "HashSize", "KeyValuePairs");

            /* JADX INFO: renamed from: x1 */
            private Enumerator<TKey, TValue> f1632x1 = new Enumerator<>();

            public Enumerator() {
            }

            public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
                return enumerator.equals(enumerator2);
            }

            /* JADX INFO: renamed from: k4 */
            private boolean m834k4(Enumerator enumerator) {
                return C14067j2.m66728k4(enumerator.f1632x1, this.f1632x1);
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public Enumerator Clone() {
                Enumerator enumerator = new Enumerator();
                CloneTo(enumerator);
                return enumerator;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public void CloneTo(Enumerator enumerator) {
                this.f1632x1.CloneTo((Enumerator) enumerator.f1632x1);
            }

            public Object clone() {
                return Clone();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public void dispose() {
                this.f1632x1.dispose();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return this.f1632x1.hasNext();
            }

            public int hashCode() {
                Enumerator<TKey, TValue> enumerator = this.f1632x1;
                if (enumerator != null) {
                    return enumerator.hashCode();
                }
                return 0;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public TValue next() {
                return this.f1632x1.f1606k4.getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new NotSupportedException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f1632x1.reset();
            }

            public Enumerator(Dictionary<TKey, TValue> dictionary) {
                dictionary.m817k4().CloneTo((Enumerator) this.f1632x1);
            }

            public boolean equals(Object obj) {
                if (!f1630k4 && obj == null) {
                    throw new AssertionError();
                }
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof Enumerator) {
                    return m834k4((Enumerator) obj);
                }
                return false;
            }
        }

        @Deprecated
        public static class EnumeratorJava<TKey, TValue> extends AbstractC7020m9<EnumeratorJava> implements IGenericEnumerator<TValue> {

            /* JADX INFO: renamed from: k4 */
            static final /* synthetic */ boolean f1633k4 = true;

            /* JADX INFO: renamed from: kk */
            private static final C7017h4 f1634kk = new C7017h4("Version", "Comparer", "HashSize", "KeyValuePairs");

            /* JADX INFO: renamed from: x1 */
            private EnumeratorJava<TKey, TValue> f1635x1 = new EnumeratorJava<>();

            public EnumeratorJava() {
            }

            public static boolean equals(EnumeratorJava enumeratorJava, EnumeratorJava enumeratorJava2) {
                return enumeratorJava.equals(enumeratorJava2);
            }

            /* JADX INFO: renamed from: k4 */
            private boolean m835k4(EnumeratorJava enumeratorJava) {
                return C14067j2.m66728k4(enumeratorJava.f1635x1, this.f1635x1);
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public EnumeratorJava Clone() {
                EnumeratorJava enumeratorJava = new EnumeratorJava();
                CloneTo(enumeratorJava);
                return enumeratorJava;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            public void CloneTo(EnumeratorJava enumeratorJava) {
                this.f1635x1.CloneTo((EnumeratorJava) enumeratorJava.f1635x1);
            }

            public Object clone() {
                return Clone();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public void dispose() {
                this.f1635x1.dispose();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return this.f1635x1.hasNext();
            }

            public int hashCode() {
                EnumeratorJava<TKey, TValue> enumeratorJava = this.f1635x1;
                if (enumeratorJava != null) {
                    return enumeratorJava.hashCode();
                }
                return 0;
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public TValue next() {
                return this.f1635x1.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new NotSupportedException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f1635x1.reset();
            }

            public EnumeratorJava(Dictionary<TKey, TValue> dictionary) {
                dictionary.m818x1().CloneTo((EnumeratorJava) this.f1635x1);
            }

            public boolean equals(Object obj) {
                if (!f1633k4 && obj == null) {
                    throw new AssertionError();
                }
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof EnumeratorJava) {
                    return m835k4((EnumeratorJava) obj);
                }
                return false;
            }
        }

        public ValueCollection(Dictionary<TKey, TValue> dictionary) {
            if (dictionary == null) {
                throw new ArgumentNullException("dictionary");
            }
            this.f1628k4 = dictionary;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void addItem(TValue tvalue) {
            throw new NotSupportedException("this is a read-only collection");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void clear() {
            throw new NotSupportedException("this is a read-only collection");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean containsItem(TValue tvalue) {
            return this.f1628k4.containsValue(tvalue);
        }

        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            this.f1628k4.m804k4(abstractC14092to, i);
            this.f1628k4.m805k4(abstractC14092to, i, new Transform() { // from class: com.aspose.slides.Collections.Generic.Dictionary.ValueCollection.1
                @Override // com.aspose.slides.Collections.Generic.Dictionary.Transform
                /* JADX INFO: renamed from: x1 */
                public Object mo820x1(Object obj, Object obj2) {
                    return Dictionary.m808kk(obj, obj2);
                }
            });
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void copyToTArray(TValue[] tvalueArr, int i) {
            this.f1628k4.m804k4(AbstractC14092to.m67208k4((Object) tvalueArr), i);
            this.f1628k4.m815x1(tvalueArr, i);
        }

        public Object getSyncRoot() {
            return ((ICollection) this.f1628k4).getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean isReadOnly() {
            return true;
        }

        public boolean isSynchronized() {
            return false;
        }

        @Override // java.lang.Iterable
        public Enumerator<TKey, TValue> iterator() {
            return new Enumerator<>(this.f1628k4);
        }

        @Deprecated
        public EnumeratorJava<TKey, TValue> iteratorJava() {
            return new EnumeratorJava<>(this.f1628k4);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean removeItem(TValue tvalue) {
            throw new NotSupportedException("this is a read-only collection");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public int size() {
            return this.f1628k4.size();
        }
    }

    public Dictionary() {
        this.f1592ck = new Object();
        m800k4(10, (IGenericEqualityComparer) null);
    }

    /* JADX INFO: renamed from: kk */
    public static <TKey, TValue> TValue m808kk(TKey tkey, TValue tvalue) {
        return tvalue;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(KeyValuePair<TKey, TValue> keyValuePair) {
        addItem(keyValuePair.getKey(), keyValuePair.getValue());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        this.f1594dy = 0;
        Arrays.fill(this.f1597k4, 0);
        Arrays.fill(this.f1598kk, (Object) null);
        Arrays.fill(this.f1600to, (Object) null);
        int i = 0;
        while (true) {
            Link[] linkArr = this.f1601x1;
            if (i >= linkArr.length) {
                this.f1599m9 = -1;
                this.f1595h4 = 0;
                this.f1596jd++;
                return;
            }
            linkArr[i] = new Link();
            i++;
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(KeyValuePair<TKey, TValue> keyValuePair) {
        if (keyValuePair != null) {
            return m807k4(keyValuePair.Clone());
        }
        throw new ArgumentNullException("keyValuePair");
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public boolean containsKey(TKey tkey) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        int iHashCodeT = this.f1593du.hashCodeT(tkey) | Integer.MIN_VALUE;
        int[] iArr = this.f1597k4;
        int i = iArr[(Integer.MAX_VALUE & iHashCodeT) % iArr.length] - 1;
        while (i != -1) {
            if (this.f1601x1[i].HashCode == iHashCodeT && this.f1593du.equalsT((TKey) this.f1598kk[i], tkey)) {
                return true;
            }
            i = this.f1601x1[i].Next;
        }
        return false;
    }

    public boolean containsValue(TValue tvalue) {
        EqualityComparer.DefaultComparer defaultComparer = new EqualityComparer.DefaultComparer();
        int i = 0;
        while (true) {
            int[] iArr = this.f1597k4;
            if (i >= iArr.length) {
                return false;
            }
            int i2 = iArr[i] - 1;
            while (i2 != -1) {
                if (defaultComparer.equalsT(this.f1600to[i2], tvalue)) {
                    return true;
                }
                i2 = this.f1601x1[i2].Next;
            }
            i++;
        }
    }

    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        Object objM67212k4 = AbstractC14092to.m67212k4(abstractC14092to);
        KeyValuePair<TKey, TValue>[] keyValuePairArr = objM67212k4 instanceof KeyValuePair[] ? (KeyValuePair[]) objM67212k4 : null;
        if (keyValuePairArr != null) {
            copyToTArray((KeyValuePair[]) keyValuePairArr, i);
            return;
        }
        m804k4(abstractC14092to, i);
        DictionaryEntry[] dictionaryEntryArr = objM67212k4 instanceof DictionaryEntry[] ? (DictionaryEntry[]) objM67212k4 : null;
        if (dictionaryEntryArr == null) {
            m805k4(abstractC14092to, i, new Transform() { // from class: com.aspose.slides.Collections.Generic.Dictionary.1
                @Override // com.aspose.slides.Collections.Generic.Dictionary.Transform
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public KeyValuePair mo820x1(Object obj, Object obj2) {
                    return Dictionary.m798k4(obj, obj2);
                }
            });
            return;
        }
        for (int i2 = 0; i2 < this.f1595h4; i2++) {
            if ((this.f1601x1[i2].HashCode & Integer.MIN_VALUE) != 0) {
                dictionaryEntryArr[i] = new DictionaryEntry(this.f1598kk[i2], this.f1600to[i2]);
                i++;
            }
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(KeyValuePair<TKey, TValue>[] keyValuePairArr, int i) {
        m804k4(AbstractC14092to.m67208k4((Object) keyValuePairArr), i);
        for (int i2 = 0; i2 < this.f1595h4; i2++) {
            if ((this.f1601x1[i2].HashCode & Integer.MIN_VALUE) != 0) {
                keyValuePairArr[i] = new KeyValuePair<>(this.f1598kk[i2], this.f1600to[i2]);
                i++;
            }
        }
    }

    public IGenericEqualityComparer<TKey> getComparer() {
        return this.f1593du;
    }

    public IEnumerable<DictionaryEntry> getDictionaryEntryEnumerator() {
        return new ShimEnumerator(this);
    }

    @Deprecated
    public IEnumerable<DictionaryEntry> getDictionaryEntryEnumeratorJava() {
        return new ShimEnumeratorJava(this);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public KeyCollection<TKey, TValue> getKeys() {
        return new KeyCollection<>(this);
    }

    public Object getSyncRoot() {
        return this.f1592ck;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public ValueCollection<TKey, TValue> getValues() {
        return new ValueCollection<>(this);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public TValue get_Item(TKey tkey) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        int iHashCodeT = this.f1593du.hashCodeT(tkey) | Integer.MIN_VALUE;
        int[] iArr = this.f1597k4;
        int i = iArr[(Integer.MAX_VALUE & iHashCodeT) % iArr.length] - 1;
        while (i != -1) {
            if (this.f1601x1[i].HashCode == iHashCodeT && this.f1593du.equalsT((TKey) this.f1598kk[i], tkey)) {
                return (TValue) this.f1600to[i];
            }
            i = this.f1601x1[i].Next;
        }
        throw new KeyNotFoundException();
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

    @Override // java.lang.Iterable
    public Enumerator<TKey, TValue> iterator() {
        return new Enumerator<>(this);
    }

    @Deprecated
    public EnumeratorJava<TKey, TValue> iteratorJava() {
        return new EnumeratorJava<>(this);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(KeyValuePair<TKey, TValue> keyValuePair) {
        if (keyValuePair == null) {
            throw new ArgumentNullException("keyValuePair");
        }
        if (m807k4(keyValuePair.Clone())) {
            return removeItemByKey(keyValuePair.getKey());
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public boolean removeItemByKey(TKey tkey) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        int iHashCodeT = this.f1593du.hashCodeT(tkey) | Integer.MIN_VALUE;
        int[] iArr = this.f1597k4;
        int length = (Integer.MAX_VALUE & iHashCodeT) % iArr.length;
        int i = iArr[length] - 1;
        if (i == -1) {
            return false;
        }
        int i2 = -1;
        while (true) {
            if (this.f1601x1[i].HashCode == iHashCodeT && this.f1593du.equalsT((TKey) this.f1598kk[i], tkey)) {
                break;
            }
            int i3 = this.f1601x1[i].Next;
            if (i3 == -1) {
                i2 = i;
                i = i3;
                break;
            }
            i2 = i;
            i = i3;
        }
        if (i == -1) {
            return false;
        }
        this.f1594dy--;
        if (i2 == -1) {
            this.f1597k4[length] = this.f1601x1[i].Next + 1;
        } else {
            Link[] linkArr = this.f1601x1;
            linkArr[i2].Next = linkArr[i].Next;
        }
        Link link = this.f1601x1[i];
        link.Next = this.f1599m9;
        this.f1599m9 = i;
        link.HashCode = 0;
        this.f1598kk[i] = null;
        this.f1600to[i] = null;
        this.f1596jd++;
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public void set_Item(TKey tkey, TValue tvalue) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        int iHashCodeT = this.f1593du.hashCodeT(tkey) | Integer.MIN_VALUE;
        int i = Integer.MAX_VALUE & iHashCodeT;
        int[] iArr = this.f1597k4;
        int length = i % iArr.length;
        int i2 = iArr[length] - 1;
        int i3 = -1;
        if (i2 != -1) {
            while (true) {
                if (this.f1601x1[i2].HashCode == iHashCodeT && this.f1593du.equalsT((TKey) this.f1598kk[i2], tkey)) {
                    break;
                }
                int i4 = this.f1601x1[i2].Next;
                if (i4 == -1) {
                    i3 = i2;
                    i2 = i4;
                    break;
                } else {
                    i3 = i2;
                    i2 = i4;
                }
            }
        }
        if (i2 == -1) {
            int i5 = this.f1594dy + 1;
            this.f1594dy = i5;
            if (i5 > this.f1591c5) {
                m809kk();
                length = i % this.f1597k4.length;
            }
            int i6 = this.f1599m9;
            if (i6 == -1) {
                i6 = this.f1595h4;
                this.f1595h4 = i6 + 1;
            } else {
                this.f1599m9 = this.f1601x1[i6].Next;
            }
            i2 = i6;
            Link link = this.f1601x1[i2];
            int[] iArr2 = this.f1597k4;
            link.Next = iArr2[length] - 1;
            iArr2[length] = i2 + 1;
            link.HashCode = iHashCodeT;
            this.f1598kk[i2] = tkey;
        } else if (i3 != -1) {
            Link[] linkArr = this.f1601x1;
            Link link2 = linkArr[i3];
            Link link3 = linkArr[i2];
            link2.Next = link3.Next;
            int[] iArr3 = this.f1597k4;
            link3.Next = iArr3[length] - 1;
            iArr3[length] = i2 + 1;
        }
        this.f1600to[i2] = tvalue;
        this.f1596jd++;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return this.f1594dy;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public boolean tryGetValue(TKey tkey, Object[] objArr) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        int iHashCodeT = this.f1593du.hashCodeT(tkey) | Integer.MIN_VALUE;
        int[] iArr = this.f1597k4;
        int i = iArr[(Integer.MAX_VALUE & iHashCodeT) % iArr.length] - 1;
        while (i != -1) {
            if (this.f1601x1[i].HashCode == iHashCodeT && this.f1593du.equalsT((TKey) this.f1598kk[i], tkey)) {
                objArr[0] = this.f1600to[i];
                return true;
            }
            i = this.f1601x1[i].Next;
        }
        return false;
    }

    public Dictionary(int i) {
        this.f1592ck = new Object();
        m800k4(i, (IGenericEqualityComparer) null);
    }

    /* JADX INFO: renamed from: kk */
    private void m809kk() {
        int iM54232k4 = C11245k4.m54232k4((this.f1597k4.length << 1) | 1);
        int[] iArr = new int[iM54232k4];
        Link[] linkArrM816x1 = m816x1(iM54232k4);
        int i = 0;
        while (true) {
            int[] iArr2 = this.f1597k4;
            if (i >= iArr2.length) {
                this.f1597k4 = iArr;
                this.f1601x1 = linkArrM816x1;
                this.f1598kk = Arrays.copyOf(this.f1598kk, iM54232k4);
                this.f1600to = Arrays.copyOf(this.f1600to, iM54232k4);
                this.f1591c5 = (int) (iM54232k4 * 0.9f);
                return;
            }
            int i2 = iArr2[i] - 1;
            while (i2 != -1) {
                Link link = linkArrM816x1[i2];
                int iHashCodeT = this.f1593du.hashCodeT((TKey) this.f1598kk[i2]) | Integer.MIN_VALUE;
                link.HashCode = iHashCodeT;
                linkArrM816x1[i2].Next = iArr[r5] - 1;
                iArr[(Integer.MAX_VALUE & iHashCodeT) % iM54232k4] = i2 + 1;
                i2 = this.f1601x1[i2].Next;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public Enumerator m817k4() {
        return new Enumerator(this);
    }

    @Deprecated
    /* JADX INFO: renamed from: x1 */
    public EnumeratorJava m818x1() {
        return new EnumeratorJava(this);
    }

    public Dictionary(int i, IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
        this.f1592ck = new Object();
        m800k4(i, iGenericEqualityComparer);
    }

    /* JADX INFO: renamed from: k4 */
    public static <TKey, TValue> KeyValuePair<TKey, TValue> m798k4(TKey tkey, TValue tvalue) {
        return new KeyValuePair<>(tkey, tvalue);
    }

    /* JADX INFO: renamed from: x1 */
    public static <TKey, TValue> TKey m813x1(TKey tkey, TValue tvalue) {
        return tkey;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public void addItem(TKey tkey, TValue tvalue) {
        if (tkey == null) {
            throw new ArgumentNullException("key");
        }
        int iHashCodeT = this.f1593du.hashCodeT(tkey) | Integer.MIN_VALUE;
        int i = Integer.MAX_VALUE & iHashCodeT;
        int[] iArr = this.f1597k4;
        int length = i % iArr.length;
        int i2 = iArr[length] - 1;
        while (i2 != -1) {
            if (this.f1601x1[i2].HashCode == iHashCodeT && this.f1593du.equalsT((TKey) this.f1598kk[i2], tkey)) {
                throw new ArgumentException("An element with the same key already exists in the dictionary.");
            }
            i2 = this.f1601x1[i2].Next;
        }
        int i3 = this.f1594dy + 1;
        this.f1594dy = i3;
        if (i3 > this.f1591c5) {
            m809kk();
            length = i % this.f1597k4.length;
        }
        int i4 = this.f1599m9;
        if (i4 == -1) {
            i4 = this.f1595h4;
            this.f1595h4 = i4 + 1;
        } else {
            this.f1599m9 = this.f1601x1[i4].Next;
        }
        Link link = this.f1601x1[i4];
        link.HashCode = iHashCodeT;
        int[] iArr2 = this.f1597k4;
        link.Next = iArr2[length] - 1;
        iArr2[length] = i4 + 1;
        this.f1598kk[i4] = tkey;
        this.f1600to[i4] = tvalue;
        this.f1596jd++;
    }

    public Dictionary(IGenericDictionary<TKey, TValue> iGenericDictionary) {
        this(iGenericDictionary, (IGenericEqualityComparer) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m799k4(int i) {
        this.f1597k4 = new int[i];
        this.f1601x1 = m816x1(i);
        this.f1599m9 = -1;
        this.f1598kk = new Object[i];
        this.f1600to = new Object[i];
        this.f1595h4 = 0;
        int[] iArr = this.f1597k4;
        int length = (int) (iArr.length * 0.9f);
        this.f1591c5 = length;
        if (length != 0 || iArr.length <= 0) {
            return;
        }
        this.f1591c5 = 1;
    }

    public Dictionary(IGenericDictionary<TKey, TValue> iGenericDictionary, IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
        this.f1592ck = new Object();
        if (iGenericDictionary == null) {
            throw new ArgumentNullException("dictionary");
        }
        m800k4(iGenericDictionary.size(), iGenericEqualityComparer);
        for (KeyValuePair<TKey, TValue> keyValuePair : iGenericDictionary) {
            addItem(keyValuePair.getKey(), keyValuePair.getValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m800k4(int i, IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("capacity");
        }
        if (iGenericEqualityComparer == null) {
            iGenericEqualityComparer = new EqualityComparer.DefaultComparer<>();
        }
        this.f1593du = iGenericEqualityComparer;
        if (i == 0) {
            i = 10;
        }
        m799k4(((int) (i / 0.9f)) + 1);
        this.f1596jd = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m815x1(TValue[] tvalueArr, int i) {
        for (int i2 = 0; i2 < this.f1595h4; i2++) {
            if ((this.f1601x1[i2].HashCode & Integer.MIN_VALUE) != 0) {
                tvalueArr[i] = this.f1600to[i2];
                i++;
            }
        }
    }

    public Dictionary(IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
        this.f1592ck = new Object();
        m800k4(10, iGenericEqualityComparer);
    }

    /* JADX INFO: renamed from: x1 */
    private Link[] m816x1(int i) {
        Link[] linkArr = new Link[i];
        for (int i2 = 0; i2 < i; i2++) {
            linkArr[i2] = new Link();
        }
        return linkArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m804k4(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (i > abstractC14092to.m67265du()) {
            throw new ArgumentException("index larger than largest valid index of array");
        }
        if (abstractC14092to.m67265du() - i < size()) {
            throw new ArgumentException("Destination array cannot hold the requested elements!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public <TRet> void m805k4(AbstractC14092to abstractC14092to, int i, Transform<TKey, TValue, TRet> transform) {
        try {
            Object[] objArr = (Object[]) AbstractC14092to.m67212k4(abstractC14092to);
            for (int i2 = 0; i2 < this.f1595h4; i2++) {
                if ((this.f1601x1[i2].HashCode & Integer.MIN_VALUE) != 0) {
                    int i3 = i + 1;
                    objArr[i] = transform.mo820x1(this.f1598kk[i2], this.f1600to[i2]);
                    i = i3;
                }
            }
        } catch (RuntimeException e) {
            throw new ArgumentException("Cannot copy source collection elements to destination array", "array", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m806k4(TKey[] tkeyArr, int i) {
        for (int i2 = 0; i2 < this.f1595h4; i2++) {
            if ((this.f1601x1[i2].HashCode & Integer.MIN_VALUE) != 0) {
                tkeyArr[i] = this.f1598kk[i2];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m807k4(KeyValuePair<TKey, TValue> keyValuePair) {
        Object[] objArr = {null};
        boolean zTryGetValue = tryGetValue(keyValuePair.getKey(), objArr);
        Object obj = objArr[0];
        if (zTryGetValue) {
            return new EqualityComparer.DefaultComparer().equalsT(keyValuePair.getValue(), obj);
        }
        return false;
    }
}
