package oO000o00;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import oO000Oo.o0000O00;
import oO000o00.AbstractC32097OooO0oO;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 extends AbstractC32097OooO0oO {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AtomicInteger f115070OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public AbstractC33087Oooo0o0.OooOO0 f115071OooOOO0;

    public static final class OooO00o extends AbstractC33087Oooo0o0.OooOO0 {
        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            return AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0;
        }

        public final boolean equals(Object obj) {
            return obj instanceof OooO00o;
        }

        public final int hashCode() {
            return OooO00o.class.hashCode();
        }
    }

    public static class OooO0O0 extends AbstractC33087Oooo0o0.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f115072OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicInteger f115073OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f115074OooO0OO;

        public OooO0O0(ArrayList arrayList, AtomicInteger atomicInteger) {
            Preconditions.checkArgument(!arrayList.isEmpty(), "empty list");
            this.f115072OooO00o = arrayList;
            this.f115073OooO0O0 = (AtomicInteger) Preconditions.checkNotNull(atomicInteger, FirebaseAnalytics.Param.INDEX);
            Iterator it = arrayList.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += ((AbstractC33087Oooo0o0.OooOO0) it.next()).hashCode();
            }
            this.f115074OooO0OO = iHashCode;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            int andIncrement = this.f115073OooO0O0.getAndIncrement() & Integer.MAX_VALUE;
            ArrayList arrayList = this.f115072OooO00o;
            return ((AbstractC33087Oooo0o0.OooOO0) arrayList.get(andIncrement % arrayList.size())).OooO00o(o0000o00);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (oooO0O0 == this) {
                return true;
            }
            if (this.f115074OooO0OO != oooO0O0.f115074OooO0OO || this.f115073OooO0O0 != oooO0O0.f115073OooO0O0) {
                return false;
            }
            ArrayList arrayList = this.f115072OooO00o;
            int size = arrayList.size();
            ArrayList arrayList2 = oooO0O0.f115072OooO00o;
            return size == arrayList2.size() && new HashSet(arrayList).containsAll(arrayList2);
        }

        public final int hashCode() {
            return this.f115074OooO0OO;
        }

        public final String toString() {
            return MoreObjects.toStringHelper((Class<?>) OooO0O0.class).add("subchannelPickers", this.f115072OooO00o).toString();
        }
    }

    public OooOO0(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        super(abstractC33089OooO0o0);
        this.f115070OooOO0o = new AtomicInteger(new Random().nextInt());
        this.f115071OooOOO0 = new OooO00o();
    }

    @Override // oO000o00.AbstractC32097OooO0oO
    public final void OooO() {
        OooOOO oooOOO;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f114997OooO0o;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oooOOO = OooOOO.f119552OooOo;
            if (!zHasNext) {
                break;
            }
            AbstractC32097OooO0oO.OooO0O0 oooO0O0 = (AbstractC32097OooO0oO.OooO0O0) it.next();
            if (!oooO0O0.f115007OooO0o && oooO0O0.f115006OooO0Oo == oooOOO) {
                arrayList.add(oooO0O0);
            }
        }
        if (!arrayList.isEmpty()) {
            OooOO0O(oooOOO, OooOO0(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            OooOOO oooOOO2 = ((AbstractC32097OooO0oO.OooO0O0) it2.next()).f115006OooO0Oo;
            OooOOO oooOOO3 = OooOOO.f119553OooOo0o;
            if (oooOOO2 == oooOOO3 || oooOOO2 == OooOOO.f119554OooOoO) {
                OooOO0O(oooOOO3, new OooO00o());
                return;
            }
        }
        OooOO0O(OooOOO.f119555OooOoO0, OooOO0(linkedHashMap.values()));
    }

    @Override // oO000o00.AbstractC32097OooO0oO
    public final AbstractC33087Oooo0o0.OooOO0 OooO0oo() {
        throw new UnsupportedOperationException();
    }

    public final OooO0O0 OooOO0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC32097OooO0oO.OooO0O0) it.next()).f115008OooO0o0);
        }
        return new OooO0O0(arrayList, this.f115070OooOO0o);
    }

    public final void OooOO0O(OooOOO oooOOO, AbstractC33087Oooo0o0.OooOO0 oooOO02) {
        if (oooOOO == this.f115000OooOO0 && oooOO02.equals(this.f115071OooOOO0)) {
            return;
        }
        this.f114998OooO0oO.OooO0o(oooOOO, oooOO02);
        this.f115000OooOO0 = oooOOO;
        this.f115071OooOOO0 = oooOO02;
    }
}
