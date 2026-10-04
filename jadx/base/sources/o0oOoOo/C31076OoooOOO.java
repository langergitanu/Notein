package o0oOoOo;

import OooOoo0.C20703o000000o;
import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0oOoOo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31076OoooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f110898OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f110899OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Long f110900OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f110901OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f110902OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Integer f110903OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Integer f110904OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f110905OooO0oo;

    public C31076OoooOOO(long j, long j2, Long l, String name, Integer num, String str, Integer num2, int i, int i2) {
        l = (i2 & 4) != 0 ? null : l;
        name = (i2 & 8) != 0 ? "" : name;
        num = (i2 & 16) != 0 ? null : num;
        str = (i2 & 32) != 0 ? null : str;
        num2 = (i2 & 64) != 0 ? null : num2;
        i = (i2 & 128) != 0 ? 0 : i;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        this.f110898OooO00o = j;
        this.f110899OooO0O0 = j2;
        this.f110900OooO0OO = l;
        this.f110901OooO0Oo = name;
        this.f110903OooO0o0 = num;
        this.f110902OooO0o = str;
        this.f110904OooO0oO = num2;
        this.f110905OooO0oo = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31076OoooOOO)) {
            return false;
        }
        C31076OoooOOO c31076OoooOOO = (C31076OoooOOO) obj;
        return this.f110898OooO00o == c31076OoooOOO.f110898OooO00o && this.f110899OooO0O0 == c31076OoooOOO.f110899OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110900OooO0OO, c31076OoooOOO.f110900OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110901OooO0Oo, c31076OoooOOO.f110901OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110903OooO0o0, c31076OoooOOO.f110903OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110902OooO0o, c31076OoooOOO.f110902OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110904OooO0oO, c31076OoooOOO.f110904OooO0oO) && this.f110905OooO0oo == c31076OoooOOO.f110905OooO0oo;
    }

    public final int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(Long.hashCode(this.f110898OooO00o) * 31, 31, this.f110899OooO0O0);
        Long l = this.f110900OooO0OO;
        int iOooO0O02 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((iOooO0O0 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f110901OooO0Oo);
        Integer num = this.f110903OooO0o0;
        int iHashCode = (iOooO0O02 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f110902OooO0o;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f110904OooO0oO;
        return Integer.hashCode(this.f110905OooO0oo) + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SortVO(creationTime=");
        sb.append(this.f110898OooO00o);
        sb.append(", lastModificationTime=");
        sb.append(this.f110899OooO0O0);
        sb.append(", lastOpenedTime=");
        sb.append(this.f110900OooO0OO);
        sb.append(", name=");
        sb.append(this.f110901OooO0Oo);
        sb.append(", sortKey=");
        sb.append(this.f110903OooO0o0);
        sb.append(", parentId=");
        sb.append(this.f110902OooO0o);
        sb.append(", type=");
        sb.append(this.f110904OooO0oO);
        sb.append(", pageNum=");
        return C21023OooO0Oo.OooO0OO(")", this.f110905OooO0oo, sb);
    }
}
