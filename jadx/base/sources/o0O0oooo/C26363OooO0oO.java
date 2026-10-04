package o0O0oooo;

import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0O0oooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26363OooO0oO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90466OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90467OooOo0o;

    public /* synthetic */ C26363OooO0oO(Object obj, int i) {
        this.f90467OooOo0o = i;
        this.f90466OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        C32465OooO0O0 c32465OooO0O0OooO0O0;
        switch (this.f90467OooOo0o) {
            case 0:
                C26395Oooo0o0 c26395Oooo0o0 = (C26395Oooo0o0) this.f90466OooOo;
                Integer num = (Integer) obj;
                num.getClass();
                synchronized (c26395Oooo0o0.f90559OooO0oo) {
                    try {
                        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                        HashMap<Integer, List<ImageInfo>> map = c26395Oooo0o0.f90566OooOOOo;
                        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                        c32465OooO0O0OooO0Oo.addAll(map.getOrDefault(num, c34434OooOoO));
                        c32465OooO0O0OooO0Oo.addAll(c26395Oooo0o0.f90571OooOo0.getOrDefault(num, c34434OooOoO));
                        c32465OooO0O0OooO0Oo.addAll(c26395Oooo0o0.f90569OooOOoo.getOrDefault(num, c34434OooOoO));
                        c32465OooO0O0OooO0Oo.addAll(c26395Oooo0o0.f90572OooOo00.getOrDefault(num, c34434OooOoO));
                        c32465OooO0O0OooO0Oo.addAll(c26395Oooo0o0.f90567OooOOo.getOrDefault(num, c34434OooOoO));
                        List<DrawRecord> orDefault = c26395Oooo0o0.f90564OooOOO0.getOrDefault(num, c34434OooOoO);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : orDefault) {
                            if (((DrawRecord) obj2).getPenType() == 11) {
                                arrayList.add(obj2);
                            }
                        }
                        c32465OooO0O0OooO0Oo.addAll(arrayList);
                        HashMap<Integer, List<ShapeInfo>> map2 = c26395Oooo0o0.f90565OooOOOO;
                        C34434OooOoO c34434OooOoO2 = C34434OooOoO.f123453OooOo0o;
                        c32465OooO0O0OooO0Oo.addAll(map2.getOrDefault(num, c34434OooOoO2));
                        c32465OooO0O0OooO0Oo.addAll(c26395Oooo0o0.f90568OooOOo0.getOrDefault(num, c34434OooOoO2));
                        c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c32465OooO0O0OooO0O0;
            default:
                Integer num2 = (Integer) obj;
                num2.getClass();
                ((NoteListContainerFragment) this.f90466OooOo).OooOoo().OooOoo(num2);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
