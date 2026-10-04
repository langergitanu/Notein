package o0OO0ooO;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0OO0ooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26953OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f93616OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f93617OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f93618OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f93619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f93620OooO0o0;

    public C26953OooO00o(int i, String id, String name, String str, String str2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        this.f93616OooO00o = id;
        this.f93617OooO0O0 = name;
        this.f93618OooO0OO = str;
        this.f93619OooO0Oo = str2;
        this.f93620OooO0o0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26953OooO00o)) {
            return false;
        }
        C26953OooO00o c26953OooO00o = (C26953OooO00o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f93616OooO00o, c26953OooO00o.f93616OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f93617OooO0O0, c26953OooO00o.f93617OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f93618OooO0OO, c26953OooO00o.f93618OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f93619OooO0Oo, c26953OooO00o.f93619OooO0Oo) && this.f93620OooO0o0 == c26953OooO00o.f93620OooO0o0;
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f93616OooO00o.hashCode() * 31, 31, this.f93617OooO0O0), 31, this.f93618OooO0OO);
        String str = this.f93619OooO0Oo;
        return Integer.hashCode(this.f93620OooO0o0) + ((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatorResult(id=");
        sb.append(this.f93616OooO00o);
        sb.append(", name=");
        sb.append(this.f93617OooO0O0);
        sb.append(", description=");
        sb.append(this.f93618OooO0OO);
        sb.append(", avatarUrl=");
        sb.append(this.f93619OooO0Oo);
        sb.append(", materialCount=");
        return C21023OooO0Oo.OooO0OO(")", this.f93620OooO0o0, sb);
    }
}
