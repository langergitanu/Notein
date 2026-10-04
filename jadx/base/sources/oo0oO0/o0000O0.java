package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.List;
import o000O0oo.C24427OooOOOo;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OOoooO.C27997OooO0O0;
import o0OOoooO.C27998OooO0OO;
import o0OOoooO.C27999OooO0Oo;
import o0OOoooO.C28005OooOO0O;
import o0OOoooO.C28007OooOOO;
import o0OOoooO.C28008OooOOO0;
import o0OoO0.C28520OooOOoo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class o0000O0 implements o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125130OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34769o0000oo f125131OooO0O0 = new C34769o0000oo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34765o0000oO f125132OooO0OO = new C34765o0000oO();

    public o0000O0(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125130OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.o00000O0
    public final C24718OooOO0o OooO(String str) {
        com.orion.penkit.models.OooO0o oooO0o = new com.orion.penkit.models.OooO0o(str, 1);
        return C24720OooOOO0.OooO00o(this.f125130OooO00o, new String[]{"FolderEntity"}, oooO0o);
    }

    @Override // oo0oO0.o00000O0
    public final C24718OooOO0o OooO00o(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000Ooo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM FolderEntity where is_in_trash_bin = 0 and user_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo2;
                        int i2 = iOooO0Oo3;
                        arrayList.add(new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12))));
                        iOooO0Oo3 = i2;
                        iOooO0Oo2 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125130OooO00o, new String[]{"FolderEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o00000O0
    public final void OooO0O0(String str) {
        C24734OooO0O0.OooO0o(this.f125130OooO00o, false, true, new o0o0O0O0.OooO0OO(str, 1));
    }

    @Override // oo0oO0.o00000O0
    public final FolderEntity OooO0OO(final String str, final String str2) {
        return (FolderEntity) C24734OooO0O0.OooO0o(this.f125130OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00000oo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from FolderEntity where id = ? and user_id = ?");
                String str3 = str;
                try {
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str3);
                    }
                    String str4 = str2;
                    if (str4 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str4);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        folderEntity = new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return folderEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.o00000O0
    public final FolderEntity OooO0Oo(String str) {
        return (FolderEntity) C24734OooO0O0.OooO0o(this.f125130OooO00o, true, false, new C24427OooOOOo(str, 3));
    }

    @Override // oo0oO0.o00000O0
    public final C24718OooOO0o OooO0o(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00000oO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from FolderEntity where parent_id is null and is_in_trash_bin = 0 and user_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo2;
                        int i2 = iOooO0Oo3;
                        arrayList.add(new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12))));
                        iOooO0Oo3 = i2;
                        iOooO0Oo2 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125130OooO00o, new String[]{"FolderEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o00000O0
    public final C24718OooOO0o OooO0o0(final String str, final List list) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("select * from FolderEntity where id in (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and user_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00000Oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str2);
                        }
                        i++;
                    }
                    int i2 = size + 1;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str3);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i3 = iOooO0Oo2;
                        int i4 = iOooO0Oo3;
                        arrayList.add(new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12))));
                        iOooO0Oo3 = i4;
                        iOooO0Oo2 = i3;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125130OooO00o, new String[]{"FolderEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o00000O0
    public final List<FolderEntity> OooO0oO(String str, String str2) {
        return (List) C24734OooO0O0.OooO0o(this.f125130OooO00o, true, false, new o00000O(str, str2));
    }

    @Override // oo0oO0.o00000O0
    public final Object OooO0oo(C27998OooO0OO c27998OooO0OO) {
        return C24734OooO0O0.OooO0oo(c27998OooO0OO, this.f125130OooO00o, new C28520OooOOoo(1), true, false);
    }

    @Override // oo0oO0.o00000O0
    public final Object OooOO0(String str, C27999OooO0Oo c27999OooO0Oo) {
        return C24734OooO0O0.OooO0oo(c27999OooO0Oo, this.f125130OooO00o, new o0OoO0.OooOOOO(str, 1), true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.o00000O0
    public final Object OooOO0O(FolderEntity[] folderEntityArr, C28007OooOOO c28007OooOOO) {
        folderEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c28007OooOOO, this.f125130OooO00o, new C34753o00000o0(this, folderEntityArr, 0), false, true);
    }

    @Override // oo0oO0.o00000O0
    public final C24718OooOO0o OooOO0o(String str, String str2) {
        o00000OO o00000oo2 = new o00000OO(str, str2);
        return C24720OooOOO0.OooO00o(this.f125130OooO00o, new String[]{"FolderEntity"}, o00000oo2);
    }

    @Override // oo0oO0.o00000O0
    public final Object OooOOO(C28005OooOO0O c28005OooOO0O) {
        return C24734OooO0O0.OooO0oo(c28005OooOO0O, this.f125130OooO00o, new o0OOO0O0.OooO(1), true, false);
    }

    @Override // oo0oO0.o00000O0
    public final Object OooOOO0(final FolderEntity[] folderEntityArr, C27997OooO0O0 c27997OooO0O0) {
        return C24734OooO0O0.OooO0oo(c27997OooO0O0, this.f125130OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125101OooOo0o.f125131OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, folderEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.o00000O0
    public final C24718OooOO0o OooOOOO(String str) {
        o0OoO0.OooOOO0 oooOOO0 = new o0OoO0.OooOOO0(str, 1);
        return C24720OooOOO0.OooO00o(this.f125130OooO00o, new String[]{"FolderEntity"}, oooOOO0);
    }

    @Override // oo0oO0.o00000O0
    public final Object OooOOOo(C28008OooOOO0 c28008OooOOO0) {
        return C24734OooO0O0.OooO0oo(c28008OooOOO0, this.f125130OooO00o, new o0000O00(), true, false);
    }
}
