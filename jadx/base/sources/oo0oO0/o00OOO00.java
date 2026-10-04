package oo0oO0;

import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.data.p602db.entity.NotePdfLostInfoEntity;
import com.orion.notein.data.p602db.entity.ToolBoxInfoEntity;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00OOO00 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125332OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125333OooOo0o;

    public /* synthetic */ o00OOO00(Object obj, int i) {
        this.f125333OooOo0o = i;
        this.f125332OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        NotePdfLostInfoEntity notePdfLostInfoEntity = null;
        String strO000OoO = null;
        ToolBoxInfoEntity toolBoxInfoEntity = null;
        Object obj2 = this.f125332OooOo;
        switch (this.f125333OooOo0o) {
            case 0:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM NotePdfLostInfoEntity WHERE id = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "src_note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_file_name");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "db_version");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_db_version");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        notePdfLostInfoEntity = new NotePdfLostInfoEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return notePdfLostInfoEntity;
                } finally {
                }
            case 1:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo2 = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from ToolBoxInfoEntity where note_id = ?");
                String str2 = (String) obj2;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo2.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo2.o000000O(1, str2);
                    }
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo2, "id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo2, "note_id");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo2, "pos");
                    if (interfaceC24749OooO0OoO0ooOOo2.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo2.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo2.o000OoO(iOooO0Oo7);
                        if (!interfaceC24749OooO0OoO0ooOOo2.isNull(iOooO0Oo8)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo2.o000OoO(iOooO0Oo8);
                        }
                        toolBoxInfoEntity = new ToolBoxInfoEntity(strO000OoO2, strO000OoO, (int) interfaceC24749OooO0OoO0ooOOo2.getLong(iOooO0Oo9));
                    }
                    interfaceC24749OooO0OoO0ooOOo2.close();
                    return toolBoxInfoEntity;
                } finally {
                }
            default:
                String newValue = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(newValue, "newValue");
                int i = LabeledTextFieldView.f69528Oooo0O0;
                LabeledTextFieldView labeledTextFieldView = (LabeledTextFieldView) obj2;
                String strOooOO0o = labeledTextFieldView.OooOO0o(newValue);
                labeledTextFieldView.setValueState(strOooOO0o);
                InterfaceC32507OooOO0o<? super String, C32460OooOooO> interfaceC32507OooOO0o = labeledTextFieldView.f69540Oooo00O;
                if (interfaceC32507OooOO0o != null) {
                    interfaceC32507OooOO0o.invoke(strOooOO0o);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
