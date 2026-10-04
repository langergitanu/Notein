package o0OoOOOo;

import android.content.Context;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import oO0o.C33532OooO0oO;
import oO0oO00.o0ooOOo;

/* JADX INFO: renamed from: o0OoOOOo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29115OooOoO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103183OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103184OooOo0o;

    public /* synthetic */ C29115OooOoO(Object obj, int i) {
        this.f103184OooOo0o = i;
        this.f103183OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f103183OooOo;
        switch (this.f103184OooOo0o) {
            case 0:
                int i = TextStyleBox.f74132o000oOoO;
                return new o0o00Ooo.OooOO0(false, false, (Context) obj);
            default:
                C33532OooO0oO c33532OooO0oO = (C33532OooO0oO) obj;
                return Integer.valueOf(o0ooOOo.OooO0O0(c33532OooO0oO, c33532OooO0oO.f121126OooOO0O));
        }
    }
}
