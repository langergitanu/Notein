package o0oOoOo;

import Oooo0oO.C21023OooO0Oo;
import OoooooO.C21445Oooo;
import com.orion.notein.domain.models.p605ai.NoteSummary;
import java.util.List;

/* JADX INFO: renamed from: o0oOoOo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31050OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110855OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<NoteSummary> f110856OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f110857OooO0OO;

    public C31050OooOo00(int i, String id, List summaryList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(summaryList, "summaryList");
        this.f110855OooO00o = id;
        this.f110856OooO0O0 = summaryList;
        this.f110857OooO0OO = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31050OooOo00)) {
            return false;
        }
        C31050OooOo00 c31050OooOo00 = (C31050OooOo00) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110855OooO00o, c31050OooOo00.f110855OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110856OooO0O0, c31050OooOo00.f110856OooO0O0) && this.f110857OooO0OO == c31050OooOo00.f110857OooO0OO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110857OooO0OO) + C21445Oooo.OooO00o(this.f110856OooO0O0, this.f110855OooO00o.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteAiContentVO(id=");
        sb.append(this.f110855OooO00o);
        sb.append(", summaryList=");
        sb.append(this.f110856OooO0O0);
        sb.append(", savedSummaryIndex=");
        return C21023OooO0Oo.OooO0OO(")", this.f110857OooO0OO, sb);
    }
}
