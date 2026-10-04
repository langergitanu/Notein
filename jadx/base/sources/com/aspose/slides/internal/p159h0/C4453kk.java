package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.kk */
/* JADX INFO: loaded from: classes.dex */
class C4453kk implements IGenericEnumerable<C4452k4> {

    /* JADX INFO: renamed from: k4 */
    private List<C4452k4> f12238k4 = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.h0.kk$k4 */
    public static class k4 implements IGenericEnumerable<C4483x1> {

        /* JADX INFO: renamed from: k4 */
        private IGenericEnumerable<C4452k4> f12239k4;

        public k4(IGenericEnumerable<C4452k4> iGenericEnumerable) {
            this.f12239k4 = iGenericEnumerable;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<C4483x1> iterator() {
            return new x1(this.f12239k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.h0.kk$kk */
    public static class kk implements IGenericEnumerable<C4469to> {

        /* JADX INFO: renamed from: k4 */
        private IGenericEnumerable<C4452k4> f12240k4;

        public kk(IGenericEnumerable<C4452k4> iGenericEnumerable) {
            this.f12240k4 = iGenericEnumerable;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<C4469to> iterator() {
            return new to(this.f12240k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.h0.kk$to */
    public static class to implements IGenericEnumerator<C4469to> {

        /* JADX INFO: renamed from: k4 */
        private IGenericEnumerator<C4469to> f12241k4;

        /* JADX INFO: renamed from: x1 */
        private IGenericEnumerator<C4452k4> f12242x1;

        public to(IGenericEnumerable<C4452k4> iGenericEnumerable) {
            if (iGenericEnumerable == null) {
                throw new ArgumentNullException("contourCollection");
            }
            this.f12242x1 = iGenericEnumerable.iterator();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            IGenericEnumerator<C4469to> iGenericEnumerator = this.f12241k4;
            if (iGenericEnumerator != null && iGenericEnumerator.hasNext()) {
                return true;
            }
            if (!this.f12242x1.hasNext()) {
                return false;
            }
            List.Enumerator<C4469to> enumeratorClone = this.f12242x1.next().m18224kk().iterator().Clone();
            this.f12241k4 = enumeratorClone;
            enumeratorClone.hasNext();
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final C4469to next() {
            IGenericEnumerator<C4469to> iGenericEnumerator = this.f12241k4;
            if (iGenericEnumerator != null) {
                return iGenericEnumerator.next();
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f12241k4 = null;
            this.f12242x1.reset();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.h0.kk$x1 */
    public static class x1 implements IGenericEnumerator<C4483x1> {

        /* JADX INFO: renamed from: k4 */
        private IGenericEnumerator<C4483x1> f12243k4;

        /* JADX INFO: renamed from: x1 */
        private IGenericEnumerator<C4452k4> f12244x1;

        public x1(IGenericEnumerable<C4452k4> iGenericEnumerable) {
            if (iGenericEnumerable == null) {
                throw new ArgumentNullException("contourCollection");
            }
            this.f12244x1 = iGenericEnumerable.iterator();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            IGenericEnumerator<C4483x1> iGenericEnumerator = this.f12243k4;
            if (iGenericEnumerator != null && iGenericEnumerator.hasNext()) {
                return true;
            }
            if (!this.f12244x1.hasNext()) {
                return false;
            }
            List.Enumerator<C4483x1> enumeratorClone = this.f12244x1.next().m18226x1().iterator().Clone();
            this.f12243k4 = enumeratorClone;
            enumeratorClone.hasNext();
            return true;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final C4483x1 next() {
            IGenericEnumerator<C4483x1> iGenericEnumerator = this.f12243k4;
            if (iGenericEnumerator != null) {
                return iGenericEnumerator.next();
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f12243k4 = null;
            this.f12244x1.reset();
        }
    }

    public C4453kk(C4439dq c4439dq, float f) throws Throwable {
        m18231k4(c4439dq, f);
        if (this.f12238k4.size() == 0) {
            throw new InvalidOperationException("Invalid data in the ProcessedContour.");
        }
        float fM18233m9 = m18233m9();
        float f2 = fM18233m9 / 100.0f;
        m18230k4(f2);
        m18228du(fM18233m9);
        m18227du();
        m18229h4();
        m18235x1(f2);
        m18232kk(f2);
    }

    /* JADX INFO: renamed from: du */
    private void m18227du() {
        List.Enumerator<C4452k4> it = this.f12238k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m18223k4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m18229h4() {
        List.Enumerator<C4452k4> it;
        IGenericEnumerable<C4469to> iGenericEnumerableM18239x1 = m18239x1();
        for (int i = 0; i < 2; i++) {
            IGenericEnumerator<C4469to> it2 = iGenericEnumerableM18239x1.iterator();
            while (it2.hasNext()) {
                try {
                    C4469to next = it2.next();
                    C6005k4.m24261k4(next.m18339kk());
                    next.m18343x1(next.m18342x1().m18449kk().Clone());
                    it = this.f12238k4.iterator();
                    while (it.hasNext()) {
                        try {
                            List<C4469to> listM18224kk = it.next().m18224kk();
                            int i2 = 0;
                            while (i2 < listM18224kk.size()) {
                                C4469to c4469to = listM18224kk.get_Item(i2);
                                i2++;
                                C4469to c4469to2 = listM18224kk.get_Item(i2 % listM18224kk.size());
                                if (next != c4469to && next != c4469to2) {
                                    C4459os c4459os = new C4459os();
                                    C4459os[] c4459osArr = {c4459os};
                                    boolean zM18417k4 = C4479w6.m18417k4(next.m18342x1().m18452x1().Clone(), next.m18341to().Clone(), c4469to.m18342x1().m18449kk().Clone(), c4469to2.m18342x1().m18449kk().Clone(), c4459osArr);
                                    c4459osArr[0].CloneTo(c4459os);
                                    if (zM18417k4) {
                                        next.m18343x1(c4459os.Clone());
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            it2 = iGenericEnumerableM18239x1.iterator();
            while (it2.hasNext()) {
                try {
                    C4469to next2 = it2.next();
                    C6005k4.m24261k4(next2.m18339kk());
                    next2.m18338kk(next2.m18342x1().m18449kk().Clone());
                    it = this.f12238k4.iterator();
                    while (it.hasNext()) {
                        try {
                            List<C4469to> listM18224kk2 = it.next().m18224kk();
                            int i3 = 0;
                            while (i3 < listM18224kk2.size()) {
                                C4469to c4469to3 = listM18224kk2.get_Item(i3);
                                i3++;
                                C4469to c4469to4 = listM18224kk2.get_Item(i3 % listM18224kk2.size());
                                if (next2 != c4469to3 && next2 != c4469to4) {
                                    C4459os c4459os2 = new C4459os();
                                    C4459os[] c4459osArr2 = {c4459os2};
                                    boolean zM18417k42 = C4479w6.m18417k4(next2.m18342x1().m18452x1().Clone(), next2.m18330du().Clone(), c4469to3.m18341to().Clone(), c4469to4.m18341to().Clone(), c4459osArr2);
                                    c4459osArr2[0].CloneTo(c4459os2);
                                    if (zM18417k42) {
                                        next2.m18338kk(c4459os2.Clone());
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            IGenericEnumerator<C4469to> it3 = iGenericEnumerableM18239x1.iterator();
            while (it3.hasNext()) {
                try {
                    C4469to next3 = it3.next();
                    next3.m18333k4(C4459os.m18279k4(C4459os.m18278k4(next3.m18341to(), 0.39999998f), C4459os.m18278k4(next3.m18330du(), 0.6f)).Clone().Clone());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: m9 */
    private float m18233m9() {
        List list = new List();
        IGenericEnumerator<C4483x1> it = m18236k4().iterator();
        while (it.hasNext()) {
            try {
                C4483x1 next = it.next();
                C4459os c4459osClone = C4459os.m18279k4(next.m18452x1(), C4459os.m18278k4(next.m18450m9(), 99999.99f)).Clone();
                List.Enumerator<C4452k4> it2 = this.f12238k4.iterator();
                while (it2.hasNext()) {
                    try {
                        List<C4483x1> listM18226x1 = it2.next().m18226x1();
                        int i = 0;
                        while (i < listM18226x1.size()) {
                            C4483x1 c4483x1 = listM18226x1.get_Item(i);
                            i++;
                            C4483x1 c4483x12 = listM18226x1.get_Item(i % listM18226x1.size());
                            if (next != c4483x1 && next != c4483x12) {
                                C4459os c4459os = new C4459os();
                                C4459os[] c4459osArr = {c4459os};
                                boolean zM18417k4 = C4479w6.m18417k4(next.m18452x1().Clone(), c4459osClone.Clone(), c4483x1.m18452x1().Clone(), c4483x12.m18452x1().Clone(), c4459osArr);
                                c4459osArr[0].CloneTo(c4459os);
                                if (zM18417k4) {
                                    c4459os.CloneTo(c4459osClone);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                list.addItem(Float.valueOf(C4459os.m18282x1(c4459osClone, next.m18452x1()).m18288kk()));
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        list.sort();
        int size = list.size() / 2;
        if (list.size() % 2 == 1) {
            return ((Float) list.get_Item(size)).floatValue();
        }
        return (((Float) list.get_Item(size - 1)).floatValue() + ((Float) list.get_Item(size)).floatValue()) / 2.0f;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C4452k4> iterator() {
        return this.f12238k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericEnumerable<C4483x1> m18236k4() {
        return new k4(this.f12238k4);
    }

    /* JADX INFO: renamed from: kk */
    public final C4485xk m18237kk() {
        if (this.f12238k4.size() > 0) {
            return this.f12238k4.get_Item(0).m18225to().m18148up();
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m18238to() {
        return this.f12238k4.size() == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final IGenericEnumerable<C4469to> m18239x1() {
        return new kk(this.f12238k4);
    }

    /* JADX INFO: renamed from: du */
    private void m18228du(float f) {
        IGenericEnumerator<C4483x1> it = m18236k4().iterator();
        while (it.hasNext()) {
            try {
                C4483x1 next = it.next();
                if (next.m18440du() > f) {
                    next.m18453x1(C4459os.m18279k4(next.m18452x1(), C4459os.m18278k4(next.m18450m9(), f)).Clone());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m18230k4(float f) {
        int i;
        C4453kk c4453kk = this;
        IGenericEnumerator<C4483x1> it = c4453kk.m18236k4().iterator();
        while (true) {
            try {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C4483x1 next = it.next();
                List.Enumerator<C4452k4> it2 = c4453kk.f12238k4.iterator();
                while (it2.hasNext()) {
                    try {
                        List<C4483x1> listM18226x1 = it2.next().m18226x1();
                        int i2 = 0;
                        while (i2 < listM18226x1.size()) {
                            C4483x1 c4483x1 = listM18226x1.get_Item(i2);
                            i2++;
                            C4483x1 c4483x12 = listM18226x1.get_Item(i2 % listM18226x1.size());
                            if (next != c4483x1 && next != c4483x12) {
                                C4459os c4459os = new C4459os();
                                C4459os c4459osClone = C4459os.m18278k4(next.m18450m9(), f).Clone();
                                C4459os[] c4459osArr = {c4459os};
                                boolean zM18417k4 = C4479w6.m18417k4(next.m18452x1().Clone(), C4459os.m18279k4(next.m18449kk(), c4459osClone).Clone(), c4483x1.m18452x1().Clone(), c4483x12.m18452x1().Clone(), c4459osArr);
                                c4459osArr[0].CloneTo(c4459os);
                                if (zM18417k4) {
                                    next.m18453x1(C4459os.m18282x1(c4459os, c4459osClone).Clone());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<C4452k4> it3 = c4453kk.f12238k4.iterator();
        while (it3.hasNext()) {
            try {
                List<C4483x1> listM18226x12 = it3.next().m18226x1();
                int i3 = i;
                while (i3 < listM18226x12.size()) {
                    C4483x1 c4483x13 = listM18226x12.get_Item(i3);
                    i3++;
                    C4483x1 c4483x14 = listM18226x12.get_Item(i3 % listM18226x12.size());
                    List.Enumerator<C4452k4> it4 = c4453kk.f12238k4.iterator();
                    while (it4.hasNext()) {
                        try {
                            List<C4483x1> listM18226x13 = it4.next().m18226x1();
                            int i4 = i;
                            while (i4 < listM18226x13.size()) {
                                C4483x1 c4483x15 = listM18226x13.get_Item(i4);
                                i4++;
                                C4483x1 c4483x16 = listM18226x13.get_Item(i4 % listM18226x13.size());
                                if (c4483x13 != c4483x15 && c4483x13 != c4483x16 && c4483x14 != c4483x15 && c4483x14 != c4483x16) {
                                    C4459os[] c4459osArr2 = {new C4459os()};
                                    while (C4479w6.m18417k4(c4483x15.m18449kk().Clone(), c4483x16.m18449kk().Clone(), c4483x13.m18452x1().Clone(), c4483x14.m18452x1().Clone(), c4459osArr2)) {
                                        C4483x1 c4483x17 = c4483x15.m18440du() > c4483x16.m18440du() ? c4483x15 : c4483x16;
                                        float fM18440du = c4483x17.m18440du() - f;
                                        if (fM18440du < 0.0f) {
                                            break;
                                        }
                                        C4459os c4459osClone2 = C4459os.m18279k4(c4483x17.m18452x1(), C4459os.m18278k4(c4483x17.m18450m9(), fM18440du)).Clone();
                                        if (c4483x17.m18449kk().m18285k4() != c4459osClone2.m18285k4() || c4483x17.m18449kk().m18290x1() != c4459osClone2.m18290x1()) {
                                            c4483x17.m18453x1(c4459osClone2.Clone());
                                        }
                                    }
                                }
                                i = 0;
                            }
                        } catch (Throwable th2) {
                            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                it4.dispose();
                            }
                            throw th2;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                        it4.dispose();
                    }
                    c4453kk = this;
                    i = 0;
                }
                c4453kk = this;
            } catch (Throwable th3) {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                throw th3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m18232kk(float f) {
        int i;
        int i2;
        List<C4469to> list;
        int i3;
        C4483x1 c4483x1;
        C4483x1 c4483x12;
        C4453kk c4453kk = this;
        IGenericEnumerator<C4469to> it = c4453kk.m18239x1().iterator();
        while (true) {
            try {
                i = 0;
                if (!it.hasNext()) {
                    break;
                } else {
                    it.next().m18337k4(false);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        boolean zM18234to = true;
        while (zM18234to) {
            List.Enumerator<C4452k4> it2 = c4453kk.f12238k4.iterator();
            while (it2.hasNext()) {
                try {
                    List<C4469to> listM18224kk = it2.next().m18224kk();
                    for (int i4 = i; i4 < listM18224kk.size(); i4 = i3) {
                        C4469to c4469to = listM18224kk.get_Item(i4);
                        int i5 = i4 + 1;
                        C4469to c4469to2 = listM18224kk.get_Item(i5 % listM18224kk.size());
                        if (c4469to.m18331h4() && c4469to2.m18331h4()) {
                            i2 = i;
                            list = listM18224kk;
                            i3 = i5;
                        } else {
                            C4483x1 c4483x1M18342x1 = c4469to.m18342x1();
                            C4483x1 c4483x1M18342x12 = c4469to2.m18342x1();
                            it2 = c4453kk.f12238k4.iterator();
                            int i6 = i;
                            while (true) {
                                try {
                                    if (!it2.hasNext()) {
                                        i2 = i;
                                        list = listM18224kk;
                                        i3 = i5;
                                        break;
                                    }
                                    List<C4469to> listM18224kk2 = it2.next().m18224kk();
                                    int i7 = i;
                                    while (true) {
                                        if (i7 >= listM18224kk2.size()) {
                                            i2 = i;
                                            list = listM18224kk;
                                            i3 = i5;
                                            c4483x1 = c4483x1M18342x1;
                                            c4483x12 = c4483x1M18342x12;
                                            break;
                                        }
                                        C4469to c4469to3 = listM18224kk2.get_Item(i7);
                                        i7++;
                                        i2 = i;
                                        C4469to c4469to4 = listM18224kk2.get_Item(i7 % listM18224kk2.size());
                                        if (c4469to != c4469to3 && c4469to != c4469to4 && c4469to2 != c4469to3 && c4469to2 != c4469to4) {
                                            C4483x1 c4483x1M18342x13 = c4469to3.m18342x1();
                                            C4483x1 c4483x1M18342x14 = c4469to4.m18342x1();
                                            C4459os c4459os = new C4459os();
                                            C4459os[] c4459osArr = {c4459os};
                                            list = listM18224kk;
                                            C4459os c4459osClone = c4483x1M18342x1.m18449kk().Clone();
                                            i3 = i5;
                                            C4459os c4459osClone2 = c4483x1M18342x12.m18449kk().Clone();
                                            c4483x1 = c4483x1M18342x1;
                                            C4459os c4459osClone3 = c4483x1M18342x13.m18449kk().Clone();
                                            C4459os c4459osM18449kk = c4483x1M18342x14.m18449kk();
                                            c4483x12 = c4483x1M18342x12;
                                            boolean zM18417k4 = C4479w6.m18417k4(c4459osClone, c4459osClone2, c4459osClone3, c4459osM18449kk.Clone(), c4459osArr);
                                            c4459osArr[i2].CloneTo(c4459os);
                                            if (zM18417k4) {
                                                c4469to.m18337k4(true);
                                                c4469to2.m18337k4(true);
                                                c4469to3.m18337k4(true);
                                                c4469to4.m18337k4(true);
                                                i6 = 1;
                                                break;
                                            }
                                        } else {
                                            list = listM18224kk;
                                            i3 = i5;
                                            c4483x1 = c4483x1M18342x1;
                                            c4483x12 = c4483x1M18342x12;
                                        }
                                        i = i2;
                                        c4483x1M18342x12 = c4483x12;
                                        c4483x1M18342x1 = c4483x1;
                                        listM18224kk = list;
                                        i5 = i3;
                                    }
                                    if (i6 != 0) {
                                        break;
                                    }
                                    i = i2;
                                    c4483x1M18342x12 = c4483x12;
                                    c4483x1M18342x1 = c4483x1;
                                    listM18224kk = list;
                                    i5 = i3;
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                        it2.dispose();
                                    }
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                        c4453kk = this;
                        i = i2;
                        listM18224kk = list;
                    }
                    c4453kk = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i8 = i;
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            zM18234to = m18234to(f);
            c4453kk = this;
            i = i8;
        }
    }

    /* JADX INFO: renamed from: to */
    private boolean m18234to(float f) {
        IGenericEnumerator<C4469to> it = m18239x1().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                C4469to next = it.next();
                if (next.m18331h4()) {
                    next.m18337k4(false);
                    C4483x1 c4483x1M18342x1 = next.m18342x1();
                    float fM18440du = c4483x1M18342x1.m18440du() - f;
                    if (fM18440du > 0.0f) {
                        next.m18333k4(C4459os.m18279k4(c4483x1M18342x1.m18452x1(), C4459os.m18278k4(c4483x1M18342x1.m18450m9(), fM18440du)).Clone().Clone());
                        z = true;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    private void m18235x1(float f) throws Throwable {
        C4469to next;
        C4483x1 c4483x1M18342x1;
        IGenericEnumerator<C4469to> it = m18239x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m18337k4(false);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        boolean zM18234to = true;
        while (zM18234to) {
            IGenericEnumerator<C4469to> it2 = m18239x1().iterator();
            while (it2.hasNext()) {
                try {
                    next = it2.next();
                    c4483x1M18342x1 = next.m18342x1();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    List.Enumerator<C4452k4> it3 = this.f12238k4.iterator();
                    while (it3.hasNext()) {
                        try {
                            List<C4469to> listM18224kk = it3.next().m18224kk();
                            int i = 0;
                            while (true) {
                                if (i < listM18224kk.size()) {
                                    C4469to c4469to = listM18224kk.get_Item(i);
                                    i++;
                                    C4469to c4469to2 = listM18224kk.get_Item(i % listM18224kk.size());
                                    if (next != c4469to && next != c4469to2) {
                                        C4483x1 c4483x1M18342x12 = c4469to.m18342x1();
                                        C4483x1 c4483x1M18342x13 = c4469to2.m18342x1();
                                        C4459os c4459os = new C4459os();
                                        C4459os[] c4459osArr = {c4459os};
                                        boolean zM18417k4 = C4479w6.m18417k4(c4483x1M18342x1.m18452x1().Clone(), c4483x1M18342x1.m18449kk().Clone(), c4483x1M18342x12.m18449kk().Clone(), c4483x1M18342x13.m18449kk().Clone(), c4459osArr);
                                        c4459osArr[0].CloneTo(c4459os);
                                        if (zM18417k4) {
                                            next.m18337k4(true);
                                            break;
                                        }
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            zM18234to = m18234to(f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m18231k4(C4439dq c4439dq, float f) {
        if (c4439dq.m18151x1()) {
            this.f12238k4.addItem(new C4452k4(c4439dq, f));
        }
        List.Enumerator<C4439dq> it = c4439dq.m18134ck().iterator();
        while (it.hasNext()) {
            try {
                m18231k4(it.next(), f);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
