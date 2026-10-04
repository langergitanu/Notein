package o0OoooO;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.vertexai.type.Content;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OoooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29616OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104994OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104995OooOo0o;

    public /* synthetic */ C29616OooO0OO(Object obj, int i) {
        this.f104995OooOo0o = i;
        this.f104994OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f104995OooOo0o) {
            case 0:
                Content.Builder content = (Content.Builder) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(content, "$this$content");
                String string = ((Context) this.f104994OooOo).getString(R.string.ai_assistant_system_instruction);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                content.addText(string);
                break;
            default:
                List<? extends Uri> it = (List) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                ((StickerCollectionEditFragment) this.f104994OooOo).OooOoo0().OooO0o0(it);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
