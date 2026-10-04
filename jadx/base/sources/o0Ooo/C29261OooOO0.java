package o0Ooo;

import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Ooo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29261OooOO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103762OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103763OooOo0o;

    public /* synthetic */ C29261OooOO0(Object obj, int i) {
        this.f103763OooOo0o = i;
        this.f103762OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String strO000OoO;
        int i;
        int i2;
        Object obj2 = this.f103762OooOo;
        switch (this.f103763OooOo0o) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                int i3 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj2;
                penBoxChildFragment.Oooo0o().OooOOo0(true, num);
                penBoxChildFragment.Oooooo(11, num);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteMetaEntity where parent_id is null and is_in_trash_bin = 1 and user_id = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
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
                        int i4 = iOooO0Oo4;
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        int i6 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0;
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13));
                        int i7 = iOooO0Oo15;
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i8 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i7);
                        int i9 = iOooO0Oo16;
                        boolean z3 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i9)) != 0;
                        int i10 = iOooO0Oo17;
                        int i11 = iOooO0Oo18;
                        int i12 = iOooO0Oo5;
                        int i13 = iOooO0Oo19;
                        arrayList.add(new NoteMetaEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO, z, strO000OoO6, i5, i6, z2, j, j2, numValueOf, strO000OoO7, i8, z3, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i11)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(i13)));
                        iOooO0Oo19 = i13;
                        iOooO0Oo5 = i12;
                        iOooO0Oo4 = i4;
                        iOooO0Oo18 = i11;
                        iOooO0Oo15 = i7;
                        iOooO0Oo16 = i9;
                        iOooO0Oo3 = i;
                        iOooO0Oo17 = i10;
                        iOooO0Oo2 = i2;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
