package oO0OoO0;

import oO0OOO.C32934OooO0o0;
import oO0OooO0.C33476OooO0O0;

/* JADX INFO: renamed from: oO0OoO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33243OooOOoo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32934OooO0o0 f120306OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32934OooO0o0 f120307OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32934OooO0o0 f120308OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32934OooO0o0 f120309OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33476OooO0O0 f120310OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f120311OooO0o0;

    public C33243OooOOoo(C32934OooO0o0 c32934OooO0o0, C32934OooO0o0 c32934OooO0o02, C32934OooO0o0 c32934OooO0o03, C32934OooO0o0 c32934OooO0o04, String filePath, C33476OooO0O0 classId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(filePath, "filePath");
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        this.f120306OooO00o = c32934OooO0o0;
        this.f120307OooO0O0 = c32934OooO0o02;
        this.f120308OooO0OO = c32934OooO0o03;
        this.f120309OooO0Oo = c32934OooO0o04;
        this.f120311OooO0o0 = filePath;
        this.f120310OooO0o = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33243OooOOoo)) {
            return false;
        }
        C33243OooOOoo c33243OooOOoo = (C33243OooOOoo) obj;
        return this.f120306OooO00o.equals(c33243OooOOoo.f120306OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120307OooO0O0, c33243OooOOoo.f120307OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120308OooO0OO, c33243OooOOoo.f120308OooO0OO) && this.f120309OooO0Oo.equals(c33243OooOOoo.f120309OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120311OooO0o0, c33243OooOOoo.f120311OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120310OooO0o, c33243OooOOoo.f120310OooO0o);
    }

    public final int hashCode() {
        int iHashCode = this.f120306OooO00o.hashCode() * 31;
        C32934OooO0o0 c32934OooO0o0 = this.f120307OooO0O0;
        int iHashCode2 = (iHashCode + (c32934OooO0o0 == null ? 0 : c32934OooO0o0.hashCode())) * 31;
        C32934OooO0o0 c32934OooO0o02 = this.f120308OooO0OO;
        return this.f120310OooO0o.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.f120309OooO0Oo.hashCode() + ((iHashCode2 + (c32934OooO0o02 != null ? c32934OooO0o02.hashCode() : 0)) * 31)) * 31, 31, this.f120311OooO0o0);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f120306OooO00o + ", compilerVersion=" + this.f120307OooO0O0 + ", languageVersion=" + this.f120308OooO0OO + ", expectedVersion=" + this.f120309OooO0Oo + ", filePath=" + this.f120311OooO0o0 + ", classId=" + this.f120310OooO0o + ')';
    }
}
