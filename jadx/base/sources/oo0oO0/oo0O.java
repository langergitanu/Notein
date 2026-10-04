package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0O0oo0.C26206OooOOo;
import o0OOO00o.C26991OooO0oO;
import o0OOO00o.C26992OooO0oo;
import o0OOO00o.C26993OooOO0o;
import o0OOO00o.C26996OooOOo0;
import o0OOo0o.C27587o00ooO0O;
import o0Ooo.C29261OooOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class oo0O implements InterfaceC34824o00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125669OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34838o00OO0oO f125670OooO0O0 = new C34838o00OO0oO(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34839o00OO0oo f125671OooO0OO = new C34839o00OO0oo();

    public oo0O(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125669OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooO(final List list, final String str, C26993OooOO0o c26993OooOO0o) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("select id, title from NoteMetaEntity where id in (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and user_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c26993OooOO0o, this.f125669OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0oo
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
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(0);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(1)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(1);
                        }
                        arrayList.add(new C34828o00O0o0o(strO000OoO2, strO000OoO));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final C24718OooOO0o OooO00o(String str) {
        C34836o00OO0o c34836o00OO0o = new C34836o00OO0o(str, 0);
        return C24720OooOOO0.OooO00o(this.f125669OooO00o, new String[]{"NoteMetaEntity"}, c34836o00OO0o);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final C24718OooOO0o OooO0O0(final String str, final String str2) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OO000
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteMetaEntity where id = ? and user_id = ?");
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
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_width");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_height");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "total_pages_count");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "using_own_pdf");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lock_added");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_opened_time");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        noteMetaEntity = new NoteMetaEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo15), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo16)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo17)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo18)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo19));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return noteMetaEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125669OooO00o, new String[]{"NoteMetaEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final C24718OooOO0o OooO0OO(String str) {
        C29261OooOO0 c29261OooOO0 = new C29261OooOO0(str, 1);
        return C24720OooOOO0.OooO00o(this.f125669OooO00o, new String[]{"NoteMetaEntity"}, c29261OooOO0);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooO0Oo(String str, String str2, o0OOo0o.o0O0O00 o0o0o00) {
        return C24734OooO0O0.OooO0oo(o0o0o00, this.f125669OooO00o, new OooOOO(1, str, str2), true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final C24718OooOO0o OooO0o(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0ooo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteMetaEntity where is_favorite = 1 and is_in_trash_bin = 0 and user_id = ?");
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
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_width");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_height");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "total_pages_count");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "using_own_pdf");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lock_added");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_opened_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0;
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        int i3 = iOooO0Oo4;
                        int i4 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0;
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13));
                        int i6 = iOooO0Oo15;
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i6);
                        int i8 = iOooO0Oo16;
                        int i9 = iOooO0Oo14;
                        int i10 = iOooO0Oo17;
                        int i11 = iOooO0Oo18;
                        int i12 = iOooO0Oo19;
                        arrayList.add(new NoteMetaEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO, z, strO000OoO6, i4, i5, z2, j, j2, numValueOf, strO000OoO7, i7, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i8)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i11)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(i12)));
                        iOooO0Oo17 = i10;
                        iOooO0Oo14 = i9;
                        iOooO0Oo16 = i8;
                        iOooO0Oo18 = i11;
                        iOooO0Oo19 = i12;
                        iOooO0Oo4 = i3;
                        iOooO0Oo2 = i2;
                        iOooO0Oo15 = i6;
                        iOooO0Oo3 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125669OooO00o, new String[]{"NoteMetaEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooO0o0(String str, C27587o00ooO0O c27587o00ooO0O) {
        return C24734OooO0O0.OooO0oo(c27587o00ooO0O, this.f125669OooO00o, new C34830o00O0oOO(str, 0), true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final C24718OooOO0o OooO0oO(final String str, final String str2) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OO0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteMetaEntity where parent_id = ? and user_id = ?");
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
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_width");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_height");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "total_pages_count");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "using_own_pdf");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lock_added");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_opened_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0;
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        int i3 = iOooO0Oo4;
                        int i4 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0;
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13));
                        int i6 = iOooO0Oo15;
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i6);
                        int i8 = iOooO0Oo16;
                        int i9 = iOooO0Oo14;
                        int i10 = iOooO0Oo17;
                        int i11 = iOooO0Oo18;
                        int i12 = iOooO0Oo19;
                        arrayList.add(new NoteMetaEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO, z, strO000OoO6, i4, i5, z2, j, j2, numValueOf, strO000OoO7, i7, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i8)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i11)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(i12)));
                        iOooO0Oo17 = i10;
                        iOooO0Oo14 = i9;
                        iOooO0Oo16 = i8;
                        iOooO0Oo18 = i11;
                        iOooO0Oo19 = i12;
                        iOooO0Oo4 = i3;
                        iOooO0Oo2 = i2;
                        iOooO0Oo15 = i6;
                        iOooO0Oo3 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125669OooO00o, new String[]{"NoteMetaEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooO0oo(ArrayList arrayList, C26996OooOOo0 c26996OooOOo0) {
        return C24734OooO0O0.OooO0oo(c26996OooOOo0, this.f125669OooO00o, new C34709OooOOOo(1, this, arrayList), false, true);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOO0(final NoteMetaEntity[] noteMetaEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125669OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OO00O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125313OooOo0o.f125671OooO0OO.OoooOOO((InterfaceC24747OooO0O0) obj, noteMetaEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOO0O(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125669OooO00o, new C34835o00OO00o(str, str2, 0), true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOO0o(NoteMetaEntity[] noteMetaEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125669OooO00o, new C34704OooO0Oo(this, noteMetaEntityArr, 1), false, true);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOOO(String str, o0OOo0o.o0O0O00 o0o0o00) {
        return C24734OooO0O0.OooO0oo(o0o0o00, this.f125669OooO00o, new o00O(str, 0), true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOOO0(final List list, final String str, C26992OooO0oo c26992OooO0oo) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("select * from NoteMetaEntity where id in (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and user_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c26992OooO0oo, this.f125669OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OO0OO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i3 = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i3);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i3, str2);
                        }
                        i3++;
                    }
                    int i4 = size + 1;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i4);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i4, str3);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_width");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_height");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "total_pages_count");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "using_own_pdf");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lock_added");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_opened_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0;
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        int i5 = iOooO0Oo4;
                        int i6 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0;
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13));
                        int i8 = iOooO0Oo15;
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i9 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i8);
                        int i10 = iOooO0Oo16;
                        int i11 = iOooO0Oo14;
                        int i12 = iOooO0Oo17;
                        int i13 = iOooO0Oo18;
                        int i14 = iOooO0Oo19;
                        arrayList.add(new NoteMetaEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO, z, strO000OoO6, i6, i7, z2, j, j2, numValueOf, strO000OoO7, i9, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i12)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i13)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(i14)));
                        iOooO0Oo17 = i12;
                        iOooO0Oo14 = i11;
                        iOooO0Oo16 = i10;
                        iOooO0Oo18 = i13;
                        iOooO0Oo19 = i14;
                        iOooO0Oo4 = i5;
                        iOooO0Oo2 = i2;
                        iOooO0Oo15 = i8;
                        iOooO0Oo3 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final C24718OooOO0o OooOOOO(String str) {
        o00OO0 o00oo02 = new o00OO0(str, 0);
        return C24720OooOOO0.OooO00o(this.f125669OooO00o, new String[]{"NoteMetaEntity"}, o00oo02);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOOOo(String str, String str2, o0OOO00o.OooO00o oooO00o) {
        return C24734OooO0O0.OooO0oo(oooO00o, this.f125669OooO00o, new C34831o00O0oOo(str, str2, 0), false, true);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOOo(o0OOO00o.OooOOOO oooOOOO) {
        return C24734OooO0O0.OooO0oo(oooOOOO, this.f125669OooO00o, new C34829o00O0oO(), true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOOo0(C26991OooO0oO c26991OooO0oO) {
        return C24734OooO0O0.OooO0oo(c26991OooO0oO, this.f125669OooO00o, new C34837o00OO0o0(), true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOOoo(final String str, final String str2, o0OOO00o.OooOO0 oooOO02) {
        return C24734OooO0O0.OooO0oo(oooOO02, this.f125669OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OO0O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteMetaEntity where parent_id = ? and user_id = ?");
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
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_width");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_height");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "total_pages_count");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "using_own_pdf");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lock_added");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_opened_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0;
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        int i3 = iOooO0Oo4;
                        int i4 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0;
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13));
                        int i6 = iOooO0Oo15;
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i6);
                        int i8 = iOooO0Oo16;
                        int i9 = iOooO0Oo14;
                        int i10 = iOooO0Oo17;
                        int i11 = iOooO0Oo18;
                        int i12 = iOooO0Oo19;
                        arrayList.add(new NoteMetaEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO, z, strO000OoO6, i4, i5, z2, j, j2, numValueOf, strO000OoO7, i7, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i8)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i11)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(i12)));
                        iOooO0Oo17 = i10;
                        iOooO0Oo14 = i9;
                        iOooO0Oo16 = i8;
                        iOooO0Oo18 = i11;
                        iOooO0Oo19 = i12;
                        iOooO0Oo4 = i3;
                        iOooO0Oo2 = i2;
                        iOooO0Oo15 = i6;
                        iOooO0Oo3 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final Object OooOo0(String str, o0OOO00o.OooO0o oooO0o) {
        return C24734OooO0O0.OooO0oo(oooO0o, this.f125669OooO00o, new C26206OooOOo(str, 2), true, false);
    }

    @Override // oo0oO0.InterfaceC34824o00O0o
    public final C24718OooOO0o OooOo00(final String str, final List list) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("select * from NoteMetaEntity where id in (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and user_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0oo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i3 = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i3);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i3, str2);
                        }
                        i3++;
                    }
                    int i4 = size + 1;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i4);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i4, str3);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_width");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_height");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "total_pages_count");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "using_own_pdf");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lock_added");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_opened_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0;
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        int i5 = iOooO0Oo4;
                        int i6 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0;
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13));
                        int i8 = iOooO0Oo15;
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i9 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i8);
                        int i10 = iOooO0Oo16;
                        int i11 = iOooO0Oo14;
                        int i12 = iOooO0Oo17;
                        int i13 = iOooO0Oo18;
                        int i14 = iOooO0Oo19;
                        arrayList.add(new NoteMetaEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO, z, strO000OoO6, i6, i7, z2, j, j2, numValueOf, strO000OoO7, i9, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i12)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i13)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(i14)));
                        iOooO0Oo17 = i12;
                        iOooO0Oo14 = i11;
                        iOooO0Oo16 = i10;
                        iOooO0Oo18 = i13;
                        iOooO0Oo19 = i14;
                        iOooO0Oo4 = i5;
                        iOooO0Oo2 = i2;
                        iOooO0Oo15 = i8;
                        iOooO0Oo3 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125669OooO00o, new String[]{"NoteMetaEntity"}, interfaceC32507OooOO0o);
    }
}
