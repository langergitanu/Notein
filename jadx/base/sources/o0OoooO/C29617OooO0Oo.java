package o0OoooO;

import android.net.Uri;
import com.google.firebase.vertexai.type.Content;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OoooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29617OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104996OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104997OooOo0o;

    public /* synthetic */ C29617OooO0Oo(Object obj, int i) {
        this.f104997OooOo0o = i;
        this.f104996OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f104997OooOo0o) {
            case 0:
                Content.Builder content = (Content.Builder) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(content, "$this$content");
                content.addFileData((String) this.f104996OooOo, "application/pdf");
                break;
            default:
                List<? extends Uri> it = (List) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                ((StickerCollectionEditFragment) this.f104996OooOo).OooOoo0().OooO0o0(it);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
