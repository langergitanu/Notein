package o0o0O00O;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.entity.DownloadedMaterialEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0O0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107717OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107718OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f107718OooOo0o = i;
        this.f107717OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        int i;
        int i2;
        String strO000OoO;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        Integer numValueOf;
        switch (this.f107718OooOo0o) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                ((LabelContainerFragment) this.f107717OooOo).OooOoo().OooOoo(num);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM downloaded_material WHERE title LIKE '%' || ? || '%' OR author_name LIKE '%' || ? || '%' ORDER BY saved_at DESC");
                String str2 = (String) this.f107717OooOo;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "subtype");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_url");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "preview_url");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "description");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "entitlement");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "download_url");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "file_size");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "author_id");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "author_name");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "author_description");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "author_avatar_url");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "spec_json");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "version");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "saved_at");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9);
                        Long lValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10));
                        String strO000OoO11 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        String strO000OoO12 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12);
                        String strO000OoO13 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14)) {
                            int i7 = iOooO0Oo;
                            i = iOooO0Oo15;
                            i2 = i7;
                            strO000OoO = null;
                        } else {
                            int i8 = iOooO0Oo;
                            i = iOooO0Oo15;
                            i2 = i8;
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        }
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i)) {
                            int i9 = iOooO0Oo16;
                            i3 = i;
                            i4 = i9;
                            str = null;
                        } else {
                            String strO000OoO14 = interfaceC24749OooO0OoO0ooOOo.o000OoO(i);
                            int i10 = iOooO0Oo16;
                            i3 = i;
                            i4 = i10;
                            str = strO000OoO14;
                        }
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i4)) {
                            i5 = iOooO0Oo2;
                            numValueOf = null;
                            i6 = iOooO0Oo3;
                        } else {
                            i5 = iOooO0Oo2;
                            i6 = iOooO0Oo3;
                            numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(i4));
                        }
                        int i11 = iOooO0Oo17;
                        arrayList.add(new DownloadedMaterialEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO6, strO000OoO7, strO000OoO8, strO000OoO9, strO000OoO10, lValueOf, strO000OoO11, strO000OoO12, strO000OoO13, strO000OoO, str, numValueOf, interfaceC24749OooO0OoO0ooOOo.getLong(i11)));
                        int i12 = i4;
                        iOooO0Oo = i2;
                        iOooO0Oo15 = i3;
                        iOooO0Oo16 = i12;
                        iOooO0Oo17 = i11;
                        iOooO0Oo2 = i5;
                        iOooO0Oo3 = i6;
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
