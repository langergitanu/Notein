package o0o0O0oO;

import com.orion.notein.domain.models.page.Page;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o0O0oO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30333OooOo0O implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Page page = (Page) obj;
        String id = page.getId();
        String noteId = page.getNoteId();
        String recoverNoteId = page.getRecoverNoteId();
        String recoverNoteTitle = page.getRecoverNoteTitle();
        boolean inTrashBin = page.getInTrashBin();
        int recoverIndex = page.getRecoverIndex();
        boolean unbounded = page.getUnbounded();
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", noteId: ", noteId, " recoverNoteId: ");
        OooOO0.OooO0OO.OooO0o0(sbOooO0O0, recoverNoteId, ", title: ", recoverNoteTitle, ", ");
        sbOooO0O0.append(inTrashBin);
        sbOooO0O0.append(", ");
        sbOooO0O0.append(recoverIndex);
        sbOooO0O0.append(", ");
        sbOooO0O0.append(unbounded);
        return sbOooO0O0.toString();
    }
}
