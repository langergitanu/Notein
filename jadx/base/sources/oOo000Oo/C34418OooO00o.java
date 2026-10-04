package oOo000Oo;

import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.C34897o00o0OO;

/* JADX INFO: renamed from: oOo000Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C34418OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f123432OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f123433OooOo0o;

    public /* synthetic */ C34418OooO00o(Object obj, int i) {
        this.f123433OooOo0o = i;
        this.f123432OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String strO000OoO;
        int i;
        int i2;
        String strO000OoO2;
        int i3;
        int i4;
        switch (this.f123433OooOo0o) {
            case 0:
                return obj == ((AbstractC34419OooO0O0) this.f123432OooOo) ? "(this Collection)" : String.valueOf(obj);
            default:
                C34897o00o0OO c34897o00o0OO = (C34897o00o0OO) this.f123432OooOo;
                c34897o00o0OO.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from PageEntity where is_in_trash_bin = 1");
                try {
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_spec");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_orientation");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, LayerInfo.PAPER_THEME_LAYER_ID);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_color");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_padding");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_style_json");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_id");
                    C34897o00o0OO c34897o00o0OO2 = c34897o00o0OO;
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_title");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_index");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "history_page_id_list");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation_direction_index");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        PaperOrientation paperOrientationOooOOO = C34897o00o0OO.OooOOO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4));
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12)) != 0;
                        int i6 = iOooO0Oo4;
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13);
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i8 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i8)) {
                            strO000OoO2 = null;
                            i4 = iOooO0Oo;
                            i3 = i7;
                        } else {
                            strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.o000OoO(i8);
                            i3 = i7;
                            i4 = iOooO0Oo;
                        }
                        int i9 = iOooO0Oo16;
                        int i10 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i9);
                        int i11 = iOooO0Oo17;
                        int i12 = iOooO0Oo14;
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i11)) != 0;
                        int i13 = iOooO0Oo18;
                        iOooO0Oo18 = i13;
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(i13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i13);
                        C34897o00o0OO c34897o00o0OO3 = c34897o00o0OO2;
                        List<String> listStringToChildren = c34897o00o0OO3.f125434OooO0OO.stringToChildren(strO000OoO10);
                        int i14 = iOooO0Oo19;
                        arrayList.add(new PageEntity(strO000OoO3, strO000OoO4, strO000OoO5, paperOrientationOooOOO, strO000OoO, i5, strO000OoO6, strO000OoO7, j, j2, strO000OoO8, z, i3, strO000OoO9, strO000OoO2, i10, z2, listStringToChildren, (int) interfaceC24749OooO0OoO0ooOOo.getLong(i14)));
                        iOooO0Oo19 = i14;
                        iOooO0Oo14 = i12;
                        iOooO0Oo17 = i11;
                        c34897o00o0OO2 = c34897o00o0OO3;
                        iOooO0Oo = i4;
                        iOooO0Oo2 = i2;
                        iOooO0Oo3 = i;
                        iOooO0Oo15 = i8;
                        iOooO0Oo4 = i6;
                        iOooO0Oo16 = i9;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
