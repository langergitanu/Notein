package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.NotePlaceholderConverter;
import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OO.C26416OooOo0o;
import o0Oo0o00.C28163OooOOo;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OOOOo implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125338OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final NotePlaceholderConverter f125340OooO0OO = new NotePlaceholderConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOOO0 f125339OooO0O0 = new o00OOOO0(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOOO f125341OooO0Oo = new o00OOOO(this);

    public o00OOOOo(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125338OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.o0o0Oo
    public final Object OooO00o(NotePlaceholderEntity[] notePlaceholderEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        notePlaceholderEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125338OooO00o, new C34721OooOooO(this, notePlaceholderEntityArr, 1), false, true);
    }

    @Override // oo0oO0.o0o0Oo
    public final Object OooO0O0(NotePlaceholderEntity[] notePlaceholderEntityArr, AbstractC32476OooO abstractC32476OooO) {
        notePlaceholderEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125338OooO00o, new Oooo000(1, this, notePlaceholderEntityArr), false, true);
    }

    @Override // oo0oO0.o0o0Oo
    public final List<NotePlaceholderEntity> OooO0OO(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125338OooO00o, true, false, new C34724Oooo00O(this, str, 1));
    }

    @Override // oo0oO0.o0o0Oo
    public final Object OooO0Oo(final Set set, C26416OooOo0o c26416OooOo0o) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("select * from NotePlaceholderEntity where id in (");
        C25022OooO0O0.OooO0OO(set.size(), sbOooO0OO);
        sbOooO0OO.append(")");
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c26416OooOo0o, this.f125338OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                Set<String> set2 = set;
                NotePlaceholderConverter notePlaceholderConverter = this.f125329OooOo0o.f125340OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i = 1;
                    for (String str : set2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "file_path");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "uri");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "state");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new NotePlaceholderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), notePlaceholderConverter.stringToUri(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6)), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), notePlaceholderConverter.stringToExtra(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8))));
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

    @Override // oo0oO0.o0o0Oo
    public final NotePlaceholderEntity OooO0o(String str) {
        return (NotePlaceholderEntity) C24734OooO0O0.OooO0o(this.f125338OooO00o, true, false, new C34719OooOoo(this, str, 1));
    }

    @Override // oo0oO0.o0o0Oo
    public final Object OooO0o0(String[] strArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("delete from NotePlaceholderEntity where id in (");
        C25022OooO0O0.OooO0OO(strArr.length, sbOooO0OO);
        sbOooO0OO.append(")");
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125338OooO00o, new C28163OooOOo(2, sbOooO0OO.toString(), strArr), false, true);
    }

    @Override // oo0oO0.o0o0Oo
    public final C24718OooOO0o getAll() {
        C34720OooOoo0 c34720OooOoo0 = new C34720OooOoo0(this, 2);
        return C24720OooOOO0.OooO00o(this.f125338OooO00o, new String[]{"NotePlaceholderEntity"}, c34720OooOoo0);
    }
}
