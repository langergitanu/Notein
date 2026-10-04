package oO0o0oOo;

import android.graphics.RectF;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import com.orion.notein.data.p602db.entity.OutlineEntity;
import java.util.ArrayList;
import o000ooOO.OooOOO0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0oOo.C33898OooO0Oo;
import oo0oO0.C34882o00o00;
import oo0oO0.oo0o0Oo;

/* JADX INFO: renamed from: oO0o0oOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33897OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f122098OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f122099OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f122100OooOoO0;

    public /* synthetic */ C33897OooO0OO(int i, Object obj, Object obj2) {
        this.f122099OooOo0o = i;
        this.f122098OooOo = obj;
        this.f122100OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        int i;
        String strO000OoO;
        int i2;
        Float fValueOf;
        switch (this.f122099OooOo0o) {
            case 0:
                ((C33898OooO0Oo.OooO00o) this.f122100OooOoO0).getClass();
                ((C33898OooO0Oo) this.f122098OooOo).OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            case 1:
                oo0o0Oo oo0o0oo = (oo0o0Oo) this.f122098OooOo;
                oo0o0oo.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from DualLinkRefEntity where page_id = ?");
                String str = (String) this.f122100OooOoO0;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo4 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo5 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.ITEM_ID);
                    int iOooO0Oo6 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_id");
                    int iOooO0Oo7 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source_note_id");
                    int iOooO0Oo8 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo11 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo12 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo13 = OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
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
                        RectF rectFStringToRect = oo0o0oo.f125677OooO0OO.stringToRect(strO000OoO);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            i2 = iOooO0Oo3;
                            fValueOf = null;
                        } else {
                            i2 = iOooO0Oo3;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10));
                        }
                        arrayList.add(new DualLinkRefEntity(strO000OoO2, strO000OoO3, strO000OoO4, rectFStringToRect, strO000OoO5, strO000OoO6, strO000OoO7, j, j2, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13))));
                        iOooO0Oo3 = i2;
                        iOooO0Oo2 = i3;
                        iOooO0Oo = i;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            default:
                ((C34882o00o00) this.f122098OooOo).f125409OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (OutlineEntity[]) this.f122100OooOoO0);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
