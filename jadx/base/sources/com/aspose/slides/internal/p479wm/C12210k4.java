package com.aspose.slides.internal.p479wm;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p556zr.C13630k4;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.wm.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12210k4<TKey, TValue> {

    /* JADX INFO: renamed from: k4 */
    protected final k4 f40631k4;

    /* JADX INFO: renamed from: kk */
    private Class<TValue> f40632kk;

    /* JADX INFO: renamed from: to */
    private final int f40633to;

    /* JADX INFO: renamed from: x1 */
    private Class f40634x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wm.k4$k4 */
    public static class k4<TKey> extends Dictionary<TKey, x1> {
        public k4() {
        }

        public k4(IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
            super(iGenericEqualityComparer);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wm.k4$x1 */
    public static final class x1<TValue> {

        /* JADX INFO: renamed from: k4 */
        private TValue f40635k4;

        /* JADX INFO: renamed from: x1 */
        private long f40636x1 = C14084qq.m67081jd().m67130fa();

        public x1(TValue tvalue) {
            this.f40635k4 = tvalue;
        }

        /* JADX INFO: renamed from: k4 */
        public final long m56978k4() {
            return this.f40636x1;
        }

        /* JADX INFO: renamed from: x1 */
        public final TValue m56981x1() {
            return this.f40635k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m56979k4(long j) {
            this.f40636x1 = j;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m56980k4(TValue tvalue) {
            this.f40635k4 = tvalue;
        }
    }

    public C12210k4(Class cls, Class<TValue> cls2) {
        this(cls, cls2, Integer.MAX_VALUE, new k4());
    }

    /* JADX INFO: renamed from: h4 */
    private TKey m56967h4() {
        C6005k4.m24261k4(this.f40631k4.size() > 0);
        TKey key = (TKey) C7019kk.m27467x1(this.f40634x1);
        long jM56978k4 = Long.MAX_VALUE;
        for (KeyValuePair<TKey, TValue> keyValuePair : this.f40631k4) {
            if (((x1) keyValuePair.getValue()).m56978k4() < jM56978k4) {
                jM56978k4 = ((x1) keyValuePair.getValue()).m56978k4();
                key = keyValuePair.getKey();
            }
        }
        if (jM56978k4 != LocationRequestCompat.PASSIVE_INTERVAL) {
            return key;
        }
        throw new InvalidOperationException("Unable to find the oldest entry key in non-empty storage.");
    }

    /* JADX INFO: renamed from: kk */
    private TValue m56968kk(TKey tkey) {
        if (!this.f40631k4.containsKey(tkey)) {
            throw new KeyNotFoundException();
        }
        this.f40631k4.get_Item(tkey).m56979k4(C14084qq.m67081jd().m67130fa());
        mo56975to();
        return (TValue) this.f40631k4.get_Item(tkey).m56981x1();
    }

    /* JADX INFO: renamed from: du */
    public final void m56969du() {
        this.f40631k4.removeItemByKey(m56967h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final int m56970k4() {
        return this.f40631k4.size();
    }

    /* JADX INFO: renamed from: to */
    public void mo56975to() {
        if (this.f40631k4.size() >= this.f40633to && this.f40631k4.size() > 0) {
            m56969du();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final Dictionary<TKey, TValue> m56976x1() {
        C13630k4.AnonymousClass2 anonymousClass2 = (Dictionary<TKey, TValue>) new Dictionary(this.f40631k4.size());
        for (KeyValuePair<TKey, TValue> keyValuePair : this.f40631k4) {
            anonymousClass2.addItem(keyValuePair.getKey(), ((x1) keyValuePair.getValue()).m56981x1());
        }
        return anonymousClass2;
    }

    public C12210k4(Class cls, Class<TValue> cls2, int i) {
        this(cls, cls2, i, new k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m56971k4(TKey tkey, TValue tvalue) {
        if (this.f40631k4.containsKey(tkey)) {
            this.f40631k4.get_Item(tkey).m56979k4(C14084qq.m67081jd().m67130fa());
            this.f40631k4.get_Item(tkey).m56980k4(tvalue);
        } else {
            this.f40631k4.addItem(tkey, new x1(tvalue));
        }
        mo56975to();
    }

    /* JADX INFO: renamed from: kk */
    public final void m56974kk() {
        this.f40631k4.clear();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m56977x1(TKey tkey) {
        this.f40631k4.removeItemByKey(tkey);
    }

    public C12210k4(Class cls, Class<TValue> cls2, int i, IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
        this(cls, cls2, i, new k4(iGenericEqualityComparer));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m56972k4(TKey tkey) {
        return this.f40631k4.containsKey(tkey);
    }

    public C12210k4(Class cls, Class<TValue> cls2, int i, k4 k4Var) {
        this.f40634x1 = cls;
        this.f40632kk = cls2;
        if (i <= 0) {
            throw new ArgumentException("maxSize");
        }
        this.f40633to = i;
        this.f40631k4 = k4Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m56973k4(TKey tkey, TValue[] tvalueArr) {
        tvalueArr[0] = C7019kk.m27467x1((Class) this.f40632kk);
        if (!m56972k4(tkey)) {
            return false;
        }
        tvalueArr[0] = m56968kk(tkey);
        return true;
    }
}
