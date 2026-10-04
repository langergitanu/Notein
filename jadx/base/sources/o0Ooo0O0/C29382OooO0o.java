package o0Ooo0O0;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.C23443OooO0Oo;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import o0Ooo0O.C29375OooO00o;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo0O0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29382OooO0o implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditor f104196OooOo0o;

    public /* synthetic */ C29382OooO0o(PageLayerEditor pageLayerEditor) {
        this.f104196OooOo0o = pageLayerEditor;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        C30837OooO00o src = (C30837OooO00o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = PageLayerEditor.f74865Oooo0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(src, "src");
        PageLayerEditor pageLayerEditor = this.f104196OooOo0o;
        com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = pageLayerEditor.f74867OooOo0o;
        if (oooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        C29375OooO00o c29375OooO00o = pageLayerEditor.f74868OooOoO;
        if (c29375OooO00o == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
            throw null;
        }
        int itemCount = c29375OooO00o.getItemCount() - iIntValue;
        C34406OooO00o.f123390OooO00o.OooO0o0("movePageLayer start. vo=" + src + ", insertIndex: " + itemCount, new Object[0]);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), oooO0OO.f74775OooO0oO, null, new C23443OooO0Oo(oooO0OO, itemCount, src, null), 2);
        return C32460OooOooO.f116667OooO00o;
    }
}
