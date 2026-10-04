package o0OoO0oo;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.entity.DualLinkSourceConverter;
import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OoO0oo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28739OooooOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101785OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101786OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f101787OooOoO0;

    public /* synthetic */ C28739OooooOO(int i, Object obj, Object obj2) {
        this.f101786OooOo0o = i;
        this.f101785OooOo = obj;
        this.f101787OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String strO000OoO;
        int i;
        int i2;
        int i3;
        Float fValueOf;
        int i4;
        switch (this.f101786OooOo0o) {
            case 0:
                Fragment it = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                InterfaceC21987OooOoo viewLifecycleOwner = ((NoteEditorContainerFragment) this.f101787OooOoO0).getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                ((BaseToolbarChildFragment) it).OooooO0((View) this.f101785OooOo, viewLifecycleOwner);
                return C32460OooOooO.f116667OooO00o;
            default:
                DualLinkSourceConverter dualLinkSourceConverter = ((oo0oO0.o00000) this.f101785OooOo).f125104OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from DualLinkSourceEntity where page_id = ?");
                String str = (String) this.f101787OooOoO0;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
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
                        RectF rectFStringToRect = dualLinkSourceConverter.stringToRect(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5));
                        List<RectF> listStringToRectList = dualLinkSourceConverter.stringToRectList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6));
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11)) {
                            i3 = i5;
                            fValueOf = null;
                        } else {
                            i3 = i5;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11));
                        }
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13));
                        int i6 = iOooO0Oo14;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i6)) {
                            i4 = iOooO0Oo4;
                        } else {
                            i4 = iOooO0Oo4;
                            fValueOf2 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i6));
                        }
                        arrayList.add(new DualLinkSourceEntity(strO000OoO2, strO000OoO3, strO000OoO, i3, rectFStringToRect, listStringToRectList, strO000OoO4, strO000OoO5, j, j2, fValueOf, fValueOf3, fValueOf4, fValueOf2));
                        iOooO0Oo4 = i4;
                        iOooO0Oo14 = i6;
                        iOooO0Oo2 = i2;
                        iOooO0Oo3 = i;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
