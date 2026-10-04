package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.StickerEntity;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OOO0oo.C27064OooO0O0;
import o0OOO0oo.C27071OooOO0;
import o0OOo0o.C27535o00o0Ooo;
import o0OoO000.C28592o0000oOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o0O000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34978o0O000o implements o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O000o0 f125609OooO0O0 = new o0O000o0();

    public C34978o0O000o(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125608OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.o0O000
    public final C24718OooOO0o OooO00o(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O000O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from StickerEntity where parent_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "path");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_used_time");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "built_in");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "svg_aspect_ratio");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new StickerEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5)) != 0, (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125608OooO00o, new String[]{"StickerEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o0O000
    public final Object OooO0O0(final StickerEntity[] stickerEntityArr, AbstractC32476OooO abstractC32476OooO) {
        stickerEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125608OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O000Oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125607OooOo0o.f125609OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, stickerEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.o0O000
    public final Object OooO0OO(String str, C27064OooO0O0 c27064OooO0O0) {
        return C24734OooO0O0.OooO0oo(c27064OooO0O0, this.f125608OooO00o, new C28592o0000oOo(str, 2), false, true);
    }

    @Override // oo0oO0.o0O000
    public final Object OooO0Oo(final List list, final String str, C27071OooOO0 c27071OooOO0) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("select * from StickerEntity where id in (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and parent_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c27071OooOO0, this.f125608OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0OoOoOO
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
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "path");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_used_time");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "built_in");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "svg_aspect_ratio");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new StickerEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5)) != 0, (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6)));
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

    @Override // oo0oO0.o0O000
    public final Object OooO0o0(final ArrayList arrayList, final String str, C27535o00o0Ooo c27535o00o0Ooo) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("delete from StickerEntity where id in (");
        final int size = arrayList.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and parent_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c27535o00o0Ooo, this.f125608OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0OoOoOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                ArrayList<String> arrayList2 = arrayList;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i = 1;
                    for (String str2 : arrayList2) {
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
}
