package o0OoO0oo;

import android.net.Uri;
import com.orion.notein.domain.models.note.NoteContent;
import java.util.Set;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OoO0oo.o00o0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28919o00o0O0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102456OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102457OooOo0o;

    public /* synthetic */ C28919o00o0O0(Object obj, int i) {
        this.f102457OooOo0o = i;
        this.f102456OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f102457OooOo0o) {
            case 0:
                Uri.Builder builder = (Uri.Builder) obj;
                String newValue = String.valueOf(((NoteContent) this.f102456OooOo).getSavedPageIndex());
                kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "<this>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(newValue, "newValue");
                Uri uriBuild = builder.build();
                Set<String> queryParameterNames = uriBuild.getQueryParameterNames();
                Uri.Builder builderClearQuery = uriBuild.buildUpon().clearQuery();
                kotlin.jvm.internal.OooOOO0.OooO0o(builderClearQuery, "clearQuery(...)");
                for (String str : queryParameterNames) {
                    builderClearQuery.appendQueryParameter(str, kotlin.jvm.internal.OooOOO0.OooO0O0(str, "pageIndex") ? newValue : uriBuild.getQueryParameter(str));
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from StickerCollectionEntity where id = ?");
                String str2 = (String) this.f102456OooOo;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
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
    }
}
