package o0oOoOo;

import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.AbstractC33630OooOooO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00O0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f110965OooOo0o;

    public /* synthetic */ o00O0O(int i) {
        this.f110965OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f110965OooOo0o) {
            case 0:
                return Boolean.valueOf(TiledPagePreviewVOFilter.getFilter$lambda$0((TiledPagePreviewVO) obj));
            default:
                InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = (InterfaceC34415OooO0oo.OooO0O0) obj;
                if (oooO0O0 instanceof AbstractC33630OooOooO) {
                    return (AbstractC33630OooOooO) oooO0O0;
                }
                return null;
        }
    }
}
