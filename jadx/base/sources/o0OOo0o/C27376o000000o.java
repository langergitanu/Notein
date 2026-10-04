package o0OOo0o;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.p607ui.p609vo.NoteVO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOo0o.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27376o000000o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f95373OooOo0o;

    public /* synthetic */ C27376o000000o(int i) {
        this.f95373OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f95373OooOo0o) {
            case 0:
                Folder folder = (Folder) obj;
                return C22237OooO0o0.OooO00o("id: ", folder.getId(), ", title: ", folder.getTitle());
            case 1:
                oOo00O0O.OooO0o Json = (oOo00O0O.OooO0o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(Json, "$this$Json");
                Json.f123498OooO0OO = true;
                return C32460OooOooO.f116667OooO00o;
            default:
                NoteVO it = (NoteVO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return it.getName();
        }
    }
}
