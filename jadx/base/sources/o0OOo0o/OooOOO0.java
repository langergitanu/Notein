package o0OOo0o;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOOO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95124OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f95124OooOo0o) {
            case 0:
                return (String) obj;
            case 1:
                return ((NoteTreeInfo) obj).getTitle();
            default:
                NoteMeta noteMeta = (NoteMeta) obj;
                String id = noteMeta.getId();
                String title = noteMeta.getTitle();
                String parentId = noteMeta.getParentId();
                String recoverParentId = noteMeta.getRecoverParentId();
                boolean inTrashBin = noteMeta.getInTrashBin();
                StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", name: ", title, ", parentId: ");
                OooOO0.OooO0OO.OooO0o0(sbOooO0O0, parentId, ", recoverParentId: ", recoverParentId, ", ");
                sbOooO0O0.append(inTrashBin);
                return sbOooO0O0.toString();
        }
    }
}
