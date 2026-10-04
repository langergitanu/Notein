package o000oo0;

import android.net.Uri;
import android.provider.MediaStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;
import oo0oO0.oo0o0Oo;

/* JADX INFO: renamed from: o000oo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24672OooOo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f83574OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f83575OooOo0o;

    public /* synthetic */ C24672OooOo0(Object obj, int i) {
        this.f83575OooOo0o = i;
        this.f83574OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        int i;
        String strO000OoO;
        Object obj2 = this.f83574OooOo;
        switch (this.f83575OooOo0o) {
            case 0:
                C24656OooO0O0 config = (C24656OooO0O0) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(config, "config");
                return ((AbstractC24673OooOo0O) obj2).OooO0oO(config);
            case 1:
                ImageEditorPanel imageEditorPanel = (ImageEditorPanel) obj2;
                Uri it = (Uri) obj;
                int i2 = ImageEditorPanel.f73715Oooo0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                try {
                    return MediaStore.Images.Media.getBitmap(imageEditorPanel.getContext().getContentResolver(), it);
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ImageEditorPanel");
                    c20358OooO00o.OooO0Oo(e, "MediaStore.Images.Media.getBitmap err. ", new Object[0]);
                    return null;
                }
            default:
                oo0o0Oo oo0o0oo = (oo0o0Oo) obj2;
                oo0o0oo.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from DualLinkRefEntity");
                try {
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
                        arrayList.add(new DualLinkRefEntity(strO000OoO2, strO000OoO3, strO000OoO4, oo0o0oo.f125677OooO0OO.stringToRect(strO000OoO), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13))));
                        iOooO0Oo = i;
                        iOooO0Oo2 = i3;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
