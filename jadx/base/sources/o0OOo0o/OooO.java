package o0OOo0o;

import com.orion.notein.domain.models.folder.Folder;
import java.io.File;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95081OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f95081OooOo0o) {
            case 0:
                String name = ((File) obj).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                return name;
            default:
                Folder folder = (Folder) obj;
                String id = folder.getId();
                String title = folder.getTitle();
                String parentId = folder.getParentId();
                String recoverParentId = folder.getRecoverParentId();
                boolean inTrashBin = folder.getInTrashBin();
                StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", name: ", title, ", parentId: ");
                OooOO0.OooO0OO.OooO0o0(sbOooO0O0, parentId, ", recoverParentId: ", recoverParentId, ", ");
                sbOooO0O0.append(inTrashBin);
                return sbOooO0O0.toString();
        }
    }
}
