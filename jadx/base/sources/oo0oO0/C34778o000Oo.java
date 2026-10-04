package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import com.orion.notein.data.p602db.entity.LabelCount;
import com.orion.notein.data.p602db.entity.LabelEntity;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooOO.C24741OooOO0o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0O0oooo.C26378OooOo0O;
import o0O0oooo.C26384OooOoo0;
import o0OO00o0.C26595o00O0o;
import o0OOoOo0.C27794OooO0O0;
import o0OOoOo0.C27797OooO0o;
import o0Oo0oOo.C28319OooOOOO;
import o0oOoOo.C31065Oooo0O0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34778o000Oo implements o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125195OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34780o000Oo0O f125196OooO0O0 = new C34780o000Oo0O();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34781o000Oo0o f125197OooO0OO = new C34781o000Oo0o();

    public C34778o000Oo(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125195OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.o000O0Oo
    public final Object OooO(final long j, C27797OooO0o c27797OooO0o) {
        return C24734OooO0O0.OooO0oo(c27797OooO0o, this.f125195OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0OoO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM labels WHERE id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, j2);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    return C32460OooOooO.f116667OooO00o;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, false, true);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooO00o(final List list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(") AND itemType = 0x11", C22218Oooo.OooO0OO("SELECT * FROM item_label_cross_ref WHERE labelId IN ("), list);
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<Long> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (Long l : list2) {
                        if (l == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.OooO0o(i, l.longValue());
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "labelId");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemType");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemId");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extraInfo");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new ItemLabelCrossRef(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"item_label_cross_ref"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooO0O0(final long j) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000O0oo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM labels WHERE id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, j2);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.INDEX);
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        labelEntity = new LabelEntity(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6));
                    }
                    return labelEntity;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"labels"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooO0OO(final List list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(") AND itemType = 0x21", C22218Oooo.OooO0OO("SELECT * FROM item_label_cross_ref WHERE labelId IN ("), list);
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000O0O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<Long> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (Long l : list2) {
                        if (l == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.OooO0o(i, l.longValue());
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "labelId");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemType");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemId");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extraInfo");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new ItemLabelCrossRef(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"item_label_cross_ref"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooO0Oo() {
        C31065Oooo0O0 c31065Oooo0O0 = new C31065Oooo0O0(1);
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"labels"}, c31065Oooo0O0);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooO0o(final ArrayList arrayList) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("\n        SELECT labelId, COUNT(labelId) as count FROM item_label_cross_ref\n        WHERE itemId IN (");
        C25022OooO0O0.OooO0OO(arrayList.size(), sbOooO0OO);
        sbOooO0OO.append(")");
        sbOooO0OO.append(IOUtils.LINE_SEPARATOR_UNIX);
        sbOooO0OO.append("        GROUP BY labelId");
        final String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0OO, IOUtils.LINE_SEPARATOR_UNIX, "    ");
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000O0oO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                ArrayList<String> arrayList2 = arrayList;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO0OO);
                try {
                    int i = 1;
                    for (String str : arrayList2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList3.add(new LabelCount(interfaceC24749OooO0OoO0ooOOo.getLong(0), (int) interfaceC24749OooO0OoO0ooOOo.getLong(1)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList3;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"item_label_cross_ref"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o000O0Oo
    public final Object OooO0o0(final long j, C27797OooO0o c27797OooO0o) {
        return C24734OooO0O0.OooO0oo(c27797OooO0o, this.f125195OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM item_label_cross_ref WHERE labelId = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, j2);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    return C32460OooOooO.f116667OooO00o;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, false, true);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooO0oO(List list) {
        C26384OooOoo0 c26384OooOoo0 = new C26384OooOoo0(com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(") AND itemType = 0x01", C22218Oooo.OooO0OO("SELECT * FROM item_label_cross_ref WHERE labelId IN ("), list), list, 1);
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"item_label_cross_ref"}, c26384OooOoo0);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooO0oo(final int i) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000O0o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM labels WHERE color = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, i2);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.INDEX);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new LabelEntity(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6)));
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"labels"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o000O0Oo
    public final Object OooOO0(String str, C26595o00O0o c26595o00O0o) {
        return C24734OooO0O0.OooO0oo(c26595o00O0o, this.f125195OooO00o, new C26378OooOo0O(str, 2), true, false);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooOO0O(final List list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(") AND itemType = 0x11", C22218Oooo.OooO0OO("SELECT * FROM item_label_cross_ref WHERE itemId IN ("), list);
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000Oo00
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
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "labelId");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemType");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemId");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extraInfo");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new ItemLabelCrossRef(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"item_label_cross_ref"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooOO0o(String str) {
        C28319OooOOOO c28319OooOOOO = new C28319OooOOOO(str, 2);
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"item_label_cross_ref"}, c28319OooOOOO);
    }

    @Override // oo0oO0.o000O0Oo
    public final Object OooOOO(final ItemLabelCrossRef itemLabelCrossRef, C27794OooO0O0 c27794OooO0O0) {
        return C24734OooO0O0.OooO0oo(c27794OooO0O0, this.f125195OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OO0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125184OooOo0o.f125197OooO0OO.OooOoOO((InterfaceC24747OooO0O0) obj, itemLabelCrossRef);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.o000O0Oo
    public final C24718OooOO0o OooOOO0(final List list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(") AND itemType = 0x01", C22218Oooo.OooO0OO("SELECT * FROM item_label_cross_ref WHERE itemId IN ("), list);
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OOoO
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
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "labelId");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemType");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "itemId");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extraInfo");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new ItemLabelCrossRef(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125195OooO00o, new String[]{"item_label_cross_ref"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o000O0Oo
    public final Object OooOOOO(final int i, final long j, final String str, final String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125195OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OOo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                int i2 = i;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM item_label_cross_ref WHERE labelId = ? AND itemId = ? AND itemType = ? AND extraInfo = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, j2);
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str3);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(3, i2);
                    String str4 = str2;
                    if (str4 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(4);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(4, str4);
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

    @Override // oo0oO0.o000O0Oo
    public final Object OooOOOo(final LabelEntity labelEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125195OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OO00
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j;
                InterfaceC24747OooO0O0 connection = (InterfaceC24747OooO0O0) obj;
                C34780o000Oo0O c34780o000Oo0O = this.f125182OooOo0o.f125196OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
                LabelEntity labelEntity2 = labelEntity;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("INSERT OR REPLACE INTO `labels` (`id`,`name`,`color`,`createdTime`,`modifiedTime`,`index`) VALUES (nullif(?, 0),?,?,?,?,?)");
                try {
                    c34780o000Oo0O.OooO(interfaceC24749OooO0OoO0ooOOo, labelEntity2);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    if (C24741OooOO0o.OooO0OO(connection) == 0) {
                        j = -1;
                    } else {
                        interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("SELECT last_insert_rowid()");
                        try {
                            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                            j = interfaceC24749OooO0OoO0ooOOo.getLong(0);
                            interfaceC24749OooO0OoO0ooOOo.close();
                        } finally {
                        }
                    }
                    return Long.valueOf(j);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }, false, true);
    }

    @Override // oo0oO0.o000O0Oo
    public final Object OooOOo0(final long j, o0OO00o0.o00OO00O o00oo00o) {
        return C24734OooO0O0.OooO0oo(o00oo00o, this.f125195OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OOO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM labels WHERE id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, j2);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "createdTime");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "modifiedTime");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.INDEX);
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        labelEntity = new LabelEntity(interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6));
                    }
                    return labelEntity;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, true, false);
    }
}
