package o0Ooo00o;

import com.orion.penkit.models.DrawResult;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0Ooo00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29373OooO0O0 extends AbstractC29372OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f104150OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f104151OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DrawResult f104152OooO0Oo;

    public C29373OooO0O0(int i, String pageId, String groupId, DrawResult drawResult) {
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(groupId, "groupId");
        OooOOO0.OooO0oO(drawResult, "drawResult");
        this.f104150OooO0O0 = i;
        this.f104151OooO0OO = pageId;
        this.f104149OooO00o = groupId;
        this.f104152OooO0Oo = drawResult;
    }

    @Override // o0Ooo00o.AbstractC29372OooO00o
    public final AbstractC29372OooO00o OooO00o() {
        return new C29373OooO0O0(this.f104150OooO0O0, this.f104151OooO0OO, this.f104149OooO00o, this.f104152OooO0Oo);
    }
}
