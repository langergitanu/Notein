package oO0OOo0o;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.logging.Logger;
import oO0OOo0o.o00O0O;

/* JADX INFO: renamed from: oO0OOo0o.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33103OoooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Logger f119681OooO0Oo = Logger.getLogger(C33103OoooOOo.class.getName());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static C33103OoooOOo f119682OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f119683OooO00o = "unknown";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashSet<AbstractC33102OoooOOO> f119684OooO0O0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ImmutableMap<String, AbstractC33102OoooOOO> f119685OooO0OO = ImmutableMap.m75125of();

    /* JADX INFO: renamed from: oO0OOo0o.OoooOOo$OooO00o */
    public static final class OooO00o implements o00O0O.OooO00o<AbstractC33102OoooOOO> {
        @Override // oO0OOo0o.o00O0O.OooO00o
        public final boolean OooO00o(AbstractC33102OoooOOO abstractC33102OoooOOO) {
            abstractC33102OoooOOO.getClass();
            return true;
        }

        @Override // oO0OOo0o.o00O0O.OooO00o
        public final int OooO0O0(AbstractC33102OoooOOO abstractC33102OoooOOO) {
            abstractC33102OoooOOO.getClass();
            return 5;
        }
    }

    public final synchronized void OooO00o() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            byte b = -2147483648;
            for (AbstractC33102OoooOOO abstractC33102OoooOOO : this.f119684OooO0O0) {
                abstractC33102OoooOOO.getClass();
                if (((AbstractC33102OoooOOO) map.get("dns")) == null) {
                    map.put("dns", abstractC33102OoooOOO);
                }
                if (b < 5) {
                    str = "dns";
                    b = 5;
                }
            }
            this.f119685OooO0OO = ImmutableMap.copyOf((Map) map);
            this.f119683OooO00o = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
