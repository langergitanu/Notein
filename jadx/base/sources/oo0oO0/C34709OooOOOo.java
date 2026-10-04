package oo0oO0;

import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import java.util.ArrayList;
import java.util.List;
import o000000o.C24099OooOoO0;
import o000ooOO.C24741OooOO0o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34709OooOOOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125009OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125010OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125011OooOoO0;

    public /* synthetic */ C34709OooOOOo(int i, Object obj, Object obj2) {
        this.f125010OooOo0o = i;
        this.f125009OooOo = obj;
        this.f125011OooOoO0 = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        Object obj2 = this.f125009OooOo;
        Object obj3 = this.f125011OooOoO0;
        switch (this.f125010OooOo0o) {
            case 0:
                ((C34712OooOOoo) obj2).f125015OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (AiOcrTextPageEntity[]) obj3);
                return C32460OooOooO.f116667OooO00o;
            case 1:
                InterfaceC24747OooO0O0 connection = (InterfaceC24747OooO0O0) obj;
                C34839o00OO0oo c34839o00OO0oo = ((oo0O) obj2).f125671OooO0OO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
                ArrayList arrayList = (ArrayList) obj3;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("UPDATE OR ABORT `NoteMetaEntity` SET `id` = ?,`user_id` = ?,`title` = ?,`parent_id` = ?,`recover_parent_id` = ?,`is_favorite` = ?,`tn_path` = ?,`tn_width` = ?,`tn_height` = ?,`is_in_trash_bin` = ?,`creation_time` = ?,`last_modification_time` = ?,`sort_key` = ?,`pdf_info_id` = ?,`total_pages_count` = ?,`unbounded_note` = ?,`using_own_pdf` = ?,`lock_added` = ?,`last_opened_time` = ? WHERE `id` = ?");
                try {
                    for (Object obj4 : arrayList) {
                        if (obj4 != null) {
                            c34839o00OO0oo.Oooo0OO(interfaceC24749OooO0OoO0ooOOo, obj4);
                            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                            interfaceC24749OooO0OoO0ooOOo.reset();
                            C24741OooOO0o.OooO0OO(connection);
                        }
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    C24099OooOoO0.OooO0o0(interfaceC24749OooO0OoO0ooOOo, null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C24099OooOoO0.OooO0o0(interfaceC24749OooO0OoO0ooOOo, th);
                        throw th2;
                    }
                }
            default:
                List<String> list = (List) obj3;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo2 = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) obj2);
                try {
                    int i = 1;
                    for (String str : list) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo2.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo2.o000000O(i, str);
                        }
                        i++;
                    }
                    interfaceC24749OooO0OoO0ooOOo2.o00oO0o();
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo2.close();
                    return c32460OooOooO2;
                } catch (Throwable th3) {
                    interfaceC24749OooO0OoO0ooOOo2.close();
                    throw th3;
                }
        }
    }
}
