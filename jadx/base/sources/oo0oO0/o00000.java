package oo0oO0;

import android.graphics.RectF;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.DualLinkSourceConverter;
import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import java.util.ArrayList;
import java.util.List;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o0.C26519Oooooo0;
import o0OoO0.C28510OooO0Oo;
import o0OoO0oo.C28739OooooOO;
import o0OoO0oo.C28742Oooooo0;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000 implements o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125102OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DualLinkSourceConverter f125104OooO0OO = new DualLinkSourceConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34751o000000o f125103OooO0O0 = new C34751o000000o(this);

    public o00000(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125102OooO00o = noteContentDatabase_Impl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.o0O0O00
    public final Object OooO00o(DualLinkSourceEntity[] dualLinkSourceEntityArr, AbstractC32476OooO abstractC32476OooO) {
        dualLinkSourceEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125102OooO00o, new o000000(this, dualLinkSourceEntityArr, 0), false, true);
    }

    @Override // oo0oO0.o0O0O00
    public final void OooO0O0(String str) {
        C24734OooO0O0.OooO0o(this.f125102OooO00o, false, true, new C34777o000OOo(str, 0));
    }

    @Override // oo0oO0.o0O0O00
    public final List<DualLinkSourceEntity> OooO0OO(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125102OooO00o, true, false, new C28739OooooOO(1, this, str));
    }

    @Override // oo0oO0.o0O0O00
    public final void OooO0Oo(String str) {
        C24734OooO0O0.OooO0o(this.f125102OooO00o, false, true, new C28510OooO0Oo(str, 2));
    }

    @Override // oo0oO0.o0O0O00
    public final Object OooO0o(final List list, C26519Oooooo0 c26519Oooooo0) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from DualLinkSourceEntity where id in ("), list);
        return C24734OooO0O0.OooO0oo(c26519Oooooo0, this.f125102OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000000O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                DualLinkSourceConverter dualLinkSourceConverter;
                int i3;
                Float fValueOf;
                DualLinkSourceConverter dualLinkSourceConverter2;
                List<String> list2 = list;
                DualLinkSourceConverter dualLinkSourceConverter3 = this.f125109OooOo0o.f125104OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i4 = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i4);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i4, str);
                        }
                        i4++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text_bounds");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "ref_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "ref_note_id");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        RectF rectFStringToRect = dualLinkSourceConverter3.stringToRect(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5));
                        List<RectF> listStringToRectList = dualLinkSourceConverter3.stringToRectList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6));
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11)) {
                            dualLinkSourceConverter = dualLinkSourceConverter3;
                            i3 = i5;
                            fValueOf = null;
                        } else {
                            dualLinkSourceConverter = dualLinkSourceConverter3;
                            i3 = i5;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11));
                        }
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13));
                        int i6 = iOooO0Oo14;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i6)) {
                            dualLinkSourceConverter2 = dualLinkSourceConverter;
                        } else {
                            dualLinkSourceConverter2 = dualLinkSourceConverter;
                            fValueOf2 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i6));
                        }
                        arrayList.add(new DualLinkSourceEntity(strO000OoO2, strO000OoO3, strO000OoO, i3, rectFStringToRect, listStringToRectList, strO000OoO4, strO000OoO5, j, j2, fValueOf, fValueOf3, fValueOf4, fValueOf2));
                        dualLinkSourceConverter3 = dualLinkSourceConverter2;
                        iOooO0Oo14 = i6;
                        iOooO0Oo2 = i2;
                        iOooO0Oo3 = i;
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

    @Override // oo0oO0.o0O0O00
    public final List<DualLinkSourceEntity> OooO0o0(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125102OooO00o, true, false, new C28742Oooooo0(1, this, str));
    }
}
