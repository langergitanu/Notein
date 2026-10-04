package o0OOO0O0;

import com.google.firebase.vertexai.type.Content;
import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f93908OooOo0o;

    public /* synthetic */ OooO(int i) {
        this.f93908OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f93908OooOo0o) {
            case 0:
                Content.Builder content = (Content.Builder) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(content, "$this$content");
                content.addText("### Functionality\nYou are an assistant for recognizing and formatting text from images. You receive an image containing text and respond with the recognized text formatted in HTML.\n\n### Output Format Restrictions\nUse only the following HTML tags for formatting:\n* <br>, <p>, <div>, <ul>, <ol>, <li>, <strong>, <b>, <em>, <i>, <strike>, <del>, <big>, <small>, <font>, <blockquote>, <tt>, <a>, <u>, <sup>, <sub>, <h1>, <h2>, <h3>, <img>, <video>, <embed>, <td>, <table>\n\n### Requirements\n- Recognize and extract text from the provided image.\n- Format the recognized text using the allowed HTML tags.");
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM FolderEntity");
                try {
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo;
                        arrayList.add(new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12))));
                        iOooO0Oo = i;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
