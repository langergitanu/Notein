package oo0oO0;

import android.graphics.RectF;
import com.aspose.slides.C22218Oooo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.DualLinkRefConverter;
import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.ArrayList;
import java.util.List;
import o000oo0.C24672OooOo0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o0.C26500Oooo0o0;
import o0oO0O00.C30774OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0oOo.C33897OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public final class oo0o0Oo implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125675OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DualLinkRefConverter f125677OooO0OO = new DualLinkRefConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0Oo0oo f125676OooO0O0 = new o0Oo0oo(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OO00O f125678OooO0Oo = new o0OO00O(this);

    public oo0o0Oo(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125675OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.oo000o
    public final Object OooO(final List list, o0OO00o0.Oooo000 oooo000) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from DualLinkRefEntity where id in ("), list);
        return C24734OooO0O0.OooO0oo(oooo000, this.f125675OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0ooOO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i;
                String strO000OoO;
                oo0o0Oo oo0o0oo;
                Float fValueOf;
                List<String> list2 = list;
                oo0o0Oo oo0o0oo2 = this.f125658OooOo0o;
                oo0o0oo2.getClass();
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
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.ITEM_ID);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_note_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4)) {
                            i = iOooO0Oo;
                            strO000OoO = null;
                        } else {
                            i = iOooO0Oo;
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        }
                        int i3 = iOooO0Oo2;
                        RectF rectFStringToRect = oo0o0oo2.f125677OooO0OO.stringToRect(strO000OoO);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            oo0o0oo = oo0o0oo2;
                            fValueOf = null;
                        } else {
                            oo0o0oo = oo0o0oo2;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10));
                        }
                        arrayList.add(new DualLinkRefEntity(strO000OoO2, strO000OoO3, strO000OoO4, rectFStringToRect, strO000OoO5, strO000OoO6, strO000OoO7, j, j2, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13))));
                        oo0o0oo2 = oo0o0oo;
                        iOooO0Oo2 = i3;
                        iOooO0Oo = i;
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

    @Override // oo0oO0.oo000o
    public final void OooO0O0(final String str) {
        C24734OooO0O0.OooO0o(this.f125675OooO00o, false, true, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oO0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from DualLinkRefEntity where id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.oo000o
    public final List<DualLinkRefEntity> OooO0OO(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125675OooO00o, true, false, new C33897OooO0OO(1, this, str));
    }

    @Override // oo0oO0.oo000o
    public final void OooO0Oo(String str) {
        C24734OooO0O0.OooO0o(this.f125675OooO00o, false, true, new C30774OooO0Oo(str, 1));
    }

    @Override // oo0oO0.oo000o
    public final Object OooO0o(final DualLinkRefEntity[] dualLinkRefEntityArr, C26500Oooo0o0 c26500Oooo0o0) {
        dualLinkRefEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26500Oooo0o0, this.f125675OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0ooOOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125661OooOo0o.f125678OooO0Oo.OoooOOO((InterfaceC24747OooO0O0) obj, dualLinkRefEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.oo000o
    public final List<DualLinkRefEntity> OooO0o0(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125675OooO00o, true, false, new o0OOO0o(this, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.oo000o
    public final Object OooO0oo(DualLinkRefEntity[] dualLinkRefEntityArr, AbstractC32476OooO abstractC32476OooO) {
        dualLinkRefEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125675OooO00o, new C34992o0ooOoO(this, dualLinkRefEntityArr, 0), false, true);
    }

    @Override // oo0oO0.oo000o
    public final List<DualLinkRefEntity> OooOO0(final List<String> list) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from DualLinkRefEntity where page_id in ("), list);
        return (List) C24734OooO0O0.OooO0o(this.f125675OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i;
                String strO000OoO;
                oo0o0Oo oo0o0oo;
                Float fValueOf;
                List<String> list2 = list;
                oo0o0Oo oo0o0oo2 = this.f125498OooOo0o;
                oo0o0oo2.getClass();
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
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.ITEM_ID);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_note_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4)) {
                            i = iOooO0Oo;
                            strO000OoO = null;
                        } else {
                            i = iOooO0Oo;
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        }
                        int i3 = iOooO0Oo2;
                        RectF rectFStringToRect = oo0o0oo2.f125677OooO0OO.stringToRect(strO000OoO);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            oo0o0oo = oo0o0oo2;
                            fValueOf = null;
                        } else {
                            oo0o0oo = oo0o0oo2;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10));
                        }
                        arrayList.add(new DualLinkRefEntity(strO000OoO2, strO000OoO3, strO000OoO4, rectFStringToRect, strO000OoO5, strO000OoO6, strO000OoO7, j, j2, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13))));
                        oo0o0oo2 = oo0o0oo;
                        iOooO0Oo2 = i3;
                        iOooO0Oo = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.oo000o
    public final List<DualLinkRefEntity> getAll() {
        return (List) C24734OooO0O0.OooO0o(this.f125675OooO00o, true, false, new C24672OooOo0(this, 2));
    }
}
