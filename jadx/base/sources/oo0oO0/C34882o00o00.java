package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.hihonor.honorid.core.data.ChildrenInfo;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.OutlineConverter;
import com.orion.notein.data.p602db.entity.OutlineEntity;
import com.orion.notein.data.p602db.entity.OutlineUpdateQuoteEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OO00o0.C26611o00OOOo;
import o0OO00o0.C26612o00OOOo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0oOo.C33897OooO0OO;

/* JADX INFO: renamed from: oo0oO0.o00o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34882o00o00 implements InterfaceC34877o00OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125408OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OutlineConverter f125410OooO0OO = new OutlineConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34885o00o000O f125409OooO0O0 = new C34885o00o000O(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34886o00o000o f125411OooO0Oo = new C34886o00o000o(this);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo00oO f125412OooO0o0 = new oo00oO();

    public C34882o00o00(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125408OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO(String str, o0OO00o0.o00OOO0O o00ooo0o) {
        return C24734OooO0O0.OooO0oo(o00ooo0o, this.f125408OooO00o, new C34777o000OOo(str, 1), false, true);
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO00o(String str, o0OO00o0.o00OOOOo o00ooooo2) {
        return C24734OooO0O0.OooO0oo(o00ooooo2, this.f125408OooO00o, new o000000(this, str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO0O0(final OutlineEntity[] outlineEntityArr, C26611o00OOOo c26611o00OOOo) {
        outlineEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26611o00OOOo, this.f125408OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OoooO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125401OooOo0o.f125411OooO0Oo.OoooOOO((InterfaceC24747OooO0O0) obj, outlineEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO0OO(OutlineEntity[] outlineEntityArr, AbstractC32476OooO abstractC32476OooO) {
        outlineEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125408OooO00o, new C33897OooO0OO(2, this, outlineEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO0Oo(final OutlineUpdateQuoteEntity[] outlineUpdateQuoteEntityArr, C26612o00OOOo0 c26612o00OOOo0) {
        return C24734OooO0O0.OooO0oo(c26612o00OOOo0, this.f125408OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00Ooooo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125403OooOo0o.f125412OooO0o0.OoooOOO((InterfaceC24747OooO0O0) obj, outlineUpdateQuoteEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO0o(String str, o0OO00o0.o00OOO o00ooo2) {
        return C24734OooO0O0.OooO0oo(o00ooo2, this.f125408OooO00o, new C34992o0ooOoO(this, str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO0o0(final String str, o0OO00o0.o0o0Oo o0o0oo) {
        return C24734OooO0O0.OooO0oo(o0o0oo, this.f125408OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o0000
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                C34882o00o00 c34882o00o00 = this.f125416OooOo0o;
                c34882o00o00.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from OutlineEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "quote_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, ChildrenInfo.TAG_CHILDREN_INFO);
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        }
                        arrayList.add(new OutlineEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO6, strO000OoO7, c34882o00o00.f125410OooO0OO.stringToChildren(strO000OoO), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9)));
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

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooO0oO(final String str, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125408OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O00o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                C34882o00o00 c34882o00o00 = this.f125622OooOo0o;
                c34882o00o00.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from OutlineEntity where note_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "quote_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, ChildrenInfo.TAG_CHILDREN_INFO);
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        }
                        arrayList.add(new OutlineEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO6, strO000OoO7, c34882o00o00.f125410OooO0OO.stringToChildren(strO000OoO), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9)));
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

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final C24718OooOO0o OooO0oo(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o000
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                C34882o00o00 c34882o00o00 = this.f125414OooOo0o;
                c34882o00o00.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from OutlineEntity where note_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "quote_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, ChildrenInfo.TAG_CHILDREN_INFO);
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        }
                        arrayList.add(new OutlineEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO5, strO000OoO6, strO000OoO7, c34882o00o00.f125410OooO0OO.stringToChildren(strO000OoO), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125408OooO00o, new String[]{"OutlineEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34877o00OooOo
    public final Object OooOO0(String[] strArr, o0OO00o0.o00OOO0 o00ooo02) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("delete from OutlineEntity where id in (");
        C25022OooO0O0.OooO0OO(strArr.length, sbOooO0OO);
        sbOooO0OO.append(")");
        return C24734OooO0O0.OooO0oo(o00ooo02, this.f125408OooO00o, new o0OOO0o(sbOooO0OO.toString(), strArr), false, true);
    }
}
