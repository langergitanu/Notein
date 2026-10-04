package oO0OOo0o;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import oO000Oo.C31999OoooOoo;

/* JADX INFO: renamed from: oO0OOo0o.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33077OooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f119596OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f119597OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f119598OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C31999OoooOoo f119599OooO0Oo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0OOo0o.OooOoo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f119600OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f119601OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f119602OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f119603OooOoO0;

        /* JADX INFO: Fake field, exist only in values array */
        OooO00o EF0;

        static {
            OooO00o oooO00o = new OooO00o("CT_UNKNOWN", 0);
            OooO00o oooO00o2 = new OooO00o("CT_INFO", 1);
            f119601OooOo0o = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("CT_WARNING", 2);
            f119600OooOo = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("CT_ERROR", 3);
            f119603OooOoO0 = oooO00o4;
            f119602OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f119602OooOoO.clone();
        }
    }

    public C33077OooOoo(String str, OooO00o oooO00o, long j, C31999OoooOoo c31999OoooOoo) {
        this.f119596OooO00o = str;
        this.f119597OooO0O0 = (OooO00o) Preconditions.checkNotNull(oooO00o, "severity");
        this.f119598OooO0OO = j;
        this.f119599OooO0Oo = c31999OoooOoo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C33077OooOoo)) {
            return false;
        }
        C33077OooOoo c33077OooOoo = (C33077OooOoo) obj;
        return Objects.equal(this.f119596OooO00o, c33077OooOoo.f119596OooO00o) && Objects.equal(this.f119597OooO0O0, c33077OooOoo.f119597OooO0O0) && this.f119598OooO0OO == c33077OooOoo.f119598OooO0OO && Objects.equal(null, null) && Objects.equal(this.f119599OooO0Oo, c33077OooOoo.f119599OooO0Oo);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f119596OooO00o, this.f119597OooO0O0, Long.valueOf(this.f119598OooO0OO), null, this.f119599OooO0Oo);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("description", this.f119596OooO00o).add("severity", this.f119597OooO0O0).add("timestampNanos", this.f119598OooO0OO).add("channelRef", (Object) null).add("subchannelRef", this.f119599OooO0Oo).toString();
    }
}
