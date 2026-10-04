package o0Ooo000;

import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Ooo000.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29338OooOO0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104061OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f104061OooOo0o) {
            case 0:
                return ((NoteTreeInfo) obj).getTitle();
            default:
                NoteMeta noteMeta = (NoteMeta) obj;
                String id = noteMeta.getId();
                String title = noteMeta.getTitle();
                return com.aspose.slides.OooOOO.OooO0O0(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("id: ", id, ", title: ", title, ", userId: "), noteMeta.getUserId(), ", ", noteMeta.getParentId());
        }
    }
}
