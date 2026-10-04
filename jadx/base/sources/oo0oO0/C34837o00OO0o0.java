package oo0oO0;

import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00OO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34837o00OO0o0 implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String strO000OoO;
        int i;
        int i2;
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteMetaEntity");
        try {
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
                int i7 = iOooO0Oo5;
                String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                int i8 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i6);
                int i9 = iOooO0Oo16;
                Integer num = numValueOf;
                int i10 = iOooO0Oo17;
                int i11 = iOooO0Oo18;
                int i12 = iOooO0Oo19;
                arrayList.add(new NoteMetaEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO, z, strO000OoO6, i4, i5, z2, j, j2, num, strO000OoO7, i8, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i9)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i11)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(i12)));
                iOooO0Oo5 = i7;
                iOooO0Oo18 = i11;
                iOooO0Oo19 = i12;
                iOooO0Oo16 = i9;
                iOooO0Oo4 = i3;
                iOooO0Oo3 = i;
                iOooO0Oo15 = i6;
                iOooO0Oo17 = i10;
                iOooO0Oo2 = i2;
            }
            return arrayList;
        } finally {
            interfaceC24749OooO0OoO0ooOOo.close();
        }
    }
}
