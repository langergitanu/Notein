package oo0oO0;

import com.orion.notein.data.p602db.entity.AiOcrSessionEntity;
import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.io.Serializable;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34704OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f124986OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f124987OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Serializable f124988OooOoO0;

    public /* synthetic */ C34704OooO0Oo(Object obj, Serializable serializable, int i) {
        this.f124987OooOo0o = i;
        this.f124986OooOo = obj;
        this.f124988OooOoO0 = serializable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f124987OooOo0o) {
            case 0:
                OooOO0O oooOO0O = (OooOO0O) this.f124986OooOo;
                oooOO0O.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM AiOcrSessionEntity where id= ?");
                String str = (String) this.f124988OooOoO0;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_ids");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "input_source_json");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        aiOcrSessionEntity = new AiOcrSessionEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), oooOO0O.f125000OooO0OO.stringToChildren(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return aiOcrSessionEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            default:
                ((oo0O) this.f124986OooOo).f125670OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (NoteMetaEntity[]) this.f124988OooOoO0);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
