package o0OOO0OO;

import com.orion.notein.data.p602db.entity.PageEntity;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOO0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27007OooO0Oo implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        PageEntity entity = (PageEntity) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(entity, "entity");
        String id = entity.getId();
        String noteId = entity.getNoteId();
        return com.aspose.slides.OooOOO.OooO0O0(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", noteId: ", noteId, ", recoverNoteId: "), entity.getRecoverNoteId(), ", title: ", entity.getRecoverNoteTitle());
    }
}
