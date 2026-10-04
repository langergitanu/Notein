package o0OOoOOO;

import com.orion.notein.domain.models.folder.Folder;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOoOOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27777OooO0OO implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Folder folder = (Folder) obj;
        String id = folder.getId();
        String title = folder.getTitle();
        String parentId = folder.getParentId();
        String recoverParentId = folder.getRecoverParentId();
        boolean inTrashBin = folder.getInTrashBin();
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", title: ", title, ", parentId: ");
        OooOO0.OooO0OO.OooO0o0(sbOooO0O0, parentId, ", recoverParentId: ", recoverParentId, ", inTrashBin: ");
        sbOooO0O0.append(inTrashBin);
        return sbOooO0O0.toString();
    }
}
