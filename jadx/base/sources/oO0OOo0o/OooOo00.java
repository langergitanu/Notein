package oO0OOo0o;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import oO0OOo0o.OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Joiner f119580OooO0OO = Joiner.m75078on(',');

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOo00 f119581OooO0Oo = new OooOo00(OooOO0O.OooO0O0.f119551OooO00o, false, new OooOo00(new OooOO0O.OooO00o(), true, new OooOo00()));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, OooO00o> f119582OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f119583OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC33070OooOOoo f119584OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f119585OooO0O0;

        public OooO00o(InterfaceC33070OooOOoo interfaceC33070OooOOoo, boolean z) {
            this.f119584OooO00o = (InterfaceC33070OooOOoo) Preconditions.checkNotNull(interfaceC33070OooOOoo, "decompressor");
            this.f119585OooO0O0 = z;
        }
    }

    public OooOo00(OooOO0O oooOO0O, boolean z, OooOo00 oooOo00) {
        String strOooO00o = oooOO0O.OooO00o();
        Preconditions.checkArgument(!strOooO00o.contains(","), "Comma is currently not allowed in message encoding");
        int size = oooOo00.f119582OooO00o.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(oooOo00.f119582OooO00o.containsKey(oooOO0O.OooO00o()) ? size : size + 1);
        for (OooO00o oooO00o : oooOo00.f119582OooO00o.values()) {
            String strOooO00o2 = oooO00o.f119584OooO00o.OooO00o();
            if (!strOooO00o2.equals(strOooO00o)) {
                linkedHashMap.put(strOooO00o2, new OooO00o(oooO00o.f119584OooO00o, oooO00o.f119585OooO0O0));
            }
        }
        linkedHashMap.put(strOooO00o, new OooO00o(oooOO0O, z));
        Map<String, OooO00o> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f119582OooO00o = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry<String, OooO00o> entry : mapUnmodifiableMap.entrySet()) {
            if (entry.getValue().f119585OooO0O0) {
                hashSet.add(entry.getKey());
            }
        }
        this.f119583OooO0O0 = f119580OooO0OO.join(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public OooOo00() {
        this.f119582OooO00o = new LinkedHashMap(0);
        this.f119583OooO0O0 = new byte[0];
    }
}
