package o0o0OoOo;

import com.orion.notein.domain.models.folder.Folder;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o0OoOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30736OooOOOo implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Folder folder = (Folder) obj;
        String id = folder.getId();
        String title = folder.getTitle();
        return com.aspose.slides.OooOOO.OooO0O0(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", title: ", title, ", "), folder.getParentId(), ", ", folder.getUserId());
    }
}
