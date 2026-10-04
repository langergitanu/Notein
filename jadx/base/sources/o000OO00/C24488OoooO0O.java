package o000OO00;

import androidx.ink.brush.StockBrushesNative;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000OO00.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24488OoooO0O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82792OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82793OooOo0o;

    public /* synthetic */ C24488OoooO0O(Object obj, int i) {
        this.f82793OooOo0o = i;
        this.f82792OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f82792OooOo;
        switch (this.f82793OooOo0o) {
            case 0:
                return Long.valueOf(StockBrushesNative.f65354OooO00o.createHighlighter(((Oooo0) obj).f82763OooO00o, 1));
            default:
                int i = PenBarChildFragment.f75240o0000OOo;
                ((PenBarChildFragment) obj).OoooOoO();
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
