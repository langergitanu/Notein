package oO0OOo0o;

import com.google.common.base.MoreObjects;
import java.util.Map;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.o000oOoO;

/* JADX INFO: renamed from: oO0OOo0o.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33086Oooo0o extends AbstractC33087Oooo0o0.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000oOoO.OooO0O0 f119625OooO00o = new o000oOoO.OooO0O0(new OooO00o());

    /* JADX INFO: renamed from: oO0OOo0o.Oooo0o$OooO00o */
    public static final class OooO00o {
        public final String toString() {
            return "service config is unused";
        }
    }

    public abstract String OooO0O0();

    public o000oOoO.OooO0O0 OooO0OO(Map<String, ?> map) {
        return f119625OooO00o;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("policy", OooO0O0()).add("priority", 5).add("available", true).toString();
    }
}
