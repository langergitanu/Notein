package oO0OOo0o;

import com.google.common.base.Preconditions;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: oO0OOo0o.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33082Oooo00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AtomicLong f119619OooO0Oo = new AtomicLong();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f119620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f119621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f119622OooO0OO;

    public C33082Oooo00O(String str, String str2, long j) {
        Preconditions.checkNotNull(str, "typeName");
        Preconditions.checkArgument(!str.isEmpty(), "empty type");
        this.f119620OooO00o = str;
        this.f119621OooO0O0 = str2;
        this.f119622OooO0OO = j;
    }

    public static C33082Oooo00O OooO00o(Class<?> cls, String str) {
        String simpleName = ((Class) Preconditions.checkNotNull(cls, C18437z2.f56754h)).getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new C33082Oooo00O(simpleName, str, f119619OooO0Oo.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119620OooO00o + "<" + this.f119622OooO0OO + ">");
        String str = this.f119621OooO0O0;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
