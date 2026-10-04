package o00O0O0o;

import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: renamed from: o00O0O0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24841OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public UUID f84276OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f84277OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public androidx.work.OooO0O0 f84278OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashSet f84279OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f84280OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public androidx.work.OooO0O0 f84281OooO0o0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00O0O0o.OooOOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f84282OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f84283OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f84284OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f84285OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f84286OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f84287OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f84288OooOoo0;

        static {
            OooO00o oooO00o = new OooO00o("ENQUEUED", 0);
            f84283OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("RUNNING", 1);
            f84282OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("SUCCEEDED", 2);
            f84285OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o(MaterialPurchaseStatusResponse.STATUS_FAILED, 3);
            f84284OooOoO = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("BLOCKED", 4);
            f84286OooOoOO = oooO00o5;
            OooO00o oooO00o6 = new OooO00o("CANCELLED", 5);
            f84288OooOoo0 = oooO00o6;
            f84287OooOoo = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f84287OooOoo.clone();
        }

        public final boolean OooO00o() {
            return this == f84285OooOoO0 || this == f84284OooOoO || this == f84288OooOoo0;
        }
    }

    public C24841OooOOo0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24841OooOOo0.class != obj.getClass()) {
            return false;
        }
        C24841OooOOo0 c24841OooOOo0 = (C24841OooOOo0) obj;
        if (this.f84280OooO0o == c24841OooOOo0.f84280OooO0o && this.f84276OooO00o.equals(c24841OooOOo0.f84276OooO00o) && this.f84277OooO0O0 == c24841OooOOo0.f84277OooO0O0 && this.f84278OooO0OO.equals(c24841OooOOo0.f84278OooO0OO) && this.f84279OooO0Oo.equals(c24841OooOOo0.f84279OooO0Oo)) {
            return this.f84281OooO0o0.equals(c24841OooOOo0.f84281OooO0o0);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f84281OooO0o0.hashCode() + ((this.f84279OooO0Oo.hashCode() + ((this.f84278OooO0OO.hashCode() + ((this.f84277OooO0O0.hashCode() + (this.f84276OooO00o.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f84280OooO0o;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f84276OooO00o + "', mState=" + this.f84277OooO0O0 + ", mOutputData=" + this.f84278OooO0OO + ", mTags=" + this.f84279OooO0Oo + ", mProgress=" + this.f84281OooO0o0 + '}';
    }
}
