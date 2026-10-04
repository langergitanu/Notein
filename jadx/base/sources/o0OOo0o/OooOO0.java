package o0OOo0o;

import android.graphics.PointF;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.File;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95101OooOo0o;

    public /* synthetic */ OooOO0(int i) {
        this.f95101OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f95101OooOo0o) {
            case 0:
                String name = ((File) obj).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                return name;
            case 1:
                NoteVO it = (NoteVO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return it.getName() + C18115b5.CONNECTOR + it.getSortKey();
            case 2:
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
            default:
                PointF p = (PointF) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p, "p");
                return Float.valueOf(p.y);
        }
    }
}
