package oo0oO0;

import android.graphics.RectF;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.QuoteConverter;
import com.orion.notein.data.p602db.entity.QuoteEntity;
import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C24038Oooo0o;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o0.C26621o00Oo0O;
import o0OO00o0.C26622o00Oo0O0;
import o0OO00o0.C26623o00Oo0Oo;
import o0OO00o0.C26624o00Oo0o;
import o0OO00o0.C26625o00Oo0o0;
import o0OO00o0.C26627o00Oo0oo;
import o0OO00o0.C26630o00OoO00;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00ooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34964o00ooOoo extends AbstractC34954o00ooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125573OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final QuoteConverter f125575OooO0OO = new QuoteConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34961o00ooOo f125574OooO0O0 = new C34961o00ooOo(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34963o00ooOoO f125576OooO0Oo = new C34963o00ooOoO();

    public C34964o00ooOoo(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125573OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooO(List list, o0OO00o0.o0oOO o0ooo2) {
        return C24734OooO0O0.OooO0oo(o0ooo2, this.f125573OooO00o, new C34811o000ooo(1, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from QuoteTextAnnoEntity where id in ("), list), list), true, false);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooO00o(final String str, C26623o00Oo0Oo c26623o00Oo0Oo) {
        return C24734OooO0O0.OooO0oo(c26623o00Oo0Oo, this.f125573OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooOo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM QuoteEntity WHERE page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, false, true);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooO0O0(List list, C26621o00Oo0O c26621o00Oo0O) {
        return C24734OooO0O0.OooO0oo(c26621o00Oo0O, this.f125573OooO00o, new C34810o000ooOO(1, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM QuoteEntity where id in ("), list), list), false, true);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooO0OO(final String str, C26625o00Oo0o0 c26625o00Oo0o0) {
        return C24734OooO0O0.OooO0oo(c26625o00Oo0o0, this.f125573OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooOO0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                QuoteConverter quoteConverter = this.f125568OooOo0o.f125575OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from QuoteEntity where id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
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
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        quoteEntity = new QuoteEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), quoteConverter.stringToLabelRect(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7)), quoteConverter.stringToRectList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9), quoteConverter.stringToAnnoItemIdList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10)), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo15)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo16)) != 0);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return quoteEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final C24718OooOO0o OooO0Oo() {
        C24038Oooo0o c24038Oooo0o = new C24038Oooo0o(this, 2);
        return C24720OooOOO0.OooO00o(this.f125573OooO00o, new String[]{"QuoteEntity"}, c24038Oooo0o);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final List<QuoteEntity> OooO0o(final String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125573OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooOOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                ArrayList arrayList;
                int i;
                QuoteConverter quoteConverter = this.f125570OooOo0o.f125575OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from QuoteEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
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
                        int i2 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3);
                        int i3 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        int i4 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5);
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        RectF rectFStringToLabelRect = quoteConverter.stringToLabelRect(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7));
                        List<RectF> listStringToRectList = quoteConverter.stringToRectList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8));
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9);
                        List<String> listStringToAnnoItemIdList = quoteConverter.stringToAnnoItemIdList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10));
                        int i6 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12);
                        int i7 = iOooO0Oo14;
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(i7);
                        QuoteConverter quoteConverter2 = quoteConverter;
                        int i8 = iOooO0Oo15;
                        int i9 = iOooO0Oo13;
                        int i10 = iOooO0Oo16;
                        int i11 = iOooO0Oo2;
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(new QuoteEntity(strO000OoO2, strO000OoO, i2, i3, i4, i5, rectFStringToLabelRect, listStringToRectList, strO000OoO3, listStringToAnnoItemIdList, i6, strO000OoO4, strO000OoO5, j, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i8)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0));
                        quoteConverter = quoteConverter2;
                        iOooO0Oo14 = i7;
                        iOooO0Oo2 = i11;
                        iOooO0Oo15 = i8;
                        iOooO0Oo16 = i10;
                        arrayList2 = arrayList3;
                        iOooO0Oo = i;
                        iOooO0Oo13 = i9;
                    }
                    ArrayList arrayList4 = arrayList2;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList4;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooO0o0(final List list, C26624o00Oo0o c26624o00Oo0o) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from QuoteEntity where id in ("), list);
        return C24734OooO0O0.OooO0oo(c26624o00Oo0o, this.f125573OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooO0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                ArrayList arrayList;
                int i;
                List<String> list2 = list;
                QuoteConverter quoteConverter = this.f125561OooOo0o.f125575OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i2 = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str);
                        }
                        i2++;
                    }
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
                        int i7 = iOooO0Oo14;
                        QuoteConverter quoteConverter2 = quoteConverter;
                        int i8 = iOooO0Oo15;
                        int i9 = iOooO0Oo13;
                        int i10 = iOooO0Oo16;
                        int i11 = iOooO0Oo2;
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(new QuoteEntity(strO000OoO2, strO000OoO, i3, i4, i5, i6, rectFStringToLabelRect, listStringToRectList, strO000OoO3, listStringToAnnoItemIdList, (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13), interfaceC24749OooO0OoO0ooOOo.getLong(i7), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i8)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i10)) != 0));
                        iOooO0Oo14 = i7;
                        arrayList2 = arrayList3;
                        iOooO0Oo2 = i11;
                        iOooO0Oo16 = i10;
                        quoteConverter = quoteConverter2;
                        iOooO0Oo13 = i9;
                        iOooO0Oo15 = i8;
                        iOooO0Oo = i;
                    }
                    ArrayList arrayList4 = arrayList2;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList4;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooO0oO(String str, C26627o00Oo0oo c26627o00Oo0oo) {
        return C24734OooO0O0.OooO0oo(c26627o00Oo0oo, this.f125573OooO00o, new o0OoO0oo.o00OO00O(str, 1), true, false);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final C24718OooOO0o OooO0oo(final List list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from QuoteTextAnnoEntity where id in ("), list);
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "username");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modified_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new QuoteTextAnnoEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125573OooO00o, new String[]{"QuoteTextAnnoEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooOO0(final QuoteEntity[] quoteEntityArr, C26622o00Oo0O0 c26622o00Oo0O0) {
        quoteEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26622o00Oo0O0, this.f125573OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125557OooOo0o.f125574OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, quoteEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.AbstractC34954o00ooO0
    public final Object OooOO0O(final QuoteTextAnnoEntity[] quoteTextAnnoEntityArr, C26630o00OoO00 c26630o00OoO00) {
        quoteTextAnnoEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26630o00OoO00, this.f125573OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125566OooOo0o.f125576OooO0Oo.OooOoo0((InterfaceC24747OooO0O0) obj, quoteTextAnnoEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }
}
