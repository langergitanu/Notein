package oO000o00;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.o0000;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33072OooOo0O;
import oO0OOo0o.OooOOO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO000o00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32097OooO0oO extends AbstractC33087Oooo0o0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Logger f114995OooOO0O = Logger.getLogger(AbstractC32097OooO0oO.class.getName());

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 f114998OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f114999OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOOO f115000OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashMap f114997OooO0o = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000 f114996OooO = new o0000();

    /* JADX INFO: renamed from: oO000o00.OooO0oO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00Oo0 f115001OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f115002OooO0O0;

        public OooO00o(o00Oo0 o00oo02, ArrayList arrayList) {
            this.f115001OooO00o = o00oo02;
            this.f115002OooO0O0 = arrayList;
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oO$OooO0O0 */
    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f115003OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C32096OooO0o0 f115004OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0000 f115005OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOOO f115006OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f115007OooO0o = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public AbstractC33087Oooo0o0.OooOO0 f115008OooO0o0;

        /* JADX INFO: renamed from: oO000o00.OooO0oO$OooO0O0$OooO00o */
        public final class OooO00o extends oO000o00.OooO0OO {
            public OooO00o() {
            }

            @Override // oO000o00.OooO0OO, oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
            public final void OooO0o(OooOOO oooOOO, AbstractC33087Oooo0o0.OooOO0 oooOO02) {
                OooO0O0 oooO0O0 = OooO0O0.this;
                if (AbstractC32097OooO0oO.this.f114997OooO0o.containsKey(oooO0O0.f115003OooO00o)) {
                    oooO0O0.f115006OooO0Oo = oooOOO;
                    oooO0O0.f115008OooO0o0 = oooOO02;
                    if (oooO0O0.f115007OooO0o) {
                        return;
                    }
                    AbstractC32097OooO0oO abstractC32097OooO0oO = AbstractC32097OooO0oO.this;
                    if (abstractC32097OooO0oO.f114999OooO0oo) {
                        return;
                    }
                    if (oooOOO == OooOOO.f119554OooOoO) {
                        oooO0O0.f115004OooO0O0.OooO0o0();
                    }
                    abstractC32097OooO0oO.OooO();
                }
            }

            @Override // oO000o00.OooO0OO
            public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 OooO0oO() {
                return AbstractC32097OooO0oO.this.f114998OooO0oO;
            }
        }

        public OooO0O0(OooO0OO oooO0OO, o0000 o0000Var, AbstractC33087Oooo0o0.C33088OooO0Oo c33088OooO0Oo) {
            this.f115003OooO00o = oooO0OO;
            this.f115005OooO0OO = o0000Var;
            this.f115008OooO0o0 = c33088OooO0Oo;
            C32096OooO0o0 c32096OooO0o0 = new C32096OooO0o0(new OooO00o());
            this.f115004OooO0O0 = c32096OooO0o0;
            this.f115006OooO0Oo = OooOOO.f119553OooOo0o;
            c32096OooO0o0.OooO(o0000Var);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Address = ");
            sb.append(this.f115003OooO00o);
            sb.append(", state = ");
            sb.append(this.f115006OooO0Oo);
            sb.append(", picker type: ");
            sb.append(this.f115008OooO0o0.getClass());
            sb.append(", lb: ");
            sb.append(this.f115004OooO0O0.OooO0oO().getClass());
            sb.append(this.f115007OooO0o ? ", deactivated" : "");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oO$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f115011OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f115012OooO0O0;

        public OooO0OO(C33072OooOo0O c33072OooOo0O) {
            Preconditions.checkNotNull(c33072OooOo0O, "eag");
            this.f115011OooO00o = new String[c33072OooOo0O.f119587OooO00o.size()];
            Iterator<SocketAddress> it = c33072OooOo0O.f119587OooO00o.iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f115011OooO00o[i] = it.next().toString();
                i++;
            }
            Arrays.sort(this.f115011OooO00o);
            this.f115012OooO0O0 = Arrays.hashCode(this.f115011OooO00o);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (oooO0OO.f115012OooO0O0 == this.f115012OooO0O0) {
                String[] strArr = oooO0OO.f115011OooO00o;
                int length = strArr.length;
                String[] strArr2 = this.f115011OooO00o;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f115012OooO0O0;
        }

        public final String toString() {
            return Arrays.toString(this.f115011OooO00o);
        }
    }

    public AbstractC32097OooO0oO(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        this.f114998OooO0oO = (AbstractC33087Oooo0o0.AbstractC33089OooO0o0) Preconditions.checkNotNull(abstractC33089OooO0o0, "helper");
        f114995OooOO0O.log(Level.FINE, "Created");
    }

    public void OooO() {
        HashMap map = new HashMap();
        OooOOO oooOOO = null;
        for (OooO0O0 oooO0O0 : this.f114997OooO0o.values()) {
            if (!oooO0O0.f115007OooO0o) {
                map.put(oooO0O0.f115003OooO00o, oooO0O0.f115008OooO0o0);
                OooOOO oooOOO2 = oooO0O0.f115006OooO0Oo;
                if (oooOOO == null) {
                    oooOOO = oooOOO2;
                } else {
                    OooOOO oooOOO3 = OooOOO.f119552OooOo;
                    if (oooOOO == oooOOO3 || oooOOO2 == oooOOO3 || oooOOO == (oooOOO3 = OooOOO.f119553OooOo0o) || oooOOO2 == oooOOO3 || oooOOO == (oooOOO3 = OooOOO.f119554OooOoO) || oooOOO2 == oooOOO3) {
                        oooOOO = oooOOO3;
                    }
                }
            }
        }
        if (oooOOO == null) {
            return;
        }
        OooO0oo();
        throw null;
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final o00Oo0 OooO00o(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
        try {
            this.f114999OooO0oo = true;
            OooO00o oooO00oOooO0oO = OooO0oO(c33091OooO0oo);
            o00Oo0 o00oo02 = oooO00oOooO0oO.f115001OooO00o;
            if (!o00oo02.OooO0o()) {
                return o00oo02;
            }
            OooO();
            for (OooO0O0 oooO0O0 : oooO00oOooO0oO.f115002OooO0O0) {
                oooO0O0.f115004OooO0O0.OooO0o();
                oooO0O0.f115006OooO0Oo = OooOOO.f119556OooOoOO;
                f114995OooOO0O.log(Level.FINE, "Child balancer {0} deleted", oooO0O0.f115003OooO00o);
            }
            return o00oo02;
        } finally {
            this.f114999OooO0oo = false;
        }
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0OO(o00Oo0 o00oo02) {
        if (this.f115000OooOO0 != OooOOO.f119552OooOo) {
            this.f114998OooO0oO.OooO0o(OooOOO.f119555OooOoO0, new AbstractC33087Oooo0o0.C33088OooO0Oo(AbstractC33087Oooo0o0.OooO0o.OooO00o(o00oo02)));
        }
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0o() {
        Level level = Level.FINE;
        Logger logger = f114995OooOO0O;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f114997OooO0o;
        for (OooO0O0 oooO0O0 : linkedHashMap.values()) {
            oooO0O0.f115004OooO0O0.OooO0o();
            oooO0O0.f115006OooO0Oo = OooOOO.f119556OooOoOO;
            logger.log(Level.FINE, "Child balancer {0} deleted", oooO0O0.f115003OooO00o);
        }
        linkedHashMap.clear();
    }

    public final OooO00o OooO0oO(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
        LinkedHashMap linkedHashMap;
        OooO0OO oooO0OO;
        C33072OooOo0O next;
        Level level = Level.FINE;
        Logger logger = f114995OooOO0O;
        logger.log(level, "Received resolution result: {0}", c33091OooO0oo);
        HashMap map = new HashMap();
        List<C33072OooOo0O> list = c33091OooO0oo.f119643OooO00o;
        Iterator<C33072OooOo0O> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f114997OooO0o;
            if (!zHasNext) {
                break;
            }
            OooO0OO oooO0OO2 = new OooO0OO(it.next());
            OooO0O0 oooO0O0 = (OooO0O0) linkedHashMap.get(oooO0OO2);
            if (oooO0O0 != null) {
                map.put(oooO0OO2, oooO0O0);
            } else {
                map.put(oooO0OO2, new OooO0O0(oooO0OO2, this.f114996OooO, new AbstractC33087Oooo0o0.C33088OooO0Oo(AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0)));
            }
        }
        if (map.isEmpty()) {
            o00Oo0 o00oo0OooO0oo = o00Oo0.f119725OooOOOO.OooO0oo("NameResolver returned no usable address. " + c33091OooO0oo);
            OooO0OO(o00oo0OooO0oo);
            return new OooO00o(o00oo0OooO0oo, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            o0000 o0000Var = ((OooO0O0) entry.getValue()).f115005OooO0OO;
            ((OooO0O0) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                OooO0O0 oooO0O02 = (OooO0O0) linkedHashMap.get(key);
                if (oooO0O02.f115007OooO0o) {
                    oooO0O02.f115007OooO0o = false;
                }
            } else {
                linkedHashMap.put(key, (OooO0O0) entry.getValue());
            }
            OooO0O0 oooO0O03 = (OooO0O0) linkedHashMap.get(key);
            if (key instanceof C33072OooOo0O) {
                oooO0OO = new OooO0OO((C33072OooOo0O) key);
            } else {
                Preconditions.checkArgument(key instanceof OooO0OO, "key is wrong type");
                oooO0OO = (OooO0OO) key;
            }
            Iterator<C33072OooOo0O> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (oooO0OO.equals(new OooO0OO(next))) {
                    break;
                }
            }
            Preconditions.checkNotNull(next, key + " no longer present in load balancer children");
            C33058OooO00o c33058OooO00o = C33058OooO00o.f119518OooO0O0;
            List listSingletonList = Collections.singletonList(next);
            C33058OooO00o c33058OooO00o2 = C33058OooO00o.f119518OooO0O0;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(AbstractC33087Oooo0o0.f119629OooO0o0, bool);
            for (Map.Entry<C33058OooO00o.OooO0O0<?>, Object> entry2 : c33058OooO00o2.f119519OooO00o.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo2 = new AbstractC33087Oooo0o0.C33091OooO0oo(listSingletonList, new C33058OooO00o(identityHashMap), null);
            ((OooO0O0) linkedHashMap.get(key)).getClass();
            Preconditions.checkNotNull(c33091OooO0oo2, "Missing address list for child");
            if (!oooO0O03.f115007OooO0o) {
                oooO0O03.f115004OooO0O0.OooO0Oo(c33091OooO0oo2);
            }
        }
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator it3 = ImmutableList.copyOf((Collection) linkedHashMap.keySet()).iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!map.containsKey(next2)) {
                OooO0O0 oooO0O04 = (OooO0O0) linkedHashMap.get(next2);
                if (!oooO0O04.f115007OooO0o) {
                    LinkedHashMap linkedHashMap2 = AbstractC32097OooO0oO.this.f114997OooO0o;
                    OooO0OO oooO0OO3 = oooO0O04.f115003OooO00o;
                    linkedHashMap2.remove(oooO0OO3);
                    oooO0O04.f115007OooO0o = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", oooO0OO3);
                }
                arrayList.add(oooO0O04);
            }
        }
        return new OooO00o(o00Oo0.f119717OooO0o0, arrayList);
    }

    public abstract AbstractC33087Oooo0o0.OooOO0 OooO0oo();
}
