package androidx.room;

import androidx.room.OooO0OO;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO.OooO00o f66197OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f66198OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f66199OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<String> f66200OooO0Oo;

    public OooO0o(OooO0OO.OooO00o observer, int[] tableIds, String[] tableNames) {
        OooOOO0.OooO0oO(observer, "observer");
        OooOOO0.OooO0oO(tableIds, "tableIds");
        OooOOO0.OooO0oO(tableNames, "tableNames");
        this.f66197OooO00o = observer;
        this.f66198OooO0O0 = tableIds;
        this.f66199OooO0OO = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f66200OooO0Oo = !(tableNames.length == 0) ? C34449Oooo0oo.OooOO0(tableNames[0]) : C34438OooOoo0.f123458OooOo0o;
    }
}
