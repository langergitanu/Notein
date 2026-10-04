package o0OoO0oo;

import android.net.Uri;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import java.util.Map;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.AbstractC34423OooO0o0;

/* JADX INFO: renamed from: o0OoO0oo.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28918o00o0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102454OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102455OooOo0o;

    public /* synthetic */ C28918o00o0O(Object obj, int i) {
        this.f102455OooOo0o = i;
        this.f102454OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f102455OooOo0o) {
            case 0:
                Uri it = (Uri) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                ((NoteEditorContainerFragment) this.f102454OooOo).Oooo0OO(1, com.facebook.soloader.OooOo.OooO0oO(it));
                return C32460OooOooO.f116667OooO00o;
            default:
                Map.Entry it2 = (Map.Entry) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it2, "it");
                AbstractC34423OooO0o0 abstractC34423OooO0o0 = (AbstractC34423OooO0o0) this.f102454OooOo;
                StringBuilder sb = new StringBuilder();
                Object key = it2.getKey();
                sb.append(key == abstractC34423OooO0o0 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = it2.getValue();
                sb.append(value != abstractC34423OooO0o0 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
        }
    }
}
