package oO0OOo0o;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f119773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List f119774OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f119775OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList f119776OooO0O0;

        public final void OooO00o(C33101OoooOO0 c33101OoooOO0) {
            this.f119776OooO0O0.add((C33101OoooOO0) Preconditions.checkNotNull(c33101OoooOO0, "method"));
        }
    }

    public o0OoOo0() {
        throw null;
    }

    public o0OoOo0(OooO00o oooO00o) {
        String str = oooO00o.f119775OooO00o;
        this.f119773OooO00o = str;
        ArrayList<C33101OoooOO0> arrayList = oooO00o.f119776OooO0O0;
        HashSet hashSet = new HashSet(arrayList.size());
        for (C33101OoooOO0 c33101OoooOO0 : arrayList) {
            Preconditions.checkNotNull(c33101OoooOO0, "method");
            String str2 = c33101OoooOO0.f119668OooO0OO;
            Preconditions.checkArgument(str.equals(str2), "service names %s != %s", str2, str);
            String str3 = c33101OoooOO0.f119667OooO0O0;
            Preconditions.checkArgument(hashSet.add(str3), "duplicate name %s", str3);
        }
        this.f119774OooO0O0 = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public static OooO00o OooO00o(String str) {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f119776OooO0O0 = new ArrayList();
        oooO00o.f119775OooO00o = (String) Preconditions.checkNotNull(str, "name");
        return oooO00o;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("name", this.f119773OooO00o).add("schemaDescriptor", (Object) null).add("methods", this.f119774OooO0O0).omitNullValues().toString();
    }
}
