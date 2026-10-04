package oo0oO0;

import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteFileEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO.C26413OooOOoo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00O0o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34827o00O0o0O implements InterfaceC34927o00oOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125291OooO00o;

    public C34827o00O0o0O(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125291OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34927o00oOOo
    public final Object OooO00o(final int i, C26413OooOOoo c26413OooOOoo) {
        return C24734OooO0O0.OooO0oo(c26413OooOOoo, this.f125291OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i2;
                int i3;
                int i4;
                int i5;
                Integer numValueOf;
                int i6;
                int i7;
                int i8;
                int i9 = i;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteFileEntity where sync_type = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, i9);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "template_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "folder_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lastModification_time");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_FAVORITE);
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "in_trash_bin");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "file_name");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recycled_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "created_time");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "edited_time");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_history_version_id");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "size");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "db_version");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "using_own_pdf");
                    int iOooO0Oo20 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "lock_added");
                    int iOooO0Oo21 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra");
                    int iOooO0Oo22 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sync_type");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6)) {
                            strO000OoO = null;
                            i3 = iOooO0Oo;
                            i2 = iOooO0Oo2;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                            i2 = iOooO0Oo2;
                            i3 = iOooO0Oo;
                        }
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0;
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        int i10 = iOooO0Oo3;
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9)) != 0;
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        long j3 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13);
                        long j4 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14);
                        int i11 = iOooO0Oo15;
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(i11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i11);
                        int i12 = iOooO0Oo16;
                        long j5 = interfaceC24749OooO0OoO0ooOOo.getLong(i12);
                        int i13 = iOooO0Oo14;
                        int i14 = iOooO0Oo17;
                        int i15 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i14);
                        int i16 = iOooO0Oo18;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i16)) {
                            i4 = i12;
                            i5 = iOooO0Oo4;
                            numValueOf = null;
                            i6 = i15;
                            i8 = iOooO0Oo19;
                            i7 = i16;
                        } else {
                            i4 = i12;
                            i5 = iOooO0Oo4;
                            numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i16));
                            i6 = i15;
                            i7 = i16;
                            i8 = iOooO0Oo19;
                        }
                        boolean z3 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i8)) != 0;
                        iOooO0Oo19 = i8;
                        int i17 = iOooO0Oo20;
                        int i18 = iOooO0Oo21;
                        iOooO0Oo20 = i17;
                        iOooO0Oo21 = i18;
                        int i19 = iOooO0Oo22;
                        arrayList.add(new NoteFileEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, j, strO000OoO, z, strO000OoO6, z2, strO000OoO7, strO000OoO8, j2, j3, j4, strO000OoO9, j5, i6, numValueOf, z3, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i17)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(i18) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i18), (int) interfaceC24749OooO0OoO0ooOOo.getLong(i19)));
                        iOooO0Oo17 = i14;
                        iOooO0Oo14 = i13;
                        iOooO0Oo15 = i11;
                        int i20 = i5;
                        iOooO0Oo18 = i7;
                        iOooO0Oo4 = i20;
                        iOooO0Oo22 = i19;
                        iOooO0Oo3 = i10;
                        iOooO0Oo = i3;
                        iOooO0Oo2 = i2;
                        iOooO0Oo16 = i4;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, true, false);
    }
}
