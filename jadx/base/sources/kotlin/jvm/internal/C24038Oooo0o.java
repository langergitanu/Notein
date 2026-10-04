package kotlin.jvm.internal;

import Oooo0oO.C21030OooOO0o;
import android.graphics.RectF;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.entity.QuoteConverter;
import com.orion.notein.data.p602db.entity.QuoteEntity;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C24040Oooo0oO;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0Oo0oOo.o0Oo0oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.C34607OooOOo;
import oOoo0.EnumC34609OooOOoo;
import oo0oO0.C34964o00ooOoo;

/* JADX INFO: renamed from: kotlin.jvm.internal.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24038Oooo0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f80946OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f80947OooOo0o;

    public /* synthetic */ C24038Oooo0o(Object obj, int i) {
        this.f80947OooOo0o = i;
        this.f80946OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String strO000OoO;
        ArrayList arrayList;
        int i;
        switch (this.f80947OooOo0o) {
            case 0:
                C34607OooOOo it = (C34607OooOOo) obj;
                OooOOO0.OooO0oO(it, "it");
                ((C24040Oooo0oO) this.f80946OooOo).getClass();
                EnumC34609OooOOoo enumC34609OooOOoo = it.f123975OooO00o;
                if (enumC34609OooOOoo == null) {
                    return C18358t1.g.f56183c;
                }
                String strValueOf = String.valueOf(it.f123976OooO0O0);
                int i2 = C24040Oooo0oO.OooO00o.f80950OooO00o[enumC34609OooOOoo.ordinal()];
                if (i2 == 1) {
                    return strValueOf;
                }
                if (i2 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i2 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new C32442OooOO0o();
            case 1:
                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                OooOOO0.OooO0oO(item, "item");
                String materialId = item.f71088OooO00o;
                OooOOO0.OooO0oO(materialId, "materialId");
                C21030OooOO0o.OooO0OO((DownloadedMaterialListFragment) this.f80946OooOo).OooOOOO(new o0Oo0oo(materialId));
                return C32460OooOooO.f116667OooO00o;
            default:
                QuoteConverter quoteConverter = ((C34964o00ooOoo) this.f80946OooOo).f125575OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from QuoteEntity");
                try {
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bg_color");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "underline_color");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "label_rect");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rect_list");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "anno_item_id_list");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "link_type");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "link_id");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_vertical_pdf_text");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_rtl_or_btt_pdf_text");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2)) {
                            strO000OoO = null;
                            i = iOooO0Oo;
                            arrayList = arrayList2;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                            arrayList = arrayList2;
                            i = iOooO0Oo;
                        }
                        int i3 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3);
                        int i4 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5);
                        int i6 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        RectF rectFStringToLabelRect = quoteConverter.stringToLabelRect(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7));
                        List<RectF> listStringToRectList = quoteConverter.stringToRectList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8));
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9);
                        List<String> listStringToAnnoItemIdList = quoteConverter.stringToAnnoItemIdList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10));
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12);
                        int i8 = iOooO0Oo14;
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(i8);
                        iOooO0Oo14 = i8;
                        int i9 = iOooO0Oo15;
                        QuoteConverter quoteConverter2 = quoteConverter;
                        int i10 = iOooO0Oo3;
                        int i11 = iOooO0Oo16;
                        int i12 = iOooO0Oo2;
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(new QuoteEntity(strO000OoO2, strO000OoO, i3, i4, i5, i6, rectFStringToLabelRect, listStringToRectList, strO000OoO3, listStringToAnnoItemIdList, i7, strO000OoO4, strO000OoO5, j, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i9)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i11)) != 0));
                        iOooO0Oo16 = i11;
                        arrayList2 = arrayList3;
                        iOooO0Oo2 = i12;
                        quoteConverter = quoteConverter2;
                        iOooO0Oo3 = i10;
                        iOooO0Oo15 = i9;
                        iOooO0Oo = i;
                        break;
                    }
                    return arrayList2;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
