package oO00O;

import Oooo0oO.C21111o0ooOoO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO f115237OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO f115238OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO f115239OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO f115240OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO f115241OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO f115242OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f115243OooO00o;

    static {
        new OooO("2.5.4.10");
        new OooO("2.5.4.11");
        new OooO("2.5.4.6");
        new OooO("2.5.4.3");
        new OooO("2.5.29.17");
        new OooO("2.5.29.19");
        new OooO("2.5.29.15");
        new OooO("2.5.29.37");
        new OooO("1.3.6.1.5.5.7.3.1");
        new OooO("1.3.6.1.5.5.7.3.2");
        new OooO("1 2 840 113549 1 1 1");
        new OooO("1.2.840.10045.2.1");
        f115237OooO0O0 = new OooO("1.2.840.10045.4.3.3");
        f115238OooO0OO = new OooO("1.2.840.10045.4.3.2");
        f115239OooO0Oo = new OooO("1.2.840.113549.1.1.13");
        f115241OooO0o0 = new OooO("1.2.840.113549.1.1.12");
        f115240OooO0o = new OooO("1.2.840.113549.1.1.11");
        f115242OooO0oO = new OooO("1.2.840.113549.1.1.5");
        new OooO("1.2.840.10045.3.1.7");
    }

    public OooO(String str) {
        this.f115243OooO00o = str;
        List listOoooOO0 = C33599OooOo0O.OoooOO0(str, new String[]{".", " "});
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOoooOO0, 10));
        Iterator it = listOoooOO0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(C33599OooOo0O.Oooooo0((String) it.next()).toString())));
        }
        oOo000Oo.OooOo.o00oO0O(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115243OooO00o, ((OooO) obj).f115243OooO00o);
    }

    public final int hashCode() {
        return this.f115243OooO00o.hashCode();
    }

    public final String toString() {
        return C21111o0ooOoO.OooO0OO(this.f115243OooO00o, ')', new StringBuilder("OID(identifier="));
    }
}
