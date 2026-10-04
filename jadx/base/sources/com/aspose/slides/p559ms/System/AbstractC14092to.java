package com.aspose.slides.p559ms.System;

import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.Collections.Comparer;
import com.aspose.slides.Collections.Generic.EqualityComparer;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArrayTypeMismatchException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.RankException;
import com.aspose.slides.exceptions.TypeLoadException;
import com.aspose.slides.internal.p088dn.AbstractC3198k4;
import com.aspose.slides.internal.p234ko.C5891k4;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.network.embedded.C18293o1;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.to */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14092to implements ICollection, IEnumerable, IList, InterfaceC14059g8 {

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$c5 */
    public interface c5 {
        /* JADX INFO: renamed from: k4 */
        void mo66578k4(int i, int i2);
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$du */
    public static final class du extends x1 {
        private du(Object obj, int i, boolean z) {
            super(obj, i, z);
        }

        /* JADX INFO: renamed from: h4 */
        private int[] m67282h4(int i) {
            to toVarMo67280x1 = mo67280x1();
            int[] iArr = new int[toVarMo67280x1.f47329k4];
            for (int i2 = toVarMo67280x1.f47329k4 - 1; i2 >= 0; i2--) {
                int iM67266du = m67266du(i2);
                iArr[i2] = i % iM67266du;
                i /= iM67266du;
            }
            return iArr;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public k4 mo67269k4(int i, int i2) {
            return new h4(this, i, i2);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: x1 */
        public void mo67281x1(Object obj, int i) {
            mo67273k4(obj, m67282h4(i));
        }

        public /* synthetic */ du(Object obj, int i, boolean z, C14053du c14053du) {
            this(obj, i, z);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public Object mo67271k4(int i) {
            return mo67272k4(m67282h4(i));
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public Object mo67272k4(int... iArr) {
            if (mo67280x1().f47329k4 != iArr.length) {
                throw new ArgumentException("Indices length does not match the array rank.");
            }
            Object objMo67270k4 = mo67270k4();
            int i = 0;
            while (i < iArr.length) {
                objMo67270k4 = AbstractC14092to.m67256x1(i == iArr.length + (-1) ? mo67274kk() : AbstractC3198k4.m13771k4(), objMo67270k4, iArr[i]);
                i++;
            }
            return objMo67270k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$dy */
    public static class dy implements k4 {

        /* JADX INFO: renamed from: du */
        private boolean f47314du;

        /* JADX INFO: renamed from: k4 */
        private final AbstractC14092to f47315k4;

        /* JADX INFO: renamed from: kk */
        private int f47316kk;

        /* JADX INFO: renamed from: to */
        private int f47317to;

        /* JADX INFO: renamed from: x1 */
        private int f47318x1;

        private dy(dy dyVar) {
            this.f47315k4 = dyVar.f47315k4;
            this.f47318x1 = dyVar.f47318x1;
            this.f47316kk = dyVar.f47316kk;
            this.f47317to = dyVar.f47317to;
            this.f47314du = dyVar.f47314du;
        }

        /* JADX INFO: renamed from: kk */
        private void m67283kk() {
            int i = this.f47316kk + 1;
            this.f47316kk = i;
            this.f47314du = i > this.f47317to;
        }

        /* JADX INFO: renamed from: x1 */
        private void m67284x1() {
            if (this.f47316kk < this.f47318x1) {
                throw new InvalidOperationException("Enumeration has not started.");
            }
            if (this.f47314du) {
                throw new InvalidOperationException("Enumeration has already ended");
            }
        }

        public Object clone() throws CloneNotSupportedException {
            return new dy(this);
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            return m67285k4();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f47314du) {
                return false;
            }
            m67283kk();
            return !this.f47314du;
        }

        /* JADX INFO: renamed from: k4 */
        public Object m67285k4() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            m67284x1();
            return this.f47315k4.mo67271k4(this.f47316kk);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException("Collection was of a fixed size.");
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            int i = this.f47318x1;
            this.f47316kk = i - 1;
            this.f47314du = i > this.f47317to;
        }

        public dy(AbstractC14092to abstractC14092to, int i, int i2) {
            this.f47315k4 = abstractC14092to;
            this.f47318x1 = i;
            this.f47317to = (i + i2) - 1;
            reset();
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to.k4
        /* JADX INFO: renamed from: k4 */
        public void mo67286k4(Object obj) {
            m67284x1();
            this.f47315k4.mo67281x1(obj, this.f47316kk);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$h4 */
    public static class h4 implements IEnumerator, k4, Cloneable {

        /* JADX INFO: renamed from: du */
        private boolean f47319du;

        /* JADX INFO: renamed from: h4 */
        private int[] f47320h4;

        /* JADX INFO: renamed from: k4 */
        private final AbstractC14092to f47321k4;

        /* JADX INFO: renamed from: kk */
        private int f47322kk;

        /* JADX INFO: renamed from: to */
        private int f47323to;

        /* JADX INFO: renamed from: x1 */
        private int f47324x1;

        private h4(h4 h4Var) {
            this.f47321k4 = h4Var.f47321k4;
            this.f47324x1 = h4Var.f47324x1;
            this.f47322kk = h4Var.f47322kk;
            this.f47323to = h4Var.f47323to;
            this.f47319du = h4Var.f47319du;
            this.f47320h4 = (int[]) h4Var.f47320h4.clone();
        }

        /* JADX INFO: renamed from: kk */
        private void m67287kk() {
            int i = this.f47322kk + 1;
            this.f47322kk = i;
            if (i > this.f47324x1) {
                this.f47319du = true;
                return;
            }
            int iM67277to = this.f47321k4.m67277to();
            int[] iArr = this.f47320h4;
            int i2 = iM67277to - 1;
            iArr[i2] = iArr[i2] + 1;
            while (i2 >= 0) {
                if (this.f47320h4[i2] > this.f47321k4.m67278to(i2)) {
                    if (i2 == 0) {
                        this.f47319du = true;
                        this.f47320h4[0] = this.f47321k4.m67279x1(0);
                        return;
                    }
                    for (int i3 = i2; i3 < iM67277to; i3++) {
                        this.f47320h4[i3] = this.f47321k4.m67279x1(i3);
                    }
                    int[] iArr2 = this.f47320h4;
                    int i4 = i2 - 1;
                    iArr2[i4] = iArr2[i4] + 1;
                }
                i2--;
            }
        }

        /* JADX INFO: renamed from: x1 */
        private void m67288x1() {
            if (this.f47322kk < this.f47323to) {
                throw new InvalidOperationException("Enumeration has not started");
            }
            if (this.f47319du) {
                throw new InvalidOperationException("Enumeration has already ended");
            }
        }

        public Object clone() throws CloneNotSupportedException {
            return new h4(this);
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            return m67289k4();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f47319du) {
                return false;
            }
            m67287kk();
            return !this.f47319du;
        }

        /* JADX INFO: renamed from: k4 */
        public Object m67289k4() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            m67288x1();
            return this.f47321k4.mo67272k4(this.f47320h4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException("Collection was of a fixed size.");
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            int i = this.f47323to;
            this.f47322kk = i - 1;
            int[] iArr = {i};
            boolean z = true;
            int i2 = 1;
            for (int i3 = 0; i3 < this.f47321k4.m67277to(); i3++) {
                int iM67266du = this.f47321k4.m67266du(i3);
                this.f47320h4[i3] = C14116yg.m67484k4(iArr[0], iM67266du, iArr);
                i2 *= iM67266du;
            }
            int iM67266du2 = this.f47321k4.m67266du(this.f47320h4.length - 1);
            int[] iArr2 = this.f47320h4;
            iArr2[iArr2.length - 1] = iArr[0] - 1;
            if (i2 * iM67266du2 != 0 && this.f47323to <= this.f47324x1) {
                z = false;
            }
            this.f47319du = z;
        }

        public h4(AbstractC14092to abstractC14092to, int i, int i2) {
            this.f47321k4 = abstractC14092to;
            this.f47323to = i;
            this.f47324x1 = (i + i2) - 1;
            this.f47320h4 = new int[abstractC14092to.m67277to()];
            reset();
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to.k4
        /* JADX INFO: renamed from: k4 */
        public void mo67286k4(Object obj) {
            m67288x1();
            this.f47321k4.mo67273k4(obj, this.f47320h4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$k4 */
    public interface k4 extends IEnumerator, InterfaceC14059g8, Cloneable {
        /* JADX INFO: renamed from: k4 */
        void mo67286k4(Object obj);
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$kk */
    public static class kk<T> implements IGenericList<T> {

        /* JADX INFO: renamed from: k4 */
        private AbstractC14092to f47325k4;

        /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$kk$k4 */
        public class k4<T> implements IGenericEnumerator<T> {

            /* JADX INFO: renamed from: k4 */
            IEnumerator f47326k4;

            private k4() {
                this.f47326k4 = kk.this.f47325k4.iterator();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public void dispose() {
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return this.f47326k4.hasNext();
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public T next() {
                return (T) this.f47326k4.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f47326k4.remove();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f47326k4.reset();
            }

            public /* synthetic */ k4(kk kkVar, C14053du c14053du) {
                this();
            }
        }

        private kk(AbstractC14092to abstractC14092to) {
            this.f47325k4 = abstractC14092to;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void addItem(T t) {
            throw new NotSupportedException("Collection is of a fixed size");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void clear() {
            throw new NotSupportedException("Collection is read-only");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean containsItem(T t) {
            return this.f47325k4.contains(t);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public void copyToTArray(T[] tArr, int i) {
            this.f47325k4.copyTo(AbstractC14092to.m67208k4((Object) tArr), i);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public T get_Item(int i) {
            return (T) this.f47325k4.get_Item(i);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public int indexOfItem(T t) {
            return this.f47325k4.indexOf(t);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public void insertItem(int i, T t) {
            throw new NotSupportedException("Collection is of a fixed size");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean isReadOnly() {
            return true;
        }

        @Override // java.lang.Iterable
        public IGenericEnumerator<T> iterator() {
            return new k4(this, null);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public void removeAt(int i) {
            throw new NotSupportedException("Collection is of a fixed size");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public boolean removeItem(T t) {
            throw new NotSupportedException("Collection is of a fixed size");
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericList
        public void set_Item(int i, T t) {
            this.f47325k4.set_Item(i, t);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericCollection
        public int size() {
            return this.f47325k4.m67265du();
        }

        public /* synthetic */ kk(AbstractC14092to abstractC14092to, C14053du c14053du) {
            this(abstractC14092to);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$m9 */
    public static final class m9 extends x1 {
        private m9(Object obj, boolean z) {
            super(obj, 1, z);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public k4 mo67269k4(int i, int i2) {
            return new dy(this, i, i2);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: x1 */
        public void mo67281x1(Object obj, int i) {
            mo67273k4(obj, i);
        }

        public /* synthetic */ m9(Object obj, boolean z, C14053du c14053du) {
            this(obj, z);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public Object mo67271k4(int i) {
            return mo67272k4(i);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public Object mo67272k4(int... iArr) {
            return AbstractC14092to.m67256x1(mo67274kk(), mo67270k4(), iArr[0]);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public void mo67273k4(Object obj, int... iArr) {
            int i = iArr[0];
            Class cls = mo67280x1().f47332x1;
            if (obj == null && cls.isPrimitive()) {
                obj = C7019kk.m27467x1(cls);
            }
            if (obj != null && !C5891k4.m23726k4(obj.getClass(), (Class<?>) cls) && (cls.isPrimitive() || C5891k4.m23732x1(cls) != null)) {
                throw new ArgumentException("Cannot widen from source type to target type either because the source type is a not a primitive type or the conversion cannot be accomplished");
            }
            try {
                AbstractC14092to.m67258x1(mo67274kk(), mo67270k4(), i, obj);
            } catch (ArgumentOutOfRangeException e) {
                throw e;
            } catch (Exception unused) {
                throw new InvalidCastException("Cannot save value in this array");
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$to */
    public static final class to {

        /* JADX INFO: renamed from: du */
        private final long f47328du;

        /* JADX INFO: renamed from: k4 */
        private final int f47329k4;

        /* JADX INFO: renamed from: kk */
        private final int[] f47330kk;

        /* JADX INFO: renamed from: to */
        private final boolean f47331to;

        /* JADX INFO: renamed from: x1 */
        private final Class<?> f47332x1;

        private to(Object obj, int i, boolean z) {
            Class<?> componentType = obj.getClass().getComponentType();
            Class<?> cls = null;
            int i2 = 0;
            while (true) {
                if (componentType == null) {
                    componentType = cls;
                    break;
                }
                i2++;
                Class<?> componentType2 = componentType.getComponentType();
                if (z && i2 == i) {
                    break;
                }
                cls = componentType;
                componentType = componentType2;
            }
            if (i2 == 0) {
                throw new ArgumentException("Array required");
            }
            if (i > i2) {
                throw new ArgumentException("Required arrays dimension doesn't match to actual", "rank");
            }
            this.f47329k4 = i;
            this.f47332x1 = componentType;
            this.f47330kk = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                this.f47330kk[i3] = -1;
            }
            this.f47331to = z;
            AbstractC3198k4 abstractC3198k4M13771k4 = AbstractC3198k4.m13771k4();
            AbstractC3198k4 abstractC3198k4M13772k4 = AbstractC3198k4.m13772k4((Class) this.f47332x1);
            int i4 = 0;
            int i5 = 1;
            while (true) {
                if (obj == null && !z) {
                    throw new ArgumentException("Jagged array not expected", "array");
                }
                boolean z2 = i4 < i + (-1);
                int iMo13773k4 = z2 ? abstractC3198k4M13771k4.mo13773k4(obj) : abstractC3198k4M13772k4.mo13773k4(obj);
                i5 *= iMo13773k4;
                if (i5 == 0) {
                    break;
                }
                this.f47330kk[i4] = iMo13773k4 - 1;
                if (!z2) {
                    break;
                }
                obj = AbstractC14092to.m67256x1(abstractC3198k4M13771k4, obj, 0);
                i4++;
            }
            this.f47328du = i5;
        }

        public /* synthetic */ to(Object obj, int i, boolean z, C14053du c14053du) {
            this(obj, i, z);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.to$x1 */
    public static abstract class x1 extends AbstractC14092to {

        /* JADX INFO: renamed from: k4 */
        private final Object f47333k4;

        /* JADX INFO: renamed from: kk */
        private final AbstractC3198k4 f47334kk;

        /* JADX INFO: renamed from: x1 */
        private final to f47335x1;

        public x1(Object obj, int i, boolean z) {
            this(obj, new to(obj, i, z, null));
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: k4 */
        public Object mo67270k4() {
            return this.f47333k4;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: kk */
        public AbstractC3198k4 mo67274kk() {
            return this.f47334kk;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14092to
        /* JADX INFO: renamed from: x1 */
        public to mo67280x1() {
            return this.f47335x1;
        }

        public x1(Object obj, to toVar) {
            super(null);
            this.f47333k4 = obj;
            this.f47335x1 = toVar;
            this.f47334kk = AbstractC3198k4.m13772k4(toVar.f47332x1);
        }
    }

    private AbstractC14092to() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <T> int m67194k4(AbstractC14092to abstractC14092to, int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0 || i > abstractC14092to.size()) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || i > abstractC14092to.size() - i2) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "index and count exceed length of list");
        }
        if (abstractC14041ai == 0) {
            throw new ArgumentNullException("match");
        }
        int i3 = i2 + i;
        while (i < i3) {
            if (abstractC14041ai.invoke(abstractC14092to.get_Item(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    public static c5 m67243kk(AbstractC14092to abstractC14092to) {
        return m67212k4(abstractC14092to) instanceof Object[] ? new C14053du(abstractC14092to) : new C14063h4(abstractC14092to);
    }

    /* JADX INFO: renamed from: m9 */
    private void m67246m9() {
        Class cls = mo67280x1().f47332x1;
        if (cls.isPrimitive()) {
            return;
        }
        k4 k4VarMo67269k4 = mo67269k4(0, m67265du());
        Object objM27467x1 = C7019kk.m27467x1(cls);
        if (objM27467x1 != null) {
            if (C5891k4.m23732x1(cls) != null) {
                while (k4VarMo67269k4.hasNext()) {
                    k4VarMo67269k4.mo67286k4(objM27467x1);
                }
            } else {
                if (k4VarMo67269k4.hasNext()) {
                    k4VarMo67269k4.mo67286k4(objM27467x1);
                }
                while (k4VarMo67269k4.hasNext()) {
                    k4VarMo67269k4.mo67286k4(C7019kk.m27467x1(cls));
                }
            }
        }
    }

    @Override // com.aspose.slides.Collections.IList
    public int addItem(Object obj) {
        throw new NotSupportedException("Collection was of a fixed size.");
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public void clear() {
        m67215k4(this, m67279x1(0), m67265du());
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        int iM67265du = m67265du();
        for (int i = 0; i < iM67265du; i++) {
            if (C14067j2.m66728k4(mo67271k4(i), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (m67266du(0) + i > abstractC14092to.m67266du(0) + abstractC14092to.m67279x1(0)) {
            throw new ArgumentException(C14113y2.m67408k4("Destination array was not long ", "enough. Check destIndex and length, and the array's ", "lower bounds."));
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "Non-negative number required.");
        }
        m67216k4(this, m67279x1(0), abstractC14092to, i, m67266du(0));
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        if (m67277to() > 1) {
            throw new NotImplementedException();
        }
        to toVarMo67280x1 = mo67280x1();
        AbstractC14092to abstractC14092toM67205k4 = m67205k4(C7019kk.m27443k4((Class<?>) toVarMo67280x1.f47332x1), (int) toVarMo67280x1.f47328du);
        copyTo(abstractC14092toM67205k4, 0);
        return abstractC14092toM67205k4;
    }

    /* JADX INFO: renamed from: du */
    public int m67265du() {
        return (int) mo67280x1().f47328du;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m67268h4(obj instanceof AbstractC14092to ? (AbstractC14092to) obj : m67208k4(obj));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return mo67270k4();
    }

    @Override // com.aspose.slides.Collections.IList
    public Object get_Item(int i) {
        if (i >= m67265du() || i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (m67277to() <= 1) {
            return mo67271k4(i);
        }
        throw new ArgumentException("Only single dimension arrays are supported.");
    }

    /* JADX INFO: renamed from: h4 */
    public long m67267h4() {
        return mo67280x1().f47328du;
    }

    public int hashCode() {
        return mo67270k4().hashCode();
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List
    public int indexOf(Object obj) {
        if (m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        int iM67265du = m67265du();
        for (int i = 0; i < iM67265du; i++) {
            if (C14067j2.m66728k4(mo67271k4(i), obj)) {
                return m67279x1(0) + i;
            }
        }
        return m67279x1(0) - 1;
    }

    @Override // com.aspose.slides.Collections.IList
    public void insertItem(int i, Object obj) {
        throw new NotSupportedException("Collection was of a fixed size.");
    }

    @Override // com.aspose.slides.Collections.IList
    public boolean isFixedSize() {
        return true;
    }

    @Override // com.aspose.slides.Collections.IList
    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return mo67269k4(0, m67265du());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract k4 mo67269k4(int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo67270k4();

    /* JADX INFO: renamed from: kk */
    public abstract AbstractC3198k4 mo67274kk();

    @Override // com.aspose.slides.Collections.IList
    public void removeAt(int i) {
        throw new NotSupportedException("Collection was of a fixed size.");
    }

    @Override // com.aspose.slides.Collections.IList
    public void removeItem(Object obj) {
        throw new NotSupportedException("Collection was of a fixed size.");
    }

    @Override // com.aspose.slides.Collections.IList
    public void set_Item(int i, Object obj) {
        if (i >= m67265du() || i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (m67277to() > 1) {
            throw new ArgumentException("Only single dimension arrays are supported.");
        }
        mo67281x1(obj, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return m67265du();
    }

    /* JADX INFO: renamed from: to */
    public int m67277to() {
        return mo67280x1().f47329k4;
    }

    /* JADX INFO: renamed from: x1 */
    public int m67279x1(int i) {
        if (i < 0) {
            throw new IndexOutOfRangeException("dimension is less than zero");
        }
        if (i < m67277to()) {
            return 0;
        }
        throw new IndexOutOfRangeException("dimension is equal to or greater than Rank");
    }

    /* JADX INFO: renamed from: x1 */
    public abstract to mo67280x1();

    public /* synthetic */ AbstractC14092to(C14053du c14053du) {
        this();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67195k4(AbstractC14092to abstractC14092to, int i, int i2, Object obj, Comparator comparator) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (i < abstractC14092to.m67279x1(0)) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than the lower bound of array.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i > (abstractC14092to.m67266du(0) + abstractC14092to.m67279x1(0)) - i2) {
            throw new ArgumentException("index and length do not specify a valid range in array.");
        }
        if (abstractC14092to.m67265du() == 0) {
            return -1;
        }
        if (comparator != null || obj == null || (obj instanceof Comparable)) {
            return m67250x1(abstractC14092to, i, i2, obj, comparator);
        }
        throw new ArgumentException("comparer is null and value does not support IComparable.");
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67250x1(AbstractC14092to abstractC14092to, int i, int i2, Object obj, Comparator comparator) {
        if (comparator == null) {
            comparator = Comparer.Default;
        }
        int i3 = (i2 + i) - 1;
        while (i <= i3) {
            int iOooO00o = C21034OooOOOo.OooO00o(i3, i, 2, i);
            try {
                int iCompare = comparator.compare(abstractC14092to.mo67271k4(iOooO00o), obj);
                if (iCompare == 0) {
                    return iOooO00o;
                }
                if (iCompare > 0) {
                    i3 = iOooO00o - 1;
                } else {
                    i = iOooO00o + 1;
                }
            } catch (Exception e) {
                throw new ArgumentException("value is not of the same type", e);
            }
        }
        return ~i;
    }

    /* JADX INFO: renamed from: du */
    public int m67266du(int i) {
        if (i < 0) {
            throw new IndexOutOfRangeException("dimension is less than zero");
        }
        if (i < m67277to()) {
            return mo67280x1().f47330kk[i] + 1;
        }
        throw new IndexOutOfRangeException("dimension is equal to or greater than Rank");
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m67268h4(AbstractC14092to abstractC14092to) {
        return C14067j2.m66728k4(mo67270k4(), abstractC14092to.mo67270k4());
    }

    /* JADX INFO: renamed from: kk */
    public Object m67275kk(int i) {
        if (m67277to() != 1) {
            throw new ArgumentException("Array was not a one-dimensional array.");
        }
        if (i < m67279x1(0) || i > m67278to(0)) {
            throw new IndexOutOfRangeException("index is outside the range of valid indexes for the current Array");
        }
        return mo67271k4(i);
    }

    /* JADX INFO: renamed from: to */
    public int m67278to(int i) {
        if (i < 0) {
            throw new IndexOutOfRangeException("dimension is less than zero");
        }
        if (i < m67277to()) {
            return mo67280x1().f47330kk[i];
        }
        throw new IndexOutOfRangeException("dimension is equal to or greater than Rank");
    }

    /* JADX INFO: renamed from: du */
    public static void m67193du(AbstractC14092to abstractC14092to) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        m67221k4(abstractC14092to, (AbstractC14092to) null, abstractC14092to.m67279x1(0), abstractC14092to.m67265du(), (Comparator) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67196k4(AbstractC14092to abstractC14092to, Object obj) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (obj == null) {
            return -1;
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (abstractC14092to.m67265du() == 0) {
            return -1;
        }
        if (obj instanceof Comparable) {
            return m67250x1(abstractC14092to, abstractC14092to.m67279x1(0), abstractC14092to.m67266du(0), obj, (Comparator) null);
        }
        throw new InvalidOperationException("Failed to compare two elements in the array.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public void m67244kk(int i, int i2) {
        Object objMo67271k4 = mo67271k4(i);
        mo67281x1(m67275kk(i2), i);
        mo67281x1(objMo67271k4, i2);
    }

    /* JADX INFO: renamed from: to */
    private static int m67247to(int i, int i2) {
        return i + ((i2 - i) >> 1);
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> int m67251x1(AbstractC14092to abstractC14092to, AbstractC14041ai<T> abstractC14041ai) {
        return m67194k4(abstractC14092to, 0, abstractC14092to.size(), abstractC14041ai);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67197k4(AbstractC14092to abstractC14092to, Object obj, int i, int i2) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (i2 < 0 || i < abstractC14092to.m67279x1(0) || i - 1 > abstractC14092to.m67278to(0) - i2) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? C18293o1.f55803f : "startIndex", i2 < 0 ? "Count must be positive and count must refer to a location within the string/array/collection." : "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        int i3 = i2 + i;
        while (i < i3) {
            if (C14067j2.m66728k4(abstractC14092to.mo67271k4(i), obj)) {
                return i;
            }
            i++;
        }
        return abstractC14092to.m67279x1(0) - 1;
    }

    /* JADX INFO: renamed from: to */
    public static void m67248to(AbstractC14092to abstractC14092to) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        m67259x1(abstractC14092to, abstractC14092to.m67279x1(0), abstractC14092to.m67266du(0));
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67252x1(AbstractC14092to abstractC14092to, Object obj) {
        if (abstractC14092to != null) {
            return m67197k4(abstractC14092to, obj, 0, abstractC14092to.m67265du());
        }
        throw new ArgumentNullException("array");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67198k4(AbstractC14092to abstractC14092to, Object obj, Comparator comparator) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (abstractC14092to.m67265du() == 0) {
            return -1;
        }
        if (comparator != null || obj == null || (obj instanceof Comparable)) {
            return m67250x1(abstractC14092to, abstractC14092to.m67279x1(0), abstractC14092to.m67266du(0), obj, comparator);
        }
        throw new ArgumentException("comparer is null and value does not support IComparable.");
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> int m67253x1(T[] tArr, AbstractC14041ai<T> abstractC14041ai) {
        return m67199k4(tArr, 0, tArr.length, abstractC14041ai);
    }

    /* JADX INFO: renamed from: kk */
    public void m67276kk(Object obj, int i) {
        if (m67277to() != 1) {
            throw new ArgumentException("Array was not a one-dimensional array.");
        }
        if (i < m67279x1(0) || i > m67278to(0)) {
            throw new IndexOutOfRangeException("index is outside the range of valid indexes for the current Array");
        }
        mo67281x1(obj, i - m67279x1(0));
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> int m67199k4(T[] tArr, int i, int i2, AbstractC14041ai<T> abstractC14041ai) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0 || i > tArr.length) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || i > tArr.length - i2) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "index and count exceed length of list");
        }
        if (abstractC14041ai == null) {
            throw new ArgumentNullException("match");
        }
        int i3 = i2 + i;
        while (i < i3) {
            if (abstractC14041ai.invoke(tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> IGenericList<T> m67254x1(AbstractC14092to abstractC14092to) {
        return new kk(abstractC14092to, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> int m67200k4(T[] tArr, int i, int i2, T t, Comparator<T> comparator) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i > m67208k4((Object) tArr).m67265du() - i2) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (comparator == null) {
            comparator = com.aspose.slides.Collections.Generic.Comparer.getDefault();
        }
        int i3 = (i2 + i) - 1;
        while (i <= i3) {
            try {
                int i4 = ((i3 - i) / 2) + i;
                int iCompare = comparator.compare(t, tArr[i4]);
                if (iCompare == 0) {
                    return i4;
                }
                if (iCompare < 0) {
                    i3 = i4 - 1;
                } else {
                    i = i4 + 1;
                }
            } catch (Exception e) {
                throw new InvalidOperationException("Comparer threw an exception.", e);
            }
        }
        return ~i;
    }

    /* JADX INFO: renamed from: x1 */
    private static x1 m67255x1(Object obj, int i, boolean z) {
        C14053du c14053du = null;
        if (obj == null) {
            return null;
        }
        if (i >= 1) {
            return i != 1 ? new du(obj, i, z, c14053du) : new m9(obj, z, c14053du);
        }
        throw new ArgumentException("Incorrect dimension of array", "rank");
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> int m67201k4(T[] tArr, T t) {
        if (tArr != null) {
            return m67202k4(tArr, t, 0, tArr.length);
        }
        throw new ArgumentNullException("array");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static Object m67256x1(AbstractC3198k4 abstractC3198k4, Object obj, int i) {
        try {
            return abstractC3198k4.mo13774k4(obj, i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfRangeException("index is outside the range of valid indexes for the current Array", e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> int m67202k4(T[] tArr, T t, int i, int i2) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0 || i < 0 || i > tArr.length - i2) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? C18293o1.f55803f : "startIndex", i2 < 0 ? "Count must be positive and count must refer to a location within the string/array/collection." : "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        int i3 = i2 + i;
        EqualityComparer.DefaultComparer defaultComparer = new EqualityComparer.DefaultComparer();
        while (i < i3) {
            if (defaultComparer.equalsT(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m67257x1(int i, int i2) {
        Object objM67212k4 = m67212k4(this);
        Object[] objArr = objM67212k4 instanceof Object[] ? (Object[]) objM67212k4 : null;
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> int m67203k4(T[] tArr, T t, Comparator<T> comparator) {
        if (tArr != null) {
            return m67200k4(tArr, 0, m67208k4((Object) tArr).m67265du(), t, comparator);
        }
        throw new ArgumentNullException("array");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static void m67258x1(AbstractC3198k4 abstractC3198k4, Object obj, int i, Object obj2) {
        try {
            abstractC3198k4.mo13775k4(obj, i, obj2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArgumentOutOfRangeException("index is outside the range of valid indexes for the current Array", e);
        } catch (ArrayStoreException e2) {
            throw new InvalidCastException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> IGenericList<T> m67204k4(T[] tArr) {
        AbstractC14092to abstractC14092toM67208k4 = m67208k4((Object) tArr);
        if (abstractC14092toM67208k4 == null) {
            return null;
        }
        return m67254x1(abstractC14092toM67208k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m67259x1(AbstractC14092to abstractC14092to, int i, int i2) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (i < abstractC14092to.m67279x1(0) || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? FirebaseAnalytics.Param.INDEX : "length", "Non-negative number required.");
        }
        if (i > (abstractC14092to.m67278to(0) + 1) - i2) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        int i3 = (i2 + i) - 1;
        Object objM67212k4 = m67212k4(abstractC14092to);
        Object[] objArr = objM67212k4 instanceof Object[] ? (Object[]) objM67212k4 : null;
        if (objArr == null) {
            c5 c5VarM67243kk = m67243kk(abstractC14092to);
            while (i < i3) {
                c5VarM67243kk.mo66578k4(i, i3);
                i++;
                i3--;
            }
            return;
        }
        while (i < i3) {
            Object obj = objArr[i];
            objArr[i] = objArr[i3];
            objArr[i3] = obj;
            i++;
            i3--;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14092to m67205k4(AbstractC14068j5 abstractC14068j5, int i) {
        return m67206k4(abstractC14068j5, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private static <T> void m67260x1(AbstractC14092to abstractC14092to, AbstractC14092to abstractC14092to2, Comparator comparator, int i, int i2) {
        do {
            int iM67247to = m67247to(i, i2);
            m67224k4(abstractC14092to, abstractC14092to2, comparator, i, iM67247to);
            m67224k4(abstractC14092to, abstractC14092to2, comparator, i, i2);
            m67224k4(abstractC14092to, abstractC14092to2, comparator, iM67247to, i2);
            Object objM67275kk = abstractC14092to.m67275kk(iM67247to);
            int i3 = i;
            int i4 = i2;
            while (true) {
                try {
                    if (comparator.compare(abstractC14092to.m67275kk(i3), objM67275kk) >= 0) {
                        while (comparator.compare(objM67275kk, abstractC14092to.m67275kk(i4)) < 0) {
                            i4--;
                        }
                        if (i3 > i4) {
                            break;
                        }
                        if (i3 < i4) {
                            Object objM67275kk2 = abstractC14092to.m67275kk(i3);
                            abstractC14092to.m67276kk(abstractC14092to.m67275kk(i4), i3);
                            abstractC14092to.m67276kk(objM67275kk2, i4);
                            if (abstractC14092to2 != null) {
                                Object objM67275kk3 = abstractC14092to2.m67275kk(i3);
                                abstractC14092to2.m67276kk(abstractC14092to2.m67275kk(i4), i3);
                                abstractC14092to2.m67276kk(objM67275kk3, i4);
                            }
                        }
                        if (i3 != Integer.MAX_VALUE) {
                            i3++;
                        }
                        if (i4 != Integer.MIN_VALUE) {
                            i4--;
                        }
                        if (i3 > i4) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                } catch (IndexOutOfRangeException e) {
                    throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", e);
                } catch (Exception e2) {
                    throw new InvalidOperationException("Unexpected exception during the sorting operation", e2);
                }
            }
            if (i4 - i <= i2 - i3) {
                if (i < i4) {
                    m67260x1(abstractC14092to, abstractC14092to2, comparator, i, i4);
                }
                i = i3;
            } else {
                if (i3 < i2) {
                    m67260x1(abstractC14092to, abstractC14092to2, comparator, i3, i2);
                }
                i2 = i4;
            }
        } while (i < i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14092to m67206k4(AbstractC14068j5 abstractC14068j5, int... iArr) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("elementType");
        }
        if (iArr == null) {
            throw new ArgumentNullException("lengths");
        }
        if (iArr.length > 32) {
            throw new TypeLoadException("Array has too many dimensions.");
        }
        if (abstractC14068j5.m66751kk(C7019kk.m27443k4((Class<?>) Void.TYPE))) {
            throw new NotSupportedException("Array type can not be void");
        }
        return m67207k4(abstractC14068j5, iArr, (int[]) null);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo67281x1(Object obj, int i) {
        throw new InvalidOperationException("Array was not a one-dimensional array.");
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC14092to m67207k4(AbstractC14068j5 abstractC14068j5, int[] iArr, int[] iArr2) {
        if (iArr2 != null) {
            throw new NotImplementedException("Not implemented yet");
        }
        if (iArr == null) {
            throw new ArgumentNullException("lengths");
        }
        if (iArr.length < 1) {
            throw new ArgumentException("Arrays must contain >= 1 elements.");
        }
        if (iArr.length > 32) {
            throw new TypeLoadException("Array has too many dimensions.");
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 0) {
                throw new ArgumentOutOfRangeException("lengths[" + i + ']', "Non-negative number required.");
            }
        }
        Class clsMo48624ks = abstractC14068j5.mo48624ks();
        int i2 = 0;
        for (Class<?> componentType = clsMo48624ks.getComponentType(); componentType != null; componentType = componentType.getComponentType()) {
            i2++;
        }
        AbstractC14092to abstractC14092toM67210k4 = m67210k4(iArr.length > 1 ? Array.newInstance((Class<?>) clsMo48624ks, iArr) : Array.newInstance((Class<?>) clsMo48624ks, iArr[0]), iArr.length, i2 > 0);
        abstractC14092toM67210k4.m67246m9();
        return abstractC14092toM67210k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> void m67261x1(T[] tArr, int i, int i2) {
        m67233k4(tArr, i, i2, (Comparator) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14092to m67208k4(Object obj) {
        return m67255x1(obj, 1, false);
    }

    /* JADX INFO: renamed from: x1 */
    private static <TKey, TValue> void m67262x1(TKey[] tkeyArr, TValue[] tvalueArr, int i, int i2, Comparator<TKey> comparator) {
        TKey tkey = tkeyArr[(i + i2) / 2];
        int i3 = i;
        int i4 = i2;
        while (true) {
            if (comparator.compare(tkeyArr[i3], tkey) < 0) {
                i3++;
            } else {
                while (comparator.compare(tkeyArr[i4], tkey) > 0) {
                    i4--;
                }
                if (i3 <= i4) {
                    TKey tkey2 = tkeyArr[i3];
                    tkeyArr[i3] = tkeyArr[i4];
                    tkeyArr[i4] = tkey2;
                    if (tvalueArr != null) {
                        TValue tvalue = tvalueArr[i3];
                        tvalueArr[i3] = tvalueArr[i4];
                        tvalueArr[i4] = tvalue;
                    }
                    i3++;
                    i4--;
                }
                if (i3 >= i4) {
                    break;
                }
            }
        }
        if (i < i4) {
            m67262x1(tkeyArr, tvalueArr, i, i4, comparator);
        }
        if (i3 < i2) {
            m67262x1(tkeyArr, tvalueArr, i3, i2, comparator);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14092to m67209k4(Object obj, int i) {
        return m67255x1(obj, i, false);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m67263x1(Object[] objArr, Object[] objArr2, Comparator comparator, int i, int i2) {
        do {
            int iM67247to = m67247to(i, i2);
            m67238k4(objArr, objArr2, comparator, i, iM67247to);
            m67238k4(objArr, objArr2, comparator, i, i2);
            m67238k4(objArr, objArr2, comparator, iM67247to, i2);
            Object obj = objArr[iM67247to];
            int i3 = i;
            int i4 = i2;
            while (true) {
                try {
                    if (comparator.compare(objArr[i3], obj) >= 0) {
                        while (comparator.compare(obj, objArr[i4]) < 0) {
                            i4--;
                        }
                        if (i3 > i4) {
                            break;
                        }
                        if (i3 < i4) {
                            Object obj2 = objArr[i3];
                            objArr[i3] = objArr[i4];
                            objArr[i4] = obj2;
                            if (objArr2 != null) {
                                Object obj3 = objArr2[i3];
                                objArr2[i3] = objArr2[i4];
                                objArr2[i4] = obj3;
                            }
                        }
                        i3++;
                        i4--;
                        if (i3 > i4) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                } catch (IndexOutOfRangeException e) {
                    throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", e);
                } catch (Exception e2) {
                    throw new InvalidOperationException("Unexpected exception during the sorting operation", e2);
                }
            }
            if (i4 - i <= i2 - i3) {
                if (i < i4) {
                    m67263x1(objArr, objArr2, comparator, i, i4);
                }
                i = i3;
            } else {
                if (i3 < i2) {
                    m67263x1(objArr, objArr2, comparator, i3, i2);
                }
                i2 = i4;
            }
        } while (i < i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14092to m67210k4(Object obj, int i, boolean z) {
        return m67255x1(obj, i, z);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m67264x1(AbstractC14092to abstractC14092to, int i, AbstractC14092to abstractC14092to2, int i2, int i3) {
        if (!C5891k4.m23730kk(abstractC14092to.mo67280x1().f47332x1, abstractC14092to2.mo67280x1().f47332x1)) {
            return false;
        }
        System.arraycopy(m67212k4(abstractC14092to), i, m67212k4(abstractC14092to2), i2, i3);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo67271k4(int i) {
        return m67256x1(mo67274kk(), mo67270k4(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public static Object m67212k4(AbstractC14092to abstractC14092to) {
        if (abstractC14092to != null) {
            return abstractC14092to.mo67270k4();
        }
        throw new ArgumentNullException("array is null");
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> T m67213k4(Class<T> cls, T[] tArr, AbstractC14041ai<T> abstractC14041ai) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14041ai == null) {
            throw new ArgumentNullException("match");
        }
        for (int i = 0; i < tArr.length; i++) {
            if (abstractC14041ai.invoke(tArr[i])) {
                return tArr[i];
            }
        }
        return (T) C7019kk.m27467x1((Class) cls);
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo67272k4(int... iArr) {
        Object objMo67270k4 = mo67270k4();
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            objMo67270k4 = m67256x1(AbstractC3198k4.m13771k4(), objMo67270k4, iArr[i]);
        }
        return m67256x1(mo67274kk(), objMo67270k4, iArr[length]);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67215k4(AbstractC14092to abstractC14092to, int i, int i2) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        int iM67279x1 = abstractC14092to.m67279x1(0);
        if (i < iM67279x1) {
            throw new IndexOutOfRangeException("index < lower bound");
        }
        int i3 = i - iM67279x1;
        if (i3 > abstractC14092to.m67265du() - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        k4 k4VarMo67269k4 = abstractC14092to.mo67269k4(i3, i2);
        Class cls = abstractC14092to.mo67280x1().f47332x1;
        while (k4VarMo67269k4.hasNext()) {
            k4VarMo67269k4.mo67286k4(C7019kk.m27467x1(cls));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67216k4(AbstractC14092to abstractC14092to, int i, AbstractC14092to abstractC14092to2, int i2, int i3) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (abstractC14092to2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
        }
        if (i > abstractC14092to.m67265du() - i3) {
            throw new ArgumentException("length");
        }
        if (i2 > abstractC14092to2.m67265du() - i3) {
            throw new ArgumentException(C14113y2.m67408k4("Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"), C14113y2.f47374k4);
        }
        if (abstractC14092to.m67277to() != abstractC14092to2.m67277to()) {
            throw new RankException("Arrays must be of same size.");
        }
        Class cls = abstractC14092to.mo67280x1().f47332x1;
        Class unused = abstractC14092to2.mo67280x1().f47332x1;
        boolean zIsAssignableFrom = AbstractC7020m9.class.isAssignableFrom(cls);
        if (!zIsAssignableFrom && abstractC14092to.m67277to() == 1 && m67264x1(abstractC14092to, i, abstractC14092to2, i2, i3)) {
            return;
        }
        if (!C14067j2.m66729x1(m67212k4(abstractC14092to), m67212k4(abstractC14092to2)) || !m67240k4(i, i2, i3)) {
            m67217k4(abstractC14092to, i, abstractC14092to2, i2, i3, zIsAssignableFrom);
            return;
        }
        AbstractC14092to abstractC14092toM67205k4 = m67205k4(C7019kk.m27443k4((Class<?>) cls), i3);
        m67217k4(abstractC14092to, i, abstractC14092toM67205k4, 0, i3, zIsAssignableFrom);
        m67217k4(abstractC14092toM67205k4, 0, abstractC14092to2, i2, i3, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67217k4(AbstractC14092to abstractC14092to, int i, AbstractC14092to abstractC14092to2, int i2, int i3, boolean z) {
        int i4 = 0;
        try {
            if (z) {
                while (i4 < i3) {
                    abstractC14092to2.mo67281x1(((AbstractC7020m9) abstractC14092to.mo67271k4(i + i4)).Clone(), i2 + i4);
                    i4++;
                }
            } else {
                while (i4 < i3) {
                    abstractC14092to2.mo67281x1(abstractC14092to.mo67271k4(i + i4), i2 + i4);
                    i4++;
                }
            }
        } catch (Exception unused) {
            Class cls = abstractC14092to.mo67280x1().f47332x1;
            Class cls2 = abstractC14092to2.mo67280x1().f47332x1;
            if (cls.equals(Object.class)) {
                throw new InvalidCastException();
            }
            throw new ArrayTypeMismatchException(C14113y2.m67402k4("sourceArray and destinationArray are of incompatible types (Types: source={0};  target={1})", C7019kk.m27443k4((Class<?>) cls).mo48629x6(), C7019kk.m27443k4((Class<?>) cls2).mo48629x6()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67218k4(AbstractC14092to abstractC14092to, long j, AbstractC14092to abstractC14092to2, long j2, long j3) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (abstractC14092to2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArgumentOutOfRangeException("sourceIndex", "Must be in the Int32 range.");
        }
        if (j2 < -2147483648L || j2 > 2147483647L) {
            throw new ArgumentOutOfRangeException("destinationIndex", "Must be in the Int32 range.");
        }
        if (j3 < 0 || j3 > 2147483647L) {
            throw new ArgumentOutOfRangeException("length", "Value must be >= 0 and <= Int32.MaxValue.");
        }
        m67216k4(abstractC14092to, (int) j, abstractC14092to2, (int) j2, (int) j3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67219k4(AbstractC14092to abstractC14092to, AbstractC14092to abstractC14092to2) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException(UserMetadata.KEYDATA_FILENAME);
        }
        m67221k4(abstractC14092to, abstractC14092to2, abstractC14092to.m67279x1(0), abstractC14092to.m67265du(), (Comparator) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67220k4(AbstractC14092to abstractC14092to, AbstractC14092to abstractC14092to2, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (abstractC14092to2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        m67216k4(abstractC14092to, abstractC14092to.m67279x1(0), abstractC14092to2, abstractC14092to2.m67279x1(0), i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67221k4(AbstractC14092to abstractC14092to, AbstractC14092to abstractC14092to2, int i, int i2, Comparator comparator) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException(UserMetadata.KEYDATA_FILENAME);
        }
        if (abstractC14092to.m67277to() != 1 || (abstractC14092to2 != null && abstractC14092to2.m67277to() != 1)) {
            throw new RankException("Only single dimension arrays are supported");
        }
        if (abstractC14092to2 != null && abstractC14092to.m67279x1(0) != abstractC14092to2.m67279x1(0)) {
            throw new ArgumentException("Lower bounds must match");
        }
        if (i < abstractC14092to.m67279x1(0) || i2 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "length" : FirebaseAnalytics.Param.INDEX, "Non-negative number required");
        }
        if (abstractC14092to.m67265du() - (i - abstractC14092to.m67279x1(0)) < i2 || (abstractC14092to2 != null && i - abstractC14092to2.m67279x1(0) > abstractC14092to2.m67265du() - i2)) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (i2 > 1) {
            Object objM67212k4 = m67212k4(abstractC14092to);
            Object[] objArr = null;
            Object objM67212k42 = abstractC14092to2 != null ? m67212k4(abstractC14092to2) : null;
            Object[] objArr2 = objM67212k4 instanceof Object[] ? (Object[]) objM67212k4 : null;
            if (objArr2 != null && (objM67212k42 instanceof Object[])) {
                objArr = (Object[]) objM67212k42;
            }
            if (comparator == null) {
                comparator = com.aspose.slides.Collections.Generic.Comparer.getDefault();
            }
            if (objArr2 == null || (abstractC14092to2 != null && objArr == null)) {
                m67260x1(abstractC14092to, abstractC14092to2, comparator, i, (i2 + i) - 1);
            } else {
                m67263x1(objArr2, objArr, comparator, i, (i2 + i) - 1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67222k4(AbstractC14092to abstractC14092to, AbstractC14092to abstractC14092to2, long j) {
        if (j < 0 || j > 2147483647L) {
            throw new ArgumentOutOfRangeException("length", "Value must be >= 0 and <= Int32.MaxValue.");
        }
        m67220k4(abstractC14092to, abstractC14092to2, (int) j);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67223k4(AbstractC14092to abstractC14092to, AbstractC14092to abstractC14092to2, Comparator comparator) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException(UserMetadata.KEYDATA_FILENAME);
        }
        m67221k4(abstractC14092to, abstractC14092to2, abstractC14092to.m67279x1(0), abstractC14092to.m67265du(), comparator);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67224k4(AbstractC14092to abstractC14092to, AbstractC14092to abstractC14092to2, Comparator comparator, int i, int i2) {
        if (i != i2) {
            try {
                if (comparator.compare(abstractC14092to.m67275kk(i), abstractC14092to.m67275kk(i2)) > 0) {
                    Object objM67275kk = abstractC14092to.m67275kk(i);
                    abstractC14092to.m67276kk(abstractC14092to.m67275kk(i2), i);
                    abstractC14092to.m67276kk(objM67275kk, i2);
                    if (abstractC14092to2 != null) {
                        Object objM67275kk2 = abstractC14092to2.m67275kk(i);
                        abstractC14092to2.m67276kk(abstractC14092to2.m67275kk(i2), i);
                        abstractC14092to2.m67276kk(objM67275kk2, i2);
                    }
                }
            } catch (IndexOutOfRangeException e) {
                throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", e);
            } catch (Exception e2) {
                throw new InvalidOperationException("Unexpected exception during the sorting operation", e2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo67273k4(Object obj, int... iArr) {
        Class cls = mo67280x1().f47332x1;
        if (obj == null && cls.isPrimitive()) {
            obj = C7019kk.m27467x1(cls);
        }
        if (obj != null && !C5891k4.m23726k4(obj.getClass(), (Class<?>) cls) && (cls.isPrimitive() || C5891k4.m23732x1(cls) != null)) {
            throw new ArgumentException("Cannot widen from source type to target type either because the source type is a not a primitive type or the conversion cannot be accomplished");
        }
        Object objMo67270k4 = mo67270k4();
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            objMo67270k4 = m67256x1(AbstractC3198k4.m13771k4(), objMo67270k4, iArr[i]);
        }
        try {
            m67258x1(mo67274kk(), objMo67270k4, iArr[length], obj);
        } catch (ArgumentOutOfRangeException e) {
            throw e;
        } catch (Exception unused) {
            throw new InvalidCastException("Cannot save value in this array");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67225k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        if (i > bArr.length - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            bArr[i3] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67226k4(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
        }
        if (i > bArr.length - i3) {
            throw new ArgumentException("length");
        }
        if (i2 > bArr2.length - i3) {
            throw new ArgumentException(C14113y2.m67408k4("Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"), C14113y2.f47374k4);
        }
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67227k4(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        m67226k4(bArr, 0, bArr2, 0, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67228k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        if (i > cArr.length - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            cArr[i3] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67229k4(char[] cArr, int i, char[] cArr2, int i2, int i3) {
        if (cArr == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (cArr2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
        }
        if (i > cArr.length - i3) {
            throw new ArgumentException("length");
        }
        if (i2 > cArr2.length - i3) {
            throw new ArgumentException(C14113y2.m67408k4("Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"), C14113y2.f47374k4);
        }
        System.arraycopy(cArr, i, cArr2, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67230k4(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        if (iArr == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (iArr2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
        }
        if (i > iArr.length - i3) {
            throw new ArgumentException("length");
        }
        if (i2 > iArr2.length - i3) {
            throw new ArgumentException(C14113y2.m67408k4("Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"), C14113y2.f47374k4);
        }
        System.arraycopy(iArr, i, iArr2, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67231k4(long[] jArr, int i, int i2) {
        if (jArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        if (i > jArr.length - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            jArr[i3] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m67232k4(T[] tArr, int i, int i2) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i2 < 0) {
            throw new IndexOutOfRangeException("Non-negative number required.");
        }
        if (i > tArr.length - i2) {
            throw new IndexOutOfRangeException("index + length > size");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            tArr[i3] = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m67233k4(T[] tArr, int i, int i2, Comparator<T> comparator) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "length" : FirebaseAnalytics.Param.INDEX, "Non-negative number required");
        }
        if (tArr.length - i < i2) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (i2 > 1) {
            if (comparator == null || comparator == com.aspose.slides.Collections.Generic.Comparer.getDefault()) {
                m67237k4(tArr, (Object[]) null, i, i2, com.aspose.slides.Collections.Generic.Comparer.getDefault());
            } else {
                m67237k4(tArr, (Object[]) null, i, i2, comparator);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m67234k4(T[] tArr, int i, T[] tArr2, int i2, int i3) {
        if (tArr == null) {
            throw new ArgumentNullException("sourceArray");
        }
        if (tArr2 == null) {
            throw new ArgumentNullException("destinationArray");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("sourceIndex", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("destinationIndex", "Non-negative number required.");
        }
        if (i > tArr.length - i3) {
            throw new ArgumentException("length");
        }
        if (i2 > tArr2.length - i3) {
            throw new ArgumentException(C14113y2.m67408k4("Destination array was not long enough. Check ", "destIndex and length, and the array's lower bounds"), C14113y2.f47374k4);
        }
        try {
            System.arraycopy(tArr, i, tArr2, i2, i3);
        } catch (ArrayStoreException e) {
            throw new InvalidCastException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m67235k4(T[] tArr, AbstractC14071k4<T> abstractC14071k4) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14071k4 == null) {
            throw new ArgumentNullException("action");
        }
        for (T t : tArr) {
            abstractC14071k4.invoke(t);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> void m67236k4(T[] tArr, Comparator<T> comparator) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        m67233k4(tArr, 0, tArr.length, comparator);
    }

    /* JADX INFO: renamed from: k4 */
    public static <TKey, TValue> void m67237k4(TKey[] tkeyArr, TValue[] tvalueArr, int i, int i2, Comparator<TKey> comparator) {
        int i3;
        if (tkeyArr == null) {
            throw new ArgumentNullException(UserMetadata.KEYDATA_FILENAME);
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "length" : FirebaseAnalytics.Param.INDEX, "Non-negative number required");
        }
        if (tkeyArr.length - i < i2 || (tvalueArr != null && i > tvalueArr.length - i2)) {
            throw new ArgumentException("Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection.");
        }
        if (comparator == null) {
            comparator = com.aspose.slides.Collections.Generic.Comparer.getDefault();
        }
        if (i2 > 1) {
            if (comparator == null || comparator == com.aspose.slides.Collections.Generic.Comparer.getDefault()) {
                i3 = (i2 + i) - 1;
                comparator = com.aspose.slides.Collections.Generic.Comparer.getDefault();
            } else {
                i3 = (i2 + i) - 1;
            }
            m67262x1(tkeyArr, tvalueArr, i, i3, comparator);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67238k4(Object[] objArr, Object[] objArr2, Comparator comparator, int i, int i2) {
        if (i != i2) {
            try {
                if (comparator.compare(objArr[i], objArr[i2]) > 0) {
                    Object obj = objArr[i];
                    objArr[i] = objArr[i2];
                    objArr[i2] = obj;
                    if (objArr2 != null) {
                        Object obj2 = objArr2[i];
                        objArr2[i] = objArr2[i2];
                        objArr2[i2] = obj2;
                    }
                }
            } catch (IndexOutOfRangeException e) {
                throw new ArgumentOutOfRangeException("index is outside the range of valid indexes during the sorting operation", e);
            } catch (Exception e2) {
                throw new InvalidOperationException("Unexpected exception during the sorting operation", e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <T> void m67239k4(T[][] tArr, int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("Non-negative number required.");
        }
        Object[] objArr = tArr[0];
        if (objArr == 0) {
            tArr[0] = (Object[]) m67212k4(m67205k4(C7019kk.m27443k4(tArr.getClass().getComponentType().getComponentType()), i));
            return;
        }
        int length = objArr.length;
        if (length == i) {
            return;
        }
        Class<?> cls = objArr.getClass();
        int i2 = 0;
        for (Class<?> componentType = cls.getComponentType(); componentType != null; componentType = componentType.getComponentType()) {
            i2++;
        }
        AbstractC14092to abstractC14092toM67205k4 = m67205k4(C7019kk.m27443k4(cls.getComponentType()), i);
        if (length != 0) {
            m67264x1(m67210k4(tArr[0], 1, i2 > 0), 0, abstractC14092toM67205k4, 0, C14116yg.m67507x1(i, length));
        }
        tArr[0] = (Object[]) m67212k4(abstractC14092toM67205k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m67240k4(int i, int i2, int i3) {
        if (i >= i2 || i + i3 <= i2) {
            return i2 < i && i2 + i3 > i;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> boolean m67241k4(AbstractC14092to abstractC14092to, AbstractC14041ai<T> abstractC14041ai) {
        if (abstractC14041ai != null) {
            return m67251x1(abstractC14092to, (AbstractC14041ai) abstractC14041ai) != -1;
        }
        throw new ArgumentNullException("array");
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> boolean m67242k4(T[] tArr, AbstractC14041ai<T> abstractC14041ai) {
        if (abstractC14041ai != null) {
            return m67253x1(tArr, abstractC14041ai) != -1;
        }
        throw new ArgumentNullException("array");
    }
}
