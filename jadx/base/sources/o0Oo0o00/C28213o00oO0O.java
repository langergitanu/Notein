package o0Oo0o00;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.data.p602db.entity.CommentEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.o00oO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28213o00oO0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f100013OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100014OooOo0o;

    public /* synthetic */ C28213o00oO0O(String str, int i) {
        this.f100014OooOo0o = i;
        this.f100013OooOo = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f100014OooOo0o) {
            case 0:
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(androidx.concurrent.futures.OooO00o.OooO0OO(C22238OooO0oO.OooO0O0(c20358OooO00o, "CloudSyncDetailsVM", "Note "), this.f100013OooOo, " sync monitoring completed"), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from CommentEntity where id = ?");
                String str = this.f100013OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "quote_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        commentEntity = new CommentEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return commentEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
