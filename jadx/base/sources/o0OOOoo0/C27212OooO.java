package o0OOOoo0;

import com.orion.notein.domain.models.note.PenInfo;
import o0000o0O.C24249OooO0OO;
import o0000oOO.C24337OooO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOOoo0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27212OooO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95054OooOo0o;

    public /* synthetic */ C27212OooO(int i) {
        this.f95054OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f95054OooOo0o) {
            case 0:
                C24249OooO0OO it = (C24249OooO0OO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return C24337OooO0o.OooO00o();
            default:
                PenInfo penInfo = (PenInfo) obj;
                return "type: " + penInfo.getType() + ", selected: " + penInfo.getSelected() + ", " + penInfo.getExtra();
        }
    }
}
