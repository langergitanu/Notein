package o00O0OoO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.EnumC24833OooO00o;

/* JADX INFO: renamed from: o00O0OoO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24880OooOOoo {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f84454OooOOoo = o00O0O0o.OooOO0O.OooO0o0("WorkSpec");

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooO00o f84455OooOo00 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f84456OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f84457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C24841OooOOo0.OooO00o f84458OooO0O0 = C24841OooOOo0.OooO00o.f84283OooOo0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f84459OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f84460OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public androidx.work.OooO0O0 f84461OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public androidx.work.OooO0O0 f84462OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f84463OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f84464OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00O0O0o.OooO0OO f84465OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f84466OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public EnumC24833OooO00o f84467OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f84468OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f84469OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f84470OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f84471OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o00O0O0o.OooOOOO f84472OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f84473OooOOo0;

    /* JADX INFO: renamed from: o00O0OoO.OooOOoo$OooO00o */
    public class OooO00o implements OooOOOO.OooO00o<List<OooO0OO>, List<C24841OooOOo0>> {
        @Override // OooOOOO.OooO00o
        public final List<C24841OooOOo0> apply(List<OooO0OO> list) {
            List<OooO0OO> list2 = list;
            if (list2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list2.size());
            for (OooO0OO oooO0OO : list2) {
                ArrayList arrayList2 = oooO0OO.f84480OooO0o;
                androidx.work.OooO0O0 oooO0O0 = (arrayList2 == null || arrayList2.isEmpty()) ? androidx.work.OooO0O0.f66685OooO0OO : (androidx.work.OooO0O0) oooO0OO.f84480OooO0o.get(0);
                UUID uuidFromString = UUID.fromString(oooO0OO.f84476OooO00o);
                C24841OooOOo0.OooO00o oooO00o = oooO0OO.f84477OooO0O0;
                androidx.work.OooO0O0 oooO0O02 = oooO0OO.f84478OooO0OO;
                ArrayList arrayList3 = oooO0OO.f84481OooO0o0;
                int i = oooO0OO.f84479OooO0Oo;
                C24841OooOOo0 c24841OooOOo0 = new C24841OooOOo0();
                c24841OooOOo0.f84276OooO00o = uuidFromString;
                c24841OooOOo0.f84277OooO0O0 = oooO00o;
                c24841OooOOo0.f84278OooO0OO = oooO0O02;
                c24841OooOOo0.f84279OooO0Oo = new HashSet(arrayList3);
                c24841OooOOo0.f84281OooO0o0 = oooO0O0;
                c24841OooOOo0.f84280OooO0o = i;
                arrayList.add(c24841OooOOo0);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: o00O0OoO.OooOOoo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f84474OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C24841OooOOo0.OooO00o f84475OooO0O0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.f84475OooO0O0 != oooO0O0.f84475OooO0O0) {
                return false;
            }
            return this.f84474OooO00o.equals(oooO0O0.f84474OooO00o);
        }

        public final int hashCode() {
            return this.f84475OooO0O0.hashCode() + (this.f84474OooO00o.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: o00O0OoO.OooOOoo$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f84476OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C24841OooOOo0.OooO00o f84477OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public androidx.work.OooO0O0 f84478OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f84479OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ArrayList f84480OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ArrayList f84481OooO0o0;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (this.f84479OooO0Oo != oooO0OO.f84479OooO0Oo) {
                return false;
            }
            String str = this.f84476OooO00o;
            if (str != null) {
                if (!str.equals(oooO0OO.f84476OooO00o)) {
                    return false;
                }
            } else if (oooO0OO.f84476OooO00o != null) {
                return false;
            }
            if (this.f84477OooO0O0 != oooO0OO.f84477OooO0O0) {
                return false;
            }
            androidx.work.OooO0O0 oooO0O0 = this.f84478OooO0OO;
            if (oooO0O0 != null) {
                if (!oooO0O0.equals(oooO0OO.f84478OooO0OO)) {
                    return false;
                }
            } else if (oooO0OO.f84478OooO0OO != null) {
                return false;
            }
            ArrayList arrayList = this.f84481OooO0o0;
            if (arrayList != null) {
                if (!arrayList.equals(oooO0OO.f84481OooO0o0)) {
                    return false;
                }
            } else if (oooO0OO.f84481OooO0o0 != null) {
                return false;
            }
            ArrayList arrayList2 = this.f84480OooO0o;
            ArrayList arrayList3 = oooO0OO.f84480OooO0o;
            return arrayList2 != null ? arrayList2.equals(arrayList3) : arrayList3 == null;
        }

        public final int hashCode() {
            String str = this.f84476OooO00o;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            C24841OooOOo0.OooO00o oooO00o = this.f84477OooO0O0;
            int iHashCode2 = (iHashCode + (oooO00o != null ? oooO00o.hashCode() : 0)) * 31;
            androidx.work.OooO0O0 oooO0O0 = this.f84478OooO0OO;
            int iHashCode3 = (((iHashCode2 + (oooO0O0 != null ? oooO0O0.hashCode() : 0)) * 31) + this.f84479OooO0Oo) * 31;
            ArrayList arrayList = this.f84481OooO0o0;
            int iHashCode4 = (iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
            ArrayList arrayList2 = this.f84480OooO0o;
            return iHashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0);
        }
    }

    public C24880OooOOoo(String str, String str2) {
        androidx.work.OooO0O0 oooO0O0 = androidx.work.OooO0O0.f66685OooO0OO;
        this.f84462OooO0o0 = oooO0O0;
        this.f84461OooO0o = oooO0O0;
        this.f84465OooOO0 = o00O0O0o.OooO0OO.f84231OooO;
        this.f84467OooOO0o = EnumC24833OooO00o.f84227OooOo0o;
        this.f84469OooOOO0 = 30000L;
        this.f84471OooOOOo = -1L;
        this.f84472OooOOo = o00O0O0o.OooOOOO.f84268OooOo0o;
        this.f84457OooO00o = str;
        this.f84459OooO0OO = str2;
    }

    public final long OooO00o() {
        int i;
        if (this.f84458OooO0O0 == C24841OooOOo0.OooO00o.f84283OooOo0o && (i = this.f84466OooOO0O) > 0) {
            return Math.min(18000000L, this.f84467OooOO0o == EnumC24833OooO00o.f84226OooOo ? this.f84469OooOOO0 * ((long) i) : (long) Math.scalb(this.f84469OooOOO0, i - 1)) + this.f84468OooOOO;
        }
        if (!OooO0OO()) {
            long jCurrentTimeMillis = this.f84468OooOOO;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f84463OooO0oO;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.f84468OooOOO;
        if (j == 0) {
            j = this.f84463OooO0oO + jCurrentTimeMillis2;
        }
        long j2 = this.f84456OooO;
        long j3 = this.f84464OooO0oo;
        if (j2 != j3) {
            return j + j3 + (j == 0 ? j2 * (-1) : 0L);
        }
        return j + (j != 0 ? j3 : 0L);
    }

    public final boolean OooO0O0() {
        return !o00O0O0o.OooO0OO.f84231OooO.equals(this.f84465OooOO0);
    }

    public final boolean OooO0OO() {
        return this.f84464OooO0oo != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24880OooOOoo.class == obj.getClass()) {
            C24880OooOOoo c24880OooOOoo = (C24880OooOOoo) obj;
            if (this.f84463OooO0oO != c24880OooOOoo.f84463OooO0oO || this.f84464OooO0oo != c24880OooOOoo.f84464OooO0oo || this.f84456OooO != c24880OooOOoo.f84456OooO || this.f84466OooOO0O != c24880OooOOoo.f84466OooOO0O || this.f84469OooOOO0 != c24880OooOOoo.f84469OooOOO0 || this.f84468OooOOO != c24880OooOOoo.f84468OooOOO || this.f84470OooOOOO != c24880OooOOoo.f84470OooOOOO || this.f84471OooOOOo != c24880OooOOoo.f84471OooOOOo || this.f84473OooOOo0 != c24880OooOOoo.f84473OooOOo0 || !this.f84457OooO00o.equals(c24880OooOOoo.f84457OooO00o) || this.f84458OooO0O0 != c24880OooOOoo.f84458OooO0O0 || !this.f84459OooO0OO.equals(c24880OooOOoo.f84459OooO0OO)) {
                return false;
            }
            String str = this.f84460OooO0Oo;
            if (str == null ? c24880OooOOoo.f84460OooO0Oo != null : !str.equals(c24880OooOOoo.f84460OooO0Oo)) {
                return false;
            }
            if (this.f84462OooO0o0.equals(c24880OooOOoo.f84462OooO0o0) && this.f84461OooO0o.equals(c24880OooOOoo.f84461OooO0o) && this.f84465OooOO0.equals(c24880OooOOoo.f84465OooOO0) && this.f84467OooOO0o == c24880OooOOoo.f84467OooOO0o && this.f84472OooOOo == c24880OooOOoo.f84472OooOOo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.f84458OooO0O0.hashCode() + (this.f84457OooO00o.hashCode() * 31)) * 31, 31, this.f84459OooO0OO);
        String str = this.f84460OooO0Oo;
        int iHashCode = (this.f84461OooO0o.hashCode() + ((this.f84462OooO0o0.hashCode() + ((iOooO0O0 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.f84463OooO0oO;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f84464OooO0oo;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f84456OooO;
        int iHashCode2 = (this.f84467OooOO0o.hashCode() + ((((this.f84465OooOO0.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f84466OooOO0O) * 31)) * 31;
        long j4 = this.f84469OooOOO0;
        int i3 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f84468OooOOO;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f84470OooOOOO;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f84471OooOOOo;
        return this.f84472OooOOo.hashCode() + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f84473OooOOo0 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("{WorkSpec: "), this.f84457OooO00o, "}");
    }
}
