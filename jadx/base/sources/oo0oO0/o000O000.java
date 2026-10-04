package oo0oO0;

import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.data.p602db.entity.MergingLayerItemEntity;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o000O000 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125166OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125167OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125168OooOoO0;

    public /* synthetic */ o000O000(int i, Object obj, Object obj2) {
        this.f125167OooOo0o = i;
        this.f125166OooOo = obj;
        this.f125168OooOoO0 = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f125167OooOo0o) {
            case 0:
                List<String> list = (List) this.f125168OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f125166OooOo);
                try {
                    int i = 1;
                    for (String str : list) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            case 1:
                List<String> list2 = (List) this.f125168OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo2 = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f125166OooOo);
                try {
                    int i2 = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo2.OooO0oO(i2);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo2.o000000O(i2, str2);
                        }
                        i2++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo2, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo2, "layer_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo2, "creation_time");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo2.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo2.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo2.o000OoO(iOooO0Oo);
                        if (!interfaceC24749OooO0OoO0ooOOo2.isNull(iOooO0Oo2)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo2.o000OoO(iOooO0Oo2);
                        }
                        arrayList.add(new MergingLayerItemEntity(strO000OoO2, strO000OoO, interfaceC24749OooO0OoO0ooOOo2.getLong(iOooO0Oo3)));
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo2.close();
                    return arrayList;
                } catch (Throwable th2) {
                    interfaceC24749OooO0OoO0ooOOo2.close();
                    throw th2;
                }
            default:
                String value = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                LabeledTextFieldView labeledTextFieldView = (LabeledTextFieldView) this.f125166OooOo;
                if (labeledTextFieldView.getState() == EnumC26248OooOo0.f89696OooOoO0) {
                    labeledTextFieldView.setState(EnumC26248OooOo0.f89694OooOo0o);
                    labeledTextFieldView.setSupportingText(null);
                }
                C33781o00o0O c33781o00o0O = ((FeedbackFragment) this.f125168OooOoO0).OooOoO().f100381OooOO0o;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, value);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
